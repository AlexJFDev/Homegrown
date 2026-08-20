package dev.alexjf.homegrown;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.StemBlock;
import net.minecraft.client.render.BlockRenderLayer;


public class HomegrownClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.putBlock(HomegrownBlocks.TOMATO, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(HomegrownBlocks.CORN, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(HomegrownBlocks.RICE, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(HomegrownBlocks.WILD_RICE, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(HomegrownBlocks.BURNING_BUSH, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(HomegrownBlocks.ATTACHED_CANTALOUPE_STEM, BlockRenderLayer.CUTOUT);
		BlockRenderLayerMap.putBlock(HomegrownBlocks.CANTALOUPE_STEM, BlockRenderLayer.CUTOUT);

		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
			int i = (Integer)state.get(StemBlock.AGE);
			int j = i * 32;
			int k = 255 - i * 8;
			int l = i * 4;
			return j << 16 | k << 8 | l;
		}, HomegrownBlocks.CANTALOUPE_STEM);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
			return 14731036;
		}, HomegrownBlocks.ATTACHED_CANTALOUPE_STEM);
	}
}
