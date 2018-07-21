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

    @Override
    public void renderByItem(ItemStack stack, float partialTicks)
    {
        ModelRifle MODEL = new ModelRifle();

        GlStateManager.pushMatrix();
        GlStateManager.translate(0.5F, 1.8F, 0.5F);
        GlStateManager.scale(-1, -1, -1);
        GlStateManager.disableCull();
        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
        MODEL.renderModel(0.0625F);
        GlStateManager.popMatrix();
    }
}
