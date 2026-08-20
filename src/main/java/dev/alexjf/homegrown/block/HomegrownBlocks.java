package dev.alexjf.homegrown.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AttachedStemBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HayBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.OffsetType;
import net.minecraft.world.level.material.MapColor;

public class HomegrownBlocks {
    static final String MOD_ID = "homegrown";
	// Post Blocks
    public static final Block OAK_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "oak_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block OAK_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "oak_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_OAK_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_oak_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block OAK_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "oak_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_OAK_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_oak_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block SPRUCE_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "spruce_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block SPRUCE_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "spruce_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_SPRUCE_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_spruce_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block SPRUCE_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "spruce_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_SPRUCE_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_spruce_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block BIRCH_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "birch_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block BIRCH_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "birch_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_BIRCH_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_birch_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block BIRCH_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "birch_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_BIRCH_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_birch_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block JUNGLE_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "jungle_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block JUNGLE_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "jungle_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_JUNGLE_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_jungle_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block JUNGLE_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "jungle_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_JUNGLE_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_jungle_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block ACACIA_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "acacia_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block ACACIA_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "acacia_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_ACACIA_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_acacia_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block ACACIA_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "acacia_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_ACACIA_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_acacia_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block DARK_OAK_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "dark_oak_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block DARK_OAK_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "dark_oak_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_DARK_OAK_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_dark_oak_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block DARK_OAK_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "dark_oak_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_DARK_OAK_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_dark_oak_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));

	public static final Block MANGROVE_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "mangrove_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block MANGROVE_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "mangrove_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_MANGROVE_LOG_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_mangrove_log_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block MANGROVE_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "mangrove_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_MANGROVE_WOOD_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_mangrove_wood_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));

	public static final Block CRIMSON_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "crimson_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block CRIMSON_STEM_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "crimson_stem_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_CRIMSON_STEM_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_crimson_stem_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block CRIMSON_HYPHAE_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "crimson_hyphae_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_CRIMSON_HYPHAE_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_crimson_hyphae_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block WARPED_PLANKS_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "warped_planks_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block WARPED_STEM_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "warped_stem_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_WARPED_STEM_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_warped_stem_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block WARPED_HYPHAE_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "warped_hyphae_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	public static final Block STRIPPED_WARPED_HYPHAE_POST = new PostBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "stripped_warped_hyphae_post"))).mapColor(MapColor.WOOD).destroyTime(2f).sound(SoundType.WOOD));
	// Crop Blocks
	public static final Block TOMATO = new TomatoBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "tomato"))).mapColor(MapColor.DIRT).noOcclusion().randomTicks().instabreak().sound(SoundType.CROP));
	public static final Block CORN = new CornBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "corn"))).mapColor(MapColor.GRASS).noOcclusion().noCollision().randomTicks().instabreak().sound(SoundType.CROP).offsetType(OffsetType.XZ));
	public static final Block RICE = new RiceBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "rice"))).mapColor(MapColor.GRASS).noOcclusion().noCollision().randomTicks().instabreak().sound(SoundType.CROP));
	public static final Block WILD_RICE = new WildRiceBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "wild_rice"))).mapColor(MapColor.GRASS).noOcclusion().noCollision().randomTicks().instabreak().sound(SoundType.CROP).offsetType(OffsetType.XZ));
	public static final Block BURNING_BUSH = new BurningBushBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "burning_bush"))).mapColor(MapColor.GRASS).noOcclusion().noCollision().randomTicks().instabreak().sound(SoundType.CROP).offsetType(OffsetType.XZ));
	public static final ResourceKey<Block> CANTALOUPE_BLOCK_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "cantaloupe_block"));
	public static final ResourceKey<Block> CANTALOUPE_STEM_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "cantaloupe_stem"));
	public static final ResourceKey<Block> ATTACHED_CANTALOUPE_STEM_KEY = ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "attached_cantaloupe_stem"));
	public static final ResourceKey<Item> CANTALOUPE_SEEDS_KEY = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, "cantaloupe_seeds"));

	public static final Block CANTALOUPE_BLOCK = new CantaloupeBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "cantaloupe_block"))).mapColor(MapColor.COLOR_LIGHT_GREEN).strength(1.0F).sound(SoundType.WOOD));
	public static final Block ATTACHED_CANTALOUPE_STEM = new AttachedStemBlock(CANTALOUPE_STEM_KEY, CANTALOUPE_BLOCK_KEY, CANTALOUPE_SEEDS_KEY, BlockTags.SUPPORTS_MELON_STEM, BlockBehaviour.Properties.of().setId(ATTACHED_CANTALOUPE_STEM_KEY).mapColor(MapColor.GRASS).noCollision().instabreak().sound(SoundType.WOOD));
	public static final Block CANTALOUPE_STEM = new StemBlock(CANTALOUPE_BLOCK_KEY, ATTACHED_CANTALOUPE_STEM_KEY, CANTALOUPE_SEEDS_KEY, BlockTags.SUPPORTS_MELON_STEM, BlockTags.SUPPORTS_MELON_STEM_FRUIT, BlockBehaviour.Properties.of().setId(CANTALOUPE_STEM_KEY).mapColor(MapColor.GRASS).noCollision().randomTicks().instabreak().sound(SoundType.HARD_CROP));
	// Miscellaneous Blocks
	public static final Block BURNING_BALE = new HayBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "burning_bale"))).mapColor(MapColor.COLOR_RED).strength(0.5f).sound(SoundType.GRASS));
	

    public static void init(){
		// Post Blocks
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"oak_planks_post"), OAK_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"oak_log_post"), OAK_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_oak_log_post"), STRIPPED_OAK_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"oak_wood_post"), OAK_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_oak_wood_post"), STRIPPED_OAK_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"spruce_planks_post"), SPRUCE_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"spruce_log_post"), SPRUCE_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_spruce_log_post"), STRIPPED_SPRUCE_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"spruce_wood_post"), SPRUCE_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_spruce_wood_post"), STRIPPED_SPRUCE_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"birch_planks_post"), BIRCH_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"birch_log_post"), BIRCH_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_birch_log_post"), STRIPPED_BIRCH_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"birch_wood_post"), BIRCH_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_birch_wood_post"), STRIPPED_BIRCH_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"jungle_planks_post"), JUNGLE_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"jungle_log_post"), JUNGLE_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_jungle_log_post"), STRIPPED_JUNGLE_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"jungle_wood_post"), JUNGLE_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_jungle_wood_post"), STRIPPED_JUNGLE_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"acacia_planks_post"), ACACIA_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"acacia_log_post"), ACACIA_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_acacia_log_post"), STRIPPED_ACACIA_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"acacia_wood_post"), ACACIA_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_acacia_wood_post"), STRIPPED_ACACIA_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"dark_oak_planks_post"), DARK_OAK_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"dark_oak_log_post"), DARK_OAK_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_dark_oak_log_post"), STRIPPED_DARK_OAK_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"dark_oak_wood_post"), DARK_OAK_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_dark_oak_wood_post"), STRIPPED_DARK_OAK_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"mangrove_planks_post"), MANGROVE_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"mangrove_log_post"), MANGROVE_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_mangrove_log_post"), STRIPPED_MANGROVE_LOG_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"mangrove_wood_post"), MANGROVE_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_mangrove_wood_post"), STRIPPED_MANGROVE_WOOD_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"crimson_planks_post"), CRIMSON_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"crimson_stem_post"), CRIMSON_STEM_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_crimson_stem_post"), STRIPPED_CRIMSON_STEM_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"crimson_hyphae_post"), CRIMSON_HYPHAE_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_crimson_hyphae_post"), STRIPPED_CRIMSON_HYPHAE_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"warped_planks_post"), WARPED_PLANKS_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"warped_stem_post"), WARPED_STEM_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_warped_stem_post"), STRIPPED_WARPED_STEM_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"warped_hyphae_post"), WARPED_HYPHAE_POST);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"stripped_warped_hyphae_post"), STRIPPED_WARPED_HYPHAE_POST);
		// Crop Blocks
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"tomato"), TOMATO);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"corn"), CORN);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"rice"), RICE);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"wild_rice"), WILD_RICE);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"burning_bush"), BURNING_BUSH);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"cantaloupe_block"), CANTALOUPE_BLOCK);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"attached_cantaloupe_stem"), ATTACHED_CANTALOUPE_STEM);
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID,"cantaloupe_stem"), CANTALOUPE_STEM);
		// Miscellaneous Blocks
		Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, "burning_bale"), BURNING_BALE);
    }
}
