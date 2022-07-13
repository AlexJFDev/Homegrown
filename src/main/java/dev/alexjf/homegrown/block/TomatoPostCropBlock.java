package dev.alexjf.homegrown.block;

import java.util.Random;

import dev.alexjf.homegrown.block.enums.PostType;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TomatoPostCropBlock extends PostCropBlock{
    
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
				float f = getAvailableMoisture(this, world, pos);
				if (random.nextInt((int)(25.0F / f) + 1) == 0) {
					world.setBlockState(pos, this.withAge(i + 1).with(this.getTypeProperty(), (PostType)state.get(TYPE)), Block.NOTIFY_LISTENERS);
				}
			}
		}
	}

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isOf(Blocks.FARMLAND) || floor.getBlock() instanceof TomatoPostCropBlock;
	}
}
