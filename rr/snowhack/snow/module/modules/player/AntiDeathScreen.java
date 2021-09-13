package rr.snowhack.snow.module.modules.player;

import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiScreen;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "AntiDeathScreen",
   category = Module.Category.PLAYER
)
public class AntiDeathScreen extends Module {
   private static boolean lIlIIlIllIIIll(int var0) {
      return var0 == 0;
   }

   public void onUpdate() {
      if (!lIlIIlIllIIIll(lllllllllllllllIlIIlIlIlIlIlllIl.isEnabled())) {
         if (lIlIIlIllIIlII(lIlIIlIllIIIlI(mc.field_71439_g.func_110143_aJ(), 0.0F)) && lIlIIlIllIIlIl(mc.field_71462_r instanceof GuiGameOver)) {
            mc.field_71439_g.func_71004_bE();
            mc.func_147108_a((GuiScreen)null);
         }

      }
   }

   private static boolean lIlIIlIllIIlII(int var0) {
      return var0 > 0;
   }

   private static boolean lIlIIlIllIIlIl(int var0) {
      return var0 != 0;
   }

   private static int lIlIIlIllIIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
