package com.ubalube.scifiaddon.init;

import com.ubalube.scifiaddon.blocks.BlockBase;
import com.ubalube.scifiaddon.blocks.Redstonemachine;
import com.ubalube.scifiaddon.util.ItemHelper;

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
	
	public static Block Redstonemachine = new Redstonemachine("redstonemachine", Material.IRON, null, 4.0F);
	public static Block Redstonemachine_Off = new Redstonemachine("redstonemachine_off", Material.IRON, CreativeTabs.REDSTONE, 4.0F);

	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> e)
	{
		e.getRegistry().register(Redstonemachine);
		e.getRegistry().register(Redstonemachine_Off);
	}

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> e)
	{
		e.getRegistry().register((new ItemBlock(Redstonemachine)).setRegistryName(Redstonemachine.getRegistryName()));
		e.getRegistry().register((new ItemBlock(Redstonemachine_Off)).setRegistryName(Redstonemachine_Off.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onRegisterModels(ModelRegistryEvent e)
	{
		ItemHelper.registerItemModel(Item.getItemFromBlock(Redstonemachine), "sfa", "redstonemachine");
		ItemHelper.registerItemModel(Item.getItemFromBlock(Redstonemachine_Off), "sfa", "redstonemachine_off");
	}
}
