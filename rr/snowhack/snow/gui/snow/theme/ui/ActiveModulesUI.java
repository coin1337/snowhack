package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.component.AlignedComponent;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.component.ActiveModules;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.module.modules.client.GUIColor;
import rr.snowhack.snow.util.ColourUtils;
import rr.snowhack.snow.util.Wrapper;

public class ActiveModulesUI extends AbstractComponentUI<ActiveModules> {
   // $FF: synthetic field
   private static final int[] lIIIIllllIIII;
   // $FF: synthetic field
   private static final String[] lIIIIlllIllII;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;

   private static boolean lIlIllIlllIlIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIllIlllIlII(int var0) {
      return var0 == 0;
   }

   private static void lIlIllIllIllll() {
      lIIIIllllIIII = new int[18];
      lIIIIllllIIII[0] = ((79 ^ 90) << " ".length() ^ 208 ^ 199) & (162 + 138 - 158 + 47 ^ " ".length() << (0 ^ 7) ^ -" ".length());
      lIIIIllllIIII[1] = (16 ^ 25) << " ".length();
      lIIIIllllIIII[2] = " ".length();
      lIIIIllllIIII[3] = " ".length() << " ".length();
      lIIIIllllIIII[4] = (184 ^ 181) << " ".length();
      lIIIIllllIIII[5] = (99 ^ 122) << (" ".length() << " ".length());
      lIIIIllllIIII[6] = "   ".length();
      lIIIIllllIIII[7] = " ".length() << (" ".length() << " ".length());
      lIIIIllllIIII[8] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIllllIIII[9] = ((20 ^ 29) << "   ".length()) + ((52 ^ 61) << (" ".length() << (" ".length() << " ".length()))) - (240 ^ 147) + ((85 ^ 16) << " ".length());
      lIIIIllllIIII[10] = " ".length() << "   ".length();
      lIIIIllllIIII[11] = (62 + 74 - 105 + 158 << " ".length()) + ((28 ^ 89) << " ".length()) - (119 + 106 - -10 + 106) + (14 + 265 - 267 + 261 << " ".length()) << (" ".length() << " ".length());
      lIIIIllllIIII[12] = 1426 + 1358 - 2295 + 1032 << " ".length();
      lIIIIllllIIII[13] = 545 + 722 - 751 + 1791 + (136 + 183 - 162 + 90 << "   ".length()) - (261 + 324 - 491 + 1147) + 497 + 477 - 702 + 239;
      lIIIIllllIIII[14] = 127 ^ 122;
      lIIIIllllIIII[15] = "   ".length() << " ".length();
      lIIIIllllIIII[16] = -" ".length();
      lIIIIllllIIII[17] = (233 ^ 196) << (" ".length() << " ".length()) ^ 153 + 132 - 242 + 136;
   }

   private static String lIlIllIllIIlII(String lllllllllllllllIIlllIllllllllIIl, String lllllllllllllllIIlllIllllllllIlI) {
      try {
         float lllllllllllllllIIlllIlllllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIllllllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIlllIlllllllllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIlllllllllIl.init(lIIIIllllIIII[3], lllllllllllllllIIlllIlllllllIlll);
         return new String(lllllllllllllllIIlllIlllllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIllllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIllIlllIlll(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIllIlllIIll(Object var0, Object var1) {
      return var0 == var1;
   }

   public void renderComponent(ActiveModules lllllllllllllllIIllllIIIlIllIIII, FontRenderer lllllllllllllllIIllllIIIlIlIlllI) {
      List<Module> lllllllllllllllIIllllIIIlIlIllII = (List)ModuleManager.getModules().stream().filter(Module::isEnabled).sorted(Comparator.comparing((lllllllllllllllIIllllIIIIIlIlIll) -> {
         CFontRenderer var10000 = lllllllllllllllIIllllIIIIIlIlIlI.cFontRenderer;
         StringBuilder var10001 = (new StringBuilder()).append(lllllllllllllllIIllllIIIIIlIlIll.getName());
         String var10002;
         if (lIlIllIlllIlIl(lllllllllllllllIIllllIIIIIlIlIll.getHudInfo())) {
            var10002 = lIIIIlllIllII[lIIIIllllIIII[14]];
            "".length();
            if ("   ".length() < "   ".length()) {
               return null;
            }
         } else {
            var10002 = String.valueOf((new StringBuilder()).append(lllllllllllllllIIllllIIIIIlIlIll.getHudInfo()).append(lIIIIlllIllII[lIIIIllllIIII[15]]));
         }

         int var3 = var10000.getStringWidth(String.valueOf(var10001.append(var10002)));
         int var4;
         if (lIlIllIlllIlll(lllllllllllllllIIllllIIIlIllIIII.sort_up)) {
            var4 = lIIIIllllIIII[16];
            "".length();
            if (-((179 ^ 186) << (" ".length() << (" ".length() << " ".length())) ^ (89 ^ 124) << (" ".length() << " ".length())) > 0) {
               return null;
            }
         } else {
            var4 = lIIIIllllIIII[2];
         }

         return var3 * var4;
      })).collect(Collectors.toList());
      int[] var10000 = new int[lIIIIllllIIII[2]];
      var10000[lIIIIllllIIII[0]] = lIIIIllllIIII[3];
      int[] lllllllllllllllIIllllIIIlIlIlIlI = var10000;
      if (lIlIllIlllIIIl(lllllllllllllllIIllllIIIlIllIIII.getParent().getY(), lIIIIllllIIII[4]) && lIlIllIlllIIlI(Wrapper.getPlayer().func_70651_bq().size()) && lIlIllIlllIIll(lllllllllllllllIIllllIIIlIllIIII.getAlignment(), AlignedComponent.Alignment.RIGHT) && lIlIllIlllIlII(lIlIllIlllIIII(lllllllllllllllIIllllIIIlIllIIII.getParent().getOpacity(), 0.0F))) {
         lllllllllllllllIIllllIIIlIlIlIlI[lIIIIllllIIII[0]] = Math.max(lllllllllllllllIIllllIIIlIllIIII.getParent().getY(), lIIIIllllIIII[4] - lllllllllllllllIIllllIIIlIllIIII.getParent().getY());
      }

      float[] var8 = new float[lIIIIllllIIII[2]];
      var8[lIIIIllllIIII[0]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
      float[] lllllllllllllllIIllllIIIlIlIlIII = var8;
      int var9;
      if (lIlIllIlllIIll(lllllllllllllllIIllllIIIlIllIIII.getAlignment(), AlignedComponent.Alignment.LEFT)) {
         var9 = lIIIIllllIIII[2];
         "".length();
         if (-" ".length() >= 0) {
            return;
         }
      } else {
         var9 = lIIIIllllIIII[0];
      }

      Function lllllllllllllllIIllllIIIlIlIIlIl;
      switch(null.$SwitchMap$rr$snowhack$snow$gui$rgui$component$AlignedComponent$Alignment[lllllllllllllllIIllllIIIlIllIIII.getAlignment().ordinal()]) {
      case 1:
         lllllllllllllllIIllllIIIlIlIIlIl = (lllllllllllllllIIllllIIIIIllIIll) -> {
            return lllllllllllllllIIllllIIIlIllIIII.getWidth() - lllllllllllllllIIllllIIIIIllIIll;
         };
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
         break;
      case 2:
         lllllllllllllllIIllllIIIlIlIIlIl = (lllllllllllllllIIllllIIIIIllIlll) -> {
            return lllllllllllllllIIllllIIIlIllIIII.getWidth() / lIIIIllllIIII[3] - lllllllllllllllIIllllIIIIIllIlll / lIIIIllllIIII[3];
         };
         "".length();
         if (" ".length() << " ".length() < " ".length()) {
            return;
         }
         break;
      case 3:
      default:
         lllllllllllllllIIllllIIIlIlIIlIl = (lllllllllllllllIIllllIIIIIllllIl) -> {
            return lIIIIllllIIII[0];
         };
      }

      lllllllllllllllIIllllIIIlIlIllII.stream().forEach((lllllllllllllllIIllllIIIIlIlIlII) -> {
         String lllllllllllllllIIllllIIIIlIlIIll = lllllllllllllllIIllllIIIIlIlIlII.getHudInfo();
         StringBuilder var10000 = (new StringBuilder()).append(lllllllllllllllIIllllIIIIlIlIlII.getName());
         String var10001;
         if (lIlIllIlllIlIl(lllllllllllllllIIllllIIIIlIlIIll)) {
            var10001 = lIIIIlllIllII[lIIIIllllIIII[2]];
            "".length();
            if (null != null) {
               return;
            }
         } else {
            var10001 = String.valueOf((new StringBuilder()).append(lIIIIlllIllII[lIIIIllllIIII[3]]).append(Command.SECTIONSIGN()).append(lIIIIlllIllII[lIIIIllllIIII[6]]).append(lllllllllllllllIIllllIIIIlIlIIll).append(lIIIIlllIllII[lIIIIllllIIII[7]]));
         }

         String lllllllllllllllIIllllIIIIlIlIIlI = String.valueOf(var10000.append(var10001));
         short lllllllllllllllIIllllIIIIlIIIIll = lllllllllllllllIIllllIIIIlIIlIll.cFontRenderer.getHeight();
         double lllllllllllllllIIllllIIIIlIIIIlI = Color.HSBtoRGB(lllllllllllllllIIllllIIIlIlIlIII[lIIIIllllIIII[0]], 1.0F, 1.0F);
         char lllllllllllllllIIllllIIIIlIIIIIl = lllllllllllllllIIllllIIIIlIIIIlI >> lIIIIllllIIII[8] & lIIIIllllIIII[9];
         boolean lllllllllllllllIIllllIIIIlIIIIII = lllllllllllllllIIllllIIIIlIIIIlI >> lIIIIllllIIII[10] & lIIIIllllIIII[9];
         char lllllllllllllllIIllllIIIIIllllll = lllllllllllllllIIllllIIIIlIIIIlI & lIIIIllllIIII[9];
         int lllllllllllllllIIllllIIIIlIIllII;
         if (lIlIllIlllIlll(GUIColor.shouldRainbow())) {
            lllllllllllllllIIllllIIIIlIIllII = ColourUtils.toRGBA(lllllllllllllllIIllllIIIIlIIIIIl, lllllllllllllllIIllllIIIIlIIIIII, lllllllllllllllIIllllIIIIIllllll, lIIIIllllIIII[9]);
            "".length();
            if (((46 ^ 39) << " ".length() & ~((68 ^ 77) << " ".length())) != 0) {
               return;
            }
         } else {
            lllllllllllllllIIllllIIIIlIIllII = ColourUtils.toRGBA(GUIColor.getRed(), GUIColor.getGreen(), GUIColor.getBlue(), lIIIIllllIIII[9]);
         }

         GL11.glLineWidth(1.0F);
         GL11.glDisable(lIIIIllllIIII[11]);
         GL11.glEnable(lIIIIllllIIII[12]);
         GL11.glEnable(lIIIIllllIIII[13]);
         lllllllllllllllIIllllIIIIlIIlIll.cFontRenderer.drawStringWithShadow(lllllllllllllllIIllllIIIIlIlIIlI, (double)(Integer)lllllllllllllllIIllllIIIlIlIIlIl.apply(lllllllllllllllIIllllIIIIlIIlIll.cFontRenderer.getStringWidth(lllllllllllllllIIllllIIIIlIlIIlI)), (double)lllllllllllllllIIllllIIIlIlIlIlI[lIIIIllllIIII[0]], lllllllllllllllIIllllIIIIlIIllII);
         "".length();
         GL11.glEnable(lIIIIllllIIII[11]);
         GL11.glDisable(lIIIIllllIIII[12]);
         int var14 = lIIIIllllIIII[0];
         lllllllllllllllIIllllIIIlIlIlIII[var14] += 0.02F;
         var14 = lIIIIllllIIII[0];
         lllllllllllllllIIllllIIIlIlIlIlI[var14] += lllllllllllllllIIllllIIIIlIIIIll + lIIIIllllIIII[7];
         lllllllllllllllIIllllIIIlIllIIII.setHeight(lllllllllllllllIIllllIIIlIlIlIlI[lIIIIllllIIII[0]]);
      });
   }

   public void handleSizeComponent(ActiveModules lllllllllllllllIIllllIIIlIIIIllI) {
      lllllllllllllllIIllllIIIlIIIIllI.setWidth(lIIIIllllIIII[5]);
      lllllllllllllllIIllllIIIlIIIIllI.setHeight(lIIIIllllIIII[5]);
   }

   private static String lIlIllIllIlIIl(String lllllllllllllllIIllllIIIIIIlIIII, String lllllllllllllllIIllllIIIIIIIlIlI) {
      lllllllllllllllIIllllIIIIIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIIIIIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllllIIIIIIIlllI = new StringBuilder();
      char[] lllllllllllllllIIllllIIIIIIIllIl = lllllllllllllllIIllllIIIIIIIlIlI.toCharArray();
      int lllllllllllllllIIllllIIIIIIIIlll = lIIIIllllIIII[0];
      short lllllllllllllllIIllllIIIIIIIIllI = lllllllllllllllIIllllIIIIIIlIIII.toCharArray();
      String lllllllllllllllIIllllIIIIIIIIlIl = lllllllllllllllIIllllIIIIIIIIllI.length;
      int lllllllllllllllIIllllIIIIIIIIlII = lIIIIllllIIII[0];

      do {
         if (!lIlIllIlllIIIl(lllllllllllllllIIllllIIIIIIIIlII, lllllllllllllllIIllllIIIIIIIIlIl)) {
            return String.valueOf(lllllllllllllllIIllllIIIIIIIlllI);
         }

         String lllllllllllllllIIllllIIIIIIIIIll = lllllllllllllllIIllllIIIIIIIIllI[lllllllllllllllIIllllIIIIIIIIlII];
         lllllllllllllllIIllllIIIIIIIlllI.append((char)(lllllllllllllllIIllllIIIIIIIIIll ^ lllllllllllllllIIllllIIIIIIIllIl[lllllllllllllllIIllllIIIIIIIIlll % lllllllllllllllIIllllIIIIIIIllIl.length]));
         "".length();
         ++lllllllllllllllIIllllIIIIIIIIlll;
         ++lllllllllllllllIIllllIIIIIIIIlII;
         "".length();
      } while(-"   ".length() < 0);

      return null;
   }

   private static boolean lIlIllIlllIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIlIllIlllIIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void lIlIllIllIlllI() {
      lIIIIlllIllII = new String[lIIIIllllIIII[17]];
      lIIIIlllIllII[lIIIIllllIIII[0]] = lIlIllIllIIIlI("q0moyb0u4kg=", "gKvnt");
      lIIIIlllIllII[lIIIIllllIIII[2]] = lIlIllIllIIlII("azMPNcPzc/w=", "vXmLv");
      lIIIIlllIllII[lIIIIllllIIII[3]] = lIlIllIllIlIIl("cg==", "RzXvx");
      lIIIIlllIllII[lIIIIllllIIII[6]] = lIlIllIllIlIIl("cwnDkAk=", "DRwov");
      lIIIIlllIllII[lIIIIllllIIII[7]] = lIlIllIllIIIlI("z5d13eJ28wU=", "PaCeK");
      lIIIIlllIllII[lIIIIllllIIII[14]] = lIlIllIllIlIIl("", "mUChp");
      lIIIIlllIllII[lIIIIllllIIII[15]] = lIlIllIllIIlII("jji94gwfjEU=", "SDQfn");
   }

   private static String lIlIllIllIIIlI(String lllllllllllllllIIllllIIIIIIllllI, String lllllllllllllllIIllllIIIIIIlllll) {
      try {
         SecretKeySpec lllllllllllllllIIllllIIIIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIIIIIIlllll.getBytes(StandardCharsets.UTF_8)), lIIIIllllIIII[10]), "DES");
         Cipher lllllllllllllllIIllllIIIIIlIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIIllllIIIIIlIIIlI.init(lIIIIllllIIII[3], lllllllllllllllIIllllIIIIIlIIIll);
         return new String(lllllllllllllllIIllllIIIIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIIIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public ActiveModulesUI() {
      lllllllllllllllIIllllIIIllIlIlll.cFontRenderer = new CFontRenderer(new Font(lIIIIlllIllII[lIIIIllllIIII[0]], lIIIIllllIIII[0], lIIIIllllIIII[1]), (boolean)lIIIIllllIIII[2], (boolean)lIIIIllllIIII[0]);
   }

   static {
      lIlIllIllIllll();
      lIlIllIllIlllI();
   }

   private static boolean lIlIllIlllIIlI(int var0) {
      return var0 > 0;
   }
}
