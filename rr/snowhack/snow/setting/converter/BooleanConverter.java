package rr.snowhack.snow.setting.converter;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class BooleanConverter extends Converter<Boolean, JsonElement> {
   protected JsonElement doForward(Boolean lllllllllllllllIlIIIIlllllIIIIll) {
      return new JsonPrimitive(lllllllllllllllIlIIIIlllllIIIIll);
   }

   protected Boolean doBackward(JsonElement lllllllllllllllIlIIIIlllllIIIIII) {
      return lllllllllllllllIlIIIIlllllIIIIII.getAsBoolean();
   }
}
