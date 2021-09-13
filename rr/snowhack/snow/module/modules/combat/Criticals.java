package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.network.play.client.CPacketUseEntity.Action;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Criticals",
   category = Module.Category.COMBAT
)
public class Criticals extends Module {
   // $FF: synthetic field
   private Setting<Boolean> sync;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Send> sendListener;
   // $FF: synthetic field
   private static final String[] llllllIIllII;
   // $FF: synthetic field
   private static final int[] llllllIIllll;

   public void onUpdate() {
      if (lIlIIlIIlllIll((Boolean)lllllllllllllllIlIIlIlllIIlllIlI.sync.getValue())) {
         lllllllllllllllIlIIlIlllIIlllIlI.getBind().setKey(ModuleManager.getModuleByName(llllllIIllII[llllllIIllll[1]]).getBind().getKey());
      }

   }

   private static void lIlIIlIIlllIIl() {
      llllllIIllII = new String[llllllIIllll[2]];
      llllllIIllII[llllllIIllll[0]] = lIlIIlIIlllIII("T0exXGLVc9AL9yWlRTUDbg==", "tdZOR");
      llllllIIllII[llllllIIllll[1]] = lIlIIlIIlllIII("wUSpv9x0g9s=", "JuNLO");
   }

   private static boolean lIlIIlIIlllIll(int var0) {
      return var0 != 0;
   }

   private static String lIlIIlIIlllIII(String lllllllllllllllIlIIlIlllIIlIlllI, String lllllllllllllllIlIIlIlllIIlIllIl) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIlllIIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIlIIlIlllIIlIlIIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIlllIIlIlIIl.init(llllllIIllll[2], lllllllllllllllIlIIlIlllIIllIIIl);
         return new String(lllllllllllllllIlIIlIlllIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIlIIlIIlllIlI();
      lIlIIlIIlllIIl();
   }

   private static void lIlIIlIIlllIlI() {
      llllllIIllll = new int[3];
      llllllIIllll[0] = " ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()));
      llllllIIllll[1] = " ".length();
      llllllIIllll[2] = " ".length() << " ".length();
   }

   public Criticals() {
      lllllllllllllllIlIIlIlllIIllllII.sync = lllllllllllllllIlIIlIlllIIllllII.register(Settings.b(llllllIIllII[llllllIIllll[0]], (boolean)llllllIIllll[1]));
      lllllllllllllllIlIIlIlllIIllllII.sendListener = new Listener((lllllllllllllllIlIIlIlllIIllIllI) -> {
         if (lIlIIlIIlllIll(lllllllllllllllIlIIlIlllIIllIllI.getPacket() instanceof CPacketUseEntity) && lIlIIlIIllllII(((CPacketUseEntity)lllllllllllllllIlIIlIlllIIllIllI.getPacket()).func_149565_c(), Action.ATTACK) && lIlIIlIIlllIll(mc.field_71439_g.field_70122_E)) {
            mc.field_71439_g.field_71174_a.func_147297_a(new Position(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u + 0.10000000149011612D, mc.field_71439_g.field_70161_v, (boolean)llllllIIllll[0]));
            mc.field_71439_g.field_71174_a.func_147297_a(new Position(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u, mc.field_71439_g.field_70161_v, (boolean)llllllIIllll[0]));
         }

      }, new Predicate[llllllIIllll[0]]);
   }

   private static boolean lIlIIlIIllllII(Object var0, Object var1) {
      return var0 == var1;
   }
}
