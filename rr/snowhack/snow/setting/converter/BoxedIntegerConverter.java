package rr.snowhack.snow.setting.converter;

import com.google.gson.JsonElement;

public class BoxedIntegerConverter extends AbstractBoxedNumberConverter<Integer> {
   protected Integer doBackward(JsonElement lllllllllllllllIlIlIlIIllllllIII) {
      return lllllllllllllllIlIlIlIIllllllIII.getAsInt();
   }
}
