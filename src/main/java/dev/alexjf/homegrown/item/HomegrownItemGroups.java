package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class HomegrownItemGroups {
    static final String MOD_ID = "homegrown";
    
	public static ItemGroup itemGroup;

	public static ItemGroup blockGroup;

	public static void init(){
		itemGroup = FabricItemGroup.builder(new Identifier(MOD_ID, "items"))
			.icon(() -> new ItemStack(HomegrownItems.RED_TOMATO))
			.entries((context, entries) -> {
				entries.add(HomegrownItems.RED_TOMATO);
				entries.add(HomegrownItems.GREEN_TOMATO);
			})
			.build();

		blockGroup = FabricItemGroup.builder(new Identifier(MOD_ID, "blocks"))
			.displayName(Text.literal("Homegrown: Blocks"))
			.icon(() -> new ItemStack(HomegrownBlocks.OAK_LOG_POST))
			.entries((context, entries) -> {
				entries.add(HomegrownItems.OAK_PLANKS_POST);
			})
			.build();
	}
}
