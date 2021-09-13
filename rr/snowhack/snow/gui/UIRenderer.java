package rr.snowhack.snow.gui;

import java.util.Iterator;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;
import rr.snowhack.snow.util.Wrapper;

public class UIRenderer {
   // $FF: synthetic field
   private static final int[] lIIIlIlllIlll;

   public static void renderAndUpdateFrames() {
      if (lIllIIlIllIlll(Wrapper.getMinecraft().field_71462_r instanceof DisplayGuiScreen) && !lIllIIlIlllIII(Wrapper.getMinecraft().field_71474_y.field_74330_P)) {
         long lllllllllllllllIIllIIllIllllIllI = SnowMod.getInstance().getGuiManager();
         GL11.glDisable(lIIIlIlllIlll[0]);
         Iterator lllllllllllllllIIllIIllIllllIlIl = lllllllllllllllIIllIIllIllllIllI.getChildren().iterator();

         do {
            if (!lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIlIl.hasNext())) {
               GL11.glEnable(lIIIlIlllIlll[0]);
               GL11.glEnable(lIIIlIlllIlll[3]);
               GlStateManager.func_179147_l();
               return;
            }

            long lllllllllllllllIIllIIllIllllIlII = (Component)lllllllllllllllIIllIIllIllllIlIl.next();
            if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIlII instanceof Frame)) {
               GlStateManager.func_179094_E();
               short lllllllllllllllIIllIIllIllllIIll = (Frame)lllllllllllllllIIllIIllIllllIlII;
               if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIIll.isPinned()) && lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIIll.isVisible())) {
                  int var10000;
                  if (lIllIIlIlllIII(lIllIIlIllIllI(lllllllllllllllIIllIIllIllllIIll.getOpacity(), 0.0F))) {
                     var10000 = lIIIlIlllIlll[1];
                     "".length();
                     if (" ".length() < (((11 ^ 60) << " ".length() ^ 116 ^ 19) << "   ".length() & (((107 ^ 118) << (" ".length() << " ".length()) ^ 200 ^ 181) << "   ".length() ^ -" ".length()))) {
                        return;
                     }
                  } else {
                     var10000 = lIIIlIlllIlll[2];
                  }

                  boolean lllllllllllllllIIllIIllIllllllII = var10000;
                  GL11.glTranslated((double)lllllllllllllllIIllIIllIllllIIll.getX(), (double)lllllllllllllllIIllIIllIllllIIll.getY(), 0.0D);
                  lllllllllllllllIIllIIllIllllIIll.getRenderListeners().forEach((lllllllllllllllIIllIIllIlllIlllI) -> {
                     lllllllllllllllIIllIIllIlllIlllI.onPreRender();
                  });
                  lllllllllllllllIIllIIllIllllIIll.getTheme().getUIForComponent(lllllllllllllllIIllIIllIllllIIll).renderComponent(lllllllllllllllIIllIIllIllllIIll, lllllllllllllllIIllIIllIllllIIll.getTheme().getFontRenderer());
                  int lllllllllllllllIIllIIllIlllllIll = lIIIlIlllIlll[2];
                  double lllllllllllllllIIllIIllIllllIIII = lIIIlIlllIlll[2];
                  if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllllII)) {
                     lllllllllllllllIIllIIllIlllllIll += lllllllllllllllIIllIIllIllllIIll.getOriginOffsetX();
                     lllllllllllllllIIllIIllIllllIIII += lllllllllllllllIIllIIllIllllIIll.getOriginOffsetY();
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) < 0) {
                        return;
                     }
                  } else {
                     if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIIll.getDocking().isBottom())) {
                        lllllllllllllllIIllIIllIllllIIII += lllllllllllllllIIllIIllIllllIIll.getOriginOffsetY();
                     }

                     if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIIll.getDocking().isRight())) {
                        lllllllllllllllIIllIIllIlllllIll += lllllllllllllllIIllIIllIllllIIll.getOriginOffsetX();
                        if (lIllIIlIlllIIl(lllllllllllllllIIllIIllIllllIIll.getChildren().size())) {
                           lllllllllllllllIIllIIllIlllllIll += (lllllllllllllllIIllIIllIllllIIll.getWidth() - ((Component)lllllllllllllllIIllIIllIllllIIll.getChildren().get(lIIIlIlllIlll[2])).getX() - ((Component)lllllllllllllllIIllIIllIllllIIll.getChildren().get(lIIIlIlllIlll[2])).getWidth()) / DisplayGuiScreen.getScale();
                        }
                     }

                     if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIIll.getDocking().isLeft()) && lIllIIlIlllIIl(lllllllllllllllIIllIIllIllllIIll.getChildren().size())) {
                        lllllllllllllllIIllIIllIlllllIll -= ((Component)lllllllllllllllIIllIIllIllllIIll.getChildren().get(lIIIlIlllIlll[2])).getX();
                     }

                     if (lIllIIlIlllIII(lllllllllllllllIIllIIllIllllIIll.getDocking().isTop()) && lIllIIlIlllIIl(lllllllllllllllIIllIIllIllllIIll.getChildren().size())) {
                        lllllllllllllllIIllIIllIllllIIII -= ((Component)lllllllllllllllIIllIIllIllllIIll.getChildren().get(lIIIlIlllIlll[2])).getY();
                     }
                  }

                  GL11.glTranslated((double)lllllllllllllllIIllIIllIlllllIll, (double)lllllllllllllllIIllIIllIllllIIII, 0.0D);
                  lllllllllllllllIIllIIllIllllIIll.getRenderListeners().forEach(RenderListener::onPostRender);
                  lllllllllllllllIIllIIllIllllIIll.renderChildren();
                  GL11.glTranslated((double)(-lllllllllllllllIIllIIllIlllllIll), (double)(-lllllllllllllllIIllIIllIllllIIII), 0.0D);
                  GL11.glTranslated((double)(-lllllllllllllllIIllIIllIllllIIll.getX()), (double)(-lllllllllllllllIIllIIllIllllIIll.getY()), 0.0D);
               }

               GlStateManager.func_179121_F();
            }

            "".length();
         } while((((13 ^ 104) << " ".length() ^ 31 + 96 - 1 + 15) & ("   ".length() << ("   ".length() << " ".length()) ^ 96 + 57 - 94 + 76 ^ -" ".length())) == 0);

      }
   }

   private static boolean lIllIIlIlllIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIllIIlIllIlll(int var0) {
      return var0 == 0;
   }

   private static boolean lIllIIlIlllIIl(int var0) {
      return var0 > 0;
   }

   private static void lIllIIlIllIlIl() {
      lIIIlIlllIlll = new int[4];
      lIIIlIlllIlll[0] = (172 + 505 - 434 + 312 << " ".length()) + 777 + 52 - 294 + 462 - -(57 + 370 - 125 + 204) + (221 + 178 - 197 + 33 << (" ".length() << " ".length()));
      lIIIlIlllIlll[1] = " ".length();
      lIIIlIlllIlll[2] = (77 ^ 74) & ~(16 ^ 23);
      lIIIlIlllIlll[3] = (50 + 6 - -112 + 169 << (" ".length() << " ".length())) + (236 + 117 - 134 + 50 << " ".length()) - (62 + 505 - 140 + 170) + ((156 ^ 129) << "   ".length()) << " ".length();
   }

   private static int lIllIIlIllIllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   static {
      lIllIIlIllIlIl();
   }
}
