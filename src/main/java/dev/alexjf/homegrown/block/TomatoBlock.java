package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.HomegrownItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class TomatoBlock extends PostCropBlock{

    protected TomatoBlock(Properties settings) {
        super(settings);
    }

    @Override
	protected ItemLike getBaseSeedId() {
		return HomegrownItems.TOMATO_SEEDS;
	}

    // This could potentially cause lag. It needs looking into.
    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
		return floor.is(Blocks.FARMLAND) || floor.is(this);
	}

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        int i = this.getAge(state);
        if(i >= 6){
            dropResources(state, world, pos);
            world.setBlock(pos, this.getStateForAge(5).setValue(this.getTypeProperty(), (PostType)state.getValue(TYPE)), Block.UPDATE_CLIENTS);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.FAIL;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (world.getRawBrightness(pos, 0) >= 9) {
            float f = PostCropBlock.getGrowthSpeed(this, world, pos);
			if (random.nextInt((int)(25.0F / f) + 1) == 0) {
                int i = this.getAge(state);
                int j;
                for(j = 1; world.getBlockState(pos.below(j)).is(this); ++j){}
                if (i >= 5 && world.getBlockState(pos.above()).getBlock() instanceof PostBlock && j < 3){
                    String postIdentifier = BuiltInRegistries.BLOCK.getKey(world.getBlockState(pos.above()).getBlock()).toString();
                    world.setBlockAndUpdate(pos.above(), this.getStateForAge(0).setValue(TomatoBlock.TYPE, PostType.getPostType(postIdentifier)));
                }
                else if (i < this.getMaxAge()) {
                    world.setBlock(pos, this.getStateForAge(i + 1).setValue(this.getTypeProperty(), (PostType)state.getValue(TYPE)), Block.UPDATE_CLIENTS);
                }
			}
		}
	}

    @Override
	public void growCrops(Level world, BlockPos pos, BlockState state) {
		int i = this.getAge(state) + this.getBonemealAgeIncrease(world);
		int j = this.getMaxAge();
		if (i > j) {
            if (world.getBlockState(pos.above()).getBlock() instanceof PostBlock) {
                int l;
			    for(l = 1; world.getBlockState(pos.below(l)).is(this); ++l){}
                if(l < 3){
                    String postIdentifier = BuiltInRegistries.BLOCK.getKey(world.getBlockState(pos.above()).getBlock()).toString();
                    world.setBlock(pos.above(), this.getStateForAge(i - j).setValue(this.getTypeProperty(), PostType.getPostType(postIdentifier)), Block.UPDATE_CLIENTS);
                }
            }
			i = j;
		}
		world.setBlock(pos, this.getStateForAge(i).setValue(this.getTypeProperty(), (PostType)state.getValue(TYPE)), Block.UPDATE_CLIENTS);
	}
}
