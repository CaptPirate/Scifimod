package com.ubalube.scifiaddon.blocks;
 
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Random;
 
 import com.ubalube.scifiaddon.main;
 import com.ubalube.scifiaddon.init.ModBlocks;
 import com.ubalube.scifiaddon.init.ModItems;
 import net.minecraft.block.Block;
 import net.minecraft.block.BlockDaylightDetector;
 import net.minecraft.block.BlockFalling;
 import net.minecraft.block.BlockFurnace;
 import net.minecraft.block.BlockPistonBase;
 import net.minecraft.block.material.Material;
 import net.minecraft.block.state.BlockStateContainer;
 import net.minecraft.block.state.IBlockState;
 import net.minecraft.client.Minecraft;
 import net.minecraft.creativetab.CreativeTabs;
 import net.minecraft.entity.EntityLivingBase;
 import net.minecraft.entity.player.EntityPlayer;
 import net.minecraft.init.Blocks;
 import net.minecraft.init.Items;
 import net.minecraft.item.Item;
 import net.minecraft.item.ItemBlock;
 import net.minecraft.item.ItemStack;
 import net.minecraft.util.EnumFacing;
 import net.minecraft.util.EnumHand;
 import net.minecraft.util.math.BlockPos;
 import net.minecraft.world.World;
 import net.minecraftforge.fml.relauncher.Side;
 import net.minecraftforge.fml.relauncher.SideOnly;
 
 public class GunTable extends Block 
 {
 	
 	int amt;
 	
 	public GunTable(String name, Material material, CreativeTabs tab, float Hardness) 
 	{
 		super(material);
 		setUnlocalizedName(name);
 		setRegistryName(name);
 		setCreativeTab(tab);
 		setHardness(Hardness);
 	}
 	
 	@Override
 	@SideOnly(Side.CLIENT)
 	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
 			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
 	{
 		ItemStack handitem = playerIn.getHeldItemMainhand();
 			
 		//Info Tablet Stuff
 		if(handitem.getItem() == ModItems.infotablet)
 		{
 			main.proxy.openInfoGunTable();
 		}
 		
 		
 		return true;
 	}
}