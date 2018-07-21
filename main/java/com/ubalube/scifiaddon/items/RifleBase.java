package com.ubalube.scifiaddon.items;

import com.ubalube.scifiaddon.main;
import com.ubalube.scifiaddon.init.ModItems;
import com.ubalube.scifiaddon.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class RifleBase extends Item implements IHasModel 
{
	
	
	public RifleBase(String name, int StackSize, CreativeTabs tab) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(StackSize);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRender(this, 0, "inventory");
		
	}
}
