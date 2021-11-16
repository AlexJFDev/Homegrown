package dev.alexjf.vanilla_improvements_agriculture.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dev.alexjf.vanilla_improvements_agriculture.PostBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.PistonExtensionBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

@Mixin(FarmlandBlock.class)
public class FarmlandBlockMixin{
	@Inject(method = "canPlaceAt", at = @At("RETURN"), cancellable = true)
    protected void onCanPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
        System.out.println("test");
        BlockState blockState = world.getBlockState(pos.up());
        cir.setReturnValue(!blockState.getMaterial().isSolid() || blockState.getBlock() instanceof FenceGateBlock || blockState.getBlock() instanceof PostBlock ||blockState.getBlock() instanceof PistonExtensionBlock);
    }
}
