package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.init.Items;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult.Type;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;

@Module.Info(
   category = Module.Category.PLAYER,
   description = "Prevents fall damage",
   name = "NoFall"
)
public class NoFall extends Module {
   // $FF: synthetic field
   private long last;
   // $FF: synthetic field
   private Setting<Boolean> bucket;
   // $FF: synthetic field
   private static final int[] llllIIlIllll;
   // $FF: synthetic field
   private static final String[] llllIIlIlllI;
   // $FF: synthetic field
   private Setting<Integer> distance;
   // $FF: synthetic field
   private Setting<Boolean> packet;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> sendListener;

   private static String lIIlllllIIllll(String lllllllllllllllIlIlIlIlIIlllIIll, String lllllllllllllllIlIlIlIlIIlllIIII) {
      try {
         SecretKeySpec lllllllllllllllIlIlIlIlIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIlIlIlIlIIllIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIlIlIIllIlllI.init(llllIIlIllll[2], lllllllllllllllIlIlIlIlIIlllIllI);
         return new String(lllllllllllllllIlIlIlIlIIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIIlllllIlIIIl();
      lIIlllllIlIIII();
   }

   private static boolean lIIlllllIllIIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIIlllllIllIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIlllllIlIlII(int var0) {
      return var0 != 0;
   }

   private static int lIIlllllIlIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIIlllllIlIlIl(int var0) {
      return var0 >= 0;
   }

   private static String lIIlllllIIlllI(String lllllllllllllllIlIlIlIlIIllllllI, String lllllllllllllllIlIlIlIlIIlllllll) {
      try {
         Exception lllllllllllllllIlIlIlIlIIlllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIlllllll.getBytes(StandardCharsets.UTF_8)), llllIIlIllll[5]), "DES");
         String lllllllllllllllIlIlIlIlIIllllIll = Cipher.getInstance("DES");
         lllllllllllllllIlIlIlIlIIllllIll.init(llllIIlIllll[2], lllllllllllllllIlIlIlIlIIlllllII);
         return new String(lllllllllllllllIlIlIlIlIIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllllIlIlll(int var0) {
      return var0 > 0;
   }

   private static int lIIlllllIlIIll(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static void lIIlllllIlIIII() {
      llllIIlIlllI = new String[llllIIlIllll[3]];
      llllIIlIlllI[llllIIlIllll[0]] = lIIlllllIIllIl("MzAWPi0X", "cQuUH");
      llllIIlIlllI[llllIIlIllll[1]] = lIIlllllIIlllI("Qjj+R+aAWf4=", "RGBAN");
      llllIIlIlllI[llllIIlIllll[2]] = lIIlllllIIllll("GyG43cyOMTL+E1geyEy63g==", "fufrE");
   }

   private static void lIIlllllIlIIIl() {
      llllIIlIllll = new int[6];
      llllIIlIllll[0] = (120 + 109 - 160 + 178 ^ (35 ^ 120) << " ".length()) & ((242 ^ 197) << (" ".length() << " ".length()) ^ 19 + 8 - -112 + 18 ^ -" ".length());
      llllIIlIllll[1] = " ".length();
      llllIIlIllll[2] = " ".length() << " ".length();
      llllIIlIllll[3] = "   ".length();
      llllIIlIllll[4] = 71 ^ 78;
      llllIIlIllll[5] = " ".length() << "   ".length();
   }

   private static boolean lIIlllllIllIlI(Object var0, Object var1) {
      return var0 != var1;
   }

   public void onUpdate() {
      if (lIIlllllIlIlII((Boolean)lllllllllllllllIlIlIlIlIlIlIlIlI.bucket.getValue()) && lIIlllllIlIlIl(lIIlllllIlIIlI(mc.field_71439_g.field_70143_R, (float)(Integer)lllllllllllllllIlIlIlIlIlIlIlIlI.distance.getValue())) && lIIlllllIlIllI(EntityUtil.isAboveWater(mc.field_71439_g)) && lIIlllllIlIlll(lIIlllllIlIIll(System.currentTimeMillis() - lllllllllllllllIlIlIlIlIlIlIlIlI.last, 100L))) {
         double lllllllllllllllIlIlIlIlIlIlIlIIl = mc.field_71439_g.func_174791_d();
         char lllllllllllllllIlIlIlIlIlIlIlIII = mc.field_71441_e.func_147447_a(lllllllllllllllIlIlIlIlIlIlIlIIl, lllllllllllllllIlIlIlIlIlIlIlIIl.func_72441_c(0.0D, -5.329999923706055D, 0.0D), (boolean)llllIIlIllll[1], (boolean)llllIIlIllll[1], (boolean)llllIIlIllll[0]);
         if (lIIlllllIllIII(lllllllllllllllIlIlIlIlIlIlIlIII) && lIIlllllIllIIl(lllllllllllllllIlIlIlIlIlIlIlIII.field_72313_a, Type.BLOCK)) {
            long lllllllllllllllIlIlIlIlIlIlIIlll = EnumHand.MAIN_HAND;
            if (lIIlllllIllIIl(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151131_as)) {
               lllllllllllllllIlIlIlIlIlIlIIlll = EnumHand.OFF_HAND;
               "".length();
               if ("   ".length() == 0) {
                  return;
               }
            } else if (lIIlllllIllIlI(mc.field_71439_g.func_184614_ca().func_77973_b(), Items.field_151131_as)) {
               int lllllllllllllllIlIlIlIlIlIlIIllI = llllIIlIllll[0];

               do {
                  if (!lIIlllllIllIll(lllllllllllllllIlIlIlIlIlIlIIllI, llllIIlIllll[4])) {
                     return;
                  }

                  if (lIIlllllIllIIl(mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIlIlIlIlIlIIllI).func_77973_b(), Items.field_151131_as)) {
                     mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIlIlIlIlIlIIllI;
                     mc.field_71439_g.field_70125_A = 90.0F;
                     lllllllllllllllIlIlIlIlIlIlIlIlI.last = System.currentTimeMillis();
                     return;
                  }

                  ++lllllllllllllllIlIlIlIlIlIlIIllI;
                  "".length();
               } while(((74 ^ 117) & ~(59 ^ 4)) == 0);

               return;
            }

            mc.field_71439_g.field_70125_A = 90.0F;
            mc.field_71442_b.func_187101_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIlIlIlIlIlIlIIlll);
            "".length();
         }
      }

   }

   public NoFall() {
      lllllllllllllllIlIlIlIlIlIllIlIl.packet = lllllllllllllllIlIlIlIlIlIllIlIl.register(Settings.b(llllIIlIlllI[llllIIlIllll[0]], (boolean)llllIIlIllll[0]));
      lllllllllllllllIlIlIlIlIlIllIlIl.bucket = lllllllllllllllIlIlIlIlIlIllIlIl.register(Settings.b(llllIIlIlllI[llllIIlIllll[1]], (boolean)llllIIlIllll[1]));
      lllllllllllllllIlIlIlIlIlIllIlIl.distance = lllllllllllllllIlIlIlIlIlIllIlIl.register(Settings.i(llllIIlIlllI[llllIIlIllll[2]], llllIIlIllll[3]));
      lllllllllllllllIlIlIlIlIlIllIlIl.last = 0L;
      lllllllllllllllIlIlIlIlIlIllIlIl.sendListener = new Listener((lllllllllllllllIlIlIlIlIlIlIIIlI) -> {
         if (lIIlllllIlIlII(lllllllllllllllIlIlIlIlIlIlIIIlI.getPacket() instanceof CPacketPlayer) && lIIlllllIlIlII((Boolean)lllllllllllllllIlIlIlIlIlIlIIIIl.packet.getValue())) {
            ((CPacketPlayer)lllllllllllllllIlIlIlIlIlIlIIIlI.getPacket()).field_149474_g = (boolean)llllIIlIllll[1];
         }

      }, new Predicate[llllIIlIllll[0]]);
   }

   private static String lIIlllllIIllIl(String lllllllllllllllIlIlIlIlIlIIlIIII, String lllllllllllllllIlIlIlIlIlIIlIlII) {
      lllllllllllllllIlIlIlIlIlIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lllllllllllllllIlIlIlIlIlIIIlllI = new StringBuilder();
      float lllllllllllllllIlIlIlIlIlIIIllIl = lllllllllllllllIlIlIlIlIlIIlIlII.toCharArray();
      byte lllllllllllllllIlIlIlIlIlIIIllII = llllIIlIllll[0];
      short lllllllllllllllIlIlIlIlIlIIIlIll = lllllllllllllllIlIlIlIlIlIIlIIII.toCharArray();
      int lllllllllllllllIlIlIlIlIlIIIlIlI = lllllllllllllllIlIlIlIlIlIIIlIll.length;
      int lllllllllllllllIlIlIlIlIlIIIlIIl = llllIIlIllll[0];

      do {
         if (!lIIlllllIllIll(lllllllllllllllIlIlIlIlIlIIIlIIl, lllllllllllllllIlIlIlIlIlIIIlIlI)) {
            return String.valueOf(lllllllllllllllIlIlIlIlIlIIIlllI);
         }

         long lllllllllllllllIlIlIlIlIlIIIlIII = lllllllllllllllIlIlIlIlIlIIIlIll[lllllllllllllllIlIlIlIlIlIIIlIIl];
         lllllllllllllllIlIlIlIlIlIIIlllI.append((char)(lllllllllllllllIlIlIlIlIlIIIlIII ^ lllllllllllllllIlIlIlIlIlIIIllIl[lllllllllllllllIlIlIlIlIlIIIllII % lllllllllllllllIlIlIlIlIlIIIllIl.length]));
         "".length();
         ++lllllllllllllllIlIlIlIlIlIIIllII;
         ++lllllllllllllllIlIlIlIlIlIIIlIIl;
         "".length();
      } while(((68 ^ 101) & ~(12 ^ 45)) <= 0);

      return null;
   }

   private static boolean lIIlllllIlIllI(int var0) {
      return var0 == 0;
   }

   private static boolean lIIlllllIllIII(Object var0) {
      return var0 != null;
   }
}
