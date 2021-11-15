package dev.alexjf.vanilla_improvements_agriculture;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;

public class CantaloupeBlock extends GourdBlock {
	protected CantaloupeBlock(AbstractBlock.Settings settings) {
		super(settings);
	}

	public StemBlock getStem() {
		return (StemBlock)VanillaImprovementsAgriculture.CANTALOUPE_STEM;
	}

	public AttachedStemBlock getAttachedStem() {
		return (AttachedStemBlock)VanillaImprovementsAgriculture.ATTACHED_CANTALOUPE_STEM;
	}
}

