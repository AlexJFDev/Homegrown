package dev.alexjf.homegrown.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;

public class CantaloupeBlock extends GourdBlock {
	protected CantaloupeBlock(AbstractBlock.Settings settings) {
		super(settings);
	}

	public StemBlock getStem() {
		return (StemBlock)HomegrownBlocks.CANTALOUPE_STEM;
	}

	public AttachedStemBlock getAttachedStem() {
		return (AttachedStemBlock)HomegrownBlocks.ATTACHED_CANTALOUPE_STEM;
	}
}