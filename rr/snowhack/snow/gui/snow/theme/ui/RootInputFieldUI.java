package rr.snowhack.snow.gui.snow.theme.ui;

import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.use.InputField;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;

public class RootInputFieldUI<T extends InputField> extends AbstractComponentUI<InputField> {
   // $FF: synthetic field
   private static final int[] lllllIIllIIl;

   static {
      lIlIIIlIlIllIl();
   }

   private static void lIlIIIlIlIllIl() {
      lllllIIllIIl = new int[1];
      lllllIIllIIl[0] = ((8 ^ 51) << " ".length() ^ 126 ^ 17) << "   ".length();
   }

   public void handleAddComponent(InputField lllllllllllllllIlIIllllllIIlIlII, Container lllllllllllllllIlIIllllllIIlIIll) {
      lllllllllllllllIlIIllllllIIlIlII.setWidth(lllllIIllIIl[0]);
      lllllllllllllllIlIIllllllIIlIlII.setHeight(lllllllllllllllIlIIllllllIIlIlII.getTheme().getFontRenderer().getFontHeight());
   }

   public void renderComponent(InputField lllllllllllllllIlIIllllllIIllIIl, FontRenderer lllllllllllllllIlIIllllllIIllIII) {
      GL11.glColor3f(0.33F, 0.22F, 0.22F);
      RenderHelper.drawFilledRectangle(0.0F, 0.0F, (float)lllllllllllllllIlIIllllllIIllIIl.getWidth(), (float)lllllllllllllllIlIIllllllIIllIIl.getHeight());
      GL11.glLineWidth(1.5F);
      GL11.glColor4f(0.33F, 0.33F, 1.0F, 0.6F);
      RenderHelper.drawRectangle(0.0F, 0.0F, (float)lllllllllllllllIlIIllllllIIllIIl.getWidth(), (float)lllllllllllllllIlIIllllllIIllIIl.getHeight());
   }
}
