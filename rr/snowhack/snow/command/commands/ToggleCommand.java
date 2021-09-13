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
import rr.snowhack.snow.module.ModuleManager;

public class ToggleCommand extends Command {
   // $FF: synthetic field
   private static final String[] lllllIlllllI;
   // $FF: synthetic field
   private static final int[] lllllIllllll;

   private static String lIlIIlIIIllIlI(String lllllllllllllllIlIIllIIIlIllIlll, String lllllllllllllllIlIIllIIIlIllIlII) {
      try {
         char lllllllllllllllIlIIllIIIlIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIllIIIlIlllIIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIllIIIlIlllIIl.init(lllllIllllll[2], lllllllllllllllIlIIllIIIlIllIIll);
         return new String(lllllllllllllllIlIIllIIIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIlIIIlllII(String lllllllllllllllIlIIllIIIlIlIIIlI, String lllllllllllllllIlIIllIIIlIlIIllI) {
      lllllllllllllllIlIIllIIIlIlIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lllllllllllllllIlIIllIIIlIlIIIII = new StringBuilder();
      char[] lllllllllllllllIlIIllIIIlIlIIlII = lllllllllllllllIlIIllIIIlIlIIllI.toCharArray();
      short lllllllllllllllIlIIllIIIlIIllllI = lllllIllllll[0];
      int lllllllllllllllIlIIllIIIlIIlllIl = lllllllllllllllIlIIllIIIlIlIIIlI.toCharArray();
      long lllllllllllllllIlIIllIIIlIIlllII = lllllllllllllllIlIIllIIIlIIlllIl.length;
      int lllllllllllllllIlIIllIIIlIIllIll = lllllIllllll[0];

      do {
         if (!lIlIIlIIlIIIlI(lllllllllllllllIlIIllIIIlIIllIll, lllllllllllllllIlIIllIIIlIIlllII)) {
            return String.valueOf(lllllllllllllllIlIIllIIIlIlIIIII);
         }

         char lllllllllllllllIlIIllIIIlIlIlIII = lllllllllllllllIlIIllIIIlIIlllIl[lllllllllllllllIlIIllIIIlIIllIll];
         lllllllllllllllIlIIllIIIlIlIIIII.append((char)(lllllllllllllllIlIIllIIIlIlIlIII ^ lllllllllllllllIlIIllIIIlIlIIlII[lllllllllllllllIlIIllIIIlIIllllI % lllllllllllllllIlIIllIIIlIlIIlII.length]));
         "".length();
         ++lllllllllllllllIlIIllIIIlIIllllI;
         ++lllllllllllllllIlIIllIIIlIIllIll;
         "".length();
      } while(-(85 ^ 52 ^ 243 ^ 150) < 0);

      return null;
   }

   static {
      lIlIIlIIIllllI();
      lIlIIlIIIlllIl();
   }

   private static void lIlIIlIIIlllIl() {
      lllllIlllllI = new String[lllllIllllll[8]];
      lllllIlllllI[lllllIllllll[0]] = lIlIIlIIIllIlI("T/eR873Ow9g=", "xPGnm");
      lllllIlllllI[lllllIllllll[1]] = lIlIIlIIIllIll("650MSe7z8lo=", "YjACQ");
      lllllIlllllI[lllllIllllll[2]] = lIlIIlIIIlllII("NTkLEAEINUIHBQMrDhZKBWwPHA4RIAdTBQpsAx0ORCMEFQ==", "dLbsj");
      lllllIlllllI[lllllIllllll[3]] = lIlIIlIIIlllII("EgYMIgknShozHyEDDzpaI0oELB43Bgxi", "BjiCz");
      lllllIlllllI[lllllIllllll[4]] = lIlIIlIIIllIll("639rG6RTK4UkTMTp38F3CKDSjagjE/58", "ngCJm");
      lllllIlllllI[lllllIllllll[5]] = lIlIIlIIIlllII("fQ==", "ZhmqK");
      lllllIlllllI[lllllIllllll[6]] = lIlIIlIIIllIll("9nfkZ/U9qXLs2J5dUYf8ew==", "IjOlv");
      lllllIlllllI[lllllIllllll[7]] = lIlIIlIIIlllII("dlIXBxslFRYPFzI=", "Vttcr");
   }

   public void call(String[] lllllllllllllllIlIIllIIIllIIIIlI) {
      if (lIlIIlIIIlllll(lllllllllllllllIlIIllIIIllIIIIlI.length)) {
         Command.sendChatMessage(lllllIlllllI[lllllIllllll[3]]);
      } else {
         double lllllllllllllllIlIIllIIIlIllllll = ModuleManager.getModuleByName(lllllllllllllllIlIIllIIIllIIIIlI[lllllIllllll[0]]);
         if (lIlIIlIIlIIIII(lllllllllllllllIlIIllIIIlIllllll)) {
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllllIlllllI[lllllIllllll[4]]).append(lllllllllllllllIlIIllIIIllIIIIlI[lllllIllllll[0]]).append(lllllIlllllI[lllllIllllll[5]])));
         } else {
            lllllllllllllllIlIIllIIIlIllllll.toggle();
            StringBuilder var10000 = (new StringBuilder()).append(lllllllllllllllIlIIllIIIlIllllll.getName());
            String var10001;
            if (lIlIIlIIlIIIIl(lllllllllllllllIlIIllIIIlIllllll.isEnabled())) {
               var10001 = lllllIlllllI[lllllIllllll[6]];
               "".length();
               if (((47 ^ 22) & ~(151 ^ 174)) < ((16 ^ 113) & ~(105 ^ 8))) {
                  return;
               }
            } else {
               var10001 = lllllIlllllI[lllllIllllll[7]];
            }

            Command.sendChatMessage(String.valueOf(var10000.append(var10001)));
         }
      }
   }

   private static String lIlIIlIIIllIll(String lllllllllllllllIlIIllIIIlIIlIIII, String lllllllllllllllIlIIllIIIlIIIllll) {
      try {
         float lllllllllllllllIlIIllIIIlIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIlIIIllll.getBytes(StandardCharsets.UTF_8)), lllllIllllll[8]), "DES");
         Cipher lllllllllllllllIlIIllIIIlIIlIlII = Cipher.getInstance("DES");
         lllllllllllllllIlIIllIIIlIIlIlII.init(lllllIllllll[2], lllllllllllllllIlIIllIIIlIIIlllI);
         return new String(lllllllllllllllIlIIllIIIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIlIIlIIIII(Object var0) {
      return var0 == null;
   }

   private static void lIlIIlIIIllllI() {
      lllllIllllll = new int[9];
      lllllIllllll[0] = (3 ^ 38) & ~(60 ^ 25);
      lllllIllllll[1] = " ".length();
      lllllIllllll[2] = " ".length() << " ".length();
      lllllIllllll[3] = "   ".length();
      lllllIllllll[4] = " ".length() << (" ".length() << " ".length());
      lllllIllllll[5] = 128 ^ 133;
      lllllIllllll[6] = "   ".length() << " ".length();
      lllllIllllll[7] = 2 ^ 5;
      lllllIllllll[8] = " ".length() << "   ".length();
   }

   private static boolean lIlIIlIIlIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIlIIlIIIIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIlIIIlllll(int var0) {
      return var0 == 0;
   }

   public ToggleCommand() {
      super(lllllIlllllI[lllllIllllll[0]], (new ChunkBuilder()).append(lllllIlllllI[lllllIllllll[1]], (boolean)lllllIllllll[1], new ModuleParser()).build());
      lllllllllllllllIlIIllIIIllIIIllI.setDescription(lllllIlllllI[lllllIllllll[2]]);
   }
}
