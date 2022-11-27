package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.item.HomegrownItems;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.HayBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.StemBlock;
import net.minecraft.block.AbstractBlock.OffsetType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HomegrownBlocks {
    static String MOD_ID = "homegrown";
	// Post Blocks
    public static final Block OAK_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block OAK_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_OAK_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block SPRUCE_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block SPRUCE_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_SPRUCE_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block SPRUCE_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_SPRUCE_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block BIRCH_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block BIRCH_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_BIRCH_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block BIRCH_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_BIRCH_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block JUNGLE_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block JUNGLE_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_JUNGLE_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block JUNGLE_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_JUNGLE_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block ACACIA_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block ACACIA_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_ACACIA_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block ACACIA_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_ACACIA_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block DARK_OAK_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block DARK_OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_DARK_OAK_LOG_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block DARK_OAK_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_DARK_OAK_WOOD_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block CRIMSON_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block CRIMSON_STEM_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_CRIMSON_STEM_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block CRIMSON_HYPHAE_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_CRIMSON_HYPHAE_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block WARPED_PLANKS_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block WARPED_STEM_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_WARPED_STEM_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block WARPED_HYPHAE_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	public static final Block STRIPPED_WARPED_HYPHAE_POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(2f).sounds(BlockSoundGroup.WOOD));
	// Crop Blocks
	public static final Block TOMATO = new TomatoBlock(AbstractBlock.Settings.of(Material.SOLID_ORGANIC).nonOpaque().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Block CORN = new CornBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).offsetType(OffsetType.XZ));
	public static final Block RICE = new RiceBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));
	public static final Block WILD_RICE = new WildRiceBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).offsetType(OffsetType.XZ));
	public static final Block BURNING_BUSH = new BurningBushBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).offsetType(OffsetType.XZ));
	public static final Block CANTALOUPE_BLOCK = new CantaloupeBlock(AbstractBlock.Settings.of(Material.GOURD, MapColor.LIME).strength(1.0F).sounds(BlockSoundGroup.WOOD));
    public static final Block ATTACHED_CANTALOUPE_STEM = new AttachedStemBlock((GourdBlock)CANTALOUPE_BLOCK, () -> {
		return HomegrownItems.CANTALOUPE_SEEDS;
	}, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.WOOD));
	public static final Block CANTALOUPE_STEM = new StemBlock((GourdBlock)CANTALOUPE_BLOCK, () -> {
		return HomegrownItems.CANTALOUPE_SEEDS;
	}, AbstractBlock.Settings.of(Material.PLANT).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.STEM));
	// Miscellaneous Blocks
	public static final Block BURNING_BALE = new HayBlock(AbstractBlock.Settings.of(Material.SOLID_ORGANIC, MapColor.RED).strength(0.5f).sounds(BlockSoundGroup.GRASS));
	

    public static void init(){
		// Post Blocks
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"oak_planks_post"), OAK_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"oak_log_post"), OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_oak_log_post"), STRIPPED_OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"oak_wood_post"), OAK_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_oak_wood_post"), STRIPPED_OAK_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"spruce_planks_post"), SPRUCE_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"spruce_log_post"), SPRUCE_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_spruce_log_post"), STRIPPED_SPRUCE_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"spruce_wood_post"), SPRUCE_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_spruce_wood_post"), STRIPPED_SPRUCE_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"birch_planks_post"), BIRCH_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"birch_log_post"), BIRCH_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_birch_log_post"), STRIPPED_BIRCH_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"birch_wood_post"), BIRCH_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_birch_wood_post"), STRIPPED_BIRCH_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"jungle_planks_post"), JUNGLE_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"jungle_log_post"), JUNGLE_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_jungle_log_post"), STRIPPED_JUNGLE_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"jungle_wood_post"), JUNGLE_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_jungle_wood_post"), STRIPPED_JUNGLE_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"acacia_planks_post"), ACACIA_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"acacia_log_post"), ACACIA_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_acacia_log_post"), STRIPPED_ACACIA_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"acacia_wood_post"), ACACIA_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_acacia_wood_post"), STRIPPED_ACACIA_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dark_oak_planks_post"), DARK_OAK_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dark_oak_log_post"), DARK_OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_dark_oak_log_post"), STRIPPED_DARK_OAK_LOG_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"dark_oak_wood_post"), DARK_OAK_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_dark_oak_wood_post"), STRIPPED_DARK_OAK_WOOD_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"crimson_planks_post"), CRIMSON_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"crimson_stem_post"), CRIMSON_STEM_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_crimson_stem_post"), STRIPPED_CRIMSON_STEM_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"crimson_hyphae_post"), CRIMSON_HYPHAE_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_crimson_hyphae_post"), STRIPPED_CRIMSON_HYPHAE_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"warped_planks_post"), WARPED_PLANKS_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"warped_stem_post"), WARPED_STEM_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_warped_stem_post"), STRIPPED_WARPED_STEM_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"warped_hyphae_post"), WARPED_HYPHAE_POST);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"stripped_warped_hyphae_post"), STRIPPED_WARPED_HYPHAE_POST);
		// Crop Blocks
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"tomato"), TOMATO);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"corn"), CORN);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"rice"), RICE);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"wild_rice"), WILD_RICE);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"burning_bush"), BURNING_BUSH);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cantaloupe_block"), CANTALOUPE_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"attached_cantaloupe_stem"), ATTACHED_CANTALOUPE_STEM);
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"cantaloupe_stem"), CANTALOUPE_STEM);
		// Miscellaneous Blocks
		Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "burning_bale"), BURNING_BALE);
    }
}
