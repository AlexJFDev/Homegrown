package dev.alexjf.homegrown;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.StemBlock;
import net.minecraft.client.render.RenderLayer;


public class HomegrownClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(HomegrownBlocks.TOMATO, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(HomegrownBlocks.CORN, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(HomegrownBlocks.RICE, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(HomegrownBlocks.BURNING_BUSH, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(HomegrownBlocks.ATTACHED_CANTALOUPE_STEM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(HomegrownBlocks.CANTALOUPE_STEM, RenderLayer.getCutout());

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
