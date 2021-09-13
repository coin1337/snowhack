package rr.snowhack.snow.util;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class WorldUtils {
   // $FF: synthetic field
   static Minecraft mc;
   // $FF: synthetic field
   private static final int[] lllIllllllll;

   public static void rotate(float lllllllllllllllIlIllIIIIIllIIlIl, float lllllllllllllllIlIllIIIIIllIIllI) {
      mc.field_71439_g.field_70177_z = lllllllllllllllIlIllIIIIIllIIlIl;
      mc.field_71439_g.field_70125_A = lllllllllllllllIlIllIIIIIllIIllI;
   }

   private static boolean lIIlllIllIlIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIlllIllIllII(int var0) {
      return var0 != 0;
   }

   private static int lIIlllIllIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIlllIllIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public static BlockPos getRelativeBlockPos(EntityPlayer lllllllllllllllIlIllIIIIIlIIlllI, int lllllllllllllllIlIllIIIIIlIIllIl, int lllllllllllllllIlIllIIIIIlIlIIlI, int lllllllllllllllIlIllIIIIIlIlIIIl) {
      int[] var10000 = new int[lllIllllllll[5]];
      var10000[lllIllllllll[0]] = (int)lllllllllllllllIlIllIIIIIlIIlllI.field_70165_t;
      var10000[lllIllllllll[2]] = (int)lllllllllllllllIlIllIIIIIlIIlllI.field_70163_u;
      var10000[lllIllllllll[1]] = (int)lllllllllllllllIlIllIIIIIlIIlllI.field_70161_v;
      int[] lllllllllllllllIlIllIIIIIlIlIIII = var10000;
      BlockPos lllllllllllllllIlIllIIIIIlIIlIIl;
      if (lIIlllIlllIIIl(lIIlllIllIllll(lllllllllllllllIlIllIIIIIlIIlllI.field_70165_t, 0.0D)) && lIIlllIlllIIIl(lIIlllIllIllll(lllllllllllllllIlIllIIIIIlIIlllI.field_70161_v, 0.0D))) {
         lllllllllllllllIlIllIIIIIlIIlIIl = new BlockPos(lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[0]] + lllllllllllllllIlIllIIIIIlIIllIl - lllIllllllll[2], lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[2]] + lllllllllllllllIlIllIIIIIlIlIIlI, lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[1]] + lllllllllllllllIlIllIIIIIlIlIIIl - lllIllllllll[2]);
         "".length();
         if ("   ".length() != "   ".length()) {
            return null;
         }
      } else if (lIIlllIlllIIIl(lIIlllIllIllll(lllllllllllllllIlIllIIIIIlIIlllI.field_70165_t, 0.0D)) && lIIlllIlllIIlI(lIIlllIlllIIII(lllllllllllllllIlIllIIIIIlIIlllI.field_70161_v, 0.0D))) {
         lllllllllllllllIlIllIIIIIlIIlIIl = new BlockPos(lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[0]] + lllllllllllllllIlIllIIIIIlIIllIl - lllIllllllll[2], lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[2]] + lllllllllllllllIlIllIIIIIlIlIIlI, lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[1]] + lllllllllllllllIlIllIIIIIlIlIIIl);
         "".length();
         if (-" ".length() >= 0) {
            return null;
         }
      } else if (lIIlllIlllIIlI(lIIlllIlllIIII(lllllllllllllllIlIllIIIIIlIIlllI.field_70165_t, 0.0D)) && lIIlllIlllIIIl(lIIlllIllIllll(lllllllllllllllIlIllIIIIIlIIlllI.field_70161_v, 0.0D))) {
         lllllllllllllllIlIllIIIIIlIIlIIl = new BlockPos(lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[0]] + lllllllllllllllIlIllIIIIIlIIllIl, lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[2]] + lllllllllllllllIlIllIIIIIlIlIIlI, lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[1]] + lllllllllllllllIlIllIIIIIlIlIIIl - lllIllllllll[2]);
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         lllllllllllllllIlIllIIIIIlIIlIIl = new BlockPos(lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[0]] + lllllllllllllllIlIllIIIIIlIIllIl, lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[2]] + lllllllllllllllIlIllIIIIIlIlIIlI, lllllllllllllllIlIllIIIIIlIlIIII[lllIllllllll[1]] + lllllllllllllllIlIllIIIIIlIlIIIl);
      }

      return lllllllllllllllIlIllIIIIIlIIlIIl;
   }

   private static boolean lIIlllIlllIIIl(int var0) {
      return var0 < 0;
   }

   private static void lIIlllIllIlIIl() {
      lllIllllllll = new int[6];
      lllIllllllll[0] = "   ".length() << (92 ^ 89) & ~("   ".length() << (127 ^ 122));
      lllIllllllll[1] = " ".length() << " ".length();
      lllIllllllll[2] = " ".length();
      lllIllllllll[3] = 14 ^ 35 ^ (27 ^ 18) << (" ".length() << " ".length());
      lllIllllllll[4] = -" ".length();
      lllIllllllll[5] = "   ".length();
   }

   public static int findItem(Item lllllllllllllllIlIllIIIIlIIIlIlI) {
      try {
         int lllllllllllllllIlIllIIIIlIIIllII = lllIllllllll[0];

         while(lIIlllIllIlIll(lllllllllllllllIlIllIIIIlIIIllII, lllIllllllll[3])) {
            short lllllllllllllllIlIllIIIIlIIIlIII = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIllIIIIlIIIllII);
            if (lIIlllIllIlllI(lllllllllllllllIlIllIIIIlIIIlIlI, lllllllllllllllIlIllIIIIlIIIlIII.func_77973_b())) {
               return lllllllllllllllIlIllIIIIlIIIllII;
            }

            ++lllllllllllllllIlIllIIIIlIIIllII;
            "".length();
            if (" ".length() < " ".length()) {
               return (32 ^ 43) << "   ".length() & ~((54 ^ 61) << "   ".length());
            }
         }
      } catch (Exception var3) {
         return lllIllllllll[4];
      }

      "".length();
      if (((125 ^ 56 ^ (113 ^ 118) << (" ".length() << (" ".length() << " ".length()))) & (219 ^ 138 ^ (120 ^ 97) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
         return " ".length() << ((1 ^ 12) << (" ".length() << " ".length()) ^ 146 ^ 163) & (" ".length() << ((166 ^ 177) << "   ".length() ^ 32 + 19 - 35 + 173) ^ -" ".length());
      } else {
         return lllIllllllll[4];
      }
   }

   private static boolean lIIlllIllIlllI(Object var0, Object var1) {
      return var0 == var1;
   }

   public static void placeBlock(EnumHand lllllllllllllllIlIllIIIIlIlIIlII, BlockPos lllllllllllllllIlIllIIIIlIlIIllI) {
      Vec3d lllllllllllllllIlIllIIIIlIlIIlIl = new Vec3d(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u + (double)mc.field_71439_g.func_70047_e(), mc.field_71439_g.field_70161_v);
      long lllllllllllllllIlIllIIIIlIlIIIIl = EnumFacing.values();
      int lllllllllllllllIlIllIIIIlIlIIIII = lllllllllllllllIlIllIIIIlIlIIIIl.length;
      int lllllllllllllllIlIllIIIIlIIlllll = lllIllllllll[0];

      do {
         if (!lIIlllIllIlIll(lllllllllllllllIlIllIIIIlIIlllll, lllllllllllllllIlIllIIIIlIlIIIII)) {
            return;
         }

         double lllllllllllllllIlIllIIIIlIIllllI = lllllllllllllllIlIllIIIIlIlIIIIl[lllllllllllllllIlIllIIIIlIIlllll];
         BlockPos lllllllllllllllIlIllIIIIlIlIlIlI = lllllllllllllllIlIllIIIIlIlIIllI.func_177972_a(lllllllllllllllIlIllIIIIlIIllllI);
         EnumFacing lllllllllllllllIlIllIIIIlIlIlIIl = lllllllllllllllIlIllIIIIlIIllllI.func_176734_d();
         if (lIIlllIllIllII(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIIIIlIlIlIlI).func_177230_c().func_176209_a(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIIIIlIlIlIlI), (boolean)lllIllllllll[0]))) {
            Vec3d lllllllllllllllIlIllIIIIlIlIlIll = (new Vec3d(lllllllllllllllIlIllIIIIlIlIlIlI)).func_72441_c(0.5D, 0.5D, 0.5D).func_178787_e((new Vec3d(lllllllllllllllIlIllIIIIlIlIlIIl.func_176730_m())).func_186678_a(0.5D));
            if (lIIlllIllIllIl(lIIlllIllIlIlI(lllllllllllllllIlIllIIIIlIlIIlIl.func_72436_e(lllllllllllllllIlIllIIIIlIlIlIll), 18.0625D))) {
               double lllllllllllllllIlIllIIIIlIllIIlI = lllllllllllllllIlIllIIIIlIlIlIll.field_72450_a - lllllllllllllllIlIllIIIIlIlIIlIl.field_72450_a;
               Exception lllllllllllllllIlIllIIIIlIIllIIl = lllllllllllllllIlIllIIIIlIlIlIll.field_72448_b - lllllllllllllllIlIllIIIIlIlIIlIl.field_72448_b;
               double lllllllllllllllIlIllIIIIlIllIIII = lllllllllllllllIlIllIIIIlIlIlIll.field_72449_c - lllllllllllllllIlIllIIIIlIlIIlIl.field_72449_c;
               double lllllllllllllllIlIllIIIIlIlIllll = Math.sqrt(lllllllllllllllIlIllIIIIlIllIIlI * lllllllllllllllIlIllIIIIlIllIIlI + lllllllllllllllIlIllIIIIlIllIIII * lllllllllllllllIlIllIIIIlIllIIII);
               float lllllllllllllllIlIllIIIIlIlIlllI = (float)Math.toDegrees(Math.atan2(lllllllllllllllIlIllIIIIlIllIIII, lllllllllllllllIlIllIIIIlIllIIlI)) - 90.0F;
               float lllllllllllllllIlIllIIIIlIlIllIl = (float)(-Math.toDegrees(Math.atan2(lllllllllllllllIlIllIIIIlIIllIIl, lllllllllllllllIlIllIIIIlIlIllll)));
               float[] var10000 = new float[lllIllllllll[1]];
               var10000[lllIllllllll[0]] = mc.field_71439_g.field_70177_z + MathHelper.func_76142_g(lllllllllllllllIlIllIIIIlIlIlllI - mc.field_71439_g.field_70177_z);
               var10000[lllIllllllll[2]] = mc.field_71439_g.field_70125_A + MathHelper.func_76142_g(lllllllllllllllIlIllIIIIlIlIllIl - mc.field_71439_g.field_70125_A);
               float lllllllllllllllIlIllIIIIlIIlIlII = var10000;
               mc.field_71439_g.field_71174_a.func_147297_a(new Rotation(lllllllllllllllIlIllIIIIlIIlIlII[lllIllllllll[0]], lllllllllllllllIlIllIIIIlIIlIlII[lllIllllllll[2]], mc.field_71439_g.field_70122_E));
               mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_SNEAKING));
               mc.field_71442_b.func_187099_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIlIllIIIIlIlIlIlI, lllllllllllllllIlIllIIIIlIlIlIIl, lllllllllllllllIlIllIIIIlIlIlIll, lllllllllllllllIlIllIIIIlIlIIlII);
               "".length();
               mc.field_71439_g.func_184609_a(lllllllllllllllIlIllIIIIlIlIIlII);
               mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
               return;
            }
         }

         ++lllllllllllllllIlIllIIIIlIIlllll;
         "".length();
      } while(" ".length() << " ".length() != "   ".length());

   }

   public static void placeBlockMainHand(BlockPos lllllllllllllllIlIllIIIIllIIIlIl) {
      placeBlock(EnumHand.MAIN_HAND, lllllllllllllllIlIllIIIIllIIIlIl);
   }

   private static boolean lIIlllIlllIIlI(int var0) {
      return var0 > 0;
   }

   public static double[] calculateLookAt(double lllllllllllllllIlIllIIIIIlllllIl, double lllllllllllllllIlIllIIIIIlllIIIl, double lllllllllllllllIlIllIIIIIllllIll, EntityPlayer lllllllllllllllIlIllIIIIIllllIlI) {
      double lllllllllllllllIlIllIIIIIllllIIl = lllllllllllllllIlIllIIIIIllllIlI.field_70165_t - lllllllllllllllIlIllIIIIIlllllIl;
      int lllllllllllllllIlIllIIIIIllIllIl = lllllllllllllllIlIllIIIIIllllIlI.field_70163_u - lllllllllllllllIlIllIIIIIlllIIIl;
      boolean lllllllllllllllIlIllIIIIIllIllII = lllllllllllllllIlIllIIIIIllllIlI.field_70161_v - lllllllllllllllIlIllIIIIIllllIll;
      byte lllllllllllllllIlIllIIIIIllIlIll = Math.sqrt(lllllllllllllllIlIllIIIIIllllIIl * lllllllllllllllIlIllIIIIIllllIIl + lllllllllllllllIlIllIIIIIllIllIl * lllllllllllllllIlIllIIIIIllIllIl + lllllllllllllllIlIllIIIIIllIllII * lllllllllllllllIlIllIIIIIllIllII);
      lllllllllllllllIlIllIIIIIllllIIl /= lllllllllllllllIlIllIIIIIllIlIll;
      lllllllllllllllIlIllIIIIIllIllIl /= lllllllllllllllIlIllIIIIIllIlIll;
      lllllllllllllllIlIllIIIIIllIllII /= lllllllllllllllIlIllIIIIIllIlIll;
      double lllllllllllllllIlIllIIIIIlllIlIl = Math.asin(lllllllllllllllIlIllIIIIIllIllIl);
      String lllllllllllllllIlIllIIIIIlllIIlI = Math.atan2(lllllllllllllllIlIllIIIIIllIllII, lllllllllllllllIlIllIIIIIllllIIl);
      lllllllllllllllIlIllIIIIIlllIlIl = lllllllllllllllIlIllIIIIIlllIlIl * 180.0D / 3.141592653589793D;
      lllllllllllllllIlIllIIIIIlllIIlI = lllllllllllllllIlIllIIIIIlllIIlI * 180.0D / 3.141592653589793D;
      lllllllllllllllIlIllIIIIIlllIIlI += 90.0D;
      double[] var10000 = new double[lllIllllllll[1]];
      var10000[lllIllllllll[0]] = lllllllllllllllIlIllIIIIIlllIIlI;
      var10000[lllIllllllll[2]] = lllllllllllllllIlIllIIIIIlllIlIl;
      return var10000;
   }

   private static boolean lIIlllIllIllIl(int var0) {
      return var0 <= 0;
   }

   public static void rotate(double[] lllllllllllllllIlIllIIIIIllIIIIl) {
      mc.field_71439_g.field_70177_z = (float)lllllllllllllllIlIllIIIIIllIIIIl[lllIllllllll[0]];
      mc.field_71439_g.field_70125_A = (float)lllllllllllllllIlIllIIIIIllIIIIl[lllIllllllll[2]];
   }

   private static int lIIlllIlllIIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public static void lookAtBlock(BlockPos lllllllllllllllIlIllIIIIIlIlllll) {
      rotate(calculateLookAt((double)lllllllllllllllIlIllIIIIIlIlllll.func_177958_n(), (double)lllllllllllllllIlIllIIIIIlIlllll.func_177956_o(), (double)lllllllllllllllIlIllIIIIIlIlllll.func_177952_p(), mc.field_71439_g));
   }

   static {
      lIIlllIllIlIIl();
      mc = Minecraft.func_71410_x();
   }

   public static int findBlock(Block lllllllllllllllIlIllIIIIlIIlIIlI) {
      return findItem((new ItemStack(lllllllllllllllIlIllIIIIlIIlIIlI)).func_77973_b());
   }
}
