package dev.alexjf.homegrown.world.gen.blockpredicate;

public class MatchingAnyBlockPredicate {} // disabled for now
/* 

import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.Block;
import net.minecraft.command.argument.BlockPredicateArgumentType.BlockPredicate;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.gen.blockpredicate.OffsetPredicate;

public class MatchingAnyBlockPredicate
implements BlockPredicate {
    private final RegistryEntryList<Block> blocks;
    private final RegistryEntryList<TagKey<Block>> blockTags;
    private final RegistryEntryList<Fluid> fluids;
    private final RegistryEntryList<TagKey<Fluid>> fluidTags;
    public static final Codec<MatchingAnyBlockPredicate> CODEC = RecordCodecBuilder.create(instance -> MatchingAnyBlockPredicate.registerOffsetField(instance).and(((MapCodec)TagKey.unprefixedCodec(RegistryKeys.BLOCK).fieldOf("tag")).forGetter(predicate -> predicate.tag)).apply((Applicative<MatchingAnyBlockPredicate, ?>)instance, MatchingAnyBlockPredicate::new));
    

}*/