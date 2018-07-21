package com.ubalube.scifiaddon.init;

import com.ubalube.scifiaddon.blocks.BlockBase;
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
	public static Block TEST = new BlockBase("test", Material.IRON, CreativeTabs.DECORATIONS, 2);

	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> e)
	{
		e.getRegistry().register(TEST);
	}

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> e)
	{
		e.getRegistry().register((new ItemBlock(TEST)).setRegistryName(TEST.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onRegisterModels(ModelRegistryEvent e)
	{
		ItemHelper.registerItemModel(Item.getItemFromBlock(TEST), "sfa", "test");
	}
}
