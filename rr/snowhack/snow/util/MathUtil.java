package rr.snowhack.snow.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public final class MathUtil {
   // $FF: synthetic field
   private static final int[] lIIIIllllIIlI;

   static {
      lIlIllIlllIllI();
   }

   public static Vec3d direction(float lllllllllllllllIIllllIIIlllIllIl) {
      return new Vec3d(Math.cos(degToRad((double)(lllllllllllllllIIllllIIIlllIllIl + 90.0F))), 0.0D, Math.sin(degToRad((double)(lllllllllllllllIIllllIIIlllIllIl + 90.0F))));
   }

   public static Vec3d mult(Vec3d lllllllllllllllIIllllIIIlIlIlIIl, float lllllllllllllllIIllllIIIlIlIIlll) {
      return new Vec3d(lllllllllllllllIIllllIIIlIlIlIIl.field_72450_a * (double)lllllllllllllllIIllllIIIlIlIIlll, lllllllllllllllIIllllIIIlIlIlIIl.field_72448_b * (double)lllllllllllllllIIllllIIIlIlIIlll, lllllllllllllllIIllllIIIlIlIlIIl.field_72449_c * (double)lllllllllllllllIIllllIIIlIlIIlll);
   }

   public static double degToRad(double lllllllllllllllIIllllIIIllllIIII) {
      return lllllllllllllllIIllllIIIllllIIII * 0.01745329238474369D;
   }

   private static int lIlIllIlllllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIlllIIIIIII(int var0) {
      return var0 >= 0;
   }

   public static float[] calcAngle(Vec3d lllllllllllllllIIllllIIIllIlllll, Vec3d lllllllllllllllIIllllIIIlllIIlII) {
      String lllllllllllllllIIllllIIIllIlllIl = lllllllllllllllIIllllIIIlllIIlII.field_72450_a - lllllllllllllllIIllllIIIllIlllll.field_72450_a;
      long lllllllllllllllIIllllIIIllIlllII = (lllllllllllllllIIllllIIIlllIIlII.field_72448_b - lllllllllllllllIIllllIIIllIlllll.field_72448_b) * -1.0D;
      Exception lllllllllllllllIIllllIIIllIllIll = lllllllllllllllIIllllIIIlllIIlII.field_72449_c - lllllllllllllllIIllllIIIllIlllll.field_72449_c;
      double lllllllllllllllIIllllIIIlllIIIII = (double)MathHelper.func_76133_a(lllllllllllllllIIllllIIIllIlllIl * lllllllllllllllIIllllIIIllIlllIl + lllllllllllllllIIllllIIIllIllIll * lllllllllllllllIIllllIIIllIllIll);
      float[] var10000 = new float[lIIIIllllIIlI[0]];
      var10000[lIIIIllllIIlI[1]] = (float)MathHelper.func_76138_g(Math.toDegrees(Math.atan2(lllllllllllllllIIllllIIIllIllIll, lllllllllllllllIIllllIIIllIlllIl)) - 90.0D);
      var10000[lIIIIllllIIlI[2]] = (float)MathHelper.func_76138_g(Math.toDegrees(Math.atan2(lllllllllllllllIIllllIIIllIlllII, lllllllllllllllIIllllIIIlllIIIII)));
      return var10000;
   }

   private static boolean lIlIllIllllIll(int var0) {
      return var0 > 0;
   }

   public static double radToDeg(double lllllllllllllllIIllllIIIllllIIlI) {
      return lllllllllllllllIIllllIIIllllIIlI * 57.295780181884766D;
   }

   public static Vec3d mult(Vec3d lllllllllllllllIIllllIIIlIlllIIl, Vec3d lllllllllllllllIIllllIIIlIllIlII) {
      return new Vec3d(lllllllllllllllIIllllIIIlIlllIIl.field_72450_a * lllllllllllllllIIllllIIIlIllIlII.field_72450_a, lllllllllllllllIIllllIIIlIlllIIl.field_72448_b * lllllllllllllllIIllllIIIlIllIlII.field_72448_b, lllllllllllllllIIllllIIIlIlllIIl.field_72449_c * lllllllllllllllIIllllIIIlIllIlII.field_72449_c);
   }

   private static void lIlIllIlllIllI() {
      lIIIIllllIIlI = new int[5];
      lIIIIllllIIlI[0] = " ".length() << " ".length();
      lIIIIllllIIlI[1] = (48 ^ 17) << " ".length() & ~((126 ^ 95) << " ".length());
      lIIIIllllIIlI[2] = " ".length();
      lIIIIllllIIlI[3] = -(158 ^ 179);
      lIIIIllllIIlI[4] = (198 ^ 195) << "   ".length() ^ 89 ^ 92;
   }

   private static int lIlIllIllllIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static float clamp(float lllllllllllllllIIllllIIIIlllllIl, float lllllllllllllllIIllllIIIIlllllII, float lllllllllllllllIIllllIIIIllllIlI) {
      if (lIlIllIlllllll(lIlIllIlllllIl(lllllllllllllllIIllllIIIIlllllIl, lllllllllllllllIIllllIIIIlllllII))) {
         lllllllllllllllIIllllIIIIlllllIl = lllllllllllllllIIllllIIIIlllllII;
      }

      if (lIlIlllIIIIIII(lIlIllIllllllI(lllllllllllllllIIllllIIIIlllllIl, lllllllllllllllIIllllIIIIllllIlI))) {
         lllllllllllllllIIllllIIIIlllllIl = lllllllllllllllIIllllIIIIllllIlI;
      }

      return lllllllllllllllIIllllIIIIlllllIl;
   }

   public static Vec3d div(Vec3d lllllllllllllllIIllllIIIlIIllIll, Vec3d lllllllllllllllIIllllIIIlIIlllIl) {
      return new Vec3d(lllllllllllllllIIllllIIIlIIllIll.field_72450_a / lllllllllllllllIIllllIIIlIIlllIl.field_72450_a, lllllllllllllllIIllllIIIlIIllIll.field_72448_b / lllllllllllllllIIllllIIIlIIlllIl.field_72448_b, lllllllllllllllIIllllIIIlIIllIll.field_72449_c / lllllllllllllllIIllllIIIlIIlllIl.field_72449_c);
   }

   public static Vec3d div(Vec3d lllllllllllllllIIllllIIIlIIlIIIl, float lllllllllllllllIIllllIIIlIIlIIII) {
      return new Vec3d(lllllllllllllllIIllllIIIlIIlIIIl.field_72450_a / (double)lllllllllllllllIIllllIIIlIIlIIII, lllllllllllllllIIllllIIIlIIlIIIl.field_72448_b / (double)lllllllllllllllIIllllIIIlIIlIIII, lllllllllllllllIIllllIIIlIIlIIIl.field_72449_c / (double)lllllllllllllllIIllllIIIlIIlIIII);
   }

   private static int lIlIllIllllllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static double[] directionSpeed(double lllllllllllllllIIllllIIIllIIllII) {
      Minecraft lllllllllllllllIIllllIIIllIIlIlI = Minecraft.func_71410_x();
      char lllllllllllllllIIllllIIIllIIIIII = lllllllllllllllIIllllIIIllIIlIlI.field_71439_g.field_71158_b.field_192832_b;
      byte lllllllllllllllIIllllIIIlIllllll = lllllllllllllllIIllllIIIllIIlIlI.field_71439_g.field_71158_b.field_78902_a;
      int lllllllllllllllIIllllIIIlIlllllI = lllllllllllllllIIllllIIIllIIlIlI.field_71439_g.field_70126_B + (lllllllllllllllIIllllIIIllIIlIlI.field_71439_g.field_70177_z - lllllllllllllllIIllllIIIllIIlIlI.field_71439_g.field_70126_B) * lllllllllllllllIIllllIIIllIIlIlI.func_184121_ak();
      if (lIlIllIllllIlI(lIlIllIllllIII(lllllllllllllllIIllllIIIllIIIIII, 0.0F))) {
         int var10001;
         if (lIlIllIllllIll(lIlIllIllllIII(lllllllllllllllIIllllIIIlIllllll, 0.0F))) {
            if (lIlIllIllllIll(lIlIllIllllIII(lllllllllllllllIIllllIIIllIIIIII, 0.0F))) {
               var10001 = lIIIIllllIIlI[3];
               "".length();
               if (" ".length() << " ".length() <= 0) {
                  return null;
               }
            } else {
               var10001 = lIIIIllllIIlI[4];
            }

            lllllllllllllllIIllllIIIlIlllllI += (float)var10001;
            "".length();
            if (((19 ^ 26) & ~(57 ^ 48)) != 0) {
               return null;
            }
         } else if (lIlIllIlllllII(lIlIllIllllIIl(lllllllllllllllIIllllIIIlIllllll, 0.0F))) {
            if (lIlIllIllllIll(lIlIllIllllIII(lllllllllllllllIIllllIIIllIIIIII, 0.0F))) {
               var10001 = lIIIIllllIIlI[4];
               "".length();
               if (" ".length() << " ".length() != " ".length() << " ".length()) {
                  return null;
               }
            } else {
               var10001 = lIIIIllllIIlI[3];
            }

            lllllllllllllllIIllllIIIlIlllllI += (float)var10001;
         }

         lllllllllllllllIIllllIIIlIllllll = 0.0F;
         if (lIlIllIllllIll(lIlIllIllllIII(lllllllllllllllIIllllIIIllIIIIII, 0.0F))) {
            lllllllllllllllIIllllIIIllIIIIII = 1.0F;
            "".length();
            if (((20 ^ 37) & ~(163 ^ 146)) == " ".length() << " ".length()) {
               return null;
            }
         } else if (lIlIllIlllllII(lIlIllIllllIIl(lllllllllllllllIIllllIIIllIIIIII, 0.0F))) {
            lllllllllllllllIIllllIIIllIIIIII = -1.0F;
         }
      }

      long lllllllllllllllIIllllIIIlIllllIl = (double)lllllllllllllllIIllllIIIllIIIIII * lllllllllllllllIIllllIIIllIIllII * Math.cos(Math.toRadians((double)(lllllllllllllllIIllllIIIlIlllllI + 90.0F))) + (double)lllllllllllllllIIllllIIIlIllllll * lllllllllllllllIIllllIIIllIIllII * Math.sin(Math.toRadians((double)(lllllllllllllllIIllllIIIlIlllllI + 90.0F)));
      byte lllllllllllllllIIllllIIIlIllllII = (double)lllllllllllllllIIllllIIIllIIIIII * lllllllllllllllIIllllIIIllIIllII * Math.sin(Math.toRadians((double)(lllllllllllllllIIllllIIIlIlllllI + 90.0F))) - (double)lllllllllllllllIIllllIIIlIllllll * lllllllllllllllIIllllIIIllIIllII * Math.cos(Math.toRadians((double)(lllllllllllllllIIllllIIIlIlllllI + 90.0F)));
      double[] var10000 = new double[lIIIIllllIIlI[0]];
      var10000[lIIIIllllIIlI[1]] = lllllllllllllllIIllllIIIlIllllIl;
      var10000[lIIIIllllIIlI[2]] = lllllllllllllllIIllllIIIlIllllII;
      return var10000;
   }

   private static boolean lIlIllIlllllll(int var0) {
      return var0 <= 0;
   }

   private static boolean lIlIllIlllllII(int var0) {
      return var0 < 0;
   }

   public static double round(double lllllllllllllllIIllllIIIlIIIlIll, int lllllllllllllllIIllllIIIlIIIlIlI) {
      return lIlIllIlllllII(lllllllllllllllIIllllIIIlIIIlIlI) ? lllllllllllllllIIllllIIIlIIIlIll : (new BigDecimal(lllllllllllllllIIllllIIIlIIIlIll)).setScale(lllllllllllllllIIllllIIIlIIIlIlI, RoundingMode.HALF_UP).doubleValue();
   }

   private static int lIlIllIllllIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIllIllllIlI(int var0) {
      return var0 != 0;
   }

   public static Vec3d interpolateEntity(Entity lllllllllllllllIIllllIIIlllllIII, float lllllllllllllllIIllllIIIllllIlIl) {
      return new Vec3d(lllllllllllllllIIllllIIIlllllIII.field_70142_S + (lllllllllllllllIIllllIIIlllllIII.field_70165_t - lllllllllllllllIIllllIIIlllllIII.field_70142_S) * (double)lllllllllllllllIIllllIIIllllIlIl, lllllllllllllllIIllllIIIlllllIII.field_70137_T + (lllllllllllllllIIllllIIIlllllIII.field_70163_u - lllllllllllllllIIllllIIIlllllIII.field_70137_T) * (double)lllllllllllllllIIllllIIIllllIlIl, lllllllllllllllIIllllIIIlllllIII.field_70136_U + (lllllllllllllllIIllllIIIlllllIII.field_70161_v - lllllllllllllllIIllllIIIlllllIII.field_70136_U) * (double)lllllllllllllllIIllllIIIllllIlIl);
   }
}
