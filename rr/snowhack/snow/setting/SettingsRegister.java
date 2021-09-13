package rr.snowhack.snow.setting;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.StringTokenizer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.util.Pair;

public class SettingsRegister {
   // $FF: synthetic field
   private static final int[] lllllllIllIl;
   // $FF: synthetic field
   public HashMap<String, SettingsRegister> registerHashMap = new HashMap();
   // $FF: synthetic field
   public HashMap<String, Setting> settingHashMap = new HashMap();
   // $FF: synthetic field
   private static final String[] lllllllIllII;
   // $FF: synthetic field
   public static final SettingsRegister ROOT;

   public static void register(String lllllllllllllllIlIIlIlIIlllIlIlI, Setting lllllllllllllllIlIIlIlIIlllIlIIl) {
      Pair<String, SettingsRegister> lllllllllllllllIlIIlIlIIlllIlIII = dig(lllllllllllllllIlIIlIlIIlllIlIlI);
      ((SettingsRegister)lllllllllllllllIlIIlIlIIlllIlIII.getValue()).put((String)lllllllllllllllIlIIlIlIIlllIlIII.getKey(), lllllllllllllllIlIIlIlIIlllIlIIl);
   }

   private void put(String lllllllllllllllIlIIlIlIIllllIIlI, Setting lllllllllllllllIlIIlIlIIllllIIIl) {
      lllllllllllllllIlIIlIlIIllllIIII.settingHashMap.put(lllllllllllllllIlIIlIlIIllllIIlI, lllllllllllllllIlIIlIlIIllllIIIl);
      "".length();
   }

   private static boolean lIlIIlIlllIlII(int var0) {
      return var0 != 0;
   }

   private static void lIlIIlIlllIIll() {
      lllllllIllIl = new int[4];
      lllllllIllIl[0] = ((43 ^ 108) << " ".length() ^ 12 + 80 - -3 + 78) & ((69 ^ 108) << (" ".length() << " ".length()) ^ 112 + 3 - -12 + 8 ^ -" ".length());
      lllllllIllIl[1] = " ".length();
      lllllllIllIl[2] = " ".length() << " ".length();
      lllllllIllIl[3] = " ".length() << "   ".length();
   }

   private static String lIlIIlIlllIIII(String lllllllllllllllIlIIlIlIIllIIIIlI, String lllllllllllllllIlIIlIlIIlIllllll) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIlIIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIIlIllllll.getBytes(StandardCharsets.UTF_8)), lllllllIllIl[3]), "DES");
         Cipher lllllllllllllllIlIIlIlIIllIIIlII = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIlIIllIIIlII.init(lllllllIllIl[2], lllllllllllllllIlIIlIlIIllIIIlIl);
         return new String(lllllllllllllllIlIIlIlIIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public Setting getSetting(String lllllllllllllllIlIIlIlIIlllIIIIl) {
      return (Setting)lllllllllllllllIlIIlIlIIlllIIIlI.settingHashMap.get(lllllllllllllllIlIIlIlIIlllIIIIl);
   }

   public static Setting get(String lllllllllllllllIlIIlIlIIllIlllII) {
      Pair<String, SettingsRegister> lllllllllllllllIlIIlIlIIllIllIll = dig(lllllllllllllllIlIIlIlIIllIlllII);
      return ((SettingsRegister)lllllllllllllllIlIIlIlIIllIllIll.getValue()).getSetting((String)lllllllllllllllIlIIlIlIIllIllIll.getKey());
   }

   public SettingsRegister subregister(String lllllllllllllllIlIIlIlIIlllllIll) {
      if (lIlIIlIlllIlII(lllllllllllllllIlIIlIlIIllllllII.registerHashMap.containsKey(lllllllllllllllIlIIlIlIIlllllIll))) {
         return (SettingsRegister)lllllllllllllllIlIIlIlIIllllllII.registerHashMap.get(lllllllllllllllIlIIlIlIIlllllIll);
      } else {
         SettingsRegister lllllllllllllllIlIIlIlIIlllllIlI = new SettingsRegister();
         lllllllllllllllIlIIlIlIIllllllII.registerHashMap.put(lllllllllllllllIlIIlIlIIlllllIll, lllllllllllllllIlIIlIlIIlllllIlI);
         "".length();
         return lllllllllllllllIlIIlIlIIlllllIlI;
      }
   }

   private static void lIlIIlIlllIIlI() {
      lllllllIllII = new String[lllllllIllIl[2]];
      lllllllIllII[lllllllIllIl[0]] = lIlIIlIlllIIII("QK3NbFTLP+8=", "qlzoP");
      lllllllIllII[lllllllIllIl[1]] = lIlIIlIlllIIIl("", "lLxlN");
   }

   private static Pair<String, SettingsRegister> dig(String lllllllllllllllIlIIlIlIIllIIlllI) {
      SettingsRegister lllllllllllllllIlIIlIlIIllIlIIIl = ROOT;
      String lllllllllllllllIlIIlIlIIllIIllII = new StringTokenizer(lllllllllllllllIlIIlIlIIllIIlllI, lllllllIllII[lllllllIllIl[0]]);
      String lllllllllllllllIlIIlIlIIllIIllll = null;

      while(lIlIIlIlllIlII(lllllllllllllllIlIIlIlIIllIIllII.hasMoreTokens())) {
         if (lIlIIlIlllIlIl(lllllllllllllllIlIIlIlIIllIIllll)) {
            lllllllllllllllIlIIlIlIIllIIllll = lllllllllllllllIlIIlIlIIllIIllII.nextToken();
            "".length();
            if (-" ".length() > ((122 ^ 75) << " ".length() & ~((91 ^ 106) << " ".length()))) {
               return null;
            }
         } else {
            String lllllllllllllllIlIIlIlIIllIlIIll = lllllllllllllllIlIIlIlIIllIIllII.nextToken();
            lllllllllllllllIlIIlIlIIllIlIIIl = lllllllllllllllIlIIlIlIIllIlIIIl.subregister(lllllllllllllllIlIIlIlIIllIIllll);
            lllllllllllllllIlIIlIlIIllIIllll = lllllllllllllllIlIIlIlIIllIlIIll;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < ((14 ^ 29) << (" ".length() << " ".length()) & ~((107 ^ 120) << (" ".length() << " ".length())))) {
               return null;
            }
         }
      }

      Pair var10000 = new Pair;
      String var10002;
      if (lIlIIlIlllIlIl(lllllllllllllllIlIIlIlIIllIIllll)) {
         var10002 = lllllllIllII[lllllllIllIl[1]];
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10002 = lllllllllllllllIlIIlIlIIllIIllll;
      }

      var10000.<init>(var10002, lllllllllllllllIlIIlIlIIllIlIIIl);
      return var10000;
   }

   private static String lIlIIlIlllIIIl(String lllllllllllllllIlIIlIlIIlIllIIlI, String lllllllllllllllIlIIlIlIIlIlIllII) {
      lllllllllllllllIlIIlIlIIlIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIlIlIIlIllIIII = new StringBuilder();
      long lllllllllllllllIlIIlIlIIlIlIlIlI = lllllllllllllllIlIIlIlIIlIlIllII.toCharArray();
      long lllllllllllllllIlIIlIlIIlIlIlIIl = lllllllIllIl[0];
      long lllllllllllllllIlIIlIlIIlIlIlIII = lllllllllllllllIlIIlIlIIlIllIIlI.toCharArray();
      long lllllllllllllllIlIIlIlIIlIlIIlll = lllllllllllllllIlIIlIlIIlIlIlIII.length;
      int lllllllllllllllIlIIlIlIIlIlIIllI = lllllllIllIl[0];

      do {
         if (!lIlIIlIlllIllI(lllllllllllllllIlIIlIlIIlIlIIllI, lllllllllllllllIlIIlIlIIlIlIIlll)) {
            return String.valueOf(lllllllllllllllIlIIlIlIIlIllIIII);
         }

         short lllllllllllllllIlIIlIlIIlIlIIlIl = lllllllllllllllIlIIlIlIIlIlIlIII[lllllllllllllllIlIIlIlIIlIlIIllI];
         lllllllllllllllIlIIlIlIIlIllIIII.append((char)(lllllllllllllllIlIIlIlIIlIlIIlIl ^ lllllllllllllllIlIIlIlIIlIlIlIlI[lllllllllllllllIlIIlIlIIlIlIlIIl % lllllllllllllllIlIIlIlIIlIlIlIlI.length]));
         "".length();
         ++lllllllllllllllIlIIlIlIIlIlIlIIl;
         ++lllllllllllllllIlIIlIlIIlIlIIllI;
         "".length();
      } while(((235 ^ 156 ^ (74 ^ 83) << (" ".length() << " ".length())) & ("   ".length() ^ " ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) == 0);

      return null;
   }

   private static boolean lIlIIlIlllIlIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIIlIlllIllI(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIlIIlIlllIIll();
      lIlIIlIlllIIlI();
      ROOT = new SettingsRegister();
   }
}
