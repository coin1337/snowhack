package rr.snowhack.snow.gui.rgui.component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AlignedComponent extends AbstractComponent {
   // $FF: synthetic field
   AlignedComponent.Alignment alignment;

   public void setAlignment(AlignedComponent.Alignment lllllllllllllllIIlllIIIlIlllllll) {
      lllllllllllllllIIlllIIIllIIIIIII.alignment = lllllllllllllllIIlllIIIlIlllllll;
   }

   public AlignedComponent.Alignment getAlignment() {
      return lllllllllllllllIIlllIIIllIIIIllI.alignment;
   }

   public static enum Alignment {
      // $FF: synthetic field
      CENTER;

      // $FF: synthetic field
      int index;
      // $FF: synthetic field
      LEFT,
      // $FF: synthetic field
      RIGHT;

      // $FF: synthetic field
      private static final String[] lIIIlIllIIIll;
      // $FF: synthetic field
      private static final int[] lIIIlIllIIlIl;

      private static void lIllIIlIIIlIlI() {
         lIIIlIllIIlIl = new int[4];
         lIIIlIllIIlIl[0] = " ".length() << ((180 ^ 167) << (" ".length() << " ".length()) ^ 117 ^ 60) & (" ".length() << (239 ^ 190 ^ (152 ^ 141) << (" ".length() << " ".length())) ^ -" ".length());
         lIIIlIllIIlIl[1] = " ".length();
         lIIIlIllIIlIl[2] = " ".length() << " ".length();
         lIIIlIllIIlIl[3] = "   ".length();
      }

      private static String lIllIIlIIIIlII(String lllllllllllllllIIllIlIIIllIIllll, String lllllllllllllllIIllIlIIIllIIlllI) {
         lllllllllllllllIIllIlIIIllIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         short lllllllllllllllIIllIlIIIllIIlIII = new StringBuilder();
         long lllllllllllllllIIllIlIIIllIIIlll = lllllllllllllllIIllIlIIIllIIlllI.toCharArray();
         int lllllllllllllllIIllIlIIIllIIlIll = lIIIlIllIIlIl[0];
         byte lllllllllllllllIIllIlIIIllIIIlIl = lllllllllllllllIIllIlIIIllIIllll.toCharArray();
         int lllllllllllllllIIllIlIIIllIIIlII = lllllllllllllllIIllIlIIIllIIIlIl.length;
         int lllllllllllllllIIllIlIIIllIIIIll = lIIIlIllIIlIl[0];

         do {
            if (!lIllIIlIIIlIll(lllllllllllllllIIllIlIIIllIIIIll, lllllllllllllllIIllIlIIIllIIIlII)) {
               return String.valueOf(lllllllllllllllIIllIlIIIllIIlIII);
            }

            char lllllllllllllllIIllIlIIIllIlIIII = lllllllllllllllIIllIlIIIllIIIlIl[lllllllllllllllIIllIlIIIllIIIIll];
            lllllllllllllllIIllIlIIIllIIlIII.append((char)(lllllllllllllllIIllIlIIIllIlIIII ^ lllllllllllllllIIllIlIIIllIIIlll[lllllllllllllllIIllIlIIIllIIlIll % lllllllllllllllIIllIlIIIllIIIlll.length]));
            "".length();
            ++lllllllllllllllIIllIlIIIllIIlIll;
            ++lllllllllllllllIIllIlIIIllIIIIll;
            "".length();
         } while(-(146 ^ 151) < 0);

         return null;
      }

      public int getIndex() {
         return lllllllllllllllIIllIlIIIlllIIlll.index;
      }

      private static String lIllIIlIIIIlIl(String lllllllllllllllIIllIlIIIllIlllIl, String lllllllllllllllIIllIlIIIllIlllII) {
         try {
            byte lllllllllllllllIIllIlIIIllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            float lllllllllllllllIIllIlIIIllIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIIIllIllIlI.init(lIIIlIllIIlIl[2], lllllllllllllllIIllIlIIIllIllIll);
            return new String(lllllllllllllllIIllIlIIIllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static boolean lIllIIlIIIlIll(int var0, int var1) {
         return var0 < var1;
      }

      private Alignment(int lllllllllllllllIIllIlIIIlllIlllI) {
         lllllllllllllllIIllIlIIIlllIllll.index = lllllllllllllllIIllIlIIIlllIlllI;
      }

      private static void lIllIIlIIIIllI() {
         lIIIlIllIIIll = new String[lIIIlIllIIlIl[3]];
         lIIIlIllIIIll[lIIIlIllIIlIl[0]] = lIllIIlIIIIlII("LyI8Ew==", "cgzGl");
         lIIIlIllIIIll[lIIIlIllIIlIl[1]] = lIllIIlIIIIlIl("c9179QpmrGk=", "dNAPH");
         lIIIlIllIIIll[lIIIlIllIIlIl[2]] = lIllIIlIIIIlII("ESERBCI=", "ChVLv");
      }

      static {
         lIllIIlIIIlIlI();
         lIllIIlIIIIllI();
         LEFT = new AlignedComponent.Alignment(lIIIlIllIIIll[lIIIlIllIIlIl[0]], lIIIlIllIIlIl[0], lIIIlIllIIlIl[0]);
         CENTER = new AlignedComponent.Alignment(lIIIlIllIIIll[lIIIlIllIIlIl[1]], lIIIlIllIIlIl[1], lIIIlIllIIlIl[1]);
         RIGHT = new AlignedComponent.Alignment(lIIIlIllIIIll[lIIIlIllIIlIl[2]], lIIIlIllIIlIl[2], lIIIlIllIIlIl[2]);
         AlignedComponent.Alignment[] var10000 = new AlignedComponent.Alignment[lIIIlIllIIlIl[3]];
         var10000[lIIIlIllIIlIl[0]] = LEFT;
         var10000[lIIIlIllIIlIl[1]] = CENTER;
         var10000[lIIIlIllIIlIl[2]] = RIGHT;
      }
   }
}
