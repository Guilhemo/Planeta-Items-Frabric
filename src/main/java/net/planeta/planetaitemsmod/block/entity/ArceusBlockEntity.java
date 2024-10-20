package net.planeta.planetaitemsmod.block.entity;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class ArceusBlockEntity extends BlockEntity {
    public ArceusBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ARCEUS_BLOCK_ENTITY, pos, state);
    }
}
