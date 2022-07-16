package dev.alexjf.homegrown.block;

import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.PostCropSeeds;
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
		if (!stack.isEmpty() && stack.getItem() instanceof PostCropSeeds && world.getBlockState(pos.down()).isOf(Blocks.FARMLAND)) {
            String post_type = Registry.BLOCK.getId(world.getBlockState(pos).getBlock()).toString();
                BlockState crop_blockstate = ((PostCropSeeds) stack.getItem()).getCrop();
                switch (post_type) {
                    case "homegrown:oak_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.OAK_LOG_POST));
                        break;
                    case "homegrown:oak_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.OAK_PLANKS_POST));
                        break;
                    case "homegrown:oak_wood_post": 
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.OAK_WOOD_POST));
                        break;
                    case "homegrown:stripped_oak_log_post": 
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_OAK_LOG_POST));
                        break;
                    case "homegrown:stripped_oak_wood_post": 
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_OAK_WOOD_POST));
                        break;
                    case "homegrown:spruce_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.SPRUCE_PLANKS_POST));
                        break;
                    case "homegrown:spruce_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.SPRUCE_LOG_POST));
                        break;
                    case "homegrown:stripped_spruce_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_SPRUCE_LOG_POST));
                        break;
                    case "homegrown:spruce_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.SPRUCE_WOOD_POST));
                        break;
                    case "homegrown:stripped_spruce_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_SPRUCE_WOOD_POST));
                        break;
                    case "homegrown:birch_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.BIRCH_PLANKS_POST));
                        break;
                    case "homegrown:birch_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.BIRCH_LOG_POST));
                        break;
                    case "homegrown:stripped_birch_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_BIRCH_LOG_POST));
                        break;
                    case "homegrown:birch_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.BIRCH_WOOD_POST));
                        break;
                    case "homegrown:stripped_birch_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_BIRCH_WOOD_POST));
                        break;
                    case "homegrown:jungle_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.JUNGLE_PLANKS_POST));
                        break;
                    case "homegrown:jungle_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.JUNGLE_LOG_POST));
                        break;
                    case "homegrown:stripped_jungle_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_JUNGLE_LOG_POST));
                        break;
                    case "homegrown:jungle_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.JUNGLE_WOOD_POST));
                        break;
                    case "homegrown:stripped_jungle_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_JUNGLE_WOOD_POST));
                        break;
                    case "homegrown:acacia_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.ACACIA_PLANKS_POST));
                        break;
                    case "homegrown:acacia_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.ACACIA_LOG_POST));
                        break;
                    case "homegrown:stripped_acacia_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_ACACIA_LOG_POST));
                        break;
                    case "homegrown:acacia_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.ACACIA_WOOD_POST));
                        break;
                    case "homegrown:stripped_acacia_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_ACACIA_WOOD_POST));
                        break;
                    case "homegrown:dark_oak_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.DARK_OAK_PLANKS_POST));
                        break;
                    case "homegrown:dark_oak_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.DARK_OAK_LOG_POST));
                        break;
                    case "homegrown:stripped_dark_oak_log_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_DARK_OAK_LOG_POST));
                        break;
                    case "homegrown:dark_oak_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.DARK_OAK_WOOD_POST));
                        break;
                    case "homegrown:stripped_dark_oak_wood_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_DARK_OAK_WOOD_POST));
                        break;
                    case "homegrown:crimson_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.CRIMSON_PLANKS_POST));
                        break;
                    case "homegrown:crimson_stem_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.CRIMSON_STEM_POST));
                        break;
                    case "homegrown:stripped_crimson_stem_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_CRIMSON_STEM_POST));
                        break;
                    case "homegrown:crimson_hyphae_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.CRIMSON_HYPHAE_POST));
                        break;
                    case "homegrown:stripped_crimson_hyphae_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_CRIMSON_HYPHAE_POST));
                        break;
                    case "homegrown:warped_planks_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.WARPED_PLANKS_POST));
                        break;
                    case "homegrown:warped_stem_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.WARPED_STEM_POST));
                        break;
                    case "homegrown:stripped_warped_stem_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_WARPED_STEM_POST));
                        break;
                    case "homegrown:warped_hyphae_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.WARPED_HYPHAE_POST));
                        break;
                    case "homegrown:stripped_warped_hyphae_post":
                        world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.STRIPPED_WARPED_HYPHAE_POST));
                        break;
                    default: world.setBlockState(pos, crop_blockstate.with(PostCropBlock.TYPE, PostType.OAK_LOG_POST));
                }
				if (!player.isCreative()) {
					stack.decrement(1);
				}
				return ActionResult.SUCCESS;
		}
		return ActionResult.FAIL;
    }
}   