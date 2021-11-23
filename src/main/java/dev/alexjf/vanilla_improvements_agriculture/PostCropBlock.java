package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class PostCropBlock extends CropBlock {
	public static final EnumProperty<PostType> TYPE = VanillaImprovementsAgriculture.POST_TYPE;

	protected PostCropBlock(Settings settings) {
		super(settings);
		setDefaultState(getStateManager().getDefaultState().with(TYPE, PostType.OAK_LOG_POST).with(super.getAgeProperty(), 0));
	}

	@Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        world.setBlockState(pos, VanillaImprovementsAgriculture.OAK_LOG_POST.getDefaultState(), 3);
	}
	
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TYPE);
    }

	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
	}
}