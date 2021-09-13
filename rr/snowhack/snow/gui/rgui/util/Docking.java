package rr.snowhack.snow.gui.rgui.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public enum Docking {
   // $FF: synthetic field
   CENTERTOP,
   // $FF: synthetic field
   CENTERVERTICAL,
   // $FF: synthetic field
   CENTERBOTTOM,
   // $FF: synthetic field
   BOTTOM,
   // $FF: synthetic field
   CENTERHOIZONTAL;

   // $FF: synthetic field
   boolean isRight;
   // $FF: synthetic field
   private static final String[] lllllIIIlIII;
   // $FF: synthetic field
   NONE;

   // $FF: synthetic field
   boolean isTop;
   // $FF: synthetic field
   BOTTOMRIGHT,
   // $FF: synthetic field
   TOPLEFT,
   // $FF: synthetic field
   BOTTOMLEFT,
   // $FF: synthetic field
   CENTERRIGHT,
   // $FF: synthetic field
   CENTERLEFT,
   // $FF: synthetic field
   TOPRIGHT,
   // $FF: synthetic field
   RIGHT,
   // $FF: synthetic field
   TOP;

   // $FF: synthetic field
   private static final int[] lllllIIIlIll;
   // $FF: synthetic field
   CENTER,
   // $FF: synthetic field
   LEFT;

   // $FF: synthetic field
   boolean isLeft;
   // $FF: synthetic field
   boolean isBottom;

   public boolean isRight() {
      int var10000;
      if (lIlIIIlIIIllII(lllllllllllllllIlIlIIIIllIlllllI.isRight) && lIlIIIlIIIllIl(lllllllllllllllIlIlIIIIllIlllllI.isLeft)) {
         var10000 = lllllIIIlIll[0];
         "".length();
         if ("   ".length() <= -" ".length()) {
            return (boolean)((166 ^ 179) & ~(24 ^ 13));
         }
      } else {
         var10000 = lllllIIIlIll[1];
      }

      return (boolean)var10000;
   }

   public boolean isCenterHorizontal() {
      int var10000;
      if (lIlIIIlIIIllII(lllllllllllllllIlIlIIIIllIlllIII.isLeft) && lIlIIIlIIIllII(lllllllllllllllIlIlIIIIllIlllIII.isRight)) {
         var10000 = lllllIIIlIll[0];
         "".length();
         if (null != null) {
            return (boolean)((26 ^ 51 ^ (110 ^ 115) << " ".length()) << (" ".length() << " ".length()) & (((208 ^ 137) << " ".length() ^ 99 + 17 - 45 + 90) << (" ".length() << " ".length()) ^ -" ".length()));
         }
      } else {
         var10000 = lllllIIIlIll[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIIIlIIIllII(int var0) {
      return var0 != 0;
   }

   private static void lIlIIIlIIIlIll() {
      lllllIIIlIll = new int[17];
      lllllIIIlIll[0] = " ".length();
      lllllIIIlIll[1] = (191 ^ 184) << " ".length() & ~((127 ^ 120) << " ".length());
      lllllIIIlIll[2] = " ".length() << " ".length();
      lllllIIIlIll[3] = "   ".length();
      lllllIIIlIll[4] = " ".length() << (" ".length() << " ".length());
      lllllIIIlIll[5] = 43 ^ 46;
      lllllIIIlIll[6] = "   ".length() << " ".length();
      lllllIIIlIll[7] = 25 + 5 - -14 + 107 ^ (147 ^ 154) << (" ".length() << (" ".length() << " ".length()));
      lllllIIIlIll[8] = " ".length() << "   ".length();
      lllllIIIlIll[9] = 20 ^ 31 ^ " ".length() << " ".length();
      lllllIIIlIll[10] = ((117 ^ 94) << " ".length() ^ 13 ^ 94) << " ".length();
      lllllIIIlIll[11] = 183 ^ 188;
      lllllIIIlIll[12] = "   ".length() << (" ".length() << " ".length());
      lllllIIIlIll[13] = 35 ^ 24 ^ (153 ^ 130) << " ".length();
      lllllIIIlIll[14] = (30 ^ 25) << " ".length();
      lllllIIIlIll[15] = 141 ^ 130;
      lllllIIIlIll[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
   }

   private static String lIlIIIlIIIIIIl(String lllllllllllllllIlIlIIIIllIIllllI, String lllllllllllllllIlIlIIIIllIIlllIl) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIIIllIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIllIIlllIl.getBytes(StandardCharsets.UTF_8)), lllllIIIlIll[8]), "DES");
         Cipher lllllllllllllllIlIlIIIIllIlIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIIIllIlIIIlI.init(lllllIIIlIll[2], lllllllllllllllIlIlIIIIllIlIIIll);
         return new String(lllllllllllllllIlIlIIIIllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIIlIIIIIll(String lllllllllllllllIlIlIIIIllIlIlIll, String lllllllllllllllIlIlIIIIllIlIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIIIllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIIIIllIlIllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIIIllIlIllll.init(lllllIIIlIll[2], lllllllllllllllIlIlIIIIllIllIIII);
         return new String(lllllllllllllllIlIlIIIIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIlIIIllIl(int var0) {
      return var0 == 0;
   }

   static {
      lIlIIIlIIIlIll();
      lIlIIIlIIIIlIl();
      TOPLEFT = new Docking(lllllIIIlIII[lllllIIIlIll[1]], lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1]);
      TOP = new Docking(lllllIIIlIII[lllllIIIlIll[0]], lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1]);
      TOPRIGHT = new Docking(lllllIIIlIII[lllllIIIlIll[2]], lllllIIIlIll[2], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0]);
      RIGHT = new Docking(lllllIIIlIII[lllllIIIlIll[3]], lllllIIIlIll[3], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0]);
      BOTTOMRIGHT = new Docking(lllllIIIlIII[lllllIIIlIll[4]], lllllIIIlIll[4], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0]);
      BOTTOM = new Docking(lllllIIIlIII[lllllIIIlIll[5]], lllllIIIlIll[5], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1]);
      BOTTOMLEFT = new Docking(lllllIIIlIII[lllllIIIlIll[6]], lllllIIIlIll[6], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1]);
      LEFT = new Docking(lllllIIIlIII[lllllIIIlIll[7]], lllllIIIlIll[7], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1]);
      CENTER = new Docking(lllllIIIlIII[lllllIIIlIll[8]], lllllIIIlIll[8], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0]);
      NONE = new Docking(lllllIIIlIII[lllllIIIlIll[9]], lllllIIIlIll[9], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1]);
      CENTERTOP = new Docking(lllllIIIlIII[lllllIIIlIll[10]], lllllIIIlIll[10], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0]);
      CENTERBOTTOM = new Docking(lllllIIIlIII[lllllIIIlIll[11]], lllllIIIlIll[11], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1]);
      CENTERVERTICAL = new Docking(lllllIIIlIII[lllllIIIlIll[12]], lllllIIIlIll[12], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0]);
      CENTERHOIZONTAL = new Docking(lllllIIIlIII[lllllIIIlIll[13]], lllllIIIlIll[13], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1]);
      CENTERLEFT = new Docking(lllllIIIlIII[lllllIIIlIll[14]], lllllIIIlIll[14], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1]);
      CENTERRIGHT = new Docking(lllllIIIlIII[lllllIIIlIll[15]], lllllIIIlIll[15], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[1], (boolean)lllllIIIlIll[0], (boolean)lllllIIIlIll[0]);
      Docking[] var10000 = new Docking[lllllIIIlIll[16]];
      var10000[lllllIIIlIll[1]] = TOPLEFT;
      var10000[lllllIIIlIll[0]] = TOP;
      var10000[lllllIIIlIll[2]] = TOPRIGHT;
      var10000[lllllIIIlIll[3]] = RIGHT;
      var10000[lllllIIIlIll[4]] = BOTTOMRIGHT;
      var10000[lllllIIIlIll[5]] = BOTTOM;
      var10000[lllllIIIlIll[6]] = BOTTOMLEFT;
      var10000[lllllIIIlIll[7]] = LEFT;
      var10000[lllllIIIlIll[8]] = CENTER;
      var10000[lllllIIIlIll[9]] = NONE;
      var10000[lllllIIIlIll[10]] = CENTERTOP;
      var10000[lllllIIIlIll[11]] = CENTERBOTTOM;
      var10000[lllllIIIlIll[12]] = CENTERVERTICAL;
      var10000[lllllIIIlIll[13]] = CENTERHOIZONTAL;
      var10000[lllllIIIlIll[14]] = CENTERLEFT;
      var10000[lllllIIIlIll[15]] = CENTERRIGHT;
   }

   public boolean isBottom() {
      int var10000;
      if (lIlIIIlIIIllII(lllllllllllllllIlIlIIIIlllIIIlII.isBottom) && lIlIIIlIIIllIl(lllllllllllllllIlIlIIIIlllIIIlII.isTop)) {
         var10000 = lllllIIIlIll[0];
         "".length();
         if (-(85 ^ 81) > 0) {
            return (boolean)((254 ^ 191) & ~(124 ^ 61));
         }
      } else {
         var10000 = lllllIIIlIll[1];
      }

      return (boolean)var10000;
   }

   public boolean isCenterVertical() {
      int var10000;
      if (lIlIIIlIIIllII(lllllllllllllllIlIlIIIIllIllIllI.isTop) && lIlIIIlIIIllII(lllllllllllllllIlIlIIIIllIllIllI.isBottom)) {
         var10000 = lllllIIIlIll[0];
         "".length();
         if (-"  ".length() > 0) {
            return (boolean)(((239 ^ 154) << " ".length() ^ 79 + 60 - 109 + 157) & ((105 ^ 84) << (" ".length() << " ".length()) ^ 79 + 29 - -17 + 40 ^ -" ".length()));
         }
      } else {
         var10000 = lllllIIIlIll[1];
      }

      return (boolean)var10000;
   }

   public boolean isLeft() {
      int var10000;
      if (lIlIIIlIIIllII(lllllllllllllllIlIlIIIIlllIIIIlI.isLeft) && lIlIIIlIIIllIl(lllllllllllllllIlIlIIIIlllIIIIlI.isRight)) {
         var10000 = lllllIIIlIll[0];
         "".length();
         if (null != null) {
            return (boolean)((122 ^ 119) << " ".length() & ~((114 ^ 127) << " ".length()));
         }
      } else {
         var10000 = lllllIIIlIll[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIIIlIIIlllI(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIIIlIIIIlIl() {
      lllllIIIlIII = new String[lllllIIIlIll[16]];
      lllllIIIlIII[lllllIIIlIll[1]] = lIlIIIlIIIIIIl("3b39/spYFeU=", "jNMAf");
      lllllIIIlIII[lllllIIIlIll[0]] = lIlIIIlIIIIIIl("dOOHUGTlx6A=", "ouYQA");
      lllllIIIlIII[lllllIIIlIll[2]] = lIlIIIlIIIIIlI("FyEoOD4EJiw=", "Cnxjw");
      lllllIIIlIII[lllllIIIlIll[3]] = lIlIIIlIIIIIIl("SCO3j8CKNeI=", "eHtLA");
      lllllIIIlIII[lllllIIIlIll[4]] = lIlIIIlIIIIIll("0Oq6u1XxXz4bVePF45HjOw==", "oeKKW");
      lllllIIIlIII[lllllIIIlIll[5]] = lIlIIIlIIIIIIl("wuBYzTrkQW8=", "yWvUV");
      lllllIIIlIII[lllllIIIlIll[6]] = lIlIIIlIIIIIlI("FRYDPx0aFRItBg==", "WYWkR");
      lllllIIIlIII[lllllIIIlIll[7]] = lIlIIIlIIIIIll("a+DzQH/ICUo=", "LsiwI");
      lllllIIIlIII[lllllIIIlIll[8]] = lIlIIIlIIIIIlI("CSMaBAMY", "JfTPF");
      lllllIIIlIII[lllllIIIlIll[9]] = lIlIIIlIIIIIlI("KigFPQ==", "dgKxm");
      lllllIIIlIII[lllllIIIlIll[10]] = lIlIIIlIIIIIll("hpDMyHfQIe+fUyItiZ/rQg==", "WekIc");
      lllllIIIlIII[lllllIIIlIll[11]] = lIlIIIlIIIIIIl("oW2YObq51EKlHSM6FMhsdg==", "YByxv");
      lllllIIIlIII[lllllIIIlIll[12]] = lIlIIIlIIIIIlI("Mx8jAwYiDCgFFzkZLBs=", "pZmWC");
      lllllIIIlIII[lllllIIIlIll[13]] = lIlIIIlIIIIIlI("BDcsIzQVOi0+Kwg8NjY9", "Grbwq");
      lllllIIIlIII[lllllIIIlIll[14]] = lIlIIIlIIIIIlI("CxY0Ij8aHz8wLg==", "HSzvz");
      lllllIIIlIII[lllllIIIlIll[15]] = lIlIIIlIIIIIll("niK5nk+zJmKumEHns45bUQ==", "EeXFn");
   }

   private Docking(boolean lllllllllllllllIlIlIIIIlllIlIIIl, boolean lllllllllllllllIlIlIIIIlllIIlIIl, boolean lllllllllllllllIlIlIIIIlllIIlIII, boolean lllllllllllllllIlIlIIIIlllIIlllI) {
      lllllllllllllllIlIlIIIIlllIIllIl.isTop = lllllllllllllllIlIlIIIIlllIlIIIl;
      lllllllllllllllIlIlIIIIlllIIllIl.isLeft = lllllllllllllllIlIlIIIIlllIIlIIl;
      lllllllllllllllIlIlIIIIlllIIllIl.isBottom = lllllllllllllllIlIlIIIIlllIIlIII;
      lllllllllllllllIlIlIIIIlllIIllIl.isRight = lllllllllllllllIlIlIIIIlllIIlllI;
   }

   private static String lIlIIIlIIIIIlI(String lllllllllllllllIlIlIIIIllIIlIIII, String lllllllllllllllIlIlIIIIllIIIlIlI) {
      lllllllllllllllIlIlIIIIllIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIlIIIIllIIIlIIl = new StringBuilder();
      char[] lllllllllllllllIlIlIIIIllIIIllIl = lllllllllllllllIlIlIIIIllIIIlIlI.toCharArray();
      int lllllllllllllllIlIlIIIIllIIIllII = lllllIIIlIll[1];
      byte lllllllllllllllIlIlIIIIllIIIIllI = lllllllllllllllIlIlIIIIllIIlIIII.toCharArray();
      int lllllllllllllllIlIlIIIIllIIIIlIl = lllllllllllllllIlIlIIIIllIIIIllI.length;
      int lllllllllllllllIlIlIIIIllIIIIlII = lllllIIIlIll[1];

      do {
         if (!lIlIIIlIIIlllI(lllllllllllllllIlIlIIIIllIIIIlII, lllllllllllllllIlIlIIIIllIIIIlIl)) {
            return String.valueOf(lllllllllllllllIlIlIIIIllIIIlIIl);
         }

         boolean lllllllllllllllIlIlIIIIllIIIIIll = lllllllllllllllIlIlIIIIllIIIIllI[lllllllllllllllIlIlIIIIllIIIIlII];
         lllllllllllllllIlIlIIIIllIIIlIIl.append((char)(lllllllllllllllIlIlIIIIllIIIIIll ^ lllllllllllllllIlIlIIIIllIIIllIl[lllllllllllllllIlIlIIIIllIIIllII % lllllllllllllllIlIlIIIIllIIIllIl.length]));
         "".length();
         ++lllllllllllllllIlIlIIIIllIIIllII;
         ++lllllllllllllllIlIlIIIIllIIIIlII;
         "".length();
      } while(((69 ^ 90) & ~(123 ^ 100)) == 0);

      return null;
   }

   public boolean isTop() {
      int var10000;
      if (lIlIIIlIIIllII(lllllllllllllllIlIlIIIIllIlllIll.isTop) && lIlIIIlIIIllIl(lllllllllllllllIlIlIIIIllIlllIll.isBottom)) {
         var10000 = lllllIIIlIll[0];
         "".length();
         if (((71 ^ 12) & ~(110 ^ 37)) != 0) {
            return (boolean)((222 ^ 189) & ~(54 ^ 85));
         }
      } else {
         var10000 = lllllIIIlIll[1];
      }

      return (boolean)var10000;
   }
}
