package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.SyntaxChunk;
import rr.snowhack.snow.module.ModuleManager;

public class HelpCommand extends Command {
   // $FF: synthetic field
   private static final HelpCommand.Subject[] subjects;
   // $FF: synthetic field
   private static final String[] lIIIlIlIlllII;
   // $FF: synthetic field
   private static final int[] lIIIlIlIllllI;
   // $FF: synthetic field
   private static String subjectsList;

   private static boolean lIllIIIllIlIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIllIIIllIlIlI(int var0) {
      return var0 != 0;
   }

   static {
      lIllIIIllIlIII();
      lIllIIIlIllIIl();
      HelpCommand.Subject[] var10000 = new HelpCommand.Subject[lIIIlIlIllllI[1]];
      int var10002 = lIIIlIlIllllI[0];
      String[] var10005 = new String[lIIIlIlIllllI[6]];
      var10005[lIIIlIlIllllI[0]] = lIIIlIlIlllII[lIIIlIlIllllI[14]];
      var10005[lIIIlIlIllllI[1]] = lIIIlIlIlllII[lIIIlIlIllllI[15]];
      var10005[lIIIlIlIllllI[2]] = lIIIlIlIlllII[lIIIlIlIllllI[16]];
      var10005[lIIIlIlIllllI[4]] = lIIIlIlIlllII[lIIIlIlIllllI[17]];
      var10005[lIIIlIlIllllI[5]] = lIIIlIlIlllII[lIIIlIlIllllI[18]];
      String[] var10006 = new String[lIIIlIlIllllI[3]];
      var10006[lIIIlIlIllllI[0]] = lIIIlIlIlllII[lIIIlIlIllllI[19]];
      var10006[lIIIlIlIllllI[1]] = lIIIlIlIlllII[lIIIlIlIllllI[20]];
      var10006[lIIIlIlIllllI[2]] = lIIIlIlIlllII[lIIIlIlIllllI[21]];
      var10006[lIIIlIlIllllI[4]] = lIIIlIlIlllII[lIIIlIlIllllI[22]];
      var10006[lIIIlIlIllllI[5]] = lIIIlIlIlllII[lIIIlIlIllllI[23]];
      var10006[lIIIlIlIllllI[6]] = lIIIlIlIlllII[lIIIlIlIllllI[24]];
      var10000[var10002] = new HelpCommand.Subject(var10005, var10006);
      subjects = var10000;
      subjectsList = lIIIlIlIlllII[lIIIlIlIllllI[25]];
      String lllllllllllllllIIllIlIllIIIlllll = subjects;
      short lllllllllllllllIIllIlIllIIIlllIl = lllllllllllllllIIllIlIllIIIlllll.length;
      int lllllllllllllllIIllIlIllIIIllIll = lIIIlIlIllllI[0];

      do {
         if (!lIllIIIllIlIll(lllllllllllllllIIllIlIllIIIllIll, lllllllllllllllIIllIlIllIIIlllIl)) {
            subjectsList = subjectsList.substring(lIIIlIlIllllI[0], subjectsList.length() - lIIIlIlIllllI[2]);
            return;
         }

         HelpCommand.Subject lllllllllllllllIIllIlIllIIlIIIIl = lllllllllllllllIIllIlIllIIIlllll[lllllllllllllllIIllIlIllIIIllIll];
         subjectsList = String.valueOf((new StringBuilder()).append(subjectsList).append(lllllllllllllllIIllIlIllIIlIIIIl.names[lIIIlIlIllllI[0]]).append(lIIIlIlIlllII[lIIIlIlIllllI[26]]));
         ++lllllllllllllllIIllIlIllIIIllIll;
         "".length();
      } while(" ".length() << " ".length() > 0);

   }

   private static void lIllIIIlIllIIl() {
      lIIIlIlIlllII = new String[lIIIlIlIllllI[27]];
      lIIIlIlIlllII[lIIIlIlIllllI[0]] = lIllIIIlIlIIll("Q/5iJlwaLjI=", "mEURe");
      lIIIlIlIlllII[lIIIlIlIllllI[1]] = lIllIIIlIlIllI("PhIWJxcfBQluCR8bCm4OFFcZKxMOFhMgQQkCGCQEGQMJYEEvBB9uRxg=", "zwzNa");
      lIIIlIlIlllII[lIIIlIlIllllI[2]] = lIllIIIlIlIIll("rnhxsEgwtLeL09wphe+UDYExrk2mJQrict/vZORC7F0=", "nINMI");
      lIIIlIlIlllII[lIIIlIlIllllI[4]] = lIllIIIlIlIlll("D0hXTg7rq2HnfoJ3JwvXbw==", "rbaIG");
      lIIIlIlIlllII[lIIIlIlIllllI[5]] = lIllIIIlIlIllI("DCIhKQcBKT9iUU85I2QQBig7ZAcDIWwlEA4kICUEAyhsJwkCIC0qAhw=", "oMLDf");
      lIIIlIlIlllII[lIIIlIlIllllI[6]] = lIllIIIlIlIIll("kQVliqhhh7biZnWoUNzYtz02rzUtbGOnLp8Q8NK9kd08XmkUiWVD1g==", "viqIV");
      lIIIlIlIlllII[lIIIlIlIllllI[3]] = lIllIIIlIlIlll("ZAI4e9sBGvWMbMn4Nt8zRQ==", "TWdDQ");
      lIIIlIlIlllII[lIIIlIlIllllI[7]] = lIllIIIlIlIllI("FQYRGgYRPzE=", "Vjxym");
      lIIIlIlIlllII[lIIIlIlIllllI[8]] = lIllIIIlIlIIll("OMtVG1Gk51mDiN6048xHKg==", "eVgnn");
      lIIIlIlIlllII[lIIIlIlIllllI[9]] = lIllIIIlIlIIll("6X5aa8ugyxsfexxtjCqx5v48SfBUNVWLKgCV6V2ypEy2VrDek41GNokUQ8Jl3Ao6", "dHAss");
      lIIIlIlIlllII[lIIIlIlIllllI[10]] = lIllIIIlIlIIll("ZdhhxvEJP5GDhaJ0bQJrOKTWkzY8cZ/Mb1pO/MJbIAw7zxheGogr5e5cbvJRG81h", "SsyoX");
      lIIIlIlIlllII[lIIIlIlIllllI[11]] = lIllIIIlIlIllI("MhYgLSciFzE=", "AcBGB");
      lIIIlIlIlllII[lIIIlIlIllllI[12]] = lIllIIIlIlIlll("/Dvsp8VT23SRxz1rgck5Nw==", "FRxaj");
      lIIIlIlIlllII[lIIIlIlIllllI[13]] = lIllIIIlIlIllI("AD9JLC8iIEkiJTs+DWQsISJJYig=", "NPiDJ");
      lIIIlIlIlllII[lIIIlIlIllllI[14]] = lIllIIIlIlIllI("GhQjNA==", "nmSQQ");
      lIIIlIlIlllII[lIIIlIlIllllI[15]] = lIllIIIlIlIllI("MRQO", "XzzOC");
      lIIIlIlIlllII[lIIIlIlIllllI[16]] = lIllIIIlIlIllI("Cg4LCj8JDw==", "hadfZ");
      lIIIlIlIlllII[lIIIlIlIllllI[17]] = lIllIIIlIlIlll("FtaaLL3hVjo=", "aKEeu");
      lIIIlIlIlllII[lIIIlIlIllllI[18]] = lIllIIIlIlIlll("268e2yuesRQ=", "aMqJl");
      lIIIlIlIlllII[lIIIlIlIllllI[19]] = lIllIIIlIlIllI("NicDHShTPAkLJB80RgcwAHEHTycSPRMKfVMwCAtxBzkHG3EFMAoaNFM4FU8wHyYHFiJTPgBPMFMyAx0lEjgIT3cRJR8fNF1b", "sQfoQ");
      lIIIlIlIlllII[lIIIlIlIllllI[20]] = lIllIIIlIlIIll("09A42dJVhBwFBYyaT4xbFbAZjo6iqNs+KGMGdCNBoOmAB1gxHaYYxu/oQ2yuOVg2hz3TA1z5gx5qbmgxEo8ELt6T8MLxAWg8Hkl96rMjFmP2lh1ovjBESQ==", "QgLzT");
      lIIIlIlIlllII[lIIIlIlIllllI[21]] = lIllIIIlIlIlll("Cwx84oP5gpqDP9OizEzbFcDKC7g+Pfe01yWPne2+2mhACqi5CH2Dpya0EJe3p/Fi/7aY/FBeoeA=", "gaiKz");
      lIIIlIlIlllII[lIIIlIlIllllI[22]] = lIllIIIlIlIllI("RTsDNTUCLUMrYEMYRTcvDjsAK3oUMBExegJ5ATw5CjQENXoTNgw3Lg==", "cYeYZ");
      lIIIlIlIlllII[lIIIlIlIllllI[23]] = lIllIIIlIlIlll("GMbWpRjIIoFgNa6vIvv3SoVg2WBe/cN1nrJiLp6t5HAtRuT/dXWRygxouie5vsuN0b6UOfzaFy/m324OlQJsEg==", "QIPxP");
      lIIIlIlIlllII[lIIIlIlIllllI[24]] = lIllIIIlIlIIll("lRfKUTD4/Wcfhh1I5HLKipyMVIKMpxm733LevFPu9ZzV+HCCHKTR2A==", "jiOdT");
      lIIIlIlIlllII[lIIIlIlIllllI[25]] = lIllIIIlIlIIll("dzDLfoRMnOI=", "KPSym");
      lIIIlIlIlllII[lIIIlIlIllllI[26]] = lIllIIIlIlIlll("AbF8tOy4n2c=", "PWOkJ");
   }

   private static void lIllIIIllIlIII() {
      lIIIlIlIllllI = new int[28];
      lIIIlIlIllllI[0] = "   ".length() << (" ".length() << (" ".length() << " ".length())) & ~("   ".length() << (" ".length() << (" ".length() << " ".length())));
      lIIIlIlIllllI[1] = " ".length();
      lIIIlIlIllllI[2] = " ".length() << " ".length();
      lIIIlIlIllllI[3] = "   ".length() << " ".length();
      lIIIlIlIllllI[4] = "   ".length();
      lIIIlIlIllllI[5] = " ".length() << (" ".length() << " ".length());
      lIIIlIlIllllI[6] = 36 ^ 33;
      lIIIlIlIllllI[7] = 17 + 69 - -47 + 12 ^ (141 ^ 198) << " ".length();
      lIIIlIlIllllI[8] = " ".length() << "   ".length();
      lIIIlIlIllllI[9] = "   ".length() << "   ".length() ^ 170 ^ 187;
      lIIIlIlIllllI[10] = (0 ^ 5) << " ".length();
      lIIIlIlIllllI[11] = 131 ^ 136;
      lIIIlIlIllllI[12] = "   ".length() << (" ".length() << " ".length());
      lIIIlIlIllllI[13] = 147 ^ 148 ^ (141 ^ 136) << " ".length();
      lIIIlIlIllllI[14] = ((229 ^ 180) << " ".length() ^ 35 + 39 - -56 + 35) << " ".length();
      lIIIlIlIllllI[15] = 181 ^ 186;
      lIIIlIlIllllI[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIlIllllI[17] = 74 ^ 91;
      lIIIlIlIllllI[18] = ((16 ^ 59) << (" ".length() << " ".length()) ^ 149 + 103 - 242 + 155) << " ".length();
      lIIIlIlIllllI[19] = 22 ^ 5;
      lIIIlIlIllllI[20] = (208 ^ 159 ^ (68 ^ 97) << " ".length()) << (" ".length() << " ".length());
      lIIIlIlIllllI[21] = 108 + 6 - 100 + 163 ^ (88 ^ 113) << (" ".length() << " ".length());
      lIIIlIlIllllI[22] = ((41 ^ 58) << (" ".length() << " ".length()) ^ 238 ^ 169) << " ".length();
      lIIIlIlIllllI[23] = 9 ^ 30;
      lIIIlIlIllllI[24] = "   ".length() << "   ".length();
      lIIIlIlIllllI[25] = 75 ^ 58 ^ (33 ^ 44) << "   ".length();
      lIIIlIlIllllI[26] = (206 ^ 195) << " ".length();
      lIIIlIlIllllI[27] = (79 ^ 84) << " ".length() ^ 179 ^ 158;
   }

   private static boolean lIllIIIllIlIIl(Object var0) {
      return var0 == null;
   }

   private static String lIllIIIlIlIlll(String lllllllllllllllIIllIlIlIllllIlIl, String lllllllllllllllIIllIlIlIlllIllll) {
      try {
         String lllllllllllllllIIllIlIlIlllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIlllIllll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIllllI[8]), "DES");
         Cipher lllllllllllllllIIllIlIlIlllllIIl = Cipher.getInstance("DES");
         lllllllllllllllIIllIlIlIlllllIIl.init(lIIIlIlIllllI[2], lllllllllllllllIIllIlIlIlllIlllI);
         return new String(lllllllllllllllIIllIlIlIlllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIllIIIlIlIIll(String lllllllllllllllIIllIlIlIlllIIIll, String lllllllllllllllIIllIlIlIlllIIlII) {
      try {
         int lllllllllllllllIIllIlIlIlllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIlllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lllllllllllllllIIllIlIlIllIlllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlIlIllIlllll.init(lIIIlIlIllllI[2], lllllllllllllllIIllIlIlIlllIIIII);
         return new String(lllllllllllllllIIllIlIlIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void call(String[] lllllllllllllllIIllIlIllIlIIlllI) {
      if (lIllIIIllIlIIl(lllllllllllllllIIllIlIllIlIIlllI[lIIIlIlIllllI[0]])) {
         String[] var10000 = new String[lIIIlIlIllllI[3]];
         var10000[lIIIlIlIllllI[0]] = lIIIlIlIlllII[lIIIlIlIllllI[4]];
         var10000[lIIIlIlIllllI[1]] = lIIIlIlIlllII[lIIIlIlIllllI[5]];
         var10000[lIIIlIlIllllI[2]] = lIIIlIlIlllII[lIIIlIlIllllI[6]];
         var10000[lIIIlIlIllllI[4]] = String.valueOf((new StringBuilder()).append(lIIIlIlIlllII[lIIIlIlIllllI[3]]).append(ModuleManager.getModuleByName(lIIIlIlIlllII[lIIIlIlIllllI[7]]).getBindName()).append(lIIIlIlIlllII[lIIIlIlIllllI[8]]));
         var10000[lIIIlIlIllllI[5]] = lIIIlIlIlllII[lIIIlIlIllllI[9]];
         var10000[lIIIlIlIllllI[6]] = lIIIlIlIlllII[lIIIlIlIllllI[10]];
         Command.sendStringChatMessage(var10000);
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else {
         byte lllllllllllllllIIllIlIllIlIIllII = lllllllllllllllIIllIlIllIlIIlllI[lIIIlIlIllllI[0]];
         if (lIllIIIllIlIlI(lllllllllllllllIIllIlIllIlIIllII.equals(lIIIlIlIlllII[lIIIlIlIllllI[11]]))) {
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIlIlllII[lIIIlIlIllllI[12]]).append(subjectsList)));
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
               return;
            }
         } else {
            HelpCommand.Subject lllllllllllllllIIllIlIllIlIlIIIl = (HelpCommand.Subject)Arrays.stream(subjects).filter((lllllllllllllllIIllIlIllIIllllll) -> {
               char lllllllllllllllIIllIlIllIIlllIlI = lllllllllllllllIIllIlIllIIllllll.names;
               long lllllllllllllllIIllIlIllIIlllIII = lllllllllllllllIIllIlIllIIlllIlI.length;
               int lllllllllllllllIIllIlIllIIllIllI = lIIIlIlIllllI[0];

               do {
                  if (!lIllIIIllIlIll(lllllllllllllllIIllIlIllIIllIllI, lllllllllllllllIIllIlIllIIlllIII)) {
                     return (boolean)lIIIlIlIllllI[0];
                  }

                  String lllllllllllllllIIllIlIllIlIIIIll = lllllllllllllllIIllIlIllIIlllIlI[lllllllllllllllIIllIlIllIIllIllI];
                  if (lIllIIIllIlIlI(lllllllllllllllIIllIlIllIlIIIIll.equalsIgnoreCase(lllllllllllllllIIllIlIllIlIIllII))) {
                     return (boolean)lIIIlIlIllllI[1];
                  }

                  ++lllllllllllllllIIllIlIllIIllIllI;
                  "".length();
               } while("   ".length() == "   ".length());

               return (boolean)(((31 ^ 34) << " ".length() ^ 248 ^ 149) << " ".length() & (((67 ^ 70) << " ".length() ^ 34 ^ 63) << " ".length() ^ -" ".length()));
            }).findFirst().orElse((Object)null);
            if (lIllIIIllIlIIl(lllllllllllllllIIllIlIllIlIlIIIl)) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIlIlllII[lIIIlIlIllllI[13]]).append(lllllllllllllllIIllIlIllIlIIlllI[lIIIlIlIllllI[0]])));
               return;
            }

            Command.sendStringChatMessage(lllllllllllllllIIllIlIllIlIlIIIl.info);
         }
      }

   }

   public HelpCommand() {
      super(lIIIlIlIlllII[lIIIlIlIllllI[0]], new SyntaxChunk[lIIIlIlIllllI[0]]);
      lllllllllllllllIIllIlIllIlIlIllI.setDescription(String.valueOf((new StringBuilder()).append(lIIIlIlIlllII[lIIIlIlIllllI[1]]).append(Command.getCommandPrefix()).append(lIIIlIlIlllII[lIIIlIlIllllI[2]])));
   }

   private static String lIllIIIlIlIllI(String lllllllllllllllIIllIlIlIlIlllIll, String lllllllllllllllIIllIlIlIllIIIIll) {
      lllllllllllllllIIllIlIlIlIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlIlIllIIIIIl = new StringBuilder();
      short lllllllllllllllIIllIlIlIlIllIlII = lllllllllllllllIIllIlIlIllIIIIll.toCharArray();
      byte lllllllllllllllIIllIlIlIlIllIIlI = lIIIlIlIllllI[0];
      float lllllllllllllllIIllIlIlIlIllIIII = lllllllllllllllIIllIlIlIlIlllIll.toCharArray();
      String lllllllllllllllIIllIlIlIlIlIllll = lllllllllllllllIIllIlIlIlIllIIII.length;
      int lllllllllllllllIIllIlIlIlIlIlllI = lIIIlIlIllllI[0];

      do {
         if (!lIllIIIllIlIll(lllllllllllllllIIllIlIlIlIlIlllI, lllllllllllllllIIllIlIlIlIlIllll)) {
            return String.valueOf(lllllllllllllllIIllIlIlIllIIIIIl);
         }

         char lllllllllllllllIIllIlIlIllIIIlll = lllllllllllllllIIllIlIlIlIllIIII[lllllllllllllllIIllIlIlIlIlIlllI];
         lllllllllllllllIIllIlIlIllIIIIIl.append((char)(lllllllllllllllIIllIlIlIllIIIlll ^ lllllllllllllllIIllIlIlIlIllIlII[lllllllllllllllIIllIlIlIlIllIIlI % lllllllllllllllIIllIlIlIlIllIlII.length]));
         "".length();
         ++lllllllllllllllIIllIlIlIlIllIIlI;
         ++lllllllllllllllIIllIlIlIlIlIlllI;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > -" ".length());

      return null;
   }

   private static class Subject {
      // $FF: synthetic field
      String[] names;
      // $FF: synthetic field
      String[] info;

      public Subject(String[] lllllllllllllllIllIIIIlIIIIIlIlI, String[] lllllllllllllllIllIIIIlIIIIIllII) {
         lllllllllllllllIllIIIIlIIIIIlIll.names = lllllllllllllllIllIIIIlIIIIIlIlI;
         lllllllllllllllIllIIIIlIIIIIlIll.info = lllllllllllllllIllIIIIlIIIIIllII;
      }
   }
}
