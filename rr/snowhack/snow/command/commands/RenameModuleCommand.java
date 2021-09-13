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

public class RenameModuleCommand extends Command {
   // $FF: synthetic field
   private static final int[] lllIlIIlIlII;
   // $FF: synthetic field
   private static final String[] lllIlIIlIIll;

   private static String lIIllIIIIIllIl(String lllllllllllllllIllIIIIlIIlllIlII, String lllllllllllllllIllIIIIlIIlllIlIl) {
      try {
         SecretKeySpec lllllllllllllllIllIIIIlIIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlIIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIllIIIIlIIllllIII = Cipher.getInstance("Blowfish");
         lllllllllllllllIllIIIIlIIllllIII.init(lllIlIIlIlII[2], lllllllllllllllIllIIIIlIIllllIIl);
         return new String(lllllllllllllllIllIIIIlIIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIIIIlIlIl(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIllIIIIlIIIl();
      lIIllIIIIlIIII();
   }

   private static boolean lIIllIIIIlIlII(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIIllIIIIIllll(String lllllllllllllllIllIIIIlIIlIlIIIl, String lllllllllllllllIllIIIIlIIlIlIIII) {
      try {
         SecretKeySpec lllllllllllllllIllIIIIlIIlIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), lllIlIIlIlII[8]), "DES");
         Cipher lllllllllllllllIllIIIIlIIlIlIIll = Cipher.getInstance("DES");
         lllllllllllllllIllIIIIlIIlIlIIll.init(lllIlIIlIlII[2], lllllllllllllllIllIIIIlIIlIlIlII);
         return new String(lllllllllllllllIllIIIIlIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllIIIIIlllI(String lllllllllllllllIllIIIIlIIllIIllI, String lllllllllllllllIllIIIIlIIllIIlIl) {
      lllllllllllllllIllIIIIlIIllIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIIllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      short lllllllllllllllIllIIIIlIIlIlllll = new StringBuilder();
      char[] lllllllllllllllIllIIIIlIIllIIIll = lllllllllllllllIllIIIIlIIllIIlIl.toCharArray();
      int lllllllllllllllIllIIIIlIIlIlllIl = lllIlIIlIlII[0];
      double lllllllllllllllIllIIIIlIIlIlllII = lllllllllllllllIllIIIIlIIllIIllI.toCharArray();
      String lllllllllllllllIllIIIIlIIlIllIll = lllllllllllllllIllIIIIlIIlIlllII.length;
      int lllllllllllllllIllIIIIlIIlIllIlI = lllIlIIlIlII[0];

      do {
         if (!lIIllIIIIlIlIl(lllllllllllllllIllIIIIlIIlIllIlI, lllllllllllllllIllIIIIlIIlIllIll)) {
            return String.valueOf(lllllllllllllllIllIIIIlIIlIlllll);
         }

         short lllllllllllllllIllIIIIlIIlIllIIl = lllllllllllllllIllIIIIlIIlIlllII[lllllllllllllllIllIIIIlIIlIllIlI];
         lllllllllllllllIllIIIIlIIlIlllll.append((char)(lllllllllllllllIllIIIIlIIlIllIIl ^ lllllllllllllllIllIIIIlIIllIIIll[lllllllllllllllIllIIIIlIIlIlllIl % lllllllllllllllIllIIIIlIIllIIIll.length]));
         "".length();
         ++lllllllllllllllIllIIIIlIIlIlllIl;
         ++lllllllllllllllIllIIIIlIIlIllIlI;
         "".length();
      } while(-" ".length() != " ".length() << " ".length());

      return null;
   }

   public void call(String[] lllllllllllllllIllIIIIlIlIIIIIII) {
      if (lIIllIIIIlIIlI(lllllllllllllllIllIIIIlIlIIIIIII.length)) {
         sendChatMessage(lllIlIIlIIll[lllIlIIlIlII[4]]);
      } else {
         Module lllllllllllllllIllIIIIlIlIIIIIlI = ModuleManager.getModuleByName(lllllllllllllllIllIIIIlIlIIIIIII[lllIlIIlIlII[0]]);
         if (lIIllIIIIlIIll(lllllllllllllllIllIIIIlIlIIIIIlI)) {
            sendChatMessage(String.valueOf((new StringBuilder()).append(lllIlIIlIIll[lllIlIIlIlII[5]]).append(lllllllllllllllIllIIIIlIlIIIIIII[lllIlIIlIlII[0]]).append(lllIlIIlIIll[lllIlIIlIlII[6]])));
         } else {
            String var10000;
            if (lIIllIIIIlIlII(lllllllllllllllIllIIIIlIlIIIIIII.length, lllIlIIlIlII[1])) {
               var10000 = lllllllllllllllIllIIIIlIlIIIIIlI.getOriginalName();
               "".length();
               if (" ".length() <= (((118 ^ 95) << (" ".length() << " ".length()) ^ 8 + 22 - -47 + 94) << (" ".length() << " ".length()) & (((167 ^ 186) << (" ".length() << " ".length()) ^ 42 ^ 81) << (" ".length() << " ".length()) ^ -" ".length()))) {
                  return;
               }
            } else {
               var10000 = lllllllllllllllIllIIIIlIlIIIIIII[lllIlIIlIlII[1]];
            }

            int lllllllllllllllIllIIIIlIIllllllI = var10000;
            if (lIIllIIIIlIIlI(lllllllllllllllIllIIIIlIIllllllI.matches(lllIlIIlIIll[lllIlIIlIlII[7]]))) {
               sendChatMessage(lllIlIIlIIll[lllIlIIlIlII[8]]);
            } else {
               sendChatMessage(String.valueOf((new StringBuilder()).append(lllIlIIlIIll[lllIlIIlIlII[9]]).append(lllllllllllllllIllIIIIlIlIIIIIlI.getName()).append(lllIlIIlIIll[lllIlIIlIlII[10]]).append(lllllllllllllllIllIIIIlIIllllllI)));
               lllllllllllllllIllIIIIlIlIIIIIlI.setName(lllllllllllllllIllIIIIlIIllllllI);
            }
         }
      }
   }

   public RenameModuleCommand() {
      super(lllIlIIlIIll[lllIlIIlIlII[0]], (new ChunkBuilder()).append(lllIlIIlIIll[lllIlIIlIlII[1]], (boolean)lllIlIIlIlII[1], new ModuleParser()).append(lllIlIIlIIll[lllIlIIlIlII[2]]).build());
      lllllllllllllllIllIIIIlIlIIIlIII.setDescription(lllIlIIlIIll[lllIlIIlIlII[3]]);
   }

   private static boolean lIIllIIIIlIIll(Object var0) {
      return var0 == null;
   }

   private static void lIIllIIIIlIIII() {
      lllIlIIlIIll = new String[lllIlIIlIlII[11]];
      lllIlIIlIIll[lllIlIIlIlII[0]] = lIIllIIIIIllIl("MXLQZCw52g6hD8JRClTiaQ==", "fuFMd");
      lllIlIIlIIll[lllIlIIlIlII[1]] = lIIllIIIIIllIl("mbBB+mw5Wlw=", "TrQCH");
      lllIlIIlIIll[lllIlIIlIlII[2]] = lIIllIIIIIlllI("JDMMMg==", "JRaWy");
      lllIlIIlIIll[lllIlIIlIlII[3]] = lIIllIIIIIllll("2jYuqzPWZnLHR+S3xbqOMEhDPVEy6jowxZoGkG2or0Y6sqyg9aE3ig==", "XuiLa");
      lllIlIIlIIll[lllIlIIlIlII[4]] = lIIllIIIIIllll("ikviOlRPLlnntw0eKTnjxcX+rwtU3hm0lh/UwnRXQVA=", "drMMd");
      lllIlIIlIIll[lllIlIIlIlII[5]] = lIIllIIIIIllIl("MQWBvyF2lIIkGGvN2k9fQeUCKnVaWaLH", "ITypZ");
      lllIlIIlIIll[lllIlIIlIlII[6]] = lIIllIIIIIllll("LxdbY9nEUms=", "acJaV");
      lllIlIIlIIll[lllIlIIlIlII[7]] = lIIllIIIIIllll("HzwFck6Q74pDR7oVZU3Prg==", "qENgc");
      lllIlIIlIIll[lllIlIIlIlII[8]] = lIIllIIIIIllIl("ArVveaRO7gjL/r9P3ddk8aZ37/Rhz82z8F6wrC2fG3I=", "TPnKq");
      lllIlIIlIIll[lllIlIIlIlII[9]] = lIIllIIIIIllll("vlkORKkYd9I=", "DZvgM");
      lllIlIIlIIll[lllIlIIlIlII[10]] = lIIllIIIIIlllI("XwJ1FwcXETgABlkEOkVEGw==", "ypUeb");
   }

   private static void lIIllIIIIlIIIl() {
      lllIlIIlIlII = new int[12];
      lllIlIIlIlII[0] = (143 ^ 146) << " ".length() & ~((160 ^ 189) << " ".length());
      lllIlIIlIlII[1] = " ".length();
      lllIlIIlIlII[2] = " ".length() << " ".length();
      lllIlIIlIlII[3] = "   ".length();
      lllIlIIlIlII[4] = " ".length() << (" ".length() << " ".length());
      lllIlIIlIlII[5] = 129 ^ 132;
      lllIlIIlIlII[6] = "   ".length() << " ".length();
      lllIlIIlIlII[7] = (101 ^ 118) << (" ".length() << " ".length()) ^ 38 ^ 109;
      lllIlIIlIlII[8] = " ".length() << "   ".length();
      lllIlIIlIlII[9] = 96 ^ 105;
      lllIlIIlIlII[10] = (16 + 19 - -101 + 7 ^ (67 ^ 6) << " ".length()) << " ".length();
      lllIlIIlIlII[11] = 204 ^ 199;
   }

   private static boolean lIIllIIIIlIIlI(int var0) {
      return var0 == 0;
   }
}
