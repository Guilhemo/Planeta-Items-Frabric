package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class RaidBlockEntity extends BlockEntity {
    public RaidBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.RAID_BLOCK_ENTITY, pos, state);
    }
}
