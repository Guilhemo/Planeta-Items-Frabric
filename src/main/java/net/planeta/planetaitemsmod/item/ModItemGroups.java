package net.planeta.planetaitemsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.planeta.planetaitemsmod.PlanetaItems;
import net.planeta.planetaitemsmod.block.ModBlocks;

public class ModItemGroups {
    /*public static final ItemGroup PLANETA_LENDS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlanetaItems.MOD_ID, "planeta_lends"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_lends"))
                    .icon(() -> new ItemStack(ModItems.RED_ORB)).entries((displayContext, entries) -> {
                        /*entries.add(ModItems.FISTPLATE);
                        entries.add(ModItems.SKYPLATE);
                        entries.add(ModItems.TOXICPLATE);
                        entries.add(ModItems.EARTHPLATE);
                        entries.add(ModItems.STONEPLATE);
                        entries.add(ModItems.INSECTPLATE);
                        entries.add(ModItems.SPOOKYPLATE);
                        entries.add(ModItems.IRONPLATE);
                        entries.add(ModItems.FLAMEPLATE);
                        entries.add(ModItems.SPLASHPLATE);
                        entries.add(ModItems.MEADOWPLATE);
                        entries.add(ModItems.PIXIEPLATE);
                        entries.add(ModItems.DRACOPLATE);
                        entries.add(ModItems.DREADPLATE);
                        entries.add(ModItems.ZAPPLATE);
                        entries.add(ModItems.ICICLEPLATE);
                        entries.add(ModItems.MINDPLATE);
                        entries.add(ModItems.BLANKPLATE);

                        entries.add(ModItems.ADAMANT_ORB);
                        entries.add(ModItems.AURORA_TICKET);
                        entries.add(ModItems.AZURE_FLUTE);
                        entries.add(ModItems.BLUE_ORB);
                        entries.add(ModItems.BONUS_DISK);
                        entries.add(ModItems.CLEAR_BELL);
                        entries.add(ModItems.DNA_SPLICER);
                        entries.add(ModItems.EON_TICKET);
                        entries.add(ModItems.GRISEOUS_ORB);
                        entries.add(ModItems.GS_BALL);
                        entries.add(ModItems.JADE_ORB);
                        entries.add(ModItems.LIBERTY_PASS);
                        entries.add(ModItems.LUSTROUS_ORB);
                        entries.add(ModItems.MEMBER_CARD);
                        entries.add(ModItems.OAKS_LETTER);
                        entries.add(ModItems.OLD_SEA_MAP);
                        entries.add(ModItems.RED_ORB);
                        entries.add(ModItems.RUSTED_SHIELD);
                        entries.add(ModItems.RUSTED_SWORD);
                        entries.add(ModItems.TIDAL_BELL);
                        entries.add(ModItems.DR_FUJIS_DIARY);
                        entries.add(ModItems.RAINBOW_WING);
                        entries.add(ModItems.SCARLET_BOOK);
                        entries.add(ModItems.SILVER_WING);
                        entries.add(ModItems.VIOLET_BOOK);
                        entries.add(ModItems.COCOON_OF_DESTRUCTION);
                        entries.add(ModItems.SAPLING_OF_LIFE);
                        entries.add(ModItems.ZYGARDE_CUBE);
                        entries.add(ModItems.ZYGARDE_CELL);
                        entries.add(ModItems.ZYGARDE_CORE);*/
                   /* }).build());*/

    public static final ItemGroup PLANETA_GYM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlanetaItems.MOD_ID, "planeta_gym"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_gym"))
                    .icon(() -> new ItemStack(ModItems.FIGHTING_BADGE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WATER_BADGE);
                        entries.add(ModItems.FIRE_BADGE);
                        entries.add(ModItems.GRASS_BADGE);
                        entries.add(ModItems.ELECTRIC_BADGE);
                        entries.add(ModItems.ICE_BADGE);
                        entries.add(ModItems.FIGHTING_BADGE);
                        entries.add(ModItems.NORMAL_BADGE);
                        entries.add(ModItems.POISON_BADGE);
                        entries.add(ModItems.GROUND_BADGE);
                        entries.add(ModItems.FLYING_BADGE);
                        entries.add(ModItems.PSYCHIC_BADGE);
                        entries.add(ModItems.BUG_BADGE);
                        entries.add(ModItems.ROCK_BADGE);
                        entries.add(ModItems.GHOST_BADGE);
                        entries.add(ModItems.DRAGON_BADGE);
                        entries.add(ModItems.DARK_BADGE);
                        entries.add(ModItems.STEEL_BADGE);
                        entries.add(ModItems.FAIRY_BADGE);

                    }).build());

    public static final ItemGroup PLANETA_SPECIAL = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlanetaItems.MOD_ID, "planeta_specials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_specials"))
                    .icon(() -> new ItemStack(ModItems.SKIN)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WATER_DUDE);
                        entries.add(ModItems.WATER_DUDE_M);
                        entries.add(ModItems.WISHING_PIECE);
                        entries.add(ModBlocks.ARCEUS_TEMPLE);
                        entries.add(ModBlocks.GIRATINA_TEMPLE);
                        entries.add(ModBlocks.PALKIA_TEMPLE);
                        entries.add(ModBlocks.DIALGA_TEMPLE);
                        entries.add(ModBlocks.ZAPDOS_TEMPLE);
                        entries.add(ModBlocks.ARTICUNO_TEMPLE);
                        entries.add(ModBlocks.MOLTRES_TEMPLE);
                        entries.add(ModBlocks.CELEBI_TEMPLE);
                        entries.add(ModBlocks.HOOH_TEMPLE);
                        entries.add(ModBlocks.LUGIA_TEMPLE);
                        entries.add(ModBlocks.RAID_BLOCK);
                        entries.add(ModItems.KEY);

                    }).build());

     /*public static final ItemGroup PLANETA_CASSINO = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlanetaItems.MOD_ID, "planeta_cassino"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_cassino"))
                    .icon(() -> new ItemStack(ModItems.DADOS_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FELICIDADE_BLOCK);
                        entries.add(ModBlocks.BLACKJACK_BLOCK);
                        entries.add(ModBlocks.CLASSIC_BLOCK);
                        entries.add(ModBlocks.CORRIDA_BLOCK);
                        entries.add(ModBlocks.DADOS_BLOCK);
                        entries.add(ModBlocks.DARDOS_BLOCK);
                        entries.add(ModBlocks.DRUMS_BLOCK);
                        entries.add(ModBlocks.FOGUETINHO_BLOCK);
                        entries.add(ModBlocks.LOTERIA_BLOCK);
                        entries.add(ModBlocks.PEDRA_BLOCK);
                        entries.add(ModBlocks.PIRAMIDE_BLOCK);
                        entries.add(ModBlocks.POKER_BLOCK);
                        entries.add(ModBlocks.ROLETA_BLOCK);
                        entries.add(ModBlocks.STAIRS_BLOCK);
                        entries.add(ModBlocks.VELHA_BLOCK);
                    }).build());*/

    public static final ItemGroup PLANETA_MISCELLANEOUS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PlanetaItems.MOD_ID, "planeta_miscellaneous"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_miscellaneous"))
                    .icon(() -> new ItemStack(ModItems.PEARL_BIG)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FRAG_COMET);
                        entries.add(ModItems.MUSH);
                        entries.add(ModItems.MUSH_BIG);
                        entries.add(ModItems.MUSH_YE);
                        entries.add(ModItems.NUGGET);
                        entries.add(ModItems.NUGGET_BIG);
                        entries.add(ModItems.PEARL);
                        entries.add(ModItems.PEARL_BIG);
                        entries.add(ModItems.SHELL);
                        entries.add(ModItems.STAR_PIECE);
                        entries.add(ModItems.STAR_POWER);
                        entries.add(ModItems.FLY_TICKET);
                        entries.add(ModItems.SAFARI_TICKET);
                        entries.add(ModItems.ELITE_TICKET);
                        entries.add(ModItems.BALL_CHANGE);
                        entries.add(ModItems.NATURE_CHANGE);
                        entries.add(ModItems.SKIN);
                        entries.add(ModItems.COMMON_BACKPACK);
                        entries.add(ModItems.UNCOMMON_BACKPACK);
                        entries.add(ModItems.RARE_BACKPACK);
                        entries.add(ModItems.EPIC_BACKPACK);
                        entries.add(ModItems.LEGENDARY_BACKPACK);
                        entries.add(ModBlocks.TROPHY_BIG);
                        entries.add(ModBlocks.TROPHY_SMALL);
                    }).build());

    public static void registerItemGroups() {
        PlanetaItems.LOGGER.info("Registering Item Groups for " + PlanetaItems.MOD_ID);
    }
}
