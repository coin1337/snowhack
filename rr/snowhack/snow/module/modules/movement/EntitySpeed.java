package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.world.chunk.EmptyChunk;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;

@Module.Info(
   name = "EntitySpeed",
   category = Module.Category.MOVEMENT,
   description = "Abuse client-sided movement to shape sound barrier breaking rideables"
)
public class EntitySpeed extends Module {
   // $FF: synthetic field
   private static final String[] lllIlIlIlIII;
   // $FF: synthetic field
   private static final int[] lllIlIlIlIlI;
   // $FF: synthetic field
   private Setting<Boolean> wobble;
   // $FF: synthetic field
   private static Setting<Float> opacity;
   // $FF: synthetic field
   private Setting<Boolean> flight;
   // $FF: synthetic field
   private Setting<Boolean> antiStuck;
   // $FF: synthetic field
   private Setting<Float> speed;

   private boolean isBorderingChunk(Entity lllllllllllllllIlIllllIllIlllIIl, double lllllllllllllllIlIllllIllIllllII, double lllllllllllllllIlIllllIllIllIlll) {
      int var10000;
      if (lIIllIIlllIllI((Boolean)lllllllllllllllIlIllllIllIlllllI.antiStuck.getValue()) && lIIllIIlllIllI(mc.field_71441_e.func_72964_e((int)(lllllllllllllllIlIllllIllIlllIIl.field_70165_t + lllllllllllllllIlIllllIllIllllII) >> lllIlIlIlIlI[10], (int)(lllllllllllllllIlIllllIllIlllIIl.field_70161_v + lllllllllllllllIlIllllIllIllIlll) >> lllIlIlIlIlI[10]) instanceof EmptyChunk)) {
         var10000 = lllIlIlIlIlI[1];
         "".length();
         if (" ".length() <= (((84 ^ 109) << " ".length() ^ 116 ^ 23) & (205 ^ 162 ^ (111 ^ 80) << " ".length() ^ -" ".length()))) {
            return (boolean)(((156 ^ 161) << " ".length() ^ 28 + 82 - 84 + 101) << (" ".length() << " ".length()) & (((41 ^ 62) << " ".length() ^ 90 ^ 113) << (" ".length() << " ".length()) ^ -" ".length()));
         }
      } else {
         var10000 = lllIlIlIlIlI[0];
      }

      return (boolean)var10000;
   }

   private static void lIIllIIlllIIlI() {
      lllIlIlIlIII = new String[lllIlIlIlIlI[11]];
      lllIlIlIlIII[lllIlIlIlIlI[0]] = lIIllIIllIIlII("Uze/pBM4wps=", "bqeOp");
      lllIlIlIlIII[lllIlIlIlIlI[1]] = lIIllIIllIIlll("0VlI2Oe1NP3ljqpEQmmZiQ==", "luZlo");
      lllIlIlIlIII[lllIlIlIlIlI[2]] = lIIllIIlllIIIl("Ay8MHQYx", "ECezn");
      lllIlIlIlIII[lllIlIlIlIlI[3]] = lIIllIIlllIIIl("Jz8vGBsV", "pPMzw");
      lllIlIlIlIII[lllIlIlIlIlI[10]] = lIIllIIllIIlII("NqOKOWmzjv9S85s8i5SI7w==", "ZJrXe");
   }

   public EntitySpeed() {
      lllllllllllllllIlIlllllIIIIllIll.speed = lllllllllllllllIlIlllllIIIIllIll.register(Settings.f(lllIlIlIlIII[lllIlIlIlIlI[0]], 1.0F));
      lllllllllllllllIlIlllllIIIIllIll.antiStuck = lllllllllllllllIlIlllllIIIIllIll.register(Settings.b(lllIlIlIlIII[lllIlIlIlIlI[1]]));
      lllllllllllllllIlIlllllIIIIllIll.flight = lllllllllllllllIlIlllllIIIIllIll.register(Settings.b(lllIlIlIlIII[lllIlIlIlIlI[2]], (boolean)lllIlIlIlIlI[0]));
      lllllllllllllllIlIlllllIIIIllIll.wobble = lllllllllllllllIlIlllllIIIIllIll.register(Settings.booleanBuilder(lllIlIlIlIII[lllIlIlIlIlI[3]]).withValue(Boolean.valueOf((boolean)lllIlIlIlIlI[1])).withVisibility((lllllllllllllllIlIllllIllIllIlII) -> {
         return (Boolean)lllllllllllllllIlIllllIllIllIIll.flight.getValue();
      }).build());
      lllllllllllllllIlIlllllIIIIllIll.register(opacity);
      "".length();
   }

   public static float getOpacity() {
      return (Float)opacity.getValue();
   }

   private static String lIIllIIlllIIIl(String lllllllllllllllIlIllllIllIIlIllI, String lllllllllllllllIlIllllIllIIllIlI) {
      lllllllllllllllIlIllllIllIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIllllIllIIllIIl = new StringBuilder();
      double lllllllllllllllIlIllllIllIIlIIll = lllllllllllllllIlIllllIllIIllIlI.toCharArray();
      int lllllllllllllllIlIllllIllIIlIlll = lllIlIlIlIlI[0];
      long lllllllllllllllIlIllllIllIIlIIIl = lllllllllllllllIlIllllIllIIlIllI.toCharArray();
      float lllllllllllllllIlIllllIllIIlIIII = lllllllllllllllIlIllllIllIIlIIIl.length;
      int lllllllllllllllIlIllllIllIIIllll = lllIlIlIlIlI[0];

      do {
         if (!lIIllIIlllllIl(lllllllllllllllIlIllllIllIIIllll, lllllllllllllllIlIllllIllIIlIIII)) {
            return String.valueOf(lllllllllllllllIlIllllIllIIllIIl);
         }

         char lllllllllllllllIlIllllIllIIlllII = lllllllllllllllIlIllllIllIIlIIIl[lllllllllllllllIlIllllIllIIIllll];
         lllllllllllllllIlIllllIllIIllIIl.append((char)(lllllllllllllllIlIllllIllIIlllII ^ lllllllllllllllIlIllllIllIIlIIll[lllllllllllllllIlIllllIllIIlIlll % lllllllllllllllIlIllllIllIIlIIll.length]));
         "".length();
         ++lllllllllllllllIlIllllIllIIlIlll;
         ++lllllllllllllllIlIllllIllIIIllll;
         "".length();
      } while(" ".length() << " ".length() <= " ".length() << " ".length());

      return null;
   }

   private void steerBoat(EntityBoat lllllllllllllllIlIlllllIIIIIIIll) {
      if (!lIIllIIlllIlll(lllllllllllllllIlIlllllIIIIIIIll)) {
         long lllllllllllllllIlIllllIllllllIIl = mc.field_71474_y.field_74351_w.func_151470_d();
         boolean lllllllllllllllIlIllllIllllllIII = mc.field_71474_y.field_74370_x.func_151470_d();
         long lllllllllllllllIlIllllIlllllIlll = mc.field_71474_y.field_74366_z.func_151470_d();
         boolean lllllllllllllllIlIllllIllllllllI = mc.field_71474_y.field_74368_y.func_151470_d();
         if (!lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIIl) || lIIllIIlllIlIl(lllllllllllllllIlIllllIllllllllI)) {
            lllllllllllllllIlIlllllIIIIIIIll.field_70181_x = 0.0D;
         }

         if (lIIllIIlllIllI(mc.field_71474_y.field_74314_A.func_151470_d())) {
            lllllllllllllllIlIlllllIIIIIIIll.field_70181_x += (double)((Float)lllllllllllllllIlIlllllIIIIIIlII.speed.getValue() / 2.0F);
         }

         if (!lIIllIIlllIlIl(lllllllllllllllIlIllllIllllllIIl) || !lIIllIIlllIlIl(lllllllllllllllIlIllllIllllllIII) || !lIIllIIlllIlIl(lllllllllllllllIlIllllIlllllIlll) || !lIIllIIlllIlIl(lllllllllllllllIlIllllIllllllllI)) {
            int var10000;
            int lllllllllllllllIlIllllIllllllIlI;
            if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIII) && lIIllIIlllIllI(lllllllllllllllIlIllllIlllllIlll)) {
               if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIIl)) {
                  var10000 = lllIlIlIlIlI[0];
                  "".length();
                  if (" ".length() <= 0) {
                     return;
                  }
               } else if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllllI)) {
                  var10000 = lllIlIlIlIlI[4];
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var10000 = lllIlIlIlIlI[5];
               }

               lllllllllllllllIlIllllIllllllIlI = var10000;
               "".length();
               if (" ".length() < " ".length()) {
                  return;
               }
            } else if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIIl) && lIIllIIlllIllI(lllllllllllllllIlIllllIllllllllI)) {
               if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIII)) {
                  var10000 = lllIlIlIlIlI[6];
                  "".length();
                  if (" ".length() < " ".length()) {
                     return;
                  }
               } else if (lIIllIIlllIllI(lllllllllllllllIlIllllIlllllIlll)) {
                  var10000 = lllIlIlIlIlI[7];
                  "".length();
                  if (" ".length() > "   ".length()) {
                     return;
                  }
               } else {
                  var10000 = lllIlIlIlIlI[5];
               }

               lllllllllllllllIlIllllIllllllIlI = var10000;
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIII)) {
                  var10000 = lllIlIlIlIlI[6];
                  "".length();
                  if (-" ".length() == "   ".length()) {
                     return;
                  }
               } else if (lIIllIIlllIllI(lllllllllllllllIlIllllIlllllIlll)) {
                  var10000 = lllIlIlIlIlI[7];
                  "".length();
                  if (-" ".length() == "   ".length()) {
                     return;
                  }
               } else {
                  var10000 = lllIlIlIlIlI[0];
               }

               lllllllllllllllIlIllllIllllllIlI = var10000;
               if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllIIl)) {
                  lllllllllllllllIlIllllIllllllIlI /= lllIlIlIlIlI[2];
                  "".length();
                  if ((((40 ^ 27) << " ".length() ^ 215 ^ 180) << "   ".length() & (((115 ^ 122) << "   ".length() ^ 38 ^ 107) << "   ".length() ^ -" ".length())) != 0) {
                     return;
                  }
               } else if (lIIllIIlllIllI(lllllllllllllllIlIllllIllllllllI)) {
                  lllllllllllllllIlIllllIllllllIlI = lllIlIlIlIlI[4] - lllllllllllllllIlIllllIllllllIlI / lllIlIlIlIlI[2];
               }
            }

            if (!lIIllIIllllIII(lllllllllllllllIlIllllIllllllIlI, lllIlIlIlIlI[5])) {
               float lllllllllllllllIlIllllIlllllllIl = mc.field_71439_g.field_70177_z + (float)lllllllllllllllIlIllllIllllllIlI;
               lllllllllllllllIlIlllllIIIIIIIll.field_70159_w = EntityUtil.getRelativeX(lllllllllllllllIlIllllIlllllllIl) * (double)(Float)lllllllllllllllIlIlllllIIIIIIlII.speed.getValue();
               lllllllllllllllIlIlllllIIIIIIIll.field_70179_y = EntityUtil.getRelativeZ(lllllllllllllllIlIllllIlllllllIl) * (double)(Float)lllllllllllllllIlIlllllIIIIIIlII.speed.getValue();
            }
         }
      }
   }

   private void moveForward(Entity lllllllllllllllIlIllllIlllIlIllI, double lllllllllllllllIlIllllIlllIlIlIl) {
      if (lIIllIIlllIlII(lllllllllllllllIlIllllIlllIlIllI)) {
         short lllllllllllllllIlIllllIlllIlIlII = mc.field_71439_g.field_71158_b;
         long lllllllllllllllIlIllllIlllIlIIll = (double)lllllllllllllllIlIllllIlllIlIlII.field_192832_b;
         float lllllllllllllllIlIllllIlllIlIIlI = (double)lllllllllllllllIlIllllIlllIlIlII.field_78902_a;
         int var10000;
         if (lIIllIIlllIllI(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIll, 0.0D))) {
            var10000 = lllIlIlIlIlI[1];
            "".length();
            if (((132 ^ 129) << "   ".length() & ~((90 ^ 95) << "   ".length())) != 0) {
               return;
            }
         } else {
            var10000 = lllIlIlIlIlI[0];
         }

         boolean lllllllllllllllIlIllllIlllIlllIl = var10000;
         if (lIIllIIlllIllI(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIlI, 0.0D))) {
            var10000 = lllIlIlIlIlI[1];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10000 = lllIlIlIlIlI[0];
         }

         float lllllllllllllllIlIllllIlllIlIIII = var10000;
         Exception lllllllllllllllIlIllllIlllIIllll = mc.field_71439_g.field_70177_z;
         if (lIIllIIlllIlIl(lllllllllllllllIlIllllIlllIlllIl) && lIIllIIlllIlIl(lllllllllllllllIlIllllIlllIlIIII)) {
            lllllllllllllllIlIllllIlllIlIlll.setEntitySpeed(lllllllllllllllIlIllllIlllIlIllI, 0.0D, 0.0D);
            "".length();
            if (((53 ^ 22 ^ (75 ^ 70) << "   ".length()) & (178 ^ 141 ^ (181 ^ 168) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
               return;
            }
         } else {
            if (lIIllIIlllIllI(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIll, 0.0D))) {
               int var10001;
               if (lIIllIIllllIll(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIlI, 0.0D))) {
                  if (lIIllIIllllIll(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIll, 0.0D))) {
                     var10001 = lllIlIlIlIlI[8];
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     var10001 = lllIlIlIlIlI[9];
                  }

                  lllllllllllllllIlIllllIlllIIllll += (float)var10001;
                  "".length();
                  if (((7 ^ 56) & ~(86 ^ 105)) >= " ".length()) {
                     return;
                  }
               } else if (lIIllIIlllllII(lIIllIIllllIlI(lllllllllllllllIlIllllIlllIlIIlI, 0.0D))) {
                  if (lIIllIIllllIll(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIll, 0.0D))) {
                     var10001 = lllIlIlIlIlI[9];
                     "".length();
                     if ("   ".length() == 0) {
                        return;
                     }
                  } else {
                     var10001 = lllIlIlIlIlI[8];
                  }

                  lllllllllllllllIlIllllIlllIIllll += (float)var10001;
               }

               lllllllllllllllIlIllllIlllIlIIlI = 0.0D;
               if (lIIllIIllllIll(lIIllIIllllIIl(lllllllllllllllIlIllllIlllIlIIll, 0.0D))) {
                  lllllllllllllllIlIllllIlllIlIIll = 1.0D;
                  "".length();
                  if (-"  ".length() >= 0) {
                     return;
                  }
               } else {
                  lllllllllllllllIlIllllIlllIlIIll = -1.0D;
               }
            }

            double lllllllllllllllIlIllllIllllIIIlI = lllllllllllllllIlIllllIlllIlIIll * lllllllllllllllIlIllllIlllIlIlIl * Math.cos(Math.toRadians((double)(lllllllllllllllIlIllllIlllIIllll + 90.0F))) + lllllllllllllllIlIllllIlllIlIIlI * lllllllllllllllIlIllllIlllIlIlIl * Math.sin(Math.toRadians((double)(lllllllllllllllIlIllllIlllIIllll + 90.0F)));
            double lllllllllllllllIlIllllIllllIIIIl = lllllllllllllllIlIllllIlllIlIIll * lllllllllllllllIlIllllIlllIlIlIl * Math.sin(Math.toRadians((double)(lllllllllllllllIlIllllIlllIIllll + 90.0F))) - lllllllllllllllIlIllllIlllIlIIlI * lllllllllllllllIlIllllIlllIlIlIl * Math.cos(Math.toRadians((double)(lllllllllllllllIlIllllIlllIIllll + 90.0F)));
            if (lIIllIIlllIllI(lllllllllllllllIlIllllIlllIlIlll.isBorderingChunk(lllllllllllllllIlIllllIlllIlIllI, lllllllllllllllIlIllllIllllIIIlI, lllllllllllllllIlIllllIllllIIIIl))) {
               lllllllllllllllIlIllllIllllIIIIl = 0.0D;
               lllllllllllllllIlIllllIllllIIIlI = 0.0D;
            }

            lllllllllllllllIlIllllIlllIlIlll.setEntitySpeed(lllllllllllllllIlIllllIlllIlIllI, lllllllllllllllIlIllllIllllIIIlI, lllllllllllllllIlIllllIllllIIIIl);
         }
      }

   }

   private void steerEntity(Entity lllllllllllllllIlIlllllIIIIIllll) {
      if (lIIllIIlllIlIl((Boolean)lllllllllllllllIlIlllllIIIIlIIII.flight.getValue())) {
         lllllllllllllllIlIlllllIIIIIllll.field_70181_x = -0.4D;
      }

      if (lIIllIIlllIllI((Boolean)lllllllllllllllIlIlllllIIIIlIIII.flight.getValue())) {
         if (lIIllIIlllIllI(mc.field_71474_y.field_74314_A.func_151470_d())) {
            lllllllllllllllIlIlllllIIIIIllll.field_70181_x = (double)(Float)lllllllllllllllIlIlllllIIIIlIIII.speed.getValue();
            "".length();
            if ("   ".length() < " ".length()) {
               return;
            }
         } else if (!lIIllIIlllIlIl(mc.field_71474_y.field_74351_w.func_151470_d()) || lIIllIIlllIllI(mc.field_71474_y.field_74368_y.func_151470_d())) {
            double var10001;
            if (lIIllIIlllIllI((Boolean)lllllllllllllllIlIlllllIIIIlIIII.wobble.getValue())) {
               var10001 = Math.sin((double)mc.field_71439_g.field_70173_aa);
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               var10001 = 0.0D;
            }

            lllllllllllllllIlIlllllIIIIIllll.field_70181_x = var10001;
         }
      }

      lllllllllllllllIlIlllllIIIIlIIII.moveForward(lllllllllllllllIlIlllllIIIIIllll, (double)(Float)lllllllllllllllIlIlllllIIIIlIIII.speed.getValue() * 3.8D);
      if (lIIllIIlllIllI(lllllllllllllllIlIlllllIIIIIllll instanceof EntityHorse)) {
         lllllllllllllllIlIlllllIIIIIllll.field_70177_z = mc.field_71439_g.field_70177_z;
      }

   }

   private static boolean lIIllIIlllllIl(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIIllIIllllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIllIIllllIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIllIIlllIllI(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIIllllIll(int var0) {
      return var0 > 0;
   }

   private static void lIIllIIlllIIll() {
      lllIlIlIlIlI = new int[13];
      lllIlIlIlIlI[0] = ((160 ^ 165) << (" ".length() << " ".length()) ^ 76 ^ 75) & (17 ^ 66 ^ " ".length() << ("   ".length() << " ".length()) ^ -" ".length());
      lllIlIlIlIlI[1] = " ".length();
      lllIlIlIlIlI[2] = " ".length() << " ".length();
      lllIlIlIlIlI[3] = "   ".length();
      lllIlIlIlIlI[4] = (176 ^ 157) << (" ".length() << " ".length());
      lllIlIlIlIlI[5] = -" ".length();
      lllIlIlIlIlI[6] = -((28 ^ 105) << " ".length() ^ (108 ^ 103) << (" ".length() << (" ".length() << " ".length())));
      lllIlIlIlIlI[7] = (171 ^ 156 ^ (84 ^ 89) << " ".length()) << " ".length();
      lllIlIlIlIlI[8] = -((40 ^ 61) << " ".length() ^ 171 ^ 172);
      lllIlIlIlIlI[9] = 138 + 23 - 48 + 76 ^ (2 ^ 11) << (" ".length() << (" ".length() << " ".length()));
      lllIlIlIlIlI[10] = " ".length() << (" ".length() << " ".length());
      lllIlIlIlIlI[11] = 248 ^ 179 ^ (231 ^ 192) << " ".length();
      lllIlIlIlIlI[12] = " ".length() << "   ".length();
   }

   private static String lIIllIIllIIlII(String lllllllllllllllIlIllllIllIlIlIll, String lllllllllllllllIlIllllIllIlIlIII) {
      try {
         float lllllllllllllllIlIllllIllIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIllIlIlIII.getBytes(StandardCharsets.UTF_8)), lllIlIlIlIlI[12]), "DES");
         String lllllllllllllllIlIllllIllIlIIllI = Cipher.getInstance("DES");
         lllllllllllllllIlIllllIllIlIIllI.init(lllIlIlIlIlI[2], lllllllllllllllIlIllllIllIlIIlll);
         return new String(lllllllllllllllIlIllllIllIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void setEntitySpeed(Entity lllllllllllllllIlIllllIlllIIlIII, double lllllllllllllllIlIllllIlllIIIlll, double lllllllllllllllIlIllllIlllIIIllI) {
      lllllllllllllllIlIllllIlllIIlIII.field_70159_w = lllllllllllllllIlIllllIlllIIIlll;
      lllllllllllllllIlIllllIlllIIlIII.field_70179_y = lllllllllllllllIlIllllIlllIIIllI;
   }

   static {
      lIIllIIlllIIll();
      lIIllIIlllIIlI();
      opacity = Settings.f(lllIlIlIlIII[lllIlIlIlIlI[10]], 0.5F);
   }

   private static boolean lIIllIIlllllII(int var0) {
      return var0 < 0;
   }

   private static boolean lIIllIIllllIII(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIIllIIlllIlll(Object var0) {
      return var0 == null;
   }

   public void onUpdate() {
      if (lIIllIIlllIlII(mc.field_71441_e) && lIIllIIlllIlII(mc.field_71439_g.func_184187_bx())) {
         boolean lllllllllllllllIlIlllllIIIIlIlIl = mc.field_71439_g.func_184187_bx();
         if (lIIllIIlllIlIl(lllllllllllllllIlIlllllIIIIlIlIl instanceof EntityPig) && !lIIllIIlllIllI(lllllllllllllllIlIlllllIIIIlIlIl instanceof AbstractHorse)) {
            if (lIIllIIlllIllI(lllllllllllllllIlIlllllIIIIlIlIl instanceof EntityBoat)) {
               lllllllllllllllIlIlllllIIIIlIllI.steerBoat(lllllllllllllllIlIlllllIIIIlIllI.getBoat());
            }
         } else {
            lllllllllllllllIlIlllllIIIIlIllI.steerEntity(lllllllllllllllIlIlllllIIIIlIlIl);
            "".length();
            if (null != null) {
               return;
            }
         }
      }

   }

   public void onRender() {
      float lllllllllllllllIlIllllIllllIllll = lllllllllllllllIlIllllIlllllIIlI.getBoat();
      if (!lIIllIIlllIlll(lllllllllllllllIlIllllIllllIllll)) {
         lllllllllllllllIlIllllIllllIllll.field_70177_z = mc.field_71439_g.field_70177_z;
         lllllllllllllllIlIllllIllllIllll.func_184442_a((boolean)lllIlIlIlIlI[0], (boolean)lllIlIlIlIlI[0], (boolean)lllIlIlIlIlI[0], (boolean)lllIlIlIlIlI[0]);
      }
   }

   private static boolean lIIllIIlllIlIl(int var0) {
      return var0 == 0;
   }

   private EntityBoat getBoat() {
      return lIIllIIlllIlII(mc.field_71439_g.func_184187_bx()) && lIIllIIlllIllI(mc.field_71439_g.func_184187_bx() instanceof EntityBoat) ? (EntityBoat)mc.field_71439_g.func_184187_bx() : null;
   }

   private static boolean lIIllIIlllIlII(Object var0) {
      return var0 != null;
   }

   private static String lIIllIIllIIlll(String lllllllllllllllIlIllllIllIIIIlII, String lllllllllllllllIlIllllIllIIIIIll) {
      try {
         SecretKeySpec lllllllllllllllIlIllllIllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllllIllIIIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllllIllIIIIllI.init(lllIlIlIlIlI[2], lllllllllllllllIlIllllIllIIIIlll);
         return new String(lllllllllllllllIlIllllIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
