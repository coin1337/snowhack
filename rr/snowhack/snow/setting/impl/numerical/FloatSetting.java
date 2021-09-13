package rr.snowhack.snow.setting.impl.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.converter.AbstractBoxedNumberConverter;
import rr.snowhack.snow.setting.converter.BoxedFloatConverter;

public class FloatSetting extends NumberSetting<Float> {
   // $FF: synthetic field
   private static final BoxedFloatConverter converter = new BoxedFloatConverter();

   public AbstractBoxedNumberConverter converter() {
      return converter;
   }

   public FloatSetting(Float lllllllllllllllIIllllllIllIIIlll, Predicate<Float> lllllllllllllllIIllllllIllIIlllI, BiConsumer<Float, Float> lllllllllllllllIIllllllIllIIIlIl, String lllllllllllllllIIllllllIllIIIlII, Predicate<Float> lllllllllllllllIIllllllIllIIlIll, Float lllllllllllllllIIllllllIllIIIIlI, Float lllllllllllllllIIllllllIllIIlIIl) {
      super(lllllllllllllllIIllllllIllIIIlll, lllllllllllllllIIllllllIllIIlllI, lllllllllllllllIIllllllIllIIIlIl, lllllllllllllllIIllllllIllIIIlII, lllllllllllllllIIllllllIllIIlIll, lllllllllllllllIIllllllIllIIIIlI, lllllllllllllllIIllllllIllIIlIIl);
   }
}
