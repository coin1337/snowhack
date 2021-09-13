package rr.snowhack.snow.gui.rgui.component.use;

import net.minecraft.util.math.MathHelper;
import rr.snowhack.snow.gui.rgui.component.AbstractComponent;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.Poof;

public class Slider extends AbstractComponent {
   // $FF: synthetic field
   double maximum;
   // $FF: synthetic field
   double value;
   // $FF: synthetic field
   boolean integer;
   // $FF: synthetic field
   String text;
   // $FF: synthetic field
   double minimum;
   // $FF: synthetic field
   double step;
   // $FF: synthetic field
   private static final int[] lllIllIIllII;

   public double getMaximum() {
      return lllllllllllllllIlIlllIIIIlIlIIIl.maximum;
   }

   public double getMinimum() {
      return lllllllllllllllIlIlllIIIIlIIlllI.minimum;
   }

   public Slider(double lllllllllllllllIlIlllIIIlIIIlIII, double lllllllllllllllIlIlllIIIlIIIIlll, double lllllllllllllllIlIlllIIIlIIIIllI, double lllllllllllllllIlIlllIIIlIIIIlIl, String lllllllllllllllIlIlllIIIlIIIlIll, boolean lllllllllllllllIlIlllIIIlIIIIIll) {
      lllllllllllllllIlIlllIIIlIIIlIIl.value = lllllllllllllllIlIlllIIIlIIIlIII;
      lllllllllllllllIlIlllIIIlIIIlIIl.minimum = lllllllllllllllIlIlllIIIlIIIIlll;
      lllllllllllllllIlIlllIIIlIIIlIIl.maximum = lllllllllllllllIlIlllIIIlIIIIllI;
      lllllllllllllllIlIlllIIIlIIIlIIl.step = lllllllllllllllIlIlllIIIlIIIIlIl;
      lllllllllllllllIlIlllIIIlIIIlIIl.text = lllllllllllllllIlIlllIIIlIIIlIll;
      lllllllllllllllIlIlllIIIlIIIlIIl.integer = lllllllllllllllIlIlllIIIlIIIIIll;
      lllllllllllllllIlIlllIIIlIIIlIIl.addMouseListener(new MouseListener() {
         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIllIIIllIlIlII) {
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIllIIIllIlllII) {
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIllIIIllIlIIlI) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIllIIIllIllllI) {
            lllllllllllllllIlIlllIIIlIIIlIIl.setValue(lllllllllllllllIlIlllIIIlIIIlIIl.calculateValue((double)lllllllllllllllIlIIllIIIllIllllI.getX()));
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIllIIIllIlIllI) {
            lllllllllllllllIlIlllIIIlIIIlIIl.setValue(lllllllllllllllIlIlllIIIlIIIlIIl.calculateValue((double)lllllllllllllllIlIIllIIIllIlIllI.getX()));
         }
      });
   }

   private static int lIIllIllIlllll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static void lIIllIllIllIlI() {
      lllIllIIllII = new int[1];
      lllIllIIllII[0] = " ".length() & (" ".length() ^ -" ".length());
   }

   private static boolean lIIllIllIlllIl(int var0) {
      return var0 > 0;
   }

   private static int lIIllIllIllIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public String getText() {
      return lllllllllllllllIlIlllIIIIlIllIIl.text;
   }

   public static double getDefaultStep(double lllllllllllllllIlIlllIIIIllIIIIl, double lllllllllllllllIlIlllIIIIlIlllIl) {
      double lllllllllllllllIlIlllIIIIlIlllll = gcd(lllllllllllllllIlIlllIIIIllIIIIl, lllllllllllllllIlIlllIIIIlIlllIl);
      if (lIIllIllIlllII(lIIllIllIllIll(lllllllllllllllIlIlllIIIIlIlllll, lllllllllllllllIlIlllIIIIlIlllIl))) {
         lllllllllllllllIlIlllIIIIlIlllll = lllllllllllllllIlIlllIIIIlIlllIl / 20.0D;
      }

      if (lIIllIllIlllIl(lIIllIllIllIll(lllllllllllllllIlIlllIIIIlIlllIl, 10.0D))) {
         lllllllllllllllIlIlllIIIIlIlllll = (double)Math.round(lllllllllllllllIlIlllIIIIlIlllll);
      }

      if (lIIllIllIlllII(lIIllIllIllIll(lllllllllllllllIlIlllIIIIlIlllll, 0.0D))) {
         lllllllllllllllIlIlllIIIIlIlllll = lllllllllllllllIlIlllIIIIlIlllIl;
      }

      return lllllllllllllllIlIlllIIIIlIlllll;
   }

   static {
      lIIllIllIllIlI();
   }

   private static boolean lIIllIllIlllII(int var0) {
      return var0 == 0;
   }

   public static double gcd(double lllllllllllllllIlIlllIIIIIlllllI, double lllllllllllllllIlIlllIIIIIllllIl) {
      lllllllllllllllIlIlllIIIIIlllllI = Math.floor(lllllllllllllllIlIlllIIIIIlllllI);
      lllllllllllllllIlIlllIIIIIllllIl = Math.floor(lllllllllllllllIlIlllIIIIIllllIl);
      return lIIllIllIllllI(lIIllIllIlllll(lllllllllllllllIlIlllIIIIIlllllI, 0.0D)) && !lIIllIllIlllII(lIIllIllIlllll(lllllllllllllllIlIlllIIIIIllllIl, 0.0D)) ? gcd(lllllllllllllllIlIlllIIIIIllllIl, lllllllllllllllIlIlllIIIIIlllllI % lllllllllllllllIlIlllIIIIIllllIl) : lllllllllllllllIlIlllIIIIIlllllI + lllllllllllllllIlIlllIIIIIllllIl;
   }

   public Slider(double lllllllllllllllIlIlllIIIIlllIlll, double lllllllllllllllIlIlllIIIIlllIllI, double lllllllllllllllIlIlllIIIIllllIlI, String lllllllllllllllIlIlllIIIIllllIIl) {
      this(lllllllllllllllIlIlllIIIIlllIlll, lllllllllllllllIlIlllIIIIlllIllI, lllllllllllllllIlIlllIIIIllllIlI, getDefaultStep(lllllllllllllllIlIlllIIIIlllIllI, lllllllllllllllIlIlllIIIIllllIlI), lllllllllllllllIlIlllIIIIllllIIl, (boolean)lllIllIIllII[0]);
   }

   public void setValue(double lllllllllllllllIlIlllIIIIlIIIIll) {
      int lllllllllllllllIlIlllIIIIlIIIIlI = new Slider.SliderPoof.SliderPoofInfo(lllllllllllllllIlIlllIIIIlIIlIII.value, lllllllllllllllIlIlllIIIIlIIIIll);
      lllllllllllllllIlIlllIIIIlIIlIII.callPoof(Slider.SliderPoof.class, lllllllllllllllIlIlllIIIIlIIIIlI);
      byte lllllllllllllllIlIlllIIIIlIIIIIl = lllllllllllllllIlIlllIIIIlIIIIlI.getNewValue();
      double var10001;
      if (lIIllIllIllllI(lllllllllllllllIlIlllIIIIlIIlIII.integer)) {
         var10001 = (double)((int)lllllllllllllllIlIlllIIIIlIIIIIl);
         "".length();
         if (" ".length() << " ".length() <= " ".length()) {
            return;
         }
      } else {
         var10001 = lllllllllllllllIlIlllIIIIlIIIIIl;
      }

      lllllllllllllllIlIlllIIIIlIIlIII.value = var10001;
   }

   public double getValue() {
      return lllllllllllllllIlIlllIIIIlIlIlII.value;
   }

   public double getStep() {
      return lllllllllllllllIlIlllIIIIlIlIlll.step;
   }

   private static boolean lIIllIllIllllI(int var0) {
      return var0 != 0;
   }

   private double calculateValue(double lllllllllllllllIlIlllIIIIllIlIII) {
      double lllllllllllllllIlIlllIIIIllIllII = lllllllllllllllIlIlllIIIIllIlIII / (double)lllllllllllllllIlIlllIIIIllIlllI.getWidth();
      char lllllllllllllllIlIlllIIIIllIIllI = lllllllllllllllIlIlllIIIIllIlllI.maximum - lllllllllllllllIlIlllIIIIllIlllI.minimum;
      double lllllllllllllllIlIlllIIIIllIlIlI = lllllllllllllllIlIlllIIIIllIllII * lllllllllllllllIlIlllIIIIllIIllI + lllllllllllllllIlIlllIIIIllIlllI.minimum;
      return MathHelper.func_151237_a(Math.floor((double)Math.round(lllllllllllllllIlIlllIIIIllIlIlI / lllllllllllllllIlIlllIIIIllIlllI.step) * lllllllllllllllIlIlllIIIIllIlllI.step * 100.0D) / 100.0D, lllllllllllllllIlIlllIIIIllIlllI.minimum, lllllllllllllllIlIlllIIIIllIlllI.maximum);
   }

   public abstract static class SliderPoof<T extends Component, S extends Slider.SliderPoof.SliderPoofInfo> extends Poof<T, S> {
      public static class SliderPoofInfo extends PoofInfo {
         // $FF: synthetic field
         double oldValue;
         // $FF: synthetic field
         double newValue;

         public SliderPoofInfo(double lllllllllllllllIIllIlIllllllIlII, double lllllllllllllllIIllIlIllllllIIII) {
            lllllllllllllllIIllIlIllllllIlIl.oldValue = lllllllllllllllIIllIlIllllllIlII;
            lllllllllllllllIIllIlIllllllIlIl.newValue = lllllllllllllllIIllIlIllllllIIII;
         }

         public void setNewValue(double lllllllllllllllIIllIlIlllllIIlII) {
            lllllllllllllllIIllIlIlllllIIlIl.newValue = lllllllllllllllIIllIlIlllllIIlII;
         }

         public double getNewValue() {
            return lllllllllllllllIIllIlIlllllIlIlI.newValue;
         }

         public double getOldValue() {
            return lllllllllllllllIIllIlIlllllIlllI.oldValue;
         }
      }
   }
}
