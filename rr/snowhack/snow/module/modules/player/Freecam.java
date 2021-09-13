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
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketInput;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.event.events.PlayerMoveEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Freecam",
   category = Module.Category.PLAYER,
   description = "Leave your body and trascend into the realm of the gods"
)
public class Freecam extends Module {
   // $FF: synthetic field
   private Setting<Integer> speed;
   // $FF: synthetic field
   @EventHandler
   private Listener<PlayerSPPushOutOfBlocksEvent> pushListener;
   // $FF: synthetic field
   private boolean isRidingEntity;
   // $FF: synthetic field
   private double posX;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Send> sendListener;
   // $FF: synthetic field
   private static final int[] lIIIlIlIlIIlI;
   // $FF: synthetic field
   private double posY;
   // $FF: synthetic field
   private float pitch;
   // $FF: synthetic field
   private Setting<Boolean> cancelPacket;
   // $FF: synthetic field
   private EntityOtherPlayerMP clonedPlayer;
   // $FF: synthetic field
   @EventHandler
   private Listener<PlayerMoveEvent> moveListener;
   // $FF: synthetic field
   private static final String[] lIIIlIlIlIIIl;
   // $FF: synthetic field
   private Entity ridingEntity;
   // $FF: synthetic field
   private double posZ;
   // $FF: synthetic field
   private float yaw;

   private static void lIllIIIIlllllI() {
      lIIIlIlIlIIIl = new String[lIIIlIlIlIIlI[4]];
      lIIIlIlIlIIIl[lIIIlIlIlIIlI[0]] = lIllIIIIllllII("JCgEIAI=", "wXaEf");
      lIIIlIlIlIIIl[lIIIlIlIlIIlI[2]] = lIllIIIIllllIl("FIuOiXFYX5bf1SBoyRcJPg==", "VNTrU");
   }

   protected void onDisable() {
      long lllllllllllllllIIllIllIIlllIlIll = mc.field_71439_g;
      if (lIllIIIlIIIIII(lllllllllllllllIIllIllIIlllIlIll)) {
         mc.field_71439_g.func_70080_a(lllllllllllllllIIllIllIIlllIlllI.posX, lllllllllllllllIIllIllIIlllIlllI.posY, lllllllllllllllIIllIllIIlllIlllI.posZ, lllllllllllllllIIllIllIIlllIlllI.yaw, lllllllllllllllIIllIllIIlllIlllI.pitch);
         mc.field_71441_e.func_73028_b(lIIIlIlIlIIlI[3]);
         "".length();
         lllllllllllllllIIllIllIIlllIlllI.clonedPlayer = null;
         lllllllllllllllIIllIllIIlllIlllI.posX = lllllllllllllllIIllIllIIlllIlllI.posY = lllllllllllllllIIllIllIIlllIlllI.posZ = 0.0D;
         lllllllllllllllIIllIllIIlllIlllI.pitch = lllllllllllllllIIllIllIIlllIlllI.yaw = 0.0F;
         mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)lIIIlIlIlIIlI[0];
         mc.field_71439_g.field_71075_bZ.func_75092_a(0.05F);
         mc.field_71439_g.field_70145_X = (boolean)lIIIlIlIlIIlI[0];
         mc.field_71439_g.field_70159_w = mc.field_71439_g.field_70181_x = mc.field_71439_g.field_70179_y = 0.0D;
         if (lIllIIIlIIIIlI(lllllllllllllllIIllIllIIlllIlllI.isRidingEntity)) {
            mc.field_71439_g.func_184205_a(lllllllllllllllIIllIllIIlllIlllI.ridingEntity, (boolean)lIIIlIlIlIIlI[2]);
            "".length();
         }
      }

   }

   protected void onEnable() {
      if (lIllIIIlIIIIII(mc.field_71439_g)) {
         int var10001;
         if (lIllIIIlIIIIII(mc.field_71439_g.func_184187_bx())) {
            var10001 = lIIIlIlIlIIlI[2];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
               return;
            }
         } else {
            var10001 = lIIIlIlIlIIlI[0];
         }

         lllllllllllllllIIllIllIIllllIIlI.isRidingEntity = (boolean)var10001;
         if (lIllIIIlIIIIIl(mc.field_71439_g.func_184187_bx())) {
            lllllllllllllllIIllIllIIllllIIlI.posX = mc.field_71439_g.field_70165_t;
            lllllllllllllllIIllIllIIllllIIlI.posY = mc.field_71439_g.field_70163_u;
            lllllllllllllllIIllIllIIllllIIlI.posZ = mc.field_71439_g.field_70161_v;
            "".length();
            if (null != null) {
               return;
            }
         } else {
            lllllllllllllllIIllIllIIllllIIlI.ridingEntity = mc.field_71439_g.func_184187_bx();
            mc.field_71439_g.func_184210_p();
         }

         lllllllllllllllIIllIllIIllllIIlI.pitch = mc.field_71439_g.field_70125_A;
         lllllllllllllllIIllIllIIllllIIlI.yaw = mc.field_71439_g.field_70177_z;
         lllllllllllllllIIllIllIIllllIIlI.clonedPlayer = new EntityOtherPlayerMP(mc.field_71441_e, mc.func_110432_I().func_148256_e());
         lllllllllllllllIIllIllIIllllIIlI.clonedPlayer.func_82149_j(mc.field_71439_g);
         lllllllllllllllIIllIllIIllllIIlI.clonedPlayer.field_70759_as = mc.field_71439_g.field_70759_as;
         mc.field_71441_e.func_73027_a(lIIIlIlIlIIlI[3], lllllllllllllllIIllIllIIllllIIlI.clonedPlayer);
         mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)lIIIlIlIlIIlI[2];
         mc.field_71439_g.field_71075_bZ.func_75092_a((float)(Integer)lllllllllllllllIIllIllIIllllIIlI.speed.getValue() / 100.0F);
         mc.field_71439_g.field_70145_X = (boolean)lIIIlIlIlIIlI[2];
      }

   }

   static {
      lIllIIIIllllll();
      lIllIIIIlllllI();
   }

   private static String lIllIIIIllllII(String lllllllllllllllIIllIllIIllIIIIIl, String lllllllllllllllIIllIllIIllIIIlIl) {
      lllllllllllllllIIllIllIIllIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllllllllllllllIIllIllIIlIllllll = new StringBuilder();
      char lllllllllllllllIIllIllIIlIlllllI = lllllllllllllllIIllIllIIllIIIlIl.toCharArray();
      int lllllllllllllllIIllIllIIllIIIIlI = lIIIlIlIlIIlI[0];
      byte lllllllllllllllIIllIllIIlIllllII = lllllllllllllllIIllIllIIllIIIIIl.toCharArray();
      byte lllllllllllllllIIllIllIIlIlllIll = lllllllllllllllIIllIllIIlIllllII.length;
      int lllllllllllllllIIllIllIIlIlllIlI = lIIIlIlIlIIlI[0];

      do {
         if (!lIllIIIlIIIlII(lllllllllllllllIIllIllIIlIlllIlI, lllllllllllllllIIllIllIIlIlllIll)) {
            return String.valueOf(lllllllllllllllIIllIllIIlIllllll);
         }

         int lllllllllllllllIIllIllIIlIlllIIl = lllllllllllllllIIllIllIIlIllllII[lllllllllllllllIIllIllIIlIlllIlI];
         lllllllllllllllIIllIllIIlIllllll.append((char)(lllllllllllllllIIllIllIIlIlllIIl ^ lllllllllllllllIIllIllIIlIlllllI[lllllllllllllllIIllIllIIllIIIIlI % lllllllllllllllIIllIllIIlIlllllI.length]));
         "".length();
         ++lllllllllllllllIIllIllIIllIIIIlI;
         ++lllllllllllllllIIllIllIIlIlllIlI;
         "".length();
      } while(((182 ^ 179) & ~(154 ^ 159)) <= "   ".length());

      return null;
   }

   private static boolean lIllIIIlIIIIlI(int var0) {
      return var0 != 0;
   }

   public Freecam() {
      lllllllllllllllIIllIllIIllllIlII.speed = lllllllllllllllIIllIllIIllllIlII.register(Settings.i(lIIIlIlIlIIIl[lIIIlIlIlIIlI[0]], lIIIlIlIlIIlI[1]));
      lllllllllllllllIIllIllIIllllIlII.cancelPacket = lllllllllllllllIIllIllIIllllIlII.register(Settings.b(lIIIlIlIlIIIl[lIIIlIlIlIIlI[2]], (boolean)lIIIlIlIlIIlI[2]));
      lllllllllllllllIIllIllIIllllIlII.moveListener = new Listener((lllllllllllllllIIllIllIIllIllllI) -> {
         mc.field_71439_g.field_70145_X = (boolean)lIIIlIlIlIIlI[2];
      }, new Predicate[lIIIlIlIlIIlI[0]]);
      lllllllllllllllIIllIllIIllllIlII.pushListener = new Listener((lllllllllllllllIIllIllIIllIlllll) -> {
         lllllllllllllllIIllIllIIllIlllll.setCanceled((boolean)lIIIlIlIlIIlI[2]);
      }, new Predicate[lIIIlIlIlIIlI[0]]);
      lllllllllllllllIIllIllIIllllIlII.sendListener = new Listener((lllllllllllllllIIllIllIIlllIIlII) -> {
         if ((!lIllIIIlIIIIll(lllllllllllllllIIllIllIIlllIIlII.getPacket() instanceof CPacketPlayer) || lIllIIIlIIIIlI(lllllllllllllllIIllIllIIlllIIlII.getPacket() instanceof CPacketInput)) && lIllIIIlIIIIlI((Boolean)lllllllllllllllIIllIllIIlllIIlIl.cancelPacket.getValue())) {
            lllllllllllllllIIllIllIIlllIIlII.cancel();
         }

      }, new Predicate[lIIIlIlIlIIlI[0]]);
   }

   public void onUpdate() {
      mc.field_71439_g.field_71075_bZ.field_75100_b = (boolean)lIIIlIlIlIIlI[2];
      mc.field_71439_g.field_71075_bZ.func_75092_a((float)(Integer)lllllllllllllllIIllIllIIlllIlIII.speed.getValue() / 100.0F);
      mc.field_71439_g.field_70145_X = (boolean)lIIIlIlIlIIlI[2];
      mc.field_71439_g.field_70122_E = (boolean)lIIIlIlIlIIlI[0];
      mc.field_71439_g.field_70143_R = 0.0F;
   }

   private static boolean lIllIIIlIIIIll(int var0) {
      return var0 == 0;
   }

   private static boolean lIllIIIlIIIIIl(Object var0) {
      return var0 == null;
   }

   private static String lIllIIIIllllIl(String lllllllllllllllIIllIllIIllIlIllI, String lllllllllllllllIIllIllIIllIlIIll) {
      try {
         SecretKeySpec lllllllllllllllIIllIllIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIllIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIlIIlI[5]), "DES");
         Cipher lllllllllllllllIIllIllIIllIllIII = Cipher.getInstance("DES");
         lllllllllllllllIIllIllIIllIllIII.init(lIIIlIlIlIIlI[4], lllllllllllllllIIllIllIIllIllIIl);
         return new String(lllllllllllllllIIllIllIIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIlIIIIII(Object var0) {
      return var0 != null;
   }

   private static boolean lIllIIIlIIIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIllIIIIllllll() {
      lIIIlIlIlIIlI = new int[6];
      lIIIlIlIlIIlI[0] = (193 ^ 150 ^ (99 ^ 90) << " ".length()) & ((68 ^ 81) << (" ".length() << " ".length()) ^ 234 ^ 155 ^ -" ".length());
      lIIIlIlIlIIlI[1] = 176 ^ 181;
      lIIIlIlIlIIlI[2] = " ".length();
      lIIIlIlIlIIlI[3] = -(197 ^ 161);
      lIIIlIlIlIIlI[4] = " ".length() << " ".length();
      lIIIlIlIlIIlI[5] = " ".length() << "   ".length();
   }
}
