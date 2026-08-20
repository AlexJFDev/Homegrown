package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class HomegrownItemGroups {
    static final String MOD_ID = "homegrown";

	public static final ResourceKey<CreativeModeTab> ITEM_GROUP_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "items"));
	public static final ResourceKey<CreativeModeTab> BLOCK_GROUP_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(MOD_ID, "blocks"));

	public static CreativeModeTab itemGroup;

	public static CreativeModeTab blockGroup;

	public static void init(){
		itemGroup = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ITEM_GROUP_KEY, FabricCreativeModeTab.builder()
			.title(Component.translatable("itemGroup.homegrown.items"))
			.icon(() -> new ItemStack(HomegrownItems.RED_TOMATO))
			.displayItems((context, entries) -> {
				entries.accept(HomegrownItems.RED_TOMATO);
				entries.accept(HomegrownItems.GREEN_TOMATO);
				entries.accept(HomegrownItems.TOMATO_SEEDS);
				entries.accept(HomegrownItems.CORN_EAR);
				entries.accept(HomegrownItems.CORN_KERNELS);
				entries.accept(HomegrownItems.BROWN_RICE);
				entries.accept(HomegrownItems.BURNING_BUSH_CLIPPINGS);
				entries.accept(HomegrownItems.BURNING_BALE);
				entries.accept(HomegrownItems.BURNING_BUDS);
				entries.accept(HomegrownItems.CANTALOUPE_SLICE);
				entries.accept(HomegrownItems.CANTALOUPE_BLOCK);
				entries.accept(HomegrownItems.CANTALOUPE_SEEDS);
			})
			.build());

		blockGroup = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, BLOCK_GROUP_KEY, FabricCreativeModeTab.builder()
			.title(Component.literal("Homegrown: Blocks"))
			.icon(() -> new ItemStack(HomegrownBlocks.OAK_LOG_POST))
			.displayItems((context, entries) -> {
				entries.accept(HomegrownItems.OAK_PLANKS_POST);
				entries.accept(HomegrownItems.OAK_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_OAK_LOG_POST);
				entries.accept(HomegrownItems.OAK_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_OAK_WOOD_POST);
				entries.accept(HomegrownItems.SPRUCE_PLANKS_POST);
				entries.accept(HomegrownItems.SPRUCE_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_SPRUCE_LOG_POST);
				entries.accept(HomegrownItems.SPRUCE_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_SPRUCE_WOOD_POST);
				entries.accept(HomegrownItems.BIRCH_PLANKS_POST);
				entries.accept(HomegrownItems.BIRCH_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_BIRCH_LOG_POST);
				entries.accept(HomegrownItems.BIRCH_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_BIRCH_WOOD_POST);
				entries.accept(HomegrownItems.JUNGLE_PLANKS_POST);
				entries.accept(HomegrownItems.JUNGLE_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_JUNGLE_LOG_POST);
				entries.accept(HomegrownItems.JUNGLE_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_JUNGLE_WOOD_POST);
				entries.accept(HomegrownItems.ACACIA_PLANKS_POST);
				entries.accept(HomegrownItems.ACACIA_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_ACACIA_LOG_POST);
				entries.accept(HomegrownItems.ACACIA_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_ACACIA_WOOD_POST);
				entries.accept(HomegrownItems.DARK_OAK_PLANKS_POST);
				entries.accept(HomegrownItems.DARK_OAK_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_DARK_OAK_LOG_POST);
				entries.accept(HomegrownItems.DARK_OAK_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_DARK_OAK_WOOD_POST);
				entries.accept(HomegrownItems.MANGROVE_PLANKS_POST);
				entries.accept(HomegrownItems.MANGROVE_LOG_POST);
				entries.accept(HomegrownItems.STRIPPED_MANGROVE_LOG_POST);
				entries.accept(HomegrownItems.MANGROVE_WOOD_POST);
				entries.accept(HomegrownItems.STRIPPED_MANGROVE_WOOD_POST);
				entries.accept(HomegrownItems.CRIMSON_PLANKS_POST);
				entries.accept(HomegrownItems.CRIMSON_STEM_POST);
				entries.accept(HomegrownItems.STRIPPED_CRIMSON_STEM_POST);
				entries.accept(HomegrownItems.CRIMSON_HYPHAE_POST);
				entries.accept(HomegrownItems.STRIPPED_CRIMSON_HYPHAE_POST);
				entries.accept(HomegrownItems.WARPED_PLANKS_POST);
				entries.accept(HomegrownItems.WARPED_STEM_POST);
				entries.accept(HomegrownItems.STRIPPED_WARPED_STEM_POST);
				entries.accept(HomegrownItems.WARPED_HYPHAE_POST);
				entries.accept(HomegrownItems.STRIPPED_WARPED_HYPHAE_POST);
			})
			.build());
	}
}
