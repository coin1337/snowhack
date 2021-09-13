package rr.snowhack.snow.gui.snow;

import java.io.IOException;
import java.util.Iterator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.util.Wrapper;

public class DisplayGuiScreen extends GuiScreen {
   // $FF: synthetic field
   Framebuffer framebuffer;
   // $FF: synthetic field
   public static int mouseY;
   // $FF: synthetic field
   public final GuiScreen lastScreen;
   // $FF: synthetic field
   SnowGUI gui;
   // $FF: synthetic field
   public static int mouseX;
   // $FF: synthetic field
   private static final int[] lIIIIlIlIIIlI;

   protected void func_73864_a(int lllllllllllllllIlIIIIIIIIIIllIll, int lllllllllllllllIlIIIIIIIIIIllIlI, int lllllllllllllllIlIIIIIIIIIIllIIl) throws IOException {
      lllllllllllllllIlIIIIIIIIIIllIII.gui.handleMouseDown(mouseX, mouseY);
   }

   private void calculateMouse() {
      Minecraft lllllllllllllllIIlllllllllllIlII = Minecraft.func_71410_x();
      int lllllllllllllllIIlllllllllllIIll = getScale();
      mouseX = Mouse.getX() / lllllllllllllllIIlllllllllllIIll;
      mouseY = lllllllllllllllIIlllllllllllIlII.field_71440_d / lllllllllllllllIIlllllllllllIIll - Mouse.getY() / lllllllllllllllIIlllllllllllIIll - lIIIIlIlIIIlI[2];
   }

   protected void func_73869_a(char lllllllllllllllIlIIIIIIIIIIIIIIl, int lllllllllllllllIlIIIIIIIIIIIIIII) throws IOException {
      if (lIlIlIllIlIlII(lllllllllllllllIlIIIIIIIIIIIIIII, lIIIIlIlIIIlI[2])) {
         lllllllllllllllIlIIIIIIIIIIIIIlI.field_146297_k.func_147108_a(lllllllllllllllIlIIIIIIIIIIIIIlI.lastScreen);
         "".length();
         if (-" ".length() == " ".length()) {
            return;
         }
      } else {
         lllllllllllllllIlIIIIIIIIIIIIIlI.gui.handleKeyDown(lllllllllllllllIlIIIIIIIIIIIIIII);
         lllllllllllllllIlIIIIIIIIIIIIIlI.gui.handleKeyUp(lllllllllllllllIlIIIIIIIIIIIIIII);
      }

   }

   protected void func_146286_b(int lllllllllllllllIlIIIIIIIIIIlIlIl, int lllllllllllllllIlIIIIIIIIIIlIlII, int lllllllllllllllIlIIIIIIIIIIlIIll) {
      lllllllllllllllIlIIIIIIIIIIlIIlI.gui.handleMouseRelease(mouseX, mouseY);
   }

   private static boolean lIlIlIllIlIlII(int var0, int var1) {
      return var0 == var1;
   }

   public static int getScale() {
      int lllllllllllllllIIllllllllllllIll = Wrapper.getMinecraft().field_71474_y.field_74335_Z;
      if (lIlIlIllIlIlIl(lllllllllllllllIIllllllllllllIll)) {
         lllllllllllllllIIllllllllllllIll = lIIIIlIlIIIlI[3];
      }

      int lllllllllllllllIIllllllllllllIlI = lIIIIlIlIIIlI[0];

      while(lIlIlIllIlIllI(lllllllllllllllIIllllllllllllIlI, lllllllllllllllIIllllllllllllIll) && lIlIlIllIlIlll(Wrapper.getMinecraft().field_71443_c / (lllllllllllllllIIllllllllllllIlI + lIIIIlIlIIIlI[2]), lIIIIlIlIIIlI[4]) && lIlIlIllIlIlll(Wrapper.getMinecraft().field_71440_d / (lllllllllllllllIIllllllllllllIlI + lIIIIlIlIIIlI[2]), lIIIIlIlIIIlI[5])) {
         ++lllllllllllllllIIllllllllllllIlI;
         "".length();
         if ("   ".length() < 0) {
            return "   ".length() << (165 ^ 160) & ~("   ".length() << (169 ^ 172));
         }
      }

      if (lIlIlIllIlIlIl(lllllllllllllllIIllllllllllllIlI)) {
         lllllllllllllllIIllllllllllllIlI = lIIIIlIlIIIlI[2];
      }

      return lllllllllllllllIIllllllllllllIlI;
   }

   protected void func_146273_a(int lllllllllllllllIlIIIIIIIIIIIllll, int lllllllllllllllIlIIIIIIIIIIIlllI, int lllllllllllllllIlIIIIIIIIIIIllIl, long lllllllllllllllIlIIIIIIIIIIIllII) {
      lllllllllllllllIlIIIIIIIIIIIlIll.gui.handleMouseDrag(mouseX, mouseY);
   }

   public void func_73876_c() {
      if (lIlIlIllIlIIll(Mouse.hasWheel())) {
         int lllllllllllllllIlIIIIIIIIIIIlIII = Mouse.getDWheel();
         if (lIlIlIllIlIIll(lllllllllllllllIlIIIIIIIIIIIlIII)) {
            lllllllllllllllIlIIIIIIIIIIIIllI.gui.handleWheel(mouseX, mouseY, lllllllllllllllIlIIIIIIIIIIIlIII);
         }
      }

   }

   public void func_73866_w_() {
      lllllllllllllllIlIIIIIIIIIlIIlII.gui = SnowMod.getInstance().getGuiManager();
   }

   private static void lIlIlIllIlIIlI() {
      lIIIIlIlIIIlI = new int[6];
      lIIIIlIlIIIlI[0] = " ".length() << (51 ^ 54) & ~(" ".length() << (56 ^ 61));
      lIIIIlIlIIIlI[1] = 3081 + 958 - 843 + 357;
      lIIIIlIlIIIlI[2] = " ".length();
      lIIIIlIlIIIlI[3] = (225 ^ 156) << "   ".length();
      lIIIIlIlIIIlI[4] = (212 ^ 153 ^ (101 ^ 108) << "   ".length()) << ("   ".length() << " ".length());
      lIIIIlIlIIIlI[5] = (77 ^ 66) << (" ".length() << (" ".length() << " ".length()));
   }

   public void func_73863_a(int lllllllllllllllIlIIIIIIIIIlIIIIl, int lllllllllllllllIlIIIIIIIIIlIIIII, float lllllllllllllllIlIIIIIIIIIIlllll) {
      lllllllllllllllIlIIIIIIIIIlIIIlI.calculateMouse();
      lllllllllllllllIlIIIIIIIIIlIIIlI.gui.drawGUI();
      GL11.glEnable(lIIIIlIlIIIlI[1]);
      GlStateManager.func_179124_c(1.0F, 1.0F, 1.0F);
   }

   private static boolean lIlIlIllIlIIll(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIlIllIlIlIl(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIlIllIlIllI(int var0, int var1) {
      return var0 < var1;
   }

   public DisplayGuiScreen(GuiScreen lllllllllllllllIlIIIIIIIIIllIIlI) {
      lllllllllllllllIlIIIIIIIIIllIIII.lastScreen = lllllllllllllllIlIIIIIIIIIllIIlI;
      long lllllllllllllllIlIIIIIIIIIlIlllI = SnowMod.getInstance().getGuiManager();
      Iterator lllllllllllllllIlIIIIIIIIIlIllIl = lllllllllllllllIlIIIIIIIIIlIlllI.getChildren().iterator();

      do {
         if (!lIlIlIllIlIIll(lllllllllllllllIlIIIIIIIIIlIllIl.hasNext())) {
            lllllllllllllllIlIIIIIIIIIllIIII.framebuffer = new Framebuffer(Wrapper.getMinecraft().field_71443_c, Wrapper.getMinecraft().field_71440_d, (boolean)lIIIIlIlIIIlI[0]);
            return;
         }

         short lllllllllllllllIlIIIIIIIIIlIllII = (Component)lllllllllllllllIlIIIIIIIIIlIllIl.next();
         if (lIlIlIllIlIIll(lllllllllllllllIlIIIIIIIIIlIllII instanceof Frame)) {
            char lllllllllllllllIlIIIIIIIIIlIlIll = (Frame)lllllllllllllllIlIIIIIIIIIlIllII;
            if (lIlIlIllIlIIll(lllllllllllllllIlIIIIIIIIIlIlIll.isPinneable()) && lIlIlIllIlIIll(lllllllllllllllIlIIIIIIIIIlIlIll.isVisible())) {
               lllllllllllllllIlIIIIIIIIIlIlIll.setOpacity(0.5F);
            }
         }

         "".length();
      } while(-"  ".length() < 0);

      throw null;
   }

   private static boolean lIlIlIllIlIlll(int var0, int var1) {
      return var0 >= var1;
   }

   public void func_146281_b() {
      byte lllllllllllllllIlIIIIIIIIIlIIlll = SnowMod.getInstance().getGuiManager();
      lllllllllllllllIlIIIIIIIIIlIIlll.getChildren().stream().filter((lllllllllllllllIIllllllllllIllII) -> {
         int var10000;
         if (lIlIlIllIlIIll(lllllllllllllllIIllllllllllIllII instanceof Frame) && lIlIlIllIlIIll(((Frame)lllllllllllllllIIllllllllllIllII).isPinneable()) && lIlIlIllIlIIll(lllllllllllllllIIllllllllllIllII.isVisible())) {
            var10000 = lIIIIlIlIIIlI[2];
            "".length();
            if (-"   ".length() >= 0) {
               return (boolean)((152 + 168 - 279 + 136 ^ (204 ^ 135) << " ".length()) & ((92 ^ 65) << (" ".length() << " ".length()) ^ 195 ^ 144 ^ -" ".length()));
            }
         } else {
            var10000 = lIIIIlIlIIIlI[0];
         }

         return (boolean)var10000;
      }).forEach((lllllllllllllllIIllllllllllIlllI) -> {
         lllllllllllllllIIllllllllllIlllI.setOpacity(0.0F);
      });
   }

   static {
      lIlIlIllIlIIlI();
   }
}
