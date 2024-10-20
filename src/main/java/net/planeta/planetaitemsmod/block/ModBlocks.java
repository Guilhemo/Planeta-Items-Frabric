package net.planeta.planetaitemsmod.block;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.planeta.planetaitemsmod.PlanetaItems;
import net.planeta.planetaitemsmod.block.custom.*;


public class ModBlocks {

    public static final Block ARCEUS_TEMPLE = registerBlock("arceus_temple",
            new ArceusBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block GIRATINA_TEMPLE = registerBlock("giratina_temple",
            new GiratinaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block DIALGA_TEMPLE = registerBlock("dialga_temple",
            new DialgaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block PALKIA_TEMPLE = registerBlock("palkia_temple",
            new PalkiaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block ARTICUNO_TEMPLE = registerBlock("articuno_temple",
            new ArticunoBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block MOLTRES_TEMPLE = registerBlock("moltres_temple",
            new MoltresBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block ZAPDOS_TEMPLE = registerBlock("zapdos_temple",
            new ZapdosBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block CELEBI_TEMPLE = registerBlock("celebi_temple",
            new CelebiBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block HOOH_TEMPLE = registerBlock("hooh_temple",
            new HoohBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block LUGIA_TEMPLE = registerBlock("lugia_temple",
            new LugiaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance((state) -> 15).nonOpaque()));

    public static final Block RAID_BLOCK = registerBlock("raid_block",
            new RaidBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque()));

    public static final Block CLONE_BLOCK = registerBlock("clone_block",
            new CloneBlock(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.ANVIL).nonOpaque().blockVision(Blocks::never)));

    public static final Block TROPHY_BIG = registerBlock("trophy_big",
            new TrophyBigBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque().blockVision(Blocks::never).noBlockBreakParticles()));

    public static final Block TROPHY_SMALL = registerBlock("trophy_small",
            new TrophySmallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.ANVIL).nonOpaque().blockVision(Blocks::never).noBlockBreakParticles()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PlanetaItems.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PlanetaItems.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PlanetaItems.LOGGER.info("Registering Mod Blocks for " + PlanetaItems.MOD_ID);
    }


}
