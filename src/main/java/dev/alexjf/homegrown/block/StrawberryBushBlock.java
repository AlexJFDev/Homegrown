package dev.alexjf.homegrown.block;

import dev.alexjf.homegrown.item.HomegrownItems;
import net.minecraft.item.Item;

public class StrawberryBushBlock 
extends BerryBushBlock {
    public StrawberryBushBlock(Settings settings) {
        super(settings);
    }
    
    public Item getBerriesItem() {
        return HomegrownItems.STRAWBERRIES;
    }
}
