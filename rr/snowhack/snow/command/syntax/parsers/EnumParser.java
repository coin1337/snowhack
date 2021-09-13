package rr.snowhack.snow.command.syntax.parsers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.syntax.SyntaxChunk;

public class EnumParser extends AbstractParser {
   // $FF: synthetic field
   private static final int[] lIIIlIlllIlIl;
   // $FF: synthetic field
   private static final String[] lIIIlIlllIlII;
   // $FF: synthetic field
   String[] modes;

   private static boolean lIllIIlIllIIlI(Object var0) {
      return var0 == null;
   }

   private static String lIllIIlIlIlllI(String lllllllllllllllIIllIIlllIIIlllII, String lllllllllllllllIIllIIlllIIIllIll) {
      lllllllllllllllIIllIIlllIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllllllllllllllIIllIIlllIIIlIlIl = new StringBuilder();
      double lllllllllllllllIIllIIlllIIIlIlII = lllllllllllllllIIllIIlllIIIllIll.toCharArray();
      String lllllllllllllllIIllIIlllIIIlIIll = lIIIlIlllIlIl[0];
      float lllllllllllllllIIllIIlllIIIlIIlI = lllllllllllllllIIllIIlllIIIlllII.toCharArray();
      double lllllllllllllllIIllIIlllIIIlIIIl = lllllllllllllllIIllIIlllIIIlIIlI.length;
      int lllllllllllllllIIllIIlllIIIlIIII = lIIIlIlllIlIl[0];

      do {
         if (!lIllIIlIllIIll(lllllllllllllllIIllIIlllIIIlIIII, lllllllllllllllIIllIIlllIIIlIIIl)) {
            return String.valueOf(lllllllllllllllIIllIIlllIIIlIlIl);
         }

         char lllllllllllllllIIllIIlllIIIlllIl = lllllllllllllllIIllIIlllIIIlIIlI[lllllllllllllllIIllIIlllIIIlIIII];
         lllllllllllllllIIllIIlllIIIlIlIl.append((char)(lllllllllllllllIIllIIlllIIIlllIl ^ lllllllllllllllIIllIIlllIIIlIlII[lllllllllllllllIIllIIlllIIIlIIll % lllllllllllllllIIllIIlllIIIlIlII.length]));
         "".length();
         ++lllllllllllllllIIllIIlllIIIlIIll;
         ++lllllllllllllllIIllIIlllIIIlIIII;
         "".length();
      } while(" ".length() > 0);

      return null;
   }

   public EnumParser(String[] lllllllllllllllIIllIIlllIlIlllIl) {
      lllllllllllllllIIllIIlllIlIllllI.modes = lllllllllllllllIIllIIlllIlIlllIl;
   }

   private static boolean lIllIIlIllIlII(int var0) {
      return var0 != 0;
   }

   static {
      lIllIIlIllIIIl();
      lIllIIlIllIIII();
   }

   public String getChunk(SyntaxChunk[] lllllllllllllllIIllIIlllIlIIlllI, SyntaxChunk lllllllllllllllIIllIIlllIlIIllIl, String[] lllllllllllllllIIllIIlllIlIIllII, String lllllllllllllllIIllIIlllIlIIIllI) {
      String[] lllllllllllllllIIllIIlllIlIIIlII;
      int lllllllllllllllIIllIIlllIlIIIIll;
      int lllllllllllllllIIllIIlllIlIIIIlI;
      String lllllllllllllllIIllIIlllIlIlIIII;
      if (lIllIIlIllIIlI(lllllllllllllllIIllIIlllIlIIIllI)) {
         String lllllllllllllllIIllIIlllIlIlIIIl = lIIIlIlllIlII[lIIIlIlllIlIl[0]];
         lllllllllllllllIIllIIlllIlIIIlII = lllllllllllllllIIllIIlllIlIIlIII.modes;
         lllllllllllllllIIllIIlllIlIIIIll = lllllllllllllllIIllIIlllIlIIIlII.length;
         lllllllllllllllIIllIIlllIlIIIIlI = lIIIlIlllIlIl[0];

         do {
            if (!lIllIIlIllIIll(lllllllllllllllIIllIIlllIlIIIIlI, lllllllllllllllIIllIIlllIlIIIIll)) {
               lllllllllllllllIIllIIlllIlIlIIIl = lllllllllllllllIIllIIlllIlIlIIIl.substring(lIIIlIlllIlIl[0], lllllllllllllllIIllIIlllIlIlIIIl.length() - lIIIlIlllIlIl[1]);
               StringBuilder var10000 = new StringBuilder();
               String var10001;
               if (lIllIIlIllIlII(lllllllllllllllIIllIIlllIlIIllIl.isHeadless())) {
                  var10001 = lIIIlIlllIlII[lIIIlIlllIlIl[2]];
                  "".length();
                  if (null != null) {
                     return null;
                  }
               } else {
                  var10001 = lllllllllllllllIIllIIlllIlIIllIl.getHead();
               }

               var10000 = var10000.append(var10001);
               if (lIllIIlIllIlII(lllllllllllllllIIllIIlllIlIIllIl.isNecessary())) {
                  var10001 = lIIIlIlllIlII[lIIIlIlllIlIl[3]];
                  "".length();
                  if ("   ".length() == 0) {
                     return null;
                  }
               } else {
                  var10001 = lIIIlIlllIlII[lIIIlIlllIlIl[4]];
               }

               var10000 = var10000.append(var10001).append(lllllllllllllllIIllIIlllIlIlIIIl);
               if (lIllIIlIllIlII(lllllllllllllllIIllIIlllIlIIllIl.isNecessary())) {
                  var10001 = lIIIlIlllIlII[lIIIlIlllIlIl[5]];
                  "".length();
                  if (null != null) {
                     return null;
                  }
               } else {
                  var10001 = lIIIlIlllIlII[lIIIlIlllIlIl[6]];
               }

               return String.valueOf(var10000.append(var10001));
            }

            lllllllllllllllIIllIIlllIlIlIIII = lllllllllllllllIIllIIlllIlIIIlII[lllllllllllllllIIllIIlllIlIIIIlI];
            lllllllllllllllIIllIIlllIlIlIIIl = String.valueOf((new StringBuilder()).append(lllllllllllllllIIllIIlllIlIlIIIl).append(lllllllllllllllIIllIIlllIlIlIIII).append(lIIIlIlllIlII[lIIIlIlllIlIl[1]]));
            ++lllllllllllllllIIllIIlllIlIIIIlI;
            "".length();
         } while(-"  ".length() < 0);

         return null;
      } else {
         ArrayList<String> lllllllllllllllIIllIIlllIlIIlIlI = new ArrayList();
         lllllllllllllllIIllIIlllIlIIIlII = lllllllllllllllIIllIIlllIlIIlIII.modes;
         lllllllllllllllIIllIIlllIlIIIIll = lllllllllllllllIIllIIlllIlIIIlII.length;
         lllllllllllllllIIllIIlllIlIIIIlI = lIIIlIlllIlIl[0];

         do {
            if (!lIllIIlIllIIll(lllllllllllllllIIllIIlllIlIIIIlI, lllllllllllllllIIllIIlllIlIIIIll)) {
               if (lIllIIlIllIlII(lllllllllllllllIIllIIlllIlIIlIlI.isEmpty())) {
                  return lIIIlIlllIlII[lIIIlIlllIlIl[7]];
               }

               Collections.sort(lllllllllllllllIIllIIlllIlIIlIlI);
               String lllllllllllllllIIllIIlllIlIIlIIl = (String)lllllllllllllllIIllIIlllIlIIlIlI.get(lIIIlIlllIlIl[0]);
               return lllllllllllllllIIllIIlllIlIIlIIl.substring(lllllllllllllllIIllIIlllIlIIIllI.length());
            }

            lllllllllllllllIIllIIlllIlIlIIII = lllllllllllllllIIllIIlllIlIIIlII[lllllllllllllllIIllIIlllIlIIIIlI];
            if (lIllIIlIllIlII(lllllllllllllllIIllIIlllIlIlIIII.toLowerCase().startsWith(lllllllllllllllIIllIIlllIlIIIllI.toLowerCase()))) {
               lllllllllllllllIIllIIlllIlIIlIlI.add(lllllllllllllllIIllIIlllIlIlIIII);
               "".length();
            }

            ++lllllllllllllllIIllIIlllIlIIIIlI;
            "".length();
         } while(((139 + 37 - 154 + 223 ^ (27 ^ 70) << " ".length()) & (53 ^ 90 ^ " ".length() << (37 ^ 32) ^ -" ".length())) < " ".length());

         return null;
      }
   }

   private static void lIllIIlIllIIII() {
      lIIIlIlllIlII = new String[lIIIlIlllIlIl[8]];
      lIIIlIlllIlII[lIIIlIlllIlIl[0]] = lIllIIlIlIllIl("DM973wQ3BFo=", "fCgJb");
      lIIIlIlllIlII[lIIIlIlllIlIl[1]] = lIllIIlIlIlllI("bw==", "UIcuk");
      lIIIlIlllIlII[lIIIlIlllIlIl[2]] = lIllIIlIlIlllI("", "OFTYm");
      lIIIlIlllIlII[lIIIlIlllIlIl[3]] = lIllIIlIlIllIl("+pOyuHVWWJc=", "AyaPe");
      lIIIlIlllIlII[lIIIlIlllIlIl[4]] = lIllIIlIlIlllI("KA==", "sXGgb");
      lIIIlIlllIlII[lIIIlIlllIlIl[5]] = lIllIIlIlIllIl("gp2+crfJAZU=", "DCAtP");
      lIIIlIlllIlII[lIIIlIlllIlIl[6]] = lIllIIlIlIllll("jgDPL6CyibU=", "wbUFH");
      lIIIlIlllIlII[lIIIlIlllIlIl[7]] = lIllIIlIlIlllI("", "VImOa");
   }

   private static void lIllIIlIllIIIl() {
      lIIIlIlllIlIl = new int[9];
      lIIIlIlllIlIl[0] = ((112 ^ 125) << "   ".length() ^ 31 ^ 84) & (62 ^ 39 ^ (189 ^ 160) << " ".length() ^ -" ".length());
      lIIIlIlllIlIl[1] = " ".length();
      lIIIlIlllIlIl[2] = " ".length() << " ".length();
      lIIIlIlllIlIl[3] = "   ".length();
      lIIIlIlllIlIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIlllIlIl[5] = 88 ^ 93;
      lIIIlIlllIlIl[6] = "   ".length() << " ".length();
      lIIIlIlllIlIl[7] = (214 ^ 147) << " ".length() ^ 38 + 39 - 16 + 80;
      lIIIlIlllIlIl[8] = " ".length() << "   ".length();
   }

   private static String lIllIIlIlIllIl(String lllllllllllllllIIllIIlllIIlIlIlI, String lllllllllllllllIIllIIlllIIlIlIIl) {
      try {
         float lllllllllllllllIIllIIlllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlllIlIl[8]), "DES");
         char lllllllllllllllIIllIIlllIIlIIlll = Cipher.getInstance("DES");
         lllllllllllllllIIllIIlllIIlIIlll.init(lIIIlIlllIlIl[2], lllllllllllllllIIllIIlllIIlIlIII);
         return new String(lllllllllllllllIIllIIlllIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIllIIlIlIllll(String lllllllllllllllIIllIIlllIIlllIIl, String lllllllllllllllIIllIIlllIIlllIII) {
      try {
         SecretKeySpec lllllllllllllllIIllIIlllIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIIllIIlllIIllIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIIlllIIllIlII.init(lIIIlIlllIlIl[2], lllllllllllllllIIllIIlllIIllllII);
         return new String(lllllllllllllllIIllIIlllIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIlIllIIll(int var0, int var1) {
      return var0 < var1;
   }
}
