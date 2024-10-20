package net.planeta.planetaitemsmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.planeta.planetaitemsmod.block.ModBlocks;

public class PlanetaItemsClient implements ClientModInitializer{
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLONE_BLOCK, RenderLayer.getTranslucent());
    }
}
