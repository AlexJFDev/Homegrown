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
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
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

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF);
        super.appendProperties(builder);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if(state.get(HALF) == DoubleBlockHalf.LOWER){
            return LOWER_AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
        } else {
            return UPPER_AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
        }
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) return false;
        if (this.isMature(state)) return false;
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBaseLightLevel(pos, 0) >= 9) {
            float f;
            f = getAvailableMoisture(this, world, pos);
            if (random.nextInt((int)(25.0F / f) + 1) == 0){
                int i = this.getAge(state);
                if (i < this.getMaxAge()) {
                    world.setBlockState(pos, state.with(AGE, i + 1), Block.NOTIFY_LISTENERS);
                    if (i + 1 >= 4) {
                        world.setBlockState(pos.up(), state.with(HALF, DoubleBlockHalf.UPPER).with(AGE, i + 1));
                    }
                }
            }
		}
	}

    @Override
    public void applyGrowth(World world, BlockPos pos, BlockState state) {
        int i = this.getAge(state) + this.getGrowthAmount(world);
        int j = this.getMaxAge();
        if (i > j) {
           i = j;
        }
        
        if(state.get(HALF) == DoubleBlockHalf.LOWER){
            world.setBlockState(pos, state.with(AGE, i), 2);
            if(i >= 4) {
                world.setBlockState(pos.up(), state.with(AGE, i).with(HALF, DoubleBlockHalf.UPPER));
            }
        } else {
            world.setBlockState(pos, state.with(AGE, i), 2);
            world.setBlockState(pos.down(), state.with(AGE, i).with(HALF, DoubleBlockHalf.LOWER));
        }
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        DoubleBlockHalf doubleBlockHalf = state.get(HALF);
        BlockState floor = world.getBlockState(pos.down());
        if (doubleBlockHalf == DoubleBlockHalf.LOWER) {
            if (!canPlantOnTop(floor, world, pos)) return false;
            BlockState ceiling = world.getBlockState(pos.up());
            if (state.get(AGE) >= 4){
                if (!ceiling.isOf(this)) return false;
            } else {
                if (!ceiling.isAir()) return false;
            }
        } else {
            if (!floor.isOf(this)) return false;
            if (floor.get(HALF) != DoubleBlockHalf.LOWER) return false;
        }
        return true;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.createAndScheduleBlockTick(pos, this, 1);

        if (!this.canPlaceAt(state, world, pos)) return Blocks.AIR.getDefaultState();
        if (state.get(HALF) == DoubleBlockHalf.LOWER) return state;
        BlockState floor = world.getBlockState(pos.down());
        return floor.with(HALF, DoubleBlockHalf.UPPER);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!this.canPlaceAt(state, world, pos)) world.breakBlock(pos, false);
    }

    static {
        LOWER_AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};
        UPPER_AGE_TO_SHAPE = new VoxelShape[]{Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};
    }
}
