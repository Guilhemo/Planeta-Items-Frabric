package net.planeta.planetaitemsmod.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.planeta.planetaitemsmod.PlanetaItems;
import net.planeta.planetaitemsmod.block.custom.*;


public class ModBlocks {

    public static final Block ARCEUS_TEMPLE = registerBlock("arceus_temple",
            new ArceusBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block GIRATINA_TEMPLE = registerBlock("giratina_temple",
            new GiratinaBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block DIALGA_TEMPLE = registerBlock("dialga_temple",
            new DialgaBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block PALKIA_TEMPLE = registerBlock("palkia_temple",
            new PalkiaBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block ARTICUNO_TEMPLE = registerBlock("articuno_temple",
            new ArticunoBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block MOLTRES_TEMPLE = registerBlock("moltres_temple",
            new MoltresBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block ZAPDOS_TEMPLE = registerBlock("zapdos_temple",
            new ZapdosBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block CELEBI_TEMPLE = registerBlock("celebi_temple",
            new CelebiBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block HOOH_TEMPLE = registerBlock("hooh_temple",
            new HoohBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block LUGIA_TEMPLE = registerBlock("lugia_temple",
            new LugiaBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block RAID_BLOCK = registerBlock("raid_block",
            new RaidBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque()));

    public static final Block CLONE_BLOCK = registerBlock("clone_block",
            new CloneBlock(AbstractBlock.Settings.create().strength(4F).sounds(BlockSoundGroup.ANVIL).nonOpaque().blockVision(Blocks::never)));

    public static final Block TROPHY_BIG = registerBlock("trophy_big",
            new TrophyBigBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque().noBlockBreakParticles()));

    public static final Block TROPHY_SMALL = registerBlock("trophy_small",
            new TrophySmallBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque().noBlockBreakParticles()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PlanetaItems.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(PlanetaItems.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PlanetaItems.LOGGER.info("Registering Mod Blocks for " + PlanetaItems.MOD_ID);
    }


}
