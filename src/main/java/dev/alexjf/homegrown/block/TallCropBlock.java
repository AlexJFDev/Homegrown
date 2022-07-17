package dev.alexjf.homegrown.block;

import java.util.Random;

import net.minecraft.block.AirBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TallCropBlock extends CropBlock {
    public static final EnumProperty<DoubleBlockHalf> HALF = Properties.DOUBLE_BLOCK_HALF;

    public TallCropBlock(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.LOWER));
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF);
        builder.add(AGE);
    }

    public EnumProperty<DoubleBlockHalf> getTypeProperty() {
		return HALF;
	}

    // This could potentially cause lag. It needs looking into.
    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getBaseLightLevel(pos, 0) >= 9) {
            DoubleBlockHalf doubleBlockHalf = (DoubleBlockHalf)state.get(HALF);
            int i = this.getAge(state);
            if(doubleBlockHalf == DoubleBlockHalf.LOWER && i >= 5 && world.getBlockState(pos.up()).getBlock() instanceof AirBlock) {
                world.setBlockState(pos.up(), this.withAge(0).with(HALF, DoubleBlockHalf.UPPER));
            }
            else if (i < this.getMaxAge()) {
                float f;
                if(doubleBlockHalf == DoubleBlockHalf.LOWER){
                    f = getAvailableMoisture(this, world, pos);
                }else {
                    f = getAvailableMoisture(this, world, pos.down());
                }
                if (random.nextInt((int)(25.0F / f) + 1) == 0) {
                    world.setBlockState(pos, this.withAge(i + 1).with(HALF, doubleBlockHalf), Block.NOTIFY_LISTENERS);
                }
            }
		}
	}

    /*@Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        if (state.get(HALF) == DoubleBlockHalf.LOWER) {
            return floor.isOf(Blocks.FARMLAND);
        } else {
            return floor.isOf(this) && floor.get(HALF) == DoubleBlockHalf.LOWER;
        }
	}*/
}
