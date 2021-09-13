package rr.snowhack.snow.module.modules.client;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "GUIColor",
   category = Module.Category.CLIENT
)
public class GUIColor extends Module {
   // $FF: synthetic field
   private static final String[] lIIIIIlIIlllI;
   // $FF: synthetic field
   private static final int[] lIIIIIlIIllll;
   // $FF: synthetic field
   private Setting<Integer> blue;
   // $FF: synthetic field
   private Setting<Boolean> rainbow;
   // $FF: synthetic field
   private static GUIColor INSTANCE;
   // $FF: synthetic field
   private Setting<Integer> green;
   // $FF: synthetic field
   private Setting<Integer> red;
   // $FF: synthetic field
   private Setting<Boolean> reset;

   public void onRender() {
      if ((!lIlIlIIlIIIIII(ModuleManager.getModuleByName(lIIIIIlIIlllI[lIIIIIlIIllll[9]]).isDisabled()) || lIlIlIIlIIIIII((Boolean)CleanGUI.gui.getValue())) && lIlIlIIIllllll(mc.field_71462_r instanceof DisplayGuiScreen)) {
         ScaledResolution lllllllllllllllIlIIIIllllIlIllIl = new ScaledResolution(mc);
         drawRect(0.0F, 0.0F, (float)lllllllllllllllIlIIIIllllIlIllIl.func_78326_a(), (float)lllllllllllllllIlIIIIllllIlIllIl.func_78328_b(), 0.0F, 0.0F, 0.0F, 0.4F);
      }

   }

   private static boolean lIlIlIIlIIIIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIlIIlIIIIII(int var0) {
      return var0 == 0;
   }

   public static int getBlue() {
      return (Integer)INSTANCE.blue.getValue();
   }

   public GUIColor() {
      lllllllllllllllIlIIIIllllIllIIll.red = lllllllllllllllIlIIIIllllIllIIll.register(Settings.integerBuilder(lIIIIIlIIlllI[lIIIIIlIIllll[0]]).withMinimum(lIIIIIlIIllll[1]).withMaximum(lIIIIIlIIllll[2]).withValue((Number)lIIIIIlIIllll[3]));
      lllllllllllllllIlIIIIllllIllIIll.green = lllllllllllllllIlIIIIllllIllIIll.register(Settings.integerBuilder(lIIIIIlIIlllI[lIIIIIlIIllll[1]]).withMinimum(lIIIIIlIIllll[1]).withMaximum(lIIIIIlIIllll[2]).withValue((Number)lIIIIIlIIllll[4]));
      lllllllllllllllIlIIIIllllIllIIll.blue = lllllllllllllllIlIIIIllllIllIIll.register(Settings.integerBuilder(lIIIIIlIIlllI[lIIIIIlIIllll[5]]).withMinimum(lIIIIIlIIllll[1]).withMaximum(lIIIIIlIIllll[2]).withValue((Number)lIIIIIlIIllll[6]));
      lllllllllllllllIlIIIIllllIllIIll.rainbow = lllllllllllllllIlIIIIllllIllIIll.register(Settings.b(lIIIIIlIIlllI[lIIIIIlIIllll[7]], (boolean)lIIIIIlIIllll[0]));
      lllllllllllllllIlIIIIllllIllIIll.reset = lllllllllllllllIlIIIIllllIllIIll.register(Settings.b(lIIIIIlIIlllI[lIIIIIlIIllll[8]], (boolean)lIIIIIlIIllll[0]));
      INSTANCE = lllllllllllllllIlIIIIllllIllIIll;
   }

   public static boolean shouldRainbow() {
      int var10000;
      if (lIlIlIIIllllll(INSTANCE.isEnabled()) && lIlIlIIIllllll((Boolean)INSTANCE.rainbow.getValue())) {
         var10000 = lIIIIIlIIllll[1];
         "".length();
         if ((178 ^ 183) <= 0) {
            return (boolean)((99 ^ 110) & ~(182 ^ 187));
         }
      } else {
         var10000 = lIIIIIlIIllll[0];
      }

      return (boolean)var10000;
   }

   private static int lIlIlIIlIIIIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static int getRed() {
      return (Integer)INSTANCE.red.getValue();
   }

   public void onDisable() {
      lllllllllllllllIlIIIIllllIlIlIIl.enable();
   }

   private static void lIlIlIIIlllllI() {
      lIIIIIlIIllll = new int[18];
      lIIIIIlIIllll[0] = (102 ^ 99) & ~(156 ^ 153);
      lIIIIIlIIllll[1] = " ".length();
      lIIIIIlIIllll[2] = 88 + 76 - 68 + 39 + ((102 ^ 99) << (" ".length() << (" ".length() << " ".length()))) - ((19 ^ 24) << (" ".length() << " ".length())) + ((163 ^ 182) << (" ".length() << " ".length()));
      lIIIIIlIIllll[3] = (" ".length() ^ (23 ^ 30) << " ".length()) << (" ".length() << " ".length());
      lIIIIIlIIllll[4] = 21 + 127 - 3 + 8;
      lIIIIIlIIllll[5] = " ".length() << " ".length();
      lIIIIIlIIllll[6] = (124 ^ 37) + ((116 ^ 97) << " ".length()) - ((23 ^ 16) << " ".length()) + ((28 ^ 27) << (" ".length() << (" ".length() << " ".length())));
      lIIIIIlIIllll[7] = "   ".length();
      lIIIIIlIIllll[8] = " ".length() << (" ".length() << " ".length());
      lIIIIIlIIllll[9] = 138 ^ 143;
      lIIIIIlIIllll[10] = 852 + 994 - 1208 + 883 << " ".length();
      lIIIIIlIIllll[11] = 1115 + 111 - 679 + 634 + ((122 ^ 25) << "   ".length()) - (164 + 78 - 24 + 41 << " ".length()) + (856 + 468 - 1047 + 772 << " ".length());
      lIIIIIlIIllll[12] = 92 + 84 - 55 + 264 << " ".length();
      lIIIIIlIIllll[13] = 515 + 59 - 351 + 548;
      lIIIIIlIIllll[14] = (197 ^ 156) << (178 ^ 183);
      lIIIIIlIIllll[15] = (35 ^ 22) << " ".length() ^ 96 ^ 13;
      lIIIIIlIIllll[16] = "   ".length() << " ".length();
      lIIIIIlIIllll[17] = " ".length() << "   ".length();
   }

   private static boolean lIlIlIIlIIIIlI(int var0) {
      return var0 < 0;
   }

   static {
      lIlIlIIIlllllI();
      lIlIlIIIllllIl();
      INSTANCE = new GUIColor();
   }

   public static void drawRect(float lllllllllllllllIlIIIIllllIIlllII, float lllllllllllllllIlIIIIllllIIlIIll, float lllllllllllllllIlIIIIllllIIlIIlI, float lllllllllllllllIlIIIIllllIIllIIl, float lllllllllllllllIlIIIIllllIIllIII, float lllllllllllllllIlIIIIllllIIIllll, float lllllllllllllllIlIIIIllllIIIlllI, float lllllllllllllllIlIIIIllllIIlIlIl) {
      float lllllllllllllllIlIIIIllllIIIllII;
      if (lIlIlIIlIIIIlI(lIlIlIIlIIIIIl(lllllllllllllllIlIIIIllllIIlllII, lllllllllllllllIlIIIIllllIIlIIlI))) {
         lllllllllllllllIlIIIIllllIIIllII = lllllllllllllllIlIIIIllllIIlllII;
         lllllllllllllllIlIIIIllllIIlllII = lllllllllllllllIlIIIIllllIIlIIlI;
         lllllllllllllllIlIIIIllllIIlIIlI = lllllllllllllllIlIIIIllllIIIllII;
      }

      if (lIlIlIIlIIIIlI(lIlIlIIlIIIIIl(lllllllllllllllIlIIIIllllIIlIIll, lllllllllllllllIlIIIIllllIIllIIl))) {
         lllllllllllllllIlIIIIllllIIIllII = lllllllllllllllIlIIIIllllIIlIIll;
         lllllllllllllllIlIIIIllllIIlIIll = lllllllllllllllIlIIIIllllIIllIIl;
         lllllllllllllllIlIIIIllllIIllIIl = lllllllllllllllIlIIIIllllIIIllII;
      }

      GL11.glEnable(lIIIIIlIIllll[10]);
      GL11.glDisable(lIIIIIlIIllll[11]);
      GL11.glBlendFunc(lIIIIIlIIllll[12], lIIIIIlIIllll[13]);
      GL11.glEnable(lIIIIIlIIllll[14]);
      GL11.glPushMatrix();
      GL11.glColor4f(lllllllllllllllIlIIIIllllIIllIII, lllllllllllllllIlIIIIllllIIIllll, lllllllllllllllIlIIIIllllIIIlllI, lllllllllllllllIlIIIIllllIIlIlIl);
      GL11.glBegin(lIIIIIlIIllll[15]);
      GL11.glVertex2d((double)lllllllllllllllIlIIIIllllIIlllII, (double)lllllllllllllllIlIIIIllllIIllIIl);
      GL11.glVertex2d((double)lllllllllllllllIlIIIIllllIIlIIlI, (double)lllllllllllllllIlIIIIllllIIllIIl);
      GL11.glVertex2d((double)lllllllllllllllIlIIIIllllIIlIIlI, (double)lllllllllllllllIlIIIIllllIIlIIll);
      GL11.glVertex2d((double)lllllllllllllllIlIIIIllllIIlllII, (double)lllllllllllllllIlIIIIllllIIlIIll);
      GL11.glEnd();
      GL11.glPopMatrix();
      GL11.glEnable(lIIIIIlIIllll[11]);
      GL11.glDisable(lIIIIIlIIllll[14]);
   }

   private static String lIlIlIIIlllIlI(String lllllllllllllllIlIIIIlllIllIllll, String lllllllllllllllIlIIIIlllIllIlllI) {
      lllllllllllllllIlIIIIlllIllIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlllIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIlIIIIlllIllIllIl = new StringBuilder();
      char[] lllllllllllllllIlIIIIlllIlllIIIl = lllllllllllllllIlIIIIlllIllIlllI.toCharArray();
      int lllllllllllllllIlIIIIlllIlllIIII = lIIIIIlIIllll[0];
      Exception lllllllllllllllIlIIIIlllIllIlIlI = lllllllllllllllIlIIIIlllIllIllll.toCharArray();
      Exception lllllllllllllllIlIIIIlllIllIlIIl = lllllllllllllllIlIIIIlllIllIlIlI.length;
      int lllllllllllllllIlIIIIlllIllIlIII = lIIIIIlIIllll[0];

      do {
         if (!lIlIlIIlIIIIll(lllllllllllllllIlIIIIlllIllIlIII, lllllllllllllllIlIIIIlllIllIlIIl)) {
            return String.valueOf(lllllllllllllllIlIIIIlllIllIllIl);
         }

         byte lllllllllllllllIlIIIIlllIllIIlll = lllllllllllllllIlIIIIlllIllIlIlI[lllllllllllllllIlIIIIlllIllIlIII];
         lllllllllllllllIlIIIIlllIllIllIl.append((char)(lllllllllllllllIlIIIIlllIllIIlll ^ lllllllllllllllIlIIIIlllIlllIIIl[lllllllllllllllIlIIIIlllIlllIIII % lllllllllllllllIlIIIIlllIlllIIIl.length]));
         "".length();
         ++lllllllllllllllIlIIIIlllIlllIIII;
         ++lllllllllllllllIlIIIIlllIllIlIII;
         "".length();
      } while(((125 ^ 48) & ~(116 ^ 57)) >= 0);

      return null;
   }

   private static String lIlIlIIIllllII(String lllllllllllllllIlIIIIlllIlIlllIl, String lllllllllllllllIlIIIIlllIlIllllI) {
      try {
         String lllllllllllllllIlIIIIlllIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlllIlIllllI.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIllll[17]), "DES");
         Cipher lllllllllllllllIlIIIIlllIllIIIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIIIIlllIllIIIIl.init(lIIIIIlIIllll[5], lllllllllllllllIlIIIIlllIlIllIll);
         return new String(lllllllllllllllIlIIIIlllIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlllIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static int getGreen() {
      return (Integer)INSTANCE.green.getValue();
   }

   private static String lIlIlIIIlllIll(String lllllllllllllllIlIIIIllllIIIIlII, String lllllllllllllllIlIIIIllllIIIIIIl) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIllllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIIIllllIIIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIllllIIIIllI.init(lIIIIIlIIllll[5], lllllllllllllllIlIIIIllllIIIIlll);
         return new String(lllllllllllllllIlIIIIllllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      if (lIlIlIIIllllll((Boolean)lllllllllllllllIlIIIIllllIllIIII.reset.getValue())) {
         lllllllllllllllIlIIIIllllIllIIII.red.setValue(lIIIIIlIIllll[3]);
         "".length();
         lllllllllllllllIlIIIIllllIllIIII.green.setValue(lIIIIIlIIllll[4]);
         "".length();
         lllllllllllllllIlIIIIllllIllIIII.blue.setValue(lIIIIIlIIllll[6]);
         "".length();
         lllllllllllllllIlIIIIllllIllIIII.rainbow.setValue(Boolean.valueOf((boolean)lIIIIIlIIllll[0]));
         "".length();
         lllllllllllllllIlIIIIllllIllIIII.reset.setValue(Boolean.valueOf((boolean)lIIIIIlIIllll[0]));
         "".length();
      }

   }

   private static void lIlIlIIIllllIl() {
      lIIIIIlIIlllI = new String[lIIIIIlIIllll[16]];
      lIIIIIlIIlllI[lIIIIIlIIllll[0]] = lIlIlIIIlllIlI("IhQq", "pqNfJ");
      lIIIIIlIIlllI[lIIIIIlIIllll[1]] = lIlIlIIIlllIll("CL8BgfZefLU=", "RFsLK");
      lIIIIIlIIlllI[lIIIIIlIIllll[5]] = lIlIlIIIlllIll("NcHtmG8T39k=", "bsHbt");
      lIIIIIlIIlllI[lIIIIIlIIllll[7]] = lIlIlIIIllllII("9aY5Z7RyNz8=", "izlUX");
      lIIIIIlIIlllI[lIIIIIlIIllll[8]] = lIlIlIIIlllIlI("FAo2OAU8Gw==", "PoPYp");
      lIIIIIlIIlllI[lIIIIIlIIllll[9]] = lIlIlIIIllllII("P358kEQUAxuH4s2NLHPiBg==", "razLc");
   }

   private static boolean lIlIlIIIllllll(int var0) {
      return var0 != 0;
   }
}
