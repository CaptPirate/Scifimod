package com.ubalube.scifiaddon.client.render;

import com.ubalube.scifiaddon.client.models.ModelPlasma;
import com.ubalube.scifiaddon.entities.EntityBullet;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderPlasma extends Render<EntityBullet>
{
    public static final ModelPlasma MODEL = new ModelPlasma();
    public static final ResourceLocation TEX = new ResourceLocation("sfa", "textures/models/plasma.png");

    public RenderPlasma(RenderManager renderManager)
    {
        super(renderManager);
    }

    @Override
    public void doRender(EntityBullet entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        this.bindEntityTexture(entity);
        GlStateManager.pushMatrix();
        GlStateManager.disableLighting();
        GlStateManager.enableLighting();
        GlStateManager.popMatrix();
        MODEL.renderModel(0.0625F);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityBullet entity)
    {
        return TEX;
    }
}
