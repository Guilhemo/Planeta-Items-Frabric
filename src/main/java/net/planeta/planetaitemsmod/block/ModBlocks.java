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

    /*public static final Block FELICIDADE_BLOCK = registerBlock("felicidade_block",
            new BaudafelicidadeBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.AMETHYST_BLOCK).nonOpaque()));

    public static final Block BLACKJACK_BLOCK = registerBlock("blackjack_block",
            new BlackJackBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block CLASSIC_BLOCK = registerBlock("classic_block",
            new ClassicBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block CORRIDA_BLOCK = registerBlock("corrida_block",
            new CorridaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block DADOS_BLOCK = registerBlock("dados_block",
            new DadosBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block DARDOS_BLOCK = registerBlock("dardos_block",
            new DardosBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block DRUMS_BLOCK = registerBlock("drums_block",
            new DrumsBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block FOGUETINHO_BLOCK = registerBlock("foguetinho_block",
            new FoguetinhoBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block LOTERIA_BLOCK = registerBlock("loteria_block",
            new LoteriaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block PEDRA_BLOCK = registerBlock("pedra_block",
            new PedraBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block PIRAMIDE_BLOCK = registerBlock("piramide_block",
            new PiramideBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block POKER_BLOCK = registerBlock("poker_block",
            new PokerBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block ROLETA_BLOCK = registerBlock("roleta_block",
            new RoletaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block STAIRS_BLOCK = registerBlock("stairs_block",
            new StairsBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));

    public static final Block VELHA_BLOCK = registerBlock("velha_block",
            new VelhaBlock(FabricBlockSettings.copyOf(Blocks.BEDROCK).sounds(BlockSoundGroup.ANVIL).nonOpaque()));*/



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
