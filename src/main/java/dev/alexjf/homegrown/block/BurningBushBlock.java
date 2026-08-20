package dev.alexjf.homegrown.block;

import java.util.Iterator;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import dev.alexjf.homegrown.block.enums.Dormant;
import dev.alexjf.homegrown.item.HomegrownItems;
import dev.alexjf.homegrown.registry.tag.HomegrownBlockTags;
import dev.alexjf.homegrown.state.property.HomegrownProperties;

public class BurningBushBlock extends TallCropBlock {
    protected static final EnumProperty<Dormant> DORMANT = HomegrownProperties.DORMANT;

    public BurningBushBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return floor.is(BlockTags.SUPPORTS_BAMBOO) || floor.is(HomegrownBlockTags.BURNING_BUSH_PLANTABLE_ON);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader world, BlockPos pos) {
        DoubleBlockHalf doubleBlockHalf = state.getValue(HALF);
        BlockState floor = world.getBlockState(pos.below());
        if (doubleBlockHalf == DoubleBlockHalf.LOWER) {
            if (!mayPlaceOn(floor, world, pos)) return false;
            if (world.getBrightness(LightLayer.SKY, pos) != 0) return false;
            BlockState ceiling = world.getBlockState(pos.above());
            if (state.getValue(AGE) >= 4){
                if (!ceiling.is(this)) return false;
            } else {
                if (!ceiling.isAir()) return false;
            }
        } else {
            if (!floor.is(this)) return false;
            if (floor.getValue(HALF) != DoubleBlockHalf.LOWER) return false;
        }
        return true;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        if (state.getValue(HALF) == DoubleBlockHalf.UPPER) return false;
        return true;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (isWaterNearby(world, pos) && world.getBrightness(LightLayer.SKY, pos) == 0 && world.getBrightness(LightLayer.BLOCK, pos) != 0) {
            if (this.isMaxAge(state) || state.getValue(DORMANT) == Dormant.TRUE) {
                world.setBlock(pos, state.setValue(DORMANT, Dormant.FALSE), 2);
            } else {
                super.randomTick(state, world, pos, random);
            }
        } else {
            world.setBlock(pos, (BlockState)state.setValue(DORMANT, Dormant.TRUE), 2);
        }
    }

    private static boolean isWaterNearby(LevelReader world, BlockPos pos) {
        Iterator<BlockPos> var2 = BlockPos.betweenClosed(pos.offset(-4, 0, -4), pos.offset(4, -1, 4)).iterator();
  
        BlockPos blockPos;
        do {
           if (!var2.hasNext()) {
              return false;
           }
  
           blockPos = (BlockPos)var2.next();
        } while(!world.getFluidState(blockPos).is(FluidTags.WATER));
  
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DORMANT);
        super.createBlockStateDefinition(builder);
    }

    @Override
	protected ItemLike getBaseSeedId() {
		return HomegrownItems.BURNING_BUSH_CLIPPINGS;
	}
}
