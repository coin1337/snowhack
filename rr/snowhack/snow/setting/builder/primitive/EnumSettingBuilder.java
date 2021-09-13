package rr.snowhack.snow.setting.builder.primitive;

import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.builder.SettingBuilder;
import rr.snowhack.snow.setting.impl.EnumSetting;

public class EnumSettingBuilder<T extends Enum> extends SettingBuilder<T> {
   // $FF: synthetic field
   Class<? extends Enum> clazz;

   public Setting<T> build() {
      return new EnumSetting((Enum)lllllllllllllllIIlllIIlIllIllIII.initialValue, lllllllllllllllIIlllIIlIllIllIII.predicate(), lllllllllllllllIIlllIIlIllIllIII.consumer(), lllllllllllllllIIlllIIlIllIllIII.name, lllllllllllllllIIlllIIlIllIllIII.visibilityPredicate(), lllllllllllllllIIlllIIlIllIllIII.clazz);
   }

   public EnumSettingBuilder(Class<? extends Enum> lllllllllllllllIIlllIIlIllIllIlI) {
      lllllllllllllllIIlllIIlIllIllIll.clazz = lllllllllllllllIIlllIIlIllIllIlI;
   }
}
