package rr.snowhack.snow.gui.rgui.component.listen;

import rr.snowhack.snow.gui.rgui.component.Component;

public interface UpdateListener<T extends Component> {
   void updateSize(T var1, int var2, int var3);

   void updateLocation(T var1, int var2, int var3);
}
