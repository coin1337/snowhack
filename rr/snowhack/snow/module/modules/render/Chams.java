package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;

@Module.Info(
   name = "Chams",
   category = Module.Category.RENDER,
   description = "See entities through walls"
)
public class Chams extends Module {
   // $FF: synthetic field
   private static Setting<Boolean> players;
   // $FF: synthetic field
   private static final String[] lIIIIllIlIllI;
   // $FF: synthetic field
   private static final int[] lIIIIllIlIlll;
   // $FF: synthetic field
   private static Setting<Boolean> animals;
   // $FF: synthetic field
   private static Setting<Boolean> mobs;

   static {
      lIlIllIIlIIlIl();
      lIlIllIIlIIlII();
      players = Settings.b(lIIIIllIlIllI[lIIIIllIlIlll[1]], (boolean)lIIIIllIlIlll[2]);
      animals = Settings.b(lIIIIllIlIllI[lIIIIllIlIlll[2]], (boolean)lIIIIllIlIlll[1]);
      mobs = Settings.b(lIIIIllIlIllI[lIIIIllIlIlll[3]], (boolean)lIIIIllIlIlll[1]);
   }

   private static boolean lIlIllIIlIIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIllIIlIIllI(int var0) {
      return var0 != 0;
   }

   private static String lIlIllIIlIIIll(String lllllllllllllllIIllllIlllIlIIIll, String lllllllllllllllIIllllIlllIlIIIlI) {
      lllllllllllllllIIllllIlllIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIlllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllllIlllIlIIllI = new StringBuilder();
      double lllllllllllllllIIllllIlllIlIIIII = lllllllllllllllIIllllIlllIlIIIlI.toCharArray();
      float lllllllllllllllIIllllIlllIIlllll = lIIIIllIlIlll[1];
      short lllllllllllllllIIllllIlllIIllllI = lllllllllllllllIIllllIlllIlIIIll.toCharArray();
      String lllllllllllllllIIllllIlllIIlllIl = lllllllllllllllIIllllIlllIIllllI.length;
      int lllllllllllllllIIllllIlllIIlllII = lIIIIllIlIlll[1];

      do {
         if (!lIlIllIIlIIlll(lllllllllllllllIIllllIlllIIlllII, lllllllllllllllIIllllIlllIIlllIl)) {
            return String.valueOf(lllllllllllllllIIllllIlllIlIIllI);
         }

         Exception lllllllllllllllIIllllIlllIIllIll = lllllllllllllllIIllllIlllIIllllI[lllllllllllllllIIllllIlllIIlllII];
         lllllllllllllllIIllllIlllIlIIllI.append((char)(lllllllllllllllIIllllIlllIIllIll ^ lllllllllllllllIIllllIlllIlIIIII[lllllllllllllllIIllllIlllIIlllll % lllllllllllllllIIllllIlllIlIIIII.length]));
         "".length();
         ++lllllllllllllllIIllllIlllIIlllll;
         ++lllllllllllllllIIllllIlllIIlllII;
         "".length();
      } while(((193 ^ 130) & ~(25 ^ 90)) == 0);

      return null;
   }

   public static boolean renderChams(Entity lllllllllllllllIIllllIlllIllIlII) {
      boolean var10000;
      if (lIlIllIIlIIllI(lllllllllllllllIIllllIlllIllIlII instanceof EntityPlayer)) {
         var10000 = (Boolean)players.getValue();
         "".length();
         if (" ".length() < 0) {
            return (boolean)(((185 ^ 138) << " ".length() ^ 2 ^ 79) & (127 ^ 44 ^ (41 ^ 38) << "   ".length() ^ -" ".length()));
         }
      } else if (lIlIllIIlIIllI(EntityUtil.isPassive(lllllllllllllllIIllllIlllIllIlII))) {
         var10000 = (Boolean)animals.getValue();
         "".length();
         if (-"  ".length() > 0) {
            return (boolean)(("   ".length() << "   ".length() ^ 9 ^ 32) << " ".length() & (((177 ^ 180) << " ".length() ^ 179 ^ 136) << " ".length() ^ -" ".length()));
         }
      } else {
         var10000 = (Boolean)mobs.getValue();
      }

      return var10000;
   }

   private static void lIlIllIIlIIlII() {
      lIIIIllIlIllI = new String[lIIIIllIlIlll[0]];
      lIIIIllIlIllI[lIIIIllIlIlll[1]] = lIlIllIIlIIIll("Nz8mAS8VIA==", "gSGxJ");
      lIIIIllIlIllI[lIIIIllIlIlll[2]] = lIlIllIIlIIIll("Jzg/OhgKJQ==", "fVVWy");
      lIIIIllIlIllI[lIIIIllIlIlll[3]] = lIlIllIIlIIIll("Nz8FMA==", "zPgCf");
   }

   public Chams() {
      Setting[] var10001 = new Setting[lIIIIllIlIlll[0]];
      var10001[lIIIIllIlIlll[1]] = players;
      var10001[lIIIIllIlIlll[2]] = animals;
      var10001[lIIIIllIlIlll[3]] = mobs;
      lllllllllllllllIIllllIlllIllIlll.registerAll(var10001);
   }

   private static void lIlIllIIlIIlIl() {
      lIIIIllIlIlll = new int[4];
      lIIIIllIlIlll[0] = "   ".length();
      lIIIIllIlIlll[1] = ((89 ^ 112) << " ".length() ^ 8 ^ 81) & ((18 ^ 73) << " ".length() ^ 130 + 153 - 174 + 80 ^ -" ".length());
      lIIIIllIlIlll[2] = " ".length();
      lIIIIllIlIlll[3] = " ".length() << " ".length();
   }
}
