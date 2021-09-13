package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.SPacketSpawnExperienceOrb;
import net.minecraft.network.play.server.SPacketSpawnGlobalEntity;
import net.minecraft.network.play.server.SPacketSpawnMob;
import net.minecraft.network.play.server.SPacketSpawnObject;
import net.minecraft.network.play.server.SPacketSpawnPainting;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.client.event.RenderBlockOverlayEvent.OverlayType;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "NoRender",
   category = Module.Category.RENDER,
   description = "Ignore entity spawn packets"
)
public class NoRender extends Module {
   // $FF: synthetic field
   private static final String[] lllIlIlIIlII;
   // $FF: synthetic field
   private static final int[] lllIlIlIIlIl;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Receive> receiveListener;
   // $FF: synthetic field
   private Setting<Boolean> mob;
   // $FF: synthetic field
   private Setting<Boolean> paint;
   // $FF: synthetic field
   private Setting<Boolean> object;
   // $FF: synthetic field
   private Setting<Boolean> fire;
   // $FF: synthetic field
   private Setting<Boolean> xp;
   // $FF: synthetic field
   @EventHandler
   public Listener<RenderBlockOverlayEvent> blockOverlayEventListener;
   // $FF: synthetic field
   private Setting<Boolean> gentity;

   private static String lIIllIIlIllIII(String lllllllllllllllIlIlllllIllIIIIII, String lllllllllllllllIlIlllllIllIIIIIl) {
      try {
         SecretKeySpec lllllllllllllllIlIlllllIllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIlIlIIlIl[7]), "DES");
         Cipher lllllllllllllllIlIlllllIllIIIlII = Cipher.getInstance("DES");
         lllllllllllllllIlIlllllIllIIIlII.init(lllIlIlIIlIl[2], lllllllllllllllIlIlllllIllIIIlIl);
         return new String(lllllllllllllllIlIlllllIllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIllIIlIllIIl(String lllllllllllllllIlIlllllIlIllIIll, String lllllllllllllllIlIlllllIlIllIIlI) {
      try {
         short lllllllllllllllIlIlllllIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlllllIlIllIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlllllIlIllIlll.init(lllIlIlIIlIl[2], lllllllllllllllIlIlllllIlIllIIIl);
         return new String(lllllllllllllllIlIlllllIlIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllIIlIlIlll(String lllllllllllllllIlIlllllIlIlIIIII, String lllllllllllllllIlIlllllIlIIlllll) {
      lllllllllllllllIlIlllllIlIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIlIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lllllllllllllllIlIlllllIlIIllllI = new StringBuilder();
      char[] lllllllllllllllIlIlllllIlIlIIIlI = lllllllllllllllIlIlllllIlIIlllll.toCharArray();
      int lllllllllllllllIlIlllllIlIlIIIIl = lllIlIlIIlIl[0];
      String lllllllllllllllIlIlllllIlIIllIll = lllllllllllllllIlIlllllIlIlIIIII.toCharArray();
      Exception lllllllllllllllIlIlllllIlIIllIlI = lllllllllllllllIlIlllllIlIIllIll.length;
      int lllllllllllllllIlIlllllIlIIllIIl = lllIlIlIIlIl[0];

      do {
         if (!lIIllIIlIlllll(lllllllllllllllIlIlllllIlIIllIIl, lllllllllllllllIlIlllllIlIIllIlI)) {
            return String.valueOf(lllllllllllllllIlIlllllIlIIllllI);
         }

         char lllllllllllllllIlIlllllIlIIllIII = lllllllllllllllIlIlllllIlIIllIll[lllllllllllllllIlIlllllIlIIllIIl];
         lllllllllllllllIlIlllllIlIIllllI.append((char)(lllllllllllllllIlIlllllIlIIllIII ^ lllllllllllllllIlIlllllIlIlIIIlI[lllllllllllllllIlIlllllIlIlIIIIl % lllllllllllllllIlIlllllIlIlIIIlI.length]));
         "".length();
         ++lllllllllllllllIlIlllllIlIlIIIIl;
         ++lllllllllllllllIlIlllllIlIIllIIl;
         "".length();
      } while(((34 ^ 117) << " ".length() ^ 50 + 118 - 108 + 111) > 0);

      return null;
   }

   public NoRender() {
      lllllllllllllllIlIlllllIllIllIlI.mob = lllllllllllllllIlIlllllIllIllIlI.register(Settings.b(lllIlIlIIlII[lllIlIlIIlIl[0]], (boolean)lllIlIlIIlIl[0]));
      lllllllllllllllIlIlllllIllIllIlI.gentity = lllllllllllllllIlIlllllIllIllIlI.register(Settings.b(lllIlIlIIlII[lllIlIlIIlIl[1]], (boolean)lllIlIlIIlIl[0]));
      lllllllllllllllIlIlllllIllIllIlI.object = lllllllllllllllIlIlllllIllIllIlI.register(Settings.b(lllIlIlIIlII[lllIlIlIIlIl[2]], (boolean)lllIlIlIIlIl[0]));
      lllllllllllllllIlIlllllIllIllIlI.xp = lllllllllllllllIlIlllllIllIllIlI.register(Settings.b(lllIlIlIIlII[lllIlIlIIlIl[3]], (boolean)lllIlIlIIlIl[0]));
      lllllllllllllllIlIlllllIllIllIlI.paint = lllllllllllllllIlIlllllIllIllIlI.register(Settings.b(lllIlIlIIlII[lllIlIlIIlIl[4]], (boolean)lllIlIlIIlIl[0]));
      lllllllllllllllIlIlllllIllIllIlI.fire = lllllllllllllllIlIlllllIllIllIlI.register(Settings.b(lllIlIlIIlII[lllIlIlIIlIl[5]], (boolean)lllIlIlIIlIl[1]));
      lllllllllllllllIlIlllllIllIllIlI.receiveListener = new Listener((lllllllllllllllIlIlllllIllIIlIll) -> {
         Packet lllllllllllllllIlIlllllIllIIllIl = lllllllllllllllIlIlllllIllIIlIll.getPacket();
         if (lIIllIIlIlllII(lllllllllllllllIlIlllllIllIIllIl instanceof SPacketSpawnMob) && !lIIllIIlIllllI((Boolean)lllllllllllllllIlIlllllIllIIllll.mob.getValue()) || lIIllIIlIlllII(lllllllllllllllIlIlllllIllIIllIl instanceof SPacketSpawnGlobalEntity) && !lIIllIIlIllllI((Boolean)lllllllllllllllIlIlllllIllIIllll.gentity.getValue()) || lIIllIIlIlllII(lllllllllllllllIlIlllllIllIIllIl instanceof SPacketSpawnObject) && !lIIllIIlIllllI((Boolean)lllllllllllllllIlIlllllIllIIllll.object.getValue()) || lIIllIIlIlllII(lllllllllllllllIlIlllllIllIIllIl instanceof SPacketSpawnExperienceOrb) && !lIIllIIlIllllI((Boolean)lllllllllllllllIlIlllllIllIIllll.xp.getValue()) || lIIllIIlIlllII(lllllllllllllllIlIlllllIllIIllIl instanceof SPacketSpawnPainting) && lIIllIIlIlllII((Boolean)lllllllllllllllIlIlllllIllIIllll.paint.getValue())) {
            lllllllllllllllIlIlllllIllIIlIll.cancel();
         }

      }, new Predicate[lllIlIlIIlIl[0]]);
      lllllllllllllllIlIlllllIllIllIlI.blockOverlayEventListener = new Listener((lllllllllllllllIlIlllllIllIlIlIl) -> {
         if (lIIllIIlIlllII((Boolean)lllllllllllllllIlIlllllIllIlIlII.fire.getValue()) && lIIllIIlIlllIl(lllllllllllllllIlIlllllIllIlIlIl.getOverlayType(), OverlayType.FIRE)) {
            lllllllllllllllIlIlllllIllIlIlIl.setCanceled((boolean)lllIlIlIIlIl[1]);
         }

      }, new Predicate[lllIlIlIIlIl[0]]);
   }

   private static boolean lIIllIIlIlllll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllIIlIllllI(int var0) {
      return var0 == 0;
   }

   private static void lIIllIIlIllIll() {
      lllIlIlIIlIl = new int[8];
      lllIlIlIIlIl[0] = ((107 ^ 36) << " ".length() ^ 20 + 67 - 39 + 83) & (5 ^ 32 ^ (62 ^ 57) << "   ".length() ^ -" ".length());
      lllIlIlIIlIl[1] = " ".length();
      lllIlIlIIlIl[2] = " ".length() << " ".length();
      lllIlIlIIlIl[3] = "   ".length();
      lllIlIlIIlIl[4] = " ".length() << (" ".length() << " ".length());
      lllIlIlIIlIl[5] = 40 + 144 - 74 + 51 ^ (101 ^ 76) << (" ".length() << " ".length());
      lllIlIlIIlIl[6] = "   ".length() << " ".length();
      lllIlIlIIlIl[7] = " ".length() << "   ".length();
   }

   private static boolean lIIllIIlIlllIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIIllIIlIllIlI() {
      lllIlIlIIlII = new String[lllIlIlIIlIl[6]];
      lllIlIlIIlII[lllIlIlIIlIl[0]] = lIIllIIlIlIlll("OiUo", "wJJsd");
      lllIlIlIIlII[lllIlIlIIlIl[1]] = lIIllIIlIllIII("7C9la8Vxm5k=", "xfeRh");
      lllIlIlIIlII[lllIlIlIIlIl[2]] = lIIllIIlIlIlll("DQwFHQ42", "Bnoxm");
      lllIlIlIIlII[lllIlIlIIlIl[3]] = lIIllIIlIllIII("caEg8o1O75U=", "LnQiG");
      lllIlIlIIlII[lllIlIlIIlIl[4]] = lIIllIIlIllIIl("jtSwXsJd1zd9TK2CK+CBxA==", "yUJPF");
      lllIlIlIIlII[lllIlIlIIlIl[5]] = lIIllIIlIllIIl("Glln3uveUXI=", "jPnGB");
   }

   private static boolean lIIllIIlIlllII(int var0) {
      return var0 != 0;
   }

   static {
      lIIllIIlIllIll();
      lIIllIIlIllIlI();
   }
}
