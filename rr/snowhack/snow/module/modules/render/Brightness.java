package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Stack;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Brightness",
   description = "Makes everything brighter!",
   category = Module.Category.RENDER
)
public class Brightness extends Module {
   // $FF: synthetic field
   private static final int[] llllIlIIlIll;
   // $FF: synthetic field
   private static boolean inTransition;
   // $FF: synthetic field
   private static final String[] llllIlIIlIII;
   // $FF: synthetic field
   private Setting<Float> seconds;
   // $FF: synthetic field
   private Stack<Float> transitionStack;
   // $FF: synthetic field
   private Setting<Brightness.Transition> mode;
   // $FF: synthetic field
   private Setting<Boolean> transition;
   // $FF: synthetic field
   private static float currentBrightness;

   private static String lIIllllllIllll(String lllllllllllllllIlIlIlIIIlIIIllll, String lllllllllllllllIlIlIlIIIlIIIlllI) {
      try {
         char lllllllllllllllIlIlIlIIIlIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIlIlIlIIIlIIIlIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIlIIIlIIIlIlI.init(llllIlIIlIll[2], lllllllllllllllIlIlIlIIIlIIIlIll);
         return new String(lllllllllllllllIlIlIlIIIlIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIlllllllIlII() {
      llllIlIIlIII = new String[llllIlIIlIll[3]];
      llllIlIIlIII[llllIlIIlIll[0]] = lIIllllllIlllI("AhcmISo/ES4gNw==", "VeGOY");
      llllIlIIlIII[llllIlIIlIll[1]] = lIIllllllIllll("CJ8P1avN8sE=", "qtDIZ");
      llllIlIIlIII[llllIlIIlIll[2]] = lIIllllllIllll("jjHENLerm8c=", "zWUtB");
   }

   private static int lIIllllllllIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static boolean shouldBeActive() {
      int var10000;
      if (lIIlllllllllII(isInTransition()) && !lIIlllllllllII(lIIllllllllIll(currentBrightness, 1.0F))) {
         var10000 = llllIlIIlIll[0];
      } else {
         var10000 = llllIlIIlIll[1];
         "".length();
         if (-"  ".length() >= 0) {
            return (boolean)((46 ^ 15) << " ".length() & ~((99 ^ 66) << " ".length()));
         }
      }

      return (boolean)var10000;
   }

   private float[] linear(int lllllllllllllllIlIlIlIIIllIIlIll, boolean lllllllllllllllIlIlIlIIIllIIlIlI) {
      return lllllllllllllllIlIlIlIIIllIIllII.createTransition(lllllllllllllllIlIlIlIIIllIIlIll, lllllllllllllllIlIlIlIIIllIIlIlI, (lllllllllllllllIlIlIlIIIlIlllIII) -> {
         return lllllllllllllllIlIlIlIIIlIlllIII;
      });
   }

   public static boolean isInTransition() {
      return inTransition;
   }

   private float[] sine(int lllllllllllllllIlIlIlIIIlIlllIll, boolean lllllllllllllllIlIlIlIIIlIlllIlI) {
      return lllllllllllllllIlIlIlIIIlIllllll.createTransition(lllllllllllllllIlIlIlIIIlIlllIll, lllllllllllllllIlIlIlIIIlIlllIlI, lllllllllllllllIlIlIlIIIlIllllll::sine);
   }

   private static boolean lIIlllllllllII(int var0) {
      return var0 == 0;
   }

   private static boolean lIIllllllllIlI(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIIllllllllIII();
      lIIlllllllIlII();
      currentBrightness = 0.0F;
      inTransition = (boolean)llllIlIIlIll[0];
   }

   private void addTransition(boolean lllllllllllllllIlIlIlIIlIIIlIlIl) {
      if (lIIllllllllIIl((Boolean)lllllllllllllllIlIlIlIIlIIIlIllI.transition.getValue())) {
         Exception lllllllllllllllIlIlIlIIlIIIlIIll = (int)((Float)lllllllllllllllIlIlIlIIlIIIlIllI.seconds.getValue() * 20.0F);
         float[] lllllllllllllllIlIlIlIIlIIIlIIIl;
         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$Brightness$Transition[((Brightness.Transition)lllllllllllllllIlIlIlIIlIIIlIllI.mode.getValue()).ordinal()]) {
         case 1:
            lllllllllllllllIlIlIlIIlIIIlIIIl = lllllllllllllllIlIlIlIIlIIIlIllI.linear(lllllllllllllllIlIlIlIIlIIIlIIll, lllllllllllllllIlIlIlIIlIIIlIlIl);
            "".length();
            if (-" ".length() < -" ".length()) {
               return;
            }
            break;
         case 2:
            lllllllllllllllIlIlIlIIlIIIlIIIl = lllllllllllllllIlIlIlIIlIIIlIllI.sine(lllllllllllllllIlIlIlIIlIIIlIIll, lllllllllllllllIlIlIlIIlIIIlIlIl);
            "".length();
            if ("   ".length() == 0) {
               return;
            }
            break;
         default:
            float[] var10000 = new float[llllIlIIlIll[1]];
            var10000[llllIlIIlIll[0]] = 0.0F;
            lllllllllllllllIlIlIlIIlIIIlIIIl = var10000;
         }

         char lllllllllllllllIlIlIlIIlIIIIllll = lllllllllllllllIlIlIlIIlIIIlIIIl;
         boolean lllllllllllllllIlIlIlIIlIIIIlllI = lllllllllllllllIlIlIlIIlIIIlIIIl.length;
         int lllllllllllllllIlIlIlIIlIIIIllIl = llllIlIIlIll[0];

         while(lIIllllllllIlI(lllllllllllllllIlIlIlIIlIIIIllIl, lllllllllllllllIlIlIlIIlIIIIlllI)) {
            float lllllllllllllllIlIlIlIIlIIIllIll = lllllllllllllllIlIlIlIIlIIIIllll[lllllllllllllllIlIlIlIIlIIIIllIl];
            lllllllllllllllIlIlIlIIlIIIlIllI.transitionStack.add(lllllllllllllllIlIlIlIIlIIIllIll);
            "".length();
            ++lllllllllllllllIlIlIlIIlIIIIllIl;
            "".length();
            if ((((172 ^ 139) << " ".length() ^ 3 ^ 66) << (" ".length() << " ".length()) & ((46 + 32 - -28 + 101 ^ "   ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())) == " ".length()) {
               return;
            }
         }

         inTransition = (boolean)llllIlIIlIll[1];
      }

   }

   public static float getCurrentBrightness() {
      return currentBrightness;
   }

   private static boolean lIIllllllllIIl(int var0) {
      return var0 != 0;
   }

   public Brightness() {
      lllllllllllllllIlIlIlIIlIIllIIII.transition = lllllllllllllllIlIlIlIIlIIllIIII.register(Settings.b(llllIlIIlIII[llllIlIIlIll[0]], (boolean)llllIlIIlIll[1]));
      lllllllllllllllIlIlIlIIlIIllIIII.seconds = lllllllllllllllIlIlIlIIlIIllIIII.register(Settings.floatBuilder(llllIlIIlIII[llllIlIIlIll[1]]).withMinimum(0.0F).withMaximum(10.0F).withValue((Number)1.0F).withVisibility((lllllllllllllllIlIlIlIIIlIllIIII) -> {
         return (Boolean)lllllllllllllllIlIlIlIIIlIlIllll.transition.getValue();
      }).build());
      lllllllllllllllIlIlIlIIlIIllIIII.mode = lllllllllllllllIlIlIlIIlIIllIIII.register(Settings.enumBuilder(Brightness.Transition.class).withName(llllIlIIlIII[llllIlIIlIll[2]]).withValue(Brightness.Transition.SINE).withVisibility((lllllllllllllllIlIlIlIIIlIllIlII) -> {
         return (Boolean)lllllllllllllllIlIlIlIIIlIllIIll.transition.getValue();
      }).build());
      lllllllllllllllIlIlIlIIlIIllIIII.transitionStack = new Stack();
   }

   private float sine(float lllllllllllllllIlIlIlIIIllIIIlII) {
      return ((float)Math.sin(3.141592653589793D * (double)lllllllllllllllIlIlIlIIIllIIIlII - 1.5707963267948966D) + 1.0F) / 2.0F;
   }

   public void onUpdate() {
      if (lIIllllllllIIl(inTransition)) {
         if (lIIllllllllIIl(lllllllllllllllIlIlIlIIIlllllIll.transitionStack.isEmpty())) {
            inTransition = (boolean)llllIlIIlIll[0];
            lllllllllllllllIlIlIlIIIlllllIll.setAlwaysListening((boolean)llllIlIIlIll[0]);
            float var10000;
            if (lIIllllllllIIl(lllllllllllllllIlIlIlIIIlllllIll.isEnabled())) {
               var10000 = 1.0F;
               "".length();
               if (" ".length() <= ((146 ^ 177) << " ".length() & ~((51 ^ 16) << " ".length()))) {
                  return;
               }
            } else {
               var10000 = 0.0F;
            }

            currentBrightness = var10000;
            "".length();
            if (-"  ".length() > 0) {
               return;
            }
         } else {
            currentBrightness = (Float)lllllllllllllllIlIlIlIIIlllllIll.transitionStack.pop();
         }
      }

   }

   private float[] createTransition(int lllllllllllllllIlIlIlIIIllIllllI, boolean lllllllllllllllIlIlIlIIIllIlIlll, Function<Float, Float> lllllllllllllllIlIlIlIIIllIlIlIl) {
      float[] lllllllllllllllIlIlIlIIIllIllIlI = new float[lllllllllllllllIlIlIlIIIllIllllI];
      int lllllllllllllllIlIlIlIIIlllIIIlI = llllIlIIlIll[0];

      do {
         if (!lIIllllllllIlI(lllllllllllllllIlIlIlIIIlllIIIlI, lllllllllllllllIlIlIlIIIllIllllI)) {
            return lllllllllllllllIlIlIlIIIllIllIlI;
         }

         float lllllllllllllllIlIlIlIIIlllIIlIl = (Float)lllllllllllllllIlIlIlIIIllIlIlIl.apply((float)lllllllllllllllIlIlIlIIIlllIIIlI / (float)lllllllllllllllIlIlIlIIIllIllllI);
         if (lIIllllllllIIl(lllllllllllllllIlIlIlIIIllIlIlll)) {
            lllllllllllllllIlIlIlIIIlllIIlIl = 1.0F - lllllllllllllllIlIlIlIIIlllIIlIl;
         }

         lllllllllllllllIlIlIlIIIllIllIlI[lllllllllllllllIlIlIlIIIlllIIIlI] = lllllllllllllllIlIlIlIIIlllIIlIl;
         ++lllllllllllllllIlIlIlIIIlllIIIlI;
         "".length();
      } while(" ".length() << " ".length() != " ".length());

      return null;
   }

   protected void onEnable() {
      super.onEnable();
      lllllllllllllllIlIlIlIIlIIIIIIlI.addTransition((boolean)llllIlIIlIll[1]);
   }

   private static void lIIllllllllIII() {
      llllIlIIlIll = new int[4];
      llllIlIIlIll[0] = (241 ^ 174) & ~(113 ^ 46);
      llllIlIIlIll[1] = " ".length();
      llllIlIIlIll[2] = " ".length() << " ".length();
      llllIlIIlIll[3] = "   ".length();
   }

   private static String lIIllllllIlllI(String lllllllllllllllIlIlIlIIIlIIlllll, String lllllllllllllllIlIlIlIIIlIlIIIll) {
      lllllllllllllllIlIlIlIIIlIIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIlIIIlIlIIIlI = new StringBuilder();
      char[] lllllllllllllllIlIlIlIIIlIlIIIIl = lllllllllllllllIlIlIlIIIlIlIIIll.toCharArray();
      short lllllllllllllllIlIlIlIIIlIIllIll = llllIlIIlIll[0];
      long lllllllllllllllIlIlIlIIIlIIllIlI = lllllllllllllllIlIlIlIIIlIIlllll.toCharArray();
      Exception lllllllllllllllIlIlIlIIIlIIllIIl = lllllllllllllllIlIlIlIIIlIIllIlI.length;
      int lllllllllllllllIlIlIlIIIlIIllIII = llllIlIIlIll[0];

      do {
         if (!lIIllllllllIlI(lllllllllllllllIlIlIlIIIlIIllIII, lllllllllllllllIlIlIlIIIlIIllIIl)) {
            return String.valueOf(lllllllllllllllIlIlIlIIIlIlIIIlI);
         }

         byte lllllllllllllllIlIlIlIIIlIIlIlll = lllllllllllllllIlIlIlIIIlIIllIlI[lllllllllllllllIlIlIlIIIlIIllIII];
         lllllllllllllllIlIlIlIIIlIlIIIlI.append((char)(lllllllllllllllIlIlIlIIIlIIlIlll ^ lllllllllllllllIlIlIlIIIlIlIIIIl[lllllllllllllllIlIlIlIIIlIIllIll % lllllllllllllllIlIlIlIIIlIlIIIIl.length]));
         "".length();
         ++lllllllllllllllIlIlIlIIIlIIllIll;
         ++lllllllllllllllIlIlIlIIIlIIllIII;
         "".length();
      } while("   ".length() > ((207 ^ 140) & ~(45 ^ 110)));

      return null;
   }

   protected void onDisable() {
      lllllllllllllllIlIlIlIIIllllllll.setAlwaysListening((boolean)llllIlIIlIll[1]);
      super.onDisable();
      lllllllllllllllIlIlIlIIIllllllll.addTransition((boolean)llllIlIIlIll[0]);
   }

   public static enum Transition {
      // $FF: synthetic field
      SINE;

      // $FF: synthetic field
      private static final String[] llllIllIllIl;
      // $FF: synthetic field
      LINEAR;

      // $FF: synthetic field
      private static final int[] llllIllIllll;

      static {
         lIlIIIIlIIllIl();
         lIlIIIIlIIlIIl();
         LINEAR = new Brightness.Transition(llllIllIllIl[llllIllIllll[0]], llllIllIllll[0]);
         SINE = new Brightness.Transition(llllIllIllIl[llllIllIllll[1]], llllIllIllll[1]);
         Brightness.Transition[] var10000 = new Brightness.Transition[llllIllIllll[2]];
         var10000[llllIllIllll[0]] = LINEAR;
         var10000[llllIllIllll[1]] = SINE;
      }

      private static String lIlIIIIlIIlIII(String lllllllllllllllIlIlIIlIIIllIIIIl, String lllllllllllllllIlIlIIlIIIllIIIII) {
         try {
            boolean lllllllllllllllIlIlIIlIIIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIllIIIII.getBytes(StandardCharsets.UTF_8)), llllIllIllll[3]), "DES");
            Cipher lllllllllllllllIlIlIIlIIIllIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIlIIIllIIIll.init(llllIllIllll[2], lllllllllllllllIlIlIIlIIIlIlllIl);
            return new String(lllllllllllllllIlIlIIlIIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIlIIIIlIIIlll(String lllllllllllllllIlIlIIlIIIllIlllI, String lllllllllllllllIlIlIIlIIIllIllIl) {
         try {
            SecretKeySpec lllllllllllllllIlIlIIlIIIlllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            byte lllllllllllllllIlIlIIlIIIllIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIIIllIlIIl.init(llllIllIllll[2], lllllllllllllllIlIlIIlIIIlllIIIl);
            return new String(lllllllllllllllIlIlIIlIIIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIIIIlIIlIIl() {
         llllIllIllIl = new String[llllIllIllll[2]];
         llllIllIllIl[llllIllIllll[0]] = lIlIIIIlIIIlll("GhtaKG5SBLM=", "UaMcJ");
         llllIllIllIl[llllIllIllll[1]] = lIlIIIIlIIlIII("gR9I5GYmP5o=", "cUhaM");
      }

      private static void lIlIIIIlIIllIl() {
         llllIllIllll = new int[4];
         llllIllIllll[0] = (113 ^ 126) & ~(118 ^ 121);
         llllIllIllll[1] = " ".length();
         llllIllIllll[2] = " ".length() << " ".length();
         llllIllIllll[3] = " ".length() << "   ".length();
      }
   }
}
