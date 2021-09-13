package rr.snowhack.snow.gui.snow.theme.ui;

import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.container.use.Scrollpane;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;

public class RootScrollpaneUI extends AbstractComponentUI<Scrollpane> {
   // $FF: synthetic field
   Component scrollComponent = null;
   // $FF: synthetic field
   float barLife = 1220.0F;
   // $FF: synthetic field
   double hovering;
   // $FF: synthetic field
   private static final int[] lIIIIIlIlllIl;
   // $FF: synthetic field
   boolean dragBar;
   // $FF: synthetic field
   int dY;
   // $FF: synthetic field
   long lastScroll = 0L;

   public void renderComponent(Scrollpane lllllllllllllllIlIIIIllIIIlIllIl, FontRenderer lllllllllllllllIlIIIIllIIIlIllII) {
   }

   private static void lIlIlIIlIllllI() {
      lIIIIIlIlllIl = new int[1];
      lIIIIIlIlllIl[0] = (14 + 131 - -29 + 5 ^ (244 ^ 171) << " ".length()) << (" ".length() << " ".length()) & ((162 ^ 185 ^ (79 ^ 68) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
   }

   public void handleAddComponent(final Scrollpane lllllllllllllllIlIIIIllIIIlIlIII, Container lllllllllllllllIlIIIIllIIIlIIlll) {
      lllllllllllllllIlIIIIllIIIlIlIII.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] lIIIIlIIlIIII;

         private static boolean lIlIlIlIlllIIl(int var0, int var1) {
            return var0 < var1;
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIIIIIlIlIIlIlI) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIIlIllIlIlI) {
            if (lIlIlIlIllIllI(lIlIlIlIllIlIl((float)(System.currentTimeMillis() - lllllllllllllllIlIIIIllIIIlIlIIl.lastScroll), lllllllllllllllIlIIIIllIIIlIlIIl.barLife)) && lIlIlIlIllIlll(lllllllllllllllIlIIIIllIIIlIlIIl.scrollComponent.liesIn(lllllllllllllllIlIIIIllIIIlIlIII)) && lIlIlIlIllIlll(lllllllllllllllIlIIIIllIIIlIlIII.canScrollY())) {
               double lllllllllllllllIlIIIIIIlIllIlllI = (double)lllllllllllllllIlIIIIllIIIlIlIII.getScrolledY() / (double)lllllllllllllllIlIIIIllIIIlIlIII.getMaxScrollY();
               boolean lllllllllllllllIlIIIIIIlIllIIlII = lIIIIlIIlIIII[0];
               int lllllllllllllllIlIIIIIIlIllIIIlI = (int)((double)(lllllllllllllllIlIIIIllIIIlIlIII.getHeight() - lllllllllllllllIlIIIIIIlIllIIlII) * lllllllllllllllIlIIIIIIlIllIlllI);
               if (lIlIlIlIlllIII(lllllllllllllllIlIIIIIIlIllIlIlI.getX(), lllllllllllllllIlIIIIllIIIlIlIII.getWidth() - lIIIIlIIlIIII[1]) && lIlIlIlIlllIII(lllllllllllllllIlIIIIIIlIllIlIlI.getY(), lllllllllllllllIlIIIIIIlIllIIIlI) && lIlIlIlIlllIIl(lllllllllllllllIlIIIIIIlIllIlIlI.getY(), lllllllllllllllIlIIIIIIlIllIIIlI + lllllllllllllllIlIIIIIIlIllIIlII)) {
                  lllllllllllllllIlIIIIllIIIlIlIIl.dragBar = (boolean)lIIIIlIIlIIII[2];
                  lllllllllllllllIlIIIIllIIIlIlIIl.dY = lllllllllllllllIlIIIIIIlIllIlIlI.getY() - lllllllllllllllIlIIIIIIlIllIIIlI;
                  lllllllllllllllIlIIIIIIlIllIlIlI.cancel();
               }
            }

         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIIIIIlIlIIIllI) {
            lllllllllllllllIlIIIIllIIIlIlIIl.lastScroll = System.currentTimeMillis();
            lllllllllllllllIlIIIIllIIIlIlIIl.scrollComponent = lllllllllllllllIlIIIIIIlIlIIIllI.getComponent();
         }

         private static void lIlIlIlIllIlII() {
            lIIIIlIIlIIII = new int[4];
            lIIIIlIIlIIII[0] = (150 ^ 153) << " ".length();
            lIIIIlIIlIIII[1] = (192 ^ 197) << " ".length();
            lIIIIlIIlIIII[2] = " ".length();
            lIIIIlIIlIIII[3] = "   ".length() << (122 + 73 - 129 + 119 ^ (61 ^ 18) << (" ".length() << " ".length())) & ("   ".length() << (123 + 79 - 149 + 106 ^ (58 ^ 119) << " ".length()) ^ -" ".length());
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIIlIlIIllll) {
            if (lIlIlIlIllIlll(lllllllllllllllIlIIIIllIIIlIlIIl.dragBar)) {
               double lllllllllllllllIlIIIIIIlIlIlIIll = (double)lllllllllllllllIlIIIIIIlIlIIllll.getY() / (double)lllllllllllllllIlIIIIllIIIlIlIII.getHeight();
               lllllllllllllllIlIIIIIIlIlIlIIll = Math.max(Math.min(lllllllllllllllIlIIIIIIlIlIlIIll, 1.0D), 0.0D);
               lllllllllllllllIlIIIIllIIIlIlIII.setScrolledY((int)((double)lllllllllllllllIlIIIIllIIIlIlIII.getMaxScrollY() * lllllllllllllllIlIIIIIIlIlIlIIll));
               lllllllllllllllIlIIIIIIlIlIIllll.cancel();
            }

         }

         private static boolean lIlIlIlIlllIII(int var0, int var1) {
            return var0 > var1;
         }

         static {
            lIlIlIlIllIlII();
         }

         private static boolean lIlIlIlIllIllI(int var0) {
            return var0 < 0;
         }

         private static boolean lIlIlIlIllIlll(int var0) {
            return var0 != 0;
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIIlIlIlllIl) {
            lllllllllllllllIlIIIIllIIIlIlIIl.dragBar = (boolean)lIIIIlIIlIIII[3];
         }

         private static int lIlIlIlIllIlIl(float var0, float var1) {
            float var2;
            return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
         }
      });
      lllllllllllllllIlIIIIllIIIlIlIII.addRenderListener(new RenderListener() {
         // $FF: synthetic field
         private static final int[] lllllllllIlI;

         private static boolean lIlIIllIIIllll(int var0) {
            return var0 != 0;
         }

         static {
            lIlIIllIIIllIl();
         }

         public void onPostRender() {
            if (lIlIIllIIIllll(lllllllllllllllIlIIIIllIIIlIlIIl.dragBar)) {
               lllllllllllllllIlIIIIllIIIlIlIIl.lastScroll = System.currentTimeMillis();
            }

            if (lIlIIllIIlIIII(lIlIIllIIIlllI((float)(System.currentTimeMillis() - lllllllllllllllIlIIIIllIIIlIlIIl.lastScroll), lllllllllllllllIlIIIIllIIIlIlIIl.barLife)) && lIlIIllIIIllll(lllllllllllllllIlIIIIllIIIlIlIIl.scrollComponent.liesIn(lllllllllllllllIlIIIIllIIIlIlIII)) && lIlIIllIIIllll(lllllllllllllllIlIIIIllIIIlIlIII.canScrollY())) {
               double lllllllllllllllIlIIlIIllIlIlIlIl = Math.min(1.0F, (lllllllllllllllIlIIIIllIIIlIlIIl.barLife - (float)(System.currentTimeMillis() - lllllllllllllllIlIIIIllIIIlIlIIl.lastScroll)) / 100.0F) / 3.0F;
               if (lIlIIllIIIllll(lllllllllllllllIlIIIIllIIIlIlIIl.dragBar)) {
                  lllllllllllllllIlIIlIIllIlIlIlIl = 0.4F;
               }

               GL11.glColor4f(1.0F, 0.22F, 0.22F, lllllllllllllllIlIIlIIllIlIlIlIl);
               GL11.glDisable(lllllllllIlI[0]);
               int lllllllllllllllIlIIlIIllIlIllIlI = lllllllllIlI[1];
               double lllllllllllllllIlIIlIIllIlIlIIll = (double)lllllllllllllllIlIIIIllIIIlIlIII.getScrolledY() / (double)lllllllllllllllIlIIIIllIIIlIlIII.getMaxScrollY();
               boolean lllllllllllllllIlIIlIIllIlIlIIlI = (int)((double)(lllllllllllllllIlIIIIllIIIlIlIII.getHeight() - lllllllllllllllIlIIlIIllIlIllIlI) * lllllllllllllllIlIIlIIllIlIlIIll);
               RenderHelper.drawRoundedRectangle((float)(lllllllllllllllIlIIIIllIIIlIlIII.getWidth() - lllllllllIlI[2]), (float)lllllllllllllllIlIIlIIllIlIlIIlI, 4.0F, (float)lllllllllllllllIlIIlIIllIlIllIlI, 1.0F);
            }

         }

         private static int lIlIIllIIIlllI(float var0, float var1) {
            float var2;
            return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
         }

         private static boolean lIlIIllIIlIIII(int var0) {
            return var0 < 0;
         }

         private static void lIlIIllIIIllIl() {
            lllllllllIlI = new int[3];
            lllllllllIlI[0] = 124 + 174 - -38 + 35 + ((14 ^ 27) << (" ".length() << " ".length())) - -(267 + 569 - -55 + 77) + (164 + 921 - 635 + 615 << " ".length());
            lllllllllIlI[1] = (105 ^ 102) << " ".length();
            lllllllllIlI[2] = "   ".length() << " ".length();
         }

         public void onPreRender() {
         }
      });
   }

   static {
      lIlIlIIlIllllI();
   }

   public RootScrollpaneUI() {
      lllllllllllllllIlIIIIllIIIllIIII.dragBar = (boolean)lIIIIIlIlllIl[0];
      lllllllllllllllIlIIIIllIIIllIIII.dY = lIIIIIlIlllIl[0];
      lllllllllllllllIlIIIIllIIIllIIII.hovering = 0.0D;
   }
}
