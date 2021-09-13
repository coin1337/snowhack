package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;
import rr.snowhack.snow.command.syntax.parsers.ModuleParser;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.setting.builder.SettingBuilder;
import rr.snowhack.snow.util.Wrapper;

public class BindCommand extends Command {
   // $FF: synthetic field
   public static Setting<Boolean> modifiersEnabled;
   // $FF: synthetic field
   private static final int[] llllIIIlIIII;
   // $FF: synthetic field
   private static final String[] llllIIIIllll;

   private static boolean lIIllllIIIlIll(Object var0) {
      return var0 == null;
   }

   private static boolean lIIllllIIIlIlI(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllllIIIllIl(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllllIIIlIIl(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIIllllIIIIlII(String lllllllllllllllIlIlIllllIIlIlIlI, String lllllllllllllllIlIlIllllIIlIlIll) {
      try {
         Exception lllllllllllllllIlIlIllllIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllIIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIllllIIlIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIllllIIlIlllI.init(llllIIIlIIII[2], lllllllllllllllIlIlIllllIIlIlIII);
         return new String(lllllllllllllllIlIlIllllIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllllIIIIlIl(String lllllllllllllllIlIlIllllIIIlllll, String lllllllllllllllIlIlIllllIIIllllI) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllllIIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllIIIllllI.getBytes(StandardCharsets.UTF_8)), llllIIIlIIII[8]), "DES");
         Cipher lllllllllllllllIlIlIllllIIlIIIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIlIllllIIlIIIIl.init(llllIIIlIIII[2], lllllllllllllllIlIlIllllIIlIIIlI);
         return new String(lllllllllllllllIlIlIllllIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      lIIllllIIIlIII();
      lIIllllIIIIllI();
      modifiersEnabled = SettingBuilder.register(Settings.b(llllIIIIllll[llllIIIlIIII[21]], (boolean)llllIIIlIIII[0]), llllIIIIllll[llllIIIlIIII[22]]);
   }

   public void call(String[] lllllllllllllllIlIlIllllIlIlIIII) {
      if (lIIllllIIIlIIl(lllllllllllllllIlIlIllllIlIlIIII.length, llllIIIlIIII[1])) {
         Command.sendChatMessage(llllIIIIllll[llllIIIlIIII[4]]);
      } else {
         boolean lllllllllllllllIlIlIllllIlIIllll = lllllllllllllllIlIlIllllIlIlIIII[llllIIIlIIII[0]];
         String lllllllllllllllIlIlIllllIlIlIIll = lllllllllllllllIlIlIllllIlIlIIII[llllIIIlIIII[1]];
         if (lIIllllIIIlIlI(lllllllllllllllIlIlIllllIlIIllll.equalsIgnoreCase(llllIIIIllll[llllIIIlIIII[5]]))) {
            if (lIIllllIIIlIll(lllllllllllllllIlIlIllllIlIlIIll)) {
               sendChatMessage(llllIIIIllll[llllIIIlIIII[6]]);
            } else {
               if (lIIllllIIIlIlI(lllllllllllllllIlIlIllllIlIlIIll.equalsIgnoreCase(llllIIIIllll[llllIIIlIIII[7]]))) {
                  modifiersEnabled.setValue(Boolean.valueOf((boolean)llllIIIlIIII[1]));
                  "".length();
                  sendChatMessage(llllIIIIllll[llllIIIlIIII[8]]);
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                     return;
                  }
               } else if (lIIllllIIIlIlI(lllllllllllllllIlIlIllllIlIlIIll.equalsIgnoreCase(llllIIIIllll[llllIIIlIIII[9]]))) {
                  modifiersEnabled.setValue(Boolean.valueOf((boolean)llllIIIlIIII[0]));
                  "".length();
                  sendChatMessage(llllIIIIllll[llllIIIlIIII[10]]);
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
               } else {
                  sendChatMessage(llllIIIIllll[llllIIIlIIII[11]]);
               }

            }
         } else {
            Module lllllllllllllllIlIlIllllIlIlIIlI = ModuleManager.getModuleByName(lllllllllllllllIlIlIllllIlIIllll);
            if (lIIllllIIIlIll(lllllllllllllllIlIlIllllIlIlIIlI)) {
               sendChatMessage(String.valueOf((new StringBuilder()).append(llllIIIIllll[llllIIIlIIII[12]]).append(lllllllllllllllIlIlIllllIlIIllll).append(llllIIIIllll[llllIIIlIIII[13]])));
            } else if (lIIllllIIIlIll(lllllllllllllllIlIlIllllIlIlIIll)) {
               sendChatMessage(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIlIllllIlIlIIlI.getName()).append(llllIIIIllll[llllIIIlIIII[14]]).append(lllllllllllllllIlIlIllllIlIlIIlI.getBindName())));
            } else {
               int lllllllllllllllIlIlIllllIlIIllII = Wrapper.getKey(lllllllllllllllIlIlIllllIlIlIIll);
               if (lIIllllIIIlIlI(lllllllllllllllIlIlIllllIlIlIIll.equalsIgnoreCase(llllIIIIllll[llllIIIlIIII[15]]))) {
                  lllllllllllllllIlIlIllllIlIIllII = llllIIIlIIII[16];
               }

               if (lIIllllIIIllII(lllllllllllllllIlIlIllllIlIIllII)) {
                  sendChatMessage(String.valueOf((new StringBuilder()).append(llllIIIIllll[llllIIIlIIII[17]]).append(lllllllllllllllIlIlIllllIlIlIIll).append(llllIIIIllll[llllIIIlIIII[18]])));
               } else {
                  lllllllllllllllIlIlIllllIlIlIIlI.getBind().setKey(lllllllllllllllIlIlIllllIlIIllII);
                  sendChatMessage(String.valueOf((new StringBuilder()).append(llllIIIIllll[llllIIIlIIII[19]]).append(lllllllllllllllIlIlIllllIlIlIIlI.getName()).append(llllIIIIllll[llllIIIlIIII[20]]).append(lllllllllllllllIlIlIllllIlIlIIll.toUpperCase())));
               }
            }
         }
      }
   }

   private static void lIIllllIIIlIII() {
      llllIIIlIIII = new int[24];
      llllIIIlIIII[0] = (91 ^ 72) << " ".length() & ~((165 ^ 182) << " ".length());
      llllIIIlIIII[1] = " ".length();
      llllIIIlIIII[2] = " ".length() << " ".length();
      llllIIIlIIII[3] = "   ".length();
      llllIIIlIIII[4] = " ".length() << (" ".length() << " ".length());
      llllIIIlIIII[5] = 181 ^ 176;
      llllIIIlIIII[6] = "   ".length() << " ".length();
      llllIIIlIIII[7] = (125 ^ 118) << "   ".length() ^ 84 ^ 11;
      llllIIIlIIII[8] = " ".length() << "   ".length();
      llllIIIlIIII[9] = 153 ^ 144;
      llllIIIlIIII[10] = (176 ^ 181) << " ".length();
      llllIIIlIIII[11] = (112 ^ 127) << " ".length() ^ 34 ^ 55;
      llllIIIlIIII[12] = "   ".length() << (" ".length() << " ".length());
      llllIIIlIIII[13] = (17 ^ 28) << "   ".length() ^ 107 ^ 14;
      llllIIIlIIII[14] = (64 ^ 79 ^ " ".length() << "   ".length()) << " ".length();
      llllIIIlIIII[15] = 44 ^ 35;
      llllIIIlIIII[16] = -" ".length();
      llllIIIlIIII[17] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllIIIlIIII[18] = " ".length() << (80 ^ 87) ^ 39 + 116 - 48 + 38;
      llllIIIlIIII[19] = (46 + 144 - 112 + 77 ^ (24 ^ 81) << " ".length()) << " ".length();
      llllIIIlIIII[20] = 18 ^ 1;
      llllIIIlIIII[21] = (143 ^ 138) << (" ".length() << " ".length());
      llllIIIlIIII[22] = 65 ^ 84;
      llllIIIlIIII[23] = (29 ^ 22) << " ".length();
   }

   private static String lIIllllIIIIIll(String lllllllllllllllIlIlIllllIlIIIIIl, String lllllllllllllllIlIlIllllIlIIIIII) {
      lllllllllllllllIlIlIllllIlIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIlIlIllllIIlllIlI = new StringBuilder();
      char[] lllllllllllllllIlIlIllllIIlllllI = lllllllllllllllIlIlIllllIlIIIIII.toCharArray();
      String lllllllllllllllIlIlIllllIIlllIII = llllIIIlIIII[0];
      long lllllllllllllllIlIlIllllIIllIlll = lllllllllllllllIlIlIllllIlIIIIIl.toCharArray();
      char lllllllllllllllIlIlIllllIIllIllI = lllllllllllllllIlIlIllllIIllIlll.length;
      int lllllllllllllllIlIlIllllIIllIlIl = llllIIIlIIII[0];

      do {
         if (!lIIllllIIIllIl(lllllllllllllllIlIlIllllIIllIlIl, lllllllllllllllIlIlIllllIIllIllI)) {
            return String.valueOf(lllllllllllllllIlIlIllllIIlllIlI);
         }

         char lllllllllllllllIlIlIllllIlIIIIlI = lllllllllllllllIlIlIllllIIllIlll[lllllllllllllllIlIlIllllIIllIlIl];
         lllllllllllllllIlIlIllllIIlllIlI.append((char)(lllllllllllllllIlIlIllllIlIIIIlI ^ lllllllllllllllIlIlIllllIIlllllI[lllllllllllllllIlIlIllllIIlllIII % lllllllllllllllIlIlIllllIIlllllI.length]));
         "".length();
         ++lllllllllllllllIlIlIllllIIlllIII;
         ++lllllllllllllllIlIlIllllIIllIlIl;
         "".length();
      } while(-((213 ^ 152) << " ".length() ^ 30 + 40 - -74 + 15) < 0);

      return null;
   }

   private static boolean lIIllllIIIllII(int var0) {
      return var0 == 0;
   }

   private static void lIIllllIIIIllI() {
      llllIIIIllll = new String[llllIIIlIIII[23]];
      llllIIIIllll[llllIIIlIIII[0]] = lIIllllIIIIIll("EQwGFA==", "sehpK");
      llllIIIIllll[llllIIIlIIII[1]] = lIIllllIIIIlII("NRfTWz3wB45Nn4eWItRPTGZKM0mX2ezw", "bBGio");
      llllIIIIllll[llllIIIlIIII[2]] = lIIllllIIIIIll("Hz08LTQ4DTY6FSswPwk=", "DVYTi");
      llllIIIIllll[llllIIIlIIII[3]] = lIIllllIIIIlIl("KHcaXn48lRiwRsleVfc2ZLFisaTYi5Nk3Cqrp4548A6FWgc1XaE9FD5/u6B6MsRY", "riGQa");
      llllIIIIllll[llllIIIlIIII[4]] = lIIllllIIIIIll("CiYDJDE/ahU1JzkjADxiO2oLKiYvJgNr", "ZJfEB");
      llllIIIIllll[llllIIIlIIII[5]] = lIIllllIIIIIll("PyYOHT47LBgH", "RIjtX");
      llllIIIIllll[llllIIIlIIII[6]] = lIIllllIIIIlIl("t40t9i0DeKorSK0d5RnNlzxpStBgGzTT", "JTmrj");
      llllIIIIllll[llllIIIlIIII[7]] = lIIllllIIIIIll("BxQ=", "hzBAu");
      llllIIIIllll[llllIIIlIIII[8]] = lIIllllIIIIlIl("xJK00jhxF2ypPTqx2LZaxjXj7Zug33PH", "owWtD");
      llllIIIIllll[llllIIIlIIII[9]] = lIIllllIIIIIll("AwwW", "ljpPo");
      llllIIIIllll[llllIIIlIIII[10]] = lIIllllIIIIlII("P9xHRo18sLHOhLJiI2EYJWdM6hEHCz2q", "RCKmT");
      llllIIIIllll[llllIIIlIIII[11]] = lIIllllIIIIlII("NMKPWkprJNPnknSa2uI//u328/wnZ4oO", "thgan");
      llllIIIIllll[llllIIIlIIII[12]] = lIIllllIIIIIll("DQA/Ai4vAHQBLjwbOAlhfw==", "XnTlA");
      llllIIIIllll[llllIIIlIIII[13]] = lIIllllIIIIIll("clY=", "Uwakc");
      llllIIIIllll[llllIIIlIIII[14]] = lIIllllIIIIlIl("9SkIATgiE9z9lHbyWpKJzQ==", "BbThK");
      llllIIIIllll[llllIIIlIIII[15]] = lIIllllIIIIIll("FCwfBg==", "zCqcd");
      llllIIIIllll[llllIIIlIIII[17]] = lIIllllIIIIlII("uIr3oZ0bpIYBRWw/zKRdTA==", "vLCKr");
      llllIIIIllll[llllIIIlIIII[18]] = lIIllllIIIIIll("UVI=", "vswmf");
      llllIIIIllll[llllIIIlIIII[19]] = lIIllllIIIIlIl("/aF2D15wRlAVYdVHbJtzzA==", "tOEQy");
      llllIIIIllll[llllIIIlIIII[20]] = lIIllllIIIIlIl("VGKuSqNft/HG61xRYqVPVQ==", "MMkZi");
      llllIIIIllll[llllIIIlIIII[21]] = lIIllllIIIIlIl("0y0cEOLIidOnChegBx9Ihic2VAGGrFO6", "zBTQL");
      llllIIIIllll[llllIIIlIIII[22]] = lIIllllIIIIIll("Dz87NRA=", "mVUQc");
   }

   public BindCommand() {
      super(llllIIIIllll[llllIIIlIIII[0]], (new ChunkBuilder()).append(llllIIIIllll[llllIIIlIIII[1]], (boolean)llllIIIlIIII[1], new ModuleParser()).append(llllIIIIllll[llllIIIlIIII[2]], (boolean)llllIIIlIIII[1]).build());
      lllllllllllllllIlIlIllllIlIlllII.setDescription(llllIIIIllll[llllIIIlIIII[3]]);
   }
}
