package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.BlockInteractionHelper;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "HopperNuker",
   category = Module.Category.COMBAT
)
public class HopperNuker extends Module {
   // $FF: synthetic field
   private static final int[] lIIIIIIIlIIll;
   // $FF: synthetic field
   private int oldSlot;
   // $FF: synthetic field
   private static final String[] lIIIIIIIlIIII;
   // $FF: synthetic field
   private boolean isMining;
   // $FF: synthetic field
   private Setting<Boolean> pickswitch;
   // $FF: synthetic field
   private Setting<Double> range;

   private BlockPos getNearestHopper() {
      Double lllllllllllllllIlIIlIIIlllIIlllI = (Double)lllllllllllllllIlIIlIIIlllIIllII.range.getValue();
      int lllllllllllllllIlIIlIIIlllIIlIlI = null;
      Double lllllllllllllllIlIIlIIIlllIlIIII = lllllllllllllllIlIIlIIIlllIIlllI;

      do {
         if (!lIlIIllIllIIII(lIlIIllIlIlllI(lllllllllllllllIlIIlIIIlllIlIIII, -lllllllllllllllIlIIlIIIlllIIlllI))) {
            return lllllllllllllllIlIIlIIIlllIIlIlI;
         }

         double lllllllllllllllIlIIlIIIlllIIlIII = lllllllllllllllIlIIlIIIlllIIlllI;

         while(lIlIIllIllIIII(lIlIIllIlIlllI(lllllllllllllllIlIIlIIIlllIIlIII, -lllllllllllllllIlIIlIIIlllIIlllI))) {
            double lllllllllllllllIlIIlIIIlllIlIIlI = lllllllllllllllIlIIlIIIlllIIlllI;

            while(lIlIIllIllIIII(lIlIIllIlIlllI(lllllllllllllllIlIIlIIIlllIlIIlI, -lllllllllllllllIlIIlIIIlllIIlllI))) {
               BlockPos lllllllllllllllIlIIlIIIlllIlIlII = new BlockPos(Wrapper.getPlayer().field_70165_t + lllllllllllllllIlIIlIIIlllIlIIII, Wrapper.getPlayer().field_70163_u + lllllllllllllllIlIIlIIIlllIIlIII, Wrapper.getPlayer().field_70161_v + lllllllllllllllIlIIlIIIlllIlIIlI);
               String lllllllllllllllIlIIlIIIlllIIIlIl = Wrapper.getPlayer().func_70011_f((double)lllllllllllllllIlIIlIIIlllIlIlII.func_177958_n(), (double)lllllllllllllllIlIIlIIIlllIlIlII.func_177956_o(), (double)lllllllllllllllIlIIlIIIlllIlIlII.func_177952_p());
               if (lIlIIllIllIIIl(lIlIIllIlIllll(lllllllllllllllIlIIlIIIlllIIIlIl, lllllllllllllllIlIIlIIIlllIIlllI)) && lIlIIllIllIIlI(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIlIIIlllIlIlII).func_177230_c(), Blocks.field_150438_bZ) && lIlIIllIlIlIIl(lllllllllllllllIlIIlIIIlllIIllII.canBreak(lllllllllllllllIlIIlIIIlllIlIlII)) && lIlIIllIllIIII(lIlIIllIlIlllI((double)lllllllllllllllIlIIlIIIlllIlIlII.func_177956_o(), Wrapper.getPlayer().field_70163_u))) {
                  lllllllllllllllIlIIlIIIlllIIlllI = lllllllllllllllIlIIlIIIlllIIIlIl;
                  lllllllllllllllIlIIlIIIlllIIlIlI = lllllllllllllllIlIIlIIIlllIlIlII;
               }

               --lllllllllllllllIlIIlIIIlllIlIIlI;
               "".length();
               if (" ".length() << (" ".length() << " ".length()) <= 0) {
                  return null;
               }
            }

            --lllllllllllllllIlIIlIIIlllIIlIII;
            "".length();
            if ("   ".length() <= 0) {
               return null;
            }
         }

         lllllllllllllllIlIIlIIIlllIlIIII = lllllllllllllllIlIIlIIIlllIlIIII - 1.0D;
         "".length();
      } while(" ".length() << " ".length() < "   ".length());

      return null;
   }

   private boolean canBreak(BlockPos lllllllllllllllIlIIlIIIlllIlllll) {
      String lllllllllllllllIlIIlIIIlllIllllI = Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIlIIIlllIlllll);
      short lllllllllllllllIlIIlIIIlllIlllIl = lllllllllllllllIlIIlIIIlllIllllI.func_177230_c();
      int var10000;
      if (lIlIIllIlIlIIl(lIlIIllIlIllIl(lllllllllllllllIlIIlIIIlllIlllIl.func_176195_g(lllllllllllllllIlIIlIIIlllIllllI, Wrapper.getWorld(), lllllllllllllllIlIIlIIIlllIlllll), -1.0F))) {
         var10000 = lIIIIIIIlIIll[1];
         "".length();
         if (((172 ^ 135) & ~(53 ^ 30)) < 0) {
            return (boolean)((71 ^ 74) << (" ".length() << " ".length()) & ~((106 ^ 103) << (" ".length() << " ".length())));
         }
      } else {
         var10000 = lIIIIIIIlIIll[0];
      }

      return (boolean)var10000;
   }

   private static int lIlIIllIlIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   static {
      lIlIIllIlIIllI();
      lIlIIllIlIIlIl();
   }

   private static boolean lIlIIllIlIlIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIllIllIIII(int var0) {
      return var0 >= 0;
   }

   public void onUpdate() {
      byte lllllllllllllllIlIIlIIIllllIlIll = lllllllllllllllIlIIlIIIllllIlllI.getNearestHopper();
      if (lIlIIllIlIIlll(lllllllllllllllIlIIlIIIllllIlIll)) {
         if (lIlIIllIlIlIII(lllllllllllllllIlIIlIIIllllIlllI.isMining)) {
            lllllllllllllllIlIIlIIIllllIlllI.oldSlot = Wrapper.getPlayer().field_71071_by.field_70461_c;
            lllllllllllllllIlIIlIIIllllIlllI.isMining = (boolean)lIIIIIIIlIIll[1];
         }

         float[] lllllllllllllllIlIIlIIIllllIllll = BlockInteractionHelper.calcAngle(Wrapper.getPlayer().func_174824_e(Wrapper.getMinecraft().func_184121_ak()), new Vec3d((double)((float)lllllllllllllllIlIIlIIIllllIlIll.func_177958_n() + 0.5F), (double)((float)lllllllllllllllIlIIlIIIllllIlIll.func_177956_o() + 0.5F), (double)((float)lllllllllllllllIlIIlIIIllllIlIll.func_177952_p() + 0.5F)));
         Wrapper.getPlayer().field_70177_z = lllllllllllllllIlIIlIIIllllIllll[lIIIIIIIlIIll[0]];
         Wrapper.getPlayer().field_70759_as = lllllllllllllllIlIIlIIIllllIllll[lIIIIIIIlIIll[0]];
         Wrapper.getPlayer().field_70125_A = lllllllllllllllIlIIlIIIllllIllll[lIIIIIIIlIIll[1]];
         if (lIlIIllIlIlIIl(lllllllllllllllIlIIlIIIllllIlllI.canBreak(lllllllllllllllIlIIlIIIllllIlIll))) {
            if (lIlIIllIlIlIIl((Boolean)lllllllllllllllIlIIlIIIllllIlllI.pickswitch.getValue())) {
               int lllllllllllllllIlIIlIIIlllllIIII = lIIIIIIIlIIll[2];
               int lllllllllllllllIlIIlIIIllllIlIII = lIIIIIIIlIIll[0];

               while(lIlIIllIlIlIlI(lllllllllllllllIlIIlIIIllllIlIII, lIIIIIIIlIIll[3])) {
                  short lllllllllllllllIlIIlIIIllllIIlll = Wrapper.getPlayer().field_71071_by.func_70301_a(lllllllllllllllIlIIlIIIllllIlIII);
                  if (lIlIIllIlIlIll(lllllllllllllllIlIIlIIIllllIIlll, ItemStack.field_190927_a) && lIlIIllIlIlIIl(lllllllllllllllIlIIlIIIllllIIlll.func_77973_b() instanceof ItemPickaxe)) {
                     lllllllllllllllIlIIlIIIlllllIIII = lllllllllllllllIlIIlIIIllllIlIII;
                     "".length();
                     if (null != null) {
                        return;
                     }
                     break;
                  }

                  ++lllllllllllllllIlIIlIIIllllIlIII;
                  "".length();
                  if (((121 + 10 - 29 + 29 ^ (88 ^ 11) << " ".length()) << " ".length() & ((47 ^ 126 ^ (172 ^ 177) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) >= " ".length() << (" ".length() << " ".length())) {
                     return;
                  }
               }

               if (lIlIIllIlIllII(lllllllllllllllIlIIlIIIlllllIIII, lIIIIIIIlIIll[2])) {
                  Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIlIIlIIIlllllIIII;
               }
            }

            Wrapper.getMinecraft().field_71442_b.func_180512_c(lllllllllllllllIlIIlIIIllllIlIll, Wrapper.getPlayer().func_174811_aO());
            "".length();
            Wrapper.getPlayer().func_184609_a(EnumHand.MAIN_HAND);
         }

         "".length();
         if ("   ".length() <= " ".length() << " ".length()) {
            return;
         }
      } else if (lIlIIllIlIlIIl((Boolean)lllllllllllllllIlIIlIIIllllIlllI.pickswitch.getValue()) && lIlIIllIlIllII(lllllllllllllllIlIIlIIIllllIlllI.oldSlot, lIIIIIIIlIIll[2])) {
         Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIlIIlIIIllllIlllI.oldSlot;
         lllllllllllllllIlIIlIIIllllIlllI.oldSlot = lIIIIIIIlIIll[2];
         lllllllllllllllIlIIlIIIllllIlllI.isMining = (boolean)lIIIIIIIlIIll[0];
      }

   }

   private static boolean lIlIIllIlIllII(int var0, int var1) {
      return var0 != var1;
   }

   private static void lIlIIllIlIIlIl() {
      lIIIIIIIlIIII = new String[lIIIIIIIlIIll[4]];
      lIIIIIIIlIIII[lIIIIIIIlIIll[0]] = lIlIIllIlIIIll("38j6IIcVtQI=", "bJMRQ");
      lIIIIIIIlIIII[lIIIIIIIlIIll[1]] = lIlIIllIlIIlII("6erU2v3AQrSBBUUQ6xVaeg==", "aRqxd");
   }

   private static boolean lIlIIllIlIIlll(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIIllIlIlIIl(int var0) {
      return var0 != 0;
   }

   private static int lIlIIllIlIllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public HopperNuker() {
      lllllllllllllllIlIIlIIIllllllIIl.range = lllllllllllllllIlIIlIIIllllllIIl.register(Settings.d(lIIIIIIIlIIII[lIIIIIIIlIIll[0]], 5.5D));
      lllllllllllllllIlIIlIIIllllllIIl.pickswitch = lllllllllllllllIlIIlIIIllllllIIl.register(Settings.b(lIIIIIIIlIIII[lIIIIIIIlIIll[1]], (boolean)lIIIIIIIlIIll[0]));
      lllllllllllllllIlIIlIIIllllllIIl.oldSlot = lIIIIIIIlIIll[2];
      lllllllllllllllIlIIlIIIllllllIIl.isMining = (boolean)lIIIIIIIlIIll[0];
   }

   private static boolean lIlIIllIllIIlI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIIllIlIlIII(int var0) {
      return var0 == 0;
   }

   private static String lIlIIllIlIIIll(String lllllllllllllllIlIIlIIIllIlIlllI, String lllllllllllllllIlIIlIIIllIlIllIl) {
      try {
         Exception lllllllllllllllIlIIlIIIllIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIllIlIllIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIIll[5]), "DES");
         Exception lllllllllllllllIlIIlIIIllIlIlIll = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIIIllIlIlIll.init(lIIIIIIIlIIll[4], lllllllllllllllIlIIlIIIllIlIllII);
         return new String(lllllllllllllllIlIIlIIIllIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIIllIlIIllI() {
      lIIIIIIIlIIll = new int[6];
      lIIIIIIIlIIll[0] = (160 ^ 135) << " ".length() & ~((230 ^ 193) << " ".length());
      lIIIIIIIlIIll[1] = " ".length();
      lIIIIIIIlIIll[2] = -" ".length();
      lIIIIIIIlIIll[3] = 85 ^ 92;
      lIIIIIIIlIIll[4] = " ".length() << " ".length();
      lIIIIIIIlIIll[5] = " ".length() << "   ".length();
   }

   private static boolean lIlIIllIllIIIl(int var0) {
      return var0 <= 0;
   }

   private static String lIlIIllIlIIlII(String lllllllllllllllIlIIlIIIllIlllIll, String lllllllllllllllIlIIlIIIllIlllIlI) {
      try {
         String lllllllllllllllIlIIlIIIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         float lllllllllllllllIlIIlIIIllIlllIII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIIIllIlllIII.init(lIIIIIIIlIIll[4], lllllllllllllllIlIIlIIIllIlllIIl);
         return new String(lllllllllllllllIlIIlIIIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static int lIlIIllIlIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIlIIllIlIlIll(Object var0, Object var1) {
      return var0 != var1;
   }
}
