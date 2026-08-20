package dev.alexjf.homegrown.item;

import net.minecraft.world.food.FoodProperties;

public class HomegrownFoodComponents {
    public static final FoodProperties GREEN_TOMATO = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties RED_TOMATO = (new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3F).build();
    public static final FoodProperties CANTALOUPE_SLICE = (new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties CORN_EAR = (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.4F).build();
    public static final FoodProperties CORN_KERNELS = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1F).build();
    public static final FoodProperties BROWN_RICE = (new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1F).build();
}
