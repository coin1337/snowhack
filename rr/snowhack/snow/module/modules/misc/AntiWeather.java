package rr.snowhack.snow.module.modules.misc;

import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "AntiWeather",
   description = "Removes rain from your world",
   category = Module.Category.MISC
)
public class AntiWeather extends Module {
   public void onUpdate() {
      if (!lIIlllIllIIIIl(lllllllllllllllIlIllIIIllIllIlll.isDisabled())) {
         if (lIIlllIllIIIIl(mc.field_71441_e.func_72896_J())) {
            mc.field_71441_e.func_72894_k(0.0F);
         }

      }
   }

   private static boolean lIIlllIllIIIIl(int var0) {
      return var0 != 0;
   }
}
