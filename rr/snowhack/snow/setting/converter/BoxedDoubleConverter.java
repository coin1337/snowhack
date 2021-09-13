package rr.snowhack.snow.setting.converter;

import com.google.gson.JsonElement;

public class BoxedDoubleConverter extends AbstractBoxedNumberConverter<Double> {
   protected Double doBackward(JsonElement lllllllllllllllIIlllllllIIIlllII) {
      return lllllllllllllllIIlllllllIIIlllII.getAsDouble();
   }
}
