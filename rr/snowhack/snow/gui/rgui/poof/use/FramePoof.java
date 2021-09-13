package rr.snowhack.snow.gui.rgui.poof.use;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;

public abstract class FramePoof<T extends Component, S extends PoofInfo> extends Poof<T, S> {
   public static enum Action {
      // $FF: synthetic field
      private static final int[] llllIlIllllI;
      // $FF: synthetic field
      MAXIMIZE,
      // $FF: synthetic field
      CLOSE,
      // $FF: synthetic field
      MINIMIZE;

      // $FF: synthetic field
      private static final String[] llllIlIlllIl;

      private static String lIlIIIIIIlllll(String lllllllllllllllIlIlIIllIlIlIlIll, String lllllllllllllllIlIlIIllIlIlIlIlI) {
         lllllllllllllllIlIlIIllIlIlIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         String lllllllllllllllIlIlIIllIlIlIIlII = new StringBuilder();
         int lllllllllllllllIlIlIIllIlIlIIIll = lllllllllllllllIlIlIIllIlIlIlIlI.toCharArray();
         boolean lllllllllllllllIlIlIIllIlIlIIIlI = llllIlIllllI[0];
         float lllllllllllllllIlIlIIllIlIlIIIIl = lllllllllllllllIlIlIIllIlIlIlIll.toCharArray();
         boolean lllllllllllllllIlIlIIllIlIlIIIII = lllllllllllllllIlIlIIllIlIlIIIIl.length;
         int lllllllllllllllIlIlIIllIlIIlllll = llllIlIllllI[0];

         do {
            if (!lIlIIIIIlIIlIl(lllllllllllllllIlIlIIllIlIIlllll, lllllllllllllllIlIlIIllIlIlIIIII)) {
               return String.valueOf(lllllllllllllllIlIlIIllIlIlIIlII);
            }

            char lllllllllllllllIlIlIIllIlIIllllI = lllllllllllllllIlIlIIllIlIlIIIIl[lllllllllllllllIlIlIIllIlIIlllll];
            lllllllllllllllIlIlIIllIlIlIIlII.append((char)(lllllllllllllllIlIlIIllIlIIllllI ^ lllllllllllllllIlIlIIllIlIlIIIll[lllllllllllllllIlIlIIllIlIlIIIlI % lllllllllllllllIlIlIIllIlIlIIIll.length]));
            "".length();
            ++lllllllllllllllIlIlIIllIlIlIIIlI;
            ++lllllllllllllllIlIlIIllIlIIlllll;
            "".length();
         } while(("   ".length() << (" ".length() << " ".length()) & ("   ".length() << (" ".length() << " ".length()) ^ -" ".length())) < " ".length() << (" ".length() << " ".length()));

         return null;
      }

      private static String lIlIIIIIIlllIl(String lllllllllllllllIlIlIIllIlIlllIIl, String lllllllllllllllIlIlIIllIlIlllIlI) {
         try {
            SecretKeySpec lllllllllllllllIlIlIIllIlIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIlIlllIlI.getBytes(StandardCharsets.UTF_8)), llllIlIllllI[4]), "DES");
            char lllllllllllllllIlIlIIllIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIllIlIllIllI.init(llllIlIllllI[2], lllllllllllllllIlIlIIllIlIlllllI);
            return new String(lllllllllllllllIlIlIIllIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIIIIIlIIIII() {
         llllIlIlllIl = new String[llllIlIllllI[3]];
         llllIlIlllIl[llllIlIllllI[0]] = lIlIIIIIIllIll("kSZonhZJDlK2Q7eL0IpLLw==", "TkazW");
         llllIlIlllIl[llllIlIllllI[1]] = lIlIIIIIIlllIl("kRgzszKyMurNKmMvEZ9f0Q==", "uuFgT");
         llllIlIlllIl[llllIlIllllI[2]] = lIlIIIIIIlllll("FyI4OxM=", "TnwhV");
      }

      private static String lIlIIIIIIllIll(String lllllllllllllllIlIlIIllIlIIlIlII, String lllllllllllllllIlIlIIllIlIIlIlIl) {
         try {
            SecretKeySpec lllllllllllllllIlIlIIllIlIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            String lllllllllllllllIlIlIIllIlIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIllIlIIlIIIl.init(llllIlIllllI[2], lllllllllllllllIlIlIIllIlIIllIIl);
            return new String(lllllllllllllllIlIlIIllIlIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIllIlIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static boolean lIlIIIIIlIIlIl(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIlIIIIIlIIlII() {
         llllIlIllllI = new int[5];
         llllIlIllllI[0] = ((28 ^ 19) << "   ".length() ^ 93 ^ 124) & ((77 ^ 34) << " ".length() ^ 82 + 5 - 10 + 58 ^ -" ".length());
         llllIlIllllI[1] = " ".length();
         llllIlIllllI[2] = " ".length() << " ".length();
         llllIlIllllI[3] = "   ".length();
         llllIlIllllI[4] = " ".length() << "   ".length();
      }

      static {
         lIlIIIIIlIIlII();
         lIlIIIIIlIIIII();
         MINIMIZE = new FramePoof.Action(llllIlIlllIl[llllIlIllllI[0]], llllIlIllllI[0]);
         MAXIMIZE = new FramePoof.Action(llllIlIlllIl[llllIlIllllI[1]], llllIlIllllI[1]);
         CLOSE = new FramePoof.Action(llllIlIlllIl[llllIlIllllI[2]], llllIlIllllI[2]);
         FramePoof.Action[] var10000 = new FramePoof.Action[llllIlIllllI[3]];
         var10000[llllIlIllllI[0]] = MINIMIZE;
         var10000[llllIlIllllI[1]] = MAXIMIZE;
         var10000[llllIlIllllI[2]] = CLOSE;
      }
   }

   public static class FramePoofInfo extends PoofInfo {
      // $FF: synthetic field
      private FramePoof.Action action;

      public FramePoof.Action getAction() {
         return lllllllllllllllIlIIlIlIlIIlIllll.action;
      }

      public FramePoofInfo(FramePoof.Action lllllllllllllllIlIIlIlIlIIllIIlI) {
         lllllllllllllllIlIIlIlIlIIllIlIl.action = lllllllllllllllIlIIlIlIlIIllIIlI;
      }
   }
}
