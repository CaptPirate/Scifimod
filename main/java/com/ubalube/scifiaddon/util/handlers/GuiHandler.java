package com.ubalube.scifiaddon.util.handlers;

import com.ubalube.scifiaddon.blocks.ContainerHarvestor;
import com.ubalube.scifiaddon.blocks.GuiHarvestor;
import com.ubalube.scifiaddon.blocks.TileEntityHarvestor;
import com.ubalube.scifiaddon.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_Harvestor) return new ContainerHarvestor(player.inventory, (TileEntityHarvestor)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_Harvestor) return new GuiHarvestor(player.inventory, (TileEntityHarvestor)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}
