package rr.snowhack.snow.gui.font;

import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class CFontRenderer extends CFont {
   // $FF: synthetic field
   private final String colorcodeIdentifiers;
   // $FF: synthetic field
   protected CFont.CharData[] italicChars;
   // $FF: synthetic field
   protected CFont.CharData[] boldChars;
   // $FF: synthetic field
   private static final String[] lIIIlIlIllIll;
   // $FF: synthetic field
   private final int[] colorCode;
   // $FF: synthetic field
   protected DynamicTexture texItalicBold;
   // $FF: synthetic field
   protected DynamicTexture texBold;
   // $FF: synthetic field
   private static final int[] lIIIlIlIlllIl;
   // $FF: synthetic field
   protected DynamicTexture texItalic;
   // $FF: synthetic field
   protected CFont.CharData[] boldItalicChars;

   private static boolean lIllIIIllIIIIl(int var0, int var1) {
      return var0 > var1;
   }

   private static String lIllIIIlIlIlII(String lllllllllllllllIIllIlIlIIIIlIIll, String lllllllllllllllIIllIlIlIIIIlIlll) {
      lllllllllllllllIIllIlIlIIIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlIlIIIIlIllI = new StringBuilder();
      double lllllllllllllllIIllIlIlIIIIlIIII = lllllllllllllllIIllIlIlIIIIlIlll.toCharArray();
      int lllllllllllllllIIllIlIlIIIIlIlII = lIIIlIlIlllIl[2];
      boolean lllllllllllllllIIllIlIlIIIIIlllI = lllllllllllllllIIllIlIlIIIIlIIll.toCharArray();
      short lllllllllllllllIIllIlIlIIIIIllIl = lllllllllllllllIIllIlIlIIIIIlllI.length;
      int lllllllllllllllIIllIlIlIIIIIllII = lIIIlIlIlllIl[2];

      do {
         if (!lIllIIIlIlllll(lllllllllllllllIIllIlIlIIIIIllII, lllllllllllllllIIllIlIlIIIIIllIl)) {
            return String.valueOf(lllllllllllllllIIllIlIlIIIIlIllI);
         }

         byte lllllllllllllllIIllIlIlIIIIIlIll = lllllllllllllllIIllIlIlIIIIIlllI[lllllllllllllllIIllIlIlIIIIIllII];
         lllllllllllllllIIllIlIlIIIIlIllI.append((char)(lllllllllllllllIIllIlIlIIIIIlIll ^ lllllllllllllllIIllIlIlIIIIlIIII[lllllllllllllllIIllIlIlIIIIlIlII % lllllllllllllllIIllIlIlIIIIlIIII.length]));
         "".length();
         ++lllllllllllllllIIllIlIlIIIIlIlII;
         ++lllllllllllllllIIllIlIlIIIIIllII;
         "".length();
      } while("   ".length() != 0);

      return null;
   }

   private static boolean lIllIIIllIIIII(int var0) {
      return var0 >= 0;
   }

   private static String lIllIIIlIlIlIl(String lllllllllllllllIIllIlIlIIIlIlIII, String lllllllllllllllIIllIlIlIIIlIIlll) {
      try {
         SecretKeySpec lllllllllllllllIIllIlIlIIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         float lllllllllllllllIIllIlIlIIIlIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlIlIIIlIIIll.init(lIIIlIlIlllIl[4], lllllllllllllllIIllIlIlIIIlIlIll);
         return new String(lllllllllllllllIIllIlIlIIIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIllIIIlIllIII() {
      lIIIlIlIllIll = new String[lIIIlIlIlllIl[39]];
      lIIIlIlIllIll[lIIIlIlIlllIl[2]] = lIllIIIlIlIIlI("Jfq0me4CYc9eLd1VqI63ILa0Upi+okUd", "xVwLD");
      lIIIlIlIllIll[lIIIlIlIlllIl[3]] = lIllIIIlIlIlII("ckZqe013QW9wQCMVOywcJBw0JRctBQ==", "BwXHy");
      lIIIlIlIllIll[lIIIlIlIlllIl[4]] = lIllIIIlIlIlIl("nLLdb+KNaUZuBS4ELpyUKApZv/11v70e", "ZshhW");
      lIIIlIlIllIll[lIIIlIlIlllIl[27]] = lIllIIIlIlIlIl("uWClKW5YlYs=", "luikK");
      lIIIlIlIllIll[lIIIlIlIlllIl[24]] = lIllIIIlIlIlII("", "AGSMf");
      lIIIlIlIllIll[lIIIlIlIlllIl[29]] = lIllIIIlIlIlIl("h+uvQXR+wVg=", "lcpwm");
      lIIIlIlIllIll[lIIIlIlIlllIl[30]] = lIllIIIlIlIlIl("ZHlOgTDvask=", "VrzMP");
      lIIIlIlIllIll[lIIIlIlIlllIl[31]] = lIllIIIlIlIIlI("zT6iFeO6X2A=", "tYJwb");
      lIIIlIlIllIll[lIIIlIlIlllIl[15]] = lIllIIIlIlIlII("UQ==", "qxtRv");
      lIIIlIlIllIll[lIIIlIlIlllIl[32]] = lIllIIIlIlIlII("w4k=", "nCZzh");
      lIIIlIlIllIll[lIIIlIlIlllIl[33]] = lIllIIIlIlIIlI("l3U6nf07y6E=", "yMyrL");
      lIIIlIlIllIll[lIIIlIlIlllIl[34]] = lIllIIIlIlIlIl("SUify0Az6y0=", "bGDhO");
      lIIIlIlIllIll[lIIIlIlIlllIl[35]] = lIllIIIlIlIlII("", "gfPux");
      lIIIlIlIllIll[lIIIlIlIlllIl[36]] = lIllIIIlIlIlIl("Wp4GU6eW15w=", "Rrowc");
   }

   private static boolean lIllIIIlIllIll(Object var0) {
      return var0 == null;
   }

   static {
      lIllIIIlIllIlI();
      lIllIIIlIllIII();
   }

   private static boolean lIllIIIlIlllII(int var0, int var1) {
      return var0 == var1;
   }

   public void setFractionalMetrics(boolean lllllllllllllllIIllIlIlIlIIllIll) {
      super.setFractionalMetrics(lllllllllllllllIIllIlIlIlIIllIll);
      lllllllllllllllIIllIlIlIlIIllIIl.setupBoldItalicIDs();
   }

   public CFontRenderer(Font lllllllllllllllIIllIlIlllIIlllIl, boolean lllllllllllllllIIllIlIlllIIlllII, boolean lllllllllllllllIIllIlIlllIIlIlll) {
      super(lllllllllllllllIIllIlIlllIIlllIl, lllllllllllllllIIllIlIlllIIlllII, lllllllllllllllIIllIlIlllIIlIlll);
      lllllllllllllllIIllIlIlllIIllllI.boldChars = new CFont.CharData[lIIIlIlIlllIl[0]];
      lllllllllllllllIIllIlIlllIIllllI.italicChars = new CFont.CharData[lIIIlIlIlllIl[0]];
      lllllllllllllllIIllIlIlllIIllllI.boldItalicChars = new CFont.CharData[lIIIlIlIlllIl[0]];
      lllllllllllllllIIllIlIlllIIllllI.colorCode = new int[lIIIlIlIlllIl[1]];
      lllllllllllllllIIllIlIlllIIllllI.colorcodeIdentifiers = lIIIlIlIllIll[lIIIlIlIlllIl[2]];
      lllllllllllllllIIllIlIlllIIllllI.setupMinecraftColorcodes();
      lllllllllllllllIIllIlIlllIIllllI.setupBoldItalicIDs();
   }

   private static int lIllIIIllIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void drawLine(double lllllllllllllllIIllIlIlIlIIIlIll, double lllllllllllllllIIllIlIlIlIIIlIlI, double lllllllllllllllIIllIlIlIlIIIIlII, double lllllllllllllllIIllIlIlIlIIIIIll, float lllllllllllllllIIllIlIlIlIIIIIlI) {
      GL11.glDisable(lIIIlIlIlllIl[16]);
      GL11.glLineWidth(lllllllllllllllIIllIlIlIlIIIIIlI);
      GL11.glBegin(lIIIlIlIlllIl[3]);
      GL11.glVertex2d(lllllllllllllllIIllIlIlIlIIIlIll, lllllllllllllllIIllIlIlIlIIIlIlI);
      GL11.glVertex2d(lllllllllllllllIIllIlIlIlIIIIlII, lllllllllllllllIIllIlIlIlIIIIIll);
      GL11.glEnd();
      GL11.glEnable(lIIIlIlIlllIl[16]);
   }

   public void setFont(Font lllllllllllllllIIllIlIlIlIlIlIII) {
      super.setFont(lllllllllllllllIIllIlIlIlIlIlIII);
      lllllllllllllllIIllIlIlIlIlIlIll.setupBoldItalicIDs();
   }

   public List<String> formatString(String lllllllllllllllIIllIlIlIIlIIlIIl, double lllllllllllllllIIllIlIlIIlIIlIII) {
      List lllllllllllllllIIllIlIlIIlIIlllI = new ArrayList();
      String lllllllllllllllIIllIlIlIIlIIllIl = lIIIlIlIllIll[lIIIlIlIlllIl[35]];
      char lllllllllllllllIIllIlIlIIlIIllII = lIIIlIlIlllIl[28];
      char[] lllllllllllllllIIllIlIlIIlIIlIll = lllllllllllllllIIllIlIlIIlIIlIIl.toCharArray();
      int lllllllllllllllIIllIlIlIIlIlIIlI = lIIIlIlIlllIl[2];

      do {
         if (!lIllIIIlIlllll(lllllllllllllllIIllIlIlIIlIlIIlI, lllllllllllllllIIllIlIlIIlIIlIll.length)) {
            if (lIllIIIllIIlII(lllllllllllllllIIllIlIlIIlIIllIl.length())) {
               lllllllllllllllIIllIlIlIIlIIlllI.add(lllllllllllllllIIllIlIlIIlIIllIl);
               "".length();
            }

            return lllllllllllllllIIllIlIlIIlIIlllI;
         }

         char lllllllllllllllIIllIlIlIIlIIIIlI = lllllllllllllllIIllIlIlIIlIIlIll[lllllllllllllllIIllIlIlIIlIlIIlI];
         if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIIlIIIIlI, lIIIlIlIlllIl[17]) && lIllIIIlIlllll(lllllllllllllllIIllIlIlIIlIlIIlI, lllllllllllllllIIllIlIlIIlIIlIll.length - lIIIlIlIlllIl[3])) {
            lllllllllllllllIIllIlIlIIlIIllII = lllllllllllllllIIllIlIlIIlIIlIll[lllllllllllllllIIllIlIlIIlIlIIlI + lIIIlIlIlllIl[3]];
         }

         if (lIllIIIllIIlIl(lIllIIIllIIllI((double)lllllllllllllllIIllIlIlIIlIlIIIl.getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIIllIlIlIIlIIllIl).append(lllllllllllllllIIllIlIlIIlIIIIlI))), lllllllllllllllIIllIlIlIIlIIlIII))) {
            lllllllllllllllIIllIlIlIIlIIllIl = String.valueOf((new StringBuilder()).append(lllllllllllllllIIllIlIlIIlIIllIl).append(lllllllllllllllIIllIlIlIIlIIIIlI));
            "".length();
            if ((" ".length() << (197 ^ 192) & ~(" ".length() << (30 ^ 27))) == " ".length() << " ".length()) {
               return null;
            }
         } else {
            lllllllllllllllIIllIlIlIIlIIlllI.add(lllllllllllllllIIllIlIlIIlIIllIl);
            "".length();
            lllllllllllllllIIllIlIlIIlIIllIl = String.valueOf((new StringBuilder()).append(lIIIlIlIllIll[lIIIlIlIlllIl[36]]).append((char)lllllllllllllllIIllIlIlIIlIIllII).append(lllllllllllllllIIllIlIlIIlIIIIlI));
         }

         ++lllllllllllllllIIllIlIlIIlIlIIlI;
         "".length();
      } while(null == null);

      return null;
   }

   public void setAntiAlias(boolean lllllllllllllllIIllIlIlIlIlIIIIl) {
      super.setAntiAlias(lllllllllllllllIIllIlIlIlIlIIIIl);
      lllllllllllllllIIllIlIlIlIlIIlIl.setupBoldItalicIDs();
   }

   private static boolean lIllIIIllIIlll(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean lIllIIIllIIlII(int var0) {
      return var0 > 0;
   }

   private static int lIllIIIllIIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private void setupMinecraftColorcodes() {
      int lllllllllllllllIIllIlIlIIIllIlll = lIIIlIlIlllIl[2];

      do {
         if (!lIllIIIlIlllll(lllllllllllllllIIllIlIlIIIllIlll, lIIIlIlIlllIl[1])) {
            return;
         }

         long lllllllllllllllIIllIlIlIIIllIIll = (lllllllllllllllIIllIlIlIIIllIlll >> lIIIlIlIlllIl[27] & lIIIlIlIlllIl[3]) * lIIIlIlIlllIl[37];
         int lllllllllllllllIIllIlIlIIIlllIlI = (lllllllllllllllIIllIlIlIIIllIlll >> lIIIlIlIlllIl[4] & lIIIlIlIlllIl[3]) * lIIIlIlIlllIl[38] + lllllllllllllllIIllIlIlIIIllIIll;
         int lllllllllllllllIIllIlIlIIIlllIIl = (lllllllllllllllIIllIlIlIIIllIlll >> lIIIlIlIlllIl[3] & lIIIlIlIlllIl[3]) * lIIIlIlIlllIl[38] + lllllllllllllllIIllIlIlIIIllIIll;
         int lllllllllllllllIIllIlIlIIIlllIII = (lllllllllllllllIIllIlIlIIIllIlll >> lIIIlIlIlllIl[2] & lIIIlIlIlllIl[3]) * lIIIlIlIlllIl[38] + lllllllllllllllIIllIlIlIIIllIIll;
         if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIIIllIlll, lIIIlIlIlllIl[30])) {
            lllllllllllllllIIllIlIlIIIlllIlI += 85;
         }

         if (lIllIIIllIIlll(lllllllllllllllIIllIlIlIIIllIlll, lIIIlIlIlllIl[14])) {
            lllllllllllllllIIllIlIlIIIlllIlI /= lIIIlIlIlllIl[24];
            lllllllllllllllIIllIlIlIIIlllIIl /= lIIIlIlIlllIl[24];
            lllllllllllllllIIllIlIlIIIlllIII /= lIIIlIlIlllIl[24];
         }

         lllllllllllllllIIllIlIlIIIllIlIl.colorCode[lllllllllllllllIIllIlIlIIIllIlll] = (lllllllllllllllIIllIlIlIIIlllIlI & lIIIlIlIlllIl[11]) << lIIIlIlIlllIl[14] | (lllllllllllllllIIllIlIlIIIlllIIl & lIIIlIlIlllIl[11]) << lIIIlIlIlllIl[15] | lllllllllllllllIIllIlIlIIIlllIII & lIIIlIlIlllIl[11];
         ++lllllllllllllllIIllIlIlIIIllIlll;
         "".length();
      } while(" ".length() != " ".length() << (" ".length() << " ".length()));

   }

   private static boolean lIllIIIlIllllI(int var0) {
      return var0 != 0;
   }

   private void setupBoldItalicIDs() {
      lllllllllllllllIIllIlIlIlIIlIIlI.texBold = lllllllllllllllIIllIlIlIlIIlIIlI.setupTexture(lllllllllllllllIIllIlIlIlIIlIIlI.font.deriveFont(lIIIlIlIlllIl[3]), lllllllllllllllIIllIlIlIlIIlIIlI.antiAlias, lllllllllllllllIIllIlIlIlIIlIIlI.fractionalMetrics, lllllllllllllllIIllIlIlIlIIlIIlI.boldChars);
      lllllllllllllllIIllIlIlIlIIlIIlI.texItalic = lllllllllllllllIIllIlIlIlIIlIIlI.setupTexture(lllllllllllllllIIllIlIlIlIIlIIlI.font.deriveFont(lIIIlIlIlllIl[4]), lllllllllllllllIIllIlIlIlIIlIIlI.antiAlias, lllllllllllllllIIllIlIlIlIIlIIlI.fractionalMetrics, lllllllllllllllIIllIlIlIlIIlIIlI.italicChars);
      lllllllllllllllIIllIlIlIlIIlIIlI.texItalicBold = lllllllllllllllIIllIlIlIlIIlIIlI.setupTexture(lllllllllllllllIIllIlIlIlIIlIIlI.font.deriveFont(lIIIlIlIlllIl[27]), lllllllllllllllIIllIlIlIlIIlIIlI.antiAlias, lllllllllllllllIIllIlIlIlIIlIIlI.fractionalMetrics, lllllllllllllllIIllIlIlIlIIlIIlI.boldItalicChars);
   }

   public float drawString(String lllllllllllllllIIllIlIllIllllllI, float lllllllllllllllIIllIlIllIlllllIl, float lllllllllllllllIIllIlIllIlllIlll, int lllllllllllllllIIllIlIllIllllIll) {
      return lllllllllllllllIIllIlIllIllllIlI.drawString(lllllllllllllllIIllIlIllIllllllI, (double)lllllllllllllllIIllIlIllIlllllIl, (double)lllllllllllllllIIllIlIllIlllIlll, lllllllllllllllIIllIlIllIllllIll, (boolean)lIIIlIlIlllIl[2]);
   }

   private static boolean lIllIIIllIIlIl(int var0) {
      return var0 < 0;
   }

   private static boolean lIllIIIlIlllIl(int var0) {
      return var0 == 0;
   }

   private static int lIllIIIllIIIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public float drawString(String lllllllllllllllIIllIlIllIIIllIlI, double lllllllllllllllIIllIlIllIIIllIII, double lllllllllllllllIIllIlIllIIIlIlll, int lllllllllllllllIIllIlIllIIIIlIII, boolean lllllllllllllllIIllIlIllIIIlIlIl) {
      --lllllllllllllllIIllIlIllIIIllIII;
      lllllllllllllllIIllIlIllIIIlIlll -= 2.0D;
      if (lIllIIIlIllIll(lllllllllllllllIIllIlIllIIIllIlI)) {
         return 0.0F;
      } else {
         if (lIllIIIlIlllII(lllllllllllllllIIllIlIllIIIIlIII, lIIIlIlIlllIl[5])) {
            lllllllllllllllIIllIlIllIIIIlIII = lIIIlIlIlllIl[6];
         }

         if (lIllIIIlIlllIl(lllllllllllllllIIllIlIllIIIIlIII & lIIIlIlIlllIl[7])) {
            lllllllllllllllIIllIlIllIIIIlIII |= lIIIlIlIlllIl[8];
         }

         if (lIllIIIlIllllI(lllllllllllllllIIllIlIllIIIlIlIl)) {
            lllllllllllllllIIllIlIllIIIIlIII = (lllllllllllllllIIllIlIllIIIIlIII & lIIIlIlIlllIl[9]) >> lIIIlIlIlllIl[4] | lllllllllllllllIIllIlIllIIIIlIII & lIIIlIlIlllIl[8];
         }

         short lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.charData;
         boolean lllllllllllllllIIllIlIllIIIIIlII = (float)(lllllllllllllllIIllIlIllIIIIlIII >> lIIIlIlIlllIl[10] & lIIIlIlIlllIl[11]) / 255.0F;
         String lllllllllllllllIIllIlIllIIIIIIll = lIIIlIlIlllIl[2];
         boolean lllllllllllllllIIllIlIllIIIlIIIl = lIIIlIlIlllIl[2];
         int lllllllllllllllIIllIlIlIllllllll = lIIIlIlIlllIl[2];
         boolean lllllllllllllllIIllIlIllIIIIllll = lIIIlIlIlllIl[2];
         String lllllllllllllllIIllIlIlIllllllII = lIIIlIlIlllIl[2];
         boolean lllllllllllllllIIllIlIllIIIIllIl = lIIIlIlIlllIl[3];
         lllllllllllllllIIllIlIllIIIllIII *= 2.0D;
         lllllllllllllllIIllIlIllIIIlIlll *= 2.0D;
         if (lIllIIIlIllllI(lllllllllllllllIIllIlIllIIIIllIl)) {
            GL11.glPushMatrix();
            GlStateManager.func_179139_a(0.5D, 0.5D, 0.5D);
            GlStateManager.func_179147_l();
            GlStateManager.func_179112_b(lIIIlIlIlllIl[12], lIIIlIlIlllIl[13]);
            GlStateManager.func_179131_c((float)(lllllllllllllllIIllIlIllIIIIlIII >> lIIIlIlIlllIl[14] & lIIIlIlIlllIl[11]) / 255.0F, (float)(lllllllllllllllIIllIlIllIIIIlIII >> lIIIlIlIlllIl[15] & lIIIlIlIlllIl[11]) / 255.0F, (float)(lllllllllllllllIIllIlIllIIIIlIII & lIIIlIlIlllIl[11]) / 255.0F, lllllllllllllllIIllIlIllIIIIIlII);
            int lllllllllllllllIIllIlIlIlllllIII = lllllllllllllllIIllIlIllIIIllIlI.length();
            GlStateManager.func_179098_w();
            GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.tex.func_110552_b());
            GL11.glBindTexture(lIIIlIlIlllIl[16], lllllllllllllllIIllIlIllIIIlllII.tex.func_110552_b());
            int lllllllllllllllIIllIlIllIIlIIIII = lIIIlIlIlllIl[2];

            while(lIllIIIlIlllll(lllllllllllllllIIllIlIllIIlIIIII, lllllllllllllllIIllIlIlIlllllIII)) {
               char lllllllllllllllIIllIlIllIIlIIIlI = lllllllllllllllIIllIlIllIIIllIlI.charAt(lllllllllllllllIIllIlIllIIlIIIII);
               if (lIllIIIlIlllII(lllllllllllllllIIllIlIllIIlIIIlI, lIIIlIlIlllIl[17]) && lIllIIIlIlllll(lllllllllllllllIIllIlIllIIlIIIII, lllllllllllllllIIllIlIlIlllllIII)) {
                  int lllllllllllllllIIllIlIlIllllIIlI = lIIIlIlIlllIl[18];

                  label109: {
                     try {
                        lllllllllllllllIIllIlIlIllllIIlI = lIIIlIlIllIll[lIIIlIlIlllIl[3]].indexOf(lllllllllllllllIIllIlIllIIIllIlI.charAt(lllllllllllllllIIllIlIllIIlIIIII + lIIIlIlIlllIl[3]));
                     } catch (Exception var21) {
                        break label109;
                     }

                     "".length();
                     if (-"   ".length() >= 0) {
                        return 0.0F;
                     }
                  }

                  if (lIllIIIlIlllll(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[14])) {
                     lllllllllllllllIIllIlIllIIIlIIIl = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIlIllllllll = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIllIIIIIIll = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIlIllllllII = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIllIIIIllll = lIIIlIlIlllIl[2];
                     GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.tex.func_110552_b());
                     lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.charData;
                     if (!lIllIIIllIIIII(lllllllllllllllIIllIlIlIllllIIlI) || lIllIIIllIIIIl(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[19])) {
                        lllllllllllllllIIllIlIlIllllIIlI = lIIIlIlIlllIl[19];
                     }

                     if (lIllIIIlIllllI(lllllllllllllllIIllIlIllIIIlIlIl)) {
                        lllllllllllllllIIllIlIlIllllIIlI += 16;
                     }

                     float lllllllllllllllIIllIlIlIllllIIII = lllllllllllllllIIllIlIllIIIlllII.colorCode[lllllllllllllllIIllIlIlIllllIIlI];
                     GlStateManager.func_179131_c((float)(lllllllllllllllIIllIlIlIllllIIII >> lIIIlIlIlllIl[14] & lIIIlIlIlllIl[11]) / 255.0F, (float)(lllllllllllllllIIllIlIlIllllIIII >> lIIIlIlIlllIl[15] & lIIIlIlIlllIl[11]) / 255.0F, (float)(lllllllllllllllIIllIlIlIllllIIII & lIIIlIlIlllIl[11]) / 255.0F, lllllllllllllllIIllIlIllIIIIIlII);
                     "".length();
                     if (" ".length() << " ".length() <= -" ".length()) {
                        return 0.0F;
                     }
                  } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[14])) {
                     lllllllllllllllIIllIlIllIIIIIIll = lIIIlIlIlllIl[3];
                     "".length();
                     if (-"  ".length() > 0) {
                        return 0.0F;
                     }
                  } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[20])) {
                     lllllllllllllllIIllIlIllIIIlIIIl = lIIIlIlIlllIl[3];
                     if (lIllIIIlIllllI(lllllllllllllllIIllIlIlIllllllll)) {
                        GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.texItalicBold.func_110552_b());
                        lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.boldItalicChars;
                        "".length();
                        if (((3 ^ 34) << " ".length() & ~((149 ^ 180) << " ".length())) < 0) {
                           return 0.0F;
                        }
                     } else {
                        GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.texBold.func_110552_b());
                        lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.boldChars;
                        "".length();
                        if (((109 ^ 106) << "   ".length() & ~((11 ^ 12) << "   ".length())) < 0) {
                           return 0.0F;
                        }
                     }
                  } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[21])) {
                     lllllllllllllllIIllIlIllIIIIllll = lIIIlIlIlllIl[3];
                     "".length();
                     if (-"  ".length() > 0) {
                        return 0.0F;
                     }
                  } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[22])) {
                     lllllllllllllllIIllIlIlIllllllII = lIIIlIlIlllIl[3];
                     "".length();
                     if (((14 + 136 - 43 + 42 ^ (45 ^ 104) << " ".length()) & ((104 ^ 69) << (" ".length() << " ".length()) ^ 145 + 22 - 72 + 76 ^ -" ".length())) != 0) {
                        return 0.0F;
                     }
                  } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[23])) {
                     lllllllllllllllIIllIlIlIllllllll = lIIIlIlIlllIl[3];
                     if (lIllIIIlIllllI(lllllllllllllllIIllIlIllIIIlIIIl)) {
                        GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.texItalicBold.func_110552_b());
                        lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.boldItalicChars;
                        "".length();
                        if (null != null) {
                           return 0.0F;
                        }
                     } else {
                        GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.texItalic.func_110552_b());
                        lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.italicChars;
                        "".length();
                        if (" ".length() < 0) {
                           return 0.0F;
                        }
                     }
                  } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllllIIlI, lIIIlIlIlllIl[18])) {
                     lllllllllllllllIIllIlIllIIIlIIIl = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIlIllllllll = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIllIIIIIIll = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIlIllllllII = lIIIlIlIlllIl[2];
                     lllllllllllllllIIllIlIllIIIIllll = lIIIlIlIlllIl[2];
                     GlStateManager.func_179131_c((float)(lllllllllllllllIIllIlIllIIIIlIII >> lIIIlIlIlllIl[14] & lIIIlIlIlllIl[11]) / 255.0F, (float)(lllllllllllllllIIllIlIllIIIIlIII >> lIIIlIlIlllIl[15] & lIIIlIlIlllIl[11]) / 255.0F, (float)(lllllllllllllllIIllIlIllIIIIlIII & lIIIlIlIlllIl[11]) / 255.0F, lllllllllllllllIIllIlIllIIIIIlII);
                     GlStateManager.func_179144_i(lllllllllllllllIIllIlIllIIIlllII.tex.func_110552_b());
                     lllllllllllllllIIllIlIllIIIIIllI = lllllllllllllllIIllIlIllIIIlllII.charData;
                  }

                  ++lllllllllllllllIIllIlIllIIlIIIII;
                  "".length();
                  if (" ".length() << " ".length() <= 0) {
                     return 0.0F;
                  }
               } else if (lIllIIIlIlllll(lllllllllllllllIIllIlIllIIlIIIlI, lllllllllllllllIIllIlIllIIIIIllI.length) && lIllIIIllIIIII(lllllllllllllllIIllIlIllIIlIIIlI)) {
                  GL11.glBegin(lIIIlIlIlllIl[24]);
                  lllllllllllllllIIllIlIllIIIlllII.drawChar(lllllllllllllllIIllIlIllIIIIIllI, lllllllllllllllIIllIlIllIIlIIIlI, (float)lllllllllllllllIIllIlIllIIIllIII, (float)lllllllllllllllIIllIlIllIIIlIlll);
                  GL11.glEnd();
                  if (lIllIIIlIllllI(lllllllllllllllIIllIlIllIIIIllll)) {
                     lllllllllllllllIIllIlIllIIIlllII.drawLine(lllllllllllllllIIllIlIllIIIllIII, lllllllllllllllIIllIlIllIIIlIlll + (double)(lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].height / lIIIlIlIlllIl[4]), lllllllllllllllIIllIlIllIIIllIII + (double)lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].width - 8.0D, lllllllllllllllIIllIlIllIIIlIlll + (double)(lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].height / lIIIlIlIlllIl[4]), 1.0F);
                  }

                  if (lIllIIIlIllllI(lllllllllllllllIIllIlIlIllllllII)) {
                     lllllllllllllllIIllIlIllIIIlllII.drawLine(lllllllllllllllIIllIlIllIIIllIII, lllllllllllllllIIllIlIllIIIlIlll + (double)lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].height - 2.0D, lllllllllllllllIIllIlIllIIIllIII + (double)lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].width - 8.0D, lllllllllllllllIIllIlIllIIIlIlll + (double)lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].height - 2.0D, 1.0F);
                  }

                  lllllllllllllllIIllIlIllIIIllIII += (double)(lllllllllllllllIIllIlIllIIIIIllI[lllllllllllllllIIllIlIllIIlIIIlI].width - lIIIlIlIlllIl[15] + lllllllllllllllIIllIlIllIIIlllII.charOffset);
               }

               ++lllllllllllllllIIllIlIllIIlIIIII;
               "".length();
               if (null != null) {
                  return 0.0F;
               }
            }

            GL11.glHint(lIIIlIlIlllIl[25], lIIIlIlIlllIl[26]);
            GL11.glPopMatrix();
         }

         return (float)lllllllllllllllIIllIlIllIIIllIII / 2.0F;
      }
   }

   public float drawCenteredString(String lllllllllllllllIIllIlIllIllIIIII, float lllllllllllllllIIllIlIllIlIlllll, float lllllllllllllllIIllIlIllIlIllIIl, int lllllllllllllllIIllIlIllIlIllIII) {
      return lllllllllllllllIIllIlIllIllIIIIl.drawString(lllllllllllllllIIllIlIllIllIIIII, lllllllllllllllIIllIlIllIlIlllll - (float)(lllllllllllllllIIllIlIllIllIIIIl.getStringWidth(lllllllllllllllIIllIlIllIllIIIII) / lIIIlIlIlllIl[4]), lllllllllllllllIIllIlIllIlIllIIl, lllllllllllllllIIllIlIllIlIllIII);
   }

   private static void lIllIIIlIllIlI() {
      lIIIlIlIlllIl = new int[40];
      lIIIlIlIlllIl[0] = " ".length() << (" ".length() << "   ".length());
      lIIIlIlIlllIl[1] = " ".length() << (86 ^ 55 ^ (87 ^ 78) << (" ".length() << " ".length()));
      lIIIlIlIlllIl[2] = (65 ^ 32 ^ (170 ^ 153) << " ".length()) & ((111 ^ 126) << (" ".length() << " ".length()) ^ 91 ^ 24 ^ -" ".length());
      lIIIlIlIlllIl[3] = " ".length();
      lIIIlIlIlllIl[4] = " ".length() << " ".length();
      lIIIlIlIlllIl[5] = (1344916 + 2681576 - -2307356 + 12089531 << "   ".length()) + (18225849 + 62797107 - 68585823 + 87939510 << (" ".length() << " ".length())) - (184969673 + 84707400 - 118184083 + 35670833 << " ".length()) + 293540794 + 102356159 - 203537940 + 186723156;
      lIIIlIlIlllIl[6] = (154477 + 424270 - 261689 + 231007 << (" ".length() << " ".length())) + 6946469 + 6004320 - 2520397 + 2133155 - (81365 + 143272 - 'ꦣ' + 18971) + 1921523 + 1082989 - 2333513 + 1550590;
      lIIIlIlIlllIl[7] = -(422686 + '윒' - -1813280 + 18081387 + 331946 + 157661 - 452341 + 501223 - -(42694371 + 43103865 - 68446305 + 27855194) + 612694 + 730092 - 427074 + 79223);
      lIIIlIlIlllIl[8] = -((9199 + 14205 - 6974 + 3659 << (7 ^ 2)) + 9474369 + 1802721 - 1688722 + 3709725 - (9098484 + 2096861 - 6127387 + 6664407) + (183772 + 109352 - 170808 + 105319 << ("   ".length() << " ".length())));
      lIIIlIlIlllIl[9] = 915711 + 3210401 - 1930888 + 1333991 + 838578 + 1874872 - 419343 + 792116 - (2394436 + 4531116 - 4596784 + 2669345) + (914346 + 1043603 - 1682308 + 988176 << " ".length()) << (" ".length() << " ".length());
      lIIIlIlIlllIl[10] = "   ".length() << "   ".length();
      lIIIlIlIlllIl[11] = 49 + 131 - 116 + 191;
      lIIIlIlIlllIl[12] = ("   ".length() << "   ".length()) + (170 + 30 - 167 + 158 << " ".length()) - ((46 ^ 55) << (" ".length() << " ".length())) + (218 ^ 149) << " ".length();
      lIIIlIlIlllIl[13] = 745 + 330 - 925 + 621;
      lIIIlIlIlllIl[14] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIlIlllIl[15] = " ".length() << "   ".length();
      lIIIlIlIlllIl[16] = ((29 ^ 74) << (" ".length() << " ".length())) + 2020 + 2425 - 4444 + 2722 - (62 + 148 - 190 + 337 << "   ".length()) + (1589 + 337 - 581 + 324 << " ".length());
      lIIIlIlIlllIl[17] = 53 + 105 - 88 + 97;
      lIIIlIlIlllIl[18] = 17 ^ 4;
      lIIIlIlIlllIl[19] = (209 ^ 136) << " ".length() ^ 86 + 42 - -50 + 11;
      lIIIlIlIlllIl[20] = (42 ^ 5) << (" ".length() << " ".length()) ^ 93 + 82 - 33 + 31;
      lIIIlIlIlllIl[21] = (70 ^ 79) << " ".length();
      lIIIlIlIlllIl[22] = (81 ^ 86) << (" ".length() << (" ".length() << " ".length())) ^ 65 ^ 34;
      lIIIlIlIlllIl[23] = (239 ^ 160 ^ (22 ^ 51) << " ".length()) << (" ".length() << " ".length());
      lIIIlIlIlllIl[24] = " ".length() << (" ".length() << " ".length());
      lIIIlIlIlllIl[25] = 261 + 2502 - 605 + 997;
      lIIIlIlIlllIl[26] = (104 ^ 77 ^ (112 ^ 125) << (" ".length() << " ".length())) << (" ".length() << "   ".length());
      lIIIlIlIlllIl[27] = "   ".length();
      lIIIlIlIlllIl[28] = 13709 + 7789 - 3371 + 10112 + 18448 + 18263 - 25485 + 24745 - (6329 + 19501 - 18333 + 19334 << " ".length()) + 3168 + '顛' - '聑' + '뉡';
      lIIIlIlIlllIl[29] = (229 ^ 134) << " ".length() ^ 4 + 193 - 171 + 169;
      lIIIlIlIlllIl[30] = "   ".length() << " ".length();
      lIIIlIlIlllIl[31] = 199 ^ 192;
      lIIIlIlIlllIl[32] = 99 ^ 122 ^ " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIlIlllIl[33] = (146 ^ 143 ^ "   ".length() << "   ".length()) << " ".length();
      lIIIlIlIlllIl[34] = (165 ^ 136) << (" ".length() << " ".length()) ^ 162 + 102 - 173 + 100;
      lIIIlIlIlllIl[35] = "   ".length() << (" ".length() << " ".length());
      lIIIlIlIlllIl[36] = 201 ^ 196;
      lIIIlIlIlllIl[37] = 101 ^ 0 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIlIlllIl[38] = (75 ^ 30) << " ".length();
      lIIIlIlIlllIl[39] = (182 ^ 177) << " ".length();
   }

   public float drawCenteredStringWithShadow(String lllllllllllllllIIllIlIllIllIlIlI, float lllllllllllllllIIllIlIllIllIlIIl, float lllllllllllllllIIllIlIllIllIllIl, int lllllllllllllllIIllIlIllIllIIlll) {
      return lllllllllllllllIIllIlIllIlllIIII.drawStringWithShadow(lllllllllllllllIIllIlIllIllIlIlI, (double)(lllllllllllllllIIllIlIllIllIlIIl - (float)(lllllllllllllllIIllIlIllIlllIIII.getStringWidth(lllllllllllllllIIllIlIllIllIlIlI) / lIIIlIlIlllIl[4])), (double)lllllllllllllllIIllIlIllIllIllIl, lllllllllllllllIIllIlIllIllIIlll);
   }

   public float drawStringWithShadow(String lllllllllllllllIIllIlIlllIIIllll, double lllllllllllllllIIllIlIlllIIIlllI, double lllllllllllllllIIllIlIlllIIIllIl, int lllllllllllllllIIllIlIlllIIIIllI) {
      int lllllllllllllllIIllIlIlllIIIIlIl = lllllllllllllllIIllIlIlllIIlIIII.drawString(lllllllllllllllIIllIlIlllIIIllll, lllllllllllllllIIllIlIlllIIIlllI + 1.0D, lllllllllllllllIIllIlIlllIIIllIl + 1.0D, lllllllllllllllIIllIlIlllIIIIllI, (boolean)lIIIlIlIlllIl[3]);
      return Math.max(lllllllllllllllIIllIlIlllIIIIlIl, lllllllllllllllIIllIlIlllIIlIIII.drawString(lllllllllllllllIIllIlIlllIIIllll, lllllllllllllllIIllIlIlllIIIlllI, lllllllllllllllIIllIlIlllIIIllIl, lllllllllllllllIIllIlIlllIIIIllI, (boolean)lIIIlIlIlllIl[2]));
   }

   public int getStringWidth(String lllllllllllllllIIllIlIlIlIlllllI) {
      if (lIllIIIlIllIll(lllllllllllllllIIllIlIlIlIlllllI)) {
         return lIIIlIlIlllIl[2];
      } else {
         int lllllllllllllllIIllIlIlIllIIlIlI = lIIIlIlIlllIl[2];
         boolean lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIIII.charData;
         boolean lllllllllllllllIIllIlIlIllIIIllI = lIIIlIlIlllIl[2];
         boolean lllllllllllllllIIllIlIlIllIIIlII = lIIIlIlIlllIl[2];
         int lllllllllllllllIIllIlIlIllIIIIlI = lllllllllllllllIIllIlIlIlIlllllI.length();
         int lllllllllllllllIIllIlIlIlIllIIll = lIIIlIlIlllIl[2];

         do {
            if (!lIllIIIlIlllll(lllllllllllllllIIllIlIlIlIllIIll, lllllllllllllllIIllIlIlIllIIIIlI)) {
               return lllllllllllllllIIllIlIlIllIIlIlI / lIIIlIlIlllIl[4];
            }

            char lllllllllllllllIIllIlIlIllIlIIIl = lllllllllllllllIIllIlIlIlIlllllI.charAt(lllllllllllllllIIllIlIlIlIllIIll);
            if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIllIlIIIl, lIIIlIlIlllIl[17]) && lIllIIIlIlllll(lllllllllllllllIIllIlIlIlIllIIll, lllllllllllllllIIllIlIlIllIIIIlI)) {
               int lllllllllllllllIIllIlIlIlIllIIIl = lIIIlIlIllIll[lIIIlIlIlllIl[4]].indexOf(lllllllllllllllIIllIlIlIllIlIIIl);
               if (lIllIIIlIlllll(lllllllllllllllIIllIlIlIlIllIIIl, lIIIlIlIlllIl[14])) {
                  lllllllllllllllIIllIlIlIllIIIllI = lIIIlIlIlllIl[2];
                  lllllllllllllllIIllIlIlIllIIIlII = lIIIlIlIlllIl[2];
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return (247 ^ 178) & ~(106 ^ 47);
                  }
               } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIlIllIIIl, lIIIlIlIlllIl[20])) {
                  lllllllllllllllIIllIlIlIllIIIllI = lIIIlIlIlllIl[3];
                  if (lIllIIIlIllllI(lllllllllllllllIIllIlIlIllIIIlII)) {
                     lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIIII.boldItalicChars;
                     "".length();
                     if (((17 ^ 52) << " ".length() & ~((42 ^ 15) << " ".length())) != 0) {
                        return (110 ^ 117) << " ".length() & ~((173 ^ 182) << " ".length());
                     }
                  } else {
                     lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIIII.boldChars;
                     "".length();
                     if ("   ".length() != "   ".length()) {
                        return (78 ^ 21) & ~(93 ^ 6) & ~((233 ^ 138) & ~(246 ^ 149));
                     }
                  }
               } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIlIllIIIl, lIIIlIlIlllIl[23])) {
                  lllllllllllllllIIllIlIlIllIIIlII = lIIIlIlIlllIl[3];
                  if (lIllIIIlIllllI(lllllllllllllllIIllIlIlIllIIIllI)) {
                     lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIIII.boldItalicChars;
                     "".length();
                     if (((215 ^ 192) << (" ".length() << " ".length()) & ~((213 ^ 194) << (" ".length() << " ".length()))) < 0) {
                        return (14 ^ 19) & ~(2 ^ 31);
                     }
                  } else {
                     lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIIII.italicChars;
                     "".length();
                     if (-"   ".length() > 0) {
                        return (35 ^ 36) << "   ".length() & ~((125 ^ 122) << "   ".length());
                     }
                  }
               } else if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIlIllIIIl, lIIIlIlIlllIl[18])) {
                  lllllllllllllllIIllIlIlIllIIIllI = lIIIlIlIlllIl[2];
                  lllllllllllllllIIllIlIlIllIIIlII = lIIIlIlIlllIl[2];
                  lllllllllllllllIIllIlIlIlIlllIlI = lllllllllllllllIIllIlIlIllIIIIII.charData;
               }

               ++lllllllllllllllIIllIlIlIlIllIIll;
               "".length();
               if (-"  ".length() > 0) {
                  return (53 ^ 18) << " ".length() & ~((46 ^ 9) << " ".length());
               }
            } else if (lIllIIIlIlllll(lllllllllllllllIIllIlIlIllIlIIIl, lllllllllllllllIIllIlIlIlIlllIlI.length) && lIllIIIllIIIII(lllllllllllllllIIllIlIlIllIlIIIl)) {
               lllllllllllllllIIllIlIlIllIIlIlI += lllllllllllllllIIllIlIlIlIlllIlI[lllllllllllllllIIllIlIlIllIlIIIl].width - lIIIlIlIlllIl[15] + lllllllllllllllIIllIlIlIllIIIIII.charOffset;
            }

            ++lllllllllllllllIIllIlIlIlIllIIll;
            "".length();
         } while("   ".length() != 0);

         return (93 ^ 84) << " ".length() & ~((169 ^ 160) << " ".length());
      }
   }

   private static String lIllIIIlIlIIlI(String lllllllllllllllIIllIlIlIIIIIIIll, String lllllllllllllllIIllIlIlIIIIIIIlI) {
      try {
         SecretKeySpec lllllllllllllllIIllIlIlIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIIlIlIlllIl[15]), "DES");
         Cipher lllllllllllllllIIllIlIlIIIIIIlIl = Cipher.getInstance("DES");
         lllllllllllllllIIllIlIlIIIIIIlIl.init(lIIIlIlIlllIl[4], lllllllllllllllIIllIlIlIIIIIIllI);
         return new String(lllllllllllllllIIllIlIlIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIlIlllll(int var0, int var1) {
      return var0 < var1;
   }

   public List<String> wrapWords(String lllllllllllllllIIllIlIlIIllIllII, double lllllllllllllllIIllIlIlIIllIlIll) {
      char lllllllllllllllIIllIlIlIIllIIllI = new ArrayList();
      if (lIllIIIllIIlII(lIllIIIllIIIlI((double)lllllllllllllllIIllIlIlIIllIlIIl.getStringWidth(lllllllllllllllIIllIlIlIIllIllII), lllllllllllllllIIllIlIlIIllIlIll))) {
         int lllllllllllllllIIllIlIlIIllIIlIl = lllllllllllllllIIllIlIlIIllIllII.split(lIIIlIlIllIll[lIIIlIlIlllIl[27]]);
         String lllllllllllllllIIllIlIlIIllIllll = lIIIlIlIllIll[lIIIlIlIlllIl[24]];
         char lllllllllllllllIIllIlIlIIllIlllI = lIIIlIlIlllIl[28];
         short lllllllllllllllIIllIlIlIIllIIIlI = lllllllllllllllIIllIlIlIIllIIlIl;
         float lllllllllllllllIIllIlIlIIllIIIIl = lllllllllllllllIIllIlIlIIllIIlIl.length;
         int lllllllllllllllIIllIlIlIIllIIIII = lIIIlIlIlllIl[2];

         while(lIllIIIlIlllll(lllllllllllllllIIllIlIlIIllIIIII, lllllllllllllllIIllIlIlIIllIIIIl)) {
            char lllllllllllllllIIllIlIlIIlIlllll = lllllllllllllllIIllIlIlIIllIIIlI[lllllllllllllllIIllIlIlIIllIIIII];
            int lllllllllllllllIIllIlIlIIlIllllI = lIIIlIlIlllIl[2];

            while(lIllIIIlIlllll(lllllllllllllllIIllIlIlIIlIllllI, lllllllllllllllIIllIlIlIIlIlllll.toCharArray().length)) {
               short lllllllllllllllIIllIlIlIIlIlllIl = lllllllllllllllIIllIlIlIIlIlllll.toCharArray()[lllllllllllllllIIllIlIlIIlIllllI];
               if (lIllIIIlIlllII(lllllllllllllllIIllIlIlIIlIlllIl, lIIIlIlIlllIl[17]) && lIllIIIlIlllll(lllllllllllllllIIllIlIlIIlIllllI, lllllllllllllllIIllIlIlIIlIlllll.toCharArray().length - lIIIlIlIlllIl[3])) {
                  lllllllllllllllIIllIlIlIIllIlllI = lllllllllllllllIIllIlIlIIlIlllll.toCharArray()[lllllllllllllllIIllIlIlIIlIllllI + lIIIlIlIlllIl[3]];
               }

               ++lllllllllllllllIIllIlIlIIlIllllI;
               "".length();
               if (((118 ^ 121 ^ (178 ^ 155) << " ".length()) & (69 ^ 122 ^ (246 ^ 199) << " ".length() ^ -" ".length())) > 0) {
                  return null;
               }
            }

            if (lIllIIIllIIlIl(lIllIIIllIIIll((double)lllllllllllllllIIllIlIlIIllIlIIl.getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIIllIlIlIIllIllll).append(lllllllllllllllIIllIlIlIIlIlllll).append(lIIIlIlIllIll[lIIIlIlIlllIl[29]]))), lllllllllllllllIIllIlIlIIllIlIll))) {
               lllllllllllllllIIllIlIlIIllIllll = String.valueOf((new StringBuilder()).append(lllllllllllllllIIllIlIlIIllIllll).append(lllllllllllllllIIllIlIlIIlIlllll).append(lIIIlIlIllIll[lIIIlIlIlllIl[30]]));
               "".length();
               if (" ".length() << (" ".length() << " ".length()) < ((232 ^ 175 ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) & (2 ^ 5 ^ (27 ^ 30) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()))) {
                  return null;
               }
            } else {
               lllllllllllllllIIllIlIlIIllIIllI.add(lllllllllllllllIIllIlIlIIllIllll);
               "".length();
               lllllllllllllllIIllIlIlIIllIllll = String.valueOf((new StringBuilder()).append(lIIIlIlIllIll[lIIIlIlIlllIl[31]]).append((char)lllllllllllllllIIllIlIlIIllIlllI).append(lllllllllllllllIIllIlIlIIlIlllll).append(lIIIlIlIllIll[lIIIlIlIlllIl[15]]));
            }

            ++lllllllllllllllIIllIlIlIIllIIIII;
            "".length();
            if (-"   ".length() >= 0) {
               return null;
            }
         }

         if (lIllIIIllIIlII(lllllllllllllllIIllIlIlIIllIllll.length())) {
            if (lIllIIIllIIlIl(lIllIIIllIIIll((double)lllllllllllllllIIllIlIlIIllIlIIl.getStringWidth(lllllllllllllllIIllIlIlIIllIllll), lllllllllllllllIIllIlIlIIllIlIll))) {
               lllllllllllllllIIllIlIlIIllIIllI.add(String.valueOf((new StringBuilder()).append(lIIIlIlIllIll[lIIIlIlIlllIl[32]]).append((char)lllllllllllllllIIllIlIlIIllIlllI).append(lllllllllllllllIIllIlIlIIllIllll).append(lIIIlIlIllIll[lIIIlIlIlllIl[33]])));
               "".length();
               lllllllllllllllIIllIlIlIIllIllll = lIIIlIlIllIll[lIIIlIlIlllIl[34]];
               "".length();
               if (-" ".length() >= 0) {
                  return null;
               }
            } else {
               Iterator lllllllllllllllIIllIlIlIIllIIIlI = lllllllllllllllIIllIlIlIIllIlIIl.formatString(lllllllllllllllIIllIlIlIIllIllll, lllllllllllllllIIllIlIlIIllIlIll).iterator();

               while(lIllIIIlIllllI(lllllllllllllllIIllIlIlIIllIIIlI.hasNext())) {
                  float lllllllllllllllIIllIlIlIIllIIIIl = (String)lllllllllllllllIIllIlIlIIllIIIlI.next();
                  lllllllllllllllIIllIlIlIIllIIllI.add(lllllllllllllllIIllIlIlIIllIIIIl);
                  "".length();
                  "".length();
                  if (" ".length() << " ".length() < -" ".length()) {
                     return null;
                  }
               }
            }
         }

         "".length();
         if (" ".length() < 0) {
            return null;
         }
      } else {
         lllllllllllllllIIllIlIlIIllIIllI.add(lllllllllllllllIIllIlIlIIllIllII);
         "".length();
      }

      return lllllllllllllllIIllIlIlIIllIIllI;
   }
}
