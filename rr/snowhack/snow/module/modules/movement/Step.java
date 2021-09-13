package rr.snowhack.snow.module.modules.movement;

import java.util.Iterator;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.util.math.AxisAlignedBB;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "Step",
   category = Module.Category.MOVEMENT
)
public class Step extends Module {
   private static boolean lIlIlllllIllll(int var0) {
      return var0 > 0;
   }

   private static int lIlIlllllIlIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIlIllllllIIII(int var0) {
      return var0 >= 0;
   }

   private static boolean lIlIlllllIllIl(int var0) {
      return var0 == 0;
   }

   private static int lIlIlllllIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int lIlIlllllIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIlIlllllIlllI(int var0) {
      return var0 != 0;
   }

   public void onUpdate() {
      boolean lllllllllllllllIIlllIIlIIIIllIll = mc.field_71439_g;
      lllllllllllllllIIlllIIlIIIIllIll.field_70138_W = 0.5F;
      if (!lIlIlllllIllIl(lllllllllllllllIIlllIIlIIIIllIll.field_70123_F)) {
         if (lIlIlllllIlllI(lllllllllllllllIIlllIIlIIIIllIll.field_70122_E) && lIlIlllllIllIl(lllllllllllllllIIlllIIlIIIIllIll.func_70617_f_()) && lIlIlllllIllIl(lllllllllllllllIIlllIIlIIIIllIll.func_70090_H()) && !lIlIlllllIlllI(lllllllllllllllIIlllIIlIIIIllIll.func_180799_ab())) {
            if (!lIlIlllllIllIl(lIlIlllllIlIlI(lllllllllllllllIIlllIIlIIIIllIll.field_71158_b.field_192832_b, 0.0F)) || !lIlIlllllIllIl(lIlIlllllIlIlI(lllllllllllllllIIlllIIlIIIIllIll.field_71158_b.field_78902_a, 0.0F))) {
               if (!lIlIlllllIlllI(lllllllllllllllIIlllIIlIIIIllIll.field_71158_b.field_78901_c)) {
                  AxisAlignedBB lllllllllllllllIIlllIIlIIIIlllIl = lllllllllllllllIIlllIIlIIIIllIll.func_174813_aQ().func_72317_d(0.0D, 0.05D, 0.0D).func_186662_g(0.05D);
                  if (!lIlIlllllIllIl(mc.field_71441_e.func_184144_a(lllllllllllllllIIlllIIlIIIIllIll, lllllllllllllllIIlllIIlIIIIlllIl.func_72317_d(0.0D, 1.0D, 0.0D)).isEmpty())) {
                     byte lllllllllllllllIIlllIIlIIIIllIIl = -1.0D;
                     Iterator lllllllllllllllIIlllIIlIIIIllIII = mc.field_71441_e.func_184144_a(lllllllllllllllIIlllIIlIIIIllIll, lllllllllllllllIIlllIIlIIIIlllIl).iterator();

                     do {
                        if (!lIlIlllllIlllI(lllllllllllllllIIlllIIlIIIIllIII.hasNext())) {
                           lllllllllllllllIIlllIIlIIIIllIIl -= lllllllllllllllIIlllIIlIIIIllIll.field_70163_u;
                           if (lIlIllllllIIII(lIlIlllllIllII(lllllllllllllllIIlllIIlIIIIllIIl, 0.0D)) && !lIlIlllllIllll(lIlIlllllIlIll(lllllllllllllllIIlllIIlIIIIllIIl, 1.0D))) {
                              mc.field_71439_g.field_71174_a.func_147297_a(new Position(lllllllllllllllIIlllIIlIIIIllIll.field_70165_t, lllllllllllllllIIlllIIlIIIIllIll.field_70163_u + 0.42D * lllllllllllllllIIlllIIlIIIIllIIl, lllllllllllllllIIlllIIlIIIIllIll.field_70161_v, lllllllllllllllIIlllIIlIIIIllIll.field_70122_E));
                              mc.field_71439_g.field_71174_a.func_147297_a(new Position(lllllllllllllllIIlllIIlIIIIllIll.field_70165_t, lllllllllllllllIIlllIIlIIIIllIll.field_70163_u + 0.753D * lllllllllllllllIIlllIIlIIIIllIIl, lllllllllllllllIIlllIIlIIIIllIll.field_70161_v, lllllllllllllllIIlllIIlIIIIllIll.field_70122_E));
                              lllllllllllllllIIlllIIlIIIIllIll.func_70107_b(lllllllllllllllIIlllIIlIIIIllIll.field_70165_t, lllllllllllllllIIlllIIlIIIIllIll.field_70163_u + 1.0D * lllllllllllllllIIlllIIlIIIIllIIl, lllllllllllllllIIlllIIlIIIIllIll.field_70161_v);
                              return;
                           }

                           return;
                        }

                        String lllllllllllllllIIlllIIlIIIIlIlll = (AxisAlignedBB)lllllllllllllllIIlllIIlIIIIllIII.next();
                        if (lIlIlllllIllll(lIlIlllllIlIll(lllllllllllllllIIlllIIlIIIIlIlll.field_72337_e, lllllllllllllllIIlllIIlIIIIllIIl))) {
                           lllllllllllllllIIlllIIlIIIIllIIl = lllllllllllllllIIlllIIlIIIIlIlll.field_72337_e;
                        }

                        "".length();
                     } while((74 ^ 25 ^ (46 ^ 5) << " ".length()) != 0);

                  }
               }
            }
         }
      }
   }
}
