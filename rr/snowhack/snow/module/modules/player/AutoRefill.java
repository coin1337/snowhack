package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.Block;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.Pair;

@Module.Info(
   name = "HotBarRefill",
   category = Module.Category.PLAYER,
   description = "Refills your Hotbar"
)
public class AutoRefill extends Module {
   // $FF: synthetic field
   private Setting<Integer> threshold;
   // $FF: synthetic field
   private int delayStep;
   // $FF: synthetic field
   private static final String[] lllllIlIIlll;
   // $FF: synthetic field
   private Setting<Integer> tickDelay;
   // $FF: synthetic field
   private static final int[] lllllIlIlIII;

   private static Map<Integer, ItemStack> getInventory() {
      return getInventorySlots(lllllIlIlIII[6], lllllIlIlIII[7]);
   }

   private static boolean lIlIIIlllIIlII(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIlIIIlllIIIlI(int var0, int var1) {
      return var0 >= var1;
   }

   private static void lIlIIIllIllIll() {
      lllllIlIlIII = new int[13];
      lllllIlIlIII[0] = (133 ^ 160) & ~(144 ^ 181);
      lllllIlIlIII[1] = " ".length();
      lllllIlIlIII[2] = " ".length() << (39 + 14 - -105 + 19 ^ (233 ^ 196) << (" ".length() << " ".length()));
      lllllIlIlIII[3] = " ".length() << (" ".length() << " ".length()) ^ 2 ^ 57;
      lllllIlIlIII[4] = " ".length() << " ".length();
      lllllIlIlIII[5] = ((85 ^ 102) << " ".length() ^ 68 ^ 39) << " ".length();
      lllllIlIlIII[6] = 126 ^ 119;
      lllllIlIlIII[7] = 60 ^ 31;
      lllllIlIlIII[8] = (146 ^ 155) << (" ".length() << " ".length());
      lllllIlIlIII[9] = ((63 ^ 2) << " ".length() ^ 118 ^ 7) << (" ".length() << " ".length());
      lllllIlIlIII[10] = -" ".length();
      lllllIlIlIII[11] = ((108 ^ 93) << (" ".length() << " ".length())) + 180 + 528 - 234 + 65 - -(225 + 240 - 396 + 187) + (" ".length() << "   ".length());
      lllllIlIlIII[12] = " ".length() << "   ".length();
   }

   private static Map<Integer, ItemStack> getHotbar() {
      return getInventorySlots(lllllIlIlIII[8], lllllIlIlIII[9]);
   }

   private static boolean lIlIIIlllIIIIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private boolean isCompatibleStacks(ItemStack lllllllllllllllIlIIlllIIlllIIlIl, ItemStack lllllllllllllllIlIIlllIIlllIIlII) {
      if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIIlllIIlIl.func_77973_b().equals(lllllllllllllllIlIIlllIIlllIIlII.func_77973_b()))) {
         return (boolean)lllllIlIlIII[0];
      } else {
         if (lIlIIIllIllllI(lllllllllllllllIlIIlllIIlllIIlIl.func_77973_b() instanceof ItemBlock) && lIlIIIllIllllI(lllllllllllllllIlIIlllIIlllIIlII.func_77973_b() instanceof ItemBlock)) {
            Block lllllllllllllllIlIIlllIIlllIlIlI = ((ItemBlock)lllllllllllllllIlIIlllIIlllIIlIl.func_77973_b()).func_179223_d();
            Block lllllllllllllllIlIIlllIIlllIlIIl = ((ItemBlock)lllllllllllllllIlIIlllIIlllIIlII.func_77973_b()).func_179223_d();
            if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIIlllIlIlI.field_149764_J.equals(lllllllllllllllIlIIlllIIlllIlIIl.field_149764_J))) {
               return (boolean)lllllIlIlIII[0];
            }
         }

         if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIIlllIIlIl.func_82833_r().equals(lllllllllllllllIlIIlllIIlllIIlII.func_82833_r()))) {
            return (boolean)lllllIlIlIII[0];
         } else {
            return (boolean)(lIlIIIlllIIlIl(lllllllllllllllIlIIlllIIlllIIlIl.func_77952_i(), lllllllllllllllIlIIlllIIlllIIlII.func_77952_i()) ? lllllIlIlIII[0] : lllllIlIlIII[1]);
         }
      }
   }

   private static Map<Integer, ItemStack> getInventorySlots(int lllllllllllllllIlIIlllIlIIlIIlIl, int lllllllllllllllIlIIlllIlIIlIIlll) {
      HashMap lllllllllllllllIlIIlllIlIIlIIIll = new HashMap();

      do {
         if (!lIlIIIllIlllII(lllllllllllllllIlIIlllIlIIlIIlIl, lllllllllllllllIlIIlllIlIIlIIlll)) {
            return lllllllllllllllIlIIlllIlIIlIIIll;
         }

         lllllllllllllllIlIIlllIlIIlIIIll.put(lllllllllllllllIlIIlllIlIIlIIlIl, mc.field_71439_g.field_71069_bz.func_75138_a().get(lllllllllllllllIlIIlllIlIIlIIlIl));
         "".length();
         ++lllllllllllllllIlIIlllIlIIlIIlIl;
         "".length();
      } while((((133 ^ 142) << (" ".length() << " ".length()) ^ 206 ^ 163) & (19 ^ 40 ^ (13 ^ 48) << " ".length() ^ -" ".length())) < " ".length() << (" ".length() << " ".length()));

      return null;
   }

   private static String lIlIIIllIllIIl(String lllllllllllllllIlIIlllIIllIllIlI, String lllllllllllllllIlIIlllIIllIllIIl) {
      try {
         short lllllllllllllllIlIIlllIIllIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIIllIllIIl.getBytes(StandardCharsets.UTF_8)), lllllIlIlIII[12]), "DES");
         Cipher lllllllllllllllIlIIlllIIllIlllII = Cipher.getInstance("DES");
         lllllllllllllllIlIIlllIIllIlllII.init(lllllIlIlIII[4], lllllllllllllllIlIIlllIIllIlIllI);
         return new String(lllllllllllllllIlIIlllIIllIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIIllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIllIlllII(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean lIlIIIllIlllll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIIIllIllIlI() {
      lllllIlIIlll = new String[lllllIlIlIII[4]];
      lllllIlIIlll[lllllIlIlIII[0]] = lIlIIIllIllIIl("myXntx1wXwsuQgOvkKyWhA==", "UWsWX");
      lllllIlIIlll[lllllIlIlIII[1]] = lIlIIIllIllIIl("5C1Q/5+dBbxTNfUkHE6TWw==", "ilKdI");
   }

   public AutoRefill() {
      lllllllllllllllIlIIlllIlIIlIllIl.threshold = lllllllllllllllIlIIlllIlIIlIllIl.register(Settings.integerBuilder(lllllIlIIlll[lllllIlIlIII[0]]).withMinimum(lllllIlIlIII[1]).withValue((Number)lllllIlIlIII[2]).withMaximum(lllllIlIlIII[3]).build());
      lllllllllllllllIlIIlllIlIIlIllIl.tickDelay = lllllllllllllllIlIIlllIlIIlIllIl.register(Settings.integerBuilder(lllllIlIIlll[lllllIlIlIII[1]]).withMinimum(lllllIlIlIII[1]).withValue((Number)lllllIlIlIII[4]).withMaximum(lllllIlIlIII[5]).build());
      lllllllllllllllIlIIlllIlIIlIllIl.delayStep = lllllIlIlIII[0];
   }

   private static boolean lIlIIIlllIIIll(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIlIIIlllIIlIl(int var0, int var1) {
      return var0 != var1;
   }

   public void onUpdate() {
      if (!lIlIIIllIlllIl(mc.field_71439_g)) {
         if (!lIlIIIllIllllI(mc.field_71462_r instanceof GuiContainer)) {
            if (lIlIIIllIlllll(lllllllllllllllIlIIlllIlIIIllIlI.delayStep, (Integer)lllllllllllllllIlIIlllIlIIIllIlI.tickDelay.getValue())) {
               lllllllllllllllIlIIlllIlIIIllIlI.delayStep += lllllIlIlIII[1];
            } else {
               lllllllllllllllIlIIlllIlIIIllIlI.delayStep = lllllIlIlIII[0];
               Pair<Integer, Integer> lllllllllllllllIlIIlllIlIIIllIIl = lllllllllllllllIlIIlllIlIIIllIlI.findReplenishableHotbarSlot();
               if (!lIlIIIllIlllIl(lllllllllllllllIlIIlllIlIIIllIIl)) {
                  int lllllllllllllllIlIIlllIlIIIlllII = (Integer)lllllllllllllllIlIIlllIlIIIllIIl.getKey();
                  double lllllllllllllllIlIIlllIlIIIlIlll = (Integer)lllllllllllllllIlIIlllIlIIIllIIl.getValue();
                  mc.field_71442_b.func_187098_a(lllllIlIlIII[0], lllllllllllllllIlIIlllIlIIIlllII, lllllIlIlIII[0], ClickType.PICKUP, mc.field_71439_g);
                  "".length();
                  mc.field_71442_b.func_187098_a(lllllIlIlIII[0], lllllllllllllllIlIIlllIlIIIlIlll, lllllIlIlIII[0], ClickType.PICKUP, mc.field_71439_g);
                  "".length();
                  mc.field_71442_b.func_187098_a(lllllIlIlIII[0], lllllllllllllllIlIIlllIlIIIlllII, lllllIlIlIII[0], ClickType.PICKUP, mc.field_71439_g);
                  "".length();
               }
            }
         }
      }
   }

   private static boolean lIlIIIllIllllI(int var0) {
      return var0 != 0;
   }

   private Pair<Integer, Integer> findReplenishableHotbarSlot() {
      Pair<Integer, Integer> lllllllllllllllIlIIlllIlIIIIlIlI = null;
      Iterator lllllllllllllllIlIIlllIlIIIIlIIl = getHotbar().entrySet().iterator();

      while(lIlIIIllIllllI(lllllllllllllllIlIIlllIlIIIIlIIl.hasNext())) {
         Entry<Integer, ItemStack> lllllllllllllllIlIIlllIlIIIIlllI = (Entry)lllllllllllllllIlIIlllIlIIIIlIIl.next();
         int lllllllllllllllIlIIlllIlIIIIIlll = (ItemStack)lllllllllllllllIlIIlllIlIIIIlllI.getValue();
         if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIlIIIIIlll.field_190928_g)) {
            if (lIlIIIlllIIIIl(lllllllllllllllIlIIlllIlIIIIIlll.func_77973_b(), Items.field_190931_a)) {
               "".length();
               if (-((21 ^ 18) << "   ".length() ^ 110 ^ 83) >= 0) {
                  return null;
               }
            } else if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIlIIIIIlll.func_77985_e())) {
               "".length();
               if (" ".length() > " ".length() << " ".length()) {
                  return null;
               }
            } else if (lIlIIIlllIIIlI(lllllllllllllllIlIIlllIlIIIIIlll.field_77994_a, lllllllllllllllIlIIlllIlIIIIIlll.func_77976_d())) {
               "".length();
               if (((93 ^ 68) << (" ".length() << " ".length()) ^ 53 ^ 84) == 0) {
                  return null;
               }
            } else if (lIlIIIlllIIIll(lllllllllllllllIlIIlllIlIIIIIlll.field_77994_a, (Integer)lllllllllllllllIlIIlllIlIIIIlIll.threshold.getValue())) {
               "".length();
               if (-" ".length() != -" ".length()) {
                  return null;
               }
            } else {
               int lllllllllllllllIlIIlllIlIIIIllll = lllllllllllllllIlIIlllIlIIIIlIll.findCompatibleInventorySlot(lllllllllllllllIlIIlllIlIIIIIlll);
               if (lIlIIIlllIIlII(lllllllllllllllIlIIlllIlIIIIllll, lllllIlIlIII[10])) {
                  "".length();
                  if (-" ".length() == " ".length()) {
                     return null;
                  }
               } else {
                  lllllllllllllllIlIIlllIlIIIIlIlI = new Pair(lllllllllllllllIlIIlllIlIIIIllll, lllllllllllllllIlIIlllIlIIIIlllI.getKey());
                  "".length();
                  if (((146 ^ 179) & ~(45 ^ 12)) > " ".length() << " ".length()) {
                     return null;
                  }
               }
            }
         }
      }

      return lllllllllllllllIlIIlllIlIIIIlIlI;
   }

   private int findCompatibleInventorySlot(ItemStack lllllllllllllllIlIIlllIIlllllIIl) {
      int lllllllllllllllIlIIlllIIlllllIII = lllllIlIlIII[10];
      int lllllllllllllllIlIIlllIIllllIIll = lllllIlIlIII[11];
      Iterator lllllllllllllllIlIIlllIIllllIIlI = getInventory().entrySet().iterator();

      while(lIlIIIllIllllI(lllllllllllllllIlIIlllIIllllIIlI.hasNext())) {
         Entry<Integer, ItemStack> lllllllllllllllIlIIlllIIlllllIll = (Entry)lllllllllllllllIlIIlllIIllllIIlI.next();
         ItemStack lllllllllllllllIlIIlllIIllllllIl = (ItemStack)lllllllllllllllIlIIlllIIlllllIll.getValue();
         if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIIllllllIl.field_190928_g)) {
            if (lIlIIIlllIIIIl(lllllllllllllllIlIIlllIIllllllIl.func_77973_b(), Items.field_190931_a)) {
               "".length();
               if ("   ".length() != "   ".length()) {
                  return (192 ^ 199) << " ".length() & ~((194 ^ 197) << " ".length());
               }
            } else if (lIlIIIlllIIIII(lllllllllllllllIlIIlllIIllllIllI.isCompatibleStacks(lllllllllllllllIlIIlllIIlllllIIl, lllllllllllllllIlIIlllIIllllllIl))) {
               "".length();
               if (((195 ^ 156) & ~(214 ^ 137)) < ((195 ^ 128) & ~(71 ^ 4))) {
                  return (14 ^ 93) & ~(227 ^ 176);
               }
            } else {
               String lllllllllllllllIlIIlllIIlllIllll = ((ItemStack)mc.field_71439_g.field_71069_bz.func_75138_a().get((Integer)lllllllllllllllIlIIlllIIlllllIll.getKey())).field_77994_a;
               if (lIlIIIlllIIIll(lllllllllllllllIlIIlllIIllllIIll, lllllllllllllllIlIIlllIIlllIllll)) {
                  lllllllllllllllIlIIlllIIllllIIll = lllllllllllllllIlIIlllIIlllIllll;
                  lllllllllllllllIlIIlllIIlllllIII = (Integer)lllllllllllllllIlIIlllIIlllllIll.getKey();
               }

               "".length();
               if (" ".length() << " ".length() <= -" ".length()) {
                  return ((18 ^ 23) << (" ".length() << " ".length()) ^ 180 ^ 139) & ((235 ^ 188) << " ".length() ^ 6 + 18 - -107 + 2 ^ -" ".length());
               }
            }
         }
      }

      return lllllllllllllllIlIIlllIIlllllIII;
   }

   private static boolean lIlIIIllIlllIl(Object var0) {
      return var0 == null;
   }

   static {
      lIlIIIllIllIll();
      lIlIIIllIllIlI();
   }

   private static boolean lIlIIIlllIIIII(int var0) {
      return var0 == 0;
   }
}
