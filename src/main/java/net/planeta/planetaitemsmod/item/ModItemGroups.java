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

    public static final ItemGroup PLANETA_GYM = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PlanetaItems.MOD_ID, "planeta_gym"),
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
            Identifier.of(PlanetaItems.MOD_ID, "planeta_specials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_specials"))
                    .icon(() -> new ItemStack(ModItems.KEY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WATER_DUDE);
                        entries.add(ModItems.BEAST_DUDE);
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
                        entries.add(ModItems.AMPULHETA);
                        entries.add(ModItems.INCUBADORA);

                    }).build());

    public static final ItemGroup PLANETA_MISCELLANEOUS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PlanetaItems.MOD_ID, "planeta_miscellaneous"),
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
                        entries.add(ModItems.SKIN);
                        entries.add(ModBlocks.TROPHY_BIG);
                        entries.add(ModBlocks.TROPHY_SMALL);
                    }).build());

    public static final ItemGroup PLANETA_ORBS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PlanetaItems.MOD_ID, "planeta_orbs"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.planeta_orbs"))
                    .icon(() -> new ItemStack(ModItems.ORB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ORB);
                        entries.add(ModItems.ORB_ZAPDOS0);
                        entries.add(ModItems.ORB_ZAPDOS1);
                        entries.add(ModItems.ORB_ZAPDOS2);
                        entries.add(ModItems.ORB_ZAPDOS3);
                        entries.add(ModItems.ORB_ZAPDOS4);
                        entries.add(ModItems.ORB_ZAPDOS5);
                        entries.add(ModItems.ORB_ZAPDOS6);
                        entries.add(ModItems.ORB_ZAPDOS7);
                        entries.add(ModItems.ORB_ZAPDOS8);
                        entries.add(ModItems.ORB_ZAPDOS9);
                        entries.add(ModItems.ORB_ZAPDOS10);
                        entries.add(ModItems.ORB_ZAPDOS11);
                        entries.add(ModItems.ORB_ZAPDOS12);
                        entries.add(ModItems.ORB_ARTICUNO0);
                        entries.add(ModItems.ORB_ARTICUNO1);
                        entries.add(ModItems.ORB_ARTICUNO2);
                        entries.add(ModItems.ORB_ARTICUNO3);
                        entries.add(ModItems.ORB_ARTICUNO4);
                        entries.add(ModItems.ORB_ARTICUNO5);
                        entries.add(ModItems.ORB_ARTICUNO6);
                        entries.add(ModItems.ORB_ARTICUNO7);
                        entries.add(ModItems.ORB_ARTICUNO8);
                        entries.add(ModItems.ORB_ARTICUNO9);
                        entries.add(ModItems.ORB_ARTICUNO10);
                        entries.add(ModItems.ORB_ARTICUNO11);
                        entries.add(ModItems.ORB_ARTICUNO12);
                        entries.add(ModItems.ORB_CELEBI0);
                        entries.add(ModItems.ORB_CELEBI1);
                        entries.add(ModItems.ORB_CELEBI2);
                        entries.add(ModItems.ORB_CELEBI3);
                        entries.add(ModItems.ORB_CELEBI4);
                        entries.add(ModItems.ORB_CELEBI5);
                        entries.add(ModItems.ORB_CELEBI6);
                        entries.add(ModItems.ORB_CELEBI7);
                        entries.add(ModItems.ORB_CELEBI8);
                        entries.add(ModItems.ORB_CELEBI9);
                        entries.add(ModItems.ORB_CELEBI10);
                        entries.add(ModItems.ORB_CELEBI11);
                        entries.add(ModItems.ORB_CELEBI12);
                        entries.add(ModItems.ORB_DIALGA0);
                        entries.add(ModItems.ORB_DIALGA1);
                        entries.add(ModItems.ORB_DIALGA2);
                        entries.add(ModItems.ORB_DIALGA3);
                        entries.add(ModItems.ORB_DIALGA4);
                        entries.add(ModItems.ORB_DIALGA5);
                        entries.add(ModItems.ORB_DIALGA6);
                        entries.add(ModItems.ORB_DIALGA7);
                        entries.add(ModItems.ORB_DIALGA8);
                        entries.add(ModItems.ORB_DIALGA9);
                        entries.add(ModItems.ORB_DIALGA10);
                        entries.add(ModItems.ORB_DIALGA11);
                        entries.add(ModItems.ORB_DIALGA12);
                        entries.add(ModItems.ORB_GIRATINA0);
                        entries.add(ModItems.ORB_GIRATINA1);
                        entries.add(ModItems.ORB_GIRATINA2);
                        entries.add(ModItems.ORB_GIRATINA3);
                        entries.add(ModItems.ORB_GIRATINA4);
                        entries.add(ModItems.ORB_GIRATINA5);
                        entries.add(ModItems.ORB_GIRATINA6);
                        entries.add(ModItems.ORB_GIRATINA7);
                        entries.add(ModItems.ORB_GIRATINA8);
                        entries.add(ModItems.ORB_GIRATINA9);
                        entries.add(ModItems.ORB_GIRATINA10);
                        entries.add(ModItems.ORB_GIRATINA11);
                        entries.add(ModItems.ORB_GIRATINA12);
                        entries.add(ModItems.ORB_MOLTRES0);
                        entries.add(ModItems.ORB_MOLTRES1);
                        entries.add(ModItems.ORB_MOLTRES2);
                        entries.add(ModItems.ORB_MOLTRES3);
                        entries.add(ModItems.ORB_MOLTRES4);
                        entries.add(ModItems.ORB_MOLTRES5);
                        entries.add(ModItems.ORB_MOLTRES6);
                        entries.add(ModItems.ORB_MOLTRES7);
                        entries.add(ModItems.ORB_MOLTRES8);
                        entries.add(ModItems.ORB_MOLTRES9);
                        entries.add(ModItems.ORB_MOLTRES10);
                        entries.add(ModItems.ORB_MOLTRES11);
                        entries.add(ModItems.ORB_MOLTRES12);
                        entries.add(ModItems.ORB_PALKIA0);
                        entries.add(ModItems.ORB_PALKIA1);
                        entries.add(ModItems.ORB_PALKIA2);
                        entries.add(ModItems.ORB_PALKIA3);
                        entries.add(ModItems.ORB_PALKIA4);
                        entries.add(ModItems.ORB_PALKIA5);
                        entries.add(ModItems.ORB_PALKIA6);
                        entries.add(ModItems.ORB_PALKIA7);
                        entries.add(ModItems.ORB_PALKIA8);
                        entries.add(ModItems.ORB_PALKIA9);
                        entries.add(ModItems.ORB_PALKIA10);
                        entries.add(ModItems.ORB_PALKIA11);
                        entries.add(ModItems.ORB_PALKIA12);

                    }).build());

    public static void registerItemGroups() {
        PlanetaItems.LOGGER.info("Registering Item Groups for " + PlanetaItems.MOD_ID);
    }
}
