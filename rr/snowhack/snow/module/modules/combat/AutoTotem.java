package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AutoTotem",
   category = Module.Category.COMBAT
)
public class AutoTotem extends Module {
   // $FF: synthetic field
   private boolean shouldEquip;
   // $FF: synthetic field
   private Setting<Integer> health;
   // $FF: synthetic field
   private Setting<Boolean> hotbar;
   // $FF: synthetic field
   private int numOfTotems;
   // $FF: synthetic field
   private static final int[] llllIIlIIIll;
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private Setting<Boolean> pauseInInventory;
   // $FF: synthetic field
   int totems;
   // $FF: synthetic field
   private static final String[] llllIIlIIIlI;
   // $FF: synthetic field
   public Setting<AutoTotem.mode> modes;
   // $FF: synthetic field
   private Setting<Boolean> pauseInContainers;

   private static String lIIllllIlllIlI(String lllllllllllllllIlIlIlIllIlllIIII, String lllllllllllllllIlIlIlIllIlllIIIl) {
      try {
         SecretKeySpec lllllllllllllllIlIlIlIllIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIllIlllIIIl.getBytes(StandardCharsets.UTF_8)), llllIIlIIIll[13]), "DES");
         Cipher lllllllllllllllIlIlIlIllIlllIlII = Cipher.getInstance("DES");
         lllllllllllllllIlIlIlIllIlllIlII.init(llllIIlIIIll[4], lllllllllllllllIlIlIlIllIlllIlIl);
         return new String(lllllllllllllllIlIlIlIllIlllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private boolean findTotems() {
      lllllllllllllllIlIlIlIlllIlIIlII.numOfTotems = llllIIlIIIll[0];
      byte lllllllllllllllIlIlIlIlllIlIIIll = new AtomicInteger();
      lllllllllllllllIlIlIlIlllIlIIIll.set(Integer.MIN_VALUE);
      getInventoryAndHotbarSlots().forEach((lllllllllllllllIlIlIlIlllIIlIIII, lllllllllllllllIlIlIlIlllIIIlIll) -> {
         char lllllllllllllllIlIlIlIlllIIIlIlI = llllIIlIIIll[0];
         if (lIIlllllIIIIIl(lllllllllllllllIlIlIlIlllIIIlIll.func_77973_b().equals(Items.field_190929_cY))) {
            lllllllllllllllIlIlIlIlllIIIlIlI = lllllllllllllllIlIlIlIlllIIIlIll.func_190916_E();
            if (lIIlllllIIIllI(lllllllllllllllIlIlIlIlllIlIIIll.get(), lllllllllllllllIlIlIlIlllIIIlIlI)) {
               lllllllllllllllIlIlIlIlllIlIIIll.set(lllllllllllllllIlIlIlIlllIIIlIlI);
            }
         }

         lllllllllllllllIlIlIlIlllIIIllIl.numOfTotems += lllllllllllllllIlIlIlIlllIIIlIlI;
      });
      if (lIIlllllIIIIIl(mc.field_71439_g.func_184592_cb().func_77973_b().equals(Items.field_190929_cY))) {
         lllllllllllllllIlIlIlIlllIlIIlII.numOfTotems += mc.field_71439_g.func_184592_cb().func_190916_E();
      }

      int var10000;
      if (lIIlllllIIIIIl(lllllllllllllllIlIlIlIlllIlIIlII.numOfTotems)) {
         var10000 = llllIIlIIIll[1];
         "".length();
         if (-(94 ^ 90) >= 0) {
            return (boolean)((134 ^ 175) << " ".length() & ~((89 ^ 112) << " ".length()));
         }
      } else {
         var10000 = llllIIlIIIll[0];
      }

      return (boolean)var10000;
   }

   private int findItemInWholeInv() {
      int lllllllllllllllIlIlIlIlllIlIlIIl = llllIIlIIIll[9];

      do {
         if (!lIIlllllIIIlll(lllllllllllllllIlIlIlIlllIlIlIIl, llllIIlIIIll[11])) {
            return llllIIlIIIll[7];
         }

         if (!lIIlllllIIIlIl(mc.field_71439_g.field_71069_bz.func_75139_a(lllllllllllllllIlIlIlIlllIlIlIIl).func_75211_c().func_77973_b(), Items.field_190929_cY)) {
            return lllllllllllllllIlIlIlIlllIlIlIIl;
         }

         "".length();
         if (null != null) {
            return (121 ^ 78 ^ (53 ^ 38) << " ".length()) & ((151 ^ 192) << " ".length() ^ 93 + 63 - 68 + 103 ^ -" ".length());
         }

         ++lllllllllllllllIlIlIlIlllIlIlIIl;
         "".length();
      } while(-"  ".length() < 0);

      return ((111 ^ 100) << "   ".length() ^ 229 ^ 134) & (131 + 67 - 106 + 83 ^ (117 ^ 80) << (" ".length() << " ".length()) ^ -" ".length());
   }

   public String getHudInfo() {
      return String.valueOf(lllllllllllllllIlIlIlIlllIIllIII.totems);
   }

   private static Map<Integer, ItemStack> getInventorySlots(int lllllllllllllllIlIlIlIlllIIlllll, int lllllllllllllllIlIlIlIlllIIllIll) {
      HashMap lllllllllllllllIlIlIlIlllIIllIlI = new HashMap();

      do {
         if (!lIIlllllIIIlll(lllllllllllllllIlIlIlIlllIIlllll, lllllllllllllllIlIlIlIlllIIllIll)) {
            return lllllllllllllllIlIlIlIlllIIllIlI;
         }

         lllllllllllllllIlIlIlIlllIIllIlI.put(lllllllllllllllIlIlIlIlllIIlllll, mc.field_71439_g.field_71069_bz.func_75138_a().get(lllllllllllllllIlIlIlIlllIIlllll));
         "".length();
         ++lllllllllllllllIlIlIlIlllIIlllll;
         "".length();
      } while(-((29 ^ 16) << " ".length() ^ 181 ^ 170) < 0);

      return null;
   }

   private static Map<Integer, ItemStack> getInventoryAndHotbarSlots() {
      return getInventorySlots(llllIIlIIIll[9], llllIIlIIIll[11]);
   }

   private static boolean lIIlllllIIIIII(int var0) {
      return var0 == 0;
   }

   private static String lIIllllIlllIIl(String lllllllllllllllIlIlIlIllIlllllll, String lllllllllllllllIlIlIlIllIlllllII) {
      try {
         int lllllllllllllllIlIlIlIllIllllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIllIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIlIlllIIIIIIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIlIlllIIIIIIl.init(llllIIlIIIll[4], lllllllllllllllIlIlIlIllIllllIll);
         return new String(lllllllllllllllIlIlIlIlllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIllllIllllIl() {
      llllIIlIIIll = new int[14];
      llllIIlIIIll[0] = (13 ^ 4) & ~(206 ^ 199);
      llllIIlIIIll[1] = " ".length();
      llllIIlIIIll[2] = (" ".length() << (17 ^ 22) ^ 125 + 115 - 207 + 104) << (" ".length() << " ".length());
      llllIIlIIIll[3] = ("   ".length() << ("   ".length() << " ".length()) ^ 21 + 8 - -130 + 38) << " ".length();
      llllIIlIIIll[4] = " ".length() << " ".length();
      llllIIlIIIll[5] = "   ".length();
      llllIIlIIIll[6] = " ".length() << (" ".length() << " ".length());
      llllIIlIIIll[7] = -" ".length();
      llllIIlIIIll[8] = 237 ^ 192;
      llllIIlIIIll[9] = 130 ^ 139;
      llllIIlIIIll[10] = 17 ^ 50;
      llllIIlIIIll[11] = (106 ^ 97) << (" ".length() << " ".length());
      llllIIlIIIll[12] = 60 ^ 57;
      llllIIlIIIll[13] = " ".length() << "   ".length();
   }

   public AutoTotem() {
      lllllllllllllllIlIlIlIllllIIIIII.modes = lllllllllllllllIlIlIlIllllIIIIII.register(Settings.e(llllIIlIIIlI[llllIIlIIIll[0]], AutoTotem.mode.Force));
      lllllllllllllllIlIlIlIllllIIIIII.health = lllllllllllllllIlIlIlIllllIIIIII.register(Settings.integerBuilder(llllIIlIIIlI[llllIIlIIIll[1]]).withRange(llllIIlIIIll[0], llllIIlIIIll[2]).withValue((Number)llllIIlIIIll[3]));
      lllllllllllllllIlIlIlIllllIIIIII.pauseInContainers = lllllllllllllllIlIlIlIllllIIIIII.register(Settings.b(llllIIlIIIlI[llllIIlIIIll[4]], (boolean)llllIIlIIIll[1]));
      lllllllllllllllIlIlIlIllllIIIIII.pauseInInventory = lllllllllllllllIlIlIlIllllIIIIII.register(Settings.b(llllIIlIIIlI[llllIIlIIIll[5]], (boolean)llllIIlIIIll[1]));
      lllllllllllllllIlIlIlIllllIIIIII.hotbar = lllllllllllllllIlIlIlIllllIIIIII.register(Settings.b(llllIIlIIIlI[llllIIlIIIll[6]], (boolean)llllIIlIIIll[0]));
   }

   private static boolean lIIlllllIIIIll(Object var0, Object var1) {
      return var0 == var1;
   }

   static {
      lIIllllIllllIl();
      lIIllllIllllII();
      mc = Minecraft.func_71410_x();
   }

   public void onUpdate() {
      if (!lIIllllIllllll(mc.field_71439_g)) {
         if (!lIIlllllIIIIII(lllllllllllllllIlIlIlIlllIllIlll.findTotems())) {
            if (!lIIlllllIIIIIl((Boolean)lllllllllllllllIlIlIlIlllIllIlll.pauseInContainers.getValue()) || !lIIlllllIIIIIl(mc.field_71462_r instanceof GuiContainer) || !lIIlllllIIIIII(mc.field_71462_r instanceof GuiInventory)) {
               if (!lIIlllllIIIIIl((Boolean)lllllllllllllllIlIlIlIlllIllIlll.pauseInInventory.getValue()) || !lIIlllllIIIIIl(mc.field_71462_r instanceof GuiInventory)) {
                  if (lIIlllllIIIIIl(lllllllllllllllIlIlIlIlllIllIlll.isEnabled())) {
                     if (lIIlllllIIIIlI(lIIllllIlllllI(mc.field_71439_g.func_110143_aJ(), (float)(Integer)lllllllllllllllIlIlIlIlllIllIlll.health.getValue())) && lIIlllllIIIIll(lllllllllllllllIlIlIlIlllIllIlll.modes.getValue(), AutoTotem.mode.Soft)) {
                        lllllllllllllllIlIlIlIlllIllIlll.shouldEquip = (boolean)llllIIlIIIll[1];
                     }

                     int lllllllllllllllIlIlIlIlllIlllIll;
                     int lllllllllllllllIlIlIlIlllIlllIII;
                     if (lIIlllllIIIIll(lllllllllllllllIlIlIlIlllIllIlll.modes.getValue(), AutoTotem.mode.Soft)) {
                        if (lIIlllllIIIIIl(lllllllllllllllIlIlIlIlllIllIlll.shouldEquip) && lIIlllllIIIIIl(mc.field_71439_g.func_184592_cb().func_77973_b().equals(Items.field_190931_a))) {
                           if (lIIlllllIIIIII(lllllllllllllllIlIlIlIlllIllIlll.totems)) {
                              return;
                           }

                           lllllllllllllllIlIlIlIlllIlllIll = lllllllllllllllIlIlIlIlllIllIlll.findItemInWholeInv();
                           lllllllllllllllIlIlIlIlllIlllIII = lllllllllllllllIlIlIlIlllIllIlll.getItemSlot();
                           if (lIIlllllIIIlII(lllllllllllllllIlIlIlIlllIlllIll, llllIIlIIIll[7])) {
                              mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                              "".length();
                              mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, llllIIlIIIll[8], llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                              "".length();
                              mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                              "".length();
                              mc.field_71442_b.func_78765_e();
                           }

                           "".length();
                           if (null != null) {
                              return;
                           }
                        }
                     } else if (lIIlllllIIIIIl(lllllllllllllllIlIlIlIlllIllIlll.shouldEquip) && lIIlllllIIIIII(mc.field_71439_g.func_184592_cb().func_77973_b().equals(Items.field_190929_cY))) {
                        if (lIIlllllIIIIII(lllllllllllllllIlIlIlIlllIllIlll.totems)) {
                           return;
                        }

                        lllllllllllllllIlIlIlIlllIlllIll = lllllllllllllllIlIlIlIlllIllIlll.findItemInWholeInv();
                        lllllllllllllllIlIlIlIlllIlllIII = lllllllllllllllIlIlIlIlllIllIlll.getItemSlot();
                        if (lIIlllllIIIlII(lllllllllllllllIlIlIlIlllIlllIll, llllIIlIIIll[7])) {
                           mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                           "".length();
                           mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, llllIIlIIIll[8], llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                           "".length();
                           mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                           "".length();
                           mc.field_71442_b.func_78765_e();
                        }
                     }

                     if (lIIlllllIIIlIl(lllllllllllllllIlIlIlIlllIllIlll.modes.getValue(), AutoTotem.mode.Soft)) {
                        lllllllllllllllIlIlIlIlllIllIlll.shouldEquip = (boolean)llllIIlIIIll[1];
                     }

                     if (lIIlllllIIIIll(lllllllllllllllIlIlIlIlllIllIlll.modes.getValue(), AutoTotem.mode.Soft)) {
                        lllllllllllllllIlIlIlIlllIllIlll.shouldEquip = (boolean)llllIIlIIIll[0];
                     }

                     lllllllllllllllIlIlIlIlllIllIlll.totems = mc.field_71439_g.field_71071_by.field_70462_a.stream().filter((lllllllllllllllIlIlIlIlllIIIIlll) -> {
                        int var10000;
                        if (lIIlllllIIIIll(lllllllllllllllIlIlIlIlllIIIIlll.func_77973_b(), Items.field_190929_cY)) {
                           var10000 = llllIIlIIIll[1];
                           "".length();
                           if (-"  ".length() > 0) {
                              return (boolean)(((126 ^ 47) << " ".length() ^ 13 + 130 - 103 + 105) & (191 ^ 152 ^ (142 ^ 139) << (" ".length() << " ".length()) ^ -" ".length()));
                           }
                        } else {
                           var10000 = llllIIlIIIll[0];
                        }

                        return (boolean)var10000;
                     }).mapToInt(ItemStack::func_190916_E).sum();
                     if (lIIlllllIIIIll(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_190929_cY)) {
                        lllllllllllllllIlIlIlIlllIllIlll.totems += llllIIlIIIll[1];
                     }

                     if (lIIlllllIIIIIl((Boolean)lllllllllllllllIlIlIlIlllIllIlll.hotbar.getValue())) {
                        if (lIIlllllIIIIIl(mc.field_71462_r instanceof GuiContainer)) {
                           return;
                        }

                        if (lIIlllllIIIIll(mc.field_71439_g.field_71071_by.func_70301_a(llllIIlIIIll[0]).func_77973_b(), Items.field_190929_cY)) {
                           return;
                        }

                        lllllllllllllllIlIlIlIlllIlllIII = llllIIlIIIll[9];

                        while(lIIlllllIIIllI(lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[10])) {
                           if (lIIlllllIIIIll(mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIlIlIlllIlllIII).func_77973_b(), Items.field_190929_cY)) {
                              mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[0], ClickType.PICKUP, mc.field_71439_g);
                              "".length();
                              mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71069_bz.field_75152_c, lllllllllllllllIlIlIlIlllIlllIII, llllIIlIIIll[0], ClickType.SWAP, mc.field_71439_g);
                              "".length();
                              "".length();
                              if (-" ".length() > 0) {
                                 return;
                              }
                              break;
                           }

                           ++lllllllllllllllIlIlIlIlllIlllIII;
                           "".length();
                           if (-(66 ^ 71) >= 0) {
                              return;
                           }
                        }
                     }
                  }

               }
            }
         }
      }
   }

   private static boolean lIIlllllIIIIIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIIlllllIIIlll(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean lIIlllllIIIlIl(Object var0, Object var1) {
      return var0 != var1;
   }

   private static String lIIllllIlllIll(String lllllllllllllllIlIlIlIllIlIlllIl, String lllllllllllllllIlIlIlIllIllIIIIl) {
      lllllllllllllllIlIlIlIllIlIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIlIllIllIIIII = new StringBuilder();
      char[] lllllllllllllllIlIlIlIllIlIlllll = lllllllllllllllIlIlIlIllIllIIIIl.toCharArray();
      short lllllllllllllllIlIlIlIllIlIllIIl = llllIIlIIIll[0];
      int lllllllllllllllIlIlIlIllIlIllIII = lllllllllllllllIlIlIlIllIlIlllIl.toCharArray();
      byte lllllllllllllllIlIlIlIllIlIlIlll = lllllllllllllllIlIlIlIllIlIllIII.length;
      int lllllllllllllllIlIlIlIllIlIlIllI = llllIIlIIIll[0];

      do {
         if (!lIIlllllIIIllI(lllllllllllllllIlIlIlIllIlIlIllI, lllllllllllllllIlIlIlIllIlIlIlll)) {
            return String.valueOf(lllllllllllllllIlIlIlIllIllIIIII);
         }

         char lllllllllllllllIlIlIlIllIllIIIll = lllllllllllllllIlIlIlIllIlIllIII[lllllllllllllllIlIlIlIllIlIlIllI];
         lllllllllllllllIlIlIlIllIllIIIII.append((char)(lllllllllllllllIlIlIlIllIllIIIll ^ lllllllllllllllIlIlIlIllIlIlllll[lllllllllllllllIlIlIlIllIlIllIIl % lllllllllllllllIlIlIlIllIlIlllll.length]));
         "".length();
         ++lllllllllllllllIlIlIlIllIlIllIIl;
         ++lllllllllllllllIlIlIlIllIlIlIllI;
         "".length();
      } while(" ".length() <= " ".length() << " ".length());

      return null;
   }

   private static boolean lIIlllllIIIllI(int var0, int var1) {
      return var0 < var1;
   }

   private int getItemSlot() {
      int lllllllllllllllIlIlIlIlllIllIIII = llllIIlIIIll[0];

      do {
         if (!lIIlllllIIIllI(lllllllllllllllIlIlIlIlllIllIIII, llllIIlIIIll[2])) {
            return llllIIlIIIll[7];
         }

         Item lllllllllllllllIlIlIlIlllIllIIIl = Minecraft.func_71410_x().field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIlIlIlllIllIIII).func_77973_b();
         if (lIIlllllIIIIll(lllllllllllllllIlIlIlIlllIllIIIl, Items.field_190929_cY)) {
            if (lIIlllllIIIllI(lllllllllllllllIlIlIlIlllIllIIII, llllIIlIIIll[9])) {
               lllllllllllllllIlIlIlIlllIllIIII += 36;
            }

            return lllllllllllllllIlIlIlIlllIllIIII;
         }

         ++lllllllllllllllIlIlIlIlllIllIIII;
         "".length();
      } while(null == null);

      return (21 ^ 44) & ~(177 ^ 136);
   }

   private static boolean lIIlllllIIIIlI(int var0) {
      return var0 <= 0;
   }

   private static boolean lIIllllIllllll(Object var0) {
      return var0 == null;
   }

   private static int lIIllllIlllllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIIlllllIIIlII(int var0, int var1) {
      return var0 != var1;
   }

   private static void lIIllllIllllII() {
      llllIIlIIIlI = new String[llllIIlIIIll[12]];
      llllIIlIIIlI[llllIIlIIIll[0]] = lIIllllIlllIIl("XX+JpdT16yI=", "tQaMU");
      llllIIlIIIlI[llllIIlIIIll[1]] = lIIllllIlllIlI("jJZntay+gag=", "paLoN");
      llllIIlIIIlI[llllIIlIIIll[4]] = lIIllllIlllIll("BBEkICwdHhI8JyAROD0sJgM=", "TpQSI");
      llllIIlIIIlI[llllIIlIIIll[5]] = lIIllllIlllIIl("o/JhAIGkeKV/rl6oH57+PwJKQTrvk1Wh", "FnsRu");
      llllIIlIIIlI[llllIIlIIIll[6]] = lIIllllIlllIIl("htJBXFPobRo=", "MEBxv");
   }

   private static enum mode {
      // $FF: synthetic field
      private static final int[] lIIIIllIllllI;
      // $FF: synthetic field
      Force,
      // $FF: synthetic field
      Soft;

      // $FF: synthetic field
      private static final String[] lIIIIllIlllIl;

      private static boolean lIlIllIIllllII(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIlIllIIlllIll();
         lIlIllIIlllIlI();
         Soft = new AutoTotem.mode(lIIIIllIlllIl[lIIIIllIllllI[0]], lIIIIllIllllI[0]);
         Force = new AutoTotem.mode(lIIIIllIlllIl[lIIIIllIllllI[1]], lIIIIllIllllI[1]);
         AutoTotem.mode[] var10000 = new AutoTotem.mode[lIIIIllIllllI[2]];
         var10000[lIIIIllIllllI[0]] = Soft;
         var10000[lIIIIllIllllI[1]] = Force;
      }

      private static void lIlIllIIlllIlI() {
         lIIIIllIlllIl = new String[lIIIIllIllllI[2]];
         lIIIIllIlllIl[lIIIIllIllllI[0]] = lIlIllIIlllIII("ct72WXPSucQ=", "rOTru");
         lIIIIllIlllIl[lIIIIllIllllI[1]] = lIlIllIIlllIIl("NR0jAio=", "srQaO");
      }

      private static void lIlIllIIlllIll() {
         lIIIIllIllllI = new int[3];
         lIIIIllIllllI[0] = (115 ^ 24 ^ (86 ^ 111) << " ".length()) & ((97 ^ 56) << " ".length() ^ 127 + 134 - 207 + 117 ^ -" ".length());
         lIIIIllIllllI[1] = " ".length();
         lIIIIllIllllI[2] = " ".length() << " ".length();
      }

      private static String lIlIllIIlllIII(String lllllllllllllllIIllllIllIIlIIIII, String lllllllllllllllIIllllIllIIIlllll) {
         try {
            SecretKeySpec lllllllllllllllIIllllIllIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIllIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllllIllIIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllllIllIIlIIIlI.init(lIIIIllIllllI[2], lllllllllllllllIIllllIllIIlIIIll);
            return new String(lllllllllllllllIIllllIllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static String lIlIllIIlllIIl(String lllllllllllllllIIllllIllIIIlIIII, String lllllllllllllllIIllllIllIIIIlIlI) {
         lllllllllllllllIIllllIllIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIllIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIIllllIllIIIIlllI = new StringBuilder();
         char[] lllllllllllllllIIllllIllIIIIllIl = lllllllllllllllIIllllIllIIIIlIlI.toCharArray();
         int lllllllllllllllIIllllIllIIIIIlll = lIIIIllIllllI[0];
         Exception lllllllllllllllIIllllIllIIIIIllI = lllllllllllllllIIllllIllIIIlIIII.toCharArray();
         byte lllllllllllllllIIllllIllIIIIIlIl = lllllllllllllllIIllllIllIIIIIllI.length;
         int lllllllllllllllIIllllIllIIIIIlII = lIIIIllIllllI[0];

         do {
            if (!lIlIllIIllllII(lllllllllllllllIIllllIllIIIIIlII, lllllllllllllllIIllllIllIIIIIlIl)) {
               return String.valueOf(lllllllllllllllIIllllIllIIIIlllI);
            }

            byte lllllllllllllllIIllllIllIIIIIIll = lllllllllllllllIIllllIllIIIIIllI[lllllllllllllllIIllllIllIIIIIlII];
            lllllllllllllllIIllllIllIIIIlllI.append((char)(lllllllllllllllIIllllIllIIIIIIll ^ lllllllllllllllIIllllIllIIIIllIl[lllllllllllllllIIllllIllIIIIIlll % lllllllllllllllIIllllIllIIIIllIl.length]));
            "".length();
            ++lllllllllllllllIIllllIllIIIIIlll;
            ++lllllllllllllllIIllllIllIIIIIlII;
            "".length();
         } while(" ".length() << " ".length() != (((79 ^ 72) << " ".length() ^ 173 ^ 176) << " ".length() & (((53 ^ 114) << " ".length() ^ 149 + 71 - 204 + 141) << " ".length() ^ -" ".length())));

         return null;
      }
   }
}
