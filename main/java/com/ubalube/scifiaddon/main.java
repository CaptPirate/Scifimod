package com.ubalube.scifiaddon;

import java.awt.Dimension;

import com.ubalube.scifiaddon.entities.EntityBullet;
import com.ubalube.scifiaddon.init.ModItems;
import com.ubalube.scifiaddon.proxy.CommonProxy;
import com.ubalube.scifiaddon.util.Reference;
import com.ubalube.scifiaddon.util.handlers.SoundHandler;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class main 
{
	@Instance
	public static main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;

	public static ModItems ITEMS = new ModItems();
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent e) 
	{
		//EntityInit.registerEntities();
		//RenderHandler.registerEntityRenders();

		//RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, ::new);

		MinecraftForge.EVENT_BUS.register(ITEMS);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) 
	{
		SoundHandler.registerSounds();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent e) 
	{
		
	}
}
