package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.SyntaxChunk;

public class VanishCommand extends Command {
   // $FF: synthetic field
   private static Entity vehicle;
   // $FF: synthetic field
   private static final String[] lIIIIllllllII;
   // $FF: synthetic field
   private static final int[] lIIIlIIIIIIII;
   // $FF: synthetic field
   Minecraft mc = Minecraft.func_71410_x();

   private static boolean lIlIlllIIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIlllIIlIIIl() {
      lIIIlIIIIIIII = new int[9];
      lIIIlIIIIIIII[0] = (36 ^ 7 ^ (101 ^ 86) << " ".length()) & (231 ^ 174 ^ "   ".length() << (" ".length() << " ".length()) ^ -" ".length());
      lIIIlIIIIIIII[1] = " ".length();
      lIIIlIIIIIIII[2] = " ".length() << " ".length();
      lIIIlIIIIIIII[3] = "   ".length();
      lIIIlIIIIIIII[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIIIIIIII[5] = 120 ^ 125;
      lIIIlIIIIIIII[6] = "   ".length() << " ".length();
      lIIIlIIIIIIII[7] = 248 ^ 137 ^ (59 ^ 0) << " ".length();
      lIIIlIIIIIIII[8] = " ".length() << "   ".length();
   }

   private static String lIlIlllIIIllII(String lllllllllllllllIIlllIllIllIIllII, String lllllllllllllllIIlllIllIllIIlIIl) {
      try {
         SecretKeySpec lllllllllllllllIIlllIllIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double lllllllllllllllIIlllIllIllIIIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIllIllIIIlll.init(lIIIlIIIIIIII[2], lllllllllllllllIIlllIllIllIIllll);
         return new String(lllllllllllllllIIlllIllIllIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIllIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      lIlIlllIIlIIIl();
      lIlIlllIIIllIl();
   }

   private static void lIlIlllIIIllIl() {
      lIIIIllllllII = new String[lIIIlIIIIIIII[7]];
      lIIIIllllllII[lIIIlIIIIIIII[0]] = lIlIlllIIIlIlI("IDAJKzo+", "VQgBI");
      lIIIIllllllII[lIIIlIIIIIIII[1]] = lIlIlllIIIlIll("hksz4h5Uuz9PjXxpvn/gp6C5CiRkMPfF0FhWMe1xaqWM6ulFW2Tryw==", "ENRTI");
      lIIIIllllllII[lIIIlIIIIIIII[2]] = lIlIlllIIIllII("U7sb9nVpCKqz8QoQ46L07w==", "upNPH");
      lIIIIllllllII[lIIIlIIIIIIII[3]] = lIlIlllIIIlIll("I2nm6VedG8w2fDZ94eUD/A==", "EZEVL");
      lIIIIllllllII[lIIIlIIIIIIII[4]] = lIlIlllIIIllII("e7hm93vlpilCkImAdD0qXg==", "MehMp");
      lIIIIllllllII[lIIIlIIIIIIII[5]] = lIlIlllIIIlIlI("ajYgEjs+MDZZ", "JURwZ");
      lIIIIllllllII[lIIIlIIIIIIII[6]] = lIlIlllIIIlIlI("BSJtEBUjJC4qFWU=", "KMMFp");
   }

   private static boolean lIlIlllIIlIIll(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIlllIIlIIlI(Object var0) {
      return var0 != null;
   }

   public VanishCommand() {
      super(lIIIIllllllII[lIIIlIIIIIIII[0]], (SyntaxChunk[])null);
      lllllllllllllllIIlllIllIlllIIlIl.setDescription(lIIIIllllllII[lIIIlIIIIIIII[1]]);
   }

   private static String lIlIlllIIIlIll(String lllllllllllllllIIlllIllIllIlIlll, String lllllllllllllllIIlllIllIllIlIllI) {
      try {
         SecretKeySpec lllllllllllllllIIlllIllIllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIllIllIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIlIIIIIIII[8]), "DES");
         double lllllllllllllllIIlllIllIllIlIlII = Cipher.getInstance("DES");
         lllllllllllllllIIlllIllIllIlIlII.init(lIIIlIIIIIIII[2], lllllllllllllllIIlllIllIllIlllII);
         return new String(lllllllllllllllIIlllIllIllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIllIllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIlIlllIIIlIlI(String lllllllllllllllIIlllIllIlIllIlll, String lllllllllllllllIIlllIllIlIllIllI) {
      lllllllllllllllIIlllIllIlIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIIlllIllIlIllIlIl = new StringBuilder();
      float lllllllllllllllIIlllIllIlIllIlII = lllllllllllllllIIlllIllIlIllIllI.toCharArray();
      long lllllllllllllllIIlllIllIlIllIIll = lIIIlIIIIIIII[0];
      boolean lllllllllllllllIIlllIllIlIllIIlI = lllllllllllllllIIlllIllIlIllIlll.toCharArray();
      float lllllllllllllllIIlllIllIlIllIIIl = lllllllllllllllIIlllIllIlIllIIlI.length;
      int lllllllllllllllIIlllIllIlIllIIII = lIIIlIIIIIIII[0];

      do {
         if (!lIlIlllIIlIlII(lllllllllllllllIIlllIllIlIllIIII, lllllllllllllllIIlllIllIlIllIIIl)) {
            return String.valueOf(lllllllllllllllIIlllIllIlIllIlIl);
         }

         char lllllllllllllllIIlllIllIlIllllIl = lllllllllllllllIIlllIllIlIllIIlI[lllllllllllllllIIlllIllIlIllIIII];
         lllllllllllllllIIlllIllIlIllIlIl.append((char)(lllllllllllllllIIlllIllIlIllllIl ^ lllllllllllllllIIlllIllIlIllIlII[lllllllllllllllIIlllIllIlIllIIll % lllllllllllllllIIlllIllIlIllIlII.length]));
         "".length();
         ++lllllllllllllllIIlllIllIlIllIIll;
         ++lllllllllllllllIIlllIllIlIllIIII;
         "".length();
      } while(-" ".length() <= " ".length() << (" ".length() << " ".length()));

      return null;
   }

   public void call(String[] lllllllllllllllIIlllIllIlllIIIlI) {
      if (lIlIlllIIlIIlI(lllllllllllllllIIlllIllIlllIIIIl.mc.field_71439_g.func_184187_bx()) && lIlIlllIIlIIll(vehicle)) {
         vehicle = lllllllllllllllIIlllIllIlllIIIIl.mc.field_71439_g.func_184187_bx();
         lllllllllllllllIIlllIllIlllIIIIl.mc.field_71439_g.func_184210_p();
         lllllllllllllllIIlllIllIlllIIIIl.mc.field_71441_e.func_73028_b(vehicle.func_145782_y());
         "".length();
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIllllllII[lIIIlIIIIIIII[2]]).append(vehicle.func_70005_c_()).append(lIIIIllllllII[lIIIlIIIIIIII[3]])));
         "".length();
         if ((((24 ^ 1) << " ".length() ^ 34 ^ 15) & ((56 ^ 51) << "   ".length() ^ 12 ^ 75 ^ -" ".length())) > 0) {
            return;
         }
      } else if (lIlIlllIIlIIlI(vehicle)) {
         vehicle.field_70128_L = (boolean)lIIIlIIIIIIII[0];
         lllllllllllllllIIlllIllIlllIIIIl.mc.field_71441_e.func_73027_a(vehicle.func_145782_y(), vehicle);
         lllllllllllllllIIlllIllIlllIIIIl.mc.field_71439_g.func_184205_a(vehicle, (boolean)lIIIlIIIIIIII[1]);
         "".length();
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIllllllII[lIIIlIIIIIIII[4]]).append(vehicle.func_70005_c_()).append(lIIIIllllllII[lIIIlIIIIIIII[5]])));
         vehicle = null;
         "".length();
         if ((("   ".length() << (" ".length() << " ".length()) ^ 130 ^ 177) & (2 ^ 5 ^ (19 ^ 20) << "   ".length() ^ -" ".length())) > " ".length() << " ".length()) {
            return;
         }
      } else {
         Command.sendChatMessage(lIIIIllllllII[lIIIlIIIIIIII[6]]);
      }

   }
}
