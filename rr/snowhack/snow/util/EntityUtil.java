package rr.snowhack.snow.util;

import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class EntityUtil {
   // $FF: synthetic field
   private static final int[] lIIIIlIIIIlIl;

   public static boolean isAboveWater(Entity lllllllllllllllIlIIIIIllIIIllIlI, boolean lllllllllllllllIlIIIIIllIIIllIIl) {
      if (lIlIlIlIIllllI(lllllllllllllllIlIIIIIllIIIllIlI)) {
         return (boolean)lIIIIlIIIIlIl[0];
      } else {
         double var10000 = lllllllllllllllIlIIIIIllIIIllIlI.field_70163_u;
         double var10001;
         if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIIIllIIl)) {
            var10001 = 0.03D;
            "".length();
            if (((86 ^ 69) << (" ".length() << " ".length()) & ~((103 ^ 116) << (" ".length() << " ".length()))) != 0) {
               return (boolean)((57 ^ 0) & ~(75 ^ 114));
            }
         } else if (lIlIlIlIIlllII(isPlayer(lllllllllllllllIlIIIIIllIIIllIlI))) {
            var10001 = 0.2D;
            "".length();
            if (" ".length() != " ".length()) {
               return (boolean)(" ".length() & (" ".length() ^ -" ".length()));
            }
         } else {
            var10001 = 0.5D;
         }

         double lllllllllllllllIlIIIIIllIIIllIll = var10000 - var10001;
         int lllllllllllllllIlIIIIIllIIIllllI = MathHelper.func_76128_c(lllllllllllllllIlIIIIIllIIIllIlI.field_70165_t);

         do {
            if (!lIlIlIlIlIIIlI(lllllllllllllllIlIIIIIllIIIllllI, MathHelper.func_76143_f(lllllllllllllllIlIIIIIllIIIllIlI.field_70165_t))) {
               return (boolean)lIIIIlIIIIlIl[0];
            }

            int lllllllllllllllIlIIIIIllIIIlllll = MathHelper.func_76128_c(lllllllllllllllIlIIIIIllIIIllIlI.field_70161_v);

            while(lIlIlIlIlIIIlI(lllllllllllllllIlIIIIIllIIIlllll, MathHelper.func_76143_f(lllllllllllllllIlIIIIIllIIIllIlI.field_70161_v))) {
               BlockPos lllllllllllllllIlIIIIIllIIlIIIII = new BlockPos(lllllllllllllllIlIIIIIllIIIllllI, MathHelper.func_76128_c(lllllllllllllllIlIIIIIllIIIllIll), lllllllllllllllIlIIIIIllIIIlllll);
               if (lIlIlIlIIlllII(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIIIIllIIlIIIII).func_177230_c() instanceof BlockLiquid)) {
                  return (boolean)lIIIIlIIIIlIl[1];
               }

               ++lllllllllllllllIlIIIIIllIIIlllll;
               "".length();
               if (" ".length() << " ".length() > " ".length() << (" ".length() << " ".length())) {
                  return (boolean)((51 ^ 38) & ~(112 ^ 101));
               }
            }

            ++lllllllllllllllIlIIIIIllIIIllllI;
            "".length();
         } while(" ".length() >= ((134 ^ 151) << " ".length() & ~((47 ^ 62) << " ".length())));

         return (boolean)((162 ^ 179) << (" ".length() << " ".length()) & ~((15 ^ 30) << (" ".length() << " ".length())));
      }
   }

   public static boolean isInWater(Entity lllllllllllllllIlIIIIIllIIllIIIl) {
      if (lIlIlIlIIllllI(lllllllllllllllIlIIIIIllIIllIIIl)) {
         return (boolean)lIIIIlIIIIlIl[0];
      } else {
         double lllllllllllllllIlIIIIIllIIllIIlI = lllllllllllllllIlIIIIIllIIllIIIl.field_70163_u + 0.01D;
         int lllllllllllllllIlIIIIIllIIlIllll = MathHelper.func_76128_c(lllllllllllllllIlIIIIIllIIllIIIl.field_70165_t);

         do {
            if (!lIlIlIlIlIIIlI(lllllllllllllllIlIIIIIllIIlIllll, MathHelper.func_76143_f(lllllllllllllllIlIIIIIllIIllIIIl.field_70165_t))) {
               return (boolean)lIIIIlIIIIlIl[0];
            }

            int lllllllllllllllIlIIIIIllIIlIlllI = MathHelper.func_76128_c(lllllllllllllllIlIIIIIllIIllIIIl.field_70161_v);

            while(lIlIlIlIlIIIlI(lllllllllllllllIlIIIIIllIIlIlllI, MathHelper.func_76143_f(lllllllllllllllIlIIIIIllIIllIIIl.field_70161_v))) {
               char lllllllllllllllIlIIIIIllIIlIllIl = new BlockPos(lllllllllllllllIlIIIIIllIIlIllll, (int)lllllllllllllllIlIIIIIllIIllIIlI, lllllllllllllllIlIIIIIllIIlIlllI);
               if (lIlIlIlIIlllII(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIIIIllIIlIllIl).func_177230_c() instanceof BlockLiquid)) {
                  return (boolean)lIIIIlIIIIlIl[1];
               }

               ++lllllllllllllllIlIIIIIllIIlIlllI;
               "".length();
               if (-"   ".length() > 0) {
                  return (boolean)((86 ^ 113) << " ".length() & ~((172 ^ 139) << " ".length()));
               }
            }

            ++lllllllllllllllIlIIIIIllIIlIllll;
            "".length();
         } while(((133 ^ 136) << " ".length() & ~((4 ^ 9) << " ".length())) < " ".length() << (" ".length() << " ".length()));

         return (boolean)((129 ^ 174) << " ".length() & ~((22 ^ 57) << " ".length()));
      }
   }

   public static boolean isFriendlyMob(Entity lllllllllllllllIlIIIIIllIlIIllll) {
      int var10000;
      if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlIIllll.isCreatureType(EnumCreatureType.CREATURE, (boolean)lIIIIlIIIIlIl[0])) && !lIlIlIlIIlllII(isNeutralMob(lllllllllllllllIlIIIIIllIlIIllll)) || !lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlIIllll.isCreatureType(EnumCreatureType.AMBIENT, (boolean)lIIIIlIIIIlIl[0])) || !lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlIIllll instanceof EntityVillager) || !lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlIIllll instanceof EntityIronGolem) || lIlIlIlIIlllII(isNeutralMob(lllllllllllllllIlIIIIIllIlIIllll)) && lIlIlIlIIlllIl(isMobAggressive(lllllllllllllllIlIIIIIllIlIIllll))) {
         var10000 = lIIIIlIIIIlIl[1];
         "".length();
         if (" ".length() << " ".length() == 0) {
            return (boolean)((55 ^ 96) & ~(150 ^ 193));
         }
      } else {
         var10000 = lIIIIlIIIIlIl[0];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIlIlIlIIIII(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIlIlIlIIllllI(Object var0) {
      return var0 == null;
   }

   public static boolean isNeutralMob(Entity lllllllllllllllIlIIIIIllIlIlIIlI) {
      int var10000;
      if (lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlIlIIlI instanceof EntityPigZombie) && lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlIlIIlI instanceof EntityWolf) && !lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlIlIIlI instanceof EntityEnderman)) {
         var10000 = lIIIIlIIIIlIl[0];
      } else {
         var10000 = lIIIIlIIIIlIl[1];
         "".length();
         if (-" ".length() > ((86 ^ 7) & ~(45 ^ 124))) {
            return (boolean)((101 ^ 76) & ~(95 ^ 118));
         }
      }

      return (boolean)var10000;
   }

   private static boolean lIlIlIlIlIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   public static boolean isLiving(Entity lllllllllllllllIlIIIIIllIlllIIlI) {
      return lllllllllllllllIlIIIIIllIlllIIlI instanceof EntityLivingBase;
   }

   static {
      lIlIlIlIIllIll();
   }

   public static Vec3d getInterpolatedAmount(Entity lllllllllllllllIlIIIIIllIllIIllI, double lllllllllllllllIlIIIIIllIllIIlIl, double lllllllllllllllIlIIIIIllIllIlIII, double lllllllllllllllIlIIIIIllIllIIlll) {
      return new Vec3d((lllllllllllllllIlIIIIIllIllIIllI.field_70165_t - lllllllllllllllIlIIIIIllIllIIllI.field_70142_S) * lllllllllllllllIlIIIIIllIllIIlIl, (lllllllllllllllIlIIIIIllIllIIllI.field_70163_u - lllllllllllllllIlIIIIIllIllIIllI.field_70137_T) * lllllllllllllllIlIIIIIllIllIlIII, (lllllllllllllllIlIIIIIllIllIIllI.field_70161_v - lllllllllllllllIlIIIIIllIllIIllI.field_70136_U) * lllllllllllllllIlIIIIIllIllIIlll);
   }

   private static boolean lIlIlIlIlIIIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   private static boolean lIlIlIlIIlllII(int var0) {
      return var0 != 0;
   }

   public static boolean isPlayer(Entity lllllllllllllllIlIIIIIlIllllIlIl) {
      return lllllllllllllllIlIIIIIlIllllIlIl instanceof EntityPlayer;
   }

   public static Vec3d getInterpolatedAmount(Entity lllllllllllllllIlIIIIIllIlIllIII, double lllllllllllllllIlIIIIIllIlIlIlll) {
      return getInterpolatedAmount(lllllllllllllllIlIIIIIllIlIllIII, lllllllllllllllIlIIIIIllIlIlIlll, lllllllllllllllIlIIIIIllIlIlIlll, lllllllllllllllIlIIIIIllIlIlIlll);
   }

   public static Vec3d getInterpolatedRenderPos(Vec3d lllllllllllllllIlIIIIIllIIllllIl) {
      return (new Vec3d(lllllllllllllllIlIIIIIllIIllllIl.field_72450_a, lllllllllllllllIlIIIIIllIIllllIl.field_72448_b, lllllllllllllllIlIIIIIllIIllllIl.field_72449_c)).func_178786_a(Wrapper.getMinecraft().func_175598_ae().field_78725_b, Wrapper.getMinecraft().func_175598_ae().field_78726_c, Wrapper.getMinecraft().func_175598_ae().field_78723_d);
   }

   public static boolean isFakeLocalPlayer(Entity lllllllllllllllIlIIIIIllIlllIIII) {
      int var10000;
      if (lIlIlIlIIlllll(lllllllllllllllIlIIIIIllIlllIIII) && lIlIlIlIlIIIII(lllllllllllllllIlIIIIIllIlllIIII.func_145782_y(), lIIIIlIIIIlIl[2]) && lIlIlIlIlIIIIl(Wrapper.getPlayer(), lllllllllllllllIlIIIIIllIlllIIII)) {
         var10000 = lIIIIlIIIIlIl[1];
         "".length();
         if (" ".length() < -" ".length()) {
            return (boolean)((178 + 42 - 123 + 92 ^ (253 ^ 168) << " ".length()) << " ".length() & (("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ 32 ^ 7) << " ".length() ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIlIIIIlIl[0];
      }

      return (boolean)var10000;
   }

   public static boolean isAboveWater(Entity lllllllllllllllIlIIIIIllIIlIlIII) {
      return isAboveWater(lllllllllllllllIlIIIIIllIIlIlIII, (boolean)lIIIIlIIIIlIl[0]);
   }

   public static double getRelativeZ(float lllllllllllllllIlIIIIIlIlllIlllI) {
      return (double)MathHelper.func_76134_b(lllllllllllllllIlIIIIIlIlllIlllI * 0.017453292F);
   }

   private static void lIlIlIlIIllIll() {
      lIIIIlIIIIlIl = new int[4];
      lIIIIlIIIIlIl[0] = (36 ^ 109) & ~(28 ^ 85);
      lIIIIlIIIIlIl[1] = " ".length();
      lIIIIlIIIIlIl[2] = -(133 ^ 144 ^ 69 ^ 52);
      lIIIIlIIIIlIl[3] = " ".length() << " ".length();
   }

   private static boolean lIlIlIlIIlllIl(int var0) {
      return var0 == 0;
   }

   public static boolean isDrivenByPlayer(Entity lllllllllllllllIlIIIIIllIIlIlIlI) {
      int var10000;
      if (lIlIlIlIIlllll(Wrapper.getPlayer()) && lIlIlIlIIlllll(lllllllllllllllIlIIIIIllIIlIlIlI) && lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIIlIlIlI.equals(Wrapper.getPlayer().func_184187_bx()))) {
         var10000 = lIIIIlIIIIlIl[1];
         "".length();
         if (" ".length() << " ".length() < 0) {
            return (boolean)(((145 ^ 128) << "   ".length() ^ 105 + 55 - 18 + 25) << " ".length() & ((139 + 98 - 103 + 7 ^ (255 ^ 174) << " ".length()) << " ".length() ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIlIIIIlIl[0];
      }

      return (boolean)var10000;
   }

   public static Vec3d getInterpolatedAmount(Entity lllllllllllllllIlIIIIIllIlIllllI, Vec3d lllllllllllllllIlIIIIIllIlIlllll) {
      return getInterpolatedAmount(lllllllllllllllIlIIIIIllIlIllllI, lllllllllllllllIlIIIIIllIlIlllll.field_72450_a, lllllllllllllllIlIIIIIllIlIlllll.field_72448_b, lllllllllllllllIlIIIIIllIlIlllll.field_72449_c);
   }

   public static Vec3d getInterpolatedRenderPos(Entity lllllllllllllllIlIIIIIllIlIIIIII, float lllllllllllllllIlIIIIIllIIllllll) {
      return getInterpolatedPos(lllllllllllllllIlIIIIIllIlIIIIII, lllllllllllllllIlIIIIIllIIllllll).func_178786_a(Wrapper.getMinecraft().func_175598_ae().field_78725_b, Wrapper.getMinecraft().func_175598_ae().field_78726_c, Wrapper.getMinecraft().func_175598_ae().field_78723_d);
   }

   public static double getRelativeX(float lllllllllllllllIlIIIIIlIllllIIIl) {
      return (double)MathHelper.func_76126_a(-lllllllllllllllIlIIIIIlIllllIIIl * 0.017453292F);
   }

   public static boolean isHostileMob(Entity lllllllllllllllIlIIIIIllIlIIllII) {
      int var10000;
      if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlIIllII.isCreatureType(EnumCreatureType.MONSTER, (boolean)lIIIIlIIIIlIl[0])) && lIlIlIlIIlllIl(isNeutralMob(lllllllllllllllIlIIIIIllIlIIllII))) {
         var10000 = lIIIIlIIIIlIl[1];
         "".length();
         if (-" ".length() >= 0) {
            return (boolean)(((107 ^ 122) << " ".length() ^ 195 ^ 170) & ((43 ^ 68) << " ".length() ^ 125 + 124 - 103 + 3 ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIlIIIIlIl[0];
      }

      return (boolean)var10000;
   }

   public static Vec3d getInterpolatedPos(Entity lllllllllllllllIlIIIIIllIlIIIllI, float lllllllllllllllIlIIIIIllIlIIIlIl) {
      return (new Vec3d(lllllllllllllllIlIIIIIllIlIIIllI.field_70142_S, lllllllllllllllIlIIIIIllIlIIIllI.field_70137_T, lllllllllllllllIlIIIIIllIlIIIllI.field_70136_U)).func_178787_e(getInterpolatedAmount(lllllllllllllllIlIIIIIllIlIIIllI, (double)lllllllllllllllIlIIIIIllIlIIIlIl));
   }

   public static boolean isMobAggressive(Entity lllllllllllllllIlIIIIIllIlIlIlIl) {
      if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlIlIlIl instanceof EntityPigZombie)) {
         if (!lIlIlIlIIlllIl(((EntityPigZombie)lllllllllllllllIlIIIIIllIlIlIlIl).func_184734_db()) || lIlIlIlIIlllII(((EntityPigZombie)lllllllllllllllIlIIIIIllIlIlIlIl).func_175457_ck())) {
            return (boolean)lIIIIlIIIIlIl[1];
         }
      } else {
         if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlIlIlIl instanceof EntityWolf)) {
            int var10000;
            if (lIlIlIlIIlllII(((EntityWolf)lllllllllllllllIlIIIIIllIlIlIlIl).func_70919_bu()) && lIlIlIlIIlllIl(Wrapper.getPlayer().equals(((EntityWolf)lllllllllllllllIlIIIIIllIlIlIlIl).func_70902_q()))) {
               var10000 = lIIIIlIIIIlIl[1];
               "".length();
               if (null != null) {
                  return (boolean)((75 ^ 68) << " ".length() & ~((138 ^ 133) << " ".length()));
               }
            } else {
               var10000 = lIIIIlIIIIlIl[0];
            }

            return (boolean)var10000;
         }

         if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlIlIlIl instanceof EntityEnderman)) {
            return ((EntityEnderman)lllllllllllllllIlIIIIIllIlIlIlIl).func_70823_r();
         }
      }

      return isHostileMob(lllllllllllllllIlIIIIIllIlIlIlIl);
   }

   public static boolean isPassive(Entity lllllllllllllllIlIIIIIllIlllIllI) {
      if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlllIllI instanceof EntityWolf) && lIlIlIlIIlllII(((EntityWolf)lllllllllllllllIlIIIIIllIlllIllI).func_70919_bu())) {
         return (boolean)lIIIIlIIIIlIl[0];
      } else if (lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlllIllI instanceof EntityAnimal) && lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlllIllI instanceof EntityAgeable) && lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlllIllI instanceof EntityTameable) && lIlIlIlIIlllIl(lllllllllllllllIlIIIIIllIlllIllI instanceof EntityAmbientCreature) && !lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlllIllI instanceof EntitySquid)) {
         int var10000;
         if (lIlIlIlIIlllII(lllllllllllllllIlIIIIIllIlllIllI instanceof EntityIronGolem) && lIlIlIlIIllllI(((EntityIronGolem)lllllllllllllllIlIIIIIllIlllIllI).func_70643_av())) {
            var10000 = lIIIIlIIIIlIl[1];
            "".length();
            if ("   ".length() == " ".length() << " ".length()) {
               return (boolean)((98 ^ 125) << " ".length() & ~((62 ^ 33) << " ".length()));
            }
         } else {
            var10000 = lIIIIlIIIIlIl[0];
         }

         return (boolean)var10000;
      } else {
         return (boolean)lIIIIlIIIIlIl[1];
      }
   }

   private static boolean lIlIlIlIIlllll(Object var0) {
      return var0 != null;
   }

   public static double[] calculateLookAt(double lllllllllllllllIlIIIIIllIIIIIIII, double lllllllllllllllIlIIIIIlIlllllllI, double lllllllllllllllIlIIIIIllIIIIlIII, EntityPlayer lllllllllllllllIlIIIIIlIllllllII) {
      double lllllllllllllllIlIIIIIllIIIIIllI = lllllllllllllllIlIIIIIlIllllllII.field_70165_t - lllllllllllllllIlIIIIIllIIIIIIII;
      double lllllllllllllllIlIIIIIllIIIIIlIl = lllllllllllllllIlIIIIIlIllllllII.field_70163_u - lllllllllllllllIlIIIIIlIlllllllI;
      double lllllllllllllllIlIIIIIllIIIIIlII = lllllllllllllllIlIIIIIlIllllllII.field_70161_v - lllllllllllllllIlIIIIIllIIIIlIII;
      double lllllllllllllllIlIIIIIllIIIIIIll = Math.sqrt(lllllllllllllllIlIIIIIllIIIIIllI * lllllllllllllllIlIIIIIllIIIIIllI + lllllllllllllllIlIIIIIllIIIIIlIl * lllllllllllllllIlIIIIIllIIIIIlIl + lllllllllllllllIlIIIIIllIIIIIlII * lllllllllllllllIlIIIIIllIIIIIlII);
      lllllllllllllllIlIIIIIllIIIIIllI /= lllllllllllllllIlIIIIIllIIIIIIll;
      lllllllllllllllIlIIIIIllIIIIIlIl /= lllllllllllllllIlIIIIIllIIIIIIll;
      lllllllllllllllIlIIIIIllIIIIIlII /= lllllllllllllllIlIIIIIllIIIIIIll;
      double lllllllllllllllIlIIIIIllIIIIIIlI = Math.asin(lllllllllllllllIlIIIIIllIIIIIlIl);
      double lllllllllllllllIlIIIIIllIIIIIIIl = Math.atan2(lllllllllllllllIlIIIIIllIIIIIlII, lllllllllllllllIlIIIIIllIIIIIllI);
      lllllllllllllllIlIIIIIllIIIIIIlI = lllllllllllllllIlIIIIIllIIIIIIlI * 180.0D / 3.141592653589793D;
      lllllllllllllllIlIIIIIllIIIIIIIl = lllllllllllllllIlIIIIIllIIIIIIIl * 180.0D / 3.141592653589793D;
      lllllllllllllllIlIIIIIllIIIIIIIl += 90.0D;
      double[] var10000 = new double[lIIIIlIIIIlIl[3]];
      var10000[lIIIIlIIIIlIl[0]] = lllllllllllllllIlIIIIIllIIIIIIIl;
      var10000[lIIIIlIIIIlIl[1]] = lllllllllllllllIlIIIIIllIIIIIIlI;
      return var10000;
   }
}
