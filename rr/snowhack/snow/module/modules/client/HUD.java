package rr.snowhack.snow.module.modules.client;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.GameType;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.ColourHolder;
import rr.snowhack.snow.util.ColourUtils;

@Module.Info(
   name = "HUD",
   category = Module.Category.CLIENT
)
public class HUD extends Module {
   // $FF: synthetic field
   Frame inventory;
   // $FF: synthetic field
   Frame list;
   // $FF: synthetic field
   private static RenderItem itemRender;
   // $FF: synthetic field
   private Setting<Boolean> coord;
   // $FF: synthetic field
   private static final int[] lllIlllIlIIl;
   // $FF: synthetic field
   private Setting<Boolean> Inventory;
   // $FF: synthetic field
   private Setting<Boolean> Radar;
   // $FF: synthetic field
   Frame inFo;
   // $FF: synthetic field
   Frame keystroke;
   // $FF: synthetic field
   private Setting<Boolean> welcomer;
   // $FF: synthetic field
   private Setting<Boolean> Entity;
   // $FF: synthetic field
   private Setting<Boolean> itemCount;
   // $FF: synthetic field
   private Setting<Boolean> armor;
   // $FF: synthetic field
   Frame radaR;
   // $FF: synthetic field
   private CFontRenderer cFontRenderer2;
   // $FF: synthetic field
   private Setting<Boolean> info;
   // $FF: synthetic field
   private CFontRenderer cFontRenderer;
   // $FF: synthetic field
   Frame itemcount;
   // $FF: synthetic field
   private Setting<Boolean> keyStroke;
   // $FF: synthetic field
   private Setting<Boolean> watermark;
   // $FF: synthetic field
   Frame textRadar;
   // $FF: synthetic field
   private static final String[] lllIlllIlIII;
   // $FF: synthetic field
   private Setting<Boolean> arraylist;
   // $FF: synthetic field
   Frame coords;
   // $FF: synthetic field
   private Setting<Boolean> textradar;
   // $FF: synthetic field
   Frame entities;

   private static String lIIlllIlIIlllI(String lllllllllllllllIlIllIIlIIIlIllIl, String lllllllllllllllIlIllIIlIIIlIIlll) {
      lllllllllllllllIlIllIIlIIIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIllIIlIIIlIlIll = new StringBuilder();
      int lllllllllllllllIlIllIIlIIIlIIlIl = lllllllllllllllIlIllIIlIIIlIIlll.toCharArray();
      short lllllllllllllllIlIllIIlIIIlIIlII = lllIlllIlIIl[0];
      String lllllllllllllllIlIllIIlIIIlIIIll = lllllllllllllllIlIllIIlIIIlIllIl.toCharArray();
      boolean lllllllllllllllIlIllIIlIIIlIIIlI = lllllllllllllllIlIllIIlIIIlIIIll.length;
      int lllllllllllllllIlIllIIlIIIlIIIIl = lllIlllIlIIl[0];

      do {
         if (!lIIlllIlIlIlIl(lllllllllllllllIlIllIIlIIIlIIIIl, lllllllllllllllIlIllIIlIIIlIIIlI)) {
            return String.valueOf(lllllllllllllllIlIllIIlIIIlIlIll);
         }

         int lllllllllllllllIlIllIIlIIIlIIIII = lllllllllllllllIlIllIIlIIIlIIIll[lllllllllllllllIlIllIIlIIIlIIIIl];
         lllllllllllllllIlIllIIlIIIlIlIll.append((char)(lllllllllllllllIlIllIIlIIIlIIIII ^ lllllllllllllllIlIllIIlIIIlIIlIl[lllllllllllllllIlIllIIlIIIlIIlII % lllllllllllllllIlIllIIlIIIlIIlIl.length]));
         "".length();
         ++lllllllllllllllIlIllIIlIIIlIIlII;
         ++lllllllllllllllIlIllIIlIIIlIIIIl;
         "".length();
      } while(-" ".length() < "   ".length());

      return null;
   }

   private static boolean lIIlllIlIlIIlI(int var0) {
      return var0 != 0;
   }

   private void drawDamage(ItemStack lllllllllllllllIlIllIIlIIlIllllI, int lllllllllllllllIlIllIIlIIlIlIllI, int lllllllllllllllIlIllIIlIIlIlIlIl) {
      float lllllllllllllllIlIllIIlIIlIllIll = ((float)lllllllllllllllIlIllIIlIIlIllllI.func_77958_k() - (float)lllllllllllllllIlIllIIlIIlIllllI.func_77952_i()) / (float)lllllllllllllllIlIllIIlIIlIllllI.func_77958_k();
      float lllllllllllllllIlIllIIlIIlIllIlI = 1.0F - lllllllllllllllIlIllIIlIIlIllIll;
      int lllllllllllllllIlIllIIlIIlIllIIl = lllIlllIlIIl[37] - (int)(lllllllllllllllIlIllIIlIIlIllIlI * 100.0F);
      GL11.glDisable(lllIlllIlIIl[27]);
      GL11.glEnable(lllIlllIlIIl[28]);
      GL11.glEnable(lllIlllIlIIl[29]);
      lllllllllllllllIlIllIIlIIlIllIII.cFontRenderer2.drawStringWithShadow(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIIlIIlIllIIl).append(lllIlllIlIII[lllIlllIlIIl[38]])), (double)(lllllllllllllllIlIllIIlIIlIlIllI + lllIlllIlIIl[8] - lllllllllllllllIlIllIIlIIlIllIII.cFontRenderer.getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIIlIIlIllIIl).append(lllIlllIlIII[lllIlllIlIIl[39]]))) / lllIlllIlIIl[2]), (double)(lllllllllllllllIlIllIIlIIlIlIlIl - lllIlllIlIIl[10]), ColourHolder.toHex((int)(lllllllllllllllIlIllIIlIIlIllIlI * 255.0F), (int)(lllllllllllllllIlIllIIlIIlIllIll * 255.0F), lllIlllIlIIl[0]));
      "".length();
      GL11.glDisable(lllIlllIlIIl[27]);
      GL11.glEnable(lllIlllIlIIl[28]);
      GL11.glEnable(lllIlllIlIIl[29]);
   }

   public void onDisable() {
      lllllllllllllllIlIllIIlIIlllIIII.enable();
   }

   private static boolean lIIlllIlIlIIll(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIIlllIlIlIlII(int var0) {
      return var0 == 0;
   }

   private static boolean lIIlllIlIlIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIlllIlIIllII(String lllllllllllllllIlIllIIlIIIllllIl, String lllllllllllllllIlIllIIlIIIllllII) {
      try {
         float lllllllllllllllIlIllIIlIIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllIIlIIIllllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIIlIIIllllll.init(lllIlllIlIIl[2], lllllllllllllllIlIllIIlIIIlllIIl);
         return new String(lllllllllllllllIlIllIIlIIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public HUD() {
      lllllllllllllllIlIllIIlIlIllIIlI.coord = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[0]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.info = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[1]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.watermark = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[2]], (boolean)lllIlllIlIIl[1]));
      lllllllllllllllIlIllIIlIlIllIIlI.textradar = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[3]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.Radar = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[4]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.Entity = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[5]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.welcomer = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[6]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.arraylist = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[7]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.itemCount = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[8]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.Inventory = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[9]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.armor = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[10]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.keyStroke = lllllllllllllllIlIllIIlIlIllIIlI.register(Settings.b(lllIlllIlIII[lllIlllIlIIl[11]], (boolean)lllIlllIlIIl[0]));
      lllllllllllllllIlIllIIlIlIllIIlI.cFontRenderer = new CFontRenderer(new Font(lllIlllIlIII[lllIlllIlIIl[12]], lllIlllIlIIl[0], lllIlllIlIIl[13]), (boolean)lllIlllIlIIl[1], (boolean)lllIlllIlIIl[0]);
      lllllllllllllllIlIllIIlIlIllIIlI.cFontRenderer2 = new CFontRenderer(new Font(lllIlllIlIII[lllIlllIlIIl[14]], lllIlllIlIIl[0], lllIlllIlIIl[14]), (boolean)lllIlllIlIIl[1], (boolean)lllIlllIlIIl[0]);
   }

   static {
      lIIlllIlIlIIII();
      lIIlllIlIIllll();
      itemRender = Minecraft.func_71410_x().func_175599_af();
   }

   private static String lIIlllIlIIllIl(String lllllllllllllllIlIllIIlIIlIIlIlI, String lllllllllllllllIlIllIIlIIlIIlIIl) {
      try {
         long lllllllllllllllIlIllIIlIIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIlIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), lllIlllIlIIl[8]), "DES");
         double lllllllllllllllIlIllIIlIIlIIIlIl = Cipher.getInstance("DES");
         lllllllllllllllIlIllIIlIIlIIIlIl.init(lllIlllIlIIl[2], lllllllllllllllIlIllIIlIIlIIIllI);
         return new String(lllllllllllllllIlIllIIlIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIlIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void check(Setting<Boolean> lllllllllllllllIlIllIIlIIllIlIll, Frame lllllllllllllllIlIllIIlIIllIlIlI) {
      lllllllllllllllIlIllIIlIIllIlIlI.setPinned((Boolean)lllllllllllllllIlIllIIlIIllIlIll.getValue());
      lllllllllllllllIlIllIIlIIllIlIlI.setBox((Boolean)lllllllllllllllIlIllIIlIIllIlIll.getValue());
      int var10001;
      if (lIIlllIlIlIlII((Boolean)lllllllllllllllIlIllIIlIIllIlIll.getValue())) {
         var10001 = lllIlllIlIIl[1];
         "".length();
         if ("   ".length() == (((79 ^ 70) << (" ".length() << (" ".length() << " ".length())) ^ 65 + 111 - 101 + 60) << (" ".length() << " ".length()) & ((103 + 68 - 138 + 144 ^ (42 ^ 121) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length()))) {
            return;
         }
      } else {
         var10001 = lllIlllIlIIl[0];
      }

      lllllllllllllllIlIllIIlIIllIlIlI.setMinimized((boolean)var10001);
   }

   private static boolean lIIlllIlIlIIIl(Object var0) {
      return var0 != null;
   }

   public void onRender() {
      ScaledResolution lllllllllllllllIlIllIIlIlIIIlIlI = new ScaledResolution(mc);
      float[] var10000 = new float[lllIlllIlIIl[1]];
      var10000[lllIlllIlIIl[0]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
      float[] lllllllllllllllIlIllIIlIlIIIlIIl = var10000;
      int lllllllllllllllIlIllIIlIIlllllll = Color.HSBtoRGB(lllllllllllllllIlIllIIlIlIIIlIIl[lllIlllIlIIl[0]], 1.0F, 1.0F);
      byte lllllllllllllllIlIllIIlIIllllllI = lllllllllllllllIlIllIIlIIlllllll >> lllIlllIlIIl[18] & lllIlllIlIIl[24];
      int lllllllllllllllIlIllIIlIlIIIIllI = lllllllllllllllIlIllIIlIIlllllll >> lllIlllIlIIl[8] & lllIlllIlIIl[24];
      float lllllllllllllllIlIllIIlIIlllllII = lllllllllllllllIlIllIIlIIlllllll & lllIlllIlIIl[24];
      String lllllllllllllllIlIllIIlIIllllIlI = String.valueOf((new StringBuilder()).append(lllIlllIlIII[lllIlllIlIIl[25]]).append(mc.field_71439_g.func_70005_c_()).append(lllIlllIlIII[lllIlllIlIIl[26]]));
      int lllllllllllllllIlIllIIlIIllllIll;
      if (lIIlllIlIlIIlI(GUIColor.shouldRainbow())) {
         lllllllllllllllIlIllIIlIIllllIll = ColourUtils.toRGBA(lllllllllllllllIlIllIIlIIllllllI, lllllllllllllllIlIllIIlIlIIIIllI, lllllllllllllllIlIllIIlIIlllllII, lllIlllIlIIl[24]);
         "".length();
         if (" ".length() << (" ".length() << " ".length()) < 0) {
            return;
         }
      } else {
         lllllllllllllllIlIllIIlIIllllIll = ColourUtils.toRGBA(GUIColor.getRed(), GUIColor.getGreen(), GUIColor.getBlue(), lllIlllIlIIl[24]);
      }

      if (lIIlllIlIlIIlI((Boolean)lllllllllllllllIlIllIIlIlIIIIIlI.watermark.getValue())) {
         GL11.glDisable(lllIlllIlIIl[27]);
         GL11.glEnable(lllIlllIlIIl[28]);
         GL11.glEnable(lllIlllIlIIl[29]);
         lllllllllllllllIlIllIIlIlIIIIIlI.cFontRenderer.drawStringWithShadow(lllIlllIlIII[lllIlllIlIIl[30]], 1.0D, 0.0D, lllllllllllllllIlIllIIlIIllllIll);
         "".length();
         GL11.glEnable(lllIlllIlIIl[27]);
         GL11.glDisable(lllIlllIlIIl[28]);
         GL11.glDisable(lllIlllIlIIl[29]);
      }

      if (lIIlllIlIlIIlI((Boolean)lllllllllllllllIlIllIIlIlIIIIIlI.welcomer.getValue())) {
         GL11.glDisable(lllIlllIlIIl[27]);
         GL11.glEnable(lllIlllIlIIl[28]);
         GL11.glEnable(lllIlllIlIIl[29]);
         lllllllllllllllIlIllIIlIlIIIIIlI.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllIIlIIllllIlI, (double)(lllllllllllllllIlIllIIlIlIIIlIlI.func_78326_a() / lllIlllIlIIl[2] - lllllllllllllllIlIllIIlIlIIIIIlI.cFontRenderer.getStringWidth(lllllllllllllllIlIllIIlIIllllIlI) / lllIlllIlIIl[2]), 0.0D, lllllllllllllllIlIllIIlIIllllIll);
         "".length();
         GL11.glEnable(lllIlllIlIIl[27]);
         GL11.glDisable(lllIlllIlIIl[28]);
         GL11.glDisable(lllIlllIlIIl[29]);
      }

      if (lIIlllIlIlIIlI((Boolean)lllllllllllllllIlIllIIlIlIIIIIlI.armor.getValue())) {
         GlStateManager.func_179098_w();
         Exception lllllllllllllllIlIllIIlIIllllIIl = new ScaledResolution(mc);
         int lllllllllllllllIlIllIIlIIllllIII = lllllllllllllllIlIllIIlIIllllIIl.func_78326_a() / lllIlllIlIIl[2];
         int lllllllllllllllIlIllIIlIlIIIllIl = lllIlllIlIIl[0];
         int var17 = lllllllllllllllIlIllIIlIIllllIIl.func_78328_b() - lllIlllIlIIl[31];
         int var10001;
         if (lIIlllIlIlIIlI(mc.field_71439_g.func_70090_H())) {
            var10001 = lllIlllIlIIl[10];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10001 = lllIlllIlIIl[0];
         }

         boolean lllllllllllllllIlIllIIlIIlllIllI = var17 - var10001;
         Iterator lllllllllllllllIlIllIIlIIlllIlIl = lllllllllllllllIlIllIIlIlIIIIIlI.getArmour().iterator();

         while(lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIIlllIlIl.hasNext())) {
            Exception lllllllllllllllIlIllIIlIIlllIlII = (ItemStack)lllllllllllllllIlIllIIlIIlllIlIl.next();
            ++lllllllllllllllIlIllIIlIlIIIllIl;
            if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIIlllIlII.func_190926_b())) {
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               char lllllllllllllllIlIllIIlIIlllIIll = lllllllllllllllIlIllIIlIIllllIII - lllIlllIlIIl[32] + (lllIlllIlIIl[9] - lllllllllllllllIlIllIIlIlIIIllIl) * lllIlllIlIIl[21] + lllIlllIlIIl[2];
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIIlllIlII.func_77984_f())) {
                  lllllllllllllllIlIllIIlIlIIIIIlI.drawDamage(lllllllllllllllIlIllIIlIIlllIlII, lllllllllllllllIlIllIIlIIlllIIll, lllllllllllllllIlIllIIlIIlllIllI);
               }

               GlStateManager.func_179126_j();
               itemRender.field_77023_b = 200.0F;
               itemRender.func_180450_b(lllllllllllllllIlIllIIlIIlllIlII, lllllllllllllllIlIllIIlIIlllIIll, lllllllllllllllIlIllIIlIIlllIllI);
               itemRender.func_180453_a(mc.field_71466_p, lllllllllllllllIlIllIIlIIlllIlII, lllllllllllllllIlIllIIlIIlllIIll, lllllllllllllllIlIllIIlIIlllIllI, lllIlllIlIII[lllIlllIlIIl[33]]);
               itemRender.field_77023_b = 0.0F;
               GlStateManager.func_179098_w();
               GlStateManager.func_179140_f();
               GlStateManager.func_179097_i();
               String var18;
               if (lIIlllIlIlIIll(lllllllllllllllIlIllIIlIIlllIlII.func_190916_E(), lllIlllIlIIl[1])) {
                  var18 = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIIlIIlllIlII.func_190916_E()).append(lllIlllIlIII[lllIlllIlIIl[34]]));
                  "".length();
                  if ("   ".length() != "   ".length()) {
                     return;
                  }
               } else {
                  var18 = lllIlllIlIII[lllIlllIlIIl[35]];
               }

               String lllllllllllllllIlIllIIlIlIIlIIIl = var18;
               mc.field_71466_p.func_175063_a(lllllllllllllllIlIllIIlIlIIlIIIl, (float)(lllllllllllllllIlIllIIlIIlllIIll + lllIlllIlIIl[20] - lllIlllIlIIl[2] - mc.field_71466_p.func_78256_a(lllllllllllllllIlIllIIlIlIIlIIIl)), (float)(lllllllllllllllIlIllIIlIIlllIllI + lllIlllIlIIl[9]), lllIlllIlIIl[36]);
               "".length();
               "".length();
               if (" ".length() << " ".length() < 0) {
                  return;
               }
            }
         }

         GlStateManager.func_179126_j();
         GlStateManager.func_179140_f();
      }

   }

   private NonNullList<ItemStack> getArmour() {
      return lIIlllIlIlIlII(mc.field_71442_b.func_178889_l().equals(GameType.CREATIVE)) && !lIIlllIlIlIIlI(mc.field_71442_b.func_178889_l().equals(GameType.SPECTATOR)) ? mc.field_71439_g.field_71071_by.field_70460_b : NonNullList.func_191197_a(lllIlllIlIIl[4], ItemStack.field_190927_a);
   }

   public void onUpdate() {
      if (lIIlllIlIlIIIl(SnowGUI.framesArray)) {
         Iterator lllllllllllllllIlIllIIlIlIlIlIII = SnowGUI.framesArray.iterator();

         while(lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIlIII.hasNext())) {
            Frame lllllllllllllllIlIllIIlIlIlIlIll = (Frame)lllllllllllllllIlIllIIlIlIlIlIII.next();
            String lllllllllllllllIlIllIIlIlIlIIllI = lllllllllllllllIlIllIIlIlIlIlIll.getTitle();
            float lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[15];
            switch(lllllllllllllllIlIllIIlIlIlIIllI.hashCode()) {
            case -2106546035:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[20]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[5];
                  "".length();
                  if (-" ".length() > 0) {
                     return;
                  }
               }
               break;
            case -2037470239:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[13]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[4];
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
                     return;
                  }
               }
               break;
            case -1941634477:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[18]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[2];
                  "".length();
                  if (-" ".length() < -" ".length()) {
                     return;
                  }
               }
               break;
            case -755179045:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[16]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[0];
                  "".length();
                  if (-(75 ^ 79) > 0) {
                     return;
                  }
               }
               break;
            case -171096335:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[21]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[6];
                  "".length();
                  if (-(196 ^ 133 ^ (149 ^ 132) << (" ".length() << " ".length())) >= 0) {
                     return;
                  }
               }
               break;
            case -16631492:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[22]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[7];
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
               }
               break;
            case 2283726:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[17]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[1];
                  "".length();
                  if (((164 ^ 133) & ~(85 ^ 116)) <= -" ".length()) {
                     return;
                  }
               }
               break;
            case 15703383:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[23]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[8];
               }
               break;
            case 78717670:
               if (lIIlllIlIlIIlI(lllllllllllllllIlIllIIlIlIlIIllI.equals(lllIlllIlIII[lllIlllIlIIl[19]]))) {
                  lllllllllllllllIlIllIIlIlIlIIlIl = lllIlllIlIIl[3];
                  "".length();
                  if ((((32 ^ 63) << " ".length() ^ "   ".length()) & (87 ^ 80 ^ (87 ^ 74) << " ".length() ^ -" ".length())) >= "   ".length()) {
                     return;
                  }
               }
            }

            switch(lllllllllllllllIlIllIIlIlIlIIlIl) {
            case 0:
               lllllllllllllllIlIllIIlIlIlIlIIl.coords = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (-" ".length() >= " ".length()) {
                  return;
               }
               break;
            case 1:
               lllllllllllllllIlIllIIlIlIlIlIIl.inFo = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (null != null) {
                  return;
               }
               break;
            case 2:
               lllllllllllllllIlIllIIlIlIlIlIIl.textRadar = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (" ".length() > " ".length() << " ".length()) {
                  return;
               }
               break;
            case 3:
               lllllllllllllllIlIllIIlIlIlIlIIl.radaR = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (" ".length() != " ".length()) {
                  return;
               }
               break;
            case 4:
               lllllllllllllllIlIllIIlIlIlIlIIl.entities = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (" ".length() < 0) {
                  return;
               }
               break;
            case 5:
               lllllllllllllllIlIllIIlIlIlIlIIl.list = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (" ".length() <= ((28 ^ 37) & ~(70 ^ 127))) {
                  return;
               }
               break;
            case 6:
               lllllllllllllllIlIllIIlIlIlIlIIl.itemcount = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if (-"  ".length() >= 0) {
                  return;
               }
               break;
            case 7:
               lllllllllllllllIlIllIIlIlIlIlIIl.inventory = lllllllllllllllIlIllIIlIlIlIlIll;
               "".length();
               if ("   ".length() <= ((207 ^ 130) & ~(6 ^ 75))) {
                  return;
               }
               break;
            case 8:
               lllllllllllllllIlIllIIlIlIlIlIIl.keystroke = lllllllllllllllIlIllIIlIlIlIlIll;
            }

            "".length();
            if ("   ".length() == -" ".length()) {
               return;
            }
         }

         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.coord, lllllllllllllllIlIllIIlIlIlIlIIl.coords);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.info, lllllllllllllllIlIllIIlIlIlIlIIl.inFo);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.textradar, lllllllllllllllIlIllIIlIlIlIlIIl.textRadar);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.Radar, lllllllllllllllIlIllIIlIlIlIlIIl.radaR);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.Entity, lllllllllllllllIlIllIIlIlIlIlIIl.entities);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.arraylist, lllllllllllllllIlIllIIlIlIlIlIIl.list);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.itemCount, lllllllllllllllIlIllIIlIlIlIlIIl.itemcount);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.Inventory, lllllllllllllllIlIllIIlIlIlIlIIl.inventory);
         lllllllllllllllIlIllIIlIlIlIlIIl.check(lllllllllllllllIlIllIIlIlIlIlIIl.keyStroke, lllllllllllllllIlIllIIlIlIlIlIIl.keystroke);
      }

   }

   private static void lIIlllIlIlIIII() {
      lllIlllIlIIl = new int[41];
      lllIlllIlIIl[0] = (92 ^ 77 ^ "   ".length() << (" ".length() << " ".length())) << " ".length() & ((69 ^ 22 ^ (170 ^ 141) << " ".length()) << " ".length() ^ -" ".length());
      lllIlllIlIIl[1] = " ".length();
      lllIlllIlIIl[2] = " ".length() << " ".length();
      lllIlllIlIIl[3] = "   ".length();
      lllIlllIlIIl[4] = " ".length() << (" ".length() << " ".length());
      lllIlllIlIIl[5] = 45 ^ 40;
      lllIlllIlIIl[6] = "   ".length() << " ".length();
      lllIlllIlIIl[7] = 29 ^ 26;
      lllIlllIlIIl[8] = " ".length() << "   ".length();
      lllIlllIlIIl[9] = 183 ^ 190;
      lllIlllIlIIl[10] = (148 ^ 145) << " ".length();
      lllIlllIlIIl[11] = 152 ^ 147;
      lllIlllIlIIl[12] = "   ".length() << (" ".length() << " ".length());
      lllIlllIlIIl[13] = ((114 ^ 107) << (" ".length() << " ".length()) ^ 16 ^ 125) << " ".length();
      lllIlllIlIIl[14] = 19 ^ 30;
      lllIlllIlIIl[15] = -" ".length();
      lllIlllIlIIl[16] = (27 ^ 28) << " ".length();
      lllIlllIlIIl[17] = 3 ^ 12;
      lllIlllIlIIl[18] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIlllIlIIl[19] = 69 ^ 50 ^ (149 ^ 166) << " ".length();
      lllIlllIlIIl[20] = 32 ^ 51;
      lllIlllIlIIl[21] = (2 + 70 - -16 + 53 ^ (170 ^ 187) << "   ".length()) << (" ".length() << " ".length());
      lllIlllIlIIl[22] = (243 ^ 198) << " ".length() ^ 4 + 78 - 0 + 45;
      lllIlllIlIIl[23] = (92 ^ 87) << " ".length();
      lllIlllIlIIl[24] = 170 + 245 - 308 + 148;
      lllIlllIlIIl[25] = 86 ^ 65;
      lllIlllIlIIl[26] = "   ".length() << "   ".length();
      lllIlllIlIIl[27] = (120 + 43 - 144 + 166 << " ".length()) + 169 + 110 - -24 + 18 - (160 + 13 - -4 + 380) + 171 + 578 - 647 + 485 << (" ".length() << " ".length());
      lllIlllIlIIl[28] = 1382 + 207 - 803 + 735 << " ".length();
      lllIlllIlIIl[29] = 3028 + 3209 - 3532 + 848;
      lllIlllIlIIl[30] = 78 ^ 87;
      lllIlllIlIIl[31] = 185 ^ 142;
      lllIlllIlIIl[32] = (234 ^ 199) << " ".length();
      lllIlllIlIIl[33] = (184 ^ 181) << " ".length();
      lllIlllIlIIl[34] = (162 ^ 171) << (" ".length() << (" ".length() << " ".length())) ^ 128 + 53 - 67 + 25;
      lllIlllIlIIl[35] = (27 ^ 28) << (" ".length() << " ".length());
      lllIlllIlIIl[36] = 5248992 + 14055217 - 8521674 + 5994680;
      lllIlllIlIIl[37] = (44 ^ 23 ^ (31 ^ 14) << " ".length()) << (" ".length() << " ".length());
      lllIlllIlIIl[38] = 161 ^ 188;
      lllIlllIlIIl[39] = (159 ^ 144) << " ".length();
      lllIlllIlIIl[40] = 178 ^ 173;
   }

   private static void lIIlllIlIIllll() {
      lllIlllIlIII = new String[lllIlllIlIIl[40]];
      lllIlllIlIII[lllIlllIlIIl[0]] = lIIlllIlIIllII("RTQr/UfQQsx/D/CIpaKFXQ==", "IFkvL");
      lllIlllIlIII[lllIlllIlIIl[1]] = lIIlllIlIIllII("oGA/Cgt/4Vg=", "FldKW");
      lllIlllIlIII[lllIlllIlIIl[2]] = lIIlllIlIIllIl("7IimZ+SHXMPYqSSeSnB5yQ==", "AfenH");
      lllIlllIlIII[lllIlllIlIIl[3]] = lIIlllIlIIllIl("NJNEEeXQNKIESTS4lYSpXA==", "XakLO");
      lllIlllIlIII[lllIlllIlIIl[4]] = lIIlllIlIIllII("UEH6/NYZnes=", "Mefyl");
      lllIlllIlIII[lllIlllIlIIl[5]] = lIIlllIlIIllIl("bwPfU8Ct4EEx0W5bO+4H0A==", "FEVQh");
      lllIlllIlIII[lllIlllIlIIl[6]] = lIIlllIlIIllII("iMGxDI5KcoyWoi6tQun+9g==", "LPBIV");
      lllIlllIlIII[lllIlllIlIIl[7]] = lIIlllIlIIllII("5bE07nrP5eUAH77XEVm5OQ==", "QMTsn");
      lllIlllIlIII[lllIlllIlIIl[8]] = lIIlllIlIIlllI("LSEWOlQnOgY5ABc=", "dUsWt");
      lllIlllIlIII[lllIlllIlIIl[9]] = lIIlllIlIIlllI("BxY/Dxk6FzsT", "NxIjw");
      lllIlllIlIII[lllIlllIlIIl[10]] = lIIlllIlIIllII("QcAVYnpGtrw=", "FccyS");
      lllIlllIlIII[lllIlllIlIIl[11]] = lIIlllIlIIllIl("3IYZdyKoBAvXjOWaMndnWA==", "gotVL");
      lllIlllIlIII[lllIlllIlIIl[12]] = lIIlllIlIIllIl("snXK04miTlo=", "BmyXr");
      lllIlllIlIII[lllIlllIlIIl[14]] = lIIlllIlIIllII("fz0jz3G3eYg=", "JInvV");
      lllIlllIlIII[lllIlllIlIIl[16]] = lIIlllIlIIllIl("ZmmtOdzk5OAQFDQU1G2Pxw==", "ZJCIb");
      lllIlllIlIII[lllIlllIlIIl[17]] = lIIlllIlIIllIl("lfgShFq3IM0=", "gNfPq");
      lllIlllIlIII[lllIlllIlIIl[18]] = lIIlllIlIIllIl("5vluUOvL8nqcAthBtuEQtA==", "CiPVa");
      lllIlllIlIII[lllIlllIlIIl[19]] = lIIlllIlIIlllI("AyIXEzU=", "QCsrG");
      lllIlllIlIII[lllIlllIlIIl[13]] = lIIlllIlIIllII("+O0L0wscuYhZpokt8GiwbA==", "HlmiD");
      lllIlllIlIII[lllIlllIlIIl[20]] = lIIlllIlIIlllI("KSwjERQNbzoXBh0jMgs=", "hOWxb");
      lllIlllIlIII[lllIlllIlIIl[21]] = lIIlllIlIIllIl("5mlC6uqYra3cLnBtj26asw==", "DblzU");
      lllIlllIlIII[lllIlllIlIIl[22]] = lIIlllIlIIllIl("UVBdrraUic9l2uwHOx980A==", "Kaggi");
      lllIlllIlIII[lllIlllIlIIl[23]] = lIIlllIlIIllII("2Xd+KPJo2bZ7x9TcNFLEmw==", "ohdQw");
      lllIlllIlIII[lllIlllIlIIl[25]] = lIIlllIlIIlllI("MQEeMwMrAVI=", "FdrPl");
      lllIlllIlIII[lllIlllIlIIl[26]] = lIIlllIlIIllIl("xGDgd7CS/Ug=", "GKnzo");
      lllIlllIlIII[lllIlllIlIIl[30]] = lIIlllIlIIllII("k4kU3HUlItLvc0GRcqDQ9Q==", "JpCtd");
      lllIlllIlIII[lllIlllIlIIl[33]] = lIIlllIlIIllII("rFbXXY1QTC4=", "otARI");
      lllIlllIlIII[lllIlllIlIIl[34]] = lIIlllIlIIllII("eHh7OJblnPk=", "tdmbW");
      lllIlllIlIII[lllIlllIlIIl[35]] = lIIlllIlIIllIl("fo8/xZ50CGY=", "iZNFe");
      lllIlllIlIII[lllIlllIlIIl[38]] = lIIlllIlIIlllI("Ug==", "wWVCY");
      lllIlllIlIII[lllIlllIlIIl[39]] = lIIlllIlIIllIl("7epD35M/T+E=", "sIFvP");
   }
}
