package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.modules.render.HoleESP;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.WorldUtils;

@Module.Info(
   name = "AutoWeb",
   category = Module.Category.COMBAT
)
public class AutoWeb extends Module {
   // $FF: synthetic field
   private static final String[] lIIIIIIlIIlIl;
   // $FF: synthetic field
   private static final int[] lIIIIIIlIIlll;
   // $FF: synthetic field
   private Setting<Double> range;
   // $FF: synthetic field
   private Setting<Boolean> onlyInHole;
   // $FF: synthetic field
   HoleESP hole;

   private static boolean lIlIIllllIIlIl(int var0, int var1) {
      return var0 == var1;
   }

   public AutoWeb() {
      lllllllllllllllIlIIIllllIlllIlIl.range = lllllllllllllllIlIIIllllIlllIlIl.register(Settings.d(lIIIIIIlIIlIl[lIIIIIIlIIlll[0]], 4.0D));
      lllllllllllllllIlIIIllllIlllIlIl.onlyInHole = lllllllllllllllIlIIIllllIlllIlIl.register(Settings.b(lIIIIIIlIIlIl[lIIIIIIlIIlll[1]], (boolean)lIIIIIIlIIlll[1]));
      lllllllllllllllIlIIIllllIlllIlIl.hole = new HoleESP();
   }

   private static int lIlIIllllIlIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static void lIlIIllllIIIll() {
      lIIIIIIlIIlll = new int[5];
      lIIIIIIlIIlll[0] = " ".length() << " ".length() & ~(" ".length() << " ".length());
      lIIIIIIlIIlll[1] = " ".length();
      lIIIIIIlIIlll[2] = -" ".length();
      lIIIIIIlIIlll[3] = " ".length() << " ".length();
      lIIIIIIlIIlll[4] = " ".length() << "   ".length();
   }

   private static boolean lIlIIllllIIlII(int var0) {
      return var0 == 0;
   }

   private static void lIlIIlllIllllI() {
      lIIIIIIlIIlIl = new String[lIIIIIIlIIlll[3]];
      lIIIIIIlIIlIl[lIIIIIIlIIlll[0]] = lIlIIlllIlllII("eM72D8cFyOw=", "XBdYx");
      lIIIIIIlIIlIl[lIIIIIIlIIlll[1]] = lIlIIlllIlllIl("WgAT6Ts7H+oJ/70q7wN61A==", "cUWVs");
   }

   static {
      lIlIIllllIIIll();
      lIlIIlllIllllI();
   }

   private static boolean lIlIIllllIlIIl(int var0) {
      return var0 <= 0;
   }

   public void onUpdate() {
      if (!lIlIIllllIIlII(lllllllllllllllIlIIIllllIllIlIll.isEnabled())) {
         int lllllllllllllllIlIIIllllIllIlIlI = WorldUtils.findBlock(Blocks.field_150321_G);
         if (!lIlIIllllIIlIl(lllllllllllllllIlIIIllllIllIlIlI, lIIIIIIlIIlll[2])) {
            List<EntityPlayer> lllllllllllllllIlIIIllllIllIIllI = (List)mc.field_71441_e.field_73010_i.stream().filter((lllllllllllllllIlIIIllllIlIllIIl) -> {
               int var10000;
               if (lIlIIllllIlIIl(lIlIIllllIlIlI((double)mc.field_71439_g.func_70032_d(lllllllllllllllIlIIIllllIlIllIIl), (Double)lllllllllllllllIlIIIllllIlIllIlI.range.getValue())) && lIlIIllllIIlII(mc.field_71439_g.equals(lllllllllllllllIlIIIllllIlIllIIl))) {
                  var10000 = lIIIIIIlIIlll[1];
                  "".length();
                  if (null != null) {
                     return (boolean)("   ".length() << (97 ^ 100) & ~("   ".length() << (89 ^ 92)));
                  }
               } else {
                  var10000 = lIIIIIIlIIlll[0];
               }

               return (boolean)var10000;
            }).collect(Collectors.toList());
            if (lIlIIllllIIllI(lllllllllllllllIlIIIllllIllIIllI.size())) {
               mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIIIllllIllIlIlI;
            }

            Iterator lllllllllllllllIlIIIllllIllIIlIl = lllllllllllllllIlIIIllllIllIIllI.iterator();

            label61:
            do {
               while(lIlIIllllIIlll(lllllllllllllllIlIIIllllIllIIlIl.hasNext())) {
                  EntityPlayer lllllllllllllllIlIIIllllIllIllII = (EntityPlayer)lllllllllllllllIlIIIllllIllIIlIl.next();
                  BlockPos lllllllllllllllIlIIIllllIllIllIl = new BlockPos((int)lllllllllllllllIlIIIllllIllIllII.field_70165_t, (int)lllllllllllllllIlIIIllllIllIllII.field_70163_u, (int)lllllllllllllllIlIIIllllIllIllII.field_70161_v);
                  if (lIlIIllllIIlll((Boolean)lllllllllllllllIlIIIllllIllIlIll.onlyInHole.getValue()) && lIlIIllllIIlII(lllllllllllllllIlIIIllllIllIlIll.hole.isHole(lllllllllllllllIlIIIllllIllIllIl))) {
                     "".length();
                     continue label61;
                  }

                  if (lIlIIllllIIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIllllIllIllIl).func_185904_a().func_76222_j())) {
                     WorldUtils.placeBlockMainHand(lllllllllllllllIlIIIllllIllIllIl);
                  }

                  if (lIlIIllllIIlll((Boolean)lllllllllllllllIlIIIllllIllIlIll.onlyInHole.getValue())) {
                     "".length();
                     if (-((106 ^ 121) << " ".length() ^ (70 ^ 87) << " ".length()) > 0) {
                        return;
                     }
                  } else {
                     if (lIlIIllllIIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[1], lIIIIIIlIIlll[0], lIIIIIIlIIlll[0])).func_185904_a().func_76222_j())) {
                        WorldUtils.placeBlockMainHand(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[1], lIIIIIIlIIlll[0], lIIIIIIlIIlll[0]));
                     }

                     if (lIlIIllllIIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[0], lIIIIIIlIIlll[0], lIIIIIIlIIlll[1])).func_185904_a().func_76222_j())) {
                        WorldUtils.placeBlockMainHand(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[0], lIIIIIIlIIlll[0], lIIIIIIlIIlll[1]));
                     }

                     if (lIlIIllllIIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[0], lIIIIIIlIIlll[0], lIIIIIIlIIlll[2])).func_185904_a().func_76222_j())) {
                        WorldUtils.placeBlockMainHand(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[0], lIIIIIIlIIlll[0], lIIIIIIlIIlll[2]));
                     }

                     if (lIlIIllllIIlII(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[2], lIIIIIIlIIlll[0], lIIIIIIlIIlll[0])).func_185904_a().func_76222_j())) {
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) <= 0) {
                           return;
                        }
                     } else {
                        WorldUtils.placeBlockMainHand(lllllllllllllllIlIIIllllIllIllIl.func_177982_a(lIIIIIIlIIlll[2], lIIIIIIlIIlll[0], lIIIIIIlIIlll[0]));
                        "".length();
                        if (null != null) {
                           return;
                        }
                     }
                  }
               }

               return;
            } while(null == null);

         }
      }
   }

   private static String lIlIIlllIlllIl(String lllllllllllllllIlIIIllllIlIIllll, String lllllllllllllllIlIIIllllIlIIlllI) {
      try {
         SecretKeySpec lllllllllllllllIlIIIllllIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIlll[4]), "DES");
         Exception lllllllllllllllIlIIIllllIlIIlIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIIIllllIlIIlIlI.init(lIIIIIIlIIlll[3], lllllllllllllllIlIIIllllIlIlIIlI);
         return new String(lllllllllllllllIlIIIllllIlIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIlllIlllII(String lllllllllllllllIlIIIllllIlIIIIlI, String lllllllllllllllIlIIIllllIIllllll) {
      try {
         SecretKeySpec lllllllllllllllIlIIIllllIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIIllllIlIIIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIllllIlIIIlII.init(lIIIIIIlIIlll[3], lllllllllllllllIlIIIllllIlIIIlIl);
         return new String(lllllllllllllllIlIIIllllIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIllllIIllI(int var0) {
      return var0 > 0;
   }

   private static int lIlIIllllIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private boolean lambdaonUpdate0(EntityPlayer lllllllllllllllIlIIIllllIlIlllll) {
      int var10000;
      if (lIlIIllllIlIIl(lIlIIllllIlIII((double)mc.field_71439_g.func_70032_d(lllllllllllllllIlIIIllllIlIlllll), (Double)lllllllllllllllIlIIIllllIllIIIII.range.getValue())) && lIlIIllllIIlII(mc.field_71439_g.equals(lllllllllllllllIlIIIllllIlIlllll))) {
         var10000 = lIIIIIIlIIlll[1];
         "".length();
         if ((((251 ^ 184) << " ".length() ^ 58 + 44 - 97 + 194) & ((217 ^ 194) << (" ".length() << " ".length()) ^ 96 ^ 77 ^ -" ".length())) < 0) {
            return (boolean)((208 ^ 179 ^ (194 ^ 197) << (" ".length() << (" ".length() << " ".length()))) << " ".length() & ((202 ^ 157 ^ (81 ^ 64) << (" ".length() << " ".length())) << " ".length() ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIIIlIIlll[0];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIIllllIIlll(int var0) {
      return var0 != 0;
   }
}
