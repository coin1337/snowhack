package rr.snowhack.snow.module.modules.movement;

import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.util.MovementInput;
import net.minecraftforge.client.event.InputUpdateEvent;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "NoSlow",
   category = Module.Category.MOVEMENT
)
public class NoSlow extends Module {
   // $FF: synthetic field
   private static final int[] lllIIllllIIl;
   // $FF: synthetic field
   @EventHandler
   private Listener<InputUpdateEvent> eventListener;

   static {
      lIIlIlllllIllI();
   }

   private static void lIIlIlllllIllI() {
      lllIIllllIIl = new int[1];
      lllIIllllIIl[0] = (84 ^ 27 ^ (41 ^ 50) << (" ".length() << " ".length())) & ((46 ^ 127) << " ".length() ^ 10 + 85 - -18 + 16 ^ -" ".length());
   }

   private static boolean lIIlIllllllIII(int var0) {
      return var0 == 0;
   }

   public NoSlow() {
      lllllllllllllllIllIIIIlllIlIIlIl.eventListener = new Listener((lllllllllllllllIllIIIIlllIlIIIIl) -> {
         if (lIIlIlllllIlll(mc.field_71439_g.func_184587_cr()) && lIIlIllllllIII(mc.field_71439_g.func_184218_aH())) {
            MovementInput var10000 = lllllllllllllllIllIIIIlllIlIIIIl.getMovementInput();
            var10000.field_78902_a *= 5.0F;
            var10000 = lllllllllllllllIllIIIIlllIlIIIIl.getMovementInput();
            var10000.field_192832_b *= 5.0F;
         }

      }, new Predicate[lllIIllllIIl[0]]);
   }

   private static boolean lIIlIlllllIlll(int var0) {
      return var0 != 0;
   }
}
