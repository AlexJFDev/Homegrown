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

    public static final Item BARLEY = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP));
	public static final Item BARLEY_SEEDS = new AliasedBlockItem(HomegrownBlocks.BARLEY_CROP, new Item.Settings().group(HomegrownItemGroup.ITEM_GROUP));
	public static final Item ROTTEN_TOMATO = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP));
	public static final Item GREEN_TOMATO = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.GREEN_TOMATO));
	public static final Item RED_TOMATO = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.RED_TOMATO));
	public static final Item TOMATO_SEEDS = new PostCropSeeds(HomegrownBlocks.TOMATO_CROP, new Item.Settings().group(HomegrownItemGroup.ITEM_GROUP));
	public static final Item CANTALOUPE_SLICE = new Item(new FabricItemSettings().group(HomegrownItemGroup.ITEM_GROUP).food(HomegrownFoodComponents.CANTALOUPE_SLICE));
	public static final Item CANTALOUPE_SEEDS = new AliasedBlockItem(HomegrownBlocks.CANTALOUPE_STEM, new Item.Settings().group(HomegrownItemGroup.ITEM_GROUP));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_log_post"), new BlockItem(HomegrownBlocks.OAK_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_log_post"), new BlockItem(HomegrownBlocks.STRIPPED_OAK_LOG_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_post"), new BlockItem(HomegrownBlocks.OAK_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_post"), new BlockItem(HomegrownBlocks.STRIPPED_OAK_WOOD_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_planks_post"), new BlockItem(HomegrownBlocks.OAK_PLANKS_POST, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_block"), new BlockItem(HomegrownBlocks.CANTALOUPE_BLOCK, new FabricItemSettings().group(HomegrownItemGroup.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "barley"), BARLEY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"barley_seeds"), BARLEY_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_tomato"), RED_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_tomato"), GREEN_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_slice"), CANTALOUPE_SLICE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cantaloupe_seeds"), CANTALOUPE_SEEDS);
    }
}
