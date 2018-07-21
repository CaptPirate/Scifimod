package com.ubalube.scifiaddon.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * BulletPlasma - SmellyModder
 * Created using Tabula 7.0.0
 */
public class ModelPlasma extends ModelBase
{
    public ModelRenderer MainBullet;
    public ModelRenderer SideBulletI;
    public ModelRenderer SideBulletII;
    public ModelRenderer SideBulletIII;
    public ModelRenderer SideBulletIV;
    public ModelRenderer SideBulletV;
    public ModelRenderer SideBulletVI;

    public ModelPlasma()
    {
        this.textureWidth = 32;
        this.textureHeight = 32;
        this.SideBulletIII = new ModelRenderer(this, 17, 0);
        this.SideBulletIII.setRotationPoint(-1.0F, 20.0F, 0.0F);
        this.SideBulletIII.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(SideBulletIII, 0.0F, 2.231054382824351F, 0.0F);
        this.SideBulletVI = new ModelRenderer(this, 17, 0);
        this.SideBulletVI.setRotationPoint(0.0F, 18.7F, 1.45F);
        this.SideBulletVI.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(SideBulletVI, 0.0F, 1.593485607070823F, 0.0F);
        this.SideBulletII = new ModelRenderer(this, 17, 0);
        this.SideBulletII.setRotationPoint(1.0F, 20.0F, 0.0F);
        this.SideBulletII.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(SideBulletII, 0.0F, 0.8196066167365371F, 0.0F);
        this.SideBulletIV = new ModelRenderer(this, 17, 0);
        this.SideBulletIV.setRotationPoint(0.0F, 21.3F, 1.45F);
        this.SideBulletIV.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(SideBulletIV, 0.0F, 1.593485607070823F, 0.0F);
        this.SideBulletV = new ModelRenderer(this, 17, 0);
        this.SideBulletV.setRotationPoint(1.5F, 20.0F, 2.75F);
        this.SideBulletV.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(SideBulletV, 0.0F, 2.231054382824351F, 0.0F);
        this.MainBullet = new ModelRenderer(this, 0, 0);
        this.MainBullet.setRotationPoint(-1.0F, 20.0F, 0.0F);
        this.MainBullet.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.SideBulletI = new ModelRenderer(this, 17, 0);
        this.SideBulletI.setRotationPoint(-1.5F, 20.0F, 2.65F);
        this.SideBulletI.addBox(0.0F, 0.0F, 0.0F, 1, 2, 0, 0.0F);
        this.setRotateAngle(SideBulletI, 0.0F, 0.9560913642424937F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
        this.SideBulletIII.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
        this.SideBulletVI.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
        this.SideBulletII.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
        this.SideBulletIV.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
        this.SideBulletV.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.5F);
        this.MainBullet.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
        this.SideBulletI.render(f5);
        GlStateManager.disableBlend();
    }

    public void renderModel(float f)
    {
        this.SideBulletIII.render(f);
        this.SideBulletVI.render(f);
        this.SideBulletII.render(f);
        this.SideBulletIV.render(f);
        this.SideBulletV.render(f);
        this.MainBullet.render(f);
        this.SideBulletI.render(f);
    }
    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
