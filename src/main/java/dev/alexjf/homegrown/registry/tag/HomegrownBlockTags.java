package dev.alexjf.homegrown.registry.tag;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public final class HomegrownBlockTags {
    public static final TagKey<Block> BURNING_BUSH_PLANTABLE_ON = HomegrownBlockTags.of("burning_bush_plantable_on");

    private HomegrownBlockTags() {
    }

    private static TagKey<Block> of(String id) {
        return TagKey.create(Registries.BLOCK, Identifier.parse("homegrown:" + id));
    }
}
