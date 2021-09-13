package rr.snowhack.snow.setting.impl;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.converter.StringConverter;

public class StringSetting extends Setting<String> {
   // $FF: synthetic field
   private static final StringConverter converter = new StringConverter();

   public StringSetting(String lllllllllllllllIlIIIIlIlIIlIIIlI, Predicate<String> lllllllllllllllIlIIIIlIlIIIllIll, BiConsumer<String, String> lllllllllllllllIlIIIIlIlIIIllIlI, String lllllllllllllllIlIIIIlIlIIIllIIl, Predicate<String> lllllllllllllllIlIIIIlIlIIIllIII) {
      super(lllllllllllllllIlIIIIlIlIIlIIIlI, lllllllllllllllIlIIIIlIlIIIllIll, lllllllllllllllIlIIIIlIlIIIllIlI, lllllllllllllllIlIIIIlIlIIIllIIl, lllllllllllllllIlIIIIlIlIIIllIII);
   }

   public StringConverter converter() {
      return converter;
   }
}
