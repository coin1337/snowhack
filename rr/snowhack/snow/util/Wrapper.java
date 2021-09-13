package rr.snowhack.snow.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.SnowGUI;

public class Wrapper {
   // $FF: synthetic field
   public static FontRenderer fontRenderer;

   public static void init() {
      fontRenderer = SnowGUI.fontRenderer;
   }

   public static World getWorld() {
      return getMinecraft().field_71441_e;
   }

   public static FontRenderer getFontRenderer() {
      return fontRenderer;
   }

   public static Minecraft getMinecraft() {
      return Minecraft.func_71410_x();
   }

   public static int getKey(String lllllllllllllllIlIllIIIIIIIlllII) {
      return Keyboard.getKeyIndex(lllllllllllllllIlIllIIIIIIIlllII.toUpperCase());
   }

   public static EntityPlayerSP getPlayer() {
      return getMinecraft().field_71439_g;
   }
}
