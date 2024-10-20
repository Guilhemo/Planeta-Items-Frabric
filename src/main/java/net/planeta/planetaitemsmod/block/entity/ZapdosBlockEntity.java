package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ZapdosBlockEntity extends BlockEntity {
    public ZapdosBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ZAPDOS_BLOCK_ENTITY, pos, state);
    }
}
