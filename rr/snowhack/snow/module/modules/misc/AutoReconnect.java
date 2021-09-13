package rr.snowhack.snow.module.modules.misc;

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
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import rr.snowhack.snow.event.events.GuiScreenEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AutoReconnect",
   description = "Automatically reconnects after being disconnected",
   category = Module.Category.MISC,
   alwaysListening = true
)
public class AutoReconnect extends Module {
   // $FF: synthetic field
   @EventHandler
   public Listener<GuiScreenEvent.Displayed> displayedListener;
   // $FF: synthetic field
   private static final String[] lIIIIllIlllll;
   // $FF: synthetic field
   @EventHandler
   public Listener<GuiScreenEvent.Closed> closedListener;
   // $FF: synthetic field
   private static ServerData cServer;
   // $FF: synthetic field
   private Setting<Integer> seconds;
   // $FF: synthetic field
   private static final int[] lIIIIlllIIIII;

   private static boolean lIlIllIlIIIIlI(Object var0) {
      return var0 != null;
   }

   private static void lIlIllIIllllll() {
      lIIIIlllIIIII = new int[4];
      lIIIIlllIIIII[0] = ((109 ^ 92) << " ".length() ^ 225 ^ 174) << " ".length() & ((114 + 58 - 43 + 38 ^ (25 ^ 92) << " ".length()) << " ".length() ^ -" ".length());
      lIIIIlllIIIII[1] = 140 ^ 137;
      lIIIIlllIIIII[2] = " ".length();
      lIIIIlllIIIII[3] = " ".length() << " ".length();
   }

   static {
      lIlIllIIllllll();
      lIlIllIIlllllI();
   }

   private static void lIlIllIIlllllI() {
      lIIIIllIlllll = new String[lIIIIlllIIIII[2]];
      lIIIIllIlllll[lIIIIlllIIIII[0]] = lIlIllIIllllIl("GjVxPfRbOmI=", "FPOWJ");
   }

   private static String lIlIllIIllllIl(String lllllllllllllllIIllllIlIlllIIllI, String lllllllllllllllIIllllIlIlllIIlll) {
      try {
         short lllllllllllllllIIllllIlIlllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIlIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIllllIlIlllIlIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllllIlIlllIlIlI.init(lIIIIlllIIIII[3], lllllllllllllllIIllllIlIlllIIlII);
         return new String(lllllllllllllllIIllllIlIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIllIlIIIIIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIllIlIIIIII(int var0) {
      return var0 != 0;
   }

   public AutoReconnect() {
      lllllllllllllllIIllllIlIllllllII.seconds = lllllllllllllllIIllllIlIllllllII.register(Settings.integerBuilder(lIIIIllIlllll[lIIIIlllIIIII[0]]).withValue((Number)lIIIIlllIIIII[1]).withMinimum(lIIIIlllIIIII[0]).build());
      lllllllllllllllIIllllIlIllllllII.closedListener = new Listener((lllllllllllllllIIllllIlIllllIlII) -> {
         if (lIlIllIlIIIIII(lllllllllllllllIIllllIlIllllIlII.getScreen() instanceof GuiConnecting)) {
            cServer = mc.field_71422_O;
         }

      }, new Predicate[lIIIIlllIIIII[0]]);
      lllllllllllllllIIllllIlIllllllII.displayedListener = new Listener((lllllllllllllllIIllllIlIlllllIII) -> {
         if (lIlIllIlIIIIII(lllllllllllllllIIllllIlIllllIlll.isEnabled()) && lIlIllIlIIIIII(lllllllllllllllIIllllIlIlllllIII.getScreen() instanceof GuiDisconnected) && (!lIlIllIlIIIIIl(cServer) || lIlIllIlIIIIlI(mc.field_71422_O))) {
            lllllllllllllllIIllllIlIlllllIII.setScreen(new AutoReconnect.KamiGuiDisconnected((GuiDisconnected)lllllllllllllllIIllllIlIlllllIII.getScreen()));
         }

      }, new Predicate[lIIIIlllIIIII[0]]);
   }

   private class KamiGuiDisconnected extends GuiDisconnected {
      // $FF: synthetic field
      long cTime;
      // $FF: synthetic field
      private static final String[] lllIlIlllIlI;
      // $FF: synthetic field
      int millis;
      // $FF: synthetic field
      private static final int[] lllIlIlllIll;

      public void func_73876_c() {
         if (lIIllIlIlIlllI(lllllllllllllllIlIlllIlllIIIllIl.millis)) {
            Minecraft var10000 = lllllllllllllllIlIlllIlllIIIllIl.field_146297_k;
            GuiConnecting var10001 = new GuiConnecting;
            GuiScreen var10003 = lllllllllllllllIlIlllIlllIIIllIl.field_146307_h;
            Minecraft var10004 = lllllllllllllllIlIlllIlllIIIllIl.field_146297_k;
            ServerData var10005;
            if (lIIllIlIlIllll(AutoReconnect.cServer)) {
               var10005 = lllllllllllllllIlIlllIlllIIIllIl.field_146297_k.field_71422_O;
               "".length();
               if (((108 ^ 123) << " ".length() & ~((110 ^ 121) << " ".length())) < -" ".length()) {
                  return;
               }
            } else {
               var10005 = AutoReconnect.cServer;
            }

            var10001.<init>(var10003, var10004, var10005);
            var10000.func_147108_a(var10001);
         }

      }

      public void func_73863_a(int lllllllllllllllIlIlllIlllIIIIlII, int lllllllllllllllIlIlllIllIlllllIl, float lllllllllllllllIlIlllIlllIIIIIlI) {
         super.func_73863_a(lllllllllllllllIlIlllIlllIIIIlII, lllllllllllllllIlIlllIllIlllllIl, lllllllllllllllIlIlllIlllIIIIIlI);
         boolean lllllllllllllllIlIlllIllIllllIll = System.currentTimeMillis();
         lllllllllllllllIlIlllIlllIIIIlIl.millis = (int)((long)lllllllllllllllIlIlllIlllIIIIlIl.millis - (lllllllllllllllIlIlllIllIllllIll - lllllllllllllllIlIlllIlllIIIIlIl.cTime));
         lllllllllllllllIlIlllIlllIIIIlIl.cTime = lllllllllllllllIlIlllIllIllllIll;
         double lllllllllllllllIlIlllIllIllllIlI = String.valueOf((new StringBuilder()).append(lllIlIlllIlI[lllIlIlllIll[1]]).append(Math.max(0.0D, Math.floor((double)lllllllllllllllIlIlllIlllIIIIlIl.millis / 100.0D) / 10.0D)).append(lllIlIlllIlI[lllIlIlllIll[2]]));
         lllllllllllllllIlIlllIlllIIIIlIl.field_146289_q.func_175065_a(lllllllllllllllIlIlllIllIllllIlI, (float)(lllllllllllllllIlIlllIlllIIIIlIl.field_146294_l / lllIlIlllIll[3] - lllllllllllllllIlIlllIlllIIIIlIl.field_146289_q.func_78256_a(lllllllllllllllIlIlllIllIllllIlI) / lllIlIlllIll[3]), (float)(lllllllllllllllIlIlllIlllIIIIlIl.field_146295_m - lllIlIlllIll[4]), lllIlIlllIll[5], (boolean)lllIlIlllIll[2]);
         "".length();
      }

      public KamiGuiDisconnected(GuiDisconnected lllllllllllllllIlIlllIlllIIlIIlI) {
         super(lllllllllllllllIlIlllIlllIIlIIlI.field_146307_h, lllllllllllllllIlIlllIlllIIlIIlI.field_146306_a, lllllllllllllllIlIlllIlllIIlIIlI.field_146304_f);
         lllllllllllllllIlIlllIlllIIlIIIl.millis = (Integer)AutoReconnect.this.seconds.getValue() * lllIlIlllIll[0];
         lllllllllllllllIlIlllIlllIIlIIIl.cTime = System.currentTimeMillis();
      }

      private static void lIIllIlIlIllIl() {
         lllIlIlllIll = new int[7];
         lllIlIlllIll[0] = (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ 230 ^ 139) << "   ".length();
         lllIlIlllIll[1] = ((126 ^ 113) << (" ".length() << " ".length()) ^ 105 ^ 92) << (" ".length() << " ".length()) & ((87 + 24 - -19 + 47 ^ (90 ^ 77) << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length());
         lllIlIlllIll[2] = " ".length();
         lllIlIlllIll[3] = " ".length() << " ".length();
         lllIlIlllIll[4] = " ".length() << (" ".length() << (" ".length() << " ".length()));
         lllIlIlllIll[5] = (344814 + 274513 - 589275 + 390165 << "   ".length()) + (1282706 + 2058749 - 1602134 + 2062002 << " ".length()) - (3356584 + 6568209 - 8779771 + 6142485) + (1315864 + 1106267 - 1771819 + 2624773 << (" ".length() << " ".length()));
         lllIlIlllIll[6] = " ".length() << "   ".length();
      }

      private static boolean lIIllIlIlIllll(Object var0) {
         return var0 == null;
      }

      static {
         lIIllIlIlIllIl();
         lIIllIlIlIllII();
      }

      private static void lIIllIlIlIllII() {
         lllIlIlllIlI = new String[lllIlIlllIll[3]];
         lllIlIlllIlI[lllIlIlllIll[1]] = lIIllIlIlIlIll("SowX+EjLp//YejWJt0P4C8Xe2iJB/LVF", "ZjIga");
         lllIlIlllIlI[lllIlIlllIll[2]] = lIIllIlIlIlIll("iSkraNTLTaI=", "UiEOA");
      }

      private static boolean lIIllIlIlIlllI(int var0) {
         return var0 <= 0;
      }

      private static String lIIllIlIlIlIll(String lllllllllllllllIlIlllIllIlllIIII, String lllllllllllllllIlIlllIllIlllIIIl) {
         try {
            int lllllllllllllllIlIlllIllIllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), lllIlIlllIll[6]), "DES");
            String lllllllllllllllIlIlllIllIllIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIllIllIllIl.init(lllIlIlllIll[3], lllllllllllllllIlIlllIllIllIlllI);
            return new String(lllllllllllllllIlIlllIllIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }
}
