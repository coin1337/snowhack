package rr.snowhack.snow.module.modules.render;

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
   name = "AntiFog",
   description = "Disables or reduces fog",
   category = Module.Category.RENDER
)
public class AntiFog extends Module {
   // $FF: synthetic field
   private static final int[] lIIIlIlllIIIl;
   // $FF: synthetic field
   private static AntiFog INSTANCE;
   // $FF: synthetic field
   public static Setting<AntiFog.VisionMode> mode;
   // $FF: synthetic field
   private static final String[] lIIIlIlllIIII;

   private static boolean lIllIIlIlIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIllIIlIlIIIIl() {
      lIIIlIlllIIIl = new int[4];
      lIIIlIlllIIIl[0] = (4 ^ 69 ^ (191 ^ 156) << " ".length()) & (5 ^ 104 ^ (142 ^ 187) << " ".length() ^ -" ".length());
      lIIIlIlllIIIl[1] = " ".length();
      lIIIlIlllIIIl[2] = " ".length() << " ".length();
      lIIIlIlllIIIl[3] = "   ".length();
   }

   public String getHudInfo() {
      return mode.getValueAsString().replaceAll(lIIIlIlllIIII[lIIIlIlllIIIl[0]], lIIIlIlllIIII[lIIIlIlllIIIl[1]]);
   }

   public static boolean enabled() {
      return INSTANCE.isEnabled();
   }

   public AntiFog() {
      INSTANCE = lllllllllllllllIIllIIllllllllIlI;
      lllllllllllllllIIllIIllllllllIlI.register(mode);
      "".length();
   }

   private static void lIllIIlIlIIIII() {
      lIIIlIlllIIII = new String[lIIIlIlllIIIl[3]];
      lIIIlIlllIIII[lIIIlIlllIIIl[0]] = lIllIIlIIllllI("dg==", "TmmZS");
      lIIIlIlllIIII[lIIIlIlllIIIl[1]] = lIllIIlIIlllll("7WTu9SHV01Q=", "OwcPF");
      lIIIlIlllIIII[lIIIlIlllIIIl[2]] = lIllIIlIIllllI("OiYLIg==", "wIoGG");
   }

   static {
      lIllIIlIlIIIIl();
      lIllIIlIlIIIII();
      mode = Settings.e(lIIIlIlllIIII[lIIIlIlllIIIl[2]], AntiFog.VisionMode.Air);
      INSTANCE = new AntiFog();
   }

   private static String lIllIIlIIllllI(String lllllllllllllllIIllIIlllllIllIll, String lllllllllllllllIIllIIlllllIllIlI) {
      lllllllllllllllIIllIIlllllIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lllllllllllllllIIllIIlllllIllIIl = new StringBuilder();
      char[] lllllllllllllllIIllIIlllllIlllIl = lllllllllllllllIIllIIlllllIllIlI.toCharArray();
      int lllllllllllllllIIllIIlllllIlllII = lIIIlIlllIIIl[0];
      char lllllllllllllllIIllIIlllllIlIllI = lllllllllllllllIIllIIlllllIllIll.toCharArray();
      float lllllllllllllllIIllIIlllllIlIlIl = lllllllllllllllIIllIIlllllIlIllI.length;
      int lllllllllllllllIIllIIlllllIlIlII = lIIIlIlllIIIl[0];

      do {
         if (!lIllIIlIlIIIlI(lllllllllllllllIIllIIlllllIlIlII, lllllllllllllllIIllIIlllllIlIlIl)) {
            return String.valueOf(lllllllllllllllIIllIIlllllIllIIl);
         }

         char lllllllllllllllIIllIIllllllIIIIl = lllllllllllllllIIllIIlllllIlIllI[lllllllllllllllIIllIIlllllIlIlII];
         lllllllllllllllIIllIIlllllIllIIl.append((char)(lllllllllllllllIIllIIllllllIIIIl ^ lllllllllllllllIIllIIlllllIlllIl[lllllllllllllllIIllIIlllllIlllII % lllllllllllllllIIllIIlllllIlllIl.length]));
         "".length();
         ++lllllllllllllllIIllIIlllllIlllII;
         ++lllllllllllllllIIllIIlllllIlIlII;
         "".length();
      } while("   ".length() != 0);

      return null;
   }

   private static String lIllIIlIIlllll(String lllllllllllllllIIllIIlllllllIIII, String lllllllllllllllIIllIIllllllIllIl) {
      try {
         float lllllllllllllllIIllIIllllllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIIllIIllllllIlIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIIllllllIlIll.init(lIIIlIlllIIIl[2], lllllllllllllllIIllIIllllllIllII);
         return new String(lllllllllllllllIIllIIllllllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static enum VisionMode {
      // $FF: synthetic field
      NoFog;

      // $FF: synthetic field
      private static final int[] llllIlIIllII;
      // $FF: synthetic field
      private static final String[] llllIlIIlIlI;
      // $FF: synthetic field
      Air;

      private static String lIIlllllllIlIl(String lllllllllllllllIlIlIlIIlIIIIIllI, String lllllllllllllllIlIlIlIIlIIIIIlIl) {
         try {
            SecretKeySpec lllllllllllllllIlIlIlIIlIIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), llllIlIIllII[3]), "DES");
            Cipher lllllllllllllllIlIlIlIIlIIIIllII = Cipher.getInstance("DES");
            lllllllllllllllIlIlIlIIlIIIIllII.init(llllIlIIllII[2], lllllllllllllllIlIlIlIIlIIIIlllI);
            return new String(lllllllllllllllIlIlIlIIlIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIIlllllllIllI(String lllllllllllllllIlIlIlIIIlllIlIIl, String lllllllllllllllIlIlIlIIIllllIIII) {
         lllllllllllllllIlIlIlIIIlllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIlIlIIIlllIlllI = new StringBuilder();
         char lllllllllllllllIlIlIlIIIlllIIlII = lllllllllllllllIlIlIlIIIllllIIII.toCharArray();
         long lllllllllllllllIlIlIlIIIlllIIIll = llllIlIIllII[0];
         byte lllllllllllllllIlIlIlIIIlllIIIlI = lllllllllllllllIlIlIlIIIlllIlIIl.toCharArray();
         Exception lllllllllllllllIlIlIlIIIlllIIIIl = lllllllllllllllIlIlIlIIIlllIIIlI.length;
         int lllllllllllllllIlIlIlIIIllIlllll = llllIlIIllII[0];

         do {
            if (!lIIllllllllllI(lllllllllllllllIlIlIlIIIllIlllll, lllllllllllllllIlIlIlIIIlllIIIIl)) {
               return String.valueOf(lllllllllllllllIlIlIlIIIlllIlllI);
            }

            Exception lllllllllllllllIlIlIlIIIllIlllIl = lllllllllllllllIlIlIlIIIlllIIIlI[lllllllllllllllIlIlIlIIIllIlllll];
            lllllllllllllllIlIlIlIIIlllIlllI.append((char)(lllllllllllllllIlIlIlIIIllIlllIl ^ lllllllllllllllIlIlIlIIIlllIIlII[lllllllllllllllIlIlIlIIIlllIIIll % lllllllllllllllIlIlIlIIIlllIIlII.length]));
            "".length();
            ++lllllllllllllllIlIlIlIIIlllIIIll;
            ++lllllllllllllllIlIlIlIIIllIlllll;
            "".length();
         } while((189 ^ 184) > 0);

         return null;
      }

      private static void lIIlllllllIlll() {
         llllIlIIlIlI = new String[llllIlIIllII[2]];
         llllIlIIlIlI[llllIlIIllII[0]] = lIIlllllllIlIl("9rVRdAHXtNw=", "VqFuZ");
         llllIlIIlIlI[llllIlIIllII[1]] = lIIlllllllIllI("GBAU", "YyfWW");
      }

      private static void lIIlllllllllIl() {
         llllIlIIllII = new int[4];
         llllIlIIllII[0] = (32 ^ 61) << " ".length() & ~((187 ^ 166) << " ".length());
         llllIlIIllII[1] = " ".length();
         llllIlIIllII[2] = " ".length() << " ".length();
         llllIlIIllII[3] = " ".length() << "   ".length();
      }

      private static boolean lIIllllllllllI(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIIlllllllllIl();
         lIIlllllllIlll();
         NoFog = new AntiFog.VisionMode(llllIlIIlIlI[llllIlIIllII[0]], llllIlIIllII[0]);
         Air = new AntiFog.VisionMode(llllIlIIlIlI[llllIlIIllII[1]], llllIlIIllII[1]);
         AntiFog.VisionMode[] var10000 = new AntiFog.VisionMode[llllIlIIllII[2]];
         var10000[llllIlIIllII[0]] = NoFog;
         var10000[llllIlIIllII[1]] = Air;
      }
   }
}
