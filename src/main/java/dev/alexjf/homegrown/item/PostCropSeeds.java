package dev.alexjf.homegrown.item;

import dev.alexjf.homegrown.block.PostCropBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;

public class PostCropSeeds extends Item{
    private PostCropBlock block;

    public PostCropSeeds(PostCropBlock block, Settings settings) {
        super(settings);
        this.block = block;
     }

    public BlockState getCrop() {
        return block.getDefaultState();
    }
}
