package rr.snowhack.snow.module.modules.player;

import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "Fastbreak",
   category = Module.Category.PLAYER,
   description = "Nullifies block hit delay"
)
public class Fastbreak extends Module {
   // $FF: synthetic field
   private static final int[] lllllIIIIlII;

   public void onUpdate() {
      mc.field_71442_b.field_78781_i = lllllIIIIlII[0];
   }

   static {
      lIlIIIIlllllIl();
   }

   private static void lIlIIIIlllllIl() {
      lllllIIIIlII = new int[1];
      lllllIIIIlII[0] = (102 ^ 119) << (" ".length() << " ".length()) & ~((57 ^ 40) << (" ".length() << " ".length()));
   }
}
