package com.ubalube.scifiaddon.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.scifiaddon.blocks.GunTable;
import com.ubalube.scifiaddon.blocks.Redstonemachine;
import com.ubalube.scifiaddon.blocks.Harvestor;
import com.ubalube.scifiaddon.util.helper.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = "sfa")
public class ModBlocks 
{
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block Redstonemachine = new Redstonemachine("redstonemachine", Material.ANVIL, null, 4.0F);
	public static final Block Redstonemachine_Off = new Redstonemachine("redstonemachine_off", Material.ANVIL, CreativeTabs.REDSTONE, 4.0F);
	
	public static final Block Guntable = new GunTable("guntable", Material.ANVIL, CreativeTabs.REDSTONE, 4.0F);
	public static final Block Harvestor = new Harvestor("harvestor", Material.ANVIL, CreativeTabs.REDSTONE, 4.0F);
}
