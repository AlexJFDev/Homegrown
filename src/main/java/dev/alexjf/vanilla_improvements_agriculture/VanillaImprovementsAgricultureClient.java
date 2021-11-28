package dev.alexjf.vanilla_improvements_agriculture;

import dev.alexjf.vanilla_improvements_agriculture.block.BlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.StemBlock;
import net.minecraft.client.render.RenderLayer;


public class VanillaImprovementsAgricultureClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BARLEY_CROP, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ATTACHED_CANTALOUPE_STEM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CANTALOUPE_STEM, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.TOMATO_CROP, RenderLayer.getCutout());

		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
			int i = (Integer)state.get(StemBlock.AGE);
			int j = i * 32;
			int k = 255 - i * 8;
			int l = i * 4;
			return j << 16 | k << 8 | l;
		}, BlockRegistry.CANTALOUPE_STEM);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> {
			return 14731036;
		}, BlockRegistry.ATTACHED_CANTALOUPE_STEM);
		
	}
}
