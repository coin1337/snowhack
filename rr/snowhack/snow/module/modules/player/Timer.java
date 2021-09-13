package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Timer",
   category = Module.Category.PLAYER,
   description = "Changes your client tick speed"
)
public class Timer extends Module {
   // $FF: synthetic field
   private Setting<Float> speed;
   // $FF: synthetic field
   private static final String[] lIIIlIIIIIIll;
   // $FF: synthetic field
   private static final int[] lIIIlIIIIIlII;

   private static void lIlIlllIIlIlll() {
      lIIIlIIIIIIll = new String[lIIIlIIIIIlII[1]];
      lIIIlIIIIIIll[lIIIlIIIIIlII[0]] = lIlIlllIIlIllI("ACA3Myw=", "SPRVH");
   }

   private static String lIlIlllIIlIllI(String lllllllllllllllIIlllIllIIlllIlII, String lllllllllllllllIIlllIllIIllllIII) {
      lllllllllllllllIIlllIllIIlllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIllIIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIllIIlllIlll = new StringBuilder();
      long lllllllllllllllIIlllIllIIlllIIIl = lllllllllllllllIIlllIllIIllllIII.toCharArray();
      int lllllllllllllllIIlllIllIIlllIlIl = lIIIlIIIIIlII[0];
      byte lllllllllllllllIIlllIllIIllIllll = lllllllllllllllIIlllIllIIlllIlII.toCharArray();
      boolean lllllllllllllllIIlllIllIIllIlllI = lllllllllllllllIIlllIllIIllIllll.length;
      int lllllllllllllllIIlllIllIIllIllIl = lIIIlIIIIIlII[0];

      do {
         if (!lIlIlllIIllIIl(lllllllllllllllIIlllIllIIllIllIl, lllllllllllllllIIlllIllIIllIlllI)) {
            return String.valueOf(lllllllllllllllIIlllIllIIlllIlll);
         }

         char lllllllllllllllIIlllIllIIllllIlI = lllllllllllllllIIlllIllIIllIllll[lllllllllllllllIIlllIllIIllIllIl];
         lllllllllllllllIIlllIllIIlllIlll.append((char)(lllllllllllllllIIlllIllIIllllIlI ^ lllllllllllllllIIlllIllIIlllIIIl[lllllllllllllllIIlllIllIIlllIlIl % lllllllllllllllIIlllIllIIlllIIIl.length]));
         "".length();
         ++lllllllllllllllIIlllIllIIlllIlIl;
         ++lllllllllllllllIIlllIllIIllIllIl;
         "".length();
      } while(((88 ^ 115 ^ (59 ^ 50) << "   ".length()) & ((142 ^ 161) << " ".length() ^ 6 ^ 59 ^ -" ".length())) < " ".length() << (" ".length() << " ".length()));

      return null;
   }

   public void onDisable() {
      mc.field_71428_T.field_194149_e = 50.0F;
   }

   private static void lIlIlllIIllIII() {
      lIIIlIIIIIlII = new int[2];
      lIIIlIIIIIlII[0] = (202 ^ 195) << (" ".length() << " ".length()) & ~((19 ^ 26) << (" ".length() << " ".length()));
      lIIIlIIIIIlII[1] = " ".length();
   }

   static {
      lIlIlllIIllIII();
      lIlIlllIIlIlll();
   }

   private static boolean lIlIlllIIllIIl(int var0, int var1) {
      return var0 < var1;
   }

   public void onUpdate() {
      mc.field_71428_T.field_194149_e = 50.0F / (Float)lllllllllllllllIIlllIllIlIIIIlII.speed.getValue();
   }

   public Timer() {
      lllllllllllllllIIlllIllIlIIIlIII.speed = lllllllllllllllIIlllIllIlIIIlIII.register(Settings.floatBuilder(lIIIlIIIIIIll[lIIIlIIIIIlII[0]]).withMinimum(0.0F).withMaximum(10.0F).withValue((Number)2.0F));
   }
}
