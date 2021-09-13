package rr.snowhack.snow.command.commands;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;
import rr.snowhack.snow.command.syntax.parsers.DependantParser;
import rr.snowhack.snow.command.syntax.parsers.EnumParser;
import rr.snowhack.snow.gui.snow.SnowGUI;

public class ConfigCommand extends Command {
   // $FF: synthetic field
   private static final int[] lllIllIIlIIl;
   // $FF: synthetic field
   private static final String[] lllIllIIlIII;

   public ConfigCommand() {
      String var10001 = lllIllIIlIII[lllIllIIlIIl[0]];
      ChunkBuilder var10002 = new ChunkBuilder();
      String var10003 = lllIllIIlIII[lllIllIIlIIl[1]];
      int var10004 = lllIllIIlIIl[1];
      String[] var10007 = new String[lllIllIIlIIl[2]];
      var10007[lllIllIIlIIl[0]] = lllIllIIlIII[lllIllIIlIIl[3]];
      var10007[lllIllIIlIIl[1]] = lllIllIIlIII[lllIllIIlIIl[2]];
      var10007[lllIllIIlIIl[3]] = lllIllIIlIII[lllIllIIlIIl[4]];
      var10002 = var10002.append(var10003, (boolean)var10004, new EnumParser(var10007));
      var10003 = lllIllIIlIII[lllIllIIlIIl[5]];
      var10004 = lllIllIIlIIl[1];
      int var1 = lllIllIIlIIl[0];
      String[][] var10010 = new String[lllIllIIlIIl[1]][];
      int var10012 = lllIllIIlIIl[0];
      String[] var10013 = new String[lllIllIIlIIl[3]];
      var10013[lllIllIIlIIl[0]] = lllIllIIlIII[lllIllIIlIIl[6]];
      var10013[lllIllIIlIIl[1]] = lllIllIIlIII[lllIllIIlIIl[7]];
      var10010[var10012] = var10013;
      super(var10001, var10002.append(var10003, (boolean)var10004, new DependantParser(var1, new DependantParser.Dependency(var10010, lllIllIIlIII[lllIllIIlIIl[8]]))).build());
      lllllllllllllllIlIlllIIIllllIIlI.setDescription(lllIllIIlIII[lllIllIIlIIl[9]]);
   }

   public void call(String[] lllllllllllllllIlIlllIIIlllIIIIl) {
      if (lIIllIllIlIIIl(lllllllllllllllIlIlllIIIlllIIIIl[lllIllIIlIIl[0]])) {
         Command.sendChatMessage(lllIllIIlIII[lllIllIIlIIl[10]]);
      } else {
         boolean lllllllllllllllIlIlllIIIllIllllI = lllllllllllllllIlIlllIIIlllIIIIl[lllIllIIlIIl[0]].toLowerCase();
         double lllllllllllllllIlIlllIIIllIlllIl = lllIllIIlIIl[11];
         switch(lllllllllllllllIlIlllIIIllIllllI.hashCode()) {
         case -934641255:
            if (lIIllIllIlIIlI(lllllllllllllllIlIlllIIIllIllllI.equals(lllIllIIlIII[lllIllIIlIIl[12]]))) {
               lllllllllllllllIlIlllIIIllIlllIl = lllIllIIlIIl[0];
               "".length();
               if (((149 ^ 142) << " ".length() & ~((103 ^ 124) << " ".length())) >= "   ".length()) {
                  return;
               }
            }
            break;
         case 3433509:
            if (lIIllIllIlIIlI(lllllllllllllllIlIlllIIIllIllllI.equals(lllIllIIlIII[lllIllIIlIIl[14]]))) {
               lllllllllllllllIlIlllIIIllIlllIl = lllIllIIlIIl[3];
            }
            break;
         case 3522941:
            if (lIIllIllIlIIlI(lllllllllllllllIlIlllIIIllIllllI.equals(lllIllIIlIII[lllIllIIlIIl[13]]))) {
               lllllllllllllllIlIlllIIIllIlllIl = lllIllIIlIIl[1];
               "".length();
               if (" ".length() << (" ".length() << " ".length()) < " ".length()) {
                  return;
               }
            }
         }

         switch(lllllllllllllllIlIlllIIIllIlllIl) {
         case 0:
            lllllllllllllllIlIlllIIIlllIIIlI.reload();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == " ".length() << " ".length()) {
               return;
            }
            break;
         case 1:
            try {
               SnowMod.saveConfigurationUnsafe();
               Command.sendChatMessage(lllIllIIlIII[lllIllIIlIIl[15]]);
            } catch (IOException var20) {
               var20.printStackTrace();
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIllIIlIII[lllIllIIlIIl[16]]).append(var20.getMessage())));
               "".length();
               if (-" ".length() >= -" ".length()) {
                  break;
               }

               return;
            }

            "".length();
            if (null != null) {
               return;
            }
            break;
         case 2:
            if (lIIllIllIlIIIl(lllllllllllllllIlIlllIIIlllIIIIl[lllIllIIlIIl[1]])) {
               Path lllllllllllllllIlIlllIIIlllIIllI = Paths.get(SnowMod.getConfigName());
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIllIIlIII[lllIllIIlIIl[17]]).append(lllllllllllllllIlIlllIIIlllIIllI.toAbsolutePath().toString())));
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               String lllllllllllllllIlIlllIIIlllIIIll = lllllllllllllllIlIlllIIIlllIIIIl[lllIllIIlIIl[1]];
               if (lIIllIllIlIIll(SnowMod.isFilenameValid(lllllllllllllllIlIlllIIIlllIIIll))) {
                  Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIllIIlIII[lllIllIIlIIl[18]]).append(lllllllllllllllIlIlllIIIlllIIIll).append(lllIllIIlIII[lllIllIIlIIl[19]])));
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
               } else {
                  try {
                     BufferedWriter lllllllllllllllIlIlllIIIlllIIlIl = Files.newBufferedWriter(Paths.get(lllIllIIlIII[lllIllIIlIIl[20]]));
                     Throwable lllllllllllllllIlIlllIIIllIllIlI = null;
                     boolean var16 = false;

                     try {
                        var16 = true;
                        lllllllllllllllIlIlllIIIlllIIlIl.write(lllllllllllllllIlIlllIIIlllIIIll);
                        lllllllllllllllIlIlllIIIlllIIIlI.reload();
                        Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIllIIlIII[lllIllIIlIIl[21]]).append(lllllllllllllllIlIlllIIIlllIIIll).append(lllIllIIlIII[lllIllIIlIIl[22]])));
                        var16 = false;
                     } catch (Throwable var17) {
                        lllllllllllllllIlIlllIIIllIllIlI = var17;
                        throw var17;
                     } finally {
                        if (var16) {
                           if (lIIllIllIlIlII(lllllllllllllllIlIlllIIIlllIIlIl)) {
                              if (lIIllIllIlIlII(lllllllllllllllIlIlllIIIllIllIlI)) {
                                 label199: {
                                    try {
                                       lllllllllllllllIlIlllIIIlllIIlIl.close();
                                    } catch (Throwable var18) {
                                       lllllllllllllllIlIlllIIIllIllIlI.addSuppressed(var18);
                                       "".length();
                                       if (" ".length() <= " ".length() << " ".length()) {
                                          break label199;
                                       }

                                       return;
                                    }

                                    "".length();
                                    if (-"  ".length() >= 0) {
                                       return;
                                    }
                                 }
                              } else {
                                 lllllllllllllllIlIlllIIIlllIIlIl.close();
                              }
                           }

                        }
                     }

                     if (lIIllIllIlIlII(lllllllllllllllIlIlllIIIlllIIlIl)) {
                        if (lIIllIllIlIlII(lllllllllllllllIlIlllIIIllIllIlI)) {
                           label219: {
                              try {
                                 lllllllllllllllIlIlllIIIlllIIlIl.close();
                              } catch (Throwable var21) {
                                 lllllllllllllllIlIlllIIIllIllIlI.addSuppressed(var21);
                                 "".length();
                                 if (" ".length() >= 0) {
                                    break label219;
                                 }

                                 return;
                              }

                              "".length();
                              if (" ".length() < 0) {
                                 return;
                              }
                           }
                        } else {
                           lllllllllllllllIlIlllIIIlllIIlIl.close();
                        }
                     }
                  } catch (IOException var22) {
                     var22.printStackTrace();
                     Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIllIIlIII[lllIllIIlIIl[23]]).append(var22.getMessage())));
                     "".length();
                     if ("   ".length() >= -" ".length()) {
                        break;
                     }

                     return;
                  }

                  "".length();
                  if (" ".length() << " ".length() == 0) {
                     return;
                  }
               }
            }
            break;
         default:
            Command.sendChatMessage(lllIllIIlIII[lllIllIIlIIl[24]]);
         }

      }
   }

   private static String lIIllIllIIlllI(String lllllllllllllllIlIlllIIIlIllIIIl, String lllllllllllllllIlIlllIIIlIlIlIll) {
      lllllllllllllllIlIlllIIIlIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlllIIIlIlIllll = new StringBuilder();
      char[] lllllllllllllllIlIlllIIIlIlIlllI = lllllllllllllllIlIlllIIIlIlIlIll.toCharArray();
      byte lllllllllllllllIlIlllIIIlIlIlIII = lllIllIIlIIl[0];
      float lllllllllllllllIlIlllIIIlIlIIlll = lllllllllllllllIlIlllIIIlIllIIIl.toCharArray();
      double lllllllllllllllIlIlllIIIlIlIIllI = lllllllllllllllIlIlllIIIlIlIIlll.length;
      int lllllllllllllllIlIlllIIIlIlIIlIl = lllIllIIlIIl[0];

      do {
         if (!lIIllIllIlIlIl(lllllllllllllllIlIlllIIIlIlIIlIl, lllllllllllllllIlIlllIIIlIlIIllI)) {
            return String.valueOf(lllllllllllllllIlIlllIIIlIlIllll);
         }

         String lllllllllllllllIlIlllIIIlIlIIlII = lllllllllllllllIlIlllIIIlIlIIlll[lllllllllllllllIlIlllIIIlIlIIlIl];
         lllllllllllllllIlIlllIIIlIlIllll.append((char)(lllllllllllllllIlIlllIIIlIlIIlII ^ lllllllllllllllIlIlllIIIlIlIlllI[lllllllllllllllIlIlllIIIlIlIlIII % lllllllllllllllIlIlllIIIlIlIlllI.length]));
         "".length();
         ++lllllllllllllllIlIlllIIIlIlIlIII;
         ++lllllllllllllllIlIlllIIIlIlIIlIl;
         "".length();
      } while(((158 ^ 131) << " ".length() ^ 117 ^ 74) > 0);

      return null;
   }

   private static void lIIllIllIIllll() {
      lllIllIIlIII = new String[lllIllIIlIIl[26]];
      lllIllIIlIII[lllIllIIlIIl[0]] = lIIllIllIIllII("B/tamRQl20w=", "rwKQh");
      lllIllIIlIII[lllIllIIlIIl[1]] = lIIllIllIIllIl("jZm+mN0u7/w=", "jrogN");
      lllIllIIlIII[lllIllIIlIIl[3]] = lIIllIllIIlllI("GD0iIQkO", "jXNNh");
      lllIllIIlIII[lllIllIIlIIl[2]] = lIIllIllIIlllI("GhQTAw==", "iuefn");
      lllIllIIlIII[lllIllIIlIIl[4]] = lIIllIllIIlllI("EygOBw==", "cIzoV");
      lllIllIIlIII[lllIllIIlIIl[5]] = lIIllIllIIlllI("GiMcLA==", "jBhDL");
      lllIllIIlIII[lllIllIIlIIl[6]] = lIIllIllIIllIl("PLAo/DG+vK0=", "nTTWt");
      lllIllIIlIII[lllIllIIlIIl[7]] = lIIllIllIIlllI("ESIOPQ==", "aCzUL");
      lllIllIIlIII[lllIllIIlIIl[8]] = lIIllIllIIllIl("QwOfxm3DUwA=", "uMlpg");
      lllIllIIlIII[lllIllIIlIIl[9]] = lIIllIllIIlllI("FyUlIQExbTMnAyYoZDYJIT9kLAk6Ky0oRj0+ZDwHIiggbwkmbSkuCCEsKCMfdD4lOQN0LCorRiYoKCAHMG09IBMmbScgCDIkIw==", "TMDOf");
      lllIllIIlIII[lllIllIIlIIl[10]] = lIIllIllIIlllI("ACoQOQojJEMrESo2Di8NOWNFKA4iJwZsEXdjICIMIjAGagU/LA5qESgvDCsHYWMQKxUoYww4Qz0iFyI=", "MCcJc");
      lllIllIIlIII[lllIllIIlIIl[12]] = lIIllIllIIlllI("KzMiDRs9", "YVNbz");
      lllIllIIlIII[lllIllIIlIIl[13]] = lIIllIllIIllIl("AI32PapbWHA=", "MSDSs");
      lllIllIIlIII[lllIllIIlIIl[14]] = lIIllIllIIllIl("si+V/F6w1aU=", "ermeJ");
      lllIllIIlIII[lllIllIIlIIl[15]] = lIIllIllIIllIl("m/P1MmXdHoFQbALTnyaluKMlQMcYxSsW", "UGZOo");
      lllIllIIlIII[lllIllIIlIIl[16]] = lIIllIllIIlllI("CCMgGgIqYj0ZRz0jPxNGbg==", "NBIvg");
      lllIllIIlIII[lllIllIIlIIl[17]] = lIIllIllIIlllI("FhcQGEkyGUQTBigQDRccNBcQGQYoTERWCw==", "Fvdpi");
      lllIllIIlIII[lllIllIIlIIl[18]] = lIIllIllIIllIl("EjyZSHj/qyw=", "JoOBo");
      lllIllIIlIII[lllIllIIlIIl[19]] = lIIllIllIIllII("3YVsST4et/2y9WnNk+yLsnFw7YY61gLs", "fDMKZ");
      lllIllIIlIII[lllIllIIlIIl[20]] = lIIllIllIIllII("VQscp/FCPK7zDjqhlYpK4tYtTumAK1rp", "yfMVS");
      lllIllIIlIII[lllIllIIlIIl[21]] = lIIllIllIIllII("mTblutNBN4i9maPXEIZs75mZbu13GGpHagttIEFVoro=", "iBjMw");
      lllIllIIlIII[lllIllIIlIIl[22]] = lIIllIllIIllIl("qZaM19eJdhs=", "WbmiE");
      lllIllIIlIII[lllIllIIlIIl[23]] = lIIllIllIIlllI("BRsaBT4oUxtJKSMATxk7MhxVSQ==", "FtoiZ");
      lllIllIIlIII[lllIllIIlIIl[24]] = lIIllIllIIllIl("e3V+t0w5kIxOOHQ6leICk3XK3jbrY/TPCya8sa7B2xbfLSZDka8TYXGY/3lwH0vkhQW1HPqITIrtBElE0ED5hQ==", "thhFw");
      lllIllIIlIII[lllIllIIlIIl[25]] = lIIllIllIIllIl("oxxTSfurQd1KUhsiC4m+0DlH1tDsD2Q3", "GryFQ");
   }

   private static boolean lIIllIllIlIlII(Object var0) {
      return var0 != null;
   }

   private static boolean lIIllIllIlIIll(int var0) {
      return var0 == 0;
   }

   private static String lIIllIllIIllIl(String lllllllllllllllIlIlllIIIlIllllll, String lllllllllllllllIlIlllIIIllIIIIII) {
      try {
         Exception lllllllllllllllIlIlllIIIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlllIIIllIIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlllIIIllIIIIll.init(lllIllIIlIIl[3], lllllllllllllllIlIlllIIIlIllllIl);
         return new String(lllllllllllllllIlIlllIIIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIllIlIIIl(Object var0) {
      return var0 == null;
   }

   private static void lIIllIllIlIIII() {
      lllIllIIlIIl = new int[27];
      lllIllIIlIIl[0] = (20 ^ 19) << (" ".length() << " ".length()) & ~((97 ^ 102) << (" ".length() << " ".length()));
      lllIllIIlIIl[1] = " ".length();
      lllIllIIlIIl[2] = "   ".length();
      lllIllIIlIIl[3] = " ".length() << " ".length();
      lllIllIIlIIl[4] = " ".length() << (" ".length() << " ".length());
      lllIllIIlIIl[5] = (79 ^ 94) << "   ".length() ^ 76 + 90 - 71 + 46;
      lllIllIIlIIl[6] = "   ".length() << " ".length();
      lllIllIIlIIl[7] = 70 ^ 65;
      lllIllIIlIIl[8] = " ".length() << "   ".length();
      lllIllIIlIIl[9] = 67 ^ 74;
      lllIllIIlIIl[10] = (118 ^ 1 ^ (172 ^ 149) << " ".length()) << " ".length();
      lllIllIIlIIl[11] = -" ".length();
      lllIllIIlIIl[12] = 117 + 1 - 97 + 144 ^ (14 ^ 89) << " ".length();
      lllIllIIlIIl[13] = "   ".length() << (" ".length() << " ".length());
      lllIllIIlIIl[14] = 142 ^ 131;
      lllIllIIlIIl[15] = (0 ^ 7) << " ".length();
      lllIllIIlIIl[16] = 85 ^ 90;
      lllIllIIlIIl[17] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIllIIlIIl[18] = 135 ^ 150;
      lllIllIIlIIl[19] = (210 ^ 137 ^ (22 ^ 63) << " ".length()) << " ".length();
      lllIllIIlIIl[20] = 68 + 145 - 118 + 96 ^ (29 ^ 54) << (" ".length() << " ".length());
      lllIllIIlIIl[21] = (22 + 107 - -58 + 10 ^ "   ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length());
      lllIllIIlIIl[22] = 114 ^ 103;
      lllIllIIlIIl[23] = (125 ^ 118) << " ".length();
      lllIllIIlIIl[24] = 123 ^ 108;
      lllIllIIlIIl[25] = "   ".length() << "   ".length();
      lllIllIIlIIl[26] = 20 ^ 31 ^ (106 ^ 99) << " ".length();
   }

   static {
      lIIllIllIlIIII();
      lIIllIllIIllll();
   }

   private static boolean lIIllIllIlIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private void reload() {
      SnowMod.getInstance().guiManager = new SnowGUI();
      SnowMod.getInstance().guiManager.initializeGUI();
      SnowMod.loadConfiguration();
      Command.sendChatMessage(lllIllIIlIII[lllIllIIlIIl[25]]);
   }

   private static String lIIllIllIIllII(String lllllllllllllllIlIlllIIIllIIlllI, String lllllllllllllllIlIlllIIIllIIllIl) {
      try {
         short lllllllllllllllIlIlllIIIllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIIllIIllIl.getBytes(StandardCharsets.UTF_8)), lllIllIIlIIl[8]), "DES");
         char lllllllllllllllIlIlllIIIllIIlIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIlllIIIllIIlIIl.init(lllIllIIlIIl[3], lllllllllllllllIlIlllIIIllIIlIlI);
         return new String(lllllllllllllllIlIlllIIIllIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIllIlIIlI(int var0) {
      return var0 != 0;
   }
}
