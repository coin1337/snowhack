package rr.snowhack.snow.setting.impl.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.converter.AbstractBoxedNumberConverter;
import rr.snowhack.snow.setting.converter.BoxedDoubleConverter;

public class DoubleSetting extends NumberSetting<Double> {
   // $FF: synthetic field
   private static final BoxedDoubleConverter converter = new BoxedDoubleConverter();

   public AbstractBoxedNumberConverter converter() {
      return converter;
   }

   public DoubleSetting(Double lllllllllllllllIlIIIllIIlIIIIlII, Predicate<Double> lllllllllllllllIlIIIllIIlIIIlIll, BiConsumer<Double, Double> lllllllllllllllIlIIIllIIlIIIlIlI, String lllllllllllllllIlIIIllIIlIIIIIIl, Predicate<Double> lllllllllllllllIlIIIllIIlIIIlIII, Double lllllllllllllllIlIIIllIIIlllllll, Double lllllllllllllllIlIIIllIIlIIIIllI) {
      super(lllllllllllllllIlIIIllIIlIIIIlII, lllllllllllllllIlIIIllIIlIIIlIll, lllllllllllllllIlIIIllIIlIIIlIlI, lllllllllllllllIlIIIllIIlIIIIIIl, lllllllllllllllIlIIIllIIlIIIlIII, lllllllllllllllIlIIIllIIIlllllll, lllllllllllllllIlIIIllIIlIIIIllI);
   }
}
