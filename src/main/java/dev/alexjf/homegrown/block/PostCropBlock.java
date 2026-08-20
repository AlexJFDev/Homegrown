package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.state.property.HomegrownProperties;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PostCropBlock extends CropBlock {
	protected static final EnumProperty<PostType> TYPE = HomegrownProperties.POST_TYPE;

	protected PostCropBlock(Properties settings) {
		super(settings);
	}
	
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.box(.125f, 0f, .125f, .875f, 1f, 0.875f);
	}

	public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.box(.375f, 0f, .375f, .625f, 1f, 0.625f);
	}

	public EnumProperty<PostType> getTypeProperty() {
		return TYPE;
	}

	public static float getGrowthSpeed(Block block, BlockGetter world, BlockPos pos){
        BlockPos floor = pos.below();
        if(world.getBlockState(floor).is(Blocks.FARMLAND)){
            return CropBlock.getGrowthSpeed(block, world, pos);
        } else {
            return PostCropBlock.getAvailableMoisture(block, world, floor, 0);
        }
    }

	public static float getAvailableMoisture(Block block, BlockGetter world, BlockPos pos, int depth){
        BlockPos floor = pos.below();
        if(world.getBlockState(floor).is(Blocks.FARMLAND) || depth >= 2){
            return CropBlock.getGrowthSpeed(block, world, pos);
        } else {
            return PostCropBlock.getAvailableMoisture(block, world, floor, depth + 1);
        }
    }
	
	@Override
    public BlockState updateShape(BlockState state, LevelReader world, ScheduledTickAccess tickView, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (!state.canSurvive(world, pos)) {
            tickView.scheduleTick(pos, this, 1);
        }
        return state;
    }

	@Override
    public void destroy(LevelAccessor world, BlockPos pos, BlockState state) {
		PostType postType = (PostType)state.getValue(TYPE);
		world.setBlock(pos, PostBlock.getPostVariant(postType), 3);
	}

	@Override
	public void growCrops(Level world, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getBonemealAgeIncrease(world);
		int j = this.getMaxAge();
		if (i > j) {
			i = j;
		}
		world.setBlock(pos, this.getStateForAge(i).setValue(this.getTypeProperty(), (PostType)state.getValue(TYPE)), Block.UPDATE_CLIENTS);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TYPE);
		builder.add(AGE);
    }

	@Override
	public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
		if (world.getRawBrightness(pos, 0) >= 9) {
			int i = this.getAge(state);
			if (i < this.getMaxAge()) {
				float f = getGrowthSpeed(this, world, pos);
				if (random.nextInt((int)(25.0F / f) + 1) == 0) {
					world.setBlock(pos, this.getStateForAge(i + 1).setValue(this.getTypeProperty(), (PostType)state.getValue(TYPE)), Block.UPDATE_CLIENTS);
				}
			}
		}
	}

	@Override
    public void tick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!state.canSurvive(world, pos)) {
            world.destroyBlock(pos, true);
        }
        PostType postType = (PostType)state.getValue(TYPE);
		world.setBlock(pos, PostBlock.getPostVariant(postType), 3);
    }
}