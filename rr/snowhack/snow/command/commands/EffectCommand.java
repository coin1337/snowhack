package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;

public class EffectCommand extends Command {
   // $FF: synthetic field
   private static final int[] lIIIIllIIIlII;
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private static final String[] lIIIIllIIIIIl;

   private static String lIlIlIllllIIII(String lllllllllllllllIIlllllIlIlllIllI, String lllllllllllllllIIlllllIlIlllIIll) {
      try {
         short lllllllllllllllIIlllllIlIlllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllIlIlllIIll.getBytes(StandardCharsets.UTF_8)), lIIIIllIIIlII[8]), "DES");
         Cipher lllllllllllllllIIlllllIlIllllIII = Cipher.getInstance("DES");
         lllllllllllllllIIlllllIlIllllIII.init(lIIIIllIIIlII[2], lllllllllllllllIIlllllIlIlllIIlI);
         return new String(lllllllllllllllIIlllllIlIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public EffectCommand() {
      super(lIIIIllIIIIIl[lIIIIllIIIlII[0]], (new ChunkBuilder()).append(lIIIIllIIIIIl[lIIIIllIIIlII[1]]).append(lIIIIllIIIIIl[lIIIIllIIIlII[2]]).append(lIIIIllIIIIIl[lIIIIllIIIlII[3]]).append(lIIIIllIIIIIl[lIIIIllIIIlII[4]]).build());
      lllllllllllllllIIlllllIlllIIIlll.setDescription(lIIIIllIIIIIl[lIIIIllIIIlII[5]]);
   }

   private static boolean lIlIllIIIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIlIlIllllllll();
      lIlIlIllllIlll();
      mc = Minecraft.func_71410_x();
   }

   void addEffect(int lllllllllllllllIIlllllIllIlIllll, int lllllllllllllllIIlllllIllIlIlllI, int lllllllllllllllIIlllllIllIlIllIl) {
      mc.field_71439_g.func_70690_d(new PotionEffect(Potion.func_188412_a(lllllllllllllllIIlllllIllIlIllll), lllllllllllllllIIlllllIllIlIlllI, lllllllllllllllIIlllllIllIlIllIl));
   }

   void removeEffect(int lllllllllllllllIIlllllIllIlIlIlI) {
      mc.field_71439_g.func_184589_d(Potion.func_188412_a(lllllllllllllllIIlllllIllIlIlIlI));
   }

   private static String lIlIlIlllIlllI(String lllllllllllllllIIlllllIllIIllIIl, String lllllllllllllllIIlllllIllIIllIlI) {
      try {
         short lllllllllllllllIIlllllIllIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllIllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIlllllIllIIlllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllllIllIIlllIl.init(lIIIIllIIIlII[2], lllllllllllllllIIlllllIllIIlIlll);
         return new String(lllllllllllllllIIlllllIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIllllIlll() {
      lIIIIllIIIIIl = new String[lIIIIllIIIlII[12]];
      lIIIIllIIIIIl[lIIIIllIIIlII[0]] = lIlIlIlllIlllI("8836x3OAFY4=", "daaAJ");
      lIIIIllIIIIIl[lIIIIllIIIlII[1]] = lIlIlIlllIlllI("YmUOITw+E89+rHI/uA/JNI2OUxzNndev", "NsGSY");
      lIIIIllIIIIIl[lIIIIllIIIlII[2]] = lIlIlIllllIIII("t9rSP7tzK+Y=", "BTQdp");
      lIIIIllIIIIIl[lIIIIllIIIlII[3]] = lIlIlIlllIlllI("WhhdBHcHxrBWiq3duYZrQg==", "pjCPX");
      lIIIIllIIIIIl[lIIIIllIIIlII[4]] = lIlIlIllllIIII("SlT0Dg9gJAs=", "mFexd");
      lIIIIllIIIIIl[lIIIIllIIIlII[5]] = lIlIlIlllIlllI("W9gdalsWi5yhBrXeHEIz/g==", "ecsGB");
      lIIIIllIIIIIl[lIIIIllIIIlII[6]] = lIlIlIlllIlllI("N4OQ47AnR44=", "sfzlq");
      lIIIIllIIIIIl[lIIIIllIIIlII[7]] = lIlIlIllllIIII("EyTUyif3ur/LFUvrCM4la6XB17Zcw523", "IgLAm");
      lIIIIllIIIIIl[lIIIIllIIIlII[8]] = lIlIlIllllIIII("OSwCbTFkKkE=", "ZKNPR");
      lIIIIllIIIIIl[lIIIIllIIIlII[9]] = lIlIlIllllIIIl("Jws+DBMWTTYGBEILNxweBg==", "bmXip");
      lIIIIllIIIIIl[lIIIIllIIIlII[10]] = lIlIlIlllIlllI("3PbX2NSxaEk=", "Ykxkt");
      lIIIIllIIIIIl[lIIIIllIIIlII[11]] = lIlIlIllllIIIl("EyoNMzICbFc3NRJjGTM8GToOeTIaKQokb1ZwAjJvVnAPIyMXOAI5P0hsVzo0ACkHaA==", "vLkVQ");
   }

   void clearEffects() {
      Iterator lllllllllllllllIIlllllIllIlIIlII = mc.field_71439_g.func_70651_bq().iterator();

      do {
         if (!lIlIllIIIIIIII(lllllllllllllllIIlllllIllIlIIlII.hasNext())) {
            return;
         }

         String lllllllllllllllIIlllllIllIlIIIll = (PotionEffect)lllllllllllllllIIlllllIllIlIIlII.next();
         mc.field_71439_g.func_184589_d(lllllllllllllllIIlllllIllIlIIIll.func_188419_a());
         "".length();
      } while(null == null);

   }

   public void call(String[] lllllllllllllllIIlllllIllIllllII) {
      int lllllllllllllllIIlllllIllIlllllI;
      if (lIlIllIIIIIIII(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[0]].equalsIgnoreCase(lIIIIllIIIIIl[lIIIIllIIIlII[6]]))) {
         lllllllllllllllIIlllllIllIlllllI = Integer.parseInt(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[1]]);
         int lllllllllllllllIIlllllIlllIIIIII = Integer.parseInt(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[2]]);
         int lllllllllllllllIIlllllIllIllllll = Integer.parseInt(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[3]]);
         if (lIlIllIIIIIIIl(Potion.func_188412_a(lllllllllllllllIIlllllIllIlllllI))) {
            Command.sendErrorMessage(lIIIIllIIIIIl[lIIIIllIIIlII[7]]);
            return;
         }

         lllllllllllllllIIlllllIllIlllIll.addEffect(lllllllllllllllIIlllllIllIlllllI, lllllllllllllllIIlllllIlllIIIIII, lllllllllllllllIIlllllIllIllllll);
         "".length();
         if (-(58 ^ 63) >= 0) {
            return;
         }
      } else if (lIlIllIIIIIIII(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[0]].equalsIgnoreCase(lIIIIllIIIIIl[lIIIIllIIIlII[8]]))) {
         lllllllllllllllIIlllllIllIlllllI = Integer.parseInt(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[1]]);
         if (lIlIllIIIIIIIl(Potion.func_188412_a(lllllllllllllllIIlllllIllIlllllI))) {
            Command.sendErrorMessage(lIIIIllIIIIIl[lIIIIllIIIlII[9]]);
            return;
         }

         lllllllllllllllIIlllllIllIlllIll.removeEffect(lllllllllllllllIIlllllIllIlllllI);
         "".length();
         if (" ".length() << " ".length() == 0) {
            return;
         }
      } else if (lIlIllIIIIIIII(lllllllllllllllIIlllllIllIllllII[lIIIIllIIIlII[0]].equalsIgnoreCase(lIIIIllIIIIIl[lIIIIllIIIlII[10]]))) {
         lllllllllllllllIIlllllIllIlllIll.clearEffects();
         "".length();
         if ((" ".length() << (142 ^ 139) ^ 30 ^ 59) == 0) {
            return;
         }
      } else {
         Command.sendErrorMessage(lIIIIllIIIIIl[lIIIIllIIIlII[11]]);
      }

   }

   private static void lIlIlIllllllll() {
      lIIIIllIIIlII = new int[13];
      lIIIIllIIIlII[0] = ((161 ^ 180) << (" ".length() << " ".length()) ^ 62 ^ 109) & (2 ^ 113 ^ (108 ^ 113) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIllIIIlII[1] = " ".length();
      lIIIIllIIIlII[2] = " ".length() << " ".length();
      lIIIIllIIIlII[3] = "   ".length();
      lIIIIllIIIlII[4] = " ".length() << (" ".length() << " ".length());
      lIIIIllIIIlII[5] = (23 ^ 4) << " ".length() ^ 20 ^ 55;
      lIIIIllIIIlII[6] = "   ".length() << " ".length();
      lIIIIllIIIlII[7] = " ".length() << "   ".length() ^ 127 ^ 112;
      lIIIIllIIIlII[8] = " ".length() << "   ".length();
      lIIIIllIIIlII[9] = 65 ^ 72;
      lIIIIllIIIlII[10] = ((149 ^ 132) << "   ".length() ^ 0 + 14 - -99 + 28) << " ".length();
      lIIIIllIIIlII[11] = 25 ^ 18;
      lIIIIllIIIlII[12] = "   ".length() << (" ".length() << " ".length());
   }

   private static boolean lIlIllIIIIIIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIllIIIIIIIl(Object var0) {
      return var0 == null;
   }

   private static String lIlIlIllllIIIl(String lllllllllllllllIIlllllIllIIIIllI, String lllllllllllllllIIlllllIllIIIIlIl) {
      lllllllllllllllIIlllllIllIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllllIllIIIlIIl = new StringBuilder();
      short lllllllllllllllIIlllllIllIIIIIll = lllllllllllllllIIlllllIllIIIIlIl.toCharArray();
      int lllllllllllllllIIlllllIllIIIIlll = lIIIIllIIIlII[0];
      byte lllllllllllllllIIlllllIllIIIIIIl = lllllllllllllllIIlllllIllIIIIllI.toCharArray();
      long lllllllllllllllIIlllllIllIIIIIII = lllllllllllllllIIlllllIllIIIIIIl.length;
      int lllllllllllllllIIlllllIlIlllllll = lIIIIllIIIlII[0];

      do {
         if (!lIlIllIIIIIIlI(lllllllllllllllIIlllllIlIlllllll, lllllllllllllllIIlllllIllIIIIIII)) {
            return String.valueOf(lllllllllllllllIIlllllIllIIIlIIl);
         }

         char lllllllllllllllIIlllllIllIIIllII = lllllllllllllllIIlllllIllIIIIIIl[lllllllllllllllIIlllllIlIlllllll];
         lllllllllllllllIIlllllIllIIIlIIl.append((char)(lllllllllllllllIIlllllIllIIIllII ^ lllllllllllllllIIlllllIllIIIIIll[lllllllllllllllIIlllllIllIIIIlll % lllllllllllllllIIlllllIllIIIIIll.length]));
         "".length();
         ++lllllllllllllllIIlllllIllIIIIlll;
         ++lllllllllllllllIIlllllIlIlllllll;
         "".length();
      } while(null == null);

      return null;
   }
}
