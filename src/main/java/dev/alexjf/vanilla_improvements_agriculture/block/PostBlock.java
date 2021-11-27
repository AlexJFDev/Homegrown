package dev.alexjf.vanilla_improvements_agriculture.block;

import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import dev.alexjf.vanilla_improvements_agriculture.block.enums.PostType;
import dev.alexjf.vanilla_improvements_agriculture.item.PostCropSeeds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class PostBlock extends Block {
    public PostBlock(net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings fabricBlockSettings) {
        super(fabricBlockSettings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getMainHandStack();
		if (!stack.isEmpty() && stack.getItem() instanceof PostCropSeeds) {
			if (world.getBlockState(pos.down()).isOf(Blocks.FARMLAND)) {
                String post_type = Registry.BLOCK.getId(world.getBlockState(pos).getBlock()).toString();
                switch (post_type) {
                    case "vanilla_improvements_agriculture:oak_log_post":
                        world.setBlockState(pos, ((PostCropSeeds) stack.getItem()).getCrop().with(PostCropBlock.TYPE, PostType.OAK_LOG_POST));
                        break;
                    case "vanilla_improvements_agriculture:oak_planks_post":
                        world.setBlockState(pos, ((PostCropSeeds) stack.getItem()).getCrop().with(PostCropBlock.TYPE, PostType.OAK_PLANKS_POST));
                        break;
                    case "vanilla_improvements_agriculture:oak_wood_post": 
                        world.setBlockState(pos, ((PostCropSeeds) stack.getItem()).getCrop().with(PostCropBlock.TYPE, PostType.OAK_WOOD_POST));
                        break;
                    case "vanilla_improvements_agriculture:stripped_oak_log_post": 
                        world.setBlockState(pos, ((PostCropSeeds) stack.getItem()).getCrop().with(PostCropBlock.TYPE, PostType.STRIPPED_OAK_LOG_POST));
                        break;
                    case "vanilla_improvements_agriculture:stripped_oak_wood_post": 
                        world.setBlockState(pos, ((PostCropSeeds) stack.getItem()).getCrop().with(PostCropBlock.TYPE, PostType.STRIPPED_OAK_WOOD_POST));
                        break;
                    default: world.setBlockState(pos, ((PostCropSeeds) stack.getItem()).getCrop().with(PostCropBlock.TYPE, PostType.OAK_LOG_POST));
                }
				if (!player.isCreative()) {
					stack.decrement(1);
				}
				return ActionResult.SUCCESS;
			}
		}
		return ActionResult.FAIL;
    }
}   