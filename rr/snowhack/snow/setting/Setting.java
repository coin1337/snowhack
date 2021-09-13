package rr.snowhack.snow.setting;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import rr.snowhack.snow.setting.converter.Convertable;

public abstract class Setting<T> implements ISettingUnknown, Convertable<T> {
   // $FF: synthetic field
   private BiConsumer<T, T> consumer;
   // $FF: synthetic field
   private Predicate<T> restriction;
   // $FF: synthetic field
   private final Class valueType;
   // $FF: synthetic field
   String name;
   // $FF: synthetic field
   private Predicate<T> visibilityPredicate;
   // $FF: synthetic field
   private static final int[] llllIIllllll;
   // $FF: synthetic field
   T value;

   public BiConsumer<T, T> changeListener() {
      return lllllllllllllllIlIlIlIIllIIIlIIl.consumer;
   }

   public void setValueFromString(String lllllllllllllllIlIlIlIIllIIIIIII) {
      JsonParser lllllllllllllllIlIlIlIIllIIIIIlI = new JsonParser();
      lllllllllllllllIlIlIlIIllIIIIlII.setValue(lllllllllllllllIlIlIlIIllIIIIlII.converter().reverse().convert(lllllllllllllllIlIlIlIIllIIIIIlI.parse(lllllllllllllllIlIlIlIIllIIIIIII)));
      "".length();
   }

   public boolean isVisible() {
      return lllllllllllllllIlIlIlIIllIIIllII.visibilityPredicate.test(lllllllllllllllIlIlIlIIllIIIllII.getValue());
   }

   public T getValue() {
      return lllllllllllllllIlIlIlIIllIIllIll.value;
   }

   public Setting(T lllllllllllllllIlIlIlIIllIlIIlII, Predicate<T> lllllllllllllllIlIlIlIIllIlIlIIl, BiConsumer<T, T> lllllllllllllllIlIlIlIIllIlIlIII, String lllllllllllllllIlIlIlIIllIlIIlll, Predicate<T> lllllllllllllllIlIlIlIIllIlIIIII) {
      lllllllllllllllIlIlIlIIllIlIlIll.value = lllllllllllllllIlIlIlIIllIlIIlII;
      lllllllllllllllIlIlIlIIllIlIlIll.valueType = lllllllllllllllIlIlIlIIllIlIIlII.getClass();
      lllllllllllllllIlIlIlIIllIlIlIll.restriction = lllllllllllllllIlIlIlIIllIlIlIIl;
      lllllllllllllllIlIlIlIIllIlIlIll.consumer = lllllllllllllllIlIlIlIIllIlIlIII;
      lllllllllllllllIlIlIlIIllIlIlIll.name = lllllllllllllllIlIlIlIIllIlIIlll;
      lllllllllllllllIlIlIlIIllIlIlIll.visibilityPredicate = lllllllllllllllIlIlIlIIllIlIIIII;
   }

   static {
      lIIllllllIlIII();
   }

   private static boolean lIIllllllIlIIl(int var0) {
      return var0 == 0;
   }

   public Class getValueClass() {
      return lllllllllllllllIlIlIlIIllIIlIlll.valueType;
   }

   public boolean setValue(T lllllllllllllllIlIlIlIIllIIIllll) {
      T lllllllllllllllIlIlIlIIllIIIlllI = lllllllllllllllIlIlIlIIllIIlIIll.getValue();
      if (lIIllllllIlIIl(lllllllllllllllIlIlIlIIllIIlIIll.restriction.test(lllllllllllllllIlIlIlIIllIIIllll))) {
         return (boolean)llllIIllllll[0];
      } else {
         lllllllllllllllIlIlIlIIllIIlIIll.value = lllllllllllllllIlIlIlIIllIIIllll;
         lllllllllllllllIlIlIlIIllIIlIIll.consumer.accept(lllllllllllllllIlIlIlIIllIIIlllI, lllllllllllllllIlIlIlIIllIIIllll);
         return (boolean)llllIIllllll[1];
      }
   }

   private static void lIIllllllIlIII() {
      llllIIllllll = new int[2];
      llllIIllllll[0] = (112 ^ 123) << (" ".length() << " ".length()) & ~((101 ^ 110) << (" ".length() << " ".length()));
      llllIIllllll[1] = " ".length();
   }

   public String getValueAsString() {
      return ((JsonElement)lllllllllllllllIlIlIlIIlIlllllIl.converter().convert(lllllllllllllllIlIlIlIIlIlllllIl.getValue())).toString();
   }

   public String getName() {
      return lllllllllllllllIlIlIlIIllIIllllI.name;
   }
}
