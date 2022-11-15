package dev.alexjf.homegrown.loot.condition;

import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonSerializer;
import net.minecraft.util.registry.Registry;

public class HomegrownLootConditionTypes {

    public static LootConditionType RANDOM_CHANCE_WITH_FORTUNE;

    public static void init() {
        RANDOM_CHANCE_WITH_FORTUNE = HomegrownLootConditionTypes.register("random_chance_with_fortune", new RandomChanceWithFortuneLootCondition.Serializer());
    }

    private static LootConditionType register(String id, JsonSerializer<? extends LootCondition> serializer) {
        return Registry.register(Registry.LOOT_CONDITION_TYPE, new Identifier("homegrown", id), new LootConditionType(serializer));
    }
}
