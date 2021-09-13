package rr.snowhack.snow.gui.snow.theme.ui;

import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.component.SettingsPanel;

public class RootSettingsPanelUI extends AbstractComponentUI<SettingsPanel> {
   // $FF: synthetic field
   private static final int[] lIIIIIIIIlIII;

   static {
      lIlIIllIIllIIl();
   }

   public void renderComponent(SettingsPanel lllllllllllllllIlIIlIIlIIllllIll, FontRenderer lllllllllllllllIlIIlIIlIIllllIlI) {
      GL11.glColor4f(0.2F, 0.2F, 0.2F, 0.75F);
      RenderHelper.drawOutlinedRoundedRectangle(lIIIIIIIIlIII[0], lIIIIIIIIlIII[0], lllllllllllllllIlIIlIIlIIllllIll.getWidth(), lllllllllllllllIlIIlIIlIIllllIll.getHeight(), 0.2F, 0.2F, 0.2F, 0.8F, lllllllllllllllIlIIlIIlIIllllIll.getOpacity(), 1.0F);
   }

   private static void lIlIIllIIllIIl() {
      lIIIIIIIIlIII = new int[1];
      lIIIIIIIIlIII[0] = ((225 ^ 128) << " ".length() ^ 137 + 72 - 118 + 70) & (107 + 182 - 190 + 156 ^ (82 ^ 117) << (" ".length() << " ".length()) ^ -" ".length());
   }
}
