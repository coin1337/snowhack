package rr.snowhack.snow.module.modules.movement;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.entity.EntityOtherPlayerMP;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "Blink",
   category = Module.Category.MOVEMENT
)
public class Blink extends Module {
   // $FF: synthetic field
   private EntityOtherPlayerMP clonedPlayer;
   // $FF: synthetic field
   private static final int[] lIIIIIllIlllI;
   // $FF: synthetic field
   Queue<CPacketPlayer> packets = new LinkedList();
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> listener;

   protected void onDisable() {
      while(true) {
         if (lIlIlIIlllIIIl(lllllllllllllllIlIIIIlIlIIllllll.packets.isEmpty())) {
            mc.field_71439_g.field_71174_a.func_147297_a((Packet)lllllllllllllllIlIIIIlIlIIllllll.packets.poll());
            "".length();
            if (((148 ^ 177 ^ (60 ^ 35) << (" ".length() << " ".length())) & (93 ^ 112 ^ (147 ^ 142) << (" ".length() << " ".length()) ^ -" ".length()) & (((10 ^ 105) << " ".length() ^ 136 + 142 - 152 + 67) << (" ".length() << " ".length()) & ((190 ^ 135 ^ (79 ^ 80) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length()) ^ -" ".length())) < "   ".length()) {
               continue;
            }

            return;
         }

         float lllllllllllllllIlIIIIlIlIIllllII = mc.field_71439_g;
         if (lIlIlIIlllIIII(lllllllllllllllIlIIIIlIlIIllllII)) {
            mc.field_71441_e.func_73028_b(lIIIIIllIlllI[1]);
            "".length();
            lllllllllllllllIlIIIIlIlIIllllll.clonedPlayer = null;
         }

         return;
      }
   }

   private static boolean lIlIlIIlllIIII(Object var0) {
      return var0 != null;
   }

   private static void lIlIlIIllIllll() {
      lIIIIIllIlllI = new int[2];
      lIIIIIllIlllI[0] = (164 ^ 169 ^ " ".length() << " ".length()) & (211 ^ 186 ^ (93 ^ 110) << " ".length() ^ -" ".length());
      lIIIIIllIlllI[1] = -(102 ^ 2);
   }

   public Blink() {
      lllllllllllllllIlIIIIlIlIlIIIlIl.listener = new Listener((lllllllllllllllIlIIIIlIlIIllIIll) -> {
         if (lIlIlIIlllIIlI(lllllllllllllllIlIIIIlIlIIllIllI.isEnabled()) && lIlIlIIlllIIlI(lllllllllllllllIlIIIIlIlIIllIIll.getPacket() instanceof CPacketPlayer)) {
            lllllllllllllllIlIIIIlIlIIllIIll.cancel();
            lllllllllllllllIlIIIIlIlIIllIllI.packets.add((CPacketPlayer)lllllllllllllllIlIIIIlIlIIllIIll.getPacket());
            "".length();
         }

      }, new Predicate[lIIIIIllIlllI[0]]);
   }

   private static boolean lIlIlIIlllIIlI(int var0) {
      return var0 != 0;
   }

   public String getHudInfo() {
      return String.valueOf(lllllllllllllllIlIIIIlIlIIlllIIl.packets.size());
   }

   private static boolean lIlIlIIlllIIIl(int var0) {
      return var0 == 0;
   }

   protected void onEnable() {
      if (lIlIlIIlllIIII(mc.field_71439_g)) {
         lllllllllllllllIlIIIIlIlIlIIIIlI.clonedPlayer = new EntityOtherPlayerMP(mc.field_71441_e, mc.func_110432_I().func_148256_e());
         lllllllllllllllIlIIIIlIlIlIIIIlI.clonedPlayer.func_82149_j(mc.field_71439_g);
         lllllllllllllllIlIIIIlIlIlIIIIlI.clonedPlayer.field_70759_as = mc.field_71439_g.field_70759_as;
         mc.field_71441_e.func_73027_a(lIIIIIllIlllI[1], lllllllllllllllIlIIIIlIlIlIIIIlI.clonedPlayer);
      }

   }

   static {
      lIlIlIIllIllll();
   }
}
