package rr.snowhack.snow.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.RayTraceResult.Type;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.GeometryMasks;
import rr.snowhack.snow.util.MathUtil;
import rr.snowhack.snow.util.SnowTessellator;

@Module.Info(
   name = "BlockHighlight",
   category = Module.Category.RENDER
)
public class BlockHighlight extends Module {
   // $FF: synthetic field
   private Setting<Integer> alpha;
   // $FF: synthetic field
   private static final String[] lIIIlIIlIIlll;
   // $FF: synthetic field
   private Setting<BlockHighlight.AppendModes> highlightMode;
   // $FF: synthetic field
   private Setting<Boolean> rainbow;
   // $FF: synthetic field
   private static final int[] lIIIlIIlIlIlI;
   // $FF: synthetic field
   private Setting<Float> width;
   // $FF: synthetic field
   private Setting<Integer> blue;
   // $FF: synthetic field
   private Setting<Integer> green;
   // $FF: synthetic field
   private Setting<Integer> red;

   private static void lIlIllllIlllll() {
      lIIIlIIlIIlll = new String[lIIIlIIlIlIlI[13]];
      lIIIlIIlIIlll[lIIIlIIlIlIlI[0]] = lIlIllllIlllII("IyIyDBoCLD0QViYkMQE=", "kKUdv");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[1]] = lIlIllllIlllII("JhYn", "tsCNG");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[3]] = lIlIllllIlllIl("JXbOUTnfJ5w=", "uAzNc");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[4]] = lIlIllllIlllIl("Zz7/NKYkiFg=", "CbEdH");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[5]] = lIlIllllIllllI("guNVwjpdG8c=", "aQxBe");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[7]] = lIlIllllIlllII("Bho3BSc=", "QsSqO");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[8]] = lIlIllllIlllIl("xMPKvcVTBzw=", "AQUec");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[11]] = lIlIllllIllllI("kmbGOs6vhKk=", "TxOBa");
      lIIIlIIlIIlll[lIIIlIIlIlIlI[10]] = lIlIllllIlllII("", "JoFCz");
   }

   public BlockHighlight() {
      lllllllllllllllIIlllIIlIlIIlIllI.highlightMode = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.e(lIIIlIIlIIlll[lIIIlIIlIlIlI[0]], BlockHighlight.AppendModes.Outline));
      lllllllllllllllIIlllIIlIlIIlIllI.red = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.integerBuilder(lIIIlIIlIIlll[lIIIlIIlIlIlI[1]]).withRange(lIIIlIIlIlIlI[0], lIIIlIIlIlIlI[2]).withValue((Number)lIIIlIIlIlIlI[0]).build());
      lllllllllllllllIIlllIIlIlIIlIllI.green = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.integerBuilder(lIIIlIIlIIlll[lIIIlIIlIlIlI[3]]).withRange(lIIIlIIlIlIlI[0], lIIIlIIlIlIlI[2]).withValue((Number)lIIIlIIlIlIlI[0]).build());
      lllllllllllllllIIlllIIlIlIIlIllI.blue = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.integerBuilder(lIIIlIIlIIlll[lIIIlIIlIlIlI[4]]).withRange(lIIIlIIlIlIlI[0], lIIIlIIlIlIlI[2]).withValue((Number)lIIIlIIlIlIlI[2]).build());
      lllllllllllllllIIlllIIlIlIIlIllI.alpha = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.integerBuilder(lIIIlIIlIIlll[lIIIlIIlIlIlI[5]]).withRange(lIIIlIIlIlIlI[0], lIIIlIIlIlIlI[2]).withValue((Number)lIIIlIIlIlIlI[6]).build());
      lllllllllllllllIIlllIIlIlIIlIllI.width = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.floatBuilder(lIIIlIIlIIlll[lIIIlIIlIlIlI[7]]).withRange(0.0F, 10.0F).withValue((Number)1.5F).build());
      lllllllllllllllIIlllIIlIlIIlIllI.rainbow = lllllllllllllllIIlllIIlIlIIlIllI.register(Settings.b(lIIIlIIlIIlll[lIIIlIIlIlIlI[8]], (boolean)lIIIlIIlIlIlI[0]));
   }

   private static void lIlIlllllIIIII() {
      lIIIlIIlIlIlI = new int[14];
      lIIIlIIlIlIlI[0] = ((197 ^ 194) << (" ".length() << (" ".length() << " ".length())) ^ 76 ^ 43) << (" ".length() << " ".length()) & ((179 + 54 - 48 + 30 ^ "   ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIlIIlIlIlI[1] = " ".length();
      lIIIlIIlIlIlI[2] = ((78 ^ 71) << "   ".length()) + ((81 ^ 26) << " ".length()) - ((255 ^ 158) << " ".length()) + 118 + 201 - 285 + 193;
      lIIIlIIlIlIlI[3] = " ".length() << " ".length();
      lIIIlIIlIlIlI[4] = "   ".length();
      lIIIlIIlIlIlI[5] = " ".length() << (" ".length() << " ".length());
      lIIIlIIlIlIlI[6] = (122 ^ 89) << " ".length();
      lIIIlIIlIlIlI[7] = 180 ^ 177;
      lIIIlIIlIlIlI[8] = "   ".length() << " ".length();
      lIIIlIIlIlIlI[9] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIIlIlIlI[10] = " ".length() << "   ".length();
      lIIIlIIlIlIlI[11] = (49 ^ 4) << " ".length() ^ 78 ^ 35;
      lIIIlIIlIlIlI[12] = 163 ^ 156;
      lIIIlIIlIlIlI[13] = 101 ^ 12 ^ "   ".length() << (143 ^ 138);
   }

   private static String lIlIllllIlllIl(String lllllllllllllllIIlllIIlIIlIIIlIl, String lllllllllllllllIIlllIIlIIlIIIllI) {
      try {
         String lllllllllllllllIIlllIIlIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lIIIlIIlIlIlI[10]), "DES");
         Cipher lllllllllllllllIIlllIIlIIlIIlIIl = Cipher.getInstance("DES");
         lllllllllllllllIIlllIIlIIlIIlIIl.init(lIIIlIIlIlIlI[3], lllllllllllllllIIlllIIlIIlIIIIll);
         return new String(lllllllllllllllIIlllIIlIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlllllIIlII(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIlllllIIIlI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIlllllIIIll(Object var0, Object var1) {
      return var0 != var1;
   }

   public String getHudInfo() {
      return lllllllllllllllIIlllIIlIIlllIlII.highlightMode.getValueAsString().replaceAll(lIIIlIIlIIlll[lIIIlIIlIlIlI[11]], lIIIlIIlIIlll[lIIIlIIlIlIlI[10]]);
   }

   static {
      lIlIlllllIIIII();
      lIlIllllIlllll();
   }

   private static boolean lIlIlllllIIIIl(Object var0) {
      return var0 != null;
   }

   private static String lIlIllllIllllI(String lllllllllllllllIIlllIIlIIlIlIlII, String lllllllllllllllIIlllIIlIIlIlIIll) {
      try {
         short lllllllllllllllIIlllIIlIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIIlllIIlIIlIIllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIIlIIlIIllll.init(lIIIlIIlIlIlI[3], lllllllllllllllIIlllIIlIIlIlIIII);
         return new String(lllllllllllllllIIlllIIlIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void onWorldRender(RenderEvent lllllllllllllllIIlllIIlIlIIIIlll) {
      float[] var10000 = new float[lIIIlIIlIlIlI[1]];
      var10000[lIIIlIIlIlIlI[0]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
      short lllllllllllllllIIlllIIlIIlllllll = var10000;
      int lllllllllllllllIIlllIIlIIllllllI = Color.HSBtoRGB(lllllllllllllllIIlllIIlIIlllllll[lIIIlIIlIlIlI[0]], 1.0F, 1.0F);
      boolean lllllllllllllllIIlllIIlIIlllllIl = lllllllllllllllIIlllIIlIIllllllI >> lIIIlIIlIlIlI[9] & lIIIlIIlIlIlI[2];
      int lllllllllllllllIIlllIIlIlIIIIIll = lllllllllllllllIIlllIIlIIllllllI >> lIIIlIIlIlIlI[10] & lIIIlIIlIlIlI[2];
      boolean lllllllllllllllIIlllIIlIIllllIll = lllllllllllllllIIlllIIlIIllllllI & lIIIlIIlIlIlI[2];
      boolean lllllllllllllllIIlllIIlIIllllIlI = mc.field_71476_x;
      if (lIlIlllllIIIIl(lllllllllllllllIIlllIIlIIllllIlI) && lIlIlllllIIIlI(lllllllllllllllIIlllIIlIIllllIlI.field_72313_a, Type.BLOCK) && lIlIlllllIIIIl(lllllllllllllllIIlllIIlIIllllIlI.field_178784_b)) {
         char lllllllllllllllIIlllIIlIIllllIIl = lllllllllllllllIIlllIIlIIllllIlI.func_178782_a();
         byte lllllllllllllllIIlllIIlIIllllIII = mc.field_71441_e.func_180495_p(lllllllllllllllIIlllIIlIIllllIIl);
         if (lIlIlllllIIIll(mc.field_71441_e.func_180495_p(lllllllllllllllIIlllIIlIIllllIIl).func_185904_a(), Material.field_151579_a) && lIlIlllllIIlII(mc.field_71441_e.func_175723_af().func_177746_a(lllllllllllllllIIlllIIlIIllllIIl))) {
            Vec3d lllllllllllllllIIlllIIlIlIIIlIll = MathUtil.interpolateEntity(mc.field_71439_g, mc.func_184121_ak());
            switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$BlockHighlight$AppendModes[((BlockHighlight.AppendModes)lllllllllllllllIIlllIIlIlIIIIIII.highlightMode.getValue()).ordinal()]) {
            case 1:
               SnowTessellator.prepare(lIIIlIIlIlIlI[11]);
               if (lIlIlllllIIlII((Boolean)lllllllllllllllIIlllIIlIlIIIIIII.rainbow.getValue())) {
                  SnowTessellator.drawBox(lllllllllllllllIIlllIIlIIllllIIl, lllllllllllllllIIlllIIlIIlllllIl, lllllllllllllllIIlllIIlIlIIIIIll, lllllllllllllllIIlllIIlIIllllIll, (Integer)lllllllllllllllIIlllIIlIlIIIIIII.alpha.getValue(), lIIIlIIlIlIlI[12]);
                  "".length();
                  if (" ".length() != " ".length()) {
                     return;
                  }
               } else {
                  SnowTessellator.drawBox(lllllllllllllllIIlllIIlIIllllIIl, (Integer)lllllllllllllllIIlllIIlIlIIIIIII.red.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.green.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.blue.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.alpha.getValue(), lIIIlIIlIlIlI[12]);
               }

               SnowTessellator.release();
               "".length();
               if (null != null) {
                  return;
               }
               break;
            case 2:
               if (lIlIlllllIIlII((Boolean)lllllllllllllllIIlllIIlIlIIIIIII.rainbow.getValue())) {
                  SnowTessellator.drawBoundingBox(lllllllllllllllIIlllIIlIIllllIII.func_185918_c(mc.field_71441_e, lllllllllllllllIIlllIIlIIllllIIl).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIIlllIIlIlIIIlIll.field_72450_a, -lllllllllllllllIIlllIIlIlIIIlIll.field_72448_b, -lllllllllllllllIIlllIIlIlIIIlIll.field_72449_c), (Float)lllllllllllllllIIlllIIlIlIIIIIII.width.getValue(), lllllllllllllllIIlllIIlIIlllllIl, lllllllllllllllIIlllIIlIlIIIIIll, lllllllllllllllIIlllIIlIIllllIll, (Integer)lllllllllllllllIIlllIIlIlIIIIIII.alpha.getValue());
                  "".length();
                  if (" ".length() == 0) {
                     return;
                  }
               } else {
                  SnowTessellator.drawBoundingBox(lllllllllllllllIIlllIIlIIllllIII.func_185918_c(mc.field_71441_e, lllllllllllllllIIlllIIlIIllllIIl).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIIlllIIlIlIIIlIll.field_72450_a, -lllllllllllllllIIlllIIlIlIIIlIll.field_72448_b, -lllllllllllllllIIlllIIlIlIIIlIll.field_72449_c), (Float)lllllllllllllllIIlllIIlIlIIIIIII.width.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.red.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.green.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.blue.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.alpha.getValue());
                  "".length();
                  if (((187 ^ 178) << (" ".length() << (" ".length() << " ".length())) ^ 44 + 15 - -77 + 13) <= 0) {
                     return;
                  }
               }
               break;
            case 3:
               SnowTessellator.prepare(lIIIlIIlIlIlI[11]);
               if (lIlIlllllIIlII((Boolean)lllllllllllllllIIlllIIlIlIIIIIII.rainbow.getValue())) {
                  SnowTessellator.drawBox(lllllllllllllllIIlllIIlIIllllIIl, lllllllllllllllIIlllIIlIIlllllIl, lllllllllllllllIIlllIIlIlIIIIIll, lllllllllllllllIIlllIIlIIllllIll, (Integer)lllllllllllllllIIlllIIlIlIIIIIII.alpha.getValue(), (Integer)GeometryMasks.FACEMAP.get(lllllllllllllllIIlllIIlIIllllIlI.field_178784_b));
                  "".length();
                  if (" ".length() != " ".length()) {
                     return;
                  }
               } else {
                  SnowTessellator.drawBox(lllllllllllllllIIlllIIlIIllllIIl, (Integer)lllllllllllllllIIlllIIlIlIIIIIII.red.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.green.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.blue.getValue(), (Integer)lllllllllllllllIIlllIIlIlIIIIIII.alpha.getValue(), (Integer)GeometryMasks.FACEMAP.get(lllllllllllllllIIlllIIlIIllllIlI.field_178784_b));
               }

               SnowTessellator.release();
            }
         }
      }

   }

   private static String lIlIllllIlllII(String lllllllllllllllIIlllIIlIIllIlIIl, String lllllllllllllllIIlllIIlIIllIlIII) {
      lllllllllllllllIIlllIIlIIllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double lllllllllllllllIIlllIIlIIllIIIlI = new StringBuilder();
      char[] lllllllllllllllIIlllIIlIIllIIllI = lllllllllllllllIIlllIIlIIllIlIII.toCharArray();
      byte lllllllllllllllIIlllIIlIIllIIIII = lIIIlIIlIlIlI[0];
      Exception lllllllllllllllIIlllIIlIIlIlllll = lllllllllllllllIIlllIIlIIllIlIIl.toCharArray();
      short lllllllllllllllIIlllIIlIIlIllllI = lllllllllllllllIIlllIIlIIlIlllll.length;
      int lllllllllllllllIIlllIIlIIlIlllIl = lIIIlIIlIlIlI[0];

      do {
         if (!lIlIlllllIIlIl(lllllllllllllllIIlllIIlIIlIlllIl, lllllllllllllllIIlllIIlIIlIllllI)) {
            return String.valueOf(lllllllllllllllIIlllIIlIIllIIIlI);
         }

         char lllllllllllllllIIlllIIlIIllIlIlI = lllllllllllllllIIlllIIlIIlIlllll[lllllllllllllllIIlllIIlIIlIlllIl];
         lllllllllllllllIIlllIIlIIllIIIlI.append((char)(lllllllllllllllIIlllIIlIIllIlIlI ^ lllllllllllllllIIlllIIlIIllIIllI[lllllllllllllllIIlllIIlIIllIIIII % lllllllllllllllIIlllIIlIIllIIllI.length]));
         "".length();
         ++lllllllllllllllIIlllIIlIIllIIIII;
         ++lllllllllllllllIIlllIIlIIlIlllIl;
         "".length();
      } while(" ".length() << " ".length() != 0);

      return null;
   }

   private static boolean lIlIlllllIIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private static enum AppendModes {
      // $FF: synthetic field
      FullBox,
      // $FF: synthetic field
      Outline;

      // $FF: synthetic field
      private static final int[] lIIIlIlIIlIII;
      // $FF: synthetic field
      SideHit;

      // $FF: synthetic field
      private static final String[] lIIIlIIIlIlll;

      private static void lIlIllllIIIlIl() {
         lIIIlIIIlIlll = new String[lIIIlIlIIlIII[3]];
         lIIIlIIIlIlll[lIIIlIlIIlIII[0]] = lIlIllllIIIIll("HxgZFRE2FQ==", "YmuyS");
         lIIIlIIIlIlll[lIIIlIlIIlIII[1]] = lIlIllllIIIlII("StgDEL8DDRg=", "IbfpO");
         lIIIlIIIlIlll[lIIIlIlIIlIII[2]] = lIlIllllIIIIll("IjsdFS8YJg==", "qRypg");
      }

      private static boolean lIllIIIIlIllIl(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIllIIIIlIllII();
         lIlIllllIIIlIl();
         FullBox = new BlockHighlight.AppendModes(lIIIlIIIlIlll[lIIIlIlIIlIII[0]], lIIIlIlIIlIII[0]);
         Outline = new BlockHighlight.AppendModes(lIIIlIIIlIlll[lIIIlIlIIlIII[1]], lIIIlIlIIlIII[1]);
         SideHit = new BlockHighlight.AppendModes(lIIIlIIIlIlll[lIIIlIlIIlIII[2]], lIIIlIlIIlIII[2]);
         BlockHighlight.AppendModes[] var10000 = new BlockHighlight.AppendModes[lIIIlIlIIlIII[3]];
         var10000[lIIIlIlIIlIII[0]] = FullBox;
         var10000[lIIIlIlIIlIII[1]] = Outline;
         var10000[lIIIlIlIIlIII[2]] = SideHit;
      }

      private static String lIlIllllIIIIll(String lllllllllllllllIIllIllllIIllIIll, String lllllllllllllllIIllIllllIIllIlll) {
         lllllllllllllllIIllIllllIIllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIIllIllllIIllIllI = new StringBuilder();
         char[] lllllllllllllllIIllIllllIIllIlIl = lllllllllllllllIIllIllllIIllIlll.toCharArray();
         int lllllllllllllllIIllIllllIIllIlII = lIIIlIlIIlIII[0];
         float lllllllllllllllIIllIlIlllIllIlll = lllllllllllllllIIllIllllIIllIIll.toCharArray();
         int lllllllllllllllIIllIlIlllIllIllI = lllllllllllllllIIllIlIlllIllIlll.length;
         int lllllllllllllllIIllIlIlllIllIlIl = lIIIlIlIIlIII[0];

         do {
            if (!lIllIIIIlIllIl(lllllllllllllllIIllIlIlllIllIlIl, lllllllllllllllIIllIlIlllIllIllI)) {
               return String.valueOf(lllllllllllllllIIllIllllIIllIllI);
            }

            char lllllllllllllllIIllIllllIIlllIIl = lllllllllllllllIIllIlIlllIllIlll[lllllllllllllllIIllIlIlllIllIlIl];
            lllllllllllllllIIllIllllIIllIllI.append((char)(lllllllllllllllIIllIllllIIlllIIl ^ lllllllllllllllIIllIllllIIllIlIl[lllllllllllllllIIllIllllIIllIlII % lllllllllllllllIIllIllllIIllIlIl.length]));
            "".length();
            ++lllllllllllllllIIllIllllIIllIlII;
            ++lllllllllllllllIIllIlIlllIllIlIl;
            "".length();
         } while(null == null);

         return null;
      }

      private static String lIlIllllIIIlII(String lllllllllllllllIIllIlIlllIlIlIlI, String lllllllllllllllIIllIlIlllIlIlIll) {
         try {
            SecretKeySpec lllllllllllllllIIllIlIlllIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIlllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIlIlllIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIlIlllIlIlllI.init(lIIIlIlIIlIII[2], lllllllllllllllIIllIlIlllIlIllll);
            return new String(lllllllllllllllIIllIlIlllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIlllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIllIIIIlIllII() {
         lIIIlIlIIlIII = new int[4];
         lIIIlIlIIlIII[0] = (164 ^ 187) & ~(122 ^ 101);
         lIIIlIlIIlIII[1] = " ".length();
         lIIIlIlIIlIII[2] = " ".length() << " ".length();
         lIIIlIlIIlIII[3] = "   ".length();
      }
   }
}
