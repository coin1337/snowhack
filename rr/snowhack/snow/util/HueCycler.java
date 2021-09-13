package rr.snowhack.snow.util;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;

public class HueCycler {
   // $FF: synthetic field
   private static final String[] lllllIIIlIIl;
   // $FF: synthetic field
   private static final int[] lllllIIIllII;
   // $FF: synthetic field
   int index;
   // $FF: synthetic field
   int[] cycles;

   public void set() {
      int lllllllllllllllIlIlIIIIlIlIIlIll = lllllllllllllllIlIlIIIIlIlIIllII.cycles[lllllllllllllllIlIlIIIIlIlIIllII.index];
      byte lllllllllllllllIlIlIIIIlIlIIlIlI = (float)(lllllllllllllllIlIlIIIIlIlIIlIll >> lllllIIIllII[2] & lllllIIIllII[3]) / 255.0F;
      short lllllllllllllllIlIlIIIIlIlIIlIIl = (float)(lllllllllllllllIlIlIIIIlIlIIlIll >> lllllIIIllII[4] & lllllIIIllII[3]) / 255.0F;
      float lllllllllllllllIlIlIIIIlIlIIllIl = (float)(lllllllllllllllIlIlIIIIlIlIIlIll & lllllIIIllII[3]) / 255.0F;
      GL11.glColor3f(lllllllllllllllIlIlIIIIlIlIIlIlI, lllllllllllllllIlIlIIIIlIlIIlIIl, lllllllllllllllIlIlIIIIlIlIIllIl);
   }

   public int current() {
      return lllllllllllllllIlIlIIIIlIIllIIll.cycles[lllllllllllllllIlIlIIIIlIIllIIll.index];
   }

   private static void lIlIIIlIIIllll() {
      lllllIIIllII = new int[6];
      lllllIIIllII[0] = (44 ^ 3) & ~(138 ^ 165);
      lllllIIIllII[1] = " ".length();
      lllllIIIllII[2] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllllIIIllII[3] = 113 + 108 - 162 + 196;
      lllllIIIllII[4] = " ".length() << "   ".length();
      lllllIIIllII[5] = " ".length() << " ".length();
   }

   private static boolean lIlIIIlIIlIIII(int var0) {
      return var0 <= 0;
   }

   private static void lIlIIIlIIIlIII() {
      lllllIIIlIIl = new String[lllllIIIllII[1]];
      lllllIIIlIIl[lllllIIIllII[0]] = lIlIIIlIIIIlll("MzUWsTiEDr0yt7pocnnnUQ==", "EsYDs");
   }

   private static boolean lIlIIIlIIlIIIl(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIlIIIlIIIllll();
      lIlIIIlIIIlIII();
   }

   public void reset(int lllllllllllllllIlIlIIIIlIllIIIll) {
      lllllllllllllllIlIlIIIIlIllIIlII.index = lllllllllllllllIlIlIIIIlIllIIIll;
   }

   public void reset() {
      lllllllllllllllIlIlIIIIlIllIlIIl.index = lllllIIIllII[0];
   }

   public int next() {
      char lllllllllllllllIlIlIIIIlIlIlllIl = lllllllllllllllIlIlIIIIlIllIIIII.cycles[lllllllllllllllIlIlIIIIlIllIIIII.index];
      lllllllllllllllIlIlIIIIlIllIIIII.index += lllllIIIllII[1];
      if (lIlIIIlIIlIIlI(lllllllllllllllIlIlIIIIlIllIIIII.index, lllllllllllllllIlIlIIIIlIllIIIII.cycles.length)) {
         lllllllllllllllIlIlIIIIlIllIIIII.index = lllllIIIllII[0];
      }

      return lllllllllllllllIlIlIIIIlIlIlllIl;
   }

   private static boolean lIlIIIlIIlIIlI(int var0, int var1) {
      return var0 >= var1;
   }

   private static String lIlIIIlIIIIlll(String lllllllllllllllIlIlIIIIlIIlIlIll, String lllllllllllllllIlIlIIIIlIIlIlIII) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIIIlIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIIIIlIIlIllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIIIlIIlIllIl.init(lllllIIIllII[5], lllllllllllllllIlIlIIIIlIIlIlllI);
         return new String(lllllllllllllllIlIlIIIIlIIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void setNext(float lllllllllllllllIlIlIIIIlIIlllIlI) {
      int lllllllllllllllIlIlIIIIlIIllllll = lllllllllllllllIlIlIIIIlIlIIIIIl.next();
      float lllllllllllllllIlIlIIIIlIIlllllI = (float)(lllllllllllllllIlIlIIIIlIIllllll >> lllllIIIllII[2] & lllllIIIllII[3]) / 255.0F;
      float lllllllllllllllIlIlIIIIlIIllllIl = (float)(lllllllllllllllIlIlIIIIlIIllllll >> lllllIIIllII[4] & lllllIIIllII[3]) / 255.0F;
      float lllllllllllllllIlIlIIIIlIIllllII = (float)(lllllllllllllllIlIlIIIIlIIllllll & lllllIIIllII[3]) / 255.0F;
      GL11.glColor4f(lllllllllllllllIlIlIIIIlIIlllllI, lllllllllllllllIlIlIIIIlIIllllIl, lllllllllllllllIlIlIIIIlIIllllII, lllllllllllllllIlIlIIIIlIIlllIlI);
   }

   public HueCycler(int lllllllllllllllIlIlIIIIlIlllIIll) {
      lllllllllllllllIlIlIIIIlIlllIIII.index = lllllIIIllII[0];
      if (lIlIIIlIIlIIII(lllllllllllllllIlIlIIIIlIlllIIll)) {
         throw new IllegalArgumentException(lllllIIIlIIl[lllllIIIllII[0]]);
      } else {
         lllllllllllllllIlIlIIIIlIlllIIII.cycles = new int[lllllllllllllllIlIlIIIIlIlllIIll];
         double lllllllllllllllIlIlIIIIlIllIlllI = 0.0D;
         float lllllllllllllllIlIlIIIIlIllIllIl = 1.0D / (double)lllllllllllllllIlIlIIIIlIlllIIll;
         int lllllllllllllllIlIlIIIIlIlllIlIl = lllllIIIllII[0];

         do {
            if (!lIlIIIlIIlIIIl(lllllllllllllllIlIlIIIIlIlllIlIl, lllllllllllllllIlIlIIIIlIlllIIll)) {
               return;
            }

            lllllllllllllllIlIlIIIIlIlllIIII.cycles[lllllllllllllllIlIlIIIIlIlllIlIl] = Color.HSBtoRGB((float)lllllllllllllllIlIlIIIIlIllIlllI, 1.0F, 1.0F);
            lllllllllllllllIlIlIIIIlIllIlllI += lllllllllllllllIlIlIIIIlIllIllIl;
            ++lllllllllllllllIlIlIIIIlIlllIlIl;
            "".length();
         } while(" ".length() >= (((17 ^ 36) << " ".length() ^ 216 ^ 191) << (" ".length() << " ".length()) & ((149 + 53 - 188 + 139 ^ (137 ^ 172) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())));

         throw null;
      }
   }

   public void setNext() {
      int lllllllllllllllIlIlIIIIlIlIlIlll = lllllllllllllllIlIlIIIIlIlIllIlI.next();
   }
}
