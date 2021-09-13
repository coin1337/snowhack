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
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.server.SPacketChunkData;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AntiChunkBan",
   description = "Spams /kill, gets out of ban chunks.",
   category = Module.Category.PLAYER
)
public class AntiChunkBan extends Module {
   // $FF: synthetic field
   @EventHandler
   Listener<PacketEvent.Receive> receiveListener;
   // $FF: synthetic field
   private Setting<Float> delayTime;
   // $FF: synthetic field
   private static long startTime;
   // $FF: synthetic field
   private static final String[] lllllIlIIIll;
   // $FF: synthetic field
   private Setting<AntiChunkBan.ModeThing> modeThing;
   // $FF: synthetic field
   private static final int[] lllllIlIllll;
   // $FF: synthetic field
   private Setting<Boolean> disable;

   private static boolean lIlIIIllllIllI(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIIIlllllIlI(int var0) {
      return var0 <= 0;
   }

   public void onUpdate() {
      if (!lIlIIIllllIllI(mc.field_71439_g)) {
         if (lIlIIIllllIlll(((AntiChunkBan.ModeThing)lllllllllllllllIlIIllIllIlIllllI.modeThing.getValue()).equals(AntiChunkBan.ModeThing.KILL)) && lIlIIIlllllIII(Minecraft.func_71410_x().func_147104_D())) {
            if (lIlIIIlllllIIl(lIlIIIllllIlII(startTime, 0L))) {
               startTime = System.currentTimeMillis();
            }

            if (lIlIIIlllllIlI(lIlIIIllllIlIl((float)startTime + (Float)lllllllllllllllIlIIllIllIlIllllI.delayTime.getValue(), (float)System.currentTimeMillis()))) {
               if (lIlIIIlllllIII(Minecraft.func_71410_x().func_147104_D())) {
                  Minecraft.func_71410_x().field_71442_b.field_78774_b.func_147297_a(new CPacketChatMessage(lllllIlIIIll[lllllIlIllll[3]]));
               }

               if (lIlIIIlllllIlI(lIlIIIllllIlIl(mc.field_71439_g.func_110143_aJ(), 0.0F))) {
                  mc.field_71439_g.func_71004_bE();
                  mc.func_147108_a((GuiScreen)null);
                  if (lIlIIIllllIlll((Boolean)lllllllllllllllIlIIllIllIlIllllI.disable.getValue())) {
                     lllllllllllllllIlIIllIllIlIllllI.disable();
                  }
               }

               startTime = System.currentTimeMillis();
            }
         }

      }
   }

   public String getHudInfo() {
      switch(null.$SwitchMap$rr$snowhack$snow$module$modules$player$AntiChunkBan$ModeThing[((AntiChunkBan.ModeThing)lllllllllllllllIlIIllIllIlIllIll.modeThing.getValue()).ordinal()]) {
      case 1:
         return lllllIlIIIll[lllllIlIllll[4]];
      case 2:
         return lllllIlIIIll[lllllIlIllll[5]];
      default:
         return lllllIlIIIll[lllllIlIllll[6]];
      }
   }

   private static String lIlIIIllIIlIll(String lllllllllllllllIlIIllIllIIllIlll, String lllllllllllllllIlIIllIllIIllIllI) {
      lllllllllllllllIlIIllIllIIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIllIllIIlllIlI = new StringBuilder();
      float lllllllllllllllIlIIllIllIIllIlII = lllllllllllllllIlIIllIllIIllIllI.toCharArray();
      int lllllllllllllllIlIIllIllIIlllIII = lllllIlIllll[0];
      boolean lllllllllllllllIlIIllIllIIllIIlI = lllllllllllllllIlIIllIllIIllIlll.toCharArray();
      int lllllllllllllllIlIIllIllIIllIIIl = lllllllllllllllIlIIllIllIIllIIlI.length;
      int lllllllllllllllIlIIllIllIIllIIII = lllllIlIllll[0];

      do {
         if (!lIlIIIlllllIll(lllllllllllllllIlIIllIllIIllIIII, lllllllllllllllIlIIllIllIIllIIIl)) {
            return String.valueOf(lllllllllllllllIlIIllIllIIlllIlI);
         }

         char lllllllllllllllIlIIllIllIIllllIl = lllllllllllllllIlIIllIllIIllIIlI[lllllllllllllllIlIIllIllIIllIIII];
         lllllllllllllllIlIIllIllIIlllIlI.append((char)(lllllllllllllllIlIIllIllIIllllIl ^ lllllllllllllllIlIIllIllIIllIlII[lllllllllllllllIlIIllIllIIlllIII % lllllllllllllllIlIIllIllIIllIlII.length]));
         "".length();
         ++lllllllllllllllIlIIllIllIIlllIII;
         ++lllllllllllllllIlIIllIllIIllIIII;
         "".length();
      } while("   ".length() >= " ".length() << " ".length());

      return null;
   }

   private static boolean lIlIIIlllllIll(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIlIIIllllIlIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   static {
      lIlIIIllllIIll();
      lIlIIIllIIllIl();
      startTime = 0L;
   }

   private static boolean lIlIIIlllllIIl(int var0) {
      return var0 == 0;
   }

   public AntiChunkBan() {
      lllllllllllllllIlIIllIllIllIIIIl.modeThing = lllllllllllllllIlIIllIllIllIIIIl.register(Settings.e(lllllIlIIIll[lllllIlIllll[0]], AntiChunkBan.ModeThing.PACKET));
      lllllllllllllllIlIIllIllIllIIIIl.delayTime = lllllllllllllllIlIIllIllIllIIIIl.register(Settings.f(lllllIlIIIll[lllllIlIllll[1]], 10.0F));
      lllllllllllllllIlIIllIllIllIIIIl.disable = lllllllllllllllIlIIllIllIllIIIIl.register(Settings.b(lllllIlIIIll[lllllIlIllll[2]], (boolean)lllllIlIllll[0]));
      lllllllllllllllIlIIllIllIllIIIIl.receiveListener = new Listener((lllllllllllllllIlIIllIllIlIlIllI) -> {
         if (lIlIIIllllIlll(((AntiChunkBan.ModeThing)lllllllllllllllIlIIllIllIlIlIlIl.modeThing.getValue()).equals(AntiChunkBan.ModeThing.PACKET))) {
            if (lIlIIIllllIllI(mc.field_71439_g)) {
               return;
            }

            if (lIlIIIllllIlll(lllllllllllllllIlIIllIllIlIlIllI.getPacket() instanceof SPacketChunkData)) {
               lllllllllllllllIlIIllIllIlIlIllI.cancel();
            }
         }

      }, new Predicate[lllllIlIllll[0]]);
   }

   private static boolean lIlIIIlllllIII(Object var0) {
      return var0 != null;
   }

   private static String lIlIIIllIIllII(String lllllllllllllllIlIIllIllIlIIlIlI, String lllllllllllllllIlIIllIllIlIIlIIl) {
      try {
         long lllllllllllllllIlIIllIllIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), lllllIlIllll[8]), "DES");
         long lllllllllllllllIlIIllIllIlIIIlll = Cipher.getInstance("DES");
         lllllllllllllllIlIIllIllIlIIIlll.init(lllllIlIllll[2], lllllllllllllllIlIIllIllIlIIlIII);
         return new String(lllllllllllllllIlIIllIllIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIllllIlll(int var0) {
      return var0 != 0;
   }

   private static void lIlIIIllllIIll() {
      lllllIlIllll = new int[9];
      lllllIlIllll[0] = (22 ^ 27) << " ".length() & ~((165 ^ 168) << " ".length());
      lllllIlIllll[1] = " ".length();
      lllllIlIllll[2] = " ".length() << " ".length();
      lllllIlIllll[3] = "   ".length();
      lllllIlIllll[4] = " ".length() << (" ".length() << " ".length());
      lllllIlIllll[5] = 17 ^ 76 ^ (188 ^ 183) << "   ".length();
      lllllIlIllll[6] = "   ".length() << " ".length();
      lllllIlIllll[7] = (123 ^ 82) << (" ".length() << " ".length()) ^ 33 + 28 - 59 + 161;
      lllllIlIllll[8] = " ".length() << "   ".length();
   }

   private static int lIlIIIllllIlII(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private static String lIlIIIllIIlIlI(String lllllllllllllllIlIIllIllIIlIIlIl, String lllllllllllllllIlIIllIllIIlIIlII) {
      try {
         SecretKeySpec lllllllllllllllIlIIllIllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIllIllIIlIlIIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIllIllIIlIlIIl.init(lllllIlIllll[2], lllllllllllllllIlIIllIllIIlIlIlI);
         return new String(lllllllllllllllIlIIllIllIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIlIIIllIIllIl() {
      lllllIlIIIll = new String[lllllIlIllll[7]];
      lllllIlIIIll[lllllIlIllll[0]] = lIlIIIllIIlIlI("clIsjy/hI68=", "tTSbL");
      lllllIlIIIll[lllllIlIllll[1]] = lIlIIIllIIlIll("LCQ4D1AjKDgCCQ==", "gMTcp");
      lllllIlIIIll[lllllIlIllll[2]] = lIlIIIllIIlIll("DycxCScnKw==", "KNBhE");
      lllllIlIIIll[lllllIlIllll[3]] = lIlIIIllIIlIll("WyYtDSU=", "tMDaI");
      lllllIlIIIll[lllllIlIllll[4]] = lIlIIIllIIllII("89sLJ82BSdo=", "WGciQ");
      lllllIlIIIll[lllllIlIllll[5]] = lIlIIIllIIllII("uHIlZ18003o=", "uvSuq");
      lllllIlIIIll[lllllIlIllll[6]] = lIlIIIllIIlIll("", "aruYI");
   }

   private static enum ModeThing {
      // $FF: synthetic field
      KILL,
      // $FF: synthetic field
      PACKET;

      // $FF: synthetic field
      private static final int[] lIIIIlllIlIII;
      // $FF: synthetic field
      private static final String[] lIIIIllIlIlIl;

      static {
         lIlIllIlIlIllI();
         lIlIllIIlIIIlI();
         PACKET = new AntiChunkBan.ModeThing(lIIIIllIlIlIl[lIIIIlllIlIII[0]], lIIIIlllIlIII[0]);
         KILL = new AntiChunkBan.ModeThing(lIIIIllIlIlIl[lIIIIlllIlIII[1]], lIIIIlllIlIII[1]);
         AntiChunkBan.ModeThing[] var10000 = new AntiChunkBan.ModeThing[lIIIIlllIlIII[2]];
         var10000[lIIIIlllIlIII[0]] = PACKET;
         var10000[lIIIIlllIlIII[1]] = KILL;
      }

      private static String lIlIllIIlIIIIl(String lllllllllllllllIIllllIlIIIIIlIIl, String lllllllllllllllIIllllIlIIIIIllIl) {
         lllllllllllllllIIllllIlIIIIIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         Exception lllllllllllllllIIllllIlIIIIIIlll = new StringBuilder();
         char[] lllllllllllllllIIllllIlIIIIIlIll = lllllllllllllllIIllllIlIIIIIllIl.toCharArray();
         byte lllllllllllllllIIllllIlIIIIIIlIl = lIIIIlllIlIII[0];
         Exception lllllllllllllllIIllllIlIIIIIIlII = lllllllllllllllIIllllIlIIIIIlIIl.toCharArray();
         int lllllllllllllllIIllllIlIIIIIIIll = lllllllllllllllIIllllIlIIIIIIlII.length;
         int lllllllllllllllIIllllIlIIIIIIIlI = lIIIIlllIlIII[0];

         do {
            if (!lIlIllIlIllIII(lllllllllllllllIIllllIlIIIIIIIlI, lllllllllllllllIIllllIlIIIIIIIll)) {
               return String.valueOf(lllllllllllllllIIllllIlIIIIIIlll);
            }

            double lllllllllllllllIIllllIlIIIIIIIIl = lllllllllllllllIIllllIlIIIIIIlII[lllllllllllllllIIllllIlIIIIIIIlI];
            lllllllllllllllIIllllIlIIIIIIlll.append((char)(lllllllllllllllIIllllIlIIIIIIIIl ^ lllllllllllllllIIllllIlIIIIIlIll[lllllllllllllllIIllllIlIIIIIIlIl % lllllllllllllllIIllllIlIIIIIlIll.length]));
            "".length();
            ++lllllllllllllllIIllllIlIIIIIIlIl;
            ++lllllllllllllllIIllllIlIIIIIIIlI;
            "".length();
         } while(null == null);

         return null;
      }

      private static boolean lIlIllIlIllIII(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIlIllIIlIIIlI() {
         lIIIIllIlIlIl = new String[lIIIIlllIlIII[2]];
         lIIIIllIlIlIl[lIIIIlllIlIII[0]] = lIlIllIIlIIIIl("OC0FMRY8", "hlFzS");
         lIIIIllIlIlIl[lIIIIlllIlIII[1]] = lIlIllIIlIIIIl("IRM+IQ==", "jZrmz");
      }

      private static void lIlIllIlIlIllI() {
         lIIIIlllIlIII = new int[3];
         lIIIIlllIlIII[0] = (56 ^ 69 ^ (182 ^ 185) << "   ".length()) << (" ".length() << (" ".length() << " ".length())) & ((38 + 108 - 98 + 83 ^ (102 ^ 37) << " ".length()) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
         lIIIIlllIlIII[1] = " ".length();
         lIIIIlllIlIII[2] = " ".length() << " ".length();
      }
   }
}
