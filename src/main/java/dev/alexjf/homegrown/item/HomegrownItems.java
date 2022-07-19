package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HomegrownItems {
    static String MOD_ID = "homegrown";

	public static final Item GREEN_TOMATO = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.GREEN_TOMATO));
	public static final Item RED_TOMATO = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.RED_TOMATO));
	public static final Item TOMATO_SEEDS = new PostCropSeeds(HomegrownBlocks.TOMATO_CROP, new Item.Settings().group(HomegrownItemGroup.ITEM_GROUP));
	public static final Item CORN_SEEDS = new AliasedBlockItem(HomegrownBlocks.CORN_CROP, new Item.Settings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.CORN_SEEDS));
	public static final Item CORN = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.CORN));
	public static final Item CANTALOUPE_SLICE = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.CANTALOUPE_SLICE));
	public static final Item CANTALOUPE_SEEDS = new AliasedBlockItem(HomegrownBlocks.CANTALOUPE_STEM, new Item.Settings().group(HomegrownItemGroup.ITEM_GROUP));

    public static void init(){
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_planks_post"), new BlockItem(HomegrownBlocks.OAK_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_log_post"), new BlockItem(HomegrownBlocks.OAK_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_OAK_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_post"), new BlockItem(HomegrownBlocks.OAK_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_OAK_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_block"), new BlockItem(HomegrownBlocks.CANTALOUPE_BLOCK, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_planks_post"), new BlockItem(HomegrownBlocks.SPRUCE_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_log_post"), new BlockItem(HomegrownBlocks.SPRUCE_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_SPRUCE_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "spruce_wood_post"), new BlockItem(HomegrownBlocks.SPRUCE_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_SPRUCE_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_planks_post"), new BlockItem(HomegrownBlocks.BIRCH_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_log_post"), new BlockItem(HomegrownBlocks.BIRCH_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_BIRCH_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "birch_wood_post"), new BlockItem(HomegrownBlocks.BIRCH_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_BIRCH_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_planks_post"), new BlockItem(HomegrownBlocks.JUNGLE_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_log_post"), new BlockItem(HomegrownBlocks.JUNGLE_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_JUNGLE_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "jungle_wood_post"), new BlockItem(HomegrownBlocks.JUNGLE_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_JUNGLE_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_planks_post"), new BlockItem(HomegrownBlocks.ACACIA_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_log_post"), new BlockItem(HomegrownBlocks.ACACIA_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_ACACIA_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "acacia_wood_post"), new BlockItem(HomegrownBlocks.ACACIA_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_ACACIA_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_planks_post"), new BlockItem(HomegrownBlocks.DARK_OAK_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_log_post"), new BlockItem(HomegrownBlocks.DARK_OAK_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_DARK_OAK_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_oak_wood_post"), new BlockItem(HomegrownBlocks.DARK_OAK_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_DARK_OAK_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_planks_post"), new BlockItem(HomegrownBlocks.CRIMSON_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_stem_post"), new BlockItem(HomegrownBlocks.CRIMSON_STEM_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_stem_post"), new BlockItem(HomegrownBlocks.STRIPPED_CRIMSON_STEM_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "crimson_hyphae_post"), new BlockItem(HomegrownBlocks.CRIMSON_HYPHAE_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_post"), new BlockItem(HomegrownBlocks.STRIPPED_CRIMSON_HYPHAE_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_planks_post"), new BlockItem(HomegrownBlocks.WARPED_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_stem_post"), new BlockItem(HomegrownBlocks.WARPED_STEM_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_stem_post"), new BlockItem(HomegrownBlocks.STRIPPED_WARPED_STEM_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warped_hyphae_post"), new BlockItem(HomegrownBlocks.WARPED_HYPHAE_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_post"), new BlockItem(HomegrownBlocks.STRIPPED_WARPED_HYPHAE_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));

		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_tomato"), RED_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_tomato"), GREEN_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"corn_seeds"), CORN_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corn"), CORN);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_slice"), CANTALOUPE_SLICE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cantaloupe_seeds"), CANTALOUPE_SEEDS);
    }
}
