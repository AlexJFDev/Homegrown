package dev.alexjf.homegrown.features;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class HomegrownPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> PATCH_CANTALOUPE;
    public static final RegistryEntry<PlacedFeature> PATCH_CANTALOUPE_RIVER;

    static {
      PATCH_CANTALOUPE = PlacedFeatures.register(
        "homegrown:patch_cantaloupe", 
        HomegrownConfiguredFeatures.PATCH_CANTALOUPE, 
        new PlacementModifier[]{
          RarityFilterPlacementModifier.of(300), 
          SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, 
          BiomePlacementModifier.of()});
      PATCH_CANTALOUPE_RIVER = PlacedFeatures.register(
        "homegrown:patch_cantaloupe_river", 
        HomegrownConfiguredFeatures.PATCH_CANTALOUPE, 
        new PlacementModifier[]{
          RarityFilterPlacementModifier.of(30), 
          SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, 
          BiomePlacementModifier.of()});
	  }
}
