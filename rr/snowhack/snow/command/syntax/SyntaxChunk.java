package rr.snowhack.snow.command.syntax;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class SyntaxChunk {
   // $FF: synthetic field
   String head;
   // $FF: synthetic field
   boolean headless;
   // $FF: synthetic field
   public static final SyntaxChunk[] EMPTY;
   // $FF: synthetic field
   private static final String[] lIIIlIIlIllll;
   // $FF: synthetic field
   private SyntaxParser parser;
   // $FF: synthetic field
   String type;
   // $FF: synthetic field
   private boolean necessary;
   // $FF: synthetic field
   private static final int[] lIIIlIIllIIlI;

   public String getChunk(SyntaxChunk[] lllllllllllllllIIlllIIIllllIIIll, SyntaxChunk lllllllllllllllIIlllIIIllllIlIII, String[] lllllllllllllllIIlllIIIllllIIIIl, String lllllllllllllllIIlllIIIllllIIllI) {
      String lllllllllllllllIIlllIIIllllIIlIl = lllllllllllllllIIlllIIIllllIlIlI.parser.getChunk(lllllllllllllllIIlllIIIllllIIIll, lllllllllllllllIIlllIIIllllIlIII, lllllllllllllllIIlllIIIllllIIIIl, lllllllllllllllIIlllIIIllllIIllI);
      return lIlIllllllIIlI(lllllllllllllllIIlllIIIllllIIlIl) ? lIIIlIIlIllll[lIIIlIIllIIlI[1]] : lllllllllllllllIIlllIIIllllIIlIl;
   }

   private static boolean lIlIllllllIlII(int var0) {
      return var0 != 0;
   }

   static {
      lIlIllllllIIIl();
      lIlIlllllIlIIl();
      EMPTY = new SyntaxChunk[lIIIlIIllIIlI[0]];
   }

   private static String lIlIlllllIIllI(String lllllllllllllllIIlllIIIllIllIIlI, String lllllllllllllllIIlllIIIllIllIIIl) {
      try {
         long lllllllllllllllIIlllIIIllIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIIlI[7]), "DES");
         Cipher lllllllllllllllIIlllIIIllIllIlII = Cipher.getInstance("DES");
         lllllllllllllllIIlllIIIllIllIlII.init(lIIIlIIllIIlI[2], lllllllllllllllIIlllIIIllIlIlllI);
         return new String(lllllllllllllllIIlllIIIllIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public String getHead() {
      return lllllllllllllllIIlllIIIllllllIII.head;
   }

   private static String lIlIlllllIlIII(String lllllllllllllllIIlllIIIllIllllIl, String lllllllllllllllIIlllIIIllIllllII) {
      try {
         boolean lllllllllllllllIIlllIIIllIlllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lllllllllllllllIIlllIIIllIlllIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIIIllIlllIlI.init(lIIIlIIllIIlI[2], lllllllllllllllIIlllIIIllIlllIll);
         return new String(lllllllllllllllIIlllIIIllIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIlIlllllIlIIl() {
      lIIIlIIlIllll = new String[lIIIlIIllIIlI[6]];
      lIIIlIIlIllll[lIIIlIIllIIlI[0]] = lIlIlllllIIllI("c2LJJrOSlPU=", "LDLRA");
      lIIIlIIlIllll[lIIIlIIllIIlI[1]] = lIlIlllllIIlll("", "edZUy");
      lIIIlIIlIllll[lIIIlIIllIIlI[2]] = lIlIlllllIIllI("ZEoS0JcokWs=", "igkQj");
      lIIIlIIlIllll[lIIIlIIllIIlI[3]] = lIlIlllllIIllI("Lm16Iet9Z8U=", "caXYB");
      lIIIlIIlIllll[lIIIlIIllIIlI[4]] = lIlIlllllIlIII("XtxASe68/CM=", "MLywG");
      lIIIlIIlIllll[lIIIlIIllIIlI[5]] = lIlIlllllIIllI("MioYoKrGQQU=", "bYCcA");
   }

   private static boolean lIlIllllllIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIllllllIIIl() {
      lIIIlIIllIIlI = new int[8];
      lIIIlIIllIIlI[0] = "   ".length() << ((180 ^ 175) << " ".length() ^ 117 ^ 70) & ("   ".length() << ((55 ^ 62) << (" ".length() << " ".length()) ^ 30 ^ 63) ^ -" ".length());
      lIIIlIIllIIlI[1] = " ".length();
      lIIIlIIllIIlI[2] = " ".length() << " ".length();
      lIIIlIIllIIlI[3] = "   ".length();
      lIIIlIIllIIlI[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIIllIIlI[5] = 0 ^ 71 ^ (82 ^ 115) << " ".length();
      lIIIlIIllIIlI[6] = "   ".length() << " ".length();
      lIIIlIIllIIlI[7] = " ".length() << "   ".length();
   }

   public SyntaxChunk(String lllllllllllllllIIlllIIIllllllllI, boolean lllllllllllllllIIlllIIIllllllIlI) {
      this(lIIIlIIlIllll[lIIIlIIllIIlI[0]], lllllllllllllllIIlllIIIllllllllI, lllllllllllllllIIlllIIIllllllIlI);
      lllllllllllllllIIlllIIIlllllllII.headless = (boolean)lIIIlIIllIIlI[1];
   }

   public boolean isHeadless() {
      return lllllllllllllllIIlllIIIlllllIlIl.headless;
   }

   public void setParser(SyntaxParser lllllllllllllllIIlllIIIlllIlIllI) {
      lllllllllllllllIIlllIIIlllIlIlll.parser = lllllllllllllllIIlllIIIlllIlIllI;
   }

   public String getType() {
      return lllllllllllllllIIlllIIIlllIlllIl.type;
   }

   public SyntaxChunk(String lllllllllllllllIIlllIIlIIIIIIlIl, String lllllllllllllllIIlllIIlIIIIIlIII, boolean lllllllllllllllIIlllIIlIIIIIIIll) {
      lllllllllllllllIIlllIIlIIIIIlIlI.headless = (boolean)lIIIlIIllIIlI[0];
      lllllllllllllllIIlllIIlIIIIIlIlI.head = lllllllllllllllIIlllIIlIIIIIIlIl;
      lllllllllllllllIIlllIIlIIIIIlIlI.type = lllllllllllllllIIlllIIlIIIIIlIII;
      lllllllllllllllIIlllIIlIIIIIlIlI.necessary = lllllllllllllllIIlllIIlIIIIIIIll;
      lllllllllllllllIIlllIIlIIIIIlIlI.parser = (lllllllllllllllIIlllIIIlllIIlllI, lllllllllllllllIIlllIIIlllIIllIl, lllllllllllllllIIlllIIIlllIIllII, lllllllllllllllIIlllIIIlllIIlIll) -> {
         if (lIlIllllllIIll(lllllllllllllllIIlllIIIlllIIlIll)) {
            return null;
         } else {
            StringBuilder var10000 = (new StringBuilder()).append(lllllllllllllllIIlllIIlIIIIIIlIl);
            String var10001;
            if (lIlIllllllIlII(lllllllllllllllIIlllIIIlllIIlIlI.isNecessary())) {
               var10001 = lIIIlIIlIllll[lIIIlIIllIIlI[2]];
               "".length();
               if (((87 ^ 52 ^ (17 ^ 36) << " ".length()) << "   ".length() & ((96 + 94 - 46 + 23 ^ (79 ^ 24) << " ".length()) << "   ".length() ^ -" ".length())) >= "   ".length()) {
                  return null;
               }
            } else {
               var10001 = lIIIlIIlIllll[lIIIlIIllIIlI[3]];
            }

            var10000 = var10000.append(var10001).append(lllllllllllllllIIlllIIlIIIIIlIII);
            if (lIlIllllllIlII(lllllllllllllllIIlllIIIlllIIlIlI.isNecessary())) {
               var10001 = lIIIlIIlIllll[lIIIlIIllIIlI[4]];
               "".length();
               if (((118 ^ 93) << " ".length() & ~((132 ^ 175) << " ".length())) != 0) {
                  return null;
               }
            } else {
               var10001 = lIIIlIIlIllll[lIIIlIIllIIlI[5]];
            }

            return String.valueOf(var10000.append(var10001));
         }
      };
   }

   public boolean isNecessary() {
      return lllllllllllllllIIlllIIIlllllIIIl.necessary;
   }

   private static boolean lIlIllllllIIlI(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIllllllIIll(Object var0) {
      return var0 != null;
   }

   private static String lIlIlllllIIlll(String lllllllllllllllIIlllIIIllIlIIIlI, String lllllllllllllllIIlllIIIllIIlllII) {
      lllllllllllllllIIlllIIIllIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIIIllIlIIIII = new StringBuilder();
      float lllllllllllllllIIlllIIIllIIllIlI = lllllllllllllllIIlllIIIllIIlllII.toCharArray();
      String lllllllllllllllIIlllIIIllIIllIIl = lIIIlIIllIIlI[0];
      double lllllllllllllllIIlllIIIllIIllIII = lllllllllllllllIIlllIIIllIlIIIlI.toCharArray();
      long lllllllllllllllIIlllIIIllIIlIlll = lllllllllllllllIIlllIIIllIIllIII.length;
      int lllllllllllllllIIlllIIIllIIlIllI = lIIIlIIllIIlI[0];

      do {
         if (!lIlIllllllIlIl(lllllllllllllllIIlllIIIllIIlIllI, lllllllllllllllIIlllIIIllIIlIlll)) {
            return String.valueOf(lllllllllllllllIIlllIIIllIlIIIII);
         }

         String lllllllllllllllIIlllIIIllIIlIlIl = lllllllllllllllIIlllIIIllIIllIII[lllllllllllllllIIlllIIIllIIlIllI];
         lllllllllllllllIIlllIIIllIlIIIII.append((char)(lllllllllllllllIIlllIIIllIIlIlIl ^ lllllllllllllllIIlllIIIllIIllIlI[lllllllllllllllIIlllIIIllIIllIIl % lllllllllllllllIIlllIIIllIIllIlI.length]));
         "".length();
         ++lllllllllllllllIIlllIIIllIIllIIl;
         ++lllllllllllllllIIlllIIIllIIlIllI;
         "".length();
      } while(null == null);

      return null;
   }
}
