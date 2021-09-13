package rr.snowhack.snow.gui.rgui.component.listen;

import rr.snowhack.snow.gui.rgui.component.Component;

public interface MouseListener {
   void onMouseRelease(MouseListener.MouseButtonEvent var1);

   void onMouseDown(MouseListener.MouseButtonEvent var1);

   void onMouseDrag(MouseListener.MouseButtonEvent var1);

   void onScroll(MouseListener.MouseScrollEvent var1);

   void onMouseMove(MouseListener.MouseMoveEvent var1);

   public static class MouseButtonEvent {
      // $FF: synthetic field
      int x;
      // $FF: synthetic field
      int button;
      // $FF: synthetic field
      int y;
      // $FF: synthetic field
      Component component;
      // $FF: synthetic field
      private static final int[] lllIlIIIIIIl;
      // $FF: synthetic field
      boolean cancelled;

      private static void lIIllIIIIIIIII() {
         lllIlIIIIIIl = new int[2];
         lllIlIIIIIIl[0] = (27 ^ 52 ^ (142 ^ 129) << (" ".length() << " ".length())) << " ".length() & ((176 ^ 189 ^ (79 ^ 64) << " ".length()) << " ".length() ^ -" ".length());
         lllIlIIIIIIl[1] = " ".length();
      }

      public void cancel() {
         lllllllllllllllIllIIIIllIIlIIlll.cancelled = (boolean)lllIlIIIIIIl[1];
      }

      public int getButton() {
         return lllllllllllllllIllIIIIllIIllllII.button;
      }

      public Component getComponent() {
         return lllllllllllllllIllIIIIllIlIIIlIl.component;
      }

      public MouseButtonEvent(int lllllllllllllllIllIIIIllIlIlIIII, int lllllllllllllllIllIIIIllIlIIllll, int lllllllllllllllIllIIIIllIlIIlllI, Component lllllllllllllllIllIIIIllIlIIlIII) {
         lllllllllllllllIllIIIIllIlIIllII.cancelled = (boolean)lllIlIIIIIIl[0];
         lllllllllllllllIllIIIIllIlIIllII.x = lllllllllllllllIllIIIIllIlIlIIII;
         lllllllllllllllIllIIIIllIlIIllII.y = lllllllllllllllIllIIIIllIlIIllll;
         lllllllllllllllIllIIIIllIlIIllII.button = lllllllllllllllIllIIIIllIlIIlllI;
         lllllllllllllllIllIIIIllIlIIllII.component = lllllllllllllllIllIIIIllIlIIlIII;
      }

      public int getX() {
         return lllllllllllllllIllIIIIllIIllIIll.x;
      }

      public void setY(int lllllllllllllllIllIIIIllIIlIllll) {
         lllllllllllllllIllIIIIllIIlIlllI.y = lllllllllllllllIllIIIIllIIlIllll;
      }

      public void setX(int lllllllllllllllIllIIIIllIIllIllI) {
         lllllllllllllllIllIIIIllIIlllIIl.x = lllllllllllllllIllIIIIllIIllIllI;
      }

      static {
         lIIllIIIIIIIII();
      }

      public int getY() {
         return lllllllllllllllIllIIIIllIIlIlIlI.y;
      }

      public void setButton(int lllllllllllllllIllIIIIllIlIIIIIl) {
         lllllllllllllllIllIIIIllIlIIIIlI.button = lllllllllllllllIllIIIIllIlIIIIIl;
      }

      public boolean isCancelled() {
         return lllllllllllllllIllIIIIllIIlIIlII.cancelled;
      }
   }

   public static class MouseMoveEvent {
      // $FF: synthetic field
      boolean cancelled;
      // $FF: synthetic field
      int oldX;
      // $FF: synthetic field
      Component component;
      // $FF: synthetic field
      int oldY;
      // $FF: synthetic field
      int x;
      // $FF: synthetic field
      int y;
      // $FF: synthetic field
      private static final int[] lIIIIIIIIIllI;

      public int getX() {
         return lllllllllllllllIlIIlIIlIlIIlIIIl.x;
      }

      public void setY(int lllllllllllllllIlIIlIIlIlIIIIlII) {
         lllllllllllllllIlIIlIIlIlIIIIlIl.y = lllllllllllllllIlIIlIIlIlIIIIlII;
      }

      public int getY() {
         return lllllllllllllllIlIIlIIlIlIIlIlII.y;
      }

      public void setX(int lllllllllllllllIlIIlIIlIlIIIllII) {
         lllllllllllllllIlIIlIIlIlIIIllIl.x = lllllllllllllllIlIIlIIlIlIIIllII;
      }

      public int getOldY() {
         return lllllllllllllllIlIIlIIlIlIIlIlll.oldY;
      }

      static {
         lIlIIllIIllIII();
      }

      public boolean isCancelled() {
         return lllllllllllllllIlIIlIIlIlIIIIIlI.cancelled;
      }

      private static void lIlIIllIIllIII() {
         lIIIIIIIIIllI = new int[1];
         lIIIIIIIIIllI[0] = ((255 ^ 174) << " ".length() ^ 56 + 38 - 16 + 67) & ((92 ^ 7) << " ".length() ^ 2 + 20 - -70 + 41 ^ -" ".length());
      }

      public MouseMoveEvent(int lllllllllllllllIlIIlIIlIlIlIIIll, int lllllllllllllllIlIIlIIlIlIlIIIlI, int lllllllllllllllIlIIlIIlIlIlIIIIl, int lllllllllllllllIlIIlIIlIlIlIIllI, Component lllllllllllllllIlIIlIIlIlIlIIlIl) {
         lllllllllllllllIlIIlIIlIlIlIIlII.cancelled = (boolean)lIIIIIIIIIllI[0];
         lllllllllllllllIlIIlIIlIlIlIIlII.x = lllllllllllllllIlIIlIIlIlIlIIIll;
         lllllllllllllllIlIIlIIlIlIlIIlII.y = lllllllllllllllIlIIlIIlIlIlIIIlI;
         lllllllllllllllIlIIlIIlIlIlIIlII.oldX = lllllllllllllllIlIIlIIlIlIlIIIIl;
         lllllllllllllllIlIIlIIlIlIlIIlII.oldY = lllllllllllllllIlIIlIIlIlIlIIllI;
         lllllllllllllllIlIIlIIlIlIlIIlII.component = lllllllllllllllIlIIlIIlIlIlIIlIl;
      }

      public int getOldX() {
         return lllllllllllllllIlIIlIIlIlIIllIlI.oldX;
      }

      public Component getComponent() {
         return lllllllllllllllIlIIlIIlIlIIlllII.component;
      }
   }

   public static class MouseScrollEvent {
      // $FF: synthetic field
      int y;
      // $FF: synthetic field
      int x;
      // $FF: synthetic field
      Component component;
      // $FF: synthetic field
      private static final int[] lIIIIlIIllIII;
      // $FF: synthetic field
      boolean up;
      // $FF: synthetic field
      private boolean cancelled;

      public int getX() {
         return lllllllllllllllIlIIIIIIIllIIIllI.x;
      }

      public void setY(int lllllllllllllllIlIIIIIIIllIIIIlI) {
         lllllllllllllllIlIIIIIIIllIIIIll.y = lllllllllllllllIlIIIIIIIllIIIIlI;
      }

      public boolean isUp() {
         return lllllllllllllllIlIIIIIIIllIlIllI.up;
      }

      public int getY() {
         return lllllllllllllllIlIIIIIIIlIlllllI.y;
      }

      public void cancel() {
         lllllllllllllllIlIIIIIIIlIlllIll.cancelled = (boolean)lIIIIlIIllIII[0];
      }

      private static void lIlIlIllIIlIIl() {
         lIIIIlIIllIII = new int[1];
         lIIIIlIIllIII[0] = " ".length();
      }

      public Component getComponent() {
         return lllllllllllllllIlIIIIIIIllIllIIl.component;
      }

      static {
         lIlIlIllIIlIIl();
      }

      public void setX(int lllllllllllllllIlIIIIIIIllIIlIll) {
         lllllllllllllllIlIIIIIIIllIIllII.x = lllllllllllllllIlIIIIIIIllIIlIll;
      }

      public void setUp(boolean lllllllllllllllIlIIIIIIIllIlIIIl) {
         lllllllllllllllIlIIIIIIIllIlIIII.up = lllllllllllllllIlIIIIIIIllIlIIIl;
      }

      public MouseScrollEvent(int lllllllllllllllIlIIIIIIIlllIIIll, int lllllllllllllllIlIIIIIIIllIlllIl, boolean lllllllllllllllIlIIIIIIIlllIIIIl, Component lllllllllllllllIlIIIIIIIllIllIll) {
         lllllllllllllllIlIIIIIIIlllIIlII.x = lllllllllllllllIlIIIIIIIlllIIIll;
         lllllllllllllllIlIIIIIIIlllIIlII.y = lllllllllllllllIlIIIIIIIllIlllIl;
         lllllllllllllllIlIIIIIIIlllIIlII.up = lllllllllllllllIlIIIIIIIlllIIIIl;
         lllllllllllllllIlIIIIIIIlllIIlII.component = lllllllllllllllIlIIIIIIIllIllIll;
      }

      public boolean isCancelled() {
         return lllllllllllllllIlIIIIIIIlIllIlll.cancelled;
      }
   }
}
