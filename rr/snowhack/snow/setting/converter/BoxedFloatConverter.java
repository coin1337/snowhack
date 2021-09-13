package rr.snowhack.snow.setting.converter;

import com.google.gson.JsonElement;

public class BoxedFloatConverter extends AbstractBoxedNumberConverter<Float> {
   protected Float doBackward(JsonElement lllllllllllllllIlIIlIlllIlIIIlII) {
      return lllllllllllllllIlIIlIlllIlIIIlII.getAsFloat();
   }
}
