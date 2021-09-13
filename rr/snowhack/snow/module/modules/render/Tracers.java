package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.ColourUtils;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.HueCycler;

@Module.Info(
   name = "Tracers",
   description = "Draws lines to other living entities",
   category = Module.Category.RENDER
)
public class Tracers extends Module {
   // $FF: synthetic field
   private Setting<Boolean> animals;
   // $FF: synthetic field
   private Setting<Boolean> distance;
   // $FF: synthetic field
   private Setting<Boolean> players;
   // $FF: synthetic field
   HueCycler cycler;
   // $FF: synthetic field
   private Setting<Boolean> mobs;
   // $FF: synthetic field
   private Setting<Float> width;
   // $FF: synthetic field
   private static final String[] lllllIIllIll;
   // $FF: synthetic field
   private static final int[] lllllIlIlIIl;
   // $FF: synthetic field
   private Setting<Float> opacity;
   // $FF: synthetic field
   private Setting<Boolean> friends;
   // $FF: synthetic field
   private Setting<Double> range;

   private void drawRainbowToEntity(Entity lllllllllllllllIlIIlllIIlIIlllII, float lllllllllllllllIlIIlllIIlIIlIIII) {
      Vec3d lllllllllllllllIlIIlllIIlIIllIlI = (new Vec3d(0.0D, 0.0D, 1.0D)).func_178789_a(-((float)Math.toRadians((double)Minecraft.func_71410_x().field_71439_g.field_70125_A))).func_178785_b(-((float)Math.toRadians((double)Minecraft.func_71410_x().field_71439_g.field_70177_z)));
      boolean lllllllllllllllIlIIlllIIlIIIlllI = interpolate(lllllllllllllllIlIIlllIIlIIlllII);
      double lllllllllllllllIlIIlllIIlIIllIII = lllllllllllllllIlIIlllIIlIIIlllI[lllllIlIlIIl[0]];
      double lllllllllllllllIlIIlllIIlIIlIlll = lllllllllllllllIlIIlllIIlIIIlllI[lllllIlIlIIl[1]];
      double lllllllllllllllIlIIlllIIlIIlIllI = lllllllllllllllIlIIlllIIlIIIlllI[lllllIlIlIIl[2]];
      double lllllllllllllllIlIIlllIIlIIlIlIl = lllllllllllllllIlIIlllIIlIIllIlI.field_72450_a;
      double lllllllllllllllIlIIlllIIlIIlIlII = lllllllllllllllIlIIlllIIlIIllIlI.field_72448_b + (double)mc.field_71439_g.func_70047_e();
      double lllllllllllllllIlIIlllIIlIIlIIll = lllllllllllllllIlIIlllIIlIIllIlI.field_72449_c;
      GL11.glBlendFunc(lllllIlIlIIl[9], lllllIlIlIIl[10]);
      GL11.glEnable(lllllIlIlIIl[11]);
      GL11.glLineWidth((Float)lllllllllllllllIlIIlllIIlIIlllIl.width.getValue());
      GL11.glDisable(lllllIlIlIIl[12]);
      GL11.glDisable(lllllIlIlIIl[13]);
      GL11.glDepthMask((boolean)lllllIlIlIIl[0]);
      lllllllllllllllIlIIlllIIlIIlllIl.cycler.reset();
      lllllllllllllllIlIIlllIIlIIlllIl.cycler.setNext(lllllllllllllllIlIIlllIIlIIlIIII);
      GlStateManager.func_179140_f();
      GL11.glLoadIdentity();
      mc.field_71460_t.func_78467_g(mc.func_184121_ak());
      GL11.glBegin(lllllIlIlIIl[1]);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIlIIllIII, lllllllllllllllIlIIlllIIlIIlIlll, lllllllllllllllIlIIlllIIlIIlIllI);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIlIIlIlIl, lllllllllllllllIlIIlllIIlIIlIlII, lllllllllllllllIlIIlllIIlIIlIIll);
      lllllllllllllllIlIIlllIIlIIlllIl.cycler.setNext(lllllllllllllllIlIIlllIIlIIlIIII);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIlIIlIlIl, lllllllllllllllIlIIlllIIlIIlIlII, lllllllllllllllIlIIlllIIlIIlIIll);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIlIIlIlIl, lllllllllllllllIlIIlllIIlIIlIlII, lllllllllllllllIlIIlllIIlIIlIIll);
      GL11.glEnd();
      GL11.glEnable(lllllIlIlIIl[12]);
      GL11.glEnable(lllllIlIlIIl[13]);
      GL11.glDepthMask((boolean)lllllIlIlIIl[1]);
      GL11.glDisable(lllllIlIlIIl[11]);
      GL11.glColor3d(1.0D, 1.0D, 1.0D);
      GlStateManager.func_179145_e();
   }

   private static boolean lIlIIIlllIlIIl(int var0) {
      return var0 == 0;
   }

   public void onWorldRender(RenderEvent lllllllllllllllIlIIlllIIlIlIllIl) {
      GlStateManager.func_179094_E();
      Minecraft.func_71410_x().field_71441_e.field_72996_f.stream().filter(EntityUtil::isLiving).filter((lllllllllllllllIlIIllIllllllIlII) -> {
         int var10000;
         if (lIlIIIlllIlIIl(EntityUtil.isFakeLocalPlayer(lllllllllllllllIlIIllIllllllIlII))) {
            var10000 = lllllIlIlIIl[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
               return (boolean)(((88 ^ 81) << (" ".length() << " ".length()) ^ 121 ^ 112) & (109 ^ 60 ^ (184 ^ 167) << (" ".length() << " ".length()) ^ -" ".length()));
            }
         } else {
            var10000 = lllllIlIlIIl[0];
         }

         return (boolean)var10000;
      }).filter((lllllllllllllllIlIIllIllllllIlll) -> {
         int var10000;
         if (lIlIIIlllIlIII(lllllllllllllllIlIIllIllllllIlll instanceof EntityPlayer)) {
            if (lIlIIIlllIlIII((Boolean)lllllllllllllllIlIIllIlllllllIlI.players.getValue()) && lIlIIIlllIllIl(mc.field_71439_g, lllllllllllllllIlIIllIllllllIlll)) {
               var10000 = lllllIlIlIIl[1];
               "".length();
               if ((((179 ^ 148) << (" ".length() << " ".length()) ^ 155 + 167 - 285 + 132) & ("   ".length() << "   ".length() ^ 94 ^ 115 ^ -" ".length())) != 0) {
                  return (boolean)(((23 ^ 28) << (" ".length() << " ".length()) ^ 109 ^ 20) & (46 ^ 29 ^ (87 ^ 100) << " ".length() ^ -" ".length()));
               }
            } else {
               var10000 = lllllIlIlIIl[0];
               "".length();
               if (-" ".length() > 0) {
                  return (boolean)(" ".length() << (" ".length() << " ".length()) & ~(" ".length() << (" ".length() << " ".length())));
               }
            }
         } else if (lIlIIIlllIlIII(EntityUtil.isPassive(lllllllllllllllIlIIllIllllllIlll))) {
            var10000 = (Boolean)lllllllllllllllIlIIllIlllllllIlI.animals.getValue();
            "".length();
            if ((((47 ^ 18) << " ".length() ^ 170 ^ 133) & (1 ^ 24 ^ (125 ^ 110) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
               return (boolean)(" ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length()));
            }
         } else {
            var10000 = (Boolean)lllllllllllllllIlIIllIlllllllIlI.mobs.getValue();
         }

         return (boolean)var10000;
      }).filter((lllllllllllllllIlIIllIllllllllIl) -> {
         int var10000;
         if (lIlIIIlllIllII(lIlIIIlllIlIll((double)mc.field_71439_g.func_70032_d(lllllllllllllllIlIIllIllllllllIl), (Double)lllllllllllllllIlIIlllIIIIIIIIII.range.getValue()))) {
            var10000 = lllllIlIlIIl[1];
            "".length();
            if (null != null) {
               return (boolean)((199 ^ 154) & ~(57 ^ 100));
            }
         } else {
            var10000 = lllllIlIlIIl[0];
         }

         return (boolean)var10000;
      }).forEach((lllllllllllllllIlIIlllIIIIIIllIl) -> {
         int lllllllllllllllIlIIlllIIIIIIllII = lllllllllllllllIlIIlllIIIIIIlllI.getColour(lllllllllllllllIlIIlllIIIIIIllIl);
         short lllllllllllllllIlIIlllIIIIIIIlIl = (float)(lllllllllllllllIlIIlllIIIIIIllII >>> lllllIlIlIIl[16] & lllllIlIlIIl[14]) / 255.0F;
         byte lllllllllllllllIlIIlllIIIIIIIlII = (float)(lllllllllllllllIlIIlllIIIIIIllII >>> lllllIlIlIIl[17] & lllllIlIlIIl[14]) / 255.0F;
         boolean lllllllllllllllIlIIlllIIIIIIIIll = (float)(lllllllllllllllIlIIlllIIIIIIllII & lllllIlIlIIl[14]) / 255.0F;
         drawLineToEntity(lllllllllllllllIlIIlllIIIIIIllIl, lllllllllllllllIlIIlllIIIIIIIlIl, lllllllllllllllIlIIlllIIIIIIIlII, lllllllllllllllIlIIlllIIIIIIIIll, (Float)lllllllllllllllIlIIlllIIIIIIlllI.opacity.getValue(), (Float)lllllllllllllllIlIIlllIIIIIIlllI.width.getValue());
      });
      GlStateManager.func_179121_F();
   }

   private static boolean lIlIIIlllIllIl(Object var0, Object var1) {
      return var0 != var1;
   }

   public static double[] interpolate(Entity lllllllllllllllIlIIlllIIIlllIIIl) {
      short lllllllllllllllIlIIlllIIIllIllII = interpolate(lllllllllllllllIlIIlllIIIlllIIIl.field_70165_t, lllllllllllllllIlIIlllIIIlllIIIl.field_70142_S) - mc.func_175598_ae().field_78725_b;
      double lllllllllllllllIlIIlllIIIllIllll = interpolate(lllllllllllllllIlIIlllIIIlllIIIl.field_70163_u, lllllllllllllllIlIIlllIIIlllIIIl.field_70137_T) - mc.func_175598_ae().field_78726_c;
      short lllllllllllllllIlIIlllIIIllIlIlI = interpolate(lllllllllllllllIlIIlllIIIlllIIIl.field_70161_v, lllllllllllllllIlIIlllIIIlllIIIl.field_70136_U) - mc.func_175598_ae().field_78723_d;
      double[] var10000 = new double[lllllIlIlIIl[3]];
      var10000[lllllIlIlIIl[0]] = lllllllllllllllIlIIlllIIIllIllII;
      var10000[lllllIlIlIIl[1]] = lllllllllllllllIlIIlllIIIllIllll;
      var10000[lllllIlIlIIl[2]] = lllllllllllllllIlIIlllIIIllIlIlI;
      return var10000;
   }

   private static boolean lIlIIIlllIlIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIIlllIlllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIIlllIllII(int var0) {
      return var0 < 0;
   }

   public static void drawLine(double lllllllllllllllIlIIlllIIIlIIlIlI, double lllllllllllllllIlIIlllIIIIllllll, double lllllllllllllllIlIIlllIIIlIIlIII, double lllllllllllllllIlIIlllIIIIllllIl, float lllllllllllllllIlIIlllIIIIllllII, float lllllllllllllllIlIIlllIIIlIIIlIl, float lllllllllllllllIlIIlllIIIlIIIlII, float lllllllllllllllIlIIlllIIIIlllIIl, float lllllllllllllllIlIIlllIIIIlllIII) {
      String lllllllllllllllIlIIlllIIIIllIlll = (new Vec3d(0.0D, 0.0D, 1.0D)).func_178789_a(-((float)Math.toRadians((double)Minecraft.func_71410_x().field_71439_g.field_70125_A))).func_178785_b(-((float)Math.toRadians((double)Minecraft.func_71410_x().field_71439_g.field_70177_z)));
      drawLineFromPosToPos(lllllllllllllllIlIIlllIIIIllIlll.field_72450_a, lllllllllllllllIlIIlllIIIIllIlll.field_72448_b + (double)mc.field_71439_g.func_70047_e(), lllllllllllllllIlIIlllIIIIllIlll.field_72449_c, lllllllllllllllIlIIlllIIIlIIlIlI, lllllllllllllllIlIIlllIIIIllllll, lllllllllllllllIlIIlllIIIlIIlIII, lllllllllllllllIlIIlllIIIIllllIl, lllllllllllllllIlIIlllIIIIllllII, lllllllllllllllIlIIlllIIIlIIIlIl, lllllllllllllllIlIIlllIIIlIIIlII, lllllllllllllllIlIIlllIIIIlllIIl, lllllllllllllllIlIIlllIIIIlllIII);
   }

   public void onUpdate() {
      lllllllllllllllIlIIlllIIlIlIlIlI.cycler.next();
      "".length();
   }

   public static void drawLineFromPosToPos(double lllllllllllllllIlIIlllIIIIlIlIll, double lllllllllllllllIlIIlllIIIIlIlIlI, double lllllllllllllllIlIIlllIIIIlIlIIl, double lllllllllllllllIlIIlllIIIIlIlIII, double lllllllllllllllIlIIlllIIIIlIIlll, double lllllllllllllllIlIIlllIIIIIlIlll, double lllllllllllllllIlIIlllIIIIlIIlIl, float lllllllllllllllIlIIlllIIIIlIIlII, float lllllllllllllllIlIIlllIIIIlIIIll, float lllllllllllllllIlIIlllIIIIIlllll, float lllllllllllllllIlIIlllIIIIIlllIl, float lllllllllllllllIlIIlllIIIIIlllII) {
      GL11.glBlendFunc(lllllIlIlIIl[9], lllllIlIlIIl[10]);
      GL11.glEnable(lllllIlIlIIl[11]);
      GL11.glLineWidth(lllllllllllllllIlIIlllIIIIIlllII);
      GL11.glDisable(lllllIlIlIIl[12]);
      GL11.glDisable(lllllIlIlIIl[13]);
      GL11.glEnable(lllllIlIlIIl[15]);
      GL11.glDepthMask((boolean)lllllIlIlIIl[0]);
      GL11.glColor4f(lllllllllllllllIlIIlllIIIIlIIlII, lllllllllllllllIlIIlllIIIIlIIIll, lllllllllllllllIlIIlllIIIIIlllll, lllllllllllllllIlIIlllIIIIIlllIl);
      GlStateManager.func_179140_f();
      GL11.glLoadIdentity();
      mc.field_71460_t.func_78467_g(mc.func_184121_ak());
      GL11.glBegin(lllllIlIlIIl[1]);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIIIlIlIll, lllllllllllllllIlIIlllIIIIlIlIlI, lllllllllllllllIlIIlllIIIIlIlIIl);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIIIlIlIII, lllllllllllllllIlIIlllIIIIlIIlll, lllllllllllllllIlIIlllIIIIIlIlll);
      GL11.glVertex3d(lllllllllllllllIlIIlllIIIIlIlIII, lllllllllllllllIlIIlllIIIIlIIlll, lllllllllllllllIlIIlllIIIIIlIlll);
      GL11.glEnd();
      GL11.glDisable(lllllIlIlIIl[15]);
      GL11.glEnable(lllllIlIlIIl[12]);
      GL11.glEnable(lllllIlIlIIl[13]);
      GL11.glDepthMask((boolean)lllllIlIlIIl[1]);
      GL11.glDisable(lllllIlIlIIl[11]);
      GL11.glColor3d(1.0D, 1.0D, 1.0D);
      GlStateManager.func_179145_e();
   }

   public static double interpolate(double lllllllllllllllIlIIlllIIIlllIlll, double lllllllllllllllIlIIlllIIIllllIII) {
      return lllllllllllllllIlIIlllIIIllllIII + (lllllllllllllllIlIIlllIIIlllIlll - lllllllllllllllIlIIlllIIIllllIII) * (double)mc.func_184121_ak();
   }

   private static String lIlIIIlIllllII(String lllllllllllllllIlIIllIlllllIllII, String lllllllllllllllIlIIllIlllllIlIll) {
      try {
         boolean lllllllllllllllIlIIllIlllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIllIlllllIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIllIlllllIlllI.init(lllllIlIlIIl[2], lllllllllllllllIlIIllIlllllIlIII);
         return new String(lllllllllllllllIlIIllIlllllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static int lIlIIIlllIIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   static {
      lIlIIIlllIIllI();
      lIlIIIlIllllll();
   }

   private static String lIlIIIlIlllIll(String lllllllllllllllIlIIllIllllIlllll, String lllllllllllllllIlIIllIllllIlllII) {
      try {
         SecretKeySpec lllllllllllllllIlIIllIlllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIllllIlllII.getBytes(StandardCharsets.UTF_8)), lllllIlIlIIl[17]), "DES");
         Cipher lllllllllllllllIlIIllIlllllIIIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIIllIlllllIIIIl.init(lllllIlIlIIl[2], lllllllllllllllIlIIllIlllllIIIlI);
         return new String(lllllllllllllllIlIIllIlllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIIIlIllllll() {
      lllllIIllIll = new String[lllllIlIlIIl[17]];
      lllllIIllIll[lllllIlIlIIl[0]] = lIlIIIlIlllIlI("BSg4Cg4nNw==", "UDYsk");
      lllllIIllIll[lllllIlIlIIl[1]] = lIlIIIlIlllIlI("IDoeCxsNJw==", "aTwfz");
      lllllIIllIll[lllllIlIlIIl[2]] = lIlIIIlIlllIll("MCkzVO+Ze/8=", "tmsxI");
      lllllIIllIll[lllllIlIlIIl[3]] = lIlIIIlIlllIlI("AiAtFTogIQ==", "DRDpT");
      lllllIIllIll[lllllIlIlIIl[4]] = lIlIIIlIllllII("fSdtRN1Vi9VgVVmzBvlAQQ==", "CljhY");
      lllllIIllIll[lllllIlIlIIl[5]] = lIlIIIlIlllIlI("MSkBKzU=", "cHoLP");
      lllllIIllIll[lllllIlIlIIl[6]] = lIlIIIlIlllIll("07sw4g4KgOQ=", "zngav");
      lllllIIllIll[lllllIlIlIIl[7]] = lIlIIIlIllllII("QE1bX3pTlXY=", "DRTTE");
   }

   private int getColour(Entity lllllllllllllllIlIIlllIIIllllllI) {
      if (lIlIIIlllIlIII(lllllllllllllllIlIIlllIIIllllllI instanceof EntityPlayer)) {
         if (lIlIIIlllIlIIl((Boolean)lllllllllllllllIlIIlllIIIlllllll.distance.getValue())) {
            int var10000;
            if (lIlIIIlllIlIII(Friends.isFriend(lllllllllllllllIlIIlllIIIllllllI.func_70005_c_()))) {
               var10000 = ColourUtils.Colors.SKYBLUE;
               "".length();
               if ("   ".length() < " ".length()) {
                  return (87 ^ 52) & ~(17 ^ 114);
               }
            } else {
               var10000 = ColourUtils.Colors.WHITE;
            }

            return var10000;
         } else if (lIlIIIlllIlIII(Friends.isFriend(lllllllllllllllIlIIlllIIIllllllI.func_70005_c_())) && lIlIIIlllIlIII((Boolean)lllllllllllllllIlIIlllIIIlllllll.friends.getValue())) {
            return ColourUtils.toRGBA(lllllIlIlIIl[0], lllllIlIlIIl[14], lllllIlIlIIl[14], lllllIlIlIIl[14]);
         } else {
            float lllllllllllllllIlIIlllIIlIIIIIll = mc.field_71439_g.func_70032_d(lllllllllllllllIlIIlllIIIllllllI) / 50.0F * 255.0F;
            short lllllllllllllllIlIIlllIIIlllllII = 255.0F - lllllllllllllllIlIIlllIIlIIIIIll;
            return lIlIIIlllIlIlI(lIlIIIlllIIlll(mc.field_71439_g.func_70032_d(lllllllllllllllIlIIlllIIIllllllI), 50.0F)) ? ColourUtils.toRGBA(lllllIlIlIIl[0], lllllIlIlIIl[14], lllllIlIlIIl[0], lllllIlIlIIl[14]) : ColourUtils.toRGBA((int)lllllllllllllllIlIIlllIIIlllllII, (int)lllllllllllllllIlIIlllIIlIIIIIll, lllllIlIlIIl[0], lllllIlIlIIl[14]);
         }
      } else {
         return lIlIIIlllIlIII(EntityUtil.isPassive(lllllllllllllllIlIIlllIIIllllllI)) ? ColourUtils.Colors.GREEN : ColourUtils.Colors.RED;
      }
   }

   public static void drawLineToEntity(Entity lllllllllllllllIlIIlllIIIllIIIlI, float lllllllllllllllIlIIlllIIIlIllIlI, float lllllllllllllllIlIIlllIIIlIllIIl, float lllllllllllllllIlIIlllIIIlIllIII, float lllllllllllllllIlIIlllIIIlIllllI, float lllllllllllllllIlIIlllIIIlIlllIl) {
      long lllllllllllllllIlIIlllIIIlIlIlIl = interpolate(lllllllllllllllIlIIlllIIIllIIIlI);
      drawLine(lllllllllllllllIlIIlllIIIlIlIlIl[lllllIlIlIIl[0]], lllllllllllllllIlIIlllIIIlIlIlIl[lllllIlIlIIl[1]], lllllllllllllllIlIIlllIIIlIlIlIl[lllllIlIlIIl[2]], (double)lllllllllllllllIlIIlllIIIllIIIlI.field_70131_O, lllllllllllllllIlIIlllIIIlIllIlI, lllllllllllllllIlIIlllIIIlIllIIl, lllllllllllllllIlIIlllIIIlIllIII, lllllllllllllllIlIIlllIIIlIllllI, lllllllllllllllIlIIlllIIIlIlllIl);
   }

   private static String lIlIIIlIlllIlI(String lllllllllllllllIlIIllIllllIIlIlI, String lllllllllllllllIlIIllIllllIIlllI) {
      lllllllllllllllIlIIllIllllIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIIllIllllIIlIII = new StringBuilder();
      long lllllllllllllllIlIIllIllllIIIlll = lllllllllllllllIlIIllIllllIIlllI.toCharArray();
      int lllllllllllllllIlIIllIllllIIlIll = lllllIlIlIIl[0];
      long lllllllllllllllIlIIllIllllIIIlIl = lllllllllllllllIlIIllIllllIIlIlI.toCharArray();
      short lllllllllllllllIlIIllIllllIIIlII = lllllllllllllllIlIIllIllllIIIlIl.length;
      int lllllllllllllllIlIIllIllllIIIIll = lllllIlIlIIl[0];

      do {
         if (!lIlIIIlllIlllI(lllllllllllllllIlIIllIllllIIIIll, lllllllllllllllIlIIllIllllIIIlII)) {
            return String.valueOf(lllllllllllllllIlIIllIllllIIlIII);
         }

         char lllllllllllllllIlIIllIllllIlIIII = lllllllllllllllIlIIllIllllIIIlIl[lllllllllllllllIlIIllIllllIIIIll];
         lllllllllllllllIlIIllIllllIIlIII.append((char)(lllllllllllllllIlIIllIllllIlIIII ^ lllllllllllllllIlIIllIllllIIIlll[lllllllllllllllIlIIllIllllIIlIll % lllllllllllllllIlIIllIllllIIIlll.length]));
         "".length();
         ++lllllllllllllllIlIIllIllllIIlIll;
         ++lllllllllllllllIlIIllIllllIIIIll;
         "".length();
      } while(" ".length() << " ".length() > 0);

      return null;
   }

   public Tracers() {
      lllllllllllllllIlIIlllIIlIllIIIl.players = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.b(lllllIIllIll[lllllIlIlIIl[0]], (boolean)lllllIlIlIIl[1]));
      lllllllllllllllIlIIlllIIlIllIIIl.animals = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.b(lllllIIllIll[lllllIlIlIIl[1]], (boolean)lllllIlIlIIl[0]));
      lllllllllllllllIlIIlllIIlIllIIIl.mobs = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.b(lllllIIllIll[lllllIlIlIIl[2]], (boolean)lllllIlIlIIl[0]));
      lllllllllllllllIlIIlllIIlIllIIIl.friends = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.b(lllllIIllIll[lllllIlIlIIl[3]], (boolean)lllllIlIlIIl[1]));
      lllllllllllllllIlIIlllIIlIllIIIl.distance = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.b(lllllIIllIll[lllllIlIlIIl[4]], (boolean)lllllIlIlIIl[1]));
      lllllllllllllllIlIIlllIIlIllIIIl.range = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.d(lllllIIllIll[lllllIlIlIIl[5]], 200.0D));
      lllllllllllllllIlIIlllIIlIllIIIl.opacity = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.floatBuilder(lllllIIllIll[lllllIlIlIIl[6]]).withRange(0.0F, 1.0F).withValue((Number)1.0F));
      lllllllllllllllIlIIlllIIlIllIIIl.width = lllllllllllllllIlIIlllIIlIllIIIl.register(Settings.floatBuilder(lllllIIllIll[lllllIlIlIIl[7]]).withRange(0.0F, 2.0F).withValue((Number)1.5F));
      lllllllllllllllIlIIlllIIlIllIIIl.cycler = new HueCycler(lllllIlIlIIl[8]);
   }

   private static boolean lIlIIIlllIlIlI(int var0) {
      return var0 > 0;
   }

   private static void lIlIIIlllIIllI() {
      lllllIlIlIIl = new int[18];
      lllllIlIlIIl[0] = " ".length() << " ".length() & ~(" ".length() << " ".length());
      lllllIlIlIIl[1] = " ".length();
      lllllIlIlIIl[2] = " ".length() << " ".length();
      lllllIlIlIIl[3] = "   ".length();
      lllllIlIlIIl[4] = " ".length() << (" ".length() << " ".length());
      lllllIlIlIIl[5] = "   ".length() ^ "   ".length() << " ".length();
      lllllIlIlIIl[6] = "   ".length() << " ".length();
      lllllIlIlIIl[7] = (124 ^ 87) & ~(53 ^ 30) ^ 198 ^ 193;
      lllllIlIlIIl[8] = 1 + 172 - 97 + 149 << (" ".length() << (" ".length() << " ".length()));
      lllllIlIlIIl[9] = ((121 ^ 52) << " ".length()) + ((77 ^ 98) << (" ".length() << " ".length())) - (110 + 220 - 173 + 70) + (127 + 15 - 125 + 118 << " ".length()) << " ".length();
      lllllIlIlIIl[10] = 578 + 261 - 105 + 37;
      lllllIlIlIIl[11] = 1197 + 346 - 196 + 174 << " ".length();
      lllllIlIlIIl[12] = (896 + 161 - 624 + 500 << " ".length()) + (31 + 547 - -149 + 164 << " ".length()) - ((24 ^ 61) << "   ".length()) + 199 + 187 - 249 + 64;
      lllllIlIlIIl[13] = 750 + 397 - 521 + 551 + ((95 ^ 98) << (31 ^ 26)) - (1817 + 1634 - 2475 + 1713) + 1460 + 663 - 1163 + 1529;
      lllllIlIlIIl[14] = ((84 ^ 49) << " ".length()) + ((114 ^ 123) << (" ".length() << (" ".length() << " ".length()))) - (152 + 58 - 85 + 168) + ((16 ^ 117) << " ".length());
      lllllIlIlIIl[15] = (51 ^ 106) << (3 ^ 6);
      lllllIlIlIIl[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllllIlIlIIl[17] = " ".length() << "   ".length();
   }

   private static int lIlIIIlllIlIll(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }
}
