package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.util.StringIdentifiable;

public enum PostType implements StringIdentifiable {
	OAK_LOG_POST("oak_log_post"),
    OAK_PLANK_POST("oak_plank_post"),
    STRIPPED_OAK_LOG_POST("stripped_oak_log_post"),
    DARK_OAK_LOG_POST("dark_oak_log_post"),
    DARK_OAK_PLANK_POST("dark_oak_plank_post"),
    STRIPPED_DARK_OAK_LOG_POST("stripped_dark_oak_log_post");
    

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
