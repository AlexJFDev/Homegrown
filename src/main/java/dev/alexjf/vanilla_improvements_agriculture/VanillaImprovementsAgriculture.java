package dev.alexjf.vanilla_improvements_agriculture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VanillaImprovementsAgriculture implements ModInitializer {
	//variables
	static String modid = "vanilla_improvements_agriculture";
	//Blockstate Types
	public static final EnumProperty<PostType> POST_TYPE = EnumProperty.of("type", PostType.class);
	//item groups
	public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.build(
		new Identifier(modid, "blocks"),
		() -> new ItemStack(VanillaImprovementsAgriculture.OAK_LOG_POST));
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(modid, "items"),
		() -> new ItemStack(VanillaImprovementsAgriculture.BARLEY));

	//blocks
	public static final Block OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block BARLEY_CROP = new Crop(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final PostCropBlock TOMATO_CROP = new PostCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Block CANTALOUPE_BLOCK = new CantaloupeBlock(AbstractBlock.Settings.of(Material.GOURD, MapColor.LIME).strength(1.0F).sounds(BlockSoundGroup.WOOD));
	public static final Block ATTACHED_CANTALOUPE_STEM = new AttachedCantaloupeStem((GourdBlock)CANTALOUPE_BLOCK, () -> {
		return VanillaImprovementsAgriculture.CANTALOUPE_SEEDS;
	}, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD));
	public static final Block CANTALOUPE_STEM = new CantaloupeStem((GourdBlock)CANTALOUPE_BLOCK, () -> {
		return VanillaImprovementsAgriculture.CANTALOUPE_SEEDS;
	}, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.STEM));

	//items
	public static final Item BARLEY = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item BARLEY_SEEDS = new AliasedBlockItem(VanillaImprovementsAgriculture.BARLEY_CROP, new Item.Settings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item ROTTEN_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item GREEN_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item RED_TOMATO = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item TOMATO_SEEDS = new PostCropSeeds(VanillaImprovementsAgriculture.TOMATO_CROP, new Item.Settings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item CANTALOUPE_SLICE = new Item(new FabricItemSettings().group(VanillaImprovementsAgriculture.ITEM_GROUP));
	public static final Item CANTALOUPE_SEEDS = new AliasedBlockItem(VanillaImprovementsAgriculture.CANTALOUPE_STEM, new Item.Settings().group(VanillaImprovementsAgriculture.ITEM_GROUP).food(FoodComponents.MELON_SLICE));
	
	//other stuff
	public static final Logger LOGGER = LogManager.getLogger(modid);
	@Override
	public void onInitialize() {
		//register blocks
		Registry.register(Registry.BLOCK, new Identifier(modid,"oak_log_post"), OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(modid,"barley"), BARLEY_CROP);
		Registry.register(Registry.BLOCK, new Identifier(modid,"tomato"), TOMATO_CROP);
		Registry.register(Registry.BLOCK, new Identifier(modid,"cantaloupe_block"), CANTALOUPE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(modid,"attached_cantaloupe_stem"), ATTACHED_CANTALOUPE_STEM);
		Registry.register(Registry.BLOCK, new Identifier(modid,"cantaloupe_stem"), CANTALOUPE_STEM);
		LOGGER.info("Finished block registry");
		
		//register block items
		Registry.register(Registry.ITEM, new Identifier(modid, "oak_log_post"), new BlockItem(OAK_LOG_POST, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		Registry.register(Registry.ITEM, new Identifier(modid, "cantaloupe_block"), new BlockItem(CANTALOUPE_BLOCK, new FabricItemSettings().group(VanillaImprovementsAgriculture.BLOCK_GROUP)));
		LOGGER.info("Finished block item registry");
		
		//register items
		Registry.register(Registry.ITEM, new Identifier(modid, "barley"), BARLEY);
		Registry.register(Registry.ITEM, new Identifier(modid,"barley_seeds"), BARLEY_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(modid,"tomato_seeds"), TOMATO_SEEDS);
		Registry.register(Registry.ITEM, new Identifier(modid, "cantaloupe_slice"), CANTALOUPE_SLICE);
		Registry.register(Registry.ITEM, new Identifier(modid,"cantaloupe_seeds"), CANTALOUPE_SEEDS);
		LOGGER.info("Finished item registry");
		
		//other stuff
		LOGGER.info("Finished Initializing Vanilla Improvements Agriculture");
	}
}
