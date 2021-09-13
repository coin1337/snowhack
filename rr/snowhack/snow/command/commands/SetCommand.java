package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;
import rr.snowhack.snow.command.syntax.parsers.ModuleParser;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.ISettingUnknown;
import rr.snowhack.snow.setting.Setting;

public class SetCommand extends Command {
   // $FF: synthetic field
   private static final String[] lIIIIlllIIlll;
   // $FF: synthetic field
   private static final int[] lIIIIlllIllIl;

   private static boolean lIlIllIllIIlll(int var0) {
      return var0 == 0;
   }

   private static String lIlIllIlIlIlll(String lllllllllllllllIIllllIIlIlIIIIll, String lllllllllllllllIIllllIIlIlIIIIlI) {
      lllllllllllllllIIllllIIlIlIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lllllllllllllllIIllllIIlIlIIIIIl = new StringBuilder();
      byte lllllllllllllllIIllllIIlIlIIIIII = lllllllllllllllIIllllIIlIlIIIIlI.toCharArray();
      int lllllllllllllllIIllllIIlIlIIIlII = lIIIIlllIllIl[0];
      double lllllllllllllllIIllllIIlIIlllllI = lllllllllllllllIIllllIIlIlIIIIll.toCharArray();
      long lllllllllllllllIIllllIIlIIllllIl = lllllllllllllllIIllllIIlIIlllllI.length;
      int lllllllllllllllIIllllIIlIIllllII = lIIIIlllIllIl[0];

      do {
         if (!lIlIllIllIlIII(lllllllllllllllIIllllIIlIIllllII, lllllllllllllllIIllllIIlIIllllIl)) {
            return String.valueOf(lllllllllllllllIIllllIIlIlIIIIIl);
         }

         char lllllllllllllllIIllllIIlIlIIlIIl = lllllllllllllllIIllllIIlIIlllllI[lllllllllllllllIIllllIIlIIllllII];
         lllllllllllllllIIllllIIlIlIIIIIl.append((char)(lllllllllllllllIIllllIIlIlIIlIIl ^ lllllllllllllllIIllllIIlIlIIIIII[lllllllllllllllIIllllIIlIlIIIlII % lllllllllllllllIIllllIIlIlIIIIII.length]));
         "".length();
         ++lllllllllllllllIIllllIIlIlIIIlII;
         ++lllllllllllllllIIllllIIlIIllllII;
         "".length();
      } while((((11 ^ 0) << "   ".length() ^ 35 ^ 52) & (78 ^ 71 ^ (170 ^ 137) << " ".length() ^ -" ".length())) >= ("   ".length() & ("   ".length() ^ -" ".length())));

      return null;
   }

   private static boolean lIlIllIllIlIII(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIlIllIllIIIll();
      lIlIllIllIIIIl();
   }

   private static String lIlIllIlIllIIl(String lllllllllllllllIIllllIIlIlIllIII, String lllllllllllllllIIllllIIlIlIlIlll) {
      try {
         int lllllllllllllllIIllllIIlIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIIlIlIlIlll.getBytes(StandardCharsets.UTF_8)), lIIIIlllIllIl[8]), "DES");
         Exception lllllllllllllllIIllllIIlIlIlIIll = Cipher.getInstance("DES");
         lllllllllllllllIIllllIIlIlIlIIll.init(lIIIIlllIllIl[2], lllllllllllllllIIllllIIlIlIlIlII);
         return new String(lllllllllllllllIIllllIIlIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIIlIlIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public SetCommand() {
      super(lIIIIlllIIlll[lIIIIlllIllIl[0]], (new ChunkBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[1]], (boolean)lIIIIlllIllIl[1], new ModuleParser()).append(lIIIIlllIIlll[lIIIIlllIllIl[2]], (boolean)lIIIIlllIllIl[1]).append(lIIIIlllIIlll[lIIIIlllIllIl[3]], (boolean)lIIIIlllIllIl[1]).build());
      lllllllllllllllIIllllIIllIIIIlll.setDescription(lIIIIlllIIlll[lIIIIlllIllIl[4]]);
   }

   private static void lIlIllIllIIIll() {
      lIIIIlllIllIl = new int[23];
      lIIIIlllIllIl[0] = " ".length() << "   ".length() & ~(" ".length() << "   ".length());
      lIIIIlllIllIl[1] = " ".length();
      lIIIIlllIllIl[2] = " ".length() << " ".length();
      lIIIIlllIllIl[3] = "   ".length();
      lIIIIlllIllIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIIlllIllIl[5] = (220 ^ 131) << " ".length() ^ 101 + 13 - -5 + 68;
      lIIIIlllIllIl[6] = "   ".length() << " ".length();
      lIIIIlllIllIl[7] = 28 ^ 27;
      lIIIIlllIllIl[8] = " ".length() << "   ".length();
      lIIIIlllIllIl[9] = 90 + 73 - 109 + 115 ^ (92 ^ 89) << (191 ^ 186);
      lIIIIlllIllIl[10] = (167 ^ 162) << " ".length();
      lIIIIlllIllIl[11] = 133 ^ 142;
      lIIIIlllIllIl[12] = "   ".length() << (" ".length() << " ".length());
      lIIIIlllIllIl[13] = 138 ^ 135;
      lIIIIlllIllIl[14] = (14 + 40 - -58 + 31 ^ (145 ^ 128) << "   ".length()) << " ".length();
      lIIIIlllIllIl[15] = 202 ^ 197;
      lIIIIlllIllIl[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIlllIllIl[17] = 41 ^ 56;
      lIIIIlllIllIl[18] = (36 ^ 45) << " ".length();
      lIIIIlllIllIl[19] = (203 ^ 160) << " ".length() ^ 42 + 122 - -3 + 30;
      lIIIIlllIllIl[20] = (2 ^ 7) << (" ".length() << " ".length());
      lIIIIlllIllIl[21] = 241 ^ 128 ^ (104 ^ 113) << (" ".length() << " ".length());
      lIIIIlllIllIl[22] = (207 ^ 196) << " ".length();
   }

   private static boolean lIlIllIllIIlIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIllIllIIllI(int var0) {
      return var0 != 0;
   }

   private static String lIlIllIlIlIlIl(String lllllllllllllllIIllllIIlIllIIIll, String lllllllllllllllIIllllIIlIllIIlII) {
      try {
         SecretKeySpec lllllllllllllllIIllllIIlIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIllllIIlIllIIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllllIIlIllIIlll.init(lIIIIlllIllIl[2], lllllllllllllllIIllllIIlIllIlIII);
         return new String(lllllllllllllllIIllllIIlIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIIlIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void call(String[] lllllllllllllllIIllllIIlIllllllI) {
      if (lIlIllIllIIlIl(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[0]])) {
         Command.sendChatMessage(lIIIIlllIIlll[lIIIIlllIllIl[5]]);
      } else {
         Module lllllllllllllllIIllllIIlIlllllIl = ModuleManager.getModuleByName(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[0]]);
         if (lIlIllIllIIlIl(lllllllllllllllIIllllIIlIlllllIl)) {
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[6]]).append(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[0]]).append(lIIIIlllIIlll[lIIIIlllIllIl[7]])));
         } else if (lIlIllIllIIlIl(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[1]])) {
            String lllllllllllllllIIllllIIllIIIIIIl = String.join(lIIIIlllIIlll[lIIIIlllIllIl[8]], (Iterable)lllllllllllllllIIllllIIlIlllllIl.settingList.stream().map((lllllllllllllllIIllllIIlIllIllIl) -> {
               return lllllllllllllllIIllllIIlIllIllIl.getName();
            }).collect(Collectors.toList()));
            if (lIlIllIllIIllI(lllllllllllllllIIllllIIllIIIIIIl.isEmpty())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[9]]).append(lllllllllllllllIIllllIIlIlllllIl.getName()).append(lIIIIlllIIlll[lIIIIlllIllIl[10]])));
               "".length();
               if ("   ".length() == ((175 ^ 140 ^ (14 ^ 11) << "   ".length()) << " ".length() & ((175 ^ 150 ^ (180 ^ 173) << " ".length()) << " ".length() ^ -" ".length()))) {
                  return;
               }
            } else {
               String[] var10000 = new String[lIIIIlllIllIl[2]];
               var10000[lIIIIlllIllIl[0]] = lIIIIlllIIlll[lIIIIlllIllIl[11]];
               var10000[lIIIIlllIllIl[1]] = lllllllllllllllIIllllIIllIIIIIIl;
               Command.sendStringChatMessage(var10000);
            }

         } else {
            Optional<Setting> lllllllllllllllIIllllIIlIlllllII = lllllllllllllllIIllllIIlIlllllIl.settingList.stream().filter((lllllllllllllllIIllllIIlIlllIIlI) -> {
               return lllllllllllllllIIllllIIlIlllIIlI.getName().equalsIgnoreCase(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[1]]);
            }).findFirst();
            if (lIlIllIllIIlll(lllllllllllllllIIllllIIlIlllllII.isPresent())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[12]]).append(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[1]]).append(lIIIIlllIIlll[lIIIIlllIllIl[13]]).append(lllllllllllllllIIllllIIlIlllllIl.getName()).append(lIIIIlllIIlll[lIIIIlllIllIl[14]])));
            } else {
               byte lllllllllllllllIIllllIIlIlllIlll = (ISettingUnknown)lllllllllllllllIIllllIIlIlllllII.get();
               if (lIlIllIllIIlIl(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[2]])) {
                  Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[15]]).append(lllllllllllllllIIllllIIlIlllIlll.getName()).append(lIIIIlllIIlll[lIIIIlllIllIl[16]]).append(lllllllllllllllIIllllIIlIlllIlll.getValueClass().getSimpleName()).append(lIIIIlllIIlll[lIIIIlllIllIl[17]]).append(lllllllllllllllIIllllIIlIlllIlll.getValueAsString())));
               } else {
                  try {
                     lllllllllllllllIIllllIIlIlllIlll.setValueFromString(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[2]]);
                     Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[18]]).append(lllllllllllllllIIllllIIlIlllIlll.getName()).append(lIIIIlllIIlll[lIIIIlllIllIl[19]]).append(lllllllllllllllIIllllIIlIllllllI[lIIIIlllIllIl[2]]).append(lIIIIlllIIlll[lIIIIlllIllIl[20]])));
                  } catch (Exception var6) {
                     var6.printStackTrace();
                     Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIlllIIlll[lIIIIlllIllIl[21]]).append(var6.getMessage())));
                     return;
                  }

                  "".length();
                  if (((87 ^ 118) << " ".length() & ~((32 ^ 1) << " ".length())) == 0) {
                     ;
                  }
               }
            }
         }
      }
   }

   private static void lIlIllIllIIIIl() {
      lIIIIlllIIlll = new String[lIIIIlllIllIl[22]];
      lIIIIlllIIlll[lIIIIlllIllIl[0]] = lIlIllIlIlIlIl("AfiwhK648vc=", "OnSHo");
      lIIIIlllIIlll[lIIIIlllIllIl[1]] = lIlIllIlIlIlll("JDgjBAks", "IWGqe");
      lIIIIlllIIlll[lIIIIlllIllIl[2]] = lIlIllIlIllIIl("/EbQvG98IDs=", "LpcKi");
      lIIIIlllIIlll[lIIIIlllIllIl[3]] = lIlIllIlIlIlIl("33mfeduXOD8=", "sAFsX");
      lIIIIlllIIlll[lIIIIlllIllIl[4]] = lIlIllIlIlIlll("Mh4GBiYUVhMAJFEFAhw1GBgASC4XVgZIIhQEEwkoH1YKByUEGgI=", "qvghA");
      lIIIIlllIIlll[lIIIIlllIllIl[5]] = lIlIllIlIllIIl("jGpBSUiToOq8Sf0g8TQAecMZf8SY4JZv1/kKUJl+Ju4=", "opvHg");
      lIIIIlllIIlll[lIIIIlllIllIl[6]] = lIlIllIlIlIlll("IiI5FAIAInIXAhM5Ph9NUS4=", "wLRzm");
      lIIIIlllIIlll[lIIIIlllIllIl[7]] = lIlIllIlIlIlIl("Y3TUmogi54E=", "WelmO");
      lIIIIlllIIlll[lIIIIlllIllIl[8]] = lIlIllIlIllIIl("9O6HZHhiHbk=", "BaNxX");
      lIIIIlllIIlll[lIIIIlllIllIl[9]] = lIlIllIlIlIlll("IB0lFh8IUmcB", "mrAcs");
      lIIIIlllIIlll[lIIIIlllIllIl[10]] = lIlIllIlIllIIl("G0E6JybJS006E7Qcna+24wuW1xoUctct", "bgrSx");
      lIIIIlllIIlll[lIIIIlllIllIl[11]] = lIlIllIlIlIlll("Ki4XAzsfYgESLRkrFBtoG2IBBzwOKxwFaVoBGg0nCSdSDSYfYh0EaA4qF0IuFS4eDT8TLBVY", "zBrbH");
      lIIIIlllIIlll[lIIIIlllIllIl[12]] = lIlIllIlIlIlIl("aiLBw3m+a5pNGd65VnOC6kDY3PhNdBvn", "ysugT");
      lIIIIlllIIlll[lIIIIlllIllIl[13]] = lIlIllIlIllIIl("ay1AGS4rDDG0KonJkuEnxw==", "MGLXO");
      lIIIIlllIIlll[lIIIIlllIllIl[14]] = lIlIllIlIllIIl("vkzL/H0pU74=", "AbBRl");
      lIIIIlllIIlll[lIIIIlllIllIl[15]] = lIlIllIlIllIIl("fWhE8H4Kn4g=", "zckbP");
      lIIIIlllIIlll[lIIIIlllIllIl[16]] = lIlIllIlIlIlIl("4JJ8upGOGRsa2N7SsiAFWA==", "VgFRW");
      lIIIIlllIIlll[lIIIIlllIllIl[17]] = lIlIllIlIlIlll("YgV7aS8wBHUqEzYFMCcSZAE0JRMhVzw6RmJE", "DwUIf");
      lIIIIlllIIlll[lIIIIlllIllIl[18]] = lIlIllIlIlIlIl("k3MBaqc/FB8=", "hMQUo");
      lIIIIlllIIlll[lIIIIlllIllIl[19]] = lIlIllIlIlIlIl("aHSKhliiXb434ohrjoanag==", "wcvqO");
      lIIIIlllIIlll[lIIIIlllIllIl[20]] = lIlIllIlIllIIl("RZkLCPga8LE=", "FUSto");
      lIIIIlllIIlll[lIIIIlllIllIl[21]] = lIlIllIlIllIIl("EZtNVLHyxi2SQ9nToJ9SlIxlhjTB/QM6", "eedMz");
   }
}
