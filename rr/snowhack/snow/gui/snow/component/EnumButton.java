package rr.snowhack.snow.gui.snow.component;

import rr.snowhack.snow.gui.rgui.component.use.Button;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.Poof;

public class EnumButton extends Button {
   // $FF: synthetic field
   int index;
   // $FF: synthetic field
   private static final int[] lIIIlIlIlIlIl;
   // $FF: synthetic field
   String[] modes;

   private static boolean lIllIIIlIIlIll(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean lIllIIIlIIlIlI(int var0) {
      return var0 < 0;
   }

   public void setIndex(int lllllllllllllllIIllIllIIlIIIIIll) {
      lllllllllllllllIIllIllIIlIIIIllI.index = lllllllllllllllIIllIllIIlIIIIIll;
   }

   public int getIndex() {
      return lllllllllllllllIIllIllIIlIIlIIII.index;
   }

   public String getIndexMode() {
      return lllllllllllllllIIllIllIIlIIIlIlI.modes[lllllllllllllllIIllIllIIlIIIlIlI.index];
   }

   static {
      lIllIIIlIIlIIl();
   }

   public EnumButton(String lllllllllllllllIIllIllIIlIlIIlIl, String[] lllllllllllllllIIllIllIIlIlIIlll) {
      super(lllllllllllllllIIllIllIIlIlIIlIl);
      lllllllllllllllIIllIllIIlIlIIllI.modes = lllllllllllllllIIllIllIIlIlIIlll;
      lllllllllllllllIIllIllIIlIlIIllI.index = lIIIlIlIlIlIl[0];
      lllllllllllllllIIllIllIIlIlIIllI.addPoof(new Button.ButtonPoof<EnumButton, Button.ButtonPoof.ButtonInfo>() {
         // $FF: synthetic field
         private static final int[] lllIlIlIIlll;

         private static int lIIllIIllIIIIl(double var0, double var2) {
            double var4;
            return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
         }

         private static boolean lIIllIIllIIIll(int var0) {
            return var0 <= 0;
         }

         private static boolean lIIllIIllIIIlI(int var0) {
            return var0 == 0;
         }

         public void execute(EnumButton lllllllllllllllIlIlllllIIlllllII, Button.ButtonPoof.ButtonInfo lllllllllllllllIlIlllllIIllllllI) {
            if (lIIllIIllIIIlI(lllllllllllllllIlIlllllIIllllllI.getButton())) {
               double lllllllllllllllIlIlllllIlIIIIIIl = (double)lllllllllllllllIlIlllllIIllllllI.getX() / (double)lllllllllllllllIlIlllllIIlllllII.getWidth();
               if (lIIllIIllIIIll(lIIllIIllIIIIl(lllllllllllllllIlIlllllIlIIIIIIl, 0.5D))) {
                  lllllllllllllllIIllIllIIlIlIIllI.increaseIndex(lllIlIlIIlll[0]);
                  "".length();
                  if ("   ".length() == " ".length()) {
                     return;
                  }
               } else {
                  lllllllllllllllIIllIllIIlIlIIllI.increaseIndex(lllIlIlIIlll[1]);
               }
            }

         }

         static {
            lIIllIIllIIIII();
         }

         private static void lIIllIIllIIIII() {
            lllIlIlIIlll = new int[2];
            lllIlIlIIlll[0] = -" ".length();
            lllIlIlIIlll[1] = " ".length();
         }
      });
   }

   private static void lIllIIIlIIlIIl() {
      lIIIlIlIlIlIl = new int[1];
      lIIIlIlIlIlIl[0] = ((30 ^ 25) << (" ".length() << " ".length()) ^ 5 ^ 76) & ((85 ^ 72) << " ".length() ^ 9 ^ 102 ^ -" ".length());
   }

   protected void increaseIndex(int lllllllllllllllIIllIllIIlIIllIII) {
      int lllllllllllllllIIllIllIIlIIlIlll = lllllllllllllllIIllIllIIlIIllIIl.index;
      int lllllllllllllllIIllIllIIlIIlIllI = lllllllllllllllIIllIllIIlIIllIIl.index + lllllllllllllllIIllIllIIlIIllIII;
      if (lIllIIIlIIlIlI(lllllllllllllllIIllIllIIlIIlIllI)) {
         lllllllllllllllIIllIllIIlIIlIllI = lllllllllllllllIIllIllIIlIIllIIl.modes.length - Math.abs(lllllllllllllllIIllIllIIlIIlIllI);
         "".length();
         if (" ".length() <= (" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()))) {
            return;
         }
      } else if (lIllIIIlIIlIll(lllllllllllllllIIllIllIIlIIlIllI, lllllllllllllllIIllIllIIlIIllIIl.modes.length)) {
         lllllllllllllllIIllIllIIlIIlIllI = Math.abs(lllllllllllllllIIllIllIIlIIlIllI - lllllllllllllllIIllIllIIlIIllIIl.modes.length);
      }

      lllllllllllllllIIllIllIIlIIllIIl.index = Math.min(lllllllllllllllIIllIllIIlIIllIIl.modes.length, Math.max(lIIIlIlIlIlIl[0], lllllllllllllllIIllIllIIlIIlIllI));
      lllllllllllllllIIllIllIIlIIllIIl.callPoof(EnumButton.EnumbuttonIndexPoof.class, new EnumButton.EnumbuttonIndexPoof.EnumbuttonInfo(lllllllllllllllIIllIllIIlIIlIlll, lllllllllllllllIIllIllIIlIIllIIl.index));
   }

   public String[] getModes() {
      return lllllllllllllllIIllIllIIlIIIllII.modes;
   }

   public void setModes(String[] lllllllllllllllIIllIllIIlIIllllI) {
      lllllllllllllllIIllIllIIlIlIIIIl.modes = lllllllllllllllIIllIllIIlIIllllI;
   }

   public abstract static class EnumbuttonIndexPoof<T extends Button, S extends EnumButton.EnumbuttonIndexPoof.EnumbuttonInfo> extends Poof<T, S> {
      // $FF: synthetic field
      Button.ButtonPoof.ButtonInfo info;

      public static class EnumbuttonInfo extends PoofInfo {
         // $FF: synthetic field
         int oldIndex;
         // $FF: synthetic field
         int newIndex;

         public void setNewIndex(int lllllllllllllllIlIlIlIlIlllIIIII) {
            lllllllllllllllIlIlIlIlIllIlllll.newIndex = lllllllllllllllIlIlIlIlIlllIIIII;
         }

         public int getNewIndex() {
            return lllllllllllllllIlIlIlIlIlllIIlIl.newIndex;
         }

         public int getOldIndex() {
            return lllllllllllllllIlIlIlIlIllIllIll.oldIndex;
         }

         public EnumbuttonInfo(int lllllllllllllllIlIlIlIlIlllIlIll, int lllllllllllllllIlIlIlIlIlllIlIlI) {
            lllllllllllllllIlIlIlIlIlllIlIIl.oldIndex = lllllllllllllllIlIlIlIlIlllIlIll;
            lllllllllllllllIlIlIlIlIlllIlIIl.newIndex = lllllllllllllllIlIlIlIlIlllIlIlI;
         }
      }
   }
}
