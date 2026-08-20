package dev.alexjf.homegrown.world.gen.feature;

import com.mojang.serialization.Codec;

import dev.alexjf.homegrown.block.TallCropBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;

public class SimpleCropBlockFeature extends Feature<SimpleCropBlockFeatureConfig>{
    public SimpleCropBlockFeature(Codec<SimpleCropBlockFeatureConfig> codec) {
        super(codec);
    }
 
    public boolean place(FeaturePlaceContext<SimpleCropBlockFeatureConfig> context) {
        SimpleCropBlockFeatureConfig simpleCropBlockFeatureConfig = (SimpleCropBlockFeatureConfig)context.config();
        WorldGenLevel structureWorldAccess = context.level();
        BlockPos blockPos = context.origin();
        BlockState blockState = simpleCropBlockFeatureConfig.toPlace().getState(structureWorldAccess, context.random(), blockPos);
        if (!blockState.canSurvive(structureWorldAccess, blockPos)) return false;
        RandomSource random = context.random();
        int age = random.nextInt(8);
        if (blockState.getBlock() instanceof TallCropBlock) {
            if (!structureWorldAccess.isEmptyBlock(blockPos.above())) return false;
            structureWorldAccess.setBlock(blockPos, blockState.setValue(TallCropBlock.AGE, age).setValue(TallCropBlock.HALF, DoubleBlockHalf.LOWER), 2);
            if (age >= 4) {
                structureWorldAccess.setBlock(blockPos.above(), blockState.setValue(TallCropBlock.AGE, age).setValue(TallCropBlock.HALF, DoubleBlockHalf.UPPER), 2);
            }
        } else {
            structureWorldAccess.setBlock(blockPos, blockState.setValue(CropBlock.AGE, age), 2);
        }
        return true;
    }
}