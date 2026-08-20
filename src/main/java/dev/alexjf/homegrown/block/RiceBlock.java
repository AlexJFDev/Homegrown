package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.item.HomegrownItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.LiquidBlockContainer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

public class RiceBlock extends TallCropBlock implements LiquidBlockContainer{

    public RiceBlock(Properties settings) {
        super(settings);
    }

    @Override
	protected ItemLike getBaseSeedId() {
		return HomegrownItems.BROWN_RICE;
	}

    @Override
    public boolean canPlaceLiquid(@org.jetbrains.annotations.Nullable LivingEntity filler, BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
        return false;
    }

    @Override
    public boolean placeLiquid(LevelAccessor world, BlockPos pos, BlockState state, FluidState fluidState) {
        return false;
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        if(state.getValue(HALF) == DoubleBlockHalf.LOWER){
            return Fluids.WATER.getSource(false);
        } else {
            return Fluids.EMPTY.defaultFluidState();
        }
    }

    @Override
    public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, net.minecraft.util.RandomSource random) {
        if(state.getValue(HALF) == DoubleBlockHalf.LOWER){
            tickView.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return super.updateShape(state, world, tickView, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) {
            if (world.getFluidState(pos).is(FluidTags.WATER)) {
                return super.canSurvive(state, world, pos);
            } else {
                return false;
            }
        } else {
            return super.canSurvive(state, world, pos);
        }
    }
}