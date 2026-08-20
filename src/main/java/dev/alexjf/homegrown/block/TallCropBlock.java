package dev.alexjf.homegrown.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class TallCropBlock extends CropBlock {
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    private static final VoxelShape[] LOWER_AGE_TO_SHAPE = new VoxelShape[]{Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};
    private static final VoxelShape[] UPPER_AGE_TO_SHAPE = new VoxelShape[]{Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public TallCropBlock(Properties settings) {
        super(settings);
        registerDefaultState(this.stateDefinition.any().setValue(HALF, DoubleBlockHalf.LOWER));
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) return LOWER_AGE_TO_SHAPE[(Integer)state.getValue(this.getAgeProperty())];
        return UPPER_AGE_TO_SHAPE[(Integer)state.getValue(this.getAgeProperty())];
    }

    @Override
    public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        tickView.scheduleTick(pos, this, 1);

        if (!this.canSurvive(state, world, pos)) return Blocks.AIR.defaultBlockState();
        if (state.getValue(HALF) == DoubleBlockHalf.LOWER) return state;
        BlockState floor = world.getBlockState(pos.below());
        return floor.setValue(HALF, DoubleBlockHalf.UPPER);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) return false;
        if (this.isMaxAge(state)) return false;
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.getRawBrightness(pos, 0) >= 9) {
            float f;
            f = getGrowthSpeed(this, world, pos);
            if (random.nextInt((int)(25.0F / f) + 1) == 0){
                int i = this.getAge(state);
                if (i < this.getMaxAge()) {
                    world.setBlock(pos, state.setValue(AGE, i + 1), Block.UPDATE_CLIENTS);
                    if (i + 1 >= 4) {
                        world.setBlockAndUpdate(pos.above(), state.setValue(HALF, DoubleBlockHalf.UPPER).setValue(AGE, i + 1));
                    }
                }
            }
		}
	}

    @Override
    public void growCrops(Level world, BlockPos pos, BlockState state) {
        int i = this.getAge(state) + this.getBonemealAgeIncrease(world);
        int j = this.getMaxAge();
        if (i > j) {
           i = j;
        }
        
        if(state.getValue(HALF) == DoubleBlockHalf.LOWER){
            world.setBlock(pos, state.setValue(AGE, i), 2);
            if(i >= 4) {
                world.setBlockAndUpdate(pos.above(), state.setValue(AGE, i).setValue(HALF, DoubleBlockHalf.UPPER));
            }
        } else {
            world.setBlock(pos, state.setValue(AGE, i), 2);
            world.setBlockAndUpdate(pos.below(), state.setValue(AGE, i).setValue(HALF, DoubleBlockHalf.LOWER));
        }
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        DoubleBlockHalf doubleBlockHalf = state.getValue(HALF);
        BlockState floor = world.getBlockState(pos.below());
        if (doubleBlockHalf == DoubleBlockHalf.LOWER) {
            if (!mayPlaceOn(floor, world, pos)) return false;
            BlockState ceiling = world.getBlockState(pos.above());
            if (state.getValue(AGE) >= 4){
                if (!ceiling.is(this)) return false;
            } else {
                if (!ceiling.isAir()) return false;
            }
        } else {
            if (!floor.is(this)) return false;
            if (floor.getValue(HALF) != DoubleBlockHalf.LOWER) return false;
        }
        return true;
    }

    @Override
    public BlockState playerWillDestroy(Level world, BlockPos pos, BlockState state, Player player) {
        if (!world.isClientSide()) {
            if (player.isCreative()) {
                //TallCropBlock.onBreakInCreative(world, pos, state, player);
            } else {
                TallCropBlock.dropResources(state, world, pos, null, player, player.getMainHandItem());
            }
        }
        return super.playerWillDestroy(world, pos, state, player);
    }

    @Override
    public void playerDestroy(Level world, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.playerDestroy(world, player, pos, Blocks.AIR.defaultBlockState(), blockEntity, stack);
    }

    protected static void onBreakInCreative(Level world, BlockPos pos, BlockState state, Player player) {
        BlockPos blockPos = pos.below();
        BlockState blockState = world.getBlockState(blockPos);
        DoubleBlockHalf doubleBlockHalf = state.getValue(HALF);
        if (doubleBlockHalf == DoubleBlockHalf.UPPER && blockState.is(state.getBlock()) && blockState.getValue(HALF) == DoubleBlockHalf.LOWER) {
            BlockState blockState2 = blockState.hasProperty(BlockStateProperties.WATERLOGGED) && blockState.getValue(BlockStateProperties.WATERLOGGED) != false ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
            world.setBlock(blockPos, blockState2, Block.UPDATE_ALL | Block.UPDATE_SUPPRESS_DROPS);
            world.levelEvent(player, LevelEvent.PARTICLES_DESTROY_BLOCK, blockPos, Block.getId(blockState));
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(HALF);
        super.createBlockStateDefinition(builder);
    }

    @Override
    public long getSeed(BlockState state, BlockPos pos) {
        return Mth.getSeed(pos.getX(), pos.below(state.getValue(HALF) == DoubleBlockHalf.LOWER ? 0 : 1).getY(), pos.getZ());
    }
}
