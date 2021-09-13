package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.BossInfoClient;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Post;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.Pair;

@Module.Info(
   name = "BossStack",
   description = "Modify the boss health GUI to take up less space",
   category = Module.Category.MISC
)
public class BossStack extends Module {
   // $FF: synthetic field
   private static Setting<BossStack.BossStackMode> mode;
   // $FF: synthetic field
   private static final String[] llllIIIIIlII;
   // $FF: synthetic field
   private static final ResourceLocation GUI_BARS_TEXTURES;
   // $FF: synthetic field
   private static Setting<Double> scale;
   // $FF: synthetic field
   private static final int[] llllIIIIIlIl;

   private static boolean lIIlllIlllllIl(int var0) {
      return var0 != 0;
   }

   public static void render(Post lllllllllllllllIlIlIllllllllIlII) {
      Map lllllllllllllllIlIllIIIIIIIIIlll;
      int lllllllllllllllIlIlIllllllllIlll;
      String lllllllllllllllIlIlIllllllllllll;
      if (lIIlllIllllIll(mode.getValue(), BossStack.BossStackMode.MINIMIZE)) {
         lllllllllllllllIlIllIIIIIIIIIlll = Minecraft.func_71410_x().field_71456_v.func_184046_j().field_184060_g;
         if (lIIlllIlllllII(lllllllllllllllIlIllIIIIIIIIIlll)) {
            return;
         }

         Exception lllllllllllllllIlIlIllllllllIIlI = new ScaledResolution(Minecraft.func_71410_x());
         boolean lllllllllllllllIlIlIllllllllIIIl = lllllllllllllllIlIlIllllllllIIlI.func_78326_a();
         lllllllllllllllIlIlIllllllllIlll = llllIIIIIlIl[3];
         Iterator lllllllllllllllIlIlIlllllllIllll = lllllllllllllllIlIllIIIIIIIIIlll.entrySet().iterator();

         while(lIIlllIlllllIl(lllllllllllllllIlIlIlllllllIllll.hasNext())) {
            Entry<UUID, BossInfoClient> lllllllllllllllIlIlIlllllllIlllI = (Entry)lllllllllllllllIlIlIlllllllIllll.next();
            BossInfoClient lllllllllllllllIlIllIIIIIIIIlIll = (BossInfoClient)lllllllllllllllIlIlIlllllllIlllI.getValue();
            lllllllllllllllIlIlIllllllllllll = lllllllllllllllIlIllIIIIIIIIlIll.func_186744_e().func_150254_d();
            int lllllllllllllllIlIllIIIIIIIIlIIl = (int)((double)lllllllllllllllIlIlIllllllllIIIl / (Double)scale.getValue() / 2.0D - 91.0D);
            GL11.glScaled((Double)scale.getValue(), (Double)scale.getValue(), 1.0D);
            if (lIIlllIllllllI(lllllllllllllllIlIlIllllllllIlII.isCanceled())) {
               GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
               Minecraft.func_71410_x().func_110434_K().func_110577_a(GUI_BARS_TEXTURES);
               Minecraft.func_71410_x().field_71456_v.func_184046_j().func_184052_a(lllllllllllllllIlIllIIIIIIIIlIIl, lllllllllllllllIlIlIllllllllIlll, lllllllllllllllIlIllIIIIIIIIlIll);
               Minecraft.func_71410_x().field_71466_p.func_175063_a(lllllllllllllllIlIlIllllllllllll, (float)((double)lllllllllllllllIlIlIllllllllIIIl / (Double)scale.getValue() / 2.0D - (double)(Minecraft.func_71410_x().field_71466_p.func_78256_a(lllllllllllllllIlIlIllllllllllll) / llllIIIIIlIl[0])), (float)(lllllllllllllllIlIlIllllllllIlll - llllIIIIIlIl[4]), llllIIIIIlIl[5]);
               "".length();
            }

            GL11.glScaled(1.0D / (Double)scale.getValue(), 1.0D / (Double)scale.getValue(), 1.0D);
            lllllllllllllllIlIlIllllllllIlll += llllIIIIIlIl[6] + Minecraft.func_71410_x().field_71466_p.field_78288_b;
            "".length();
            if (((122 ^ 125) << " ".length() & ~((117 ^ 114) << " ".length())) != 0) {
               return;
            }
         }

         "".length();
         if ("   ".length() <= 0) {
            return;
         }
      } else if (lIIlllIllllIll(mode.getValue(), BossStack.BossStackMode.STACK)) {
         lllllllllllllllIlIllIIIIIIIIIlll = Minecraft.func_71410_x().field_71456_v.func_184046_j().field_184060_g;
         HashMap<String, Pair<BossInfoClient, Integer>> lllllllllllllllIlIlIllllllllIIlI = new HashMap();
         Iterator lllllllllllllllIlIlIllllllllIIIl = lllllllllllllllIlIllIIIIIIIIIlll.entrySet().iterator();

         while(lIIlllIlllllIl(lllllllllllllllIlIlIllllllllIIIl.hasNext())) {
            Entry<UUID, BossInfoClient> lllllllllllllllIlIlIllllllllIIII = (Entry)lllllllllllllllIlIlIllllllllIIIl.next();
            Exception lllllllllllllllIlIlIlllllllIllll = ((BossInfoClient)lllllllllllllllIlIlIllllllllIIII.getValue()).func_186744_e().func_150254_d();
            Pair lllllllllllllllIlIllIIIIIIIIIIll;
            if (lIIlllIlllllIl(lllllllllllllllIlIlIllllllllIIlI.containsKey(lllllllllllllllIlIlIlllllllIllll))) {
               lllllllllllllllIlIllIIIIIIIIIIll = (Pair)lllllllllllllllIlIlIllllllllIIlI.get(lllllllllllllllIlIlIlllllllIllll);
               lllllllllllllllIlIllIIIIIIIIIIll = new Pair(lllllllllllllllIlIllIIIIIIIIIIll.getKey(), (Integer)lllllllllllllllIlIllIIIIIIIIIIll.getValue() + llllIIIIIlIl[2]);
               lllllllllllllllIlIlIllllllllIIlI.put(lllllllllllllllIlIlIlllllllIllll, lllllllllllllllIlIllIIIIIIIIIIll);
               "".length();
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               lllllllllllllllIlIllIIIIIIIIIIll = new Pair(lllllllllllllllIlIlIllllllllIIII.getValue(), llllIIIIIlIl[2]);
               lllllllllllllllIlIlIllllllllIIlI.put(lllllllllllllllIlIlIlllllllIllll, lllllllllllllllIlIllIIIIIIIIIIll);
               "".length();
            }

            "".length();
            if (((56 ^ 43 ^ (78 ^ 65) << " ".length()) & (8 ^ 109 ^ (58 ^ 55) << "   ".length() ^ -" ".length())) != 0) {
               return;
            }
         }

         ScaledResolution lllllllllllllllIlIlIlllllllllIII = new ScaledResolution(Minecraft.func_71410_x());
         lllllllllllllllIlIlIllllllllIlll = lllllllllllllllIlIlIlllllllllIII.func_78326_a();
         Exception lllllllllllllllIlIlIlllllllIllll = llllIIIIIlIl[3];
         Iterator lllllllllllllllIlIlIlllllllIlllI = lllllllllllllllIlIlIllllllllIIlI.entrySet().iterator();

         while(lIIlllIlllllIl(lllllllllllllllIlIlIlllllllIlllI.hasNext())) {
            Entry<String, Pair<BossInfoClient, Integer>> lllllllllllllllIlIlIlllllllllIll = (Entry)lllllllllllllllIlIlIlllllllIlllI.next();
            lllllllllllllllIlIlIllllllllllll = (String)lllllllllllllllIlIlIlllllllllIll.getKey();
            BossInfoClient lllllllllllllllIlIlIlllllllllllI = (BossInfoClient)((Pair)lllllllllllllllIlIlIlllllllllIll.getValue()).getKey();
            int lllllllllllllllIlIlIllllllllllIl = (Integer)((Pair)lllllllllllllllIlIlIlllllllllIll.getValue()).getValue();
            lllllllllllllllIlIlIllllllllllll = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIlIllllllllllll).append(llllIIIIIlII[llllIIIIIlIl[1]]).append(lllllllllllllllIlIlIllllllllllIl));
            int lllllllllllllllIlIlIlllllllIlIIl = (int)((double)lllllllllllllllIlIlIllllllllIlll / (Double)scale.getValue() / 2.0D - 91.0D);
            GL11.glScaled((Double)scale.getValue(), (Double)scale.getValue(), 1.0D);
            if (lIIlllIllllllI(lllllllllllllllIlIlIllllllllIlII.isCanceled())) {
               GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, 1.0F);
               Minecraft.func_71410_x().func_110434_K().func_110577_a(GUI_BARS_TEXTURES);
               Minecraft.func_71410_x().field_71456_v.func_184046_j().func_184052_a(lllllllllllllllIlIlIlllllllIlIIl, lllllllllllllllIlIlIlllllllIllll, lllllllllllllllIlIlIlllllllllllI);
               Minecraft.func_71410_x().field_71466_p.func_175063_a(lllllllllllllllIlIlIllllllllllll, (float)((double)lllllllllllllllIlIlIllllllllIlll / (Double)scale.getValue() / 2.0D - (double)(Minecraft.func_71410_x().field_71466_p.func_78256_a(lllllllllllllllIlIlIllllllllllll) / llllIIIIIlIl[0])), (float)(lllllllllllllllIlIlIlllllllIllll - llllIIIIIlIl[4]), llllIIIIIlIl[5]);
               "".length();
            }

            GL11.glScaled(1.0D / (Double)scale.getValue(), 1.0D / (Double)scale.getValue(), 1.0D);
            lllllllllllllllIlIlIlllllllIllll += llllIIIIIlIl[6] + Minecraft.func_71410_x().field_71466_p.field_78288_b;
            "".length();
            if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
               return;
            }
         }
      }

   }

   private static void lIIlllIllllIIl() {
      llllIIIIIlII = new String[llllIIIIIlIl[8]];
      llllIIIIIlII[llllIIIIIlIl[1]] = lIIlllIlllIlll("tedZwDWd4ic=", "HuLCQ");
      llllIIIIIlII[llllIIIIIlIl[2]] = lIIlllIllllIII("OBohHA==", "uuEya");
      llllIIIIIlII[llllIIIIIlIl[0]] = lIIlllIlllIlll("CiCduJ+VZhI=", "INyRl");
      llllIIIIIlII[llllIIIIIlIl[7]] = lIIlllIlllIlll("SCmdH6MXL9PVg8b+OY+h/9FObcd4IpAf", "ekSES");
   }

   private static boolean lIIlllIlllllll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIIlllIllllIlI() {
      llllIIIIIlIl = new int[10];
      llllIIIIIlIl[0] = " ".length() << " ".length();
      llllIIIIIlIl[1] = (199 ^ 166) & ~(37 ^ 68);
      llllIIIIIlIl[2] = " ".length();
      llllIIIIIlIl[3] = "   ".length() << (" ".length() << " ".length());
      llllIIIIIlIl[4] = 230 ^ 197 ^ (92 ^ 73) << " ".length();
      llllIIIIIlIl[5] = 16579308 + 11819182 - 16213651 + 4592376;
      llllIIIIIlIl[6] = (170 ^ 175) << " ".length();
      llllIIIIIlIl[7] = "   ".length();
      llllIIIIIlIl[8] = " ".length() << (" ".length() << " ".length());
      llllIIIIIlIl[9] = " ".length() << "   ".length();
   }

   static {
      lIIlllIllllIlI();
      lIIlllIllllIIl();
      mode = Settings.e(llllIIIIIlII[llllIIIIIlIl[2]], BossStack.BossStackMode.STACK);
      scale = Settings.d(llllIIIIIlII[llllIIIIIlIl[0]], 0.5D);
      GUI_BARS_TEXTURES = new ResourceLocation(llllIIIIIlII[llllIIIIIlIl[7]]);
   }

   private static boolean lIIlllIllllllI(int var0) {
      return var0 == 0;
   }

   private static String lIIlllIlllIlll(String lllllllllllllllIlIlIllllllIIlIIl, String lllllllllllllllIlIlIllllllIIIllI) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllllllIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllllllIIIllI.getBytes(StandardCharsets.UTF_8)), llllIIIIIlIl[9]), "DES");
         short lllllllllllllllIlIlIllllllIIIlII = Cipher.getInstance("DES");
         lllllllllllllllIlIlIllllllIIIlII.init(llllIIIIIlIl[0], lllllllllllllllIlIlIllllllIIllII);
         return new String(lllllllllllllllIlIlIllllllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIllllIll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static String lIIlllIllllIII(String lllllllllllllllIlIlIllllllIllIIl, String lllllllllllllllIlIlIllllllIllIII) {
      lllllllllllllllIlIlIllllllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllllllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIllllllIlllII = new StringBuilder();
      long lllllllllllllllIlIlIllllllIlIllI = lllllllllllllllIlIlIllllllIllIII.toCharArray();
      char lllllllllllllllIlIlIllllllIlIlIl = llllIIIIIlIl[1];
      byte lllllllllllllllIlIlIllllllIlIlII = lllllllllllllllIlIlIllllllIllIIl.toCharArray();
      int lllllllllllllllIlIlIllllllIlIIll = lllllllllllllllIlIlIllllllIlIlII.length;
      int lllllllllllllllIlIlIllllllIlIIlI = llllIIIIIlIl[1];

      do {
         if (!lIIlllIlllllll(lllllllllllllllIlIlIllllllIlIIlI, lllllllllllllllIlIlIllllllIlIIll)) {
            return String.valueOf(lllllllllllllllIlIlIllllllIlllII);
         }

         char lllllllllllllllIlIlIllllllIlllll = lllllllllllllllIlIlIllllllIlIlII[lllllllllllllllIlIlIllllllIlIIlI];
         lllllllllllllllIlIlIllllllIlllII.append((char)(lllllllllllllllIlIlIllllllIlllll ^ lllllllllllllllIlIlIllllllIlIllI[lllllllllllllllIlIlIllllllIlIlIl % lllllllllllllllIlIlIllllllIlIllI.length]));
         "".length();
         ++lllllllllllllllIlIlIllllllIlIlIl;
         ++lllllllllllllllIlIlIllllllIlIIlI;
         "".length();
      } while(-" ".length() < 0);

      return null;
   }

   public BossStack() {
      Setting[] var10001 = new Setting[llllIIIIIlIl[0]];
      var10001[llllIIIIIlIl[1]] = mode;
      var10001[llllIIIIIlIl[2]] = scale;
      lllllllllllllllIlIllIIIIIIIllIII.registerAll(var10001);
   }

   private static boolean lIIlllIlllllII(Object var0) {
      return var0 == null;
   }

   private static enum BossStackMode {
      // $FF: synthetic field
      MINIMIZE;

      // $FF: synthetic field
      private static final String[] llllIlllIIII;
      // $FF: synthetic field
      REMOVE,
      // $FF: synthetic field
      STACK;

      // $FF: synthetic field
      private static final int[] llllIlllIIll;

      private static void lIlIIIIlIlIllI() {
         llllIlllIIII = new String[llllIlllIIll[3]];
         llllIlllIIII[llllIlllIIll[0]] = lIlIIIIlIIllll("BTcCBwES", "WrOHW");
         llllIlllIIII[llllIlllIIll[1]] = lIlIIIIlIlIIII("7fOJ3TVApuk=", "mmZDJ");
         llllIlllIIII[llllIlllIIll[2]] = lIlIIIIlIlIIIl("5I1NvM1XD3H9q9b6mUL/WQ==", "enafk");
      }

      private static void lIlIIIIlIllIlI() {
         llllIlllIIll = new int[5];
         llllIlllIIll[0] = (151 ^ 172) & ~(64 ^ 123);
         llllIlllIIll[1] = " ".length();
         llllIlllIIll[2] = " ".length() << " ".length();
         llllIlllIIll[3] = "   ".length();
         llllIlllIIll[4] = " ".length() << "   ".length();
      }

      private static String lIlIIIIlIlIIII(String lllllllllllllllIlIlIIIlllIllIIll, String lllllllllllllllIlIlIIIlllIllIIII) {
         try {
            byte lllllllllllllllIlIlIIIlllIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlllIllIIII.getBytes(StandardCharsets.UTF_8)), llllIlllIIll[4]), "DES");
            byte lllllllllllllllIlIlIIIlllIlIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIlllIlIlllI.init(llllIlllIIll[2], lllllllllllllllIlIlIIIlllIlIllll);
            return new String(lllllllllllllllIlIlIIIlllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIlIIIIlIIllll(String lllllllllllllllIlIlIIIllllIIIIll, String lllllllllllllllIlIlIIIllllIIIlll) {
         lllllllllllllllIlIlIIIllllIIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIlIIIllllIIIllI = new StringBuilder();
         char[] lllllllllllllllIlIlIIIllllIIIlIl = lllllllllllllllIlIlIIIllllIIIlll.toCharArray();
         long lllllllllllllllIlIlIIIlllIllllll = llllIlllIIll[0];
         float lllllllllllllllIlIlIIIlllIlllllI = lllllllllllllllIlIlIIIllllIIIIll.toCharArray();
         short lllllllllllllllIlIlIIIlllIllllIl = lllllllllllllllIlIlIIIlllIlllllI.length;
         int lllllllllllllllIlIlIIIlllIllllII = llllIlllIIll[0];

         do {
            if (!lIlIIIIlIllIll(lllllllllllllllIlIlIIIlllIllllII, lllllllllllllllIlIlIIIlllIllllIl)) {
               return String.valueOf(lllllllllllllllIlIlIIIllllIIIllI);
            }

            long lllllllllllllllIlIlIIIlllIlllIll = lllllllllllllllIlIlIIIlllIlllllI[lllllllllllllllIlIlIIIlllIllllII];
            lllllllllllllllIlIlIIIllllIIIllI.append((char)(lllllllllllllllIlIlIIIlllIlllIll ^ lllllllllllllllIlIlIIIllllIIIlIl[lllllllllllllllIlIlIIIlllIllllll % lllllllllllllllIlIlIIIllllIIIlIl.length]));
            "".length();
            ++lllllllllllllllIlIlIIIlllIllllll;
            ++lllllllllllllllIlIlIIIlllIllllII;
            "".length();
         } while(" ".length() << " ".length() >= 0);

         return null;
      }

      private static boolean lIlIIIIlIllIll(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIlIIIIlIlIIIl(String lllllllllllllllIlIlIIIlllIlIIlII, String lllllllllllllllIlIlIIIlllIlIIIll) {
         try {
            int lllllllllllllllIlIlIIIlllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlllIlIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIlllIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIlllIlIlIII.init(llllIlllIIll[2], lllllllllllllllIlIlIIIlllIlIIIlI);
            return new String(lllllllllllllllIlIlIIIlllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      static {
         lIlIIIIlIllIlI();
         lIlIIIIlIlIllI();
         REMOVE = new BossStack.BossStackMode(llllIlllIIII[llllIlllIIll[0]], llllIlllIIll[0]);
         STACK = new BossStack.BossStackMode(llllIlllIIII[llllIlllIIll[1]], llllIlllIIll[1]);
         MINIMIZE = new BossStack.BossStackMode(llllIlllIIII[llllIlllIIll[2]], llllIlllIIll[2]);
         BossStack.BossStackMode[] var10000 = new BossStack.BossStackMode[llllIlllIIll[3]];
         var10000[llllIlllIIll[0]] = REMOVE;
         var10000[llllIlllIIll[1]] = STACK;
         var10000[llllIlllIIll[2]] = MINIMIZE;
      }
   }
}
