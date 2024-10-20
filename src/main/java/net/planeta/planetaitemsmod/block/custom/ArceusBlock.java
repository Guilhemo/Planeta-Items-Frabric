package net.planeta.planetaitemsmod.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.planeta.planetaitemsmod.block.entity.ArceusBlockEntity;
import org.jetbrains.annotations.Nullable;
import net.minecraft.block.HorizontalFacingBlock;

public class ArceusBlock extends HorizontalFacingBlock implements BlockEntityProvider {
    private static final VoxelShape SHAPE = createCuboidShape(2, 0, 2, 14, 16, 14);

    public ArceusBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ArceusBlockEntity(pos, state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    /*@Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, ctx.getHorizontalPlayerFacing());
    }*/

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, net.minecraft.item.ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        world.setBlockState(pos, state.with(FACING, placer.getHorizontalFacing()), 3);
    }

}
