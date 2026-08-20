package dev.alexjf.homegrown;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.minecraft.world.level.block.StemBlock;


public class HomegrownClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockColorRegistry.register((state, view, pos, colors) -> {
			int i = state.getValue(StemBlock.AGE);
			int j = i * 32;
			int k = 255 - i * 8;
			int l = i * 4;
			colors.add(0xFF000000 | j << 16 | k << 8 | l);
		}, HomegrownBlocks.CANTALOUPE_STEM);
		BlockColorRegistry.register((state, view, pos, colors) -> {
			colors.add(0xFF000000 | 14731036);
		}, HomegrownBlocks.ATTACHED_CANTALOUPE_STEM);
	}
}
