package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.item.Item;

public class PostCropSeeds extends Item{
    private final PostCropBlock block;

    public PostCropSeeds(PostCropBlock block, Settings settings) {
        super(settings);
        this.block = block;
     }

     public PostCropBlock getPostCropBlock(){
         return block;
     }
}
