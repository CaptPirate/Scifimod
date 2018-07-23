package com.ubalube.scifiaddon.blocks;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotHarvestorFuel extends Slot
{
	public SlotHarvestorFuel(IInventory inventory, int index, int x, int y) 
	{
		
		
		
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		return TileEntityHarvestor.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return super.getItemStackLimit(stack);
	}
	
}
