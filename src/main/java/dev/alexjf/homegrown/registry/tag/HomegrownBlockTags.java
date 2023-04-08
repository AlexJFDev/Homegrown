package dev.alexjf.homegrown.registry.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class HomegrownBlockTags {
    public static final TagKey<Block> BURNING_BUSH_PLANTABLE_ON = HomegrownBlockTags.of("burning_bush_plantable_on");

    private HomegrownBlockTags() {
    }

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier("homegrown:" + id));
    }
}
