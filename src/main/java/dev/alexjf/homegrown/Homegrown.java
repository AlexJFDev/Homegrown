package dev.alexjf.homegrown;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import dev.alexjf.homegrown.item.HomegrownItems;
import net.fabricmc.api.ModInitializer;

public class Homegrown implements ModInitializer {
	static String MOD_ID = "homegrown";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("****Started Initializing Homegrown****");
		HomegrownBlocks.init();
		LOGGER.info("Finished Initializing Homegrown:Blocks");
		HomegrownItems.init();
		LOGGER.info("Finished Initializing Homegrown:Items");
		LOGGER.info("****Finished Initializing Homegrown****");
	}
}
