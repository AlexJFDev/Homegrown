package dev.alexjf.vanilla_improvements_agriculture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VanillaImprovementsAgriculture implements ModInitializer {
	static String modid = "vanilla_improvements_agriculture";
	
	public static final Logger LOGGER = LogManager.getLogger(modid);
	public static final PostBlock POST = new PostBlock(FabricBlockSettings.of(Material.WOOD).hardness(.5f));
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier(modid, "post"), POST);
		Registry.register(Registry.ITEM, new Identifier(modid, "post"), new BlockItem(POST, new FabricItemSettings().group(ItemGroup.MISC)));

		LOGGER.info("Hello Fabric world!");
	}
}
