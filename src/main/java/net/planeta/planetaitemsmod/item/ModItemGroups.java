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
                        entries.add(ModItems.AMPULHETA);
                        entries.add(ModItems.INCUBADORA);

                    }).build());

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
                        entries.add(ModItems.SKIN);
                        entries.add(ModBlocks.TROPHY_BIG);
                        entries.add(ModBlocks.TROPHY_SMALL);
                    }).build());

    public static void registerItemGroups() {
        PlanetaItems.LOGGER.info("Registering Item Groups for " + PlanetaItems.MOD_ID);
    }
}
