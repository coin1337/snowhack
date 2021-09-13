package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.MathHelper;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.MoveUtil;

@Module.Info(
   name = "Speed",
   category = Module.Category.MOVEMENT
)
public class Speed extends Module {
   // $FF: synthetic field
   private Setting<Float> slipperiness;
   // $FF: synthetic field
   public Setting<Boolean> backToDefault;
   // $FF: synthetic field
   private Setting<Boolean> forwardS;
   // $FF: synthetic field
   private Setting<Float> speed;
   // $FF: synthetic field
   private Setting<Double> inAirBoost;
   // $FF: synthetic field
   public Setting<Boolean> IceSpeed;
   // $FF: synthetic field
   private Setting<Double> customY;
   // $FF: synthetic field
   private static final int[] llllIlIlllll;
   // $FF: synthetic field
   private Setting<Float> groundBoost;
   // $FF: synthetic field
   private Setting<Speed.SpeedMode> mode;
   // $FF: synthetic field
   private static final String[] llllIlIlllII;

   private static boolean lIlIIIIIlIlIIl(int var0) {
      return var0 != 0;
   }

   private void run(double lllllllllllllllIlIlIIllIIlllIlII, float lllllllllllllllIlIlIIllIIllllIIl, double lllllllllllllllIlIlIIllIIllllIII) {
      int var10000;
      if ((!lIlIIIIIlIlIII((Boolean)lllllllllllllllIlIlIIllIIllllIll.forwardS.getValue()) || lIlIIIIIlIlIII(lIlIIIIIlIlIlI(mc.field_71439_g.field_191988_bg, 0.0F))) && !lIlIIIIIlIlIll(lIlIIIIIlIlIlI(mc.field_71439_g.field_191988_bg, 0.0F))) {
         var10000 = llllIlIlllll[0];
      } else {
         var10000 = llllIlIlllll[1];
         "".length();
         if (" ".length() << " ".length() < ((118 ^ 99) & ~(134 ^ 147))) {
            return;
         }
      }

      boolean lllllllllllllllIlIlIIllIIlllIIIl = var10000;
      if (!lIlIIIIIlIlIII(lllllllllllllllIlIlIIllIIlllIIIl) || lIlIIIIIlIlIIl(lIlIIIIIlIlIlI(mc.field_71439_g.field_70702_br, 0.0F))) {
         mc.field_71439_g.func_70031_b((boolean)llllIlIlllll[1]);
         if (lIlIIIIIlIlIIl(mc.field_71439_g.field_70122_E)) {
            mc.field_71439_g.field_70181_x = lllllllllllllllIlIlIIllIIlllIlII;
            String lllllllllllllllIlIlIIllIIllIllll = MoveUtil.getPlayerDirection();
            EntityPlayerSP var13 = mc.field_71439_g;
            var13.field_70159_w -= (double)(MathHelper.func_76126_a(lllllllllllllllIlIlIIllIIllIllll) * lllllllllllllllIlIlIIllIIllllIIl);
            var13 = mc.field_71439_g;
            var13.field_70179_y += (double)(MathHelper.func_76134_b(lllllllllllllllIlIlIIllIIllIllll) * lllllllllllllllIlIlIIllIIllllIIl);
            "".length();
            if (null != null) {
               return;
            }
         } else {
            String lllllllllllllllIlIlIIllIIllIllll = Math.sqrt(mc.field_71439_g.field_70159_w * mc.field_71439_g.field_70159_w + mc.field_71439_g.field_70179_y * mc.field_71439_g.field_70179_y);
            double lllllllllllllllIlIlIIllIIlllllII = (double)MoveUtil.getPlayerDirection();
            mc.field_71439_g.field_70159_w = -Math.sin(lllllllllllllllIlIlIIllIIlllllII) * lllllllllllllllIlIlIIllIIllllIII * lllllllllllllllIlIlIIllIIllIllll;
            mc.field_71439_g.field_70179_y = Math.cos(lllllllllllllllIlIlIIllIIlllllII) * lllllllllllllllIlIlIIllIIllllIII * lllllllllllllllIlIlIIllIIllIllll;
         }
      }

   }

   private static int lIlIIIIIlIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int lIlIIIIIlIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static String lIlIIIIIlIIIlI(String lllllllllllllllIlIlIIllIIIlIllII, String lllllllllllllllIlIlIIllIIIlIlIll) {
      lllllllllllllllIlIlIIllIIIlIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIIllIIIlIlIlI = new StringBuilder();
      char[] lllllllllllllllIlIlIIllIIIlIlIIl = lllllllllllllllIlIlIIllIIIlIlIll.toCharArray();
      char lllllllllllllllIlIlIIllIIIlIIIll = llllIlIlllll[0];
      char lllllllllllllllIlIlIIllIIIlIIIlI = lllllllllllllllIlIlIIllIIIlIllII.toCharArray();
      Exception lllllllllllllllIlIlIIllIIIlIIIIl = lllllllllllllllIlIlIIllIIIlIIIlI.length;
      int lllllllllllllllIlIlIIllIIIlIIIII = llllIlIlllll[0];

      do {
         if (!lIlIIIIIlIllll(lllllllllllllllIlIlIIllIIIlIIIII, lllllllllllllllIlIlIIllIIIlIIIIl)) {
            return String.valueOf(lllllllllllllllIlIlIIllIIIlIlIlI);
         }

         char lllllllllllllllIlIlIIllIIIlIllIl = lllllllllllllllIlIlIIllIIIlIIIlI[lllllllllllllllIlIlIIllIIIlIIIII];
         lllllllllllllllIlIlIIllIIIlIlIlI.append((char)(lllllllllllllllIlIlIIllIIIlIllIl ^ lllllllllllllllIlIlIIllIIIlIlIIl[lllllllllllllllIlIlIIllIIIlIIIll % lllllllllllllllIlIlIIllIIIlIlIIl.length]));
         "".length();
         ++lllllllllllllllIlIlIIllIIIlIIIll;
         ++lllllllllllllllIlIlIIllIIIlIIIII;
         "".length();
      } while(((65 ^ 4) & ~(203 ^ 142)) <= " ".length());

      return null;
   }

   private static void lIlIIIIIlIIllI() {
      llllIlIlllll = new int[12];
      llllIlIlllll[0] = (27 + 118 - -24 + 12 ^ (173 ^ 186) << "   ".length()) & ((26 ^ 11) << " ".length() ^ 81 ^ 126 ^ -" ".length());
      llllIlIlllll[1] = " ".length();
      llllIlIlllll[2] = " ".length() << " ".length();
      llllIlIlllll[3] = "   ".length();
      llllIlIlllll[4] = " ".length() << (" ".length() << " ".length());
      llllIlIlllll[5] = 185 ^ 188;
      llllIlIlllll[6] = "   ".length() << " ".length();
      llllIlIlllll[7] = 50 ^ 53;
      llllIlIlllll[8] = " ".length() << "   ".length();
      llllIlIlllll[9] = -((115 ^ 122) << (" ".length() << (" ".length() << " ".length())) ^ 31 + 29 - 20 + 149);
      llllIlIlllll[10] = 180 ^ 153;
      llllIlIlllll[11] = " ".length() << (109 ^ 106) ^ 103 + 56 - 98 + 76;
   }

   private static boolean lIlIIIIIlIlIll(int var0) {
      return var0 > 0;
   }

   static {
      lIlIIIIIlIIllI();
      lIlIIIIIlIIIll();
   }

   private static void lIlIIIIIlIIIll() {
      llllIlIlllII = new String[llllIlIlllll[11]];
      llllIlIlllII[llllIlIlllll[0]] = lIlIIIIIIllIlI("9ehf7K2IPImJIBumqJPJLQ==", "Wyzuv");
      llllIlIlllII[llllIlIlllll[1]] = lIlIIIIIIllllI("mz0G7JgCcoQDIivfYl8siw==", "RnTNq");
      llllIlIlllII[llllIlIlllll[2]] = lIlIIIIIIllIlI("v7yolCNfY68yeEyQYRZScg==", "TTwUA");
      llllIlIlllII[llllIlIlllll[3]] = lIlIIIIIIllllI("+gsg+enUNkL2+nGQYRsq4g==", "vaTUw");
      llllIlIlllII[llllIlIlllll[4]] = lIlIIIIIIllllI("ehNTcGYnHtkKDnUGj4uRUw==", "JFYjn");
      llllIlIlllII[llllIlIlllll[5]] = lIlIIIIIIllllI("r/C31h4/TuIsDV+jT3G7kQ==", "oAEQs");
      llllIlIlllII[llllIlIlllll[6]] = lIlIIIIIIllllI("YDACy6NFiPMlOntZmz+awg==", "FyTbs");
      llllIlIlllII[llllIlIlllll[7]] = lIlIIIIIlIIIlI("MTIoEQc=", "bBMtc");
      llllIlIlllII[llllIlIlllll[8]] = lIlIIIIIlIIIlI("FQo+Kic9Gw==", "QoXKR");
   }

   private static boolean lIlIIIIIlIllll(int var0, int var1) {
      return var0 < var1;
   }

   public Speed() {
      lllllllllllllllIlIlIIllIlIIIlIlI.forwardS = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.b(llllIlIlllII[llllIlIlllll[0]], (boolean)llllIlIlllll[0]));
      lllllllllllllllIlIlIIllIlIIIlIlI.mode = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.e(llllIlIlllII[llllIlIlllll[1]], Speed.SpeedMode.Strafe));
      lllllllllllllllIlIlIIllIlIIIlIlI.customY = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.d(llllIlIlllII[llllIlIlllll[2]], 0.404D));
      lllllllllllllllIlIlIIllIlIIIlIlI.groundBoost = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.f(llllIlIlllII[llllIlIlllll[3]], 0.12F));
      lllllllllllllllIlIlIIllIlIIIlIlI.inAirBoost = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.d(llllIlIlllII[llllIlIlllll[4]], 1.001D));
      lllllllllllllllIlIlIIllIlIIIlIlI.IceSpeed = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.b(llllIlIlllII[llllIlIlllll[5]], (boolean)llllIlIlllll[0]));
      lllllllllllllllIlIlIIllIlIIIlIlI.slipperiness = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.floatBuilder(llllIlIlllII[llllIlIlllll[6]]).withMinimum(0.2F).withValue((Number)0.4F).withMaximum(1.0F).withVisibility((lllllllllllllllIlIlIIllIIlIIIlIl) -> {
         return (Boolean)lllllllllllllllIlIlIIllIIlIIIllI.IceSpeed.getValue();
      }).build());
      lllllllllllllllIlIlIIllIlIIIlIlI.speed = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.floatBuilder(llllIlIlllII[llllIlIlllll[7]]).withMinimum(0.1F).withValue((Number)0.75F).withMaximum(2.0F).withVisibility((lllllllllllllllIlIlIIllIIlIIlIIl) -> {
         return ((Speed.SpeedMode)lllllllllllllllIlIlIIllIIlIIlIII.mode.getValue()).equals(Speed.SpeedMode.LowHop);
      }).build());
      lllllllllllllllIlIlIIllIlIIIlIlI.backToDefault = lllllllllllllllIlIlIIllIlIIIlIlI.register(Settings.b(llllIlIlllII[llllIlIlllll[8]], (boolean)llllIlIlllll[0]));
   }

   private double getBaseMoveSpeed() {
      float lllllllllllllllIlIlIIllIIlIlIIII = 0.2873D;
      if (lIlIIIIIlIlIIl(mc.field_71439_g.func_70644_a(MobEffects.field_76424_c))) {
         char lllllllllllllllIlIlIIllIIlIIllll = mc.field_71439_g.func_70660_b(MobEffects.field_76424_c).func_76458_c();
         lllllllllllllllIlIlIIllIIlIlIIII *= 1.0D + 0.2D * (double)(lllllllllllllllIlIlIIllIIlIIllll + llllIlIlllll[1]);
      }

      return lllllllllllllllIlIlIIllIIlIlIIII;
   }

   public void onJump(double lllllllllllllllIlIlIIllIIlIlllII, double lllllllllllllllIlIlIIllIIlIllIll, EntityPlayerSP lllllllllllllllIlIlIIllIIlIllllI) {
      if (lIlIIIIIlIlIIl(lllllllllllllllIlIlIIllIIlIlllIl.isEnabled()) && lIlIIIIIlIlIIl(((Speed.SpeedMode)lllllllllllllllIlIlIIllIIlIlllIl.mode.getValue()).equals(Speed.SpeedMode.Strafe))) {
         MovementInput lllllllllllllllIlIlIIllIIllIIlIl = mc.field_71439_g.field_71158_b;
         Exception lllllllllllllllIlIlIIllIIlIllIII = lllllllllllllllIlIlIIllIIllIIlIl.field_192832_b;
         byte lllllllllllllllIlIlIIllIIlIlIlll = lllllllllllllllIlIlIIllIIllIIlIl.field_78902_a;
         short lllllllllllllllIlIlIIllIIlIlIllI = mc.field_71439_g.field_70177_z;
         if (lIlIIIIIlIlIIl(lIlIIIIIlIllII((double)lllllllllllllllIlIlIIllIIlIllIII, 0.0D))) {
            int var10001;
            if (lIlIIIIIlIlIll(lIlIIIIIlIllII((double)lllllllllllllllIlIlIIllIIlIlIlll, 0.0D))) {
               if (lIlIIIIIlIlIll(lIlIIIIIlIllII((double)lllllllllllllllIlIlIIllIIlIllIII, 0.0D))) {
                  var10001 = llllIlIlllll[9];
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) < "   ".length()) {
                     return;
                  }
               } else {
                  var10001 = llllIlIlllll[10];
               }

               lllllllllllllllIlIlIIllIIlIlIllI += (float)var10001;
               "".length();
               if ("   ".length() < "   ".length()) {
                  return;
               }
            } else if (lIlIIIIIlIlllI(lIlIIIIIlIllIl((double)lllllllllllllllIlIlIIllIIlIlIlll, 0.0D))) {
               if (lIlIIIIIlIlIll(lIlIIIIIlIllII((double)lllllllllllllllIlIlIIllIIlIllIII, 0.0D))) {
                  var10001 = llllIlIlllll[10];
                  "".length();
                  if (((140 ^ 151) << " ".length() & ~((75 ^ 80) << " ".length())) != 0) {
                     return;
                  }
               } else {
                  var10001 = llllIlIlllll[9];
               }

               lllllllllllllllIlIlIIllIIlIlIllI += (float)var10001;
            }

            lllllllllllllllIlIlIIllIIlIlIlll = 0.0F;
            if (lIlIIIIIlIlIll(lIlIIIIIlIllII((double)lllllllllllllllIlIlIIllIIlIllIII, 0.0D))) {
               lllllllllllllllIlIlIIllIIlIllIII = 1.0F;
               "".length();
               if (-" ".length() > 0) {
                  return;
               }
            } else if (lIlIIIIIlIlllI(lIlIIIIIlIllIl((double)lllllllllllllllIlIlIIllIIlIllIII, 0.0D))) {
               lllllllllllllllIlIlIIllIIlIllIII = -1.0F;
            }
         }

         if (lIlIIIIIlIlIll(lIlIIIIIlIllII((double)lllllllllllllllIlIlIIllIIlIlIlll, 0.0D))) {
            lllllllllllllllIlIlIIllIIlIlIlll = 1.0F;
            "".length();
            if ((" ".length() << " ".length() & ~(" ".length() << " ".length())) < ((4 ^ 27) & ~(131 ^ 156))) {
               return;
            }
         } else if (lIlIIIIIlIlllI(lIlIIIIIlIllIl((double)lllllllllllllllIlIlIIllIIlIlIlll, 0.0D))) {
            lllllllllllllllIlIlIIllIIlIlIlll = -1.0F;
         }

         lllllllllllllllIlIlIIllIIlIllllI.field_70159_w = lllllllllllllllIlIlIIllIIlIlllII + (double)lllllllllllllllIlIlIIllIIlIllIII * 0.2D * Math.cos(Math.toRadians((double)(lllllllllllllllIlIlIIllIIlIlIllI + 90.0F))) + (double)lllllllllllllllIlIlIIllIIlIlIlll * 0.2D * Math.sin(Math.toRadians((double)(lllllllllllllllIlIlIIllIIlIlIllI + 90.0F)));
         lllllllllllllllIlIlIIllIIlIllllI.field_70179_y = lllllllllllllllIlIlIIllIIlIllIll + ((double)lllllllllllllllIlIlIIllIIlIllIII * 0.2D * Math.sin(Math.toRadians((double)(lllllllllllllllIlIlIIllIIlIlIllI + 90.0F))) - (double)lllllllllllllllIlIlIIllIIlIlIlll * 0.2D * Math.cos(Math.toRadians((double)(lllllllllllllllIlIlIIllIIlIlIllI + 90.0F))));
      }

   }

   private static String lIlIIIIIIllllI(String lllllllllllllllIlIlIIllIIIIlIlll, String lllllllllllllllIlIlIIllIIIIlIllI) {
      try {
         double lllllllllllllllIlIlIIllIIIIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIIIIlIllI.getBytes(StandardCharsets.UTF_8)), llllIlIlllll[8]), "DES");
         Cipher lllllllllllllllIlIlIIllIIIIllIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIllIIIIllIIl.init(llllIlIlllll[2], lllllllllllllllIlIlIIllIIIIlIIll);
         return new String(lllllllllllllllIlIlIIllIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      if (!lIlIIIIIlIlIII(lllllllllllllllIlIlIIllIlIIIlIII.isEnabled())) {
         if (lIlIIIIIlIlIIl((Boolean)lllllllllllllllIlIlIIllIlIIIlIII.backToDefault.getValue())) {
            lllllllllllllllIlIlIIllIlIIIlIII.customY.setValue(0.405D);
            "".length();
            lllllllllllllllIlIlIIllIlIIIlIII.groundBoost.setValue(0.12F);
            "".length();
            lllllllllllllllIlIlIIllIlIIIlIII.inAirBoost.setValue(1.001D);
            "".length();
            lllllllllllllllIlIlIIllIlIIIlIII.speed.setValue(0.75F);
            "".length();
            lllllllllllllllIlIlIIllIlIIIlIII.backToDefault.setValue(Boolean.valueOf((boolean)llllIlIlllll[0]));
            "".length();
         }

         if (lIlIIIIIlIlIIl((Boolean)lllllllllllllllIlIlIIllIlIIIlIII.IceSpeed.getValue())) {
            Blocks.field_150432_aD.field_149765_K = (Float)lllllllllllllllIlIlIIllIlIIIlIII.slipperiness.getValue();
            Blocks.field_150403_cj.field_149765_K = (Float)lllllllllllllllIlIlIIllIlIIIlIII.slipperiness.getValue();
            Blocks.field_185778_de.field_149765_K = (Float)lllllllllllllllIlIlIIllIlIIIlIII.slipperiness.getValue();
         }

         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$movement$Speed$SpeedMode[((Speed.SpeedMode)lllllllllllllllIlIlIIllIlIIIlIII.mode.getValue()).ordinal()]) {
         case 1:
            lllllllllllllllIlIlIIllIlIIIlIII.run(0.405D, 0.2F, 1.0064D);
            "".length();
            if (null != null) {
               return;
            }
            break;
         case 2:
            if ((!lIlIIIIIlIlIII(lIlIIIIIlIIlll(mc.field_71439_g.field_191988_bg, 0.0F)) || lIlIIIIIlIlIIl(lIlIIIIIlIIlll(mc.field_71439_g.field_70702_br, 0.0F))) && lIlIIIIIlIlIII(mc.field_71439_g.func_70093_af()) && lIlIIIIIlIlIIl(mc.field_71439_g.field_70122_E)) {
               mc.field_71439_g.func_70664_aZ();
               EntityPlayerSP var10000 = mc.field_71439_g;
               var10000.field_70159_w *= (double)(Float)lllllllllllllllIlIlIIllIlIIIlIII.speed.getValue();
               var10000 = mc.field_71439_g;
               var10000.field_70181_x *= 0.4D;
               var10000 = mc.field_71439_g;
               var10000.field_70179_y *= (double)(Float)lllllllllllllllIlIlIIllIlIIIlIII.speed.getValue();
               "".length();
               if (null != null) {
                  return;
               }
               break;
            }
         case 3:
            lllllllllllllllIlIlIIllIlIIIlIII.run((Double)lllllllllllllllIlIlIIllIlIIIlIII.customY.getValue(), (Float)lllllllllllllllIlIlIIllIlIIIlIII.groundBoost.getValue(), (Double)lllllllllllllllIlIlIIllIlIIIlIII.inAirBoost.getValue());
         }

      }
   }

   private static boolean lIlIIIIIlIlIII(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIIIIIlIlllI(int var0) {
      return var0 < 0;
   }

   private static int lIlIIIIIlIllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static String lIlIIIIIIllIlI(String lllllllllllllllIlIlIIllIIIlllIlI, String lllllllllllllllIlIlIIllIIIlllIll) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIllIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIIllIIIlllllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIllIIIlllllI.init(llllIlIlllll[2], lllllllllllllllIlIlIIllIIIllllll);
         return new String(lllllllllllllllIlIlIIllIIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void onDisable() {
      if (lIlIIIIIlIlIIl((Boolean)lllllllllllllllIlIlIIllIIlIIllII.IceSpeed.getValue())) {
         Blocks.field_150432_aD.field_149765_K = 0.98F;
         Blocks.field_150403_cj.field_149765_K = 0.98F;
         Blocks.field_185778_de.field_149765_K = 0.98F;
      }

   }

   private static int lIlIIIIIlIIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static enum SpeedMode {
      // $FF: synthetic field
      private static final String[] llllIlIlIllI;
      // $FF: synthetic field
      Custom;

      // $FF: synthetic field
      private static final int[] llllIlIllIII;
      // $FF: synthetic field
      Strafe,
      // $FF: synthetic field
      LowHop;

      private static void lIlIIIIIIlIlll() {
         llllIlIllIII = new int[5];
         llllIlIllIII[0] = (12 ^ 19 ^ "   ".length() << (" ".length() << " ".length())) << " ".length() & ((77 ^ 112 ^ (62 ^ 41) << " ".length()) << " ".length() ^ -" ".length());
         llllIlIllIII[1] = " ".length();
         llllIlIllIII[2] = " ".length() << " ".length();
         llllIlIllIII[3] = "   ".length();
         llllIlIllIII[4] = " ".length() << "   ".length();
      }

      private static void lIlIIIIIIlIIlI() {
         llllIlIlIllI = new String[llllIlIllIII[3]];
         llllIlIlIllI[llllIlIllIII[0]] = lIlIIIIIIlIIII("in3YUKXFNJE=", "xlDHq");
         llllIlIlIllI[llllIlIllIII[1]] = lIlIIIIIIlIIIl("zGD9BgDeuOc=", "OySZb");
         llllIlIlIllI[llllIlIllIII[2]] = lIlIIIIIIlIIII("pEzFkPJRw8E=", "JhZpg");
      }

      static {
         lIlIIIIIIlIlll();
         lIlIIIIIIlIIlI();
         Strafe = new Speed.SpeedMode(llllIlIlIllI[llllIlIllIII[0]], llllIlIllIII[0]);
         LowHop = new Speed.SpeedMode(llllIlIlIllI[llllIlIllIII[1]], llllIlIllIII[1]);
         Custom = new Speed.SpeedMode(llllIlIlIllI[llllIlIllIII[2]], llllIlIllIII[2]);
         Speed.SpeedMode[] var10000 = new Speed.SpeedMode[llllIlIllIII[3]];
         var10000[llllIlIllIII[0]] = Strafe;
         var10000[llllIlIllIII[1]] = LowHop;
         var10000[llllIlIllIII[2]] = Custom;
      }

      private static String lIlIIIIIIlIIIl(String lllllllllllllllIlIlIIllIllIlIIll, String lllllllllllllllIlIlIIllIllIlIIlI) {
         try {
            int lllllllllllllllIlIlIIllIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIllIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIllIllIlIlll.init(llllIlIllIII[2], lllllllllllllllIlIlIIllIllIlIIIl);
            return new String(lllllllllllllllIlIlIIllIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIlIIIIIIlIIII(String lllllllllllllllIlIlIIllIlllIIIII, String lllllllllllllllIlIlIIllIllIlllll) {
         try {
            float lllllllllllllllIlIlIIllIllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIllIlllll.getBytes(StandardCharsets.UTF_8)), llllIlIllIII[4]), "DES");
            Cipher lllllllllllllllIlIlIIllIlllIIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIllIlllIIlII.init(llllIlIllIII[2], lllllllllllllllIlIlIIllIllIllllI);
            return new String(lllllllllllllllIlIlIIllIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }
}
