package dev.alexjf.vanilla_improvements_agriculture;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;


public class VanillaImprovementsAgricultureClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(VanillaImprovementsAgriculture.BARLEY, RenderLayer.getCutout());
	}
}
