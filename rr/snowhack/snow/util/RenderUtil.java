package rr.snowhack.snow.util;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.AxisAlignedBB;
import org.lwjgl.opengl.GL11;

public final class RenderUtil {
   // $FF: synthetic field
   private static final int[] lIIIlIlIIllIl;
   // $FF: synthetic field
   private static final FloatBuffer MODELVIEW;
   // $FF: synthetic field
   private static final IntBuffer VIEWPORT;
   // $FF: synthetic field
   private static final FloatBuffer PROJECTION;

   public static void drawPlane(double lllllllllllllllIIllIllIlIlIlllII, double lllllllllllllllIIllIllIlIllIIIIl, double lllllllllllllllIIllIllIlIllIIIII, AxisAlignedBB lllllllllllllllIIllIllIlIlIlllll, float lllllllllllllllIIllIllIlIlIllllI, int lllllllllllllllIIllIllIlIlIlllIl) {
      GL11.glPushMatrix();
      GL11.glTranslated(lllllllllllllllIIllIllIlIlIlllII, lllllllllllllllIIllIllIlIllIIIIl, lllllllllllllllIIllIllIlIllIIIII);
      drawPlane(lllllllllllllllIIllIllIlIlIlllll, lllllllllllllllIIllIllIlIlIllllI, lllllllllllllllIIllIllIlIlIlllIl);
      GL11.glPopMatrix();
   }

   public static void drawRect(float lllllllllllllllIIllIlllIIlIIIlII, float lllllllllllllllIIllIlllIIlIIIIll, float lllllllllllllllIIllIlllIIlIIIIlI, float lllllllllllllllIIllIlllIIlIIIIIl, int lllllllllllllllIIllIlllIIIllIlIl) {
      float lllllllllllllllIIllIlllIIIllllll = (float)(lllllllllllllllIIllIlllIIIllIlIl >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      long lllllllllllllllIIllIlllIIIllIIll = (float)(lllllllllllllllIIllIlllIIIllIlIl >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIlllIIIllllIl = (float)(lllllllllllllllIIllIlllIIIllIlIl >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      char lllllllllllllllIIllIlllIIIllIIIl = (float)(lllllllllllllllIIllIlllIIIllIlIl & lIIIlIlIIllIl[1]) / 255.0F;
      Tessellator lllllllllllllllIIllIlllIIIlllIll = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIlllIIIlllIlI = lllllllllllllllIIllIlllIIIlllIll.func_178180_c();
      GlStateManager.func_179147_l();
      GlStateManager.func_179090_x();
      GlStateManager.func_179120_a(lIIIlIlIIllIl[4], lIIIlIlIIllIl[5], lIIIlIlIIllIl[6], lIIIlIlIIllIl[7]);
      lllllllllllllllIIllIlllIIIlllIlI.func_181668_a(lIIIlIlIIllIl[8], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIlllIIIlllIlI.func_181662_b((double)lllllllllllllllIIllIlllIIlIIIlII, (double)lllllllllllllllIIllIlllIIlIIIIIl, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIllIIll, lllllllllllllllIIllIlllIIIllllIl, lllllllllllllllIIllIlllIIIllIIIl, lllllllllllllllIIllIlllIIIllllll).func_181675_d();
      lllllllllllllllIIllIlllIIIlllIlI.func_181662_b((double)lllllllllllllllIIllIlllIIlIIIIlI, (double)lllllllllllllllIIllIlllIIlIIIIIl, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIllIIll, lllllllllllllllIIllIlllIIIllllIl, lllllllllllllllIIllIlllIIIllIIIl, lllllllllllllllIIllIlllIIIllllll).func_181675_d();
      lllllllllllllllIIllIlllIIIlllIlI.func_181662_b((double)lllllllllllllllIIllIlllIIlIIIIlI, (double)lllllllllllllllIIllIlllIIlIIIIll, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIllIIll, lllllllllllllllIIllIlllIIIllllIl, lllllllllllllllIIllIlllIIIllIIIl, lllllllllllllllIIllIlllIIIllllll).func_181675_d();
      lllllllllllllllIIllIlllIIIlllIlI.func_181662_b((double)lllllllllllllllIIllIlllIIlIIIlII, (double)lllllllllllllllIIllIlllIIlIIIIll, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIllIIll, lllllllllllllllIIllIlllIIIllllIl, lllllllllllllllIIllIlllIIIllIIIl, lllllllllllllllIIllIlllIIIllllll).func_181675_d();
      lllllllllllllllIIllIlllIIIlllIll.func_78381_a();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
   }

   static {
      lIllIIIIlllIIl();
      VIEWPORT = GLAllocation.func_74527_f(lIIIlIlIIllIl[2]);
      MODELVIEW = GLAllocation.func_74529_h(lIIIlIlIIllIl[2]);
      PROJECTION = GLAllocation.func_74529_h(lIIIlIlIIllIl[2]);
   }

   public static void drawGradientRect(float lllllllllllllllIIllIlllIIIIllllI, float lllllllllllllllIIllIlllIIIIlllIl, float lllllllllllllllIIllIlllIIIIIllII, float lllllllllllllllIIllIlllIIIIIlIll, int lllllllllllllllIIllIlllIIIIIlIlI, int lllllllllllllllIIllIlllIIIIIlIIl) {
      double lllllllllllllllIIllIlllIIIIIlIII = (float)(lllllllllllllllIIllIlllIIIIIlIlI >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      int lllllllllllllllIIllIlllIIIIIIlll = (float)(lllllllllllllllIIllIlllIIIIIlIlI >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIlllIIIIlIllI = (float)(lllllllllllllllIIllIlllIIIIIlIlI >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIlllIIIIlIlIl = (float)(lllllllllllllllIIllIlllIIIIIlIlI & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIlllIIIIlIlII = (float)(lllllllllllllllIIllIlllIIIIIlIIl >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIlllIIIIlIIll = (float)(lllllllllllllllIIllIlllIIIIIlIIl >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIlllIIIIlIIlI = (float)(lllllllllllllllIIllIlllIIIIIlIIl >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      char lllllllllllllllIIllIlllIIIIIIIIl = (float)(lllllllllllllllIIllIlllIIIIIlIIl & lIIIlIlIIllIl[1]) / 255.0F;
      GlStateManager.func_179090_x();
      GlStateManager.func_179147_l();
      GlStateManager.func_179118_c();
      GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
      GlStateManager.func_179103_j(lIIIlIlIIllIl[9]);
      double lllllllllllllllIIllIlllIIIIIIIII = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIlllIIIIIllll = lllllllllllllllIIllIlllIIIIIIIII.func_178180_c();
      lllllllllllllllIIllIlllIIIIIllll.func_181668_a(lIIIlIlIIllIl[8], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIlllIIIIIllll.func_181662_b((double)lllllllllllllllIIllIlllIIIIIllII, (double)lllllllllllllllIIllIlllIIIIlllIl, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIIIIlll, lllllllllllllllIIllIlllIIIIlIllI, lllllllllllllllIIllIlllIIIIlIlIl, lllllllllllllllIIllIlllIIIIIlIII).func_181675_d();
      lllllllllllllllIIllIlllIIIIIllll.func_181662_b((double)lllllllllllllllIIllIlllIIIIllllI, (double)lllllllllllllllIIllIlllIIIIlllIl, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIIIIlll, lllllllllllllllIIllIlllIIIIlIllI, lllllllllllllllIIllIlllIIIIlIlIl, lllllllllllllllIIllIlllIIIIIlIII).func_181675_d();
      lllllllllllllllIIllIlllIIIIIllll.func_181662_b((double)lllllllllllllllIIllIlllIIIIllllI, (double)lllllllllllllllIIllIlllIIIIIlIll, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIIlIIll, lllllllllllllllIIllIlllIIIIlIIlI, lllllllllllllllIIllIlllIIIIIIIIl, lllllllllllllllIIllIlllIIIIlIlII).func_181675_d();
      lllllllllllllllIIllIlllIIIIIllll.func_181662_b((double)lllllllllllllllIIllIlllIIIIIllII, (double)lllllllllllllllIIllIlllIIIIIlIll, 0.0D).func_181666_a(lllllllllllllllIIllIlllIIIIlIIll, lllllllllllllllIIllIlllIIIIlIIlI, lllllllllllllllIIllIlllIIIIIIIIl, lllllllllllllllIIllIlllIIIIlIlII).func_181675_d();
      lllllllllllllllIIllIlllIIIIIIIII.func_78381_a();
      GlStateManager.func_179103_j(lIIIlIlIIllIl[10]);
      GlStateManager.func_179084_k();
      GlStateManager.func_179141_d();
      GlStateManager.func_179098_w();
   }

   public static void drawOutlineRect(float lllllllllllllllIIllIllIlllIlllIl, float lllllllllllllllIIllIllIlllIlllII, float lllllllllllllllIIllIllIlllIlIlIl, float lllllllllllllllIIllIllIlllIllIlI, float lllllllllllllllIIllIllIlllIllIIl, int lllllllllllllllIIllIllIlllIllIII) {
      drawRect(lllllllllllllllIIllIllIlllIlllIl, lllllllllllllllIIllIllIlllIlllII, lllllllllllllllIIllIllIlllIlllIl - lllllllllllllllIIllIllIlllIllIIl, lllllllllllllllIIllIllIlllIllIlI, lllllllllllllllIIllIllIlllIllIII);
      drawRect(lllllllllllllllIIllIllIlllIlIlIl + lllllllllllllllIIllIllIlllIllIIl, lllllllllllllllIIllIllIlllIlllII, lllllllllllllllIIllIllIlllIlIlIl, lllllllllllllllIIllIllIlllIllIlI, lllllllllllllllIIllIllIlllIllIII);
      drawRect(lllllllllllllllIIllIllIlllIlllIl, lllllllllllllllIIllIllIlllIlllII, lllllllllllllllIIllIllIlllIlIlIl, lllllllllllllllIIllIllIlllIlllII - lllllllllllllllIIllIllIlllIllIIl, lllllllllllllllIIllIllIlllIllIII);
      drawRect(lllllllllllllllIIllIllIlllIlllIl, lllllllllllllllIIllIllIlllIllIlI + lllllllllllllllIIllIllIlllIllIIl, lllllllllllllllIIllIllIlllIlIlIl, lllllllllllllllIIllIllIlllIllIlI, lllllllllllllllIIllIllIlllIllIII);
   }

   public static void drawLine(float lllllllllllllllIIllIllIllIlllIIl, float lllllllllllllllIIllIllIlllIIIlII, float lllllllllllllllIIllIllIllIllIlll, float lllllllllllllllIIllIllIlllIIIIlI, float lllllllllllllllIIllIllIlllIIIIIl, int lllllllllllllllIIllIllIllIllIlII) {
      float lllllllllllllllIIllIllIllIllllll = (float)(lllllllllllllllIIllIllIllIllIlII >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIllIllIlllllI = (float)(lllllllllllllllIIllIllIllIllIlII >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIllIllIllllIl = (float)(lllllllllllllllIIllIllIllIllIlII & lIIIlIlIIllIl[1]) / 255.0F;
      short lllllllllllllllIIllIllIllIllIIII = (float)(lllllllllllllllIIllIllIllIllIlII >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      GlStateManager.func_179094_E();
      GlStateManager.func_179090_x();
      GlStateManager.func_179147_l();
      GlStateManager.func_179118_c();
      GlStateManager.func_179120_a(lIIIlIlIIllIl[4], lIIIlIlIIllIl[5], lIIIlIlIIllIl[6], lIIIlIlIIllIl[7]);
      GlStateManager.func_179103_j(lIIIlIlIIllIl[9]);
      GL11.glLineWidth(lllllllllllllllIIllIllIlllIIIIIl);
      GL11.glEnable(lIIIlIlIIllIl[13]);
      GL11.glHint(lIIIlIlIIllIl[15], lIIIlIlIIllIl[16]);
      Tessellator lllllllllllllllIIllIllIllIlllIll = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIllIllIlllIlI = lllllllllllllllIIllIllIllIlllIll.func_178180_c();
      lllllllllllllllIIllIllIllIlllIlI.func_181668_a(lIIIlIlIIllIl[17], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIllIllIlllIlI.func_181662_b((double)lllllllllllllllIIllIllIllIlllIIl, (double)lllllllllllllllIIllIllIlllIIIlII, 0.0D).func_181666_a(lllllllllllllllIIllIllIllIllllll, lllllllllllllllIIllIllIllIlllllI, lllllllllllllllIIllIllIllIllllIl, lllllllllllllllIIllIllIllIllIIII).func_181675_d();
      lllllllllllllllIIllIllIllIlllIlI.func_181662_b((double)lllllllllllllllIIllIllIllIllIlll, (double)lllllllllllllllIIllIllIlllIIIIlI, 0.0D).func_181666_a(lllllllllllllllIIllIllIllIllllll, lllllllllllllllIIllIllIllIlllllI, lllllllllllllllIIllIllIllIllllIl, lllllllllllllllIIllIllIllIllIIII).func_181675_d();
      lllllllllllllllIIllIllIllIlllIll.func_78381_a();
      GlStateManager.func_179103_j(lIIIlIlIIllIl[10]);
      GL11.glDisable(lIIIlIlIIllIl[13]);
      GlStateManager.func_179084_k();
      GlStateManager.func_179141_d();
      GlStateManager.func_179098_w();
      GlStateManager.func_179121_F();
   }

   public static void drawPlane(AxisAlignedBB lllllllllllllllIIllIllIlIIllIIIl, int lllllllllllllllIIllIllIlIIlllllI) {
      float lllllllllllllllIIllIllIlIIllllIl = (float)(lllllllllllllllIIllIllIlIIlllllI >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      Exception lllllllllllllllIIllIllIlIIlIlllI = (float)(lllllllllllllllIIllIllIlIIlllllI >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      byte lllllllllllllllIIllIllIlIIlIllIl = (float)(lllllllllllllllIIllIllIlIIlllllI >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIllIlIIlllIlI = (float)(lllllllllllllllIIllIllIlIIlllllI & lIIIlIlIIllIl[1]) / 255.0F;
      int lllllllllllllllIIllIllIlIIlIlIlI = lllllllllllllllIIllIllIlIIllIIIl.field_72340_a;
      String lllllllllllllllIIllIllIlIIlIlIIl = lllllllllllllllIIllIllIlIIllIIIl.field_72338_b;
      float lllllllllllllllIIllIllIlIIlIlIII = lllllllllllllllIIllIllIlIIllIIIl.field_72339_c;
      double lllllllllllllllIIllIllIlIIllIllI = lllllllllllllllIIllIllIlIIllIIIl.field_72336_d;
      boolean lllllllllllllllIIllIllIlIIlIIllI = lllllllllllllllIIllIllIlIIllIIIl.field_72337_e;
      boolean lllllllllllllllIIllIllIlIIlIIlIl = lllllllllllllllIIllIllIlIIllIIIl.field_72334_f;
      Tessellator lllllllllllllllIIllIllIlIIllIIll = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIllIlIIllIIlI = lllllllllllllllIIllIllIlIIllIIll.func_178180_c();
      lllllllllllllllIIllIllIlIIllIIlI.func_181668_a(lIIIlIlIIllIl[17], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIllIlIIllIIlI.func_181662_b(lllllllllllllllIIllIllIlIIlIlIlI, lllllllllllllllIIllIllIlIIlIlIIl, lllllllllllllllIIllIllIlIIlIlIII).func_181666_a(lllllllllllllllIIllIllIlIIlIlllI, lllllllllllllllIIllIllIlIIlIllIl, lllllllllllllllIIllIllIlIIlllIlI, lllllllllllllllIIllIllIlIIllllIl).func_181675_d();
      lllllllllllllllIIllIllIlIIllIIlI.func_181662_b(lllllllllllllllIIllIllIlIIllIllI, lllllllllllllllIIllIllIlIIlIlIIl, lllllllllllllllIIllIllIlIIlIIlIl).func_181666_a(lllllllllllllllIIllIllIlIIlIlllI, lllllllllllllllIIllIllIlIIlIllIl, lllllllllllllllIIllIllIlIIlllIlI, lllllllllllllllIIllIllIlIIllllIl).func_181675_d();
      lllllllllllllllIIllIllIlIIllIIlI.func_181662_b(lllllllllllllllIIllIllIlIIlIlIlI, lllllllllllllllIIllIllIlIIlIlIIl, lllllllllllllllIIllIllIlIIlIIlIl).func_181666_a(lllllllllllllllIIllIllIlIIlIlllI, lllllllllllllllIIllIllIlIIlIllIl, lllllllllllllllIIllIllIlIIlllIlI, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIIllIIlI.func_181662_b(lllllllllllllllIIllIllIlIIlIIlIl, lllllllllllllllIIllIllIlIIlIlIIl, lllllllllllllllIIllIllIlIIlIlIII).func_181666_a(lllllllllllllllIIllIllIlIIlIlllI, lllllllllllllllIIllIllIlIIlIllIl, lllllllllllllllIIllIllIlIIlllIlI, lllllllllllllllIIllIllIlIIllllIl).func_181675_d();
      lllllllllllllllIIllIllIlIIllIIll.func_78381_a();
   }

   public static void drawLine3D(float lllllllllllllllIIllIllIllIIlIIIl, float lllllllllllllllIIllIllIllIIllllI, float lllllllllllllllIIllIllIllIIIllll, float lllllllllllllllIIllIllIllIIIlllI, float lllllllllllllllIIllIllIllIIllIll, float lllllllllllllllIIllIllIllIIIllII, float lllllllllllllllIIllIllIllIIllIIl, int lllllllllllllllIIllIllIllIIIlIlI) {
      String lllllllllllllllIIllIllIllIIIlIIl = (float)(lllllllllllllllIIllIllIllIIIlIlI >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      String lllllllllllllllIIllIllIllIIIlIII = (float)(lllllllllllllllIIllIllIllIIIlIlI >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      double lllllllllllllllIIllIllIllIIIIlll = (float)(lllllllllllllllIIllIllIllIIIlIlI & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIllIllIIlIlII = (float)(lllllllllllllllIIllIllIllIIIlIlI >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      GlStateManager.func_179094_E();
      GlStateManager.func_179090_x();
      GlStateManager.func_179147_l();
      GlStateManager.func_179118_c();
      GlStateManager.func_179120_a(lIIIlIlIIllIl[4], lIIIlIlIIllIl[5], lIIIlIlIIllIl[6], lIIIlIlIIllIl[7]);
      GlStateManager.func_179103_j(lIIIlIlIIllIl[9]);
      GL11.glLineWidth(lllllllllllllllIIllIllIllIIllIIl);
      GL11.glEnable(lIIIlIlIIllIl[13]);
      GL11.glHint(lIIIlIlIIllIl[15], lIIIlIlIIllIl[16]);
      GlStateManager.func_179097_i();
      GL11.glEnable(lIIIlIlIIllIl[18]);
      int lllllllllllllllIIllIllIllIIIIlIl = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIllIllIIlIIlI = lllllllllllllllIIllIllIllIIIIlIl.func_178180_c();
      lllllllllllllllIIllIllIllIIlIIlI.func_181668_a(lIIIlIlIIllIl[6], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIllIllIIlIIlI.func_181662_b((double)lllllllllllllllIIllIllIllIIlIIIl, (double)lllllllllllllllIIllIllIllIIllllI, (double)lllllllllllllllIIllIllIllIIIllll).func_181666_a(lllllllllllllllIIllIllIllIIIlIIl, lllllllllllllllIIllIllIllIIIlIII, lllllllllllllllIIllIllIllIIIIlll, lllllllllllllllIIllIllIllIIlIlII).func_181675_d();
      lllllllllllllllIIllIllIllIIlIIlI.func_181662_b((double)lllllllllllllllIIllIllIllIIIlllI, (double)lllllllllllllllIIllIllIllIIllIll, (double)lllllllllllllllIIllIllIllIIIllII).func_181666_a(lllllllllllllllIIllIllIllIIIlIIl, lllllllllllllllIIllIllIllIIIlIII, lllllllllllllllIIllIllIllIIIIlll, lllllllllllllllIIllIllIllIIlIlII).func_181675_d();
      lllllllllllllllIIllIllIllIIIIlIl.func_78381_a();
      GlStateManager.func_179103_j(lIIIlIlIIllIl[10]);
      GL11.glDisable(lIIIlIlIIllIl[13]);
      GlStateManager.func_179126_j();
      GL11.glDisable(lIIIlIlIIllIl[18]);
      GlStateManager.func_179084_k();
      GlStateManager.func_179141_d();
      GlStateManager.func_179098_w();
      GlStateManager.func_179121_F();
   }

   private static void lIllIIIIlllIIl() {
      lIIIlIlIIllIl = new int[19];
      lIIIlIlIIllIl[0] = "   ".length() << "   ".length();
      lIIIlIlIIllIl[1] = ((84 ^ 73) << (" ".length() << " ".length())) + 128 + 20 - 133 + 150 - ((17 ^ 38) << (" ".length() << " ".length())) + ((34 ^ 67) << " ".length());
      lIIIlIlIIllIl[2] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIlIIllIl[3] = " ".length() << "   ".length();
      lIIIlIlIIllIl[4] = 261 + 328 - 311 + 107 << " ".length();
      lIIIlIlIIllIl[5] = 528 + 135 - 58 + 166;
      lIIIlIlIIllIl[6] = " ".length();
      lIIIlIlIIllIl[7] = ((100 ^ 111) << " ".length() ^ 31 ^ 70) & (188 ^ 179 ^ " ".length() << ("   ".length() << " ".length()) ^ -" ".length());
      lIIIlIlIIllIl[8] = " ".length() ^ "   ".length() << " ".length();
      lIIIlIlIIllIl[9] = 1091 + 5794 - 6223 + 6763;
      lIIIlIlIIllIl[10] = (108 + 9 - 100 + 152 ^ (71 ^ 106) << (" ".length() << " ".length())) << (" ".length() << "   ".length());
      lIIIlIlIIllIl[11] = ((48 ^ 63) << "   ".length()) + 242 + 124 - 198 + 593 - -(183 + 321 - 89 + 40) + 174 + 73 - 117 + 55 << " ".length();
      lIIIlIlIIllIl[12] = 2822 + 320 - 2341 + 2752;
      lIIIlIlIIllIl[13] = (27 ^ 66) << (136 ^ 141);
      lIIIlIlIIllIl[14] = "   ".length() << " ".length();
      lIIIlIlIIllIl[15] = 16 + 387 - -412 + 690 + (406 + 5 - 208 + 258 << " ".length()) - (792 + 316 - 468 + 1237) + 623 + 159 - 74 + 319 << " ".length();
      lIIIlIlIIllIl[16] = 519 + 74 - -220 + 356 + 9 + 112 - -248 + 66 - (16 + 35 - -181 + 1 << " ".length()) + 328 + 105 - -130 + 476 << " ".length();
      lIIIlIlIIllIl[17] = "   ".length();
      lIIIlIlIIllIl[18] = (3737 + 1861 - 5579 + 5386 << " ".length()) + 18515 + 17464 - 22490 + 6230 - (30 + 27 - -122 + 44 << (130 ^ 133)) + (6916 + 11195 - 12855 + 10943 << " ".length());
   }

   public static void drawBoundingBox(AxisAlignedBB lllllllllllllllIIllIllIlIlllIIIl, float lllllllllllllllIIllIllIlIlllIIII, int lllllllllllllllIIllIllIlIllllIII) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a(lIIIlIlIIllIl[4], lIIIlIlIIllIl[5], lIIIlIlIIllIl[7], lIIIlIlIIllIl[6]);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIIlIlIIllIl[7]);
      GL11.glEnable(lIIIlIlIIllIl[13]);
      GL11.glHint(lIIIlIlIIllIl[15], lIIIlIlIIllIl[16]);
      GL11.glLineWidth(lllllllllllllllIIllIllIlIlllIIII);
      Exception lllllllllllllllIIllIllIlIllIlllI = (float)(lllllllllllllllIIllIllIlIllllIII >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIllIlIlllIllI = (float)(lllllllllllllllIIllIllIlIllllIII >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      char lllllllllllllllIIllIllIlIllIllII = (float)(lllllllllllllllIIllIllIlIllllIII >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      char lllllllllllllllIIllIllIlIllIlIll = (float)(lllllllllllllllIIllIllIlIllllIII & lIIIlIlIIllIl[1]) / 255.0F;
      double lllllllllllllllIIllIllIlIllIlIlI = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIllIlIlllIIlI = lllllllllllllllIIllIllIlIllIlIlI.func_178180_c();
      lllllllllllllllIIllIllIlIlllIIlI.func_181668_a(lIIIlIlIIllIl[17], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72340_a, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72337_e, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, lllllllllllllllIIllIllIlIllIlllI).func_181675_d();
      lllllllllllllllIIllIllIlIlllIIlI.func_181662_b(lllllllllllllllIIllIllIlIlllIIIl.field_72336_d, lllllllllllllllIIllIllIlIlllIIIl.field_72338_b, lllllllllllllllIIllIllIlIlllIIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIlIlllIllI, lllllllllllllllIIllIllIlIllIllII, lllllllllllllllIIllIllIlIllIlIll, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIllIlIlI.func_78381_a();
      GL11.glDisable(lIIIlIlIIllIl[13]);
      GlStateManager.func_179132_a((boolean)lIIIlIlIIllIl[6]);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
   }

   public static void drawPlane(AxisAlignedBB lllllllllllllllIIllIllIlIlIlIIII, float lllllllllllllllIIllIllIlIlIIllll, int lllllllllllllllIIllIllIlIlIIlllI) {
      GlStateManager.func_179094_E();
      GlStateManager.func_187441_d(lllllllllllllllIIllIllIlIlIIllll);
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ONE);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIIlIlIIllIl[7]);
      GL11.glEnable(lIIIlIlIIllIl[13]);
      GL11.glHint(lIIIlIlIIllIl[15], lIIIlIlIIllIl[16]);
      drawPlane(lllllllllllllllIIllIllIlIlIlIIII, lllllllllllllllIIllIllIlIlIIlllI);
      GL11.glDisable(lIIIlIlIIllIl[13]);
      GlStateManager.func_179132_a((boolean)lIIIlIlIIllIl[6]);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
   }

   public static void drawBoundingBoxFilled(AxisAlignedBB lllllllllllllllIIllIllIlIIIIlIIl, int lllllllllllllllIIllIllIlIIIIIIII) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a(lIIIlIlIIllIl[4], lIIIlIlIIllIl[5], lIIIlIlIIllIl[7], lIIIlIlIIllIl[6]);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIIlIlIIllIl[7]);
      float lllllllllllllllIIllIllIlIIIIIlll = (float)(lllllllllllllllIIllIllIlIIIIIIII >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      short lllllllllllllllIIllIllIIlllllllI = (float)(lllllllllllllllIIllIllIlIIIIIIII >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      char lllllllllllllllIIllIllIIllllllIl = (float)(lllllllllllllllIIllIllIlIIIIIIII >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      boolean lllllllllllllllIIllIllIIllllllII = (float)(lllllllllllllllIIllIllIlIIIIIIII & lIIIlIlIIllIl[1]) / 255.0F;
      Tessellator lllllllllllllllIIllIllIlIIIIIIll = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIIllIllIlIIIIIIlI = lllllllllllllllIIllIllIlIIIIIIll.func_178180_c();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181668_a(lIIIlIlIIllIl[17], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72340_a, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72334_f).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72337_e, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, lllllllllllllllIIllIllIlIIIIIlll).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIlI.func_181662_b(lllllllllllllllIIllIllIlIIIIlIIl.field_72336_d, lllllllllllllllIIllIllIlIIIIlIIl.field_72338_b, lllllllllllllllIIllIllIlIIIIlIIl.field_72339_c).func_181666_a(lllllllllllllllIIllIllIIlllllllI, lllllllllllllllIIllIllIIllllllIl, lllllllllllllllIIllIllIIllllllII, 0.0F).func_181675_d();
      lllllllllllllllIIllIllIlIIIIIIll.func_78381_a();
      GlStateManager.func_179132_a((boolean)lIIIlIlIIllIl[6]);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
   }

   public static void drawTriangle(float lllllllllllllllIIllIllIlllllIlIl, float lllllllllllllllIIllIllIlllllIlII, float lllllllllllllllIIllIllIlllllIIll, float lllllllllllllllIIllIllIllllIlIIl, int lllllllllllllllIIllIllIllllIlIII) {
      GL11.glTranslated((double)lllllllllllllllIIllIllIlllllIlIl, (double)lllllllllllllllIIllIllIlllllIlII, 0.0D);
      GL11.glRotatef(180.0F + lllllllllllllllIIllIllIllllIlIIl, 0.0F, 0.0F, 1.0F);
      float lllllllllllllllIIllIllIlllllIIII = (float)(lllllllllllllllIIllIllIllllIlIII >> lIIIlIlIIllIl[0] & lIIIlIlIIllIl[1]) / 255.0F;
      float lllllllllllllllIIllIllIllllIllll = (float)(lllllllllllllllIIllIllIllllIlIII >> lIIIlIlIIllIl[2] & lIIIlIlIIllIl[1]) / 255.0F;
      Exception lllllllllllllllIIllIllIllllIIlIl = (float)(lllllllllllllllIIllIllIllllIlIII >> lIIIlIlIIllIl[3] & lIIIlIlIIllIl[1]) / 255.0F;
      double lllllllllllllllIIllIllIllllIIlII = (float)(lllllllllllllllIIllIllIllllIlIII & lIIIlIlIIllIl[1]) / 255.0F;
      GL11.glColor4f(lllllllllllllllIIllIllIllllIllll, lllllllllllllllIIllIllIllllIIlIl, lllllllllllllllIIllIllIllllIIlII, lllllllllllllllIIllIllIlllllIIII);
      GL11.glEnable(lIIIlIlIIllIl[11]);
      GL11.glDisable(lIIIlIlIIllIl[12]);
      GL11.glEnable(lIIIlIlIIllIl[13]);
      GL11.glBlendFunc(lIIIlIlIIllIl[4], lIIIlIlIIllIl[5]);
      GL11.glLineWidth(1.0F);
      GL11.glBegin(lIIIlIlIIllIl[14]);
      GL11.glVertex2d(0.0D, (double)(1.0F * lllllllllllllllIIllIllIlllllIIll));
      GL11.glVertex2d((double)(1.0F * lllllllllllllllIIllIllIlllllIIll), (double)(-(1.0F * lllllllllllllllIIllIllIlllllIIll)));
      GL11.glVertex2d((double)(-(1.0F * lllllllllllllllIIllIllIlllllIIll)), (double)(-(1.0F * lllllllllllllllIIllIllIlllllIIll)));
      GL11.glEnd();
      GL11.glDisable(lIIIlIlIIllIl[13]);
      GL11.glEnable(lIIIlIlIIllIl[12]);
      GL11.glDisable(lIIIlIlIIllIl[11]);
      GL11.glRotatef(-180.0F - lllllllllllllllIIllIllIllllIlIIl, 0.0F, 0.0F, 1.0F);
      GL11.glTranslated((double)(-lllllllllllllllIIllIllIlllllIlIl), (double)(-lllllllllllllllIIllIllIlllllIlII), 0.0D);
   }
}
