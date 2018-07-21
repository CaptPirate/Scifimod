package com.ubalube.scifiaddon.items;

import java.util.Set;

import com.ubalube.scifiaddon.entities.EntityBullet;
import com.ubalube.scifiaddon.util.handlers.SoundHandler;

import net.minecraft.client.audio.Sound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.world.World;

public class RifleBase extends Item
{
	public boolean soundshoot = false;
	
	public RifleBase(String name, int StackSize, CreativeTabs tab)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(StackSize);
	}

	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack itemstack = playerIn.getHeldItem(handIn);
		if (!playerIn.capabilities.isCreativeMode)
		{
			itemstack.damageItem(1, playerIn);
			soundshoot = true;
		}

		playerIn.getCooldownTracker().setCooldown(this, 10);
		if (!worldIn.isRemote)
		{
			EntityBullet entity = new EntityBullet(worldIn, playerIn, 5.0F);
			entity.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 3F, 0.0F);
			worldIn.spawnEntity(entity);
		}

		playerIn.addStat(StatList.getObjectUseStats(this));
		return new ActionResult(EnumActionResult.SUCCESS, itemstack);
	}
}
