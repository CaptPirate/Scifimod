package com.ubalube.scifiaddon.proxy;

import com.ubalube.scifiaddon.entities.ModEntities;
import com.ubalube.scifiaddon.util.Reference;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
	public static void preInit(FMLPreInitializationEvent e)
	{
		ModEntities.loadRenderers();
	}

	public void registerItemRender(Item item, int meta, String id) 
	{
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
		
	}
	
	@Override
    public void registerVariantRenderer(Item item, int meta, String filename, String id) 
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, filename), id));
    }
}
