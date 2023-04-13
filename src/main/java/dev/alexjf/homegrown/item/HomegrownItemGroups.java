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
				entries.add(HomegrownItems.TOMATO_SEEDS);
				entries.add(HomegrownItems.CORN_EAR);
				entries.add(HomegrownItems.CORN_KERNELS);
				entries.add(HomegrownItems.BROWN_RICE);
				entries.add(HomegrownItems.BURNING_BUSH_CLIPPINGS);
				entries.add(HomegrownItems.BURNING_BALE);
				entries.add(HomegrownItems.BURNING_BUDS);
				entries.add(HomegrownItems.CANTALOUPE_SLICE);
				entries.add(HomegrownItems.CANTALOUPE_BLOCK);
				entries.add(HomegrownItems.CANTALOUPE_SEEDS);
				entries.add(HomegrownItems.BLUEBERRIES);
			})
			.build();

		blockGroup = FabricItemGroup.builder(new Identifier(MOD_ID, "blocks"))
			.icon(() -> new ItemStack(HomegrownBlocks.OAK_LOG_POST))
			.entries((context, entries) -> {
				entries.add(HomegrownItems.OAK_PLANKS_POST);
				entries.add(HomegrownItems.OAK_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_OAK_LOG_POST);
				entries.add(HomegrownItems.OAK_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_OAK_WOOD_POST);
				entries.add(HomegrownItems.SPRUCE_PLANKS_POST);
				entries.add(HomegrownItems.SPRUCE_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_SPRUCE_LOG_POST);
				entries.add(HomegrownItems.SPRUCE_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_SPRUCE_WOOD_POST);
				entries.add(HomegrownItems.BIRCH_PLANKS_POST);
				entries.add(HomegrownItems.BIRCH_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_BIRCH_LOG_POST);
				entries.add(HomegrownItems.BIRCH_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_BIRCH_WOOD_POST);
				entries.add(HomegrownItems.JUNGLE_PLANKS_POST);
				entries.add(HomegrownItems.JUNGLE_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_JUNGLE_LOG_POST);
				entries.add(HomegrownItems.JUNGLE_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_JUNGLE_WOOD_POST);
				entries.add(HomegrownItems.ACACIA_PLANKS_POST);
				entries.add(HomegrownItems.ACACIA_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_ACACIA_LOG_POST);
				entries.add(HomegrownItems.ACACIA_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_ACACIA_WOOD_POST);
				entries.add(HomegrownItems.DARK_OAK_PLANKS_POST);
				entries.add(HomegrownItems.DARK_OAK_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_DARK_OAK_LOG_POST);
				entries.add(HomegrownItems.DARK_OAK_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_DARK_OAK_WOOD_POST);
				entries.add(HomegrownItems.MANGROVE_PLANKS_POST);
				entries.add(HomegrownItems.MANGROVE_LOG_POST);
				entries.add(HomegrownItems.STRIPPED_MANGROVE_LOG_POST);
				entries.add(HomegrownItems.MANGROVE_WOOD_POST);
				entries.add(HomegrownItems.STRIPPED_MANGROVE_WOOD_POST);
				entries.add(HomegrownItems.CRIMSON_PLANKS_POST);
				entries.add(HomegrownItems.CRIMSON_STEM_POST);
				entries.add(HomegrownItems.STRIPPED_CRIMSON_STEM_POST);
				entries.add(HomegrownItems.CRIMSON_HYPHAE_POST);
				entries.add(HomegrownItems.STRIPPED_CRIMSON_HYPHAE_POST);
				entries.add(HomegrownItems.WARPED_PLANKS_POST);
				entries.add(HomegrownItems.WARPED_STEM_POST);
				entries.add(HomegrownItems.STRIPPED_WARPED_STEM_POST);
				entries.add(HomegrownItems.WARPED_HYPHAE_POST);
				entries.add(HomegrownItems.STRIPPED_WARPED_HYPHAE_POST);
			})
			.build();
	}
}
