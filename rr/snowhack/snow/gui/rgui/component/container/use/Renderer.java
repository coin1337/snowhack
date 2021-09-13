package rr.snowhack.snow.gui.rgui.component.container.use;

import java.awt.Component;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Renderer extends JFrame {
   // $FF: synthetic field
   private static final String[] lIIIIlllIIIIl;
   // $FF: synthetic field
   private static final int[] lIIIIlllIlIIl;

   private static void lIlIllIlIllIll() {
      lIIIIlllIlIIl = new int[5];
      lIIIIlllIlIIl[0] = (125 ^ 106) & ~(152 ^ 143);
      lIIIIlllIlIIl[1] = "   ".length();
      lIIIIlllIlIIl[2] = " ".length();
      lIIIIlllIlIIl[3] = " ".length() << " ".length();
      lIIIIlllIlIIl[4] = " ".length() << "   ".length();
   }

   public Renderer() {
      lllllllllllllllIIllllIIllllIlIll.setTitle(lIIIIlllIIIIl[lIIIIlllIlIIl[0]]);
      lllllllllllllllIIllllIIllllIlIll.setDefaultCloseOperation(lIIIIlllIlIIl[1]);
      lllllllllllllllIIllllIIllllIlIll.setLocationRelativeTo((Component)null);
      JOptionPane.showMessageDialog(lllllllllllllllIIllllIIllllIlIll, lIIIIlllIIIIl[lIIIIlllIlIIl[2]], lIIIIlllIIIIl[lIIIIlllIlIIl[3]], lIIIIlllIlIIl[0]);
   }

   private static String lIlIllIlIIIlIl(String lllllllllllllllIIllllIIllIlIIIll, String lllllllllllllllIIllllIIllIlIIIlI) {
      lllllllllllllllIIllllIIllIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIIllIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      boolean lllllllllllllllIIllllIIllIlIIIIl = new StringBuilder();
      Exception lllllllllllllllIIllllIIllIlIIIII = lllllllllllllllIIllllIIllIlIIIlI.toCharArray();
      double lllllllllllllllIIllllIIllIIlllll = lIIIIlllIlIIl[0];
      short lllllllllllllllIIllllIIllIIllllI = lllllllllllllllIIllllIIllIlIIIll.toCharArray();
      Exception lllllllllllllllIIllllIIllIIlllIl = lllllllllllllllIIllllIIllIIllllI.length;
      int lllllllllllllllIIllllIIllIIlllII = lIIIIlllIlIIl[0];

      do {
         if (!lIlIllIllIIIII(lllllllllllllllIIllllIIllIIlllII, lllllllllllllllIIllllIIllIIlllIl)) {
            return String.valueOf(lllllllllllllllIIllllIIllIlIIIIl);
         }

         char lllllllllllllllIIllllIIllIlIlIll = lllllllllllllllIIllllIIllIIllllI[lllllllllllllllIIllllIIllIIlllII];
         lllllllllllllllIIllllIIllIlIIIIl.append((char)(lllllllllllllllIIllllIIllIlIlIll ^ lllllllllllllllIIllllIIllIlIIIII[lllllllllllllllIIllllIIllIIlllll % lllllllllllllllIIllllIIllIlIIIII.length]));
         "".length();
         ++lllllllllllllllIIllllIIllIIlllll;
         ++lllllllllllllllIIllllIIllIIlllII;
         "".length();
      } while(-"   ".length() < 0);

      return null;
   }

   private static boolean lIlIllIllIIIII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIllIlIIIllI(String lllllllllllllllIIllllIIllIIlIIll, String lllllllllllllllIIllllIIllIIlIIlI) {
      try {
         SecretKeySpec lllllllllllllllIIllllIIllIIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIIllIIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllllllllllllllIIllllIIllIIIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllllIIllIIIlllI.init(lIIIIlllIlIIl[3], lllllllllllllllIIllllIIllIIlIllI);
         return new String(lllllllllllllllIIllllIIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIllIlIIIlll() {
      lIIIIlllIIIIl = new String[lIIIIlllIlIIl[1]];
      lIIIIlllIIIIl[lIIIIlllIlIIl[0]] = lIlIllIlIIIlII("PI2pIfeRULILOZ+QdRdrt2d2kTTiWil9kE/R89Z9v5k=", "wkRjj");
      lIIIIlllIIIIl[lIIIIlllIlIIl[2]] = lIlIllIlIIIlIl("PwsESQQUAVEHChFEBBoMCANRGgsJExkIBg1EBgARDgsEHUUWAQMEDBIQGAYLSm5RGQkDBQIMRQULHx0EBRBRGgsJExwADEVWQlBcRgIeG0ULCwMMRS8KFwYXCwUFAAoI", "fdqie");
      lIIIIlllIIIIl[lIIIIlllIlIIl[3]] = lIlIllIlIIIllI("GrABr3BPbcuN4TX3ees28OCWWBQYcRd9deMiPcvkQDc=", "DzSeJ");
   }

   static {
      lIlIllIlIllIll();
      lIlIllIlIIIlll();
   }

   private static String lIlIllIlIIIlII(String lllllllllllllllIIllllIIlllIlIlll, String lllllllllllllllIIllllIIlllIlIlIl) {
      try {
         short lllllllllllllllIIllllIIlllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIIIlllIlIIl[4]), "DES");
         short lllllllllllllllIIllllIIlllIIIIII = Cipher.getInstance("DES");
         lllllllllllllllIIllllIIlllIIIIII.init(lIIIIlllIlIIl[3], lllllllllllllllIIllllIIlllIIIIlI);
         return new String(lllllllllllllllIIllllIIlllIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
