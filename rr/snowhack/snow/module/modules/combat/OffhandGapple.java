package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemEnderEye;
import net.minecraft.item.ItemEnderPearl;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.CPacketPlayerTryUseItem;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "OffhandGap",
   category = Module.Category.COMBAT,
   description = "Holds a God apple when right clicking your sword!"
)
public class OffhandGapple extends Module {
   // $FF: synthetic field
   private Setting<Double> disableHealth;
   // $FF: synthetic field
   private Setting<Boolean> weaponCheck;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Send> sendListener;
   // $FF: synthetic field
   Item toUseItem;
   // $FF: synthetic field
   private static final int[] lIIIIIIllllIl;
   // $FF: synthetic field
   private static final String[] lIIIIIIllllII;
   // $FF: synthetic field
   int gaps;
   // $FF: synthetic field
   boolean autoTotemWasEnabled;
   // $FF: synthetic field
   Item usedItem;
   // $FF: synthetic field
   boolean notCancelled;
   // $FF: synthetic field
   private Setting<Boolean> eatWhileAttacking;

   private static int lIlIlIIIIllIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static String lIlIlIIIIIllII(String lllllllllllllllIlIIIllIIlIllIIll, String lllllllllllllllIlIIIllIIlIllIIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIIllIIlIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double lllllllllllllllIlIIIllIIlIlIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIllIIlIlIlllI.init(lIIIIIIllllIl[2], lllllllllllllllIlIIIllIIlIllIllI);
         return new String(lllllllllllllllIlIIIllIIlIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlIIIIlIIll(int var0, int var1) {
      return var0 < var1;
   }

   private void enableGaps(int lllllllllllllllIlIIIllIIllIlIlII) {
      if (lIlIlIIIIlIIlI(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151153_ao)) {
         PlayerControllerMP var10000 = mc.field_71442_b;
         int var10001 = lIIIIIIllllIl[0];
         int var10002;
         if (lIlIlIIIIlIIll(lllllllllllllllIlIIIllIIllIlIlII, lIIIIIIllllIl[7])) {
            var10002 = lllllllllllllllIlIIIllIIllIlIlII + lIIIIIIllllIl[8];
            "".length();
            if (((6 ^ 33 ^ (145 ^ 150) << " ".length()) & ((105 ^ 44) << " ".length() ^ 116 + 33 - 107 + 121 ^ -" ".length())) > 0) {
               return;
            }
         } else {
            var10002 = lllllllllllllllIlIIIllIIllIlIlII;
         }

         var10000.func_187098_a(var10001, var10002, lIIIIIIllllIl[0], ClickType.PICKUP, mc.field_71439_g);
         "".length();
         mc.field_71442_b.func_187098_a(lIIIIIIllllIl[0], lIIIIIIllllIl[4], lIIIIIIllllIl[0], ClickType.PICKUP, mc.field_71439_g);
         "".length();
      }

   }

   private static boolean lIlIlIIIIlIlII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIlIlIIIIIlllI() {
      lIIIIIIllllIl = new int[13];
      lIIIIIIllllIl[0] = (71 ^ 106) << " ".length() & ~((57 ^ 20) << " ".length());
      lIIIIIIllllIl[1] = " ".length();
      lIIIIIIllllIl[2] = " ".length() << " ".length();
      lIIIIIIllllIl[3] = -" ".length();
      lIIIIIIllllIl[4] = 7 ^ 42;
      lIIIIIIllllIl[5] = "   ".length();
      lIIIIIIllllIl[6] = " ".length() << (" ".length() << " ".length());
      lIIIIIIllllIl[7] = (18 ^ 23) << " ".length() ^ "   ".length();
      lIIIIIIllllIl[8] = ((159 ^ 138) << (" ".length() << " ".length()) ^ 210 ^ 143) << (" ".length() << " ".length());
      lIIIIIIllllIl[9] = 58 ^ 63;
      lIIIIIIllllIl[10] = "   ".length() << " ".length();
      lIIIIIIllllIl[11] = 120 + 35 - 110 + 82 ^ (82 ^ 93) << "   ".length();
      lIIIIIIllllIl[12] = " ".length() << "   ".length();
   }

   private void moveGapsToInventory(int lllllllllllllllIlIIIllIIllIlIIII) {
      if (lIlIlIIIIlIlII(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151153_ao)) {
         mc.field_71442_b.func_187098_a(lIIIIIIllllIl[0], lIIIIIIllllIl[4], lIIIIIIllllIl[0], ClickType.PICKUP, mc.field_71439_g);
         "".length();
         PlayerControllerMP var10000 = mc.field_71442_b;
         int var10001 = lIIIIIIllllIl[0];
         int var10002;
         if (lIlIlIIIIlIIll(lllllllllllllllIlIIIllIIllIlIIII, lIIIIIIllllIl[7])) {
            var10002 = lllllllllllllllIlIIIllIIllIlIIII + lIIIIIIllllIl[8];
            "".length();
            if ("   ".length() < -" ".length()) {
               return;
            }
         } else {
            var10002 = lllllllllllllllIlIIIllIIllIlIIII;
         }

         var10000.func_187098_a(var10001, var10002, lIIIIIIllllIl[0], ClickType.PICKUP, mc.field_71439_g);
         "".length();
      }

   }

   public OffhandGapple() {
      lllllllllllllllIlIIIllIIlllIlIII.disableHealth = lllllllllllllllIlIIIllIIlllIlIII.register(Settings.doubleBuilder(lIIIIIIllllII[lIIIIIIllllIl[0]]).withMinimum(0.0D).withValue((Number)4.0D).withMaximum(20.0D).build());
      lllllllllllllllIlIIIllIIlllIlIII.weaponCheck = lllllllllllllllIlIIIllIIlllIlIII.register(Settings.b(lIIIIIIllllII[lIIIIIIllllIl[1]], (boolean)lIIIIIIllllIl[1]));
      lllllllllllllllIlIIIllIIlllIlIII.eatWhileAttacking = lllllllllllllllIlIIIllIIlllIlIII.register(Settings.b(lIIIIIIllllII[lIIIIIIllllIl[2]], (boolean)lIIIIIIllllIl[1]));
      lllllllllllllllIlIIIllIIlllIlIII.gaps = lIIIIIIllllIl[3];
      lllllllllllllllIlIIIllIIlllIlIII.autoTotemWasEnabled = (boolean)lIIIIIIllllIl[0];
      lllllllllllllllIlIIIllIIlllIlIII.notCancelled = (boolean)lIIIIIIllllIl[0];
      lllllllllllllllIlIIIllIIlllIlIII.sendListener = new Listener((lllllllllllllllIlIIIllIIllIIlIll) -> {
         if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIIlIll.getPacket() instanceof CPacketPlayerTryUseItem)) {
            if (lIlIlIIIIlIIIl(lIlIlIIIIllIII((double)(mc.field_71439_g.func_110143_aJ() + mc.field_71439_g.func_110139_bj()), (Double)lllllllllllllllIlIIIllIIllIIllII.disableHealth.getValue()))) {
               lllllllllllllllIlIIIllIIllIIllII.disableGaps();
               return;
            }

            if (!lIlIlIIIIlIllI(mc.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemSword) || !lIlIlIIIIlIllI(mc.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemAxe) || lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIIllII.passItemCheck())) {
               if (lIlIlIIIIlIlIl(ModuleManager.isModuleEnabled(lIIIIIIllllII[lIIIIIIllllIl[9]]))) {
                  lllllllllllllllIlIIIllIIllIIllII.autoTotemWasEnabled = (boolean)lIIIIIIllllIl[1];
                  ModuleManager.getModuleByName(lIIIIIIllllII[lIIIIIIllllIl[10]]).disable();
               }

               if (lIlIlIIIIlIllI((Boolean)lllllllllllllllIlIIIllIIllIIllII.eatWhileAttacking.getValue())) {
                  lllllllllllllllIlIIIllIIllIIllII.usedItem = mc.field_71439_g.func_184614_ca().func_77973_b();
               }

               lllllllllllllllIlIIIllIIllIIllII.enableGaps(lllllllllllllllIlIIIllIIllIIllII.gaps);
            }
         }

         try {
            if (lIlIlIIIIlIllI(mc.field_71474_y.field_74313_G.func_151470_d()) && lIlIlIIIIlIlII(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151153_ao)) {
               lllllllllllllllIlIIIllIIllIIllII.disableGaps();
               "".length();
               if (" ".length() << (" ".length() << " ".length()) == 0) {
                  return;
               }
            } else if (lIlIlIIIIlIIlI(lllllllllllllllIlIIIllIIllIIllII.usedItem, mc.field_71439_g.func_184614_ca().func_77973_b()) && lIlIlIIIIlIlII(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151153_ao)) {
               if (lIlIlIIIIlIllI((Boolean)lllllllllllllllIlIIIllIIllIIllII.eatWhileAttacking.getValue())) {
                  lllllllllllllllIlIIIllIIllIIllII.usedItem = mc.field_71439_g.func_184614_ca().func_77973_b();
                  lllllllllllllllIlIIIllIIllIIllII.disableGaps();
                  "".length();
                  if (((25 ^ 16) << " ".length() & ~((49 ^ 56) << " ".length())) == " ".length() << " ".length()) {
                     return;
                  }
               }
            } else if (lIlIlIIIIlIIIl(lIlIlIIIIllIII((double)(mc.field_71439_g.func_110143_aJ() + mc.field_71439_g.func_110139_bj()), (Double)lllllllllllllllIlIIIllIIllIIllII.disableHealth.getValue()))) {
               lllllllllllllllIlIIIllIIllIIllII.disableGaps();
            }
         } catch (NullPointerException var3) {
            return;
         }

         "".length();
         if (-"  ".length() <= 0) {
            ;
         }
      }, new Predicate[lIIIIIIllllIl[0]]);
   }

   static {
      lIlIlIIIIIlllI();
      lIlIlIIIIIllIl();
   }

   private static boolean lIlIlIIIIlIIlI(Object var0, Object var1) {
      return var0 != var1;
   }

   private static boolean lIlIlIIIIlIIIl(int var0) {
      return var0 <= 0;
   }

   private static boolean lIlIlIIIIlIIII(Object var0) {
      return var0 == null;
   }

   private boolean passItemCheck() {
      if (lIlIlIIIIlIlIl((Boolean)lllllllllllllllIlIIIllIIllIlllII.weaponCheck.getValue())) {
         return (boolean)lIIIIIIllllIl[0];
      } else {
         byte lllllllllllllllIlIIIllIIllIllIll = mc.field_71439_g.func_184614_ca().func_77973_b();
         if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemBow)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemSnowball)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemEgg)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemPotion)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemEnderEye)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemEnderPearl)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemFood)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemShield)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemFlintAndSteel)) {
            return (boolean)lIIIIIIllllIl[0];
         } else if (lIlIlIIIIlIlIl(lllllllllllllllIlIIIllIIllIllIll instanceof ItemFishingRod)) {
            return (boolean)lIIIIIIllllIl[0];
         } else {
            int var10000;
            if (lIlIlIIIIlIllI(lllllllllllllllIlIIIllIIllIllIll instanceof ItemArmor)) {
               var10000 = lIIIIIIllllIl[1];
               "".length();
               if ("   ".length() != "   ".length()) {
                  return (boolean)((154 ^ 157) << "   ".length() & ~((31 ^ 24) << "   ".length()));
               }
            } else {
               var10000 = lIIIIIIllllIl[0];
            }

            return (boolean)var10000;
         }
      }
   }

   private static String lIlIlIIIIIlIll(String lllllllllllllllIlIIIllIIllIIIIII, String lllllllllllllllIlIIIllIIlIllllll) {
      try {
         short lllllllllllllllIlIIIllIIlIllllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIlIllllll.getBytes(StandardCharsets.UTF_8)), lIIIIIIllllIl[12]), "DES");
         Cipher lllllllllllllllIlIIIllIIllIIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIIIllIIllIIIIlI.init(lIIIIIIllllIl[2], lllllllllllllllIlIIIllIIlIllllII);
         return new String(lllllllllllllllIlIIIllIIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlIIIIlIllI(int var0) {
      return var0 == 0;
   }

   private void disableGaps() {
      if (lIlIlIIIIlIlll(lllllllllllllllIlIIIllIIllIllIII.autoTotemWasEnabled, ModuleManager.isModuleEnabled(lIIIIIIllllII[lIIIIIIllllIl[5]]))) {
         lllllllllllllllIlIIIllIIllIllIII.moveGapsToInventory(lllllllllllllllIlIIIllIIllIllIII.gaps);
         ModuleManager.getModuleByName(lIIIIIIllllII[lIIIIIIllllIl[6]]).enable();
         lllllllllllllllIlIIIllIIllIllIII.autoTotemWasEnabled = (boolean)lIIIIIIllllIl[0];
      }

   }

   private static boolean lIlIlIIIIlIlIl(int var0) {
      return var0 != 0;
   }

   private static int lIlIlIIIIIllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void onUpdate() {
      if (!lIlIlIIIIlIIII(mc.field_71439_g)) {
         int var10001;
         if (lIlIlIIIIlIIIl(lIlIlIIIIIllll((double)(mc.field_71439_g.func_110143_aJ() + mc.field_71439_g.func_110139_bj()), (Double)lllllllllllllllIlIIIllIIlllIIIll.disableHealth.getValue()))) {
            var10001 = lIIIIIIllllIl[1];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10001 = lIIIIIIllllIl[0];
         }

         lllllllllllllllIlIIIllIIlllIIIll.notCancelled = (boolean)var10001;
         lllllllllllllllIlIIIllIIlllIIIll.toUseItem = Items.field_151153_ao;
         if (lIlIlIIIIlIIlI(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151153_ao)) {
            int lllllllllllllllIlIIIllIIlllIIlII = lIIIIIIllllIl[0];

            while(lIlIlIIIIlIIll(lllllllllllllllIlIIIllIIlllIIlII, lIIIIIIllllIl[4])) {
               if (lIlIlIIIIlIlII(mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIIIllIIlllIIlII).func_77973_b(), Items.field_151153_ao)) {
                  lllllllllllllllIlIIIllIIlllIIIll.gaps = lllllllllllllllIlIIIllIIlllIIlII;
                  "".length();
                  if ("   ".length() != "   ".length()) {
                     return;
                  }
                  break;
               }

               ++lllllllllllllllIlIIIllIIlllIIlII;
               "".length();
               if (("   ".length() << ("   ".length() << " ".length()) ^ 164 + 76 - 88 + 45) == 0) {
                  return;
               }
            }
         }

      }
   }

   private static boolean lIlIlIIIIlIlll(int var0, int var1) {
      return var0 != var1;
   }

   private static void lIlIlIIIIIllIl() {
      lIIIIIIllllII = new String[lIIIIIIllllIl[11]];
      lIIIIIIllllII[lIIIIIIllllIl[0]] = lIlIlIIIIIlIll("+axZEIMnxThXHZQRBNxxwQ==", "zMQSm");
      lIIIIIIllllII[lIIIIIIllllIl[1]] = lIlIlIIIIIlIll("xNI+X9o92FG/XQBAolihjw==", "MIVAb");
      lIIIIIIllllII[lIIIIIIllllIl[2]] = lIlIlIIIIIllII("M8NrTNPydTk+o2PoEhoAGcc2qIMs8ZSH", "jpgKV");
      lIIIIIIllllII[lIIIIIIllllIl[5]] = lIlIlIIIIIlIll("eTATvSSF1ekJfnS15ciLRA==", "ETNlQ");
      lIIIIIIllllII[lIIIIIIllllIl[6]] = lIlIlIIIIIlIll("hl+NQLJSO3Qo7c46V+4DJg==", "EcsgE");
      lIIIIIIllllII[lIIIIIIllllIl[9]] = lIlIlIIIIIlIll("QY2jZ7fLInoghsuFu5b20A==", "EhoyC");
      lIIIIIIllllII[lIIIIIIllllIl[10]] = lIlIlIIIIIllII("6UMgv8EVdQjGyQ5bmapjEQ==", "uAfGa");
   }
}
