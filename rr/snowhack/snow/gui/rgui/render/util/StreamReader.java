package rr.snowhack.snow.gui.rgui.render.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.StringJoiner;

public final class StreamReader {
   // $FF: synthetic field
   private static final String[] llllIlllllll;
   // $FF: synthetic field
   private static final int[] lllllIIIIIlI;
   // $FF: synthetic field
   private final InputStream stream;

   private static void lIlIIIIllllIlI() {
      lllllIIIIIlI = new int[2];
      lllllIIIIIlI[0] = ((144 ^ 181) << " ".length() ^ 112 ^ 99) & (230 + 80 - 292 + 233 ^ (123 ^ 42) << " ".length() ^ -" ".length());
      lllllIIIIIlI[1] = " ".length();
   }

   private static boolean lIlIIIIllllIll(Object var0) {
      return var0 != null;
   }

   public final String read() {
      StringJoiner lllllllllllllllIlIlIIIlIIlIIIlIl = new StringJoiner(llllIlllllll[lllllIIIIIlI[0]]);

      try {
         BufferedReader lllllllllllllllIlIlIIIlIIlIIlIIl = new BufferedReader(new InputStreamReader(lllllllllllllllIlIlIIIlIIlIIIllI.stream));

         while(true) {
            String lllllllllllllllIlIlIIIlIIlIIlIII;
            if (!lIlIIIIllllIll(lllllllllllllllIlIlIIIlIIlIIlIII = lllllllllllllllIlIlIIIlIIlIIlIIl.readLine())) {
               lllllllllllllllIlIlIIIlIIlIIlIIl.close();
               break;
            }

            lllllllllllllllIlIlIIIlIIlIIIlIl.add(lllllllllllllllIlIlIIIlIIlIIlIII);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
               return null;
            }
         }
      } catch (IOException var4) {
         var4.printStackTrace();
         return lllllllllllllllIlIlIIIlIIlIIIlIl.toString();
      }

      "".length();
      if (null != null) {
         return null;
      } else {
         return lllllllllllllllIlIlIIIlIIlIIIlIl.toString();
      }
   }

   static {
      lIlIIIIllllIlI();
      lIlIIIIllllIII();
   }

   private static String lIlIIIIlllIlll(String lllllllllllllllIlIlIIIlIIIllIIIl, String lllllllllllllllIlIlIIIlIIIllIIII) {
      lllllllllllllllIlIlIIIlIIIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIIIlIIIllIlII = new StringBuilder();
      char[] lllllllllllllllIlIlIIIlIIIllIIll = lllllllllllllllIlIlIIIlIIIllIIII.toCharArray();
      long lllllllllllllllIlIlIIIlIIIlIllIl = lllllIIIIIlI[0];
      byte lllllllllllllllIlIlIIIlIIIlIllII = lllllllllllllllIlIlIIIlIIIllIIIl.toCharArray();
      byte lllllllllllllllIlIlIIIlIIIlIlIll = lllllllllllllllIlIlIIIlIIIlIllII.length;
      int lllllllllllllllIlIlIIIlIIIlIlIlI = lllllIIIIIlI[0];

      do {
         if (!lIlIIIIlllllII(lllllllllllllllIlIlIIIlIIIlIlIlI, lllllllllllllllIlIlIIIlIIIlIlIll)) {
            return String.valueOf(lllllllllllllllIlIlIIIlIIIllIlII);
         }

         char lllllllllllllllIlIlIIIlIIIlIlIIl = lllllllllllllllIlIlIIIlIIIlIllII[lllllllllllllllIlIlIIIlIIIlIlIlI];
         lllllllllllllllIlIlIIIlIIIllIlII.append((char)(lllllllllllllllIlIlIIIlIIIlIlIIl ^ lllllllllllllllIlIlIIIlIIIllIIll[lllllllllllllllIlIlIIIlIIIlIllIl % lllllllllllllllIlIlIIIlIIIllIIll.length]));
         "".length();
         ++lllllllllllllllIlIlIIIlIIIlIllIl;
         ++lllllllllllllllIlIlIIIlIIIlIlIlI;
         "".length();
      } while(null == null);

      return null;
   }

   public StreamReader(InputStream lllllllllllllllIlIlIIIlIIlIIlllI) {
      lllllllllllllllIlIlIIIlIIlIlIIIl.stream = lllllllllllllllIlIlIIIlIIlIIlllI;
   }

   private static boolean lIlIIIIlllllII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIIIIllllIII() {
      llllIlllllll = new String[lllllIIIIIlI[1]];
      llllIlllllll[lllllIIIIIlI[0]] = lIlIIIIlllIlll("TA==", "FznHx");
   }
}
