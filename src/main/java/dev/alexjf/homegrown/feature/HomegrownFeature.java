package dev.alexjf.homegrown.feature;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class HomegrownFeature {
    private static final String MOD_ID = "homegrown";

    public static final Feature<DefaultFeatureConfig> RICE_BLOCK;

    static {
        RICE_BLOCK = Registry.register(Registry.FEATURE, MOD_ID + ":simple_crop_block", new RiceBlockFeature(DefaultFeatureConfig.CODEC));
    }
}
