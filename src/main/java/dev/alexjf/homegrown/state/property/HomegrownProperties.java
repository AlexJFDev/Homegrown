package dev.alexjf.homegrown.state.property;

import dev.alexjf.homegrown.block.enums.Dormant;
import dev.alexjf.homegrown.block.enums.PostType;
import net.minecraft.world.level.block.state.properties.EnumProperty;

public class HomegrownProperties {
    public static final EnumProperty<PostType> POST_TYPE = EnumProperty.create("type", PostType.class);
    public static final EnumProperty<Dormant> DORMANT = EnumProperty.create("dormant", Dormant.class);
}
