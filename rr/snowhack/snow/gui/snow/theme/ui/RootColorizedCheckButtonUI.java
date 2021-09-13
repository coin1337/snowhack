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
import rr.snowhack.snow.gui.rgui.component.use.CheckButton;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RootSmallFontRenderer;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.gui.snow.component.ColorizedCheckButton;

public class RootColorizedCheckButtonUI extends RootCheckButtonUI<ColorizedCheckButton> {
   // $FF: synthetic field
   RootSmallFontRenderer ff = new RootSmallFontRenderer();
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   private static final int[] lIIIIIIIIllll;
   // $FF: synthetic field
   private static final String[] lIIIIIIIIllIl;

   static {
      lIlIIllIlIIIII();
      lIlIIllIIllllI();
   }

   private static void lIlIIllIIllllI() {
      lIIIIIIIIllIl = new String[lIIIIIIIIllll[2]];
      lIIIIIIIIllIl[lIIIIIIIIllll[0]] = lIlIIllIIlllII("RPKvKQiR4WQ=", "XuQQq");
   }

   private static String lIlIIllIIlllII(String lllllllllllllllIlIIlIIlIIIIIlIll, String lllllllllllllllIlIIlIIlIIIIIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIIlIIIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIlIIlIIIIIllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIIlIIIIIllIl.init(lIIIIIIIIllll[5], lllllllllllllllIlIIlIIlIIIIIlllI);
         return new String(lllllllllllllllIlIIlIIlIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void renderComponent(CheckButton lllllllllllllllIlIIlIIlIIIlIIIIl, FontRenderer lllllllllllllllIlIIlIIlIIIlIIIII) {
      GL11.glColor4f((float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColour.getRed() / 255.0F, (float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColour.getGreen() / 255.0F, (float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColour.getBlue() / 255.0F, lllllllllllllllIlIIlIIlIIIlIIIIl.getOpacity());
      if (!lIlIIllIlIIIIl(lllllllllllllllIlIIlIIlIIIlIIIIl.isHovered()) || lIlIIllIlIIIlI(lllllllllllllllIlIIlIIlIIIlIIIIl.isPressed())) {
         GL11.glColor4f((float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColourHover.getRed() / 255.0F, (float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColourHover.getGreen() / 255.0F, (float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColourHover.getBlue() / 255.0F, lllllllllllllllIlIIlIIlIIIlIIIIl.getOpacity());
      }

      if (lIlIIllIlIIIlI(lllllllllllllllIlIIlIIlIIIlIIIIl.isToggled())) {
         GL11.glColor3f((float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColour.getRed() / 255.0F, (float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColour.getGreen() / 255.0F, (float)lllllllllllllllIlIIlIIlIIIlIIIlI.backgroundColour.getBlue() / 255.0F);
      }

      GL11.glLineWidth(2.5F);
      GL11.glBegin(lIIIIIIIIllll[2]);
      GL11.glVertex2d(0.0D, (double)lllllllllllllllIlIIlIIlIIIlIIIIl.getHeight());
      GL11.glVertex2d((double)lllllllllllllllIlIIlIIlIIIlIIIIl.getWidth(), (double)lllllllllllllllIlIIlIIlIIIlIIIIl.getHeight());
      GL11.glEnd();
      Color var10000;
      if (lIlIIllIlIIIlI(lllllllllllllllIlIIlIIlIIIlIIIIl.isToggled())) {
         var10000 = lllllllllllllllIlIIlIIlIIIlIIIlI.idleColourToggle;
         "".length();
         if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
            return;
         }
      } else {
         var10000 = lllllllllllllllIlIIlIIlIIIlIIIlI.idleColourNormal;
      }

      Color lllllllllllllllIlIIlIIlIIIIlllll = var10000;
      if (lIlIIllIlIIIlI(lllllllllllllllIlIIlIIlIIIlIIIIl.isToggled())) {
         var10000 = lllllllllllllllIlIIlIIlIIIlIIIlI.downColourToggle;
         "".length();
         if (-(61 ^ 57) > 0) {
            return;
         }
      } else {
         var10000 = lllllllllllllllIlIIlIIlIIIlIIIlI.downColourNormal;
      }

      char lllllllllllllllIlIIlIIlIIIIllIlI = var10000;
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(lIIIIIIIIllll[4]);
      RootSmallFontRenderer var5 = lllllllllllllllIlIIlIIlIIIlIIIlI.ff;
      int var10001 = lllllllllllllllIlIIlIIlIIIlIIIIl.getWidth() / lIIIIIIIIllll[5] - SnowGUI.fontRenderer.getStringWidth(lllllllllllllllIlIIlIIlIIIlIIIIl.getName()) / lIIIIIIIIllll[5];
      int var10002 = lIIIIIIIIllll[0];
      Color var10003;
      if (lIlIIllIlIIIlI(lllllllllllllllIlIIlIIlIIIlIIIIl.isPressed())) {
         var10003 = lllllllllllllllIlIIlIIlIIIIllIlI;
         "".length();
         if (" ".length() << (" ".length() << " ".length()) <= 0) {
            return;
         }
      } else {
         var10003 = lllllllllllllllIlIIlIIlIIIIlllll;
      }

      var5.drawString(var10001, var10002, var10003, lllllllllllllllIlIIlIIlIIIlIIIIl.getName());
      GL11.glDisable(lIIIIIIIIllll[4]);
   }

   private static boolean lIlIIllIlIIIlI(int var0) {
      return var0 != 0;
   }

   public RootColorizedCheckButtonUI() {
      lllllllllllllllIlIIlIIlIIIlIIlll.cFontRenderer = new CFontRenderer(new Font(lIIIIIIIIllIl[lIIIIIIIIllll[0]], lIIIIIIIIllll[0], lIIIIIIIIllll[1]), (boolean)lIIIIIIIIllll[2], (boolean)lIIIIIIIIllll[0]);
      lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColour = new Color(lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColour.getRed(), lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColour.getGreen(), lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColour.getBlue());
      lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColourHover = new Color(lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColourHover.getRed(), lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColourHover.getGreen(), lllllllllllllllIlIIlIIlIIIlIIlll.backgroundColourHover.getBlue());
      lllllllllllllllIlIIlIIlIIIlIIlll.downColourNormal = new Color(lIIIIIIIIllll[3], lIIIIIIIIllll[3], lIIIIIIIIllll[3]);
   }

   private static void lIlIIllIlIIIII() {
      lIIIIIIIIllll = new int[6];
      lIIIIIIIIllll[0] = " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
      lIIIIIIIIllll[1] = (33 ^ 40) << " ".length();
      lIIIIIIIIllll[2] = " ".length();
      lIIIIIIIIllll[3] = (115 + 14 - -47 + 53 ^ (87 ^ 10) << " ".length()) << " ".length();
      lIIIIIIIIllll[4] = 3528 + 3066 - 5440 + 2399;
      lIIIIIIIIllll[5] = " ".length() << " ".length();
   }

   private static boolean lIlIIllIlIIIIl(int var0) {
      return var0 == 0;
   }
}
