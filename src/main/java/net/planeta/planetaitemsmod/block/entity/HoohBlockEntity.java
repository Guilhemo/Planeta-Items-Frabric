package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class HoohBlockEntity extends BlockEntity {
    public HoohBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.HOOH_BLOCK_ENTITY, pos, state);
    }
}
