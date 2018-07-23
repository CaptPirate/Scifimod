package com.ubalube.scifiaddon.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.scifiaddon.items.GuideBook;
import com.ubalube.scifiaddon.items.ItemBase;
import com.ubalube.scifiaddon.items.RifleBase;
import com.ubalube.scifiaddon.util.helper.ItemHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid = "sfa")
public class ModItems 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item RIFLE = new RifleBase("rifle", 1, CreativeTabs.COMBAT);
	public static final Item RIFLE1 = new RifleBase("rifle1", 1, CreativeTabs.COMBAT);
	public static final Item infotablet = new ItemBase("infotablet", 1, CreativeTabs.MATERIALS);
	
	//Items
	public static final Item branch = new ItemBase("branch", 64, CreativeTabs.MATERIALS);
	public static final Item Void = new ItemBase("void", 64, CreativeTabs.MATERIALS);
}
