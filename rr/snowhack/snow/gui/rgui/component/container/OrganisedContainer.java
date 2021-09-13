package rr.snowhack.snow.gui.rgui.component.container;

import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.layout.Layout;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public class OrganisedContainer extends AbstractContainer {
   // $FF: synthetic field
   Layout layout;

   public void setLayout(Layout lllllllllllllllIlIIlIIlIIllIIIlI) {
      lllllllllllllllIlIIlIIlIIllIIIll.layout = lllllllllllllllIlIIlIIlIIllIIIlI;
   }

   public OrganisedContainer(Theme lllllllllllllllIlIIlIIlIIllIlIlI, Layout lllllllllllllllIlIIlIIlIIllIlIIl) {
      super(lllllllllllllllIlIIlIIlIIllIlIlI);
      lllllllllllllllIlIIlIIlIIllIlllI.layout = lllllllllllllllIlIIlIIlIIllIlIIl;
   }

   public Layout getLayout() {
      return lllllllllllllllIlIIlIIlIIllIIllI.layout;
   }

   public void setOriginOffsetX(int lllllllllllllllIlIIlIIlIIlIlIlII) {
      super.setOriginOffsetX(lllllllllllllllIlIIlIIlIIlIlIlII);
      lllllllllllllllIlIIlIIlIIlIlIlIl.layout.organiseContainer(lllllllllllllllIlIIlIIlIIlIlIlIl);
   }

   public Container addChild(Component... lllllllllllllllIlIIlIIlIIlIllIlI) {
      super.addChild(lllllllllllllllIlIIlIIlIIlIllIlI);
      "".length();
      lllllllllllllllIlIIlIIlIIlIlllIl.layout.organiseContainer(lllllllllllllllIlIIlIIlIIlIlllIl);
      return lllllllllllllllIlIIlIIlIIlIlllIl;
   }

   public void setOriginOffsetY(int lllllllllllllllIlIIlIIlIIlIIlllI) {
      super.setOriginOffsetY(lllllllllllllllIlIIlIIlIIlIIlllI);
      lllllllllllllllIlIIlIIlIIlIIllll.layout.organiseContainer(lllllllllllllllIlIIlIIlIIlIIllll);
   }
}
