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
 
 public class Redstonemachine extends Block 
 {
 	
 	int amt;
 	
 	public Redstonemachine(String name, Material material, CreativeTabs tab, float Hardness) 
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
 		
 		
 		
 		if(worldIn.isBlockPowered(pos))
 		{
 			if(handitem.getItem() == Items.DIAMOND || handitem.getItem() == Items.EMERALD || handitem.getItem() == Items.IRON_INGOT 
 					|| handitem.getItem() == Items.GOLD_INGOT || handitem.getItem() == Items.COAL || handitem.getItem() == Items.POTATO)
 			{
 				
 				if(handitem.getItem() == Items.DIAMOND)
 				{
 					amt = 10;
 				}
 				else 
 				{
 					if(handitem.getItem() == Items.EMERALD)
 					{
 						amt = 20;
 					}
 					else
 					{
 						if(handitem.getItem() == Items.IRON_INGOT)
 						{
 							amt = 5;
 						}
 						else
 						{
 							if(handitem.getItem() == Items.GOLD_INGOT)
 							{
 								amt = 8;
 							}
 							else
 							{
 								if(handitem.getItem() == Items.COAL)
 								{
 									amt = 3;
 								}
 								else
 								{
 									if(handitem.getItem() == Items.POTATO)
 									{
 										amt = 1;
 									}
 								}
 							}
 						}
 					}
 				}
 				
 				playerIn.inventory.clearMatchingItems(handitem.getItem(), -1, 1, null);
 				playerIn.inventory.addItemStackToInventory(new ItemStack(Items.REDSTONE, amt));
 			}
 		}
 		
 		
 		return true;
 	}
 	
 	@Override
     public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
         super.neighborChanged(state, world, pos, neighborBlock, fromPos);
         int x = pos.getX();
         int y = pos.getY();
         int z = pos.getZ();
         EntityPlayer entity = Minecraft.getMinecraft().player;
         if (world.isBlockPowered(new BlockPos(x, y, z))) 
         {
             world.setBlockState(new BlockPos(x, y, z), ModBlocks.Redstonemachine.getDefaultState(), 3);
        }
        else
        {
        	world.setBlockState(new BlockPos(x, y, z), ModBlocks.Redstonemachine_Off.getDefaultState(), 3);
        }
    }
}