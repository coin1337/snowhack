package rr.snowhack.snow.module.modules.misc;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.ItemPickaxe;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "NoMiningTrace",
   category = Module.Category.MISC,
   description = "Blocks entities from stopping you from mining"
)
public class NoMiningTrace extends Module {
   // $FF: synthetic field
   private static final int[] llllIIllIIll;
   // $FF: synthetic field
   private Setting<Boolean> pickaxe;
   // $FF: synthetic field
   private static NoMiningTrace INSTANCE;
   // $FF: synthetic field
   private static final String[] llllIIllIIlI;

   public static boolean spoofTrace() {
      if (lIIlllllIlllll(INSTANCE.isDisabled())) {
         return (boolean)llllIIllIIll[0];
      } else {
         int var10000;
         if (lIIlllllIlllll((Boolean)INSTANCE.pickaxe.getValue()) && !lIIlllllIlllll(mc.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemPickaxe)) {
            var10000 = llllIIllIIll[0];
         } else {
            var10000 = llllIIllIIll[1];
            "".length();
            if (null != null) {
               return (boolean)((190 ^ 175) << " ".length() & ~((64 ^ 81) << " ".length()));
            }
         }

         return (boolean)var10000;
      }
   }

   private static void lIIlllllIllllI() {
      llllIIllIIll = new int[2];
      llllIIllIIll[0] = ((167 ^ 184) << " ".length() ^ 93 ^ 46) & (179 ^ 166 ^ (85 ^ 94) << "   ".length() ^ -" ".length());
      llllIIllIIll[1] = " ".length();
   }

   static {
      lIIlllllIllllI();
      lIIlllllIlllIl();
   }

   private static String lIIlllllIlllII(String lllllllllllllllIlIlIlIlIIlIIIIlI, String lllllllllllllllIlIlIlIlIIlIIIIIl) {
      lllllllllllllllIlIlIlIlIIlIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      byte lllllllllllllllIlIlIlIlIIlIIIIII = new StringBuilder();
      Exception lllllllllllllllIlIlIlIlIIIllllll = lllllllllllllllIlIlIlIlIIlIIIIIl.toCharArray();
      short lllllllllllllllIlIlIlIlIIIlllllI = llllIIllIIll[0];
      int lllllllllllllllIlIlIlIlIIIllllIl = lllllllllllllllIlIlIlIlIIlIIIIlI.toCharArray();
      double lllllllllllllllIlIlIlIlIIIllllII = lllllllllllllllIlIlIlIlIIIllllIl.length;
      int lllllllllllllllIlIlIlIlIIIlllIll = llllIIllIIll[0];

      do {
         if (!lIIllllllIIIII(lllllllllllllllIlIlIlIlIIIlllIll, lllllllllllllllIlIlIlIlIIIllllII)) {
            return String.valueOf(lllllllllllllllIlIlIlIlIIlIIIIII);
         }

         char lllllllllllllllIlIlIlIlIIlIIlIII = lllllllllllllllIlIlIlIlIIIllllIl[lllllllllllllllIlIlIlIlIIIlllIll];
         lllllllllllllllIlIlIlIlIIlIIIIII.append((char)(lllllllllllllllIlIlIlIlIIlIIlIII ^ lllllllllllllllIlIlIlIlIIIllllll[lllllllllllllllIlIlIlIlIIIlllllI % lllllllllllllllIlIlIlIlIIIllllll.length]));
         "".length();
         ++lllllllllllllllIlIlIlIlIIIlllllI;
         ++lllllllllllllllIlIlIlIlIIIlllIll;
         "".length();
      } while(" ".length() >= -" ".length());

      return null;
   }

   public NoMiningTrace() {
      lllllllllllllllIlIlIlIlIIlIlIIll.pickaxe = lllllllllllllllIlIlIlIlIIlIlIIll.register(Settings.b(llllIIllIIlI[llllIIllIIll[0]], (boolean)llllIIllIIll[1]));
      INSTANCE = lllllllllllllllIlIlIlIlIIlIlIIll;
   }

   private static void lIIlllllIlllIl() {
      llllIIllIIlI = new String[llllIIllIIll[1]];
      llllIIllIIlI[llllIIllIIll[0]] = lIIlllllIlllII("GwEGPQ8zDUU5ACcR", "KheVn");
   }

   private static boolean lIIllllllIIIII(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIlllllIlllll(int var0) {
      return var0 != 0;
   }
}
