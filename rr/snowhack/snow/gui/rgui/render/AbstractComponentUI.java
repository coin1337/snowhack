package rr.snowhack.snow.gui.rgui.render;

import java.lang.reflect.ParameterizedType;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;

public abstract class AbstractComponentUI<T extends Component> implements ComponentUI<T> {
   // $FF: synthetic field
   private Class<T> persistentClass;
   // $FF: synthetic field
   private static final int[] lIIIlIlIllIlI;

   public AbstractComponentUI() {
      lllllllllllllllIIllIlIlllllIIIlI.persistentClass = (Class)((ParameterizedType)lllllllllllllllIIllIlIlllllIIIlI.getClass().getGenericSuperclass()).getActualTypeArguments()[lIIIlIlIllIlI[0]];
   }

   public void renderComponent(T lllllllllllllllIIllIlIllllIlllll, FontRenderer lllllllllllllllIIllIlIllllIllllI) {
   }

   static {
      lIllIIIlIlIIIl();
   }

   public void handleMouseRelease(T lllllllllllllllIIllIlIllllIlIlll, int lllllllllllllllIIllIlIllllIlIllI, int lllllllllllllllIIllIlIllllIlIlIl, int lllllllllllllllIIllIlIllllIlIlII) {
   }

   public void handleMouseDown(T lllllllllllllllIIllIlIllllIlllII, int lllllllllllllllIIllIlIllllIllIll, int lllllllllllllllIIllIlIllllIllIlI, int lllllllllllllllIIllIlIllllIllIIl) {
   }

   public void handleAddComponent(T lllllllllllllllIIllIlIllllIIIlll, Container lllllllllllllllIIllIlIllllIIIllI) {
   }

   public Class<? extends Component> getHandledClass() {
      return lllllllllllllllIIllIlIlllIllllII.persistentClass;
   }

   public void handleKeyDown(T lllllllllllllllIIllIlIllllIIIlII, int lllllllllllllllIIllIlIllllIIIIll) {
   }

   public void handleMouseDrag(T lllllllllllllllIIllIlIllllIlIIlI, int lllllllllllllllIIllIlIllllIlIIIl, int lllllllllllllllIIllIlIllllIlIIII, int lllllllllllllllIIllIlIllllIIllll) {
   }

   private static void lIllIIIlIlIIIl() {
      lIIIlIlIllIlI = new int[1];
      lIIIlIlIllIlI[0] = (46 + 41 - -11 + 33 ^ (167 ^ 132) << (" ".length() << " ".length())) << " ".length() & (((70 ^ 103) << " ".length() ^ 243 ^ 190) << " ".length() ^ -" ".length());
   }

   public void handleScroll(T lllllllllllllllIIllIlIllllIIllIl, int lllllllllllllllIIllIlIllllIIllII, int lllllllllllllllIIllIlIllllIIlIll, int lllllllllllllllIIllIlIllllIIlIlI, boolean lllllllllllllllIIllIlIllllIIlIIl) {
   }

   public void handleKeyUp(T lllllllllllllllIIllIlIllllIIIIIl, int lllllllllllllllIIllIlIllllIIIIII) {
   }

   public void handleSizeComponent(T lllllllllllllllIIllIlIlllIlllllI) {
   }
}
