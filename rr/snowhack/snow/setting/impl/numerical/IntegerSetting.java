package rr.snowhack.snow.setting.impl.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.converter.AbstractBoxedNumberConverter;
import rr.snowhack.snow.setting.converter.BoxedIntegerConverter;

public class IntegerSetting extends NumberSetting<Integer> {
   // $FF: synthetic field
   private static final BoxedIntegerConverter converter = new BoxedIntegerConverter();

   public AbstractBoxedNumberConverter converter() {
      return converter;
   }

   public IntegerSetting(Integer lllllllllllllllIllIIIIlIlIIllIll, Predicate<Integer> lllllllllllllllIllIIIIlIlIIllIlI, BiConsumer<Integer, Integer> lllllllllllllllIllIIIIlIlIIllIIl, String lllllllllllllllIllIIIIlIlIlIIIII, Predicate<Integer> lllllllllllllllIllIIIIlIlIIlIlll, Integer lllllllllllllllIllIIIIlIlIIllllI, Integer lllllllllllllllIllIIIIlIlIIlllIl) {
      super(lllllllllllllllIllIIIIlIlIIllIll, lllllllllllllllIllIIIIlIlIIllIlI, lllllllllllllllIllIIIIlIlIIllIIl, lllllllllllllllIllIIIIlIlIlIIIII, lllllllllllllllIllIIIIlIlIIlIlll, lllllllllllllllIllIIIIlIlIIllllI, lllllllllllllllIllIIIIlIlIIlllIl);
   }
}
