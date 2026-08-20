package dev.alexjf.homegrown.loot.condition;

import net.minecraft.loot.condition.LootConditionType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HomegrownLootConditionTypes {

    public static LootConditionType RANDOM_CHANCE_WITH_FORTUNE;

    public static void init() {
        RANDOM_CHANCE_WITH_FORTUNE = Registry.register(Registries.LOOT_CONDITION_TYPE, new Identifier("homegrown", "random_chance_with_fortune"), new LootConditionType(RandomChanceWithFortuneLootCondition.CODEC));
    }
}
