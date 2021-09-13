package rr.snowhack.snow.gui.rgui.render;

import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;

public interface ComponentUI<T extends Component> {
   void renderComponent(T var1, FontRenderer var2);

   void handleSizeComponent(T var1);

   void handleMouseDown(T var1, int var2, int var3, int var4);

   void handleMouseRelease(T var1, int var2, int var3, int var4);

   void handleKeyUp(T var1, int var2);

   Class<? extends Component> getHandledClass();

   void handleScroll(T var1, int var2, int var3, int var4, boolean var5);

   void handleAddComponent(T var1, Container var2);

   void handleMouseDrag(T var1, int var2, int var3, int var4);

   void handleKeyDown(T var1, int var2);
}
