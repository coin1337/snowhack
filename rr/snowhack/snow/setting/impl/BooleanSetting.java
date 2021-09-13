package rr.snowhack.snow.setting.impl;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.converter.BooleanConverter;

public class BooleanSetting extends Setting<Boolean> {
   // $FF: synthetic field
   private static final BooleanConverter converter = new BooleanConverter();

   public BooleanConverter converter() {
      return converter;
   }

   public BooleanSetting(Boolean lllllllllllllllIlIlIlIlIlllllllI, Predicate<Boolean> lllllllllllllllIlIlIlIlIllllIlll, BiConsumer<Boolean, Boolean> lllllllllllllllIlIlIlIlIllllllII, String lllllllllllllllIlIlIlIlIllllIlIl, Predicate<Boolean> lllllllllllllllIlIlIlIlIlllllIlI) {
      super(lllllllllllllllIlIlIlIlIlllllllI, lllllllllllllllIlIlIlIlIllllIlll, lllllllllllllllIlIlIlIlIllllllII, lllllllllllllllIlIlIlIlIllllIlIl, lllllllllllllllIlIlIlIlIlllllIlI);
   }
}
