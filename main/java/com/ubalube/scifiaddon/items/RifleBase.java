package com.ubalube.scifiaddon.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RifleBase extends Item
{
	public RifleBase(String name, int StackSize, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(StackSize);
	}
}
