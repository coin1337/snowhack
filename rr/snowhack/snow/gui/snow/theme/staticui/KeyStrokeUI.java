package rr.snowhack.snow.gui.snow.theme.staticui;

import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.component.KeyStroke;

public class KeyStrokeUI extends AbstractComponentUI<KeyStroke> {
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private static final int[] lllIlllIIIll;
   // $FF: synthetic field
   private static final String[] lllIlllIIIlI;
   // $FF: synthetic field
   private CFontRenderer cFontRenderer;

   private static boolean lIIlllIIllIlII(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIlllIIllIIlI();
      lIIlllIIllIIIl();
      mc = Minecraft.func_71410_x();
   }

   private static void lIIlllIIllIIIl() {
      lllIlllIIIlI = new String[lllIlllIIIll[17]];
      lllIlllIIIlI[lllIlllIIIll[0]] = lIIlllIIlIlllI("rn8bmD+wEA0=", "HKWFO");
      lllIlllIIIlI[lllIlllIIIll[2]] = lIIlllIIlIlllI("EyhZJa7T0m0=", "yasAp");
      lllIlllIIIlI[lllIlllIIIll[5]] = lIIlllIIlIllll("Lg==", "yhmGn");
      lllIlllIIIlI[lllIlllIIIll[8]] = lIIlllIIlIlllI("MVbA0nZ3en0=", "QOkeh");
      lllIlllIIIlI[lllIlllIIIll[9]] = lIIlllIIllIIII("UloESit7unY=", "lVPqU");
      lllIlllIIIlI[lllIlllIIIll[10]] = lIIlllIIlIllll("Fw==", "DNjhh");
      lllIlllIIIlI[lllIlllIIIll[11]] = lIIlllIIlIlllI("saeZBdQna5s=", "prteh");
      lllIlllIIIlI[lllIlllIIIll[12]] = lIIlllIIllIIII("VxqzaZmj3+8=", "iyKBu");
      lllIlllIIIlI[lllIlllIIIll[14]] = lIIlllIIlIlllI("+Z5IKQdGkBw=", "rsyMA");
      lllIlllIIIlI[lllIlllIIIll[15]] = lIIlllIIlIllll("aWFL", "DLfci");
      lllIlllIIIlI[lllIlllIIIll[16]] = lIIlllIIlIlllI("si6xCHyctJU=", "ugEUS");
   }

   public KeyStrokeUI() {
      lllllllllllllllIlIllIlIIIIIlllII.cFontRenderer = new CFontRenderer(new Font(lllIlllIIIlI[lllIlllIIIll[0]], lllIlllIIIll[0], lllIlllIIIll[1]), (boolean)lllIlllIIIll[2], (boolean)lllIlllIIIll[0]);
   }

   private static void lIIlllIIllIIlI() {
      lllIlllIIIll = new int[18];
      lllIlllIIIll[0] = (42 ^ 109) & ~(71 ^ 0);
      lllIlllIIIll[1] = 13 ^ 24;
      lllIlllIIIll[2] = " ".length();
      lllIlllIIIll[3] = (126 ^ 25) << " ".length() ^ 132 + 26 - 76 + 63;
      lllIlllIIIll[4] = 109 ^ 48 ^ (177 ^ 136) << " ".length();
      lllIlllIIIll[5] = " ".length() << " ".length();
      lllIlllIIIll[6] = 146 ^ 159 ^ " ".length() << " ".length();
      lllIlllIIIll[7] = 8898714 + 16247868 - 17137915 + 8768548;
      lllIlllIIIll[8] = "   ".length();
      lllIlllIIIll[9] = " ".length() << (" ".length() << " ".length());
      lllIlllIIIll[10] = 117 ^ 114 ^ " ".length() << " ".length();
      lllIlllIIIll[11] = "   ".length() << " ".length();
      lllIlllIIIll[12] = 103 ^ 96;
      lllIlllIIIll[13] = (19 ^ 52) << " ".length();
      lllIlllIIIll[14] = " ".length() << "   ".length();
      lllIlllIIIll[15] = 67 ^ 92 ^ (112 ^ 123) << " ".length();
      lllIlllIIIll[16] = (72 ^ 77) << " ".length();
      lllIlllIIIll[17] = 59 ^ 106 ^ (144 ^ 189) << " ".length();
   }

   public void handleSizeComponent(KeyStroke lllllllllllllllIlIllIlIIIIIlIlll) {
      lllllllllllllllIlIllIlIIIIIlIlll.setHeight(lllIlllIIIll[3]);
      lllllllllllllllIlIllIlIIIIIlIlll.setWidth(lllIlllIIIll[3]);
   }

   private static String lIIlllIIlIllll(String lllllllllllllllIlIllIIlllllllIll, String lllllllllllllllIlIllIIllllllIlIl) {
      lllllllllllllllIlIllIIlllllllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lllllllllllllllIlIllIIllllllIlII = new StringBuilder();
      String lllllllllllllllIlIllIIllllllIIll = lllllllllllllllIlIllIIllllllIlIl.toCharArray();
      int lllllllllllllllIlIllIIllllllIlll = lllIlllIIIll[0];
      long lllllllllllllllIlIllIIllllllIIIl = lllllllllllllllIlIllIIlllllllIll.toCharArray();
      int lllllllllllllllIlIllIIllllllIIII = lllllllllllllllIlIllIIllllllIIIl.length;
      int lllllllllllllllIlIllIIlllllIllll = lllIlllIIIll[0];

      do {
         if (!lIIlllIIllIlII(lllllllllllllllIlIllIIlllllIllll, lllllllllllllllIlIllIIllllllIIII)) {
            return String.valueOf(lllllllllllllllIlIllIIllllllIlII);
         }

         char lllllllllllllllIlIllIIllllllllII = lllllllllllllllIlIllIIllllllIIIl[lllllllllllllllIlIllIIlllllIllll];
         lllllllllllllllIlIllIIllllllIlII.append((char)(lllllllllllllllIlIllIIllllllllII ^ lllllllllllllllIlIllIIllllllIIll[lllllllllllllllIlIllIIllllllIlll % lllllllllllllllIlIllIIllllllIIll.length]));
         "".length();
         ++lllllllllllllllIlIllIIllllllIlll;
         ++lllllllllllllllIlIllIIlllllIllll;
         "".length();
      } while("   ".length() != 0);

      return null;
   }

   private static String lIIlllIIllIIII(String lllllllllllllllIlIllIIllllIllIIl, String lllllllllllllllIlIllIIllllIllIII) {
      try {
         long lllllllllllllllIlIllIIllllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIllllIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lllllllllllllllIlIllIIllllIlIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIIllllIlIlII.init(lllIlllIIIll[5], lllllllllllllllIlIllIIllllIlIlIl);
         return new String(lllllllllllllllIlIllIIllllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIlllIIlIlllI(String lllllllllllllllIlIllIIlllllIIllI, String lllllllllllllllIlIllIIlllllIIIll) {
      try {
         Exception lllllllllllllllIlIllIIlllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlllllIIIll.getBytes(StandardCharsets.UTF_8)), lllIlllIIIll[14]), "DES");
         byte lllllllllllllllIlIllIIlllllIIIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIllIIlllllIIIIl.init(lllIlllIIIll[5], lllllllllllllllIlIllIIlllllIIIlI);
         return new String(lllllllllllllllIlIllIIlllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIIllIIll(int var0) {
      return var0 == 0;
   }

   public void renderComponent(KeyStroke lllllllllllllllIlIllIlIIIIIlIlII, FontRenderer lllllllllllllllIlIllIlIIIIIlIIll) {
      GlStateManager.func_179090_x();
      GlStateManager.func_179140_f();
      GlStateManager.func_179147_l();
      GlStateManager.func_179129_p();
      GlStateManager.func_179094_E();
      if (lIIlllIIllIIll(Keyboard.isKeyDown(mc.field_71474_y.field_74351_w.func_151463_i()))) {
         GL11.glColor4f(0.5F, 0.5F, 0.5F, 0.6F);
         "".length();
         if (" ".length() != " ".length()) {
            return;
         }
      } else {
         GL11.glColor4f(0.3F, 0.6F, 0.9F, 0.6F);
      }

      RenderHelper.drawFilledRectangle(32.0F, 0.0F, 30.0F, 30.0F);
      if (lIIlllIIllIIll(Keyboard.isKeyDown(mc.field_71474_y.field_74370_x.func_151463_i()))) {
         GL11.glColor4f(0.5F, 0.5F, 0.5F, 0.6F);
         "".length();
         if (-" ".length() > "   ".length()) {
            return;
         }
      } else {
         GL11.glColor4f(0.3F, 0.6F, 0.9F, 0.6F);
      }

      RenderHelper.drawFilledRectangle(0.0F, 32.0F, 30.0F, 30.0F);
      if (lIIlllIIllIIll(Keyboard.isKeyDown(mc.field_71474_y.field_74368_y.func_151463_i()))) {
         GL11.glColor4f(0.5F, 0.5F, 0.5F, 0.6F);
         "".length();
         if ((((82 ^ 69) << " ".length() ^ 14 ^ 37) << (" ".length() << (" ".length() << " ".length())) & ((136 + 50 - 44 + 7 ^ (64 ^ 73) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) >= " ".length() << (" ".length() << " ".length())) {
            return;
         }
      } else {
         GL11.glColor4f(0.3F, 0.6F, 0.9F, 0.6F);
      }

      RenderHelper.drawFilledRectangle(32.0F, 32.0F, 30.0F, 30.0F);
      if (lIIlllIIllIIll(Keyboard.isKeyDown(mc.field_71474_y.field_74366_z.func_151463_i()))) {
         GL11.glColor4f(0.5F, 0.5F, 0.5F, 0.6F);
         "".length();
         if (((14 ^ 89) & ~(99 ^ 52)) != 0) {
            return;
         }
      } else {
         GL11.glColor4f(0.3F, 0.6F, 0.9F, 0.6F);
      }

      RenderHelper.drawFilledRectangle(64.0F, 32.0F, 30.0F, 30.0F);
      if (lIIlllIIllIIll(Keyboard.isKeyDown(mc.field_71474_y.field_74314_A.func_151463_i()))) {
         GL11.glColor4f(0.5F, 0.5F, 0.5F, 0.6F);
         "".length();
         if (" ".length() <= 0) {
            return;
         }
      } else {
         GL11.glColor4f(0.3F, 0.6F, 0.9F, 0.6F);
      }

      RenderHelper.drawFilledRectangle(0.0F, 64.0F, 94.0F, 28.0F);
      lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.drawStringWithShadow(lllIlllIIIlI[lllIlllIIIll[2]], (double)(lllIlllIIIll[4] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getStringWidth(lllIlllIIIlI[lllIlllIIIll[5]]) / lllIlllIIIll[5]), (double)(lllIlllIIIll[6] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getHeight() / lllIlllIIIll[5]), lllIlllIIIll[7]);
      "".length();
      lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.drawStringWithShadow(lllIlllIIIlI[lllIlllIIIll[8]], (double)(lllIlllIIIll[6] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getStringWidth(lllIlllIIIlI[lllIlllIIIll[9]]) / lllIlllIIIll[5]), (double)(lllIlllIIIll[4] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getHeight() / lllIlllIIIll[5]), lllIlllIIIll[7]);
      "".length();
      lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.drawStringWithShadow(lllIlllIIIlI[lllIlllIIIll[10]], (double)(lllIlllIIIll[4] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getStringWidth(lllIlllIIIlI[lllIlllIIIll[11]]) / lllIlllIIIll[5]), (double)(lllIlllIIIll[4] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getHeight() / lllIlllIIIll[5]), lllIlllIIIll[7]);
      "".length();
      lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.drawStringWithShadow(lllIlllIIIlI[lllIlllIIIll[12]], (double)(lllIlllIIIll[13] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getStringWidth(lllIlllIIIlI[lllIlllIIIll[14]]) / lllIlllIIIll[5]), (double)(lllIlllIIIll[4] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getHeight() / lllIlllIIIll[5]), lllIlllIIIll[7]);
      "".length();
      lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.drawStringWithShadow(lllIlllIIIlI[lllIlllIIIll[15]], (double)(lllIlllIIIll[4] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getStringWidth(lllIlllIIIlI[lllIlllIIIll[16]]) / lllIlllIIIll[5]), (double)(lllIlllIIIll[13] - lllllllllllllllIlIllIlIIIIIlIIlI.cFontRenderer.getHeight() / lllIlllIIIll[5]), lllIlllIIIll[7]);
      "".length();
      GlStateManager.func_179121_F();
      GlStateManager.func_179098_w();
   }
}
