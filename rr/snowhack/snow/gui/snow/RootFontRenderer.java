package rr.snowhack.snow.gui.snow;

import java.awt.Color;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;

public class RootFontRenderer implements FontRenderer {
   // $FF: synthetic field
   private final net.minecraft.client.gui.FontRenderer fontRenderer;
   // $FF: synthetic field
   private static final int[] llllIIIlIlII;
   // $FF: synthetic field
   private final float fontsize;

   public int getStringHeight(String lllllllllllllllIlIlIllIlIllllIll) {
      return lllllllllllllllIlIlIllIlIllllIlI.getFontHeight();
   }

   public int getFontHeight() {
      return (int)((float)Minecraft.func_71410_x().field_71466_p.field_78288_b * lllllllllllllllIlIlIllIlIlllllll.fontsize);
   }

   public void drawString(int lllllllllllllllIlIlIllIlIlIlllll, int lllllllllllllllIlIlIllIlIlIlIlll, int lllllllllllllllIlIlIllIlIlIlIllI, int lllllllllllllllIlIlIllIlIlIlllII, int lllllllllllllllIlIlIllIlIlIlIlII, String lllllllllllllllIlIlIllIlIlIllIlI) {
      lllllllllllllllIlIlIllIlIllIIIII.drawString(lllllllllllllllIlIlIllIlIlIlllll, lllllllllllllllIlIlIllIlIlIlIlll, llllIIIlIlII[1] | (lllllllllllllllIlIlIllIlIlIlIllI & llllIIIlIlII[0]) << llllIIIlIlII[2] | (lllllllllllllllIlIlIllIlIlIlllII & llllIIIlIlII[0]) << llllIIIlIlII[3] | lllllllllllllllIlIlIllIlIlIlIlII & llllIIIlIlII[0], lllllllllllllllIlIlIllIlIlIllIlI);
   }

   private static void lIIllllIlIIlII() {
      llllIIIlIlII = new int[7];
      llllIIIlIlII[0] = (71 ^ 2) + 109 + 3 - -93 + 16 - (137 + 77 - 145 + 72 << " ".length()) + 122 + 116 - 230 + 239;
      llllIIIlIlII[1] = -((1691609 + 3951505 - 3019858 + 1726933 << " ".length()) + 683433 + 439954 - -762769 + 558815 - -(750919 + 1996152 - 869232 + 579884) + (12276 + 5321 - 10524 + 5326 << (" ".length() << "   ".length())));
      llllIIIlIlII[2] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllIIIlIlII[3] = " ".length() << "   ".length();
      llllIIIlIlII[4] = " ".length();
      llllIIIlIlII[5] = 332 + 3 - 297 + 331 + ((227 ^ 154) << (" ".length() << (" ".length() << " ".length()))) - (150 + 1726 - -212 + 159) + 392 + 2663 - 1060 + 1500;
      llllIIIlIlII[6] = (97 + 56 - 69 + 59 << "   ".length()) + ((43 ^ 118) << (" ".length() << " ".length())) - (151 + 122 - 62 + 40) + (" ".length() << (" ".length() << "   ".length())) << " ".length();
   }

   public RootFontRenderer(float lllllllllllllllIlIlIllIllIIIIIIl) {
      lllllllllllllllIlIlIllIllIIIIIlI.fontRenderer = Minecraft.func_71410_x().field_71466_p;
      lllllllllllllllIlIlIllIllIIIIIlI.fontsize = lllllllllllllllIlIlIllIllIIIIIIl;
   }

   private void pop(int lllllllllllllllIlIlIllIIllllIIIl, int lllllllllllllllIlIlIllIIllllIIII) {
      GL11.glScalef(1.0F / lllllllllllllllIlIlIllIIlllIllll.fontsize, 1.0F / lllllllllllllllIlIlIllIIlllIllll.fontsize, 1.0F);
      GL11.glTranslatef((float)(-lllllllllllllllIlIlIllIIllllIIIl), (float)(-lllllllllllllllIlIlIllIIllllIIII), 0.0F);
      GL11.glDisable(llllIIIlIlII[5]);
   }

   static {
      lIIllllIlIIlII();
   }

   public int getStringWidth(String lllllllllllllllIlIlIllIlIlllIlII) {
      return (int)((float)lllllllllllllllIlIlIllIlIlllIlll.fontRenderer.func_78256_a(lllllllllllllllIlIlIllIlIlllIlII) * lllllllllllllllIlIlIllIlIlllIlll.fontsize);
   }

   public void drawString(int lllllllllllllllIlIlIllIlIIlIIlll, int lllllllllllllllIlIlIllIlIIlIllII, int lllllllllllllllIlIlIllIlIIlIIlIl, String lllllllllllllllIlIlIllIlIIlIlIlI, boolean lllllllllllllllIlIlIllIlIIlIlIIl) {
      lllllllllllllllIlIlIllIlIIlIlIII.prepare(lllllllllllllllIlIlIllIlIIlIIlll, lllllllllllllllIlIlIllIlIIlIllII);
      Minecraft.func_71410_x().field_71466_p.func_175065_a(lllllllllllllllIlIlIllIlIIlIlIlI, 0.0F, 0.0F, lllllllllllllllIlIlIllIlIIlIIlIl, lllllllllllllllIlIlIllIlIIlIlIIl);
      "".length();
      lllllllllllllllIlIlIllIlIIlIlIII.pop(lllllllllllllllIlIlIllIlIIlIIlll, lllllllllllllllIlIlIllIlIIlIllII);
   }

   public void drawString(int lllllllllllllllIlIlIllIlIlIIIlll, int lllllllllllllllIlIlIllIlIlIIlIll, Color lllllllllllllllIlIlIllIlIlIIIlIl, String lllllllllllllllIlIlIllIlIlIIlIIl) {
      lllllllllllllllIlIlIllIlIlIIlIII.drawString(lllllllllllllllIlIlIllIlIlIIIlll, lllllllllllllllIlIlIllIlIlIIlIll, lllllllllllllllIlIlIllIlIlIIIlIl.getRGB(), lllllllllllllllIlIlIllIlIlIIlIIl);
   }

   public void drawString(int lllllllllllllllIlIlIllIlIllIlIlI, int lllllllllllllllIlIlIllIlIllIlIIl, String lllllllllllllllIlIlIllIlIllIlIII) {
      lllllllllllllllIlIlIllIlIllIllll.drawString(lllllllllllllllIlIlIllIlIllIlIlI, lllllllllllllllIlIlIllIlIllIlIIl, llllIIIlIlII[0], llllIIIlIlII[0], llllIIIlIlII[0], lllllllllllllllIlIlIllIlIllIlIII);
   }

   private void prepare(int lllllllllllllllIlIlIllIIllllIlll, int lllllllllllllllIlIlIllIIlllllIIl) {
      GL11.glEnable(llllIIIlIlII[5]);
      GL11.glEnable(llllIIIlIlII[6]);
      GL11.glTranslatef((float)lllllllllllllllIlIlIllIIllllIlll, (float)lllllllllllllllIlIlIllIIlllllIIl, 0.0F);
      GL11.glScalef(lllllllllllllllIlIlIllIIlllllIII.fontsize, lllllllllllllllIlIlIllIIlllllIII.fontsize, 1.0F);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void drawStringWithShadow(int lllllllllllllllIlIlIllIlIIIIIIlI, int lllllllllllllllIlIlIllIlIIIIIllI, int lllllllllllllllIlIlIllIlIIIIIlIl, String lllllllllllllllIlIlIllIIllllllll) {
      lllllllllllllllIlIlIllIlIIIIlIII.drawString(lllllllllllllllIlIlIllIlIIIIIIlI, lllllllllllllllIlIlIllIlIIIIIllI, lllllllllllllllIlIlIllIlIIIIIlIl, lllllllllllllllIlIlIllIIllllllll, (boolean)llllIIIlIlII[4]);
   }

   public void drawStringWithShadow(int lllllllllllllllIlIlIllIlIIIllIlI, int lllllllllllllllIlIlIllIlIIIlIIlI, int lllllllllllllllIlIlIllIlIIIlIIIl, int lllllllllllllllIlIlIllIlIIIlIIII, int lllllllllllllllIlIlIllIlIIIIllll, String lllllllllllllllIlIlIllIlIIIlIlIl) {
      lllllllllllllllIlIlIllIlIIIllIll.drawString(lllllllllllllllIlIlIllIlIIIllIlI, lllllllllllllllIlIlIllIlIIIlIIlI, llllIIIlIlII[1] | (lllllllllllllllIlIlIllIlIIIlIIIl & llllIIIlIlII[0]) << llllIIIlIlII[2] | (lllllllllllllllIlIlIllIlIIIlIIII & llllIIIlIlII[0]) << llllIIIlIlII[3] | lllllllllllllllIlIlIllIlIIIIllll & llllIIIlIlII[0], lllllllllllllllIlIlIllIlIIIlIlIl, (boolean)llllIIIlIlII[4]);
   }

   public void drawString(int lllllllllllllllIlIlIllIlIIlllIII, int lllllllllllllllIlIlIllIlIIllllII, int lllllllllllllllIlIlIllIlIIlllIll, String lllllllllllllllIlIlIllIlIIllIlIl) {
      lllllllllllllllIlIlIllIlIIlllIIl.drawString(lllllllllllllllIlIlIllIlIIlllIII, lllllllllllllllIlIlIllIlIIllllII, lllllllllllllllIlIlIllIlIIlllIll, lllllllllllllllIlIlIllIlIIllIlIl, (boolean)llllIIIlIlII[4]);
   }
}
