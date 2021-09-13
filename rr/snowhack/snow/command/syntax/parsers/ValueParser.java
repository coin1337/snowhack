package rr.snowhack.snow.command.syntax.parsers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.syntax.SyntaxChunk;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;

public class ValueParser extends AbstractParser {
   // $FF: synthetic field
   private static final int[] lIIIlIllIIIlI;
   // $FF: synthetic field
   int moduleIndex;
   // $FF: synthetic field
   private static final String[] lIIIlIllIIIIl;

   private static boolean lIllIIlIIIIIIl(Object var0) {
      return var0 == null;
   }

   static {
      lIllIIIlllllll();
      lIllIIIllllllI();
   }

   public String getChunk(SyntaxChunk[] lllllllllllllllIIllIlIIlIIlllIIl, SyntaxChunk lllllllllllllllIIllIlIIlIIlllIII, String[] lllllllllllllllIIllIlIIlIIlIlllI, String lllllllllllllllIIllIlIIlIIlIllIl) {
      if (lIllIIlIIIIIII(lllllllllllllllIIllIlIIlIIlllIlI.moduleIndex, lllllllllllllllIIllIlIIlIIlIlllI.length - lIIIlIllIIIlI[0]) && !lIllIIlIIIIIIl(lllllllllllllllIIllIlIIlIIlIllIl)) {
         int lllllllllllllllIIllIlIIlIIlIllII = lllllllllllllllIIllIlIIlIIlIlllI[lllllllllllllllIIllIlIIlIIlllIlI.moduleIndex];
         Module lllllllllllllllIIllIlIIlIIllIlII = ModuleManager.getModuleByName(lllllllllllllllIIllIlIIlIIlIllII);
         if (lIllIIlIIIIIIl(lllllllllllllllIIllIlIIlIIllIlII)) {
            return lIIIlIllIIIIl[lIIIlIllIIIlI[1]];
         } else {
            HashMap<String, Setting> lllllllllllllllIIllIlIIlIIlIlIlI = new HashMap();
            Iterator lllllllllllllllIIllIlIIlIIlIlIIl = lllllllllllllllIIllIlIIlIIllIlII.settingList.iterator();

            do {
               Setting lllllllllllllllIIllIlIIlIIlllIll;
               if (!lIllIIlIIIIIlI(lllllllllllllllIIllIlIIlIIlIlIIl.hasNext())) {
                  if (lIllIIlIIIIIlI(lllllllllllllllIIllIlIIlIIlIlIlI.isEmpty())) {
                     return lIIIlIllIIIIl[lIIIlIllIIIlI[0]];
                  }

                  TreeMap<String, Setting> lllllllllllllllIIllIlIIlIIllIIlI = new TreeMap(lllllllllllllllIIllIlIIlIIlIlIlI);
                  lllllllllllllllIIllIlIIlIIlllIll = (Setting)lllllllllllllllIIllIlIIlIIllIIlI.firstEntry().getValue();
                  return lllllllllllllllIIllIlIIlIIlllIll.getName().substring(lllllllllllllllIIllIlIIlIIlIllIl.length());
               }

               lllllllllllllllIIllIlIIlIIlllIll = (Setting)lllllllllllllllIIllIlIIlIIlIlIIl.next();
               if (lIllIIlIIIIIlI(lllllllllllllllIIllIlIIlIIlllIll.getName().toLowerCase().startsWith(lllllllllllllllIIllIlIIlIIlIllIl.toLowerCase()))) {
                  lllllllllllllllIIllIlIIlIIlIlIlI.put(lllllllllllllllIIllIlIIlIIlllIll.getName(), lllllllllllllllIIllIlIIlIIlllIll);
                  "".length();
               }

               "".length();
            } while(-"  ".length() < 0);

            return null;
         }
      } else {
         return lllllllllllllllIIllIlIIlIIlllIlI.getDefaultChunk(lllllllllllllllIIllIlIIlIIlllIII);
      }
   }

   public ValueParser(int lllllllllllllllIIllIlIIlIlIIIlll) {
      lllllllllllllllIIllIlIIlIlIIlIII.moduleIndex = lllllllllllllllIIllIlIIlIlIIIlll;
   }

   private static String lIllIIIlllllII(String lllllllllllllllIIllIlIIlIIIlIIII, String lllllllllllllllIIllIlIIlIIIIllll) {
      lllllllllllllllIIllIlIIlIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlIIlIIIIlllI = new StringBuilder();
      char[] lllllllllllllllIIllIlIIlIIIIllIl = lllllllllllllllIIllIlIIlIIIIllll.toCharArray();
      boolean lllllllllllllllIIllIlIIlIIIIIlll = lIIIlIllIIIlI[1];
      char lllllllllllllllIIllIlIIlIIIIIllI = lllllllllllllllIIllIlIIlIIIlIIII.toCharArray();
      float lllllllllllllllIIllIlIIlIIIIIlIl = lllllllllllllllIIllIlIIlIIIIIllI.length;
      int lllllllllllllllIIllIlIIlIIIIIlII = lIIIlIllIIIlI[1];

      do {
         if (!lIllIIlIIIIIll(lllllllllllllllIIllIlIIlIIIIIlII, lllllllllllllllIIllIlIIlIIIIIlIl)) {
            return String.valueOf(lllllllllllllllIIllIlIIlIIIIlllI);
         }

         char lllllllllllllllIIllIlIIlIIIlIIIl = lllllllllllllllIIllIlIIlIIIIIllI[lllllllllllllllIIllIlIIlIIIIIlII];
         lllllllllllllllIIllIlIIlIIIIlllI.append((char)(lllllllllllllllIIllIlIIlIIIlIIIl ^ lllllllllllllllIIllIlIIlIIIIllIl[lllllllllllllllIIllIlIIlIIIIIlll % lllllllllllllllIIllIlIIlIIIIllIl.length]));
         "".length();
         ++lllllllllllllllIIllIlIIlIIIIIlll;
         ++lllllllllllllllIIllIlIIlIIIIIlII;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) >= "   ".length());

      return null;
   }

   private static String lIllIIIlllllIl(String lllllllllllllllIIllIlIIlIIIllllI, String lllllllllllllllIIllIlIIlIIIlllll) {
      try {
         byte lllllllllllllllIIllIlIIlIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lllllllllllllllIIllIlIIlIIIllIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlIIlIIIllIll.init(lIIIlIllIIIlI[2], lllllllllllllllIIllIlIIlIIIlllII);
         return new String(lllllllllllllllIIllIlIIlIIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIllIIIllllllI() {
      lIIIlIllIIIIl = new String[lIIIlIllIIIlI[2]];
      lIIIlIllIIIIl[lIIIlIllIIIlI[1]] = lIllIIIlllllII("", "PrqwT");
      lIIIlIllIIIIl[lIIIlIllIIIlI[0]] = lIllIIIlllllIl("h7O9BiVhO5Y=", "hXsrh");
   }

   private static boolean lIllIIlIIIIIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIllIIlIIIIIlI(int var0) {
      return var0 != 0;
   }

   private static boolean lIllIIlIIIIIII(int var0, int var1) {
      return var0 <= var1;
   }

   private static void lIllIIIlllllll() {
      lIIIlIllIIIlI = new int[3];
      lIIIlIllIIIlI[0] = " ".length();
      lIIIlIllIIIlI[1] = (89 ^ 86) & ~(21 ^ 26);
      lIIIlIllIIIlI[2] = " ".length() << " ".length();
   }
}
