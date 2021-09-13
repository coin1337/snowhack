package rr.snowhack.snow.gui.rgui.component.use;

import rr.snowhack.snow.gui.rgui.component.AbstractComponent;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.Poof;

public class Button extends AbstractComponent {
   // $FF: synthetic field
   private String name;
   // $FF: synthetic field
   private static final int[] lllllIlIlIll;

   public void kill() {
   }

   public Button(String lllllllllllllllIlIIllIlllIlIlIlI, int lllllllllllllllIlIIllIlllIlIllll, int lllllllllllllllIlIIllIlllIlIIllI) {
      lllllllllllllllIlIIllIlllIllIIll.name = lllllllllllllllIlIIllIlllIlIlIlI;
      lllllllllllllllIlIIllIlllIllIIll.setX(lllllllllllllllIlIIllIlllIlIllll);
      lllllllllllllllIlIIllIlllIllIIll.setY(lllllllllllllllIlIIllIlllIlIIllI);
   }

   private static void lIlIIIlllIllll() {
      lllllIlIlIll = new int[1];
      lllllIlIlIll[0] = (247 ^ 186 ^ "   ".length() << " ".length()) & ((132 ^ 129) << (" ".length() << " ".length()) ^ 206 ^ 145 ^ -" ".length());
   }

   public String getName() {
      return lllllllllllllllIlIIllIlllIlIIIIl.name;
   }

   public Button(String lllllllllllllllIlIIllIlllIlllllI) {
      this(lllllllllllllllIlIIllIlllIlllllI, lllllIlIlIll[0], lllllIlIlIll[0]);
      lllllllllllllllIlIIllIlllIllllll.addMouseListener(new MouseListener() {
         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIlIlIlIIlllIII) {
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIlIlIlIIlllllI) {
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIlIlIlIIllllII) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIlIlIlIlIIIIlI) {
            lllllllllllllllIlIIllIlllIllllll.callPoof(Button.ButtonPoof.class, new Button.ButtonPoof.ButtonInfo(lllllllllllllllIlIIlIlIlIlIIIIlI.getButton(), lllllllllllllllIlIIlIlIlIlIIIIlI.getX(), lllllllllllllllIlIIlIlIlIlIIIIlI.getY()));
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIlIlIlIIlllIlI) {
         }
      });
   }

   public void setName(String lllllllllllllllIlIIllIlllIIllIIl) {
      lllllllllllllllIlIIllIlllIIllIll.name = lllllllllllllllIlIIllIlllIIllIIl;
   }

   static {
      lIlIIIlllIllll();
   }

   public abstract static class ButtonPoof<T extends Button, S extends Button.ButtonPoof.ButtonInfo> extends Poof<T, S> {
      // $FF: synthetic field
      Button.ButtonPoof.ButtonInfo info;

      public static class ButtonInfo extends PoofInfo {
         // $FF: synthetic field
         int x;
         // $FF: synthetic field
         int y;
         // $FF: synthetic field
         int button;

         public int getButton() {
            return lllllllllllllllIIllllllIllIllIIl.button;
         }

         public int getX() {
            return lllllllllllllllIIllllllIllIlllll.x;
         }

         public int getY() {
            return lllllllllllllllIIllllllIllIlllIl.y;
         }

         public ButtonInfo(int lllllllllllllllIIllllllIlllIlIII, int lllllllllllllllIIllllllIlllIIlll, int lllllllllllllllIIllllllIlllIIIlI) {
            lllllllllllllllIIllllllIlllIlIIl.button = lllllllllllllllIIllllllIlllIlIII;
            lllllllllllllllIIllllllIlllIlIIl.x = lllllllllllllllIIllllllIlllIIlll;
            lllllllllllllllIIllllllIlllIlIIl.y = lllllllllllllllIIllllllIlllIIIlI;
         }
      }
   }
}
