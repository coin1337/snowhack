package rr.snowhack.snow.gui.snow;

import org.lwjgl.opengl.GL11;

public class RenderHelper {
   // $FF: synthetic field
   private static final int[] lllIllIIIllI;

   public static void drawArcOutline(float lllllllllllllllIlIlllIIlllIIlIIl, float lllllllllllllllIlIlllIIlllIIIIlI, float lllllllllllllllIlIlllIIlllIIIIIl, float lllllllllllllllIlIlllIIlllIIIllI, float lllllllllllllllIlIlllIIlllIIIlIl, int lllllllllllllllIlIlllIIlllIIIlII) {
      GL11.glBegin(lllIllIIIllI[2]);
      int lllllllllllllllIlIlllIIlllIIlIlI = (int)((float)lllllllllllllllIlIlllIIlllIIIlII / (360.0F / lllllllllllllllIlIlllIIlllIIIllI)) + lllIllIIIllI[1];

      do {
         if (!lIIllIllIIIllI(lIIllIllIIIlll((float)lllllllllllllllIlIlllIIlllIIlIlI, (float)lllllllllllllllIlIlllIIlllIIIlII / (360.0F / lllllllllllllllIlIlllIIlllIIIlIl)))) {
            GL11.glEnd();
            return;
         }

         double lllllllllllllllIlIlllIIlllIIlIll = 6.283185307179586D * (double)lllllllllllllllIlIlllIIlllIIlIlI / (double)lllllllllllllllIlIlllIIlllIIIlII;
         GL11.glVertex2d((double)lllllllllllllllIlIlllIIlllIIlIIl + Math.cos(lllllllllllllllIlIlllIIlllIIlIll) * (double)lllllllllllllllIlIlllIIlllIIIIIl, (double)lllllllllllllllIlIlllIIlllIIIIlI + Math.sin(lllllllllllllllIlIlllIIlllIIlIll) * (double)lllllllllllllllIlIlllIIlllIIIIIl);
         ++lllllllllllllllIlIlllIIlllIIlIlI;
         "".length();
      } while(" ".length() == " ".length());

   }

   public static void drawFilledRectangle(float lllllllllllllllIlIlllIIlIlIlIIll, float lllllllllllllllIlIlllIIlIlIlIIlI, float lllllllllllllllIlIlllIIlIlIlIlIl, float lllllllllllllllIlIlllIIlIlIlIlII) {
      GL11.glEnable(lllIllIIIllI[7]);
      GL11.glBlendFunc(lllIllIIIllI[8], lllIllIIIllI[9]);
      GL11.glBegin(lllIllIIIllI[10]);
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIlIIll + lllllllllllllllIlIlllIIlIlIlIlIl), (double)lllllllllllllllIlIlllIIlIlIlIIlI);
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIlIIll, (double)lllllllllllllllIlIlllIIlIlIlIIlI);
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIlIIll, (double)(lllllllllllllllIlIlllIIlIlIlIIlI + lllllllllllllllIlIlllIIlIlIlIlII));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIlIIll + lllllllllllllllIlIlllIIlIlIlIlIl), (double)(lllllllllllllllIlIlllIIlIlIlIIlI + lllllllllllllllIlIlllIIlIlIlIlII));
      GL11.glEnd();
   }

   private static boolean lIIllIllIIIllI(int var0) {
      return var0 <= 0;
   }

   public static void drawOutlinedRoundedRectangle(int lllllllllllllllIlIlllIIlIlllIIIl, int lllllllllllllllIlIlllIIlIllllIlI, int lllllllllllllllIlIlllIIlIllllIIl, int lllllllllllllllIlIlllIIlIllIlllI, float lllllllllllllllIlIlllIIlIlllIlll, float lllllllllllllllIlIlllIIlIlllIllI, float lllllllllllllllIlIlllIIlIlllIlIl, float lllllllllllllllIlIlllIIlIlllIlII, float lllllllllllllllIlIlllIIlIlllIIll, float lllllllllllllllIlIlllIIlIllIlIII) {
      drawRoundedRectangle((float)lllllllllllllllIlIlllIIlIlllIIIl, (float)lllllllllllllllIlIlllIIlIllllIlI, (float)lllllllllllllllIlIlllIIlIllllIIl, (float)lllllllllllllllIlIlllIIlIllIlllI, lllllllllllllllIlIlllIIlIlllIlll);
      GL11.glColor4f(lllllllllllllllIlIlllIIlIlllIllI, lllllllllllllllIlIlllIIlIlllIlIl, lllllllllllllllIlIlllIIlIlllIlII, lllllllllllllllIlIlllIIlIlllIIll);
      drawRoundedRectangle((float)lllllllllllllllIlIlllIIlIlllIIIl + lllllllllllllllIlIlllIIlIllIlIII, (float)lllllllllllllllIlIlllIIlIllllIlI + lllllllllllllllIlIlllIIlIllIlIII, (float)lllllllllllllllIlIlllIIlIllllIIl - lllllllllllllllIlIlllIIlIllIlIII * 2.0F, (float)lllllllllllllllIlIlllIIlIllIlllI - lllllllllllllllIlIlllIIlIllIlIII * 2.0F, lllllllllllllllIlIlllIIlIlllIlll);
   }

   public static void drawRectangle(float lllllllllllllllIlIlllIIlIlIlllll, float lllllllllllllllIlIlllIIlIlIllllI, float lllllllllllllllIlIlllIIlIlIlllIl, float lllllllllllllllIlIlllIIlIllIIIII) {
      GL11.glEnable(lllIllIIIllI[7]);
      GL11.glBlendFunc(lllIllIIIllI[8], lllIllIIIllI[9]);
      GL11.glBegin(lllIllIIIllI[2]);
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIlllIl, (double)lllllllllllllllIlIlllIIlIlIllllI);
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIlllll, (double)lllllllllllllllIlIlllIIlIlIllllI);
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIlllll, (double)lllllllllllllllIlIlllIIlIllIIIII);
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIlllIl, (double)lllllllllllllllIlIlllIIlIllIIIII);
      GL11.glEnd();
   }

   public static void drawCircle(float lllllllllllllllIlIlllIIllIIllIlI, float lllllllllllllllIlIlllIIllIIllIIl, float lllllllllllllllIlIlllIIllIIllIII) {
      drawCircle(lllllllllllllllIlIlllIIllIIllIlI, lllllllllllllllIlIlllIIllIIllIIl, lllllllllllllllIlIlllIIllIIllIII, lllIllIIIllI[3], lllIllIIIllI[4], lllIllIIIllI[6]);
   }

   public static void drawCircle(float lllllllllllllllIlIlllIIllIIIlIll, float lllllllllllllllIlIlllIIllIIlIIII, float lllllllllllllllIlIlllIIllIIIllll, int lllllllllllllllIlIlllIIllIIIlIII, int lllllllllllllllIlIlllIIllIIIIlll, int lllllllllllllllIlIlllIIllIIIIllI) {
      drawArc(lllllllllllllllIlIlllIIllIIIlIll, lllllllllllllllIlIlllIIllIIlIIII, lllllllllllllllIlIlllIIllIIIllll, (float)lllllllllllllllIlIlllIIllIIIlIII, (float)lllllllllllllllIlIlllIIllIIIIlll, lllllllllllllllIlIlllIIllIIIIllI);
   }

   public static void drawArc(float lllllllllllllllIlIlllIIlllIlllII, float lllllllllllllllIlIlllIIlllIllIll, float lllllllllllllllIlIlllIIllllIIIII, float lllllllllllllllIlIlllIIlllIllIIl, float lllllllllllllllIlIlllIIlllIllllI, int lllllllllllllllIlIlllIIlllIlllIl) {
      GL11.glBegin(lllIllIIIllI[0]);
      int lllllllllllllllIlIlllIIlllIlIllI = (int)((float)lllllllllllllllIlIlllIIlllIlllIl / (360.0F / lllllllllllllllIlIlllIIlllIllIIl)) + lllIllIIIllI[1];

      do {
         if (!lIIllIllIIIllI(lIIllIllIIIlIl((float)lllllllllllllllIlIlllIIlllIlIllI, (float)lllllllllllllllIlIlllIIlllIlllIl / (360.0F / lllllllllllllllIlIlllIIlllIllllI)))) {
            GL11.glEnd();
            return;
         }

         double lllllllllllllllIlIlllIIllllIIlIl = 6.283185307179586D * (double)(lllllllllllllllIlIlllIIlllIlIllI - lllIllIIIllI[1]) / (double)lllllllllllllllIlIlllIIlllIlllIl;
         double lllllllllllllllIlIlllIIllllIIlII = 6.283185307179586D * (double)lllllllllllllllIlIlllIIlllIlIllI / (double)lllllllllllllllIlIlllIIlllIlllIl;
         GL11.glVertex2d((double)lllllllllllllllIlIlllIIlllIlllII, (double)lllllllllllllllIlIlllIIlllIllIll);
         GL11.glVertex2d((double)lllllllllllllllIlIlllIIlllIlllII + Math.cos(lllllllllllllllIlIlllIIllllIIlII) * (double)lllllllllllllllIlIlllIIllllIIIII, (double)lllllllllllllllIlIlllIIlllIllIll + Math.sin(lllllllllllllllIlIlllIIllllIIlII) * (double)lllllllllllllllIlIlllIIllllIIIII);
         GL11.glVertex2d((double)lllllllllllllllIlIlllIIlllIlllII + Math.cos(lllllllllllllllIlIlllIIllllIIlIl) * (double)lllllllllllllllIlIlllIIllllIIIII, (double)lllllllllllllllIlIlllIIlllIllIll + Math.sin(lllllllllllllllIlIlllIIllllIIlIl) * (double)lllllllllllllllIlIlllIIllllIIIII);
         ++lllllllllllllllIlIlllIIlllIlIllI;
         "".length();
      } while(-" ".length() <= -" ".length());

   }

   private static int lIIllIllIIIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static void drawCircleOutline(float lllllllllllllllIlIlllIIllIlllIII, float lllllllllllllllIlIlllIIllIllIlll, float lllllllllllllllIlIlllIIllIllIllI) {
      drawCircleOutline(lllllllllllllllIlIlllIIllIlllIII, lllllllllllllllIlIlllIIllIllIlll, lllllllllllllllIlIlllIIllIllIllI, lllIllIIIllI[3], lllIllIIIllI[4], lllIllIIIllI[5]);
   }

   public static void drawRoundedRectangle(float lllllllllllllllIlIlllIIlIlIIlIlI, float lllllllllllllllIlIlllIIlIlIIIlII, float lllllllllllllllIlIlllIIlIlIIlIII, float lllllllllllllllIlIlllIIlIlIIIIlI, float lllllllllllllllIlIlllIIlIlIIIllI) {
      GL11.glEnable(lllIllIIIllI[7]);
      drawArc(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIllI, 0.0F, 90.0F, lllIllIIIllI[11]);
      drawArc(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIllI, 90.0F, 180.0F, lllIllIIIllI[11]);
      drawArc(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIllI, 180.0F, 270.0F, lllIllIIIllI[11]);
      drawArc(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI, lllllllllllllllIlIlllIIlIlIIIllI, 270.0F, 360.0F, lllIllIIIllI[11]);
      GL11.glBegin(lllIllIIIllI[0]);
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI), (double)lllllllllllllllIlIlllIIlIlIIIlII);
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI), (double)lllllllllllllllIlIlllIIlIlIIIlII);
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI), (double)lllllllllllllllIlIlllIIlIlIIIlII);
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIIlIlI, (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIIlIlI, (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)lllllllllllllllIlIlllIIlIlIIlIlI, (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIlIII - lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI - lllllllllllllllIlIlllIIlIlIIIllI));
      GL11.glVertex2d((double)(lllllllllllllllIlIlllIIlIlIIlIlI + lllllllllllllllIlIlllIIlIlIIIllI), (double)(lllllllllllllllIlIlllIIlIlIIIlII + lllllllllllllllIlIlllIIlIlIIIIlI));
      GL11.glEnd();
   }

   private static void lIIllIllIIIlII() {
      lllIllIIIllI = new int[12];
      lllIllIIIllI[0] = " ".length() << (" ".length() << " ".length());
      lllIllIIIllI[1] = " ".length();
      lllIllIIIllI[2] = " ".length() << " ".length();
      lllIllIIIllI[3] = (20 ^ 63) & ~(0 ^ 43);
      lllIllIIIllI[4] = (24 ^ 67 ^ (23 ^ 44) << " ".length()) << "   ".length();
      lllIllIIIllI[5] = (43 ^ 46) << "   ".length();
      lllIllIIIllI[6] = " ".length() << ("   ".length() << " ".length());
      lllIllIIIllI[7] = 740 + 1054 - 1005 + 732 << " ".length();
      lllIllIIIllI[8] = 363 + 379 - 537 + 180 << " ".length();
      lllIllIIIllI[9] = 55 + 120 - 77 + 91 + ((127 ^ 86) << " ".length()) - -(95 + 102 - 121 + 107) + 61 + 253 - 187 + 190;
      lllIllIIIllI[10] = (154 ^ 151) << "   ".length() ^ 49 ^ 94;
      lllIllIIIllI[11] = " ".length() << (" ".length() << (" ".length() << " ".length()));
   }

   static {
      lIIllIllIIIlII();
   }

   private static int lIIllIllIIIlIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static void drawCircleOutline(float lllllllllllllllIlIlllIIllIlIllII, float lllllllllllllllIlIlllIIllIlIlIll, float lllllllllllllllIlIlllIIllIlIIlII, int lllllllllllllllIlIlllIIllIlIlIIl, int lllllllllllllllIlIlllIIllIlIIIlI, int lllllllllllllllIlIlllIIllIlIIIIl) {
      drawArcOutline(lllllllllllllllIlIlllIIllIlIllII, lllllllllllllllIlIlllIIllIlIlIll, lllllllllllllllIlIlllIIllIlIIlII, (float)lllllllllllllllIlIlllIIllIlIlIIl, (float)lllllllllllllllIlIlllIIllIlIIIlI, lllllllllllllllIlIlllIIllIlIIIIl);
   }
}
