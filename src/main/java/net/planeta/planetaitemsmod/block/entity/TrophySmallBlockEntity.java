package net.planeta.planetaitemsmod.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class TrophySmallBlockEntity extends BlockEntity {
    public TrophySmallBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TROPHY_SMALL_ENTITY, pos, state);
    }
}
