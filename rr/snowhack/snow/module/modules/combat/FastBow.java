package rr.snowhack.snow.module.modules.combat;

import net.minecraft.item.ItemBow;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import net.minecraft.network.play.client.CPacketPlayerDigging.Action;
import net.minecraft.util.math.BlockPos;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "FastBow",
   category = Module.Category.COMBAT
)
public class FastBow extends Module {
   // $FF: synthetic field
   private static final int[] llllllIIlIII;

   private static void lIlIIlIIllIlIl() {
      llllllIIlIII = new int[1];
      llllllIIlIII[0] = "   ".length();
   }

   static {
      lIlIIlIIllIlIl();
   }

   private static boolean lIlIIlIIllIlll(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean lIlIIlIIllIllI(int var0) {
      return var0 != 0;
   }

   public void onUpdate() {
      if (lIlIIlIIllIllI(mc.field_71439_g.field_71071_by.func_70448_g().func_77973_b() instanceof ItemBow) && lIlIIlIIllIllI(mc.field_71439_g.func_184587_cr()) && lIlIIlIIllIlll(mc.field_71439_g.func_184612_cw(), llllllIIlIII[0])) {
         mc.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerDigging(Action.RELEASE_USE_ITEM, BlockPos.field_177992_a, mc.field_71439_g.func_174811_aO()));
         mc.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerTryUseItem(mc.field_71439_g.func_184600_cs()));
         mc.field_71439_g.func_184597_cx();
      }

   }
}
