package rr.snowhack.snow.setting;

import com.google.common.base.Converter;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.builder.SettingBuilder;
import rr.snowhack.snow.setting.builder.numerical.DoubleSettingBuilder;
import rr.snowhack.snow.setting.builder.numerical.FloatSettingBuilder;
import rr.snowhack.snow.setting.builder.numerical.IntegerSettingBuilder;
import rr.snowhack.snow.setting.builder.numerical.NumericalSettingBuilder;
import rr.snowhack.snow.setting.builder.primitive.BooleanSettingBuilder;
import rr.snowhack.snow.setting.builder.primitive.EnumSettingBuilder;
import rr.snowhack.snow.setting.builder.primitive.StringSettingBuilder;

public class Settings {
   // $FF: synthetic field
   private static final int[] llllIIIlllIl;

   public static BooleanSettingBuilder booleanBuilder() {
      return new BooleanSettingBuilder();
   }

   public static Setting<Boolean> b(String lllllllllllllllIlIlIllIIIlllIIII, boolean lllllllllllllllIlIlIllIIIllIllIl) {
      return booleanBuilder(lllllllllllllllIlIlIllIIIlllIIII).withValue(lllllllllllllllIlIlIllIIIllIllIl).build();
   }

   public static <T> SettingBuilder<T> custom(String lllllllllllllllIlIlIllIIIIlIIIII, T lllllllllllllllIlIlIllIIIIIlllll, Converter lllllllllllllllIlIlIllIIIIlIIIll, Predicate<T> lllllllllllllllIlIlIllIIIIlIIIlI, boolean lllllllllllllllIlIlIllIIIIlIIIIl) {
      return custom(lllllllllllllllIlIlIllIIIIlIIIII, lllllllllllllllIlIlIllIIIIIlllll, lllllllllllllllIlIlIllIIIIlIIIll, lllllllllllllllIlIlIllIIIIlIIIlI, (lllllllllllllllIlIlIllIIIIIIIIII, lllllllllllllllIlIlIlIllllllllll) -> {
      }, lllllllllllllllIlIlIllIIIIlIIIIl);
   }

   public static StringSettingBuilder stringBuilder() {
      return new StringSettingBuilder();
   }

   public static NumericalSettingBuilder<Double> doubleBuilder(String lllllllllllllllIlIlIllIIIlIllIII) {
      return (new DoubleSettingBuilder()).withName(lllllllllllllllIlIlIllIIIlIllIII);
   }

   public static FloatSettingBuilder floatBuilder() {
      return new FloatSettingBuilder();
   }

   public static Setting<Integer> i(String lllllllllllllllIlIlIllIIIlllIlII, int lllllllllllllllIlIlIllIIIlllIIll) {
      return integerBuilder(lllllllllllllllIlIlIllIIIlllIlII).withValue((Number)lllllllllllllllIlIlIllIIIlllIIll).build();
   }

   public static Setting<String> s(String lllllllllllllllIlIlIllIIIllIIlll, String lllllllllllllllIlIlIllIIIllIIllI) {
      return stringBuilder(lllllllllllllllIlIlIllIIIllIIlll).withValue(lllllllllllllllIlIlIllIIIllIIllI).build();
   }

   public static Setting<Float> f(String lllllllllllllllIlIlIllIIlIIIIIII, float lllllllllllllllIlIlIllIIlIIIIIIl) {
      return floatBuilder(lllllllllllllllIlIlIllIIlIIIIIII).withValue((Number)lllllllllllllllIlIlIllIIlIIIIIIl).build();
   }

   public static NumericalSettingBuilder<Float> floatBuilder(String lllllllllllllllIlIlIllIIIlIllIll) {
      return (new FloatSettingBuilder()).withName(lllllllllllllllIlIlIllIIIlIllIll);
   }

   private static boolean lIIllllIllIIll(int var0) {
      return var0 == 0;
   }

   public static <T> SettingBuilder<T> custom(String lllllllllllllllIlIlIllIIIIIIllII, T lllllllllllllllIlIlIllIIIIIIlIII, Converter lllllllllllllllIlIlIllIIIIIIIlll) {
      return custom(lllllllllllllllIlIlIllIIIIIIllII, lllllllllllllllIlIlIllIIIIIIlIII, lllllllllllllllIlIlIllIIIIIIIlll, (lllllllllllllllIlIlIllIIIIIIIlII) -> {
         return (boolean)llllIIIlllIl[0];
      }, (lllllllllllllllIlIlIllIIIIIIIllI, lllllllllllllllIlIlIllIIIIIIIlIl) -> {
      }, (boolean)llllIIIlllIl[1]);
   }

   public static <T> SettingBuilder<T> custom(String lllllllllllllllIlIlIllIIIlIIlIII, T lllllllllllllllIlIlIllIIIlIIIIIl, final Converter lllllllllllllllIlIlIllIIIlIIIIII, Predicate<T> lllllllllllllllIlIlIllIIIlIIIlIl, BiConsumer<T, T> lllllllllllllllIlIlIllIIIlIIIlII, Predicate<T> lllllllllllllllIlIlIllIIIlIIIIll) {
      return (new SettingBuilder<T>() {
         public Setting<T> build() {
            return new Setting<T>(lllllllllllllllIlIIIllIllIlIlIll.initialValue, lllllllllllllllIlIIIllIllIlIlIll.predicate(), lllllllllllllllIlIIIllIllIlIlIll.consumer, lllllllllllllllIlIIIllIllIlIlIll.name, lllllllllllllllIlIIIllIllIlIlIll.visibilityPredicate()) {
               public Converter converter() {
                  return lllllllllllllllIlIlIllIIIlIIIIII;
               }
            };
         }
      }).withName(lllllllllllllllIlIlIllIIIlIIlIII).withValue(lllllllllllllllIlIlIllIIIlIIIIIl).withConsumer(lllllllllllllllIlIlIllIIIlIIIlII).withVisibility(lllllllllllllllIlIlIllIIIlIIIIll).withRestriction(lllllllllllllllIlIlIllIIIlIIIlIl);
   }

   public static Setting<Boolean> b(String lllllllllllllllIlIlIllIIIllIlIll) {
      return booleanBuilder(lllllllllllllllIlIlIllIIIllIlIll).withValue(Boolean.valueOf((boolean)llllIIIlllIl[0])).build();
   }

   static {
      lIIllllIllIIlI();
   }

   public static StringSettingBuilder stringBuilder(String lllllllllllllllIlIlIllIIIlIlIIII) {
      return (StringSettingBuilder)(new StringSettingBuilder()).withName(lllllllllllllllIlIlIllIIIlIlIIII);
   }

   public static IntegerSettingBuilder integerBuilder() {
      return new IntegerSettingBuilder();
   }

   public static <T> SettingBuilder<T> custom(String lllllllllllllllIlIlIllIIIIllIllI, T lllllllllllllllIlIlIllIIIIlIllll, Converter lllllllllllllllIlIlIllIIIIlIlllI, Predicate<T> lllllllllllllllIlIlIllIIIIlIllIl, BiConsumer<T, T> lllllllllllllllIlIlIllIIIIllIIlI, boolean lllllllllllllllIlIlIllIIIIllIIIl) {
      return custom(lllllllllllllllIlIlIllIIIIllIllI, lllllllllllllllIlIlIllIIIIlIllll, lllllllllllllllIlIlIllIIIIlIlllI, lllllllllllllllIlIlIllIIIIlIllIl, lllllllllllllllIlIlIllIIIIllIIlI, (lllllllllllllllIlIlIlIllllllllII) -> {
         int var10000;
         if (lIIllllIllIIll(lllllllllllllllIlIlIllIIIIllIIIl)) {
            var10000 = llllIIIlllIl[0];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == " ".length()) {
               return (boolean)((182 ^ 149 ^ (57 ^ 38) << (" ".length() << " ".length())) & (27 + 236 - 125 + 117 ^ (87 ^ 82) << (45 ^ 40) ^ -" ".length()));
            }
         } else {
            var10000 = llllIIIlllIl[1];
         }

         return (boolean)var10000;
      });
   }

   public static <T extends Enum> Setting<T> e(String lllllllllllllllIlIlIllIIIlIlllll, Enum lllllllllllllllIlIlIllIIIlIllllI) {
      return enumBuilder(lllllllllllllllIlIlIllIIIlIllllI.getClass()).withName(lllllllllllllllIlIlIllIIIlIlllll).withValue(lllllllllllllllIlIlIllIIIlIllllI).build();
   }

   public static DoubleSettingBuilder doubleBuilder() {
      return new DoubleSettingBuilder();
   }

   public static <T> SettingBuilder<T> custom(String lllllllllllllllIlIlIllIIIIIlIIll, T lllllllllllllllIlIlIllIIIIIlIllI, Converter lllllllllllllllIlIlIllIIIIIlIlIl, boolean lllllllllllllllIlIlIllIIIIIlIIII) {
      return custom(lllllllllllllllIlIlIllIIIIIlIIll, lllllllllllllllIlIlIllIIIIIlIllI, lllllllllllllllIlIlIllIIIIIlIlIl, (lllllllllllllllIlIlIllIIIIIIIIIl) -> {
         return (boolean)llllIIIlllIl[0];
      }, (lllllllllllllllIlIlIllIIIIIIIIll, lllllllllllllllIlIlIllIIIIIIIIlI) -> {
      }, lllllllllllllllIlIlIllIIIIIlIIII);
   }

   private static void lIIllllIllIIlI() {
      llllIIIlllIl = new int[2];
      llllIIIlllIl[0] = " ".length();
      llllIIIlllIl[1] = (40 ^ 3) << " ".length() & ~((16 ^ 59) << " ".length()) & ~((153 ^ 146) << " ".length() & ~((191 ^ 180) << " ".length()));
   }

   public static NumericalSettingBuilder<Integer> integerBuilder(String lllllllllllllllIlIlIllIIIlIlIlIl) {
      return (new IntegerSettingBuilder()).withName(lllllllllllllllIlIlIllIIIlIlIlIl);
   }

   public static EnumSettingBuilder enumBuilder(Class<? extends Enum> lllllllllllllllIlIlIllIIlIIIIlIl) {
      return new EnumSettingBuilder(lllllllllllllllIlIlIllIIlIIIIlIl);
   }

   public static Setting<Double> d(String lllllllllllllllIlIlIllIIIlllllII, double lllllllllllllllIlIlIllIIIllllIll) {
      return doubleBuilder(lllllllllllllllIlIlIllIIIlllllII).withValue((Number)lllllllllllllllIlIlIllIIIllllIll).build();
   }

   public static BooleanSettingBuilder booleanBuilder(String lllllllllllllllIlIlIllIIIlIlIIll) {
      return (new BooleanSettingBuilder()).withName(lllllllllllllllIlIlIllIIIlIlIIll);
   }
}
