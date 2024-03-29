package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class HomegrownItems {
    static final String MOD_ID = "homegrown";

	public static final Item OAK_PLANKS_POST = new BlockItem(HomegrownBlocks.OAK_PLANKS_POST, new FabricItemSettings());
	public static final Item OAK_LOG_POST = new BlockItem(HomegrownBlocks.OAK_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_OAK_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_OAK_LOG_POST, new FabricItemSettings());
	public static final Item OAK_WOOD_POST = new BlockItem(HomegrownBlocks.OAK_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_OAK_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_OAK_WOOD_POST, new FabricItemSettings());
	public static final Item SPRUCE_PLANKS_POST = new BlockItem(HomegrownBlocks.SPRUCE_PLANKS_POST, new FabricItemSettings());
	public static final Item SPRUCE_LOG_POST = new BlockItem(HomegrownBlocks.SPRUCE_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_SPRUCE_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_SPRUCE_LOG_POST, new FabricItemSettings());
	public static final Item SPRUCE_WOOD_POST = new BlockItem(HomegrownBlocks.SPRUCE_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_SPRUCE_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_SPRUCE_WOOD_POST, new FabricItemSettings());
	public static final Item BIRCH_PLANKS_POST = new BlockItem(HomegrownBlocks.BIRCH_PLANKS_POST, new FabricItemSettings());
	public static final Item BIRCH_LOG_POST = new BlockItem(HomegrownBlocks.BIRCH_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_BIRCH_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_BIRCH_LOG_POST, new FabricItemSettings());
	public static final Item BIRCH_WOOD_POST = new BlockItem(HomegrownBlocks.BIRCH_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_BIRCH_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_BIRCH_WOOD_POST, new FabricItemSettings());
	public static final Item JUNGLE_PLANKS_POST = new BlockItem(HomegrownBlocks.JUNGLE_PLANKS_POST, new FabricItemSettings());
	public static final Item JUNGLE_LOG_POST = new BlockItem(HomegrownBlocks.JUNGLE_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_JUNGLE_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_JUNGLE_LOG_POST, new FabricItemSettings());
	public static final Item JUNGLE_WOOD_POST = new BlockItem(HomegrownBlocks.JUNGLE_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_JUNGLE_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_JUNGLE_WOOD_POST, new FabricItemSettings());
	public static final Item ACACIA_PLANKS_POST = new BlockItem(HomegrownBlocks.ACACIA_PLANKS_POST, new FabricItemSettings());
	public static final Item ACACIA_LOG_POST = new BlockItem(HomegrownBlocks.ACACIA_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_ACACIA_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_ACACIA_LOG_POST, new FabricItemSettings());
	public static final Item ACACIA_WOOD_POST = new BlockItem(HomegrownBlocks.ACACIA_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_ACACIA_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_ACACIA_WOOD_POST, new FabricItemSettings());
	public static final Item DARK_OAK_PLANKS_POST = new BlockItem(HomegrownBlocks.DARK_OAK_PLANKS_POST, new FabricItemSettings());
	public static final Item DARK_OAK_LOG_POST = new BlockItem(HomegrownBlocks.DARK_OAK_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_DARK_OAK_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_DARK_OAK_LOG_POST, new FabricItemSettings());
	public static final Item DARK_OAK_WOOD_POST = new BlockItem(HomegrownBlocks.DARK_OAK_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_DARK_OAK_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_DARK_OAK_WOOD_POST, new FabricItemSettings());
	public static final Item MANGROVE_PLANKS_POST = new BlockItem(HomegrownBlocks.MANGROVE_PLANKS_POST, new FabricItemSettings());
	public static final Item MANGROVE_LOG_POST = new BlockItem(HomegrownBlocks.MANGROVE_LOG_POST, new FabricItemSettings());
	public static final Item STRIPPED_MANGROVE_LOG_POST = new BlockItem(HomegrownBlocks.STRIPPED_MANGROVE_LOG_POST, new FabricItemSettings());
	public static final Item MANGROVE_WOOD_POST = new BlockItem(HomegrownBlocks.MANGROVE_WOOD_POST, new FabricItemSettings());
	public static final Item STRIPPED_MANGROVE_WOOD_POST = new BlockItem(HomegrownBlocks.STRIPPED_MANGROVE_WOOD_POST, new FabricItemSettings());
	public static final Item CRIMSON_PLANKS_POST = new BlockItem(HomegrownBlocks.CRIMSON_PLANKS_POST, new FabricItemSettings());
	public static final Item CRIMSON_STEM_POST = new BlockItem(HomegrownBlocks.CRIMSON_STEM_POST, new FabricItemSettings());
	public static final Item STRIPPED_CRIMSON_STEM_POST = new BlockItem(HomegrownBlocks.STRIPPED_CRIMSON_STEM_POST, new FabricItemSettings());
	public static final Item CRIMSON_HYPHAE_POST = new BlockItem(HomegrownBlocks.CRIMSON_HYPHAE_POST, new FabricItemSettings());
	public static final Item STRIPPED_CRIMSON_HYPHAE_POST = new BlockItem(HomegrownBlocks.STRIPPED_CRIMSON_HYPHAE_POST, new FabricItemSettings());
	public static final Item WARPED_PLANKS_POST = new BlockItem(HomegrownBlocks.WARPED_PLANKS_POST, new FabricItemSettings());
	public static final Item WARPED_STEM_POST = new BlockItem(HomegrownBlocks.WARPED_STEM_POST, new FabricItemSettings());
	public static final Item STRIPPED_WARPED_STEM_POST = new BlockItem(HomegrownBlocks.STRIPPED_WARPED_STEM_POST, new FabricItemSettings());
	public static final Item WARPED_HYPHAE_POST = new BlockItem(HomegrownBlocks.WARPED_HYPHAE_POST, new FabricItemSettings());
	public static final Item STRIPPED_WARPED_HYPHAE_POST = new BlockItem(HomegrownBlocks.STRIPPED_WARPED_HYPHAE_POST, new FabricItemSettings());
	
	public static final Item BURNING_BALE = new BlockItem(HomegrownBlocks.BURNING_BALE, new FabricItemSettings());
	public static final Item CANTALOUPE_BLOCK = new BlockItem(HomegrownBlocks.CANTALOUPE_BLOCK, new FabricItemSettings());
	
	public static final Item RED_TOMATO = new Item(new FabricItemSettings().food(HomegrownFoodComponents.RED_TOMATO));
	public static final Item GREEN_TOMATO = new Item(new FabricItemSettings().food(HomegrownFoodComponents.GREEN_TOMATO));
	public static final Item TOMATO_SEEDS = new PostCropSeeds(HomegrownBlocks.TOMATO, new Item.Settings());
	public static final Item CORN_EAR = new Item(new FabricItemSettings().food(HomegrownFoodComponents.CORN_EAR));
	public static final Item CORN_KERNELS = new AliasedBlockItem(HomegrownBlocks.CORN, new Item.Settings().food(HomegrownFoodComponents.CORN_KERNELS));
	public static final Item BROWN_RICE = new AliasedBlockItem(HomegrownBlocks.RICE, new Item.Settings().food(HomegrownFoodComponents.BROWN_RICE));
	public static final Item BURNING_BUSH_CLIPPINGS = new AliasedBlockItem(HomegrownBlocks.BURNING_BUSH, new Item.Settings());
	public static final Item BURNING_BUDS = new Item(new FabricItemSettings());
	public static final Item CANTALOUPE_SLICE = new Item(new FabricItemSettings().food(HomegrownFoodComponents.CANTALOUPE_SLICE));
	public static final Item CANTALOUPE_SEEDS = new AliasedBlockItem(HomegrownBlocks.CANTALOUPE_STEM, new Item.Settings());

    public static void init(){
		// Post Items 
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "oak_planks_post"), OAK_PLANKS_POST);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "oak_log_post"), OAK_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_oak_log_post"), STRIPPED_OAK_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "oak_wood_post"), OAK_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_post"), STRIPPED_OAK_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "spruce_planks_post"), SPRUCE_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "spruce_log_post"), SPRUCE_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_spruce_log_post"), STRIPPED_SPRUCE_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "spruce_wood_post"), SPRUCE_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_spruce_wood_post"), STRIPPED_SPRUCE_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "birch_planks_post"), BIRCH_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "birch_log_post"), BIRCH_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_birch_log_post"), STRIPPED_BIRCH_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "birch_wood_post"), BIRCH_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_birch_wood_post"), STRIPPED_BIRCH_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "jungle_planks_post"), JUNGLE_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "jungle_log_post"), JUNGLE_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_jungle_log_post"), STRIPPED_JUNGLE_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "jungle_wood_post"), JUNGLE_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_jungle_wood_post"), STRIPPED_JUNGLE_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "acacia_planks_post"), ACACIA_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "acacia_log_post"), ACACIA_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_acacia_log_post"), STRIPPED_ACACIA_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "acacia_wood_post"), ACACIA_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_acacia_wood_post"), STRIPPED_ACACIA_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dark_oak_planks_post"), DARK_OAK_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dark_oak_log_post"), DARK_OAK_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_log_post"), STRIPPED_DARK_OAK_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "dark_oak_wood_post"), DARK_OAK_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_dark_oak_wood_post"), STRIPPED_DARK_OAK_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mangrove_planks_post"), MANGROVE_PLANKS_POST);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mangrove_log_post"), MANGROVE_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_mangrove_log_post"), STRIPPED_MANGROVE_LOG_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "mangrove_wood_post"), MANGROVE_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_mangrove_wood_post"), STRIPPED_MANGROVE_WOOD_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "crimson_planks_post"), CRIMSON_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "crimson_stem_post"), CRIMSON_STEM_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_crimson_stem_post"), STRIPPED_CRIMSON_STEM_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "crimson_hyphae_post"), CRIMSON_HYPHAE_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_crimson_hyphae_post"), STRIPPED_CRIMSON_HYPHAE_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "warped_planks_post"), WARPED_PLANKS_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "warped_stem_post"), WARPED_STEM_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_warped_stem_post"), STRIPPED_WARPED_STEM_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "warped_hyphae_post"), WARPED_HYPHAE_POST);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "stripped_warped_hyphae_post"), STRIPPED_WARPED_HYPHAE_POST);
		// Miscellaneous Items
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "burning_bale"), BURNING_BALE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cantaloupe_block"), CANTALOUPE_BLOCK);
		// Crop Items
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "red_tomato"), RED_TOMATO);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "green_tomato"), GREEN_TOMATO);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID,"tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID,"corn_kernels"), CORN_KERNELS);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "corn_ear"), CORN_EAR);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "brown_rice"), BROWN_RICE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "burning_bush_clippings"), BURNING_BUSH_CLIPPINGS);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "burning_buds"), BURNING_BUDS);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cantaloupe_slice"), CANTALOUPE_SLICE);
		Registry.register(Registries.ITEM, new Identifier(MOD_ID,"cantaloupe_seeds"), CANTALOUPE_SEEDS);
    }
}
