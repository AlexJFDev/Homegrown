package dev.alexjf.homegrown.feature;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class HomegrownFeature {
    private static final String MOD_ID = "homegrown";

    public static final Feature<DefaultFeatureConfig> RICE_BLOCK;
    public static final Feature<SimpleCropBlockFeatureConfig> SIMPLE_CROP_BLOCK;

    static {
        RICE_BLOCK = Registry.register(Registries.FEATURE, MOD_ID + ":rice_block", new RiceBlockFeature(DefaultFeatureConfig.CODEC));
        SIMPLE_CROP_BLOCK = Registry.register(Registries.FEATURE, MOD_ID + ":simple_crop_block", new SimpleCropBlockFeature(SimpleCropBlockFeatureConfig.CODEC));
    }
}
