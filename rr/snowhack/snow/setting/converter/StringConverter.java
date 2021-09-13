package rr.snowhack.snow.setting.converter;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class StringConverter extends Converter<String, JsonElement> {
   protected String doBackward(JsonElement lllllllllllllllIIlllIllIIIllIIll) {
      return lllllllllllllllIIlllIllIIIllIIll.getAsString();
   }

   protected JsonElement doForward(String lllllllllllllllIIlllIllIIIllIlll) {
      return new JsonPrimitive(lllllllllllllllIIlllIllIIIllIlll);
   }
}
