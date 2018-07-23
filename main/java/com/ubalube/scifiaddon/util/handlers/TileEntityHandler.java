package com.ubalube.scifiaddon.util.handlers;

import com.ubalube.scifiaddon.blocks.TileEntityHarvestor;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityHarvestor.class, "harvestor");
	}
}
