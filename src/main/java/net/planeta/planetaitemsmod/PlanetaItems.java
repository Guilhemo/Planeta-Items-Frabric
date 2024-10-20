package net.planeta.planetaitemsmod;

import net.fabricmc.api.ModInitializer;

import net.planeta.planetaitemsmod.block.ModBlocks;
import net.planeta.planetaitemsmod.block.entity.ModBlockEntities;
import net.planeta.planetaitemsmod.item.ModItemGroups;
import net.planeta.planetaitemsmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlanetaItems implements ModInitializer {
	public static final String MOD_ID = "planetaitemsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}