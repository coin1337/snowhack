package rr.snowhack.snow.event.events;

import net.minecraft.client.gui.GuiScreen;

public class GuiScreenEvent {
   // $FF: synthetic field
   private GuiScreen screen;

   public GuiScreen getScreen() {
      return lllllllllllllllIlIlIIllllIlIIlll.screen;
   }

   public GuiScreenEvent(GuiScreen lllllllllllllllIlIlIIllllIlIllII) {
      lllllllllllllllIlIlIIllllIlIlIll.screen = lllllllllllllllIlIlIIllllIlIllII;
   }

   public void setScreen(GuiScreen lllllllllllllllIlIlIIllllIlIIIIl) {
      lllllllllllllllIlIlIIllllIlIIIlI.screen = lllllllllllllllIlIlIIllllIlIIIIl;
   }

   public static class Displayed extends GuiScreenEvent {
      public Displayed(GuiScreen lllllllllllllllIlIIIlllIIIIIIIII) {
         super(lllllllllllllllIlIIIlllIIIIIIIII);
      }
   }

   public static class Closed extends GuiScreenEvent {
      public Closed(GuiScreen lllllllllllllllIIlllIlIllIllIIIl) {
         super(lllllllllllllllIIlllIlIllIllIIIl);
      }
   }
}
