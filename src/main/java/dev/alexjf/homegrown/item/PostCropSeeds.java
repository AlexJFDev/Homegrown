package dev.alexjf.homegrown.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class PostCropSeeds extends Item{
    private Block block;

    public PostCropSeeds(Block block, net.minecraft.world.item.Item.Properties settings) {
        super(settings);
        this.block = block;
     }

    public BlockState getCrop() {
        return block.defaultBlockState();
    }
}
