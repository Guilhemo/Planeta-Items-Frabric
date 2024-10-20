package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ArticunoBlockEntity extends BlockEntity {
    public ArticunoBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ARTICUNO_BLOCK_ENTITY, pos, state);
    }
}
