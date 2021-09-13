package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerHopper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumHand;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.Friends;

@Module.Info(
   name = "32kAura",
   category = Module.Category.COMBAT
)
public class AresAura extends Module {
   // $FF: synthetic field
   private Setting<Boolean> drop;
   // $FF: synthetic field
   private Setting<Double> delay;
   // $FF: synthetic field
   private Setting<Boolean> playersOnly;
   // $FF: synthetic field
   private Setting<Float> range;
   // $FF: synthetic field
   private static final String[] lIIIlIIIIIlll;
   // $FF: synthetic field
   private int hasWaited;
   // $FF: synthetic field
   private static final int[] lIIIlIIIIlIlI;
   // $FF: synthetic field
   private Setting<Boolean> switch32k;

   private static int lIlIlllIlIIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static void lIlIlllIlIIIlI() {
      lIIIlIIIIIlll = new String[lIIIlIIIIlIlI[11]];
      lIIIlIIIIIlll[lIIIlIIIIlIlI[0]] = lIlIlllIIlllll("1zn4YDuRjmU=", "RsuHG");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[1]] = lIlIlllIlIIIII("1azf/g1NdJFxEORgGyJCjA==", "BWzxK");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[2]] = lIlIlllIlIIIIl("fXo4dQs5ISc2MA==", "NHSUX");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[3]] = lIlIlllIIlllll("GXZ+k949VfEdKoR4j8qtcg==", "pizCA");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[4]] = lIlIlllIIlllll("qe+itj0QRT8OAwBxpj1biQ==", "WVOyu");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[5]] = lIlIlllIIlllll("1Ro4uPGE9GY=", "hCkll");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[6]] = lIlIlllIlIIIII("bwW1N9ze4OM=", "PvXkT");
      lIIIlIIIIIlll[lIIIlIIIIlIlI[8]] = lIlIlllIlIIIIl("ISUo", "MSDYF");
   }

   public AresAura() {
      lllllllllllllllIIlllIllIIlIIlIIl.range = lllllllllllllllIIlllIllIIlIIlIIl.register(Settings.f(lIIIlIIIIIlll[lIIIlIIIIlIlI[0]], 8.0F));
      lllllllllllllllIIlllIllIIlIIlIIl.playersOnly = lllllllllllllllIIlllIllIIlIIlIIl.register(Settings.b(lIIIlIIIIIlll[lIIIlIIIIlIlI[1]], (boolean)lIIIlIIIIlIlI[0]));
      lllllllllllllllIIlllIllIIlIIlIIl.switch32k = lllllllllllllllIIlllIllIIlIIlIIl.register(Settings.b(lIIIlIIIIIlll[lIIIlIIIIlIlI[2]], (boolean)lIIIlIIIIlIlI[1]));
      lllllllllllllllIIlllIllIIlIIlIIl.delay = lllllllllllllllIIlllIllIIlIIlIIl.register(Settings.d(lIIIlIIIIIlll[lIIIlIIIIlIlI[3]], 2.0D));
      lllllllllllllllIIlllIllIIlIIlIIl.drop = lllllllllllllllIIlllIllIIlIIlIIl.register(Settings.b(lIIIlIIIIIlll[lIIIlIIIIlIlI[4]], (boolean)lIIIlIIIIlIlI[1]));
   }

   private static boolean lIlIlllIlIlIII(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIlllIllIIll(int var0, int var1) {
      return var0 != var1;
   }

   private static String lIlIlllIlIIIIl(String lllllllllllllllIIlllIlIllllllllI, String lllllllllllllllIIlllIlIllllllIII) {
      lllllllllllllllIIlllIlIllllllllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIlIllllllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIlIlllllllII = new StringBuilder();
      char[] lllllllllllllllIIlllIlIllllllIll = lllllllllllllllIIlllIlIllllllIII.toCharArray();
      Exception lllllllllllllllIIlllIlIlllllIlIl = lIIIlIIIIlIlI[0];
      Exception lllllllllllllllIIlllIlIlllllIlII = lllllllllllllllIIlllIlIllllllllI.toCharArray();
      long lllllllllllllllIIlllIlIlllllIIll = lllllllllllllllIIlllIlIlllllIlII.length;
      int lllllllllllllllIIlllIlIlllllIIlI = lIIIlIIIIlIlI[0];

      do {
         if (!lIlIlllIlIlllI(lllllllllllllllIIlllIlIlllllIIlI, lllllllllllllllIIlllIlIlllllIIll)) {
            return String.valueOf(lllllllllllllllIIlllIlIlllllllII);
         }

         long lllllllllllllllIIlllIlIlllllIIIl = lllllllllllllllIIlllIlIlllllIlII[lllllllllllllllIIlllIlIlllllIIlI];
         lllllllllllllllIIlllIlIlllllllII.append((char)(lllllllllllllllIIlllIlIlllllIIIl ^ lllllllllllllllIIlllIlIllllllIll[lllllllllllllllIIlllIlIlllllIlIl % lllllllllllllllIIlllIlIllllllIll.length]));
         "".length();
         ++lllllllllllllllIIlllIlIlllllIlIl;
         ++lllllllllllllllIIlllIlIlllllIIlI;
         "".length();
      } while(-"  ".length() <= 0);

      return null;
   }

   private boolean isSuperWeapon(ItemStack lllllllllllllllIIlllIllIIIlIIIll) {
      if (lIlIlllIlIlIIl(lllllllllllllllIIlllIllIIIlIIIll)) {
         return (boolean)lIIIlIIIIlIlI[0];
      } else if (lIlIlllIlIlIIl(lllllllllllllllIIlllIllIIIlIIIll.func_77978_p())) {
         return (boolean)lIIIlIIIIlIlI[0];
      } else if (lIlIlllIlIlIII(lllllllllllllllIIlllIllIIIlIIIll.func_77986_q().func_150303_d())) {
         return (boolean)lIIIlIIIIlIlI[0];
      } else {
         NBTTagList lllllllllllllllIIlllIllIIIlIIIlI = (NBTTagList)lllllllllllllllIIlllIllIIIlIIIll.func_77978_p().func_74781_a(lIIIlIIIIIlll[lIIIlIIIIlIlI[5]]);
         int lllllllllllllllIIlllIllIIIlIIIIl = lIIIlIIIIlIlI[0];

         while(lIlIlllIlIlllI(lllllllllllllllIIlllIllIIIlIIIIl, lllllllllllllllIIlllIllIIIlIIIlI.func_74745_c())) {
            NBTTagCompound lllllllllllllllIIlllIllIIIlIIlll = lllllllllllllllIIlllIllIIIlIIIlI.func_150305_b(lllllllllllllllIIlllIllIIIlIIIIl);
            if (lIlIlllIlIllll(lllllllllllllllIIlllIllIIIlIIlll.func_74762_e(lIIIlIIIIIlll[lIIIlIIIIlIlI[6]]), lIIIlIIIIlIlI[7])) {
               int lllllllllllllllIIlllIllIIIlIlIIl = lllllllllllllllIIlllIllIIIlIIlll.func_74762_e(lIIIlIIIIIlll[lIIIlIIIIlIlI[8]]);
               if (lIlIlllIllIIII(lllllllllllllllIIlllIllIIIlIlIIl, lIIIlIIIIlIlI[7])) {
                  return (boolean)lIIIlIIIIlIlI[1];
               }
               break;
            }

            ++lllllllllllllllIIlllIllIIIlIIIIl;
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
               return (boolean)((142 ^ 159) << (" ".length() << " ".length()) & ~((32 ^ 49) << (" ".length() << " ".length())));
            }
         }

         return (boolean)lIIIlIIIIlIlI[0];
      }
   }

   private static void equip(int lllllllllllllllIIlllIllIIIIIlIIl) {
      mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIIlllIllIIIIIlIIl;
      mc.field_71442_b.func_78750_j();
   }

   public static void equipBestWeapon() {
      int lllllllllllllllIIlllIllIIIIlIIlI = lIIIlIIIIlIlI[9];
      double lllllllllllllllIIlllIllIIIIlIIIl = 0.0D;
      int lllllllllllllllIIlllIllIIIIIlllI = lIIIlIIIIlIlI[0];

      do {
         if (!lIlIlllIlIlllI(lllllllllllllllIIlllIllIIIIIlllI, lIIIlIIIIlIlI[10])) {
            if (lIlIlllIllIIll(lllllllllllllllIIlllIllIIIIlIIlI, lIIIlIIIIlIlI[9])) {
               equip(lllllllllllllllIIlllIllIIIIlIIlI);
            }

            return;
         }

         ItemStack lllllllllllllllIIlllIllIIIIlIlII = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIIlllIllIIIIIlllI);
         if (lIlIlllIlIIlll(lllllllllllllllIIlllIllIIIIlIlII.field_190928_g)) {
            "".length();
            if (null != null) {
               return;
            }
         } else {
            double lllllllllllllllIIlllIllIIIIIllII;
            if (lIlIlllIlIIlll(lllllllllllllllIIlllIllIIIIlIlII.func_77973_b() instanceof ItemTool)) {
               lllllllllllllllIIlllIllIIIIIllII = (double)((ItemTool)lllllllllllllllIIlllIllIIIIlIlII.func_77973_b()).field_77865_bY + (double)EnchantmentHelper.func_152377_a(lllllllllllllllIIlllIllIIIIlIlII, EnumCreatureAttribute.UNDEFINED);
               if (lIlIlllIlIllIl(lIlIlllIllIIlI(lllllllllllllllIIlllIllIIIIIllII, lllllllllllllllIIlllIllIIIIlIIIl))) {
                  lllllllllllllllIIlllIllIIIIlIIIl = lllllllllllllllIIlllIllIIIIIllII;
                  lllllllllllllllIIlllIllIIIIlIIlI = lllllllllllllllIIlllIllIIIIIlllI;
               }

               "".length();
               if (" ".length() << " ".length() <= 0) {
                  return;
               }
            } else if (lIlIlllIlIIlll(lllllllllllllllIIlllIllIIIIlIlII.func_77973_b() instanceof ItemSword)) {
               lllllllllllllllIIlllIllIIIIIllII = (double)((ItemSword)lllllllllllllllIIlllIllIIIIlIlII.func_77973_b()).func_150931_i() + (double)EnchantmentHelper.func_152377_a(lllllllllllllllIIlllIllIIIIlIlII, EnumCreatureAttribute.UNDEFINED);
               if (lIlIlllIlIllIl(lIlIlllIllIIlI(lllllllllllllllIIlllIllIIIIIllII, lllllllllllllllIIlllIllIIIIlIIIl))) {
                  lllllllllllllllIIlllIllIIIIlIIIl = lllllllllllllllIIlllIllIIIIIllII;
                  lllllllllllllllIIlllIllIIIIlIIlI = lllllllllllllllIIlllIllIIIIIlllI;
               }
            }
         }

         ++lllllllllllllllIIlllIllIIIIIlllI;
         "".length();
      } while("   ".length() > " ".length() << " ".length());

   }

   private static boolean lIlIlllIlIlIll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static int lIlIlllIllIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIlllIlIIlIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIlllIlIlllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIlllIlIlIIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIlllIlIllII(int var0) {
      return var0 <= 0;
   }

   private static String lIlIlllIlIIIII(String lllllllllllllllIIlllIlIllllIIlll, String lllllllllllllllIIlllIlIllllIIllI) {
      try {
         char lllllllllllllllIIlllIlIllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIllllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllllllllllllllIIlllIlIllllIIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIlIllllIIlII.init(lIIIlIIIIlIlI[2], lllllllllllllllIIlllIlIllllIIlIl);
         return new String(lllllllllllllllIIlllIlIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIllllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlllIlIllIl(int var0) {
      return var0 > 0;
   }

   private static void lIlIlllIlIIIll() {
      lIIIlIIIIlIlI = new int[12];
      lIIIlIIIIlIlI[0] = (179 + 150 - 253 + 151 ^ (151 ^ 188) << (" ".length() << " ".length())) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ 46 + 98 - 55 + 38 ^ -" ".length());
      lIIIlIIIIlIlI[1] = " ".length();
      lIIIlIIIIlIlI[2] = " ".length() << " ".length();
      lIIIlIIIIlIlI[3] = "   ".length();
      lIIIlIIIIlIlI[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIIIIlIlI[5] = 106 ^ 111;
      lIIIlIIIIlIlI[6] = "   ".length() << " ".length();
      lIIIlIIIIlIlI[7] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIIIIlIlI[8] = 255 ^ 144 ^ (176 ^ 189) << "   ".length();
      lIIIlIIIIlIlI[9] = -" ".length();
      lIIIlIIIIlIlI[10] = (168 ^ 191) << " ".length() ^ 31 ^ 56;
      lIIIlIIIIlIlI[11] = " ".length() << "   ".length();
   }

   private static boolean lIlIlllIlIlIlI(int var0) {
      return var0 < 0;
   }

   private static int lIlIlllIlIIllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIlllIlIllll(int var0, int var1) {
      return var0 == var1;
   }

   static {
      lIlIlllIlIIIll();
      lIlIlllIlIIIlI();
   }

   private static boolean lIlIlllIlIIlll(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIlllIllIIII(int var0, int var1) {
      return var0 >= var1;
   }

   public void onUpdate() {
      if (lIlIlllIlIIlll(lllllllllllllllIIlllIllIIlIIIIll.isEnabled()) && lIlIlllIlIlIII(mc.field_71439_g.field_70128_L) && !lIlIlllIlIlIIl(mc.field_71441_e)) {
         if (lIlIlllIlIIlll((Boolean)lllllllllllllllIIlllIllIIlIIIIll.drop.getValue()) && lIlIlllIlIlIII(lllllllllllllllIIlllIllIIlIIIIll.isSuperWeapon(mc.field_71439_g.func_184614_ca())) && lIlIlllIlIIlll(mc.field_71439_g.field_71070_bA instanceof ContainerHopper)) {
            mc.field_71439_g.func_71040_bB((boolean)lIIIlIIIIlIlI[1]);
            "".length();
         }

         if (lIlIlllIlIlIlI(lIlIlllIlIIlII((double)lllllllllllllllIIlllIllIIlIIIIll.hasWaited, (Double)lllllllllllllllIIlllIllIIlIIIIll.delay.getValue()))) {
            lllllllllllllllIIlllIllIIlIIIIll.hasWaited += lIIIlIIIIlIlI[1];
         } else {
            lllllllllllllllIIlllIllIIlIIIIll.hasWaited = lIIIlIIIIlIlI[0];
            Iterator lllllllllllllllIIlllIllIIlIIIIIl = mc.field_71441_e.field_72996_f.iterator();

            label64:
            do {
               while(lIlIlllIlIIlll(lllllllllllllllIIlllIllIIlIIIIIl.hasNext())) {
                  float lllllllllllllllIIlllIllIIlIIIIII = (Entity)lllllllllllllllIIlllIllIIlIIIIIl.next();
                  if (lIlIlllIlIIlll(lllllllllllllllIIlllIllIIlIIIIII instanceof EntityLivingBase)) {
                     if (lIlIlllIlIlIll(lllllllllllllllIIlllIllIIlIIIIII, mc.field_71439_g)) {
                        "".length();
                        continue label64;
                     }

                     if (lIlIlllIlIIlll((Boolean)lllllllllllllllIIlllIllIIlIIIIll.switch32k.getValue())) {
                        equipBestWeapon();
                     }

                     if (!lIlIlllIlIllII(lIlIlllIlIIlIl(mc.field_71439_g.func_70032_d(lllllllllllllllIIlllIllIIlIIIIII), (Float)lllllllllllllllIIlllIllIIlIIIIll.range.getValue())) || !lIlIlllIlIllIl(lIlIlllIlIIllI(((EntityLivingBase)lllllllllllllllIIlllIllIIlIIIIII).func_110143_aJ(), 0.0F)) || lIlIlllIlIlIII(lllllllllllllllIIlllIllIIlIIIIII instanceof EntityPlayer) && !lIlIlllIlIlIII((Boolean)lllllllllllllllIIlllIllIIlIIIIll.playersOnly.getValue())) {
                        continue;
                     }

                     if (lIlIlllIlIlIII(lllllllllllllllIIlllIllIIlIIIIll.isSuperWeapon(mc.field_71439_g.func_184614_ca()))) {
                        "".length();
                        if (" ".length() << " ".length() == 0) {
                           return;
                        }
                        continue;
                     }

                     if (lIlIlllIlIlIII(Friends.isFriend(lllllllllllllllIIlllIllIIlIIIIII.func_70005_c_()))) {
                        mc.field_71442_b.func_78764_a(mc.field_71439_g, lllllllllllllllIIlllIllIIlIIIIII);
                        mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                     }
                  }

                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) == 0) {
                     return;
                  }
               }

               return;
            } while(-(104 ^ 109) < 0);

         }
      }
   }

   private static String lIlIlllIIlllll(String lllllllllllllllIIlllIlIlllIllIlI, String lllllllllllllllIIlllIlIlllIllIll) {
      try {
         boolean lllllllllllllllIIlllIlIlllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIlllIllIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIIIlIlI[11]), "DES");
         Cipher lllllllllllllllIIlllIlIlllIllllI = Cipher.getInstance("DES");
         lllllllllllllllIIlllIlIlllIllllI.init(lIIIlIIIIlIlI[2], lllllllllllllllIIlllIlIlllIllIII);
         return new String(lllllllllllllllIIlllIlIlllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIlllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
