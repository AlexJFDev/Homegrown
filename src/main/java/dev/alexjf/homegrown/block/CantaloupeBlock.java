package dev.alexjf.homegrown.block;

import net.minecraft.world.level.block.AttachedStemBlock;
import net.minecraft.world.level.block.PumpkinBlock;
import net.minecraft.world.level.block.StemBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class CantaloupeBlock extends PumpkinBlock {
	protected CantaloupeBlock(BlockBehaviour.Properties settings) {
		super(settings);
	}

	public StemBlock getStem() {
		return (StemBlock)HomegrownBlocks.CANTALOUPE_STEM;
	}

	public AttachedStemBlock getAttachedStem() {
		return (AttachedStemBlock)HomegrownBlocks.ATTACHED_CANTALOUPE_STEM;
	}
}