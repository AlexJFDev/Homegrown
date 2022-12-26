package dev.alexjf.homegrown.item;

import net.minecraft.item.FoodComponent;

public class HomegrownFoodComponents {
    public static final FoodComponent GREEN_TOMATO = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent RED_TOMATO = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CANTALOUPE_SLICE = (new FoodComponent.Builder()).hunger(2).saturationModifier(0.3F).build();
    public static final FoodComponent CORN_EAR = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.4F).build();
    public static final FoodComponent CORN_KERNELS = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
    public static final FoodComponent BROWN_RICE = (new FoodComponent.Builder()).hunger(1).saturationModifier(0.1F).build();
    public static final FoodComponent BLUEBERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build();
}