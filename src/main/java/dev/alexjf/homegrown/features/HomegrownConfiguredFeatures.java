package dev.alexjf.homegrown.features;

import java.util.List;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class HomegrownConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_CANTALOUPE;

    static{
        PATCH_CANTALOUPE = ConfiguredFeatures.register(
            "homegrown:patch_cantaloupe", 
            Feature.RANDOM_PATCH, 
            ConfiguredFeatures.createRandomPatchFeatureConfig(
                Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(HomegrownBlocks.CANTALOUPE_BLOCK)), 
                List.of(Blocks.GRASS_BLOCK)));
    }
}
