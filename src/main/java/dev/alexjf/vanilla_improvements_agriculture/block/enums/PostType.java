package dev.alexjf.vanilla_improvements_agriculture.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum PostType implements StringIdentifiable{
    OAK_LOG_POST("oak_log_post"),
	OAK_PLANKS_POST("oak_planks_post"),
	OAK_WOOD_POST("oak_wood_post"),
	STRIPPED_OAK_LOG_POST("stripped_oak_log_post"),
    STRIPPED_OAK_WOOD_POST("stripped_oak_wood_post");
    

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
}
