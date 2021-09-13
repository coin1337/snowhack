package rr.snowhack.snow.setting.builder.primitive;

import rr.snowhack.snow.setting.builder.SettingBuilder;
import rr.snowhack.snow.setting.impl.BooleanSetting;

public class BooleanSettingBuilder extends SettingBuilder<Boolean> {
   public BooleanSettingBuilder withName(String lllllllllllllllIlIIIIlIIllIlIIll) {
      return (BooleanSettingBuilder)super.withName(lllllllllllllllIlIIIIlIIllIlIIll);
   }

   public BooleanSetting build() {
      return new BooleanSetting((Boolean)lllllllllllllllIlIIIIlIIllIllIIl.initialValue, lllllllllllllllIlIIIIlIIllIllIIl.predicate(), lllllllllllllllIlIIIIlIIllIllIIl.consumer(), lllllllllllllllIlIIIIlIIllIllIIl.name, lllllllllllllllIlIIIIlIIllIllIIl.visibilityPredicate());
   }
}
