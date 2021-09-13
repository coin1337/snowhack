package rr.snowhack.snow.setting.impl;

import com.google.common.base.Converter;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.converter.EnumConverter;

public class EnumSetting<T extends Enum> extends Setting<T> {
   // $FF: synthetic field
   private EnumConverter converter;
   // $FF: synthetic field
   public final Class<? extends Enum> clazz;

   public EnumSetting(T lllllllllllllllIIlllllIIlIllllll, Predicate<T> lllllllllllllllIIlllllIIlIllIlll, BiConsumer<T, T> lllllllllllllllIIlllllIIlIllllIl, String lllllllllllllllIIlllllIIlIllIlIl, Predicate<T> lllllllllllllllIIlllllIIlIlllIll, Class<? extends Enum> lllllllllllllllIIlllllIIlIlllIlI) {
      super(lllllllllllllllIIlllllIIlIllllll, lllllllllllllllIIlllllIIlIllIlll, lllllllllllllllIIlllllIIlIllllIl, lllllllllllllllIIlllllIIlIllIlIl, lllllllllllllllIIlllllIIlIlllIll);
      lllllllllllllllIIlllllIIlIlllIIl.converter = new EnumConverter(lllllllllllllllIIlllllIIlIlllIlI);
      lllllllllllllllIIlllllIIlIlllIIl.clazz = lllllllllllllllIIlllllIIlIlllIlI;
   }

   public Converter converter() {
      return lllllllllllllllIIlllllIIlIlIlllI.converter;
   }
}
