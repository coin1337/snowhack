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
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraftforge.client.event.GuiOpenEvent;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "GodMode",
   category = Module.Category.PLAYER
)
public class GodMode extends Module {
   // $FF: synthetic field
   private Setting<GodMode.Mode> mode;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> listener;
   // $FF: synthetic field
   private static final String[] lllllIllIIll;
   // $FF: synthetic field
   private static final int[] lllllIllIlII;
   // $FF: synthetic field
   @EventHandler
   public Listener<GuiOpenEvent> guiOpenEventListener;

   private static boolean lIlIIlIIIIIllI(int var0) {
      return var0 != 0;
   }

   private static void lIlIIlIIIIIIll() {
      lllllIllIIll = new String[lllllIllIlII[4]];
      lllllIllIIll[lllllIllIlII[0]] = lIlIIlIIIIIIIl("kQ8Y9jiKarc=", "iZlIf");
      lllllIllIIll[lllllIllIlII[2]] = lIlIIlIIIIIIlI("PlAJk1ynn5I=", "ocWrm");
      lllllIllIIll[lllllIllIlII[3]] = lIlIIlIIIIIIIl("DJ0wRKQ/n9E=", "iBAWe");
   }

   public String getHudInfo() {
      return lllllllllllllllIlIIllIlIlIIlIIIl.mode.getValueAsString().replaceAll(lllllIllIIll[lllllIllIlII[2]], lllllIllIIll[lllllIllIlII[3]]);
   }

   static {
      lIlIIlIIIIIlII();
      lIlIIlIIIIIIll();
   }

   private static String lIlIIlIIIIIIIl(String lllllllllllllllIlIIllIlIIllIllll, String lllllllllllllllIlIIllIlIIllIllII) {
      try {
         SecretKeySpec lllllllllllllllIlIIllIlIIlllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIllIllII.getBytes(StandardCharsets.UTF_8)), lllllIllIlII[5]), "DES");
         Cipher lllllllllllllllIlIIllIlIIlllIIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIIllIlIIlllIIIl.init(lllllIllIlII[3], lllllllllllllllIlIIllIlIIlllIIlI);
         return new String(lllllllllllllllIlIIllIlIIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIlIIIIIlIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private static String lIlIIlIIIIIIlI(String lllllllllllllllIlIIllIlIIllllIlI, String lllllllllllllllIlIIllIlIIllllIIl) {
      try {
         int lllllllllllllllIlIIllIlIIllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIllIlIIllllllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIllIlIIllllllI.init(lllllIllIlII[3], lllllllllllllllIlIIllIlIIllllIII);
         return new String(lllllllllllllllIlIIllIlIIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      if (lIlIIlIIIIIlIl(lllllllllllllllIlIIllIlIlIIlIllI.mode.getValue(), GodMode.Mode.FakeDeath)) {
         mc.field_71439_g.func_70606_j(20.0F);
         mc.field_71439_g.func_71024_bL().func_75114_a(lllllIllIlII[1]);
         mc.field_71439_g.field_70128_L = (boolean)lllllIllIlII[0];
         if (lIlIIlIIIIIllI(mc.field_71462_r instanceof GuiGameOver)) {
            mc.func_147108_a((GuiScreen)null);
         }
      }

   }

   public void onDisable() {
      if (lIlIIlIIIIIlIl(lllllllllllllllIlIIllIlIlIIlIIll.mode.getValue(), GodMode.Mode.FakeDeath)) {
         mc.field_71439_g.func_71004_bE();
      }

   }

   public GodMode() {
      lllllllllllllllIlIIllIlIlIIllIlI.mode = lllllllllllllllIlIIllIlIlIIllIlI.register(Settings.e(lllllIllIIll[lllllIllIlII[0]], GodMode.Mode.Portal));
      lllllllllllllllIlIIllIlIlIIllIlI.listener = new Listener((lllllllllllllllIlIIllIlIlIIIIllI) -> {
         if (lIlIIlIIIIIllI(lllllllllllllllIlIIllIlIlIIIIlll.isEnabled()) && lIlIIlIIIIIllI(lllllllllllllllIlIIllIlIlIIIIllI.getPacket() instanceof CPacketConfirmTeleport)) {
            lllllllllllllllIlIIllIlIlIIIIllI.cancel();
         }

         if (lIlIIlIIIIIlIl(lllllllllllllllIlIIllIlIlIIIIlll.mode.getValue(), GodMode.Mode.Packet) && lIlIIlIIIIIllI(lllllllllllllllIlIIllIlIlIIIIllI.getPacket() instanceof CPacketPlayer)) {
            lllllllllllllllIlIIllIlIlIIIIllI.cancel();
         }

      }, new Predicate[lllllIllIlII[0]]);
      lllllllllllllllIlIIllIlIlIIllIlI.guiOpenEventListener = new Listener((lllllllllllllllIlIIllIlIlIIIlIlI) -> {
         if (lIlIIlIIIIIllI(lllllllllllllllIlIIllIlIlIIIlIll.isEnabled()) && lIlIIlIIIIIllI(lllllllllllllllIlIIllIlIlIIIlIlI.getGui() instanceof GuiGameOver) && lIlIIlIIIIIlIl(lllllllllllllllIlIIllIlIlIIIlIll.mode.getValue(), GodMode.Mode.FakeDeath)) {
            lllllllllllllllIlIIllIlIlIIIlIlI.setCanceled((boolean)lllllIllIlII[2]);
         }

      }, new Predicate[lllllIllIlII[0]]);
   }

   private static void lIlIIlIIIIIlII() {
      lllllIllIlII = new int[6];
      lllllIllIlII[0] = ((152 ^ 187) << " ".length() ^ 113 ^ 62) << (" ".length() << " ".length()) & ((202 ^ 175 ^ (97 ^ 122) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length());
      lllllIllIlII[1] = ((7 ^ 56) << " ".length() ^ 99 ^ 24) << (" ".length() << " ".length());
      lllllIllIlII[2] = " ".length();
      lllllIllIlII[3] = " ".length() << " ".length();
      lllllIllIlII[4] = "   ".length();
      lllllIllIlII[5] = " ".length() << "   ".length();
   }

   private static enum Mode {
      // $FF: synthetic field
      private static final String[] lIIIlIlIIIIll;
      // $FF: synthetic field
      Packet;

      // $FF: synthetic field
      private static final int[] lIIIlIlIIIlIl;
      // $FF: synthetic field
      FakeDeath,
      // $FF: synthetic field
      Portal;

      static {
         lIllIIIIlIIIll();
         lIllIIIIIllllI();
         Portal = new GodMode.Mode(lIIIlIlIIIIll[lIIIlIlIIIlIl[0]], lIIIlIlIIIlIl[0]);
         FakeDeath = new GodMode.Mode(lIIIlIlIIIIll[lIIIlIlIIIlIl[1]], lIIIlIlIIIlIl[1]);
         Packet = new GodMode.Mode(lIIIlIlIIIIll[lIIIlIlIIIlIl[2]], lIIIlIlIIIlIl[2]);
         GodMode.Mode[] var10000 = new GodMode.Mode[lIIIlIlIIIlIl[3]];
         var10000[lIIIlIlIIIlIl[0]] = Portal;
         var10000[lIIIlIlIIIlIl[1]] = FakeDeath;
         var10000[lIIIlIlIIIlIl[2]] = Packet;
      }

      private static void lIllIIIIlIIIll() {
         lIIIlIlIIIlIl = new int[5];
         lIIIlIlIIIlIl[0] = (173 ^ 192 ^ (115 ^ 120) << "   ".length()) & (226 ^ 189 ^ (180 ^ 129) << " ".length() ^ -" ".length());
         lIIIlIlIIIlIl[1] = " ".length();
         lIIIlIlIIIlIl[2] = " ".length() << " ".length();
         lIIIlIlIIIlIl[3] = "   ".length();
         lIIIlIlIIIlIl[4] = " ".length() << "   ".length();
      }

      private static String lIllIIIIIlllII(String lllllllllllllllIIllIllllIlIlllIl, String lllllllllllllllIIllIllllIlIllllI) {
         try {
            boolean lllllllllllllllIIllIllllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIlIllllI.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIlIl[4]), "DES");
            Cipher lllllllllllllllIIllIllllIllIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIIllIllllIllIIIIl.init(lIIIlIlIIIlIl[2], lllllllllllllllIIllIllllIlIllIll);
            return new String(lllllllllllllllIIllIllllIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static String lIllIIIIIlllIl(String lllllllllllllllIIllIllllIlIlIIII, String lllllllllllllllIIllIllllIlIIllll) {
         try {
            SecretKeySpec lllllllllllllllIIllIllllIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllllIlIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllllIlIlIlII.init(lIIIlIlIIIlIl[2], lllllllllllllllIIllIllllIlIlIlIl);
            return new String(lllllllllllllllIIllIllllIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static void lIllIIIIIllllI() {
         lIIIlIlIIIIll = new String[lIIIlIlIIIlIl[3]];
         lIIIlIlIIIIll[lIIIlIlIIIlIl[0]] = lIllIIIIIlllII("Nkj5ceQt9CU=", "jBdhN");
         lIIIlIlIIIIll[lIIIlIlIIIlIl[1]] = lIllIIIIIlllIl("nQnBliASFJyZwKZOh2/iUg==", "zkEKT");
         lIIIlIlIIIIll[lIIIlIlIIIlIl[2]] = lIllIIIIIlllIl("9XK7tTrOZSs=", "XDFNi");
      }
   }
}
