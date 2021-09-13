package rr.snowhack.snow.module.modules.render;

import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "NoHurtCam",
   category = Module.Category.RENDER,
   description = "Disables the 'hurt' camera effect"
)
public class NoHurtCam extends Module {
   // $FF: synthetic field
   private static NoHurtCam INSTANCE;
   // $FF: synthetic field
   private static final int[] llllIllIlIll;

   public static boolean shouldDisable() {
      int var10000;
      if (lIlIIIIlIIIIll(INSTANCE) && lIlIIIIlIIIlII(INSTANCE.isEnabled())) {
         var10000 = llllIllIlIll[0];
         "".length();
         if (-"   ".length() > 0) {
            return (boolean)((78 ^ 23) & ~(227 ^ 186));
         }
      } else {
         var10000 = llllIllIlIll[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIIIIlIIIIll(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIIIIlIIIlII(int var0) {
      return var0 != 0;
   }

   static {
      lIlIIIIlIIIIlI();
   }

   private static void lIlIIIIlIIIIlI() {
      llllIllIlIll = new int[2];
      llllIllIlIll[0] = " ".length();
      llllIllIlIll[1] = (171 ^ 166 ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() & ((" ".length() << (160 ^ 165) ^ 16 ^ 45) << " ".length() ^ -" ".length());
   }

   public NoHurtCam() {
      INSTANCE = lllllllllllllllIlIlIIlIIllIIIlII;
   }
}
