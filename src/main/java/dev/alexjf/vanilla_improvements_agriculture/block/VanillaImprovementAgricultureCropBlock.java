package dev.alexjf.vanilla_improvements_agriculture.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;

public class VanillaImprovementAgricultureCropBlock extends CropBlock {
    public VanillaImprovementAgricultureCropBlock(AbstractBlock.Settings settings) {
        super(settings.nonOpaque());
    }
}