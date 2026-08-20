package dev.alexjf.homegrown.loot.condition;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.context.ContextParameter;

public class RandomChanceWithFortuneLootCondition
implements LootCondition {
    public static final MapCodec<RandomChanceWithFortuneLootCondition> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(
            Codec.FLOAT.fieldOf("chance").forGetter(condition -> condition.chance),
            Codec.FLOAT.fieldOf("fortune_multiplier").forGetter(condition -> condition.fortuneMultiplier)
    ).apply(instance, RandomChanceWithFortuneLootCondition::new));

    final float chance;
    final float fortuneMultiplier;

    RandomChanceWithFortuneLootCondition(float chance, float fortuneMultiplier) {
        this.chance = chance;
        this.fortuneMultiplier = fortuneMultiplier;
    }

    @Override
    public LootConditionType getType() {
        return HomegrownLootConditionTypes.RANDOM_CHANCE_WITH_FORTUNE;
    }

    @Override
    public Set<ContextParameter<?>> getAllowedParameters() {
        return ImmutableSet.of(LootContextParameters.TOOL);
    }

    @Override
    public boolean test(LootContext lootContext) {
        ItemStack itemStack = lootContext.get(LootContextParameters.TOOL);
        int i = 0;
        if (itemStack != null) {
            RegistryEntry<Enchantment> fortune = lootContext.getLookup().getEntryOrThrow(Enchantments.FORTUNE);
            i = EnchantmentHelper.getLevel(fortune, itemStack);
        }
        return lootContext.getRandom().nextFloat() < this.chance + (float)i * this.fortuneMultiplier;
    }

    public static LootCondition.Builder builder(float chance, float fortuneMultiplier) {
        return () -> new RandomChanceWithFortuneLootCondition(chance, fortuneMultiplier);
    }
}
