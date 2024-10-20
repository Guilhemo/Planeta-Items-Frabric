package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CelebiBlockEntity extends BlockEntity {
    public CelebiBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CELEBI_BLOCK_ENTITY, pos, state);
    }
}
