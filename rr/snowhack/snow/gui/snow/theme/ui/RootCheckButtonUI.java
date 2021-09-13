package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.use.CheckButton;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.module.modules.client.GUIColor;

public class RootCheckButtonUI<T extends CheckButton> extends AbstractComponentUI<CheckButton> {
   // $FF: synthetic field
   protected Color downColourNormal;
   // $FF: synthetic field
   protected Color downColourToggle;
   // $FF: synthetic field
   private static final String[] llllllIlIIlI;
   // $FF: synthetic field
   protected Color idleColourNormal;
   // $FF: synthetic field
   protected Color idleColourToggle;
   // $FF: synthetic field
   protected Color backgroundColourHover;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   private static final int[] llllllIlIIll;
   // $FF: synthetic field
   protected Color backgroundColour;

   public void handleAddComponent(CheckButton lllllllllllllllIlIIlIllIlllIlIIl, Container lllllllllllllllIlIIlIllIlllIlIII) {
      lllllllllllllllIlIIlIllIlllIlIIl.setWidth(SnowGUI.fontRenderer.getStringWidth(llllllIlIIlI[llllllIlIIll[12]]) + llllllIlIIll[22]);
      lllllllllllllllIlIIlIllIlllIlIIl.setHeight(SnowGUI.fontRenderer.getFontHeight() + llllllIlIIll[16]);
   }

   private static void lIlIIlIlIIIIIl() {
      llllllIlIIll = new int[23];
      llllllIlIIll[0] = (213 ^ 194) << " ".length();
      llllllIlIIll[1] = (163 ^ 168) << "   ".length();
      llllllIlIIll[2] = (63 ^ 38) << "   ".length();
      llllllIlIIll[3] = 54 ^ 103;
      llllllIlIIll[4] = (134 ^ 145) << "   ".length();
      llllllIlIIll[5] = 98 + 23 - 52 + 186;
      llllllIlIIll[6] = (14 + 21 - -154 + 48 ^ (197 ^ 156) << " ".length()) << " ".length();
      llllllIlIIll[7] = (186 ^ 133) << " ".length();
      llllllIlIIll[8] = (241 ^ 190 ^ (109 ^ 104) << "   ".length()) << " ".length();
      llllllIlIIll[9] = (117 ^ 8) << " ".length();
      llllllIlIIll[10] = (72 ^ 109) & ~(45 ^ 8);
      llllllIlIIll[11] = (24 ^ 49) << (" ".length() << " ".length()) ^ 52 + 41 - -48 + 40;
      llllllIlIIll[12] = " ".length();
      llllllIlIIll[13] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllllIlIIll[14] = " ".length() << "   ".length();
      llllllIlIIll[15] = ('鞃' + 27536 - 27366 + 13920 << "   ".length()) + (105802 + '鮱' - 120659 + 182969 << "   ".length()) - -(3292056 + 9785762 - 12702893 + 12443765) + 1688787 + 782566 - 902743 + 303147;
      llllllIlIIll[16] = " ".length() << " ".length();
      llllllIlIIll[17] = "   ".length();
      llllllIlIIll[18] = 5449907 + 1212238 - 2055353 + 1667845 + (1188 + 1749 - 2575 + 2181 << (" ".length() << "   ".length())) - -(469395 + 613766 - 797789 + 622913) + 170988 + 419796 - 95823 + 26820;
      llllllIlIIll[19] = (6 + 121 - 43 + 99 << (" ".length() << " ".length())) + (105 + 163 - 104 + 21 << " ".length()) - -(546 + 1192 - 1123 + 587) + 591 + 1020 - 459 + 97;
      llllllIlIIll[20] = (231 + 351 - 372 + 347 << " ".length()) + 100 + 201 - -126 + 114 - (14 + 143 - 72 + 108) + (32 ^ 27) << " ".length();
      llllllIlIIll[21] = 242 + 485 - 594 + 398 + 83 + 278 - 341 + 325 - ((115 ^ 48) << (" ".length() << " ".length())) + (30 ^ 111) << (" ".length() << " ".length());
      llllllIlIIll[22] = 16 ^ 121 ^ (92 ^ 71) << (" ".length() << " ".length());
   }

   private static boolean lIlIIlIlIIIlII(int var0) {
      return var0 == 0;
   }

   static {
      lIlIIlIlIIIIIl();
      lIlIIlIIlllllI();
   }

   private static void lIlIIlIIlllllI() {
      llllllIlIIlI = new String[llllllIlIIll[16]];
      llllllIlIIlI[llllllIlIIll[10]] = lIlIIlIIllllIl("RtVdAWTSH4o=", "OlQeQ");
      llllllIlIIlI[llllllIlIIll[12]] = lIlIIlIIllllIl("1RbUfB1r02Hm8oCzIIOPsQ==", "EJolS");
   }

   public RootCheckButtonUI() {
      lllllllllllllllIlIIlIlllIIIIlIII.backgroundColour = new Color(llllllIlIIll[0], llllllIlIIll[1], llllllIlIIll[2]);
      lllllllllllllllIlIIlIlllIIIIlIII.backgroundColourHover = new Color(llllllIlIIll[3], llllllIlIIll[4], llllllIlIIll[5]);
      lllllllllllllllIlIIlIlllIIIIlIII.idleColourNormal = new Color(llllllIlIIll[2], llllllIlIIll[2], llllllIlIIll[2]);
      lllllllllllllllIlIIlIlllIIIIlIII.downColourNormal = new Color(llllllIlIIll[6], llllllIlIIll[6], llllllIlIIll[6]);
      lllllllllllllllIlIIlIlllIIIIlIII.idleColourToggle = new Color(llllllIlIIll[7], llllllIlIIll[8], llllllIlIIll[9]);
      lllllllllllllllIlIIlIlllIIIIlIII.downColourToggle = lllllllllllllllIlIIlIlllIIIIlIII.idleColourToggle.brighter();
      lllllllllllllllIlIIlIlllIIIIlIII.cFontRenderer = new CFontRenderer(new Font(llllllIlIIlI[llllllIlIIll[10]], llllllIlIIll[10], llllllIlIIll[11]), (boolean)llllllIlIIll[12], (boolean)llllllIlIIll[10]);
   }

   private static String lIlIIlIIllllIl(String lllllllllllllllIlIIlIllIllIlIIIl, String lllllllllllllllIlIIlIllIllIIlllI) {
      try {
         int lllllllllllllllIlIIlIllIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIllIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIlIllIllIlIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIllIllIlIIll.init(llllllIlIIll[16], lllllllllllllllIlIIlIllIllIIllIl);
         return new String(lllllllllllllllIlIIlIllIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIlIlIIIIlI(int var0) {
      return var0 != 0;
   }

   public void renderComponent(CheckButton lllllllllllllllIlIIlIllIllllIIll, FontRenderer lllllllllllllllIlIIlIllIllllllII) {
      float[] var10000 = new float[llllllIlIIll[12]];
      var10000[llllllIlIIll[10]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
      boolean lllllllllllllllIlIIlIllIllllIIlI = var10000;
      char lllllllllllllllIlIIlIllIllllIIIl = Color.HSBtoRGB(lllllllllllllllIlIIlIllIllllIIlI[llllllIlIIll[10]], 1.0F, 1.0F);
      double lllllllllllllllIlIIlIllIllllIIII = lllllllllllllllIlIIlIllIllllIIIl >> llllllIlIIll[13] & llllllIlIIll[5];
      int lllllllllllllllIlIIlIllIlllllIII = lllllllllllllllIlIIlIllIllllIIIl >> llllllIlIIll[14] & llllllIlIIll[5];
      int lllllllllllllllIlIIlIllIllllIlll = lllllllllllllllIlIIlIllIllllIIIl & llllllIlIIll[5];
      int lllllllllllllllIlIIlIllIlllIllIl = llllllIlIIll[15];
      if (lIlIIlIlIIIIlI(lllllllllllllllIlIIlIllIllllIIll.isToggled())) {
         if (lIlIIlIlIIIIlI(GUIColor.shouldRainbow())) {
            GL11.glColor4f((float)lllllllllllllllIlIIlIllIllllIIII / 255.0F, (float)lllllllllllllllIlIIlIllIlllllIII / 255.0F, (float)lllllllllllllllIlIIlIllIllllIlll / 255.0F, 85.0F);
            "".length();
            if (-" ".length() != -" ".length()) {
               return;
            }
         } else if (lIlIIlIlIIIlII(lllllllllllllllIlIIlIllIllllIIll.isHovered())) {
            GL11.glColor4f((float)GUIColor.getRed() / 255.0F, (float)GUIColor.getGreen() / 255.0F, (float)GUIColor.getBlue() / 255.0F, 0.8F);
            "".length();
            if (" ".length() << " ".length() == 0) {
               return;
            }
         } else {
            GL11.glColor4f((float)GUIColor.getRed() / 255.0F + 0.1F, (float)GUIColor.getGreen() / 255.0F + 0.1F, (float)GUIColor.getBlue() / 255.0F + 0.1F, 0.8F);
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
               return;
            }
         }
      } else if (lIlIIlIlIIIIlI(lllllllllllllllIlIIlIllIllllIIll.isHovered())) {
         GL11.glColor4f(0.4F, 0.4F, 0.4F, 0.85F);
         "".length();
         if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
            return;
         }
      } else {
         GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      }

      RenderHelper.drawFilledRectangle(-3.0F, (float)(SnowGUI.fontRenderer.getFontHeight() / llllllIlIIll[16] - llllllIlIIll[17]), (float)(lllllllllllllllIlIIlIllIllllIIll.getWidth() + llllllIlIIll[14]), (float)SnowGUI.fontRenderer.getFontHeight() * 1.6F);
      String lllllllllllllllIlIIlIllIllllIlIl = lllllllllllllllIlIIlIllIllllIIll.getName();
      if (lIlIIlIlIIIIlI(lllllllllllllllIlIIlIllIllllIIll.isHovered())) {
         lllllllllllllllIlIIlIllIlllIllIl = (lllllllllllllllIlIIlIllIlllIllIl & llllllIlIIll[18]) << llllllIlIIll[12];
      }

      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glEnable(llllllIlIIll[19]);
      GL11.glEnable(llllllIlIIll[20]);
      GL11.glDisable(llllllIlIIll[21]);
      lllllllllllllllIlIIlIllIlllllllI.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIIlIllIllllIlIl, 1.0D, (double)(SnowGUI.fontRenderer.getFontHeight() / llllllIlIIll[16]), lllllllllllllllIlIIlIllIlllIllIl);
      "".length();
      GL11.glDisable(llllllIlIIll[19]);
      GL11.glDisable(llllllIlIIll[20]);
      GL11.glEnable(llllllIlIIll[21]);
   }
}
