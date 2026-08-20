package dev.alexjf.homegrown.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import dev.alexjf.homegrown.block.PostBlock;
import dev.alexjf.homegrown.block.PostCropBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.FarmlandBlock;
import net.minecraft.world.level.block.state.BlockState;

@Mixin(FarmlandBlock.class)
public class FarmlandBlockMixin{
	@Inject(method = "canSurvive", at = @At("RETURN"), cancellable = true)
    protected void onCanPlaceAt(BlockState state, LevelReader world, BlockPos pos, CallbackInfoReturnable<Boolean> cir){
        BlockState blockState = world.getBlockState(pos.above());
        if(blockState.getBlock() instanceof PostBlock || blockState.getBlock() instanceof PostCropBlock){
            cir.setReturnValue(true);
        }
    }
}
