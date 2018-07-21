package com.ubalube.scifiaddon.proxy;

import com.ubalube.scifiaddon.gui.TutorialBook;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;

public class CommonProxy 
{
	public void registerItemRender(Item item, int meta, String id) {}
	
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	
	public void openMyGui()
	{
		Minecraft.getMinecraft().displayGuiScreen(new TutorialBook());
	}
	
}
