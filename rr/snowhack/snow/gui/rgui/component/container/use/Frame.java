package rr.snowhack.snow.gui.rgui.component.container.use;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.OrganisedContainer;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.component.listen.UpdateListener;
import rr.snowhack.snow.gui.rgui.layout.Layout;
import rr.snowhack.snow.gui.rgui.layout.UselessLayout;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.FramePoof;
import rr.snowhack.snow.gui.rgui.poof.use.Poof;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;
import rr.snowhack.snow.gui.rgui.util.Docking;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;

public class Frame extends OrganisedContainer {
   // $FF: synthetic field
   boolean isPinned;
   // $FF: synthetic field
   boolean titleEnabled;
   // $FF: synthetic field
   boolean isMinimizeable;
   // $FF: synthetic field
   int trueheight;
   // $FF: synthetic field
   boolean isMinimized;
   // $FF: synthetic field
   boolean isLayoutWorking;
   // $FF: synthetic field
   boolean isPinDisplayed;
   // $FF: synthetic field
   private static final int[] lIIIIllllllll;
   // $FF: synthetic field
   int dy;
   // $FF: synthetic field
   int truemaxheight;
   // $FF: synthetic field
   boolean doDrag;
   // $FF: synthetic field
   boolean isHudFrame;
   // $FF: synthetic field
   String title;
   // $FF: synthetic field
   HashMap<Component, Boolean> visibilityMap;
   // $FF: synthetic field
   boolean isPinneable;
   // $FF: synthetic field
   boolean startDrag;
   // $FF: synthetic field
   boolean isCloseable;
   // $FF: synthetic field
   boolean boxEnabled;
   // $FF: synthetic field
   Docking docking;
   // $FF: synthetic field
   int dx;

   public boolean isPinned() {
      return lllllllllllllllIIlllIlllIIIlIlll.isPinned;
   }

   public void setDocking(Docking lllllllllllllllIIlllIllIlllIlllI) {
      lllllllllllllllIIlllIllIlllIllIl.docking = lllllllllllllllIIlllIllIlllIlllI;
   }

   public boolean isHudFrame() {
      return lllllllllllllllIIlllIllIllllllII.isHudFrame;
   }

   public Frame(Theme lllllllllllllllIIlllIlllIlIIllll, final Layout lllllllllllllllIIlllIlllIlIIlIlI, String lllllllllllllllIIlllIlllIlIIlIIl) {
      super(lllllllllllllllIIlllIlllIlIIllll, lllllllllllllllIIlllIlllIlIIlIlI);
      lllllllllllllllIIlllIlllIlIIllII.trueheight = lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.truemaxheight = lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.dx = lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.dy = lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.doDrag = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.startDrag = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.isMinimized = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.isMinimizeable = (boolean)lIIIIllllllll[1];
      lllllllllllllllIIlllIlllIlIIllII.isCloseable = (boolean)lIIIIllllllll[1];
      lllllllllllllllIIlllIlllIlIIllII.isPinned = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.isPinneable = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.boxEnabled = (boolean)lIIIIllllllll[1];
      lllllllllllllllIIlllIlllIlIIllII.titleEnabled = (boolean)lIIIIllllllll[1];
      lllllllllllllllIIlllIlllIlIIllII.isPinDisplayed = (boolean)lIIIIllllllll[1];
      lllllllllllllllIIlllIlllIlIIllII.docking = Docking.NONE;
      lllllllllllllllIIlllIlllIlIIllII.isHudFrame = (boolean)lIIIIllllllll[0];
      lllllllllllllllIIlllIlllIlIIllII.visibilityMap = new HashMap();
      lllllllllllllllIIlllIlllIlIIllII.title = lllllllllllllllIIlllIlllIlIIlIIl;
      lllllllllllllllIIlllIlllIlIIllII.addPoof(new FramePoof<Frame, FramePoof.FramePoofInfo>() {
         // $FF: synthetic field
         private static final int[] llllIlIIIIIl;

         private static void lIIllllllIlIlI() {
            llllIlIIIIIl = new int[2];
            llllIlIIIIIl[0] = " ".length();
            llllIlIIIIIl[1] = ((252 ^ 173) << " ".length() ^ 80 + 106 - 23 + 4) << " ".length() & ((0 ^ 105 ^ (219 ^ 192) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
         }

         private static boolean lIIllllllIlIll(int var0) {
            return var0 != 0;
         }

         public void execute(Frame lllllllllllllllIlIlIlIIlIlllIIII, FramePoof.FramePoofInfo lllllllllllllllIlIlIlIIlIllIllll) {
            switch(null.$SwitchMap$rr$snowhack$snow$gui$rgui$poof$use$FramePoof$Action[lllllllllllllllIlIlIlIIlIllIllll.getAction().ordinal()]) {
            case 1:
               if (lIIllllllIlIll(lllllllllllllllIIlllIlllIlIIllII.isMinimizeable)) {
                  lllllllllllllllIIlllIlllIlIIllII.setMinimized((boolean)llllIlIIIIIl[0]);
                  "".length();
                  if ("   ".length() != "   ".length()) {
                     return;
                  }
               }
               break;
            case 2:
               if (lIIllllllIlIll(lllllllllllllllIIlllIlllIlIIllII.isMinimizeable)) {
                  lllllllllllllllIIlllIlllIlIIllII.setMinimized((boolean)llllIlIIIIIl[1]);
                  "".length();
                  if (" ".length() < " ".length()) {
                     return;
                  }
               }
               break;
            case 3:
               if (lIIllllllIlIll(lllllllllllllllIIlllIlllIlIIllII.isCloseable)) {
                  lllllllllllllllIIlllIlllIlIIllII.getParent().removeChild(lllllllllllllllIIlllIlllIlIIllII);
                  "".length();
               }
            }

         }

         static {
            lIIllllllIlIlI();
         }
      });
      lllllllllllllllIIlllIlllIlIIllII.addUpdateListener(new UpdateListener() {
         // $FF: synthetic field
         private static final int[] llllllIIIIIl;

         public void updateSize(Component lllllllllllllllIlIIllIIIIlllIlll, int lllllllllllllllIlIIllIIIIlllIllI, int lllllllllllllllIlIIllIIIIlllIlIl) {
            if (!lIlIIlIIlIIlIl(lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking)) {
               if (lIlIIlIIlIIllI(lllllllllllllllIlIIllIIIIlllIlll.equals(lllllllllllllllIIlllIlllIlIIllII))) {
                  lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking = (boolean)llllllIIIIIl[0];
                  lllllllllllllllIIlllIlllIlIIlIlI.organiseContainer(lllllllllllllllIIlllIlllIlIIllII);
                  lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking = (boolean)llllllIIIIIl[1];
               }

            }
         }

         static {
            lIlIIlIIlIIlII();
         }

         private static boolean lIlIIlIIlIIlIl(int var0) {
            return var0 != 0;
         }

         public void updateLocation(Component lllllllllllllllIlIIllIIIIllIlIll, int lllllllllllllllIlIIllIIIIllIlllI, int lllllllllllllllIlIIllIIIIllIllIl) {
            if (!lIlIIlIIlIIlIl(lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking)) {
               if (lIlIIlIIlIIllI(lllllllllllllllIlIIllIIIIllIlIll.equals(lllllllllllllllIIlllIlllIlIIllII))) {
                  lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking = (boolean)llllllIIIIIl[0];
                  lllllllllllllllIIlllIlllIlIIlIlI.organiseContainer(lllllllllllllllIIlllIlllIlIIllII);
                  lllllllllllllllIIlllIlllIlIIllII.isLayoutWorking = (boolean)llllllIIIIIl[1];
               }

            }
         }

         private static boolean lIlIIlIIlIIllI(int var0) {
            return var0 == 0;
         }

         private static void lIlIIlIIlIIlII() {
            llllllIIIIIl = new int[2];
            llllllIIIIIl[0] = " ".length();
            llllllIIIIIl[1] = (85 ^ 110) & ~(8 ^ 51);
         }
      });
      lllllllllllllllIIlllIlllIlIIllII.addRenderListener(new RenderListener() {
         public void onPreRender() {
            if (lIlIlllIllIIIl(lllllllllllllllIIlllIlllIlIIllII.startDrag)) {
               String lllllllllllllllIIlllIllIIlIIlllI = new Frame.FrameDragPoof.DragInfo(DisplayGuiScreen.mouseX - lllllllllllllllIIlllIlllIlIIllII.dx, DisplayGuiScreen.mouseY - lllllllllllllllIIlllIlllIlIIllII.dy);
               lllllllllllllllIIlllIlllIlIIllII.callPoof(Frame.FrameDragPoof.class, lllllllllllllllIIlllIllIIlIIlllI);
               lllllllllllllllIIlllIlllIlIIllII.setX(lllllllllllllllIIlllIllIIlIIlllI.getX());
               lllllllllllllllIIlllIlllIlIIllII.setY(lllllllllllllllIIlllIllIIlIIlllI.getY());
            }

         }

         private static boolean lIlIlllIllIIIl(int var0) {
            return var0 != 0;
         }

         public void onPostRender() {
         }
      });
      lllllllllllllllIIlllIlllIlIIllII.addMouseListener(new Frame.GayMouseListener());
   }

   public boolean isMinimized() {
      return lllllllllllllllIIlllIlllIIlIllII.isMinimized;
   }

   public boolean isCloseable() {
      return lllllllllllllllIIlllIlllIIIlllII.isCloseable;
   }

   public void setPinned(boolean lllllllllllllllIIlllIlllIIIIIllI) {
      int var10001;
      if (lIlIlllIIIllll(lllllllllllllllIIlllIlllIIIIIllI) && lIlIlllIIIllll(lllllllllllllllIIlllIlllIIIIIlIl.isPinneable)) {
         var10001 = lIIIIllllllll[1];
         "".length();
         if (((76 ^ 69) & ~(40 ^ 33)) != 0) {
            return;
         }
      } else {
         var10001 = lIIIIllllllll[0];
      }

      lllllllllllllllIIlllIlllIIIIIlIl.isPinned = (boolean)var10001;
   }

   public void setCloseable(boolean lllllllllllllllIIlllIlllIlIIIlIl) {
      lllllllllllllllIIlllIlllIlIIIlII.isCloseable = lllllllllllllllIIlllIlllIlIIIlIl;
   }

   public void setHudFrame(boolean lllllllllllllllIIlllIllIllllIlIl) {
      lllllllllllllllIIlllIllIllllIllI.isHudFrame = lllllllllllllllIIlllIllIllllIlIl;
   }

   public boolean isPinneable() {
      return lllllllllllllllIIlllIlllIIIllIlI.isPinneable;
   }

   public boolean isMinimizeable() {
      return lllllllllllllllIIlllIlllIIlIllll.isMinimizeable;
   }

   public Docking getDocking() {
      return lllllllllllllllIIlllIllIllllIIlI.docking;
   }

   public void setMinimized(boolean lllllllllllllllIIlllIlllIIlIIIIl) {
      Iterator lllllllllllllllIIlllIlllIIlIIIII;
      if (lIlIlllIIIllll(lllllllllllllllIIlllIlllIIlIIIIl) && lIlIlllIIlIIII(lllllllllllllllIIlllIlllIIlIIlII.isMinimized)) {
         lllllllllllllllIIlllIlllIIlIIlII.trueheight = lllllllllllllllIIlllIlllIIlIIlII.getHeight();
         lllllllllllllllIIlllIlllIIlIIlII.truemaxheight = lllllllllllllllIIlllIlllIIlIIlII.getMaximumHeight();
         lllllllllllllllIIlllIlllIIlIIlII.setHeight(lIIIIllllllll[0]);
         lllllllllllllllIIlllIlllIIlIIlII.setMaximumHeight(lllllllllllllllIIlllIlllIIlIIlII.getOriginOffsetY());
         "".length();
         lllllllllllllllIIlllIlllIIlIIIII = lllllllllllllllIIlllIlllIIlIIlII.getChildren().iterator();

         while(lIlIlllIIIllll(lllllllllllllllIIlllIlllIIlIIIII.hasNext())) {
            Component lllllllllllllllIIlllIlllIIlIIllI = (Component)lllllllllllllllIIlllIlllIIlIIIII.next();
            lllllllllllllllIIlllIlllIIlIIlII.visibilityMap.put(lllllllllllllllIIlllIlllIIlIIllI, lllllllllllllllIIlllIlllIIlIIllI.isVisible());
            "".length();
            lllllllllllllllIIlllIlllIIlIIllI.setVisible((boolean)lIIIIllllllll[0]);
            "".length();
            if (null != null) {
               return;
            }
         }

         "".length();
         if (-"   ".length() > 0) {
            return;
         }
      } else if (lIlIlllIIlIIII(lllllllllllllllIIlllIlllIIlIIIIl) && lIlIlllIIIllll(lllllllllllllllIIlllIlllIIlIIlII.isMinimized)) {
         lllllllllllllllIIlllIlllIIlIIlII.setMaximumHeight(lllllllllllllllIIlllIlllIIlIIlII.truemaxheight);
         "".length();
         lllllllllllllllIIlllIlllIIlIIlII.setHeight(lllllllllllllllIIlllIlllIIlIIlII.trueheight - lllllllllllllllIIlllIlllIIlIIlII.getOriginOffsetY());
         lllllllllllllllIIlllIlllIIlIIIII = lllllllllllllllIIlllIlllIIlIIlII.visibilityMap.entrySet().iterator();

         while(lIlIlllIIIllll(lllllllllllllllIIlllIlllIIlIIIII.hasNext())) {
            Entry<Component, Boolean> lllllllllllllllIIlllIlllIIlIIlIl = (Entry)lllllllllllllllIIlllIlllIIlIIIII.next();
            ((Component)lllllllllllllllIIlllIlllIIlIIlIl.getKey()).setVisible((Boolean)lllllllllllllllIIlllIlllIIlIIlIl.getValue());
            "".length();
            if ("   ".length() < "   ".length()) {
               return;
            }
         }
      }

      lllllllllllllllIIlllIlllIIlIIlII.isMinimized = (boolean)lllllllllllllllIIlllIlllIIlIIIIl;
   }

   public void displayPinButton(boolean lllllllllllllllIIlllIlllIIIIlIlI) {
      lllllllllllllllIIlllIlllIIIIllIl.isPinDisplayed = lllllllllllllllIIlllIlllIIIIlIlI;
   }

   public void setPinneable(boolean lllllllllllllllIIlllIlllIIIlIIlI) {
      lllllllllllllllIIlllIlllIIIlIIIl.isPinneable = lllllllllllllllIIlllIlllIIIlIIlI;
   }

   public void setTitleEnabled(boolean lllllllllllllllIIlllIlllIIlllIIl) {
      lllllllllllllllIIlllIlllIIlllIII.titleEnabled = lllllllllllllllIIlllIlllIIlllIIl;
   }

   private static void lIlIlllIIIlllI() {
      lIIIIllllllll = new int[2];
      lIIIIllllllll[0] = (93 ^ 8) & ~(147 ^ 198);
      lIIIIllllllll[1] = " ".length();
   }

   public boolean isBoxEnabled() {
      return lllllllllllllllIIlllIllIllllllll.boxEnabled;
   }

   private static boolean lIlIlllIIIllll(int var0) {
      return var0 != 0;
   }

   public void setBox(boolean lllllllllllllllIIlllIlllIIllllll) {
      lllllllllllllllIIlllIlllIlIIIIII.boxEnabled = lllllllllllllllIIlllIlllIIllllll;
   }

   static {
      lIlIlllIIIlllI();
   }

   public String getTitle() {
      return lllllllllllllllIIlllIlllIIIIIIIl.title;
   }

   public void setMinimizeable(boolean lllllllllllllllIIlllIlllIIllIIIl) {
      lllllllllllllllIIlllIlllIIllIIlI.isMinimizeable = lllllllllllllllIIlllIlllIIllIIIl;
   }

   public Frame(Theme lllllllllllllllIIlllIlllIlIlIllI, String lllllllllllllllIIlllIlllIlIllIII) {
      this(lllllllllllllllIIlllIlllIlIlIllI, new UselessLayout(), lllllllllllllllIIlllIlllIlIllIII);
   }

   private static boolean lIlIlllIIlIIII(int var0) {
      return var0 == 0;
   }

   public abstract static class FrameDragPoof<T extends Frame, S extends Frame.FrameDragPoof.DragInfo> extends Poof<T, S> {
      public static class DragInfo extends PoofInfo {
         // $FF: synthetic field
         int y;
         // $FF: synthetic field
         int x;

         public void setY(int lllllllllllllllIlIlllIIlllllIIlI) {
            lllllllllllllllIlIlllIIlllllIlIl.y = lllllllllllllllIlIlllIIlllllIIlI;
         }

         public void setX(int lllllllllllllllIlIlllIIllllllIII) {
            lllllllllllllllIlIlllIIllllllIIl.x = lllllllllllllllIlIlllIIllllllIII;
         }

         public int getX() {
            return lllllllllllllllIlIlllIlIIIIIIIlI.x;
         }

         public int getY() {
            return lllllllllllllllIlIlllIIllllllllI.y;
         }

         public DragInfo(int lllllllllllllllIlIlllIlIIIIIlIII, int lllllllllllllllIlIlllIlIIIIIIlll) {
            lllllllllllllllIlIlllIlIIIIIIllI.x = lllllllllllllllIlIlllIlIIIIIlIII;
            lllllllllllllllIlIlllIlIIIIIIllI.y = lllllllllllllllIlIlllIlIIIIIIlll;
         }
      }
   }

   public class GayMouseListener implements MouseListener {
      // $FF: synthetic field
      private static final int[] lIIIIllllIlIl;

      private static void lIlIlllIIIIIIl() {
         lIIIIllllIlIl = new int[2];
         lIIIIllllIlIl[0] = " ".length();
         lIIIIllllIlIl[1] = ((69 ^ 64) << (" ".length() << " ".length()) ^ 38 ^ 13) & ((98 ^ 31) << " ".length() ^ 147 + 31 - 6 + 25 ^ -" ".length());
      }

      static {
         lIlIlllIIIIIIl();
      }

      public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIIlllIlllllIlIlll) {
         Frame.this.doDrag = (boolean)lIIIIllllIlIl[1];
         Frame.this.startDrag = (boolean)lIIIIllllIlIl[1];
      }

      public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIIlllIlllllIlIIll) {
         if (!lIlIlllIIIIIll(Frame.this.doDrag)) {
            Frame.this.startDrag = (boolean)lIIIIllllIlIl[0];
         }
      }

      private static boolean lIlIlllIIIIlII(int var0) {
         return var0 > 0;
      }

      private static boolean lIlIlllIIIIIll(int var0) {
         return var0 == 0;
      }

      public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIIlllIlllllIlllII) {
         Frame.this.dx = lllllllllllllllIIlllIlllllIlllII.getX() + Frame.this.getOriginOffsetX();
         Frame.this.dy = lllllllllllllllIIlllIlllllIlllII.getY() + Frame.this.getOriginOffsetY();
         Frame var10000 = Frame.this;
         int var10001;
         if (lIlIlllIIIIIlI(Frame.this.dy, Frame.this.getOriginOffsetY()) && lIlIlllIIIIIll(lllllllllllllllIIlllIlllllIlllII.getButton()) && lIlIlllIIIIlII(Frame.this.dy)) {
            var10001 = lIIIIllllIlIl[0];
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            var10001 = lIIIIllllIlIl[1];
         }

         var10000.doDrag = (boolean)var10001;
         if (lIlIlllIIIIlIl(Frame.this.isMinimized) && lIlIlllIIIIllI(lllllllllllllllIIlllIlllllIlllII.getY(), Frame.this.getOriginOffsetY())) {
            lllllllllllllllIIlllIlllllIlllII.cancel();
         }

      }

      private static boolean lIlIlllIIIIlIl(int var0) {
         return var0 != 0;
      }

      private static boolean lIlIlllIIIIllI(int var0, int var1) {
         return var0 > var1;
      }

      private static boolean lIlIlllIIIIIlI(int var0, int var1) {
         return var0 <= var1;
      }

      public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIIlllIlllllIIlllI) {
      }

      public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIIlllIlllllIlIIII) {
      }
   }
}
