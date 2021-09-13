package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;
import rr.snowhack.snow.command.syntax.parsers.ModuleParser;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.impl.EnumSetting;

public class SettingsCommand extends Command {
   // $FF: synthetic field
   private static final int[] lIIIIIIlIIllI;
   // $FF: synthetic field
   private static final String[] lIIIIIIlIIlII;

   private static boolean lIlIIllllIIIII(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIIllllIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   public void call(String[] lllllllllllllllIlIIIlllllIllllll) {
      if (lIlIIllllIIIII(lllllllllllllllIlIIIlllllIllllll[lIIIIIIlIIllI[0]])) {
         Command.sendChatMessage(lIIIIIIlIIlII[lIIIIIIlIIllI[3]]);
      } else {
         float lllllllllllllllIlIIIlllllIlllIlI = ModuleManager.getModuleByName(lllllllllllllllIlIIIlllllIllllll[lIIIIIIlIIllI[0]]);
         if (lIlIIllllIIIII(lllllllllllllllIlIIIlllllIlllIlI)) {
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIIlIIlII[lIIIIIIlIIllI[4]]).append(lllllllllllllllIlIIIlllllIllllll[lIIIIIIlIIllI[0]]).append(lIIIIIIlIIlII[lIIIIIIlIIllI[5]])));
         } else {
            List<Setting> lllllllllllllllIlIIIlllllIlllIIl = lllllllllllllllIlIIIlllllIlllIlI.settingList;
            String[] lllllllllllllllIlIIIlllllIllllII = new String[lllllllllllllllIlIIIlllllIlllIIl.size()];
            int lllllllllllllllIlIIIlllllIllIlll = lIIIIIIlIIllI[0];

            do {
               if (!lIlIIllllIIIIl(lllllllllllllllIlIIIlllllIllIlll, lllllllllllllllIlIIIlllllIlllIIl.size())) {
                  Command.sendStringChatMessage(lllllllllllllllIlIIIlllllIllllII);
                  return;
               }

               Setting lllllllllllllllIlIIIllllllIIIIlI = (Setting)lllllllllllllllIlIIIlllllIlllIIl.get(lllllllllllllllIlIIIlllllIllIlll);
               lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll] = String.valueOf((new StringBuilder()).append(lIIIIIIlIIlII[lIIIIIIlIIllI[6]]).append(lllllllllllllllIlIIIllllllIIIIlI.getName()).append(lIIIIIIlIIlII[lIIIIIIlIIllI[7]]).append(lllllllllllllllIlIIIllllllIIIIlI.getValue()).append(lIIIIIIlIIlII[lIIIIIIlIIllI[8]]).append(lllllllllllllllIlIIIllllllIIIIlI.getValue().getClass().getSimpleName()));
               if (lIlIIllllIIIlI(lllllllllllllllIlIIIllllllIIIIlI instanceof EnumSetting)) {
                  lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll] = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll]).append(lIIIIIIlIIlII[lIIIIIIlIIllI[9]]));
                  Enum[] lllllllllllllllIlIIIllllllIIIIll = (Enum[])((Enum[])((EnumSetting)lllllllllllllllIlIIIllllllIIIIlI).clazz.getEnumConstants());
                  float lllllllllllllllIlIIIlllllIllIlII = lllllllllllllllIlIIIllllllIIIIll;
                  short lllllllllllllllIlIIIlllllIllIIll = lllllllllllllllIlIIIllllllIIIIll.length;
                  int lllllllllllllllIlIIIlllllIllIIlI = lIIIIIIlIIllI[0];

                  while(lIlIIllllIIIIl(lllllllllllllllIlIIIlllllIllIIlI, lllllllllllllllIlIIIlllllIllIIll)) {
                     Enum lllllllllllllllIlIIIllllllIIIlII = lllllllllllllllIlIIIlllllIllIlII[lllllllllllllllIlIIIlllllIllIIlI];
                     lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll] = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll]).append(lllllllllllllllIlIIIllllllIIIlII.name()).append(lIIIIIIlIIlII[lIIIIIIlIIllI[10]]));
                     ++lllllllllllllllIlIIIlllllIllIIlI;
                     "".length();
                     if (-" ".length() >= ((117 ^ 92) & ~(74 ^ 99))) {
                        return;
                     }
                  }

                  lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll] = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll].substring(lIIIIIIlIIllI[0], lllllllllllllllIlIIIlllllIllllII[lllllllllllllllIlIIIlllllIllIlll].length() - lIIIIIIlIIllI[2])).append(lIIIIIIlIIlII[lIIIIIIlIIllI[11]]));
               }

               ++lllllllllllllllIlIIIlllllIllIlll;
               "".length();
            } while("   ".length() == "   ".length());

         }
      }
   }

   private static boolean lIlIIllllIIIlI(int var0) {
      return var0 != 0;
   }

   private static void lIlIIlllIllIll() {
      lIIIIIIlIIlII = new String[lIIIIIIlIIllI[12]];
      lIIIIIIlIIlII[lIIIIIIlIIllI[0]] = lIlIIlllIllIII("Gyo3OCcGKDA=", "hOCLN");
      lIIIIIIlIIlII[lIIIIIIlIIllI[1]] = lIlIIlllIllIII("DCwlNyQE", "aCABH");
      lIIIIIIlIIlII[lIIIIIIlIIllI[2]] = lIlIIlllIllIIl("Yb70ep2MLk4+FsyeuUxHluG+B94LLO07J9yQXtmV09AnfuOHyTHQMQ==", "JDDOH");
      lIIIIIIlIIlII[lIIIIIIlIIllI[3]] = lIlIIlllIllIlI("DF8hqsdKAHdMtUkFSZQjUA5fJlCz4w52uyk5kynzWYSPaMtUAEdCbUNrGMRsok3KOvfWMjwRYWA=", "zTItw");
      lIIIIIIlIIlII[lIIIIIIlIIllI[4]] = lIlIIlllIllIlI("DJLK0VUiTa26Sy0LBP41aE8ASp7qqnNrZJQ32KXhn6A=", "NEtuB");
      lIIIIIIlIIlII[lIIIIIIlIIllI[5]] = lIlIIlllIllIII("dg==", "WRfzX");
      lIIIIIIlIIlII[lIIIIIIlIIllI[6]] = lIlIIlllIllIIl("pOSQi2khJbA=", "pFpmX");
      lIIIIIIlIIlII[lIIIIIIlIIllI[7]] = lIlIIlllIllIII("a15jSQ==", "MmKtK");
      lIIIIIIlIIlII[lIIIIIIlIIllI[8]] = lIlIIlllIllIlI("MAjcmAJRnn/ny259tscE4g==", "EzAii");
      lIIIIIIlIIlII[lIIIIIIlIIllI[9]] = lIlIIlllIllIIl("hvzOGEQawD8=", "TNPNs");
      lIIIIIIlIIlII[lIIIIIIlIIllI[10]] = lIlIIlllIllIII("b3c=", "CWtss");
      lIIIIIIlIIlII[lIIIIIIlIIllI[11]] = lIlIIlllIllIII("Sw==", "bQySf");
   }

   private static String lIlIIlllIllIII(String lllllllllllllllIlIIIlllllIlIIIIl, String lllllllllllllllIlIIIlllllIlIIIII) {
      lllllllllllllllIlIIIlllllIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      float lllllllllllllllIlIIIlllllIIlllll = new StringBuilder();
      char lllllllllllllllIlIIIlllllIIllllI = lllllllllllllllIlIIIlllllIlIIIII.toCharArray();
      double lllllllllllllllIlIIIlllllIIlllIl = lIIIIIIlIIllI[0];
      boolean lllllllllllllllIlIIIlllllIIlllII = lllllllllllllllIlIIIlllllIlIIIIl.toCharArray();
      float lllllllllllllllIlIIIlllllIIllIll = lllllllllllllllIlIIIlllllIIlllII.length;
      int lllllllllllllllIlIIIlllllIIllIlI = lIIIIIIlIIllI[0];

      do {
         if (!lIlIIllllIIIIl(lllllllllllllllIlIIIlllllIIllIlI, lllllllllllllllIlIIIlllllIIllIll)) {
            return String.valueOf(lllllllllllllllIlIIIlllllIIlllll);
         }

         int lllllllllllllllIlIIIlllllIIllIIl = lllllllllllllllIlIIIlllllIIlllII[lllllllllllllllIlIIIlllllIIllIlI];
         lllllllllllllllIlIIIlllllIIlllll.append((char)(lllllllllllllllIlIIIlllllIIllIIl ^ lllllllllllllllIlIIIlllllIIllllI[lllllllllllllllIlIIIlllllIIlllIl % lllllllllllllllIlIIIlllllIIllllI.length]));
         "".length();
         ++lllllllllllllllIlIIIlllllIIlllIl;
         ++lllllllllllllllIlIIIlllllIIllIlI;
         "".length();
      } while(" ".length() >= 0);

      return null;
   }

   public SettingsCommand() {
      super(lIIIIIIlIIlII[lIIIIIIlIIllI[0]], (new ChunkBuilder()).append(lIIIIIIlIIlII[lIIIIIIlIIllI[1]], (boolean)lIIIIIIlIIllI[1], new ModuleParser()).build());
      lllllllllllllllIlIIIllllllIlIIIl.setDescription(lIIIIIIlIIlII[lIIIIIIlIIllI[2]]);
   }

   static {
      lIlIIlllIlllll();
      lIlIIlllIllIll();
   }

   private static void lIlIIlllIlllll() {
      lIIIIIIlIIllI = new int[13];
      lIIIIIIlIIllI[0] = ((167 ^ 158) << (" ".length() << " ".length()) ^ 103 + 18 - 71 + 147) & ((156 ^ 163) << " ".length() ^ 237 ^ 178 ^ -" ".length());
      lIIIIIIlIIllI[1] = " ".length();
      lIIIIIIlIIllI[2] = " ".length() << " ".length();
      lIIIIIIlIIllI[3] = "   ".length();
      lIIIIIIlIIllI[4] = " ".length() << (" ".length() << " ".length());
      lIIIIIIlIIllI[5] = 182 ^ 191 ^ "   ".length() << (" ".length() << " ".length());
      lIIIIIIlIIllI[6] = "   ".length() << " ".length();
      lIIIIIIlIIllI[7] = 25 ^ 30;
      lIIIIIIlIIllI[8] = " ".length() << "   ".length();
      lIIIIIIlIIllI[9] = 30 + 43 - -3 + 57 ^ (69 ^ 102) << (" ".length() << " ".length());
      lIIIIIIlIIllI[10] = (5 ^ 0) << " ".length();
      lIIIIIIlIIllI[11] = 37 + 112 - 129 + 115 ^ (121 ^ 90) << (" ".length() << " ".length());
      lIIIIIIlIIllI[12] = "   ".length() << (" ".length() << " ".length());
   }

   private static String lIlIIlllIllIIl(String lllllllllllllllIlIIIlllllIIIllll, String lllllllllllllllIlIIIlllllIIlIIII) {
      try {
         String lllllllllllllllIlIIIlllllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllIIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIllI[8]), "DES");
         boolean lllllllllllllllIlIIIlllllIIIllII = Cipher.getInstance("DES");
         lllllllllllllllIlIIIlllllIIIllII.init(lIIIIIIlIIllI[2], lllllllllllllllIlIIIlllllIIIllIl);
         return new String(lllllllllllllllIlIIIlllllIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIlllIllIlI(String lllllllllllllllIlIIIlllllIIIIIlI, String lllllllllllllllIlIIIlllllIIIIIll) {
      try {
         SecretKeySpec lllllllllllllllIlIIIlllllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIIlllllIIIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIlllllIIIIllI.init(lIIIIIIlIIllI[2], lllllllllllllllIlIIIlllllIIIIlll);
         return new String(lllllllllllllllIlIIIlllllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
