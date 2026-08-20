package dev.alexjf.homegrown.item;

import net.minecraft.component.type.FoodComponent;

public class HomegrownFoodComponents {
    public static final FoodComponent GREEN_TOMATO = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent RED_TOMATO = (new FoodComponent.Builder()).nutrition(4).saturationModifier(0.3F).build();
    public static final FoodComponent CANTALOUPE_SLICE = (new FoodComponent.Builder()).nutrition(2).saturationModifier(0.3F).build();
    public static final FoodComponent CORN_EAR = (new FoodComponent.Builder()).nutrition(6).saturationModifier(0.4F).build();
    public static final FoodComponent CORN_KERNELS = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.1F).build();
    public static final FoodComponent BROWN_RICE = (new FoodComponent.Builder()).nutrition(1).saturationModifier(0.1F).build();
}
