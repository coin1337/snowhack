package rr.snowhack.snow.setting.converter;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public abstract class AbstractBoxedNumberConverter<T extends Number> extends Converter<T, JsonElement> {
   protected JsonElement doForward(T lllllllllllllllIlIlIIllllIIllIll) {
      return new JsonPrimitive(lllllllllllllllIlIlIIllllIIllIll);
   }
}
