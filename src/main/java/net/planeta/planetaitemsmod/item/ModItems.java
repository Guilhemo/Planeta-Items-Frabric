package net.planeta.planetaitemsmod.item;



import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.planeta.planetaitemsmod.PlanetaItems;

public class ModItems {

    // Gym Badges
    public static final Item WATER_BADGE = registerItem("water_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item FIRE_BADGE = registerItem("fire_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item GRASS_BADGE = registerItem("grass_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ELECTRIC_BADGE = registerItem("electric_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ICE_BADGE = registerItem("ice_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item FIGHTING_BADGE = registerItem("fighting_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item POISON_BADGE = registerItem("poison_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item GROUND_BADGE = registerItem("ground_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item FLYING_BADGE = registerItem("flying_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item PSYCHIC_BADGE = registerItem("psychic_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item BUG_BADGE = registerItem("bug_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ROCK_BADGE = registerItem("rock_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item GHOST_BADGE = registerItem("ghost_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item DRAGON_BADGE = registerItem("dragon_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item DARK_BADGE = registerItem("dark_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item STEEL_BADGE = registerItem("steel_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item FAIRY_BADGE = registerItem("fairy_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item NORMAL_BADGE = registerItem("normal_badge", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // Random Items
    public static final Item SKIN = registerItem("skin", new Item(new Item.Settings()));
    public static final Item WATER_DUDE = registerItem("water_dude", new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof()));
    public static final Item BEAST_DUDE = registerItem("beast_dude", new Item(new Item.Settings().rarity(Rarity.EPIC).fireproof()));
    public static final Item WATER_DUDE_M = registerItem("water_dude_m", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(17).fireproof()));
    public static final Item WISHING_PIECE = registerItem("wishing_piece", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item FRAG_COMET = registerItem("frag_comet", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item MUSH = registerItem("mush", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item MUSH_BIG = registerItem("mush_big", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item MUSH_YE = registerItem("mush_ye", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item NUGGET = registerItem("nugget", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item NUGGET_BIG = registerItem("nugget_big", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item PEARL = registerItem("pearl", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item PEARL_BIG = registerItem("pearl_big", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item SHELL = registerItem("shell", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item STAR_PIECE = registerItem("star_piece", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item STAR_POWER = registerItem("star_power", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item FLY_TICKET = registerItem("fly_ticket", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item SAFARI_TICKET = registerItem("safari_ticket", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item ELITE_TICKET = registerItem("elite_ticket", new Item(new Item.Settings().rarity(Rarity.RARE)));
    public static final Item COMMON_BACKPACK = registerItem("common_bp", new Item(new Item.Settings().rarity(Rarity.COMMON).maxCount(1).fireproof()));
    public static final Item UNCOMMON_BACKPACK = registerItem("uncommon_bp", new Item(new Item.Settings().rarity(Rarity.UNCOMMON).maxCount(1).fireproof()));
    public static final Item RARE_BACKPACK = registerItem("rare_bp", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item EPIC_BACKPACK = registerItem("epic_bp", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item LEGENDARY_BACKPACK = registerItem("legendary_bp", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).fireproof()));
    public static final Item KEY = registerItem("key", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(22).fireproof()));
    public static final Item AMPULHETA = registerItem("ampulheta", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(32).fireproof()));
    public static final Item INCUBADORA = registerItem("incubadora", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(32).fireproof()));

    //Orbs
    public static final Item ORB = registerItem("orb", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(32).fireproof()));

    public static final Item ORB_ZAPDOS0 = registerItem("orbzapdos0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS1 = registerItem("orbzapdos1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS2 = registerItem("orbzapdos2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS3 = registerItem("orbzapdos3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS4 = registerItem("orbzapdos4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS5 = registerItem("orbzapdos5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS6 = registerItem("orbzapdos6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS7 = registerItem("orbzapdos7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS8 = registerItem("orbzapdos8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS9 = registerItem("orbzapdos9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS10 = registerItem("orbzapdos10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS11 = registerItem("orbzapdos11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ZAPDOS12 = registerItem("orbzapdos12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO0 = registerItem("orbarticuno0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO1 = registerItem("orbarticuno1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO2 = registerItem("orbarticuno2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO3 = registerItem("orbarticuno3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO4 = registerItem("orbarticuno4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO5 = registerItem("orbarticuno5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO6 = registerItem("orbarticuno6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO7 = registerItem("orbarticuno7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO8 = registerItem("orbarticuno8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO9 = registerItem("orbarticuno9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO10 = registerItem("orbarticuno10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO11 = registerItem("orbarticuno11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_ARTICUNO12 = registerItem("orbarticuno12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI0 = registerItem("orbcelebi0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI1 = registerItem("orbcelebi1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI2 = registerItem("orbcelebi2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI3 = registerItem("orbcelebi3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI4 = registerItem("orbcelebi4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI5 = registerItem("orbcelebi5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI6 = registerItem("orbcelebi6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI7 = registerItem("orbcelebi7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI8 = registerItem("orbcelebi8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI9 = registerItem("orbcelebi9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI10 = registerItem("orbcelebi10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI11 = registerItem("orbcelebi11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_CELEBI12 = registerItem("orbcelebi12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA0 = registerItem("orbdialga0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA1 = registerItem("orbdialga1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA2 = registerItem("orbdialga2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA3 = registerItem("orbdialga3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA4 = registerItem("orbdialga4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA5 = registerItem("orbdialga5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA6 = registerItem("orbdialga6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA7 = registerItem("orbdialga7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA8 = registerItem("orbdialga8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA9 = registerItem("orbdialga9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA10 = registerItem("orbdialga10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA11 = registerItem("orbdialga11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_DIALGA12 = registerItem("orbdialga12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA0 = registerItem("orbgiratina0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA1 = registerItem("orbgiratina1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA2 = registerItem("orbgiratina2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA3 = registerItem("orbgiratina3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA4 = registerItem("orbgiratina4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA5 = registerItem("orbgiratina5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA6 = registerItem("orbgiratina6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA7 = registerItem("orbgiratina7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA8 = registerItem("orbgiratina8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA9 = registerItem("orbgiratina9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA10 = registerItem("orbgiratina10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA11 = registerItem("orbgiratina11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_GIRATINA12 = registerItem("orbgiratina12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES0 = registerItem("orbmoltres0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES1 = registerItem("orbmoltres1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES2 = registerItem("orbmoltres2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES3 = registerItem("orbmoltres3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES4 = registerItem("orbmoltres4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES5 = registerItem("orbmoltres5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES6 = registerItem("orbmoltres6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES7 = registerItem("orbmoltres7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES8 = registerItem("orbmoltres8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES9 = registerItem("orbmoltres9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES10 = registerItem("orbmoltres10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES11 = registerItem("orbmoltres11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_MOLTRES12 = registerItem("orbmoltres12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA0 = registerItem("orbpalkia0", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA1 = registerItem("orbpalkia1", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA2 = registerItem("orbpalkia2", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA3 = registerItem("orbpalkia3", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA4 = registerItem("orbpalkia4", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA5 = registerItem("orbpalkia5", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA6 = registerItem("orbpalkia6", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA7 = registerItem("orbpalkia7", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA8 = registerItem("orbpalkia8", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA9 = registerItem("orbpalkia9", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA10 = registerItem("orbpalkia10", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA11 = registerItem("orbpalkia11", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));
    public static final Item ORB_PALKIA12 = registerItem("orbpalkia12", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(1).fireproof()));

    //Natal
    public static final Item PRESENTE_GG = registerItem("presenteenorme", new Item(new Item.Settings().rarity(Rarity.EPIC).maxCount(5).fireproof()));
    public static final Item PRESENTE_G = registerItem("presentegrande", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(64).fireproof()));
    public static final Item PRESENTE_M = registerItem("presentemedio", new Item(new Item.Settings().rarity(Rarity.RARE).maxCount(64).fireproof()));
    public static final Item PRESENTE_P = registerItem("presentepequeno", new Item(new Item.Settings().rarity(Rarity.COMMON).maxCount(64).fireproof()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PlanetaItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PlanetaItems.LOGGER.info("Registering Mod Items for " + PlanetaItems.MOD_ID);

    }
}
