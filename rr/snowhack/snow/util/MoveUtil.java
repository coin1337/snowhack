package rr.snowhack.snow.util;

import net.minecraft.client.Minecraft;

public class MoveUtil {
   // $FF: synthetic field
   private static Minecraft mc;

   private static boolean lIlIIlIllllIIl(int var0) {
      return var0 < 0;
   }

   private static int lIlIIlIlllIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIIlIllllIlI(int var0) {
      return var0 > 0;
   }

   public static float getPlayerDirection() {
      String lllllllllllllllIlIIlIlIIIlIIlIll = Minecraft.func_71410_x();
      float lllllllllllllllIlIIlIlIIIlIIllIl = lllllllllllllllIlIIlIlIIIlIIlIll.field_71439_g.field_70177_z;
      if (lIlIIlIllllIIl(lIlIIlIlllIlll(lllllllllllllllIlIIlIlIIIlIIlIll.field_71439_g.field_191988_bg, 0.0F))) {
         lllllllllllllllIlIIlIlIIIlIIllIl += 180.0F;
      }

      float lllllllllllllllIlIIlIlIIIlIIllII = 1.0F;
      if (lIlIIlIllllIIl(lIlIIlIlllIlll(lllllllllllllllIlIIlIlIIIlIIlIll.field_71439_g.field_191988_bg, 0.0F))) {
         lllllllllllllllIlIIlIlIIIlIIllII = -0.5F;
         "".length();
         if ("   ".length() <= ((26 + 45 - -17 + 53 ^ (7 ^ 40) << (" ".length() << " ".length())) << " ".length() & (((64 ^ 31) << " ".length() ^ 85 + 107 - 99 + 50) << " ".length() ^ -" ".length()))) {
            return 0.0F;
         }
      } else if (lIlIIlIllllIlI(lIlIIlIllllIII(lllllllllllllllIlIIlIlIIIlIIlIll.field_71439_g.field_191988_bg, 0.0F))) {
         lllllllllllllllIlIIlIlIIIlIIllII = 0.5F;
      }

      if (lIlIIlIllllIlI(lIlIIlIllllIII(lllllllllllllllIlIIlIlIIIlIIlIll.field_71439_g.field_70702_br, 0.0F))) {
         lllllllllllllllIlIIlIlIIIlIIllIl -= 90.0F * lllllllllllllllIlIIlIlIIIlIIllII;
      }

      if (lIlIIlIllllIIl(lIlIIlIlllIlll(lllllllllllllllIlIIlIlIIIlIIlIll.field_71439_g.field_70702_br, 0.0F))) {
         lllllllllllllllIlIIlIlIIIlIIllIl += 90.0F * lllllllllllllllIlIIlIlIIIlIIllII;
      }

      return lllllllllllllllIlIIlIlIIIlIIllIl *= 0.017453292F;
   }

   private static int lIlIIlIllllIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
