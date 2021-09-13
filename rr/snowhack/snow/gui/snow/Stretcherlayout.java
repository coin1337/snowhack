package rr.snowhack.snow.gui.snow;

import java.util.ArrayList;
import java.util.Iterator;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.layout.Layout;

public class Stretcherlayout implements Layout {
   // $FF: synthetic field
   public int COMPONENT_OFFSET_Y;
   // $FF: synthetic field
   int blocks;
   // $FF: synthetic field
   private static final int[] lIIIIIlIllIll;
   // $FF: synthetic field
   int maxrows;
   // $FF: synthetic field
   public int COMPONENT_OFFSET_X;

   public Stretcherlayout(int lllllllllllllllIlIIIIllIIlllIlII) {
      lllllllllllllllIlIIIIllIIlllIlll.COMPONENT_OFFSET_X = lIIIIIlIllIll[0];
      lllllllllllllllIlIIIIllIIlllIlll.COMPONENT_OFFSET_Y = lIIIIIlIllIll[1];
      lllllllllllllllIlIIIIllIIlllIlll.maxrows = lIIIIIlIllIll[2];
      lllllllllllllllIlIIIIllIIlllIlll.blocks = lllllllllllllllIlIIIIllIIlllIlII;
   }

   private static boolean lIlIlIIlIllIll(int var0) {
      return var0 != 0;
   }

   public void setComponentOffsetWidth(int lllllllllllllllIlIIIIllIIlIIIIlI) {
      lllllllllllllllIlIIIIllIIlIIIIIl.COMPONENT_OFFSET_X = lllllllllllllllIlIIIIllIIlIIIIlI;
   }

   static {
      lIlIlIIlIllIlI();
   }

   public void organiseContainer(Container lllllllllllllllIlIIIIllIIlIlIIII) {
      int lllllllllllllllIlIIIIllIIlIllIIl = lIIIIIlIllIll[3];
      int lllllllllllllllIlIIIIllIIlIIlllI = lIIIIIlIllIll[3];
      String lllllllllllllllIlIIIIllIIlIIllIl = lIIIIIlIllIll[3];
      int lllllllllllllllIlIIIIllIIlIlIllI = lIIIIIlIllIll[3];
      int lllllllllllllllIlIIIIllIIlIlIlIl = lIIIIIlIllIll[3];
      ArrayList<Component> lllllllllllllllIlIIIIllIIlIIlIlI = lllllllllllllllIlIIIIllIIlIlIIII.getChildren();
      Iterator lllllllllllllllIlIIIIllIIlIIlIIl = lllllllllllllllIlIIIIllIIlIIlIlI.iterator();

      while(lIlIlIIlIllIll(lllllllllllllllIlIIIIllIIlIIlIIl.hasNext())) {
         Component lllllllllllllllIlIIIIllIIlIllllI = (Component)lllllllllllllllIlIIIIllIIlIIlIIl.next();
         if (lIlIlIIlIlllII(lllllllllllllllIlIIIIllIIlIllllI.doAffectLayout())) {
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < -" ".length()) {
               return;
            }
         } else {
            lllllllllllllllIlIIIIllIIlIlIllI += lllllllllllllllIlIIIIllIIlIllllI.getWidth() + lllllllllllllllIlIIIIllIIlIlIIIl.COMPONENT_OFFSET_X;
            lllllllllllllllIlIIIIllIIlIlIlIl = Math.max(lllllllllllllllIlIIIIllIIlIlIlIl, lllllllllllllllIlIIIIllIIlIllllI.getHeight());
            ++lllllllllllllllIlIIIIllIIlIIllIl;
            if (lIlIlIIlIlllIl(lllllllllllllllIlIIIIllIIlIIllIl, lllllllllllllllIlIIIIllIIlIlIIIl.blocks)) {
               lllllllllllllllIlIIIIllIIlIllIIl = Math.max(lllllllllllllllIlIIIIllIIlIllIIl, lllllllllllllllIlIIIIllIIlIlIllI);
               lllllllllllllllIlIIIIllIIlIIlllI += lllllllllllllllIlIIIIllIIlIlIlIl + lllllllllllllllIlIIIIllIIlIlIIIl.COMPONENT_OFFSET_Y;
               lllllllllllllllIlIIIIllIIlIlIllI = lllllllllllllllIlIIIIllIIlIlIlIl = lllllllllllllllIlIIIIllIIlIIllIl = lIIIIIlIllIll[3];
            }

            "".length();
            if (" ".length() << " ".length() < 0) {
               return;
            }
         }
      }

      long lllllllllllllllIlIIIIllIIlIIlIIl = lIIIIIlIllIll[3];
      int lllllllllllllllIlIIIIllIIlIlIIlI = lIIIIIlIllIll[3];
      Iterator lllllllllllllllIlIIIIllIIlIIIlll = lllllllllllllllIlIIIIllIIlIIlIlI.iterator();

      Component lllllllllllllllIlIIIIllIIlIlllII;
      while(lIlIlIIlIllIll(lllllllllllllllIlIIIIllIIlIIIlll.hasNext())) {
         lllllllllllllllIlIIIIllIIlIlllII = (Component)lllllllllllllllIlIIIIllIIlIIIlll.next();
         if (lIlIlIIlIlllII(lllllllllllllllIlIIIIllIIlIlllII.doAffectLayout())) {
            "".length();
            if ((" ".length() & ~" ".length()) != ((229 ^ 172) & ~(68 ^ 13))) {
               return;
            }
         } else {
            lllllllllllllllIlIIIIllIIlIlllII.setX(lllllllllllllllIlIIIIllIIlIIlIIl + lllllllllllllllIlIIIIllIIlIlIIIl.COMPONENT_OFFSET_X / lIIIIIlIllIll[4]);
            lllllllllllllllIlIIIIllIIlIlllII.setY(lllllllllllllllIlIIIIllIIlIlIIlI + lllllllllllllllIlIIIIllIIlIlIIIl.COMPONENT_OFFSET_Y / lIIIIIlIllIll[4]);
            lllllllllllllllIlIIIIllIIlIlIlIl = Math.max(lllllllllllllllIlIIIIllIIlIlllII.getHeight(), lllllllllllllllIlIIIIllIIlIlIlIl);
            lllllllllllllllIlIIIIllIIlIIlIIl += lllllllllllllllIlIIIIllIIlIllIIl / lllllllllllllllIlIIIIllIIlIlIIIl.blocks;
            if (lIlIlIIlIlllIl(lllllllllllllllIlIIIIllIIlIIlIIl, lllllllllllllllIlIIIIllIIlIllIIl)) {
               lllllllllllllllIlIIIIllIIlIlIIlI += lllllllllllllllIlIIIIllIIlIlIlIl + lllllllllllllllIlIIIIllIIlIlIIIl.COMPONENT_OFFSET_Y;
               lllllllllllllllIlIIIIllIIlIIlIIl = lIIIIIlIllIll[3];
            }

            "".length();
            if (((134 ^ 131) << (" ".length() << " ".length()) & ~((22 ^ 19) << (" ".length() << " ".length()))) < 0) {
               return;
            }
         }
      }

      lllllllllllllllIlIIIIllIIlIlIIII.setWidth(lllllllllllllllIlIIIIllIIlIllIIl);
      lllllllllllllllIlIIIIllIIlIlIIII.setHeight(lllllllllllllllIlIIIIllIIlIIlllI);
      lllllllllllllllIlIIIIllIIlIllIIl -= lllllllllllllllIlIIIIllIIlIlIIIl.COMPONENT_OFFSET_X;
      lllllllllllllllIlIIIIllIIlIIIlll = lllllllllllllllIlIIIIllIIlIIlIlI.iterator();

      do {
         if (!lIlIlIIlIllIll(lllllllllllllllIlIIIIllIIlIIIlll.hasNext())) {
            return;
         }

         lllllllllllllllIlIIIIllIIlIlllII = (Component)lllllllllllllllIlIIIIllIIlIIIlll.next();
         if (lIlIlIIlIlllII(lllllllllllllllIlIIIIllIIlIlllII.doAffectLayout())) {
            return;
         }

         lllllllllllllllIlIIIIllIIlIlllII.setWidth(lllllllllllllllIlIIIIllIIlIllIIl);
         "".length();
      } while(((14 ^ 49 ^ (39 ^ 48) << " ".length()) & (13 ^ 32 ^ (102 ^ 105) << (" ".length() << " ".length()) ^ -" ".length())) == 0);

   }

   private static boolean lIlIlIIlIlllIl(int var0, int var1) {
      return var0 >= var1;
   }

   public Stretcherlayout(int lllllllllllllllIlIIIIllIIllIllll, int lllllllllllllllIlIIIIllIIllIlIll) {
      lllllllllllllllIlIIIIllIIlllIIII.COMPONENT_OFFSET_X = lIIIIIlIllIll[0];
      lllllllllllllllIlIIIIllIIlllIIII.COMPONENT_OFFSET_Y = lIIIIIlIllIll[1];
      lllllllllllllllIlIIIIllIIlllIIII.maxrows = lIIIIIlIllIll[2];
      lllllllllllllllIlIIIIllIIlllIIII.blocks = lllllllllllllllIlIIIIllIIllIllll;
      lllllllllllllllIlIIIIllIIlllIIII.maxrows = lllllllllllllllIlIIIIllIIllIlIll;
   }

   private static boolean lIlIlIIlIlllII(int var0) {
      return var0 == 0;
   }

   private static void lIlIlIIlIllIlI() {
      lIIIIIlIllIll = new int[5];
      lIIIIIlIllIll[0] = (219 ^ 156 ^ (39 ^ 6) << " ".length()) << " ".length();
      lIIIIIlIllIll[1] = " ".length() << (" ".length() << " ".length());
      lIIIIIlIllIll[2] = -" ".length();
      lIIIIIlIllIll[3] = " ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length())) & ~((77 ^ 2) & ~(143 ^ 192));
      lIIIIIlIllIll[4] = "   ".length();
   }

   public void setComponentOffsetHeight(int lllllllllllllllIlIIIIllIIIllllII) {
      lllllllllllllllIlIIIIllIIIlllIll.COMPONENT_OFFSET_Y = lllllllllllllllIlIIIIllIIIllllII;
   }
}
