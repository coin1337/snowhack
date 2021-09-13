package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.util.math.MathHelper;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Elytra+",
   description = "Modifies elytras to fly at custom velocities and fall speeds",
   category = Module.Category.MOVEMENT
)
public class ElytraPlus extends Module {
   // $FF: synthetic field
   private Setting<Float> downSpeed;
   // $FF: synthetic field
   private Setting<Boolean> defaultSetting;
   // $FF: synthetic field
   private Setting<Float> fallSpeed;
   // $FF: synthetic field
   private Setting<Float> upSpeed;
   // $FF: synthetic field
   private Setting<ElytraPlus.ElytraFlightMode> mode;
   // $FF: synthetic field
   private Setting<Float> fallSpeedHighway;
   // $FF: synthetic field
   private Setting<Float> speed;
   // $FF: synthetic field
   private static final int[] lllIlIIIIIll;
   // $FF: synthetic field
   private static final String[] lllIlIIIIIlI;

   public void onUpdate() {
      if (lIIllIIIIIIllI((Boolean)lllllllllllllllIllIIIIllIIIllIll.defaultSetting.getValue())) {
         lllllllllllllllIllIIIIllIIIllIll.speed.setValue(1.8F);
         "".length();
         lllllllllllllllIllIIIIllIIIllIll.fallSpeedHighway.setValue(5.0000002E-5F);
         "".length();
         lllllllllllllllIllIIIIllIIIllIll.defaultSetting.setValue(Boolean.valueOf((boolean)lllIlIIIIIll[0]));
         "".length();
         Command.sendChatMessage(lllIlIIIIIlI[lllIlIIIIIll[7]]);
      }

      if (lIIllIIIIIIllI(mc.field_71439_g.field_71075_bZ.field_75100_b)) {
         if (lIIllIIIIIIllI(((ElytraPlus.ElytraFlightMode)lllllllllllllllIllIIIIllIIIllIll.mode.getValue()).equals(ElytraPlus.ElytraFlightMode.HIGHWAY))) {
            mc.field_71439_g.func_70016_h(0.0D, 1.0E-4D, 0.0D);
            mc.field_71439_g.func_70107_b(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u - (double)(Float)lllllllllllllllIllIIIIllIIIllIll.fallSpeedHighway.getValue(), mc.field_71439_g.field_70161_v);
            mc.field_71439_g.field_71075_bZ.func_75092_a((Float)lllllllllllllllIllIIIIllIIIllIll.speed.getValue());
            mc.field_71439_g.func_70031_b((boolean)lllIlIIIIIll[0]);
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            mc.field_71439_g.func_70016_h(0.0D, 1.0E-4D, 0.0D);
            mc.field_71439_g.field_71075_bZ.func_75092_a(0.915F);
            mc.field_71439_g.func_70107_b(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u - (double)(Float)lllllllllllllllIllIIIIllIIIllIll.fallSpeed.getValue(), mc.field_71439_g.field_70161_v);
         }
      }

      if (lIIllIIIIIIllI(mc.field_71439_g.field_70122_E)) {
         mc.field_71439_g.field_71075_bZ.field_75101_c = (boolean)lllIlIIIIIll[0];
      }

      if (!lIIllIIIIIIlll(mc.field_71439_g.func_184613_cA())) {
         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$movement$ElytraPlus$ElytraFlightMode[((ElytraPlus.ElytraFlightMode)lllllllllllllllIllIIIIllIIIllIll.mode.getValue()).ordinal()]) {
         case 1:
            if (lIIllIIIIIIllI(mc.field_71439_g.func_70090_H())) {
               mc.func_147114_u().func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_FALL_FLYING));
               return;
            }

            EntityPlayerSP var10000;
            if (lIIllIIIIIIllI(mc.field_71474_y.field_74314_A.func_151470_d())) {
               var10000 = mc.field_71439_g;
               var10000.field_70181_x += (double)(Float)lllllllllllllllIllIIIIllIIIllIll.upSpeed.getValue();
               "".length();
               if ((((239 ^ 146) << " ".length() ^ 33 + 98 - -31 + 15) & ((153 ^ 150) << "   ".length() ^ 92 ^ 111 ^ -" ".length())) != 0) {
                  return;
               }
            } else if (lIIllIIIIIIllI(mc.field_71474_y.field_74311_E.func_151470_d())) {
               var10000 = mc.field_71439_g;
               var10000.field_70181_x -= (double)(Float)lllllllllllllllIllIIIIllIIIllIll.downSpeed.getValue();
            }

            float lllllllllllllllIllIIIIllIIIlllIl;
            if (lIIllIIIIIIllI(mc.field_71474_y.field_74351_w.func_151470_d())) {
               lllllllllllllllIllIIIIllIIIlllIl = (float)Math.toRadians((double)mc.field_71439_g.field_70177_z);
               var10000 = mc.field_71439_g;
               var10000.field_70159_w -= (double)(MathHelper.func_76126_a(lllllllllllllllIllIIIIllIIIlllIl) * 0.05F);
               var10000 = mc.field_71439_g;
               var10000.field_70179_y += (double)(MathHelper.func_76134_b(lllllllllllllllIllIIIIllIIIlllIl) * 0.05F);
               "".length();
               if (((27 ^ 94) & ~(92 ^ 25)) != 0) {
                  return;
               }
            } else if (lIIllIIIIIIllI(mc.field_71474_y.field_74368_y.func_151470_d())) {
               lllllllllllllllIllIIIIllIIIlllIl = (float)Math.toRadians((double)mc.field_71439_g.field_70177_z);
               var10000 = mc.field_71439_g;
               var10000.field_70159_w += (double)(MathHelper.func_76126_a(lllllllllllllllIllIIIIllIIIlllIl) * 0.05F);
               var10000 = mc.field_71439_g;
               var10000.field_70179_y -= (double)(MathHelper.func_76134_b(lllllllllllllllIllIIIIllIIIlllIl) * 0.05F);
               "".length();
               if ("   ".length() < " ".length()) {
                  return;
               }
            }
            break;
         default:
            mc.field_71439_g.field_71075_bZ.func_75092_a(0.915F);
            mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)lllIlIIIIIll[1];
            if (lIIllIIIIIIllI(mc.field_71439_g.field_71075_bZ.field_75098_d)) {
               return;
            }

            mc.field_71439_g.field_71075_bZ.field_75101_c = (boolean)lllIlIIIIIll[1];
         }

      }
   }

   private static boolean lIIllIIIIIIllI(int var0) {
      return var0 != 0;
   }

   private static void lIIllIIIIIIlIl() {
      lllIlIIIIIll = new int[9];
      lllIlIIIIIll[0] = " ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length());
      lllIlIIIIIll[1] = " ".length();
      lllIlIIIIIll[2] = " ".length() << " ".length();
      lllIlIIIIIll[3] = "   ".length();
      lllIlIIIIIll[4] = " ".length() << (" ".length() << " ".length());
      lllIlIIIIIll[5] = 39 ^ 34;
      lllIlIIIIIll[6] = "   ".length() << " ".length();
      lllIlIIIIIll[7] = 69 ^ 66;
      lllIlIIIIIll[8] = " ".length() << "   ".length();
   }

   protected void onDisable() {
      mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)lllIlIIIIIll[0];
      mc.field_71439_g.field_71075_bZ.func_75092_a(0.05F);
      if (!lIIllIIIIIIllI(mc.field_71439_g.field_71075_bZ.field_75098_d)) {
         mc.field_71439_g.field_71075_bZ.field_75101_c = (boolean)lllIlIIIIIll[0];
      }
   }

   private static void lIIllIIIIIIlII() {
      lllIlIIIIIlI = new String[lllIlIIIIIll[8]];
      lllIlIIIIIlI[lllIlIIIIIll[0]] = lIIllIIIIIIIIl("KD0DEQ==", "eRgtw");
      lllIlIIIIIlI[lllIlIIIIIll[1]] = lIIllIIIIIIIlI("6Zz4VxllczTFLrofb36KiQ==", "YjZqF");
      lllIlIIIIIlI[lllIlIIIIIll[2]] = lIIllIIIIIIIll("ZskGjHdYrfWBkIeSkvbyVQ==", "xaPvO");
      lllIlIIIIIlI[lllIlIIIIIll[3]] = lIIllIIIIIIIll("uVRq7ghj57ax5+CEwsDl3w==", "WzCUi");
      lllIlIIIIIlI[lllIlIIIIIll[4]] = lIIllIIIIIIIlI("d2DdW+vM/z83HORF8kZv5A==", "gqKzr");
      lllIlIIIIIlI[lllIlIIIIIll[5]] = lIIllIIIIIIIll("GtDvnTwPLkeLs3jeYWu8SOis4Sn2+V8H", "gVllb");
      lllIlIIIIIlI[lllIlIIIIIll[6]] = lIIllIIIIIIIll("2NxdjuKA2MR2jYH91PYe0g==", "fdYYw");
      lllIlIIIIIlI[lllIlIIIIIll[7]] = lIIllIIIIIIIlI("II6nU06Wn1M/uaxBwv9+h6AsaaKhi3rpeXlS3wy9wPw=", "EpvZQ");
   }

   private static String lIIllIIIIIIIIl(String lllllllllllllllIllIIIIllIIIIlllI, String lllllllllllllllIllIIIIllIIIIlIII) {
      lllllllllllllllIllIIIIllIIIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIllIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIllIIIIllIIIIllII = new StringBuilder();
      char[] lllllllllllllllIllIIIIllIIIIlIll = lllllllllllllllIllIIIIllIIIIlIII.toCharArray();
      byte lllllllllllllllIllIIIIllIIIIIlIl = lllIlIIIIIll[0];
      boolean lllllllllllllllIllIIIIllIIIIIlII = lllllllllllllllIllIIIIllIIIIlllI.toCharArray();
      short lllllllllllllllIllIIIIllIIIIIIll = lllllllllllllllIllIIIIllIIIIIlII.length;
      int lllllllllllllllIllIIIIllIIIIIIlI = lllIlIIIIIll[0];

      do {
         if (!lIIllIIIIIlIII(lllllllllllllllIllIIIIllIIIIIIlI, lllllllllllllllIllIIIIllIIIIIIll)) {
            return String.valueOf(lllllllllllllllIllIIIIllIIIIllII);
         }

         char lllllllllllllllIllIIIIllIIIIllll = lllllllllllllllIllIIIIllIIIIIlII[lllllllllllllllIllIIIIllIIIIIIlI];
         lllllllllllllllIllIIIIllIIIIllII.append((char)(lllllllllllllllIllIIIIllIIIIllll ^ lllllllllllllllIllIIIIllIIIIlIll[lllllllllllllllIllIIIIllIIIIIlIl % lllllllllllllllIllIIIIllIIIIlIll.length]));
         "".length();
         ++lllllllllllllllIllIIIIllIIIIIlIl;
         ++lllllllllllllllIllIIIIllIIIIIIlI;
         "".length();
      } while(" ".length() << " ".length() != 0);

      return null;
   }

   public ElytraPlus() {
      lllllllllllllllIllIIIIllIIlIIIlI.mode = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.e(lllIlIIIIIlI[lllIlIIIIIll[0]], ElytraPlus.ElytraFlightMode.HIGHWAY));
      lllllllllllllllIllIIIIllIIlIIIlI.defaultSetting = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.b(lllIlIIIIIlI[lllIlIIIIIll[1]], (boolean)lllIlIIIIIll[0]));
      lllllllllllllllIllIIIIllIIlIIIlI.speed = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.f(lllIlIIIIIlI[lllIlIIIIIll[2]], 1.8F));
      lllllllllllllllIllIIIIllIIlIIIlI.upSpeed = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.f(lllIlIIIIIlI[lllIlIIIIIll[3]], 0.08F));
      lllllllllllllllIllIIIIllIIlIIIlI.downSpeed = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.f(lllIlIIIIIlI[lllIlIIIIIll[4]], 0.04F));
      lllllllllllllllIllIIIIllIIlIIIlI.fallSpeedHighway = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.f(lllIlIIIIIlI[lllIlIIIIIll[5]], 5.0000002E-5F));
      lllllllllllllllIllIIIIllIIlIIIlI.fallSpeed = lllllllllllllllIllIIIIllIIlIIIlI.register(Settings.f(lllIlIIIIIlI[lllIlIIIIIll[6]], -0.003F));
   }

   private static String lIIllIIIIIIIlI(String lllllllllllllllIllIIIIlIlllllIII, String lllllllllllllllIllIIIIlIllllIlII) {
      try {
         double lllllllllllllllIllIIIIlIllllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlIllllIlII.getBytes(StandardCharsets.UTF_8)), lllIlIIIIIll[8]), "DES");
         Cipher lllllllllllllllIllIIIIlIlllllIll = Cipher.getInstance("DES");
         lllllllllllllllIllIIIIlIlllllIll.init(lllIlIIIIIll[2], lllllllllllllllIllIIIIlIllllIIll);
         return new String(lllllllllllllllIllIIIIlIlllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIIIIIlIII(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllIIIIIIlll(int var0) {
      return var0 == 0;
   }

   static {
      lIIllIIIIIIlIl();
      lIIllIIIIIIlII();
   }

   private static String lIIllIIIIIIIll(String lllllllllllllllIllIIIIlIlllIlIIl, String lllllllllllllllIllIIIIlIlllIIllI) {
      try {
         float lllllllllllllllIllIIIIlIlllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlIlllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIllIIIIlIlllIIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIllIIIIlIlllIIlII.init(lllIlIIIIIll[2], lllllllllllllllIllIIIIlIlllIIlIl);
         return new String(lllllllllllllllIllIIIIlIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static enum ElytraFlightMode {
      // $FF: synthetic field
      HIGHWAY,
      // $FF: synthetic field
      FLY;

      // $FF: synthetic field
      private static final int[] llllllIIIlII;
      // $FF: synthetic field
      private static final String[] llllllIIIIll;
      // $FF: synthetic field
      BOOST;

      static {
         lIlIIlIIlIllll();
         lIlIIlIIlIlllI();
         BOOST = new ElytraPlus.ElytraFlightMode(llllllIIIIll[llllllIIIlII[0]], llllllIIIlII[0]);
         FLY = new ElytraPlus.ElytraFlightMode(llllllIIIIll[llllllIIIlII[1]], llllllIIIlII[1]);
         HIGHWAY = new ElytraPlus.ElytraFlightMode(llllllIIIIll[llllllIIIlII[2]], llllllIIIlII[2]);
         ElytraPlus.ElytraFlightMode[] var10000 = new ElytraPlus.ElytraFlightMode[llllllIIIlII[3]];
         var10000[llllllIIIlII[0]] = BOOST;
         var10000[llllllIIIlII[1]] = FLY;
         var10000[llllllIIIlII[2]] = HIGHWAY;
      }

      private static String lIlIIlIIlIllIl(String lllllllllllllllIlIIlIllllIIIllII, String lllllllllllllllIlIIlIllllIIIIllI) {
         lllllllllllllllIlIIlIllllIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIIlIllllIIIlIlI = new StringBuilder();
         boolean lllllllllllllllIlIIlIllllIIIIlII = lllllllllllllllIlIIlIllllIIIIllI.toCharArray();
         float lllllllllllllllIlIIlIllllIIIIIll = llllllIIIlII[0];
         int lllllllllllllllIlIIlIllllIIIIIlI = lllllllllllllllIlIIlIllllIIIllII.toCharArray();
         float lllllllllllllllIlIIlIllllIIIIIIl = lllllllllllllllIlIIlIllllIIIIIlI.length;
         int lllllllllllllllIlIIlIllllIIIIIII = llllllIIIlII[0];

         do {
            if (!lIlIIlIIllIIII(lllllllllllllllIlIIlIllllIIIIIII, lllllllllllllllIlIIlIllllIIIIIIl)) {
               return String.valueOf(lllllllllllllllIlIIlIllllIIIlIlI);
            }

            char lllllllllllllllIlIIlIllllIIIllIl = lllllllllllllllIlIIlIllllIIIIIlI[lllllllllllllllIlIIlIllllIIIIIII];
            lllllllllllllllIlIIlIllllIIIlIlI.append((char)(lllllllllllllllIlIIlIllllIIIllIl ^ lllllllllllllllIlIIlIllllIIIIlII[lllllllllllllllIlIIlIllllIIIIIll % lllllllllllllllIlIIlIllllIIIIlII.length]));
            "".length();
            ++lllllllllllllllIlIIlIllllIIIIIll;
            ++lllllllllllllllIlIIlIllllIIIIIII;
            "".length();
         } while(-"   ".length() <= 0);

         return null;
      }

      private static void lIlIIlIIlIlllI() {
         llllllIIIIll = new String[llllllIIIlII[3]];
         llllllIIIIll[llllllIIIlII[0]] = lIlIIlIIlIllII("JUExE5a/Bu0=", "LfmOt");
         llllllIIIIll[llllllIIIlII[1]] = lIlIIlIIlIllII("Ipf0nEK/QS4=", "shQtD");
         llllllIIIIll[llllllIIIlII[2]] = lIlIIlIIlIllIl("GxgsDxwSCA==", "SQkGK");
      }

      private static void lIlIIlIIlIllll() {
         llllllIIIlII = new int[5];
         llllllIIIlII[0] = (114 ^ 123) << "   ".length() & ~((60 ^ 53) << "   ".length());
         llllllIIIlII[1] = " ".length();
         llllllIIIlII[2] = " ".length() << " ".length();
         llllllIIIlII[3] = "   ".length();
         llllllIIIlII[4] = " ".length() << "   ".length();
      }

      private static boolean lIlIIlIIllIIII(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIlIIlIIlIllII(String lllllllllllllllIlIIlIlllIlllIlll, String lllllllllllllllIlIIlIlllIlllIlII) {
         try {
            SecretKeySpec lllllllllllllllIlIIlIlllIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIlllIlII.getBytes(StandardCharsets.UTF_8)), llllllIIIlII[4]), "DES");
            Cipher lllllllllllllllIlIIlIlllIllllIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllIllllIIl.init(llllllIIIlII[2], lllllllllllllllIlIIlIlllIllllIlI);
            return new String(lllllllllllllllIlIIlIlllIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIlllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }
}
