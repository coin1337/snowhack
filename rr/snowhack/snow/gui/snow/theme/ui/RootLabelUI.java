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
import rr.snowhack.snow.gui.rgui.component.AlignedComponent;
import rr.snowhack.snow.gui.rgui.component.use.Label;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;

public class RootLabelUI<T extends Label> extends AbstractComponentUI<Label> {
   // $FF: synthetic field
   private static final String[] lIIIIlIIlllIl;
   // $FF: synthetic field
   private static final int[] lIIIIlIIllllI;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;

   private static String lIlIlIllIIllII(String lllllllllllllllIlIIIIIIIIlIIllll, String lllllllllllllllIlIIIIIIIIlIlIIII) {
      try {
         String lllllllllllllllIlIIIIIIIIlIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIIIIIIIlIlIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIIIIIlIlIIll.init(lIIIIlIIllllI[3], lllllllllllllllIlIIIIIIIIlIIllIl);
         return new String(lllllllllllllllIlIIIIIIIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIllIIlllI() {
      lIIIIlIIllllI = new int[8];
      lIIIIlIIllllI[0] = (247 ^ 148) & ~(94 ^ 61);
      lIIIIlIIllllI[1] = (" ".length() << " ".length() ^ 185 ^ 178) << " ".length();
      lIIIIlIIllllI[2] = " ".length();
      lIIIIlIIllllI[3] = " ".length() << " ".length();
      lIIIIlIIllllI[4] = 524 + 444 - 863 + 552 + 114 + 1 - 22 + 62 - (87 + 58 - 134 + 118 << " ".length()) + 90 + 130 - 165 + 112 << (" ".length() << " ".length());
      lIIIIlIIllllI[5] = 667 + 424 - 557 + 987 << " ".length();
      lIIIIlIIllllI[6] = 2509 + 2715 - 4987 + 3316;
      lIIIIlIIllllI[7] = "   ".length();
   }

   public RootLabelUI() {
      lllllllllllllllIlIIIIIIIlIIllIIl.cFontRenderer = new CFontRenderer(new Font(lIIIIlIIlllIl[lIIIIlIIllllI[0]], lIIIIlIIllllI[0], lIIIIlIIllllI[1]), (boolean)lIIIIlIIllllI[2], (boolean)lIIIIlIIllllI[0]);
   }

   public void handleSizeComponent(Label lllllllllllllllIlIIIIIIIIllIllII) {
      String[] lllllllllllllllIlIIIIIIIIllIllll = lllllllllllllllIlIIIIIIIIllIllII.getLines();
      int lllllllllllllllIlIIIIIIIIllIlllI = lIIIIlIIllllI[0];
      int lllllllllllllllIlIIIIIIIIllIllIl = lIIIIlIIllllI[0];
      float lllllllllllllllIlIIIIIIIIllIlIII = lllllllllllllllIlIIIIIIIIllIllll;
      float lllllllllllllllIlIIIIIIIIllIIlll = lllllllllllllllIlIIIIIIIIllIllll.length;
      int lllllllllllllllIlIIIIIIIIllIIllI = lIIIIlIIllllI[0];

      do {
         if (!lIlIlIllIIllll(lllllllllllllllIlIIIIIIIIllIIllI, lllllllllllllllIlIIIIIIIIllIIlll)) {
            lllllllllllllllIlIIIIIIIIllIllII.setWidth(lllllllllllllllIlIIIIIIIIllIllIl);
            lllllllllllllllIlIIIIIIIIllIllII.setHeight(lllllllllllllllIlIIIIIIIIllIlllI);
            return;
         }

         String lllllllllllllllIlIIIIIIIIlllIIlI = lllllllllllllllIlIIIIIIIIllIlIII[lllllllllllllllIlIIIIIIIIllIIllI];
         lllllllllllllllIlIIIIIIIIllIllIl = Math.max(lllllllllllllllIlIIIIIIIIllIllIl, lllllllllllllllIlIIIIIIIIllIllII.getFontRenderer().getStringWidth(lllllllllllllllIlIIIIIIIIlllIIlI));
         lllllllllllllllIlIIIIIIIIllIlllI += lllllllllllllllIlIIIIIIIIllIllII.getFontRenderer().getFontHeight() + lIIIIlIIllllI[7];
         ++lllllllllllllllIlIIIIIIIIllIIllI;
         "".length();
      } while("   ".length() >= 0);

   }

   private static boolean lIlIlIllIlIIIl(int var0) {
      return var0 != 0;
   }

   public void renderComponent(Label lllllllllllllllIlIIIIIIIlIIIIlII, FontRenderer lllllllllllllllIlIIIIIIIlIIIlIIl) {
      lllllllllllllllIlIIIIIIIlIIIlIIl = lllllllllllllllIlIIIIIIIlIIIIlII.getFontRenderer();
      String[] lllllllllllllllIlIIIIIIIlIIIlIII = lllllllllllllllIlIIIIIIIlIIIIlII.getLines();
      int lllllllllllllllIlIIIIIIIlIIIIlll = lIIIIlIIllllI[0];
      boolean lllllllllllllllIlIIIIIIIlIIIIllI = lllllllllllllllIlIIIIIIIlIIIIlII.isShadow();
      short lllllllllllllllIlIIIIIIIIlllllll = lllllllllllllllIlIIIIIIIlIIIlIII;
      int lllllllllllllllIlIIIIIIIIllllllI = lllllllllllllllIlIIIIIIIlIIIlIII.length;
      int lllllllllllllllIlIIIIIIIIlllllIl = lIIIIlIIllllI[0];

      do {
         if (!lIlIlIllIIllll(lllllllllllllllIlIIIIIIIIlllllIl, lllllllllllllllIlIIIIIIIIllllllI)) {
            GL11.glDisable(lIIIIlIIllllI[6]);
            GL11.glDisable(lIIIIlIIllllI[5]);
            return;
         }

         String lllllllllllllllIlIIIIIIIlIIIllII = lllllllllllllllIlIIIIIIIIlllllll[lllllllllllllllIlIIIIIIIIlllllIl];
         int lllllllllllllllIlIIIIIIIlIIIllIl = lIIIIlIIllllI[0];
         if (lIlIlIllIlIIII(lllllllllllllllIlIIIIIIIlIIIIlII.getAlignment(), AlignedComponent.Alignment.CENTER)) {
            lllllllllllllllIlIIIIIIIlIIIllIl = lllllllllllllllIlIIIIIIIlIIIIlII.getWidth() / lIIIIlIIllllI[3] - lllllllllllllllIlIIIIIIIlIIIIlIl.cFontRenderer.getStringWidth(lllllllllllllllIlIIIIIIIlIIIllII) / lIIIIlIIllllI[3];
            "".length();
            if (((100 ^ 77) << (" ".length() << " ".length()) ^ 112 + 146 - 186 + 89) <= 0) {
               return;
            }
         } else if (lIlIlIllIlIIII(lllllllllllllllIlIIIIIIIlIIIIlII.getAlignment(), AlignedComponent.Alignment.RIGHT)) {
            lllllllllllllllIlIIIIIIIlIIIllIl = lllllllllllllllIlIIIIIIIlIIIIlII.getWidth() - lllllllllllllllIlIIIIIIIlIIIIlIl.cFontRenderer.getStringWidth(lllllllllllllllIlIIIIIIIlIIIllII);
         }

         if (lIlIlIllIlIIIl(lllllllllllllllIlIIIIIIIlIIIIllI)) {
            GL11.glDisable(lIIIIlIIllllI[4]);
            GL11.glEnable(lIIIIlIIllllI[5]);
            GL11.glEnable(lIIIIlIIllllI[6]);
            lllllllllllllllIlIIIIIIIlIIIIlIl.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIIIIIIIlIIIllII, (double)lllllllllllllllIlIIIIIIIlIIIllIl, (double)lllllllllllllllIlIIIIIIIlIIIIlll, Color.white.getRGB());
            "".length();
            GL11.glEnable(lIIIIlIIllllI[4]);
            GL11.glDisable(lIIIIlIIllllI[5]);
            GL11.glDisable(lIIIIlIIllllI[6]);
            "".length();
            if ((((96 ^ 67) << (" ".length() << " ".length()) ^ 59 + 107 - 121 + 120) << " ".length() & (((182 ^ 191) << (" ".length() << (" ".length() << " ".length())) ^ 170 + 60 - 188 + 143) << " ".length() ^ -" ".length())) >= " ".length() << " ".length()) {
               return;
            }
         } else {
            GL11.glDisable(lIIIIlIIllllI[4]);
            GL11.glEnable(lIIIIlIIllllI[5]);
            GL11.glEnable(lIIIIlIIllllI[6]);
            lllllllllllllllIlIIIIIIIlIIIIlIl.cFontRenderer.drawString(lllllllllllllllIlIIIIIIIlIIIllII, (float)lllllllllllllllIlIIIIIIIlIIIllIl, (float)lllllllllllllllIlIIIIIIIlIIIIlll, Color.white.getRGB());
            "".length();
            GL11.glEnable(lIIIIlIIllllI[4]);
            GL11.glDisable(lIIIIlIIllllI[5]);
            GL11.glDisable(lIIIIlIIllllI[6]);
         }

         lllllllllllllllIlIIIIIIIlIIIIlll += lllllllllllllllIlIIIIIIIlIIIlIIl.getFontHeight() + lIIIIlIIllllI[7];
         ++lllllllllllllllIlIIIIIIIIlllllIl;
         "".length();
      } while(" ".length() != " ".length() << " ".length());

   }

   private static boolean lIlIlIllIIllll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIlIllIIllIl() {
      lIIIIlIIlllIl = new String[lIIIIlIIllllI[2]];
      lIIIIlIIlllIl[lIIIIlIIllllI[0]] = lIlIlIllIIllII("6x9zt/pqwy0=", "SxdaA");
   }

   static {
      lIlIlIllIIlllI();
      lIlIlIllIIllIl();
   }

   private static boolean lIlIlIllIlIIII(Object var0, Object var1) {
      return var0 == var1;
   }
}
