package dev.alexjf.homegrown.loot.condition;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import net.minecraft.core.Holder;
import net.minecraft.util.context.ContextKey;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class RandomChanceWithFortuneLootCondition
implements LootItemCondition {
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
    public MapCodec<? extends LootItemCondition> codec() {
        return CODEC;
    }

    @Override
    public Set<ContextKey<?>> getReferencedContextParams() {
        return ImmutableSet.of(LootContextParams.TOOL);
    }

    @Override
    public boolean test(LootContext lootContext) {
        ItemInstance itemStack = lootContext.getOptionalParameter(LootContextParams.TOOL);
        int i = 0;
        if (itemStack != null) {
            Holder<Enchantment> fortune = lootContext.getResolver().getOrThrow(Enchantments.FORTUNE);
            i = EnchantmentHelper.getItemEnchantmentLevel(fortune, itemStack);
        }
        return lootContext.getRandom().nextFloat() < this.chance + (float)i * this.fortuneMultiplier;
    }

    public static LootItemCondition.Builder builder(float chance, float fortuneMultiplier) {
        return () -> new RandomChanceWithFortuneLootCondition(chance, fortuneMultiplier);
    }
}
