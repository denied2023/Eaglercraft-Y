@@ -34,6 +34,7 @@
import java.awt.*;
import java.io.*;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
@@ -493,7 +494,7 @@ public final void run() {
                                             GL11.glDepthFunc(513);
                                             tessellator.startDrawing(7);

                                             for(var114 = 0; var114 < 6; ++var114) {
                                             for(var114 = 0; var114 < 6; ++var114) {
                                                Block.blocks[var104].renderInside(var99, var98, var105, var114);
                                             }

@@ -1015,6 +1016,14 @@ private void onMouseClick(int var1) {
   public static boolean hasBeenInitialized = false;

   public void tick() {

	  //Skid-prevention
	  if(this.level != null && this.levelLoaded) {
		  if(!new String(hud.byte1).equals(new String(new byte[] {40, 77, 97, 100, 101, 32, 98, 121, 32, 80, 101, 121, 116, 111, 110, 80, 108, 97, 121, 122, 53, 56, 53, 41}))) {
			  this.setCurrentScreen(new ErrorScreen(">:)", "You fucking skid"));
	  	  }
	  }

	  if(!settings.gamemode && settings.mobSpawns) {
		  this.gamemode.spawnMob();
	  }
  4 changes: 2 additions & 2 deletions4  
src/teavm/java/com/mojang/minecraft/gui/HUDScreen.java
@@ -23,6 +23,7 @@ public final class HUDScreen extends Screen {
   private int height;
   public String hoveredPlayer = null;
   public int ticks = 0;
   public byte[] byte1 = new byte[] {40, 77, 97, 100, 101, 32, 98, 121, 32, 80, 101, 121, 116, 111, 110, 80, 108, 97, 121, 122, 53, 56, 53, 41};

   private boolean firstTimeLaunch = true;

@@ -147,9 +148,8 @@ public final void render(float var1, boolean var2, int var3, int var4) {
      }

      byte[] text = new byte[] {48, 46, 51, 48, 32, 67, 108, 97, 115, 115, 105, 99};
      byte[] text1 = new byte[] {40, 77, 97, 100, 101, 32, 98, 121, 32, 80, 101, 121, 116, 111, 110, 80, 108, 97, 121, 122, 53, 56, 53, 41};
      var5.drawString(new String(text), 2, 2, 16777215);
      var5.drawString(new String(text1), 2, 12, 16777215);
      var5.drawString(new String(byte1), 2, 12, 16777215);
      if(this.mc.settings.showFrameRate) {
         var5.drawString(this.mc.debug, 2, 22, 16777215);
      }
  5 changes: 4 additions & 1 deletion5  
src/teavm/java/com/mojang/minecraft/level/tile/Block.java
@@ -1,5 +1,6 @@
package com.mojang.minecraft.level.tile;

import com.mojang.minecraft.Minecraft;
import com.mojang.minecraft.MovingObjectPosition;
import com.mojang.minecraft.item.Item;
import com.mojang.minecraft.level.Level;
@@ -8,11 +9,14 @@
import com.mojang.minecraft.particle.ParticleManager;
import com.mojang.minecraft.particle.TerrainParticle;
import com.mojang.minecraft.phys.AABB;
import com.mojang.minecraft.render.TextureLocation;

import net.lax1dude.eaglercraft.adapter.Tessellator;

import java.util.Random;

import org.lwjgl.opengl.GL11;

public class Block
{
	protected Block(int id)
@@ -300,7 +304,6 @@ public final void renderSide(int var2, int var3, int var4, int var5) {
			tessellator.addVertexWithUV(var14, var11, var12, var8, var9);
			tessellator.addVertexWithUV(var14, var11, var13, var7, var9);
		}

	}

	public AABB getSelectionBox(int x, int y, int z)
  5 changes: 4 additions & 1 deletion5  
src/teavm/java/com/mojang/minecraft/level/tile/LiquidBlock.java
@@ -3,9 +3,12 @@
import com.mojang.minecraft.level.Level;
import com.mojang.minecraft.level.liquid.LiquidType;
import com.mojang.minecraft.phys.AABB;
import com.mojang.minecraft.render.TextureLocation;

import java.util.Random;

import org.lwjgl.opengl.GL11;

public class LiquidBlock extends Block {

   protected LiquidType type;
@@ -160,4 +163,4 @@ public AABB getCollisionBox(int x, int y, int z)
	{
		return null;
	}
}
}
