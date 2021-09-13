package rr.snowhack.snow.setting.impl.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.converter.AbstractBoxedNumberConverter;

public abstract class NumberSetting<T extends Number> extends Setting<T> {
   // $FF: synthetic field
   private static final int[] llllIlIIIllI;
   // $FF: synthetic field
   private final T max;
   // $FF: synthetic field
   private final T min;

   public NumberSetting(T lllllllllllllllIlIlIlIIlIlIIllII, Predicate<T> lllllllllllllllIlIlIlIIlIlIlIIll, BiConsumer<T, T> lllllllllllllllIlIlIlIIlIlIIlIlI, String lllllllllllllllIlIlIlIIlIlIIlIIl, Predicate<T> lllllllllllllllIlIlIlIIlIlIlIIII, T lllllllllllllllIlIlIlIIlIlIIIlll, T lllllllllllllllIlIlIlIIlIlIIIllI) {
      super(lllllllllllllllIlIlIlIIlIlIIllII, lllllllllllllllIlIlIlIIlIlIlIIll, lllllllllllllllIlIlIlIIlIlIIlIlI, lllllllllllllllIlIlIlIIlIlIIlIIl, lllllllllllllllIlIlIlIIlIlIlIIII);
      lllllllllllllllIlIlIlIIlIlIIllIl.min = lllllllllllllllIlIlIlIIlIlIIIlll;
      lllllllllllllllIlIlIlIIlIlIIllIl.max = lllllllllllllllIlIlIlIIlIlIIIllI;
   }

   public boolean isBound() {
      int var10000;
      if (lIIllllllIllIl(lllllllllllllllIlIlIlIIlIlIIIlII.min) && lIIllllllIllIl(lllllllllllllllIlIlIlIIlIlIIIlII.max)) {
         var10000 = llllIlIIIllI[0];
         "".length();
         if (((4 ^ 3) & ~(84 ^ 83)) != 0) {
            return (boolean)((44 ^ 25) & ~(168 ^ 157));
         }
      } else {
         var10000 = llllIlIIIllI[1];
      }

      return (boolean)var10000;
   }

   public T getMin() {
      return lllllllllllllllIlIlIlIIlIIlllIll.min;
   }

   public T getMax() {
      return lllllllllllllllIlIlIlIIlIIlllllI.max;
   }

   public T getValue() {
      return (Number)super.getValue();
   }

   private static void lIIllllllIllII() {
      llllIlIIIllI = new int[2];
      llllIlIIIllI[0] = " ".length();
      llllIlIIIllI[1] = " ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length());
   }

   private static boolean lIIllllllIllIl(Object var0) {
      return var0 != null;
   }

   public abstract AbstractBoxedNumberConverter converter();

   static {
      lIIllllllIllII();
   }
}
