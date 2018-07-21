package com.ubalube.scifiaddon.items;

import com.ubalube.scifiaddon.util.ModelRifle;
import com.ubalube.scifiaddon.util.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityItemStackRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemRendererRifle extends TileEntityItemStackRenderer
{
    //TODO Make it work
    public static ModelRifle MODEL = new ModelRifle();
    public static ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/models/rifle.png");

    public ItemRendererRifle() {
    }

    @Override
    public void renderByItem(ItemStack stack, float partialTicks)
    {
        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
        GlStateManager.translate(.5, .5, .5);
        MODEL.renderModel(0.0625F);
    }
}
