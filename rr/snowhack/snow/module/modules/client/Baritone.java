package rr.snowhack.snow.module.modules.client;

import baritone.api.BaritoneAPI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Baritone",
   category = Module.Category.CLIENT
)
public class Baritone extends Module {
   // $FF: synthetic field
   public Setting<Boolean> rendergoal;
   // $FF: synthetic field
   public Setting<Boolean> enterportal;
   // $FF: synthetic field
   public Setting<Boolean> miningdown;
   // $FF: synthetic field
   public Setting<Boolean> allowpackourplace;
   // $FF: synthetic field
   public Setting<Boolean> step;
   // $FF: synthetic field
   public Setting<Boolean> allowwalkingwater;
   // $FF: synthetic field
   public Setting<Boolean> allowplace;
   // $FF: synthetic field
   public Setting<Boolean> renderpath;
   // $FF: synthetic field
   private static final int[] llllllIlIllI;
   // $FF: synthetic field
   public Setting<Boolean> allowwalkinglava;
   // $FF: synthetic field
   public Setting<Boolean> jumpat256;
   // $FF: synthetic field
   public Setting<Boolean> freelook;
   // $FF: synthetic field
   public Setting<Boolean> allowbreak;
   // $FF: synthetic field
   public Setting<Boolean> allowwaterbucket;
   // $FF: synthetic field
   public Setting<Boolean> allowsprint;
   // $FF: synthetic field
   private static final String[] llllllIlIlII;
   // $FF: synthetic field
   public Setting<Boolean> backfill;
   // $FF: synthetic field
   public Setting<Boolean> safewalk;
   // $FF: synthetic field
   public Setting<Boolean> allowparkour;

   static {
      lIlIIlIlIIlIIl();
      lIlIIlIlIIIlIl();
   }

   private static void lIlIIlIlIIlIIl() {
      llllllIlIllI = new int[18];
      llllllIlIllI[0] = (23 ^ 28) << (" ".length() << " ".length()) & ~((2 ^ 9) << (" ".length() << " ".length()));
      llllllIlIllI[1] = " ".length();
      llllllIlIllI[2] = " ".length() << " ".length();
      llllllIlIllI[3] = "   ".length();
      llllllIlIllI[4] = " ".length() << (" ".length() << " ".length());
      llllllIlIllI[5] = (8 ^ 63) << " ".length() ^ 212 ^ 191;
      llllllIlIllI[6] = "   ".length() << " ".length();
      llllllIlIllI[7] = 140 ^ 139;
      llllllIlIllI[8] = " ".length() << "   ".length();
      llllllIlIllI[9] = (52 ^ 125) << " ".length() ^ 147 + 133 - 226 + 101;
      llllllIlIllI[10] = ((162 ^ 187) << (" ".length() << " ".length()) ^ 44 ^ 77) << " ".length();
      llllllIlIllI[11] = (37 ^ 52) << " ".length() ^ 55 ^ 30;
      llllllIlIllI[12] = "   ".length() << (" ".length() << " ".length());
      llllllIlIllI[13] = 109 ^ 96;
      llllllIlIllI[14] = ((35 ^ 52) << " ".length() ^ 0 ^ 41) << " ".length();
      llllllIlIllI[15] = (128 ^ 139) << "   ".length() ^ 86 ^ 1;
      llllllIlIllI[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllllIlIllI[17] = 81 ^ 64;
   }

   private static void lIlIIlIlIIIlIl() {
      llllllIlIlII = new String[llllllIlIllI[17]];
      llllllIlIlII[llllllIlIllI[0]] = lIlIIlIIllllll("OAcwAiE=", "zuUcJ");
      llllllIlIlII[llllllIlIllI[1]] = lIlIIlIlIIIIII("Ob6PpJ73vPQ=", "eMrjp");
      llllllIlIlII[llllllIlIllI[2]] = lIlIIlIlIIIIII("ictwXk0QiDc=", "BLujs");
      llllllIlIlII[llllllIlIllI[3]] = lIlIIlIlIIIIll("HxuF76So/AKNl0W8PRjlDQ==", "sbUwW");
      llllllIlIlII[llllllIlIllI[4]] = lIlIIlIlIIIIII("KU5pOrDFyTFOwlN+tsxtJHGv308BT6t8", "tweZK");
      llllllIlIlII[llllllIlIllI[5]] = lIlIIlIIllllll("Mw4WHjwKCFoaO0QjGwM0", "dozuU");
      llllllIlIlII[llllllIlIllI[6]] = lIlIIlIlIIIIII("/fZsBPPkq5E=", "eLkSF");
      llllllIlIlII[llllllIlIllI[7]] = lIlIIlIlIIIIll("rfgxpHeWSLKck9Aaev8oyQ==", "oBAFm");
      llllllIlIlII[llllllIlIllI[8]] = lIlIIlIlIIIIII("3dluTs6d56w8ZxUqVkIHBA==", "zZfyr");
      llllllIlIlII[llllllIlIllI[9]] = lIlIIlIlIIIIll("Utl6JoyQxIYqHtPn4NdVZQ==", "CMkbS");
      llllllIlIlII[llllllIlIllI[10]] = lIlIIlIlIIIIII("c8NX06/4xfU=", "OqAVN");
      llllllIlIlII[llllllIlIllI[11]] = lIlIIlIIllllll("HQsZISA4GFoaIywJHw==", "MjzJO");
      llllllIlIlII[llllllIlIllI[12]] = lIlIIlIlIIIIII("tB3UZOElkGPLizPA6RJhfA==", "HCyjc");
      llllllIlIlII[llllllIlIllI[13]] = lIlIIlIlIIIIll("yR7uV7BVQhqeW/hLYO3U0ypBvfXHMXpV", "psEDx");
      llllllIlIlII[llllllIlIllI[14]] = lIlIIlIlIIIIII("iE1vvMljmWwP/z9nWiwLRg==", "nubqT");
      llllllIlIlII[llllllIlIllI[15]] = lIlIIlIIllllll("Iy4aES8DazMaKx0=", "qKtuJ");
      llllllIlIlII[llllllIlIllI[16]] = lIlIIlIlIIIIll("i9Qd9C/v4/5NvFIQMItTKQ==", "IszMq");
   }

   public Baritone() {
      lllllllllllllllIlIIlIllIllIIIllI.allowbreak = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[0]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.allowsprint = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[1]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.allowplace = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[2]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.allowwaterbucket = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[3]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.allowwalkingwater = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[4]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.allowwalkinglava = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[5]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.step = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[6]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.safewalk = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[7]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.jumpat256 = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[8]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.miningdown = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[9]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.allowparkour = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[10]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.allowpackourplace = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[11]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.enterportal = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[12]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.backfill = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[13]], (boolean)llllllIlIllI[0]));
      lllllllllllllllIlIIlIllIllIIIllI.renderpath = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[14]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.rendergoal = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[15]], (boolean)llllllIlIllI[1]));
      lllllllllllllllIlIIlIllIllIIIllI.freelook = lllllllllllllllIlIIlIllIllIIIllI.register(Settings.b(llllllIlIlII[llllllIlIllI[16]], (boolean)llllllIlIllI[1]));
   }

   private static boolean lIlIIlIlIIlIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIIlIIllllll(String lllllllllllllllIlIIlIllIlIlIllll, String lllllllllllllllIlIIlIllIlIllIIll) {
      lllllllllllllllIlIIlIllIlIlIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIlIllIlIllIIlI = new StringBuilder();
      short lllllllllllllllIlIIlIllIlIlIllII = lllllllllllllllIlIIlIllIlIllIIll.toCharArray();
      short lllllllllllllllIlIIlIllIlIlIlIll = llllllIlIllI[0];
      float lllllllllllllllIlIIlIllIlIlIlIlI = lllllllllllllllIlIIlIllIlIlIllll.toCharArray();
      int lllllllllllllllIlIIlIllIlIlIlIIl = lllllllllllllllIlIIlIllIlIlIlIlI.length;
      int lllllllllllllllIlIIlIllIlIlIlIII = llllllIlIllI[0];

      do {
         if (!lIlIIlIlIIlIlI(lllllllllllllllIlIIlIllIlIlIlIII, lllllllllllllllIlIIlIllIlIlIlIIl)) {
            return String.valueOf(lllllllllllllllIlIIlIllIlIllIIlI);
         }

         char lllllllllllllllIlIIlIllIlIllIlIl = lllllllllllllllIlIIlIllIlIlIlIlI[lllllllllllllllIlIIlIllIlIlIlIII];
         lllllllllllllllIlIIlIllIlIllIIlI.append((char)(lllllllllllllllIlIIlIllIlIllIlIl ^ lllllllllllllllIlIIlIllIlIlIllII[lllllllllllllllIlIIlIllIlIlIlIll % lllllllllllllllIlIIlIllIlIlIllII.length]));
         "".length();
         ++lllllllllllllllIlIIlIllIlIlIlIll;
         ++lllllllllllllllIlIIlIllIlIlIlIII;
         "".length();
      } while(null == null);

      return null;
   }

   private static String lIlIIlIlIIIIll(String lllllllllllllllIlIIlIllIlIIlIIlI, String lllllllllllllllIlIIlIllIlIIIllll) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIllIlIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIlIllIlIIlIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIllIlIIlIlII.init(llllllIlIllI[2], lllllllllllllllIlIIlIllIlIIlIlIl);
         return new String(lllllllllllllllIlIIlIllIlIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIlIlIIIIII(String lllllllllllllllIlIIlIllIlIIlllll, String lllllllllllllllIlIIlIllIlIIllllI) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIllIlIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIIllllI.getBytes(StandardCharsets.UTF_8)), llllllIlIllI[8]), "DES");
         float lllllllllllllllIlIIlIllIlIIllIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIllIlIIllIlI.init(llllllIlIllI[2], lllllllllllllllIlIIlIllIlIlIIIlI);
         return new String(lllllllllllllllIlIIlIllIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      BaritoneAPI.getSettings().allowBreak.value = lllllllllllllllIlIIlIllIllIIIIll.allowbreak.getValue();
      BaritoneAPI.getSettings().allowSprint.value = lllllllllllllllIlIIlIllIllIIIIll.allowsprint.getValue();
      BaritoneAPI.getSettings().allowPlace.value = lllllllllllllllIlIIlIllIllIIIIll.allowplace.getValue();
      BaritoneAPI.getSettings().allowWaterBucketFall.value = lllllllllllllllIlIIlIllIllIIIIll.allowwaterbucket.getValue();
      BaritoneAPI.getSettings().assumeWalkOnWater.value = lllllllllllllllIlIIlIllIllIIIIll.allowwalkingwater.getValue();
      BaritoneAPI.getSettings().assumeWalkOnLava.value = lllllllllllllllIlIIlIllIllIIIIll.allowwalkinglava.getValue();
      BaritoneAPI.getSettings().assumeStep.value = lllllllllllllllIlIIlIllIllIIIIll.step.getValue();
      BaritoneAPI.getSettings().assumeSafeWalk.value = lllllllllllllllIlIIlIllIllIIIIll.safewalk.getValue();
      BaritoneAPI.getSettings().allowJumpAt256.value = lllllllllllllllIlIIlIllIllIIIIll.jumpat256.getValue();
      BaritoneAPI.getSettings().allowDownward.value = lllllllllllllllIlIIlIllIllIIIIll.miningdown.getValue();
      BaritoneAPI.getSettings().allowParkour.value = lllllllllllllllIlIIlIllIllIIIIll.allowparkour.getValue();
      BaritoneAPI.getSettings().allowParkourPlace.value = lllllllllllllllIlIIlIllIllIIIIll.allowpackourplace.getValue();
      BaritoneAPI.getSettings().enterPortal.value = lllllllllllllllIlIIlIllIllIIIIll.enterportal.getValue();
      BaritoneAPI.getSettings().backfill.value = lllllllllllllllIlIIlIllIllIIIIll.backfill.getValue();
      BaritoneAPI.getSettings().renderPath.value = lllllllllllllllIlIIlIllIllIIIIll.renderpath.getValue();
      BaritoneAPI.getSettings().renderGoal.value = lllllllllllllllIlIIlIllIllIIIIll.rendergoal.getValue();
      BaritoneAPI.getSettings().freeLook.value = lllllllllllllllIlIIlIllIllIIIIll.freelook.getValue();
   }

   public void onDisable() {
      lllllllllllllllIlIIlIllIllIIIIII.enable();
   }
}
