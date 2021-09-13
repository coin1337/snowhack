package rr.snowhack.snow.setting.converter;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

public class EnumConverter extends Converter<Enum, JsonElement> {
   // $FF: synthetic field
   Class<? extends Enum> clazz;

   protected JsonElement doForward(Enum lllllllllllllllIlIlIIIllIIIIllll) {
      return new JsonPrimitive(lllllllllllllllIlIlIIIllIIIIllll.toString());
   }

   protected Enum doBackward(JsonElement lllllllllllllllIlIlIIIllIIIIlIll) {
      return Enum.valueOf(lllllllllllllllIlIlIIIllIIIIllII.clazz, lllllllllllllllIlIlIIIllIIIIlIll.getAsString());
   }

   public EnumConverter(Class<? extends Enum> lllllllllllllllIlIlIIIllIIIlIlIl) {
      lllllllllllllllIlIlIIIllIIIlIllI.clazz = lllllllllllllllIlIlIIIllIIIlIlIl;
   }
}
