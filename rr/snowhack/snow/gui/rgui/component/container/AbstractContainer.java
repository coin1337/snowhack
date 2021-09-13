package rr.snowhack.snow.gui.rgui.component.container;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.component.AbstractComponent;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.AdditionPoof;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public abstract class AbstractContainer extends AbstractComponent implements Container {
   // $FF: synthetic field
   protected ArrayList<Component> children = new ArrayList();
   // $FF: synthetic field
   int originoffsetY;
   // $FF: synthetic field
   int originoffsetX;
   // $FF: synthetic field
   private static final int[] lllIlIllIIIl;

   public Container removeChild(Component lllllllllllllllIlIllllIIllIIIlII) {
      lllllllllllllllIlIllllIIllIIIIll.children.remove(lllllllllllllllIlIllllIIllIIIlII);
      "".length();
      return lllllllllllllllIlIllllIIllIIIIll;
   }

   private static boolean lIIllIlIIlIlII(int var0) {
      return var0 != 0;
   }

   public Component getComponentAt(int lllllllllllllllIlIllllIIlIIllIll, int lllllllllllllllIlIllllIIlIIlIlll) {
      int lllllllllllllllIlIllllIIlIIlIllI = lllllllllllllllIlIllllIIlIIllIIl.getChildren().size() - lllIlIllIIIl[1];

      do {
         if (!lIIllIlIIlIlIl(lllllllllllllllIlIllllIIlIIlIllI)) {
            return lllllllllllllllIlIllllIIlIIllIIl;
         }

         double lllllllllllllllIlIllllIIlIIlIlIl = (Component)lllllllllllllllIlIllllIIlIIllIIl.getChildren().get(lllllllllllllllIlIllllIIlIIlIllI);
         if (lIIllIlIIlIIll(lllllllllllllllIlIllllIIlIIlIlIl.isVisible())) {
            "".length();
            if (-"   ".length() >= 0) {
               return null;
            }
         } else {
            label49: {
               int lllllllllllllllIlIllllIIlIlIIIIl = lllllllllllllllIlIllllIIlIIlIlIl.getX() + lllllllllllllllIlIllllIIlIIllIIl.getOriginOffsetX();
               int lllllllllllllllIlIllllIIlIlIIIII = lllllllllllllllIlIllllIIlIIlIlIl.getY() + lllllllllllllllIlIllllIIlIIllIIl.getOriginOffsetY();
               int lllllllllllllllIlIllllIIlIIlllll = lllllllllllllllIlIllllIIlIIlIlIl.getWidth();
               int lllllllllllllllIlIllllIIlIIllllI = lllllllllllllllIlIllllIIlIIlIlIl.getHeight();
               Container lllllllllllllllIlIllllIIlIIlIIII;
               if (lIIllIlIIlIlII(lllllllllllllllIlIllllIIlIIlIlIl instanceof Container)) {
                  lllllllllllllllIlIllllIIlIIlIIII = (Container)lllllllllllllllIlIllllIIlIIlIlIl;
                  boolean lllllllllllllllIlIllllIIlIlIIllI = lllllllllllllllIlIllllIIlIIlIIII.penetrateTest(lllllllllllllllIlIllllIIlIIllIll - lllllllllllllllIlIllllIIlIIllIIl.getOriginOffsetX(), lllllllllllllllIlIllllIIlIIlIlll - lllllllllllllllIlIllllIIlIIllIIl.getOriginOffsetY());
                  if (lIIllIlIIlIIll(lllllllllllllllIlIllllIIlIlIIllI)) {
                     "".length();
                     if (null != null) {
                        return null;
                     }
                     break label49;
                  }

                  Exception lllllllllllllllIlIllllIIlIIIlllI = ((Container)lllllllllllllllIlIllllIIlIIlIlIl).getComponentAt(lllllllllllllllIlIllllIIlIIllIll - lllllllllllllllIlIllllIIlIlIIIIl, lllllllllllllllIlIllllIIlIIlIlll - lllllllllllllllIlIllllIIlIlIIIII);
                  if (lIIllIlIIlIllI(lllllllllllllllIlIllllIIlIIIlllI, lllllllllllllllIlIllllIIlIIlIlIl)) {
                     return lllllllllllllllIlIllllIIlIIIlllI;
                  }
               }

               if (lIIllIlIIlIlll(lllllllllllllllIlIllllIIlIIllIll, lllllllllllllllIlIllllIIlIlIIIIl) && lIIllIlIIlIlll(lllllllllllllllIlIllllIIlIIlIlll, lllllllllllllllIlIllllIIlIlIIIII) && lIIllIlIIllIII(lllllllllllllllIlIllllIIlIIllIll, lllllllllllllllIlIllllIIlIlIIIIl + lllllllllllllllIlIllllIIlIIlllll) && lIIllIlIIllIII(lllllllllllllllIlIllllIIlIIlIlll, lllllllllllllllIlIllllIIlIlIIIII + lllllllllllllllIlIllllIIlIIllllI)) {
                  if (lIIllIlIIlIlII(lllllllllllllllIlIllllIIlIIlIlIl instanceof Container)) {
                     lllllllllllllllIlIllllIIlIIlIIII = (Container)lllllllllllllllIlIllllIIlIIlIlIl;
                     Component lllllllllllllllIlIllllIIlIlIIIll = lllllllllllllllIlIllllIIlIIlIIII.getComponentAt(lllllllllllllllIlIllllIIlIIllIll - lllllllllllllllIlIllllIIlIlIIIIl, lllllllllllllllIlIllllIIlIIlIlll - lllllllllllllllIlIllllIIlIlIIIII);
                     return lllllllllllllllIlIllllIIlIlIIIll;
                  }

                  return lllllllllllllllIlIllllIIlIIlIlIl;
               }
            }
         }

         --lllllllllllllllIlIllllIIlIIlIllI;
         "".length();
      } while(" ".length() > 0);

      return null;
   }

   private static boolean lIIllIlIIlIIlI(int var0, int var1) {
      return var0 < var1;
   }

   public void setOriginOffsetY(int lllllllllllllllIlIllllIIIllIlIII) {
      lllllllllllllllIlIllllIIIllIlIIl.originoffsetY = lllllllllllllllIlIllllIIIllIlIII;
   }

   public ArrayList<Component> getChildren() {
      return lllllllllllllllIlIllllIIllIlllII.children;
   }

   public AbstractContainer(Theme lllllllllllllllIlIllllIIllIllllI) {
      lllllllllllllllIlIllllIIlllIIIIl.originoffsetX = lllIlIllIIIl[0];
      lllllllllllllllIlIllllIIlllIIIIl.originoffsetY = lllIlIllIIIl[0];
      lllllllllllllllIlIllllIIlllIIIIl.setTheme(lllllllllllllllIlIllllIIllIllllI);
   }

   public Container addChild(Component... lllllllllllllllIlIllllIIllIlIIII) {
      long lllllllllllllllIlIllllIIllIIllIl = lllllllllllllllIlIllllIIllIlIIII;
      long lllllllllllllllIlIllllIIllIIllII = lllllllllllllllIlIllllIIllIlIIII.length;
      int lllllllllllllllIlIllllIIllIIlIll = lllIlIllIIIl[0];

      do {
         if (!lIIllIlIIlIIlI(lllllllllllllllIlIllllIIllIIlIll, lllllllllllllllIlIllllIIllIIllII)) {
            return lllllllllllllllIlIllllIIllIlIIIl;
         }

         boolean lllllllllllllllIlIllllIIllIIlIlI = lllllllllllllllIlIllllIIllIIllIl[lllllllllllllllIlIllllIIllIIlIll];
         if (lIIllIlIIlIIll(lllllllllllllllIlIllllIIllIlIIIl.children.contains(lllllllllllllllIlIllllIIllIIlIlI))) {
            lllllllllllllllIlIllllIIllIIlIlI.setTheme(lllllllllllllllIlIllllIIllIlIIIl.getTheme());
            lllllllllllllllIlIllllIIllIIlIlI.setParent(lllllllllllllllIlIllllIIllIlIIIl);
            lllllllllllllllIlIllllIIllIIlIlI.getUI().handleAddComponent(lllllllllllllllIlIllllIIllIIlIlI, lllllllllllllllIlIllllIIllIlIIIl);
            lllllllllllllllIlIllllIIllIIlIlI.getUI().handleSizeComponent(lllllllllllllllIlIllllIIllIIlIlI);
            synchronized(lllllllllllllllIlIllllIIllIlIIIl.children) {
               lllllllllllllllIlIllllIIllIlIIIl.children.add(lllllllllllllllIlIllllIIllIIlIlI);
               "".length();
               Collections.sort(lllllllllllllllIlIllllIIllIlIIIl.children, new Comparator<Component>() {
                  public int compare(Component lllllllllllllllIlIIIIlIllIIlIIII, Component lllllllllllllllIlIIIIlIllIIIllll) {
                     return lllllllllllllllIlIIIIlIllIIlIIII.getPriority() - lllllllllllllllIlIIIIlIllIIIllll.getPriority();
                  }
               });
               lllllllllllllllIlIllllIIllIIlIlI.callPoof(AdditionPoof.class, (PoofInfo)null);
            }

            "".length();
            if (-" ".length() != -" ".length()) {
               return null;
            }
         }

         ++lllllllllllllllIlIllllIIllIIlIll;
         "".length();
      } while("   ".length() == "   ".length());

      return null;
   }

   public void setOriginOffsetX(int lllllllllllllllIlIllllIIIllIlllI) {
      lllllllllllllllIlIllllIIIllIllll.originoffsetX = lllllllllllllllIlIllllIIIllIlllI;
   }

   private static boolean lIIllIlIIlIIll(int var0) {
      return var0 == 0;
   }

   private static boolean lIIllIlIIlIlll(int var0, int var1) {
      return var0 >= var1;
   }

   public void setHeight(int lllllllllllllllIlIllllIIlIIIIlII) {
      super.setHeight(lllllllllllllllIlIllllIIlIIIIlII + lllllllllllllllIlIllllIIlIIIIlIl.getOriginOffsetY());
   }

   static {
      lIIllIlIIlIIIl();
   }

   private static void lIIllIlIIlIIIl() {
      lllIlIllIIIl = new int[2];
      lllIlIllIIIl[0] = (46 ^ 19 ^ (76 ^ 65) << (" ".length() << " ".length())) << " ".length() & (((112 ^ 109) << " ".length() ^ 49 ^ 2) << " ".length() ^ -" ".length());
      lllIlIllIIIl[1] = " ".length();
   }

   private static boolean lIIllIlIIlIllI(Object var0, Object var1) {
      return var0 != var1;
   }

   public void setWidth(int lllllllllllllllIlIllllIIlIIIlIII) {
      super.setWidth(lllllllllllllllIlIllllIIlIIIlIII + lllllllllllllllIlIllllIIlIIIlIIl.getOriginOffsetX());
   }

   public void kill() {
      Iterator lllllllllllllllIlIllllIIIllllIll = lllllllllllllllIlIllllIIIlllllIl.children.iterator();

      do {
         if (!lIIllIlIIlIlII(lllllllllllllllIlIllllIIIllllIll.hasNext())) {
            super.kill();
            return;
         }

         Component lllllllllllllllIlIllllIIIllllllI = (Component)lllllllllllllllIlIllllIIIllllIll.next();
         lllllllllllllllIlIllllIIIllllllI.kill();
         "".length();
      } while((" ".length() & ~" ".length()) == 0);

   }

   public int getOriginOffsetX() {
      return lllllllllllllllIlIllllIIIllllIII.originoffsetX;
   }

   public boolean hasChild(Component lllllllllllllllIlIllllIIlIlllllI) {
      return lllllllllllllllIlIllllIIlIllllll.children.contains(lllllllllllllllIlIllllIIlIlllllI);
   }

   private static boolean lIIllIlIIllIII(int var0, int var1) {
      return var0 <= var1;
   }

   public void renderChildren() {
      Iterator lllllllllllllllIlIllllIIlIllIlIl = lllllllllllllllIlIllllIIlIllIlll.getChildren().iterator();

      while(lIIllIlIIlIlII(lllllllllllllllIlIllllIIlIllIlIl.hasNext())) {
         Component lllllllllllllllIlIllllIIlIlllIII = (Component)lllllllllllllllIlIllllIIlIllIlIl.next();
         if (lIIllIlIIlIIll(lllllllllllllllIlIllllIIlIlllIII.isVisible())) {
            "".length();
            if (-(157 ^ 153) >= 0) {
               return;
            }
         } else {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)lllllllllllllllIlIllllIIlIlllIII.getX(), (float)lllllllllllllllIlIllllIIlIlllIII.getY(), 0.0F);
            lllllllllllllllIlIllllIIlIlllIII.getRenderListeners().forEach(RenderListener::onPreRender);
            lllllllllllllllIlIllllIIlIlllIII.getUI().renderComponent(lllllllllllllllIlIllllIIlIlllIII, lllllllllllllllIlIllllIIlIllIlll.getTheme().getFontRenderer());
            if (lIIllIlIIlIlII(lllllllllllllllIlIllllIIlIlllIII instanceof Container)) {
               GL11.glTranslatef((float)((Container)lllllllllllllllIlIllllIIlIlllIII).getOriginOffsetX(), (float)((Container)lllllllllllllllIlIllllIIlIlllIII).getOriginOffsetY(), 0.0F);
               ((Container)lllllllllllllllIlIllllIIlIlllIII).renderChildren();
               GL11.glTranslatef((float)(-((Container)lllllllllllllllIlIllllIIlIlllIII).getOriginOffsetX()), (float)(-((Container)lllllllllllllllIlIllllIIlIlllIII).getOriginOffsetY()), 0.0F);
            }

            lllllllllllllllIlIllllIIlIlllIII.getRenderListeners().forEach(RenderListener::onPostRender);
            GL11.glTranslatef((float)(-lllllllllllllllIlIllllIIlIlllIII.getX()), (float)(-lllllllllllllllIlIllllIIlIlllIII.getY()), 0.0F);
            GL11.glPopMatrix();
            "".length();
            if (" ".length() << (" ".length() << " ".length()) > " ".length() << (" ".length() << " ".length())) {
               return;
            }
         }
      }

   }

   public int getOriginOffsetY() {
      return lllllllllllllllIlIllllIIIlllIlII.originoffsetY;
   }

   private static boolean lIIllIlIIlIlIl(int var0) {
      return var0 >= 0;
   }

   public boolean penetrateTest(int lllllllllllllllIlIllllIIIllIIllI, int lllllllllllllllIlIllllIIIllIIlIl) {
      return (boolean)lllIlIllIIIl[1];
   }
}
