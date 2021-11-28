package dev.alexjf.vanilla_improvements_agriculture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.alexjf.vanilla_improvements_agriculture.block.VanillaImprovementsAgricultureBlocks;
import dev.alexjf.vanilla_improvements_agriculture.item.VanillaImprovementAgricultureItems;
import net.fabricmc.api.ModInitializer;

public class VanillaImprovementsAgriculture implements ModInitializer {
	static String MOD_ID = "vanilla_improvements_agriculture";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("****Started Initializing Vanilla Improvements Agriculture****");
		VanillaImprovementsAgricultureBlocks.init();
		LOGGER.info("Finished Initializing Vanilla Improvements Agriculture:Blocks");
		VanillaImprovementAgricultureItems.init();
		LOGGER.info("Finished Initializing Vanilla Improvements Agriculture:Items");
		LOGGER.info("****Finished Initializing Vanilla Improvements Agriculture****");
	}
}
