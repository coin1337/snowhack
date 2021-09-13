package rr.snowhack.snow.gui.rgui.poof;

import rr.snowhack.snow.gui.rgui.component.Component;

public interface IPoof<T extends Component, S extends PoofInfo> {
   void execute(T var1, S var2);

   Class getComponentClass();

   Class getInfoClass();
}
