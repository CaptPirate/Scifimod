package com.ubalube.scifiaddon.util;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHelper
{
    @SideOnly(Side.CLIENT)
    public static void registerItemModel(Item item, int meta, ModelResourceLocation loc)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, loc);
        ModelBakery.registerItemVariants(item, loc);
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModel(Item item, int meta, String modid, String loc)
    {
        registerItemModel(item, meta, new ModelResourceLocation(new ResourceLocation(modid, loc), "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemModel(Item item, String modid, String loc)
    {
        registerItemModel(item, 0, modid, loc);
    }
}
