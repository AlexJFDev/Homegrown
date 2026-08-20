package dev.alexjf.homegrown.world.gen.feature;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;

public class HomegrownFeature {
    private static final String MOD_ID = "homegrown";

    public static final Feature<SimpleCropBlockFeatureConfig> SIMPLE_CROP_BLOCK = new SimpleCropBlockFeature(SimpleCropBlockFeatureConfig.CODEC);

    public static void init(){
        Registry.register(BuiltInRegistries.FEATURE, MOD_ID + ":simple_crop_block", SIMPLE_CROP_BLOCK);
    }
}
