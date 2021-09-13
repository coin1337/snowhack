package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.component.EnumButton;

public class EnumbuttonUI extends AbstractComponentUI<EnumButton> {
   // $FF: synthetic field
   protected Color idleColour;
   // $FF: synthetic field
   private static final int[] lllIlllIIlll;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   protected Color downColour;
   // $FF: synthetic field
   private static final String[] lllIlllIIllI;
   // $FF: synthetic field
   long lastMS;
   // $FF: synthetic field
   EnumButton modeComponent;

   public EnumbuttonUI() {
      lllllllllllllllIlIllIIllIIlIIIII.cFontRenderer = new CFontRenderer(new Font(lllIlllIIllI[lllIlllIIlll[0]], lllIlllIIlll[0], lllIlllIIlll[1]), (boolean)lllIlllIIlll[2], (boolean)lllIlllIIlll[0]);
      lllllllllllllllIlIllIIllIIlIIIII.idleColour = new Color(lllIlllIIlll[3], lllIlllIIlll[3], lllIlllIIlll[3]);
      lllllllllllllllIlIllIIllIIlIIIII.downColour = new Color(lllIlllIIlll[0], lllIlllIIlll[0], lllIlllIIlll[0]);
      lllllllllllllllIlIllIIllIIlIIIII.lastMS = System.currentTimeMillis();
   }

   private static void lIIlllIlIIIlIl() {
      lllIlllIIlll = new int[11];
      lllIlllIIlll[0] = " ".length() << "   ".length() & ~(" ".length() << "   ".length());
      lllIlllIIlll[1] = 70 ^ 25 ^ (46 ^ 7) << " ".length();
      lllIlllIIlll[2] = " ".length();
      lllIlllIIlll[3] = 74 + 154 - 111 + 46;
      lllIlllIIlll[4] = 1846157 + 2263393 - 2630570 + 3887351 + 1706603 + 1069608 - 2535407 + 1753945 - (1532835 + 1114086 - 1123771 + 813837 << " ".length()) + 1544554 + 520243 - 1764760 + 2605262 << " ".length();
      lllIlllIIlll[5] = 10075129 + 13655268 - 10769515 + 1579371;
      lllIlllIIlll[6] = 183475 + 176264 - 30219 + 66867 + (1621299 + 240619 - 1270488 + 1334505 << " ".length()) - (337643 + 288860 - 464426 + 644942 << (" ".length() << " ".length())) + (1370090 + 800805 - 347065 + 1843935 << " ".length());
      lllIlllIIlll[7] = 1559 + 2801 - 3749 + 2942;
      lllIlllIIlll[8] = 340 + 1074 - 252 + 359 << " ".length();
      lllIlllIIlll[9] = 24 + 292 - 188 + 193 + ((56 ^ 21) << " ".length()) - (105 + 117 - -30 + 9) + 42 + 180 - -133 + 216 << (" ".length() << " ".length());
      lllIlllIIlll[10] = " ".length() << " ".length();
   }

   static {
      lIIlllIlIIIlIl();
      lIIlllIlIIIlII();
   }

   private static boolean lIIlllIlIIlIIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlllIlIIlIlI(int var0) {
      return var0 == 0;
   }

   public void handleAddComponent(EnumButton lllllllllllllllIlIllIIlIlllIlllI, Container lllllllllllllllIlIllIIlIlllIllIl) {
      lllllllllllllllIlIllIIlIlllIlllI.addPoof(new EnumButton.EnumbuttonIndexPoof<EnumButton, EnumButton.EnumbuttonIndexPoof.EnumbuttonInfo>() {
         public void execute(EnumButton lllllllllllllllIlIlIlIlIllIIlllI, EnumButton.EnumbuttonIndexPoof.EnumbuttonInfo lllllllllllllllIlIlIlIlIllIlIIII) {
            lllllllllllllllIlIllIIlIlllIllII.modeComponent = lllllllllllllllIlIlIlIlIllIIlllI;
            lllllllllllllllIlIllIIlIlllIllII.lastMS = System.currentTimeMillis();
         }
      });
   }

   private static boolean lIIlllIlIIlIII(Object var0) {
      return var0 != null;
   }

   public void handleSizeComponent(EnumButton lllllllllllllllIlIllIIlIllllIlll) {
      int lllllllllllllllIlIllIIlIlllllIIl = lllIlllIIlll[0];
      Exception lllllllllllllllIlIllIIlIllllIlIl = lllllllllllllllIlIllIIlIllllIlll.getModes();
      char lllllllllllllllIlIllIIlIllllIlII = lllllllllllllllIlIllIIlIllllIlIl.length;
      int lllllllllllllllIlIllIIlIllllIIll = lllIlllIIlll[0];

      do {
         if (!lIIlllIlIIlIll(lllllllllllllllIlIllIIlIllllIIll, lllllllllllllllIlIllIIlIllllIlII)) {
            lllllllllllllllIlIllIIlIllllIlll.setWidth(lllllllllllllllIlIllIIlIlllllIll.cFontRenderer.getStringWidth(lllllllllllllllIlIllIIlIllllIlll.getName()) + lllllllllllllllIlIllIIlIlllllIIl + lllIlllIIlll[2]);
            lllllllllllllllIlIllIIlIllllIlll.setHeight(lllllllllllllllIlIllIIlIlllllIll.cFontRenderer.getHeight() + lllIlllIIlll[10]);
            return;
         }

         short lllllllllllllllIlIllIIlIllllIIlI = lllllllllllllllIlIllIIlIllllIlIl[lllllllllllllllIlIllIIlIllllIIll];
         lllllllllllllllIlIllIIlIlllllIIl = Math.max(lllllllllllllllIlIllIIlIlllllIIl, lllllllllllllllIlIllIIlIlllllIll.cFontRenderer.getStringWidth(lllllllllllllllIlIllIIlIllllIIlI));
         ++lllllllllllllllIlIllIIlIllllIIll;
         "".length();
      } while("   ".length() > 0);

   }

   private static void lIIlllIlIIIlII() {
      lllIlllIIllI = new String[lllIlllIIlll[2]];
      lllIlllIIllI[lllIlllIIlll[0]] = lIIlllIlIIIIll("NBMTMjEMFw==", "bvaVP");
   }

   private static boolean lIIlllIlIIIlll(int var0) {
      return var0 > 0;
   }

   public void renderComponent(EnumButton lllllllllllllllIlIllIIllIIIlIlIl, FontRenderer lllllllllllllllIlIllIIllIIIlIlII) {
      if (lIIlllIlIIIlll(lIIlllIlIIIllI(System.currentTimeMillis() - lllllllllllllllIlIllIIllIIIIllII.lastMS, 3000L)) && lIIlllIlIIlIII(lllllllllllllllIlIllIIllIIIIllII.modeComponent)) {
         lllllllllllllllIlIllIIllIIIIllII.modeComponent = null;
      }

      int var10000;
      if (lIIlllIlIIlIIl(lllllllllllllllIlIllIIllIIIlIlIl.isPressed())) {
         var10000 = lllIlllIIlll[4];
         "".length();
         if (" ".length() << " ".length() == 0) {
            return;
         }
      } else {
         var10000 = lllIlllIIlll[5];
      }

      int lllllllllllllllIlIllIIllIIIlIIll = var10000;
      if (lIIlllIlIIlIIl(lllllllllllllllIlIllIIllIIIlIlIl.isHovered())) {
         lllllllllllllllIlIllIIllIIIlIIll = (lllllllllllllllIlIllIIllIIIlIIll & lllIlllIIlll[6]) << lllIlllIIlll[2];
      }

      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glEnable(lllIlllIIlll[7]);
      int lllllllllllllllIlIllIIllIIIIlIIl = lllllllllllllllIlIllIIllIIIlIlIl.getModes().length;
      long lllllllllllllllIlIllIIllIIIIlIII = (double)lllllllllllllllIlIllIIllIIIlIlIl.getWidth() / (double)lllllllllllllllIlIllIIllIIIIlIIl;
      double lllllllllllllllIlIllIIllIIIlIIII = lllllllllllllllIlIllIIllIIIIlIII * (double)lllllllllllllllIlIllIIllIIIlIlIl.getIndex();
      int lllllllllllllllIlIllIIllIIIIIllI = lllllllllllllllIlIllIIllIIIIlIII * (double)(lllllllllllllllIlIllIIllIIIlIlIl.getIndex() + lllIlllIIlll[2]);
      int lllllllllllllllIlIllIIllIIIIlllI = lllllllllllllllIlIllIIllIIIlIlIl.getHeight();
      double lllllllllllllllIlIllIIllIIIIIlII = 1.1F;
      GL11.glDisable(lllIlllIIlll[7]);
      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      GL11.glBegin(lllIlllIIlll[2]);
      GL11.glVertex2d(lllllllllllllllIlIllIIllIIIlIIII, (double)((float)lllllllllllllllIlIllIIllIIIIlllI / lllllllllllllllIlIllIIllIIIIIlII));
      GL11.glVertex2d(lllllllllllllllIlIllIIllIIIIIllI, (double)((float)lllllllllllllllIlIllIIllIIIIlllI / lllllllllllllllIlIllIIllIIIIIlII));
      GL11.glEnd();
      if (lIIlllIlIIlIII(lllllllllllllllIlIllIIllIIIIllII.modeComponent) && !lIIlllIlIIlIlI(lllllllllllllllIlIllIIllIIIIllII.modeComponent.equals(lllllllllllllllIlIllIIllIIIlIlIl))) {
         GL11.glEnable(lllIlllIIlll[7]);
         GL11.glEnable(lllIlllIIlll[8]);
         GL11.glDisable(lllIlllIIlll[9]);
         lllllllllllllllIlIllIIllIIIIllII.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllIIllIIIlIlIl.getIndexMode(), (double)(lllllllllllllllIlIllIIllIIIlIlIl.getWidth() - lllllllllllllllIlIllIIllIIIIllII.cFontRenderer.getStringWidth(lllllllllllllllIlIllIIllIIIlIlIl.getIndexMode())), 0.0D, lllllllllllllllIlIllIIllIIIlIIll);
         "".length();
         GL11.glDisable(lllIlllIIlll[7]);
         GL11.glDisable(lllIlllIIlll[8]);
         GL11.glEnable(lllIlllIIlll[9]);
      } else {
         GL11.glEnable(lllIlllIIlll[7]);
         GL11.glEnable(lllIlllIIlll[8]);
         GL11.glDisable(lllIlllIIlll[9]);
         lllllllllllllllIlIllIIllIIIIllII.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllIIllIIIlIlIl.getName(), 0.0D, 0.0D, lllllllllllllllIlIllIIllIIIlIIll);
         "".length();
         lllllllllllllllIlIllIIllIIIIllII.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllIIllIIIlIlIl.getIndexMode(), (double)(lllllllllllllllIlIllIIllIIIlIlIl.getWidth() - lllllllllllllllIlIllIIllIIIIllII.cFontRenderer.getStringWidth(lllllllllllllllIlIllIIllIIIlIlIl.getIndexMode())), 0.0D, lllllllllllllllIlIllIIllIIIlIIll);
         "".length();
         GL11.glDisable(lllIlllIIlll[7]);
         GL11.glDisable(lllIlllIIlll[8]);
         GL11.glEnable(lllIlllIIlll[9]);
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      }

      GL11.glDisable(lllIlllIIlll[8]);
   }

   private static String lIIlllIlIIIIll(String lllllllllllllllIlIllIIlIllIIlIII, String lllllllllllllllIlIllIIlIllIIllII) {
      lllllllllllllllIlIllIIlIllIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIllIIlIllIIlIll = new StringBuilder();
      char lllllllllllllllIlIllIIlIllIIIlIl = lllllllllllllllIlIllIIlIllIIllII.toCharArray();
      int lllllllllllllllIlIllIIlIllIIlIIl = lllIlllIIlll[0];
      byte lllllllllllllllIlIllIIlIllIIIIll = lllllllllllllllIlIllIIlIllIIlIII.toCharArray();
      String lllllllllllllllIlIllIIlIllIIIIlI = lllllllllllllllIlIllIIlIllIIIIll.length;
      int lllllllllllllllIlIllIIlIllIIIIIl = lllIlllIIlll[0];

      do {
         if (!lIIlllIlIIlIll(lllllllllllllllIlIllIIlIllIIIIIl, lllllllllllllllIlIllIIlIllIIIIlI)) {
            return String.valueOf(lllllllllllllllIlIllIIlIllIIlIll);
         }

         double lllllllllllllllIlIllIIlIllIIIIII = lllllllllllllllIlIllIIlIllIIIIll[lllllllllllllllIlIllIIlIllIIIIIl];
         lllllllllllllllIlIllIIlIllIIlIll.append((char)(lllllllllllllllIlIllIIlIllIIIIII ^ lllllllllllllllIlIllIIlIllIIIlIl[lllllllllllllllIlIllIIlIllIIlIIl % lllllllllllllllIlIllIIlIllIIIlIl.length]));
         "".length();
         ++lllllllllllllllIlIllIIlIllIIlIIl;
         ++lllllllllllllllIlIllIIlIllIIIIIl;
         "".length();
      } while(" ".length() << " ".length() > -" ".length());

      return null;
   }

   private static boolean lIIlllIlIIlIll(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIIlllIlIIIllI(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }
}
