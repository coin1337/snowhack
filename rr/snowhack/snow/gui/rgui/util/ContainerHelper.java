package rr.snowhack.snow.gui.rgui.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rr.snowhack.snow.gui.rgui.GUI;
import rr.snowhack.snow.gui.rgui.component.AlignedComponent;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public class ContainerHelper {
   public static <T extends Component> T getFirstParent(Class<? extends T> lllllllllllllllIIllllllllIlIIlIl, Component lllllllllllllllIIllllllllIlIIlII) {
      if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIlIIlII.getClass().equals(lllllllllllllllIIllllllllIlIIlIl))) {
         return lllllllllllllllIIllllllllIlIIlII;
      } else {
         return lIlIlIllIllIll(lllllllllllllllIIllllllllIlIIlII) ? null : getFirstParent(lllllllllllllllIIllllllllIlIIlIl, lllllllllllllllIIllllllllIlIIlII.getParent());
      }
   }

   public static Component getHighParent(Component lllllllllllllllIIllllllllIlIlIIl) {
      return lIlIlIllIllIlI(lllllllllllllllIIllllllllIlIlIIl.getParent() instanceof GUI) && !lIlIlIllIllIll(lllllllllllllllIIllllllllIlIlIIl.getParent()) ? getHighParent(lllllllllllllllIIllllllllIlIlIIl.getParent()) : lllllllllllllllIIllllllllIlIlIIl;
   }

   private static boolean lIlIlIllIllIlI(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIlIllIllIll(Object var0) {
      return var0 == null;
   }

   public static void setAlignment(Container lllllllllllllllIIllllllllIlllIII, AlignedComponent.Alignment lllllllllllllllIIllllllllIllIlll) {
      Iterator lllllllllllllllIIllllllllIllIlII = lllllllllllllllIIllllllllIlllIII.getChildren().iterator();

      do {
         if (!lIlIlIllIllIIl(lllllllllllllllIIllllllllIllIlII.hasNext())) {
            return;
         }

         Component lllllllllllllllIIllllllllIlllIIl = (Component)lllllllllllllllIIllllllllIllIlII.next();
         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIlllIIl instanceof Container)) {
            setAlignment((Container)lllllllllllllllIIllllllllIlllIIl, lllllllllllllllIIllllllllIllIlll);
         }

         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIlllIIl instanceof AlignedComponent)) {
            ((AlignedComponent)lllllllllllllllIIllllllllIlllIIl).setAlignment(lllllllllllllllIIllllllllIllIlll);
         }

         "".length();
      } while((((115 ^ 26) << " ".length() ^ 68 + 127 - 124 + 64) & ((10 ^ 15) << (" ".length() << (" ".length() << " ".length())) ^ 81 ^ 84 ^ -" ".length())) > -" ".length());

   }

   public static <S extends Component> List<S> getAllChildren(Class<? extends S> lllllllllllllllIIllllllllIIllIII, Container lllllllllllllllIIllllllllIIllIlI) {
      ArrayList<S> lllllllllllllllIIllllllllIIllIIl = new ArrayList();
      Iterator lllllllllllllllIIllllllllIIlIlIl = lllllllllllllllIIllllllllIIllIlI.getChildren().iterator();

      do {
         if (!lIlIlIllIllIIl(lllllllllllllllIIllllllllIIlIlIl.hasNext())) {
            return lllllllllllllllIIllllllllIIllIIl;
         }

         Component lllllllllllllllIIllllllllIIlllII = (Component)lllllllllllllllIIllllllllIIlIlIl.next();
         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIIllIII.isAssignableFrom(lllllllllllllllIIllllllllIIlllII.getClass()))) {
            lllllllllllllllIIllllllllIIllIIl.add(lllllllllllllllIIllllllllIIlllII);
            "".length();
         }

         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIIlllII instanceof Container)) {
            lllllllllllllllIIllllllllIIllIIl.addAll(getAllChildren(lllllllllllllllIIllllllllIIllIII, (Container)lllllllllllllllIIllllllllIIlllII));
            "".length();
         }

         "".length();
      } while((((83 ^ 0) << " ".length() ^ 80 + 96 - 112 + 109) & (107 + 5 - -5 + 66 ^ (68 ^ 107) << (" ".length() << " ".length()) ^ -" ".length())) != " ".length());

      return null;
   }

   private static boolean lIlIlIllIllIIl(int var0) {
      return var0 != 0;
   }

   public static void setTheme(Container lllllllllllllllIIlllllllllIIIIlI, Theme lllllllllllllllIIlllllllllIIIlII) {
      Theme lllllllllllllllIIlllllllllIIIIll = lllllllllllllllIIlllllllllIIIIlI.getTheme();
      lllllllllllllllIIlllllllllIIIIlI.setTheme(lllllllllllllllIIlllllllllIIIlII);
      Iterator lllllllllllllllIIllllllllIllllll = lllllllllllllllIIlllllllllIIIIlI.getChildren().iterator();

      do {
         if (!lIlIlIllIllIIl(lllllllllllllllIIllllllllIllllll.hasNext())) {
            return;
         }

         short lllllllllllllllIIllllllllIlllllI = (Component)lllllllllllllllIIllllllllIllllll.next();
         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIlllllI.getTheme().equals(lllllllllllllllIIlllllllllIIIIll))) {
            lllllllllllllllIIllllllllIlllllI.setTheme(lllllllllllllllIIlllllllllIIIlII);
         }

         "".length();
      } while(" ".length() >= " ".length());

   }

   public static AlignedComponent.Alignment getAlignment(Container lllllllllllllllIIllllllllIlIlllI) {
      Iterator lllllllllllllllIIllllllllIlIllII = lllllllllllllllIIllllllllIlIlllI.getChildren().iterator();

      do {
         if (!lIlIlIllIllIIl(lllllllllllllllIIllllllllIlIllII.hasNext())) {
            return AlignedComponent.Alignment.LEFT;
         }

         double lllllllllllllllIIllllllllIlIlIll = (Component)lllllllllllllllIIllllllllIlIllII.next();
         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIlIlIll instanceof Container)) {
            return getAlignment((Container)lllllllllllllllIIllllllllIlIlIll);
         }

         if (lIlIlIllIllIIl(lllllllllllllllIIllllllllIlIlIll instanceof AlignedComponent)) {
            return ((AlignedComponent)lllllllllllllllIIllllllllIlIlIll).getAlignment();
         }

         "".length();
      } while(" ".length() == " ".length());

      return null;
   }
}
