package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class LugiaBlockEntity extends BlockEntity {
    public LugiaBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LUGIA_BLOCK_ENTITY, pos, state);
    }
}
