package dev.alexjf.vanilla_improvements_agriculture.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;

public class CantaloupeBlock extends GourdBlock {
	protected CantaloupeBlock(AbstractBlock.Settings settings) {
		super(settings);
	}

	public StemBlock getStem() {
		return (StemBlock)BlockRegistry.CANTALOUPE_STEM;
	}

	public AttachedStemBlock getAttachedStem() {
		return (AttachedStemBlock)BlockRegistry.ATTACHED_CANTALOUPE_STEM;
	}
}