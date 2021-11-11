package dev.alexjf.vanilla_improvements_agriculture;


import net.minecraft.world.BlockView;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class PostBlock extends Block {
    public PostBlock(net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings fabricBlockSettings) {
        super(fabricBlockSettings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(.25f, 0f, .25f, .75f, 1f, 0.75f);
    }
}