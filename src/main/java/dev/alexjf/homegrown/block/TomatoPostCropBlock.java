package dev.alexjf.homegrown.block;

import java.util.Random;

import org.jetbrains.annotations.Nullable;

import dev.alexjf.homegrown.block.enums.PostType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class TomatoPostCropBlock extends PostCropBlock{
    BlockPos blockPosition;

    public BlockPos getBlockPosition() {
        return blockPosition;
    }

    public void setBlockPosition(BlockPos pos){
        blockPosition = pos;
    }

    protected TomatoPostCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        int i = this.getAge(state);
        if(i >= 6){
            dropStacks(state, world, pos);
            world.setBlockState(pos, this.withAge(5).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
            return ActionResult.SUCCESS;
        }
        return ActionResult.FAIL;
    }
    
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBaseLightLevel(pos, 0) >= 9) {
			int i = this.getAge(state);
            int j;
			for(j = 1; world.getBlockState(pos.down(j)).isOf(this); ++j) {
			}
            if (i >= 5 && world.getBlockState(pos.up()).getBlock() instanceof PostBlock && j < 3){
                String post_type = Registry.BLOCK.getId(world.getBlockState(pos.up()).getBlock()).toString();
                switch (post_type) {
                    case "homegrown:oak_log_post":
                        world.setBlockState(pos.up(), this.withAge(0).with(TomatoPostCropBlock.TYPE, PostType.OAK_LOG_POST));
                        break;
                    case "homegrown:oak_planks_post":
                        world.setBlockState(pos.up(), this.withAge(0).with(TomatoPostCropBlock.TYPE, PostType.OAK_PLANKS_POST));
                        break;
                    case "homegrown:oak_wood_post": 
                        world.setBlockState(pos.up(), this.withAge(0).with(TomatoPostCropBlock.TYPE, PostType.OAK_WOOD_POST));
                        break;
                    case "homegrown:stripped_oak_log_post": 
                        world.setBlockState(pos.up(), this.withAge(0).with(TomatoPostCropBlock.TYPE, PostType.STRIPPED_OAK_LOG_POST));
                        break;
                    case "homegrown:stripped_oak_wood_post": 
                        world.setBlockState(pos.up(), this.withAge(0).with(TomatoPostCropBlock.TYPE, PostType.STRIPPED_OAK_WOOD_POST));
                        break;
                    default: world.setBlockState(pos.up(), this.withAge(0).with(TomatoPostCropBlock.TYPE, PostType.OAK_LOG_POST));
                }
            }
			else if (i < this.getMaxAge()) {
				float f = TomatoPostCropBlock.getAvailableMoisture(this, world, pos);
				if (random.nextInt((int)(25.0F / f) + 1) == 0) {
					world.setBlockState(pos, this.withAge(i + 1).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
				}
			}
		}
	}

    // This could become a problem in the future; it needs looking into.
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    public static float getAvailableMoisture(Block block, BlockView world, BlockPos pos){
        BlockPos blockPosition = pos.down();
        if(world.getBlockState(pos).isOf(Blocks.FARMLAND)){
            return CropBlock.getAvailableMoisture(block, world, pos);
        } else {
            return TomatoPostCropBlock.getAvailableMoisture(block, world, blockPosition);
        }
    }
    
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isOf(Blocks.FARMLAND) || floor.getBlock() instanceof TomatoPostCropBlock;
	}

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.canPlaceAt(world, pos)) {
            world.breakBlock(pos, true);
        }
        PostType postType = (PostType)state.get(TYPE);
		world.setBlockState(pos, getPostType(postType), 3);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        setBlockPosition(pos);
    }

    /*@Override
	public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		PostType postType = (PostType)state.get(TYPE);
		return !state.canPlaceAt(world, pos) ? this.getPostType(postType) : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}*/
    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 1);
        }
        return state;
    }
}
