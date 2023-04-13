package dev.alexjf.homegrown.world.gen.blockpredicate;

public class HomegrownBlockPredicateType {} // disabled for now
/*import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.blockpredicate.BlockPredicateType;

public interface HomegrownBlockPredicateType<P extends BlockPredicate> {
    public static final String MOD_ID = "homegrown";
    public static final BlockPredicateType<AlwaysFalseBlockPredicate> FALSE = () -> AlwaysFalseBlockPredicate.CODEC;
    

    public static void init() {
        HomegrownBlockPredicateType.register(MOD_ID, "false", FALSE);
    }

    private static <P extends BlockPredicate> BlockPredicateType<P> register(String namespace, String id, BlockPredicateType<P> blockPredicateType) {
        return Registry.register(Registries.BLOCK_PREDICATE_TYPE, namespace + ":" + id, blockPredicateType);
    }
}*/
