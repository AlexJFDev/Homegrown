package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.item.HomegrownItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidFillable;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemConvertible;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class RiceBlock extends TallCropBlock implements FluidFillable{

    public RiceBlock(Settings settings) {
        super(settings);
    }

    @Override
	protected ItemConvertible getSeedsItem() {
		return HomegrownItems.BROWN_RICE;
	}

    @Override
    public boolean canFillWithFluid(BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }

    @Override
    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if(state.get(HALF) == DoubleBlockHalf.LOWER){
            return Fluids.WATER.getStill(false);
        } else {
            return Fluids.EMPTY.getDefaultState();
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if(state.get(HALF) == DoubleBlockHalf.LOWER){
            world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        if (state.get(HALF) == DoubleBlockHalf.LOWER) {
            if (world.getFluidState(pos).isIn(FluidTags.WATER)) {
                return super.canPlaceAt(state, world, pos);
            } else {
                return false;
            }
        } else {
            return super.canPlaceAt(state, world, pos);
        }
    }
}