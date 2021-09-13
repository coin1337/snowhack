package rr.snowhack.snow.gui.rgui.component.container.use;

import rr.snowhack.snow.gui.rgui.component.container.AbstractContainer;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public class Groupbox extends AbstractContainer {
   // $FF: synthetic field
   String name;

   public Groupbox(Theme lllllllllllllllIlIIIIIIllllllIIl, String lllllllllllllllIlIIIIIIllllllIII, int lllllllllllllllIlIIIIIIlllllIIlI, int lllllllllllllllIlIIIIIIlllllIIIl) {
      this(lllllllllllllllIlIIIIIIllllllIIl, lllllllllllllllIlIIIIIIllllllIII);
      lllllllllllllllIlIIIIIIllllllIlI.setX(lllllllllllllllIlIIIIIIlllllIIlI);
      lllllllllllllllIlIIIIIIllllllIlI.setY(lllllllllllllllIlIIIIIIlllllIIIl);
   }

   public void setName(String lllllllllllllllIlIIIIIIllllIlIlI) {
      lllllllllllllllIlIIIIIIllllIlIll.name = lllllllllllllllIlIIIIIIllllIlIlI;
   }

   public String getName() {
      return lllllllllllllllIlIIIIIIllllIlllI.name;
   }

   public Groupbox(Theme lllllllllllllllIlIIIIIlIIIIIIIIl, String lllllllllllllllIlIIIIIlIIIIIIIll) {
      super(lllllllllllllllIlIIIIIlIIIIIIIIl);
      lllllllllllllllIlIIIIIlIIIIIIIlI.name = lllllllllllllllIlIIIIIlIIIIIIIll;
   }
}
