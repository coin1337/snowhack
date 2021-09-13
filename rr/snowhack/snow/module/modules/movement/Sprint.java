package rr.snowhack.snow.module.modules.movement;

import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "Sprint",
   description = "Automatically makes the player sprint",
   category = Module.Category.MOVEMENT
)
public class Sprint extends Module {
   // $FF: synthetic field
   private static final int[] llllllIIIllI;

   private static boolean lIlIIlIIllIlII(int var0) {
      return var0 > 0;
   }

   public void onUpdate() {
      try {
         if (lIlIIlIIllIIll(mc.field_71439_g.field_70123_F) && lIlIIlIIllIlII(lIlIIlIIllIIlI(mc.field_71439_g.field_191988_bg, 0.0F))) {
            mc.field_71439_g.func_70031_b((boolean)llllllIIIllI[0]);
            "".length();
            if (" ".length() << " ".length() < 0) {
               return;
            }
         } else {
            mc.field_71439_g.func_70031_b((boolean)llllllIIIllI[1]);
         }
      } catch (Exception var2) {
         return;
      }

      "".length();
      if (("   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length())) == 0) {
         ;
      }
   }

   static {
      lIlIIlIIllIIIl();
   }

   private static int lIlIIlIIllIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIIlIIllIIll(int var0) {
      return var0 == 0;
   }

   private static void lIlIIlIIllIIIl() {
      llllllIIIllI = new int[2];
      llllllIIIllI[0] = " ".length();
      llllllIIIllI[1] = " ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())));
   }
}
