package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "Fastplace",
   category = Module.Category.PLAYER,
   description = "Nullifies block place delay"
)
public class Fastplace extends Module {
   // $FF: synthetic field
   private Setting<Integer> delay;
   // $FF: synthetic field
   private static final int[] llllllIlllll;
   // $FF: synthetic field
   private static final String[] llllllIlllII;

   private static void lIlIIlIlIllllI() {
      llllllIlllII = new String[llllllIlllll[1]];
      llllllIlllII[llllllIlllll[0]] = lIlIIlIlIlllIl("OVyWzTri1Ro=", "JbVxQ");
   }

   public Fastplace() {
      lllllllllllllllIlIIlIlIlIllllllI.delay = lllllllllllllllIlIIlIlIlIllllllI.register(Settings.i(llllllIlllII[llllllIlllll[0]], llllllIlllll[0]));
   }

   static {
      lIlIIlIllIIIII();
      lIlIIlIlIllllI();
   }

   private static String lIlIIlIlIlllIl(String lllllllllllllllIlIIlIlIlIlllIIll, String lllllllllllllllIlIIlIlIlIlllIIlI) {
      try {
         int lllllllllllllllIlIIlIlIlIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), llllllIlllll[2]), "DES");
         Cipher lllllllllllllllIlIIlIlIlIlllIlIl = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIlIlIlllIlIl.init(llllllIlllll[3], lllllllllllllllIlIIlIlIlIllIllll);
         return new String(lllllllllllllllIlIIlIlIlIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      mc.field_71467_ac = (Integer)lllllllllllllllIlIIlIlIlIllllIll.delay.getValue();
   }

   private static void lIlIIlIllIIIII() {
      llllllIlllll = new int[4];
      llllllIlllll[0] = ((164 ^ 189) << " ".length() ^ 46 ^ 27) << " ".length() & ((240 ^ 133 ^ (170 ^ 147) << " ".length()) << " ".length() ^ -" ".length());
      llllllIlllll[1] = " ".length();
      llllllIlllll[2] = " ".length() << "   ".length();
      llllllIlllll[3] = " ".length() << " ".length();
   }
}
