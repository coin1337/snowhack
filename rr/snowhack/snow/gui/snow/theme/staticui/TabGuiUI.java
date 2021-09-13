package rr.snowhack.snow.gui.snow.theme.staticui;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.gui.snow.component.TabGUI;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.util.Wrapper;

public class TabGuiUI extends AbstractComponentUI<TabGUI> {
   // $FF: synthetic field
   long lastms = System.currentTimeMillis();
   // $FF: synthetic field
   private static final String[] lIIIlIlIlIIll;
   // $FF: synthetic field
   private static final int[] lIIIlIlIlIllI;

   private static int lIllIIIlIIllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void lIllIIIlIIlIII() {
      lIIIlIlIlIIll = new String[lIIIlIlIlIllI[14]];
      lIIIlIlIlIIll[lIIIlIlIlIllI[0]] = lIllIIIlIIIlIl("Ax2xzM2CItg=", "JkJEu");
      lIIIlIlIlIIll[lIIIlIlIlIllI[2]] = lIllIIIlIIIllI("w6ER", "FrEuj");
      lIIIlIlIlIIll[lIIIlIlIlIllI[9]] = lIllIIIlIIIlll("7rHu6blVSUk=", "oeaYr");
   }

   private static void lIllIIIlIIllII() {
      lIIIlIlIlIllI = new int[16];
      lIIIlIlIlIllI[0] = (12 ^ 39) << " ".length() & ~((184 ^ 147) << " ".length());
      lIIIlIlIlIllI[1] = ((161 ^ 134) << " ".length() ^ 241 ^ 186) << " ".length();
      lIIIlIlIlIllI[2] = " ".length();
      lIIIlIlIlIllI[3] = 366 + 713 - 1027 + 669 << (" ".length() << " ".length());
      lIIIlIlIlIllI[4] = 1477 + 1142 - -629 + 305;
      lIIIlIlIlIllI[5] = (" ".length() << (" ".length() << " ".length())) + (237 + 45 - -56 + 33 << (" ".length() << " ".length())) - (105 + 90 - 61 + 9) + ((182 ^ 189) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
      lIIIlIlIlIllI[6] = (" ".length() << "   ".length()) + 91 + 170 - 199 + 155 - ((166 ^ 189) << (" ".length() << " ".length())) + ((64 ^ 3) << (" ".length() << " ".length())) << " ".length();
      lIIIlIlIlIllI[7] = 444 + 180 - 448 + 555 + 317 + 141 - 304 + 223 - (846 + 406 - 476 + 137) + ((143 ^ 134) << ("   ".length() << " ".length()));
      lIIIlIlIlIllI[8] = (209 + 27 - -96 + 7 << (" ".length() << (" ".length() << " ".length()))) + 2085 + 2491 - 4126 + 4879 - (5457 + 5790 - 5369 + 1433) + 2369 + 59 - 1026 + 2581;
      lIIIlIlIlIllI[9] = " ".length() << " ".length();
      lIIIlIlIlIllI[10] = 175 ^ 168;
      lIIIlIlIlIllI[11] = 246 + 132 - 178 + 55;
      lIIIlIlIlIllI[12] = (49 + 432 - 58 + 234 << " ".length()) + ((26 ^ 105) << (" ".length() << " ".length())) - (372 + 81 - 185 + 127 << (" ".length() << " ".length())) + 1720 + 868 - 720 + 1027;
      lIIIlIlIlIllI[13] = (76 ^ 3) << " ".length() ^ 86 + 34 - -31 + 0;
      lIIIlIlIlIllI[14] = "   ".length();
      lIIIlIlIlIllI[15] = " ".length() << "   ".length();
   }

   public void renderComponent(TabGUI lllllllllllllllIIllIllIIIllIIlIl, FontRenderer lllllllllllllllIIllIllIIIllIIlII) {
      boolean lllllllllllllllIIllIllIIIllIIIll = lIIIlIlIlIllI[0];
      float lllllllllllllllIIllIllIIIllIIIlI = (float)(System.currentTimeMillis() - lllllllllllllllIIllIllIIIllIIllI.lastms);
      if (lIllIIIlIIlllI(lIllIIIlIIllIl(lllllllllllllllIIllIllIIIllIIIlI, 2.0F))) {
         lllllllllllllllIIllIllIIIllIIlIl.selectedLerpY += ((float)(lllllllllllllllIIllIllIIIllIIlIl.selected * lIIIlIlIlIllI[1]) - lllllllllllllllIIllIllIIIllIIlIl.selectedLerpY) * lllllllllllllllIIllIllIIIllIIIlI * 0.02F;
         lllllllllllllllIIllIllIIIllIIIll = lIIIlIlIlIllI[2];
         lllllllllllllllIIllIllIIIllIIllI.lastms = System.currentTimeMillis();
      }

      GL11.glDisable(lIIIlIlIlIllI[3]);
      GL11.glDisable(lIIIlIlIlIllI[4]);
      GL11.glEnable(lIIIlIlIlIllI[5]);
      GL11.glBlendFunc(lIIIlIlIlIllI[6], lIIIlIlIlIllI[7]);
      GL11.glShadeModel(lIIIlIlIlIllI[8]);
      GL11.glPushMatrix();
      Exception lllllllllllllllIIllIllIIIlIllIlI = lIIIlIlIlIllI[9];
      char lllllllllllllllIIllIllIIIlIllIIl = lIIIlIlIlIllI[9];
      GL11.glTranslatef((float)lllllllllllllllIIllIllIIIlIllIlI, (float)lllllllllllllllIIllIllIIIlIllIIl, 0.0F);
      lllllllllllllllIIllIllIIIllIIllI.drawBox(lIIIlIlIlIllI[0], lIIIlIlIlIllI[0], lllllllllllllllIIllIllIIIllIIlIl.width, lllllllllllllllIIllIllIIIllIIlIl.height);
      SnowGUI.primaryColour.setGLColour();
      GL11.glColor3f(0.59F, 0.05F, 0.11F);
      GL11.glBegin(lIIIlIlIlIllI[10]);
      GL11.glVertex2d(0.0D, (double)lllllllllllllllIIllIllIIIllIIlIl.selectedLerpY);
      GL11.glVertex2d(0.0D, (double)(lllllllllllllllIIllIllIIIllIIlIl.selectedLerpY + 10.0F));
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIllIIlIl.width, (double)(lllllllllllllllIIllIllIIIllIIlIl.selectedLerpY + 10.0F));
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIllIIlIl.width, (double)lllllllllllllllIIllIllIIIllIIlIl.selectedLerpY);
      GL11.glEnd();
      char lllllllllllllllIIllIllIIIlIllIII = lIIIlIlIlIllI[2];
      int lllllllllllllllIIllIllIIIllIllII = lIIIlIlIlIllI[0];

      while(lIllIIIlIIllll(lllllllllllllllIIllIllIIIllIllII, lllllllllllllllIIllIllIIIllIIlIl.tabs.size())) {
         String lllllllllllllllIIllIllIIIlIlIllI = ((TabGUI.Tab)lllllllllllllllIIllIllIIIllIIlIl.tabs.get(lllllllllllllllIIllIllIIIllIllII)).name;
         GL11.glEnable(lIIIlIlIlIllI[4]);
         GL11.glColor3f(1.0F, 1.0F, 1.0F);
         Wrapper.getFontRenderer().drawStringWithShadow(lIIIlIlIlIllI[9], lllllllllllllllIIllIllIIIlIllIII, lIIIlIlIlIllI[11], lIIIlIlIlIllI[11], lIIIlIlIlIllI[11], String.valueOf((new StringBuilder()).append(lIIIlIlIlIIll[lIIIlIlIlIllI[0]]).append(lllllllllllllllIIllIllIIIlIlIllI)));
         lllllllllllllllIIllIllIIIlIllIII += 10;
         ++lllllllllllllllIIllIllIIIllIllII;
         "".length();
         if (((55 ^ 44) << " ".length() ^ 185 ^ 138) <= 0) {
            return;
         }
      }

      if (lIllIIIlIlIIII(lllllllllllllllIIllIllIIIllIIlIl.tabOpened)) {
         GL11.glPushMatrix();
         GL11.glDisable(lIIIlIlIlIllI[4]);
         TabGUI.Tab lllllllllllllllIIllIllIIIllIlIII = (TabGUI.Tab)lllllllllllllllIIllIllIIIllIIlIl.tabs.get(lllllllllllllllIIllIllIIIllIIlIl.selected);
         GL11.glTranslatef((float)(lllllllllllllllIIllIllIIIllIIlIl.width + lIIIlIlIlIllI[9]), 0.0F, 0.0F);
         lllllllllllllllIIllIllIIIllIIllI.drawBox(lIIIlIlIlIllI[0], lIIIlIlIlIllI[0], lllllllllllllllIIllIllIIIllIlIII.width, lllllllllllllllIIllIllIIIllIlIII.height);
         if (lIllIIIlIlIIII(lllllllllllllllIIllIllIIIllIIIll)) {
            lllllllllllllllIIllIllIIIllIlIII.lerpSelectY += ((float)(lllllllllllllllIIllIllIIIllIlIII.selected * lIIIlIlIlIllI[1]) - lllllllllllllllIIllIllIIIllIlIII.lerpSelectY) * lllllllllllllllIIllIllIIIllIIIlI * 0.02F;
         }

         GL11.glColor3f(0.6F, 0.56F, 1.0F);
         GL11.glBegin(lIIIlIlIlIllI[10]);
         GL11.glVertex2d(0.0D, (double)lllllllllllllllIIllIllIIIllIlIII.lerpSelectY);
         GL11.glVertex2d(0.0D, (double)(lllllllllllllllIIllIllIIIllIlIII.lerpSelectY + 10.0F));
         GL11.glVertex2d((double)lllllllllllllllIIllIllIIIllIlIII.width, (double)(lllllllllllllllIIllIllIIIllIlIII.lerpSelectY + 10.0F));
         GL11.glVertex2d((double)lllllllllllllllIIllIllIIIllIlIII.width, (double)lllllllllllllllIIllIllIIIllIlIII.lerpSelectY);
         GL11.glEnd();
         int lllllllllllllllIIllIllIIIllIIlll = lIIIlIlIlIllI[2];
         int lllllllllllllllIIllIllIIIlIlIlIl = lIIIlIlIlIllI[0];

         while(lIllIIIlIIllll(lllllllllllllllIIllIllIIIlIlIlIl, lllllllllllllllIIllIllIIIllIlIII.features.size())) {
            char lllllllllllllllIIllIllIIIlIlIlII = (Module)lllllllllllllllIIllIllIIIllIlIII.features.get(lllllllllllllllIIllIllIIIlIlIlIl);
            StringBuilder var10000 = new StringBuilder();
            String var10001;
            if (lIllIIIlIlIIII(lllllllllllllllIIllIllIIIlIlIlII.isEnabled())) {
               var10001 = lIIIlIlIlIIll[lIIIlIlIlIllI[2]];
               "".length();
               if (-((186 ^ 161) << " ".length() ^ (40 ^ 49) << " ".length()) > 0) {
                  return;
               }
            } else {
               var10001 = lIIIlIlIlIIll[lIIIlIlIlIllI[9]];
            }

            String lllllllllllllllIIllIllIIIllIlIlI = String.valueOf(var10000.append(var10001).append(lllllllllllllllIIllIllIIIlIlIlII.getName()));
            GL11.glEnable(lIIIlIlIlIllI[4]);
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            Wrapper.getFontRenderer().drawStringWithShadow(lIIIlIlIlIllI[9], lllllllllllllllIIllIllIIIllIIlll, lIIIlIlIlIllI[11], lIIIlIlIlIllI[11], lIIIlIlIlIllI[11], lllllllllllllllIIllIllIIIllIlIlI);
            lllllllllllllllIIllIllIIIllIIlll += 10;
            ++lllllllllllllllIIllIllIIIlIlIlIl;
            "".length();
            if (((21 ^ 58) << " ".length() & ~((74 ^ 101) << " ".length())) > "   ".length()) {
               return;
            }
         }

         GL11.glDisable(lIIIlIlIlIllI[12]);
         GL11.glPopMatrix();
      }

      GL11.glPopMatrix();
      GL11.glEnable(lIIIlIlIlIllI[4]);
      GL11.glEnable(lIIIlIlIlIllI[3]);
   }

   static {
      lIllIIIlIIllII();
      lIllIIIlIIlIII();
   }

   private static String lIllIIIlIIIlll(String lllllllllllllllIIllIllIIIIIlIIIl, String lllllllllllllllIIllIllIIIIIlIIII) {
      try {
         char lllllllllllllllIIllIllIIIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIIllIllIIIIIIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIllIIIIIIlllI.init(lIIIlIlIlIllI[9], lllllllllllllllIIllIllIIIIIIllll);
         return new String(lllllllllllllllIIllIllIIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void drawBox(int lllllllllllllllIIllIllIIIlIIlIIl, int lllllllllllllllIIllIllIIIlIIIIII, int lllllllllllllllIIllIllIIIIllllll, int lllllllllllllllIIllIllIIIlIIIllI) {
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.6F);
      GL11.glBegin(lIIIlIlIlIllI[10]);
      GL11.glVertex2i(lllllllllllllllIIllIllIIIlIIlIIl, lllllllllllllllIIllIllIIIlIIIIII);
      GL11.glVertex2i(lllllllllllllllIIllIllIIIIllllll, lllllllllllllllIIllIllIIIlIIIIII);
      GL11.glVertex2i(lllllllllllllllIIllIllIIIIllllll, lllllllllllllllIIllIllIIIlIIIllI);
      GL11.glVertex2i(lllllllllllllllIIllIllIIIlIIlIIl, lllllllllllllllIIllIllIIIlIIIllI);
      GL11.glEnd();
      double lllllllllllllllIIllIllIIIlIIIlIl = (double)lllllllllllllllIIllIllIIIlIIlIIl - 0.1D;
      double lllllllllllllllIIllIllIIIlIIIlII = (double)lllllllllllllllIIllIllIIIIllllll + 0.1D;
      double lllllllllllllllIIllIllIIIlIIIIll = (double)lllllllllllllllIIllIllIIIlIIIIII - 0.1D;
      double lllllllllllllllIIllIllIIIlIIIIlI = (double)lllllllllllllllIIllIllIIIlIIIllI + 0.1D;
      GL11.glLineWidth(1.5F);
      GL11.glColor3f(0.59F, 0.05F, 0.11F);
      GL11.glBegin(lIIIlIlIlIllI[9]);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlIl, lllllllllllllllIIllIllIIIlIIIIll);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlII, lllllllllllllllIIllIllIIIlIIIIll);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlII, lllllllllllllllIIllIllIIIlIIIIlI);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlIl, lllllllllllllllIIllIllIIIlIIIIlI);
      GL11.glEnd();
      lllllllllllllllIIllIllIIIlIIIlIl -= 0.9D;
      lllllllllllllllIIllIllIIIlIIIlII += 0.9D;
      lllllllllllllllIIllIllIIIlIIIIll -= 0.9D;
      lllllllllllllllIIllIllIIIlIIIIlI += 0.9D;
      GL11.glBegin(lIIIlIlIlIllI[13]);
      GL11.glColor4f(0.125F, 0.125F, 0.125F, 0.75F);
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIlIIlIIl, (double)lllllllllllllllIIllIllIIIlIIIIII);
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIIllllll, (double)lllllllllllllllIIllIllIIIlIIIIII);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlII, lllllllllllllllIIllIllIIIlIIIIll);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlIl, lllllllllllllllIIllIllIIIlIIIIll);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlIl, lllllllllllllllIIllIllIIIlIIIIlI);
      GL11.glColor4f(0.125F, 0.125F, 0.125F, 0.75F);
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIlIIlIIl, (double)lllllllllllllllIIllIllIIIlIIIllI);
      GL11.glEnd();
      GL11.glBegin(lIIIlIlIlIllI[13]);
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIIllllll, (double)lllllllllllllllIIllIllIIIlIIIllI);
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIIllllll, (double)lllllllllllllllIIllIllIIIlIIIIII);
      GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlII, lllllllllllllllIIllIllIIIlIIIIll);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlII, lllllllllllllllIIllIllIIIlIIIIlI);
      GL11.glVertex2d(lllllllllllllllIIllIllIIIlIIIlIl, lllllllllllllllIIllIllIIIlIIIIlI);
      GL11.glColor4f(0.125F, 0.125F, 0.125F, 0.75F);
      GL11.glVertex2d((double)lllllllllllllllIIllIllIIIlIIlIIl, (double)lllllllllllllllIIllIllIIIlIIIllI);
      GL11.glEnd();
   }

   private static String lIllIIIlIIIllI(String lllllllllllllllIIllIllIIIIlIIIll, String lllllllllllllllIIllIllIIIIlIIIlI) {
      lllllllllllllllIIllIllIIIIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIIllIllIIIIlIIIIl = new StringBuilder();
      char[] lllllllllllllllIIllIllIIIIlIIlIl = lllllllllllllllIIllIllIIIIlIIIlI.toCharArray();
      int lllllllllllllllIIllIllIIIIlIIlII = lIIIlIlIlIllI[0];
      Exception lllllllllllllllIIllIllIIIIIllllI = lllllllllllllllIIllIllIIIIlIIIll.toCharArray();
      boolean lllllllllllllllIIllIllIIIIIlllIl = lllllllllllllllIIllIllIIIIIllllI.length;
      int lllllllllllllllIIllIllIIIIIlllII = lIIIlIlIlIllI[0];

      do {
         if (!lIllIIIlIIllll(lllllllllllllllIIllIllIIIIIlllII, lllllllllllllllIIllIllIIIIIlllIl)) {
            return String.valueOf(lllllllllllllllIIllIllIIIIlIIIIl);
         }

         char lllllllllllllllIIllIllIIIIIllIll = lllllllllllllllIIllIllIIIIIllllI[lllllllllllllllIIllIllIIIIIlllII];
         lllllllllllllllIIllIllIIIIlIIIIl.append((char)(lllllllllllllllIIllIllIIIIIllIll ^ lllllllllllllllIIllIllIIIIlIIlIl[lllllllllllllllIIllIllIIIIlIIlII % lllllllllllllllIIllIllIIIIlIIlIl.length]));
         "".length();
         ++lllllllllllllllIIllIllIIIIlIIlII;
         ++lllllllllllllllIIllIllIIIIIlllII;
         "".length();
      } while((((190 ^ 151) << " ".length() ^ 4 ^ 55) & ((69 ^ 92) << "   ".length() ^ 136 + 27 - 20 + 26 ^ -" ".length())) >= -" ".length());

      return null;
   }

   private static String lIllIIIlIIIlIl(String lllllllllllllllIIllIllIIIIIIIlII, String lllllllllllllllIIllIllIIIIIIIlIl) {
      try {
         SecretKeySpec lllllllllllllllIIllIllIIIIIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlIlIllI[15]), "DES");
         boolean lllllllllllllllIIllIllIIIIIIIIIl = Cipher.getInstance("DES");
         lllllllllllllllIIllIllIIIIIIIIIl.init(lIIIlIlIlIllI[9], lllllllllllllllIIllIllIIIIIIlIIl);
         return new String(lllllllllllllllIIllIllIIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIlIIlllI(int var0) {
      return var0 > 0;
   }

   private static boolean lIllIIIlIIllll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIllIIIlIlIIII(int var0) {
      return var0 != 0;
   }
}
