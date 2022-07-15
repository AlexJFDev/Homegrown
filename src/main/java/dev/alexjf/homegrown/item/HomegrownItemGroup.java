package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class HomegrownItemGroup {
    static String MOD_ID = "homegrown";
    
    public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "blocks"),
		() -> new ItemStack(HomegrownBlocks.OAK_LOG_POST));
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "items"),
		() -> new ItemStack(HomegrownItems.RED_TOMATO));
}
