package dev.alexjf.homegrown.block;

import java.util.function.Supplier;

import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.item.Item;

public class HomegrownStemBlock extends StemBlock{

    protected HomegrownStemBlock(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
    
}
