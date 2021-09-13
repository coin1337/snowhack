package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;

public class PrefixCommand extends Command {
   // $FF: synthetic field
   private static final String[] lIIIlIllIIllI;
   // $FF: synthetic field
   private static final int[] lIIIlIllIlIII;

   public PrefixCommand() {
      super(lIIIlIllIIllI[lIIIlIllIlIII[0]], (new ChunkBuilder()).append(lIIIlIllIIllI[lIIIlIllIlIII[1]]).build());
      lllllllllllllllIIllIlIIIIllllIIl.setDescription(lIIIlIllIIllI[lIIIlIllIlIII[2]]);
   }

   private static boolean lIllIIlIIllIII(int var0) {
      return var0 != 0;
   }

   private static String lIllIIlIIIlllI(String lllllllllllllllIIllIlIIIIllIllII, String lllllllllllllllIIllIlIIIIllIlIIl) {
      try {
         short lllllllllllllllIIllIlIIIIllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lllllllllllllllIIllIlIIIIllIIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlIIIIllIIlll.init(lIIIlIllIlIII[2], lllllllllllllllIIllIlIIIIllIlIII);
         return new String(lllllllllllllllIIllIlIIIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIllIIlIIlIIll(String lllllllllllllllIIllIlIIIIlIlllII, String lllllllllllllllIIllIlIIIIlIlIllI) {
      lllllllllllllllIIllIlIIIIlIlllII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlIIIIlIllIlI = new StringBuilder();
      boolean lllllllllllllllIIllIlIIIIlIlIlII = lllllllllllllllIIllIlIIIIlIlIllI.toCharArray();
      int lllllllllllllllIIllIlIIIIlIllIII = lIIIlIllIlIII[0];
      char lllllllllllllllIIllIlIIIIlIlIIlI = lllllllllllllllIIllIlIIIIlIlllII.toCharArray();
      int lllllllllllllllIIllIlIIIIlIlIIIl = lllllllllllllllIIllIlIIIIlIlIIlI.length;
      int lllllllllllllllIIllIlIIIIlIlIIII = lIIIlIllIlIII[0];

      do {
         if (!lIllIIlIIllIIl(lllllllllllllllIIllIlIIIIlIlIIII, lllllllllllllllIIllIlIIIIlIlIIIl)) {
            return String.valueOf(lllllllllllllllIIllIlIIIIlIllIlI);
         }

         boolean lllllllllllllllIIllIlIIIIlIIllll = lllllllllllllllIIllIlIIIIlIlIIlI[lllllllllllllllIIllIlIIIIlIlIIII];
         lllllllllllllllIIllIlIIIIlIllIlI.append((char)(lllllllllllllllIIllIlIIIIlIIllll ^ lllllllllllllllIIllIlIIIIlIlIlII[lllllllllllllllIIllIlIIIIlIllIII % lllllllllllllllIIllIlIIIIlIlIlII.length]));
         "".length();
         ++lllllllllllllllIIllIlIIIIlIllIII;
         ++lllllllllllllllIIllIlIIIIlIlIIII;
         "".length();
      } while("   ".length() > 0);

      return null;
   }

   public void call(String[] lllllllllllllllIIllIlIIIIlllIlII) {
      if (lIllIIlIIlIllI(lllllllllllllllIIllIlIIIIlllIlII.length)) {
         Command.sendChatMessage(lIIIlIllIIllI[lIIIlIllIlIII[3]]);
      } else {
         if (lIllIIlIIlIlll(lllllllllllllllIIllIlIIIIlllIlII[lIIIlIllIlIII[0]])) {
            Command.commandPrefix.setValue(lllllllllllllllIIllIlIIIIlllIlII[lIIIlIllIlIII[0]]);
            "".length();
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIllIIllI[lIIIlIllIlIII[4]]).append((String)Command.commandPrefix.getValue())));
            "".length();
            if (null != null) {
               return;
            }
         } else if (lIllIIlIIllIII(lllllllllllllllIIllIlIIIIlllIlII[lIIIlIllIlIII[0]].equals(lIIIlIllIIllI[lIIIlIllIlIII[5]]))) {
            Command.sendChatMessage(lIIIlIllIIllI[lIIIlIllIlIII[6]]);
            "".length();
            if (((168 ^ 153) << " ".length() & ~((51 ^ 2) << " ".length())) != 0) {
               return;
            }
         } else {
            Command.sendChatMessage(lIIIlIllIIllI[lIIIlIllIlIII[7]]);
         }

      }
   }

   private static boolean lIllIIlIIlIllI(int var0) {
      return var0 <= 0;
   }

   private static String lIllIIlIIIllIl(String lllllllllllllllIIllIlIIIIlIIIlll, String lllllllllllllllIIllIlIIIIlIIIllI) {
      try {
         SecretKeySpec lllllllllllllllIIllIlIIIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlIllIlIII[8]), "DES");
         boolean lllllllllllllllIIllIlIIIIlIIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIIllIlIIIIlIIIIlI.init(lIIIlIllIlIII[2], lllllllllllllllIIllIlIIIIlIIlIlI);
         return new String(lllllllllllllllIIllIlIIIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIllIIlIIlIlIl() {
      lIIIlIllIlIII = new int[9];
      lIIIlIllIlIII[0] = " ".length() << " ".length() & ~(" ".length() << " ".length());
      lIIIlIllIlIII[1] = " ".length();
      lIIIlIllIlIII[2] = " ".length() << " ".length();
      lIIIlIllIlIII[3] = "   ".length();
      lIIIlIllIlIII[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIllIlIII[5] = (222 ^ 197) << (" ".length() << " ".length()) ^ 72 ^ 33;
      lIIIlIllIlIII[6] = "   ".length() << " ".length();
      lIIIlIllIlIII[7] = 239 ^ 138 ^ (35 ^ 18) << " ".length();
      lIIIlIllIlIII[8] = " ".length() << "   ".length();
   }

   private static boolean lIllIIlIIlIlll(Object var0) {
      return var0 != null;
   }

   private static void lIllIIlIIlIlII() {
      lIIIlIllIIllI = new String[lIIIlIllIlIII[8]];
      lIIIlIllIIllI[lIIIlIllIlIII[0]] = lIllIIlIIIllIl("LhPQJ/6+Dyg=", "NGqfB");
      lIIIlIllIIllI[lIIIlIllIlIII[1]] = lIllIIlIIIlllI("Vtj6xD8naNO7TBbghwaHVw==", "bnWhr");
      lIIIlIllIIllI[lIIIlIllIlIII[2]] = lIllIIlIIIlllI("HPDWOrlx5mlgiYz70pZPeRdklIcHCpRoaaKGD9TpYf/+vPxSUJ3j0Q==", "LKWEK");
      lIIIlIllIIllI[lIIIlIllIlIII[3]] = lIllIIlIIlIIll("PgcgDDYLSzYdIA0CIxRlD0srCDJOGzcIIwcTZA==", "nkEmE");
      lIIIlIllIIllI[lIIIlIllIlIII[4]] = lIllIIlIIlIIll("ByMJLR4vcR8uA3clA2tRNQ==", "WQlKw");
      lIIIlIllIIllI[lIIIlIllIlIII[5]] = lIllIIlIIIlllI("PfJsRMfSI4E=", "ymNnG");
      lIIIlIllIIllI[lIIIlIllIlIII[6]] = lIllIIlIIlIIll("CCsXPjN3eUcNY20wFnEvIi1FMGE+LBUhLj8tADVhPSsANyg1", "MYeQA");
      lIIIlIllIIllI[lIIIlIllIlIII[7]] = lIllIIlIIlIIll("Ag0wDAU3QSYdEzEIMxRWM0E7CAFyEScIEDsZdA==", "RaUmv");
   }

   static {
      lIllIIlIIlIlIl();
      lIllIIlIIlIlII();
   }

   private static boolean lIllIIlIIllIIl(int var0, int var1) {
      return var0 < var1;
   }
}
