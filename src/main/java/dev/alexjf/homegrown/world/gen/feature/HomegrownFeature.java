package dev.alexjf.homegrown.world.gen.feature;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.Feature;

public class HomegrownFeature {
    private static final String MOD_ID = "homegrown";

    public static final Feature<SimpleCropBlockFeatureConfig> SIMPLE_CROP_BLOCK = new SimpleCropBlockFeature(SimpleCropBlockFeatureConfig.CODEC);

    public static void init(){
        Registry.register(Registries.FEATURE, MOD_ID + ":simple_crop_block", SIMPLE_CROP_BLOCK);
    }
}
