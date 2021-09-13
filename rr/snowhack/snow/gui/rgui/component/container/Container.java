package rr.snowhack.snow.gui.rgui.component.container;

import java.util.ArrayList;
import rr.snowhack.snow.gui.rgui.component.Component;

public interface Container extends Component {
   boolean penetrateTest(int var1, int var2);

   Container addChild(Component... var1);

   void renderChildren();

   ArrayList<Component> getChildren();

   int getOriginOffsetX();

   int getOriginOffsetY();

   Container removeChild(Component var1);

   Component getComponentAt(int var1, int var2);

   boolean hasChild(Component var1);
}
