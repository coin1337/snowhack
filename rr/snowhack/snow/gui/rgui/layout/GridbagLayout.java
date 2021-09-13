package rr.snowhack.snow.gui.rgui.layout;

import java.util.ArrayList;
import java.util.Iterator;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;

public class GridbagLayout implements Layout {
   // $FF: synthetic field
   private static final int COMPONENT_OFFSET;
   // $FF: synthetic field
   int maxrows;
   // $FF: synthetic field
   int blocks;
   // $FF: synthetic field
   private static final int[] lllIlIIllllI;

   static {
      lIIllIIIlllIlI();
      COMPONENT_OFFSET = lllIlIIllllI[2];
   }

   public GridbagLayout(int lllllllllllllllIllIIIIIIlIlIlIIl, int lllllllllllllllIllIIIIIIlIlIlIll) {
      lllllllllllllllIllIIIIIIlIlIllIl.maxrows = lllIlIIllllI[0];
      lllllllllllllllIllIIIIIIlIlIllIl.blocks = lllllllllllllllIllIIIIIIlIlIlIIl;
      lllllllllllllllIllIIIIIIlIlIllIl.maxrows = lllllllllllllllIllIIIIIIlIlIlIll;
   }

   private static boolean lIIllIIIllllII(int var0) {
      return var0 == 0;
   }

   private static void lIIllIIIlllIlI() {
      lllIlIIllllI = new int[4];
      lllIlIIllllI[0] = -" ".length();
      lllIlIIllllI[1] = (9 + 156 - 13 + 55 ^ (20 ^ 81) << " ".length()) & ((159 ^ 138) << (" ".length() << " ".length()) ^ 6 ^ 23 ^ -" ".length());
      lllIlIIllllI[2] = ((27 ^ 10) << "   ".length() ^ 47 + 22 - 55 + 127) << " ".length();
      lllIlIIllllI[3] = "   ".length();
   }

   public GridbagLayout(int lllllllllllllllIllIIIIIIlIllIIll) {
      lllllllllllllllIllIIIIIIlIllIlII.maxrows = lllIlIIllllI[0];
      lllllllllllllllIllIIIIIIlIllIlII.blocks = lllllllllllllllIllIIIIIIlIllIIll;
   }

   private static boolean lIIllIIIlllIll(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIIIllllIl(int var0, int var1) {
      return var0 >= var1;
   }

   public void organiseContainer(Container lllllllllllllllIllIIIIIIlIIIlllI) {
      float lllllllllllllllIllIIIIIIlIIIllIl = lllIlIIllllI[1];
      int lllllllllllllllIllIIIIIIlIIlIllI = lllIlIIllllI[1];
      int lllllllllllllllIllIIIIIIlIIlIlIl = lllIlIIllllI[1];
      String lllllllllllllllIllIIIIIIlIIIlIlI = lllIlIIllllI[1];
      float lllllllllllllllIllIIIIIIlIIIlIIl = lllIlIIllllI[1];
      ArrayList<Component> lllllllllllllllIllIIIIIIlIIIlIII = lllllllllllllllIllIIIIIIlIIIlllI.getChildren();
      Iterator lllllllllllllllIllIIIIIIlIIIIlll = lllllllllllllllIllIIIIIIlIIIlIII.iterator();

      while(lIIllIIIlllIll(lllllllllllllllIllIIIIIIlIIIIlll.hasNext())) {
         float lllllllllllllllIllIIIIIIlIIIIllI = (Component)lllllllllllllllIllIIIIIIlIIIIlll.next();
         if (lIIllIIIllllII(lllllllllllllllIllIIIIIIlIIIIllI.doAffectLayout())) {
            "".length();
            if ((((20 ^ 63) << " ".length() ^ 195 ^ 184) & ((102 ^ 113) << " ".length() ^ "   ".length() ^ -" ".length())) <= -" ".length()) {
               return;
            }
         } else {
            lllllllllllllllIllIIIIIIlIIIlIlI += lllllllllllllllIllIIIIIIlIIIIllI.getWidth() + lllIlIIllllI[2];
            lllllllllllllllIllIIIIIIlIIIlIIl = Math.max(lllllllllllllllIllIIIIIIlIIIlIIl, lllllllllllllllIllIIIIIIlIIIIllI.getHeight());
            ++lllllllllllllllIllIIIIIIlIIlIlIl;
            if (lIIllIIIllllIl(lllllllllllllllIllIIIIIIlIIlIlIl, lllllllllllllllIllIIIIIIlIIllIIl.blocks)) {
               lllllllllllllllIllIIIIIIlIIIllIl = Math.max(lllllllllllllllIllIIIIIIlIIIllIl, lllllllllllllllIllIIIIIIlIIIlIlI);
               lllllllllllllllIllIIIIIIlIIlIllI += lllllllllllllllIllIIIIIIlIIIlIIl + lllIlIIllllI[2];
               lllllllllllllllIllIIIIIIlIIIlIlI = lllllllllllllllIllIIIIIIlIIIlIIl = lllllllllllllllIllIIIIIIlIIlIlIl = lllIlIIllllI[1];
            }

            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
               return;
            }
         }
      }

      String lllllllllllllllIllIIIIIIlIIIIlll = lllIlIIllllI[1];
      int lllllllllllllllIllIIIIIIlIIlIIII = lllIlIIllllI[1];
      Iterator lllllllllllllllIllIIIIIIlIIIIlIl = lllllllllllllllIllIIIIIIlIIIlIII.iterator();

      while(lIIllIIIlllIll(lllllllllllllllIllIIIIIIlIIIIlIl.hasNext())) {
         Component lllllllllllllllIllIIIIIIlIIllIlI = (Component)lllllllllllllllIllIIIIIIlIIIIlIl.next();
         if (lIIllIIIllllII(lllllllllllllllIllIIIIIIlIIllIlI.doAffectLayout())) {
            "".length();
            if ((" ".length() << " ".length() & ~(" ".length() << " ".length())) != 0) {
               return;
            }
         } else {
            lllllllllllllllIllIIIIIIlIIllIlI.setX(lllllllllllllllIllIIIIIIlIIIIlll + lllIlIIllllI[3]);
            lllllllllllllllIllIIIIIIlIIllIlI.setY(lllllllllllllllIllIIIIIIlIIlIIII + lllIlIIllllI[3]);
            lllllllllllllllIllIIIIIIlIIIlIIl = Math.max(lllllllllllllllIllIIIIIIlIIllIlI.getHeight(), lllllllllllllllIllIIIIIIlIIIlIIl);
            lllllllllllllllIllIIIIIIlIIIIlll += lllllllllllllllIllIIIIIIlIIIllIl / lllllllllllllllIllIIIIIIlIIllIIl.blocks;
            if (lIIllIIIllllIl(lllllllllllllllIllIIIIIIlIIIIlll, lllllllllllllllIllIIIIIIlIIIllIl)) {
               lllllllllllllllIllIIIIIIlIIlIIII += lllllllllllllllIllIIIIIIlIIIlIIl + lllIlIIllllI[2];
               lllllllllllllllIllIIIIIIlIIIIlll = lllIlIIllllI[1];
            }

            "".length();
            if (" ".length() == 0) {
               return;
            }
         }
      }

      lllllllllllllllIllIIIIIIlIIIlllI.setWidth(lllllllllllllllIllIIIIIIlIIIllIl);
      lllllllllllllllIllIIIIIIlIIIlllI.setHeight(lllllllllllllllIllIIIIIIlIIlIllI);
   }
}
