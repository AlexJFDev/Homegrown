package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.ShapeContext;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class PostCropBlock extends CropBlock {
	public static final int MAX_AGE = 7;

	protected PostCropBlock(Settings settings) {
		super(settings);
	}

	@Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
		System.out.println("BROKEN");
        world.setBlockState(pos, VanillaImprovementsAgriculture.OAK_LOG_POST.getDefaultState(), 3);
	}

	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
	}
}