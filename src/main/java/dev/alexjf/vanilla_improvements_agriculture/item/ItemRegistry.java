package dev.alexjf.vanilla_improvements_agriculture.item;

import dev.alexjf.vanilla_improvements_agriculture.PostCropSeeds;
import dev.alexjf.vanilla_improvements_agriculture.VanillaImprovementsAgriculture;
import dev.alexjf.vanilla_improvements_agriculture.block.BlockRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {
    static String MOD_ID = "vanilla_improvements_agriculture";

    public static final Item BARLEY = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item BARLEY_SEEDS = new AliasedBlockItem(VanillaImprovementsAgriculture.BARLEY_CROP, new Item.Settings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item ROTTEN_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item GREEN_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP).food(FoodComponents.GREEN_TOMATO));
	public static final Item RED_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP).food(FoodComponents.RED_TOMATO));
	public static final Item TOMATO_SEEDS = new PostCropSeeds(VanillaImprovementsAgriculture.TOMATO_CROP, new Item.Settings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item CANTALOUPE_SLICE = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP).food(FoodComponents.CANTALOUPE_SLICE));
	public static final Item CANTALOUPE_SEEDS = new AliasedBlockItem(VanillaImprovementsAgriculture.CANTALOUPE_STEM, new Item.Settings().group(VanillaImprovementsAgriculture.ITEM_GROUP));

    public static void init(){
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_log_post"), new BlockItem(BlockRegistry.OAK_LOG_POST, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_log_post"), new BlockItem(BlockRegistry.STRIPPED_OAK_LOG_POST, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_wood_post"), new BlockItem(BlockRegistry.OAK_WOOD_POST, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stripped_oak_wood_post"), new BlockItem(BlockRegistry.STRIPPED_OAK_WOOD_POST, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oak_planks_post"), new BlockItem(BlockRegistry.OAK_PLANKS_POST, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_block"), new BlockItem(BlockRegistry.CANTALOUPE_BLOCK, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "barley"), BARLEY);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"barley_seeds"), BARLEY_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_tomato"), RED_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_tomato"), GREEN_TOMATO);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cantaloupe_slice"), CANTALOUPE_SLICE);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID,"cantaloupe_seeds"), CANTALOUPE_SEEDS);
    }
}
