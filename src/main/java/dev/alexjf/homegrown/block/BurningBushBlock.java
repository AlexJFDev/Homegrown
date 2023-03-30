package dev.alexjf.homegrown.block;

import java.util.Iterator;

import dev.alexjf.homegrown.block.enums.Dormant;
import dev.alexjf.homegrown.item.HomegrownItems;
import dev.alexjf.homegrown.state.property.HomegrownProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemConvertible;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.LightType;
import net.minecraft.world.WorldView;

public class BurningBushBlock extends TallCropBlock {
    protected static final EnumProperty<Dormant> DORMANT = HomegrownProperties.DORMANT;

    public BurningBushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.BAMBOO_PLANTABLE_ON) || floor.isIn(BlockTags.DIRT) || floor.isOf(Blocks.CLAY);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        DoubleBlockHalf doubleBlockHalf = state.get(HALF);
        BlockState floor = world.getBlockState(pos.down());
        if (doubleBlockHalf == DoubleBlockHalf.LOWER) {
            if (!canPlantOnTop(floor, world, pos)) return false;
            if (world.getLightLevel(LightType.SKY, pos) != 0) return false;
            BlockState ceiling = world.getBlockState(pos.up());
            if (state.get(AGE) >= 4){
                if (!ceiling.isOf(this)) return false;
            } else {
                if (!ceiling.isAir()) return false;
            }
        } else {
            if (!floor.isOf(this)) return false;
            if (floor.get(HALF) != DoubleBlockHalf.LOWER) return false;
        }
        return true;
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        if (state.get(HALF) == DoubleBlockHalf.UPPER) return false;
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (isWaterNearby(world, pos) && world.getLightLevel(LightType.SKY, pos) == 0 && world.getLightLevel(LightType.BLOCK, pos) != 0) {
            if (this.isMature(state) || state.get(DORMANT) == Dormant.TRUE) {
                world.setBlockState(pos, state.with(DORMANT, Dormant.FALSE), 2);
            } else {
                super.randomTick(state, world, pos, random);
            }
        } else {
            world.setBlockState(pos, (BlockState)state.with(DORMANT, Dormant.TRUE), 2);
        }
    }

    private static boolean isWaterNearby(WorldView world, BlockPos pos) {
        Iterator<BlockPos> var2 = BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, -1, 4)).iterator();
  
        BlockPos blockPos;
        do {
           if (!var2.hasNext()) {
              return false;
           }
  
           blockPos = (BlockPos)var2.next();
        } while(!world.getFluidState(blockPos).isIn(FluidTags.WATER));
  
        return true;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(DORMANT);
        super.appendProperties(builder);
    }

    @Override
	protected ItemConvertible getSeedsItem() {
		return HomegrownItems.BURNING_BUSH_CLIPPINGS;
	}
}
