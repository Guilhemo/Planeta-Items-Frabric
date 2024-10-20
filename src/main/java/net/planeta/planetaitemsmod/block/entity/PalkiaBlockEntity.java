package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class PalkiaBlockEntity extends BlockEntity {
    public PalkiaBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PALKIA_BLOCK_ENTITY, pos, state);
    }
}
