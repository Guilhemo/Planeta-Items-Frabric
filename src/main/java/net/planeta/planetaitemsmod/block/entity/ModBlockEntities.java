package net.planeta.planetaitemsmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.planeta.planetaitemsmod.PlanetaItems;
import net.planeta.planetaitemsmod.block.ModBlocks;

public class ModBlockEntities {
    public static final BlockEntityType<ArceusBlockEntity> ARCEUS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "arceus_block_be"),
                    FabricBlockEntityTypeBuilder.create(ArceusBlockEntity::new,
                            ModBlocks.ARCEUS_TEMPLE).build());

    public static final BlockEntityType<GiratinaBlockEntity> GIRATINA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "giratina_block_entity"),
                    FabricBlockEntityTypeBuilder.create(GiratinaBlockEntity::new,
                            ModBlocks.GIRATINA_TEMPLE).build());

    public static final BlockEntityType<DialgaBlockEntity> DIALGA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "dialga_block_entity"),
                    FabricBlockEntityTypeBuilder.create(DialgaBlockEntity::new,
                            ModBlocks.DIALGA_TEMPLE).build());

    public static final BlockEntityType<PalkiaBlockEntity> PALKIA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "palkia_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PalkiaBlockEntity::new,
                            ModBlocks.PALKIA_TEMPLE).build());

    public static final BlockEntityType<ArticunoBlockEntity> ARTICUNO_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "articuno_block_entity"),
                    FabricBlockEntityTypeBuilder.create(ArticunoBlockEntity::new,
                            ModBlocks.ARTICUNO_TEMPLE).build());

    public static final BlockEntityType<MoltresBlockEntity> MOLTRES_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "moltres_block_entity"),
                    FabricBlockEntityTypeBuilder.create(MoltresBlockEntity::new,
                            ModBlocks.MOLTRES_TEMPLE).build());

    public static final BlockEntityType<ZapdosBlockEntity> ZAPDOS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "zapdos_block_entity"),
                    FabricBlockEntityTypeBuilder.create(ZapdosBlockEntity::new,
                            ModBlocks.ZAPDOS_TEMPLE).build());

    public static final BlockEntityType<CelebiBlockEntity> CELEBI_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "celebi_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CelebiBlockEntity::new,
                            ModBlocks.CELEBI_TEMPLE).build());

    public static final BlockEntityType<HoohBlockEntity> HOOH_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "hooh_block_entity"),
                    FabricBlockEntityTypeBuilder.create(HoohBlockEntity::new,
                            ModBlocks.HOOH_TEMPLE).build());

    public static final BlockEntityType<LugiaBlockEntity> LUGIA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "lugia_block_entity"),
                    FabricBlockEntityTypeBuilder.create(LugiaBlockEntity::new,
                            ModBlocks.LUGIA_TEMPLE).build());

    public static final BlockEntityType<RaidBlockEntity> RAID_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "raid_block_entity"),
                    FabricBlockEntityTypeBuilder.create(RaidBlockEntity::new,
                            ModBlocks.RAID_BLOCK).build());

    public static final BlockEntityType<CloneBlockEntity> CLONE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "clone_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CloneBlockEntity::new,
                            ModBlocks.CLONE_BLOCK).build());

    /*public static final BlockEntityType<BaudafelicidadeBlockEntity> FELICIDADE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "felicidade_block_entity"),
                    FabricBlockEntityTypeBuilder.create(BaudafelicidadeBlockEntity::new,
                            ModBlocks.FELICIDADE_BLOCK).build());

    public static final BlockEntityType<BlackJackBlockEntity> BLACKJACK_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "blackjack_block_entity"),
                    FabricBlockEntityTypeBuilder.create(BlackJackBlockEntity::new,
                            ModBlocks.BLACKJACK_BLOCK).build());

    public static final BlockEntityType<ClassicBlockEntity> CLASSIC_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "classic_block_entity"),
                    FabricBlockEntityTypeBuilder.create(ClassicBlockEntity::new,
                            ModBlocks.CLASSIC_BLOCK).build());

    public static final BlockEntityType<CorridaBlockEntity> CORRIDA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "corrida_block_entity"),
                    FabricBlockEntityTypeBuilder.create(CorridaBlockEntity::new,
                            ModBlocks.CORRIDA_BLOCK).build());

    public static final BlockEntityType<DadosBlockEntity> DADOS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "dados_block_entity"),
                    FabricBlockEntityTypeBuilder.create(DadosBlockEntity::new,
                            ModBlocks.DADOS_BLOCK).build());

    public static final BlockEntityType<DardosBlockEntity> DARDOS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "dardos_block_entity"),
                    FabricBlockEntityTypeBuilder.create(DardosBlockEntity::new,
                            ModBlocks.DARDOS_BLOCK).build());

    public static final BlockEntityType<DrumsBlockEntity> DRUMS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "drums_block_entity"),
                    FabricBlockEntityTypeBuilder.create(DrumsBlockEntity::new,
                            ModBlocks.DRUMS_BLOCK).build());

    public static final BlockEntityType<FoguetinhoBlockEntity> FOGUETINHO_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "foguetinho_block_entity"),
                    FabricBlockEntityTypeBuilder.create(FoguetinhoBlockEntity::new,
                            ModBlocks.FOGUETINHO_BLOCK).build());

    public static final BlockEntityType<LoteriaBlockEntity> LOTERIA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "loteria_block_entity"),
                    FabricBlockEntityTypeBuilder.create(LoteriaBlockEntity::new,
                            ModBlocks.LOTERIA_BLOCK).build());

    public static final BlockEntityType<PedraBlockEntity> PEDRA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "pedra_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PedraBlockEntity::new,
                            ModBlocks.PEDRA_BLOCK).build());

    public static final BlockEntityType<PiramideBlockEntity> PIRAMIDE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "piramide_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PiramideBlockEntity::new,
                            ModBlocks.PIRAMIDE_BLOCK).build());

    public static final BlockEntityType<PokerBlockEntity> POKER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "poker_block_entity"),
                    FabricBlockEntityTypeBuilder.create(PokerBlockEntity::new,
                            ModBlocks.POKER_BLOCK).build());

    public static final BlockEntityType<RoletaBlockEntity> ROLETA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "roleta_block_entity"),
                    FabricBlockEntityTypeBuilder.create(RoletaBlockEntity::new,
                            ModBlocks.ROLETA_BLOCK).build());

    public static final BlockEntityType<StairsBlockEntity> STAIRS_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "stairs_block_entity"),
                    FabricBlockEntityTypeBuilder.create(StairsBlockEntity::new,
                            ModBlocks.STAIRS_BLOCK).build());

    public static final BlockEntityType<VelhaBlockEntity> VELHA_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(PlanetaItems.MOD_ID, "velha_block_entity"),
                    FabricBlockEntityTypeBuilder.create(VelhaBlockEntity::new,
                            ModBlocks.VELHA_BLOCK).build());*/

    public static void registerBlockEntities() {
        PlanetaItems.LOGGER.info("Registering Block Entities for " + PlanetaItems.MOD_ID);
    }
}
