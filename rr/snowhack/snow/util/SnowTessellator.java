package rr.snowhack.snow.util;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class SnowTessellator extends Tessellator {
   // $FF: synthetic field
   public static SnowTessellator INSTANCE;
   // $FF: synthetic field
   private static final int[] lIIIIIlIIlIII;

   public static void drawBox2(AxisAlignedBB lllllllllllllllIlIIIlIlIIIllIllI, int lllllllllllllllIlIIIlIlIIIllIlIl, int lllllllllllllllIlIIIlIlIIIllllII, int lllllllllllllllIlIIIlIlIIIllIIll, int lllllllllllllllIlIIIlIlIIIlllIlI, int lllllllllllllllIlIIIlIlIIIlllIIl) {
      Tessellator lllllllllllllllIlIIIlIlIIIlllIII = Tessellator.func_178181_a();
      short lllllllllllllllIlIIIlIlIIIlIllll = lllllllllllllllIlIIIlIlIIIlllIII.func_178180_c();
      lllllllllllllllIlIIIlIlIIIlIllll.func_181668_a(lIIIIIlIIlIII[23], DefaultVertexFormats.field_181706_f);
      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIIlllIIl & lIIIIIlIIlIII[4])) {
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIIlllIIl & lIIIIIlIIlIII[9])) {
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIIlllIIl & lIIIIIlIIlIII[10])) {
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIIlllIIl & lIIIIIlIIlIII[8])) {
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIIlllIIl & lIIIIIlIIlIII[7])) {
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72340_a, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIIlllIIl & lIIIIIlIIlIII[11])) {
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72338_b, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
         lllllllllllllllIlIIIlIlIIIlIllll.func_181662_b(lllllllllllllllIlIIIlIlIIIllIllI.field_72336_d, lllllllllllllllIlIIIlIlIIIllIllI.field_72337_e, lllllllllllllllIlIIIlIlIIIllIllI.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIlIIIllIlIl, lllllllllllllllIlIIIlIlIIIllllII, lllllllllllllllIlIIIlIlIIIllIIll, lllllllllllllllIlIIIlIlIIIlllIlI).func_181675_d();
      }

      lllllllllllllllIlIIIlIlIIIlllIII.func_78381_a();
   }

   public static void drawPlane(BlockPos lllllllllllllllIlIIIlIIlIllIIllI, int lllllllllllllllIlIIIlIIlIllIIlIl, int lllllllllllllllIlIIIlIIlIlIlllIl) {
      boolean lllllllllllllllIlIIIlIIlIlIlllII = lllllllllllllllIlIIIlIIlIllIIlIl >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      boolean lllllllllllllllIlIIIlIIlIlIllIll = lllllllllllllllIlIIIlIIlIllIIlIl >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      byte lllllllllllllllIlIIIlIIlIlIllIlI = lllllllllllllllIlIIIlIIlIllIIlIl >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIIlIllIIIII = lllllllllllllllIlIIIlIIlIllIIlIl & lIIIIIlIIlIII[6];
      drawPlane(lllllllllllllllIlIIIlIIlIllIIllI, lllllllllllllllIlIIIlIIlIlIllIll, lllllllllllllllIlIIIlIIlIlIllIlI, lllllllllllllllIlIIIlIIlIllIIIII, lllllllllllllllIlIIIlIIlIlIlllII, lllllllllllllllIlIIIlIIlIlIlllIl);
   }

   public static void drawLinesWithVec3d(Vec3d lllllllllllllllIlIIIlIIllIIIlIll, int lllllllllllllllIlIIIlIIllIIIlIlI, int lllllllllllllllIlIIIlIIllIIIlIIl, int lllllllllllllllIlIIIlIIllIIIlIII, int lllllllllllllllIlIIIlIIllIIIIlll, int lllllllllllllllIlIIIlIIllIIIIllI) {
      drawLines(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIIllIIIlIll.field_72450_a, (float)lllllllllllllllIlIIIlIIllIIIlIll.field_72448_b, (float)lllllllllllllllIlIIIlIIllIIIlIll.field_72449_c, 1.0F, 2.0F, 1.0F, lllllllllllllllIlIIIlIIllIIIlIlI, lllllllllllllllIlIIIlIIllIIIlIIl, lllllllllllllllIlIIIlIIllIIIlIII, lllllllllllllllIlIIIlIIllIIIIlll, lllllllllllllllIlIIIlIIllIIIIllI);
   }

   public static void drawLines(BlockPos lllllllllllllllIlIIIlIlIIlllIIII, int lllllllllllllllIlIIIlIlIIlllIlIl, int lllllllllllllllIlIIIlIlIIlllIlII, int lllllllllllllllIlIIIlIlIIllIllIl, int lllllllllllllllIlIIIlIlIIlllIIlI, int lllllllllllllllIlIIIlIlIIllIlIll) {
      drawLines(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIlIIlllIIII.field_177962_a, (float)lllllllllllllllIlIIIlIlIIlllIIII.field_177960_b, (float)lllllllllllllllIlIIIlIlIIlllIIII.field_177961_c, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIlIIlllIlIl, lllllllllllllllIlIIIlIlIIlllIlII, lllllllllllllllIlIIIlIlIIllIllIl, lllllllllllllllIlIIIlIlIIlllIIlI, lllllllllllllllIlIIIlIlIIllIlIll);
   }

   public static void drawBoxWithVec3d(Vec3d lllllllllllllllIlIIIlIIlIlllIIll, int lllllllllllllllIlIIIlIIlIlllIIlI, int lllllllllllllllIlIIIlIIlIlllIIIl, int lllllllllllllllIlIIIlIIlIlllIIII, int lllllllllllllllIlIIIlIIlIllIllll, int lllllllllllllllIlIIIlIIlIlllIlII) {
      drawBox(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIIlIlllIIll.field_72450_a, (float)lllllllllllllllIlIIIlIIlIlllIIll.field_72448_b, (float)lllllllllllllllIlIIIlIIlIlllIIll.field_72449_c, 1.0F, 2.0F, 1.0F, lllllllllllllllIlIIIlIIlIlllIIlI, lllllllllllllllIlIIIlIIlIlllIIIl, lllllllllllllllIlIIIlIIlIlllIIII, lllllllllllllllIlIIIlIIlIllIllll, lllllllllllllllIlIIIlIIlIlllIlII);
   }

   public static void drawBoxOutline(BufferBuilder lllllllllllllllIlIIIlIlIlIIlllII, float lllllllllllllllIlIIIlIlIlIlIIlll, float lllllllllllllllIlIIIlIlIlIlIIllI, float lllllllllllllllIlIIIlIlIlIlIIlIl, float lllllllllllllllIlIIIlIlIlIlIIlII, float lllllllllllllllIlIIIlIlIlIlIIIll, float lllllllllllllllIlIIIlIlIlIlIIIlI, int lllllllllllllllIlIIIlIlIlIlIIIIl, int lllllllllllllllIlIIIlIlIlIIlIlIl, int lllllllllllllllIlIIIlIlIlIIlllll, int lllllllllllllllIlIIIlIlIlIIlIIll, int lllllllllllllllIlIIIlIlIlIIlIIlI) {
      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIlIIlIIlI & lIIIIIlIIlIII[4])) {
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII), (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII), (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl + 0.02D).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl + 0.02D).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll + 0.02D, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll + 0.02D, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI)).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI)).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII), (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI) - 0.02D).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII), (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI)).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI)).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)lllllllllllllllIlIIIlIlIlIlIIlll, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI) - 0.02D).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII), (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII), (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI)).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII) - 0.02D, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)(lllllllllllllllIlIIIlIlIlIlIIlIl + lllllllllllllllIlIIIlIlIlIlIIIlI)).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
         lllllllllllllllIlIIIlIlIlIIlllII.func_181662_b((double)(lllllllllllllllIlIIIlIlIlIlIIlll + lllllllllllllllIlIIIlIlIlIlIIlII) - 0.02D, (double)lllllllllllllllIlIIIlIlIlIlIIllI, (double)lllllllllllllllIlIIIlIlIlIlIIlIl).func_181669_b(lllllllllllllllIlIIIlIlIlIlIIIIl, lllllllllllllllIlIIIlIlIlIIlIlIl, lllllllllllllllIlIIIlIlIlIIlllll, lllllllllllllllIlIIIlIlIlIIlIIll).func_181675_d();
      }

   }

   public static void drawFaceOutline(BufferBuilder lllllllllllllllIlIIIlIllIIIIllII, float lllllllllllllllIlIIIlIllIIIIlIll, float lllllllllllllllIlIIIlIllIIIIlIlI, float lllllllllllllllIlIIIlIlIllllllIl, float lllllllllllllllIlIIIlIlIllllllII, float lllllllllllllllIlIIIlIllIIIIIlll, float lllllllllllllllIlIIIlIlIlllllIll, int lllllllllllllllIlIIIlIllIIIIIlIl, int lllllllllllllllIlIIIlIlIlllllIIl, int lllllllllllllllIlIIIlIllIIIIIIll, int lllllllllllllllIlIIIlIllIIIIIIlI, int lllllllllllllllIlIIIlIllIIIIIIIl) {
      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIIIIIIIl & lIIIIIlIIlIII[4])) {
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII), (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII), (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl + 0.02D).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl + 0.02D).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll + 0.02D, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll + 0.02D, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll)).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll)).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII), (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll) - 0.02D).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII), (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll)).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll)).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)lllllllllllllllIlIIIlIllIIIIlIll, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll) - 0.02D).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII), (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII), (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll)).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII) - 0.02D, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)(lllllllllllllllIlIIIlIlIllllllIl + lllllllllllllllIlIIIlIlIlllllIll)).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
         lllllllllllllllIlIIIlIllIIIIllII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIIIlIll + lllllllllllllllIlIIIlIlIllllllII) - 0.02D, (double)lllllllllllllllIlIIIlIllIIIIlIlI, (double)lllllllllllllllIlIIIlIlIllllllIl).func_181669_b(lllllllllllllllIlIIIlIllIIIIIlIl, lllllllllllllllIlIIIlIlIlllllIIl, lllllllllllllllIlIIIlIllIIIIIIll, lllllllllllllllIlIIIlIllIIIIIIlI).func_181675_d();
      }

   }

   public static void drawBox(float lllllllllllllllIlIIIlIlllIllIIIl, float lllllllllllllllIlIIIlIlllIlllIIl, float lllllllllllllllIlIIIlIlllIlIllll, int lllllllllllllllIlIIIlIlllIlIlllI, int lllllllllllllllIlIIIlIlllIlIllIl) {
      double lllllllllllllllIlIIIlIlllIlIllII = lllllllllllllllIlIIIlIlllIlIlllI >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlllIlIlIll = lllllllllllllllIlIIIlIlllIlIlllI >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlllIllIIll = lllllllllllllllIlIIIlIlllIlIlllI >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlllIllIIlI = lllllllllllllllIlIIIlIlllIlIlllI & lIIIIIlIIlIII[6];
      drawBox(INSTANCE.func_178180_c(), lllllllllllllllIlIIIlIlllIllIIIl, lllllllllllllllIlIIIlIlllIlllIIl, lllllllllllllllIlIIIlIlllIlIllll, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIlllIlIlIll, lllllllllllllllIlIIIlIlllIllIIll, lllllllllllllllIlIIIlIlllIllIIlI, lllllllllllllllIlIIIlIlllIlIllII, lllllllllllllllIlIIIlIlllIlIllIl);
   }

   public static void drawBox(BlockPos lllllllllllllllIlIIIlIlllIIlllII, int lllllllllllllllIlIIIlIlllIlIIIIl, int lllllllllllllllIlIIIlIlllIIllIlI, int lllllllllllllllIlIIIlIlllIIlllll, int lllllllllllllllIlIIIlIlllIIllllI, int lllllllllllllllIlIIIlIlllIIlllIl) {
      drawBox(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIlllIIlllII.field_177962_a, (float)lllllllllllllllIlIIIlIlllIIlllII.field_177960_b, (float)lllllllllllllllIlIIIlIlllIIlllII.field_177961_c, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIlllIlIIIIl, lllllllllllllllIlIIIlIlllIIllIlI, lllllllllllllllIlIIIlIlllIIlllll, lllllllllllllllIlIIIlIlllIIllllI, lllllllllllllllIlIIIlIlllIIlllIl);
   }

   public static void drawFullBox(AxisAlignedBB lllllllllllllllIlIIIlIIlllllIIll, BlockPos lllllllllllllllIlIIIlIIllllllIlI, float lllllllllllllllIlIIIlIIllllllIIl, int lllllllllllllllIlIIIlIIllllllIII) {
      int lllllllllllllllIlIIIlIIllllIllll = lllllllllllllllIlIIIlIIllllllIII >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      boolean lllllllllllllllIlIIIlIIllllIlllI = lllllllllllllllIlIIIlIIllllllIII >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIIllllIllIl = lllllllllllllllIlIIIlIIllllllIII >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIIlllllIlII = lllllllllllllllIlIIIlIIllllllIII & lIIIIIlIIlIII[6];
      drawFullBox(lllllllllllllllIlIIIlIIlllllIIll, lllllllllllllllIlIIIlIIllllllIlI, lllllllllllllllIlIIIlIIllllllIIl, lllllllllllllllIlIIIlIIllllIlllI, lllllllllllllllIlIIIlIIllllIllIl, lllllllllllllllIlIIIlIIlllllIlII, lllllllllllllllIlIIIlIIllllIllll);
   }

   public static void prepareGL() {
      GL11.glBlendFunc(lIIIIIlIIlIII[1], lIIIIIlIIlIII[2]);
      GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
      GlStateManager.func_187441_d(1.5F);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIIIIlIIlIII[3]);
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179140_f();
      GlStateManager.func_179129_p();
      GlStateManager.func_179141_d();
      GlStateManager.func_179124_c(1.0F, 1.0F, 1.0F);
   }

   public static void drawFace(BufferBuilder lllllllllllllllIlIIIlIllIlIIIIII, float lllllllllllllllIlIIIlIllIIllIIll, float lllllllllllllllIlIIIlIllIIllIIlI, float lllllllllllllllIlIIIlIllIIllIIIl, float lllllllllllllllIlIIIlIllIIllIIII, float lllllllllllllllIlIIIlIllIIlllIll, float lllllllllllllllIlIIIlIllIIlllIlI, int lllllllllllllllIlIIIlIllIIlllIIl, int lllllllllllllllIlIIIlIllIIlllIII, int lllllllllllllllIlIIIlIllIIllIlll, int lllllllllllllllIlIIIlIllIIllIllI, int lllllllllllllllIlIIIlIllIIlIlIlI) {
      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIIlIlIlI & lIIIIIlIIlIII[4])) {
         lllllllllllllllIlIIIlIllIlIIIIII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIllIIll + lllllllllllllllIlIIIlIllIIllIIII), (double)lllllllllllllllIlIIIlIllIIllIIlI, (double)lllllllllllllllIlIIIlIllIIllIIIl).func_181669_b(lllllllllllllllIlIIIlIllIIlllIIl, lllllllllllllllIlIIIlIllIIlllIII, lllllllllllllllIlIIIlIllIIllIlll, lllllllllllllllIlIIIlIllIIllIllI).func_181675_d();
         lllllllllllllllIlIIIlIllIlIIIIII.func_181662_b((double)(lllllllllllllllIlIIIlIllIIllIIll + lllllllllllllllIlIIIlIllIIllIIII), (double)lllllllllllllllIlIIIlIllIIllIIlI, (double)(lllllllllllllllIlIIIlIllIIllIIIl + lllllllllllllllIlIIIlIllIIlllIlI)).func_181669_b(lllllllllllllllIlIIIlIllIIlllIIl, lllllllllllllllIlIIIlIllIIlllIII, lllllllllllllllIlIIIlIllIIllIlll, lllllllllllllllIlIIIlIllIIllIllI).func_181675_d();
         lllllllllllllllIlIIIlIllIlIIIIII.func_181662_b((double)lllllllllllllllIlIIIlIllIIllIIll, (double)lllllllllllllllIlIIIlIllIIllIIlI, (double)(lllllllllllllllIlIIIlIllIIllIIIl + lllllllllllllllIlIIIlIllIIlllIlI)).func_181669_b(lllllllllllllllIlIIIlIllIIlllIIl, lllllllllllllllIlIIIlIllIIlllIII, lllllllllllllllIlIIIlIllIIllIlll, lllllllllllllllIlIIIlIllIIllIllI).func_181675_d();
         lllllllllllllllIlIIIlIllIlIIIIII.func_181662_b((double)lllllllllllllllIlIIIlIllIIllIIll, (double)lllllllllllllllIlIIIlIllIIllIIlI, (double)lllllllllllllllIlIIIlIllIIllIIIl).func_181669_b(lllllllllllllllIlIIIlIllIIlllIIl, lllllllllllllllIlIIIlIllIIlllIII, lllllllllllllllIlIIIlIllIIllIlll, lllllllllllllllIlIIIlIllIIllIllI).func_181675_d();
      }

   }

   public static void drawBoundingBox(AxisAlignedBB lllllllllllllllIlIIIlIIlllIIllll, float lllllllllllllllIlIIIlIIlllIIIlll, int lllllllllllllllIlIIIlIIlllIIIllI) {
      int lllllllllllllllIlIIIlIIlllIIllII = lllllllllllllllIlIIIlIIlllIIIllI >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      boolean lllllllllllllllIlIIIlIIlllIIIlII = lllllllllllllllIlIIIlIIlllIIIllI >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIIlllIIlIlI = lllllllllllllllIlIIIlIIlllIIIllI >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      Exception lllllllllllllllIlIIIlIIlllIIIIlI = lllllllllllllllIlIIIlIIlllIIIllI & lIIIIIlIIlIII[6];
      drawBoundingBox(lllllllllllllllIlIIIlIIlllIIllll, lllllllllllllllIlIIIlIIlllIIIlll, lllllllllllllllIlIIIlIIlllIIIlII, lllllllllllllllIlIIIlIIlllIIlIlI, lllllllllllllllIlIIIlIIlllIIIIlI, lllllllllllllllIlIIIlIIlllIIllII);
   }

   private static void lIlIlIIIlIIlIl() {
      lIIIIIlIIlIII = new int[29];
      lIIIIIlIIlIII[0] = " ".length() << (124 ^ 109 ^ " ".length() << (" ".length() << " ".length()));
      lIIIIIlIIlIII[1] = 261 + 259 - 433 + 298 << " ".length();
      lIIIIIlIIlIII[2] = 345 + 628 - 888 + 686;
      lIIIIIlIIlIII[3] = ((122 ^ 99) << " ".length() ^ 76 ^ 49) & ((138 ^ 169) << (" ".length() << " ".length()) ^ 56 + 172 - 62 + 29 ^ -" ".length());
      lIIIIIlIIlIII[4] = " ".length();
      lIIIIIlIIlIII[5] = "   ".length() << "   ".length();
      lIIIIIlIIlIII[6] = 7 + 75 - 12 + 185;
      lIIIIIlIIlIII[7] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIIlIIlIII[8] = " ".length() << "   ".length();
      lIIIIIlIIlIII[9] = " ".length() << " ".length();
      lIIIIIlIIlIII[10] = " ".length() << (" ".length() << " ".length());
      lIIIIIlIIlIII[11] = " ".length() << (16 ^ 21);
      lIIIIIlIIlIII[12] = 190 ^ 175;
      lIIIIIlIIlIII[13] = ((250 ^ 183) << " ".length() ^ 113 + 107 - 151 + 78) << " ".length();
      lIIIIIlIIlIII[14] = 101 ^ 68;
      lIIIIIlIIlIII[15] = (168 ^ 185) << " ".length();
      lIIIIIlIIlIII[16] = 29 ^ 24;
      lIIIIIlIIlIII[17] = "   ".length() << " ".length();
      lIIIIIlIIlIII[18] = "   ".length() << (34 ^ 39) ^ 91 ^ 50;
      lIIIIIlIIlIII[19] = (70 ^ 67) << " ".length();
      lIIIIIlIIlIII[20] = (187 ^ 134 ^ (137 ^ 142) << "   ".length()) << (" ".length() << " ".length());
      lIIIIIlIIlIII[21] = (153 ^ 196 ^ (49 ^ 36) << (" ".length() << " ".length())) << (" ".length() << " ".length());
      lIIIIIlIIlIII[22] = (76 ^ 73) << "   ".length();
      lIIIIIlIIlIII[23] = 198 ^ 193;
      lIIIIIlIIlIII[24] = 111 ^ 80;
      lIIIIIlIIlIII[25] = (70 ^ 31) << (136 ^ 141);
      lIIIIIlIIlIII[26] = 998 + 365 - 474 + 658 + (267 + 207 - 244 + 75 << (" ".length() << " ".length())) - ((110 ^ 59) << (110 ^ 107)) + (682 + 697 - 1330 + 716 << " ".length()) << " ".length();
      lIIIIIlIIlIII[27] = 1305 + 318 - -318 + 236 << " ".length();
      lIIIIIlIIlIII[28] = "   ".length();
   }

   public static void drawFullBox2(AxisAlignedBB lllllllllllllllIlIIIlIlIIIlIIllI, BlockPos lllllllllllllllIlIIIlIlIIIlIIlIl, float lllllllllllllllIlIIIlIlIIIIlllII, int lllllllllllllllIlIIIlIlIIIIllIll) {
      int lllllllllllllllIlIIIlIlIIIlIIIlI = lllllllllllllllIlIIIlIlIIIIllIll >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      long lllllllllllllllIlIIIlIlIIIIllIIl = lllllllllllllllIlIIIlIlIIIIllIll >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      String lllllllllllllllIlIIIlIlIIIIllIII = lllllllllllllllIlIIIlIlIIIIllIll >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlIIIIlllll = lllllllllllllllIlIIIlIlIIIIllIll & lIIIIIlIIlIII[6];
      drawFullBox2(lllllllllllllllIlIIIlIlIIIlIIllI, lllllllllllllllIlIIIlIlIIIlIIlIl, lllllllllllllllIlIIIlIlIIIIlllII, lllllllllllllllIlIIIlIlIIIIllIIl, lllllllllllllllIlIIIlIlIIIIllIII, lllllllllllllllIlIIIlIlIIIIlllll, lllllllllllllllIlIIIlIlIIIlIIIlI);
   }

   public static void drawFace(BlockPos lllllllllllllllIlIIIlIllIlIlIIIl, int lllllllllllllllIlIIIlIllIlIlIIII, int lllllllllllllllIlIIIlIllIlIIllll, int lllllllllllllllIlIIIlIllIlIIlllI, int lllllllllllllllIlIIIlIllIlIlIIll, int lllllllllllllllIlIIIlIllIlIlIIlI) {
      drawFace(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIllIlIlIIIl.field_177962_a, (float)lllllllllllllllIlIIIlIllIlIlIIIl.field_177960_b, (float)lllllllllllllllIlIIIlIllIlIlIIIl.field_177961_c, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIllIlIlIIII, lllllllllllllllIlIIIlIllIlIIllll, lllllllllllllllIlIIIlIllIlIIlllI, lllllllllllllllIlIIIlIllIlIlIIll, lllllllllllllllIlIIIlIllIlIlIIlI);
   }

   public static void releaseGL() {
      GlStateManager.func_179089_o();
      GlStateManager.func_179132_a((boolean)lIIIIIlIIlIII[4]);
      GlStateManager.func_179098_w();
      GlStateManager.func_179147_l();
      GlStateManager.func_179126_j();
   }

   public static void release() {
      render();
      releaseGL();
   }

   public static void drawLines(BufferBuilder lllllllllllllllIlIIIlIlIIlIlIIlI, float lllllllllllllllIlIIIlIlIIlIlIIIl, float lllllllllllllllIlIIIlIlIIlIlllII, float lllllllllllllllIlIIIlIlIIlIIllll, float lllllllllllllllIlIIIlIlIIlIllIlI, float lllllllllllllllIlIIIlIlIIlIllIIl, float lllllllllllllllIlIIIlIlIIlIllIII, int lllllllllllllllIlIIIlIlIIlIIlIll, int lllllllllllllllIlIIIlIlIIlIlIllI, int lllllllllllllllIlIIIlIlIIlIIlIIl, int lllllllllllllllIlIIIlIlIIlIlIlII, int lllllllllllllllIlIIIlIlIIlIIIlll) {
      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[12])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[13])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[14])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[15])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[16])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[17])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[18])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[19])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[20])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[21])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)lllllllllllllllIlIIIlIlIIlIIllll).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[5])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)lllllllllllllllIlIIIlIlIIlIlIIIl, (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIlIIlIIIlll & lIIIIIlIIlIII[22])) {
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)lllllllllllllllIlIIIlIlIIlIlllII, (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
         lllllllllllllllIlIIIlIlIIlIlIIlI.func_181662_b((double)(lllllllllllllllIlIIIlIlIIlIlIIIl + lllllllllllllllIlIIIlIlIIlIllIlI), (double)(lllllllllllllllIlIIIlIlIIlIlllII + lllllllllllllllIlIIIlIlIIlIllIIl), (double)(lllllllllllllllIlIIIlIlIIlIIllll + lllllllllllllllIlIIIlIlIIlIllIII)).func_181669_b(lllllllllllllllIlIIIlIlIIlIIlIll, lllllllllllllllIlIIIlIlIIlIlIllI, lllllllllllllllIlIIIlIlIIlIIlIIl, lllllllllllllllIlIIIlIlIIlIlIlII).func_181675_d();
      }

   }

   public SnowTessellator() {
      super(lIIIIIlIIlIII[0]);
   }

   public static void drawBox(BlockPos lllllllllllllllIlIIIlIllllIlIIIl, int lllllllllllllllIlIIIlIllllIlIIII, int lllllllllllllllIlIIIlIllllIIllll) {
      int lllllllllllllllIlIIIlIllllIIlllI = lllllllllllllllIlIIIlIllllIlIIII >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIllllIIllIl = lllllllllllllllIlIIIlIllllIlIIII >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIllllIIllII = lllllllllllllllIlIIIlIllllIlIIII >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIllllIIlIll = lllllllllllllllIlIIIlIllllIlIIII & lIIIIIlIIlIII[6];
      drawBox(lllllllllllllllIlIIIlIllllIlIIIl, lllllllllllllllIlIIIlIllllIIllIl, lllllllllllllllIlIIIlIllllIIllII, lllllllllllllllIlIIIlIllllIIlIll, lllllllllllllllIlIIIlIllllIIlllI, lllllllllllllllIlIIIlIllllIIllll);
   }

   public static void drawBoundingBoxFace(AxisAlignedBB lllllllllllllllIlIIIlIIllIIllIIl, float lllllllllllllllIlIIIlIIllIIllIII, int lllllllllllllllIlIIIlIIllIIlIlll, int lllllllllllllllIlIIIlIIllIIlIllI, int lllllllllllllllIlIIIlIIllIIlIlIl, int lllllllllllllllIlIIIlIIllIIlIlII) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a(lIIIIIlIIlIII[1], lIIIIIlIIlIII[2], lIIIIIlIIlIII[3], lIIIIIlIIlIII[4]);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIIIIlIIlIII[3]);
      GL11.glEnable(lIIIIIlIIlIII[25]);
      GL11.glHint(lIIIIIlIIlIII[26], lIIIIIlIIlIII[27]);
      GL11.glLineWidth(lllllllllllllllIlIIIlIIllIIllIII);
      float lllllllllllllllIlIIIlIIllIIlIIll = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIlIIIlIIllIIllIlI = lllllllllllllllIlIIIlIIllIIlIIll.func_178180_c();
      lllllllllllllllIlIIIlIIllIIllIlI.func_181668_a(lIIIIIlIIlIII[28], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIlIIIlIIllIIllIlI.func_181662_b(lllllllllllllllIlIIIlIIllIIllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIIllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIIllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIIlIlll, lllllllllllllllIlIIIlIIllIIlIllI, lllllllllllllllIlIIIlIIllIIlIlIl, lllllllllllllllIlIIIlIIllIIlIlII).func_181675_d();
      lllllllllllllllIlIIIlIIllIIllIlI.func_181662_b(lllllllllllllllIlIIIlIIllIIllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIIllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIIllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIIlIlll, lllllllllllllllIlIIIlIIllIIlIllI, lllllllllllllllIlIIIlIIllIIlIlIl, lllllllllllllllIlIIIlIIllIIlIlII).func_181675_d();
      lllllllllllllllIlIIIlIIllIIllIlI.func_181662_b(lllllllllllllllIlIIIlIIllIIllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIIllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIIllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIIlIlll, lllllllllllllllIlIIIlIIllIIlIllI, lllllllllllllllIlIIIlIIllIIlIlIl, lllllllllllllllIlIIIlIIllIIlIlII).func_181675_d();
      lllllllllllllllIlIIIlIIllIIllIlI.func_181662_b(lllllllllllllllIlIIIlIIllIIllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIIllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIIllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIIlIlll, lllllllllllllllIlIIIlIIllIIlIllI, lllllllllllllllIlIIIlIIllIIlIlIl, lllllllllllllllIlIIIlIIllIIlIlII).func_181675_d();
      lllllllllllllllIlIIIlIIllIIllIlI.func_181662_b(lllllllllllllllIlIIIlIIllIIllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIIllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIIllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIIlIlll, lllllllllllllllIlIIIlIIllIIlIllI, lllllllllllllllIlIIIlIIllIIlIlIl, lllllllllllllllIlIIIlIIllIIlIlII).func_181675_d();
      lllllllllllllllIlIIIlIIllIIlIIll.func_78381_a();
      GL11.glDisable(lIIIIIlIIlIII[25]);
      GlStateManager.func_179132_a((boolean)lIIIIIlIIlIII[4]);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
   }

   public static void drawPlane(BlockPos lllllllllllllllIlIIIlIIlIlIlIIlI, int lllllllllllllllIlIIIlIIlIlIIlIll, int lllllllllllllllIlIIIlIIlIlIlIIII, int lllllllllllllllIlIIIlIIlIlIIllll, int lllllllllllllllIlIIIlIIlIlIIlllI, int lllllllllllllllIlIIIlIIlIlIIllIl) {
      drawBox(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIIlIlIlIIlI.field_177962_a, (float)lllllllllllllllIlIIIlIIlIlIlIIlI.field_177960_b, (float)lllllllllllllllIlIIIlIIlIlIlIIlI.field_177961_c, 1.0F, 0.0F, 1.0F, lllllllllllllllIlIIIlIIlIlIIlIll, lllllllllllllllIlIIIlIIlIlIlIIII, lllllllllllllllIlIIIlIIlIlIIllll, lllllllllllllllIlIIIlIIlIlIIlllI, lllllllllllllllIlIIIlIIlIlIIllIl);
   }

   public static void drawBox(BufferBuilder lllllllllllllllIlIIIlIllIllllllI, float lllllllllllllllIlIIIlIlllIIIlIIl, float lllllllllllllllIlIIIlIlllIIIlIII, float lllllllllllllllIlIIIlIllIllllIll, float lllllllllllllllIlIIIlIlllIIIIllI, float lllllllllllllllIlIIIlIllIllllIIl, float lllllllllllllllIlIIIlIllIllllIII, int lllllllllllllllIlIIIlIllIlllIlll, int lllllllllllllllIlIIIlIllIlllIllI, int lllllllllllllllIlIIIlIlllIIIIIIl, int lllllllllllllllIlIIIlIlllIIIIIII, int lllllllllllllllIlIIIlIllIlllIIll) {
      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIlllIIll & lIIIIIlIIlIII[4])) {
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIlllIIll & lIIIIIlIIlIII[9])) {
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIlllIIll & lIIIIIlIIlIII[10])) {
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIlllIIll & lIIIIIlIIlIII[8])) {
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIlllIIll & lIIIIIlIIlIII[7])) {
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)lllllllllllllllIlIIIlIlllIIIlIIl, (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
      }

      if (lIlIlIIIlIIllI(lllllllllllllllIlIIIlIllIlllIIll & lIIIIIlIIlIII[11])) {
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)lllllllllllllllIlIIIlIlllIIIlIII, (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)lllllllllllllllIlIIIlIllIllllIll).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
         lllllllllllllllIlIIIlIllIllllllI.func_181662_b((double)(lllllllllllllllIlIIIlIlllIIIlIIl + lllllllllllllllIlIIIlIlllIIIIllI), (double)(lllllllllllllllIlIIIlIlllIIIlIII + lllllllllllllllIlIIIlIllIllllIIl), (double)(lllllllllllllllIlIIIlIllIllllIll + lllllllllllllllIlIIIlIllIllllIII)).func_181669_b(lllllllllllllllIlIIIlIllIlllIlll, lllllllllllllllIlIIIlIllIlllIllI, lllllllllllllllIlIIIlIlllIIIIIIl, lllllllllllllllIlIIIlIlllIIIIIII).func_181675_d();
      }

   }

   public static void drawLines(BlockPos lllllllllllllllIlIIIlIlIlIIIlIlI, int lllllllllllllllIlIIIlIlIlIIIlIIl, int lllllllllllllllIlIIIlIlIlIIIIIIl) {
      int lllllllllllllllIlIIIlIlIlIIIIlll = lllllllllllllllIlIIIlIlIlIIIlIIl >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlIlIIIIllI = lllllllllllllllIlIIIlIlIlIIIlIIl >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      short lllllllllllllllIlIIIlIlIIllllllI = lllllllllllllllIlIIIlIlIlIIIlIIl >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlIlIIIIlII = lllllllllllllllIlIIIlIlIlIIIlIIl & lIIIIIlIIlIII[6];
      drawLines(lllllllllllllllIlIIIlIlIlIIIlIlI, lllllllllllllllIlIIIlIlIlIIIIllI, lllllllllllllllIlIIIlIlIIllllllI, lllllllllllllllIlIIIlIlIlIIIIlII, lllllllllllllllIlIIIlIlIlIIIIlll, lllllllllllllllIlIIIlIlIlIIIIIIl);
   }

   public static void drawFaceOutline(BlockPos lllllllllllllllIlIIIlIllIIIlllIl, int lllllllllllllllIlIIIlIllIIlIIIlI, int lllllllllllllllIlIIIlIllIIlIIIIl, int lllllllllllllllIlIIIlIllIIIllIlI, int lllllllllllllllIlIIIlIllIIIlllll, int lllllllllllllllIlIIIlIllIIIllllI) {
      drawFaceOutline(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIllIIIlllIl.field_177962_a, (float)lllllllllllllllIlIIIlIllIIIlllIl.field_177960_b, (float)lllllllllllllllIlIIIlIllIIIlllIl.field_177961_c, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIllIIlIIIlI, lllllllllllllllIlIIIlIllIIlIIIIl, lllllllllllllllIlIIIlIllIIIllIlI, lllllllllllllllIlIIIlIllIIIlllll, lllllllllllllllIlIIIlIllIIIllllI);
   }

   public static void begin(int lllllllllllllllIlIIIlIllllIllIIl) {
      INSTANCE.func_178180_c().func_181668_a(lllllllllllllllIlIIIlIllllIllIIl, DefaultVertexFormats.field_181706_f);
   }

   public static void drawFace(BlockPos lllllllllllllllIlIIIlIllIllIIlII, int lllllllllllllllIlIIIlIllIllIlIlI, int lllllllllllllllIlIIIlIllIllIlIIl) {
      boolean lllllllllllllllIlIIIlIllIllIIIIl = lllllllllllllllIlIIIlIllIllIlIlI >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIllIllIIlll = lllllllllllllllIlIIIlIllIllIlIlI >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      boolean lllllllllllllllIlIIIlIllIlIlllll = lllllllllllllllIlIIIlIllIllIlIlI >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIllIllIIlIl = lllllllllllllllIlIIIlIllIllIlIlI & lIIIIIlIIlIII[6];
      drawFace(lllllllllllllllIlIIIlIllIllIIlII, lllllllllllllllIlIIIlIllIllIIlll, lllllllllllllllIlIIIlIllIlIlllll, lllllllllllllllIlIIIlIllIllIIlIl, lllllllllllllllIlIIIlIllIllIIIIl, lllllllllllllllIlIIIlIllIllIlIIl);
   }

   public static void drawFullBox2(AxisAlignedBB lllllllllllllllIlIIIlIlIIIIlIIII, BlockPos lllllllllllllllIlIIIlIlIIIIIllll, float lllllllllllllllIlIIIlIlIIIIIlIII, int lllllllllllllllIlIIIlIlIIIIIllIl, int lllllllllllllllIlIIIlIlIIIIIIllI, int lllllllllllllllIlIIIlIlIIIIIlIll, int lllllllllllllllIlIIIlIlIIIIIIlII) {
      prepare(lIIIIIlIIlIII[23]);
      drawBox2(lllllllllllllllIlIIIlIlIIIIlIIII, lllllllllllllllIlIIIlIlIIIIIllIl, lllllllllllllllIlIIIlIlIIIIIIllI, lllllllllllllllIlIIIlIlIIIIIlIll, lllllllllllllllIlIIIlIlIIIIIIlII, lIIIIIlIIlIII[24]);
      release();
      drawBoundingBox(lllllllllllllllIlIIIlIlIIIIlIIII, lllllllllllllllIlIIIlIlIIIIIlIII, lllllllllllllllIlIIIlIlIIIIIllIl, lllllllllllllllIlIIIlIlIIIIIIllI, lllllllllllllllIlIIIlIlIIIIIlIll, lIIIIIlIIlIII[6]);
   }

   public static void drawItemBox(EntityItem lllllllllllllllIlIIIlIIlIIlIIlIl, int lllllllllllllllIlIIIlIIlIIlIIlII, int lllllllllllllllIlIIIlIIlIIlIIIll, int lllllllllllllllIlIIIlIIlIIlIlIII, int lllllllllllllllIlIIIlIIlIIlIIlll, int lllllllllllllllIlIIIlIIlIIlIIllI) {
      drawBox(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIIlIIlIIlIl.field_70165_t - 0.1F, (float)lllllllllllllllIlIIIlIIlIIlIIlIl.field_70163_u, (float)lllllllllllllllIlIIIlIIlIIlIIlIl.field_70161_v - 0.1F, lllllllllllllllIlIIIlIIlIIlIIlIl.field_70130_N + 0.1F, lllllllllllllllIlIIIlIIlIIlIIlIl.field_70131_O + 0.1F, lllllllllllllllIlIIIlIIlIIlIIlIl.field_70130_N + 0.1F, lllllllllllllllIlIIIlIIlIIlIIlII, lllllllllllllllIlIIIlIIlIIlIIIll, lllllllllllllllIlIIIlIIlIIlIlIII, lllllllllllllllIlIIIlIIlIIlIIlll, lllllllllllllllIlIIIlIIlIIlIIllI);
   }

   public static void drawBoxOutline(float lllllllllllllllIlIIIlIlIllIlIlll, float lllllllllllllllIlIIIlIlIllIlIllI, float lllllllllllllllIlIIIlIlIllIlIlIl, int lllllllllllllllIlIIIlIlIllIlIlII, int lllllllllllllllIlIIIlIlIllIlIIll) {
      boolean lllllllllllllllIlIIIlIlIllIIlIIl = lllllllllllllllIlIIIlIlIllIlIlII >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      long lllllllllllllllIlIIIlIlIllIIlIII = lllllllllllllllIlIIIlIlIllIlIlII >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      float lllllllllllllllIlIIIlIlIllIIIlll = lllllllllllllllIlIIIlIlIllIlIlII >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      Exception lllllllllllllllIlIIIlIlIllIIIllI = lllllllllllllllIlIIIlIlIllIlIlII & lIIIIIlIIlIII[6];
      drawBoxOutline(INSTANCE.func_178180_c(), lllllllllllllllIlIIIlIlIllIlIlll, lllllllllllllllIlIIIlIlIllIlIllI, lllllllllllllllIlIIIlIlIllIlIlIl, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIlIllIIlIII, lllllllllllllllIlIIIlIlIllIIIlll, lllllllllllllllIlIIIlIlIllIIIllI, lllllllllllllllIlIIIlIlIllIIlIIl, lllllllllllllllIlIIIlIlIllIlIIll);
   }

   public static void drawFullBox(AxisAlignedBB lllllllllllllllIlIIIlIIlllIlllIl, BlockPos lllllllllllllllIlIIIlIIlllIlllII, float lllllllllllllllIlIIIlIIlllIllIll, int lllllllllllllllIlIIIlIIllllIIIIl, int lllllllllllllllIlIIIlIIllllIIIII, int lllllllllllllllIlIIIlIIlllIlllll, int lllllllllllllllIlIIIlIIlllIlIlll) {
      prepare(lIIIIIlIIlIII[23]);
      drawBox(lllllllllllllllIlIIIlIIlllIlllII, lllllllllllllllIlIIIlIIllllIIIIl, lllllllllllllllIlIIIlIIllllIIIII, lllllllllllllllIlIIIlIIlllIlllll, lllllllllllllllIlIIIlIIlllIlIlll, lIIIIIlIIlIII[24]);
      release();
      drawBoundingBox(lllllllllllllllIlIIIlIIlllIlllIl, lllllllllllllllIlIIIlIIlllIllIll, lllllllllllllllIlIIIlIIllllIIIIl, lllllllllllllllIlIIIlIIllllIIIII, lllllllllllllllIlIIIlIIlllIlllll, lIIIIIlIIlIII[6]);
   }

   public static void prepare(int lllllllllllllllIlIIIlIllllIlllIl) {
      prepareGL();
      begin(lllllllllllllllIlIIIlIllllIlllIl);
   }

   public static void drawItemBox(EntityItem lllllllllllllllIlIIIlIIlIIllllll, int lllllllllllllllIlIIIlIIlIIllIlll, int lllllllllllllllIlIIIlIIlIIllllIl) {
      int lllllllllllllllIlIIIlIIlIIllllII = lllllllllllllllIlIIIlIIlIIllIlll >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      short lllllllllllllllIlIIIlIIlIIllIlII = lllllllllllllllIlIIIlIIlIIllIlll >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      boolean lllllllllllllllIlIIIlIIlIIllIIll = lllllllllllllllIlIIIlIIlIIllIlll >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      short lllllllllllllllIlIIIlIIlIIllIIlI = lllllllllllllllIlIIIlIIlIIllIlll & lIIIIIlIIlIII[6];
      drawItemBox(lllllllllllllllIlIIIlIIlIIllllll, lllllllllllllllIlIIIlIIlIIllIlII, lllllllllllllllIlIIIlIIlIIllIIll, lllllllllllllllIlIIIlIIlIIllIIlI, lllllllllllllllIlIIIlIIlIIllllII, lllllllllllllllIlIIIlIIlIIllllIl);
   }

   private static boolean lIlIlIIIlIIllI(int var0) {
      return var0 != 0;
   }

   public static BufferBuilder getBufferBuilder() {
      return INSTANCE.func_178180_c();
   }

   public static void drawBoxOutline(BlockPos lllllllllllllllIlIIIlIlIlllIlllI, int lllllllllllllllIlIIIlIlIlllIllIl, int lllllllllllllllIlIIIlIlIlllIIlIl) {
      int lllllllllllllllIlIIIlIlIlllIlIll = lllllllllllllllIlIIIlIlIlllIllIl >>> lIIIIIlIIlIII[5] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlIlllIlIlI = lllllllllllllllIlIIIlIlIlllIllIl >>> lIIIIIlIIlIII[7] & lIIIIIlIIlIII[6];
      char lllllllllllllllIlIIIlIlIlllIIIlI = lllllllllllllllIlIIIlIlIlllIllIl >>> lIIIIIlIIlIII[8] & lIIIIIlIIlIII[6];
      int lllllllllllllllIlIIIlIlIlllIlIII = lllllllllllllllIlIIIlIlIlllIllIl & lIIIIIlIIlIII[6];
      drawBoxOutline(lllllllllllllllIlIIIlIlIlllIlllI, lllllllllllllllIlIIIlIlIlllIlIlI, lllllllllllllllIlIIIlIlIlllIIIlI, lllllllllllllllIlIIIlIlIlllIlIII, lllllllllllllllIlIIIlIlIlllIlIll, lllllllllllllllIlIIIlIlIlllIIlIl);
   }

   public static void drawBoxOutline(BlockPos lllllllllllllllIlIIIlIlIlIlllIIl, int lllllllllllllllIlIIIlIlIlIlllllI, int lllllllllllllllIlIIIlIlIlIllIlll, int lllllllllllllllIlIIIlIlIlIllllII, int lllllllllllllllIlIIIlIlIlIlllIll, int lllllllllllllllIlIIIlIlIlIllIlII) {
      drawBoxOutline(INSTANCE.func_178180_c(), (float)lllllllllllllllIlIIIlIlIlIlllIIl.field_177962_a, (float)lllllllllllllllIlIIIlIlIlIlllIIl.field_177960_b, (float)lllllllllllllllIlIIIlIlIlIlllIIl.field_177961_c, 1.0F, 1.0F, 1.0F, lllllllllllllllIlIIIlIlIlIlllllI, lllllllllllllllIlIIIlIlIlIllIlll, lllllllllllllllIlIIIlIlIlIllllII, lllllllllllllllIlIIIlIlIlIlllIll, lllllllllllllllIlIIIlIlIlIllIlII);
   }

   public static void render() {
      INSTANCE.func_78381_a();
   }

   static {
      lIlIlIIIlIIlIl();
      INSTANCE = new SnowTessellator();
   }

   public static void drawBoundingBox(AxisAlignedBB lllllllllllllllIlIIIlIIllIlllIIl, float lllllllllllllllIlIIIlIIllIlllIII, int lllllllllllllllIlIIIlIIllIlIllll, int lllllllllllllllIlIIIlIIllIlIlllI, int lllllllllllllllIlIIIlIIllIlIllIl, int lllllllllllllllIlIIIlIIllIlIllII) {
      GlStateManager.func_179094_E();
      GlStateManager.func_179147_l();
      GlStateManager.func_179097_i();
      GlStateManager.func_179120_a(lIIIIIlIIlIII[1], lIIIIIlIIlIII[2], lIIIIIlIIlIII[3], lIIIIIlIIlIII[4]);
      GlStateManager.func_179090_x();
      GlStateManager.func_179132_a((boolean)lIIIIIlIIlIII[3]);
      GL11.glEnable(lIIIIIlIIlIII[25]);
      GL11.glHint(lIIIIIlIIlIII[26], lIIIIIlIIlIII[27]);
      GL11.glLineWidth(lllllllllllllllIlIIIlIIllIlllIII);
      Tessellator lllllllllllllllIlIIIlIIllIllIIll = Tessellator.func_178181_a();
      double lllllllllllllllIlIIIlIIllIlIlIlI = lllllllllllllllIlIIIlIIllIllIIll.func_178180_c();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181668_a(lIIIIIlIIlIII[28], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72334_f).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72338_b, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72336_d, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIlIlIlI.func_181662_b(lllllllllllllllIlIIIlIIllIlllIIl.field_72340_a, lllllllllllllllIlIIIlIIllIlllIIl.field_72337_e, lllllllllllllllIlIIIlIIllIlllIIl.field_72339_c).func_181669_b(lllllllllllllllIlIIIlIIllIlIllll, lllllllllllllllIlIIIlIIllIlIlllI, lllllllllllllllIlIIIlIIllIlIllIl, lllllllllllllllIlIIIlIIllIlIllII).func_181675_d();
      lllllllllllllllIlIIIlIIllIllIIll.func_78381_a();
      GL11.glDisable(lIIIIIlIIlIII[25]);
      GlStateManager.func_179132_a((boolean)lIIIIIlIIlIII[4]);
      GlStateManager.func_179126_j();
      GlStateManager.func_179098_w();
      GlStateManager.func_179084_k();
      GlStateManager.func_179121_F();
   }
}
