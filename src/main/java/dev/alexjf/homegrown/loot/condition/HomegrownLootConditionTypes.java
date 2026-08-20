package dev.alexjf.homegrown.loot.condition;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

public class HomegrownLootConditionTypes {

    public static MapCodec<? extends LootItemCondition> RANDOM_CHANCE_WITH_FORTUNE;

    public static void init() {
        RANDOM_CHANCE_WITH_FORTUNE = Registry.register(BuiltInRegistries.LOOT_CONDITION_TYPE, Identifier.fromNamespaceAndPath("homegrown", "random_chance_with_fortune"), RandomChanceWithFortuneLootCondition.CODEC);
    }
}
