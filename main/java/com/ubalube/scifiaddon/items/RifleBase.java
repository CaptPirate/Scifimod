package com.ubalube.scifiaddon.items;

import com.ubalube.scifiaddon.entities.EntityBullet;
import com.ubalube.scifiaddon.init.ModItems;
import com.ubalube.scifiaddon.main;
import com.ubalube.scifiaddon.util.IHasModel;
import com.ubalube.scifiaddon.util.handlers.SoundHandler;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RifleBase extends Item implements IHasModel
{
	public boolean soundshoot = false;
	
	public RifleBase(String name, int StackSize, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(StackSize);
		
		ModItems.ITEMS.add(this);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (!playerIn.capabilities.isCreativeMode)
		{
			itemstack.damageItem(1, playerIn);
			soundshoot = true;
		}

		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, SoundHandler.GUN_FIRE_PLASMA, SoundCategory.NEUTRAL, 0.5F, 1F / (itemRand.nextFloat() * 0.4F + 0.8F));
		playerIn.getCooldownTracker().setCooldown(this, 8);
		if (!worldIn.isRemote)
		{
			EntityBullet entity = new EntityBullet(worldIn, playerIn, 7.0F);
			entity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 0.0F);
			worldIn.spawnEntity(entity);
		}

		playerIn.addStat(StatList.getObjectUseStats(this));
		return new ActionResult(EnumActionResult.SUCCESS, itemstack);
	}
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRender(this, 0, "inventory");
	}
}
