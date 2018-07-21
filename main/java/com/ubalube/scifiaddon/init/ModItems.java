package com.ubalube.scifiaddon.init;

import java.util.ArrayList;
import java.util.List;

import com.ubalube.scifiaddon.items.ItemBase;

import com.ubalube.scifiaddon.items.ItemRendererRifle;
import com.ubalube.scifiaddon.util.ItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
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

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> e)
	{
		//e.getRegistry().register(); <-- That is basically the base of it all, just add that and then the Name given inside the ().
		e.getRegistry().register(RIFLE);
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onRegisterModels(ModelRegistryEvent e)
	{
		//ItemHelper.registerItemModel(); <-- That is the base, First goes the Name Given, then the modid, I think you can just do Reference.MOD_IDm and the end is the name
		//The Item Renderer is me testing something, but it still doesn't work.
		//RIFLE.setTileEntityItemStackRenderer(new ItemRendererRifle());
		ItemHelper.registerItemModel(RIFLE, "sfa", "rifle");
	}

	static
	{
		//You should recognize this this
		RIFLE = new ItemBase("rifle", 1, CreativeTabs.COMBAT);
	}
}
