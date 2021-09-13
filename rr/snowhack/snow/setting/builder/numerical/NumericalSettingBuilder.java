package rr.snowhack.snow.setting.builder.numerical;

import java.util.function.BiConsumer;
import rr.snowhack.snow.setting.builder.SettingBuilder;
import rr.snowhack.snow.setting.impl.numerical.NumberSetting;

public abstract class NumericalSettingBuilder<T extends Number> extends SettingBuilder<T> {
   // $FF: synthetic field
   private static final int[] lIIIIIIlIllll;
   // $FF: synthetic field
   protected T min;
   // $FF: synthetic field
   protected T max;

   private static boolean lIlIIllllllIll(int var0) {
      return var0 >= 0;
   }

   static {
      lIlIIlllllIIIl();
   }

   private static int lIlIIlllllIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIlIIlllllIIll(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIIlllllIlII(int var0) {
      return var0 > 0;
   }

   public NumericalSettingBuilder<T> withMinimum(T lllllllllllllllIlIIIlllIllIlIIll) {
      lllllllllllllllIlIIIlllIllIlIllI.predicateList.add((lllllllllllllllIlIIIlllIlIIIllll) -> {
         int var10000;
         if (lIlIIllllllIll(lIlIIllllllllI(lllllllllllllllIlIIIlllIlIIIllll.doubleValue(), lllllllllllllllIlIIIlllIllIlIIll.doubleValue()))) {
            var10000 = lIIIIIIlIllll[0];
            "".length();
            if (((211 ^ 196) & ~(157 ^ 138)) < 0) {
               return (boolean)((182 ^ 147) & ~(133 ^ 160));
            }
         } else {
            var10000 = lIIIIIIlIllll[1];
         }

         return (boolean)var10000;
      });
      "".length();
      if (!lIlIIlllllIIll(lllllllllllllllIlIIIlllIllIlIllI.min) || lIlIIlllllIlII(lIlIIlllllIIlI(lllllllllllllllIlIIIlllIllIlIIll.doubleValue(), lllllllllllllllIlIIIlllIllIlIllI.min.doubleValue()))) {
         lllllllllllllllIlIIIlllIllIlIllI.min = lllllllllllllllIlIIIlllIllIlIIll;
      }

      return lllllllllllllllIlIIIlllIllIlIllI;
   }

   private static void lIlIIlllllIIIl() {
      lIIIIIIlIllll = new int[2];
      lIIIIIIlIllll[0] = " ".length();
      lIIIIIIlIllll[1] = (207 ^ 194 ^ (190 ^ 185) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((17 ^ 56) << (" ".length() << " ".length()) ^ 5 + 94 - -34 + 48) << (" ".length() << " ".length()) ^ -" ".length());
   }

   private static int lIlIIllllllllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public abstract NumberSetting build();

   private static int lIlIIllllllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIIllllllIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIlIIlllllIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public NumericalSettingBuilder<T> withMaximum(T lllllllllllllllIlIIIlllIllIIllll) {
      lllllllllllllllIlIIIlllIllIIlllI.predicateList.add((lllllllllllllllIlIIIlllIlIIlIlIl) -> {
         int var10000;
         if (lIlIIlllllllII(lIlIIlllllllIl(lllllllllllllllIlIIIlllIlIIlIlIl.doubleValue(), lllllllllllllllIlIIIlllIllIIllll.doubleValue()))) {
            var10000 = lIIIIIIlIllll[0];
            "".length();
            if (" ".length() >= "   ".length()) {
               return (boolean)((52 ^ 43) & ~(218 ^ 197));
            }
         } else {
            var10000 = lIIIIIIlIllll[1];
         }

         return (boolean)var10000;
      });
      "".length();
      if (!lIlIIlllllIIll(lllllllllllllllIlIIIlllIllIIlllI.max) || lIlIIlllllIllI(lIlIIlllllIlIl(lllllllllllllllIlIIIlllIllIIllll.doubleValue(), lllllllllllllllIlIIIlllIllIIlllI.max.doubleValue()))) {
         lllllllllllllllIlIIIlllIllIIlllI.max = lllllllllllllllIlIIIlllIllIIllll;
      }

      return lllllllllllllllIlIIIlllIllIIlllI;
   }

   public NumericalSettingBuilder<T> withListener(BiConsumer<T, T> lllllllllllllllIlIIIlllIllIIIIII) {
      lllllllllllllllIlIIIlllIllIIIIIl.consumer = lllllllllllllllIlIIIlllIllIIIIII;
      return lllllllllllllllIlIIIlllIllIIIIIl;
   }

   private static boolean lIlIIlllllIllI(int var0) {
      return var0 < 0;
   }

   public NumericalSettingBuilder<T> withRange(T lllllllllllllllIlIIIlllIllIIIlIl, T lllllllllllllllIlIIIlllIllIIIlII) {
      lllllllllllllllIlIIIlllIllIIIllI.predicateList.add((lllllllllllllllIlIIIlllIlIIllllI) -> {
         double lllllllllllllllIlIIIlllIlIIlllIl = lllllllllllllllIlIIIlllIlIIllllI.doubleValue();
         int var10000;
         if (lIlIIllllllIll(lIlIIllllllIIl(lllllllllllllllIlIIIlllIlIIlllIl, lllllllllllllllIlIIIlllIllIIIlIl.doubleValue())) && lIlIIlllllllII(lIlIIllllllIlI(lllllllllllllllIlIIIlllIlIIlllIl, lllllllllllllllIlIIIlllIllIIIlII.doubleValue()))) {
            var10000 = lIIIIIIlIllll[0];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
               return (boolean)((11 ^ 30) << (" ".length() << " ".length()) & ~((46 ^ 59) << (" ".length() << " ".length())));
            }
         } else {
            var10000 = lIIIIIIlIllll[1];
         }

         return (boolean)var10000;
      });
      "".length();
      if (!lIlIIlllllIIll(lllllllllllllllIlIIIlllIllIIIllI.min) || lIlIIlllllIlII(lIlIIlllllIlll(lllllllllllllllIlIIIlllIllIIIlIl.doubleValue(), lllllllllllllllIlIIIlllIllIIIllI.min.doubleValue()))) {
         lllllllllllllllIlIIIlllIllIIIllI.min = lllllllllllllllIlIIIlllIllIIIlIl;
      }

      if (!lIlIIlllllIIll(lllllllllllllllIlIIIlllIllIIIllI.max) || lIlIIlllllIllI(lIlIIllllllIII(lllllllllllllllIlIIIlllIllIIIlII.doubleValue(), lllllllllllllllIlIIIlllIllIIIllI.max.doubleValue()))) {
         lllllllllllllllIlIIIlllIllIIIllI.max = lllllllllllllllIlIIIlllIllIIIlII;
      }

      return lllllllllllllllIlIIIlllIllIIIllI;
   }

   private static int lIlIIlllllIlll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIlIIlllllllII(int var0) {
      return var0 <= 0;
   }

   private static int lIlIIllllllIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public NumericalSettingBuilder withName(String lllllllllllllllIlIIIlllIlIllIIlI) {
      return (NumericalSettingBuilder)super.withName(lllllllllllllllIlIIIlllIlIllIIlI);
   }

   private static int lIlIIlllllllIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public NumericalSettingBuilder<T> withValue(T lllllllllllllllIlIIIlllIlIlllIII) {
      return (NumericalSettingBuilder)super.withValue(lllllllllllllllIlIIIlllIlIlllIII);
   }
}
