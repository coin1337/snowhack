package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.use.Slider;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;

public class RootSliderUI extends AbstractComponentUI<Slider> {
   // $FF: synthetic field
   private static final int[] lllIllIIIlll;
   // $FF: synthetic field
   private static final String[] lllIllIIIlIl;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;

   private static boolean lIIllIllIIlIll(int var0) {
      return var0 != 0;
   }

   public RootSliderUI() {
      lllllllllllllllIlIlllIIlIIllllIl.cFontRenderer = new CFontRenderer(new Font(lllIllIIIlIl[lllIllIIIlll[0]], lllIllIIIlll[0], lllIllIIIlll[1]), (boolean)lllIllIIIlll[2], (boolean)lllIllIIIlll[0]);
   }

   private static String lIIllIllIIlIII(String lllllllllllllllIlIlllIIlIIIIIlll, String lllllllllllllllIlIlllIIlIIIIlIII) {
      try {
         char lllllllllllllllIlIlllIIlIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlllIIlIIIIlIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlllIIlIIIIlIll.init(lllIllIIIlll[6], lllllllllllllllIlIlllIIlIIIIIlIl);
         return new String(lllllllllllllllIlIlllIIlIIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIllIllIIlIIl() {
      lllIllIIIlIl = new String[lllIllIIIlll[8]];
      lllIllIIIlIl[lllIllIIIlll[0]] = lIIllIllIIIIll("TgJR1UmUmd0=", "MJEWT");
      lllIllIIIlIl[lllIllIIIlll[2]] = lIIllIllIIlIII("gM0Iwl6JKSA=", "nEZZe");
      lllIllIIIlIl[lllIllIIIlll[6]] = lIIllIllIIlIII("VaqYBxKWUpM=", "AcQfL");
   }

   public void renderComponent(Slider lllllllllllllllIlIlllIIlIIllIIll, FontRenderer lllllllllllllllIlIlllIIlIIllIIlI) {
      GL11.glColor4f(0.3F, 0.6F, 0.9F, lllllllllllllllIlIlllIIlIIllIIll.getOpacity());
      GL11.glLineWidth(2.5F);
      byte lllllllllllllllIlIlllIIlIIlIlIlI = lllllllllllllllIlIlllIIlIIllIIll.getHeight();
      String lllllllllllllllIlIlllIIlIIlIlIIl = lllllllllllllllIlIlllIIlIIllIIll.getValue();
      double lllllllllllllllIlIlllIIlIIlIllll = (double)lllllllllllllllIlIlllIIlIIllIIll.getWidth() * ((lllllllllllllllIlIlllIIlIIlIlIIl - lllllllllllllllIlIlllIIlIIllIIll.getMinimum()) / (lllllllllllllllIlIlllIIlIIllIIll.getMaximum() - lllllllllllllllIlIlllIIlIIllIIll.getMinimum()));
      Exception lllllllllllllllIlIlllIIlIIlIIlll = 1.1F;
      GL11.glBegin(lllIllIIIlll[2]);
      GL11.glVertex2d(0.0D, (double)((float)lllllllllllllllIlIlllIIlIIlIlIlI / lllllllllllllllIlIlllIIlIIlIIlll));
      GL11.glVertex2d(lllllllllllllllIlIlllIIlIIlIllll, (double)((float)lllllllllllllllIlIlllIIlIIlIlIlI / lllllllllllllllIlIlllIIlIIlIIlll));
      GL11.glColor3f(0.25F, 0.33F, 0.33F);
      GL11.glVertex2d(lllllllllllllllIlIlllIIlIIlIllll, (double)((float)lllllllllllllllIlIlllIIlIIlIlIlI / lllllllllllllllIlIlllIIlIIlIIlll));
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIIllIIll.getWidth(), (double)((float)lllllllllllllllIlIlllIIlIIlIlIlI / lllllllllllllllIlIlllIIlIIlIIlll));
      GL11.glEnd();
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      RenderHelper.drawCircle((float)((int)lllllllllllllllIlIlllIIlIIlIllll), (float)lllllllllllllllIlIlllIIlIIlIlIlI / lllllllllllllllIlIlllIIlIIlIIlll, 2.0F);
      String lllllllllllllllIlIlllIIlIIlIllIl = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIlllIIlIIlIlIIl).append(lllIllIIIlIl[lllIllIIIlll[2]]));
      GL11.glEnable(lllIllIIIlll[3]);
      GL11.glEnable(lllIllIIIlll[4]);
      GL11.glDisable(lllIllIIIlll[5]);
      if (lIIllIllIIlIll(lllllllllllllllIlIlllIIlIIllIIll.isPressed())) {
         lllllllllllllllIlIlllIIlIIlIllll -= (double)(lllllllllllllllIlIlllIIlIIllIlII.cFontRenderer.getStringWidth(lllllllllllllllIlIlllIIlIIlIllIl) / lllIllIIIlll[6]);
         lllllllllllllllIlIlllIIlIIlIllll = Math.max(0.0D, Math.min(lllllllllllllllIlIlllIIlIIlIllll, (double)(lllllllllllllllIlIlllIIlIIllIIll.getWidth() - lllllllllllllllIlIlllIIlIIllIlII.cFontRenderer.getStringWidth(lllllllllllllllIlIlllIIlIIlIllIl))));
         lllllllllllllllIlIlllIIlIIllIlII.cFontRenderer.drawString(lllllllllllllllIlIlllIIlIIlIllIl, (float)lllllllllllllllIlIlllIIlIIlIllll, 0.0F, lllIllIIIlll[7]);
         "".length();
         "".length();
         if (-((41 ^ 58) << (" ".length() << " ".length()) ^ 47 ^ 102) >= 0) {
            return;
         }
      } else {
         lllllllllllllllIlIlllIIlIIllIlII.cFontRenderer.drawString(lllllllllllllllIlIlllIIlIIllIIll.getText(), 0.0F, 0.0F, lllIllIIIlll[7]);
         "".length();
         lllllllllllllllIlIlllIIlIIllIlII.cFontRenderer.drawString(lllllllllllllllIlIlllIIlIIlIllIl, (float)(lllllllllllllllIlIlllIIlIIllIIll.getWidth() - lllllllllllllllIlIlllIIlIIllIlII.cFontRenderer.getStringWidth(lllllllllllllllIlIlllIIlIIlIllIl)), 0.0F, lllIllIIIlll[7]);
         "".length();
      }

      GL11.glEnable(lllIllIIIlll[3]);
      GL11.glEnable(lllIllIIIlll[4]);
      GL11.glDisable(lllIllIIIlll[5]);
      GL11.glDisable(lllIllIIIlll[3]);
   }

   public void handleAddComponent(Slider lllllllllllllllIlIlllIIlIIIlllll, Container lllllllllllllllIlIlllIIlIIlIIIIl) {
      lllllllllllllllIlIlllIIlIIIlllll.setHeight(lllllllllllllllIlIlllIIlIIIlllll.getTheme().getFontRenderer().getFontHeight() + lllIllIIIlll[6]);
      lllllllllllllllIlIlllIIlIIIlllll.setWidth(lllllllllllllllIlIlllIIlIIlIIIll.cFontRenderer.getStringWidth(lllllllllllllllIlIlllIIlIIIlllll.getText()) + lllllllllllllllIlIlllIIlIIlIIIll.cFontRenderer.getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIlllIIlIIIlllll.getMaximum()).append(lllIllIIIlIl[lllIllIIIlll[6]]))) + lllIllIIIlll[8]);
   }

   static {
      lIIllIllIIlIlI();
      lIIllIllIIlIIl();
   }

   private static void lIIllIllIIlIlI() {
      lllIllIIIlll = new int[10];
      lllIllIIIlll[0] = (177 ^ 166) << (" ".length() << " ".length()) & ~((128 ^ 151) << (" ".length() << " ".length()));
      lllIllIIIlll[1] = 48 ^ 61;
      lllIllIIIlll[2] = " ".length();
      lllIllIIIlll[3] = 1999 + 1347 - 3195 + 3374 + 970 + 150 - 185 + 192 - (825 + 80 - -790 + 228 << " ".length()) + 1366 + 2548 - 1273 + 106;
      lllIllIIIlll[4] = (35 + 62 - -101 + 99 << (" ".length() << " ".length())) + 25 + 92 - -375 + 41 - (208 + 49 - 28 + 66) + (82 ^ 13) << " ".length();
      lllIllIIIlll[5] = (147 + 218 - 128 + 32 << " ".length()) + 626 + 86 - 69 + 16 - (103 + 414 - 303 + 289 << " ".length()) + (105 + 224 - 80 + 16 << " ".length()) << (" ".length() << " ".length());
      lllIllIIIlll[6] = " ".length() << " ".length();
      lllIllIIIlll[7] = 3964371 + 16298351 - 13724275 + 10238768;
      lllIllIIIlll[8] = "   ".length();
      lllIllIIIlll[9] = " ".length() << "   ".length();
   }

   private static String lIIllIllIIIIll(String lllllllllllllllIlIlllIIIllllllII, String lllllllllllllllIlIlllIIIlllllIll) {
      try {
         SecretKeySpec lllllllllllllllIlIlllIIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIlllllIll.getBytes(StandardCharsets.UTF_8)), lllIllIIIlll[9]), "DES");
         Exception lllllllllllllllIlIlllIIIllllIlll = Cipher.getInstance("DES");
         lllllllllllllllIlIlllIIIllllIlll.init(lllIllIIIlll[6], lllllllllllllllIlIlllIIIllllllll);
         return new String(lllllllllllllllIlIlllIIIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
