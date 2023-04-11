package dev.alexjf.homegrown;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import dev.alexjf.homegrown.item.HomegrownItemGroups;
import dev.alexjf.homegrown.item.HomegrownItems;
import dev.alexjf.homegrown.loot.condition.HomegrownLootConditionTypes;
import dev.alexjf.homegrown.world.gen.blockpredicate.HomegrownBlockPredicateType;
import dev.alexjf.homegrown.world.gen.feature.HomegrownFeatures;
import net.fabricmc.api.ModInitializer;

public class Homegrown implements ModInitializer {
	static final String MOD_ID = "homegrown";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("****Started Initializing Homegrown****");
		HomegrownLootConditionTypes.init();
		LOGGER.info("Finished Initializing Homegrown:Miscellaneous");
		HomegrownBlockPredicateType.init();
		HomegrownFeatures.init();
		LOGGER.info("Finished Initializing Homegrown:World Generation");
		HomegrownBlocks.init();
		LOGGER.info("Finished Initializing Homegrown:Blocks");
		HomegrownItems.init();
		HomegrownItemGroups.init();
		LOGGER.info("Finished Initializing Homegrown:Items");
		LOGGER.info("****Finished Initializing Homegrown****");
	}
	
	
}
