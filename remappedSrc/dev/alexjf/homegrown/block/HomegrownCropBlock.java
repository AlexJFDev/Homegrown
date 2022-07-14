package dev.alexjf.homegrown.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CropBlock;

public class HomegrownCropBlock extends CropBlock {
    public HomegrownCropBlock(AbstractBlock.Settings settings) {
        super(settings.nonOpaque());
    }
}