package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class GiratinaBlockEntity extends BlockEntity {
    public GiratinaBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GIRATINA_BLOCK_ENTITY, pos, state);
    }
}
