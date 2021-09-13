package rr.snowhack.snow.setting.builder.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.impl.numerical.DoubleSetting;
import rr.snowhack.snow.setting.impl.numerical.NumberSetting;

public class DoubleSettingBuilder extends NumericalSettingBuilder<Double> {
   public NumberSetting build() {
      return new DoubleSetting((Double)lllllllllllllllIIlllIIllIlIlIllI.initialValue, lllllllllllllllIIlllIIllIlIlIllI.predicate(), lllllllllllllllIIlllIIllIlIlIllI.consumer(), lllllllllllllllIIlllIIllIlIlIllI.name, lllllllllllllllIIlllIIllIlIlIllI.visibilityPredicate(), (Double)lllllllllllllllIIlllIIllIlIlIllI.min, (Double)lllllllllllllllIIlllIIllIlIlIllI.max);
   }

   public DoubleSettingBuilder withVisibility(Predicate<Double> lllllllllllllllIIlllIIllIlIIllll) {
      return (DoubleSettingBuilder)super.withVisibility(lllllllllllllllIIlllIIllIlIIllll);
   }

   public DoubleSettingBuilder withMinimum(Double lllllllllllllllIIlllIIllIIIllllI) {
      return (DoubleSettingBuilder)super.withMinimum(lllllllllllllllIIlllIIllIIIllllI);
   }

   public DoubleSettingBuilder withMaximum(Double lllllllllllllllIIlllIIllIIlIlllI) {
      return (DoubleSettingBuilder)super.withMaximum(lllllllllllllllIIlllIIllIIlIlllI);
   }

   public DoubleSettingBuilder withRange(Double lllllllllllllllIIlllIIllIIllIlIl, Double lllllllllllllllIIlllIIllIIllIlII) {
      return (DoubleSettingBuilder)super.withRange(lllllllllllllllIIlllIIllIIllIlIl, lllllllllllllllIIlllIIllIIllIlII);
   }

   public DoubleSettingBuilder withName(String lllllllllllllllIIlllIIllIIlIIlII) {
      return (DoubleSettingBuilder)super.withName(lllllllllllllllIIlllIIllIIlIIlII);
   }

   public DoubleSettingBuilder withRestriction(Predicate<Double> lllllllllllllllIIlllIIllIlIIlIll) {
      return (DoubleSettingBuilder)super.withRestriction(lllllllllllllllIIlllIIllIlIIlIll);
   }

   public DoubleSettingBuilder withConsumer(BiConsumer<Double, Double> lllllllllllllllIIlllIIllIlIIIlIl) {
      return (DoubleSettingBuilder)super.withConsumer(lllllllllllllllIIlllIIllIlIIIlIl);
   }

   public DoubleSettingBuilder withListener(BiConsumer<Double, Double> lllllllllllllllIIlllIIllIIlIlIII) {
      return (DoubleSettingBuilder)super.withListener(lllllllllllllllIIlllIIllIIlIlIII);
   }

   public DoubleSettingBuilder withValue(Double lllllllllllllllIIlllIIllIIllllIl) {
      return (DoubleSettingBuilder)super.withValue((Number)lllllllllllllllIIlllIIllIIllllIl);
   }
}
