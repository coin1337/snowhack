package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Color;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.component.SettingsPanel;
import rr.snowhack.snow.module.modules.client.GUIColor;

public class SettingsPanelUI extends AbstractComponentUI<SettingsPanel> {
   // $FF: synthetic field
   private static final int[] lIIIIIIIIllII;

   private static boolean lIlIIllIIllIll(int var0) {
      return var0 != 0;
   }

   private static void lIlIIllIIllIlI() {
      lIIIIIIIIllII = new int[7];
      lIIIIIIIIllII[0] = " ".length();
      lIIIIIIIIllII[1] = (44 + 79 - -5 + 19 ^ (143 ^ 132) << (" ".length() << (" ".length() << " ".length()))) << " ".length() & (((66 ^ 17) << " ".length() ^ 108 + 7 - 68 + 86) << " ".length() ^ -" ".length());
      lIIIIIIIIllII[2] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIIIIIllII[3] = 220 + 229 - 308 + 114;
      lIIIIIIIIllII[4] = " ".length() << "   ".length();
      lIIIIIIIIllII[5] = " ".length() << " ".length();
      lIIIIIIIIllII[6] = "   ".length();
   }

   static {
      lIlIIllIIllIlI();
   }

   public void renderComponent(SettingsPanel lllllllllllllllIlIIlIIlIIIlllIIl, FontRenderer lllllllllllllllIlIIlIIlIIlIIIIII) {
      super.renderComponent(lllllllllllllllIlIIlIIlIIIlllIIl, lllllllllllllllIlIIlIIlIIlIIIIII);
      float[] var10000 = new float[lIIIIIIIIllII[0]];
      var10000[lIIIIIIIIllII[1]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
      float[] lllllllllllllllIlIIlIIlIIIllllll = var10000;
      byte lllllllllllllllIlIIlIIlIIIllIllI = Color.HSBtoRGB(lllllllllllllllIlIIlIIlIIIllllll[lIIIIIIIIllII[1]], 1.0F, 1.0F);
      int lllllllllllllllIlIIlIIlIIIllllIl = lllllllllllllllIlIIlIIlIIIllIllI >> lIIIIIIIIllII[2] & lIIIIIIIIllII[3];
      int lllllllllllllllIlIIlIIlIIIllllII = lllllllllllllllIlIIlIIlIIIllIllI >> lIIIIIIIIllII[4] & lIIIIIIIIllII[3];
      float lllllllllllllllIlIIlIIlIIIllIIll = lllllllllllllllIlIIlIIlIIIllIllI & lIIIIIIIIllII[3];
      GL11.glColor4f(0.1F, 0.1F, 0.1F, 0.75F);
      RenderHelper.drawFilledRectangle(0.0F, 0.0F, (float)(lllllllllllllllIlIIlIIlIIIlllIIl.getWidth() + lIIIIIIIIllII[5]), (float)(lllllllllllllllIlIIlIIlIIIlllIIl.getHeight() + lIIIIIIIIllII[6]));
      if (lIlIIllIIllIll(GUIColor.shouldRainbow())) {
         GL11.glColor3f((float)lllllllllllllllIlIIlIIlIIIllllIl / 255.0F, (float)lllllllllllllllIlIIlIIlIIIllllII / 255.0F, (float)lllllllllllllllIlIIlIIlIIIllIIll / 255.0F);
         "".length();
         if (((61 ^ 84 ^ (76 ^ 81) << " ".length()) & ((74 ^ 35) << " ".length() ^ 13 + 99 - 16 + 33 ^ -" ".length())) != 0) {
            return;
         }
      } else {
         GL11.glColor3f((float)GUIColor.getRed() / 255.0F, (float)GUIColor.getGreen() / 255.0F, (float)GUIColor.getBlue() / 255.0F);
      }

      GL11.glLineWidth(0.5F);
      RenderHelper.drawRectangle(0.0F, 0.0F, (float)(lllllllllllllllIlIIlIIlIIIlllIIl.getWidth() + lIIIIIIIIllII[5]), (float)(lllllllllllllllIlIIlIIlIIIlllIIl.getHeight() + lIIIIIIIIllII[6]));
   }
}
