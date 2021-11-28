package dev.alexjf.vanilla_improvements_agriculture.item;

import dev.alexjf.vanilla_improvements_agriculture.block.VanillaImprovementsAgricultureBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VanillaImprovementAgricultureItems {
    static String MOD_ID = "vanilla_improvements_agriculture";

    public static final Item BARLEY = new Item(new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP));
	public static final Item BARLEY_SEEDS = new AliasedBlockItem(VanillaImprovementsAgricultureBlocks.BARLEY_CROP, new Item.Settings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP));
	public static final Item ROTTEN_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP));
	public static final Item GREEN_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP).food(VanillaImprovementAgricultureFoodComponents.GREEN_TOMATO));
	public static final Item RED_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP).food(VanillaImprovementAgricultureFoodComponents.RED_TOMATO));
	public static final Item TOMATO_SEEDS = new PostCropSeeds(VanillaImprovementsAgricultureBlocks.TOMATO_CROP, new Item.Settings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP));
	public static final Item CANTALOUPE_SLICE = new Item(new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP).food(VanillaImprovementAgricultureFoodComponents.CANTALOUPE_SLICE));
	public static final Item CANTALOUPE_SEEDS = new AliasedBlockItem(VanillaImprovementsAgricultureBlocks.CANTALOUPE_STEM, new Item.Settings().group(VanillaImprovementsAgricultureItemGroup.ITEM_GROUP));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_log_post"), new BlockItem(VanillaImprovementsAgricultureBlocks.OAK_LOG_POST, new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_log_post"), new BlockItem(VanillaImprovementsAgricultureBlocks.STRIPPED_OAK_LOG_POST, new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_post"), new BlockItem(VanillaImprovementsAgricultureBlocks.OAK_WOOD_POST, new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_post"), new BlockItem(VanillaImprovementsAgricultureBlocks.STRIPPED_OAK_WOOD_POST, new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_planks_post"), new BlockItem(VanillaImprovementsAgricultureBlocks.OAK_PLANKS_POST, new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_block"), new BlockItem(VanillaImprovementsAgricultureBlocks.CANTALOUPE_BLOCK, new FabricItemSettings().group(VanillaImprovementsAgricultureItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "barley"), BARLEY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"barley_seeds"), BARLEY_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_tomato"), RED_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_tomato"), GREEN_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_slice"), CANTALOUPE_SLICE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cantaloupe_seeds"), CANTALOUPE_SEEDS);
    }
}
