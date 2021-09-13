package rr.snowhack.snow.command.commands;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityLlama;
import net.minecraft.entity.passive.EntityMule;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.passive.EntityZombieHorse;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.SyntaxChunk;

public class EntityStatsCommand extends Command {
   // $FF: synthetic field
   private static final String[] lllllIIlIIIl;
   // $FF: synthetic field
   private static final int[] lllllIIlIIlI;
   // $FF: synthetic field
   private String maxHealth;
   // $FF: synthetic field
   private String jumpHeight;
   // $FF: synthetic field
   private String speed;
   // $FF: synthetic field
   Minecraft mc = Minecraft.func_71410_x();

   private static boolean lIlIIIlIlIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   public static double round(double lllllllllllllllIlIlIIIIIllllIIlI, int lllllllllllllllIlIlIIIIIlllIlllI) {
      if (lIlIIIlIIlllIl(lllllllllllllllIlIlIIIIIlllIlllI)) {
         throw new IllegalArgumentException();
      } else {
         long lllllllllllllllIlIlIIIIIlllIllIl = BigDecimal.valueOf(lllllllllllllllIlIlIIIIIllllIIlI);
         lllllllllllllllIlIlIIIIIlllIllIl = lllllllllllllllIlIlIIIIIlllIllIl.setScale(lllllllllllllllIlIlIIIIIlllIlllI, RoundingMode.HALF_UP);
         return lllllllllllllllIlIlIIIIIlllIllIl.doubleValue();
      }
   }

   private static void lIlIIIlIIlllII() {
      lllllIIlIIlI = new int[14];
      lllllIIlIIlI[0] = (35 ^ 12) << " ".length() & ~((50 ^ 29) << " ".length());
      lllllIIlIIlI[1] = " ".length();
      lllllIIlIIlI[2] = " ".length() << " ".length();
      lllllIIlIIlI[3] = "   ".length();
      lllllIIlIIlI[4] = " ".length() << (" ".length() << " ".length());
      lllllIIlIIlI[5] = (92 ^ 115) << (" ".length() << " ".length()) ^ 57 + 40 - -6 + 82;
      lllllIIlIIlI[6] = "   ".length() << " ".length();
      lllllIIlIIlI[7] = (38 ^ 35) << " ".length() ^ 180 ^ 185;
      lllllIIlIIlI[8] = " ".length() << "   ".length();
      lllllIIlIIlI[9] = "   ".length() << " ".length() ^ 58 ^ 53;
      lllllIIlIIlI[10] = (20 ^ 17) << " ".length();
      lllllIIlIIlI[11] = 96 ^ 117 ^ (60 ^ 51) << " ".length();
      lllllIIlIIlI[12] = "   ".length() << (" ".length() << " ".length());
      lllllIIlIIlI[13] = (55 ^ 38) << " ".length() ^ 45 ^ 2;
   }

   public void call(String[] lllllllllllllllIlIlIIIIIlllIIlll) {
      if (lIlIIIlIIllllI(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx())) {
         if (lIlIIIlIIlllll(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntityHorse) && lIlIIIlIIlllll(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntityDonkey) && lIlIIIlIIlllll(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntityLlama) && lIlIIIlIIlllll(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntityMule) && lIlIIIlIIlllll(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntitySkeletonHorse) && lIlIIIlIIlllll(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntityZombieHorse) && !lIlIIIlIlIIIII(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof AbstractHorse)) {
            if (lIlIIIlIlIIIII(lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx() instanceof EntityLivingBase)) {
               EntityLivingBase lllllllllllllllIlIlIIIIIlllIlIIl = (EntityLivingBase)lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx();
               lllllllllllllllIlIlIIIIIlllIIllI.maxHealth = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIlIIIIIlllIlIIl.func_110138_aP()).append(lllllIIlIIIl[lllllIIlIIlI[8]]));
               lllllllllllllllIlIlIIIIIlllIIllI.speed = String.valueOf((new StringBuilder()).append(round(43.17D * (double)lllllllllllllllIlIlIIIIIlllIlIIl.func_70689_ay(), lllllIIlIIlI[2])).append(lllllIIlIIIl[lllllIIlIIlI[9]]));
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllllIIlIIIl[lllllIIlIIlI[10]]).append(lllllllllllllllIlIlIIIIIlllIIllI.maxHealth).append(lllllIIlIIIl[lllllIIlIIlI[11]]).append(lllllllllllllllIlIlIIIIIlllIIllI.speed)));
               "".length();
               if ((((11 ^ 42) << " ".length() ^ 56 ^ 79) & (235 ^ 142 ^ (58 ^ 63) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0) {
                  return;
               }
            }
         } else {
            char lllllllllllllllIlIlIIIIIlllIIlIl = (AbstractHorse)lllllllllllllllIlIlIIIIIlllIIllI.mc.field_71439_g.func_184187_bx();
            lllllllllllllllIlIlIIIIIlllIIllI.maxHealth = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIlIIIIIlllIIlIl.func_110138_aP()).append(lllllIIlIIIl[lllllIIlIIlI[2]]));
            lllllllllllllllIlIlIIIIIlllIIllI.speed = String.valueOf((new StringBuilder()).append(round(43.17D * (double)lllllllllllllllIlIlIIIIIlllIIlIl.func_70689_ay(), lllllIIlIIlI[2])).append(lllllIIlIIIl[lllllIIlIIlI[3]]));
            lllllllllllllllIlIlIIIIIlllIIllI.jumpHeight = String.valueOf((new StringBuilder()).append(round(-0.1817584952D * Math.pow(lllllllllllllllIlIlIIIIIlllIIlIl.func_110215_cj(), 3.0D) + 3.689713992D * Math.pow(lllllllllllllllIlIlIIIIIlllIIlIl.func_110215_cj(), 2.0D) + 2.128599134D * lllllllllllllllIlIlIIIIIlllIIlIl.func_110215_cj() - 0.343930367D, lllllIIlIIlI[4])).append(lllllIIlIIIl[lllllIIlIIlI[4]]));
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllllIIlIIIl[lllllIIlIIlI[5]]).append(lllllllllllllllIlIlIIIIIlllIIllI.maxHealth).append(lllllIIlIIIl[lllllIIlIIlI[6]]).append(lllllllllllllllIlIlIIIIIlllIIllI.speed).append(lllllIIlIIIl[lllllIIlIIlI[7]]).append(lllllllllllllllIlIlIIIIIlllIIllI.jumpHeight)));
            "".length();
            if (null != null) {
               return;
            }
         }
      } else {
         Command.sendChatMessage(lllllIIlIIIl[lllllIIlIIlI[12]]);
      }

   }

   private static String lIlIIIlIIllIIl(String lllllllllllllllIlIlIIIIIlIlllIll, String lllllllllllllllIlIlIIIIIlIlllIlI) {
      lllllllllllllllIlIlIIIIIlIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIlIIIIIlIlllIIl = new StringBuilder();
      char[] lllllllllllllllIlIlIIIIIlIllllIl = lllllllllllllllIlIlIIIIIlIlllIlI.toCharArray();
      float lllllllllllllllIlIlIIIIIlIllIlll = lllllIIlIIlI[0];
      char lllllllllllllllIlIlIIIIIlIllIllI = lllllllllllllllIlIlIIIIIlIlllIll.toCharArray();
      char lllllllllllllllIlIlIIIIIlIllIlIl = lllllllllllllllIlIlIIIIIlIllIllI.length;
      int lllllllllllllllIlIlIIIIIlIllIlII = lllllIIlIIlI[0];

      do {
         if (!lIlIIIlIlIIIIl(lllllllllllllllIlIlIIIIIlIllIlII, lllllllllllllllIlIlIIIIIlIllIlIl)) {
            return String.valueOf(lllllllllllllllIlIlIIIIIlIlllIIl);
         }

         char lllllllllllllllIlIlIIIIIllIIIIIl = lllllllllllllllIlIlIIIIIlIllIllI[lllllllllllllllIlIlIIIIIlIllIlII];
         lllllllllllllllIlIlIIIIIlIlllIIl.append((char)(lllllllllllllllIlIlIIIIIllIIIIIl ^ lllllllllllllllIlIlIIIIIlIllllIl[lllllllllllllllIlIlIIIIIlIllIlll % lllllllllllllllIlIlIIIIIlIllllIl.length]));
         "".length();
         ++lllllllllllllllIlIlIIIIIlIllIlll;
         ++lllllllllllllllIlIlIIIIIlIllIlII;
         "".length();
      } while(-"  ".length() < 0);

      return null;
   }

   public EntityStatsCommand() {
      super(lllllIIlIIIl[lllllIIlIIlI[0]], (SyntaxChunk[])null);
      lllllllllllllllIlIlIIIIIllllIlll.setDescription(lllllIIlIIIl[lllllIIlIIlI[1]]);
   }

   private static boolean lIlIIIlIIlllIl(int var0) {
      return var0 < 0;
   }

   private static boolean lIlIIIlIlIIIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIIlIIlllll(int var0) {
      return var0 == 0;
   }

   static {
      lIlIIIlIIlllII();
      lIlIIIlIIllIll();
   }

   private static String lIlIIIlIIllIlI(String lllllllllllllllIlIlIIIIIllIlllIl, String lllllllllllllllIlIlIIIIIllIllIlI) {
      try {
         double lllllllllllllllIlIlIIIIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIIIIIllIlllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIIIIllIlllll.init(lllllIIlIIlI[2], lllllllllllllllIlIlIIIIIllIllIIl);
         return new String(lllllllllllllllIlIlIIIIIllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIlIIllllI(Object var0) {
      return var0 != null;
   }

   private static void lIlIIIlIIllIll() {
      lllllIIlIIIl = new String[lllllIIlIIlI[13]];
      lllllIIlIIIl[lllllIIlIIlI[0]] = lIlIIIlIIllIII("GwnQEohC+6HGtI7+OJQoyg==", "GQoMN");
      lllllIIlIIIl[lllllIIlIIlI[1]] = lIlIIIlIIllIIl("IS43HTdGPi4NZBIvJFg3EiY1C2QJIWEMLANnJBYwDzM4WD0JMmYKIUY1KBwtCCA=", "fGAxD");
      lllllIIlIIIl[lllllIIlIIlI[2]] = lIlIIIlIIllIIl("aeenoWsFIQ==", "IOYMq");
      lllllIIlIIIl[lllllIIlIIlI[3]] = lIlIIIlIIllIlI("uh5YNHR+o2RT9B/ow+Rjjg==", "Uswbu");
      lllllIIlIIIl[lllllIIlIIlI[4]] = lIlIIIlIIllIII("6bcr0u/zVZo=", "YuBBb");
      lllllIIlIIIl[lllllIIlIIlI[5]] = lIlIIIlIIllIIl("56e4VSMNAz8XH0MkIgISEE1c56eNBS4WLkMuBhY6Fw5ZV+enuAE=", "Vcfcw");
      lllllIIlIIIl[lllllIIlIIlI[6]] = lIlIIIlIIllIIl("U+envwQyITw0A1tx56e3Mw==", "YQgaQ");
      lllllIIlIIIl[lllllIIlIIlI[7]] = lIlIIIlIIllIlI("CPf7I4nR3r6rFnH9zNPDKQ==", "yRMOk");
      lllllIIlIIIl[lllllIIlIIlI[8]] = lIlIIIlIIllIII("yxZ9cYOFIMU=", "rcZFF");
      lllllIIlIIIl[lllllIIlIIlI[9]] = lIlIIIlIIllIlI("reNzN62URal1uufwvz37HQ==", "tiILR");
      lllllIIlIIIl[lllllIIlIIlI[10]] = lIlIIIlIIllIlI("I8yW0zvjSWbFpX0KhK4f+6ngjvG2v3s0WkyFTUaD4ODUV01vICQ7og==", "UBgKj");
      lllllIIlIIIl[lllllIIlIIlI[11]] = lIlIIIlIIllIIl("ZOennAwROQsXC3hp56eAEA==", "nroBI");
      lllllIIlIIIl[lllllIIlIIlI[12]] = lIlIIIlIIllIlI("0HOEnHqzciqFPCfOn18kiBsPRFiizTO1YHGdOTc/gNOVkQ2sR0acrDSY0uAlQ4u6", "jCcpo");
   }

   private static String lIlIIIlIIllIII(String lllllllllllllllIlIlIIIIIllIIlllI, String lllllllllllllllIlIlIIIIIllIIllll) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIIIIllIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIllIIllll.getBytes(StandardCharsets.UTF_8)), lllllIIlIIlI[8]), "DES");
         Cipher lllllllllllllllIlIlIIIIIllIlIIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIIIIllIlIIlI.init(lllllIIlIIlI[2], lllllllllllllllIlIlIIIIIllIlIIll);
         return new String(lllllllllllllllIlIlIIIIIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
