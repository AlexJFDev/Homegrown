package dev.alexjf.homegrown.world.gen.blockpredicate;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.blockpredicate.BlockPredicateType;

class AlwaysFalseBlockPredicate
implements BlockPredicate {
    public static AlwaysFalseBlockPredicate instance = new AlwaysFalseBlockPredicate();
    public static final Codec<AlwaysFalseBlockPredicate> CODEC = Codec.unit(() -> instance);

    private AlwaysFalseBlockPredicate() {
    }

    @Override
    public boolean test(StructureWorldAccess structureWorldAccess, BlockPos blockPos) {
        return false;
    }

    @Override
    public BlockPredicateType<?> getType() {
        return HomegrownBlockPredicateType.FALSE;
    }
}
