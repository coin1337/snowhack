package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.client.CPacketPlayer.PositionRotation;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;

@Module.Info(
   category = Module.Category.MOVEMENT,
   description = "Makes the player fly",
   name = "Flight"
)
public class Flight extends Module {
   // $FF: synthetic field
   private static final int[] llllllIllIIl;
   // $FF: synthetic field
   private Setting<Flight.FlightMode> mode;
   // $FF: synthetic field
   private static final String[] llllllIlIlll;
   // $FF: synthetic field
   private Setting<Float> speed;

   public double[] moveLooking() {
      double[] var10000 = new double[llllllIllIIl[6]];
      var10000[llllllIllIIl[0]] = (double)(mc.field_71439_g.field_70177_z * 360.0F / 360.0F * 180.0F / 180.0F);
      var10000[llllllIllIIl[1]] = 0.0D;
      return var10000;
   }

   private static boolean lIlIIlIlIlIllI(Object var0) {
      return var0 == null;
   }

   public Flight() {
      lllllllllllllllIlIIlIlIlllllIIII.speed = lllllllllllllllIlIIlIlIlllllIIII.register(Settings.f(llllllIlIlll[llllllIllIIl[0]], 10.0F));
      lllllllllllllllIlIIlIlIlllllIIII.mode = lllllllllllllllIlIIlIlIlllllIIII.register(Settings.e(llllllIlIlll[llllllIllIIl[1]], Flight.FlightMode.VANILLA));
   }

   protected void onEnable() {
      if (!lIlIIlIlIlIllI(mc.field_71439_g)) {
         if (lIlIIlIlIlIlll(lllllllllllllllIlIIlIlIllllIllIl.mode.getValue(), Flight.FlightMode.VANILLA)) {
            mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)llllllIllIIl[1];
            if (lIlIIlIlIllIII(mc.field_71439_g.field_71075_bZ.field_75098_d)) {
               return;
            }

            mc.field_71439_g.field_71075_bZ.field_75101_c = (boolean)llllllIllIIl[1];
         }

      }
   }

   private static String lIlIIlIlIIllII(String lllllllllllllllIlIIlIlIlllIIIIlI, String lllllllllllllllIlIIlIlIlllIIIllI) {
      lllllllllllllllIlIIlIlIlllIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIlIlIlllIIIlIl = new StringBuilder();
      char[] lllllllllllllllIlIIlIlIlllIIIlII = lllllllllllllllIlIIlIlIlllIIIllI.toCharArray();
      int lllllllllllllllIlIIlIlIlllIIIIll = llllllIllIIl[0];
      char lllllllllllllllIlIIlIlIllIllllIl = lllllllllllllllIlIIlIlIlllIIIIlI.toCharArray();
      Exception lllllllllllllllIlIIlIlIllIllllII = lllllllllllllllIlIIlIlIllIllllIl.length;
      int lllllllllllllllIlIIlIlIllIlllIll = llllllIllIIl[0];

      do {
         if (!lIlIIlIlIllIll(lllllllllllllllIlIIlIlIllIlllIll, lllllllllllllllIlIIlIlIllIllllII)) {
            return String.valueOf(lllllllllllllllIlIIlIlIlllIIIlIl);
         }

         char lllllllllllllllIlIIlIlIlllIIlIII = lllllllllllllllIlIIlIlIllIllllIl[lllllllllllllllIlIIlIlIllIlllIll];
         lllllllllllllllIlIIlIlIlllIIIlIl.append((char)(lllllllllllllllIlIIlIlIlllIIlIII ^ lllllllllllllllIlIIlIlIlllIIIlII[lllllllllllllllIlIIlIlIlllIIIIll % lllllllllllllllIlIIlIlIlllIIIlII.length]));
         "".length();
         ++lllllllllllllllIlIIlIlIlllIIIIll;
         ++lllllllllllllllIlIIlIlIllIlllIll;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) != " ".length());

      return null;
   }

   private static boolean lIlIIlIlIllIIl(int var0, int var1) {
      return var0 != var1;
   }

   protected void onDisable() {
      switch(null.$SwitchMap$rr$snowhack$snow$module$modules$movement$Flight$FlightMode[((Flight.FlightMode)lllllllllllllllIlIIlIlIlllIlIlII.mode.getValue()).ordinal()]) {
      case 2:
         mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)llllllIllIIl[0];
         mc.field_71439_g.field_71075_bZ.func_75092_a(0.05F);
         if (lIlIIlIlIllIII(mc.field_71439_g.field_71075_bZ.field_75098_d)) {
            return;
         } else {
            mc.field_71439_g.field_71075_bZ.field_75101_c = (boolean)llllllIllIIl[0];
         }
      default:
      }
   }

   private static boolean lIlIIlIlIlIlll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIIlIlIllIlI(int var0) {
      return var0 == 0;
   }

   private static String lIlIIlIlIIllIl(String lllllllllllllllIlIIlIlIllIllIIII, String lllllllllllllllIlIIlIlIllIlIllll) {
      try {
         char lllllllllllllllIlIIlIlIllIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIllIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double lllllllllllllllIlIIlIlIllIlIllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIlIllIlIllIl.init(llllllIllIIl[6], lllllllllllllllIlIIlIlIllIlIlllI);
         return new String(lllllllllllllllIlIIlIlIllIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      switch(null.$SwitchMap$rr$snowhack$snow$module$modules$movement$Flight$FlightMode[((Flight.FlightMode)lllllllllllllllIlIIlIlIlllIlllIl.mode.getValue()).ordinal()]) {
      case 1:
         mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)llllllIllIIl[0];
         mc.field_71439_g.field_70159_w = 0.0D;
         mc.field_71439_g.field_70181_x = 0.0D;
         mc.field_71439_g.field_70179_y = 0.0D;
         mc.field_71439_g.field_70747_aH = (Float)lllllllllllllllIlIIlIlIlllIlllIl.speed.getValue();
         EntityPlayerSP var8;
         if (lIlIIlIlIllIII(mc.field_71474_y.field_74314_A.func_151470_d())) {
            var8 = mc.field_71439_g;
            var8.field_70181_x += (double)(Float)lllllllllllllllIlIIlIlIlllIlllIl.speed.getValue();
         }

         if (lIlIIlIlIllIII(mc.field_71474_y.field_74311_E.func_151470_d())) {
            var8 = mc.field_71439_g;
            var8.field_70181_x -= (double)(Float)lllllllllllllllIlIIlIlIlllIlllIl.speed.getValue();
            "".length();
            if (null != null) {
               return;
            }
         }
         break;
      case 2:
         mc.field_71439_g.field_71075_bZ.func_75092_a((Float)lllllllllllllllIlIIlIlIlllIlllIl.speed.getValue() / 100.0F);
         mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)llllllIllIIl[1];
         if (lIlIIlIlIllIII(mc.field_71439_g.field_71075_bZ.field_75098_d)) {
            return;
         }

         mc.field_71439_g.field_71075_bZ.field_75101_c = (boolean)llllllIllIIl[1];
         "".length();
         if (" ".length() << " ".length() == 0) {
            return;
         }
         break;
      case 3:
         boolean lllllllllllllllIlIIlIlIlllIllIlI = mc.field_71474_y.field_74351_w.func_151470_d();
         char lllllllllllllllIlIIlIlIlllIllIIl = mc.field_71474_y.field_74370_x.func_151470_d();
         char lllllllllllllllIlIIlIlIlllIllIII = mc.field_71474_y.field_74366_z.func_151470_d();
         Exception lllllllllllllllIlIIlIlIlllIlIlll = mc.field_71474_y.field_74368_y.func_151470_d();
         int lllllllllllllllIlIIlIlIlllIllIll;
         int var10000;
         if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIIl) && lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIII)) {
            if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIlI)) {
               var10000 = llllllIllIIl[0];
               "".length();
               if (null != null) {
                  return;
               }
            } else if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIlIlll)) {
               var10000 = llllllIllIIl[2];
               "".length();
               if (" ".length() << (" ".length() << " ".length()) == 0) {
                  return;
               }
            } else {
               var10000 = llllllIllIIl[3];
            }

            lllllllllllllllIlIIlIlIlllIllIll = var10000;
            "".length();
            if (null != null) {
               return;
            }
         } else if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIlI) && lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIlIlll)) {
            if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIIl)) {
               var10000 = llllllIllIIl[4];
               "".length();
               if ("   ".length() <= 0) {
                  return;
               }
            } else if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIII)) {
               var10000 = llllllIllIIl[5];
               "".length();
               if (-" ".length() >= " ".length() << " ".length()) {
                  return;
               }
            } else {
               var10000 = llllllIllIIl[3];
            }

            lllllllllllllllIlIIlIlIlllIllIll = var10000;
            "".length();
            if ((40 ^ 45) == 0) {
               return;
            }
         } else {
            if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIIl)) {
               var10000 = llllllIllIIl[4];
               "".length();
               if (" ".length() < (((47 ^ 26) << " ".length() ^ 51 ^ 108) & (106 + 90 - 18 + 3 ^ " ".length() << (28 ^ 27) ^ -" ".length()))) {
                  return;
               }
            } else if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIII)) {
               var10000 = llllllIllIIl[5];
               "".length();
               if (" ".length() << (" ".length() << " ".length()) == 0) {
                  return;
               }
            } else {
               var10000 = llllllIllIIl[0];
            }

            lllllllllllllllIlIIlIlIlllIllIll = var10000;
            if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIllIlI)) {
               lllllllllllllllIlIIlIlIlllIllIll /= llllllIllIIl[6];
               "".length();
               if (((64 ^ 49 ^ (172 ^ 129) << " ".length()) & ((214 ^ 133) << " ".length() ^ 29 + 132 - 62 + 42 ^ -" ".length())) != ((253 + 141 - 374 + 235 ^ (47 ^ 4) << (" ".length() << " ".length())) & ((156 ^ 185) << (" ".length() << " ".length()) ^ 15 + 134 - 79 + 129 ^ -" ".length()))) {
                  return;
               }
            } else if (lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIlIlll)) {
               lllllllllllllllIlIIlIlIlllIllIll = llllllIllIIl[2] - lllllllllllllllIlIIlIlIlllIllIll / llllllIllIIl[6];
            }
         }

         if (lIlIIlIlIllIIl(lllllllllllllllIlIIlIlIlllIllIll, llllllIllIIl[3]) && (!lIlIIlIlIllIlI(lllllllllllllllIlIIlIlIlllIllIlI) || !lIlIIlIlIllIlI(lllllllllllllllIlIIlIlIlllIllIIl) || !lIlIIlIlIllIlI(lllllllllllllllIlIIlIlIlllIllIII) || lIlIIlIlIllIII(lllllllllllllllIlIIlIlIlllIlIlll))) {
            float lllllllllllllllIlIIlIlIlllIlIllI = mc.field_71439_g.field_70177_z + (float)lllllllllllllllIlIIlIlIlllIllIll;
            mc.field_71439_g.field_70159_w = EntityUtil.getRelativeX(lllllllllllllllIlIIlIlIlllIlIllI) * 0.20000000298023224D;
            mc.field_71439_g.field_70179_y = EntityUtil.getRelativeZ(lllllllllllllllIlIIlIlIlllIlIllI) * 0.20000000298023224D;
         }

         mc.field_71439_g.field_70181_x = 0.0D;
         NetHandlerPlayClient var7 = mc.field_71439_g.field_71174_a;
         PositionRotation var10001 = new PositionRotation;
         double var10003 = mc.field_71439_g.field_70165_t + mc.field_71439_g.field_70159_w;
         double var10004 = mc.field_71439_g.field_70163_u;
         double var10005;
         if (lIlIIlIlIllIII(Minecraft.func_71410_x().field_71474_y.field_74314_A.func_151470_d())) {
            var10005 = 0.0622D;
            "".length();
            if (((57 + 63 - 27 + 38 ^ (194 ^ 149) << " ".length()) << " ".length() & (((93 ^ 72) << (" ".length() << " ".length()) ^ 120 ^ 1) << " ".length() ^ -" ".length())) > (((128 ^ 159) << " ".length() ^ 155 ^ 186) << " ".length() & (((125 ^ 92) << (" ".length() << " ".length()) ^ 150 + 128 - 249 + 126) << " ".length() ^ -" ".length()))) {
               return;
            }
         } else {
            var10005 = 0.0D;
         }

         var10004 += var10005;
         if (lIlIIlIlIllIII(Minecraft.func_71410_x().field_71474_y.field_74311_E.func_151470_d())) {
            var10005 = 0.0622D;
            "".length();
            if ("   ".length() <= " ".length() << " ".length()) {
               return;
            }
         } else {
            var10005 = 0.0D;
         }

         var10001.<init>(var10003, var10004 - var10005, mc.field_71439_g.field_70161_v + mc.field_71439_g.field_70179_y, mc.field_71439_g.field_70177_z, mc.field_71439_g.field_70125_A, (boolean)llllllIllIIl[0]);
         var7.func_147297_a(var10001);
         mc.field_71439_g.field_71174_a.func_147297_a(new PositionRotation(mc.field_71439_g.field_70165_t + mc.field_71439_g.field_70159_w, mc.field_71439_g.field_70163_u - 42069.0D, mc.field_71439_g.field_70161_v + mc.field_71439_g.field_70179_y, mc.field_71439_g.field_70177_z, mc.field_71439_g.field_70125_A, (boolean)llllllIllIIl[1]));
      }

   }

   private static boolean lIlIIlIlIllIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIlIlIllIll(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIlIIlIlIlIlIl();
      lIlIIlIlIIlllI();
   }

   private static void lIlIIlIlIlIlIl() {
      llllllIllIIl = new int[7];
      llllllIllIIl[0] = (24 ^ 37 ^ " ".length() << (23 ^ 18)) & (55 + 97 - 112 + 115 ^ (39 ^ 100) << " ".length() ^ -" ".length());
      llllllIllIIl[1] = " ".length();
      llllllIllIIl[2] = ((5 ^ 90) << " ".length() ^ 125 + 49 - 100 + 73) << (" ".length() << " ".length());
      llllllIllIIl[3] = -" ".length();
      llllllIllIIl[4] = -(194 ^ 152);
      llllllIllIIl[5] = (81 ^ 122 ^ "   ".length() << " ".length()) << " ".length();
      llllllIllIIl[6] = " ".length() << " ".length();
   }

   private static void lIlIIlIlIIlllI() {
      llllllIlIlll = new String[llllllIllIIl[6]];
      llllllIlIlll[llllllIllIIl[0]] = lIlIIlIlIIllII("BRUABxM=", "Veebw");
      llllllIlIlll[llllllIllIIl[1]] = lIlIIlIlIIllIl("6jyHyi3PnRQ=", "PLAwb");
   }

   public static enum FlightMode {
      // $FF: synthetic field
      PACKET,
      // $FF: synthetic field
      VANILLA;

      // $FF: synthetic field
      private static final int[] llllIllIllII;
      // $FF: synthetic field
      STATIC;

      // $FF: synthetic field
      private static final String[] llllIlIIlIIl;

      private static void lIIlllllllIIll() {
         llllIlIIlIIl = new String[llllIllIllII[3]];
         llllIlIIlIIl[llllIllIllII[0]] = lIIlllllllIIII("ITW2hc4sbns=", "ahBDL");
         llllIlIIlIIl[llllIllIllII[1]] = lIIlllllllIIIl("rGvOFtJmiJ4=", "nsZPe");
         llllIlIIlIIl[llllIllIllII[2]] = lIIlllllllIIlI("Oyw6LAM/", "kmygF");
      }

      private static void lIlIIIIlIIIlIl() {
         llllIllIllII = new int[5];
         llllIllIllII[0] = ((131 ^ 150) << " ".length() ^ 184 ^ 155) << "   ".length() & ((249 ^ 150 ^ (183 ^ 132) << " ".length()) << "   ".length() ^ -" ".length());
         llllIllIllII[1] = " ".length();
         llllIllIllII[2] = " ".length() << " ".length();
         llllIllIllII[3] = "   ".length();
         llllIllIllII[4] = " ".length() << "   ".length();
      }

      static {
         lIlIIIIlIIIlIl();
         lIIlllllllIIll();
         VANILLA = new Flight.FlightMode(llllIlIIlIIl[llllIllIllII[0]], llllIllIllII[0]);
         STATIC = new Flight.FlightMode(llllIlIIlIIl[llllIllIllII[1]], llllIllIllII[1]);
         PACKET = new Flight.FlightMode(llllIlIIlIIl[llllIllIllII[2]], llllIllIllII[2]);
         Flight.FlightMode[] var10000 = new Flight.FlightMode[llllIllIllII[3]];
         var10000[llllIllIllII[0]] = VANILLA;
         var10000[llllIllIllII[1]] = STATIC;
         var10000[llllIllIllII[2]] = PACKET;
      }

      private static boolean lIlIIIIlIIIllI(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIIlllllllIIII(String lllllllllllllllIlIlIIlIIlIlIllII, String lllllllllllllllIlIlIIlIIlIlIllIl) {
         try {
            int lllllllllllllllIlIlIIlIIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIlIlIllIl.getBytes(StandardCharsets.UTF_8)), llllIllIllII[4]), "DES");
            short lllllllllllllllIlIlIIlIIlIlIlIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIIlIlIlIIl.init(llllIllIllII[2], lllllllllllllllIlIlIIlIIlIlIlIlI);
            return new String(lllllllllllllllIlIlIIlIIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIIlllllllIIlI(String lllllllllllllllIlIlIIlIIlIIlIIIl, String lllllllllllllllIlIlIIlIIlIIIlIll) {
         lllllllllllllllIlIlIIlIIlIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         int lllllllllllllllIlIlIIlIIlIIIlIlI = new StringBuilder();
         char[] lllllllllllllllIlIlIIlIIlIIIlllI = lllllllllllllllIlIlIIlIIlIIIlIll.toCharArray();
         boolean lllllllllllllllIlIlIIlIIlIIIlIII = llllIllIllII[0];
         char lllllllllllllllIlIlIIlIIlIIIIlll = lllllllllllllllIlIlIIlIIlIIlIIIl.toCharArray();
         String lllllllllllllllIlIlIIlIIlIIIIllI = lllllllllllllllIlIlIIlIIlIIIIlll.length;
         int lllllllllllllllIlIlIIlIIlIIIIlIl = llllIllIllII[0];

         do {
            if (!lIlIIIIlIIIllI(lllllllllllllllIlIlIIlIIlIIIIlIl, lllllllllllllllIlIlIIlIIlIIIIllI)) {
               return String.valueOf(lllllllllllllllIlIlIIlIIlIIIlIlI);
            }

            char lllllllllllllllIlIlIIlIIlIIlIIlI = lllllllllllllllIlIlIIlIIlIIIIlll[lllllllllllllllIlIlIIlIIlIIIIlIl];
            lllllllllllllllIlIlIIlIIlIIIlIlI.append((char)(lllllllllllllllIlIlIIlIIlIIlIIlI ^ lllllllllllllllIlIlIIlIIlIIIlllI[lllllllllllllllIlIlIIlIIlIIIlIII % lllllllllllllllIlIlIIlIIlIIIlllI.length]));
            "".length();
            ++lllllllllllllllIlIlIIlIIlIIIlIII;
            ++lllllllllllllllIlIlIIlIIlIIIIlIl;
            "".length();
         } while(-" ".length() == -" ".length());

         return null;
      }

      private static String lIIlllllllIIIl(String lllllllllllllllIlIlIIlIIlIIlllll, String lllllllllllllllIlIlIIlIIlIIllllI) {
         try {
            short lllllllllllllllIlIlIIlIIlIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIlIIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIIlIlIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIIlIlIIIll.init(llllIllIllII[2], lllllllllllllllIlIlIIlIIlIIlllIl);
            return new String(lllllllllllllllIlIlIIlIIlIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }
}
