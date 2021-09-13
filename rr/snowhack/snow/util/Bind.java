package rr.snowhack.snow.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.input.Keyboard;
import rr.snowhack.snow.command.commands.BindCommand;

public class Bind {
   // $FF: synthetic field
   boolean alt;
   // $FF: synthetic field
   boolean ctrl;
   // $FF: synthetic field
   private static final String[] lIIIIllIIIIII;
   // $FF: synthetic field
   int key;
   // $FF: synthetic field
   boolean shift;
   // $FF: synthetic field
   private static final int[] lIIIIllIIIIll;

   public static boolean isShiftDown() {
      int var10000;
      if (lIlIlIlllllIIl(Keyboard.isKeyDown(lIIIIllIIIIll[8])) && !lIlIlIlllllIll(Keyboard.isKeyDown(lIIIIllIIIIll[9]))) {
         var10000 = lIIIIllIIIIll[1];
      } else {
         var10000 = lIIIIllIIIIll[0];
         "".length();
         if (("   ".length() << ("   ".length() << ("   ".length() << " ".length()) ^ 38 + 124 - 24 + 59) & ("   ".length() << (155 ^ 194 ^ (34 ^ 53) << (" ".length() << " ".length())) ^ -" ".length())) > " ".length() << (" ".length() << " ".length())) {
            return (boolean)((144 + 124 - 93 + 8 ^ (101 ^ 96) << (138 ^ 143)) << " ".length() & ((0 ^ 37 ^ (38 ^ 63) << " ".length()) << " ".length() ^ -" ".length()));
         }
      }

      return (boolean)var10000;
   }

   private static void lIlIlIlllllIII() {
      lIIIIllIIIIll = new int[18];
      lIIIIllIIIIll[0] = " ".length();
      lIIIIllIIIIll[1] = ((14 ^ 27) << "   ".length() ^ 66 + 10 - -50 + 53) << " ".length() & ((178 + 133 - 230 + 104 ^ (149 ^ 196) << " ".length()) << " ".length() ^ -" ".length());
      lIIIIllIIIIll[2] = " ".length() << " ".length();
      lIIIIllIIIIll[3] = "   ".length();
      lIIIIllIIIIll[4] = " ".length() << (" ".length() << " ".length());
      lIIIIllIIIIll[5] = (187 ^ 180) << (" ".length() << " ".length()) ^ 4 ^ 61;
      lIIIIllIIIIll[6] = "   ".length() << " ".length();
      lIIIIllIIIIll[7] = 126 ^ 121 ^ (168 ^ 167) << " ".length() & ~((12 ^ 3) << " ".length()) & ~((140 ^ 149) << " ".length() & ~((163 ^ 186) << " ".length()));
      lIIIIllIIIIll[8] = (45 ^ 56) << " ".length();
      lIIIIllIIIIll[9] = (138 ^ 145) << " ".length();
      lIIIIllIIIIll[10] = 172 ^ 177;
      lIIIIllIIIIll[11] = ((148 ^ 177) << " ".length()) + (16 ^ 101) - (" ".length() << ("   ".length() << " ".length())) + ((71 ^ 72) << " ".length());
      lIIIIllIIIIll[12] = (106 ^ 23 ^ (119 ^ 74) << " ".length()) << "   ".length();
      lIIIIllIIIIll[13] = (119 ^ 96) << "   ".length();
      lIIIIllIIIIll[14] = " ".length() << "   ".length();
      lIIIIllIIIIll[15] = 221 ^ 188 ^ (144 ^ 157) << "   ".length();
      lIIIIllIIIIll[16] = -" ".length();
      lIIIIllIIIIll[17] = ((190 ^ 167) & ~(79 ^ 86) ^ 170 ^ 175) << " ".length();
   }

   public boolean isShift() {
      return lllllllllllllllIIllllllIIIllIllI.shift;
   }

   public static Bind none() {
      return new Bind((boolean)lIIIIllIIIIll[1], (boolean)lIIIIllIIIIll[1], (boolean)lIIIIllIIIIll[1], lIIIIllIIIIll[16]);
   }

   private static boolean lIlIlIlllllIlI(int var0) {
      return var0 < 0;
   }

   public int getKey() {
      return lllllllllllllllIIllllllIIIllllll.key;
   }

   private static String lIlIlIlllIllII(String lllllllllllllllIIllllllIIIIIIlII, String lllllllllllllllIIllllllIIIIIIlIl) {
      try {
         short lllllllllllllllIIllllllIIIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllllIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIllIIIIll[14]), "DES");
         Cipher lllllllllllllllIIllllllIIIIIlIII = Cipher.getInstance("DES");
         lllllllllllllllIIllllllIIIIIlIII.init(lIIIIllIIIIll[2], lllllllllllllllIIllllllIIIIIIIlI);
         return new String(lllllllllllllllIIllllllIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllllIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void setShift(boolean lllllllllllllllIIllllllIIIIlllIl) {
      lllllllllllllllIIllllllIIIIllllI.shift = lllllllllllllllIIllllllIIIIlllIl;
   }

   private static String lIlIlIlllIlIll(String lllllllllllllllIIlllllIlllllIllI, String lllllllllllllllIIlllllIlllllIIII) {
      lllllllllllllllIIlllllIlllllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllllIlllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIIlllllIllllIllll = new StringBuilder();
      char[] lllllllllllllllIIlllllIlllllIIll = lllllllllllllllIIlllllIlllllIIII.toCharArray();
      String lllllllllllllllIIlllllIllllIllIl = lIIIIllIIIIll[1];
      int lllllllllllllllIIlllllIllllIllII = lllllllllllllllIIlllllIlllllIllI.toCharArray();
      Exception lllllllllllllllIIlllllIllllIlIll = lllllllllllllllIIlllllIllllIllII.length;
      int lllllllllllllllIIlllllIllllIlIlI = lIIIIllIIIIll[1];

      do {
         if (!lIlIlIlllllllI(lllllllllllllllIIlllllIllllIlIlI, lllllllllllllllIIlllllIllllIlIll)) {
            return String.valueOf(lllllllllllllllIIlllllIllllIllll);
         }

         char lllllllllllllllIIlllllIlllllIlll = lllllllllllllllIIlllllIllllIllII[lllllllllllllllIIlllllIllllIlIlI];
         lllllllllllllllIIlllllIllllIllll.append((char)(lllllllllllllllIIlllllIlllllIlll ^ lllllllllllllllIIlllllIlllllIIll[lllllllllllllllIIlllllIllllIllIl % lllllllllllllllIIlllllIlllllIIll.length]));
         "".length();
         ++lllllllllllllllIIlllllIllllIllIl;
         ++lllllllllllllllIIlllllIllllIlIlI;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length()));

      return null;
   }

   public void setCtrl(boolean lllllllllllllllIIllllllIIIlIIlll) {
      lllllllllllllllIIllllllIIIlIlIII.ctrl = lllllllllllllllIIllllllIIIlIIlll;
   }

   private static void lIlIlIlllIllll() {
      lIIIIllIIIIII = new String[lIIIIllIIIIll[17]];
      lIIIIllIIIIII[lIIIIllIIIIll[1]] = lIlIlIlllIlIlI("Dd/lc8PCQt0=", "Cqypo");
      lIIIIllIIIIII[lIIIIllIIIIll[0]] = lIlIlIlllIlIll("LzwBPVw=", "lHsQw");
      lIIIIllIIIIII[lIIIIllIIIIll[2]] = lIlIlIlllIlIll("", "XkHjA");
      lIIIIllIIIIII[lIIIIllIIIIll[3]] = lIlIlIlllIlIll("BSMwag==", "DODAr");
      lIIIIllIIIIII[lIIIIllIIIIll[4]] = lIlIlIlllIlIlI("And5gJ/Jyg8=", "QWxoV");
      lIIIIllIIIIII[lIIIIllIIIIll[5]] = lIlIlIlllIllII("2eqPxGlFtkU=", "rNtzY");
      lIIIIllIIIIII[lIIIIllIIIIll[6]] = lIlIlIlllIllII("uONUBBUnVuc=", "orQmf");
      lIIIIllIIIIII[lIIIIllIIIIll[7]] = lIlIlIlllIlIlI("YDOS/gykm58=", "DAcmJ");
      lIIIIllIIIIII[lIIIIllIIIIll[14]] = lIlIlIlllIllII("ckrF4sggpdo=", "uGBZu");
      lIIIIllIIIIII[lIIIIllIIIIll[15]] = lIlIlIlllIlIlI("jdAMXBTCcJE=", "VPpNG");
   }

   private static boolean lIlIlIlllllllI(int var0, int var1) {
      return var0 < var1;
   }

   public boolean isAlt() {
      return lllllllllllllllIIllllllIIIlllIlI.alt;
   }

   public boolean isDown(int lllllllllllllllIIllllllIIIIlIlII) {
      int var10000;
      if (lIlIlIlllllIIl(lllllllllllllllIIllllllIIIIlIIll.isEmpty()) && (!lIlIlIlllllIll((Boolean)BindCommand.modifiersEnabled.getValue()) || lIlIlIllllllII(lllllllllllllllIIllllllIIIIlIIll.isShift(), isShiftDown()) && lIlIlIllllllII(lllllllllllllllIIllllllIIIIlIIll.isCtrl(), isCtrlDown()) && lIlIlIllllllII(lllllllllllllllIIllllllIIIIlIIll.isAlt(), isAltDown())) && lIlIlIllllllII(lllllllllllllllIIllllllIIIIlIlII, lllllllllllllllIIllllllIIIIlIIll.getKey())) {
         var10000 = lIIIIllIIIIll[0];
         "".length();
         if (-" ".length() != -" ".length()) {
            return (boolean)((157 ^ 172 ^ (87 ^ 108) << " ".length()) & (73 + 36 - 19 + 107 ^ (196 ^ 133) << " ".length() ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIllIIIIll[1];
      }

      return (boolean)var10000;
   }

   public static boolean isCtrlDown() {
      int var10000;
      if (lIlIlIlllllIIl(Keyboard.isKeyDown(lIIIIllIIIIll[10])) && !lIlIlIlllllIll(Keyboard.isKeyDown(lIIIIllIIIIll[11]))) {
         var10000 = lIIIIllIIIIll[1];
      } else {
         var10000 = lIIIIllIIIIll[0];
         "".length();
         if ((((104 ^ 27) << " ".length() ^ 122 + 87 - 208 + 196) << " ".length() & ((24 ^ 17 ^ (210 ^ 199) << " ".length()) << " ".length() ^ -" ".length())) < -" ".length()) {
            return (boolean)("   ".length() << (" ".length() << (" ".length() << " ".length())) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()));
         }
      }

      return (boolean)var10000;
   }

   public void setAlt(boolean lllllllllllllllIIllllllIIIlIllIl) {
      lllllllllllllllIIllllllIIIlIlllI.alt = lllllllllllllllIIllllllIIIlIllIl;
   }

   private static boolean lIlIlIlllllIll(int var0) {
      return var0 != 0;
   }

   public boolean isEmpty() {
      int var10000;
      if (lIlIlIlllllIIl(lllllllllllllllIIllllllIIIllIIll.ctrl) && lIlIlIlllllIIl(lllllllllllllllIIllllllIIIllIIll.shift) && lIlIlIlllllIIl(lllllllllllllllIIllllllIIIllIIll.alt) && lIlIlIlllllIlI(lllllllllllllllIIllllllIIIllIIll.key)) {
         var10000 = lIIIIllIIIIll[0];
         "".length();
         if (null != null) {
            return (boolean)((47 ^ 102 ^ "   ".length() << " ".length()) & ((158 ^ 153) << (" ".length() << " ".length()) ^ 119 ^ 36 ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIllIIIIll[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIlIlllllIIl(int var0) {
      return var0 == 0;
   }

   public static boolean isAltDown() {
      int var10000;
      if (lIlIlIlllllIIl(Keyboard.isKeyDown(lIIIIllIIIIll[12])) && !lIlIlIlllllIll(Keyboard.isKeyDown(lIIIIllIIIIll[13]))) {
         var10000 = lIIIIllIIIIll[1];
      } else {
         var10000 = lIIIIllIIIIll[0];
         "".length();
         if (-" ".length() == " ".length()) {
            return (boolean)(((40 ^ 19) << (" ".length() << " ".length()) ^ 156 + 1 - 18 + 56) << " ".length() & (((188 ^ 187) << "   ".length() ^ 61 ^ 42) << " ".length() ^ -" ".length()));
         }
      }

      return (boolean)var10000;
   }

   public Bind(boolean lllllllllllllllIIllllllIIlIIIlIl, boolean lllllllllllllllIIllllllIIlIIIlII, boolean lllllllllllllllIIllllllIIlIIIIll, int lllllllllllllllIIllllllIIlIIIIlI) {
      lllllllllllllllIIllllllIIlIIlIll.ctrl = lllllllllllllllIIllllllIIlIIIlIl;
      lllllllllllllllIIllllllIIlIIlIll.alt = lllllllllllllllIIllllllIIlIIIlII;
      lllllllllllllllIIllllllIIlIIlIll.shift = lllllllllllllllIIllllllIIlIIIIll;
      lllllllllllllllIIllllllIIlIIlIll.key = lllllllllllllllIIllllllIIlIIIIlI;
   }

   private static boolean lIlIlIllllllIl(int var0, int var1) {
      return var0 != var1;
   }

   public boolean isCtrl() {
      return lllllllllllllllIIllllllIIIllllIl.ctrl;
   }

   static {
      lIlIlIlllllIII();
      lIlIlIlllIllll();
   }

   public String capitalise(String lllllllllllllllIIllllllIIIIIlllI) {
      if (lIlIlIlllllIll(lllllllllllllllIIllllllIIIIIlllI.isEmpty())) {
         return lIIIIllIIIIII[lIIIIllIIIIll[14]];
      } else {
         StringBuilder var10000 = (new StringBuilder()).append(Character.toUpperCase(lllllllllllllllIIllllllIIIIIlllI.charAt(lIIIIllIIIIll[1])));
         String var10001;
         if (lIlIlIllllllIl(lllllllllllllllIIllllllIIIIIlllI.length(), lIIIIllIIIIll[0])) {
            var10001 = lllllllllllllllIIllllllIIIIIlllI.substring(lIIIIllIIIIll[0]).toLowerCase();
            "".length();
            if (null != null) {
               return null;
            }
         } else {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[15]];
         }

         return String.valueOf(var10000.append(var10001));
      }
   }

   public String toString() {
      String var10000;
      if (lIlIlIlllllIll(lllllllllllllllIIllllllIIIIllIII.isEmpty())) {
         var10000 = lIIIIllIIIIII[lIIIIllIIIIll[1]];
         "".length();
         if (-" ".length() == (((105 ^ 98) << " ".length() ^ 109 ^ 68) & ((115 ^ 42) << " ".length() ^ 80 + 118 - 142 + 85 ^ -" ".length()))) {
            return null;
         }
      } else {
         StringBuilder var1 = new StringBuilder();
         String var10001;
         if (lIlIlIlllllIll(lllllllllllllllIIllllllIIIIllIII.isCtrl())) {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[0]];
            "".length();
            if ("   ".length() == ((95 ^ 70) & ~(178 ^ 171))) {
               return null;
            }
         } else {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[2]];
         }

         var1 = var1.append(var10001);
         if (lIlIlIlllllIll(lllllllllllllllIIllllllIIIIllIII.isAlt())) {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[3]];
            "".length();
            if (" ".length() <= 0) {
               return null;
            }
         } else {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[4]];
         }

         var1 = var1.append(var10001);
         if (lIlIlIlllllIll(lllllllllllllllIIllllllIIIIllIII.isShift())) {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[5]];
            "".length();
            if ("   ".length() <= 0) {
               return null;
            }
         } else {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[6]];
         }

         var1 = var1.append(var10001);
         if (lIlIlIlllllIlI(lllllllllllllllIIllllllIIIIllIII.key)) {
            var10001 = lIIIIllIIIIII[lIIIIllIIIIll[7]];
            "".length();
            if (-(49 ^ 104 ^ 15 ^ 82) >= 0) {
               return null;
            }
         } else {
            var10001 = lllllllllllllllIIllllllIIIIllIII.capitalise(Keyboard.getKeyName(lllllllllllllllIIllllllIIIIllIII.key));
         }

         var10000 = String.valueOf(var1.append(var10001));
      }

      return var10000;
   }

   public void setKey(int lllllllllllllllIIllllllIIIlIIIll) {
      lllllllllllllllIIllllllIIIlIIlII.key = lllllllllllllllIIllllllIIIlIIIll;
   }

   private static String lIlIlIlllIlIlI(String lllllllllllllllIIlllllIlllIlllll, String lllllllllllllllIIlllllIllllIIIII) {
      try {
         Exception lllllllllllllllIIlllllIlllIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllIllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIlllllIllllIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllllIllllIIIll.init(lIIIIllIIIIll[2], lllllllllllllllIIlllllIlllIlllIl);
         return new String(lllllllllllllllIIlllllIllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlIllllllII(int var0, int var1) {
      return var0 == var1;
   }
}
