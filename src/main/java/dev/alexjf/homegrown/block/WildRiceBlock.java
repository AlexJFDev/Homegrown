package dev.alexjf.homegrown.block;

import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class WildRiceBlock extends RiceBlock {

    public WildRiceBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos floorPos) {
        return floor.isIn(BlockTags.BAMBOO_PLANTABLE_ON);
	}
}