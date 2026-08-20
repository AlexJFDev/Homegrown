package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.block.enums.PostType;
import dev.alexjf.homegrown.item.PostCropSeeds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PostBlock extends Block {
    public PostBlock(BlockBehaviour.Properties fabricBlockSettings) {
        super(fabricBlockSettings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter view, BlockPos pos, CollisionContext context) {
        return Shapes.box(.375f, 0f, .375f, .625f, 1f, 0.625f);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        ItemStack stack = player.getMainHandItem();
		if (!stack.isEmpty() && stack.getItem() instanceof PostCropSeeds && world.getBlockState(pos.below()).is(Blocks.FARMLAND)) {
            String postIdentifier = BuiltInRegistries.BLOCK.getKey(world.getBlockState(pos).getBlock()).toString();
            BlockState cropBlockState = ((PostCropSeeds) stack.getItem()).getCrop();
			world.setBlockAndUpdate(pos, cropBlockState.setValue(PostCropBlock.TYPE, PostType.getPostType(postIdentifier)));
            if (!player.isCreative()) {
				stack.shrink(1);
			}
			return InteractionResult.SUCCESS;
		}
		return InteractionResult.FAIL;
    }

    public static BlockState getPostVariant(String postVariant){
		switch(postVariant) {
			case "homegrown:oak_planks_post":
				return HomegrownBlocks.OAK_PLANKS_POST.defaultBlockState();
			case "homegrown:oak_log_post":
				return HomegrownBlocks.OAK_LOG_POST.defaultBlockState();
			case "homegrown:stripped_oak_log_post":
				return HomegrownBlocks.STRIPPED_OAK_LOG_POST.defaultBlockState();
			case "homegrown:oak_wood_post":
				return HomegrownBlocks.OAK_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_oak_wood_post":
				return HomegrownBlocks.STRIPPED_OAK_WOOD_POST.defaultBlockState();
			case "homegrown:spruce_planks_post":
				return HomegrownBlocks.SPRUCE_PLANKS_POST.defaultBlockState();
			case "homegrown:spruce_log_post":
				return HomegrownBlocks.SPRUCE_LOG_POST.defaultBlockState();
			case "homegrown:stripped_spruce_log_post":
				return HomegrownBlocks.STRIPPED_SPRUCE_LOG_POST.defaultBlockState();
			case "homegrown:spruce_wood_post":
				return HomegrownBlocks.SPRUCE_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_spruce_wood_post":
				return HomegrownBlocks.STRIPPED_SPRUCE_WOOD_POST.defaultBlockState();
			case "homegrown:birch_planks_post":
				return HomegrownBlocks.BIRCH_PLANKS_POST.defaultBlockState();
			case "homegrown:birch_log_post":
				return HomegrownBlocks.BIRCH_LOG_POST.defaultBlockState();
			case "homegrown:stripped_birch_log_post":
				return HomegrownBlocks.STRIPPED_BIRCH_LOG_POST.defaultBlockState();
			case "homegrown:birch_wood_post":
				return HomegrownBlocks.BIRCH_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_birch_wood_post":
				return HomegrownBlocks.STRIPPED_BIRCH_WOOD_POST.defaultBlockState();
			case "homegrown:jungle_planks_post":
				return HomegrownBlocks.JUNGLE_PLANKS_POST.defaultBlockState();
			case "homegrown:jungle_log_post":
				return HomegrownBlocks.JUNGLE_LOG_POST.defaultBlockState();
			case "homegrown:stripped_jungle_log_post":
				return HomegrownBlocks.STRIPPED_JUNGLE_LOG_POST.defaultBlockState();
			case "homegrown:jungle_wood_post":
				return HomegrownBlocks.JUNGLE_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_jungle_wood_post":
				return HomegrownBlocks.STRIPPED_JUNGLE_WOOD_POST.defaultBlockState();
			case "homegrown:acacia_planks_post":
				return HomegrownBlocks.ACACIA_PLANKS_POST.defaultBlockState();
			case "homegrown:acacia_log_post":
				return HomegrownBlocks.ACACIA_LOG_POST.defaultBlockState();
			case "homegrown:stripped_acacia_log_post":
				return HomegrownBlocks.STRIPPED_ACACIA_LOG_POST.defaultBlockState();
			case "homegrown:acacia_wood_post":
				return HomegrownBlocks.ACACIA_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_acacia_wood_post":
				return HomegrownBlocks.STRIPPED_ACACIA_WOOD_POST.defaultBlockState();
			case "homegrown:dark_oak_planks_post":
				return HomegrownBlocks.DARK_OAK_PLANKS_POST.defaultBlockState();
			case "homegrown:dark_oak_log_post":
				return HomegrownBlocks.DARK_OAK_LOG_POST.defaultBlockState();
			case "homegrown:stripped_dark_oak_log_post":
				return HomegrownBlocks.STRIPPED_DARK_OAK_LOG_POST.defaultBlockState();
			case "homegrown:dark_oak_wood_post":
				return HomegrownBlocks.DARK_OAK_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_dark_oak_wood_post":
				return HomegrownBlocks.STRIPPED_DARK_OAK_WOOD_POST.defaultBlockState();
			
			case "homegrown:mangrove_planks_post":
				return HomegrownBlocks.MANGROVE_PLANKS_POST.defaultBlockState();
			case "homegrown:mangrove_log_post":
				return HomegrownBlocks.MANGROVE_LOG_POST.defaultBlockState();
			case "homegrown:stripped_mangrove_log_post":
				return HomegrownBlocks.STRIPPED_MANGROVE_LOG_POST.defaultBlockState();
			case "homegrown:mangrove_wood_post":
				return HomegrownBlocks.MANGROVE_WOOD_POST.defaultBlockState();
			case "homegrown:stripped_mangrove_wood_post":
				return HomegrownBlocks.STRIPPED_MANGROVE_WOOD_POST.defaultBlockState();
			
			case "homegrown:crimson_planks_post":
				return HomegrownBlocks.CRIMSON_PLANKS_POST.defaultBlockState();
			case "homegrown:crimson_stem_post":
				return HomegrownBlocks.CRIMSON_STEM_POST.defaultBlockState();
			case "homegrown:stripped_crimson_stem_post":
				return HomegrownBlocks.STRIPPED_CRIMSON_STEM_POST.defaultBlockState();
			case "homegrown:crimson_hyphae_post":
				return HomegrownBlocks.CRIMSON_HYPHAE_POST.defaultBlockState();
			case "homegrown:stripped_crimson_hyphae_post":
				return HomegrownBlocks.STRIPPED_CRIMSON_HYPHAE_POST.defaultBlockState();
			case "homegrown:warped_planks_post":
				return HomegrownBlocks.WARPED_PLANKS_POST.defaultBlockState();
			case "homegrown:warped_stem_post":
				return HomegrownBlocks.WARPED_STEM_POST.defaultBlockState();
			case "homegrown:stripped_warped_stem_post":
				return HomegrownBlocks.STRIPPED_WARPED_STEM_POST.defaultBlockState();
			case "homegrown:warped_hyphae_post":
				return HomegrownBlocks.WARPED_HYPHAE_POST.defaultBlockState();
			case "homegrown:stripped_warped_hyphae_post":
				return HomegrownBlocks.STRIPPED_WARPED_HYPHAE_POST.defaultBlockState();
			default: 
				return HomegrownBlocks.OAK_LOG_POST.defaultBlockState();
		}
	}

	public static BlockState getPostVariant(PostType postType){
		switch(postType) {
			case OAK_LOG_POST:
				return HomegrownBlocks.OAK_LOG_POST.defaultBlockState();
			case OAK_PLANKS_POST:
				return HomegrownBlocks.OAK_PLANKS_POST.defaultBlockState();
			case OAK_WOOD_POST:
				return HomegrownBlocks.OAK_WOOD_POST.defaultBlockState();
			case STRIPPED_OAK_LOG_POST:
				return HomegrownBlocks.STRIPPED_OAK_LOG_POST.defaultBlockState();
			case STRIPPED_OAK_WOOD_POST:
				return HomegrownBlocks.STRIPPED_OAK_WOOD_POST.defaultBlockState();
			case SPRUCE_PLANKS_POST:
				return HomegrownBlocks.SPRUCE_PLANKS_POST.defaultBlockState();
			case SPRUCE_LOG_POST:
				return HomegrownBlocks.SPRUCE_LOG_POST.defaultBlockState();
			case STRIPPED_SPRUCE_LOG_POST:
				return HomegrownBlocks.STRIPPED_SPRUCE_LOG_POST.defaultBlockState();
			case SPRUCE_WOOD_POST:
				return HomegrownBlocks.SPRUCE_WOOD_POST.defaultBlockState();
			case STRIPPED_SPRUCE_WOOD_POST:
				return HomegrownBlocks.STRIPPED_SPRUCE_WOOD_POST.defaultBlockState();
			case BIRCH_PLANKS_POST:
				return HomegrownBlocks.BIRCH_PLANKS_POST.defaultBlockState();
			case BIRCH_LOG_POST:
				return HomegrownBlocks.BIRCH_LOG_POST.defaultBlockState();
			case STRIPPED_BIRCH_LOG_POST:
				return HomegrownBlocks.STRIPPED_BIRCH_LOG_POST.defaultBlockState();
			case BIRCH_WOOD_POST:
				return HomegrownBlocks.BIRCH_WOOD_POST.defaultBlockState();
			case STRIPPED_BIRCH_WOOD_POST:
				return HomegrownBlocks.STRIPPED_BIRCH_WOOD_POST.defaultBlockState();
			case JUNGLE_PLANKS_POST:
				return HomegrownBlocks.JUNGLE_PLANKS_POST.defaultBlockState();
			case JUNGLE_LOG_POST:
				return HomegrownBlocks.JUNGLE_LOG_POST.defaultBlockState();
			case STRIPPED_JUNGLE_LOG_POST:
				return HomegrownBlocks.STRIPPED_JUNGLE_LOG_POST.defaultBlockState();
			case JUNGLE_WOOD_POST:
				return HomegrownBlocks.JUNGLE_WOOD_POST.defaultBlockState();
			case STRIPPED_JUNGLE_WOOD_POST:
				return HomegrownBlocks.STRIPPED_JUNGLE_WOOD_POST.defaultBlockState();
			case ACACIA_PLANKS_POST:
				return HomegrownBlocks.ACACIA_PLANKS_POST.defaultBlockState();
			case ACACIA_LOG_POST:
				return HomegrownBlocks.ACACIA_LOG_POST.defaultBlockState();
			case STRIPPED_ACACIA_LOG_POST:
				return HomegrownBlocks.STRIPPED_ACACIA_LOG_POST.defaultBlockState();
			case ACACIA_WOOD_POST:
				return HomegrownBlocks.ACACIA_WOOD_POST.defaultBlockState();
			case STRIPPED_ACACIA_WOOD_POST:
				return HomegrownBlocks.STRIPPED_ACACIA_WOOD_POST.defaultBlockState();
			case DARK_OAK_PLANKS_POST:
				return HomegrownBlocks.DARK_OAK_PLANKS_POST.defaultBlockState();
			case DARK_OAK_LOG_POST:
				return HomegrownBlocks.DARK_OAK_LOG_POST.defaultBlockState();
			case STRIPPED_DARK_OAK_LOG_POST:
				return HomegrownBlocks.STRIPPED_DARK_OAK_LOG_POST.defaultBlockState();
			case DARK_OAK_WOOD_POST:
				return HomegrownBlocks.DARK_OAK_WOOD_POST.defaultBlockState();
			case STRIPPED_DARK_OAK_WOOD_POST:
				return HomegrownBlocks.STRIPPED_DARK_OAK_WOOD_POST.defaultBlockState();
			
			case MANGROVE_LOG_POST:
				return HomegrownBlocks.MANGROVE_LOG_POST.defaultBlockState();
			case MANGROVE_PLANKS_POST:
				return HomegrownBlocks.MANGROVE_PLANKS_POST.defaultBlockState();
			case MANGROVE_WOOD_POST:
				return HomegrownBlocks.MANGROVE_WOOD_POST.defaultBlockState();
			case STRIPPED_MANGROVE_LOG_POST:
				return HomegrownBlocks.STRIPPED_MANGROVE_LOG_POST.defaultBlockState();
			case STRIPPED_MANGROVE_WOOD_POST:
				return HomegrownBlocks.STRIPPED_MANGROVE_WOOD_POST.defaultBlockState();

			case CRIMSON_PLANKS_POST:
				return HomegrownBlocks.CRIMSON_PLANKS_POST.defaultBlockState();
			case CRIMSON_STEM_POST:
				return HomegrownBlocks.CRIMSON_STEM_POST.defaultBlockState();
			case STRIPPED_CRIMSON_STEM_POST:
				return HomegrownBlocks.STRIPPED_CRIMSON_STEM_POST.defaultBlockState();
			case CRIMSON_HYPHAE_POST:
				return HomegrownBlocks.CRIMSON_HYPHAE_POST.defaultBlockState();
			case STRIPPED_CRIMSON_HYPHAE_POST:
				return HomegrownBlocks.STRIPPED_CRIMSON_HYPHAE_POST.defaultBlockState();
			case WARPED_PLANKS_POST:
				return HomegrownBlocks.WARPED_PLANKS_POST.defaultBlockState();
			case WARPED_STEM_POST:
				return HomegrownBlocks.WARPED_STEM_POST.defaultBlockState();
			case STRIPPED_WARPED_STEM_POST:
				return HomegrownBlocks.STRIPPED_WARPED_STEM_POST.defaultBlockState();
			case WARPED_HYPHAE_POST:
				return HomegrownBlocks.WARPED_HYPHAE_POST.defaultBlockState();
			case STRIPPED_WARPED_HYPHAE_POST:
				return HomegrownBlocks.STRIPPED_WARPED_HYPHAE_POST.defaultBlockState();
			default: 
				return HomegrownBlocks.OAK_LOG_POST.defaultBlockState();
		}
	}


}   