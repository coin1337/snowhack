package rr.snowhack.snow.util;

import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class ColourHolder {
   // $FF: synthetic field
   int b;
   // $FF: synthetic field
   int g;
   // $FF: synthetic field
   int a;
   // $FF: synthetic field
   private static final int[] lIIIIIIllIIIl;
   // $FF: synthetic field
   int r;

   static {
      lIlIIlllllllll();
   }

   public static ColourHolder fromHex(int lllllllllllllllIlIIIlllIIlIIIlII) {
      ColourHolder lllllllllllllllIlIIIlllIIlIIIlIl = new ColourHolder(lIIIIIIllIIIl[2], lIIIIIIllIIIl[2], lIIIIIIllIIIl[2]);
      lllllllllllllllIlIIIlllIIlIIIlIl.becomeHex(lllllllllllllllIlIIIlllIIlIIIlII);
      return lllllllllllllllIlIIIlllIIlIIIlIl;
   }

   public static int toHex(int lllllllllllllllIlIIIlllIIIllllll, int lllllllllllllllIlIIIlllIIIlllIll, int lllllllllllllllIlIIIlllIIIllllIl) {
      return lIIIIIIllIIIl[8] | (lllllllllllllllIlIIIlllIIIllllll & lIIIIIIllIIIl[0]) << lIIIIIIllIIIl[5] | (lllllllllllllllIlIIIlllIIIlllIll & lIIIIIIllIIIl[0]) << lIIIIIIllIIIl[7] | lllllllllllllllIlIIIlllIIIllllIl & lIIIIIIllIIIl[0];
   }

   public ColourHolder clone() {
      return new ColourHolder(lllllllllllllllIlIIIlllIIIIlIIII.r, lllllllllllllllIlIIIlllIIIIlIIII.g, lllllllllllllllIlIIIlllIIIIlIIII.b, lllllllllllllllIlIIIlllIIIIlIIII.a);
   }

   public Color toJavaColour() {
      return new Color(lllllllllllllllIlIIIlllIIIIIllIl.r, lllllllllllllllIlIIIlllIIIIIllIl.g, lllllllllllllllIlIIIlllIIIIIllIl.b, lllllllllllllllIlIIIlllIIIIIllIl.a);
   }

   public ColourHolder setR(int lllllllllllllllIlIIIlllIIIlIIlll) {
      lllllllllllllllIlIIIlllIIIlIIllI.r = lllllllllllllllIlIIIlllIIIlIIlll;
      return lllllllllllllllIlIIIlllIIIlIIllI;
   }

   public ColourHolder brighter() {
      return new ColourHolder(Math.min(lllllllllllllllIlIIIlllIIllIIlIl.r + lIIIIIIllIIIl[1], lIIIIIIllIIIl[0]), Math.min(lllllllllllllllIlIIIlllIIllIIlIl.g + lIIIIIIllIIIl[1], lIIIIIIllIIIl[0]), Math.min(lllllllllllllllIlIIIlllIIllIIlIl.b + lIIIIIIllIIIl[1], lIIIIIIllIIIl[0]), lllllllllllllllIlIIIlllIIllIIlIl.getA());
   }

   public void setGLColour(int lllllllllllllllIlIIIlllIIlIlIIll, int lllllllllllllllIlIIIlllIIlIlIIlI, int lllllllllllllllIlIIIlllIIlIlIllI, int lllllllllllllllIlIIIlllIIlIlIlIl) {
      int var10000;
      if (lIlIlIIIIIIIII(lllllllllllllllIlIIIlllIIlIlIIll, lIIIIIIllIIIl[3])) {
         var10000 = lllllllllllllllIlIIIlllIIlIllIIl.r;
         "".length();
         if ("   ".length() < " ".length()) {
            return;
         }
      } else {
         var10000 = lllllllllllllllIlIIIlllIIlIlIIll;
      }

      float var5 = (float)var10000 / 255.0F;
      int var10001;
      if (lIlIlIIIIIIIII(lllllllllllllllIlIIIlllIIlIlIIlI, lIIIIIIllIIIl[3])) {
         var10001 = lllllllllllllllIlIIIlllIIlIllIIl.g;
         "".length();
         if (-"  ".length() > 0) {
            return;
         }
      } else {
         var10001 = lllllllllllllllIlIIIlllIIlIlIIlI;
      }

      float var6 = (float)var10001 / 255.0F;
      int var10002;
      if (lIlIlIIIIIIIII(lllllllllllllllIlIIIlllIIlIlIllI, lIIIIIIllIIIl[3])) {
         var10002 = lllllllllllllllIlIIIlllIIlIllIIl.b;
         "".length();
         if (" ".length() << " ".length() <= 0) {
            return;
         }
      } else {
         var10002 = lllllllllllllllIlIIIlllIIlIlIllI;
      }

      float var7 = (float)var10002 / 255.0F;
      int var10003;
      if (lIlIlIIIIIIIII(lllllllllllllllIlIIIlllIIlIlIlIl, lIIIIIIllIIIl[3])) {
         var10003 = lllllllllllllllIlIIIlllIIlIllIIl.a;
         "".length();
         if (((150 + 104 - 249 + 176 ^ (232 ^ 167) << " ".length()) << " ".length() & ((18 ^ 87 ^ (110 ^ 89) << " ".length()) << " ".length() ^ -" ".length())) != 0) {
            return;
         }
      } else {
         var10003 = lllllllllllllllIlIIIlllIIlIlIlIl;
      }

      GL11.glColor4f(var5, var6, var7, (float)var10003 / 255.0F);
   }

   private static void lIlIIlllllllll() {
      lIIIIIIllIIIl = new int[9];
      lIIIIIIllIIIl[0] = 63 + 7 - -150 + 35;
      lIIIIIIllIIIl[1] = (163 ^ 166) << " ".length();
      lIIIIIIllIIIl[2] = "   ".length() << "   ".length() & ("   ".length() << "   ".length() ^ -" ".length());
      lIIIIIIllIIIl[3] = -" ".length();
      lIIIIIIllIIIl[4] = 12 + 252 - 37 + 28 << (" ".length() << (" ".length() << (" ".length() << " ".length())));
      lIIIIIIllIIIl[5] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIIIllIIIl[6] = 185 + 101 - 71 + 40 << (" ".length() << "   ".length());
      lIIIIIIllIIIl[7] = " ".length() << "   ".length();
      lIIIIIIllIIIl[8] = -((213061 + 106358 - 252200 + 251658 << "   ".length()) + 65574 + 1774139 - 664371 + 638995 - -(807760 + 1224124 - 1757012 + 1715077) + (1670589 + 24858 - 88501 + 3604011 << " ".length()));
   }

   public int getG() {
      return lllllllllllllllIlIIIlllIIIllIIlI.g;
   }

   public ColourHolder(int lllllllllllllllIlIIIlllIIlllllIl, int lllllllllllllllIlIIIlllIIllllIII, int lllllllllllllllIlIIIlllIIllllIll) {
      lllllllllllllllIlIIIlllIIllllllI.r = lllllllllllllllIlIIIlllIIlllllIl;
      lllllllllllllllIlIIIlllIIllllllI.g = lllllllllllllllIlIIIlllIIllllIII;
      lllllllllllllllIlIIIlllIIllllllI.b = lllllllllllllllIlIIIlllIIllllIll;
      lllllllllllllllIlIIIlllIIllllllI.a = lIIIIIIllIIIl[0];
   }

   public ColourHolder setB(int lllllllllllllllIlIIIlllIIIlIIIIl) {
      lllllllllllllllIlIIIlllIIIlIIIlI.b = lllllllllllllllIlIIIlllIIIlIIIIl;
      return lllllllllllllllIlIIIlllIIIlIIIlI;
   }

   public int toHex() {
      return toHex(lllllllllllllllIlIIIlllIIIllIlll.r, lllllllllllllllIlIIIlllIIIllIlll.g, lllllllllllllllIlIIIlllIIIllIlll.b);
   }

   public int getA() {
      return lllllllllllllllIlIIIlllIIIlIllII.a;
   }

   public int getB() {
      return lllllllllllllllIlIIIlllIIIllIlIl.b;
   }

   public ColourHolder(int lllllllllllllllIlIIIlllIIlllIIII, int lllllllllllllllIlIIIlllIIllIllll, int lllllllllllllllIlIIIlllIIllIlIIl, int lllllllllllllllIlIIIlllIIllIllIl) {
      lllllllllllllllIlIIIlllIIllIllII.r = lllllllllllllllIlIIIlllIIlllIIII;
      lllllllllllllllIlIIIlllIIllIllII.g = lllllllllllllllIlIIIlllIIllIllll;
      lllllllllllllllIlIIIlllIIllIllII.b = lllllllllllllllIlIIIlllIIllIlIIl;
      lllllllllllllllIlIIIlllIIllIllII.a = lllllllllllllllIlIIIlllIIllIllIl;
   }

   public ColourHolder setG(int lllllllllllllllIlIIIlllIIIIllIll) {
      lllllllllllllllIlIIIlllIIIIlllII.g = lllllllllllllllIlIIIlllIIIIllIll;
      return lllllllllllllllIlIIIlllIIIIlllII;
   }

   public ColourHolder setA(int lllllllllllllllIlIIIlllIIIIlIlIl) {
      lllllllllllllllIlIIIlllIIIIlIllI.a = lllllllllllllllIlIIIlllIIIIlIlIl;
      return lllllllllllllllIlIIIlllIIIIlIllI;
   }

   private static boolean lIlIlIIIIIIIII(int var0, int var1) {
      return var0 == var1;
   }

   public void becomeGLColour() {
   }

   public ColourHolder darker() {
      return new ColourHolder(Math.max(lllllllllllllllIlIIIlllIIllIIIll.r - lIIIIIIllIIIl[1], lIIIIIIllIIIl[2]), Math.max(lllllllllllllllIlIIIlllIIllIIIll.g - lIIIIIIllIIIl[1], lIIIIIIllIIIl[2]), Math.max(lllllllllllllllIlIIIlllIIllIIIll.b - lIIIIIIllIIIl[1], lIIIIIIllIIIl[2]), lllllllllllllllIlIIIlllIIllIIIll.getA());
   }

   public int getR() {
      return lllllllllllllllIlIIIlllIIIlIllll.r;
   }

   public void setGLColour() {
      lllllllllllllllIlIIIlllIIllIIIII.setGLColour(lIIIIIIllIIIl[3], lIIIIIIllIIIl[3], lIIIIIIllIIIl[3], lIIIIIIllIIIl[3]);
   }

   public void becomeHex(int lllllllllllllllIlIIIlllIIlIIlIll) {
      lllllllllllllllIlIIIlllIIlIIllII.setR((lllllllllllllllIlIIIlllIIlIIlIll & lIIIIIIllIIIl[4]) >> lIIIIIIllIIIl[5]);
      "".length();
      lllllllllllllllIlIIIlllIIlIIllII.setG((lllllllllllllllIlIIIlllIIlIIlIll & lIIIIIIllIIIl[6]) >> lIIIIIIllIIIl[7]);
      "".length();
      lllllllllllllllIlIIIlllIIlIIllII.setB(lllllllllllllllIlIIIlllIIlIIlIll & lIIIIIIllIIIl[0]);
      "".length();
      lllllllllllllllIlIIIlllIIlIIllII.setA(lIIIIIIllIIIl[0]);
      "".length();
   }
}
