package com.ubalube.scifiaddon.client.gui;

import org.lwjgl.opengl.GL11;

import com.ubalube.scifiaddon.util.Reference;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

public class RedstoneMachine extends GuiScreen
{
private final int bookImageHeight = 192;
private final int bookImageWidth = 192;
private int currPage = 0;
private static final int bookTotalPages = 4;
private static ResourceLocation[] bookPageTextures = 
      new ResourceLocation[bookTotalPages];
private static String[] stringPageText = new String[bookTotalPages];

public RedstoneMachine()
{
    bookPageTextures[0] = new ResourceLocation(
          Reference.MOD_ID+":textures/gui/page1.png");
}

/**
 * Adds the buttons (and other controls) to the screen in question.
 */
@Override
public void initGui() 
{
}

/**
 * Called from the main game loop to update the screen.
 */
@Override
public void updateScreen() 
{
}

/**
 * Draws the screen and all the components in it.
 */
@Override
public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
{
    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    
    mc.getTextureManager().bindTexture(bookPageTextures[0]);
    int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
    drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, bookImageWidth, 
          bookImageHeight);
    int widthOfString;

}

/**
 * Called when a mouse button is pressed and the mouse is moved around. 
 * Parameters are : mouseX, mouseY, lastButtonClicked & 
 * timeSinceMouseClick.
 */
@Override
protected void mouseClickMove(int parMouseX, int parMouseY, 
      int parLastButtonClicked, long parTimeSinceMouseClick) 
{
 
}

@Override
protected void actionPerformed(GuiButton parButton) 
{
}

/**
 * Called when the screen is unloaded. Used to disable keyboard repeat 
 * events
 */
@Override
public void onGuiClosed() 
{
 
}

/**
 * Returns true if this GUI should pause the game when it is displayed in 
 * single-player
 */
@Override
public boolean doesGuiPauseGame()
{
    return false;
}
}
