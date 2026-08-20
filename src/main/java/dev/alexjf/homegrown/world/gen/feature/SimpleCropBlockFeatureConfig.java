package dev.alexjf.homegrown.world.gen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public record SimpleCropBlockFeatureConfig(BlockStateProvider toPlace) implements FeatureConfiguration {
   public static final Codec<SimpleCropBlockFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> {
         return instance.group(BlockStateProvider.CODEC.fieldOf("to_place").forGetter((config) -> {
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