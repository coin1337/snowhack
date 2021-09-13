package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.network.play.server.SPacketDisconnect;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AutoLog",
   description = "Automatically log when in danger or on low health",
   category = Module.Category.COMBAT
)
public class AutoLog extends Module {
   // $FF: synthetic field
   private static final String[] lIIIIllIllIlI;
   // $FF: synthetic field
   private Setting<Integer> health;
   // $FF: synthetic field
   long lastLog;
   // $FF: synthetic field
   @EventHandler
   private Listener<EntityJoinWorldEvent> entityJoinWorldEventListener;
   // $FF: synthetic field
   private static final int[] lIIIIllIllIll;
   // $FF: synthetic field
   @EventHandler
   private Listener<LivingDamageEvent> livingDamageEventListener;
   // $FF: synthetic field
   private boolean shouldLog;

   private static boolean lIlIllIIlIlllI(int var0) {
      return var0 != 0;
   }

   private static void lIlIllIIlIllII() {
      lIIIIllIllIll = new int[6];
      lIIIIllIllIll[0] = (99 ^ 86) & ~(181 ^ 128);
      lIIIIllIllIll[1] = (94 ^ 87) << (" ".length() << " ".length());
      lIIIIllIllIll[2] = "   ".length() << " ".length();
      lIIIIllIllIll[3] = " ".length();
      lIIIIllIllIll[4] = " ".length() << " ".length();
      lIIIIllIllIll[5] = "   ".length();
   }

   public AutoLog() {
      lllllllllllllllIIllllIllIllllIII.health = lllllllllllllllIIllllIllIllllIII.register(Settings.integerBuilder(lIIIIllIllIlI[lIIIIllIllIll[0]]).withRange(lIIIIllIllIll[0], lIIIIllIllIll[1]).withValue((Number)lIIIIllIllIll[2]).build());
      lllllllllllllllIIllllIllIllllIII.shouldLog = (boolean)lIIIIllIllIll[0];
      lllllllllllllllIIllllIllIllllIII.lastLog = System.currentTimeMillis();
      lllllllllllllllIIllllIllIllllIII.livingDamageEventListener = new Listener((lllllllllllllllIIllllIllIllIIlIl) -> {
         if (!lIlIllIIllIIIl(mc.field_71439_g)) {
            if (lIlIllIIllIIll(lllllllllllllllIIllllIllIllIIlIl.getEntity(), mc.field_71439_g) && lIlIllIIlIllll(lIlIllIIllIIlI(mc.field_71439_g.func_110143_aJ() - lllllllllllllllIIllllIllIllIIlIl.getAmount(), (float)(Integer)lllllllllllllllIIllllIllIllIlIII.health.getValue()))) {
               lllllllllllllllIIllllIllIllIlIII.log();
            }

         }
      }, new Predicate[lIIIIllIllIll[0]]);
      lllllllllllllllIIllllIllIllllIII.entityJoinWorldEventListener = new Listener((lllllllllllllllIIllllIllIllIllIl) -> {
         if (!lIlIllIIllIIIl(mc.field_71439_g)) {
            if (lIlIllIIlIlllI(lllllllllllllllIIllllIllIllIllIl.getEntity() instanceof EntityEnderCrystal) && lIlIllIIlIllll(lIlIllIIllIIII(mc.field_71439_g.func_110143_aJ() - AutoCrystal.calculateDamage((EntityEnderCrystal)lllllllllllllllIIllllIllIllIllIl.getEntity(), mc.field_71439_g), (float)(Integer)lllllllllllllllIIllllIllIllIlllI.health.getValue()))) {
               lllllllllllllllIIllllIllIllIlllI.log();
            }

         }
      }, new Predicate[lIIIIllIllIll[0]]);
   }

   private static String lIlIllIIlIlIlI(String lllllllllllllllIIllllIllIlIIlIII, String lllllllllllllllIIllllIllIlIIIlll) {
      lllllllllllllllIIllllIllIlIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIllIlIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllllIllIlIIlIll = new StringBuilder();
      char[] lllllllllllllllIIllllIllIlIIlIlI = lllllllllllllllIIllllIllIlIIIlll.toCharArray();
      long lllllllllllllllIIllllIllIlIIIlII = lIIIIllIllIll[0];
      String lllllllllllllllIIllllIllIlIIIIll = lllllllllllllllIIllllIllIlIIlIII.toCharArray();
      byte lllllllllllllllIIllllIllIlIIIIlI = lllllllllllllllIIllllIllIlIIIIll.length;
      int lllllllllllllllIIllllIllIlIIIIIl = lIIIIllIllIll[0];

      do {
         if (!lIlIllIIllIlII(lllllllllllllllIIllllIllIlIIIIIl, lllllllllllllllIIllllIllIlIIIIlI)) {
            return String.valueOf(lllllllllllllllIIllllIllIlIIlIll);
         }

         boolean lllllllllllllllIIllllIllIlIIIIII = lllllllllllllllIIllllIllIlIIIIll[lllllllllllllllIIllllIllIlIIIIIl];
         lllllllllllllllIIllllIllIlIIlIll.append((char)(lllllllllllllllIIllllIllIlIIIIII ^ lllllllllllllllIIllllIllIlIIlIlI[lllllllllllllllIIllllIllIlIIIlII % lllllllllllllllIIllllIllIlIIlIlI.length]));
         "".length();
         ++lllllllllllllllIIllllIllIlIIIlII;
         ++lllllllllllllllIIllllIllIlIIIIIl;
         "".length();
      } while((128 ^ 133) > 0);

      return null;
   }

   public void onUpdate() {
      if (lIlIllIIlIlllI(lllllllllllllllIIllllIllIlllIlII.shouldLog)) {
         lllllllllllllllIIllllIllIlllIlII.shouldLog = (boolean)lIIIIllIllIll[0];
         if (lIlIllIIlIllll(lIlIllIIlIllIl(System.currentTimeMillis() - lllllllllllllllIIllllIllIlllIlII.lastLog, 2000L))) {
            return;
         }

         Minecraft.func_71410_x().func_147114_u().func_147253_a(new SPacketDisconnect(new TextComponentString(lIIIIllIllIlI[lIIIIllIllIll[3]])));
      }

   }

   private static int lIlIllIIllIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void lIlIllIIlIlIll() {
      lIIIIllIllIlI = new String[lIIIIllIllIll[5]];
      lIIIIllIllIlI[lIIIIllIllIll[0]] = lIlIllIIlIlIIl("AsWIfSWXljs=", "hBOwT");
      lIIIIllIllIlI[lIIIIllIllIll[3]] = lIlIllIIlIlIlI("Nic3KAsYNSQiIw==", "wRCGG");
      lIIIIllIllIlI[lIIIIllIllIll[4]] = lIlIllIIlIlIlI("DywWAj4rOg0DAis6Fg==", "NYbml");
   }

   private static boolean lIlIllIIlIllll(int var0) {
      return var0 < 0;
   }

   private static boolean lIlIllIIllIIll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIllIIllIIIl(Object var0) {
      return var0 == null;
   }

   private static int lIlIllIIllIIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIllIIllIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIllIIlIlIIl(String lllllllllllllllIIllllIllIlIlllIl, String lllllllllllllllIIllllIllIlIllIlI) {
      try {
         SecretKeySpec lllllllllllllllIIllllIllIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIllIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         float lllllllllllllllIIllllIllIlIllIII = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllllIllIlIllIII.init(lIIIIllIllIll[4], lllllllllllllllIIllllIllIllIIIII);
         return new String(lllllllllllllllIIllllIllIlIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIllIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void log() {
      ModuleManager.getModuleByName(lIIIIllIllIlI[lIIIIllIllIll[4]]).disable();
      lllllllllllllllIIllllIllIlllIIlI.shouldLog = (boolean)lIIIIllIllIll[3];
      lllllllllllllllIIllllIllIlllIIlI.lastLog = System.currentTimeMillis();
   }

   static {
      lIlIllIIlIllII();
      lIlIllIIlIlIll();
   }

   private static int lIlIllIIlIllIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }
}
