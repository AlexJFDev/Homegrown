package dev.alexjf.homegrown.world.gen.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep.Feature;

public class HomegrownFeatures {
    public static final String MOD_ID = "homegrown";
    
    public static void init(){
		HomegrownFeature.init();

        BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				BiomeKeys.SAVANNA,
				BiomeKeys.SAVANNA_PLATEAU,
				BiomeKeys.WINDSWEPT_SAVANNA
			), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_cantaloupe_sparse")));
		BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				BiomeKeys.RIVER
			), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_cantaloupe")));
		BiomeModifications.addFeature(
			BiomeSelectors.excludeByKey(
				BiomeKeys.BEACH,
				BiomeKeys.SNOWY_BEACH,
				BiomeKeys.STONY_SHORE,
				BiomeKeys.FROZEN_RIVER,
				BiomeKeys.OCEAN,
				BiomeKeys.WARM_OCEAN,
				BiomeKeys.LUKEWARM_OCEAN,
				BiomeKeys.COLD_OCEAN,
				BiomeKeys.FROZEN_OCEAN,
				BiomeKeys.DEEP_OCEAN,
				BiomeKeys.DEEP_LUKEWARM_OCEAN,
				BiomeKeys.DEEP_COLD_OCEAN,
				BiomeKeys.DEEP_FROZEN_OCEAN
			),
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_wild_rice")));
		BiomeModifications.addFeature(
			BiomeSelectors.all(), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_burning_bush")));
    }
}
