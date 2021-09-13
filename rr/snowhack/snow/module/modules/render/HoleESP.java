package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.GeometryMasks;
import rr.snowhack.snow.util.MathUtil;
import rr.snowhack.snow.util.SnowTessellator;

@Module.Info(
   name = "HoleESP",
   category = Module.Category.RENDER
)
public class HoleESP extends Module {
   // $FF: synthetic field
   private Setting<HoleESP.Pos> mode2;
   // $FF: synthetic field
   private ArrayList<BlockPos> holes;
   // $FF: synthetic field
   private Setting<Integer> red;
   // $FF: synthetic field
   private ArrayList<BlockPos> greenholes;
   // $FF: synthetic field
   private Setting<Integer> blue;
   // $FF: synthetic field
   private Setting<HoleESP.Modes> mode1;
   // $FF: synthetic field
   private Setting<Float> width;
   // $FF: synthetic field
   private Setting<HoleESP.Type> mode3;
   // $FF: synthetic field
   private Setting<Integer> green;
   // $FF: synthetic field
   private Setting<Integer> range;
   // $FF: synthetic field
   private ArrayList<BlockPos> redholes;
   // $FF: synthetic field
   private static final String[] lllIlIlllllI;
   // $FF: synthetic field
   private static final int[] lllIlIllllll;

   public void onWorldRender(RenderEvent lllllllllllllllIlIlllIllIlIIIlIl) {
      int var10000;
      if (lIIllIlIllIlll(lllllllllllllllIlIlllIllIlIIIIll.mode2.getValue(), HoleESP.Pos.Center)) {
         var10000 = lllIlIllllll[0];
         "".length();
         if (("   ".length() << " ".length() & ~("   ".length() << " ".length())) > 0) {
            return;
         }
      } else {
         var10000 = lllIlIllllll[11];
      }

      long lllllllllllllllIlIlllIllIlIIIIlI = var10000;
      if (lIIllIlIlllIII(lllllllllllllllIlIlllIllIlIIIIll.greenholes) && lIIllIlIlllIII(lllllllllllllllIlIlllIllIlIIIIll.redholes) && lIIllIlIlllIII(lllllllllllllllIlIlllIllIlIIIIll.holes)) {
         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$HoleESP$Modes[((HoleESP.Modes)lllllllllllllllIlIlllIllIlIIIIll.mode1.getValue()).ordinal()]) {
         case 1:
            lllllllllllllllIlIlllIllIlIIIIll.greenholes.forEach((lllllllllllllllIlIlllIllIIIIlIIl) -> {
               IBlockState lllllllllllllllIlIlllIllIIIIlIII = mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIIIlIIl);
               int lllllllllllllllIlIlllIllIIIIIIlI = MathUtil.interpolateEntity(mc.field_71439_g, mc.func_184121_ak());
               switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$HoleESP$Type[((HoleESP.Type)lllllllllllllllIlIlllIllIIIIIllI.mode3.getValue()).ordinal()]) {
               case 1:
                  SnowTessellator.drawFullBox(lllllllllllllllIlIlllIllIIIIlIII.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllIllIIIIlIIl.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0])).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllIllIIIIIIlI.field_72450_a, -lllllllllllllllIlIlllIllIIIIIIlI.field_72448_b, -lllllllllllllllIlIlllIllIIIIIIlI.field_72449_c), lllllllllllllllIlIlllIllIIIIlIIl.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), 1.5F, lllIlIllllll[0], lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[14]);
                  "".length();
                  if (-" ".length() > 0) {
                     return;
                  }
                  break;
               case 2:
                  SnowTessellator.prepare(lllIlIllllll[5]);
                  SnowTessellator.drawBox(lllllllllllllllIlIlllIllIIIIlIIl.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), lllIlIllllll[0], lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[14], (Integer)GeometryMasks.FACEMAP.get(EnumFacing.UP));
                  SnowTessellator.release();
                  "".length();
                  if (((72 ^ 109) & ~(229 ^ 192)) >= " ".length() << " ".length()) {
                     return;
                  }
                  break;
               case 3:
                  SnowTessellator.drawBoundingBox(lllllllllllllllIlIlllIllIIIIlIII.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllIllIIIIlIIl.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0])).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllIllIIIIIIlI.field_72450_a, -lllllllllllllllIlIlllIllIIIIIIlI.field_72448_b, -lllllllllllllllIlIlllIllIIIIIIlI.field_72449_c), (Float)lllllllllllllllIlIlllIllIIIIIllI.width.getValue(), lllIlIllllll[0], lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[14]);
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break;
               case 4:
                  SnowTessellator.prepare(lllIlIllllll[5]);
                  SnowTessellator.drawBox(lllllllllllllllIlIlllIllIIIIlIIl.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), lllIlIllllll[0], lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[14], lllIlIllllll[15]);
                  SnowTessellator.release();
               }

            });
            lllllllllllllllIlIlllIllIlIIIIll.redholes.forEach((lllllllllllllllIlIlllIllIIIllIII) -> {
               int lllllllllllllllIlIlllIllIIIlIIlI = mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIIllIII);
               Vec3d lllllllllllllllIlIlllIllIIIlIllI = MathUtil.interpolateEntity(mc.field_71439_g, mc.func_184121_ak());
               switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$HoleESP$Type[((HoleESP.Type)lllllllllllllllIlIlllIllIIIllIlI.mode3.getValue()).ordinal()]) {
               case 1:
                  SnowTessellator.drawFullBox(lllllllllllllllIlIlllIllIIIlIIlI.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllIllIIIllIII.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0])).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllIllIIIlIllI.field_72450_a, -lllllllllllllllIlIlllIllIIIlIllI.field_72448_b, -lllllllllllllllIlIlllIllIIIlIllI.field_72449_c), lllllllllllllllIlIlllIllIIIllIII.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), 1.5F, lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[14]);
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break;
               case 2:
                  SnowTessellator.prepare(lllIlIllllll[5]);
                  SnowTessellator.drawBox(lllllllllllllllIlIlllIllIIIllIII.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[14], (Integer)GeometryMasks.FACEMAP.get(EnumFacing.UP));
                  SnowTessellator.release();
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
                     return;
                  }
                  break;
               case 3:
                  SnowTessellator.drawBoundingBox(lllllllllllllllIlIlllIllIIIlIIlI.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllIllIIIllIII.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0])).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllIllIIIlIllI.field_72450_a, -lllllllllllllllIlIlllIllIIIlIllI.field_72448_b, -lllllllllllllllIlIlllIllIIIlIllI.field_72449_c), (Float)lllllllllllllllIlIlllIllIIIllIlI.width.getValue(), lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[14]);
                  "".length();
                  if (-" ".length() >= " ".length()) {
                     return;
                  }
                  break;
               case 4:
                  SnowTessellator.prepare(lllIlIllllll[5]);
                  SnowTessellator.drawBox(lllllllllllllllIlIlllIllIIIllIII.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), lllIlIllllll[7], lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[14], lllIlIllllll[15]);
                  SnowTessellator.release();
               }

            });
            "".length();
            if (-(35 ^ 39) > 0) {
               return;
            }
            break;
         case 2:
            lllllllllllllllIlIlllIllIlIIIIll.holes.forEach((lllllllllllllllIlIlllIllIIlIIlll) -> {
               long lllllllllllllllIlIlllIllIIlIIIIl = mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIlIIlll);
               byte lllllllllllllllIlIlllIllIIlIIIII = MathUtil.interpolateEntity(mc.field_71439_g, mc.func_184121_ak());
               switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$HoleESP$Type[((HoleESP.Type)lllllllllllllllIlIlllIllIIlIlIIl.mode3.getValue()).ordinal()]) {
               case 1:
                  SnowTessellator.drawFullBox(lllllllllllllllIlIlllIllIIlIIIIl.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllIllIIlIIlll.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0])).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllIllIIlIIIII.field_72450_a, -lllllllllllllllIlIlllIllIIlIIIII.field_72448_b, -lllllllllllllllIlIlllIllIIlIIIII.field_72449_c), lllllllllllllllIlIlllIllIIlIIlll.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), 1.5F, (Integer)lllllllllllllllIlIlllIllIIlIlIIl.red.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.green.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.blue.getValue(), lllIlIllllll[14]);
                  "".length();
                  if (" ".length() << " ".length() <= 0) {
                     return;
                  }
                  break;
               case 2:
                  SnowTessellator.prepare(lllIlIllllll[5]);
                  SnowTessellator.drawBox(lllllllllllllllIlIlllIllIIlIIlll.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.red.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.green.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.blue.getValue(), lllIlIllllll[14], (Integer)GeometryMasks.FACEMAP.get(EnumFacing.UP));
                  SnowTessellator.release();
                  "".length();
                  if ("   ".length() <= " ".length()) {
                     return;
                  }
                  break;
               case 3:
                  SnowTessellator.drawBoundingBox(lllllllllllllllIlIlllIllIIlIIIIl.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllIllIIlIIlll.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0])).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllIllIIlIIIII.field_72450_a, -lllllllllllllllIlIlllIllIIlIIIII.field_72448_b, -lllllllllllllllIlIlllIllIIlIIIII.field_72449_c), (Float)lllllllllllllllIlIlllIllIIlIlIIl.width.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.red.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.green.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.blue.getValue(), lllIlIllllll[14]);
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
                  break;
               case 4:
                  SnowTessellator.prepare(lllIlIllllll[5]);
                  SnowTessellator.drawBox(lllllllllllllllIlIlllIllIIlIIlll.func_177982_a(lllIlIllllll[0], lllllllllllllllIlIlllIllIlIIIIlI, lllIlIllllll[0]), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.red.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.green.getValue(), (Integer)lllllllllllllllIlIlllIllIIlIlIIl.blue.getValue(), lllIlIllllll[14], lllIlIllllll[15]);
                  SnowTessellator.release();
               }

            });
         }
      }

   }

   private static boolean lIIllIlIllIlIl(int var0) {
      return var0 != 0;
   }

   public boolean isHole(BlockPos lllllllllllllllIlIlllIllIIllIIlI, boolean lllllllllllllllIlIlllIllIIllIIIl) {
      if (lIIllIlIlllIlI(lIIllIlIlllIIl((double)lllllllllllllllIlIlllIllIIllIIlI.func_177956_o(), 125.0D))) {
         return (boolean)lllIlIllllll[0];
      } else {
         int var10000;
         if (lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI).func_185904_a().func_76230_c()) && lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[1], lllIlIllllll[0])).func_185904_a().func_76230_c()) && (!lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[2], lllIlIllllll[0])).func_185904_a().func_76230_c()) || lIIllIlIllIllI(lllllllllllllllIlIlllIllIIllIIIl)) && lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_185904_a().func_76220_a()) && lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_185904_a().func_76220_a()) && lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_185904_a().func_76220_a()) && lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_185904_a().func_76220_a()) && lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_185904_a().func_76220_a())) {
            var10000 = lllIlIllllll[1];
            "".length();
            if (" ".length() << " ".length() <= 0) {
               return (boolean)(((184 ^ 157) << " ".length() ^ 41 ^ 120) & (56 + 117 - 83 + 61 ^ (135 ^ 164) << (" ".length() << " ".length()) ^ -" ".length()));
            }
         } else {
            var10000 = lllIlIllllll[0];
         }

         boolean lllllllllllllllIlIlllIllIIllIlII = var10000;
         if (lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_177230_c().equals(Blocks.field_150357_h)) && !lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_177230_c().equals(Blocks.field_150343_Z)) || lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c().equals(Blocks.field_150357_h)) && !lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c().equals(Blocks.field_150343_Z)) || lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_177230_c().equals(Blocks.field_150357_h)) && !lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_177230_c().equals(Blocks.field_150343_Z)) || lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c().equals(Blocks.field_150357_h)) && !lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c().equals(Blocks.field_150343_Z)) || lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_177230_c().equals(Blocks.field_150357_h)) && !lIIllIlIllIlIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIIllIIlI.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_177230_c().equals(Blocks.field_150343_Z))) {
            var10000 = lllIlIllllll[0];
         } else {
            var10000 = lllIlIllllll[1];
            "".length();
            if (-" ".length() >= "   ".length()) {
               return (boolean)((107 + 77 - 181 + 148 ^ (50 ^ 113) << " ".length()) << (" ".length() << " ".length()) & ((35 ^ 4 ^ (9 ^ 18) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length()));
            }
         }

         char lllllllllllllllIlIlllIllIIlIllll = var10000;
         if (lIIllIlIllIllI(lllllllllllllllIlIlllIllIIlIllll) && !lIIllIlIllIlIl(lllllllllllllllIlIlllIllIIllIlII)) {
            var10000 = lllIlIllllll[0];
         } else {
            var10000 = lllIlIllllll[1];
            "".length();
            if ("   ".length() > "   ".length()) {
               return (boolean)((37 + 104 - -2 + 2 ^ " ".length() << (25 ^ 30)) << (" ".length() << " ".length()) & ((87 ^ 98 ^ (206 ^ 199) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length()));
            }
         }

         return (boolean)var10000;
      }
   }

   private static boolean lIIllIlIllIllI(int var0) {
      return var0 == 0;
   }

   public boolean isHole(BlockPos lllllllllllllllIlIlllIllIIlllllI) {
      return lllllllllllllllIlIlllIllIIllllIl.isHole(lllllllllllllllIlIlllIllIIlllllI, (boolean)lllIlIllllll[0]);
   }

   private static String lIIllIlIllIIIl(String lllllllllllllllIlIlllIlIlIllllll, String lllllllllllllllIlIlllIlIllIIIIII) {
      try {
         char lllllllllllllllIlIlllIlIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIllIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlllIlIllIIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlllIlIllIIIIll.init(lllIlIllllll[2], lllllllllllllllIlIlllIlIlIllllIl);
         return new String(lllllllllllllllIlIlllIlIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllIlIllIIII(String lllllllllllllllIlIlllIlIllIlIIIl, String lllllllllllllllIlIlllIlIllIlIlIl) {
      lllllllllllllllIlIlllIlIllIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlllIlIllIlIlII = new StringBuilder();
      char[] lllllllllllllllIlIlllIlIllIlIIll = lllllllllllllllIlIlllIlIllIlIlIl.toCharArray();
      Exception lllllllllllllllIlIlllIlIllIIllIl = lllIlIllllll[0];
      Exception lllllllllllllllIlIlllIlIllIIllII = lllllllllllllllIlIlllIlIllIlIIIl.toCharArray();
      byte lllllllllllllllIlIlllIlIllIIlIll = lllllllllllllllIlIlllIlIllIIllII.length;
      int lllllllllllllllIlIlllIlIllIIlIlI = lllIlIllllll[0];

      do {
         if (!lIIllIlIllllII(lllllllllllllllIlIlllIlIllIIlIlI, lllllllllllllllIlIlllIlIllIIlIll)) {
            return String.valueOf(lllllllllllllllIlIlllIlIllIlIlII);
         }

         float lllllllllllllllIlIlllIlIllIIlIIl = lllllllllllllllIlIlllIlIllIIllII[lllllllllllllllIlIlllIlIllIIlIlI];
         lllllllllllllllIlIlllIlIllIlIlII.append((char)(lllllllllllllllIlIlllIlIllIIlIIl ^ lllllllllllllllIlIlllIlIllIlIIll[lllllllllllllllIlIlllIlIllIIllIl % lllllllllllllllIlIlllIlIllIlIIll.length]));
         "".length();
         ++lllllllllllllllIlIlllIlIllIIllIl;
         ++lllllllllllllllIlIlllIlIllIIlIlI;
         "".length();
      } while(" ".length() << " ".length() == " ".length() << " ".length());

      return null;
   }

   private static boolean lIIllIlIlllIlI(int var0) {
      return var0 > 0;
   }

   private static boolean lIIllIlIlllIll(Object var0, Object var1) {
      return var0 != var1;
   }

   public HoleESP() {
      lllllllllllllllIlIlllIllIllIIIIl.mode1 = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.e(lllIlIlllllI[lllIlIllllll[0]], HoleESP.Modes.Custom));
      lllllllllllllllIlIlllIllIllIIIIl.mode2 = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.e(lllIlIlllllI[lllIlIllllll[1]], HoleESP.Pos.Bottom));
      lllllllllllllllIlIlllIllIllIIIIl.mode3 = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.e(lllIlIlllllI[lllIlIllllll[2]], HoleESP.Type.Flat));
      lllllllllllllllIlIlllIllIllIIIIl.range = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.integerBuilder(lllIlIlllllI[lllIlIllllll[3]]).withRange(lllIlIllllll[0], lllIlIllllll[4]).withValue((Number)lllIlIllllll[5]).withVisibility((lllllllllllllllIlIlllIlIlllIllll) -> {
         int var10000;
         if (lIIllIlIlllIll(lllllllllllllllIlIlllIlIllllIIII.mode1.getValue(), HoleESP.Modes.Gay)) {
            var10000 = lllIlIllllll[1];
            "".length();
            if ((19 ^ 22) == 0) {
               return (boolean)((190 ^ 183) & ~(23 ^ 30));
            }
         } else {
            var10000 = lllIlIllllll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIlIlllIllIllIIIIl.red = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.integerBuilder(lllIlIlllllI[lllIlIllllll[6]]).withRange(lllIlIllllll[0], lllIlIllllll[7]).withValue((Number)lllIlIllllll[7]).withVisibility((lllllllllllllllIlIlllIlIllllIIll) -> {
         int var10000;
         if (lIIllIlIlllIll(lllllllllllllllIlIlllIlIllllIIlI.mode1.getValue(), HoleESP.Modes.Gay)) {
            var10000 = lllIlIllllll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
               return (boolean)(" ".length() & (" ".length() ^ -" ".length()));
            }
         } else {
            var10000 = lllIlIllllll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIlIlllIllIllIIIIl.green = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.integerBuilder(lllIlIlllllI[lllIlIllllll[8]]).withRange(lllIlIllllll[0], lllIlIllllll[7]).withValue((Number)lllIlIllllll[0]).withVisibility((lllllllllllllllIlIlllIlIllllIlll) -> {
         int var10000;
         if (lIIllIlIlllIll(lllllllllllllllIlIlllIlIlllllIII.mode1.getValue(), HoleESP.Modes.Gay)) {
            var10000 = lllIlIllllll[1];
            "".length();
            if (-" ".length() != -" ".length()) {
               return (boolean)((30 ^ 105 ^ (119 ^ 94) << " ".length()) & ((34 ^ 5) << (" ".length() << " ".length()) ^ 1 + 119 - 90 + 155 ^ -" ".length()));
            }
         } else {
            var10000 = lllIlIllllll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIlIlllIllIllIIIIl.blue = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.integerBuilder(lllIlIlllllI[lllIlIllllll[9]]).withRange(lllIlIllllll[0], lllIlIllllll[7]).withValue((Number)lllIlIllllll[7]).withVisibility((lllllllllllllllIlIlllIlIlllllIll) -> {
         int var10000;
         if (lIIllIlIlllIll(lllllllllllllllIlIlllIlIllllllII.mode1.getValue(), HoleESP.Modes.Gay)) {
            var10000 = lllIlIllllll[1];
            "".length();
            if (" ".length() << " ".length() <= 0) {
               return (boolean)((137 ^ 152) << (" ".length() << " ".length()) & ~((95 ^ 78) << (" ".length() << " ".length())));
            }
         } else {
            var10000 = lllIlIllllll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIlIlllIllIllIIIIl.width = lllllllllllllllIlIlllIllIllIIIIl.register(Settings.floatBuilder(lllIlIlllllI[lllIlIllllll[5]]).withRange(0.0F, 10.0F).withValue((Number)2.0F).withVisibility((lllllllllllllllIlIlllIlIllllllll) -> {
         int var10000;
         if (lIIllIlIllIlll(lllllllllllllllIlIlllIlIlllllllI.mode3.getValue(), HoleESP.Type.Bounding)) {
            var10000 = lllIlIllllll[1];
            "".length();
            if (" ".length() < 0) {
               return (boolean)((239 ^ 196) << " ".length() & ~((30 ^ 53) << " ".length()));
            }
         } else {
            var10000 = lllIlIllllll[0];
         }

         return (boolean)var10000;
      }).build());
   }

   public void onUpdate() {
      lllllllllllllllIlIlllIllIlIlIlII.holes = new ArrayList();
      lllllllllllllllIlIlllIllIlIlIlII.greenholes = new ArrayList();
      lllllllllllllllIlIlllIllIlIlIlII.redholes = new ArrayList();
      Iterable<BlockPos> lllllllllllllllIlIlllIllIlIlIIIl = BlockPos.func_177980_a(mc.field_71439_g.func_180425_c().func_177982_a(-(Integer)lllllllllllllllIlIlllIllIlIlIlII.range.getValue(), lllIlIllllll[10], -(Integer)lllllllllllllllIlIlllIllIlIlIlII.range.getValue()), mc.field_71439_g.func_180425_c().func_177982_a((Integer)lllllllllllllllIlIlllIllIlIlIlII.range.getValue(), lllIlIllllll[2], (Integer)lllllllllllllllIlIlllIllIlIlIlII.range.getValue()));
      Iterator lllllllllllllllIlIlllIllIlIlIIII = lllllllllllllllIlIlllIllIlIlIIIl.iterator();

      label201:
      do {
         do {
            if (!lIIllIlIllIlIl(lllllllllllllllIlIlllIllIlIlIIII.hasNext())) {
               return;
            }

            String lllllllllllllllIlIlllIllIlIIllll = (BlockPos)lllllllllllllllIlIlllIllIlIlIIII.next();
            if (lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll).func_185904_a().func_76230_c()) && lIIllIlIllIllI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[1], lllIlIllllll[0])).func_185904_a().func_76230_c())) {
               int var10000;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_177230_c(), Blocks.field_150357_h)) {
                  var10000 = lllIlIllllll[1];
                  "".length();
                  if (-((28 ^ 79) << " ".length() ^ 53 + 136 - 179 + 153) >= 0) {
                     return;
                  }
               } else {
                  var10000 = lllIlIllllll[0];
               }

               int var10001;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_177230_c(), Blocks.field_150343_Z)) {
                  var10001 = lllIlIllllll[1];
                  "".length();
                  if (" ".length() << " ".length() != " ".length() << " ".length()) {
                     return;
                  }
               } else {
                  var10001 = lllIlIllllll[0];
               }

               label192: {
                  if (lIIllIlIllIlIl(var10000 | var10001)) {
                     if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150357_h)) {
                        var10000 = lllIlIllllll[1];
                        "".length();
                        if (" ".length() << " ".length() < " ".length() << " ".length()) {
                           return;
                        }
                     } else {
                        var10000 = lllIlIllllll[0];
                     }

                     if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150343_Z)) {
                        var10001 = lllIlIllllll[1];
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
                           return;
                        }
                     } else {
                        var10001 = lllIlIllllll[0];
                     }

                     if (lIIllIlIllIlIl(var10000 | var10001)) {
                        if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_177230_c(), Blocks.field_150357_h)) {
                           var10000 = lllIlIllllll[1];
                           "".length();
                           if ((((47 ^ 98) << " ".length() ^ 8 + 55 - -7 + 111) & (103 ^ 94 ^ (184 ^ 179) << " ".length() ^ -" ".length())) != 0) {
                              return;
                           }
                        } else {
                           var10000 = lllIlIllllll[0];
                        }

                        if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_177230_c(), Blocks.field_150343_Z)) {
                           var10001 = lllIlIllllll[1];
                           "".length();
                           if (((31 ^ 20) << (" ".length() << " ".length()) & ~((4 ^ 15) << (" ".length() << " ".length()))) != 0) {
                              return;
                           }
                        } else {
                           var10001 = lllIlIllllll[0];
                        }

                        if (lIIllIlIllIlIl(var10000 | var10001)) {
                           if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150357_h)) {
                              var10000 = lllIlIllllll[1];
                              "".length();
                              if (null != null) {
                                 return;
                              }
                           } else {
                              var10000 = lllIlIllllll[0];
                           }

                           if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150343_Z)) {
                              var10001 = lllIlIllllll[1];
                              "".length();
                              if (((105 ^ 108) << (" ".length() << " ".length()) & ~((174 ^ 171) << (" ".length() << " ".length()))) >= "   ".length()) {
                                 return;
                              }
                           } else {
                              var10001 = lllIlIllllll[0];
                           }

                           if (lIIllIlIllIlIl(var10000 | var10001)) {
                              if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_177230_c(), Blocks.field_150357_h)) {
                                 var10000 = lllIlIllllll[1];
                                 "".length();
                                 if (" ".length() << " ".length() <= 0) {
                                    return;
                                 }
                              } else {
                                 var10000 = lllIlIllllll[0];
                              }

                              if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_177230_c(), Blocks.field_150343_Z)) {
                                 var10001 = lllIlIllllll[1];
                                 "".length();
                                 if (-" ".length() < -" ".length()) {
                                    return;
                                 }
                              } else {
                                 var10001 = lllIlIllllll[0];
                              }

                              if (lIIllIlIllIlIl(var10000 | var10001) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[1], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[2], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a)) {
                                 var10000 = lllIlIllllll[1];
                                 "".length();
                                 if (-"   ".length() > 0) {
                                    return;
                                 }
                                 break label192;
                              }
                           }
                        }
                     }
                  }

                  var10000 = lllIlIllllll[0];
               }

               boolean lllllllllllllllIlIlllIllIlIllIII = var10000;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_177230_c(), Blocks.field_150343_Z)) {
                  var10000 = lllIlIllllll[1];
                  "".length();
                  if ((("   ".length() << " ".length() ^ 145 ^ 128) & (66 ^ 79 ^ (13 ^ 0) << " ".length() ^ -" ".length())) != 0) {
                     return;
                  }
               } else {
                  var10000 = lllIlIllllll[0];
               }

               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150343_Z)) {
                  var10001 = lllIlIllllll[1];
                  "".length();
                  if ("   ".length() < -" ".length()) {
                     return;
                  }
               } else {
                  var10001 = lllIlIllllll[0];
               }

               var10000 |= var10001;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_177230_c(), Blocks.field_150343_Z)) {
                  var10001 = lllIlIllllll[1];
                  "".length();
                  if (((116 ^ 97) & ~(127 ^ 106)) != 0) {
                     return;
                  }
               } else {
                  var10001 = lllIlIllllll[0];
               }

               var10000 |= var10001;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150343_Z)) {
                  var10001 = lllIlIllllll[1];
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  var10001 = lllIlIllllll[0];
               }

               var10000 |= var10001;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_177230_c(), Blocks.field_150343_Z)) {
                  var10001 = lllIlIllllll[1];
                  "".length();
                  if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                     return;
                  }
               } else {
                  var10001 = lllIlIllllll[0];
               }

               if (lIIllIlIllIlIl(var10000 | var10001) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[1], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[2], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a)) {
                  var10000 = lllIlIllllll[1];
                  "".length();
                  if ((((146 ^ 193) << " ".length() ^ 81 + 165 - 233 + 178) & (" ".length() << ("   ".length() << " ".length()) ^ 94 ^ 7 ^ -" ".length())) >= " ".length() << (" ".length() << " ".length())) {
                     return;
                  }
               } else {
                  var10000 = lllIlIllllll[0];
               }

               boolean lllllllllllllllIlIlllIllIlIlIlll = var10000;
               if (lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[11], lllIlIllllll[0])).func_177230_c(), Blocks.field_150357_h) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[1], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150357_h) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[1])).func_177230_c(), Blocks.field_150357_h) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[11], lllIlIllllll[0], lllIlIllllll[0])).func_177230_c(), Blocks.field_150357_h) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[11])).func_177230_c(), Blocks.field_150357_h) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[0], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[1], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a) && lIIllIlIllIlll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllIllIlIIllll.func_177982_a(lllIlIllllll[0], lllIlIllllll[2], lllIlIllllll[0])).func_185904_a(), Material.field_151579_a)) {
                  var10000 = lllIlIllllll[1];
                  "".length();
                  if (((24 ^ 21) << " ".length() & ~((35 ^ 46) << " ".length())) != 0) {
                     return;
                  }
               } else {
                  var10000 = lllIlIllllll[0];
               }

               Exception lllllllllllllllIlIlllIllIlIIllII = var10000;
               if (lIIllIlIllIllI(lllllllllllllllIlIlllIllIlIllIII)) {
                  "".length();
                  continue label201;
               }

               if (lIIllIlIllIlIl(lllllllllllllllIlIlllIllIlIlIlll)) {
                  lllllllllllllllIlIlllIllIlIlIlII.redholes.add(lllllllllllllllIlIlllIllIlIIllll);
                  "".length();
               }

               if (lIIllIlIllIlIl(lllllllllllllllIlIlllIllIlIIllII)) {
                  lllllllllllllllIlIlllIllIlIlIlII.greenholes.add(lllllllllllllllIlIlllIllIlIIllll);
                  "".length();
               }

               lllllllllllllllIlIlllIllIlIlIlII.holes.add(lllllllllllllllIlIlllIllIlIIllll);
               "".length();
            }

            "".length();
         } while(((25 ^ 28) << (" ".length() << " ".length()) & ~((59 ^ 62) << (" ".length() << " ".length()))) <= "   ".length());

         return;
      } while(null == null);

   }

   private static boolean lIIllIlIllIlll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIIllIlIllIIll() {
      lllIlIlllllI = new String[lllIlIllllll[16]];
      lllIlIlllllI[lllIlIllllll[0]] = lIIllIlIllIIII("EDQPDjEwcSwFMCc=", "BQajT");
      lllIlIlllllI[lllIlIllllll[1]] = lIIllIlIllIIIl("VQB/ljzHHHlWAr/q9GRXcQ==", "wUxyd");
      lllIlIlllllI[lllIlIllllll[2]] = lIIllIlIllIIII("FyY2DzQ3YwwSISA=", "ECXkQ");
      lllIlIlllllI[lllIlIllllll[3]] = lIIllIlIllIIIl("e2msUVfHZAM=", "TpQiE");
      lllIlIlllllI[lllIlIllllll[6]] = lIIllIlIllIIlI("8EWba4SLvj8=", "mSCjW");
      lllIlIlllllI[lllIlIllllll[8]] = lIIllIlIllIIII("DCI2Bj8=", "KPScQ");
      lllIlIlllllI[lllIlIllllll[9]] = lIIllIlIllIIII("ND4FPw==", "vRpZG");
      lllIlIlllllI[lllIlIllllll[5]] = lIIllIlIllIIIl("iYVbxJucQGs=", "Twthz");
      lllIlIlllllI[lllIlIllllll[12]] = lIIllIlIllIIIl("34Mfpv9KL7o=", "suXyh");
      lllIlIlllllI[lllIlIllllll[13]] = lIIllIlIllIIIl("BD0WAflRCPA=", "eRIJF");
   }

   private static void lIIllIlIllIlII() {
      lllIlIllllll = new int[17];
      lllIlIllllll[0] = (122 ^ 113) << "   ".length() & ~((126 ^ 117) << "   ".length());
      lllIlIllllll[1] = " ".length();
      lllIlIllllll[2] = " ".length() << " ".length();
      lllIlIllllll[3] = "   ".length();
      lllIlIllllll[4] = 68 ^ 75;
      lllIlIllllll[5] = 144 ^ 151;
      lllIlIllllll[6] = " ".length() << (" ".length() << " ".length());
      lllIlIllllll[7] = 151 + 209 - 170 + 65;
      lllIlIllllll[8] = 44 ^ 41;
      lllIlIllllll[9] = "   ".length() << " ".length();
      lllIlIllllll[10] = -(153 + 17 - -6 + 5 ^ 28 + 51 - -74 + 26);
      lllIlIllllll[11] = -" ".length();
      lllIlIllllll[12] = " ".length() << "   ".length();
      lllIlIllllll[13] = 134 ^ 143;
      lllIlIllllll[14] = (254 ^ 197 ^ "   ".length() << "   ".length()) << " ".length();
      lllIlIllllll[15] = (186 ^ 133) << " ".length() ^ 55 ^ 118;
      lllIlIllllll[16] = (197 ^ 192) << " ".length();
   }

   public String getHudInfo() {
      return lllllllllllllllIlIlllIllIlIIlIlI.mode1.getValueAsString().replaceAll(lllIlIlllllI[lllIlIllllll[12]], lllIlIlllllI[lllIlIllllll[13]]);
   }

   static {
      lIIllIlIllIlII();
      lIIllIlIllIIll();
   }

   private static String lIIllIlIllIIlI(String lllllllllllllllIlIlllIlIlllIIllI, String lllllllllllllllIlIlllIlIlllIIIll) {
      try {
         SecretKeySpec lllllllllllllllIlIlllIlIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), lllIlIllllll[12]), "DES");
         Cipher lllllllllllllllIlIlllIlIlllIlIII = Cipher.getInstance("DES");
         lllllllllllllllIlIlllIlIlllIlIII.init(lllIlIllllll[2], lllllllllllllllIlIlllIlIlllIlIIl);
         return new String(lllllllllllllllIlIlllIlIlllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIlIlllIII(Object var0) {
      return var0 != null;
   }

   private static int lIIllIlIlllIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIllIlIllllII(int var0, int var1) {
      return var0 < var1;
   }

   private static enum Type {
      // $FF: synthetic field
      Flat;

      // $FF: synthetic field
      private static final String[] llllIIlIIIII;
      // $FF: synthetic field
      private static final int[] llllIIlIIIIl;
      // $FF: synthetic field
      full,
      // $FF: synthetic field
      FullBounding,
      // $FF: synthetic field
      Bounding;

      private static void lIIllllIllIlll() {
         llllIIlIIIIl = new int[5];
         llllIIlIIIIl[0] = ((136 ^ 143) << (" ".length() << (" ".length() << " ".length())) ^ 36 ^ 31) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ 77 ^ 22 ^ -" ".length());
         llllIIlIIIIl[1] = " ".length();
         llllIIlIIIIl[2] = " ".length() << " ".length();
         llllIIlIIIIl[3] = "   ".length();
         llllIIlIIIIl[4] = " ".length() << (" ".length() << " ".length());
      }

      private static String lIIllllIllIlIl(String lllllllllllllllIlIlIlIlllllIIlII, String lllllllllllllllIlIlIlIlllllIIIIl) {
         try {
            SecretKeySpec lllllllllllllllIlIlIlIlllllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIlllllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            int lllllllllllllllIlIlIlIllllIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIllllIlllll.init(llllIIlIIIIl[2], lllllllllllllllIlIlIlIlllllIIlll);
            return new String(lllllllllllllllIlIlIlIllllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIlllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIIllllIllIllI() {
         llllIIlIIIII = new String[llllIIlIIIIl[4]];
         llllIIlIIIII[llllIIlIIIIl[0]] = lIIllllIllIlII("PDU5Mg==", "zYXFQ");
         llllIIlIIIII[llllIIlIIIIl[1]] = lIIllllIllIlII("LTgPHA==", "KMcpW");
         llllIIlIIIII[llllIIlIIIIl[2]] = lIIllllIllIlIl("YIT4yUVlVT4QgkjadQQ11w==", "QAfJu");
         llllIIlIIIII[llllIIlIIIIl[3]] = lIIllllIllIlII("NjwnLgUfPCUmLh4u", "pIKBG");
      }

      static {
         lIIllllIllIlll();
         lIIllllIllIllI();
         Flat = new HoleESP.Type(llllIIlIIIII[llllIIlIIIIl[0]], llllIIlIIIIl[0]);
         full = new HoleESP.Type(llllIIlIIIII[llllIIlIIIIl[1]], llllIIlIIIIl[1]);
         Bounding = new HoleESP.Type(llllIIlIIIII[llllIIlIIIIl[2]], llllIIlIIIIl[2]);
         FullBounding = new HoleESP.Type(llllIIlIIIII[llllIIlIIIIl[3]], llllIIlIIIIl[3]);
         HoleESP.Type[] var10000 = new HoleESP.Type[llllIIlIIIIl[4]];
         var10000[llllIIlIIIIl[0]] = Flat;
         var10000[llllIIlIIIIl[1]] = full;
         var10000[llllIIlIIIIl[2]] = Bounding;
         var10000[llllIIlIIIIl[3]] = FullBounding;
      }

      private static boolean lIIllllIlllIII(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIIllllIllIlII(String lllllllllllllllIlIlIlIllllIIllll, String lllllllllllllllIlIlIlIllllIlIIll) {
         lllllllllllllllIlIlIlIllllIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         String lllllllllllllllIlIlIlIllllIIllIl = new StringBuilder();
         short lllllllllllllllIlIlIlIllllIIllII = lllllllllllllllIlIlIlIllllIlIIll.toCharArray();
         int lllllllllllllllIlIlIlIllllIlIIII = llllIIlIIIIl[0];
         int lllllllllllllllIlIlIlIllllIIlIlI = lllllllllllllllIlIlIlIllllIIllll.toCharArray();
         short lllllllllllllllIlIlIlIllllIIlIIl = lllllllllllllllIlIlIlIllllIIlIlI.length;
         int lllllllllllllllIlIlIlIllllIIlIII = llllIIlIIIIl[0];

         do {
            if (!lIIllllIlllIII(lllllllllllllllIlIlIlIllllIIlIII, lllllllllllllllIlIlIlIllllIIlIIl)) {
               return String.valueOf(lllllllllllllllIlIlIlIllllIIllIl);
            }

            boolean lllllllllllllllIlIlIlIllllIIIlll = lllllllllllllllIlIlIlIllllIIlIlI[lllllllllllllllIlIlIlIllllIIlIII];
            lllllllllllllllIlIlIlIllllIIllIl.append((char)(lllllllllllllllIlIlIlIllllIIIlll ^ lllllllllllllllIlIlIlIllllIIllII[lllllllllllllllIlIlIlIllllIlIIII % lllllllllllllllIlIlIlIllllIIllII.length]));
            "".length();
            ++lllllllllllllllIlIlIlIllllIlIIII;
            ++lllllllllllllllIlIlIlIllllIIlIII;
            "".length();
         } while(((117 ^ 92) & ~(190 ^ 151)) >= 0);

         return null;
      }
   }

   private static enum Pos {
      // $FF: synthetic field
      Bottom;

      // $FF: synthetic field
      private static final String[] llllIllIIIlI;
      // $FF: synthetic field
      private static final int[] llllIllIIIll;
      // $FF: synthetic field
      Center;

      static {
         lIlIIIIIllIllI();
         lIlIIIIIllIlIl();
         Center = new HoleESP.Pos(llllIllIIIlI[llllIllIIIll[0]], llllIllIIIll[0]);
         Bottom = new HoleESP.Pos(llllIllIIIlI[llllIllIIIll[1]], llllIllIIIll[1]);
         HoleESP.Pos[] var10000 = new HoleESP.Pos[llllIllIIIll[2]];
         var10000[llllIllIIIll[0]] = Center;
         var10000[llllIllIIIll[1]] = Bottom;
      }

      private static void lIlIIIIIllIlIl() {
         llllIllIIIlI = new String[llllIllIIIll[2]];
         llllIllIIIlI[llllIllIIIll[0]] = lIlIIIIIllIlII("H8cJeiQ8PUo=", "trMPO");
         llllIllIIIlI[llllIllIIIll[1]] = lIlIIIIIllIlII("KR9czj3T5zQ=", "BdzfW");
      }

      private static void lIlIIIIIllIllI() {
         llllIllIIIll = new int[3];
         llllIllIIIll[0] = (107 ^ 102) << " ".length() & ~((1 ^ 12) << " ".length());
         llllIllIIIll[1] = " ".length();
         llllIllIIIll[2] = " ".length() << " ".length();
      }

      private static String lIlIIIIIllIlII(String lllllllllllllllIlIlIIlIllIlIlIII, String lllllllllllllllIlIlIIlIllIlIIlll) {
         try {
            SecretKeySpec lllllllllllllllIlIlIIlIllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIlIllIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIlIllIlIlIlI.init(llllIllIIIll[2], lllllllllllllllIlIlIIlIllIlIlIll);
            return new String(lllllllllllllllIlIlIIlIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }
   }

   private static enum Modes {
      // $FF: synthetic field
      private static final int[] lllIlIllIIll;
      // $FF: synthetic field
      Custom,
      // $FF: synthetic field
      Gay;

      // $FF: synthetic field
      private static final String[] lllIlIlIllll;

      private static void lIIllIlIIlIIII() {
         lllIlIlIllll = new String[lllIlIllIIll[2]];
         lllIlIlIllll[lllIlIllIIll[0]] = lIIllIlIIIlllI("Dy87Gxgh", "LZHow");
         lllIlIlIllll[lllIlIllIIll[1]] = lIIllIlIIIllll("ED7E0xzRiP8=", "GqoNj");
      }

      private static String lIIllIlIIIllll(String lllllllllllllllIlIllllIIIIlllIll, String lllllllllllllllIlIllllIIIIlllIlI) {
         try {
            String lllllllllllllllIlIllllIIIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllIIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            boolean lllllllllllllllIlIllllIIIIlllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllllIIIIlllIII.init(lllIlIllIIll[2], lllllllllllllllIlIllllIIIIlllIIl);
            return new String(lllllllllllllllIlIllllIIIIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIIllIlIIIlllI(String lllllllllllllllIlIllllIIIIlIllIl, String lllllllllllllllIlIllllIIIIlIIlll) {
         lllllllllllllllIlIllllIIIIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllIIIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         char lllllllllllllllIlIllllIIIIlIIllI = new StringBuilder();
         int lllllllllllllllIlIllllIIIIlIIlIl = lllllllllllllllIlIllllIIIIlIIlll.toCharArray();
         int lllllllllllllllIlIllllIIIIlIlIIl = lllIlIllIIll[0];
         Exception lllllllllllllllIlIllllIIIIlIIIll = lllllllllllllllIlIllllIIIIlIllIl.toCharArray();
         Exception lllllllllllllllIlIllllIIIIlIIIlI = lllllllllllllllIlIllllIIIIlIIIll.length;
         int lllllllllllllllIlIllllIIIIlIIIIl = lllIlIllIIll[0];

         do {
            if (!lIIllIlIIllllI(lllllllllllllllIlIllllIIIIlIIIIl, lllllllllllllllIlIllllIIIIlIIIlI)) {
               return String.valueOf(lllllllllllllllIlIllllIIIIlIIllI);
            }

            char lllllllllllllllIlIllllIIIIlIlllI = lllllllllllllllIlIllllIIIIlIIIll[lllllllllllllllIlIllllIIIIlIIIIl];
            lllllllllllllllIlIllllIIIIlIIllI.append((char)(lllllllllllllllIlIllllIIIIlIlllI ^ lllllllllllllllIlIllllIIIIlIIlIl[lllllllllllllllIlIllllIIIIlIlIIl % lllllllllllllllIlIllllIIIIlIIlIl.length]));
            "".length();
            ++lllllllllllllllIlIllllIIIIlIlIIl;
            ++lllllllllllllllIlIllllIIIIlIIIIl;
            "".length();
         } while((124 ^ 121) != 0);

         return null;
      }

      private static boolean lIIllIlIIllllI(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIIllIlIIlllIl();
         lIIllIlIIlIIII();
         Custom = new HoleESP.Modes(lllIlIlIllll[lllIlIllIIll[0]], lllIlIllIIll[0]);
         Gay = new HoleESP.Modes(lllIlIlIllll[lllIlIllIIll[1]], lllIlIllIIll[1]);
         HoleESP.Modes[] var10000 = new HoleESP.Modes[lllIlIllIIll[2]];
         var10000[lllIlIllIIll[0]] = Custom;
         var10000[lllIlIllIIll[1]] = Gay;
      }

      private static void lIIllIlIIlllIl() {
         lllIlIllIIll = new int[3];
         lllIlIllIIll[0] = (148 + 136 - 276 + 179 ^ (58 ^ 21) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((119 ^ 76) << " ".length() ^ 123 ^ 10) << (" ".length() << " ".length()) ^ -" ".length());
         lllIlIllIIll[1] = " ".length();
         lllIlIllIIll[2] = " ".length() << " ".length();
      }
   }
}
