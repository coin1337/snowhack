package rr.snowhack.snow.command.syntax.parsers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.syntax.SyntaxChunk;

public class DependantParser extends AbstractParser {
   // $FF: synthetic field
   int dependantIndex;
   // $FF: synthetic field
   private DependantParser.Dependency dependancy;
   // $FF: synthetic field
   private static final String[] lllIllIIlIlI;
   // $FF: synthetic field
   private static final int[] lllIllIIllIl;

   public DependantParser(int lllllllllllllllIlIlllIIIIIlIIlll, DependantParser.Dependency lllllllllllllllIlIlllIIIIIlIIllI) {
      lllllllllllllllIlIlllIIIIIlIlIII.dependantIndex = lllllllllllllllIlIlllIIIIIlIIlll;
      lllllllllllllllIlIlllIIIIIlIlIII.dependancy = lllllllllllllllIlIlllIIIIIlIIllI;
   }

   static {
      lIIllIlllIIIII();
      lIIllIllIllIIl();
   }

   private static boolean lIIllIlllIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllIlllIIIIl(Object var0) {
      return var0 != null;
   }

   private static void lIIllIllIllIIl() {
      lllIllIIlIlI = new String[lllIllIIllIl[4]];
      lllIllIIlIlI[lllIllIIllIl[0]] = lIIllIllIlIllI("", "uYNLy");
      lllIllIIlIlI[lllIllIIllIl[1]] = lIIllIllIlIlll("CbWUKGWvvs8=", "DzuWf");
      lllIllIIlIlI[lllIllIIllIl[2]] = lIIllIllIllIII("pM/2BrpHpQ0=", "sMtGK");
      lllIllIIlIlI[lllIllIIllIl[3]] = lIIllIllIlIllI("", "wWOKq");
   }

   private static boolean lIIllIlllIIIll(int var0, int var1) {
      return var0 <= var1;
   }

   private static String lIIllIllIllIII(String lllllllllllllllIlIllIllllllIlIII, String lllllllllllllllIlIllIllllllIIlIl) {
      try {
         SecretKeySpec lllllllllllllllIlIllIllllllIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllllllIIlIl.getBytes(StandardCharsets.UTF_8)), lllIllIIllIl[5]), "DES");
         String lllllllllllllllIlIllIllllllIIIll = Cipher.getInstance("DES");
         lllllllllllllllIlIllIllllllIIIll.init(lllIllIIllIl[2], lllllllllllllllIlIllIllllllIlIll);
         return new String(lllllllllllllllIlIllIllllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   protected String getDefaultChunk(SyntaxChunk lllllllllllllllIlIlllIIIIIlIIIll) {
      return lllllllllllllllIlIlllIIIIIlIIlII.dependancy.getEscape();
   }

   private static String lIIllIllIlIlll(String lllllllllllllllIlIllIlllllllIIll, String lllllllllllllllIlIllIlllllllIlII) {
      try {
         int lllllllllllllllIlIllIlllllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllIlllllllIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIlllllllIlll.init(lllIllIIllIl[2], lllllllllllllllIlIllIlllllllIIIl);
         return new String(lllllllllllllllIlIllIlllllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlllllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllIllIlIllI(String lllllllllllllllIlIlllIIIIIIIlIlI, String lllllllllllllllIlIlllIIIIIIIIlII) {
      lllllllllllllllIlIlllIIIIIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIlllIIIIIIIIIll = new StringBuilder();
      char[] lllllllllllllllIlIlllIIIIIIIIlll = lllllllllllllllIlIlllIIIIIIIIlII.toCharArray();
      byte lllllllllllllllIlIlllIIIIIIIIIIl = lllIllIIllIl[0];
      Exception lllllllllllllllIlIlllIIIIIIIIIII = lllllllllllllllIlIlllIIIIIIIlIlI.toCharArray();
      char lllllllllllllllIlIllIlllllllllll = lllllllllllllllIlIlllIIIIIIIIIII.length;
      int lllllllllllllllIlIllIllllllllllI = lllIllIIllIl[0];

      do {
         if (!lIIllIlllIIlIl(lllllllllllllllIlIllIllllllllllI, lllllllllllllllIlIllIlllllllllll)) {
            return String.valueOf(lllllllllllllllIlIlllIIIIIIIIIll);
         }

         int lllllllllllllllIlIllIlllllllllIl = lllllllllllllllIlIlllIIIIIIIIIII[lllllllllllllllIlIllIllllllllllI];
         lllllllllllllllIlIlllIIIIIIIIIll.append((char)(lllllllllllllllIlIllIlllllllllIl ^ lllllllllllllllIlIlllIIIIIIIIlll[lllllllllllllllIlIlllIIIIIIIIIIl % lllllllllllllllIlIlllIIIIIIIIlll.length]));
         "".length();
         ++lllllllllllllllIlIlllIIIIIIIIIIl;
         ++lllllllllllllllIlIllIllllllllllI;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean lIIllIlllIIIlI(int var0) {
      return var0 == 0;
   }

   public String getChunk(SyntaxChunk[] lllllllllllllllIlIlllIIIIIIlllII, SyntaxChunk lllllllllllllllIlIlllIIIIIIllIll, String[] lllllllllllllllIlIlllIIIIIIlIllI, String lllllllllllllllIlIlllIIIIIIlIlIl) {
      if (lIIllIlllIIIIl(lllllllllllllllIlIlllIIIIIIlIlIl) && lIIllIlllIIIlI(lllllllllllllllIlIlllIIIIIIlIlIl.equals(lllIllIIlIlI[lllIllIIllIl[0]]))) {
         return lllIllIIlIlI[lllIllIIllIl[1]];
      } else if (lIIllIlllIIIll(lllllllllllllllIlIlllIIIIIIlIllI.length, lllllllllllllllIlIlllIIIIIIlllIl.dependantIndex)) {
         return lllllllllllllllIlIlllIIIIIIlllIl.getDefaultChunk(lllllllllllllllIlIlllIIIIIIllIll);
      } else {
         return lIIllIlllIIIIl(lllllllllllllllIlIlllIIIIIIlIllI[lllllllllllllllIlIlllIIIIIIlllIl.dependantIndex]) && !lIIllIlllIIlII(lllllllllllllllIlIlllIIIIIIlIllI[lllllllllllllllIlIlllIIIIIIlllIl.dependantIndex].equals(lllIllIIlIlI[lllIllIIllIl[2]])) ? lllllllllllllllIlIlllIIIIIIlllIl.dependancy.feed(lllllllllllllllIlIlllIIIIIIlIllI[lllllllllllllllIlIlllIIIIIIlllIl.dependantIndex]) : lllIllIIlIlI[lllIllIIllIl[3]];
      }
   }

   private static void lIIllIlllIIIII() {
      lllIllIIllIl = new int[6];
      lllIllIIllIl[0] = (248 ^ 171) & ~(50 ^ 97);
      lllIllIIllIl[1] = " ".length();
      lllIllIIllIl[2] = " ".length() << " ".length();
      lllIllIIllIl[3] = "   ".length();
      lllIllIIllIl[4] = " ".length() << (" ".length() << " ".length());
      lllIllIIllIl[5] = " ".length() << "   ".length();
   }

   private static boolean lIIllIlllIIlII(int var0) {
      return var0 != 0;
   }

   public static class Dependency {
      // $FF: synthetic field
      String[][] map;
      // $FF: synthetic field
      private static final int[] lIIIlIllIllll;
      // $FF: synthetic field
      String escape;

      public Dependency(String[][] lllllllllllllllIIllIlIIIIIlIIlll, String lllllllllllllllIIllIlIIIIIlIIIll) {
         lllllllllllllllIIllIlIIIIIlIIlIl.map = new String[lIIIlIllIllll[0]][];
         lllllllllllllllIIllIlIIIIIlIIlIl.map = lllllllllllllllIIllIlIIIIIlIIlll;
         lllllllllllllllIIllIlIIIIIlIIlIl.escape = lllllllllllllllIIllIlIIIIIlIIIll;
      }

      static {
         lIllIIlIIllIlI();
      }

      private static boolean lIllIIlIIlllII(int var0) {
         return var0 != 0;
      }

      private static void lIllIIlIIllIlI() {
         lIIIlIllIllll = new int[2];
         lIIIlIllIllll[0] = (71 ^ 78) << " ".length() & ~((10 ^ 3) << " ".length());
         lIIIlIllIllll[1] = " ".length();
      }

      public String getEscape() {
         return lllllllllllllllIIllIlIIIIIIIIlII.escape;
      }

      private static boolean lIllIIlIIlllIl(Object var0) {
         return var0 != null;
      }

      private String[] containsKey(String[][] lllllllllllllllIIllIlIIIIIIllIII, String lllllllllllllllIIllIlIIIIIIlIlll) {
         double lllllllllllllllIIllIlIIIIIIlIllI = lllllllllllllllIIllIlIIIIIIllIII;
         double lllllllllllllllIIllIlIIIIIIlIlIl = lllllllllllllllIIllIlIIIIIIllIII.length;
         int lllllllllllllllIIllIlIIIIIIlIlII = lIIIlIllIllll[0];

         do {
            if (!lIllIIlIIllIll(lllllllllllllllIIllIlIIIIIIlIlII, lllllllllllllllIIllIlIIIIIIlIlIl)) {
               return null;
            }

            short lllllllllllllllIIllIlIIIIIIlIIll = lllllllllllllllIIllIlIIIIIIlIllI[lllllllllllllllIIllIlIIIIIIlIlII];
            if (lIllIIlIIlllII(lllllllllllllllIIllIlIIIIIIlIIll[lIIIlIllIllll[0]].equals(lllllllllllllllIIllIlIIIIIIlIlll))) {
               return lllllllllllllllIIllIlIIIIIIlIIll;
            }

            ++lllllllllllllllIIllIlIIIIIIlIlII;
            "".length();
         } while(null == null);

         return null;
      }

      public String feed(String lllllllllllllllIIllIlIIIIIIIlllI) {
         String[] lllllllllllllllIIllIlIIIIIIIllIl = lllllllllllllllIIllIlIIIIIIIllll.containsKey(lllllllllllllllIIllIlIIIIIIIllll.map, lllllllllllllllIIllIlIIIIIIIlllI);
         return lIllIIlIIlllIl(lllllllllllllllIIllIlIIIIIIIllIl) ? lllllllllllllllIIllIlIIIIIIIllIl[lIIIlIllIllll[1]] : lllllllllllllllIIllIlIIIIIIIllll.getEscape();
      }

      public String[][] getMap() {
         return lllllllllllllllIIllIlIIIIIIIlIII.map;
      }

      private static boolean lIllIIlIIllIll(int var0, int var1) {
         return var0 < var1;
      }
   }
}
