package rr.snowhack.snow.util;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import org.lwjgl.opengl.GL11;

public class RenderUtils {
   // $FF: synthetic field
   private static final int[] lllllIIlIllI;
   // $FF: synthetic field
   static Minecraft mc;
   // $FF: synthetic field
   private static final String[] lllllIIlIlIl;

   public static void drawRect(int lllllllllllllllIlIIllllllllIIlII, int lllllllllllllllIlIIllllllllIIIll, int lllllllllllllllIlIIllllllllIlllI, int lllllllllllllllIlIIllllllllIIIIl, int lllllllllllllllIlIIllllllllIIIII, int lllllllllllllllIlIIllllllllIlIll) {
      int lllllllllllllllIlIIlllllllIllllI;
      if (lIlIIIlIlIlIII(lllllllllllllllIlIIllllllllIIIll, lllllllllllllllIlIIllllllllIIIIl)) {
         lllllllllllllllIlIIlllllllIllllI = lllllllllllllllIlIIllllllllIIIll;
         lllllllllllllllIlIIllllllllIIIll = lllllllllllllllIlIIllllllllIIIIl;
         lllllllllllllllIlIIllllllllIIIIl = lllllllllllllllIlIIlllllllIllllI;
      }

      if (lIlIIIlIlIlIII(lllllllllllllllIlIIllllllllIlllI, lllllllllllllllIlIIllllllllIIIII)) {
         lllllllllllllllIlIIlllllllIllllI = lllllllllllllllIlIIllllllllIlllI;
         lllllllllllllllIlIIllllllllIlllI = lllllllllllllllIlIIllllllllIIIII;
         lllllllllllllllIlIIllllllllIIIII = lllllllllllllllIlIIlllllllIllllI;
      }

      float lllllllllllllllIlIIllllllllIlIlI = (float)(lllllllllllllllIlIIllllllllIlIll >> lllllIIlIllI[16] & lllllIIlIllI[17]) / 255.0F;
      float lllllllllllllllIlIIllllllllIlIIl = (float)(lllllllllllllllIlIIllllllllIlIll >> lllllIIlIllI[18] & lllllIIlIllI[17]) / 255.0F;
      long lllllllllllllllIlIIlllllllIlllII = (float)(lllllllllllllllIlIIllllllllIlIll >> lllllIIlIllI[19] & lllllIIlIllI[17]) / 255.0F;
      double lllllllllllllllIlIIlllllllIllIll = (float)(lllllllllllllllIlIIllllllllIlIll & lllllIIlIllI[17]) / 255.0F;
      Exception lllllllllllllllIlIIlllllllIllIlI = Tessellator.func_178181_a();
      boolean lllllllllllllllIlIIlllllllIllIIl = lllllllllllllllIlIIlllllllIllIlI.func_178180_c();
      GlStateManager.func_179147_l();
      GlStateManager.func_179090_x();
      GlStateManager.func_179120_a(lllllIIlIllI[6], lllllIIlIllI[7], lllllIIlIllI[2], lllllIIlIllI[1]);
      GlStateManager.func_179131_c(lllllllllllllllIlIIllllllllIlIIl, lllllllllllllllIlIIlllllllIlllII, lllllllllllllllIlIIlllllllIllIll, lllllllllllllllIlIIllllllllIlIlI);
      lllllllllllllllIlIIlllllllIllIIl.func_181668_a(lllllllllllllllIlIIllllllllIIlII, DefaultVertexFormats.field_181705_e);
      lllllllllllllllIlIIlllllllIllIIl.func_181662_b((double)lllllllllllllllIlIIllllllllIIIll, (double)lllllllllllllllIlIIllllllllIIIII, 0.0D).func_181675_d();
      lllllllllllllllIlIIlllllllIllIIl.func_181662_b((double)lllllllllllllllIlIIllllllllIIIIl, (double)lllllllllllllllIlIIllllllllIIIII, 0.0D).func_181675_d();
      lllllllllllllllIlIIlllllllIllIIl.func_181662_b((double)lllllllllllllllIlIIllllllllIIIIl, (double)lllllllllllllllIlIIllllllllIlllI, 0.0D).func_181675_d();
      lllllllllllllllIlIIlllllllIllIIl.func_181662_b((double)lllllllllllllllIlIIllllllllIIIll, (double)lllllllllllllllIlIIllllllllIlllI, 0.0D).func_181675_d();
      lllllllllllllllIlIIlllllllIllIlI.func_78381_a();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
   }

   private static String lIlIIIlIlIIlII(String lllllllllllllllIlIIllllllIlIllII, String lllllllllllllllIlIIllllllIlIlIll) {
      try {
         SecretKeySpec lllllllllllllllIlIIllllllIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIllllllIlIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIllllllIlIlllI.init(lllllIIlIllI[0], lllllllllllllllIlIIllllllIlIllll);
         return new String(lllllllllllllllIlIIllllllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void blockEsp(AxisAlignedBB lllllllllllllllIlIlIIIIIIllllIII, int lllllllllllllllIlIlIIIIIIlllIlll, int lllllllllllllllIlIlIIIIIIlllIllI, int lllllllllllllllIlIlIIIIIIlllIlIl, float lllllllllllllllIlIlIIIIIIlllIlII) {
      GL11.glPushMatrix();
      GL11.glBlendFunc(lllllIIlIllI[6], lllllIIlIllI[7]);
      GL11.glEnable(lllllIIlIllI[8]);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(lllllIIlIllI[9]);
      GL11.glDisable(lllllIIlIllI[10]);
      GL11.glDepthMask((boolean)lllllIIlIllI[1]);
      GL11.glColor4d((double)((float)lllllllllllllllIlIlIIIIIIlllIlll / 255.0F), (double)((float)lllllllllllllllIlIlIIIIIIlllIllI / 255.0F), (double)((float)lllllllllllllllIlIlIIIIIIlllIlIl / 255.0F), (double)lllllllllllllllIlIlIIIIIIlllIlII);
      drawColorBox(lllllllllllllllIlIlIIIIIIllllIII, 0.0F, 0.0F, 0.0F, 0.0F);
      GL11.glColor4d((double)((float)lllllllllllllllIlIlIIIIIIlllIlll / 255.0F), (double)((float)lllllllllllllllIlIlIIIIIIlllIllI / 255.0F), (double)((float)lllllllllllllllIlIlIIIIIIlllIlIl / 255.0F), (double)lllllllllllllllIlIlIIIIIIlllIlII);
      drawSelectionBoundingBox(lllllllllllllllIlIlIIIIIIllllIII);
      GL11.glLineWidth(2.0F);
      GL11.glEnable(lllllIIlIllI[9]);
      GL11.glEnable(lllllIIlIllI[10]);
      GL11.glDepthMask((boolean)lllllIIlIllI[2]);
      GL11.glDisable(lllllIIlIllI[8]);
      GL11.glPopMatrix();
   }

   public static void drawSolidBox(AxisAlignedBB lllllllllllllllIlIlIIIIIIIIllIll) {
      GL11.glBegin(lllllIIlIllI[13]);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIll.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIll.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIll.field_72339_c);
      GL11.glEnd();
   }

   public static void glEnd() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glPopMatrix();
      GL11.glEnable(lllllIIlIllI[10]);
      GL11.glEnable(lllllIIlIllI[9]);
      GL11.glDisable(lllllIIlIllI[8]);
      GL11.glDisable(lllllIIlIllI[14]);
   }

   private static void lIlIIIlIlIIllI() {
      lllllIIlIllI = new int[21];
      lllllIIlIllI[0] = " ".length() << " ".length();
      lllllIIlIllI[1] = " ".length() << (30 ^ 27) & ~(" ".length() << (24 ^ 29));
      lllllIIlIllI[2] = " ".length();
      lllllIIlIllI[3] = "   ".length();
      lllllIIlIllI[4] = " ".length() << (" ".length() << " ".length());
      lllllIIlIllI[5] = 102 ^ 121 ^ (27 ^ 22) << " ".length();
      lllllIIlIllI[6] = 65 + 125 - 138 + 187 + 182 + 131 - 296 + 172 - ((63 ^ 18) << "   ".length()) + 139 + 131 - 103 + 150 << " ".length();
      lllllIIlIllI[7] = (52 + 225 - 130 + 84 << " ".length()) + 77 + 315 - 106 + 399 - (42 + 59 - -9 + 79 << (" ".length() << " ".length())) + ((42 ^ 117) << (" ".length() << " ".length()));
      lllllIIlIllI[8] = 334 + 397 - -457 + 333 << " ".length();
      lllllIIlIllI[9] = 3317 + 3040 - 5713 + 2909;
      lllllIIlIllI[10] = 1431 + 2831 - 1802 + 469;
      lllllIIlIllI[11] = (143 ^ 158) << "   ".length() ^ 24 + 83 - 43 + 65;
      lllllIIlIllI[12] = (15 + 87 - -6 + 33 ^ (125 ^ 120) << (83 ^ 86)) << "   ".length();
      lllllIIlIllI[13] = 97 + 139 - 100 + 41 ^ (228 ^ 191) << " ".length();
      lllllIIlIllI[14] = (33 ^ 120) << (130 ^ 135);
      lllllIIlIllI[15] = (146 + 295 - 381 + 239 << " ".length()) + 71 + 153 - 106 + 89 - (90 + 208 - 213 + 148) + 33 + 44 - -14 + 58 << (" ".length() << " ".length());
      lllllIIlIllI[16] = "   ".length() << "   ".length();
      lllllIIlIllI[17] = (243 ^ 188) + ((59 ^ 20) << " ".length()) - ((136 ^ 195) << " ".length()) + ((85 ^ 72) << "   ".length());
      lllllIIlIllI[18] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllllIIlIllI[19] = " ".length() << "   ".length();
      lllllIIlIllI[20] = "   ".length() << " ".length();
   }

   public static void glStart(float lllllllllllllllIlIlIIIIIIIIIlIIl, float lllllllllllllllIlIlIIIIIIIIIlIII, float lllllllllllllllIlIlIIIIIIIIIIIll, float lllllllllllllllIlIlIIIIIIIIIIllI) {
      glStart();
      GL11.glColor4f(lllllllllllllllIlIlIIIIIIIIIlIIl, lllllllllllllllIlIlIIIIIIIIIlIII, lllllllllllllllIlIlIIIIIIIIIIIll, lllllllllllllllIlIlIIIIIIIIIIllI);
   }

   public static void glStart() {
      GL11.glEnable(lllllIIlIllI[8]);
      GL11.glBlendFunc(lllllIIlIllI[6], lllllIIlIllI[7]);
      GL11.glEnable(lllllIIlIllI[14]);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(lllllIIlIllI[9]);
      GL11.glEnable(lllllIIlIllI[15]);
      GL11.glDisable(lllllIIlIllI[10]);
      double lllllllllllllllIlIlIIIIIIIIlIIll = mc.func_175598_ae().field_78730_l;
      char lllllllllllllllIlIlIIIIIIIIIllll = mc.func_175598_ae().field_78731_m;
      Exception lllllllllllllllIlIlIIIIIIIIIlllI = mc.func_175598_ae().field_78728_n;
      GL11.glPushMatrix();
      GL11.glTranslated(-lllllllllllllllIlIlIIIIIIIIlIIll, -lllllllllllllllIlIlIIIIIIIIIllll, -lllllllllllllllIlIlIIIIIIIIIlllI);
   }

   static {
      lIlIIIlIlIIllI();
      lIlIIIlIlIIlIl();
      mc = Minecraft.func_71410_x();
   }

   public static void drawOutlinedBox(AxisAlignedBB lllllllllllllllIlIlIIIIIIIIllIII) {
      GL11.glBegin(lllllIIlIllI[2]);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72338_b, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72336_d, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72334_f);
      GL11.glVertex3d(lllllllllllllllIlIlIIIIIIIIllIII.field_72340_a, lllllllllllllllIlIlIIIIIIIIllIII.field_72337_e, lllllllllllllllIlIlIIIIIIIIllIII.field_72339_c);
      GL11.glEnd();
   }

   private static void lIlIIIlIlIIlIl() {
      lllllIIlIlIl = new String[lllllIIlIllI[20]];
      lllllIIlIlIl[lllllIIlIllI[1]] = lIlIIIlIlIIIlI("k4VMnIBg5QNLaiqeZsRhyA==", "prasi");
      lllllIIlIlIl[lllllIIlIllI[2]] = lIlIIIlIlIIIll("BQo2ChMFPzcdLg==", "woXnv");
      lllllIIlIlIl[lllllIIlIllI[0]] = lIlIIIlIlIIlII("NrB3vE/SDMra/EEKZ6+qAA==", "kPMBL");
      lllllIIlIlIl[lllllIIlIllI[3]] = lIlIIIlIlIIIll("HiQMKSceEQ0+Gw==", "lAbMB");
      lllllIIlIlIl[lllllIIlIllI[4]] = lIlIIIlIlIIlII("ZWMu+AxtSumYkfLsQpa7Rw==", "jutcA");
      lllllIIlIlIl[lllllIIlIllI[5]] = lIlIIIlIlIIIlI("gIettvM0mZCpDLn21/f6QQ==", "UORsi");
   }

   public static void drawSelectionBoundingBox(AxisAlignedBB lllllllllllllllIlIlIIIIIIIllllIl) {
      Tessellator lllllllllllllllIlIlIIIIIIIllllII = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIlIlIIIIIIIlllIll = lllllllllllllllIlIlIIIIIIIllllII.func_178180_c();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181668_a(lllllIIlIllI[3], DefaultVertexFormats.field_181705_e);
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIllllII.func_78381_a();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181668_a(lllllIIlIllI[3], DefaultVertexFormats.field_181705_e);
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIllllII.func_78381_a();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181668_a(lllllIIlIllI[2], DefaultVertexFormats.field_181705_e);
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72339_c).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72336_d, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72338_b, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIlllIll.func_181662_b(lllllllllllllllIlIlIIIIIIIllllIl.field_72340_a, lllllllllllllllIlIlIIIIIIIllllIl.field_72337_e, lllllllllllllllIlIlIIIIIIIllllIl.field_72334_f).func_181675_d();
      lllllllllllllllIlIlIIIIIIIllllII.func_78381_a();
   }

   public static void drawSolidEntityESP(double lllllllllllllllIlIlIIIIIIIlIIlIl, double lllllllllllllllIlIlIIIIIIIlIIlII, double lllllllllllllllIlIlIIIIIIIlIllII, double lllllllllllllllIlIlIIIIIIIlIlIll, double lllllllllllllllIlIlIIIIIIIlIIIIl, float lllllllllllllllIlIlIIIIIIIlIIIII, float lllllllllllllllIlIlIIIIIIIIlllll, float lllllllllllllllIlIlIIIIIIIlIIlll, float lllllllllllllllIlIlIIIIIIIIlllIl) {
      GL11.glPushMatrix();
      GL11.glEnable(lllllIIlIllI[8]);
      GL11.glBlendFunc(lllllIIlIllI[6], lllllIIlIllI[7]);
      GL11.glDisable(lllllIIlIllI[9]);
      GL11.glEnable(lllllIIlIllI[14]);
      GL11.glDisable(lllllIIlIllI[10]);
      GL11.glDepthMask((boolean)lllllIIlIllI[1]);
      GL11.glColor4f(lllllllllllllllIlIlIIIIIIIlIIIII, lllllllllllllllIlIlIIIIIIIIlllll, lllllllllllllllIlIlIIIIIIIlIIlll, lllllllllllllllIlIlIIIIIIIIlllIl);
      drawSelectionBoundingBox(new AxisAlignedBB(lllllllllllllllIlIlIIIIIIIlIIlIl - lllllllllllllllIlIlIIIIIIIlIlIll, lllllllllllllllIlIlIIIIIIIlIIlII, lllllllllllllllIlIlIIIIIIIlIllII - lllllllllllllllIlIlIIIIIIIlIlIll, lllllllllllllllIlIlIIIIIIIlIIlIl + lllllllllllllllIlIlIIIIIIIlIlIll, lllllllllllllllIlIlIIIIIIIlIIlII + lllllllllllllllIlIlIIIIIIIlIIIIl, lllllllllllllllIlIlIIIIIIIlIllII + lllllllllllllllIlIlIIIIIIIlIlIll));
      GL11.glDisable(lllllIIlIllI[14]);
      GL11.glEnable(lllllIIlIllI[9]);
      GL11.glEnable(lllllIIlIllI[10]);
      GL11.glDepthMask((boolean)lllllIIlIllI[2]);
      GL11.glDisable(lllllIIlIllI[8]);
      GL11.glPopMatrix();
   }

   private static boolean lIlIIIlIlIlIII(int var0, int var1) {
      return var0 < var1;
   }

   public static void drawColorBox(AxisAlignedBB lllllllllllllllIlIlIIIIIIlIIlllI, float lllllllllllllllIlIlIIIIIIlIIllIl, float lllllllllllllllIlIlIIIIIIlIIllII, float lllllllllllllllIlIlIIIIIIlIIIlII, float lllllllllllllllIlIlIIIIIIlIIlIlI) {
      Tessellator lllllllllllllllIlIlIIIIIIlIIlIIl = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIlIlIIIIIIlIIlIII = lllllllllllllllIlIlIIIIIIlIIlIIl.func_178180_c();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181668_a(lllllIIlIllI[13], DefaultVertexFormats.field_181707_g);
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIIl.func_78381_a();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181668_a(lllllIIlIllI[13], DefaultVertexFormats.field_181707_g);
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIIl.func_78381_a();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181668_a(lllllIIlIllI[13], DefaultVertexFormats.field_181707_g);
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIIl.func_78381_a();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181668_a(lllllIIlIllI[13], DefaultVertexFormats.field_181707_g);
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIIl.func_78381_a();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181668_a(lllllIIlIllI[13], DefaultVertexFormats.field_181707_g);
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIIl.func_78381_a();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181668_a(lllllIIlIllI[13], DefaultVertexFormats.field_181707_g);
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72340_a, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72339_c).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72337_e, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIII.func_181662_b(lllllllllllllllIlIlIIIIIIlIIlllI.field_72336_d, lllllllllllllllIlIlIIIIIIlIIlllI.field_72338_b, lllllllllllllllIlIlIIIIIIlIIlllI.field_72334_f).func_181666_a(lllllllllllllllIlIlIIIIIIlIIllIl, lllllllllllllllIlIlIIIIIIlIIllII, lllllllllllllllIlIlIIIIIIlIIIlII, lllllllllllllllIlIlIIIIIIlIIlIlI).func_181675_d();
      lllllllllllllllIlIlIIIIIIlIIlIIl.func_78381_a();
   }

   private static String lIlIIIlIlIIIlI(String lllllllllllllllIlIIlllllllIlIIIl, String lllllllllllllllIlIIlllllllIlIIII) {
      try {
         String lllllllllllllllIlIIlllllllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllllIlIIII.getBytes(StandardCharsets.UTF_8)), lllllIIlIllI[19]), "DES");
         short lllllllllllllllIlIIlllllllIIllII = Cipher.getInstance("DES");
         lllllllllllllllIlIIlllllllIIllII.init(lllllIIlIllI[0], lllllllllllllllIlIIlllllllIIllIl);
         return new String(lllllllllllllllIlIIlllllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static AxisAlignedBB getBoundingBox(BlockPos lllllllllllllllIlIlIIIIIIIIIIIII) {
      return mc.field_71441_e.func_180495_p(lllllllllllllllIlIlIIIIIIIIIIIII).func_185900_c(mc.field_71441_e, lllllllllllllllIlIlIIIIIIIIIIIII).func_186670_a(lllllllllllllllIlIlIIIIIIIIIIIII);
   }

   private static boolean lIlIIIlIlIIlll(int var0, int var1) {
      return var0 <= var1;
   }

   public static void blockEsp(BlockPos lllllllllllllllIlIlIIIIIIlIlllll, int lllllllllllllllIlIlIIIIIIlIllllI, int lllllllllllllllIlIlIIIIIIllIIlll, int lllllllllllllllIlIlIIIIIIllIIllI, float lllllllllllllllIlIlIIIIIIlIllIll, double lllllllllllllllIlIlIIIIIIllIIlII, double lllllllllllllllIlIlIIIIIIllIIIll) {
      double lllllllllllllllIlIlIIIIIIllIIIlI = (double)lllllllllllllllIlIlIIIIIIlIlllll.func_177958_n();
      int lllllllllllllllIlIlIIIIIIlIlIlll = (double)lllllllllllllllIlIlIIIIIIlIlllll.func_177956_o();
      double lllllllllllllllIlIlIIIIIIllIIIII = (double)lllllllllllllllIlIlIIIIIIlIlllll.func_177952_p();
      blockEsp(new AxisAlignedBB(lllllllllllllllIlIlIIIIIIllIIIlI, lllllllllllllllIlIlIIIIIIlIlIlll, lllllllllllllllIlIlIIIIIIllIIIII, lllllllllllllllIlIlIIIIIIllIIIlI + lllllllllllllllIlIlIIIIIIllIIIll, lllllllllllllllIlIlIIIIIIlIlIlll + 1.0D, lllllllllllllllIlIlIIIIIIllIIIII + lllllllllllllllIlIlIIIIIIllIIlII), lllllllllllllllIlIlIIIIIIlIllllI, lllllllllllllllIlIlIIIIIIllIIlll, lllllllllllllllIlIlIIIIIIllIIllI, lllllllllllllllIlIlIIIIIIlIllIll);
   }

   private static String lIlIIIlIlIIIll(String lllllllllllllllIlIIllllllIllllII, String lllllllllllllllIlIIlllllllIIIIII) {
      lllllllllllllllIlIIllllllIllllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllllIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIllllllIllllll = new StringBuilder();
      char lllllllllllllllIlIIllllllIlllIIl = lllllllllllllllIlIIlllllllIIIIII.toCharArray();
      int lllllllllllllllIlIIllllllIllllIl = lllllIIlIllI[1];
      char lllllllllllllllIlIIllllllIllIlll = lllllllllllllllIlIIllllllIllllII.toCharArray();
      short lllllllllllllllIlIIllllllIllIllI = lllllllllllllllIlIIllllllIllIlll.length;
      int lllllllllllllllIlIIllllllIllIlIl = lllllIIlIllI[1];

      do {
         if (!lIlIIIlIlIlIII(lllllllllllllllIlIIllllllIllIlIl, lllllllllllllllIlIIllllllIllIllI)) {
            return String.valueOf(lllllllllllllllIlIIllllllIllllll);
         }

         Exception lllllllllllllllIlIIllllllIllIlII = lllllllllllllllIlIIllllllIllIlll[lllllllllllllllIlIIllllllIllIlIl];
         lllllllllllllllIlIIllllllIllllll.append((char)(lllllllllllllllIlIIllllllIllIlII ^ lllllllllllllllIlIIllllllIlllIIl[lllllllllllllllIlIIllllllIllllIl % lllllllllllllllIlIIllllllIlllIIl.length]));
         "".length();
         ++lllllllllllllllIlIIllllllIllllIl;
         ++lllllllllllllllIlIIllllllIllIlIl;
         "".length();
      } while(null == null);

      return null;
   }

   public static void circleESP(BlockPos lllllllllllllllIlIlIIIIIlIIIllII, double lllllllllllllllIlIlIIIIIlIIlIlII, Color lllllllllllllllIlIlIIIIIlIIIlIIl) throws Exception {
      RenderManager var10001 = mc.func_175598_ae();
      String[] var10002 = new String[lllllIIlIllI[0]];
      var10002[lllllIIlIllI[1]] = lllllIIlIlIl[lllllIIlIllI[1]];
      var10002[lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[2]];
      boolean lllllllllllllllIlIlIIIIIlIIIlIII = (Double)ObfuscationReflectionHelper.getPrivateValue(RenderManager.class, var10001, var10002);
      var10001 = mc.func_175598_ae();
      var10002 = new String[lllllIIlIllI[0]];
      var10002[lllllIIlIllI[1]] = lllllIIlIlIl[lllllIIlIllI[0]];
      var10002[lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[3]];
      float lllllllllllllllIlIlIIIIIlIIIIlll = (Double)ObfuscationReflectionHelper.getPrivateValue(RenderManager.class, var10001, var10002);
      var10001 = mc.func_175598_ae();
      var10002 = new String[lllllIIlIllI[0]];
      var10002[lllllIIlIllI[1]] = lllllIIlIlIl[lllllIIlIllI[4]];
      var10002[lllllIIlIllI[2]] = lllllIIlIlIl[lllllIIlIllI[5]];
      short lllllllllllllllIlIlIIIIIlIIIIllI = (Double)ObfuscationReflectionHelper.getPrivateValue(RenderManager.class, var10001, var10002);
      String lllllllllllllllIlIlIIIIIlIIIIlIl = (double)lllllllllllllllIlIlIIIIIlIIIllII.func_177958_n() + 0.5D - lllllllllllllllIlIlIIIIIlIIIlIII;
      double lllllllllllllllIlIlIIIIIlIIIlllI = (double)lllllllllllllllIlIlIIIIIlIIIllII.func_177956_o() - lllllllllllllllIlIlIIIIIlIIIIlll;
      double lllllllllllllllIlIlIIIIIlIIIllIl = (double)lllllllllllllllIlIlIIIIIlIIIllII.func_177952_p() + 0.5D - lllllllllllllllIlIlIIIIIlIIIIllI;
      GL11.glPushMatrix();
      GL11.glBlendFunc(lllllIIlIllI[6], lllllIIlIllI[7]);
      GL11.glEnable(lllllIIlIllI[8]);
      GL11.glLineWidth(2.0F);
      GL11.glDisable(lllllIIlIllI[9]);
      GL11.glDisable(lllllIIlIllI[10]);
      GL11.glDepthMask((boolean)lllllIIlIllI[1]);
      GL11.glColor4d((double)((float)lllllllllllllllIlIlIIIIIlIIIlIIl.getRed() / 255.0F), (double)((float)lllllllllllllllIlIlIIIIIlIIIlIIl.getGreen() / 255.0F), (double)((float)lllllllllllllllIlIlIIIIIlIIIlIIl.getBlue() / 255.0F), 0.25D);
      GL11.glBegin(lllllIIlIllI[11]);
      int lllllllllllllllIlIlIIIIIlIIIlIll = lllllIIlIllI[1];

      do {
         if (!lIlIIIlIlIIlll(lllllllllllllllIlIlIIIIIlIIIlIll, lllllIIlIllI[12])) {
            GL11.glEnd();
            GL11.glLineWidth(2.0F);
            GL11.glEnable(lllllIIlIllI[9]);
            GL11.glEnable(lllllIIlIllI[10]);
            GL11.glDepthMask((boolean)lllllIIlIllI[2]);
            GL11.glDisable(lllllIIlIllI[8]);
            GL11.glPopMatrix();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            return;
         }

         GL11.glVertex3d(lllllllllllllllIlIlIIIIIlIIIIlIl + Math.sin((double)lllllllllllllllIlIlIIIIIlIIIlIll * 3.141592653589793D / 180.0D) * lllllllllllllllIlIlIIIIIlIIlIlII, lllllllllllllllIlIlIIIIIlIIIlllI, lllllllllllllllIlIlIIIIIlIIIllIl + Math.cos((double)lllllllllllllllIlIlIIIIIlIIIlIll * 3.141592653589793D / 180.0D) * lllllllllllllllIlIlIIIIIlIIlIlII);
         ++lllllllllllllllIlIlIIIIIlIIIlIll;
         "".length();
      } while("   ".length() > ((30 ^ 53 ^ "   ".length() << (" ".length() << " ".length())) << " ".length() & (((40 ^ 17) << " ".length() ^ 108 ^ 57) << " ".length() ^ -" ".length())));

   }
}
