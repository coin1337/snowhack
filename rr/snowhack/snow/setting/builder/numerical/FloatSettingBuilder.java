package rr.snowhack.snow.setting.builder.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.impl.numerical.FloatSetting;
import rr.snowhack.snow.setting.impl.numerical.NumberSetting;

public class FloatSettingBuilder extends NumericalSettingBuilder<Float> {
   public FloatSettingBuilder withValue(Float lllllllllllllllIlIlIIlIlIlllIIII) {
      return (FloatSettingBuilder)super.withValue((Number)lllllllllllllllIlIlIIlIlIlllIIII);
   }

   public FloatSettingBuilder withRestriction(Predicate<Float> lllllllllllllllIlIlIIlIlIllIIlII) {
      return (FloatSettingBuilder)super.withRestriction(lllllllllllllllIlIlIIlIlIllIIlII);
   }

   public NumberSetting build() {
      return new FloatSetting((Float)lllllllllllllllIlIlIIlIllIIllllI.initialValue, lllllllllllllllIlIlIIlIllIIllllI.predicate(), lllllllllllllllIlIlIIlIllIIllllI.consumer(), lllllllllllllllIlIlIIlIllIIllllI.name, lllllllllllllllIlIlIIlIllIIllllI.visibilityPredicate(), (Float)lllllllllllllllIlIlIIlIllIIllllI.min, (Float)lllllllllllllllIlIlIIlIllIIllllI.max);
   }

   public FloatSettingBuilder withConsumer(BiConsumer<Float, Float> lllllllllllllllIlIlIIlIlIlllIllI) {
      return (FloatSettingBuilder)super.withConsumer(lllllllllllllllIlIlIIlIlIlllIllI);
   }

   public FloatSettingBuilder withMinimum(Float lllllllllllllllIlIlIIlIllIIlIlll) {
      return (FloatSettingBuilder)super.withMinimum(lllllllllllllllIlIlIIlIllIIlIlll);
   }

   public FloatSettingBuilder withListener(BiConsumer<Float, Float> lllllllllllllllIlIlIIlIllIIIllIl) {
      return (FloatSettingBuilder)super.withListener(lllllllllllllllIlIlIIlIllIIIllIl);
   }

   public FloatSettingBuilder withName(String lllllllllllllllIlIlIIlIllIIlIIll) {
      return (FloatSettingBuilder)super.withName(lllllllllllllllIlIlIIlIllIIlIIll);
   }

   public FloatSettingBuilder withMaximum(Float lllllllllllllllIlIlIIlIllIIIIlIl) {
      return (FloatSettingBuilder)super.withMaximum(lllllllllllllllIlIlIIlIllIIIIlIl);
   }

   public FloatSettingBuilder withRange(Float lllllllllllllllIlIlIIlIlIlllllIl, Float lllllllllllllllIlIlIIlIlIlllllII) {
      return (FloatSettingBuilder)super.withRange(lllllllllllllllIlIlIIlIlIlllllIl, lllllllllllllllIlIlIIlIlIlllllII);
   }

   public FloatSettingBuilder withVisibility(Predicate<Float> lllllllllllllllIlIlIIlIlIllIlIlI) {
      return (FloatSettingBuilder)super.withVisibility(lllllllllllllllIlIlIIlIlIllIlIlI);
   }
}
