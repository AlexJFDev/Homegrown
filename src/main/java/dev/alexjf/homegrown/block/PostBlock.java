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
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
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
            String postIdentifier = Registries.BLOCK.getId(world.getBlockState(pos).getBlock()).toString();
            BlockState cropBlockState = ((PostCropSeeds) stack.getItem()).getCrop();
			world.setBlockState(pos, cropBlockState.with(PostCropBlock.TYPE, PostType.getPostType(postIdentifier)));
            if (!player.isCreative()) {
				stack.decrement(1);
			}
			return ActionResult.SUCCESS;
		}
		return ActionResult.FAIL;
    }

    public static BlockState getPostVariant(String postVariant){
		switch(postVariant) {
			case "homegrown:oak_planks_post":
				return HomegrownBlocks.OAK_PLANKS_POST.getDefaultState();
			case "homegrown:oak_log_post":
				return HomegrownBlocks.OAK_LOG_POST.getDefaultState();
			case "homegrown:stripped_oak_log_post":
				return HomegrownBlocks.STRIPPED_OAK_LOG_POST.getDefaultState();
			case "homegrown:oak_wood_post":
				return HomegrownBlocks.OAK_WOOD_POST.getDefaultState();
			case "homegrown:stripped_oak_wood_post":
				return HomegrownBlocks.STRIPPED_OAK_WOOD_POST.getDefaultState();
			case "homegrown:spruce_planks_post":
				return HomegrownBlocks.SPRUCE_PLANKS_POST.getDefaultState();
			case "homegrown:spruce_log_post":
				return HomegrownBlocks.SPRUCE_LOG_POST.getDefaultState();
			case "homegrown:stripped_spruce_log_post":
				return HomegrownBlocks.STRIPPED_SPRUCE_LOG_POST.getDefaultState();
			case "homegrown:spruce_wood_post":
				return HomegrownBlocks.SPRUCE_WOOD_POST.getDefaultState();
			case "homegrown:stripped_spruce_wood_post":
				return HomegrownBlocks.STRIPPED_SPRUCE_WOOD_POST.getDefaultState();
			case "homegrown:birch_planks_post":
				return HomegrownBlocks.BIRCH_PLANKS_POST.getDefaultState();
			case "homegrown:birch_log_post":
				return HomegrownBlocks.BIRCH_LOG_POST.getDefaultState();
			case "homegrown:stripped_birch_log_post":
				return HomegrownBlocks.STRIPPED_BIRCH_LOG_POST.getDefaultState();
			case "homegrown:birch_wood_post":
				return HomegrownBlocks.BIRCH_WOOD_POST.getDefaultState();
			case "homegrown:stripped_birch_wood_post":
				return HomegrownBlocks.STRIPPED_BIRCH_WOOD_POST.getDefaultState();
			case "homegrown:jungle_planks_post":
				return HomegrownBlocks.JUNGLE_PLANKS_POST.getDefaultState();
			case "homegrown:jungle_log_post":
				return HomegrownBlocks.JUNGLE_LOG_POST.getDefaultState();
			case "homegrown:stripped_jungle_log_post":
				return HomegrownBlocks.STRIPPED_JUNGLE_LOG_POST.getDefaultState();
			case "homegrown:jungle_wood_post":
				return HomegrownBlocks.JUNGLE_WOOD_POST.getDefaultState();
			case "homegrown:stripped_jungle_wood_post":
				return HomegrownBlocks.STRIPPED_JUNGLE_WOOD_POST.getDefaultState();
			case "homegrown:acacia_planks_post":
				return HomegrownBlocks.ACACIA_PLANKS_POST.getDefaultState();
			case "homegrown:acacia_log_post":
				return HomegrownBlocks.ACACIA_LOG_POST.getDefaultState();
			case "homegrown:stripped_acacia_log_post":
				return HomegrownBlocks.STRIPPED_ACACIA_LOG_POST.getDefaultState();
			case "homegrown:acacia_wood_post":
				return HomegrownBlocks.ACACIA_WOOD_POST.getDefaultState();
			case "homegrown:stripped_acacia_wood_post":
				return HomegrownBlocks.STRIPPED_ACACIA_WOOD_POST.getDefaultState();
			case "homegrown:dark_oak_planks_post":
				return HomegrownBlocks.DARK_OAK_PLANKS_POST.getDefaultState();
			case "homegrown:dark_oak_log_post":
				return HomegrownBlocks.DARK_OAK_LOG_POST.getDefaultState();
			case "homegrown:stripped_dark_oak_log_post":
				return HomegrownBlocks.STRIPPED_DARK_OAK_LOG_POST.getDefaultState();
			case "homegrown:dark_oak_wood_post":
				return HomegrownBlocks.DARK_OAK_WOOD_POST.getDefaultState();
			case "homegrown:stripped_dark_oak_wood_post":
				return HomegrownBlocks.STRIPPED_DARK_OAK_WOOD_POST.getDefaultState();
			
			case "homegrown:mangrove_planks_post":
				return HomegrownBlocks.MANGROVE_PLANKS_POST.getDefaultState();
			case "homegrown:mangrove_log_post":
				return HomegrownBlocks.MANGROVE_LOG_POST.getDefaultState();
			case "homegrown:stripped_mangrove_log_post":
				return HomegrownBlocks.STRIPPED_MANGROVE_LOG_POST.getDefaultState();
			case "homegrown:mangrove_wood_post":
				return HomegrownBlocks.MANGROVE_WOOD_POST.getDefaultState();
			case "homegrown:stripped_mangrove_wood_post":
				return HomegrownBlocks.STRIPPED_MANGROVE_WOOD_POST.getDefaultState();
			
			case "homegrown:crimson_planks_post":
				return HomegrownBlocks.CRIMSON_PLANKS_POST.getDefaultState();
			case "homegrown:crimson_stem_post":
				return HomegrownBlocks.CRIMSON_STEM_POST.getDefaultState();
			case "homegrown:stripped_crimson_stem_post":
				return HomegrownBlocks.STRIPPED_CRIMSON_STEM_POST.getDefaultState();
			case "homegrown:crimson_hyphae_post":
				return HomegrownBlocks.CRIMSON_HYPHAE_POST.getDefaultState();
			case "homegrown:stripped_crimson_hyphae_post":
				return HomegrownBlocks.STRIPPED_CRIMSON_HYPHAE_POST.getDefaultState();
			case "homegrown:warped_planks_post":
				return HomegrownBlocks.WARPED_PLANKS_POST.getDefaultState();
			case "homegrown:warped_stem_post":
				return HomegrownBlocks.WARPED_STEM_POST.getDefaultState();
			case "homegrown:stripped_warped_stem_post":
				return HomegrownBlocks.STRIPPED_WARPED_STEM_POST.getDefaultState();
			case "homegrown:warped_hyphae_post":
				return HomegrownBlocks.WARPED_HYPHAE_POST.getDefaultState();
			case "homegrown:stripped_warped_hyphae_post":
				return HomegrownBlocks.STRIPPED_WARPED_HYPHAE_POST.getDefaultState();
			default: 
				return HomegrownBlocks.OAK_LOG_POST.getDefaultState();
		}
	}

	public static BlockState getPostVariant(PostType postType){
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
			
			case MANGROVE_LOG_POST:
				return HomegrownBlocks.MANGROVE_LOG_POST.getDefaultState();
			case MANGROVE_PLANKS_POST:
				return HomegrownBlocks.MANGROVE_PLANKS_POST.getDefaultState();
			case MANGROVE_WOOD_POST:
				return HomegrownBlocks.MANGROVE_WOOD_POST.getDefaultState();
			case STRIPPED_MANGROVE_LOG_POST:
				return HomegrownBlocks.STRIPPED_MANGROVE_LOG_POST.getDefaultState();
			case STRIPPED_MANGROVE_WOOD_POST:
				return HomegrownBlocks.STRIPPED_MANGROVE_WOOD_POST.getDefaultState();

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


}   