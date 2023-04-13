package dev.alexjf.homegrown.world.gen.feature;

import com.mojang.serialization.Codec;

import dev.alexjf.homegrown.block.TallCropBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class SimpleCropBlockFeature extends Feature<SimpleCropBlockFeatureConfig>{
    public SimpleCropBlockFeature(Codec<SimpleCropBlockFeatureConfig> codec) {
        super(codec);
    }
 
    public boolean generate(FeatureContext<SimpleCropBlockFeatureConfig> context) {
        SimpleCropBlockFeatureConfig simpleCropBlockFeatureConfig = (SimpleCropBlockFeatureConfig)context.getConfig();
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        BlockState blockState = simpleCropBlockFeatureConfig.toPlace().get(context.getRandom(), blockPos);
        if (!blockState.canPlaceAt(structureWorldAccess, blockPos)) return false;
        Random random = context.getRandom();
        int age = random.nextInt(8);
        if (blockState.getBlock() instanceof TallCropBlock) {
            if (!structureWorldAccess.isAir(blockPos.up())) return false;
            structureWorldAccess.setBlockState(blockPos, blockState.with(TallCropBlock.AGE, age).with(TallCropBlock.HALF, DoubleBlockHalf.LOWER), 2);
            if (age >= 4) {
                structureWorldAccess.setBlockState(blockPos.up(), blockState.with(TallCropBlock.AGE, age).with(TallCropBlock.HALF, DoubleBlockHalf.UPPER), 2);
            }
        } else {
            structureWorldAccess.setBlockState(blockPos, blockState.with(CropBlock.AGE, age), 2);
        }
        return true;
    }
}