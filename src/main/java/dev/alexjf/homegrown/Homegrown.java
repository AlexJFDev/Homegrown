package dev.alexjf.homegrown;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import dev.alexjf.homegrown.feature.HomegrownFeatures;
import dev.alexjf.homegrown.item.HomegrownItems;
import net.fabricmc.api.ModInitializer;

public class Homegrown implements ModInitializer {
	static String MOD_ID = "homegrown";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("****Started Initializing Homegrown****");
		/*BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","savanna")),
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","savanna_plateau")),
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","windswept_savanna"))), 
			Feature.VEGETAL_DECORATION, 
			RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID,"patch_cantaloupe")));
		BiomeModifications.addFeature(
			BiomeSelectors.includeByKey(
				RegistryKey.of(Registry.BIOME_KEY, new Identifier("minecraft","river"))), 
			Feature.VEGETAL_DECORATION, 
			RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(MOD_ID,"patch_cantaloupe_river")));*/
		HomegrownFeatures.init();
		LOGGER.info("Finished Initializing Homegrown:Miscellaneous");
		HomegrownBlocks.init();
		LOGGER.info("Finished Initializing Homegrown:Blocks");
		HomegrownItems.init();
		LOGGER.info("Finished Initializing Homegrown:Items");
		LOGGER.info("****Finished Initializing Homegrown****");
	}
	
	
}
