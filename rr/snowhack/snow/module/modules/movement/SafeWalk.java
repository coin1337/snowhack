package rr.snowhack.snow.module.modules.movement;

import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "SafeWalk",
   category = Module.Category.MOVEMENT,
   description = "Keeps you from walking off edges"
)
public class SafeWalk extends Module {
   // $FF: synthetic field
   private static SafeWalk INSTANCE;

   public SafeWalk() {
      INSTANCE = lllllllllllllllIIlllIIlIlIIllIIl;
   }

   public static boolean shouldSafewalk() {
      return INSTANCE.isEnabled();
   }
}
