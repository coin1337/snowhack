package rr.snowhack.snow.event;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.type.Cancellable;
import rr.snowhack.snow.util.Wrapper;

public class SnowEvent extends Cancellable {
   // $FF: synthetic field
   private final float partialTicks;
   // $FF: synthetic field
   private SnowEvent.Era era;

   public SnowEvent.Era getEra() {
      return lllllllllllllllIIlllllllllIlIllI.era;
   }

   public float getPartialTicks() {
      return lllllllllllllllIIlllllllllIlIIll.partialTicks;
   }

   public SnowEvent() {
      lllllllllllllllIIlllllllllIllIII.era = SnowEvent.Era.PRE;
      lllllllllllllllIIlllllllllIllIII.partialTicks = Wrapper.getMinecraft().func_184121_ak();
   }

   public static enum Era {
      // $FF: synthetic field
      PRE,
      // $FF: synthetic field
      PERI,
      // $FF: synthetic field
      POST;

      // $FF: synthetic field
      private static final String[] lIIIIlIIlIIll;
      // $FF: synthetic field
      private static final int[] lIIIIlIIlIlII;

      private static void lIlIlIlIllllll() {
         lIIIIlIIlIIll = new String[lIIIIlIIlIlII[3]];
         lIIIIlIIlIIll[lIIIIlIIlIlII[0]] = lIlIlIlIllllIl("k9xDiJqaZXI=", "aAaoc");
         lIIIIlIIlIIll[lIIIIlIIlIlII[1]] = lIlIlIlIlllllI("spM5VgPNt5c=", "ZyGxL");
         lIIIIlIIlIIll[lIIIIlIIlIlII[2]] = lIlIlIlIlllllI("l1wj9kzflNQ=", "ddULA");
      }

      private static String lIlIlIlIlllllI(String lllllllllllllllIlIIIIIIlIIIlIlll, String lllllllllllllllIlIIIIIIlIIIlIllI) {
         try {
            float lllllllllllllllIlIIIIIIlIIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIIIlIIlIlII[4]), "DES");
            byte lllllllllllllllIlIIIIIIlIIIlIlII = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIIlIIIlIlII.init(lIIIIlIIlIlII[2], lllllllllllllllIlIIIIIIlIIIlIlIl);
            return new String(lllllllllllllllIlIIIIIIlIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIlIlIlIllllIl(String lllllllllllllllIlIIIIIIlIIlIIlII, String lllllllllllllllIlIIIIIIlIIlIIlIl) {
         try {
            long lllllllllllllllIlIIIIIIlIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            char lllllllllllllllIlIIIIIIlIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIIlIIlIIIIl.init(lIIIIlIIlIlII[2], lllllllllllllllIlIIIIIIlIIlIIIlI);
            return new String(lllllllllllllllIlIIIIIIlIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIlIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIlIllIIIIII() {
         lIIIIlIIlIlII = new int[5];
         lIIIIlIIlIlII[0] = (158 + 57 - 67 + 25 ^ (85 ^ 6) << " ".length()) << " ".length() & (((42 ^ 45) << (" ".length() << (" ".length() << " ".length())) ^ 108 ^ 23) << " ".length() ^ -" ".length());
         lIIIIlIIlIlII[1] = " ".length();
         lIIIIlIIlIlII[2] = " ".length() << " ".length();
         lIIIIlIIlIlII[3] = "   ".length();
         lIIIIlIIlIlII[4] = " ".length() << "   ".length();
      }

      static {
         lIlIlIllIIIIII();
         lIlIlIlIllllll();
         PRE = new SnowEvent.Era(lIIIIlIIlIIll[lIIIIlIIlIlII[0]], lIIIIlIIlIlII[0]);
         PERI = new SnowEvent.Era(lIIIIlIIlIIll[lIIIIlIIlIlII[1]], lIIIIlIIlIlII[1]);
         POST = new SnowEvent.Era(lIIIIlIIlIIll[lIIIIlIIlIlII[2]], lIIIIlIIlIlII[2]);
         SnowEvent.Era[] var10000 = new SnowEvent.Era[lIIIIlIIlIlII[3]];
         var10000[lIIIIlIIlIlII[0]] = PRE;
         var10000[lIIIIlIIlIlII[1]] = PERI;
         var10000[lIIIIlIIlIlII[2]] = POST;
      }
   }
}
