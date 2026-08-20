package dev.alexjf.homegrown.world.gen.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;

public class HomegrownFeatures {
    public static final String MOD_ID = "homegrown";
    
    public static void init(){
		HomegrownFeature.init();

        BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				Biomes.SAVANNA,
				Biomes.SAVANNA_PLATEAU,
				Biomes.WINDSWEPT_SAVANNA
			), 
			Decoration.VEGETAL_DECORATION,
			ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, "patch_cantaloupe_sparse")));
		BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				Biomes.RIVER
			), 
			Decoration.VEGETAL_DECORATION,
			ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, "patch_cantaloupe")));
		BiomeModifications.addFeature(
			BiomeSelectors.excludeByKey(
				Biomes.BEACH,
				Biomes.SNOWY_BEACH,
				Biomes.STONY_SHORE,
				Biomes.FROZEN_RIVER,
				Biomes.OCEAN,
				Biomes.WARM_OCEAN,
				Biomes.LUKEWARM_OCEAN,
				Biomes.COLD_OCEAN,
				Biomes.FROZEN_OCEAN,
				Biomes.DEEP_OCEAN,
				Biomes.DEEP_LUKEWARM_OCEAN,
				Biomes.DEEP_COLD_OCEAN,
				Biomes.DEEP_FROZEN_OCEAN
			),
			Decoration.VEGETAL_DECORATION,
			ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, "patch_wild_rice")));
		BiomeModifications.addFeature(
			BiomeSelectors.all(), 
			Decoration.UNDERGROUND_DECORATION,
			ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(MOD_ID, "patch_burning_bush")));
    }
}
