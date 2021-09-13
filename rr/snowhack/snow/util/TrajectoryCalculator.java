package rr.snowhack.snow.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemExpBottle;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

public class TrajectoryCalculator {
   // $FF: synthetic field
   private static final int[] lllIlIIlIllI;

   public static Vec3d mult(Vec3d lllllllllllllllIllIIIIlIIIIlllll, float lllllllllllllllIllIIIIlIIIIllllI) {
      return new Vec3d(lllllllllllllllIllIIIIlIIIIlllll.field_72450_a * (double)lllllllllllllllIllIIIIlIIIIllllI, lllllllllllllllIllIIIIlIIIIlllll.field_72448_b * (double)lllllllllllllllIllIIIIlIIIIllllI, lllllllllllllllIllIIIIlIIIIlllll.field_72449_c * (double)lllllllllllllllIllIIIIlIIIIllllI);
   }

   static {
      lIIllIIIIlIllI();
   }

   public static Vec3d div(Vec3d lllllllllllllllIllIIIIlIIIIlIlll, float lllllllllllllllIllIIIIlIIIIlIllI) {
      return new Vec3d(lllllllllllllllIllIIIIlIIIIlIlll.field_72450_a / (double)lllllllllllllllIllIIIIlIIIIlIllI, lllllllllllllllIllIIIIlIIIIlIlll.field_72448_b / (double)lllllllllllllllIllIIIIlIIIIlIllI, lllllllllllllllIllIIIIlIIIIlIlll.field_72449_c / (double)lllllllllllllllIllIIIIlIIIIlIllI);
   }

   public static TrajectoryCalculator.ThrowingType getThrowType(EntityLivingBase lllllllllllllllIllIIIIlIIIllIllI) {
      if (lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIllIllI.func_184586_b(EnumHand.MAIN_HAND).func_190926_b())) {
         return TrajectoryCalculator.ThrowingType.NONE;
      } else {
         ItemStack lllllllllllllllIllIIIIlIIIlllIII = lllllllllllllllIllIIIIlIIIllIllI.func_184586_b(EnumHand.MAIN_HAND);
         float lllllllllllllllIllIIIIlIIIllIlII = lllllllllllllllIllIIIIlIIIlllIII.func_77973_b();
         if (lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIllIlII instanceof ItemPotion)) {
            if (lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIlllIII.func_77973_b() instanceof ItemSplashPotion)) {
               return TrajectoryCalculator.ThrowingType.POTION;
            }
         } else {
            if (lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIllIlII instanceof ItemBow) && lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIllIllI.func_184587_cr())) {
               return TrajectoryCalculator.ThrowingType.BOW;
            }

            if (lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIllIlII instanceof ItemExpBottle)) {
               return TrajectoryCalculator.ThrowingType.EXPERIENCE;
            }

            if (!lIIllIIIIllIII(lllllllllllllllIllIIIIlIIIllIlII instanceof ItemSnowball) || !lIIllIIIIllIII(lllllllllllllllIllIIIIlIIIllIlII instanceof ItemEgg) || lIIllIIIIlIlll(lllllllllllllllIllIIIIlIIIllIlII instanceof ItemEnderPearl)) {
               return TrajectoryCalculator.ThrowingType.NORMAL;
            }
         }

         return TrajectoryCalculator.ThrowingType.NONE;
      }
   }

   public static double[] interpolate(Entity lllllllllllllllIllIIIIlIIIlIllll) {
      double lllllllllllllllIllIIIIlIIIlIlllI = interpolate(lllllllllllllllIllIIIIlIIIlIllll.field_70165_t, lllllllllllllllIllIIIIlIIIlIllll.field_70142_S) - Wrapper.getMinecraft().field_175616_W.field_78725_b;
      long lllllllllllllllIllIIIIlIIIlIlIIl = interpolate(lllllllllllllllIllIIIIlIIIlIllll.field_70163_u, lllllllllllllllIllIIIIlIIIlIllll.field_70137_T) - Wrapper.getMinecraft().field_175616_W.field_78726_c;
      float lllllllllllllllIllIIIIlIIIlIlIII = interpolate(lllllllllllllllIllIIIIlIIIlIllll.field_70161_v, lllllllllllllllIllIIIIlIIIlIllll.field_70136_U) - Wrapper.getMinecraft().field_175616_W.field_78723_d;
      double[] var10000 = new double[lllIlIIlIllI[0]];
      var10000[lllIlIIlIllI[1]] = lllllllllllllllIllIIIIlIIIlIlllI;
      var10000[lllIlIIlIllI[2]] = lllllllllllllllIllIIIIlIIIlIlIIl;
      var10000[lllIlIIlIllI[3]] = lllllllllllllllIllIIIIlIIIlIlIII;
      return var10000;
   }

   public static double interpolate(double lllllllllllllllIllIIIIlIIIlIIlIl, double lllllllllllllllIllIIIIlIIIlIIlII) {
      return lllllllllllllllIllIIIIlIIIlIIlII + (lllllllllllllllIllIIIIlIIIlIIlIl - lllllllllllllllIllIIIIlIIIlIIlII) * (double)Wrapper.getMinecraft().func_184121_ak();
   }

   private static boolean lIIllIIIIlIlll(int var0) {
      return var0 != 0;
   }

   private static void lIIllIIIIlIllI() {
      lllIlIIlIllI = new int[4];
      lllIlIIlIllI[0] = "   ".length();
      lllIlIIlIllI[1] = (30 ^ 23) & ~(136 ^ 129);
      lllIlIIlIllI[2] = " ".length();
      lllIlIIlIllI[3] = " ".length() << " ".length();
   }

   private static boolean lIIllIIIIllIII(int var0) {
      return var0 == 0;
   }

   public static enum ThrowingType {
      // $FF: synthetic field
      NORMAL;

      // $FF: synthetic field
      private static final String[] lIIIIIllllIII;
      // $FF: synthetic field
      BOW,
      // $FF: synthetic field
      EXPERIENCE;

      // $FF: synthetic field
      private static final int[] lIIIIIllllIlI;
      // $FF: synthetic field
      NONE,
      // $FF: synthetic field
      POTION;

      private static void lIlIlIlIIIIIIl() {
         lIIIIIllllIlI = new int[6];
         lIIIIIllllIlI[0] = (104 ^ 109) << " ".length() & ~((164 ^ 161) << " ".length());
         lIIIIIllllIlI[1] = " ".length();
         lIIIIIllllIlI[2] = " ".length() << " ".length();
         lIIIIIllllIlI[3] = "   ".length();
         lIIIIIllllIlI[4] = " ".length() << (" ".length() << " ".length());
         lIIIIIllllIlI[5] = 65 ^ 68;
      }

      private static String lIlIlIIllllllI(String lllllllllllllllIlIIIIlIIIlIIIlll, String lllllllllllllllIlIIIIlIIIlIIIIIl) {
         lllllllllllllllIlIIIIlIIIlIIIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         boolean lllllllllllllllIlIIIIlIIIlIIIIII = new StringBuilder();
         char[] lllllllllllllllIlIIIIlIIIlIIIlII = lllllllllllllllIlIIIIlIIIlIIIIIl.toCharArray();
         int lllllllllllllllIlIIIIlIIIlIIIIll = lIIIIIllllIlI[0];
         float lllllllllllllllIlIIIIlIIIIllllIl = lllllllllllllllIlIIIIlIIIlIIIlll.toCharArray();
         long lllllllllllllllIlIIIIlIIIIllllII = lllllllllllllllIlIIIIlIIIIllllIl.length;
         int lllllllllllllllIlIIIIlIIIIlllIll = lIIIIIllllIlI[0];

         do {
            if (!lIlIlIlIIIIIlI(lllllllllllllllIlIIIIlIIIIlllIll, lllllllllllllllIlIIIIlIIIIllllII)) {
               return String.valueOf(lllllllllllllllIlIIIIlIIIlIIIIII);
            }

            char lllllllllllllllIlIIIIlIIIlIIlIII = lllllllllllllllIlIIIIlIIIIllllIl[lllllllllllllllIlIIIIlIIIIlllIll];
            lllllllllllllllIlIIIIlIIIlIIIIII.append((char)(lllllllllllllllIlIIIIlIIIlIIlIII ^ lllllllllllllllIlIIIIlIIIlIIIlII[lllllllllllllllIlIIIIlIIIlIIIIll % lllllllllllllllIlIIIIlIIIlIIIlII.length]));
            "".length();
            ++lllllllllllllllIlIIIIlIIIlIIIIll;
            ++lllllllllllllllIlIIIIlIIIIlllIll;
            "".length();
         } while((" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) == 0);

         return null;
      }

      static {
         lIlIlIlIIIIIIl();
         lIlIlIlIIIIIII();
         NONE = new TrajectoryCalculator.ThrowingType(lIIIIIllllIII[lIIIIIllllIlI[0]], lIIIIIllllIlI[0]);
         BOW = new TrajectoryCalculator.ThrowingType(lIIIIIllllIII[lIIIIIllllIlI[1]], lIIIIIllllIlI[1]);
         EXPERIENCE = new TrajectoryCalculator.ThrowingType(lIIIIIllllIII[lIIIIIllllIlI[2]], lIIIIIllllIlI[2]);
         POTION = new TrajectoryCalculator.ThrowingType(lIIIIIllllIII[lIIIIIllllIlI[3]], lIIIIIllllIlI[3]);
         NORMAL = new TrajectoryCalculator.ThrowingType(lIIIIIllllIII[lIIIIIllllIlI[4]], lIIIIIllllIlI[4]);
         TrajectoryCalculator.ThrowingType[] var10000 = new TrajectoryCalculator.ThrowingType[lIIIIIllllIlI[5]];
         var10000[lIIIIIllllIlI[0]] = NONE;
         var10000[lIIIIIllllIlI[1]] = BOW;
         var10000[lIIIIIllllIlI[2]] = EXPERIENCE;
         var10000[lIIIIIllllIlI[3]] = POTION;
         var10000[lIIIIIllllIlI[4]] = NORMAL;
      }

      private static String lIlIlIIlllIlll(String lllllllllllllllIlIIIIlIIIIllIIlI, String lllllllllllllllIlIIIIlIIIIlIllll) {
         try {
            SecretKeySpec lllllllllllllllIlIIIIlIIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            char lllllllllllllllIlIIIIlIIIIlIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIIIIlIllIl.init(lIIIIIllllIlI[2], lllllllllllllllIlIIIIlIIIIllIlIl);
            return new String(lllllllllllllllIlIIIIlIIIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIlIlIIIIIII() {
         lIIIIIllllIII = new String[lIIIIIllllIlI[5]];
         lIIIIIllllIII[lIIIIIllllIlI[0]] = lIlIlIIlllIlll("Qe/8wOgKcXU=", "CAeGB");
         lIIIIIllllIII[lIIIIIllllIlI[1]] = lIlIlIIllllllI("BCk5", "FfnBo");
         lIIIIIllllIII[lIIIIIllllIlI[2]] = lIlIlIIllllllI("JAg5CSQoFScPMw==", "aPiLv");
         lIIIIIllllIII[lIIIIIllllIlI[3]] = lIlIlIIlllIlll("fJ+8MetrpxE=", "jtIPF");
         lIIIIIllllIII[lIIIIIllllIlI[4]] = lIlIlIIlllIlll("pf+lCN9vk/I=", "eOLXJ");
      }

      private static boolean lIlIlIlIIIIIlI(int var0, int var1) {
         return var0 < var1;
      }
   }

   public static final class FlightPath {
      // $FF: synthetic field
      private EntityLivingBase shooter;
      // $FF: synthetic field
      private static final int[] lllIlIlIllII;
      // $FF: synthetic field
      private RayTraceResult target;
      // $FF: synthetic field
      private float yaw;
      // $FF: synthetic field
      private AxisAlignedBB boundingBox;
      // $FF: synthetic field
      private TrajectoryCalculator.ThrowingType throwingType;
      // $FF: synthetic field
      private Vec3d motion;
      // $FF: synthetic field
      private float pitch;
      // $FF: synthetic field
      public Vec3d position;
      // $FF: synthetic field
      private boolean collided;

      private static boolean lIIllIlIIIIllI(int var0) {
         return var0 == 0;
      }

      private static boolean lIIllIlIIIIIlI(int var0) {
         return var0 != 0;
      }

      public boolean isCollided() {
         return lllllllllllllllIlIllllIIlllllIll.collided;
      }

      private static boolean lIIllIlIIIIIIl(int var0) {
         return var0 <= 0;
      }

      private static int lIIllIlIIIIlII(double var0, double var2) {
         double var4;
         return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
      }

      private void onCollideWithEntity(Vec3d lllllllllllllllIlIllllIlIIlllllI, RayTraceResult lllllllllllllllIlIllllIlIlIIIIll) {
         short lllllllllllllllIlIllllIlIIllllII = null;
         short lllllllllllllllIlIllllIlIIlllIll = 0.0D;
         List<Entity> lllllllllllllllIlIllllIlIlIIIIII = lllllllllllllllIlIllllIlIIllllll.shooter.field_70170_p.func_72839_b(lllllllllllllllIlIllllIlIIllllll.shooter, lllllllllllllllIlIllllIlIIllllll.boundingBox.func_72321_a(lllllllllllllllIlIllllIlIIllllll.motion.field_72450_a, lllllllllllllllIlIllllIlIIllllll.motion.field_72448_b, lllllllllllllllIlIllllIlIIllllll.motion.field_72449_c).func_72321_a(1.0D, 1.0D, 1.0D));
         Iterator lllllllllllllllIlIllllIlIIlllIIl = lllllllllllllllIlIllllIlIlIIIIII.iterator();

         label40:
         do {
            do {
               if (!lIIllIlIIIIIlI(lllllllllllllllIlIllllIlIIlllIIl.hasNext())) {
                  if (lIIllIlIIIIIII(lllllllllllllllIlIllllIlIIllllII)) {
                     lllllllllllllllIlIllllIlIIllllll.target = new RayTraceResult(lllllllllllllllIlIllllIlIIllllII);
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                        return;
                     }
                  } else {
                     lllllllllllllllIlIllllIlIIllllll.target = lllllllllllllllIlIllllIlIlIIIIll;
                  }

                  return;
               }

               Entity lllllllllllllllIlIllllIlIlIIIllI = (Entity)lllllllllllllllIlIllllIlIIlllIIl.next();
               if (lIIllIlIIIIllI(lllllllllllllllIlIllllIlIlIIIllI.func_70067_L()) && lIIllIlIIIIlll(lllllllllllllllIlIllllIlIlIIIllI, lllllllllllllllIlIllllIlIIllllll.shooter)) {
                  "".length();
                  continue label40;
               }

               float lllllllllllllllIlIllllIlIlIIlIIl = lllllllllllllllIlIllllIlIlIIIllI.func_70111_Y();
               AxisAlignedBB lllllllllllllllIlIllllIlIlIIlIII = lllllllllllllllIlIllllIlIlIIIllI.func_174813_aQ().func_72321_a((double)lllllllllllllllIlIllllIlIlIIlIIl, (double)lllllllllllllllIlIllllIlIlIIlIIl, (double)lllllllllllllllIlIllllIlIlIIlIIl);
               RayTraceResult lllllllllllllllIlIllllIlIlIIIlll = lllllllllllllllIlIllllIlIlIIlIII.func_72327_a(lllllllllllllllIlIllllIlIIllllll.position, lllllllllllllllIlIllllIlIIlllllI);
               if (lIIllIlIIIIIII(lllllllllllllllIlIllllIlIlIIIlll)) {
                  double lllllllllllllllIlIllllIlIlIIlIlI = lllllllllllllllIlIllllIlIIllllll.position.func_72438_d(lllllllllllllllIlIllllIlIlIIIlll.field_72307_f);
                  if (!lIIllIlIIIlIII(lIIllIlIIIIlII(lllllllllllllllIlIllllIlIlIIlIlI, lllllllllllllllIlIllllIlIIlllIll)) || lIIllIlIIIIllI(lIIllIlIIIIlIl(lllllllllllllllIlIllllIlIIlllIll, 0.0D))) {
                     lllllllllllllllIlIllllIlIIllllII = lllllllllllllllIlIllllIlIlIIIllI;
                     lllllllllllllllIlIllllIlIIlllIll = lllllllllllllllIlIllllIlIlIIlIlI;
                  }
               }

               "".length();
            } while(-(48 ^ 53) < 0);

            return;
         } while(" ".length() != 0);

      }

      private void setLocationAndAngles(double lllllllllllllllIlIllllIlIIIlIlII, double lllllllllllllllIlIllllIlIIIlIIll, double lllllllllllllllIlIllllIlIIIlIIlI, float lllllllllllllllIlIllllIlIIIlIlll, float lllllllllllllllIlIllllIlIIIlIIII) {
         lllllllllllllllIlIllllIlIIIlIlIl.position = new Vec3d(lllllllllllllllIlIllllIlIIIlIlII, lllllllllllllllIlIllllIlIIIlIIll, lllllllllllllllIlIllllIlIIIlIIlI);
         lllllllllllllllIlIllllIlIIIlIlIl.yaw = lllllllllllllllIlIllllIlIIIlIlll;
         lllllllllllllllIlIllllIlIIIlIlIl.pitch = lllllllllllllllIlIllllIlIIIlIIII;
      }

      private void setThrowableHeading(Vec3d lllllllllllllllIlIllllIlIIIIIIlI, float lllllllllllllllIlIllllIIlllllllI) {
         lllllllllllllllIlIllllIlIIIIIIll.motion = TrajectoryCalculator.div(lllllllllllllllIlIllllIlIIIIIIlI, (float)lllllllllllllllIlIllllIlIIIIIIlI.func_72433_c());
         lllllllllllllllIlIllllIlIIIIIIll.motion = TrajectoryCalculator.mult(lllllllllllllllIlIllllIlIIIIIIll.motion, lllllllllllllllIlIllllIIlllllllI);
      }

      private static boolean lIIllIlIIIIIII(Object var0) {
         return var0 != null;
      }

      private static boolean lIIllIlIIIlIII(int var0) {
         return var0 >= 0;
      }

      private static boolean lIIllIlIIIIIll(Object var0, Object var1) {
         return var0 == var1;
      }

      private static int lIIllIlIIIIlIl(double var0, double var2) {
         double var4;
         return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
      }

      private static boolean lIIllIlIIIlIlI(int var0) {
         return var0 > 0;
      }

      public FlightPath(EntityLivingBase lllllllllllllllIlIllllIlIlllIllI, TrajectoryCalculator.ThrowingType lllllllllllllllIlIllllIlIllllIlI) {
         lllllllllllllllIlIllllIlIlllIlll.shooter = lllllllllllllllIlIllllIlIlllIllI;
         lllllllllllllllIlIllllIlIlllIlll.throwingType = lllllllllllllllIlIllllIlIllllIlI;
         double[] lllllllllllllllIlIllllIlIllllIIl = TrajectoryCalculator.interpolate(lllllllllllllllIlIllllIlIlllIlll.shooter);
         lllllllllllllllIlIllllIlIlllIlll.setLocationAndAngles(lllllllllllllllIlIllllIlIllllIIl[lllIlIlIllII[0]] + Wrapper.getMinecraft().func_175598_ae().field_78725_b, lllllllllllllllIlIllllIlIllllIIl[lllIlIlIllII[1]] + (double)lllllllllllllllIlIllllIlIlllIlll.shooter.func_70047_e() + Wrapper.getMinecraft().func_175598_ae().field_78726_c, lllllllllllllllIlIllllIlIllllIIl[lllIlIlIllII[2]] + Wrapper.getMinecraft().func_175598_ae().field_78723_d, lllllllllllllllIlIllllIlIlllIlll.shooter.field_70177_z, lllllllllllllllIlIllllIlIlllIlll.shooter.field_70125_A);
         Vec3d lllllllllllllllIlIllllIlIllllIII = new Vec3d((double)(MathHelper.func_76134_b(lllllllllllllllIlIllllIlIlllIlll.yaw / 180.0F * 3.1415927F) * 0.16F), 0.1D, (double)(MathHelper.func_76126_a(lllllllllllllllIlIllllIlIlllIlll.yaw / 180.0F * 3.1415927F) * 0.16F));
         lllllllllllllllIlIllllIlIlllIlll.position = lllllllllllllllIlIllllIlIlllIlll.position.func_178788_d(lllllllllllllllIlIllllIlIllllIII);
         lllllllllllllllIlIllllIlIlllIlll.setPosition(lllllllllllllllIlIllllIlIlllIlll.position);
         lllllllllllllllIlIllllIlIlllIlll.motion = new Vec3d((double)(-MathHelper.func_76126_a(lllllllllllllllIlIllllIlIlllIlll.yaw / 180.0F * 3.1415927F) * MathHelper.func_76134_b(lllllllllllllllIlIllllIlIlllIlll.pitch / 180.0F * 3.1415927F)), (double)(-MathHelper.func_76126_a(lllllllllllllllIlIllllIlIlllIlll.pitch / 180.0F * 3.1415927F)), (double)(MathHelper.func_76134_b(lllllllllllllllIlIllllIlIlllIlll.yaw / 180.0F * 3.1415927F) * MathHelper.func_76134_b(lllllllllllllllIlIllllIlIlllIlll.pitch / 180.0F * 3.1415927F)));
         lllllllllllllllIlIllllIlIlllIlll.setThrowableHeading(lllllllllllllllIlIllllIlIlllIlll.motion, lllllllllllllllIlIllllIlIlllIlll.getInitialVelocity());
      }

      private static int lIIllIlIIIlIIl(float var0, float var1) {
         float var2;
         return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
      }

      private float getGravityVelocity() {
         switch(null.$SwitchMap$rr$snowhack$snow$util$TrajectoryCalculator$ThrowingType[lllllllllllllllIlIllllIlIIlIIIll.throwingType.ordinal()]) {
         case 1:
         case 2:
            return 0.05F;
         case 3:
            return 0.07F;
         case 4:
            return 0.03F;
         default:
            return 0.03F;
         }
      }

      private static boolean lIIllIlIIIIlll(Object var0, Object var1) {
         return var0 != var1;
      }

      private static void lIIllIIllllllI() {
         lllIlIlIllII = new int[3];
         lllIlIlIllII[0] = (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ 55 ^ 32) << " ".length() & (((78 ^ 105) << " ".length() ^ 49 ^ 120) << " ".length() ^ -" ".length());
         lllIlIlIllII[1] = " ".length();
         lllIlIlIllII[2] = " ".length() << " ".length();
      }

      public void onUpdate() {
         short lllllllllllllllIlIllllIlIlIllIIl = lllllllllllllllIlIllllIlIllIIIIl.position.func_178787_e(lllllllllllllllIlIllllIlIllIIIIl.motion);
         RayTraceResult lllllllllllllllIlIllllIlIlIllllI = lllllllllllllllIlIllllIlIllIIIIl.shooter.func_130014_f_().func_147447_a(lllllllllllllllIlIllllIlIllIIIIl.position, lllllllllllllllIlIllllIlIlIllIIl, (boolean)lllIlIlIllII[0], (boolean)lllIlIlIllII[1], (boolean)lllIlIlIllII[0]);
         if (lIIllIlIIIIIII(lllllllllllllllIlIllllIlIlIllllI)) {
            lllllllllllllllIlIllllIlIlIllIIl = lllllllllllllllIlIllllIlIlIllllI.field_72307_f;
         }

         lllllllllllllllIlIllllIlIllIIIIl.onCollideWithEntity(lllllllllllllllIlIllllIlIlIllIIl, lllllllllllllllIlIllllIlIlIllllI);
         if (lIIllIlIIIIIII(lllllllllllllllIlIllllIlIllIIIIl.target)) {
            lllllllllllllllIlIllllIlIllIIIIl.collided = (boolean)lllIlIlIllII[1];
            lllllllllllllllIlIllllIlIllIIIIl.setPosition(lllllllllllllllIlIllllIlIllIIIIl.target.field_72307_f);
         } else if (lIIllIlIIIIIIl(lIIllIIlllllll(lllllllllllllllIlIllllIlIllIIIIl.position.field_72448_b, 0.0D))) {
            lllllllllllllllIlIllllIlIllIIIIl.collided = (boolean)lllIlIlIllII[1];
         } else {
            lllllllllllllllIlIllllIlIllIIIIl.position = lllllllllllllllIlIllllIlIllIIIIl.position.func_178787_e(lllllllllllllllIlIllllIlIllIIIIl.motion);
            float lllllllllllllllIlIllllIlIlIlllIl = 0.99F;
            if (lIIllIlIIIIIlI(lllllllllllllllIlIllllIlIllIIIIl.shooter.func_130014_f_().func_72875_a(lllllllllllllllIlIllllIlIllIIIIl.boundingBox, Material.field_151586_h))) {
               float var10000;
               if (lIIllIlIIIIIll(lllllllllllllllIlIllllIlIllIIIIl.throwingType, TrajectoryCalculator.ThrowingType.BOW)) {
                  var10000 = 0.6F;
                  "".length();
                  if (" ".length() << " ".length() <= 0) {
                     return;
                  }
               } else {
                  var10000 = 0.8F;
               }

               lllllllllllllllIlIllllIlIlIlllIl = var10000;
            }

            lllllllllllllllIlIllllIlIllIIIIl.motion = TrajectoryCalculator.mult(lllllllllllllllIlIllllIlIllIIIIl.motion, lllllllllllllllIlIllllIlIlIlllIl);
            lllllllllllllllIlIllllIlIllIIIIl.motion = lllllllllllllllIlIllllIlIllIIIIl.motion.func_178786_a(0.0D, (double)lllllllllllllllIlIllllIlIllIIIIl.getGravityVelocity(), 0.0D);
            lllllllllllllllIlIllllIlIllIIIIl.setPosition(lllllllllllllllIlIllllIlIllIIIIl.position);
         }
      }

      static {
         lIIllIIllllllI();
      }

      private static int lIIllIIlllllll(double var0, double var2) {
         double var4;
         return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
      }

      private float getInitialVelocity() {
         byte lllllllllllllllIlIllllIlIIlIlIII = lllllllllllllllIlIllllIlIIlIlIIl.shooter.func_184586_b(EnumHand.MAIN_HAND).func_77973_b();
         switch(null.$SwitchMap$rr$snowhack$snow$util$TrajectoryCalculator$ThrowingType[lllllllllllllllIlIllllIlIIlIlIIl.throwingType.ordinal()]) {
         case 1:
            Exception lllllllllllllllIlIllllIlIIlIIlll = (ItemBow)lllllllllllllllIlIllllIlIIlIlIII;
            String lllllllllllllllIlIllllIlIIlIIllI = lllllllllllllllIlIllllIlIIlIIlll.func_77626_a(lllllllllllllllIlIllllIlIIlIlIIl.shooter.func_184586_b(EnumHand.MAIN_HAND)) - lllllllllllllllIlIllllIlIIlIlIIl.shooter.func_184605_cv();
            float lllllllllllllllIlIllllIlIIlIIlIl = (float)lllllllllllllllIlIllllIlIIlIIllI / 20.0F;
            lllllllllllllllIlIllllIlIIlIIlIl = (lllllllllllllllIlIllllIlIIlIIlIl * lllllllllllllllIlIllllIlIIlIIlIl + lllllllllllllllIlIllllIlIIlIIlIl * 2.0F) / 3.0F;
            if (lIIllIlIIIlIlI(lIIllIlIIIlIIl(lllllllllllllllIlIllllIlIIlIIlIl, 1.0F))) {
               lllllllllllllllIlIllllIlIIlIIlIl = 1.0F;
            }

            return lllllllllllllllIlIllllIlIIlIIlIl * 2.0F * 1.5F;
         case 2:
            return 0.5F;
         case 3:
            return 0.7F;
         case 4:
            return 1.5F;
         default:
            return 1.5F;
         }
      }

      private void setPosition(Vec3d lllllllllllllllIlIllllIlIIIIlIII) {
         lllllllllllllllIlIllllIlIIIIlIIl.position = new Vec3d(lllllllllllllllIlIllllIlIIIIlIII.field_72450_a, lllllllllllllllIlIllllIlIIIIlIII.field_72448_b, lllllllllllllllIlIllllIlIIIIlIII.field_72449_c);
         double var10000;
         if (lIIllIlIIIIIll(lllllllllllllllIlIllllIlIIIIlIIl.throwingType, TrajectoryCalculator.ThrowingType.BOW)) {
            var10000 = 0.5D;
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            var10000 = 0.25D;
         }

         double lllllllllllllllIlIllllIlIIIIlIlI = var10000 / 2.0D;
         lllllllllllllllIlIllllIlIIIIlIIl.boundingBox = new AxisAlignedBB(lllllllllllllllIlIllllIlIIIIlIII.field_72450_a - lllllllllllllllIlIllllIlIIIIlIlI, lllllllllllllllIlIllllIlIIIIlIII.field_72448_b - lllllllllllllllIlIllllIlIIIIlIlI, lllllllllllllllIlIllllIlIIIIlIII.field_72449_c - lllllllllllllllIlIllllIlIIIIlIlI, lllllllllllllllIlIllllIlIIIIlIII.field_72450_a + lllllllllllllllIlIllllIlIIIIlIlI, lllllllllllllllIlIllllIlIIIIlIII.field_72448_b + lllllllllllllllIlIllllIlIIIIlIlI, lllllllllllllllIlIllllIlIIIIlIII.field_72449_c + lllllllllllllllIlIllllIlIIIIlIlI);
      }

      public RayTraceResult getCollidingTarget() {
         return lllllllllllllllIlIllllIIlllllIIl.target;
      }
   }
}
