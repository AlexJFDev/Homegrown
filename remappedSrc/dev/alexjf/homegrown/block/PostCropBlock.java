package dev.alexjf.homegrown.block;

import java.util.Random;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.HomegrownItems;
import dev.alexjf.homegrown.state.property.HomegrownProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class PostCropBlock extends CropBlock {
	public static final EnumProperty<PostType> TYPE = HomegrownProperties.POST_TYPE;

	protected PostCropBlock(Settings settings) {
		super(settings);
	}

	@Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
		PostType postType = (PostType)state.get(TYPE);
		world.setBlockState(pos, getPostType(postType), 3);
	}
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.125f, 0f, .125f, .875f, 1f, 0.875f);
	}

	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TYPE);
		stateManager.add(AGE);
    }

	public EnumProperty<PostType> getTypeProperty() {
		return TYPE;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (world.getBaseLightLevel(pos, 0) >= 9) {
			int i = this.getAge(state);
			if (i < this.getMaxAge()) {
				float f = getAvailableMoisture(this, world, pos);
				if (random.nextInt((int)(25.0F / f) + 1) == 0) {
					world.setBlockState(pos, this.withAge(i + 1).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
				}
			}
		}
	}

	public BlockState getPostType(PostType postType){
		switch(postType) {
			case OAK_LOG_POST:
				return HomegrownBlocks.OAK_LOG_POST.getDefaultState();
			case OAK_PLANKS_POST:
				return HomegrownBlocks.OAK_PLANKS_POST.getDefaultState();
			case OAK_WOOD_POST:
				return HomegrownBlocks.OAK_WOOD_POST.getDefaultState();
			case STRIPPED_OAK_LOG_POST:
				return HomegrownBlocks.STRIPPED_OAK_LOG_POST.getDefaultState();
			case STRIPPED_OAK_WOOD_POST:
				return HomegrownBlocks.STRIPPED_OAK_WOOD_POST.getDefaultState();
			default: 
				return HomegrownBlocks.OAK_LOG_POST.getDefaultState();
			}
	}

	@Override
	public void applyGrowth(World world, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getGrowthAmount(world);
		int j = this.getMaxAge();
		if (i > j) {
			i = j;
		}

		world.setBlockState(pos, this.withAge(i).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
	}

	@Override
	protected ItemConvertible getSeedsItem() {
		return HomegrownItems.TOMATO_SEEDS;
	}
	
	@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		PostType postType = (PostType)state.get(TYPE);
		return !state.canPlaceAt(world, pos) ? this.getPostType(postType) : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}
}