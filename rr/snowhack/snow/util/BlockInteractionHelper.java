package rr.snowhack.snow.util;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketPlayer.Rotation;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class BlockInteractionHelper {
   // $FF: synthetic field
   private static final int[] lIIIIllIIIllI;
   // $FF: synthetic field
   public static final List shulkerList;
   // $FF: synthetic field
   public static final List blackList;
   // $FF: synthetic field
   private static final Minecraft mc;

   public static void faceVectorPacketInstant(Vec3d lllllllllllllllIIlllllIlIIlIlIll) {
      float[] lllllllllllllllIIlllllIlIIlIllII = getLegitRotations(lllllllllllllllIIlllllIlIIlIlIll);
      Wrapper.getPlayer().field_71174_a.func_147297_a(new Rotation(lllllllllllllllIIlllllIlIIlIllII[lIIIIllIIIllI[1]], lllllllllllllllIIlllllIlIIlIllII[lIIIIllIIIllI[0]], Wrapper.getPlayer().field_70122_E));
   }

   static {
      lIlIllIIIIIIll();
      Block[] var10000 = new Block[lIIIIllIIIllI[4]];
      var10000[lIIIIllIIIllI[1]] = Blocks.field_150477_bB;
      var10000[lIIIIllIIIllI[0]] = Blocks.field_150486_ae;
      var10000[lIIIIllIIIllI[3]] = Blocks.field_150447_bR;
      var10000[lIIIIllIIIllI[5]] = Blocks.field_150462_ai;
      var10000[lIIIIllIIIllI[2]] = Blocks.field_150467_bQ;
      var10000[lIIIIllIIIllI[6]] = Blocks.field_150382_bo;
      var10000[lIIIIllIIIllI[7]] = Blocks.field_150438_bZ;
      var10000[lIIIIllIIIllI[8]] = Blocks.field_150409_cd;
      var10000[lIIIIllIIIllI[9]] = Blocks.field_150367_z;
      blackList = Arrays.asList(var10000);
      var10000 = new Block[lIIIIllIIIllI[10]];
      var10000[lIIIIllIIIllI[1]] = Blocks.field_190977_dl;
      var10000[lIIIIllIIIllI[0]] = Blocks.field_190978_dm;
      var10000[lIIIIllIIIllI[3]] = Blocks.field_190979_dn;
      var10000[lIIIIllIIIllI[5]] = Blocks.field_190980_do;
      var10000[lIIIIllIIIllI[2]] = Blocks.field_190981_dp;
      var10000[lIIIIllIIIllI[6]] = Blocks.field_190982_dq;
      var10000[lIIIIllIIIllI[7]] = Blocks.field_190983_dr;
      var10000[lIIIIllIIIllI[8]] = Blocks.field_190984_ds;
      var10000[lIIIIllIIIllI[9]] = Blocks.field_190985_dt;
      var10000[lIIIIllIIIllI[4]] = Blocks.field_190986_du;
      var10000[lIIIIllIIIllI[11]] = Blocks.field_190987_dv;
      var10000[lIIIIllIIIllI[12]] = Blocks.field_190988_dw;
      var10000[lIIIIllIIIllI[13]] = Blocks.field_190989_dx;
      var10000[lIIIIllIIIllI[14]] = Blocks.field_190990_dy;
      var10000[lIIIIllIIIllI[15]] = Blocks.field_190991_dz;
      var10000[lIIIIllIIIllI[16]] = Blocks.field_190975_dA;
      shulkerList = Arrays.asList(var10000);
      mc = Minecraft.func_71410_x();
   }

   public static boolean blockCheckNonBlock(ItemStack lllllllllllllllIIlllllIlIllIIIIl) {
      return lllllllllllllllIIlllllIlIllIIIIl.func_77973_b() instanceof ItemBlock;
   }

   public static float[] calcAngle(Vec3d lllllllllllllllIIlllllIlIIIIIIlI, Vec3d lllllllllllllllIIlllllIIlllllIll) {
      double lllllllllllllllIIlllllIlIIIIIIII = lllllllllllllllIIlllllIIlllllIll.field_72450_a - lllllllllllllllIIlllllIlIIIIIIlI.field_72450_a;
      byte lllllllllllllllIIlllllIIlllllIIl = (lllllllllllllllIIlllllIIlllllIll.field_72448_b - lllllllllllllllIIlllllIlIIIIIIlI.field_72448_b) * -1.0D;
      float lllllllllllllllIIlllllIIlllllIII = lllllllllllllllIIlllllIIlllllIll.field_72449_c - lllllllllllllllIIlllllIlIIIIIIlI.field_72449_c;
      double lllllllllllllllIIlllllIIllllllIl = (double)MathHelper.func_76133_a(lllllllllllllllIIlllllIlIIIIIIII * lllllllllllllllIIlllllIlIIIIIIII + lllllllllllllllIIlllllIIlllllIII * lllllllllllllllIIlllllIIlllllIII);
      float[] var10000 = new float[lIIIIllIIIllI[3]];
      var10000[lIIIIllIIIllI[1]] = (float)MathHelper.func_76138_g(Math.toDegrees(Math.atan2(lllllllllllllllIIlllllIIlllllIII, lllllllllllllllIIlllllIlIIIIIIII)) - 90.0D);
      var10000[lIIIIllIIIllI[0]] = (float)MathHelper.func_76138_g(Math.toDegrees(Math.atan2(lllllllllllllllIIlllllIIlllllIIl, lllllllllllllllIIlllllIIllllllIl)));
      return var10000;
   }

   private static int lIlIllIIIIIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public static boolean hotbarSlotCheckEmpty(ItemStack lllllllllllllllIIlllllIlIllIIlII) {
      int var10000;
      if (lIlIllIIIIIlII(lllllllllllllllIIlllllIlIllIIlII, ItemStack.field_190927_a)) {
         var10000 = lIIIIllIIIllI[0];
         "".length();
         if ((((45 ^ 48) << (" ".length() << " ".length()) ^ 115 ^ 76) & ("   ".length() ^ (203 ^ 194) << "   ".length() ^ -" ".length())) >= "   ".length()) {
            return (boolean)((203 + 136 - 191 + 67 ^ (64 ^ 11) << " ".length()) & (178 + 23 - 193 + 189 ^ (20 ^ 53) << (" ".length() << " ".length()) ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIllIIIllI[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIllIIIIlIIl(int var0) {
      return var0 == 0;
   }

   private static Block getBlock(BlockPos lllllllllllllllIIlllllIlIIIllIll) {
      return getState(lllllllllllllllIIlllllIlIIIllIll).func_177230_c();
   }

   private static boolean hasNeighbour(BlockPos lllllllllllllllIIlllllIIlllIllIl) {
      byte lllllllllllllllIIlllllIIlllIllII = EnumFacing.values();
      double lllllllllllllllIIlllllIIlllIlIll = lllllllllllllllIIlllllIIlllIllII.length;
      int lllllllllllllllIIlllllIIlllIlIlI = lIIIIllIIIllI[1];

      do {
         if (!lIlIllIIIIIllI(lllllllllllllllIIlllllIIlllIlIlI, lllllllllllllllIIlllllIIlllIlIll)) {
            return (boolean)lIIIIllIIIllI[1];
         }

         long lllllllllllllllIIlllllIIlllIlIIl = lllllllllllllllIIlllllIIlllIllII[lllllllllllllllIIlllllIIlllIlIlI];
         double lllllllllllllllIIlllllIIlllIlIII = lllllllllllllllIIlllllIIlllIllIl.func_177972_a(lllllllllllllllIIlllllIIlllIlIIl);
         if (lIlIllIIIIlIIl(Wrapper.getWorld().func_180495_p(lllllllllllllllIIlllllIIlllIlIII).func_185904_a().func_76222_j())) {
            return (boolean)lIIIIllIIIllI[0];
         }

         ++lllllllllllllllIIlllllIIlllIlIlI;
         "".length();
      } while(((247 ^ 186 ^ (68 ^ 67) << (" ".length() << (" ".length() << " ".length()))) & ((216 ^ 199) << "   ".length() ^ 108 + 150 - 74 + 13 ^ -" ".length())) == 0);

      return (boolean)((25 + 31 - -74 + 45 ^ (228 ^ 177) << " ".length()) << (" ".length() << " ".length()) & ((32 ^ 89 ^ (16 ^ 15) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length()));
   }

   private static PlayerControllerMP getPlayerController() {
      return Minecraft.func_71410_x().field_71442_b;
   }

   private static void lIlIllIIIIIIll() {
      lIIIIllIIIllI = new int[17];
      lIIIIllIIIllI[0] = " ".length();
      lIIIIllIIIllI[1] = ((175 ^ 166) << (" ".length() << " ".length()) ^ 67 ^ 48) & (93 ^ 124 ^ (175 ^ 148) << " ".length() ^ -" ".length());
      lIIIIllIIIllI[2] = " ".length() << (" ".length() << " ".length());
      lIIIIllIIIllI[3] = " ".length() << " ".length();
      lIIIIllIIIllI[4] = 34 + 36 - 17 + 78 ^ (240 ^ 181) << " ".length();
      lIIIIllIIIllI[5] = "   ".length();
      lIIIIllIIIllI[6] = 246 ^ 159 ^ (150 ^ 141) << (" ".length() << " ".length());
      lIIIIllIIIllI[7] = "   ".length() << " ".length();
      lIIIIllIIIllI[8] = 111 + 179 - 255 + 164 ^ "   ".length() << ("   ".length() << " ".length());
      lIIIIllIIIllI[9] = " ".length() << "   ".length();
      lIIIIllIIIllI[10] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIllIIIllI[11] = (13 ^ 26 ^ (206 ^ 199) << " ".length()) << " ".length();
      lIIIIllIIIllI[12] = 2 ^ 9;
      lIIIIllIIIllI[13] = "   ".length() << (" ".length() << " ".length());
      lIIIIllIIIllI[14] = 163 ^ 150 ^ (83 ^ 84) << "   ".length();
      lIIIIllIIIllI[15] = (122 ^ 31 ^ (20 ^ 37) << " ".length()) << " ".length();
      lIIIIllIIIllI[16] = 40 ^ 39;
   }

   public static void placeBlockScaffold(BlockPos lllllllllllllllIIlllllIlIlIlIIII) {
      Vec3d lllllllllllllllIIlllllIlIlIlIIIl = new Vec3d(Wrapper.getPlayer().field_70165_t, Wrapper.getPlayer().field_70163_u + (double)Wrapper.getPlayer().func_70047_e(), Wrapper.getPlayer().field_70161_v);
      short lllllllllllllllIIlllllIlIlIIlllI = EnumFacing.values();
      long lllllllllllllllIIlllllIlIlIIllIl = lllllllllllllllIIlllllIlIlIIlllI.length;
      int lllllllllllllllIIlllllIlIlIIllII = lIIIIllIIIllI[1];

      do {
         if (!lIlIllIIIIIllI(lllllllllllllllIIlllllIlIlIIllII, lllllllllllllllIIlllllIlIlIIllIl)) {
            return;
         }

         EnumFacing lllllllllllllllIIlllllIlIlIlIIll = lllllllllllllllIIlllllIlIlIIlllI[lllllllllllllllIIlllllIlIlIIllII];
         long lllllllllllllllIIlllllIlIlIIlIlI = lllllllllllllllIIlllllIlIlIlIIII.func_177972_a(lllllllllllllllIIlllllIlIlIlIIll);
         EnumFacing lllllllllllllllIIlllllIlIlIlIlII = lllllllllllllllIIlllllIlIlIlIIll.func_176734_d();
         if (lIlIllIIIIIlll(canBeClicked(lllllllllllllllIIlllllIlIlIIlIlI))) {
            Vec3d lllllllllllllllIIlllllIlIlIlIllI = (new Vec3d(lllllllllllllllIIlllllIlIlIIlIlI)).func_72441_c(0.5D, 0.5D, 0.5D).func_178787_e((new Vec3d(lllllllllllllllIIlllllIlIlIlIlII.func_176730_m())).func_178789_a(0.5F));
            if (lIlIllIIIIlIII(lIlIllIIIIIlIl(lllllllllllllllIIlllllIlIlIlIIIl.func_72436_e(lllllllllllllllIIlllllIlIlIlIllI), 18.0625D))) {
               faceVectorPacketInstant(lllllllllllllllIIlllllIlIlIlIllI);
               processRightClickBlock(lllllllllllllllIIlllllIlIlIIlIlI, lllllllllllllllIIlllllIlIlIlIlII, lllllllllllllllIIlllllIlIlIlIllI);
               Wrapper.getPlayer().func_184609_a(EnumHand.MAIN_HAND);
               mc.field_71467_ac = lIIIIllIIIllI[2];
               return;
            }
         }

         ++lllllllllllllllIIlllllIlIlIIllII;
         "".length();
      } while((90 ^ 95) != 0);

   }

   private static boolean lIlIllIIIIIlll(int var0) {
      return var0 != 0;
   }

   private static Vec3d getEyesPos() {
      return new Vec3d(Wrapper.getPlayer().field_70165_t, Wrapper.getPlayer().field_70163_u + (double)Wrapper.getPlayer().func_70047_e(), Wrapper.getPlayer().field_70161_v);
   }

   public static boolean canBeClicked(BlockPos lllllllllllllllIIlllllIlIIIllllI) {
      return getBlock(lllllllllllllllIIlllllIlIIIllllI).func_176209_a(getState(lllllllllllllllIIlllllIlIIIllllI), (boolean)lIIIIllIIIllI[1]);
   }

   public static EnumFacing getPlaceableSide(BlockPos lllllllllllllllIIlllllIIllIlllIl) {
      Exception lllllllllllllllIIlllllIIllIllIll = EnumFacing.values();
      short lllllllllllllllIIlllllIIllIllIlI = lllllllllllllllIIlllllIIllIllIll.length;
      int lllllllllllllllIIlllllIIllIllIIl = lIIIIllIIIllI[1];

      do {
         if (!lIlIllIIIIIllI(lllllllllllllllIIlllllIIllIllIIl, lllllllllllllllIIlllllIIllIllIlI)) {
            return null;
         }

         EnumFacing lllllllllllllllIIlllllIIllIllllI = lllllllllllllllIIlllllIIllIllIll[lllllllllllllllIIlllllIIllIllIIl];
         BlockPos lllllllllllllllIIlllllIIllIlllll = lllllllllllllllIIlllllIIllIlllIl.func_177972_a(lllllllllllllllIIlllllIIllIllllI);
         if (lIlIllIIIIIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIIlllllIIllIlllll).func_177230_c().func_176209_a(mc.field_71441_e.func_180495_p(lllllllllllllllIIlllllIIllIlllll), (boolean)lIIIIllIIIllI[1]))) {
            if (!lIlIllIIIIIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIIlllllIIllIlllll).func_185904_a().func_76222_j())) {
               return lllllllllllllllIIlllllIIllIllllI;
            }

            "".length();
            if (" ".length() == 0) {
               return null;
            }
         }

         ++lllllllllllllllIIlllllIIllIllIIl;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > " ".length());

      return null;
   }

   private static boolean lIlIllIIIIlIII(int var0) {
      return var0 <= 0;
   }

   private static float[] getLegitRotations(Vec3d lllllllllllllllIIlllllIlIIllIlll) {
      Vec3d lllllllllllllllIIlllllIlIIlllllI = getEyesPos();
      short lllllllllllllllIIlllllIlIIllIlIl = lllllllllllllllIIlllllIlIIllIlll.field_72450_a - lllllllllllllllIIlllllIlIIlllllI.field_72450_a;
      double lllllllllllllllIIlllllIlIIllllII = lllllllllllllllIIlllllIlIIllIlll.field_72448_b - lllllllllllllllIIlllllIlIIlllllI.field_72448_b;
      double lllllllllllllllIIlllllIlIIlllIll = lllllllllllllllIIlllllIlIIllIlll.field_72449_c - lllllllllllllllIIlllllIlIIlllllI.field_72449_c;
      double lllllllllllllllIIlllllIlIIlllIlI = Math.sqrt(lllllllllllllllIIlllllIlIIllIlIl * lllllllllllllllIIlllllIlIIllIlIl + lllllllllllllllIIlllllIlIIlllIll * lllllllllllllllIIlllllIlIIlllIll);
      float lllllllllllllllIIlllllIlIIlllIIl = (float)Math.toDegrees(Math.atan2(lllllllllllllllIIlllllIlIIlllIll, lllllllllllllllIIlllllIlIIllIlIl)) - 90.0F;
      float lllllllllllllllIIlllllIlIIlllIII = (float)(-Math.toDegrees(Math.atan2(lllllllllllllllIIlllllIlIIllllII, lllllllllllllllIIlllllIlIIlllIlI)));
      float[] var10000 = new float[lIIIIllIIIllI[3]];
      var10000[lIIIIllIIIllI[1]] = Wrapper.getPlayer().field_70177_z + MathHelper.func_76142_g(lllllllllllllllIIlllllIlIIlllIIl - Wrapper.getPlayer().field_70177_z);
      var10000[lIIIIllIIIllI[0]] = Wrapper.getPlayer().field_70125_A + MathHelper.func_76142_g(lllllllllllllllIIlllllIlIIlllIII - Wrapper.getPlayer().field_70125_A);
      return var10000;
   }

   public static boolean checkForNeighbours(BlockPos lllllllllllllllIIlllllIlIIIIllll) {
      if (lIlIllIIIIlIIl(hasNeighbour(lllllllllllllllIIlllllIlIIIIllll))) {
         long lllllllllllllllIIlllllIlIIIIllIl = EnumFacing.values();
         long lllllllllllllllIIlllllIlIIIIllII = lllllllllllllllIIlllllIlIIIIllIl.length;
         int lllllllllllllllIIlllllIlIIIIlIll = lIIIIllIIIllI[1];

         do {
            if (!lIlIllIIIIIllI(lllllllllllllllIIlllllIlIIIIlIll, lllllllllllllllIIlllllIlIIIIllII)) {
               return (boolean)lIIIIllIIIllI[1];
            }

            long lllllllllllllllIIlllllIlIIIIlIlI = lllllllllllllllIIlllllIlIIIIllIl[lllllllllllllllIIlllllIlIIIIlIll];
            BlockPos lllllllllllllllIIlllllIlIIIlIIIl = lllllllllllllllIIlllllIlIIIIllll.func_177972_a(lllllllllllllllIIlllllIlIIIIlIlI);
            if (lIlIllIIIIIlll(hasNeighbour(lllllllllllllllIIlllllIlIIIlIIIl))) {
               return (boolean)lIIIIllIIIllI[0];
            }

            ++lllllllllllllllIIlllllIlIIIIlIll;
            "".length();
         } while(" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length()));

         return (boolean)((110 ^ 103) << (" ".length() << " ".length()) & ~((45 ^ 36) << (" ".length() << " ".length())));
      } else {
         return (boolean)lIIIIllIIIllI[0];
      }
   }

   private static IBlockState getState(BlockPos lllllllllllllllIIlllllIlIIIllIIl) {
      return Wrapper.getWorld().func_180495_p(lllllllllllllllIIlllllIlIIIllIIl);
   }

   private static boolean lIlIllIIIIIlII(Object var0, Object var1) {
      return var0 != var1;
   }

   private static void processRightClickBlock(BlockPos lllllllllllllllIIlllllIlIIlIIIll, EnumFacing lllllllllllllllIIlllllIlIIlIIIlI, Vec3d lllllllllllllllIIlllllIlIIlIIIIl) {
      getPlayerController().func_187099_a(Wrapper.getPlayer(), mc.field_71441_e, lllllllllllllllIIlllllIlIIlIIIll, lllllllllllllllIIlllllIlIIlIIIlI, lllllllllllllllIIlllllIlIIlIIIIl, EnumHand.MAIN_HAND);
      "".length();
   }

   private static boolean lIlIllIIIIIllI(int var0, int var1) {
      return var0 < var1;
   }
}
