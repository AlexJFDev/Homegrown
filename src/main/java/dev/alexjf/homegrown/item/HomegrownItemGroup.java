package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HomegrownItemGroup {
    static String MOD_ID = "homegrown";
    
	public static final	ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "items"))
		.displayName(Text.literal("Homegrown: Items"))
		.icon(() -> new ItemStack(HomegrownItems.RED_TOMATO))
		.entries((context, entries) -> {
			entries.add(HomegrownItems.RED_TOMATO);
		})
		.build();

	public static final	ItemGroup BLOCK_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "blocks"))
		.displayName(Text.literal("Homegrown: Blocks"))
		.icon(() -> new ItemStack(HomegrownBlocks.OAK_LOG_POST))
		.entries((context, entries) -> {
			entries.add(HomegrownItems.RED_TOMATO);
		})
		.build();
    /*public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "blocks"),
		() -> new ItemStack(HomegrownBlocks.OAK_LOG_POST));
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "items"),
		() -> new ItemStack(HomegrownItems.RED_TOMATO));*/
}
