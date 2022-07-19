package dev.alexjf.homegrown.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class TallCropBlock extends CropBlock {
    public static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;
    private static final VoxelShape[] LOWER_AGE_TO_SHAPE;
    private static final VoxelShape[] UPPER_AGE_TO_SHAPE;

    public TallCropBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.LOWER));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF);
        builder.add(AGE);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if(state.get(HALF) == DoubleBlockHalf.LOWER){
            return LOWER_AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
        } else {
            return UPPER_AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
        }
    }

    // This could potentially cause lag. It needs looking into.
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return state.get(HALF) == DoubleBlockHalf.LOWER;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        DoubleBlockHalf doubleBlockHalf = (DoubleBlockHalf)state.get(HALF);
        if (world.getBaseLightLevel(pos, 0) >= 9) {
            float f;
            f = getAvailableMoisture(this, world, pos);
            if (random.nextInt((int)(25.0F / f) + 1) == 0){
                int i = this.getAge(state);
                if(i + 1 >= 4) {
                    world.setBlockState(pos.up(), this.withAge(i).with(HALF, DoubleBlockHalf.UPPER));
                }
                if (i < this.getMaxAge()) {
                    world.setBlockState(pos, this.withAge(i + 1).with(HALF, doubleBlockHalf), Block.NOTIFY_LISTENERS);
                }
            }
		}
	}

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos floorPos) {
        return floor.isOf(Blocks.FARMLAND) || (floor.isOf(this) && floor.get(HALF) == DoubleBlockHalf.UPPER);
	}

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        DoubleBlockHalf doubleBlockHalf = state.get(HALF);
        if (doubleBlockHalf == DoubleBlockHalf.UPPER) {
           BlockState floor = world.getBlockState(pos.down());
           return floor.isOf(this) && floor.get(HALF) == DoubleBlockHalf.LOWER;
        } else {
            BlockState ceiling = world.getBlockState(pos.up());
            if(ceiling.isAir() || ceiling.isOf(this)){
                return super.canPlaceAt(state, world, pos);
            } else {
                return false;
            }
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.createAndScheduleBlockTick(pos, this, 1);
        if(state.canPlaceAt(world, pos)){
            if(state.get(HALF) == DoubleBlockHalf.UPPER){
                BlockState floor = world.getBlockState(pos.down());
                return state.with(AGE, floor.get(AGE));
            }
        } else {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockState ceiling = world.getBlockState(pos.up());
        DoubleBlockHalf doubleBlockHalf = state.get(HALF);
        int i = state.get(AGE);
        if(i >= 4 && doubleBlockHalf == DoubleBlockHalf.LOWER && !ceiling.isOf(this)){
            world.breakBlock(pos, false);
        }
    }

    @Override
    public OffsetType getOffsetType() {
        return OffsetType.XZ;
    }

    @Override
    public long getRenderingSeed(BlockState state, BlockPos pos) {
        return MathHelper.hashCode(pos.getX(), pos.down(state.get(HALF) == DoubleBlockHalf.LOWER ? 0 : 1).getY(), pos.getZ());
    }

    static {
        LOWER_AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};
        UPPER_AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};
    }
}
