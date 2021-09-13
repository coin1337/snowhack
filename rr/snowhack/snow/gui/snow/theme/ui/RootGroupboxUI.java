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
import rr.snowhack.snow.gui.rgui.component.container.use.Groupbox;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;

public class RootGroupboxUI extends AbstractComponentUI<Groupbox> {
   // $FF: synthetic field
   private static final String[] lllllllllIII;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   private static final int[] lllllllllIll;

   private static String lIlIIllIIIlIll(String lllllllllllllllIlIIlIIllIIIllIIl, String lllllllllllllllIlIIlIIllIIIllIII) {
      try {
         long lllllllllllllllIlIIlIIllIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIllIIIllIII.getBytes(StandardCharsets.UTF_8)), lllllllllIll[9]), "DES");
         Cipher lllllllllllllllIlIIlIIllIIIllIll = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIIllIIIllIll.init(lllllllllIll[10], lllllllllllllllIlIIlIIllIIIlIlIl);
         return new String(lllllllllllllllIlIIlIIllIIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIlIIllIIIllII() {
      lllllllllIII = new String[lllllllllIll[2]];
      lllllllllIII[lllllllllIll[0]] = lIlIIllIIIlIll("nUs/DOWsebc=", "HGghH");
   }

   public RootGroupboxUI() {
      lllllllllllllllIlIIlIIllIlIIllII.cFontRenderer = new CFontRenderer(new Font(lllllllllIII[lllllllllIll[0]], lllllllllIll[0], lllllllllIll[1]), (boolean)lllllllllIll[2], (boolean)lllllllllIll[0]);
   }

   public void renderComponent(Groupbox lllllllllllllllIlIIlIIllIlIIIlII, FontRenderer lllllllllllllllIlIIlIIllIlIIIllI) {
      GL11.glLineWidth(1.0F);
      GL11.glDisable(lllllllllIll[3]);
      GL11.glEnable(lllllllllIll[4]);
      GL11.glEnable(lllllllllIll[5]);
      lllllllllllllllIlIIlIIllIlIIlIII.cFontRenderer.drawString(lllllllllllllllIlIIlIIllIlIIIlII.getName(), 1.0F, 1.0F, Color.white.getRGB());
      "".length();
      GL11.glEnable(lllllllllIll[3]);
      GL11.glDisable(lllllllllIll[4]);
      GL11.glColor3f(0.0F, 0.0F, 1.0F);
      GL11.glDisable(lllllllllIll[5]);
      GL11.glBegin(lllllllllIll[2]);
      GL11.glVertex2d(0.0D, 0.0D);
      GL11.glVertex2d((double)lllllllllllllllIlIIlIIllIlIIIlII.getWidth(), 0.0D);
      GL11.glVertex2d((double)lllllllllllllllIlIIlIIllIlIIIlII.getWidth(), 0.0D);
      GL11.glVertex2d((double)lllllllllllllllIlIIlIIllIlIIIlII.getWidth(), (double)lllllllllllllllIlIIlIIllIlIIIlII.getHeight());
      GL11.glVertex2d((double)lllllllllllllllIlIIlIIllIlIIIlII.getWidth(), (double)lllllllllllllllIlIIlIIllIlIIIlII.getHeight());
      GL11.glVertex2d(0.0D, (double)lllllllllllllllIlIIlIIllIlIIIlII.getHeight());
      GL11.glVertex2d(0.0D, (double)lllllllllllllllIlIIlIIllIlIIIlII.getHeight());
      GL11.glVertex2d(0.0D, 0.0D);
      GL11.glEnd();
   }

   private static void lIlIIllIIlIIIl() {
      lllllllllIll = new int[11];
      lllllllllIll[0] = (241 ^ 190 ^ (32 ^ 17) << " ".length()) << " ".length() & (((113 ^ 62) << " ".length() ^ 167 + 91 - 157 + 78) << " ".length() ^ -" ".length());
      lllllllllIll[1] = (127 ^ 118) << " ".length();
      lllllllllIll[2] = " ".length();
      lllllllllIll[3] = 169 + 248 - 158 + 8 + ("   ".length() << ("   ".length() << " ".length())) - -(150 ^ 172) + ((18 ^ 33) << (" ".length() << " ".length())) << (" ".length() << " ".length());
      lllllllllIll[4] = 171 + 1519 - 324 + 155 << " ".length();
      lllllllllIll[5] = 170 + 1339 - 739 + 691 + 698 + 1910 - 1686 + 1013 - (32 + 236 - 186 + 155 << " ".length()) + 502 + 206 - 588 + 511;
      lllllllllIll[6] = (247 ^ 164 ^ (52 ^ 17) << " ".length()) << (" ".length() << " ".length());
      lllllllllIll[7] = (108 ^ 117) << "   ".length();
      lllllllllIll[8] = "   ".length();
      lllllllllIll[9] = " ".length() << "   ".length();
      lllllllllIll[10] = " ".length() << " ".length();
   }

   static {
      lIlIIllIIlIIIl();
      lIlIIllIIIllII();
   }

   public void handleAddComponent(Groupbox lllllllllllllllIlIIlIIllIIlllIlI, Container lllllllllllllllIlIIlIIllIIlllIll) {
      lllllllllllllllIlIIlIIllIIlllIlI.setWidth(lllllllllIll[6]);
      lllllllllllllllIlIIlIIllIIlllIlI.setHeight(lllllllllIll[7]);
      lllllllllllllllIlIIlIIllIIlllIlI.setOriginOffsetY(lllllllllllllllIlIIlIIllIIlllIlI.getTheme().getFontRenderer().getFontHeight() + lllllllllIll[8]);
   }

   public void handleMouseDown(Groupbox lllllllllllllllIlIIlIIllIlIIIIlI, int lllllllllllllllIlIIlIIllIlIIIIIl, int lllllllllllllllIlIIlIIllIlIIIIII, int lllllllllllllllIlIIlIIllIIllllll) {
   }
}
