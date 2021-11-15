package dev.alexjf.vanilla_improvements_agriculture;

import java.util.function.Supplier;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.item.Item;

public class AttachedCantaloupeStem extends AttachedStemBlock{

    protected AttachedCantaloupeStem(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
    
}
