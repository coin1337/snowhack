package rr.snowhack.snow.gui.snow.theme.staticui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.component.Inventory;
import rr.snowhack.snow.util.RenderUtil;

public class InventoryUI extends AbstractComponentUI<Inventory> {
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private static final int[] lllllIIlllll;

   private static boolean lIlIIIllIIIlll(int var0, int var1) {
      return var0 < var1;
   }

   public void renderComponent(Inventory lllllllllllllllIlIIllllIlIIIIIll, FontRenderer lllllllllllllllIlIIllllIlIIIIIlI) {
      int lllllllllllllllIlIIllllIlIIIIIIl = lllllllllllllllIlIIllllIlIIIIIll.getX();
      float lllllllllllllllIlIIllllIIlllllIl = lllllllllllllllIlIIllllIlIIIIIll.getY();
      if (lIlIIIllIIIllI(mc.field_71439_g)) {
         GlStateManager.func_179094_E();
         RenderHelper.func_74520_c();
         RenderUtil.drawOutlineRect((float)lllllllllllllllIlIIllllIlIIIIIIl, (float)lllllllllllllllIlIIllllIIlllllIl, (float)(lllllllllllllllIlIIllllIlIIIIIIl + lllllIIlllll[0]), (float)(lllllllllllllllIlIIllllIIlllllIl + lllllIIlllll[1]), 1.5F, lllllIIlllll[2]);
         int lllllllllllllllIlIIllllIIlllllII = lllllIIlllll[3];

         while(lIlIIIllIIIlll(lllllllllllllllIlIIllllIIlllllII, lllllIIlllll[4])) {
            int lllllllllllllllIlIIllllIIllllIll = (ItemStack)mc.field_71439_g.field_71071_by.field_70462_a.get(lllllllllllllllIlIIllllIIlllllII + lllllIIlllll[5]);
            int lllllllllllllllIlIIllllIlIIIIlll = lllllllllllllllIlIIllllIlIIIIIIl + lllllllllllllllIlIIllllIIlllllII % lllllIIlllll[5] * lllllIIlllll[6];
            long lllllllllllllllIlIIllllIIllllIIl = lllllllllllllllIlIIllllIIlllllIl + lllllllllllllllIlIIllllIIlllllII / lllllIIlllll[5] * lllllIIlllll[6];
            mc.func_175599_af().func_180450_b(lllllllllllllllIlIIllllIIllllIll, lllllllllllllllIlIIllllIlIIIIlll, lllllllllllllllIlIIllllIIllllIIl);
            mc.func_175599_af().func_180453_a(mc.field_71466_p, lllllllllllllllIlIIllllIIllllIll, lllllllllllllllIlIIllllIlIIIIlll, lllllllllllllllIlIIllllIIllllIIl, (String)null);
            ++lllllllllllllllIlIIllllIIlllllII;
            "".length();
            if ("   ".length() == ((223 ^ 154) & ~(224 ^ 165))) {
               return;
            }
         }

         RenderHelper.func_74518_a();
         mc.func_175599_af().field_77023_b = 0.0F;
         GlStateManager.func_179121_F();
      }

   }

   private static boolean lIlIIIllIIIllI(Object var0) {
      return var0 != null;
   }

   public void handleSizeComponent(Inventory lllllllllllllllIlIIllllIlIIlIIll) {
      lllllllllllllllIlIIllllIlIIlIIll.setWidth(lllllllllllllllIlIIllllIlIIlIIll.getX() + lllllIIlllll[0]);
      lllllllllllllllIlIIllllIlIIlIIll.setHeight(lllllllllllllllIlIIllllIlIIlIIll.getY() + lllllIIlllll[1]);
   }

   static {
      lIlIIIllIIIlIl();
      mc = Minecraft.func_71410_x();
   }

   private static void lIlIIIllIIIlIl() {
      lllllIIlllll = new int[7];
      lllllIIlllll[0] = (217 ^ 140 ^ (115 ^ 100) << (" ".length() << " ".length())) << (" ".length() << (" ".length() << " ".length()));
      lllllIIlllll[1] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
      lllllIIlllll[2] = 104983044 + 108792528 - 186359615 + 95464814 << (" ".length() << (" ".length() << " ".length()));
      lllllIIlllll[3] = (227 ^ 134 ^ (206 ^ 195) << (" ".length() << " ".length())) & ((154 ^ 167) << " ".length() ^ 95 ^ 116 ^ -" ".length());
      lllllIIlllll[4] = 90 ^ 65;
      lllllIIlllll[5] = 49 ^ 56;
      lllllIIlllll[6] = " ".length() << (" ".length() << (" ".length() << " ".length()));
   }
}
