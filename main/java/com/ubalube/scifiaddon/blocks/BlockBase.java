package com.ubalube.scifiaddon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block
{
	public BlockBase(String name, Material material, CreativeTabs tab, float Hardness) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(Hardness);
	}

}
