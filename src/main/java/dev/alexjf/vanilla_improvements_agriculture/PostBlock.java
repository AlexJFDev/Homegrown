package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class PostBlock extends Block {
    public PostBlock(net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings fabricBlockSettings) {
        super(fabricBlockSettings);
    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient) {
            player.sendMessage(new LiteralText("Hello, world!"), false);
        }
 
        return ActionResult.SUCCESS;
    }
}   