package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class DialgaBlockEntity extends BlockEntity {
    public DialgaBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.DIALGA_BLOCK_ENTITY, pos, state);
    }
}
