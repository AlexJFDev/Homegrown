package dev.alexjf.homegrown.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum PostType implements StringIdentifiable{
    OAK_LOG_POST("oak_log_post"),
	OAK_PLANKS_POST("oak_planks_post"),
	OAK_WOOD_POST("oak_wood_post"),
	STRIPPED_OAK_LOG_POST("stripped_oak_log_post"),
    STRIPPED_OAK_WOOD_POST("stripped_oak_wood_post"),
	DARK_OAK_LOG_POST("dark_oak_log_post"),
	DARK_OAK_PLANKS_POST("dark_oak_planks_post"),
	DARK_OAK_WOOD_POST("dark_oak_wood_post"),
	STRIPPED_DARK_OAK_LOG_POST("stripped_dark_oak_log_post"),
    STRIPPED_DARK_OAK_WOOD_POST("stripped_dark_oak_wood_post"),
	BIRCH_LOG_POST("birch_log_post"),
	BIRCH_PLANKS_POST("birch_planks_post"),
	BIRCH_WOOD_POST("birch_wood_post"),
	STRIPPED_BIRCH_LOG_POST("stripped_birch_log_post"),
    STRIPPED_BIRCH_WOOD_POST("stripped_birch_wood_post"),
	SPRUCE_LOG_POST("spruce_log_post"),
	SPRUCE_PLANKS_POST("spruce_planks_post"),
	SPRUCE_WOOD_POST("spruce_wood_post"),
	STRIPPED_SPRUCE_LOG_POST("stripped_spruce_log_post"),
    STRIPPED_SPRUCE_WOOD_POST("stripped_spruce_wood_post"),
	JUNGLE_LOG_POST("jungle_log_post"),
	JUNGLE_PLANKS_POST("jungle_planks_post"),
	JUNGLE_WOOD_POST("jungle_wood_post"),
	STRIPPED_JUNGLE_LOG_POST("stripped_jungle_log_post"),
    STRIPPED_JUNGLE_WOOD_POST("stripped_jungle_wood_post"),
	ACACIA_LOG_POST("acacia_log_post"),
	ACACIA_PLANKS_POST("acacia_planks_post"),
	ACACIA_WOOD_POST("acacia_wood_post"),
	STRIPPED_ACACIA_LOG_POST("stripped_acacia_log_post"),
    STRIPPED_ACACIA_WOOD_POST("stripped_acacia_wood_post"),
	
	MANGROVE_LOG_POST("mangrove_log_post"),
	MANGROVE_PLANKS_POST("mangrove_planks_post"),
	MANGROVE_WOOD_POST("mangrove_wood_post"),
	STRIPPED_MANGROVE_LOG_POST("stripped_mangrove_log_post"),
    STRIPPED_MANGROVE_WOOD_POST("stripped_mangrove_wood_post"),
	
	WARPED_STEM_POST("warped_stem_post"),
	WARPED_PLANKS_POST("warped_planks_post"),
	WARPED_HYPHAE_POST("warped_hyphae_post"),
	STRIPPED_WARPED_STEM_POST("stripped_warped_stem_post"),
    STRIPPED_WARPED_HYPHAE_POST("stripped_warped_hyphae_post"),
	CRIMSON_STEM_POST("crimson_stem_post"),
	CRIMSON_PLANKS_POST("crimson_planks_post"),
	CRIMSON_HYPHAE_POST("crimson_hyphae_post"),
	STRIPPED_CRIMSON_STEM_POST("stripped_crimson_stem_post"),
    STRIPPED_CRIMSON_HYPHAE_POST("stripped_crimson_hyphae_post");
    

	private final String name;

	private PostType(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	public String asString() {
		return this.name;
	}

	public static PostType getPostType(String postIdentifier){
		switch(postIdentifier){
			case "homegrown:oak_planks_post":
				return OAK_PLANKS_POST;
			case "homegrown:oak_log_post":
				return OAK_LOG_POST;
			case "homegrown:stripped_oak_log_post":
				return STRIPPED_OAK_LOG_POST;
			case "homegrown:oak_wood_post":
				return OAK_WOOD_POST;
			case "homegrown:stripped_oak_wood_post":
				return STRIPPED_OAK_WOOD_POST;
			case "homegrown:spruce_planks_post":
				return SPRUCE_PLANKS_POST;
			case "homegrown:spruce_log_post":
				return SPRUCE_LOG_POST;
			case "homegrown:stripped_spruce_log_post":
				return STRIPPED_SPRUCE_LOG_POST;
			case "homegrown:spruce_wood_post":
				return SPRUCE_WOOD_POST;
			case "homegrown:stripped_spruce_wood_post":
				return STRIPPED_SPRUCE_WOOD_POST;
			case "homegrown:birch_planks_post":
				return BIRCH_PLANKS_POST;
			case "homegrown:birch_log_post":
				return BIRCH_LOG_POST;
			case "homegrown:stripped_birch_log_post":
				return STRIPPED_BIRCH_LOG_POST;
			case "homegrown:birch_wood_post":
				return BIRCH_WOOD_POST;
			case "homegrown:stripped_birch_wood_post":
				return STRIPPED_BIRCH_WOOD_POST;
			case "homegrown:jungle_planks_post":
				return JUNGLE_PLANKS_POST;
			case "homegrown:jungle_log_post":
				return JUNGLE_LOG_POST;
			case "homegrown:stripped_jungle_log_post":
				return STRIPPED_JUNGLE_LOG_POST;
			case "homegrown:jungle_wood_post":
				return JUNGLE_WOOD_POST;
			case "homegrown:stripped_jungle_wood_post":
				return STRIPPED_JUNGLE_WOOD_POST;
			case "homegrown:acacia_planks_post":
				return ACACIA_PLANKS_POST;
			case "homegrown:acacia_log_post":
				return ACACIA_LOG_POST;
			case "homegrown:stripped_acacia_log_post":
				return STRIPPED_ACACIA_LOG_POST;
			case "homegrown:acacia_wood_post":
				return ACACIA_WOOD_POST;
			case "homegrown:stripped_acacia_wood_post":
				return STRIPPED_ACACIA_WOOD_POST;
			case "homegrown:dark_oak_planks_post":
				return DARK_OAK_PLANKS_POST;
			case "homegrown:dark_oak_log_post":
				return DARK_OAK_LOG_POST;
			case "homegrown:stripped_dark_oak_log_post":
				return STRIPPED_DARK_OAK_LOG_POST;
			case "homegrown:dark_oak_wood_post":
				return DARK_OAK_WOOD_POST;
			case "homegrown:stripped_dark_oak_wood_post":
				return STRIPPED_DARK_OAK_WOOD_POST;
			case "homegrown:mangrove_planks_post":
				return MANGROVE_PLANKS_POST;
			case "homegrown:mangrove_log_post":
				return MANGROVE_LOG_POST;
			case "homegrown:stripped_mangrove_log_post":
				return STRIPPED_MANGROVE_LOG_POST;
			case "homegrown:mangrove_wood_post":
				return MANGROVE_WOOD_POST;
			case "homegrown:stripped_mangrove_wood_post":
				return STRIPPED_MANGROVE_WOOD_POST;

			case "homegrown:crimson_planks_post":
				return CRIMSON_PLANKS_POST;
			case "homegrown:crimson_stem_post":
				return CRIMSON_STEM_POST;
			case "homegrown:stripped_crimson_stem_post":
				return STRIPPED_CRIMSON_STEM_POST;
			case "homegrown:crimson_hyphae_post":
				return CRIMSON_HYPHAE_POST;
			case "homegrown:stripped_crimson_hyphae_post":
				return STRIPPED_CRIMSON_HYPHAE_POST;
			case "homegrown:warped_planks_post":
				return WARPED_PLANKS_POST;
			case "homegrown:warped_stem_post":
				return WARPED_STEM_POST;
			case "homegrown:stripped_warped_stem_post":
				return STRIPPED_WARPED_STEM_POST;
			case "homegrown:warped_hyphae_post":
				return WARPED_HYPHAE_POST;
			case "homegrown:stripped_warped_hyphae_post":
				return STRIPPED_WARPED_HYPHAE_POST;
			default:
				return OAK_LOG_POST;
		}
	}
}
