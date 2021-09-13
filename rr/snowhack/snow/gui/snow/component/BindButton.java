package rr.snowhack.snow.gui.snow.component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.component.listen.KeyListener;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.module.Module;

public class BindButton extends EnumButton {
   // $FF: synthetic field
   static String[] none;
   // $FF: synthetic field
   boolean shift;
   // $FF: synthetic field
   boolean waiting;
   // $FF: synthetic field
   Module m;
   // $FF: synthetic field
   private static final String[] lIIIlIIIllIII;
   // $FF: synthetic field
   boolean ctrl;
   // $FF: synthetic field
   private static final int[] lIIIlIlIIIlII;
   // $FF: synthetic field
   static String[] lookingFor;
   // $FF: synthetic field
   boolean alt;

   private static void lIllIIIIIlllll() {
      lIIIlIlIIIlII = new int[10];
      lIIIlIlIIIlII[0] = (169 ^ 136) & ~(225 ^ 192);
      lIIIlIlIIIlII[1] = " ".length();
      lIIIlIlIIIlII[2] = (9 ^ 14) << "   ".length();
      lIIIlIlIIIlII[3] = (106 ^ 69 ^ (40 ^ 47) << "   ".length()) << "   ".length();
      lIIIlIlIIIlII[4] = (99 ^ 70) << (" ".length() << " ".length()) ^ 61 + 47 - 18 + 47;
      lIIIlIlIIIlII[5] = 79 + 44 - 92 + 126;
      lIIIlIlIIIlII[6] = (13 ^ 50 ^ (183 ^ 162) << " ".length()) << " ".length();
      lIIIlIlIIIlII[7] = (22 ^ 13) << " ".length();
      lIIIlIlIIIlII[8] = " ".length() << " ".length();
      lIIIlIlIIIlII[9] = " ".length() << "   ".length();
   }

   private boolean isAlt(int lllllllllllllllIIllIlllllIllllII) {
      int var10000;
      if (lIllIIIIlIIIII(lllllllllllllllIIllIlllllIllllII, lIIIlIlIIIlII[2]) && !lIllIIIIlIIIIl(lllllllllllllllIIllIlllllIllllII, lIIIlIlIIIlII[3])) {
         var10000 = lIIIlIlIIIlII[0];
      } else {
         var10000 = lIIIlIlIIIlII[1];
         "".length();
         if ((((251 ^ 196) << " ".length() ^ 127 ^ 80) & ((34 ^ 7) << (" ".length() << " ".length()) ^ 38 + 96 - 78 + 141 ^ -" ".length())) > 0) {
            return (boolean)((172 + 82 - 83 + 54 ^ (236 ^ 143) << " ".length()) & ((144 ^ 183) << " ".length() ^ 69 ^ 44 ^ -" ".length()));
         }
      }

      return (boolean)var10000;
   }

   private static String lIlIllllIIIllI(String lllllllllllllllIIllIlllllIIIIIII, String lllllllllllllllIIllIllllIlllllll) {
      try {
         SecretKeySpec lllllllllllllllIIllIlllllIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIlllllll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIlII[9]), "DES");
         Cipher lllllllllllllllIIllIlllllIIIIlII = Cipher.getInstance("DES");
         lllllllllllllllIIllIlllllIIIIlII.init(lIIIlIlIIIlII[8], lllllllllllllllIIllIlllllIIIIlIl);
         return new String(lllllllllllllllIIllIlllllIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      lIllIIIIIlllll();
      lIlIllllIIlIII();
      String[] var10000 = new String[lIIIlIlIIIlII[1]];
      var10000[lIIIlIlIIIlII[0]] = lIIIlIIIllIII[lIIIlIlIIIlII[0]];
      lookingFor = var10000;
      var10000 = new String[lIIIlIlIIIlII[1]];
      var10000[lIIIlIlIIIlII[0]] = lIIIlIIIllIII[lIIIlIlIIIlII[1]];
      none = var10000;
   }

   private static String lIlIllllIIIlll(String lllllllllllllllIIllIlllllIIlIIlI, String lllllllllllllllIIllIlllllIIlIIIl) {
      lllllllllllllllIIllIlllllIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllllIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlllllIIlIlIl = new StringBuilder();
      char[] lllllllllllllllIIllIlllllIIlIlII = lllllllllllllllIIllIlllllIIlIIIl.toCharArray();
      double lllllllllllllllIIllIlllllIIIlllI = lIIIlIlIIIlII[0];
      float lllllllllllllllIIllIlllllIIIllIl = lllllllllllllllIIllIlllllIIlIIlI.toCharArray();
      char lllllllllllllllIIllIlllllIIIllII = lllllllllllllllIIllIlllllIIIllIl.length;
      int lllllllllllllllIIllIlllllIIIlIll = lIIIlIlIIIlII[0];

      do {
         if (!lIllIIIIlIIIlI(lllllllllllllllIIllIlllllIIIlIll, lllllllllllllllIIllIlllllIIIllII)) {
            return String.valueOf(lllllllllllllllIIllIlllllIIlIlIl);
         }

         char lllllllllllllllIIllIlllllIIllIII = lllllllllllllllIIllIlllllIIIllIl[lllllllllllllllIIllIlllllIIIlIll];
         lllllllllllllllIIllIlllllIIlIlIl.append((char)(lllllllllllllllIIllIlllllIIllIII ^ lllllllllllllllIIllIlllllIIlIlII[lllllllllllllllIIllIlllllIIIlllI % lllllllllllllllIIllIlllllIIlIlII.length]));
         "".length();
         ++lllllllllllllllIIllIlllllIIIlllI;
         ++lllllllllllllllIIllIlllllIIIlIll;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > 0);

      return null;
   }

   private boolean isCtrl(int lllllllllllllllIIllIlllllIlllIII) {
      int var10000;
      if (lIllIIIIlIIIII(lllllllllllllllIIllIlllllIlllIII, lIIIlIlIIIlII[4]) && !lIllIIIIlIIIIl(lllllllllllllllIIllIlllllIlllIII, lIIIlIlIIIlII[5])) {
         var10000 = lIIIlIlIIIlII[0];
      } else {
         var10000 = lIIIlIlIIIlII[1];
         "".length();
         if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
            return (boolean)((165 ^ 136) << " ".length() & ~((188 ^ 145) << " ".length()));
         }
      }

      return (boolean)var10000;
   }

   private static boolean lIllIIIIlIIIIl(int var0, int var1) {
      return var0 == var1;
   }

   public BindButton(String lllllllllllllllIIllIllllllIIIllI, final Module lllllllllllllllIIllIllllllIIIlIl) {
      super(lllllllllllllllIIllIllllllIIIllI, none);
      lllllllllllllllIIllIllllllIIIlll.waiting = (boolean)lIIIlIlIIIlII[0];
      lllllllllllllllIIllIllllllIIIlll.ctrl = (boolean)lIIIlIlIIIlII[0];
      lllllllllllllllIIllIllllllIIIlll.shift = (boolean)lIIIlIlIIIlII[0];
      lllllllllllllllIIllIllllllIIIlll.alt = (boolean)lIIIlIlIIIlII[0];
      lllllllllllllllIIllIllllllIIIlll.m = lllllllllllllllIIllIllllllIIIlIl;
      boolean lllllllllllllllIIllIllllllIIIIII = lllllllllllllllIIllIllllllIIIlIl.getBind();
      String[] var10001 = new String[lIIIlIlIIIlII[1]];
      var10001[lIIIlIlIIIlII[0]] = lllllllllllllllIIllIllllllIIIIII.toString();
      lllllllllllllllIIllIllllllIIIlll.modes = var10001;
      lllllllllllllllIIllIllllllIIIlll.addKeyListener(new KeyListener() {
         // $FF: synthetic field
         private static final int[] lIIIIIllllllI;
         // $FF: synthetic field
         private static final String[] lIIIIIllllIll;

         private static boolean lIlIlIlIIlIIII(int var0, int var1) {
            return var0 < var1;
         }

         private static String lIlIlIlIIIIlIl(String lllllllllllllllIlIIIIIllllIllllI, String lllllllllllllllIlIIIIIllllIlllIl) {
            try {
               long lllllllllllllllIlIIIIIllllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIllllIlllIl.getBytes(StandardCharsets.UTF_8)), lIIIIIllllllI[8]), "DES");
               Cipher lllllllllllllllIlIIIIIlllllIIIII = Cipher.getInstance("DES");
               lllllllllllllllIlIIIIIlllllIIIII.init(lIIIIIllllllI[2], lllllllllllllllIlIIIIIllllIllIlI);
               return new String(lllllllllllllllIlIIIIIlllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static void lIlIlIlIIIllII() {
            lIIIIIllllllI = new int[17];
            lIIIIIllllllI[0] = " ".length();
            lIIIIIllllllI[1] = (250 ^ 153 ^ (34 ^ 37) << "   ".length()) & ((93 ^ 98) << " ".length() ^ 68 ^ 97 ^ -" ".length());
            lIIIIIllllllI[2] = " ".length() << " ".length();
            lIIIIIllllllI[3] = "   ".length();
            lIIIIIllllllI[4] = " ".length() << (" ".length() << " ".length());
            lIIIIIllllllI[5] = 31 ^ 26;
            lIIIIIllllllI[6] = "   ".length() << " ".length();
            lIIIIIllllllI[7] = (152 ^ 189) << " ".length() ^ 249 ^ 180;
            lIIIIIllllllI[8] = " ".length() << "   ".length();
            lIIIIIllllllI[9] = 67 ^ 74;
            lIIIIIllllllI[10] = ((165 ^ 162) << " ".length() ^ 146 ^ 153) << " ".length();
            lIIIIIllllllI[11] = 151 ^ 156;
            lIIIIIllllllI[12] = "   ".length() << (" ".length() << " ".length());
            lIIIIIllllllI[13] = 28 ^ 17;
            lIIIIIllllllI[14] = (46 ^ 41) << " ".length();
            lIIIIIllllllI[15] = -" ".length();
            lIIIIIllllllI[16] = 184 ^ 183;
         }

         private static boolean lIlIlIlIIIllIl(int var0) {
            return var0 == 0;
         }

         private static String lIlIlIlIIIIlII(String lllllllllllllllIlIIIIIlllllIlIll, String lllllllllllllllIlIIIIIlllllIlIlI) {
            try {
               char lllllllllllllllIlIIIIIlllllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlllllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
               Exception lllllllllllllllIlIIIIIlllllIIllI = Cipher.getInstance("Blowfish");
               lllllllllllllllIlIIIIIlllllIIllI.init(lIIIIIllllllI[2], lllllllllllllllIlIIIIIlllllIIlll);
               return new String(lllllllllllllllIlIIIIIlllllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlllllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         public void onKeyUp(KeyListener.KeyEvent lllllllllllllllIlIIIIIllllllIIll) {
         }

         private static boolean lIlIlIlIIIllll(int var0, int var1) {
            return var0 == var1;
         }

         private static void lIlIlIlIIIlIll() {
            lIIIIIllllIll = new String[lIIIIIllllllI[16]];
            lIIIIIllllIll[lIIIIIllllllI[1]] = lIlIlIlIIIIIll("DRw3BkE=", "NhEjj");
            lIIIIIllllIll[lIIIIIllllllI[0]] = lIlIlIlIIIIlII("PxzjMaf4PDo=", "mVEZj");
            lIIIIIllllIll[lIIIIIllllllI[2]] = lIlIlIlIIIIIll("MxUDQw==", "rywhK");
            lIIIIIllllIll[lIIIIIllllllI[3]] = lIlIlIlIIIIlIl("hnJTW6UpYHM=", "cOZeS");
            lIIIIIllllIll[lIIIIIllllllI[4]] = lIlIlIlIIIIlIl("dWAiNZ4ukYo=", "pikbG");
            lIIIIIllllIll[lIIIIIllllllI[5]] = lIlIlIlIIIIIll("CBgzAWI=", "KlAmI");
            lIIIIIllllIll[lIIIIIllllllI[6]] = lIlIlIlIIIIIll("KyEGcw==", "jMrXN");
            lIIIIIllllIll[lIIIIIllllllI[7]] = lIlIlIlIIIIlII("gUeA+HxhpHs=", "kWoyG");
            lIIIIIllllIll[lIIIIIllllllI[8]] = lIlIlIlIIIIlII("yjRsnsur2Os=", "aNyLX");
            lIIIIIllllIll[lIIIIIllllllI[9]] = lIlIlIlIIIIlII("MVoUwwARu20=", "yxxAf");
            lIIIIIllllIll[lIIIIIllllllI[10]] = lIlIlIlIIIIIll("MwY4LU4=", "prJAe");
            lIIIIIllllIll[lIIIIIllllllI[11]] = lIlIlIlIIIIlII("ozQ4IDdlBAg=", "SBFFW");
            lIIIIIllllIll[lIIIIIllllllI[12]] = lIlIlIlIIIIlIl("yVOr5ybbG4s=", "uNvvu");
            lIIIIIllllIll[lIIIIIllllllI[13]] = lIlIlIlIIIIlIl("vSFluJQRUtE=", "qKxOe");
            lIIIIIllllIll[lIIIIIllllllI[14]] = lIlIlIlIIIIIll("", "BHQgD");
         }

         static {
            lIlIlIlIIIllII();
            lIlIlIlIIIlIll();
         }

         private static String lIlIlIlIIIIIll(String lllllllllllllllIlIIIIIllllIIlllI, String lllllllllllllllIlIIIIIllllIIllIl) {
            lllllllllllllllIlIIIIIllllIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIllllIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            StringBuilder lllllllllllllllIlIIIIIllllIIllII = new StringBuilder();
            char[] lllllllllllllllIlIIIIIllllIIlIll = lllllllllllllllIlIIIIIllllIIllIl.toCharArray();
            int lllllllllllllllIlIIIIIllllIIlIlI = lIIIIIllllllI[1];
            int lllllllllllllllIlIIIIIllllIIIlII = lllllllllllllllIlIIIIIllllIIlllI.toCharArray();
            long lllllllllllllllIlIIIIIllllIIIIll = lllllllllllllllIlIIIIIllllIIIlII.length;
            int lllllllllllllllIlIIIIIllllIIIIlI = lIIIIIllllllI[1];

            do {
               if (!lIlIlIlIIlIIII(lllllllllllllllIlIIIIIllllIIIIlI, lllllllllllllllIlIIIIIllllIIIIll)) {
                  return String.valueOf(lllllllllllllllIlIIIIIllllIIllII);
               }

               short lllllllllllllllIlIIIIIllllIIIIIl = lllllllllllllllIlIIIIIllllIIIlII[lllllllllllllllIlIIIIIllllIIIIlI];
               lllllllllllllllIlIIIIIllllIIllII.append((char)(lllllllllllllllIlIIIIIllllIIIIIl ^ lllllllllllllllIlIIIIIllllIIlIll[lllllllllllllllIlIIIIIllllIIlIlI % lllllllllllllllIlIIIIIllllIIlIll.length]));
               "".length();
               ++lllllllllllllllIlIIIIIllllIIlIlI;
               ++lllllllllllllllIlIIIIIllllIIIIlI;
               "".length();
            } while((77 ^ 72) != 0);

            return null;
         }

         public void onKeyDown(KeyListener.KeyEvent lllllllllllllllIlIIIIIlllllllIIl) {
            if (!lIlIlIlIIIllIl(lllllllllllllllIIllIllllllIIIlll.waiting)) {
               int lllllllllllllllIlIIIIIlllllllIII = lllllllllllllllIlIIIIIlllllllIIl.getKey();
               BindButton var10000;
               String[] var10001;
               int var10003;
               StringBuilder var10004;
               String var10005;
               if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.isShift(lllllllllllllllIlIIIIIlllllllIII))) {
                  lllllllllllllllIIllIllllllIIIlll.shift = (boolean)lIIIIIllllllI[0];
                  var10000 = lllllllllllllllIIllIllllllIIIlll;
                  var10001 = new String[lIIIIIllllllI[0]];
                  var10003 = lIIIIIllllllI[1];
                  var10004 = new StringBuilder();
                  if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.ctrl)) {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[1]];
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) == 0) {
                        return;
                     }
                  } else {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[0]];
                  }

                  var10004 = var10004.append(var10005);
                  if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.alt)) {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[2]];
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[3]];
                  }

                  var10001[var10003] = String.valueOf(var10004.append(var10005).append(lIIIIIllllIll[lIIIIIllllllI[4]]));
                  var10000.modes = var10001;
                  "".length();
                  if (" ".length() != " ".length()) {
                     return;
                  }
               } else if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.isCtrl(lllllllllllllllIlIIIIIlllllllIII))) {
                  lllllllllllllllIIllIllllllIIIlll.ctrl = (boolean)lIIIIIllllllI[0];
                  var10000 = lllllllllllllllIIllIllllllIIIlll;
                  var10001 = new String[lIIIIIllllllI[0]];
                  var10003 = lIIIIIllllllI[1];
                  var10004 = (new StringBuilder()).append(lIIIIIllllIll[lIIIIIllllllI[5]]);
                  if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.alt)) {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[6]];
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[7]];
                  }

                  var10004 = var10004.append(var10005);
                  if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.shift)) {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[8]];
                     "".length();
                     if (" ".length() != " ".length()) {
                        return;
                     }
                  } else {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[9]];
                  }

                  var10001[var10003] = String.valueOf(var10004.append(var10005));
                  var10000.modes = var10001;
                  "".length();
                  if (" ".length() <= 0) {
                     return;
                  }
               } else if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.isAlt(lllllllllllllllIlIIIIIlllllllIII))) {
                  lllllllllllllllIIllIllllllIIIlll.alt = (boolean)lIIIIIllllllI[0];
                  var10000 = lllllllllllllllIIllIllllllIIIlll;
                  var10001 = new String[lIIIIIllllllI[0]];
                  var10003 = lIIIIIllllllI[1];
                  var10004 = new StringBuilder();
                  if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.ctrl)) {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[10]];
                     "".length();
                     if (" ".length() < 0) {
                        return;
                     }
                  } else {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[11]];
                  }

                  var10004 = var10004.append(var10005).append(lIIIIIllllIll[lIIIIIllllllI[12]]);
                  if (lIlIlIlIIIlllI(lllllllllllllllIIllIllllllIIIlll.shift)) {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[13]];
                     "".length();
                     if (-" ".length() < -" ".length()) {
                        return;
                     }
                  } else {
                     var10005 = lIIIIIllllIll[lIIIIIllllllI[14]];
                  }

                  var10001[var10003] = String.valueOf(var10004.append(var10005));
                  var10000.modes = var10001;
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else if (lIlIlIlIIIllll(lllllllllllllllIlIIIIIlllllllIII, lIIIIIllllllI[14])) {
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setCtrl((boolean)lIIIIIllllllI[1]);
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setShift((boolean)lIIIIIllllllI[1]);
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setAlt((boolean)lIIIIIllllllI[1]);
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setKey(lIIIIIllllllI[15]);
                  var10000 = lllllllllllllllIIllIllllllIIIlll;
                  var10001 = new String[lIIIIIllllllI[0]];
                  var10001[lIIIIIllllllI[1]] = lllllllllllllllIIllIllllllIIIlIl.getBind().toString();
                  var10000.modes = var10001;
                  lllllllllllllllIIllIllllllIIIlll.waiting = (boolean)lIIIIIllllllI[1];
                  "".length();
                  if (" ".length() <= 0) {
                     return;
                  }
               } else {
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setCtrl(lllllllllllllllIIllIllllllIIIlll.ctrl);
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setShift(lllllllllllllllIIllIllllllIIIlll.shift);
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setAlt(lllllllllllllllIIllIllllllIIIlll.alt);
                  lllllllllllllllIIllIllllllIIIlIl.getBind().setKey(lllllllllllllllIlIIIIIlllllllIII);
                  var10000 = lllllllllllllllIIllIllllllIIIlll;
                  var10001 = new String[lIIIIIllllllI[0]];
                  var10001[lIIIIIllllllI[1]] = lllllllllllllllIIllIllllllIIIlIl.getBind().toString();
                  var10000.modes = var10001;
                  lllllllllllllllIIllIllllllIIIlll.ctrl = lllllllllllllllIIllIllllllIIIlll.alt = lllllllllllllllIIllIllllllIIIlll.shift = (boolean)lIIIIIllllllI[1];
                  lllllllllllllllIIllIllllllIIIlll.waiting = (boolean)lIIIIIllllllI[1];
               }

            }
         }

         private static boolean lIlIlIlIIIlllI(int var0) {
            return var0 != 0;
         }
      });
      lllllllllllllllIIllIllllllIIIlll.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] llllIlllIllI;

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIlIIIllIIIllIll) {
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIlIIIllIIIlllll) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIlIIIllIIlIIIlI) {
            lllllllllllllllIIllIllllllIIIlll.setModes(BindButton.lookingFor);
            lllllllllllllllIIllIllllllIIIlll.waiting = (boolean)llllIlllIllI[0];
         }

         static {
            lIlIIIIllIIIlI();
         }

         private static void lIlIIIIllIIIlI() {
            llllIlllIllI = new int[1];
            llllIlllIllI[0] = " ".length();
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIlIIIllIIIlllIl) {
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIlIIIllIIIllIIl) {
         }
      });
   }

   private static void lIlIllllIIlIII() {
      lIIIlIIIllIII = new String[lIIIlIlIIIlII[8]];
      lIIIlIIIllIII[lIIIlIlIIIlII[0]] = lIlIllllIIIllI("pY8yvrrgcvs=", "LZjpD");
      lIIIlIIIllIII[lIIIlIlIIIlII[1]] = lIlIllllIIIlll("DQkWDA==", "CFXIT");
   }

   private static boolean lIllIIIIlIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIllIIIIlIIIII(int var0, int var1) {
      return var0 != var1;
   }

   private boolean isShift(int lllllllllllllllIIllIlllllIllIlII) {
      int var10000;
      if (lIllIIIIlIIIII(lllllllllllllllIIllIlllllIllIlII, lIIIlIlIIIlII[6]) && !lIllIIIIlIIIIl(lllllllllllllllIIllIlllllIllIlII, lIIIlIlIIIlII[7])) {
         var10000 = lIIIlIlIIIlII[0];
      } else {
         var10000 = lIIIlIlIIIlII[1];
         "".length();
         if (-" ".length() >= " ".length()) {
            return (boolean)((96 ^ 53 ^ (31 ^ 58) << " ".length()) << " ".length() & ((35 ^ 84 ^ (109 ^ 96) << "   ".length()) << " ".length() ^ -" ".length()));
         }
      }

      return (boolean)var10000;
   }
}
