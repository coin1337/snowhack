package rr.snowhack.snow.module.modules.combat;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.init.Items;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "FastExp",
   category = Module.Category.COMBAT,
   description = "Auto Switch to XP and throw fast"
)
public class FastExp extends Module {
   // $FF: synthetic field
   private static final int[] lllllllIIlIl;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Receive> receiveListener;

   public FastExp() {
      lllllllllllllllIlIIlIlIlIlIlIlII.receiveListener = new Listener((lllllllllllllllIlIIlIlIlIlIlIIlI) -> {
         if (lIlIIlIllIIlll(mc.field_71439_g) && lIlIIlIllIlIII(mc.field_71439_g.func_184614_ca().func_77973_b(), Items.field_151062_by)) {
            mc.field_71467_ac = lllllllIIlIl[0];
         }

      }, new Predicate[lllllllIIlIl[0]]);
   }

   private static boolean lIlIIlIllIlIII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIlIIlIllIIllI() {
      lllllllIIlIl = new int[1];
      lllllllIIlIl[0] = (93 ^ 84) & ~(137 ^ 128);
   }

   static {
      lIlIIlIllIIllI();
   }

   private static boolean lIlIIlIllIIlll(Object var0) {
      return var0 != null;
   }
}
