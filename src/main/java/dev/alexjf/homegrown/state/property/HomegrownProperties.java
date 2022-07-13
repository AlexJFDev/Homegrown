package dev.alexjf.homegrown.state.property;

import dev.alexjf.homegrown.block.enums.PostType;
import net.minecraft.state.property.EnumProperty;

public class HomegrownProperties {
    public static final EnumProperty<PostType> POST_TYPE = EnumProperty.of("type", PostType.class);
}
