package dev.alexjf.homegrown.feature;

import java.util.Random;

import com.mojang.serialization.Codec;

import dev.alexjf.homegrown.block.HomegrownBlocks;
import dev.alexjf.homegrown.block.TallCropBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap.Type;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class RiceBlockFeature extends Feature<DefaultFeatureConfig> {
    public RiceBlockFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }
 
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {

        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();


        int yPos = structureWorldAccess.getTopY(Type.OCEAN_FLOOR, blockPos.getX(), blockPos.getZ());
        blockPos = new BlockPos(blockPos.getX(), yPos, blockPos.getZ());
        BlockState blockState = HomegrownBlocks.WILD_RICE.getDefaultState();
        if (blockState.canPlaceAt(structureWorldAccess, blockPos)) {
            Random random = context.getRandom();
            int age = random.nextInt(8);
            if (age >= 4) {
                structureWorldAccess.setBlockState(blockPos, blockState.with(TallCropBlock.AGE, age).with(TallCropBlock.HALF, DoubleBlockHalf.LOWER), 2);
                structureWorldAccess.setBlockState(blockPos.up(), blockState.with(TallCropBlock.AGE, age).with(TallCropBlock.HALF, DoubleBlockHalf.UPPER), 2);
            } else {
                structureWorldAccess.setBlockState(blockPos, blockState.with(TallCropBlock.AGE, age).with(TallCropBlock.HALF, DoubleBlockHalf.LOWER), 2);
            }
            return true;
        } else {
            return false;
        }
    }

}