package rr.snowhack.snow.gui.rgui.component.listen;

public interface KeyListener {
   void onKeyDown(KeyListener.KeyEvent var1);

   void onKeyUp(KeyListener.KeyEvent var1);

   public static class KeyEvent {
      // $FF: synthetic field
      int key;

      public void setKey(int lllllllllllllllIlIlllIllllIlllII) {
         lllllllllllllllIlIlllIllllIllIll.key = lllllllllllllllIlIlllIllllIlllII;
      }

      public int getKey() {
         return lllllllllllllllIlIlllIlllllIIIII.key;
      }

      public KeyEvent(int lllllllllllllllIlIlllIlllllIIIll) {
         lllllllllllllllIlIlllIlllllIIlII.key = lllllllllllllllIlIlllIlllllIIIll;
      }
   }
}
