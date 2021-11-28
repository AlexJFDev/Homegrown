package dev.alexjf.vanilla_improvements_agriculture.item;

import dev.alexjf.vanilla_improvements_agriculture.block.BlockRegistry;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VanillaImprovementsAgricultureItemGroup {
    static String MOD_ID = "vanilla_improvements_agriculture";
    
    public static final ItemGroup BLOCK_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "blocks"),
		() -> new ItemStack(BlockRegistry.OAK_LOG_POST));
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier(MOD_ID, "items"),
		() -> new ItemStack(ItemRegistry.BARLEY));
}
