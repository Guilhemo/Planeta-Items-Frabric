package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class CloneBlockEntity extends BlockEntity {
    public CloneBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.CLONE_BLOCK_ENTITY, pos, state);
    }
}
