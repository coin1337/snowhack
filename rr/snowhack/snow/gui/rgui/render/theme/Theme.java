package rr.snowhack.snow.gui.rgui.render.theme;

import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.render.ComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;

public interface Theme {
   ComponentUI getUIForComponent(Component var1);

   FontRenderer getFontRenderer();
}
