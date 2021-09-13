package rr.snowhack.snow.gui.snow.component;

import rr.snowhack.snow.gui.rgui.component.AbstractComponent;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.use.Slider;

public class UnboundSlider extends AbstractComponent {
   // $FF: synthetic field
   String text;
   // $FF: synthetic field
   double originValue;
   // $FF: synthetic field
   public int sensitivity;
   // $FF: synthetic field
   int originX;
   // $FF: synthetic field
   double value;
   // $FF: synthetic field
   boolean integer;
   // $FF: synthetic field
   double min;
   // $FF: synthetic field
   private static final int[] lIIIlIIllllII;
   // $FF: synthetic field
   double max;

   public void setValue(double lllllllllllllllIIlllIIIIlIIlllII) {
      if (lIllIIIIIIllll(lIllIIIIIIlllI(lllllllllllllllIIlllIIIIlIIllIlI.min, Double.MIN_VALUE))) {
         lllllllllllllllIIlllIIIIlIIlllII = Math.max(lllllllllllllllIIlllIIIIlIIlllII, lllllllllllllllIIlllIIIIlIIllIlI.min);
      }

      if (lIllIIIIIIllll(lIllIIIIIIlllI(lllllllllllllllIIlllIIIIlIIllIlI.max, Double.MAX_VALUE))) {
         lllllllllllllllIIlllIIIIlIIlllII = Math.min(lllllllllllllllIIlllIIIIlIIlllII, lllllllllllllllIIlllIIIIlIIllIlI.max);
      }

      byte lllllllllllllllIIlllIIIIlIIllIII = new Slider.SliderPoof.SliderPoofInfo(lllllllllllllllIIlllIIIIlIIllIlI.value, lllllllllllllllIIlllIIIIlIIlllII);
      lllllllllllllllIIlllIIIIlIIllIlI.callPoof(Slider.SliderPoof.class, lllllllllllllllIIlllIIIIlIIllIII);
      double var10001;
      if (lIllIIIIIIllll(lllllllllllllllIIlllIIIIlIIllIlI.integer)) {
         var10001 = Math.floor(lllllllllllllllIIlllIIIIlIIllIII.getNewValue());
         "".length();
         if ((((164 ^ 139) << " ".length() ^ 11 ^ 72) << " ".length() & ((162 ^ 131 ^ (109 ^ 98) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) < 0) {
            return;
         }
      } else {
         var10001 = lllllllllllllllIIlllIIIIlIIllIII.getNewValue();
      }

      lllllllllllllllIIlllIIIIlIIllIlI.value = var10001;
   }

   public double getValue() {
      return lllllllllllllllIIlllIIIIlIIlIlIl.value;
   }

   static {
      lIllIIIIIIllIl();
   }

   private static boolean lIllIIIIIIllll(int var0) {
      return var0 != 0;
   }

   private static void lIllIIIIIIllIl() {
      lIIIlIIllllII = new int[1];
      lIIIlIIllllII[0] = 81 ^ 84;
   }

   public void setMax(double lllllllllllllllIIlllIIIIlIlIlIIl) {
      lllllllllllllllIIlllIIIIlIlIlIlI.max = lllllllllllllllIIlllIIIIlIlIlIIl;
   }

   public String getText() {
      return lllllllllllllllIIlllIIIIlIIlIIll.text;
   }

   public void setMin(double lllllllllllllllIIlllIIIIlIlIIIll) {
      lllllllllllllllIIlllIIIIlIlIIIlI.min = lllllllllllllllIIlllIIIIlIlIIIll;
   }

   private static int lIllIIIIIIlllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public UnboundSlider(double lllllllllllllllIIlllIIIIlIllIIll, String lllllllllllllllIIlllIIIIlIlIlllI, boolean lllllllllllllllIIlllIIIIlIllIIIl) {
      lllllllllllllllIIlllIIIIlIllIlII.sensitivity = lIIIlIIllllII[0];
      lllllllllllllllIIlllIIIIlIllIlII.max = Double.MAX_VALUE;
      lllllllllllllllIIlllIIIIlIllIlII.min = Double.MIN_VALUE;
      lllllllllllllllIIlllIIIIlIllIlII.value = lllllllllllllllIIlllIIIIlIllIIll;
      lllllllllllllllIIlllIIIIlIllIlII.text = lllllllllllllllIIlllIIIIlIlIlllI;
      lllllllllllllllIIlllIIIIlIllIlII.integer = lllllllllllllllIIlllIIIIlIllIIIl;
      lllllllllllllllIIlllIIIIlIllIlII.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] lIIIIIllIlIlI;

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIlIlIllIIlll) {
            lllllllllllllllIIlllIIIIlIllIlII.originX = lllllllllllllllIlIIIIlIlIllIIlll.getX();
            lllllllllllllllIIlllIIIIlIllIlII.originValue = lllllllllllllllIIlllIIIIlIllIlII.getValue();
         }

         private static void lIlIlIIllIlIlI() {
            lIIIIIllIlIlI = new int[2];
            lIIIIIllIlIlI[0] = " ".length();
            lIIIIIllIlIlI[1] = -" ".length();
         }

         private static boolean lIlIlIIllIllIl(int var0) {
            return var0 != 0;
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIIIlIlIlIlIIII) {
            UnboundSlider var10000 = lllllllllllllllIIlllIIIIlIllIlII;
            double var10001 = lllllllllllllllIIlllIIIIlIllIlII.getValue();
            int var10002;
            if (lIlIlIIllIllIl(lllllllllllllllIlIIIIlIlIlIlIIII.isUp())) {
               var10002 = lIIIIIllIlIlI[0];
               "".length();
               if (("   ".length() << "   ".length() & ~("   ".length() << "   ".length())) != 0) {
                  return;
               }
            } else {
               var10002 = lIIIIIllIlIlI[1];
            }

            var10000.setValue((double)Math.round(var10001 + (double)var10002));
            lllllllllllllllIIlllIIIIlIllIlII.originValue = lllllllllllllllIIlllIIIIlIllIlII.getValue();
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIIIlIlIlIlIlII) {
         }

         private static int lIlIlIIllIlIll(double var0, double var2) {
            double var4;
            return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
         }

         static {
            lIlIlIIllIlIlI();
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIlIlIlIlIlll) {
            int lllllllllllllllIlIIIIlIlIlIllIIl = (lllllllllllllllIIlllIIIIlIllIlII.originX - lllllllllllllllIlIIIIlIlIlIlIlll.getX()) / lllllllllllllllIIlllIIIIlIllIlII.sensitivity;
            UnboundSlider var10000 = lllllllllllllllIIlllIIIIlIllIlII;
            double var10001 = lllllllllllllllIIlllIIIIlIllIlII.originValue;
            double var10002 = (double)lllllllllllllllIlIIIIlIlIlIllIIl;
            double var10003;
            if (lIlIlIIllIllII(lIlIlIIllIlIll(lllllllllllllllIIlllIIIIlIllIlII.originValue, 0.0D))) {
               var10003 = 1.0D;
               "".length();
               if ((39 ^ 34) == 0) {
                  return;
               }
            } else {
               var10003 = Math.abs(lllllllllllllllIIlllIIIIlIllIlII.originValue) / 10.0D;
            }

            var10000.setValue(Math.floor((var10001 - var10002 * var10003) * 10.0D) / 10.0D);
         }

         private static boolean lIlIlIIllIllII(int var0) {
            return var0 == 0;
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIlIlIlIlllll) {
            lllllllllllllllIIlllIIIIlIllIlII.originValue = lllllllllllllllIIlllIIIIlIllIlII.getValue();
            lllllllllllllllIIlllIIIIlIllIlII.originX = lllllllllllllllIlIIIIlIlIlIlllll.getX();
         }
      });
   }
}
