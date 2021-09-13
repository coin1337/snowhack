package rr.snowhack.snow.gui.snow.component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.AbstractContainer;
import rr.snowhack.snow.gui.rgui.component.container.use.Scrollpane;
import rr.snowhack.snow.gui.rgui.component.listen.KeyListener;
import rr.snowhack.snow.gui.rgui.component.use.InputField;
import rr.snowhack.snow.gui.rgui.component.use.Label;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;
import rr.snowhack.snow.gui.snow.Stretcherlayout;

public class Chat extends AbstractContainer {
   // $FF: synthetic field
   InputField field;
   // $FF: synthetic field
   Scrollpane scrollpane;
   // $FF: synthetic field
   private static final String[] llllIIllIlII;
   // $FF: synthetic field
   private static final int[] llllIIllIlIl;
   // $FF: synthetic field
   Label label;

   private static void lIIllllllIIIlI() {
      llllIIllIlII = new String[llllIIllIlIl[1]];
      llllIIllIlII[llllIIllIlIl[0]] = lIIllllllIIIIl("M5BlPBHQIAo=", "cKzLB");
   }

   static {
      lIIllllllIIIll();
      lIIllllllIIIlI();
   }

   public Chat(Theme lllllllllllllllIlIlIlIlIIIlIlIlI, int lllllllllllllllIlIlIlIlIIIlIllIl, int lllllllllllllllIlIlIlIlIIIlIllII) {
      super(lllllllllllllllIlIlIlIlIIIlIlIlI);
      lllllllllllllllIlIlIlIlIIIlIllll.label = new Label(llllIIllIlII[llllIIllIlIl[0]], (boolean)llllIIllIlIl[1]);
      lllllllllllllllIlIlIlIlIIIlIllll.field = new InputField(lllllllllllllllIlIlIlIlIIIlIllIl);
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane = new Scrollpane(lllllllllllllllIlIlIlIlIIIlIllll.getTheme(), new Stretcherlayout(llllIIllIlIl[1]), lllllllllllllllIlIlIlIlIIIlIllIl, lllllllllllllllIlIlIlIlIIIlIllII);
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setWidth(lllllllllllllllIlIlIlIlIIIlIllIl);
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setHeight(lllllllllllllllIlIlIlIlIIIlIllII);
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setLockHeight((boolean)llllIIllIlIl[1]).setLockWidth((boolean)llllIIllIlIl[1]);
      "".length();
      Scrollpane var10000 = lllllllllllllllIlIlIlIlIIIlIllll.scrollpane;
      Component[] var10001 = new Component[llllIIllIlIl[1]];
      var10001[llllIIllIlIl[0]] = lllllllllllllllIlIlIlIlIIIlIllll.label;
      var10000.addChild(var10001);
      "".length();
      lllllllllllllllIlIlIlIlIIIlIllll.field.addKeyListener(new KeyListener() {
         // $FF: synthetic field
         private static final String[] lIIIIIIlIlIII;
         // $FF: synthetic field
         private static final int[] lIIIIIIlIlIIl;

         private static void lIlIIllllIllIl() {
            lIIIIIIlIlIIl = new int[5];
            lIIIIIIlIlIIl[0] = (122 + 54 - 68 + 59 ^ (2 ^ 7) << (163 ^ 166)) << (" ".length() << " ".length());
            lIIIIIIlIlIIl[1] = (75 ^ 2 ^ (171 ^ 140) << " ".length()) << "   ".length() & (((60 ^ 21) << " ".length() ^ 58 ^ 111) << "   ".length() ^ -" ".length()) & (((231 ^ 194) << (" ".length() << " ".length()) ^ 96 + 108 - 70 + 1) << (" ".length() << " ".length()) & (((189 ^ 170) << " ".length() ^ 0 ^ 61) << (" ".length() << " ".length()) ^ -" ".length()) ^ -" ".length());
            lIIIIIIlIlIIl[2] = " ".length();
            lIIIIIIlIlIIl[3] = " ".length() << "   ".length();
            lIIIIIIlIlIIl[4] = " ".length() << " ".length();
         }

         static {
            lIlIIllllIllIl();
            lIlIIllllIllII();
         }

         private static boolean lIlIIllllIlllI(int var0, int var1) {
            return var0 == var1;
         }

         private static void lIlIIllllIllII() {
            lIIIIIIlIlIII = new String[lIIIIIIlIlIIl[2]];
            lIIIIIIlIlIII[lIIIIIIlIlIIl[1]] = lIlIIllllIlIll("acaoCDG+xkE=", "Lrwpl");
         }

         public void onKeyUp(KeyListener.KeyEvent lllllllllllllllIlIIIllllIIlIIIll) {
         }

         private static boolean lIlIIllllIllll(int var0) {
            return var0 != 0;
         }

         public void onKeyDown(KeyListener.KeyEvent lllllllllllllllIlIIIllllIIlIIlIl) {
            if (lIlIIllllIlllI(lllllllllllllllIlIIIllllIIlIIlIl.getKey(), lIIIIIIlIlIIl[0])) {
               lllllllllllllllIlIlIlIlIIIlIllll.label.addLine(lllllllllllllllIlIlIlIlIIIlIllll.field.getText());
               lllllllllllllllIlIlIlIlIIIlIllll.field.setText(lIIIIIIlIlIII[lIIIIIIlIlIIl[1]]);
               "".length();
               if (lIlIIllllIllll(lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.canScrollY())) {
                  lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setScrolledY(lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.getMaxScrollY());
               }
            }

         }

         private static String lIlIIllllIlIll(String lllllllllllllllIlIIIllllIIIllIIl, String lllllllllllllllIlIIIllllIIIllIII) {
            try {
               byte lllllllllllllllIlIIIllllIIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIIIllIII.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIlIIl[3]), "DES");
               Cipher lllllllllllllllIlIIIllllIIIlllIl = Cipher.getInstance("DES");
               lllllllllllllllIlIIIllllIIIlllIl.init(lIIIIIIlIlIIl[4], lllllllllllllllIlIIIllllIIIlIlll);
               return new String(lllllllllllllllIlIIIllllIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }
      });
      var10001 = new Component[llllIIllIlIl[1]];
      var10001[llllIIllIlIl[0]] = lllllllllllllllIlIlIlIlIIIlIllll.scrollpane;
      lllllllllllllllIlIlIlIlIIIlIllll.addChild(var10001);
      "".length();
      var10001 = new Component[llllIIllIlIl[1]];
      var10001[llllIIllIlIl[0]] = lllllllllllllllIlIlIlIlIIIlIllll.field;
      lllllllllllllllIlIlIlIlIIIlIllll.addChild(var10001);
      "".length();
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setLockHeight((boolean)llllIIllIlIl[0]);
      "".length();
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setHeight(lllllllllllllllIlIlIlIlIIIlIllII - lllllllllllllllIlIlIlIlIIIlIllll.field.getHeight());
      lllllllllllllllIlIlIlIlIIIlIllll.scrollpane.setLockHeight((boolean)llllIIllIlIl[1]);
      "".length();
      lllllllllllllllIlIlIlIlIIIlIllll.setWidth(lllllllllllllllIlIlIlIlIIIlIllIl);
      lllllllllllllllIlIlIlIlIIIlIllll.setHeight(lllllllllllllllIlIlIlIlIIIlIllII);
      lllllllllllllllIlIlIlIlIIIlIllll.field.setY(lllllllllllllllIlIlIlIlIIIlIllll.getHeight() - lllllllllllllllIlIlIlIlIIIlIllll.field.getHeight());
   }

   private static void lIIllllllIIIll() {
      llllIIllIlIl = new int[4];
      llllIIllIlIl[0] = "   ".length() & ("   ".length() ^ -" ".length());
      llllIIllIlIl[1] = " ".length();
      llllIIllIlIl[2] = " ".length() << "   ".length();
      llllIIllIlIl[3] = " ".length() << " ".length();
   }

   private static String lIIllllllIIIIl(String lllllllllllllllIlIlIlIlIIIlIIIII, String lllllllllllllllIlIlIlIlIIIIlllIl) {
      try {
         long lllllllllllllllIlIlIlIlIIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), llllIIllIlIl[2]), "DES");
         Cipher lllllllllllllllIlIlIlIlIIIlIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIlIlIlIIIlIIIlI.init(llllIIllIlIl[3], lllllllllllllllIlIlIlIlIIIIlllII);
         return new String(lllllllllllllllIlIlIlIlIIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlIIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
