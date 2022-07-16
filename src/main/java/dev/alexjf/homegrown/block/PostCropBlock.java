package dev.alexjf.homegrown.block;

import java.util.Random;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.HomegrownItems;
import dev.alexjf.homegrown.state.property.HomegrownProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
			case SPRUCE_PLANKS_POST:
				return HomegrownBlocks.SPRUCE_PLANKS_POST.getDefaultState();
			case SPRUCE_LOG_POST:
				return HomegrownBlocks.SPRUCE_LOG_POST.getDefaultState();
			case STRIPPED_SPRUCE_LOG_POST:
				return HomegrownBlocks.STRIPPED_SPRUCE_LOG_POST.getDefaultState();
			case SPRUCE_WOOD_POST:
				return HomegrownBlocks.SPRUCE_WOOD_POST.getDefaultState();
			case STRIPPED_SPRUCE_WOOD_POST:
				return HomegrownBlocks.STRIPPED_SPRUCE_WOOD_POST.getDefaultState();
			case BIRCH_PLANKS_POST:
				return HomegrownBlocks.BIRCH_PLANKS_POST.getDefaultState();
			case BIRCH_LOG_POST:
				return HomegrownBlocks.BIRCH_LOG_POST.getDefaultState();
			case STRIPPED_BIRCH_LOG_POST:
				return HomegrownBlocks.STRIPPED_BIRCH_LOG_POST.getDefaultState();
			case BIRCH_WOOD_POST:
				return HomegrownBlocks.BIRCH_WOOD_POST.getDefaultState();
			case STRIPPED_BIRCH_WOOD_POST:
				return HomegrownBlocks.STRIPPED_BIRCH_WOOD_POST.getDefaultState();
			case JUNGLE_PLANKS_POST:
				return HomegrownBlocks.JUNGLE_PLANKS_POST.getDefaultState();
			case JUNGLE_LOG_POST:
				return HomegrownBlocks.JUNGLE_LOG_POST.getDefaultState();
			case STRIPPED_JUNGLE_LOG_POST:
				return HomegrownBlocks.STRIPPED_JUNGLE_LOG_POST.getDefaultState();
			case JUNGLE_WOOD_POST:
				return HomegrownBlocks.JUNGLE_WOOD_POST.getDefaultState();
			case STRIPPED_JUNGLE_WOOD_POST:
				return HomegrownBlocks.STRIPPED_JUNGLE_WOOD_POST.getDefaultState();
			case ACACIA_PLANKS_POST:
				return HomegrownBlocks.ACACIA_PLANKS_POST.getDefaultState();
			case ACACIA_LOG_POST:
				return HomegrownBlocks.ACACIA_LOG_POST.getDefaultState();
			case STRIPPED_ACACIA_LOG_POST:
				return HomegrownBlocks.STRIPPED_ACACIA_LOG_POST.getDefaultState();
			case ACACIA_WOOD_POST:
				return HomegrownBlocks.ACACIA_WOOD_POST.getDefaultState();
			case STRIPPED_ACACIA_WOOD_POST:
				return HomegrownBlocks.STRIPPED_ACACIA_WOOD_POST.getDefaultState();
			case DARK_OAK_PLANKS_POST:
				return HomegrownBlocks.DARK_OAK_PLANKS_POST.getDefaultState();
			case DARK_OAK_LOG_POST:
				return HomegrownBlocks.DARK_OAK_LOG_POST.getDefaultState();
			case STRIPPED_DARK_OAK_LOG_POST:
				return HomegrownBlocks.STRIPPED_DARK_OAK_LOG_POST.getDefaultState();
			case DARK_OAK_WOOD_POST:
				return HomegrownBlocks.DARK_OAK_WOOD_POST.getDefaultState();
			case STRIPPED_DARK_OAK_WOOD_POST:
				return HomegrownBlocks.STRIPPED_DARK_OAK_WOOD_POST.getDefaultState();
			case CRIMSON_PLANKS_POST:
				return HomegrownBlocks.CRIMSON_PLANKS_POST.getDefaultState();
			case CRIMSON_STEM_POST:
				return HomegrownBlocks.CRIMSON_STEM_POST.getDefaultState();
			case STRIPPED_CRIMSON_STEM_POST:
				return HomegrownBlocks.STRIPPED_CRIMSON_STEM_POST.getDefaultState();
			case CRIMSON_HYPHAE_POST:
				return HomegrownBlocks.CRIMSON_HYPHAE_POST.getDefaultState();
			case STRIPPED_CRIMSON_HYPHAE_POST:
				return HomegrownBlocks.STRIPPED_CRIMSON_HYPHAE_POST.getDefaultState();
			case WARPED_PLANKS_POST:
				return HomegrownBlocks.WARPED_PLANKS_POST.getDefaultState();
			case WARPED_STEM_POST:
				return HomegrownBlocks.WARPED_STEM_POST.getDefaultState();
			case STRIPPED_WARPED_STEM_POST:
				return HomegrownBlocks.STRIPPED_WARPED_STEM_POST.getDefaultState();
			case WARPED_HYPHAE_POST:
				return HomegrownBlocks.WARPED_HYPHAE_POST.getDefaultState();
			case STRIPPED_WARPED_HYPHAE_POST:
				return HomegrownBlocks.STRIPPED_WARPED_HYPHAE_POST.getDefaultState();
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
        if (!state.canPlaceAt(world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 1);
        }
        return state;
    }

	@Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }
        PostType postType = (PostType)state.get(TYPE);
		world.setBlockState(pos, getPostType(postType), 3);
    }

	public static float getAvailableMoisture(Block block, BlockView world, BlockPos pos){
        BlockPos blockPosition = pos.down();
        if(world.getBlockState(pos).isOf(Blocks.FARMLAND)){
            return CropBlock.getAvailableMoisture(block, world, pos);
        } else {
            return TomatoPostCropBlock.getAvailableMoisture(block, world, blockPosition);
        }
    }
}