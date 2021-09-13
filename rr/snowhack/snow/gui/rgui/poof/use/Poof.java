package rr.snowhack.snow.gui.rgui.poof.use;

import java.lang.reflect.ParameterizedType;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.poof.IPoof;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;

public abstract class Poof<T extends Component, S extends PoofInfo> implements IPoof<T, S> {
   // $FF: synthetic field
   private Class<T> componentclass;
   // $FF: synthetic field
   private Class<S> infoclass;
   // $FF: synthetic field
   private static final int[] lllllIllllII;

   public Class getComponentClass() {
      return lllllllllllllllIlIIllIIIllIIllIl.componentclass;
   }

   private static void lIlIIlIIIlIllI() {
      lllllIllllII = new int[2];
      lllllIllllII[0] = (83 ^ 30) & ~(67 ^ 14);
      lllllIllllII[1] = " ".length();
   }

   public Class<S> getInfoClass() {
      return lllllllllllllllIlIIllIIIllIIlIlI.infoclass;
   }

   public Poof() {
      lllllllllllllllIlIIllIIIllIIllll.componentclass = (Class)((ParameterizedType)lllllllllllllllIlIIllIIIllIIllll.getClass().getGenericSuperclass()).getActualTypeArguments()[lllllIllllII[0]];
      lllllllllllllllIlIIllIIIllIIllll.infoclass = (Class)((ParameterizedType)lllllllllllllllIlIIllIIIllIIllll.getClass().getGenericSuperclass()).getActualTypeArguments()[lllllIllllII[1]];
   }

   static {
      lIlIIlIIIlIllI();
   }
}
