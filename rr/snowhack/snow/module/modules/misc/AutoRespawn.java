package rr.snowhack.snow.module.modules.misc;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiScreen;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.GuiScreenEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AutoRespawn",
   description = "Automatically respawns upon death and tells you where you died",
   category = Module.Category.MISC
)
public class AutoRespawn extends Module {
   // $FF: synthetic field
   private static final int[] lIIIIIIIlllII;
   // $FF: synthetic field
   private Setting<Boolean> respawn;
   // $FF: synthetic field
   @EventHandler
   public Listener<GuiScreenEvent.Displayed> listener;
   // $FF: synthetic field
   private static final String[] lIIIIIIIllIlI;
   // $FF: synthetic field
   private Setting<Boolean> deathCoords;

   private static String lIlIIlllIIIIII(String lllllllllllllllIlIIlIIIIllIlllIl, String lllllllllllllllIlIIlIIIIllIllllI) {
      try {
         Exception lllllllllllllllIlIIlIIIIllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIlIIlIIIIllIllIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIIIIllIllIlI.init(lIIIIIIIlllII[2], lllllllllllllllIlIIlIIIIllIllIll);
         return new String(lllllllllllllllIlIIlIIIIllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIIlllIIIlII() {
      lIIIIIIIllIlI = new String[lIIIIIIIlllII[3]];
      lIIIIIIIllIlI[lIIIIIIIlllII[0]] = lIlIIlllIIIIII("Yiiams0F4C4E+a+9dj6mog==", "NdYDX");
      lIIIIIIIllIlI[lIIIIIIIlllII[1]] = lIlIIlllIIIIII("Pmuk/jL8wMQ=", "lsqVz");
      lIIIIIIIllIlI[lIIIIIIIlllII[2]] = lIlIIlllIIIIII("9oTmHfSaw0WpMIc8VtYywtazGsEhqw+GLySeWeVGqfM=", "EFtQv");
   }

   public AutoRespawn() {
      lllllllllllllllIlIIlIIIIlllIlllI.deathCoords = lllllllllllllllIlIIlIIIIlllIlllI.register(Settings.b(lIIIIIIIllIlI[lIIIIIIIlllII[0]], (boolean)lIIIIIIIlllII[0]));
      lllllllllllllllIlIIlIIIIlllIlllI.respawn = lllllllllllllllIlIIlIIIIlllIlllI.register(Settings.b(lIIIIIIIllIlI[lIIIIIIIlllII[1]], (boolean)lIIIIIIIlllII[1]));
      lllllllllllllllIlIIlIIIIlllIlllI.listener = new Listener((lllllllllllllllIlIIlIIIIlllIlIIl) -> {
         if (lIlIIlllIIIlll(lllllllllllllllIlIIlIIIIlllIlIIl.getScreen() instanceof GuiGameOver)) {
            if (lIlIIlllIIIlll((Boolean)lllllllllllllllIlIIlIIIIlllIlIII.deathCoords.getValue())) {
               String var10000 = lIIIIIIIllIlI[lIIIIIIIlllII[2]];
               Object[] var10001 = new Object[lIIIIIIIlllII[3]];
               var10001[lIIIIIIIlllII[0]] = (int)mc.field_71439_g.field_70165_t;
               var10001[lIIIIIIIlllII[1]] = (int)mc.field_71439_g.field_70163_u;
               var10001[lIIIIIIIlllII[2]] = (int)mc.field_71439_g.field_70161_v;
               Command.sendChatMessage(String.format(var10000, var10001));
            }

            if (lIlIIlllIIIlll((Boolean)lllllllllllllllIlIIlIIIIlllIlIII.respawn.getValue())) {
               mc.field_71439_g.func_71004_bE();
               mc.func_147108_a((GuiScreen)null);
            }
         }

      }, new Predicate[lIIIIIIIlllII[0]]);
   }

   static {
      lIlIIlllIIIllI();
      lIlIIlllIIIlII();
   }

   private static boolean lIlIIlllIIIlll(int var0) {
      return var0 != 0;
   }

   private static void lIlIIlllIIIllI() {
      lIIIIIIIlllII = new int[4];
      lIIIIIIIlllII[0] = (45 ^ 34) << " ".length() & ~((134 ^ 137) << " ".length());
      lIIIIIIIlllII[1] = " ".length();
      lIIIIIIIlllII[2] = " ".length() << " ".length();
      lIIIIIIIlllII[3] = "   ".length();
   }
}
