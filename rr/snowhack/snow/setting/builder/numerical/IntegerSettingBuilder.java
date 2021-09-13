package rr.snowhack.snow.setting.builder.numerical;

import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.impl.numerical.IntegerSetting;
import rr.snowhack.snow.setting.impl.numerical.NumberSetting;

public class IntegerSettingBuilder extends NumericalSettingBuilder<Integer> {
   public IntegerSettingBuilder withMaximum(Integer lllllllllllllllIlIIIllIlIlIIIIlI) {
      return (IntegerSettingBuilder)super.withMaximum(lllllllllllllllIlIIIllIlIlIIIIlI);
   }

   public NumberSetting build() {
      return new IntegerSetting((Integer)lllllllllllllllIlIIIllIlIlIllIlI.initialValue, lllllllllllllllIlIIIllIlIlIllIlI.predicate(), lllllllllllllllIlIIIllIlIlIllIlI.consumer(), lllllllllllllllIlIIIllIlIlIllIlI.name, lllllllllllllllIlIIIllIlIlIllIlI.visibilityPredicate(), (Integer)lllllllllllllllIlIIIllIlIlIllIlI.min, (Integer)lllllllllllllllIlIIIllIlIlIllIlI.max);
   }

   public IntegerSettingBuilder withRange(Integer lllllllllllllllIlIIIllIlIIlllIlI, Integer lllllllllllllllIlIIIllIlIIlllIIl) {
      return (IntegerSettingBuilder)super.withRange(lllllllllllllllIlIIIllIlIIlllIlI, lllllllllllllllIlIIIllIlIIlllIIl);
   }

   public IntegerSettingBuilder withMinimum(Integer lllllllllllllllIlIIIllIlIlIlIlII) {
      return (IntegerSettingBuilder)super.withMinimum(lllllllllllllllIlIIIllIlIlIlIlII);
   }

   public IntegerSettingBuilder withVisibility(Predicate<Integer> lllllllllllllllIlIIIllIlIIlIIIIl) {
      return (IntegerSettingBuilder)super.withVisibility(lllllllllllllllIlIIIllIlIIlIIIIl);
   }

   public NumericalSettingBuilder withName(String lllllllllllllllIlIIIllIlIlIIlllI) {
      return super.withName(lllllllllllllllIlIIIllIlIlIIlllI);
   }

   public IntegerSettingBuilder withListener(BiConsumer<Integer, Integer> lllllllllllllllIlIIIllIlIlIIlIlI) {
      return (IntegerSettingBuilder)super.withListener(lllllllllllllllIlIIIllIlIlIIlIlI);
   }

   public IntegerSettingBuilder withValue(Integer lllllllllllllllIlIIIllIlIIllIlIl) {
      return (IntegerSettingBuilder)super.withValue((Number)lllllllllllllllIlIIIllIlIIllIlIl);
   }

   public IntegerSettingBuilder withConsumer(BiConsumer<Integer, Integer> lllllllllllllllIlIIIllIlIIlIllll) {
      return (IntegerSettingBuilder)super.withConsumer(lllllllllllllllIlIIIllIlIIlIllll);
   }

   public IntegerSettingBuilder withRestriction(Predicate<Integer> lllllllllllllllIlIIIllIlIIlIIlll) {
      return (IntegerSettingBuilder)super.withRestriction(lllllllllllllllIlIIIllIlIIlIIlll);
   }
}
