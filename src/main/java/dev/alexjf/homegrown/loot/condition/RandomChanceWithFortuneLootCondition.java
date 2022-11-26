package dev.alexjf.homegrown.loot.condition;

import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Set;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameter;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.JsonSerializer;
import net.minecraft.enchantment.Enchantments;

public class RandomChanceWithFortuneLootCondition
implements LootCondition {
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
    public Set<LootContextParameter<?>> getRequiredParameters() {
        return ImmutableSet.of(LootContextParameters.TOOL);
    }

    @Override
    public boolean test(LootContext lootContext) {
        ItemStack itemStack = lootContext.get(LootContextParameters.TOOL);
        int i = 0;
        if (itemStack != null) {
            i = EnchantmentHelper.getLevel(Enchantments.FORTUNE, itemStack);
        }
        return lootContext.getRandom().nextFloat() < this.chance + (float)i * this.fortuneMultiplier;
    }

    public static LootCondition.Builder builder(float chance, float fortuneMultiplier) {
        return () -> new RandomChanceWithFortuneLootCondition(chance, fortuneMultiplier);
    }

    public static class Serializer
    implements JsonSerializer<RandomChanceWithFortuneLootCondition> {
        @Override
        public void toJson(JsonObject jsonObject, RandomChanceWithFortuneLootCondition randomChanceWithFortuneLootCondition, JsonSerializationContext jsonSerializationContext) {
            jsonObject.addProperty("chance", Float.valueOf(randomChanceWithFortuneLootCondition.chance));
            jsonObject.addProperty("fortune_multiplier", Float.valueOf(randomChanceWithFortuneLootCondition.fortuneMultiplier));
        }

        @Override
        public RandomChanceWithFortuneLootCondition fromJson(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
            return new RandomChanceWithFortuneLootCondition(JsonHelper.getFloat(jsonObject, "chance"), JsonHelper.getFloat(jsonObject, "fortune_multiplier"));
        }
    }
}

