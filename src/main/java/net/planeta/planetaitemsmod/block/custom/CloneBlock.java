package net.planeta.planetaitemsmod.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.planeta.planetaitemsmod.block.entity.CloneBlockEntity;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.HorizontalFacingBlock;

public class CloneBlock extends HorizontalFacingBlock implements BlockEntityProvider {

    // Adicione uma propriedade para representar se o vidro é transparente
    public static final BooleanProperty TRANSLUCENT = BooleanProperty.of("translucent");

    //private static final VoxelShape SHAPE = createCuboidShape(0, 0, -16, 16, 32, 32);
    private static final VoxelShape SHAPE = createCuboidShape(0, 0, 0, 16, 30, 16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public CloneBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(FACING, Direction.NORTH).with(TRANSLUCENT, false));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return null;
    }


    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new CloneBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, TRANSLUCENT);
    }


    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, ctx.getHorizontalPlayerFacing().getOpposite()).with(TRANSLUCENT, false);
    }

}
