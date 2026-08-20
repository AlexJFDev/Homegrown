package dev.alexjf.homegrown.block;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

public class WildRiceBlock extends RiceBlock {

    public WildRiceBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos floorPos) {
        return floor.is(BlockTags.SUPPORTS_BAMBOO);
	}
}