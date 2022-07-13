package dev.alexjf.homegrown.block;

import java.util.function.Supplier;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.item.Item;

public class HomegrownAttachedStemBlock extends AttachedStemBlock{
    protected HomegrownAttachedStemBlock(GourdBlock cantaloupeBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(cantaloupeBlock, pickBlockItem, settings);
    }
}
