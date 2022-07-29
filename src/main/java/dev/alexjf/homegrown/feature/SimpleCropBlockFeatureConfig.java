package dev.alexjf.homegrown.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public record SimpleCropBlockFeatureConfig(BlockStateProvider toPlace) implements FeatureConfig {
   public static final Codec<SimpleCropBlockFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
         return instance.group(BlockStateProvider.TYPE_CODEC.fieldOf("to_place").forGetter((config) -> {
         return config.toPlace;
      })).apply(instance, SimpleCropBlockFeatureConfig::new);
   });
 
   public SimpleCropBlockFeatureConfig(BlockStateProvider toPlace) {
      this.toPlace = toPlace;
   }
 
   public BlockStateProvider toPlace() {
      return this.toPlace;
   }
}
