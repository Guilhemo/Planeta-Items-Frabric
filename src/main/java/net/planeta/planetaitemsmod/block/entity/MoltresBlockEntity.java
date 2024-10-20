package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class MoltresBlockEntity extends BlockEntity {
    public MoltresBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MOLTRES_BLOCK_ENTITY, pos, state);
    }
}
