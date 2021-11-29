package dev.alexjf.vanilla_improvements_agriculture.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dev.alexjf.vanilla_improvements_agriculture.block.PostBlock;
import dev.alexjf.vanilla_improvements_agriculture.block.PostCropBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;

@Mixin(FarmlandBlock.class)
public class FarmlandBlockMixin{
	@Inject(method = "canPlaceAt", at = @At("RETURN"), cancellable = true)
    protected void onCanPlaceAt(BlockState state, WorldView world, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
        BlockState blockState = world.getBlockState(pos.up());
        if(blockState.getBlock() instanceof PostBlock || blockState.getBlock() instanceof PostCropBlock){
            cir.setReturnValue(true);
        }
    }
}
