package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import org.lwjgl.input.Mouse;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AutoTool",
   description = "Automatically switch to the best tools when mining or attacking",
   category = Module.Category.MISC
)
public class AutoTool extends Module {
   // $FF: synthetic field
   private Setting<Boolean> back;
   // $FF: synthetic field
   @EventHandler
   private Listener<AttackEntityEvent> attackListener;
   // $FF: synthetic field
   private static final String[] lIIIIIlIllIII;
   // $FF: synthetic field
   @EventHandler
   private Listener<LeftClickBlock> leftClickListener;
   // $FF: synthetic field
   private static final int[] lIIIIIlIllIIl;

   private void equipBestTool(IBlockState lllllllllllllllIlIIIIllIllIlIIll) {
      int lllllllllllllllIlIIIIllIllIlIIlI = mc.field_71439_g.field_71071_by.field_70461_c;
      int lllllllllllllllIlIIIIllIllIlIIIl = lIIIIIlIllIIl[2];
      double lllllllllllllllIlIIIIllIllIlIIII = 0.0D;
      int lllllllllllllllIlIIIIllIllIlIlIl = lIIIIIlIllIIl[0];

      do {
         if (!lIlIlIIlIlIlII(lllllllllllllllIlIIIIllIllIlIlIl, lIIIIIlIllIIl[3])) {
            if (lIlIlIIlIlIlll(lllllllllllllllIlIIIIllIllIlIIIl, lIIIIIlIllIIl[2]) && lIlIlIIlIllIII(ModuleManager.isModuleEnabled(lIIIIIlIllIII[lIIIIIlIllIIl[1]]))) {
               equip(lllllllllllllllIlIIIIllIllIlIIIl);
            }

            if (lIlIlIIlIlIlIl((Boolean)lllllllllllllllIlIIIIllIllIlIlII.back.getValue()) && lIlIlIIlIllIII(Mouse.isButtonDown(lIIIIIlIllIIl[1]))) {
               mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIIIIllIllIlIIlI;
            }

            return;
         }

         ItemStack lllllllllllllllIlIIIIllIllIllIII = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIIIIllIllIlIlIl);
         if (lIlIlIIlIlIlIl(lllllllllllllllIlIIIIllIllIllIII.field_190928_g)) {
            "".length();
            if (" ".length() != " ".length()) {
               return;
            }
         } else {
            float lllllllllllllllIlIIIIllIllIlIlll = lllllllllllllllIlIIIIllIllIllIII.func_150997_a(lllllllllllllllIlIIIIllIllIlIIll);
            if (lIlIlIIlIlIllI(lIlIlIIlIlIIlI(lllllllllllllllIlIIIIllIllIlIlll, 1.0F))) {
               double var10000 = (double)lllllllllllllllIlIIIIllIllIlIlll;
               double var10001;
               int lllllllllllllllIlIIIIllIllIlIllI;
               if (lIlIlIIlIlIllI(lllllllllllllllIlIIIIllIllIlIllI = EnchantmentHelper.func_77506_a(Enchantments.field_185305_q, lllllllllllllllIlIIIIllIllIllIII))) {
                  var10001 = Math.pow((double)lllllllllllllllIlIIIIllIllIlIllI, 2.0D) + 1.0D;
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var10001 = 0.0D;
               }

               lllllllllllllllIlIIIIllIllIlIlll = (float)(var10000 + var10001);
               if (lIlIlIIlIlIllI(lIlIlIIlIlIIll((double)lllllllllllllllIlIIIIllIllIlIlll, lllllllllllllllIlIIIIllIllIlIIII))) {
                  lllllllllllllllIlIIIIllIllIlIIII = (double)lllllllllllllllIlIIIIllIllIlIlll;
                  lllllllllllllllIlIIIIllIllIlIIIl = lllllllllllllllIlIIIIllIllIlIlIl;
               }
            }
         }

         ++lllllllllllllllIlIIIIllIllIlIlIl;
         "".length();
      } while(" ".length() << " ".length() > 0);

   }

   private static int lIlIlIIlIlIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static void lIlIlIIlIlIIIl() {
      lIIIIIlIllIIl = new int[5];
      lIIIIIlIllIIl[0] = (61 ^ 14 ^ (85 ^ 82) << (" ".length() << " ".length())) & (219 ^ 178 ^ (85 ^ 118) << " ".length() ^ -" ".length());
      lIIIIIlIllIIl[1] = " ".length();
      lIIIIIlIllIIl[2] = -" ".length();
      lIIIIIlIllIIl[3] = 177 ^ 148 ^ (160 ^ 171) << (" ".length() << " ".length());
      lIIIIIlIllIIl[4] = " ".length() << " ".length();
   }

   static {
      lIlIlIIlIlIIIl();
      lIlIlIIlIlIIII();
   }

   public AutoTool() {
      lllllllllllllllIlIIIIllIlllIIIll.back = lllllllllllllllIlIIIIllIlllIIIll.register(Settings.b(lIIIIIlIllIII[lIIIIIlIllIIl[0]], (boolean)lIIIIIlIllIIl[1]));
      lllllllllllllllIlIIIIllIlllIIIll.leftClickListener = new Listener((lllllllllllllllIlIIIIllIlIlIllIl) -> {
         lllllllllllllllIlIIIIllIlIllIIII.equipBestTool(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIIllIlIlIllIl.getPos()));
      }, new Predicate[lIIIIIlIllIIl[0]]);
      lllllllllllllllIlIIIIllIlllIIIll.attackListener = new Listener((lllllllllllllllIlIIIIllIlIllIIll) -> {
         equipBestWeapon();
      }, new Predicate[lIIIIIlIllIIl[0]]);
   }

   private static boolean lIlIlIIlIlIlIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIlIIlIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIlIIlIlIIII() {
      lIIIIIlIllIII = new String[lIIIIIlIllIIl[4]];
      lIIIIIlIllIII[lIIIIIlIllIIl[0]] = lIlIlIIlIIlllI("MQ8jOwkXRyA0DRk=", "rgBUn");
      lIIIIIlIllIII[lIIIIIlIllIIl[1]] = lIlIlIIlIIllll("H7Pd6LwlwwITMuVhXi9HCA==", "ysPsS");
   }

   private static boolean lIlIlIIlIlIllI(int var0) {
      return var0 > 0;
   }

   private static int lIlIlIIlIlIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static String lIlIlIIlIIllll(String lllllllllllllllIlIIIIllIlIIIlIll, String lllllllllllllllIlIIIIllIlIIIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIllIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIllIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIlIIIIllIlIIIlIII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIllIlIIIlIII.init(lIIIIIlIllIIl[4], lllllllllllllllIlIIIIllIlIIlIIII);
         return new String(lllllllllllllllIlIIIIllIlIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIllIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlIIlIlIlll(int var0, int var1) {
      return var0 != var1;
   }

   private static String lIlIlIIlIIlllI(String lllllllllllllllIlIIIIllIlIIlllIl, String lllllllllllllllIlIIIIllIlIlIIIIl) {
      lllllllllllllllIlIIIIllIlIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIllIlIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIIIllIlIlIIIII = new StringBuilder();
      char[] lllllllllllllllIlIIIIllIlIIlllll = lllllllllllllllIlIIIIllIlIlIIIIl.toCharArray();
      int lllllllllllllllIlIIIIllIlIIllllI = lIIIIIlIllIIl[0];
      double lllllllllllllllIlIIIIllIlIIllIII = lllllllllllllllIlIIIIllIlIIlllIl.toCharArray();
      long lllllllllllllllIlIIIIllIlIIlIlll = lllllllllllllllIlIIIIllIlIIllIII.length;
      int lllllllllllllllIlIIIIllIlIIlIllI = lIIIIIlIllIIl[0];

      do {
         if (!lIlIlIIlIlIlII(lllllllllllllllIlIIIIllIlIIlIllI, lllllllllllllllIlIIIIllIlIIlIlll)) {
            return String.valueOf(lllllllllllllllIlIIIIllIlIlIIIII);
         }

         char lllllllllllllllIlIIIIllIlIlIIIll = lllllllllllllllIlIIIIllIlIIllIII[lllllllllllllllIlIIIIllIlIIlIllI];
         lllllllllllllllIlIIIIllIlIlIIIII.append((char)(lllllllllllllllIlIIIIllIlIlIIIll ^ lllllllllllllllIlIIIIllIlIIlllll[lllllllllllllllIlIIIIllIlIIllllI % lllllllllllllllIlIIIIllIlIIlllll.length]));
         "".length();
         ++lllllllllllllllIlIIIIllIlIIllllI;
         ++lllllllllllllllIlIIIIllIlIIlIllI;
         "".length();
      } while((((35 ^ 44) << "   ".length() ^ 21 ^ 98) << " ".length() & (((100 ^ 91) << " ".length() ^ 11 ^ 122) << " ".length() ^ -" ".length())) <= 0);

      return null;
   }

   private static void equip(int lllllllllllllllIlIIIIllIlIllIlII) {
      mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIIIIllIlIllIlII;
      mc.field_71442_b.func_78750_j();
   }

   private static boolean lIlIlIIlIllIII(int var0) {
      return var0 == 0;
   }

   private static int lIlIlIIlIllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public static void equipBestWeapon() {
      byte lllllllllllllllIlIIIIllIlIlllIll = lIIIIIlIllIIl[2];
      String lllllllllllllllIlIIIIllIlIlllIlI = 0.0D;
      int lllllllllllllllIlIIIIllIlIlllllI = lIIIIIlIllIIl[0];

      do {
         if (!lIlIlIIlIlIlII(lllllllllllllllIlIIIIllIlIlllllI, lIIIIIlIllIIl[3])) {
            if (lIlIlIIlIlIlll(lllllllllllllllIlIIIIllIlIlllIll, lIIIIIlIllIIl[2])) {
               equip(lllllllllllllllIlIIIIllIlIlllIll);
            }

            return;
         }

         ItemStack lllllllllllllllIlIIIIllIlIllllll = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIIIIllIlIlllllI);
         if (lIlIlIIlIlIlIl(lllllllllllllllIlIIIIllIlIllllll.field_190928_g)) {
            "".length();
            if ((((235 ^ 180) << " ".length() ^ 76 + 133 - 95 + 69) << "   ".length() & ((1 + 91 - 41 + 90 ^ (146 ^ 179) << (" ".length() << " ".length())) << "   ".length() ^ -" ".length())) != 0) {
               return;
            }
         } else {
            double lllllllllllllllIlIIIIllIllIIIIII;
            if (lIlIlIIlIlIlIl(lllllllllllllllIlIIIIllIlIllllll.func_77973_b() instanceof ItemTool)) {
               lllllllllllllllIlIIIIllIllIIIIII = (double)((ItemTool)lllllllllllllllIlIIIIllIlIllllll.func_77973_b()).field_77865_bY + (double)EnchantmentHelper.func_152377_a(lllllllllllllllIlIIIIllIlIllllll, EnumCreatureAttribute.UNDEFINED);
               if (lIlIlIIlIlIllI(lIlIlIIlIllIIl(lllllllllllllllIlIIIIllIllIIIIII, lllllllllllllllIlIIIIllIlIlllIlI))) {
                  lllllllllllllllIlIIIIllIlIlllIlI = lllllllllllllllIlIIIIllIllIIIIII;
                  lllllllllllllllIlIIIIllIlIlllIll = lllllllllllllllIlIIIIllIlIlllllI;
               }

               "".length();
               if (" ".length() << " ".length() < -" ".length()) {
                  return;
               }
            } else if (lIlIlIIlIlIlIl(lllllllllllllllIlIIIIllIlIllllll.func_77973_b() instanceof ItemSword)) {
               lllllllllllllllIlIIIIllIllIIIIII = (double)((ItemSword)lllllllllllllllIlIIIIllIlIllllll.func_77973_b()).func_150931_i() + (double)EnchantmentHelper.func_152377_a(lllllllllllllllIlIIIIllIlIllllll, EnumCreatureAttribute.UNDEFINED);
               if (lIlIlIIlIlIllI(lIlIlIIlIllIIl(lllllllllllllllIlIIIIllIllIIIIII, lllllllllllllllIlIIIIllIlIlllIlI))) {
                  lllllllllllllllIlIIIIllIlIlllIlI = lllllllllllllllIlIIIIllIllIIIIII;
                  lllllllllllllllIlIIIIllIlIlllIll = lllllllllllllllIlIIIIllIlIlllllI;
               }
            }
         }

         ++lllllllllllllllIlIIIIllIlIlllllI;
         "".length();
      } while(-" ".length() <= 0);

   }
}
