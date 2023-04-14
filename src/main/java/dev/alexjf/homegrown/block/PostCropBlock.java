package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.state.property.HomegrownProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.HomegrownItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.Registries;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class PostCropBlock extends CropBlock {
	protected static final EnumProperty<PostType> POST_TYPE = HomegrownProperties.POST_TYPE;

	protected PostCropBlock(Settings settings) {
		super(settings);
	}

	@Override
	protected ItemConvertible getSeedsItem() {
		return HomegrownItems.TOMATO_SEEDS;
	}

	// This could potentially cause lag. It needs looking into.
	@Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
	
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.125f, 0f, .125f, .875f, 1f, 0.875f);
	}

	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
	}

	public EnumProperty<PostType> getTypeProperty() {
		return POST_TYPE;
	}

	@Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isOf(Blocks.FARMLAND) || floor.isOf(this);
	}

	protected static float getAvailableMoisture(Block block, BlockView world, BlockPos pos){
        BlockPos floor = pos.down();
        if(world.getBlockState(floor).isOf(Blocks.FARMLAND)) return CropBlock.getAvailableMoisture(block, world, pos);
        return PostCropBlock.getAvailableMoisture(block, world, floor);
    }

	/*public static float getAvailableMoisture(Block block, BlockView world, BlockPos pos, int depth){
        BlockPos floor = pos.down();
        if(world.getBlockState(floor).isOf(Blocks.FARMLAND) || depth >= 2){
            return CropBlock.getAvailableMoisture(block, world, pos);
        } else {
            return PostCropBlock.getAvailableMoisture(block, world, floor, depth + 1);
        }
    }*/
	
	@Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.scheduleBlockTick(pos, this, 1);
        }
        return state;
    }

	@Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = this.getAge(state);
        if(i >= 6){
            dropStacks(state, world, pos);
            world.setBlockState(pos, this.withAge(5).with(this.getTypeProperty(), (PostType)state.get(POST_TYPE)), Block.NOTIFY_LISTENERS);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }

	@Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
		PostType postType = (PostType)state.get(POST_TYPE);
		world.setBlockState(pos, PostBlock.getPostVariant(postType), 3);
	}

	@Override
	public void applyGrowth(World world, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getGrowthAmount(world);
		int j = this.getMaxAge();
		if (i > j) {
			i = j;
		}
		world.setBlockState(pos, this.withAge(i).with(this.getTypeProperty(), (PostType)state.get(POST_TYPE)), Block.NOTIFY_LISTENERS);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POST_TYPE);
		builder.add(AGE);
    }

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (world.getBaseLightLevel(pos, 0) >= 9) {
			int i = this.getAge(state);
			if (i < this.getMaxAge()) {
				float f = getAvailableMoisture(this, world, pos);
				if (random.nextInt((int)(25.0F / f) + 1) == 0) {
					world.setBlockState(pos, this.withAge(i + 1).with(this.getTypeProperty(), (PostType)state.get(POST_TYPE)), Block.NOTIFY_LISTENERS);
				}
			}
		}
	}

	@Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }
        PostType postType = (PostType)state.get(POST_TYPE);
		world.setBlockState(pos, PostBlock.getPostVariant(postType), 3);
    }
}