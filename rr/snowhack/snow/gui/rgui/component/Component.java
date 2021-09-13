package rr.snowhack.snow.gui.rgui.component;

import java.util.ArrayList;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.listen.KeyListener;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.component.listen.TickListener;
import rr.snowhack.snow.gui.rgui.component.listen.UpdateListener;
import rr.snowhack.snow.gui.rgui.poof.IPoof;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.render.ComponentUI;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public interface Component {
   void setFocussed(boolean var1);

   ArrayList<RenderListener> getRenderListeners();

   Theme getTheme();

   int getX();

   int getPriority();

   void addUpdateListener(UpdateListener var1);

   void addKeyListener(KeyListener var1);

   int getHeight();

   int getMaximumHeight();

   int getMinimumWidth();

   Component setMinimumHeight(int var1);

   Component setMinimumWidth(int var1);

   void setY(int var1);

   void setX(int var1);

   ArrayList<UpdateListener> getUpdateListeners();

   void setHeight(int var1);

   int getMaximumWidth();

   void setAffectLayout(boolean var1);

   ArrayList<MouseListener> getMouseListeners();

   Container getParent();

   boolean isVisible();

   Component setMaximumHeight(int var1);

   boolean isPressed();

   void setTheme(Theme var1);

   int getMinimumHeight();

   void kill();

   void callPoof(Class<? extends IPoof> var1, PoofInfo var2);

   ComponentUI getUI();

   boolean doAffectLayout();

   int getY();

   ArrayList<KeyListener> getKeyListeners();

   boolean isHovered();

   void addRenderListener(RenderListener var1);

   void setParent(Container var1);

   float getOpacity();

   boolean isFocussed();

   void addTickListener(TickListener var1);

   void setVisible(boolean var1);

   ArrayList<TickListener> getTickListeners();

   void setOpacity(float var1);

   Component setMaximumWidth(int var1);

   int getWidth();

   void addPoof(IPoof var1);

   boolean liesIn(Component var1);

   void setWidth(int var1);

   void addMouseListener(MouseListener var1);
}
