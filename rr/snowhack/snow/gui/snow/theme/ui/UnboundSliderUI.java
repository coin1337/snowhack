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
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.component.UnboundSlider;

public class UnboundSliderUI extends AbstractComponentUI<UnboundSlider> {
   // $FF: synthetic field
   private static final int[] lIIIIllIIlllI;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   private static final String[] lIIIIllIIllIl;

   private static boolean lIlIllIIIllIIl(int var0) {
      return var0 != 0;
   }

   static {
      lIlIllIIIllIII();
      lIlIllIIIlIlll();
   }

   public void handleAddComponent(UnboundSlider lllllllllllllllIIlllllIIIIllIlll, Container lllllllllllllllIIlllllIIIIlllIII) {
      lllllllllllllllIIlllllIIIIllIlll.setHeight(lllllllllllllllIIlllllIIIIllIlll.getTheme().getFontRenderer().getFontHeight());
      lllllllllllllllIIlllllIIIIllIlll.setWidth(lllllllllllllllIIlllllIIIIllIlll.getTheme().getFontRenderer().getStringWidth(lllllllllllllllIIlllllIIIIllIlll.getText()));
   }

   private static String lIlIllIIIlIllI(String lllllllllllllllIIlllllIIIIIIllII, String lllllllllllllllIIlllllIIIIIIlIll) {
      lllllllllllllllIIlllllIIIIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIIlllllIIIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllllIIIIIIllll = new StringBuilder();
      char[] lllllllllllllllIIlllllIIIIIIlllI = lllllllllllllllIIlllllIIIIIIlIll.toCharArray();
      int lllllllllllllllIIlllllIIIIIIllIl = lIIIIllIIlllI[0];
      byte lllllllllllllllIIlllllIIIIIIIlll = lllllllllllllllIIlllllIIIIIIllII.toCharArray();
      short lllllllllllllllIIlllllIIIIIIIllI = lllllllllllllllIIlllllIIIIIIIlll.length;
      int lllllllllllllllIIlllllIIIIIIIlIl = lIIIIllIIlllI[0];

      do {
         if (!lIlIllIIIllIll(lllllllllllllllIIlllllIIIIIIIlIl, lllllllllllllllIIlllllIIIIIIIllI)) {
            return String.valueOf(lllllllllllllllIIlllllIIIIIIllll);
         }

         String lllllllllllllllIIlllllIIIIIIIlII = lllllllllllllllIIlllllIIIIIIIlll[lllllllllllllllIIlllllIIIIIIIlIl];
         lllllllllllllllIIlllllIIIIIIllll.append((char)(lllllllllllllllIIlllllIIIIIIIlII ^ lllllllllllllllIIlllllIIIIIIlllI[lllllllllllllllIIlllllIIIIIIllIl % lllllllllllllllIIlllllIIIIIIlllI.length]));
         "".length();
         ++lllllllllllllllIIlllllIIIIIIllIl;
         ++lllllllllllllllIIlllllIIIIIIIlIl;
         "".length();
      } while((" ".length() << " ".length() & ~(" ".length() << " ".length())) <= " ".length() << (" ".length() << " ".length()));

      return null;
   }

   private static void lIlIllIIIlIlll() {
      lIIIIllIIllIl = new String[lIIIIllIIlllI[9]];
      lIIIIllIIllIl[lIIIIllIIlllI[0]] = lIlIllIIIlIlIl("a3RXPsx++c4=", "jKrVo");
      lIIIIllIIllIl[lIIIIllIIlllI[2]] = lIlIllIIIlIllI("Q3g=", "yXKNE");
   }

   private static boolean lIlIllIIIllIll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIllIIIllIII() {
      lIIIIllIIlllI = new int[12];
      lIIIIllIIlllI[0] = ((60 ^ 33) << " ".length() ^ 153 ^ 172) << (" ".length() << " ".length()) & ((18 + 121 - -2 + 0 ^ (3 ^ 66) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIllIIlllI[1] = (59 ^ 50) << " ".length();
      lIIIIllIIlllI[2] = " ".length();
      lIIIIllIIlllI[3] = (217279 + 175103 - 278488 + 310651 << "   ".length()) + 1415432 + 250885 - 675393 + 2296063 - (1824061 + 1416152 - 2132133 + 973409 << " ".length()) + (113539 + 515664 - -102055 + '辏' << (" ".length() << " ".length())) << " ".length();
      lIIIIllIIlllI[4] = 3856711 + 12396236 - 7839604 + 6126910;
      lIIIIllIIlllI[5] = (766497 + '퉆' - 603326 + 589948 << " ".length()) + 84710 + 86293 - '醁' + '鯿' - -(2844201 + 3089433 - 4391938 + 3134340) + (108949 + 135625 - 147812 + 139749 << "   ".length());
      lIIIIllIIlllI[6] = 404 + 1756 - 1555 + 2948;
      lIIIIllIIlllI[7] = 344 + 842 - 291 + 626 << " ".length();
      lIIIIllIIlllI[8] = (236 + 163 - 348 + 194 << " ".length()) + 261 + 167 - 324 + 197 - (23 + 27 - -63 + 52 << (" ".length() << " ".length())) + (54 + 232 - 246 + 255 << " ".length()) << (" ".length() << " ".length());
      lIIIIllIIlllI[9] = " ".length() << " ".length();
      lIIIIllIIlllI[10] = " ".length() << (" ".length() << " ".length());
      lIIIIllIIlllI[11] = " ".length() << "   ".length();
   }

   private static String lIlIllIIIlIlIl(String lllllllllllllllIIlllllIIIIIlllll, String lllllllllllllllIIlllllIIIIlIIIII) {
      try {
         byte lllllllllllllllIIlllllIIIIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), lIIIIllIIlllI[11]), "DES");
         byte lllllllllllllllIIlllllIIIIIlllII = Cipher.getInstance("DES");
         lllllllllllllllIIlllllIIIIIlllII.init(lIIIIllIIlllI[9], lllllllllllllllIIlllllIIIIIlllIl);
         return new String(lllllllllllllllIIlllllIIIIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public UnboundSliderUI() {
      lllllllllllllllIIlllllIIIlIIlIll.cFontRenderer = new CFontRenderer(new Font(lIIIIllIIllIl[lIIIIllIIlllI[0]], lIIIIllIIlllI[0], lIIIIllIIlllI[1]), (boolean)lIIIIllIIlllI[2], (boolean)lIIIIllIIlllI[0]);
   }

   public void renderComponent(UnboundSlider lllllllllllllllIIlllllIIIlIIIlII, FontRenderer lllllllllllllllIIlllllIIIlIIIIll) {
      String lllllllllllllllIIlllllIIIlIIIIlI = String.valueOf((new StringBuilder()).append(lllllllllllllllIIlllllIIIlIIIlII.getText()).append(lIIIIllIIllIl[lIIIIllIIlllI[2]]).append(lllllllllllllllIIlllllIIIlIIIlII.getValue()));
      int var10000;
      if (lIlIllIIIllIIl(lllllllllllllllIIlllllIIIlIIIlII.isPressed())) {
         var10000 = lIIIIllIIlllI[3];
         "".length();
         if ("   ".length() > "   ".length()) {
            return;
         }
      } else {
         var10000 = lIIIIllIIlllI[4];
      }

      float lllllllllllllllIIlllllIIIIllllII = var10000;
      if (lIlIllIIIllIIl(lllllllllllllllIIlllllIIIlIIIlII.isHovered())) {
         lllllllllllllllIIlllllIIIIllllII = (lllllllllllllllIIlllllIIIIllllII & lIIIIllIIlllI[5]) << lIIIIllIIlllI[2];
      }

      GL11.glEnable(lIIIIllIIlllI[6]);
      GL11.glEnable(lIIIIllIIlllI[7]);
      GL11.glDisable(lIIIIllIIlllI[8]);
      lllllllllllllllIIlllllIIIlIIIlIl.cFontRenderer.drawString(lllllllllllllllIIlllllIIIlIIIIlI, (float)(lllllllllllllllIIlllllIIIlIIIlII.getWidth() / lIIIIllIIlllI[9] - lllllllllllllllIIlllllIIIlIIIIll.getStringWidth(lllllllllllllllIIlllllIIIlIIIIlI) / lIIIIllIIlllI[9]), (float)(lllllllllllllllIIlllllIIIlIIIlII.getHeight() - lllllllllllllllIIlllllIIIlIIIIll.getFontHeight() / lIIIIllIIlllI[9] - lIIIIllIIlllI[10]), lllllllllllllllIIlllllIIIIllllII);
      "".length();
      GL11.glDisable(lIIIIllIIlllI[6]);
      GL11.glDisable(lIIIIllIIlllI[7]);
      GL11.glEnable(lIIIIllIIlllI[8]);
      GL11.glDisable(lIIIIllIIlllI[7]);
   }
}
