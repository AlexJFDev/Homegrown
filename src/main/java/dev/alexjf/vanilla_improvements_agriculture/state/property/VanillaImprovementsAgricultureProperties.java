package dev.alexjf.vanilla_improvements_agriculture.state.property;

import dev.alexjf.vanilla_improvements_agriculture.block.enums.PostType;
import net.minecraft.state.property.EnumProperty;

public class VanillaImprovementsAgricultureProperties {
    public static final EnumProperty<PostType> POST_TYPE = EnumProperty.of("type", PostType.class);
}
