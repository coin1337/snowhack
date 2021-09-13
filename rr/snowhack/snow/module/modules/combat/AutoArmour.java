package rr.snowhack.snow.module.modules.combat;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.InventoryEffectRenderer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "AutoArmour",
   category = Module.Category.COMBAT,
   description = "Automatically equips armour"
)
public class AutoArmour extends Module {
   // $FF: synthetic field
   private static final int[] lIIIlIIlIIlII;

   private static boolean lIlIllllIllIlI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIllllIllIII(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIlIllllIlIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIllllIlIlII(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIllllIllIll(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIlIllllIlIlIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIllllIllIIl(int var0, int var1) {
      return var0 == var1;
   }

   private static void lIlIllllIlIIll() {
      lIIIlIIlIIlII = new int[8];
      lIIIlIIlIIlII[0] = " ".length() << " ".length();
      lIIIlIIlIIlII[1] = " ".length() << (" ".length() << " ".length());
      lIIIlIIlIIlII[2] = (103 ^ 74) << " ".length() & ~((232 ^ 197) << " ".length());
      lIIIlIIlIIlII[3] = -" ".length();
      lIIIlIIlIIlII[4] = (30 ^ 23) << (" ".length() << " ".length());
      lIIIlIIlIIlII[5] = " ".length();
      lIIIlIIlIIlII[6] = 180 ^ 151 ^ (93 ^ 72) << " ".length();
      lIIIlIIlIIlII[7] = " ".length() << "   ".length();
   }

   public void onUpdate() {
      if (!lIlIllllIlIlII(mc.field_71439_g.field_70173_aa % lIIIlIIlIIlII[0])) {
         if (!lIlIllllIlIlIl(mc.field_71462_r instanceof GuiContainer) || !lIlIllllIlIlII(mc.field_71462_r instanceof InventoryEffectRenderer)) {
            int lllllllllllllllIIlllIIlIlIllllll = new int[lIIIlIIlIIlII[1]];
            double lllllllllllllllIIlllIIlIlIlllllI = new int[lIIIlIIlIIlII[1]];
            int lllllllllllllllIIlllIIlIllIIIllI = lIIIlIIlIIlII[2];

            ItemStack lllllllllllllllIIlllIIlIlIllllII;
            while(lIlIllllIlIllI(lllllllllllllllIIlllIIlIllIIIllI, lIIIlIIlIIlII[1])) {
               lllllllllllllllIIlllIIlIlIllllII = mc.field_71439_g.field_71071_by.func_70440_f(lllllllllllllllIIlllIIlIllIIIllI);
               if (lIlIllllIlIlll(lllllllllllllllIIlllIIlIlIllllII) && lIlIllllIlIlIl(lllllllllllllllIIlllIIlIlIllllII.func_77973_b() instanceof ItemArmor)) {
                  lllllllllllllllIIlllIIlIlIlllllI[lllllllllllllllIIlllIIlIllIIIllI] = ((ItemArmor)lllllllllllllllIIlllIIlIlIllllII.func_77973_b()).field_77879_b;
               }

               lllllllllllllllIIlllIIlIlIllllll[lllllllllllllllIIlllIIlIllIIIllI] = lIIIlIIlIIlII[3];
               ++lllllllllllllllIIlllIIlIllIIIllI;
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
            }

            lllllllllllllllIIlllIIlIllIIIllI = lIIIlIIlIIlII[2];

            do {
               if (!lIlIllllIlIllI(lllllllllllllllIIlllIIlIllIIIllI, lIIIlIIlIIlII[4])) {
                  lllllllllllllllIIlllIIlIllIIIllI = lIIIlIIlIIlII[2];

                  while(lIlIllllIlIllI(lllllllllllllllIIlllIIlIllIIIllI, lIIIlIIlIIlII[1])) {
                     int lllllllllllllllIIlllIIlIllIIIlIl = lllllllllllllllIIlllIIlIlIllllll[lllllllllllllllIIlllIIlIllIIIllI];
                     if (lIlIllllIllIIl(lllllllllllllllIIlllIIlIllIIIlIl, lIIIlIIlIIlII[3])) {
                        "".length();
                        if (-(120 ^ 125) >= 0) {
                           return;
                        }
                     } else {
                        String lllllllllllllllIIlllIIlIlIlllIll = mc.field_71439_g.field_71071_by.func_70440_f(lllllllllllllllIIlllIIlIllIIIllI);
                        if (!lIlIllllIlIlll(lllllllllllllllIIlllIIlIlIlllIll) || !lIlIllllIllIlI(lllllllllllllllIIlllIIlIlIlllIll, ItemStack.field_190927_a) || lIlIllllIllIll(mc.field_71439_g.field_71071_by.func_70447_i(), lIIIlIIlIIlII[3])) {
                           if (lIlIllllIlIllI(lllllllllllllllIIlllIIlIllIIIlIl, lIIIlIIlIIlII[6])) {
                              lllllllllllllllIIlllIIlIllIIIlIl += 36;
                           }

                           mc.field_71442_b.func_187098_a(lIIIlIIlIIlII[2], lIIIlIIlIIlII[7] - lllllllllllllllIIlllIIlIllIIIllI, lIIIlIIlIIlII[2], ClickType.QUICK_MOVE, mc.field_71439_g);
                           "".length();
                           mc.field_71442_b.func_187098_a(lIIIlIIlIIlII[2], lllllllllllllllIIlllIIlIllIIIlIl, lIIIlIIlIIlII[2], ClickType.QUICK_MOVE, mc.field_71439_g);
                           "".length();
                           "".length();
                           if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) <= -" ".length()) {
                              return;
                           }
                           break;
                        }
                     }

                     ++lllllllllllllllIIlllIIlIllIIIllI;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  }

                  return;
               }

               lllllllllllllllIIlllIIlIlIllllII = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIIlllIIlIllIIIllI);
               if (lIlIllllIllIII(lllllllllllllllIIlllIIlIlIllllII.func_190916_E(), lIIIlIIlIIlII[5])) {
                  "".length();
                  if ("   ".length() < 0) {
                     return;
                  }
               } else if (lIlIllllIlIlll(lllllllllllllllIIlllIIlIlIllllII)) {
                  if (lIlIllllIlIlII(lllllllllllllllIIlllIIlIlIllllII.func_77973_b() instanceof ItemArmor)) {
                     "".length();
                     if (" ".length() < 0) {
                        return;
                     }
                  } else {
                     ItemArmor lllllllllllllllIIlllIIlIllIIlIIl = (ItemArmor)lllllllllllllllIIlllIIlIlIllllII.func_77973_b();
                     int lllllllllllllllIIlllIIlIllIIlIII = lllllllllllllllIIlllIIlIllIIlIIl.field_77881_a.ordinal() - lIIIlIIlIIlII[0];
                     if (lIlIllllIllIIl(lllllllllllllllIIlllIIlIllIIlIII, lIIIlIIlIIlII[0]) && lIlIllllIlIlIl(mc.field_71439_g.field_71071_by.func_70440_f(lllllllllllllllIIlllIIlIllIIlIII).func_77973_b().equals(Items.field_185160_cR))) {
                        "".length();
                        if (((32 ^ 37) & ~(138 ^ 143)) < 0) {
                           return;
                        }
                     } else {
                        short lllllllllllllllIIlllIIlIlIlllIIl = lllllllllllllllIIlllIIlIllIIlIIl.field_77879_b;
                        if (lIlIllllIllIII(lllllllllllllllIIlllIIlIlIlllIIl, lllllllllllllllIIlllIIlIlIlllllI[lllllllllllllllIIlllIIlIllIIlIII])) {
                           lllllllllllllllIIlllIIlIlIllllll[lllllllllllllllIIlllIIlIllIIlIII] = lllllllllllllllIIlllIIlIllIIIllI;
                           lllllllllllllllIIlllIIlIlIlllllI[lllllllllllllllIIlllIIlIllIIlIII] = lllllllllllllllIIlllIIlIlIlllIIl;
                        }
                     }
                  }
               }

               ++lllllllllllllllIIlllIIlIllIIIllI;
               "".length();
            } while("   ".length() >= 0);

         }
      }
   }

   private static boolean lIlIllllIlIlll(Object var0) {
      return var0 != null;
   }

   static {
      lIlIllllIlIIll();
   }
}
