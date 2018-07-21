package com.ubalube.scifiaddon.init;

import com.ubalube.scifiaddon.items.GuideBook;
import com.ubalube.scifiaddon.items.RifleBase;
import com.ubalube.scifiaddon.util.ItemHelper;
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
	//You wouldn't be needing IHasModel with this
	//RIFLE is the Name given.
	public static Item RIFLE;
	public static Item infotablet;

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> e)
	{
		//e.getRegistry().register(); <-- That is basically the base of it all, just add that and then the Name given inside the ().
		e.getRegistry().register(RIFLE);
		e.getRegistry().register(infotablet);
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onRegisterModels(ModelRegistryEvent e)
	{
		//ItemHelper.registerItemModel(); <-- That is the base, First goes the Name Given, then the modid, I think you can just do Reference.MOD_IDm and the end is the name
		//The Item Renderer is me testing something, but it still doesn't work.
		ItemHelper.registerItemModel(RIFLE, "sfa", "rifle");
		ItemHelper.registerItemModel(infotablet, "sfa", "infotablet");
	}

	static
	{
		//You should recognize this this
		RIFLE = new RifleBase("rifle", 1, CreativeTabs.COMBAT);
		infotablet = new GuideBook("infotablet", 1, CreativeTabs.MATERIALS);
	}
}
