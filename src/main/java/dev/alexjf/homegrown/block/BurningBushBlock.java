package dev.alexjf.homegrown.block;

import java.util.Iterator;
import java.util.Random;

import dev.alexjf.homegrown.block.enums.Dormant;
import dev.alexjf.homegrown.state.property.HomegrownProperties;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.LightType;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;

public class BurningBushBlock extends TallCropBlock {
    protected static final EnumProperty<Dormant> DORMANT = HomegrownProperties.DORMANT;

    public BurningBushBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.BAMBOO_PLANTABLE_ON);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (isWaterNearby(world, pos) && world.getLightLevel(LightType.SKY, pos) == 0) {
            world.setBlockState(pos, (BlockState)state.with(DORMANT, Dormant.FALSE), 2);
            super.randomTick(state, world, pos, random);
        } else {
            world.setBlockState(pos, (BlockState)state.with(DORMANT, Dormant.TRUE), 2);
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        world.createAndScheduleBlockTick(pos, this, 1);
        if(state.canPlaceAt(world, pos)){
            if(state.get(HALF) == DoubleBlockHalf.UPPER){
                BlockState floor = world.getBlockState(pos.down());
                return state.with(AGE, floor.get(AGE)).with(DORMANT, floor.get(DORMANT));
            }
        } else {
            return Blocks.AIR.getDefaultState();
        }
        return state;
    }

    private static boolean isWaterNearby(WorldView world, BlockPos pos) {
        Iterator var2 = BlockPos.iterate(pos.add(-4, 0, -4), pos.add(4, -1, 4)).iterator();
  
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
}
