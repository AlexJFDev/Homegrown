package dev.alexjf.homegrown.feature;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep.Feature;

public class HomegrownFeatures {
    public static final String MOD_ID = "homegrown";
    
    public static void init(){
        BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				RegistryKey.of(RegistryKeys.BIOME, new Identifier("minecraft","savanna")),
				RegistryKey.of(RegistryKeys.BIOME, new Identifier("minecraft","savanna_plateau")),
				RegistryKey.of(RegistryKeys.BIOME, new Identifier("minecraft","windswept_savanna"))), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_cantaloupe")));
		BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				RegistryKey.of(RegistryKeys.BIOME, new Identifier("minecraft","river"))), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_cantaloupe_river")));
		BiomeModifications.addFeature(
			BiomeSelectors.all(), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_rice")));
		BiomeModifications.addFeature(
			BiomeSelectors.all(), 
			Feature.VEGETAL_DECORATION,
			RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "patch_burning_bush")));
    }
}
