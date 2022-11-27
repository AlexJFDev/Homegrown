package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.HomegrownItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TomatoBlock extends PostCropBlock{

    protected TomatoBlock(Settings settings) {
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

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isOf(Blocks.FARMLAND) || floor.isOf(this);
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
            float f = PostCropBlock.getAvailableMoisture(this, world, pos);
			if (random.nextInt((int)(25.0F / f) + 1) == 0) {
                int i = this.getAge(state);
                int j;
                for(j = 1; world.getBlockState(pos.down(j)).isOf(this); ++j){}
                if (i >= 5 && world.getBlockState(pos.up()).getBlock() instanceof PostBlock && j < 3){
                    String postIdentifier = Registry.BLOCK.getId(world.getBlockState(pos.up()).getBlock()).toString();
                    world.setBlockState(pos.up(), this.withAge(0).with(TomatoBlock.TYPE, PostType.getPostType(postIdentifier)));
                }
                else if (i < this.getMaxAge()) {
                    world.setBlockState(pos, this.withAge(i + 1).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
                }
			}
		}
	}

    @Override
	public void applyGrowth(World world, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getGrowthAmount(world);
		int j = this.getMaxAge();
		if (i > j) {
            if (world.getBlockState(pos.up()).getBlock() instanceof PostBlock) {
                int l;
			    for(l = 1; world.getBlockState(pos.down(l)).isOf(this); ++l){}
                if(l < 3){
                    String postIdentifier = Registry.BLOCK.getId(world.getBlockState(pos.up()).getBlock()).toString();
                    world.setBlockState(pos.up(), this.withAge(i - j).with(this.getTypeProperty(), PostType.getPostType(postIdentifier)), Block.NOTIFY_LISTENERS);
                }
            }
			i = j;
		}
		world.setBlockState(pos, this.withAge(i).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
	}
}
