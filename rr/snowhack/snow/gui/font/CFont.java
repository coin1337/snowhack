package rr.snowhack.snow.gui.font;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.image.BufferedImage;
import net.minecraft.client.renderer.texture.DynamicTexture;
import org.lwjgl.opengl.GL11;

public class CFont {
   // $FF: synthetic field
   protected DynamicTexture tex;
   // $FF: synthetic field
   private static final int[] llllIlIIlllI;
   // $FF: synthetic field
   protected CFont.CharData[] charData;
   // $FF: synthetic field
   protected int fontHeight;
   // $FF: synthetic field
   protected Font font;
   // $FF: synthetic field
   protected int charOffset;
   // $FF: synthetic field
   private float imgSize = 512.0F;
   // $FF: synthetic field
   protected boolean fractionalMetrics;
   // $FF: synthetic field
   protected boolean antiAlias;

   public int getStringHeight(String lllllllllllllllIlIlIIlllllllIlIl) {
      return lllllllllllllllIlIlIIlllllllIllI.getHeight();
   }

   public void setFont(Font lllllllllllllllIlIlIIlllllIIIlII) {
      lllllllllllllllIlIlIIlllllIIIlIl.font = lllllllllllllllIlIlIIlllllIIIlII;
      lllllllllllllllIlIlIIlllllIIIlIl.tex = lllllllllllllllIlIlIIlllllIIIlIl.setupTexture(lllllllllllllllIlIlIIlllllIIIlII, lllllllllllllllIlIlIIlllllIIIlIl.antiAlias, lllllllllllllllIlIlIIlllllIIIlIl.fractionalMetrics, lllllllllllllllIlIlIIlllllIIIlIl.charData);
   }

   private static boolean lIlIIIIIIIIIII(int var0) {
      return var0 != 0;
   }

   static {
      lIIlllllllllll();
   }

   public boolean isAntiAlias() {
      return lllllllllllllllIlIlIIlllllIlllII.antiAlias;
   }

   private static boolean lIlIIIIIIIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIIlllllllllll() {
      llllIlIIlllI = new int[8];
      llllIlIIlllI[0] = " ".length() << (" ".length() << "   ".length());
      llllIlIIlllI[1] = -" ".length();
      llllIlIIlllI[2] = ((137 ^ 132) << " ".length() & ~((26 ^ 23) << " ".length()) ^ 80 ^ 97) & ((139 ^ 174) << " ".length() ^ 252 ^ 135 ^ -" ".length());
      llllIlIIlllI[3] = " ".length() << " ".length();
      llllIlIIlllI[4] = ((9 ^ 4) << (" ".length() << " ".length())) + (16 ^ 89) - (4 ^ 31) + 153 + 96 - 179 + 87;
      llllIlIIlllI[5] = " ".length();
      llllIlIIlllI[6] = " ".length() << "   ".length();
      llllIlIIlllI[7] = (26 ^ 67) << (92 ^ 89);
   }

   protected BufferedImage generateFontImage(Font lllllllllllllllIlIlIlIIIIIllllll, boolean lllllllllllllllIlIlIlIIIIIlllllI, boolean lllllllllllllllIlIlIlIIIIIllllIl, CFont.CharData[] lllllllllllllllIlIlIlIIIIlIIlIII) {
      long lllllllllllllllIlIlIlIIIIIlllIll = (int)lllllllllllllllIlIlIlIIIIlIIllII.imgSize;
      BufferedImage lllllllllllllllIlIlIlIIIIlIIIllI = new BufferedImage(lllllllllllllllIlIlIlIIIIIlllIll, lllllllllllllllIlIlIlIIIIIlllIll, llllIlIIlllI[3]);
      byte lllllllllllllllIlIlIlIIIIIlllIIl = (Graphics2D)lllllllllllllllIlIlIlIIIIlIIIllI.getGraphics();
      lllllllllllllllIlIlIlIIIIIlllIIl.setFont(lllllllllllllllIlIlIlIIIIIllllll);
      lllllllllllllllIlIlIlIIIIIlllIIl.setColor(new Color(llllIlIIlllI[4], llllIlIIlllI[4], llllIlIIlllI[4], llllIlIIlllI[2]));
      lllllllllllllllIlIlIlIIIIIlllIIl.fillRect(llllIlIIlllI[2], llllIlIIlllI[2], lllllllllllllllIlIlIlIIIIIlllIll, lllllllllllllllIlIlIlIIIIIlllIll);
      lllllllllllllllIlIlIlIIIIIlllIIl.setColor(Color.WHITE);
      Key var10001 = RenderingHints.KEY_FRACTIONALMETRICS;
      Object var10002;
      if (lIlIIIIIIIIIII(lllllllllllllllIlIlIlIIIIIllllIl)) {
         var10002 = RenderingHints.VALUE_FRACTIONALMETRICS_ON;
         "".length();
         if (" ".length() << " ".length() < ((117 ^ 122) & ~(147 ^ 156))) {
            return null;
         }
      } else {
         var10002 = RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
      }

      lllllllllllllllIlIlIlIIIIIlllIIl.setRenderingHint(var10001, var10002);
      var10001 = RenderingHints.KEY_TEXT_ANTIALIASING;
      if (lIlIIIIIIIIIII(lllllllllllllllIlIlIlIIIIIlllllI)) {
         var10002 = RenderingHints.VALUE_TEXT_ANTIALIAS_ON;
         "".length();
         if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
            return null;
         }
      } else {
         var10002 = RenderingHints.VALUE_TEXT_ANTIALIAS_OFF;
      }

      lllllllllllllllIlIlIlIIIIIlllIIl.setRenderingHint(var10001, var10002);
      var10001 = RenderingHints.KEY_ANTIALIASING;
      if (lIlIIIIIIIIIII(lllllllllllllllIlIlIlIIIIIlllllI)) {
         var10002 = RenderingHints.VALUE_ANTIALIAS_ON;
         "".length();
         if (-" ".length() >= 0) {
            return null;
         }
      } else {
         var10002 = RenderingHints.VALUE_ANTIALIAS_OFF;
      }

      lllllllllllllllIlIlIlIIIIIlllIIl.setRenderingHint(var10001, var10002);
      FontMetrics lllllllllllllllIlIlIlIIIIlIIIlII = lllllllllllllllIlIlIlIIIIIlllIIl.getFontMetrics();
      int lllllllllllllllIlIlIlIIIIlIIIIll = llllIlIIlllI[2];
      boolean lllllllllllllllIlIlIlIIIIIllIllI = llllIlIIlllI[2];
      long lllllllllllllllIlIlIlIIIIIllIlIl = llllIlIIlllI[5];
      int lllllllllllllllIlIlIlIIIIlIIllIl = llllIlIIlllI[2];

      do {
         if (!lIlIIIIIIIIIIl(lllllllllllllllIlIlIlIIIIlIIllIl, lllllllllllllllIlIlIlIIIIlIIlIII.length)) {
            return lllllllllllllllIlIlIlIIIIlIIIllI;
         }

         float lllllllllllllllIlIlIlIIIIIllIIll = (char)lllllllllllllllIlIlIlIIIIlIIllIl;
         char lllllllllllllllIlIlIlIIIIIllIIlI = new CFont.CharData();
         Exception lllllllllllllllIlIlIlIIIIIllIIIl = lllllllllllllllIlIlIlIIIIlIIIlII.getStringBounds(String.valueOf(lllllllllllllllIlIlIlIIIIIllIIll), lllllllllllllllIlIlIlIIIIIlllIIl);
         lllllllllllllllIlIlIlIIIIIllIIlI.width = lllllllllllllllIlIlIlIIIIIllIIIl.getBounds().width + llllIlIIlllI[6];
         lllllllllllllllIlIlIlIIIIIllIIlI.height = lllllllllllllllIlIlIlIIIIIllIIIl.getBounds().height;
         if (lIlIIIIIIIIIlI(lllllllllllllllIlIlIlIIIIIllIllI + lllllllllllllllIlIlIlIIIIIllIIlI.width, lllllllllllllllIlIlIlIIIIIlllIll)) {
            lllllllllllllllIlIlIlIIIIIllIllI = llllIlIIlllI[2];
            lllllllllllllllIlIlIlIIIIIllIlIl += lllllllllllllllIlIlIlIIIIlIIIIll;
            lllllllllllllllIlIlIlIIIIlIIIIll = llllIlIIlllI[2];
         }

         if (lIlIIIIIIIIIll(lllllllllllllllIlIlIlIIIIIllIIlI.height, lllllllllllllllIlIlIlIIIIlIIIIll)) {
            lllllllllllllllIlIlIlIIIIlIIIIll = lllllllllllllllIlIlIlIIIIIllIIlI.height;
         }

         lllllllllllllllIlIlIlIIIIIllIIlI.storedX = lllllllllllllllIlIlIlIIIIIllIllI;
         lllllllllllllllIlIlIlIIIIIllIIlI.storedY = lllllllllllllllIlIlIlIIIIIllIlIl;
         if (lIlIIIIIIIIIll(lllllllllllllllIlIlIlIIIIIllIIlI.height, lllllllllllllllIlIlIlIIIIlIIllII.fontHeight)) {
            lllllllllllllllIlIlIlIIIIlIIllII.fontHeight = lllllllllllllllIlIlIlIIIIIllIIlI.height;
         }

         lllllllllllllllIlIlIlIIIIlIIlIII[lllllllllllllllIlIlIlIIIIlIIllIl] = lllllllllllllllIlIlIlIIIIIllIIlI;
         lllllllllllllllIlIlIlIIIIIlllIIl.drawString(String.valueOf(lllllllllllllllIlIlIlIIIIIllIIll), lllllllllllllllIlIlIlIIIIIllIllI + llllIlIIlllI[3], lllllllllllllllIlIlIlIIIIIllIlIl + lllllllllllllllIlIlIlIIIIlIIIlII.getAscent());
         lllllllllllllllIlIlIlIIIIIllIllI += lllllllllllllllIlIlIlIIIIIllIIlI.width;
         ++lllllllllllllllIlIlIlIIIIlIIllIl;
         "".length();
      } while(" ".length() << " ".length() >= 0);

      return null;
   }

   protected DynamicTexture setupTexture(Font lllllllllllllllIlIlIlIIIIllIllII, boolean lllllllllllllllIlIlIlIIIIllIIlIl, boolean lllllllllllllllIlIlIlIIIIllIIlII, CFont.CharData[] lllllllllllllllIlIlIlIIIIllIIIll) {
      BufferedImage lllllllllllllllIlIlIlIIIIllIIIlI = lllllllllllllllIlIlIlIIIIllIllIl.generateFontImage(lllllllllllllllIlIlIlIIIIllIllII, lllllllllllllllIlIlIlIIIIllIIlIl, lllllllllllllllIlIlIlIIIIllIIlII, lllllllllllllllIlIlIlIIIIllIIIll);

      try {
         return new DynamicTexture(lllllllllllllllIlIlIlIIIIllIIIlI);
      } catch (Exception var7) {
         var7.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIIIIIIlIl(int var0, int var1) {
      return var0 != var1;
   }

   public CFont(Font lllllllllllllllIlIlIlIIIIlllllII, boolean lllllllllllllllIlIlIlIIIIllllIll, boolean lllllllllllllllIlIlIlIIIIlllIllI) {
      lllllllllllllllIlIlIlIIIIlllllIl.charData = new CFont.CharData[llllIlIIlllI[0]];
      lllllllllllllllIlIlIlIIIIlllllIl.fontHeight = llllIlIIlllI[1];
      lllllllllllllllIlIlIlIIIIlllllIl.charOffset = llllIlIIlllI[2];
      lllllllllllllllIlIlIlIIIIlllllIl.font = lllllllllllllllIlIlIlIIIIlllllII;
      lllllllllllllllIlIlIlIIIIlllllIl.antiAlias = lllllllllllllllIlIlIlIIIIllllIll;
      lllllllllllllllIlIlIlIIIIlllllIl.fractionalMetrics = lllllllllllllllIlIlIlIIIIlllIllI;
      lllllllllllllllIlIlIlIIIIlllllIl.tex = lllllllllllllllIlIlIlIIIIlllllIl.setupTexture(lllllllllllllllIlIlIlIIIIlllllII, lllllllllllllllIlIlIlIIIIllllIll, lllllllllllllllIlIlIlIIIIlllIllI, lllllllllllllllIlIlIlIIIIlllllIl.charData);
   }

   private static boolean lIlIIIIIIIIlII(int var0) {
      return var0 >= 0;
   }

   public void setFractionalMetrics(boolean lllllllllllllllIlIlIIlllllIIllll) {
      if (lIlIIIIIIIIlIl(lllllllllllllllIlIlIIlllllIIlllI.fractionalMetrics, lllllllllllllllIlIlIIlllllIIllll)) {
         lllllllllllllllIlIlIIlllllIIlllI.fractionalMetrics = (boolean)lllllllllllllllIlIlIIlllllIIllll;
         lllllllllllllllIlIlIIlllllIIlllI.tex = lllllllllllllllIlIlIIlllllIIlllI.setupTexture(lllllllllllllllIlIlIIlllllIIlllI.font, lllllllllllllllIlIlIIlllllIIlllI.antiAlias, (boolean)lllllllllllllllIlIlIIlllllIIllll, lllllllllllllllIlIlIIlllllIIlllI.charData);
      }

   }

   public void drawChar(CFont.CharData[] lllllllllllllllIlIlIlIIIIIlIlIII, char lllllllllllllllIlIlIlIIIIIlIIIlI, float lllllllllllllllIlIlIlIIIIIlIIllI, float lllllllllllllllIlIlIlIIIIIlIIlIl) throws ArrayIndexOutOfBoundsException {
      try {
         lllllllllllllllIlIlIlIIIIIlIIlII.drawQuad(lllllllllllllllIlIlIlIIIIIlIIllI, lllllllllllllllIlIlIlIIIIIlIIlIl, (float)lllllllllllllllIlIlIlIIIIIlIlIII[lllllllllllllllIlIlIlIIIIIlIIIlI].width, (float)lllllllllllllllIlIlIlIIIIIlIlIII[lllllllllllllllIlIlIlIIIIIlIIIlI].height, (float)lllllllllllllllIlIlIlIIIIIlIlIII[lllllllllllllllIlIlIlIIIIIlIIIlI].storedX, (float)lllllllllllllllIlIlIlIIIIIlIlIII[lllllllllllllllIlIlIlIIIIIlIIIlI].storedY, (float)lllllllllllllllIlIlIlIIIIIlIlIII[lllllllllllllllIlIlIlIIIIIlIIIlI].width, (float)lllllllllllllllIlIlIlIIIIIlIlIII[lllllllllllllllIlIlIlIIIIIlIIIlI].height);
      } catch (Exception var6) {
         var6.printStackTrace();
         return;
      }

      "".length();
      if (-(89 ^ 72 ^ 36 ^ 49) <= 0) {
         ;
      }
   }

   private static boolean lIlIIIIIIIIIll(int var0, int var1) {
      return var0 > var1;
   }

   public boolean isFractionalMetrics() {
      return lllllllllllllllIlIlIIlllllIlIIll.fractionalMetrics;
   }

   public Font getFont() {
      return lllllllllllllllIlIlIIlllllIIlIlI.font;
   }

   protected void drawQuad(float lllllllllllllllIlIlIlIIIIIIIIIll, float lllllllllllllllIlIlIlIIIIIIIIIlI, float lllllllllllllllIlIlIlIIIIIIIlllI, float lllllllllllllllIlIlIlIIIIIIIIIII, float lllllllllllllllIlIlIlIIIIIIIllII, float lllllllllllllllIlIlIIllllllllllI, float lllllllllllllllIlIlIIlllllllllIl, float lllllllllllllllIlIlIlIIIIIIIlIIl) {
      float lllllllllllllllIlIlIIllllllllIll = lllllllllllllllIlIlIlIIIIIIIllII / lllllllllllllllIlIlIlIIIIIIIIlII.imgSize;
      int lllllllllllllllIlIlIIllllllllIlI = lllllllllllllllIlIlIIllllllllllI / lllllllllllllllIlIlIlIIIIIIIIlII.imgSize;
      float lllllllllllllllIlIlIlIIIIIIIIllI = lllllllllllllllIlIlIIlllllllllIl / lllllllllllllllIlIlIlIIIIIIIIlII.imgSize;
      byte lllllllllllllllIlIlIIllllllllIII = lllllllllllllllIlIlIlIIIIIIIlIIl / lllllllllllllllIlIlIlIIIIIIIIlII.imgSize;
      GL11.glEnable(llllIlIIlllI[7]);
      GL11.glTexCoord2f(lllllllllllllllIlIlIIllllllllIll + lllllllllllllllIlIlIlIIIIIIIIllI, lllllllllllllllIlIlIIllllllllIlI);
      GL11.glVertex2d((double)(lllllllllllllllIlIlIlIIIIIIIIIll + lllllllllllllllIlIlIlIIIIIIIlllI), (double)lllllllllllllllIlIlIlIIIIIIIIIlI);
      GL11.glTexCoord2f(lllllllllllllllIlIlIIllllllllIll, lllllllllllllllIlIlIIllllllllIlI);
      GL11.glVertex2d((double)lllllllllllllllIlIlIlIIIIIIIIIll, (double)lllllllllllllllIlIlIlIIIIIIIIIlI);
      GL11.glTexCoord2f(lllllllllllllllIlIlIIllllllllIll, lllllllllllllllIlIlIIllllllllIlI + lllllllllllllllIlIlIIllllllllIII);
      GL11.glVertex2d((double)lllllllllllllllIlIlIlIIIIIIIIIll, (double)(lllllllllllllllIlIlIlIIIIIIIIIlI + lllllllllllllllIlIlIlIIIIIIIIIII));
      GL11.glTexCoord2f(lllllllllllllllIlIlIIllllllllIll, lllllllllllllllIlIlIIllllllllIlI + lllllllllllllllIlIlIIllllllllIII);
      GL11.glVertex2d((double)lllllllllllllllIlIlIlIIIIIIIIIll, (double)(lllllllllllllllIlIlIlIIIIIIIIIlI + lllllllllllllllIlIlIlIIIIIIIIIII));
      GL11.glTexCoord2f(lllllllllllllllIlIlIIllllllllIll + lllllllllllllllIlIlIlIIIIIIIIllI, lllllllllllllllIlIlIIllllllllIlI + lllllllllllllllIlIlIIllllllllIII);
      GL11.glVertex2d((double)(lllllllllllllllIlIlIlIIIIIIIIIll + lllllllllllllllIlIlIlIIIIIIIlllI), (double)(lllllllllllllllIlIlIlIIIIIIIIIlI + lllllllllllllllIlIlIlIIIIIIIIIII));
      GL11.glTexCoord2f(lllllllllllllllIlIlIIllllllllIll + lllllllllllllllIlIlIlIIIIIIIIllI, lllllllllllllllIlIlIIllllllllIlI);
      GL11.glVertex2d((double)(lllllllllllllllIlIlIlIIIIIIIIIll + lllllllllllllllIlIlIlIIIIIIIlllI), (double)lllllllllllllllIlIlIlIIIIIIIIIlI);
      GL11.glDisable(llllIlIIlllI[7]);
   }

   public int getStringWidth(String lllllllllllllllIlIlIIllllllIIlII) {
      double lllllllllllllllIlIlIIllllllIIIll = llllIlIIlllI[2];
      short lllllllllllllllIlIlIIllllllIIIlI = lllllllllllllllIlIlIIllllllIIlII.toCharArray();
      float lllllllllllllllIlIlIIllllllIIIIl = lllllllllllllllIlIlIIllllllIIIlI.length;
      int lllllllllllllllIlIlIIllllllIIIII = llllIlIIlllI[2];

      do {
         if (!lIlIIIIIIIIIIl(lllllllllllllllIlIlIIllllllIIIII, lllllllllllllllIlIlIIllllllIIIIl)) {
            return lllllllllllllllIlIlIIllllllIIIll / llllIlIIlllI[3];
         }

         char lllllllllllllllIlIlIIllllllIlIIl = lllllllllllllllIlIlIIllllllIIIlI[lllllllllllllllIlIlIIllllllIIIII];
         if (lIlIIIIIIIIIIl(lllllllllllllllIlIlIIllllllIlIIl, lllllllllllllllIlIlIIllllllIIlIl.charData.length) && lIlIIIIIIIIlII(lllllllllllllllIlIlIIllllllIlIIl)) {
            lllllllllllllllIlIlIIllllllIIIll += lllllllllllllllIlIlIIllllllIIlIl.charData[lllllllllllllllIlIlIIllllllIlIIl].width - llllIlIIlllI[6] + lllllllllllllllIlIlIIllllllIIlIl.charOffset;
         }

         ++lllllllllllllllIlIlIIllllllIIIII;
         "".length();
      } while("   ".length() < " ".length() << (" ".length() << " ".length()));

      return (2 ^ 19) << (" ".length() << " ".length()) & ~((121 ^ 104) << (" ".length() << " ".length()));
   }

   private static boolean lIlIIIIIIIIIlI(int var0, int var1) {
      return var0 >= var1;
   }

   public int getHeight() {
      return (lllllllllllllllIlIlIIlllllllIIIl.fontHeight - llllIlIIlllI[6]) / llllIlIIlllI[3];
   }

   public void setAntiAlias(boolean lllllllllllllllIlIlIIlllllIllIII) {
      if (lIlIIIIIIIIlIl(lllllllllllllllIlIlIIlllllIlIlll.antiAlias, lllllllllllllllIlIlIIlllllIllIII)) {
         lllllllllllllllIlIlIIlllllIlIlll.antiAlias = (boolean)lllllllllllllllIlIlIIlllllIllIII;
         lllllllllllllllIlIlIIlllllIlIlll.tex = lllllllllllllllIlIlIIlllllIlIlll.setupTexture(lllllllllllllllIlIlIIlllllIlIlll.font, (boolean)lllllllllllllllIlIlIIlllllIllIII, lllllllllllllllIlIlIIlllllIlIlll.fractionalMetrics, lllllllllllllllIlIlIIlllllIlIlll.charData);
      }

   }

   protected class CharData {
      // $FF: synthetic field
      public int width;
      // $FF: synthetic field
      public int storedX;
      // $FF: synthetic field
      public int height;
      // $FF: synthetic field
      public int storedY;
   }
}
