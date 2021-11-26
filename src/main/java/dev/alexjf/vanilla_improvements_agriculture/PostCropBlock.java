package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class PostCropBlock extends CropBlock {
	private Item item;
	public static final EnumProperty<PostType> TYPE = VanillaImprovementsAgriculture.POST_TYPE;

	protected PostCropBlock(Item item, Settings settings) {
		super(settings);
		this.item = item;
	}

	@Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
		PostType postType = (PostType)state.get(TYPE);
		switch(postType) {
			case OAK_LOG_POST:
				world.setBlockState(pos, VanillaImprovementsAgriculture.OAK_LOG_POST.getDefaultState(), 3);
				break;
			case OAK_PLANKS_POST:
				world.setBlockState(pos, VanillaImprovementsAgriculture.OAK_PLANKS_POST.getDefaultState(), 3);
				break;
			case OAK_WOOD_POST:
				world.setBlockState(pos, VanillaImprovementsAgriculture.OAK_WOOD_POST.getDefaultState(), 3);
				break;
			case STRIPPED_OAK_LOG_POST:
				world.setBlockState(pos, VanillaImprovementsAgriculture.STRIPPED_OAK_LOG_POST.getDefaultState(), 3);
				break;
			case STRIPPED_OAK_WOOD_POST:
				world.setBlockState(pos, VanillaImprovementsAgriculture.STRIPPED_OAK_WOOD_POST.getDefaultState(), 3);
				break;
			default: 
				world.setBlockState(pos, VanillaImprovementsAgriculture.OAK_LOG_POST.getDefaultState(), 3);
			}
	}

	public VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return VoxelShapes.cuboid(.375f, 0f, .375f, .625f, 1f, 0.625f);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(TYPE);
		stateManager.add(AGE);
    }

	public EnumProperty<PostType> getTypeProperty() {
		return TYPE;
	}

	@Override
	protected ItemConvertible getSeedsItem() {
		return item;
	}
}