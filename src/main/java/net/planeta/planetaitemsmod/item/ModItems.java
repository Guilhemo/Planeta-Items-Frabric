package net.planeta.planetaitemsmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.planeta.planetaitemsmod.PlanetaItems;

public class ModItems {

    // Gym Badges
    public static final Item WATER_BADGE = registerItem("water_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item FIRE_BADGE = registerItem("fire_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GRASS_BADGE = registerItem("grass_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item ELECTRIC_BADGE = registerItem("electric_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item ICE_BADGE = registerItem("ice_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item FIGHTING_BADGE = registerItem("fighting_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item POISON_BADGE = registerItem("poison_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GROUND_BADGE = registerItem("ground_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item FLYING_BADGE = registerItem("flying_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item PSYCHIC_BADGE = registerItem("psychic_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item BUG_BADGE = registerItem("bug_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item ROCK_BADGE = registerItem("rock_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GHOST_BADGE = registerItem("ghost_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DRAGON_BADGE = registerItem("dragon_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DARK_BADGE = registerItem("dark_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item STEEL_BADGE = registerItem("steel_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item FAIRY_BADGE = registerItem("fairy_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item NORMAL_BADGE = registerItem("normal_badge", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

    // Random Items
    public static final Item SKIN = registerItem("skin", new Item(new FabricItemSettings()));
    public static final Item WATER_DUDE = registerItem("water_dude", new Item(new FabricItemSettings().rarity(Rarity.EPIC).fireproof()));
    public static final Item WATER_DUDE_M = registerItem("water_dude_m", new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(17).fireproof()));
    public static final Item WISHING_PIECE = registerItem("wishing_piece", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item FRAG_COMET = registerItem("frag_comet", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MUSH = registerItem("mush", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MUSH_BIG = registerItem("mush_big", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MUSH_YE = registerItem("mush_ye", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NUGGET = registerItem("nugget", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NUGGET_BIG = registerItem("nugget_big", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item PEARL = registerItem("pearl", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item PEARL_BIG = registerItem("pearl_big", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SHELL = registerItem("shell", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item STAR_PIECE = registerItem("star_piece", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item STAR_POWER = registerItem("star_power", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item FLY_TICKET = registerItem("fly_ticket", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SAFARI_TICKET = registerItem("safari_ticket", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ELITE_TICKET = registerItem("elite_ticket", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item COMMON_BACKPACK = registerItem("common_bp", new Item(new FabricItemSettings().rarity(Rarity.COMMON).maxCount(1).fireproof()));
    public static final Item UNCOMMON_BACKPACK = registerItem("uncommon_bp", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1).fireproof()));
    public static final Item RARE_BACKPACK = registerItem("rare_bp", new Item(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item EPIC_BACKPACK = registerItem("epic_bp", new Item(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item LEGENDARY_BACKPACK = registerItem("legendary_bp", new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1).fireproof()));
    public static final Item KEY = registerItem("key", new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(22).fireproof()));
    public static final Item AMPULHETA = registerItem("ampulheta", new Item(new FabricItemSettings().rarity(Rarity.RARE).maxCount(32).fireproof()));
    public static final Item INCUBADORA = registerItem("incubadora", new Item(new FabricItemSettings().rarity(Rarity.RARE).maxCount(32).fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlanetaItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlanetaItems.LOGGER.info("Registering Mod Items for " + PlanetaItems.MOD_ID);

    }
}
