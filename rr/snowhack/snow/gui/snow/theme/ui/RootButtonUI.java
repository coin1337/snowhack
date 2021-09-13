package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Color;
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
import rr.snowhack.snow.gui.rgui.component.use.Button;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.RootFontRenderer;
import rr.snowhack.snow.gui.snow.SnowGUI;

public class RootButtonUI<T extends Button> extends AbstractComponentUI<Button> {
   // $FF: synthetic field
   protected Color idleColour;
   // $FF: synthetic field
   private static final String[] lIIIIllIIlIll;
   // $FF: synthetic field
   protected Color downColour;
   // $FF: synthetic field
   private static final int[] lIIIIllIIllII;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;

   static {
      lIlIllIIIlIIlI();
      lIlIllIIIlIIIl();
   }

   private static void lIlIllIIIlIIlI() {
      lIIIIllIIllII = new int[10];
      lIIIIllIIllII[0] = ((160 ^ 195) << " ".length() ^ 58 + 124 - 133 + 92) & (4 + 92 - 10 + 57 ^ (123 ^ 74) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIllIIllII[1] = (134 + 23 - 62 + 82 ^ (171 ^ 188) << "   ".length()) << " ".length();
      lIIIIllIIllII[2] = " ".length();
      lIIIIllIIllII[3] = 113 + 155 - 225 + 120;
      lIIIIllIIllII[4] = ((91 ^ 124) << " ".length() & ~((165 ^ 130) << " ".length())) + ((89 ^ 64) << (" ".length() << " ".length())) - (26 ^ 33) + ((71 ^ 44) << " ".length());
      lIIIIllIIllII[5] = (240 ^ 155) + (210 + 123 - 258 + 158 << (" ".length() << " ".length())) - (80 + 30 - 54 + 245 << " ".length()) + (401 + 701 - 506 + 183 << (" ".length() << " ".length()));
      lIIIIllIIllII[6] = " ".length() << " ".length();
      lIIIIllIIllII[7] = 67 + 504 - 250 + 466 + 208 + 593 - 359 + 467 - (571 + 160 - 55 + 339) + ((80 ^ 57) << "   ".length()) << " ".length();
      lIIIIllIIllII[8] = (166 ^ 161) << (" ".length() << " ".length());
      lIIIIllIIllII[9] = " ".length() << "   ".length();
   }

   private static void lIlIllIIIlIIIl() {
      lIIIIllIIlIll = new String[lIIIIllIIllII[2]];
      lIIIIllIIlIll[lIIIIllIIllII[0]] = lIlIllIIIlIIII("epri3A5iS0Y=", "xKMBl");
   }

   private static boolean lIlIllIIIlIlII(int var0) {
      return var0 != 0;
   }

   public RootButtonUI() {
      lllllllllllllllIIlllllIIIllllIll.cFontRenderer = new CFontRenderer(new Font(lIIIIllIIlIll[lIIIIllIIllII[0]], lIIIIllIIllII[0], lIIIIllIIllII[1]), (boolean)lIIIIllIIllII[2], (boolean)lIIIIllIIllII[0]);
      lllllllllllllllIIlllllIIIllllIll.idleColour = new Color(lIIIIllIIllII[3], lIIIIllIIllII[3], lIIIIllIIllII[3]);
      lllllllllllllllIIlllllIIIllllIll.downColour = new Color(lIIIIllIIllII[4], lIIIIllIIllII[4], lIIIIllIIllII[4]);
   }

   private static boolean lIlIllIIIlIIll(int var0) {
      return var0 == 0;
   }

   public void renderComponent(Button lllllllllllllllIIlllllIIIlllIlII, FontRenderer lllllllllllllllIIlllllIIIlllIllI) {
      GL11.glColor3f(0.22F, 0.22F, 0.22F);
      if (!lIlIllIIIlIIll(lllllllllllllllIIlllllIIIlllIlII.isHovered()) || lIlIllIIIlIlII(lllllllllllllllIIlllllIIIlllIlII.isPressed())) {
         GL11.glColor3f(0.26F, 0.26F, 0.26F);
      }

      RenderHelper.drawRoundedRectangle(0.0F, 0.0F, (float)lllllllllllllllIIlllllIIIlllIlII.getWidth(), (float)lllllllllllllllIIlllllIIIlllIlII.getHeight(), 3.0F);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(lIIIIllIIllII[5]);
      RootFontRenderer var10000 = SnowGUI.fontRenderer;
      int var10001 = lllllllllllllllIIlllllIIIlllIlII.getWidth() / lIIIIllIIllII[6] - SnowGUI.fontRenderer.getStringWidth(lllllllllllllllIIlllllIIIlllIlII.getName()) / lIIIIllIIllII[6];
      int var10002 = lIIIIllIIllII[0];
      Color var10003;
      if (lIlIllIIIlIlII(lllllllllllllllIIlllllIIIlllIlII.isPressed())) {
         var10003 = lllllllllllllllIIlllllIIIlllIlIl.downColour;
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10003 = lllllllllllllllIIlllllIIIlllIlIl.idleColour;
      }

      var10000.drawString(var10001, var10002, var10003, lllllllllllllllIIlllllIIIlllIlII.getName());
      GL11.glDisable(lIIIIllIIllII[5]);
      GL11.glDisable(lIIIIllIIllII[7]);
   }

   public void handleAddComponent(Button lllllllllllllllIIlllllIIIllIllll, Container lllllllllllllllIIlllllIIIlllIIII) {
      lllllllllllllllIIlllllIIIllIllll.setWidth(SnowGUI.fontRenderer.getStringWidth(lllllllllllllllIIlllllIIIllIllll.getName()) + lIIIIllIIllII[8]);
      lllllllllllllllIIlllllIIIllIllll.setHeight(SnowGUI.fontRenderer.getFontHeight() + lIIIIllIIllII[6]);
   }

   private static String lIlIllIIIlIIII(String lllllllllllllllIIlllllIIIlIllIIl, String lllllllllllllllIIlllllIIIlIlIllI) {
      try {
         short lllllllllllllllIIlllllIIIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIIllIIllII[9]), "DES");
         Cipher lllllllllllllllIIlllllIIIlIllIll = Cipher.getInstance("DES");
         lllllllllllllllIIlllllIIIlIllIll.init(lIIIIllIIllII[6], lllllllllllllllIIlllllIIIlIlIlIl);
         return new String(lllllllllllllllIIlllllIIIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
