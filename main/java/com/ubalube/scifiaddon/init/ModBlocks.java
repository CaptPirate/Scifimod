package com.ubalube.scifiaddon.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.scifiaddon.blocks.BlockBase;
import com.ubalube.scifiaddon.blocks.machines.Redstonemachine;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	//---------- BLOCKS ------------
	
	public static final Block RedstoneMachine = new Redstonemachine("redstonemachine", Material.IRON, null, 4.0F);
	public static final Block RedstoneMachine_Off = new Redstonemachine("redstonemachine_off", Material.IRON, CreativeTabs.REDSTONE, 4.0F);
}
