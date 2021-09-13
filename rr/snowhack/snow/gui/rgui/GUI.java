package rr.snowhack.snow.gui.rgui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.AbstractContainer;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.listen.KeyListener;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.render.ComponentUI;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public abstract class GUI extends AbstractContainer {
   // $FF: synthetic field
   int mx;
   // $FF: synthetic field
   int x;
   // $FF: synthetic field
   int y;
   // $FF: synthetic field
   int my;
   // $FF: synthetic field
   boolean press;
   // $FF: synthetic field
   long lastMS;
   // $FF: synthetic field
   Component focus = null;
   // $FF: synthetic field
   private static final int[] lllllIllIllI;
   // $FF: synthetic field
   int button;

   public void handleKeyDown(int lllllllllllllllIlIIllIlIIlIlIIIl) {
      if (!lIlIIlIIIIlIII(lllllllllllllllIlIIllIlIIlIIllIl.focus)) {
         lllllllllllllllIlIIllIlIIlIIllIl.focus.getTheme().getUIForComponent(lllllllllllllllIlIIllIlIIlIIllIl.focus).handleKeyDown(lllllllllllllllIlIIllIlIIlIIllIl.focus, lllllllllllllllIlIIllIlIIlIlIIIl);
         ArrayList<Component> lllllllllllllllIlIIllIlIIlIlIIII = new ArrayList();
         Object lllllllllllllllIlIIllIlIIlIIlIlI = lllllllllllllllIlIIllIlIIlIIllIl.focus;

         do {
            if (!lIlIIlIIIIlIIl(lllllllllllllllIlIIllIlIIlIIlIlI)) {
               float lllllllllllllllIlIIllIlIIlIIlIIl = new KeyListener.KeyEvent(lllllllllllllllIlIIllIlIIlIlIIIl);
               Iterator lllllllllllllllIlIIllIlIIlIIlIII = lllllllllllllllIlIIllIlIIlIlIIII.iterator();

               do {
                  if (!lIlIIlIIIIlIlI(lllllllllllllllIlIIllIlIIlIIlIII.hasNext())) {
                     return;
                  }

                  byte lllllllllllllllIlIIllIlIIlIIIlll = (Component)lllllllllllllllIlIIllIlIIlIIlIII.next();
                  lllllllllllllllIlIIllIlIIlIIIlll.getKeyListeners().forEach((lllllllllllllllIlIIllIIlIIllllIl) -> {
                     lllllllllllllllIlIIllIIlIIllllIl.onKeyDown(lllllllllllllllIlIIllIlIIlIIlIIl);
                  });
                  "".length();
               } while(" ".length() << (" ".length() << " ".length()) > 0);

               return;
            }

            lllllllllllllllIlIIllIlIIlIlIIII.add(lllllIllIllI[0], lllllllllllllllIlIIllIlIIlIIlIlI);
            lllllllllllllllIlIIllIlIIlIIlIlI = ((Component)lllllllllllllllIlIIllIlIIlIIlIlI).getParent();
            "".length();
         } while(" ".length() << (" ".length() << " ".length()) > 0);

      }
   }

   public void drawGUI() {
      lllllllllllllllIlIIllIIlIlllllII.renderChildren();
   }

   private static boolean lIlIIlIIIlIIII(int var0, int var1) {
      return var0 == var1;
   }

   public Component getFocus() {
      return lllllllllllllllIlIIllIIlIllllIlI.focus;
   }

   private static int lIlIIlIIIlIIlI(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   private void catchMouse() {
      do {
         if (!lIlIIlIIIIlIlI(Mouse.next())) {
            return;
         }

         int lllllllllllllllIlIIllIIllIIlIIlI = Mouse.getX();
         int lllllllllllllllIlIIllIIllIIlIIIl = Mouse.getY();
         lllllllllllllllIlIIllIIllIIlIIIl = Display.getHeight() - lllllllllllllllIlIIllIIllIIlIIIl;
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIIIllll.press) && lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIllIIIllll.focus) && (!lIlIIlIIIlIIII(lllllllllllllllIlIIllIIllIIIllll.x, lllllllllllllllIlIIllIIllIIlIIlI) || lIlIIlIIIIllII(lllllllllllllllIlIIllIIllIIIllll.y, lllllllllllllllIlIIllIIllIIlIIIl))) {
            lllllllllllllllIlIIllIIllIIIllll.handleMouseDrag(lllllllllllllllIlIIllIIllIIlIIlI, lllllllllllllllIlIIllIIllIIlIIIl);
         }

         if (lIlIIlIIIIlIlI(Mouse.getEventButtonState())) {
            lllllllllllllllIlIIllIIllIIIllll.handleMouseDown(lllllllllllllllIlIIllIIllIIlIIlI, lllllllllllllllIlIIllIIllIIlIIIl);
            "".length();
            if (-"  ".length() >= 0) {
               return;
            }
         } else {
            lllllllllllllllIlIIllIIllIIIllll.handleMouseRelease(lllllllllllllllIlIIllIIllIIlIIlI, lllllllllllllllIlIIllIIllIIlIIIl);
         }

         if (lIlIIlIIIIlIlI(Mouse.hasWheel())) {
            lllllllllllllllIlIIllIIllIIIllll.handleWheel(lllllllllllllllIlIIllIIllIIlIIlI, lllllllllllllllIlIIllIIllIIlIIIl, Mouse.getDWheel());
         }

         "".length();
      } while(" ".length() << " ".length() >= 0);

   }

   private static boolean lIlIIlIIIIlIll(int var0) {
      return var0 == 0;
   }

   public void updateGUI() {
      lllllllllllllllIlIIllIlIIlIllIll.catchMouse();
      lllllllllllllllIlIIllIlIIlIllIll.catchKey();
   }

   private static boolean lIlIIlIIIIlIIl(Object var0) {
      return var0 != null;
   }

   static {
      lIlIIlIIIIIlll();
   }

   public void handleMouseDown(int lllllllllllllllIlIIllIlIIIlIIIII, int lllllllllllllllIlIIllIlIIIIlIlIl) {
      Component lllllllllllllllIlIIllIlIIIIllllI = lllllllllllllllIlIIllIlIIIlIIIIl.getComponentAt(lllllllllllllllIlIIllIlIIIlIIIII, lllllllllllllllIlIIllIlIIIIlIlIl);
      int[] lllllllllllllllIlIIllIlIIIIlllIl = calculateRealPosition(lllllllllllllllIlIIllIlIIIIllllI);
      if (lIlIIlIIIIlIIl(lllllllllllllllIlIIllIlIIIlIIIIl.focus)) {
         lllllllllllllllIlIIllIlIIIlIIIIl.focus.setFocussed((boolean)lllllIllIllI[0]);
      }

      lllllllllllllllIlIIllIlIIIlIIIIl.focus = lllllllllllllllIlIIllIlIIIIllllI;
      if (lIlIIlIIIIlIll(lllllllllllllllIlIIllIlIIIIllllI.equals(lllllllllllllllIlIIllIlIIIlIIIIl))) {
         Object lllllllllllllllIlIIllIlIIIIlIIlI = lllllllllllllllIlIIllIlIIIIllllI;

         while(lIlIIlIIIIlIll(lllllllllllllllIlIIllIlIIIlIIIIl.hasChild((Component)lllllllllllllllIlIIllIlIIIIlIIlI))) {
            lllllllllllllllIlIIllIlIIIIlIIlI = ((Component)lllllllllllllllIlIIllIlIIIIlIIlI).getParent();
            "".length();
            if (((38 ^ 15) << " ".length() & ~((34 ^ 11) << " ".length())) != 0) {
               return;
            }
         }

         lllllllllllllllIlIIllIlIIIlIIIIl.children.remove(lllllllllllllllIlIIllIlIIIIlIIlI);
         "".length();
         lllllllllllllllIlIIllIlIIIlIIIIl.children.add(lllllllllllllllIlIIllIlIIIIlIIlI);
         "".length();
         Collections.sort(lllllllllllllllIlIIllIlIIIlIIIIl.children, new Comparator<Component>() {
            public int compare(Component lllllllllllllllIlIllIIIllIlIlIIl, Component lllllllllllllllIlIllIIIllIlIlIII) {
               return lllllllllllllllIlIllIIIllIlIlIIl.getPriority() - lllllllllllllllIlIllIIIllIlIlIII.getPriority();
            }
         });
      }

      lllllllllllllllIlIIllIlIIIlIIIIl.focus.setFocussed((boolean)lllllIllIllI[1]);
      lllllllllllllllIlIIllIlIIIlIIIIl.press = (boolean)lllllIllIllI[1];
      lllllllllllllllIlIIllIlIIIlIIIIl.x = lllllllllllllllIlIIllIlIIIlIIIII;
      lllllllllllllllIlIIllIlIIIlIIIIl.y = lllllllllllllllIlIIllIlIIIIlIlIl;
      lllllllllllllllIlIIllIlIIIlIIIIl.button = Mouse.getEventButton();
      lllllllllllllllIlIIllIlIIIlIIIIl.getTheme().getUIForComponent(lllllllllllllllIlIIllIlIIIIllllI).handleMouseDown(lllllllllllllllIlIIllIlIIIIllllI, lllllllllllllllIlIIllIlIIIlIIIII - lllllllllllllllIlIIllIlIIIIlllIl[lllllIllIllI[0]], lllllllllllllllIlIIllIlIIIIlIlIl - lllllllllllllllIlIIllIlIIIIlllIl[lllllIllIllI[1]], Mouse.getEventButton());
      ArrayList<Component> lllllllllllllllIlIIllIlIIIIlllII = new ArrayList();
      Object lllllllllllllllIlIIllIlIIIIllIll = lllllllllllllllIlIIllIlIIIlIIIIl.focus;

      while(lIlIIlIIIIlIIl(lllllllllllllllIlIIllIlIIIIllIll)) {
         lllllllllllllllIlIIllIlIIIIlllII.add(lllllIllIllI[0], lllllllllllllllIlIIllIlIIIIllIll);
         lllllllllllllllIlIIllIlIIIIllIll = ((Component)lllllllllllllllIlIIllIlIIIIllIll).getParent();
         "".length();
         if (((68 ^ 77) & ~(94 ^ 87)) > " ".length() << " ".length()) {
            return;
         }
      }

      MouseListener.MouseButtonEvent lllllllllllllllIlIIllIlIIIIllIII = new MouseListener.MouseButtonEvent(lllllllllllllllIlIIllIlIIIlIIIII, lllllllllllllllIlIIllIlIIIIlIlIl, lllllllllllllllIlIIllIlIIIlIIIIl.button, lllllllllllllllIlIIllIlIIIlIIIIl.focus);
      Iterator lllllllllllllllIlIIllIlIIIIIllIl = lllllllllllllllIlIIllIlIIIIlllII.iterator();

      while(lIlIIlIIIIlIlI(lllllllllllllllIlIIllIlIIIIIllIl.hasNext())) {
         Component lllllllllllllllIlIIllIlIIIlIIIlI = (Component)lllllllllllllllIlIIllIlIIIIIllIl.next();
         lllllllllllllllIlIIllIlIIIIllIII.setX(lllllllllllllllIlIIllIlIIIIllIII.getX() - lllllllllllllllIlIIllIlIIIlIIIlI.getX());
         lllllllllllllllIlIIllIlIIIIllIII.setY(lllllllllllllllIlIIllIlIIIIllIII.getY() - lllllllllllllllIlIIllIlIIIlIIIlI.getY());
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIlIIIlIIIlI instanceof Container)) {
            lllllllllllllllIlIIllIlIIIIllIII.setX(lllllllllllllllIlIIllIlIIIIllIII.getX() - ((Container)lllllllllllllllIlIIllIlIIIlIIIlI).getOriginOffsetX());
            lllllllllllllllIlIIllIlIIIIllIII.setY(lllllllllllllllIlIIllIlIIIIllIII.getY() - ((Container)lllllllllllllllIlIIllIlIIIlIIIlI).getOriginOffsetY());
         }

         lllllllllllllllIlIIllIlIIIlIIIlI.getMouseListeners().forEach((lllllllllllllllIlIIllIIlIlIIlIIl) -> {
            lllllllllllllllIlIIllIIlIlIIlIIl.onMouseDown(lllllllllllllllIlIIllIlIIIIllIII);
         });
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIlIIIIllIII.isCancelled())) {
            "".length();
            if (" ".length() << " ".length() < -" ".length()) {
               return;
            }
            break;
         }

         "".length();
         if (-" ".length() > " ".length()) {
            return;
         }
      }

   }

   public abstract void initializeGUI();

   private static void lIlIIlIIIIIlll() {
      lllllIllIllI = new int[4];
      lllllIllIllI[0] = (106 + 102 - 68 + 97 ^ (208 ^ 151) << " ".length()) & ((153 ^ 156) << (7 ^ 2) ^ 39 + 115 - 24 + 65 ^ -" ".length());
      lllllIllIllI[1] = " ".length();
      lllllIllIllI[2] = -" ".length();
      lllllIllIllI[3] = " ".length() << " ".length();
   }

   private static boolean lIlIIlIIIIllII(int var0, int var1) {
      return var0 != var1;
   }

   public void update() {
      if (lIlIIlIIIIllIl(lIlIIlIIIlIIlI(System.currentTimeMillis() - lllllllllllllllIlIIllIIllIIIIIII.lastMS, 50L))) {
         lllllllllllllllIlIIllIIllIIIIIII.callTick(lllllllllllllllIlIIllIIllIIIIIII);
         lllllllllllllllIlIIllIIllIIIIIII.lastMS = System.currentTimeMillis();
      }

   }

   public GUI(Theme lllllllllllllllIlIIllIlIIllIIIII) {
      super(lllllllllllllllIlIIllIlIIllIIIII);
      lllllllllllllllIlIIllIlIIllIIIIl.press = (boolean)lllllIllIllI[0];
      lllllllllllllllIlIIllIlIIllIIIIl.x = lllllIllIllI[0];
      lllllllllllllllIlIIllIlIIllIIIIl.y = lllllIllIllI[0];
      lllllllllllllllIlIIllIlIIllIIIIl.button = lllllIllIllI[0];
      lllllllllllllllIlIIllIlIIllIIIIl.mx = lllllIllIllI[0];
      lllllllllllllllIlIIllIlIIllIIIIl.my = lllllIllIllI[0];
      lllllllllllllllIlIIllIlIIllIIIIl.lastMS = System.currentTimeMillis();
   }

   public void handleMouseRelease(int lllllllllllllllIlIIllIIllllIlIlI, int lllllllllllllllIlIIllIIllllIllIl) {
      int lllllllllllllllIlIIllIIllllIllII = Mouse.getEventButton();
      if (lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIllllIllll.focus) && lIlIIlIIIIllII(lllllllllllllllIlIIllIIllllIllII, lllllIllIllI[2])) {
         int[] lllllllllllllllIlIIllIIlllllllIl = calculateRealPosition(lllllllllllllllIlIIllIIllllIllll.focus);
         lllllllllllllllIlIIllIIllllIllll.getTheme().getUIForComponent(lllllllllllllllIlIIllIIllllIllll.focus).handleMouseRelease(lllllllllllllllIlIIllIIllllIllll.focus, lllllllllllllllIlIIllIIllllIlIlI - lllllllllllllllIlIIllIIlllllllIl[lllllIllIllI[0]], lllllllllllllllIlIIllIIllllIllIl - lllllllllllllllIlIIllIIlllllllIl[lllllIllIllI[1]], lllllllllllllllIlIIllIIllllIllII);
         ArrayList<Component> lllllllllllllllIlIIllIIllllIIllI = new ArrayList();
         Object lllllllllllllllIlIIllIIllllIIlIl = lllllllllllllllIlIIllIIllllIllll.focus;

         while(lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIllllIIlIl)) {
            lllllllllllllllIlIIllIIllllIIllI.add(lllllIllIllI[0], lllllllllllllllIlIIllIIllllIIlIl);
            lllllllllllllllIlIIllIIllllIIlIl = ((Component)lllllllllllllllIlIIllIIllllIIlIl).getParent();
            "".length();
            if (" ".length() == 0) {
               return;
            }
         }

         short lllllllllllllllIlIIllIIllllIIIlI = new MouseListener.MouseButtonEvent(lllllllllllllllIlIIllIIllllIlIlI, lllllllllllllllIlIIllIIllllIllIl, lllllllllllllllIlIIllIIllllIllII, lllllllllllllllIlIIllIIllllIllll.focus);
         Iterator lllllllllllllllIlIIllIIllllIIIIl = lllllllllllllllIlIIllIIllllIIllI.iterator();

         while(lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllllIIIIl.hasNext())) {
            Exception lllllllllllllllIlIIllIIllllIIIII = (Component)lllllllllllllllIlIIllIIllllIIIIl.next();
            lllllllllllllllIlIIllIIllllIIIlI.setX(lllllllllllllllIlIIllIIllllIIIlI.getX() - lllllllllllllllIlIIllIIllllIIIII.getX());
            lllllllllllllllIlIIllIIllllIIIlI.setY(lllllllllllllllIlIIllIIllllIIIlI.getY() - lllllllllllllllIlIIllIIllllIIIII.getY());
            if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllllIIIII instanceof Container)) {
               lllllllllllllllIlIIllIIllllIIIlI.setX(lllllllllllllllIlIIllIIllllIIIlI.getX() - ((Container)lllllllllllllllIlIIllIIllllIIIII).getOriginOffsetX());
               lllllllllllllllIlIIllIIllllIIIlI.setY(lllllllllllllllIlIIllIIllllIIIlI.getY() - ((Container)lllllllllllllllIlIIllIIllllIIIII).getOriginOffsetY());
            }

            lllllllllllllllIlIIllIIllllIIIII.getMouseListeners().forEach((lllllllllllllllIlIIllIIlIlIIllll) -> {
               lllllllllllllllIlIIllIIlIlIIllll.onMouseRelease(lllllllllllllllIlIIllIIllllIIIlI);
            });
            if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllllIIIlI.isCancelled())) {
               "".length();
               if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                  return;
               }
               break;
            }

            "".length();
            if (" ".length() > " ".length()) {
               return;
            }
         }

         lllllllllllllllIlIIllIIllllIllll.press = (boolean)lllllIllIllI[0];
      } else {
         if (lIlIIlIIIIllII(lllllllllllllllIlIIllIIllllIllII, lllllIllIllI[2])) {
            Component lllllllllllllllIlIIllIIlllllIllI = lllllllllllllllIlIIllIIllllIllll.getComponentAt(lllllllllllllllIlIIllIIllllIlIlI, lllllllllllllllIlIIllIIllllIllIl);
            int[] lllllllllllllllIlIIllIIlllllIlIl = calculateRealPosition(lllllllllllllllIlIIllIIlllllIllI);
            lllllllllllllllIlIIllIIllllIllll.getTheme().getUIForComponent(lllllllllllllllIlIIllIIlllllIllI).handleMouseRelease(lllllllllllllllIlIIllIIlllllIllI, lllllllllllllllIlIIllIIllllIlIlI - lllllllllllllllIlIIllIIlllllIlIl[lllllIllIllI[0]], lllllllllllllllIlIIllIIllllIllIl - lllllllllllllllIlIIllIIlllllIlIl[lllllIllIllI[1]], lllllllllllllllIlIIllIIllllIllII);
            ArrayList<Component> lllllllllllllllIlIIllIIlllllIlII = new ArrayList();
            Object lllllllllllllllIlIIllIIlllllIIll = lllllllllllllllIlIIllIIlllllIllI;

            while(lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIlllllIIll)) {
               lllllllllllllllIlIIllIIlllllIlII.add(lllllIllIllI[0], lllllllllllllllIlIIllIIlllllIIll);
               lllllllllllllllIlIIllIIlllllIIll = ((Component)lllllllllllllllIlIIllIIlllllIIll).getParent();
               "".length();
               if (-" ".length() > ((86 ^ 71) & ~(89 ^ 72))) {
                  return;
               }
            }

            MouseListener.MouseButtonEvent lllllllllllllllIlIIllIIlllllIIII = new MouseListener.MouseButtonEvent(lllllllllllllllIlIIllIIllllIlIlI, lllllllllllllllIlIIllIIllllIllIl, lllllllllllllllIlIIllIIllllIllII, lllllllllllllllIlIIllIIlllllIllI);
            Iterator lllllllllllllllIlIIllIIllllIIIII = lllllllllllllllIlIIllIIlllllIlII.iterator();

            while(lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllllIIIII.hasNext())) {
               Component lllllllllllllllIlIIllIIlllllIlll = (Component)lllllllllllllllIlIIllIIllllIIIII.next();
               lllllllllllllllIlIIllIIlllllIIII.setX(lllllllllllllllIlIIllIIlllllIIII.getX() - lllllllllllllllIlIIllIIlllllIlll.getX());
               lllllllllllllllIlIIllIIlllllIIII.setY(lllllllllllllllIlIIllIIlllllIIII.getY() - lllllllllllllllIlIIllIIlllllIlll.getY());
               if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIlllllIlll instanceof Container)) {
                  lllllllllllllllIlIIllIIlllllIIII.setX(lllllllllllllllIlIIllIIlllllIIII.getX() - ((Container)lllllllllllllllIlIIllIIlllllIlll).getOriginOffsetX());
                  lllllllllllllllIlIIllIIlllllIIII.setY(lllllllllllllllIlIIllIIlllllIIII.getY() - ((Container)lllllllllllllllIlIIllIIlllllIlll).getOriginOffsetY());
               }

               lllllllllllllllIlIIllIIlllllIlll.getMouseListeners().forEach((lllllllllllllllIlIIllIIlIlIlIlIl) -> {
                  lllllllllllllllIlIIllIIlIlIlIlIl.onMouseRelease(lllllllllllllllIlIIllIIlllllIIII);
               });
               if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIlllllIIII.isCancelled())) {
                  "".length();
                  if (-" ".length() == " ".length() << " ".length()) {
                     return;
                  }
                  break;
               }

               "".length();
               if (" ".length() << (" ".length() << " ".length()) == 0) {
                  return;
               }
            }

            lllllllllllllllIlIIllIIllllIllll.press = (boolean)lllllIllIllI[0];
         }

      }
   }

   private static boolean lIlIIlIIIIlIII(Object var0) {
      return var0 == null;
   }

   public void catchKey() {
      if (!lIlIIlIIIIlIII(lllllllllllllllIlIIllIlIIIllIIII.focus)) {
         while(lIlIIlIIIIlIlI(Keyboard.next())) {
            if (lIlIIlIIIIlIlI(Keyboard.getEventKeyState())) {
               lllllllllllllllIlIIllIlIIIllIIII.handleKeyDown(Keyboard.getEventKey());
               "".length();
               if (" ".length() << (" ".length() << " ".length()) <= 0) {
                  return;
               }
            } else {
               lllllllllllllllIlIIllIlIIIllIIII.handleKeyUp(Keyboard.getEventKey());
               "".length();
               if (" ".length() < -" ".length()) {
                  return;
               }
            }
         }

      }
   }

   private static boolean lIlIIlIIIIllIl(int var0) {
      return var0 > 0;
   }

   public void callTick(Container lllllllllllllllIlIIllIIllIIIIlII) {
      lllllllllllllllIlIIllIIllIIIIlII.getTickListeners().forEach((lllllllllllllllIlIIllIIlIllIIlll) -> {
         lllllllllllllllIlIIllIIlIllIIlll.onTick();
      });
      Iterator lllllllllllllllIlIIllIIllIIIIIll = lllllllllllllllIlIIllIIllIIIIlII.getChildren().iterator();

      do {
         if (!lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIIIIIll.hasNext())) {
            return;
         }

         int lllllllllllllllIlIIllIIllIIIIIlI = (Component)lllllllllllllllIlIIllIIllIIIIIll.next();
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIIIIIlI instanceof Container)) {
            lllllllllllllllIlIIllIIllIIIIlIl.callTick((Container)lllllllllllllllIlIIllIIllIIIIIlI);
            "".length();
            if ("   ".length() < 0) {
               return;
            }
         } else {
            lllllllllllllllIlIIllIIllIIIIIlI.getTickListeners().forEach((lllllllllllllllIlIIllIIlIllIlIll) -> {
               lllllllllllllllIlIIllIIlIllIlIll.onTick();
            });
         }

         "".length();
      } while(" ".length() << " ".length() >= 0);

   }

   private static boolean lIlIIlIIIIlIlI(int var0) {
      return var0 != 0;
   }

   public void handleKeyUp(int lllllllllllllllIlIIllIlIIIlllIII) {
      if (!lIlIIlIIIIlIII(lllllllllllllllIlIIllIlIIIlllIIl.focus)) {
         lllllllllllllllIlIIllIlIIIlllIIl.focus.getTheme().getUIForComponent(lllllllllllllllIlIIllIlIIIlllIIl.focus).handleKeyUp(lllllllllllllllIlIIllIlIIIlllIIl.focus, lllllllllllllllIlIIllIlIIIlllIII);
         ArrayList<Component> lllllllllllllllIlIIllIlIIIllllII = new ArrayList();
         Object lllllllllllllllIlIIllIlIIIllIllI = lllllllllllllllIlIIllIlIIIlllIIl.focus;

         do {
            if (!lIlIIlIIIIlIIl(lllllllllllllllIlIIllIlIIIllIllI)) {
               boolean lllllllllllllllIlIIllIlIIIllIlIl = new KeyListener.KeyEvent(lllllllllllllllIlIIllIlIIIlllIII);
               Iterator lllllllllllllllIlIIllIlIIIllIlII = lllllllllllllllIlIIllIlIIIllllII.iterator();

               do {
                  if (!lIlIIlIIIIlIlI(lllllllllllllllIlIIllIlIIIllIlII.hasNext())) {
                     return;
                  }

                  float lllllllllllllllIlIIllIlIIIllIIll = (Component)lllllllllllllllIlIIllIlIIIllIlII.next();
                  lllllllllllllllIlIIllIlIIIllIIll.getKeyListeners().forEach((lllllllllllllllIlIIllIIlIlIIIIll) -> {
                     lllllllllllllllIlIIllIIlIlIIIIll.onKeyUp(lllllllllllllllIlIIllIlIIIllIlIl);
                  });
                  "".length();
               } while(" ".length() << " ".length() < "   ".length());

               return;
            }

            lllllllllllllllIlIIllIlIIIllllII.add(lllllIllIllI[0], lllllllllllllllIlIIllIlIIIllIllI);
            lllllllllllllllIlIIllIlIIIllIllI = ((Component)lllllllllllllllIlIIllIlIIIllIllI).getParent();
            "".length();
         } while(-"   ".length() <= 0);

      }
   }

   public abstract void destroyGUI();

   public void handleWheel(int lllllllllllllllIlIIllIIlllIIIIlI, int lllllllllllllllIlIIllIIlllIIIIIl, int lllllllllllllllIlIIllIIlllIIllII) {
      if (!lIlIIlIIIIlIll(lllllllllllllllIlIIllIIlllIIllII)) {
         boolean lllllllllllllllIlIIllIIllIlllllI = lllllllllllllllIlIIllIIlllIIIIll.getComponentAt(lllllllllllllllIlIIllIIlllIIIIlI, lllllllllllllllIlIIllIIlllIIIIIl);
         int[] lllllllllllllllIlIIllIIlllIIlIIl = calculateRealPosition(lllllllllllllllIlIIllIIllIlllllI);
         ComponentUI var10000 = lllllllllllllllIlIIllIIlllIIIIll.getTheme().getUIForComponent(lllllllllllllllIlIIllIIllIlllllI);
         int var10002 = lllllllllllllllIlIIllIIlllIIIIlI - lllllllllllllllIlIIllIIlllIIlIIl[lllllIllIllI[0]];
         int var10003 = lllllllllllllllIlIIllIIlllIIIIIl - lllllllllllllllIlIIllIIlllIIlIIl[lllllIllIllI[1]];
         int var10005;
         if (lIlIIlIIIIllIl(lllllllllllllllIlIIllIIlllIIllII)) {
            var10005 = lllllIllIllI[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == "   ".length()) {
               return;
            }
         } else {
            var10005 = lllllIllIllI[0];
         }

         var10000.handleScroll(lllllllllllllllIlIIllIIllIlllllI, var10002, var10003, lllllllllllllllIlIIllIIlllIIllII, (boolean)var10005);
         ArrayList<Component> lllllllllllllllIlIIllIIlllIIlIII = new ArrayList();
         Object lllllllllllllllIlIIllIIllIlllIll = lllllllllllllllIlIIllIIllIlllllI;

         while(lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIllIlllIll)) {
            lllllllllllllllIlIIllIIlllIIlIII.add(lllllIllIllI[0], lllllllllllllllIlIIllIIllIlllIll);
            lllllllllllllllIlIIllIIllIlllIll = ((Component)lllllllllllllllIlIIllIIllIlllIll).getParent();
            "".length();
            if (((163 ^ 178 ^ (185 ^ 180) << " ".length()) << "   ".length() & (((97 ^ 72) << (" ".length() << " ".length()) ^ 141 + 68 - 186 + 152) << "   ".length() ^ -" ".length())) != 0) {
               return;
            }
         }

         MouseListener.MouseScrollEvent var14 = new MouseListener.MouseScrollEvent;
         int var10004;
         if (lIlIIlIIIIllIl(lllllllllllllllIlIIllIIlllIIllII)) {
            var10004 = lllllIllIllI[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < "   ".length()) {
               return;
            }
         } else {
            var10004 = lllllIllIllI[0];
         }

         var14.<init>(lllllllllllllllIlIIllIIlllIIIIlI, lllllllllllllllIlIIllIIlllIIIIIl, (boolean)var10004, lllllllllllllllIlIIllIIllIlllllI);
         short lllllllllllllllIlIIllIIllIlllIII = var14;
         Iterator lllllllllllllllIlIIllIIllIllIlll = lllllllllllllllIlIIllIIlllIIlIII.iterator();

         while(lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIllIlll.hasNext())) {
            Component lllllllllllllllIlIIllIIlllIlIIII = (Component)lllllllllllllllIlIIllIIllIllIlll.next();
            lllllllllllllllIlIIllIIllIlllIII.setX(lllllllllllllllIlIIllIIllIlllIII.getX() - lllllllllllllllIlIIllIIlllIlIIII.getX());
            lllllllllllllllIlIIllIIllIlllIII.setY(lllllllllllllllIlIIllIIllIlllIII.getY() - lllllllllllllllIlIIllIIlllIlIIII.getY());
            if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIlllIlIIII instanceof Container)) {
               lllllllllllllllIlIIllIIllIlllIII.setX(lllllllllllllllIlIIllIIllIlllIII.getX() - ((Container)lllllllllllllllIlIIllIIlllIlIIII).getOriginOffsetX());
               lllllllllllllllIlIIllIIllIlllIII.setY(lllllllllllllllIlIIllIIllIlllIII.getY() - ((Container)lllllllllllllllIlIIllIIlllIlIIII).getOriginOffsetY());
            }

            lllllllllllllllIlIIllIIlllIlIIII.getMouseListeners().forEach((lllllllllllllllIlIIllIIlIlIlllIl) -> {
               lllllllllllllllIlIIllIIlIlIlllIl.onScroll(lllllllllllllllIlIIllIIllIlllIII);
            });
            if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIlllIII.isCancelled())) {
               "".length();
               if ((((102 ^ 37) << " ".length() ^ 1 + 118 - 52 + 88) << " ".length() & ((77 ^ 90 ^ (52 ^ 49) << " ".length()) << " ".length() ^ -" ".length())) == "   ".length()) {
                  return;
               }
               break;
            }

            "".length();
            if (" ".length() << (" ".length() << " ".length()) < 0) {
               return;
            }
         }

      }
   }

   public void handleMouseDrag(int lllllllllllllllIlIIllIIllIlIlIII, int lllllllllllllllIlIIllIIllIIllllI) {
      int[] lllllllllllllllIlIIllIIllIlIIllI = calculateRealPosition(lllllllllllllllIlIIllIIllIlIlIIl.focus);
      int lllllllllllllllIlIIllIIllIlIIlIl = lllllllllllllllIlIIllIIllIlIlIII - lllllllllllllllIlIIllIIllIlIIllI[lllllIllIllI[0]];
      byte lllllllllllllllIlIIllIIllIIllIll = lllllllllllllllIlIIllIIllIIllllI - lllllllllllllllIlIIllIIllIlIIllI[lllllIllIllI[1]];
      lllllllllllllllIlIIllIIllIlIlIIl.getTheme().getUIForComponent(lllllllllllllllIlIIllIIllIlIlIIl.focus).handleMouseDrag(lllllllllllllllIlIIllIIllIlIlIIl.focus, lllllllllllllllIlIIllIIllIlIIlIl, lllllllllllllllIlIIllIIllIIllIll, lllllllllllllllIlIIllIIllIlIlIIl.button);
      ArrayList<Component> lllllllllllllllIlIIllIIllIIllIlI = new ArrayList();
      Object lllllllllllllllIlIIllIIllIIllIIl = lllllllllllllllIlIIllIIllIlIlIIl.focus;

      while(lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIllIIllIIl)) {
         lllllllllllllllIlIIllIIllIIllIlI.add(lllllIllIllI[0], lllllllllllllllIlIIllIIllIIllIIl);
         lllllllllllllllIlIIllIIllIIllIIl = ((Component)lllllllllllllllIlIIllIIllIIllIIl).getParent();
         "".length();
         if (null != null) {
            return;
         }
      }

      MouseListener.MouseButtonEvent lllllllllllllllIlIIllIIllIlIIIIl = new MouseListener.MouseButtonEvent(lllllllllllllllIlIIllIIllIlIlIII, lllllllllllllllIlIIllIIllIIllllI, lllllllllllllllIlIIllIIllIlIlIIl.button, lllllllllllllllIlIIllIIllIlIlIIl.focus);
      Iterator lllllllllllllllIlIIllIIllIIlIlll = lllllllllllllllIlIIllIIllIIllIlI.iterator();

      while(lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIIlIlll.hasNext())) {
         Component lllllllllllllllIlIIllIIllIlIlIlI = (Component)lllllllllllllllIlIIllIIllIIlIlll.next();
         lllllllllllllllIlIIllIIllIlIIIIl.setX(lllllllllllllllIlIIllIIllIlIIIIl.getX() - lllllllllllllllIlIIllIIllIlIlIlI.getX());
         lllllllllllllllIlIIllIIllIlIIIIl.setY(lllllllllllllllIlIIllIIllIlIIIIl.getY() - lllllllllllllllIlIIllIIllIlIlIlI.getY());
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIlIlIlI instanceof Container)) {
            lllllllllllllllIlIIllIIllIlIIIIl.setX(lllllllllllllllIlIIllIIllIlIIIIl.getX() - ((Container)lllllllllllllllIlIIllIIllIlIlIlI).getOriginOffsetX());
            lllllllllllllllIlIIllIIllIlIIIIl.setY(lllllllllllllllIlIIllIIllIlIIIIl.getY() - ((Container)lllllllllllllllIlIIllIIllIlIlIlI).getOriginOffsetY());
         }

         lllllllllllllllIlIIllIIllIlIlIlI.getMouseListeners().forEach((lllllllllllllllIlIIllIIlIllIIIll) -> {
            lllllllllllllllIlIIllIIlIllIIIll.onMouseDrag(lllllllllllllllIlIIllIIllIlIIIIl);
         });
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIllIlIIIIl.isCancelled())) {
            "".length();
            if (((22 + 161 - 80 + 72 ^ (36 ^ 11) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & ((41 ^ 108 ^ (125 ^ 86) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
               return;
            }
            break;
         }

         "".length();
         if (" ".length() << (" ".length() << " ".length()) < 0) {
            return;
         }
      }

   }

   public static int[] calculateRealPosition(Component lllllllllllllllIlIIllIIlIlllIIII) {
      int lllllllllllllllIlIIllIIlIlllIIll = lllllllllllllllIlIIllIIlIlllIIII.getX();
      int lllllllllllllllIlIIllIIlIlllIIlI = lllllllllllllllIlIIllIIlIlllIIII.getY();
      if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIlIlllIIII instanceof Container)) {
         lllllllllllllllIlIIllIIlIlllIIll += ((Container)lllllllllllllllIlIIllIIlIlllIIII).getOriginOffsetX();
         lllllllllllllllIlIIllIIlIlllIIlI += ((Container)lllllllllllllllIlIIllIIlIlllIIII).getOriginOffsetY();
      }

      Container lllllllllllllllIlIIllIIlIlllIIIl = lllllllllllllllIlIIllIIlIlllIIII.getParent();

      do {
         if (!lIlIIlIIIIlIIl(lllllllllllllllIlIIllIIlIlllIIIl)) {
            int[] var10000 = new int[lllllIllIllI[3]];
            var10000[lllllIllIllI[0]] = lllllllllllllllIlIIllIIlIlllIIll;
            var10000[lllllIllIllI[1]] = lllllllllllllllIlIIllIIlIlllIIlI;
            return var10000;
         }

         lllllllllllllllIlIIllIIlIlllIIll += lllllllllllllllIlIIllIIlIlllIIIl.getX();
         lllllllllllllllIlIIllIIlIlllIIlI += lllllllllllllllIlIIllIIlIlllIIIl.getY();
         if (lIlIIlIIIIlIlI(lllllllllllllllIlIIllIIlIlllIIIl instanceof Container)) {
            lllllllllllllllIlIIllIIlIlllIIll += ((Container)lllllllllllllllIlIIllIIlIlllIIIl).getOriginOffsetX();
            lllllllllllllllIlIIllIIlIlllIIlI += ((Container)lllllllllllllllIlIIllIIlIlllIIIl).getOriginOffsetY();
         }

         lllllllllllllllIlIIllIIlIlllIIIl = lllllllllllllllIlIIllIIlIlllIIIl.getParent();
         "".length();
      } while("   ".length() != 0);

      return null;
   }
}
