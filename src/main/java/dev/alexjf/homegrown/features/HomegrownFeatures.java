package dev.alexjf.homegrown.features;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep.Feature;

public class HomegrownFeatures {
    public static String MOD_ID = "homegrown";
    
    public static void init(){
        BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","savanna")),
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","savanna_plateau")),
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","windswept_savanna"))), 
			Feature.VEGETAL_DECORATION,
			HomegrownPlacedFeatures.PATCH_CANTALOUPE.getKey().get());
		BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","river"))), 
			Feature.VEGETAL_DECORATION,
			HomegrownPlacedFeatures.PATCH_CANTALOUPE_RIVER.getKey().get());
    }
}
