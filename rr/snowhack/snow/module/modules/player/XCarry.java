package rr.snowhack.snow.module.modules.player;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.client.CPacketCloseWindow;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "XCarry",
   category = Module.Category.PLAYER
)
public class XCarry extends Module {
   // $FF: synthetic field
   private static final int[] lIIIIlIIlIIlI;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Send> listener;

   public XCarry() {
      lllllllllllllllIlIIIIIIlIllIIlIl.listener = new Listener((lllllllllllllllIlIIIIIIlIlIllllI) -> {
         if (lIlIlIlIlllIll(lllllllllllllllIlIIIIIIlIlIllllI.getPacket() instanceof CPacketCloseWindow) && lIlIlIlIllllII(((CPacketCloseWindow)lllllllllllllllIlIIIIIIlIlIllllI.getPacket()).field_149556_a, mc.field_71439_g.field_71069_bz.field_75152_c)) {
            lllllllllllllllIlIIIIIIlIlIllllI.cancel();
         }

      }, new Predicate[lIIIIlIIlIIlI[0]]);
   }

   private static void lIlIlIlIlllIlI() {
      lIIIIlIIlIIlI = new int[1];
      lIIIIlIIlIIlI[0] = ((101 ^ 98) << (" ".length() << " ".length()) ^ 226 ^ 187) & (122 ^ 43 ^ (150 ^ 147) << (" ".length() << " ".length()) ^ -" ".length());
   }

   static {
      lIlIlIlIlllIlI();
   }

   private static boolean lIlIlIlIlllIll(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIlIlIllllII(int var0, int var1) {
      return var0 == var1;
   }
}
