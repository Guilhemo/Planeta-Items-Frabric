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
    // Plates
    /*public static final Item FISTPLATE = registerItem("fistplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DRACOPLATE = registerItem("dracoplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SKYPLATE = registerItem("skyplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item TOXICPLATE = registerItem("toxicplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item EARTHPLATE = registerItem("earthplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item STONEPLATE = registerItem("stoneplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item INSECTPLATE = registerItem("insectplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SPOOKYPLATE = registerItem("spookyplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item IRONPLATE = registerItem("ironplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item FLAMEPLATE = registerItem("flameplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item SPLASHPLATE = registerItem("splashplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MEADOWPLATE = registerItem("meadowplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item PIXIEPLATE = registerItem("pixieplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item DREADPLATE = registerItem("dreadplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ZAPPLATE = registerItem("zapplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ICICLEPLATE = registerItem("icicleplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MINDPLATE = registerItem("mindplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item BLANKPLATE = registerItem("blankplate", new Item(new FabricItemSettings().rarity(Rarity.RARE)));*/

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

    // Myths and Legends Items
   /* public static final Item ADAMANT_ORB = registerItem("adamant_orb", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item AURORA_TICKET = registerItem("aurora_ticket", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item AZURE_FLUTE = registerItem("azure_flute", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item BLUE_ORB = registerItem("blue_orb", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item BONUS_DISK = registerItem("bonus_disk", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item CLEAR_BELL = registerItem("clear_bell", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DNA_SPLICER = registerItem("dna_splicer", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item EON_TICKET = registerItem("eon_ticket", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item GRISEOUS_ORB = registerItem("griseous_orb", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item GS_BALL = registerItem("gs_ball", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item JADE_ORB = registerItem("jade_orb", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item LIBERTY_PASS = registerItem("liberty_pass", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item LUSTROUS_ORB = registerItem("lustrous_orb", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item MEMBER_CARD = registerItem("member_card", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item OAKS_LETTER = registerItem("oaks_letter", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item OLD_SEA_MAP = registerItem("old_sea_map", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item RED_ORB = registerItem("red_orb", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item RUSTED_SHIELD = registerItem("rusted_shield", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item RUSTED_SWORD = registerItem("rusted_sword", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item TIDAL_BELL = registerItem("tidal_bell", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item DR_FUJIS_DIARY = registerItem("dr_fujis_diary", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item RAINBOW_WING = registerItem("rainbow_wing", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item SCARLET_BOOK = registerItem("scarlet_book", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item SILVER_WING = registerItem("silver_wing", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item VIOLET_BOOK = registerItem("violet_book", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item COCOON_OF_DESTRUCTION = registerItem("cocoon_of_destruction", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item SAPLING_OF_LIFE = registerItem("sapling_of_life", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item ZYGARDE_CUBE = registerItem("zygarde_cube", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ZYGARDE_CELL = registerItem("zygarde_cell", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item ZYGARDE_CORE = registerItem("zygarde_core", new Item(new FabricItemSettings().rarity(Rarity.RARE)));*/

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
    public static final Item BALL_CHANGE = registerItem("ball_change", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item NATURE_CHANGE = registerItem("nature_change", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
    public static final Item COMMON_BACKPACK = registerItem("common_backpack", new Item(new FabricItemSettings().rarity(Rarity.COMMON).maxCount(1).fireproof()));
    public static final Item UNCOMMON_BACKPACK = registerItem("uncommon_backpack", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(1).fireproof()));
    public static final Item RARE_BACKPACK = registerItem("rare_backpack", new Item(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item EPIC_BACKPACK = registerItem("epic_backpack", new Item(new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item LEGENDARY_BACKPACK = registerItem("legendary_backpack", new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1).fireproof()));
    public static final Item KEY = registerItem("key", new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(22).fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PlanetaItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlanetaItems.LOGGER.info("Registering Mod Items for " + PlanetaItems.MOD_ID);

    }
}
