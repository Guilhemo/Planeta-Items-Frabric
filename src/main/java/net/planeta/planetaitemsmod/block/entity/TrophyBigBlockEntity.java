package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class TrophyBigBlockEntity extends BlockEntity {
    public TrophyBigBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TROPHY_BIG_ENTITY, pos, state);
    }
}
