package dev.alexjf.homegrown.feature;

import java.util.List;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.RandomPatchFeatureConfig;
import net.minecraft.world.gen.feature.SimpleBlockFeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class HomegrownConfiguredFeatures {
    public static final String MOD_ID = "homegrown";

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_CANTALOUPE;
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> PATCH_RICE;

    static{
        PATCH_CANTALOUPE = ConfiguredFeatures.register(
            MOD_ID + ":patch_cantaloupe", 
            Feature.RANDOM_PATCH, 
            ConfiguredFeatures.createRandomPatchFeatureConfig(
                Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                    BlockStateProvider.of(HomegrownBlocks.CANTALOUPE_BLOCK)), 
                List.of(Blocks.GRASS_BLOCK)));
        PATCH_RICE = ConfiguredFeatures.register(
            MOD_ID + ":patch_rice", Feature.RANDOM_PATCH, 
            ConfiguredFeatures.createRandomPatchFeatureConfig(
                HomegrownFeature.RICE_BLOCK, 
                new DefaultFeatureConfig()));
    }
}
