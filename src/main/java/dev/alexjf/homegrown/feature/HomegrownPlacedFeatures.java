package dev.alexjf.homegrown.feature;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class HomegrownPlacedFeatures {
    /*public static final String MOD_ID = "homegrown";

    public static final RegistryEntry<PlacedFeature> PATCH_CANTALOUPE;
    public static final RegistryEntry<PlacedFeature> PATCH_CANTALOUPE_RIVER;
    public static final RegistryEntry<PlacedFeature> PATCH_RICE;
    public static final RegistryEntry<PlacedFeature> PATCH_BURNING_BUSH;

    static {
      PATCH_CANTALOUPE = PlacedFeatures.register(
        MOD_ID + ":patch_cantaloupe", 
        HomegrownConfiguredFeatures.PATCH_CANTALOUPE, 
        new PlacementModifier[]{
          RarityFilterPlacementModifier.of(150), 
          SquarePlacementModifier.of(), 
          PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, 
          BiomePlacementModifier.of()});
      PATCH_CANTALOUPE_RIVER = PlacedFeatures.register(
        MOD_ID + ":patch_cantaloupe_river", 
        HomegrownConfiguredFeatures.PATCH_CANTALOUPE, 
        new PlacementModifier[]{
          RarityFilterPlacementModifier.of(15), 
          SquarePlacementModifier.of(), 
          PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, 
          BiomePlacementModifier.of()});
      PATCH_RICE = PlacedFeatures.register(
        MOD_ID + ":patch_rice", 
        HomegrownConfiguredFeatures.PATCH_RICE, 
        new PlacementModifier[]{
          HeightRangePlacementModifier.uniform(YOffset.fixed(62), YOffset.fixed(63)),
          RarityFilterPlacementModifier.of(9), 
          SquarePlacementModifier.of(),
          BiomePlacementModifier.of()});
      PATCH_BURNING_BUSH = PlacedFeatures.register(
        MOD_ID + ":patch_burning_bush", 
        HomegrownConfiguredFeatures.PATCH_BURNING_BUSH, 
        new PlacementModifier[]{
          HeightRangePlacementModifier.uniform(YOffset.fixed(-60), YOffset.fixed(32)),
          RarityFilterPlacementModifier.of(1), 
          SquarePlacementModifier.of(),
          BiomePlacementModifier.of(),
          CountPlacementModifier.of(5)});
	    }*/
}