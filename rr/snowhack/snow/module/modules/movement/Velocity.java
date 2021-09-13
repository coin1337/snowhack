package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.server.SPacketEntityVelocity;
import net.minecraft.network.play.server.SPacketExplosion;
import rr.snowhack.snow.event.SnowEvent;
import rr.snowhack.snow.event.events.EntityEvent;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Velocity",
   description = "Modify knockback impact",
   category = Module.Category.MOVEMENT
)
public class Velocity extends Module {
   // $FF: synthetic field
   private static final int[] llllIllIlIIl;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Receive> packetEventListener;
   // $FF: synthetic field
   private Setting<Float> horizontal;
   // $FF: synthetic field
   private static final String[] llllIllIlIII;
   // $FF: synthetic field
   private Setting<Float> vertical;
   // $FF: synthetic field
   @EventHandler
   private Listener<EntityEvent.EntityCollision> entityCollisionListener;

   private static String lIlIIIIIlllIII(String lllllllllllllllIlIlIIlIIllIlllII, String lllllllllllllllIlIlIIlIIllIllIll) {
      try {
         char lllllllllllllllIlIlIIlIIllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIllIllIll.getBytes(StandardCharsets.UTF_8)), llllIllIlIIl[3]), "DES");
         Cipher lllllllllllllllIlIlIIlIIllIllllI = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIlIIllIllllI.init(llllIllIlIIl[2], lllllllllllllllIlIlIIlIIllIllIII);
         return new String(lllllllllllllllIlIlIIlIIllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIIIllllII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static String lIlIIIIIlllIIl(String lllllllllllllllIlIlIIlIIllllIIIl, String lllllllllllllllIlIlIIlIIllllIIII) {
      lllllllllllllllIlIlIIlIIllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIlIlIIlIIlllIlIlI = new StringBuilder();
      char[] lllllllllllllllIlIlIIlIIlllIlllI = lllllllllllllllIlIlIIlIIllllIIII.toCharArray();
      short lllllllllllllllIlIlIIlIIlllIlIII = llllIllIlIIl[0];
      Exception lllllllllllllllIlIlIIlIIlllIIlll = lllllllllllllllIlIlIIlIIllllIIIl.toCharArray();
      int lllllllllllllllIlIlIIlIIlllIIllI = lllllllllllllllIlIlIIlIIlllIIlll.length;
      int lllllllllllllllIlIlIIlIIlllIIlIl = llllIllIlIIl[0];

      do {
         if (!lIlIIIIlIIIIIl(lllllllllllllllIlIlIIlIIlllIIlIl, lllllllllllllllIlIlIIlIIlllIIllI)) {
            return String.valueOf(lllllllllllllllIlIlIIlIIlllIlIlI);
         }

         byte lllllllllllllllIlIlIIlIIlllIIlII = lllllllllllllllIlIlIIlIIlllIIlll[lllllllllllllllIlIlIIlIIlllIIlIl];
         lllllllllllllllIlIlIIlIIlllIlIlI.append((char)(lllllllllllllllIlIlIIlIIlllIIlII ^ lllllllllllllllIlIlIIlIIlllIlllI[lllllllllllllllIlIlIIlIIlllIlIII % lllllllllllllllIlIlIIlIIlllIlllI.length]));
         "".length();
         ++lllllllllllllllIlIlIIlIIlllIlIII;
         ++lllllllllllllllIlIlIIlIIlllIIlIl;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) == " ".length() << (" ".length() << " ".length()));

      return null;
   }

   private static boolean lIlIIIIIllllll(int var0, int var1) {
      return var0 == var1;
   }

   private static void lIlIIIIIlllIll() {
      llllIllIlIIl = new int[4];
      llllIllIlIIl[0] = (87 + 184 - 118 + 38 ^ (195 ^ 198) << (73 ^ 76)) << " ".length() & ((172 ^ 151 ^ (106 ^ 99) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
      llllIllIlIIl[1] = " ".length();
      llllIllIlIIl[2] = " ".length() << " ".length();
      llllIllIlIIl[3] = " ".length() << "   ".length();
   }

   private static void lIlIIIIIlllIlI() {
      llllIllIlIII = new String[llllIllIlIIl[2]];
      llllIllIlIII[llllIllIlIIl[0]] = lIlIIIIIlllIII("qmUNnJCulFltdNrM6mC4oQ==", "ZtWoI");
      llllIllIlIII[llllIllIlIIl[1]] = lIlIIIIIlllIIl("MSgVGgcELAs=", "gMgnn");
   }

   private static boolean lIlIIIIlIIIIII(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIIIIIlllllI(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIIIlIIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   public Velocity() {
      lllllllllllllllIlIlIIlIlIIIIlIIl.horizontal = lllllllllllllllIlIlIIlIlIIIIlIIl.register(Settings.f(llllIllIlIII[llllIllIlIIl[0]], 0.0F));
      lllllllllllllllIlIlIIlIlIIIIlIIl.vertical = lllllllllllllllIlIlIIlIlIIIIlIIl.register(Settings.f(llllIllIlIII[llllIllIlIIl[1]], 0.0F));
      lllllllllllllllIlIlIIlIlIIIIlIIl.packetEventListener = new Listener((lllllllllllllllIlIlIIlIIllllllIl) -> {
         if (lIlIIIIIllllII(lllllllllllllllIlIlIIlIIllllllIl.getEra(), SnowEvent.Era.PRE)) {
            if (lIlIIIIIlllllI(lllllllllllllllIlIlIIlIIllllllIl.getPacket() instanceof SPacketEntityVelocity)) {
               float lllllllllllllllIlIlIIlIIllllllII = (SPacketEntityVelocity)lllllllllllllllIlIlIIlIIllllllIl.getPacket();
               if (lIlIIIIIllllll(lllllllllllllllIlIlIIlIIllllllII.func_149412_c(), mc.field_71439_g.field_145783_c)) {
                  if (lIlIIIIlIIIIII(lIlIIIIIllllIl((Float)lllllllllllllllIlIlIIlIlIIIIIIII.horizontal.getValue(), 0.0F)) && lIlIIIIlIIIIII(lIlIIIIIllllIl((Float)lllllllllllllllIlIlIIlIlIIIIIIII.vertical.getValue(), 0.0F))) {
                     lllllllllllllllIlIlIIlIIllllllIl.cancel();
                  }

                  lllllllllllllllIlIlIIlIIllllllII.field_149415_b = (int)((float)lllllllllllllllIlIlIIlIIllllllII.field_149415_b * (Float)lllllllllllllllIlIlIIlIlIIIIIIII.horizontal.getValue());
                  lllllllllllllllIlIlIIlIIllllllII.field_149416_c = (int)((float)lllllllllllllllIlIlIIlIIllllllII.field_149416_c * (Float)lllllllllllllllIlIlIIlIlIIIIIIII.vertical.getValue());
                  lllllllllllllllIlIlIIlIIllllllII.field_149414_d = (int)((float)lllllllllllllllIlIlIIlIIllllllII.field_149414_d * (Float)lllllllllllllllIlIlIIlIlIIIIIIII.horizontal.getValue());
               }

               "".length();
               if (" ".length() > " ".length()) {
                  return;
               }
            } else if (lIlIIIIIlllllI(lllllllllllllllIlIlIIlIIllllllIl.getPacket() instanceof SPacketExplosion)) {
               if (lIlIIIIlIIIIII(lIlIIIIIllllIl((Float)lllllllllllllllIlIlIIlIlIIIIIIII.horizontal.getValue(), 0.0F)) && lIlIIIIlIIIIII(lIlIIIIIllllIl((Float)lllllllllllllllIlIlIIlIlIIIIIIII.vertical.getValue(), 0.0F))) {
                  lllllllllllllllIlIlIIlIIllllllIl.cancel();
               }

               SPacketExplosion lllllllllllllllIlIlIIlIlIIIIIIIl = (SPacketExplosion)lllllllllllllllIlIlIIlIIllllllIl.getPacket();
               lllllllllllllllIlIlIIlIlIIIIIIIl.field_149152_f *= (Float)lllllllllllllllIlIlIIlIlIIIIIIII.horizontal.getValue();
               lllllllllllllllIlIlIIlIlIIIIIIIl.field_149153_g *= (Float)lllllllllllllllIlIlIIlIlIIIIIIII.vertical.getValue();
               lllllllllllllllIlIlIIlIlIIIIIIIl.field_149159_h *= (Float)lllllllllllllllIlIlIIlIlIIIIIIII.horizontal.getValue();
            }
         }

      }, new Predicate[llllIllIlIIl[0]]);
      lllllllllllllllIlIlIIlIlIIIIlIIl.entityCollisionListener = new Listener((lllllllllllllllIlIlIIlIlIIIIIllI) -> {
         if (lIlIIIIIllllII(lllllllllllllllIlIlIIlIlIIIIIllI.getEntity(), mc.field_71439_g)) {
            lllllllllllllllIlIlIIlIlIIIIIllI.cancel();
         }

      }, new Predicate[llllIllIlIIl[0]]);
   }

   static {
      lIlIIIIIlllIll();
      lIlIIIIIlllIlI();
   }

   private static int lIlIIIIIllllIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
