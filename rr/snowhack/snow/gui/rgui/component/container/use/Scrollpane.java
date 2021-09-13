package rr.snowhack.snow.gui.rgui.component.container.use;

import java.util.Iterator;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.GUI;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.container.OrganisedContainer;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.component.listen.UpdateListener;
import rr.snowhack.snow.gui.rgui.layout.Layout;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;

public class Scrollpane extends OrganisedContainer {
   // $FF: synthetic field
   int scrolledX;
   // $FF: synthetic field
   int step;
   // $FF: synthetic field
   boolean lockWidth;
   // $FF: synthetic field
   boolean doScrollY;
   // $FF: synthetic field
   private static final int[] lllIllIIIIIl;
   // $FF: synthetic field
   boolean canScrollY;
   // $FF: synthetic field
   int maxScrollX;
   // $FF: synthetic field
   boolean lockHeight;
   // $FF: synthetic field
   boolean canScrollX;
   // $FF: synthetic field
   int maxScrollY;
   // $FF: synthetic field
   boolean doScrollX;
   // $FF: synthetic field
   int scrolledY;

   public boolean isDoScrollX() {
      return lllllllllllllllIlIlllIlIIlllIIII.doScrollX;
   }

   public Scrollpane(Theme lllllllllllllllIlIlllIlIlIlIIIIl, Layout lllllllllllllllIlIlllIlIlIlIIIII, int lllllllllllllllIlIlllIlIlIIlllll, int lllllllllllllllIlIlllIlIlIIllllI) {
      super(lllllllllllllllIlIlllIlIlIlIIIIl, lllllllllllllllIlIlllIlIlIlIIIII);
      lllllllllllllllIlIlllIlIlIIlllIl.doScrollX = (boolean)lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.doScrollY = (boolean)lllIllIIIIIl[1];
      lllllllllllllllIlIlllIlIlIIlllIl.canScrollX = (boolean)lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.canScrollY = (boolean)lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.lockWidth = (boolean)lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.lockHeight = (boolean)lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.step = lllIllIIIIIl[2];
      lllllllllllllllIlIlllIlIlIIlllIl.setWidth(lllllllllllllllIlIlllIlIlIIlllll);
      lllllllllllllllIlIlllIlIlIIlllIl.setHeight(lllllllllllllllIlIlllIlIlIIllllI);
      lllllllllllllllIlIlllIlIlIIlllIl.scrolledX = lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.scrolledY = lllIllIIIIIl[0];
      lllllllllllllllIlIlllIlIlIIlllIl.addRenderListener(new RenderListener() {
         // $FF: synthetic field
         private static final int[] lIIIIIlIlIIll;
         // $FF: synthetic field
         int translatex;
         // $FF: synthetic field
         int translatey;

         public void onPreRender() {
            lllllllllllllllIlIIIIlllIlIIIIll.translatex = lllllllllllllllIlIlllIlIlIIlllIl.scrolledX;
            lllllllllllllllIlIIIIlllIlIIIIll.translatey = lllllllllllllllIlIlllIlIlIIlllIl.scrolledY;
            int[] lllllllllllllllIlIIIIlllIlIIIIlI = GUI.calculateRealPosition(lllllllllllllllIlIlllIlIlIIlllIl);
            boolean lllllllllllllllIlIIIIlllIIlllllI = DisplayGuiScreen.getScale();
            GL11.glScissor(lllllllllllllllIlIlllIlIlIIlllIl.getX() * lllllllllllllllIlIIIIlllIIlllllI + lllllllllllllllIlIIIIlllIlIIIIlI[lIIIIIlIlIIll[0]] * lllllllllllllllIlIIIIlllIIlllllI - lllllllllllllllIlIlllIlIlIIlllIl.getParent().getOriginOffsetX() - lIIIIIlIlIIll[1], Display.getHeight() - lllllllllllllllIlIlllIlIlIIlllIl.getHeight() * lllllllllllllllIlIIIIlllIIlllllI - lllllllllllllllIlIIIIlllIlIIIIlI[lIIIIIlIlIIll[1]] * lllllllllllllllIlIIIIlllIIlllllI - lIIIIIlIlIIll[1], lllllllllllllllIlIlllIlIlIIlllIl.getWidth() * lllllllllllllllIlIIIIlllIIlllllI + lllllllllllllllIlIlllIlIlIIlllIl.getParent().getOriginOffsetX() * lllllllllllllllIlIIIIlllIIlllllI + lIIIIIlIlIIll[1], lllllllllllllllIlIlllIlIlIIlllIl.getHeight() * lllllllllllllllIlIIIIlllIIlllllI + lIIIIIlIlIIll[1]);
            GL11.glEnable(lIIIIIlIlIIll[2]);
         }

         static {
            lIlIlIIlIIIlII();
         }

         public void onPostRender() {
            GL11.glDisable(lIIIIIlIlIIll[2]);
         }

         private static void lIlIlIIlIIIlII() {
            lIIIIIlIlIIll = new int[3];
            lIIIIIlIlIIll[0] = (110 ^ 95) & ~(21 ^ 36);
            lIIIIIlIlIIll[1] = " ".length();
            lIIIIIlIlIIll[2] = 776 + 147 - 392 + 1416 + 152 + 302 - -95 + 332 - (605 + 439 - 232 + 199 << " ".length()) + 2079 + 56 - 772 + 920;
         }
      });
      lllllllllllllllIlIlllIlIlIIlllIl.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] lIIIIlIIlIllI;

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIIIIIIlllllllI) {
            if (lIlIlIllIIIlIl(lllllllllllllllIlIlllIlIlIIlllIl.canScrollY()) && (!lIlIlIllIIIlIl(lllllllllllllllIlIlllIlIlIIlllIl.canScrollX()) || !lIlIlIllIIIlIl(lllllllllllllllIlIlllIlIlIIlllIl.scrolledX) || lIlIlIllIIIllI(lllllllllllllllIlIlllIlIlIIlllIl.isDoScrollX())) && lIlIlIllIIIlIl(lllllllllllllllIlIlllIlIlIIlllIl.isDoScrollY())) {
               if (lIlIlIllIIIlIl(lllllllllllllllIlIIIIIIIlllllllI.isUp()) && lIlIlIllIIIlll(lllllllllllllllIlIlllIlIlIIlllIl.getScrolledY())) {
                  lllllllllllllllIlIlllIlIlIIlllIl.setScrolledY(Math.max(lIIIIlIIlIllI[0], lllllllllllllllIlIlllIlIlIIlllIl.getScrolledY() - lllllllllllllllIlIlllIlIlIIlllIl.step));
                  return;
               }

               if (lIlIlIllIIIllI(lllllllllllllllIlIIIIIIIlllllllI.isUp()) && lIlIlIllIIlIII(lllllllllllllllIlIlllIlIlIIlllIl.getScrolledY(), lllllllllllllllIlIlllIlIlIIlllIl.getMaxScrollY())) {
                  lllllllllllllllIlIlllIlIlIIlllIl.setScrolledY(Math.min(lllllllllllllllIlIlllIlIlIIlllIl.getMaxScrollY(), lllllllllllllllIlIlllIlIlIIlllIl.getScrolledY() + lllllllllllllllIlIlllIlIlIIlllIl.step));
                  return;
               }
            }

            if (lIlIlIllIIIlIl(lllllllllllllllIlIlllIlIlIIlllIl.canScrollX()) && lIlIlIllIIIlIl(lllllllllllllllIlIlllIlIlIIlllIl.isDoScrollX())) {
               if (lIlIlIllIIIlIl(lllllllllllllllIlIIIIIIIlllllllI.isUp()) && lIlIlIllIIIlll(lllllllllllllllIlIlllIlIlIIlllIl.getScrolledX())) {
                  lllllllllllllllIlIlllIlIlIIlllIl.setScrolledX(Math.max(lIIIIlIIlIllI[0], lllllllllllllllIlIlllIlIlIIlllIl.getScrolledX() - lllllllllllllllIlIlllIlIlIIlllIl.step));
                  return;
               }

               if (lIlIlIllIIIllI(lllllllllllllllIlIIIIIIIlllllllI.isUp()) && lIlIlIllIIlIII(lllllllllllllllIlIlllIlIlIIlllIl.getScrolledX(), lllllllllllllllIlIlllIlIlIIlllIl.getMaxScrollX())) {
                  lllllllllllllllIlIlllIlIlIIlllIl.setScrolledX(Math.min(lllllllllllllllIlIlllIlIlIIlllIl.getMaxScrollX(), lllllllllllllllIlIlllIlIlIIlllIl.getScrolledX() + lllllllllllllllIlIlllIlIlIIlllIl.step));
                  return;
               }
            }

         }

         private static boolean lIlIlIllIIIlII(int var0) {
            return var0 < 0;
         }

         private static boolean lIlIlIllIIIlll(int var0) {
            return var0 > 0;
         }

         private static boolean lIlIlIllIIIIll(int var0) {
            return var0 >= 0;
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIIlIIIIIllI) {
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIIlIIIIIlII) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIIlIIIIlIlI) {
            if (!lIlIlIllIIIIlI(lllllllllllllllIlIIIIIIlIIIIlIlI.getY(), lllllllllllllllIlIlllIlIlIIlllIl.getHeight()) || !lIlIlIllIIIIlI(lllllllllllllllIlIIIIIIlIIIIlIlI.getX(), lllllllllllllllIlIlllIlIlIIlllIl.getWidth()) || !lIlIlIllIIIIll(lllllllllllllllIlIIIIIIlIIIIlIlI.getX()) || lIlIlIllIIIlII(lllllllllllllllIlIIIIIIlIIIIlIlI.getY())) {
               lllllllllllllllIlIIIIIIlIIIIlIlI.cancel();
            }

         }

         private static void lIlIlIllIIIIIl() {
            lIIIIlIIlIllI = new int[1];
            lIIIIlIIlIllI[0] = ((23 ^ 122) << " ".length() ^ 113 + 52 - 93 + 127) << " ".length() & ((26 ^ 87 ^ (124 ^ 121) << (" ".length() << (" ".length() << " ".length()))) << " ".length() ^ -" ".length());
         }

         private static boolean lIlIlIllIIIllI(int var0) {
            return var0 == 0;
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIIIIIlIIIIIIlI) {
         }

         static {
            lIlIlIllIIIIIl();
         }

         private static boolean lIlIlIllIIIlIl(int var0) {
            return var0 != 0;
         }

         private static boolean lIlIlIllIIlIII(int var0, int var1) {
            return var0 < var1;
         }

         private static boolean lIlIlIllIIIIlI(int var0, int var1) {
            return var0 <= var1;
         }
      });
      lllllllllllllllIlIlllIlIlIIlllIl.addUpdateListener(new UpdateListener() {
         public void updateLocation(Component lllllllllllllllIIllllIlllllIllll, int lllllllllllllllIIllllIlllllIlllI, int lllllllllllllllIIllllIlllllIllIl) {
            lllllllllllllllIlIlllIlIlIIlllIl.performCalculations();
         }

         public void updateSize(Component lllllllllllllllIIllllIllllllIlIl, int lllllllllllllllIIllllIllllllIlII, int lllllllllllllllIIllllIllllllIIll) {
            lllllllllllllllIlIlllIlIlIIlllIl.performCalculations();
         }
      });
   }

   private static void lIIllIlIllllIl() {
      lllIllIIIIIl = new int[3];
      lllIllIIIIIl[0] = (169 + 111 - 234 + 141 ^ (86 ^ 9) << " ".length()) << "   ".length() & (((34 ^ 67) << " ".length() ^ 146 + 132 - 255 + 176) << "   ".length() ^ -" ".length());
      lllIllIIIIIl[1] = " ".length();
      lllIllIIIIIl[2] = (107 ^ 26 ^ (72 ^ 117) << " ".length()) << " ".length();
   }

   private static boolean lIIllIlIlllllI(int var0) {
      return var0 == 0;
   }

   public void setWidth(int lllllllllllllllIlIlllIlIlIIlIlIl) {
      if (lIIllIlIlllllI(lllllllllllllllIlIlllIlIlIIlIllI.lockWidth)) {
         super.setWidth(lllllllllllllllIlIlllIlIlIIlIlIl);
      }

   }

   public void setScrolledY(int lllllllllllllllIlIlllIlIIlIIIlll) {
      double lllllllllllllllIlIlllIlIIlIIIIlI = lllllllllllllllIlIlllIlIIlIIlIII.getScrolledY();
      lllllllllllllllIlIlllIlIIlIIlIII.scrolledY = lllllllllllllllIlIlllIlIIlIIIlll;
      byte lllllllllllllllIlIlllIlIIlIIIIIl = lllllllllllllllIlIlllIlIIlIIlIII.getScrolledY() - lllllllllllllllIlIlllIlIIlIIIIlI;
      Iterator lllllllllllllllIlIlllIlIIlIIIIII = lllllllllllllllIlIlllIlIIlIIlIII.getChildren().iterator();

      do {
         if (!lIIllIlIllllll(lllllllllllllllIlIlllIlIIlIIIIII.hasNext())) {
            return;
         }

         Component lllllllllllllllIlIlllIlIIlIIlIIl = (Component)lllllllllllllllIlIlllIlIIlIIIIII.next();
         lllllllllllllllIlIlllIlIIlIIlIIl.setY(lllllllllllllllIlIlllIlIIlIIlIIl.getY() - lllllllllllllllIlIlllIlIIlIIIIIl);
         "".length();
      } while(null == null);

   }

   public boolean canScrollX() {
      return lllllllllllllllIlIlllIlIIlllIlll.canScrollX;
   }

   public int getScrolledX() {
      return lllllllllllllllIlIlllIlIIIllllIl.scrolledX;
   }

   public void setHeight(int lllllllllllllllIlIlllIlIlIIIllIl) {
      if (lIIllIlIlllllI(lllllllllllllllIlIlllIlIlIIlIIII.lockHeight)) {
         super.setHeight(lllllllllllllllIlIlllIlIlIIIllIl);
      }

   }

   public int getMaxScrollY() {
      return lllllllllllllllIlIlllIlIIIllIlII.maxScrollY;
   }

   public Scrollpane setLockHeight(boolean lllllllllllllllIlIlllIlIIIlIllll) {
      lllllllllllllllIlIlllIlIIIlIlllI.lockHeight = lllllllllllllllIlIlllIlIIIlIllll;
      return lllllllllllllllIlIlllIlIIIlIlllI;
   }

   public int getScrolledY() {
      return lllllllllllllllIlIlllIlIIIlllIlI.scrolledY;
   }

   private static boolean lIIllIllIIIIIl(int var0) {
      return var0 > 0;
   }

   private static boolean lIIllIlIllllll(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIllIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   public void setDoScrollY(boolean lllllllllllllllIlIlllIlIIllIlIIl) {
      lllllllllllllllIlIlllIlIIllIlIlI.doScrollY = lllllllllllllllIlIlllIlIIllIlIIl;
   }

   public Scrollpane setLockWidth(boolean lllllllllllllllIlIlllIlIIIlIlIIl) {
      lllllllllllllllIlIlllIlIIIlIlIlI.lockWidth = lllllllllllllllIlIlllIlIIIlIlIIl;
      return lllllllllllllllIlIlllIlIIIlIlIlI;
   }

   public boolean isDoScrollY() {
      return lllllllllllllllIlIlllIlIIllIllIl.doScrollY;
   }

   private static boolean lIIllIllIIIIII(int var0, int var1) {
      return var0 > var1;
   }

   public boolean canScrollY() {
      return lllllllllllllllIlIlllIlIIlllIlII.canScrollY;
   }

   static {
      lIIllIlIllllIl();
   }

   public void setScrolledX(int lllllllllllllllIlIlllIlIIlIlIlII) {
      int lllllllllllllllIlIlllIlIIlIlIlll = lllllllllllllllIlIlllIlIIlIlIlIl.getScrolledX();
      lllllllllllllllIlIlllIlIIlIlIlIl.scrolledX = lllllllllllllllIlIlllIlIIlIlIlII;
      int lllllllllllllllIlIlllIlIIlIlIllI = lllllllllllllllIlIlllIlIIlIlIlIl.getScrolledX() - lllllllllllllllIlIlllIlIIlIlIlll;
      Iterator lllllllllllllllIlIlllIlIIlIlIIIl = lllllllllllllllIlIlllIlIIlIlIlIl.getChildren().iterator();

      do {
         if (!lIIllIlIllllll(lllllllllllllllIlIlllIlIIlIlIIIl.hasNext())) {
            return;
         }

         Component lllllllllllllllIlIlllIlIIlIllIlI = (Component)lllllllllllllllIlIlllIlIIlIlIIIl.next();
         lllllllllllllllIlIlllIlIIlIllIlI.setX(lllllllllllllllIlIlllIlIIlIllIlI.getX() - lllllllllllllllIlIlllIlIIlIlIllI);
         "".length();
      } while(" ".length() << " ".length() > 0);

   }

   public boolean penetrateTest(int lllllllllllllllIlIlllIlIIIlIIIlI, int lllllllllllllllIlIlllIlIIIlIIIIl) {
      int var10000;
      if (lIIllIllIIIIIl(lllllllllllllllIlIlllIlIIIlIIIlI) && lIIllIllIIIIlI(lllllllllllllllIlIlllIlIIIlIIIlI, lllllllllllllllIlIlllIlIIIlIIIll.getWidth()) && lIIllIllIIIIIl(lllllllllllllllIlIlllIlIIIlIIIIl) && lIIllIllIIIIlI(lllllllllllllllIlIlllIlIIIlIIIIl, lllllllllllllllIlIlllIlIIIlIIIll.getHeight())) {
         var10000 = lllIllIIIIIl[1];
         "".length();
         if (" ".length() < ((234 ^ 197) << " ".length() & ~((163 ^ 140) << " ".length()))) {
            return (boolean)((190 ^ 155) << " ".length() & ~((123 ^ 94) << " ".length()));
         }
      } else {
         var10000 = lllIllIIIIIl[0];
      }

      return (boolean)var10000;
   }

   public Container addChild(Component... lllllllllllllllIlIlllIlIlIIIIlll) {
      super.addChild(lllllllllllllllIlIlllIlIlIIIIlll);
      "".length();
      lllllllllllllllIlIlllIlIlIIIlIlI.performCalculations();
      return lllllllllllllllIlIlllIlIlIIIlIlI;
   }

   private void performCalculations() {
      int lllllllllllllllIlIlllIlIIlllllll = lllIllIIIIIl[0];
      byte lllllllllllllllIlIlllIlIIllllIll = lllIllIIIIIl[0];
      Iterator lllllllllllllllIlIlllIlIIllllIlI = lllllllllllllllIlIlllIlIIlllllIl.getChildren().iterator();

      do {
         if (!lIIllIlIllllll(lllllllllllllllIlIlllIlIIllllIlI.hasNext())) {
            int var10001;
            if (lIIllIllIIIIII(lllllllllllllllIlIlllIlIIlllllll, lllllllllllllllIlIlllIlIIlllllIl.getWidth())) {
               var10001 = lllIllIIIIIl[1];
               "".length();
               if (" ".length() < ((91 ^ 104) & ~(126 ^ 77))) {
                  return;
               }
            } else {
               var10001 = lllIllIIIIIl[0];
            }

            lllllllllllllllIlIlllIlIIlllllIl.canScrollX = (boolean)var10001;
            lllllllllllllllIlIlllIlIIlllllIl.maxScrollX = lllllllllllllllIlIlllIlIIlllllll - lllllllllllllllIlIlllIlIIlllllIl.getWidth();
            if (lIIllIllIIIIII(lllllllllllllllIlIlllIlIIllllIll, lllllllllllllllIlIlllIlIIlllllIl.getHeight())) {
               var10001 = lllIllIIIIIl[1];
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               var10001 = lllIllIIIIIl[0];
            }

            lllllllllllllllIlIlllIlIIlllllIl.canScrollY = (boolean)var10001;
            lllllllllllllllIlIlllIlIIlllllIl.maxScrollY = lllllllllllllllIlIlllIlIIllllIll - lllllllllllllllIlIlllIlIIlllllIl.getHeight();
            return;
         }

         float lllllllllllllllIlIlllIlIIllllIIl = (Component)lllllllllllllllIlIlllIlIIllllIlI.next();
         lllllllllllllllIlIlllIlIIlllllll = Math.max(lllllllllllllllIlIlllIlIIlllllIl.getScrolledX() + lllllllllllllllIlIlllIlIIllllIIl.getX() + lllllllllllllllIlIlllIlIIllllIIl.getWidth(), lllllllllllllllIlIlllIlIIlllllll);
         lllllllllllllllIlIlllIlIIllllIll = Math.max(lllllllllllllllIlIlllIlIIlllllIl.getScrolledY() + lllllllllllllllIlIlllIlIIllllIIl.getY() + lllllllllllllllIlIlllIlIIllllIIl.getHeight(), lllllllllllllllIlIlllIlIIllllIll);
         "".length();
      } while(" ".length() << " ".length() < " ".length() << (" ".length() << " ".length()));

   }

   public void setDoScrollX(boolean lllllllllllllllIlIlllIlIIllIIIIl) {
      lllllllllllllllIlIlllIlIIllIIlII.doScrollX = lllllllllllllllIlIlllIlIIllIIIIl;
   }

   public int getMaxScrollX() {
      return lllllllllllllllIlIlllIlIIIllIlll.maxScrollX;
   }
}
