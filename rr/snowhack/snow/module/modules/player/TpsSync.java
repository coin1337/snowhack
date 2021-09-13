package rr.snowhack.snow.module.modules.player;

import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "TpsSync",
   description = "Synchronizes some actions with the server TPS",
   category = Module.Category.PLAYER
)
public class TpsSync extends Module {
   // $FF: synthetic field
   private static TpsSync INSTANCE;

   public static boolean isSync() {
      return INSTANCE.isEnabled();
   }

   public TpsSync() {
      INSTANCE = lllllllllllllllIlIlIlIlIIIIllIIl;
   }
}
