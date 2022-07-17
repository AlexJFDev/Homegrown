package dev.alexjf.homegrown.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;

public class PostCropSeeds extends Item{
    private Block block;

    public PostCropSeeds(Block block, Settings settings) {
        super(settings);
        this.block = block;
     }

    public BlockState getCrop() {
        return block.getDefaultState();
    }
}
