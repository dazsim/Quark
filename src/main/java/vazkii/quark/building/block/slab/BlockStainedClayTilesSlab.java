/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 *
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 *
 * File Created @ [20/03/2016, 18:31:18 (GMT)]
 */
package vazkii.quark.building.block.slab;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import vazkii.quark.base.block.BlockModSlab;
import vazkii.quark.building.block.BlockStainedClayTiles;

public class BlockStainedClayTilesSlab extends BlockModSlab {

	public BlockStainedClayTilesSlab(BlockStainedClayTiles.Variants variant, boolean doubleSlab) {
		super(variant.getName() + "_slab", Material.ROCK, doubleSlab);
		setHardness(1.25F);
		setResistance(7.0F);
		setSoundType(SoundType.STONE);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override
	public MapColor getMapColor(IBlockState state) {
		return MapColor.ADOBE;
	}

}
