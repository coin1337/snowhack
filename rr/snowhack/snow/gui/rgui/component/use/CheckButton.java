package rr.snowhack.snow.gui.rgui.component.use;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.Poof;

public class CheckButton extends Button {
   // $FF: synthetic field
   private static final int[] lIIIIllIllIIl;
   // $FF: synthetic field
   boolean toggled;

   public CheckButton(String lllllllllllllllIIllllIlllIIIlIIl, int lllllllllllllllIIllllIlllIIIIlII, int lllllllllllllllIIllllIlllIIIIlll) {
      super(lllllllllllllllIIllllIlllIIIlIIl, lllllllllllllllIIllllIlllIIIIlII, lllllllllllllllIIllllIlllIIIIlll);
      lllllllllllllllIIllllIlllIIIlIlI.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] lIIIIIlIlIllI;

         private static void lIlIlIIlIIIllI() {
            lIIIIIlIlIllI = new int[2];
            lIIIIIlIlIllI[0] = " ".length();
            lIIIIIlIlIllI[1] = ((126 ^ 93) << (" ".length() << " ".length()) ^ 84 + 44 - 68 + 107) & (61 ^ 118 ^ "   ".length() << (14 ^ 11) ^ -" ".length());
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIIIlllIIlIlIll) {
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIIIlllIIlIlIIl) {
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIlllIIlIllll) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIlllIIllIIIl) {
            if (!lIlIlIIlIIIlll(lllllllllllllllIlIIIIlllIIllIIIl.getButton())) {
               CheckButton var10000 = lllllllllllllllIIllllIlllIIIlIlI;
               int var10001;
               if (lIlIlIIlIIlIII(lllllllllllllllIIllllIlllIIIlIlI.toggled)) {
                  var10001 = lIIIIIlIlIllI[0];
                  "".length();
                  if (-" ".length() >= 0) {
                     return;
                  }
               } else {
                  var10001 = lIIIIIlIlIllI[1];
               }

               var10000.toggled = (boolean)var10001;
               lllllllllllllllIIllllIlllIIIlIlI.callPoof(CheckButton.CheckButtonPoof.class, new CheckButton.CheckButtonPoof.CheckButtonPoofInfo(CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction.TOGGLE));
               if (lIlIlIIlIIIlll(lllllllllllllllIIllllIlllIIIlIlI.toggled)) {
                  lllllllllllllllIIllllIlllIIIlIlI.callPoof(CheckButton.CheckButtonPoof.class, new CheckButton.CheckButtonPoof.CheckButtonPoofInfo(CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction.ENABLE));
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
                     return;
                  }
               } else {
                  lllllllllllllllIIllllIlllIIIlIlI.callPoof(CheckButton.CheckButtonPoof.class, new CheckButton.CheckButtonPoof.CheckButtonPoofInfo(CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction.DISABLE));
               }

            }
         }

         private static boolean lIlIlIIlIIlIII(int var0) {
            return var0 == 0;
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIlllIIlIllIl) {
         }

         static {
            lIlIlIIlIIIllI();
         }

         private static boolean lIlIlIIlIIIlll(int var0) {
            return var0 != 0;
         }
      });
   }

   public boolean isToggled() {
      return lllllllllllllllIIllllIllIllllIlI.toggled;
   }

   static {
      lIlIllIIlIlIII();
   }

   public void setToggled(boolean lllllllllllllllIIllllIllIlllllIl) {
      lllllllllllllllIIllllIllIllllllI.toggled = lllllllllllllllIIllllIllIlllllIl;
   }

   private static void lIlIllIIlIlIII() {
      lIIIIllIllIIl = new int[1];
      lIIIIllIllIIl[0] = ((162 ^ 131) << (" ".length() << " ".length()) ^ 39 + 12 - -69 + 17) << (" ".length() << " ".length()) & ((134 + 161 - 213 + 101 ^ (76 ^ 17) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
   }

   public CheckButton(String lllllllllllllllIIllllIlllIIlIIIl) {
      this(lllllllllllllllIIllllIlllIIlIIIl, lIIIIllIllIIl[0], lIIIIllIllIIl[0]);
   }

   public abstract static class CheckButtonPoof<T extends CheckButton, S extends CheckButton.CheckButtonPoof.CheckButtonPoofInfo> extends Poof<T, S> {
      // $FF: synthetic field
      CheckButton.CheckButtonPoof.CheckButtonPoofInfo info;

      public static class CheckButtonPoofInfo extends PoofInfo {
         // $FF: synthetic field
         CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction action;

         public CheckButtonPoofInfo(CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction lllllllllllllllIIlllIlIllIlIlIll) {
            lllllllllllllllIIlllIlIllIlIlIlI.action = lllllllllllllllIIlllIlIllIlIlIll;
         }

         public CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction getAction() {
            return lllllllllllllllIIlllIlIllIlIIlll.action;
         }

         public static enum CheckButtonPoofInfoAction {
            // $FF: synthetic field
            DISABLE,
            // $FF: synthetic field
            TOGGLE,
            // $FF: synthetic field
            ENABLE;

            // $FF: synthetic field
            private static final String[] lIIIIIIllIllI;
            // $FF: synthetic field
            private static final int[] lIIIIIIlllIIl;

            private static void lIlIlIIIIIIlIl() {
               lIIIIIIllIllI = new String[lIIIIIIlllIIl[3]];
               lIIIIIIllIllI[lIIIIIIlllIIl[0]] = lIlIlIIIIIIIll("GRY9Hy0I", "MYzXa");
               lIIIIIIllIllI[lIIIIIIlllIIl[1]] = lIlIlIIIIIIlII("FlbN9r+0fu4=", "wygrd");
               lIIIIIIllIllI[lIIIIIIlllIIl[2]] = lIlIlIIIIIIlII("i0LHywlbVck=", "ymMuU");
            }

            private static String lIlIlIIIIIIIll(String lllllllllllllllIlIIIllIllIIlIlIl, String lllllllllllllllIlIIIllIllIIIllll) {
               lllllllllllllllIlIIIllIllIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIllIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
               StringBuilder lllllllllllllllIlIIIllIllIIlIIll = new StringBuilder();
               short lllllllllllllllIlIIIllIllIIIllIl = lllllllllllllllIlIIIllIllIIIllll.toCharArray();
               int lllllllllllllllIlIIIllIllIIlIIIl = lIIIIIIlllIIl[0];
               String lllllllllllllllIlIIIllIllIIIlIll = lllllllllllllllIlIIIllIllIIlIlIl.toCharArray();
               int lllllllllllllllIlIIIllIllIIIlIlI = lllllllllllllllIlIIIllIllIIIlIll.length;
               int lllllllllllllllIlIIIllIllIIIlIIl = lIIIIIIlllIIl[0];

               do {
                  if (!lIlIlIIIIIIlll(lllllllllllllllIlIIIllIllIIIlIIl, lllllllllllllllIlIIIllIllIIIlIlI)) {
                     return String.valueOf(lllllllllllllllIlIIIllIllIIlIIll);
                  }

                  char lllllllllllllllIlIIIllIllIIlIllI = lllllllllllllllIlIIIllIllIIIlIll[lllllllllllllllIlIIIllIllIIIlIIl];
                  lllllllllllllllIlIIIllIllIIlIIll.append((char)(lllllllllllllllIlIIIllIllIIlIllI ^ lllllllllllllllIlIIIllIllIIIllIl[lllllllllllllllIlIIIllIllIIlIIIl % lllllllllllllllIlIIIllIllIIIllIl.length]));
                  "".length();
                  ++lllllllllllllllIlIIIllIllIIlIIIl;
                  ++lllllllllllllllIlIIIllIllIIIlIIl;
                  "".length();
               } while(null == null);

               return null;
            }

            private static String lIlIlIIIIIIlII(String lllllllllllllllIlIIIllIlIllllllI, String lllllllllllllllIlIIIllIlIlllllIl) {
               try {
                  SecretKeySpec lllllllllllllllIlIIIllIllIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIlIlllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                  Cipher lllllllllllllllIlIIIllIllIIIIIlI = Cipher.getInstance("Blowfish");
                  lllllllllllllllIlIIIllIllIIIIIlI.init(lIIIIIIlllIIl[2], lllllllllllllllIlIIIllIllIIIIIll);
                  return new String(lllllllllllllllIlIIIllIllIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIlIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
               } catch (Exception var4) {
                  var4.printStackTrace();
                  return null;
               }
            }

            private static boolean lIlIlIIIIIIlll(int var0, int var1) {
               return var0 < var1;
            }

            static {
               lIlIlIIIIIIllI();
               lIlIlIIIIIIlIl();
               TOGGLE = new CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction(lIIIIIIllIllI[lIIIIIIlllIIl[0]], lIIIIIIlllIIl[0]);
               ENABLE = new CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction(lIIIIIIllIllI[lIIIIIIlllIIl[1]], lIIIIIIlllIIl[1]);
               DISABLE = new CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction(lIIIIIIllIllI[lIIIIIIlllIIl[2]], lIIIIIIlllIIl[2]);
               CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction[] var10000 = new CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction[lIIIIIIlllIIl[3]];
               var10000[lIIIIIIlllIIl[0]] = TOGGLE;
               var10000[lIIIIIIlllIIl[1]] = ENABLE;
               var10000[lIIIIIIlllIIl[2]] = DISABLE;
            }

            private static void lIlIlIIIIIIllI() {
               lIIIIIIlllIIl = new int[4];
               lIIIIIIlllIIl[0] = (160 ^ 181) << (" ".length() << " ".length()) & ~((147 ^ 134) << (" ".length() << " ".length()));
               lIIIIIIlllIIl[1] = " ".length();
               lIIIIIIlllIIl[2] = " ".length() << " ".length();
               lIIIIIIlllIIl[3] = "   ".length();
            }
         }
      }
   }
}
