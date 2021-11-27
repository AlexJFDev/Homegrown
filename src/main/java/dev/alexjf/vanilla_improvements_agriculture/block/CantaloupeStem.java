package dev.alexjf.vanilla_improvements_agriculture.block;

import java.util.function.Supplier;

import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.item.Item;

public class CantaloupeStem extends StemBlock{

    protected CantaloupeStem(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
    
}
