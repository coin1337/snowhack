package rr.snowhack.snow.gui.snow.theme.staticui;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.component.Radar;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Wrapper;

public class RadarUI extends AbstractComponentUI<Radar> {
   // $FF: synthetic field
   public static final int radius;
   // $FF: synthetic field
   private static final String[] lIIIlIlIIIllI;
   // $FF: synthetic field
   private static final int[] lIIIlIlIIlIlI;
   // $FF: synthetic field
   float scale = 2.0F;

   private static void lIllIIIIlIlIll() {
      lIIIlIlIIIllI = new String[lIIIlIlIIlIlI[11]];
      lIIIlIlIIIllI[lIIIlIlIIlIlI[3]] = lIllIIIIlIIlII("+GDGNYKSUmk=", "nRKUy");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[5]] = lIllIIIIlIIlII("anYIVbg5vOs=", "vnVZA");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[1]] = lIllIIIIlIIlII("Jzm2CxAWI74=", "oLZOP");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[6]] = lIllIIIIlIIlII("1jkRG0mTgLE=", "rwMgP");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[7]] = lIllIIIIlIlIII("16ha8oqLRnU=", "xTDhl");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[8]] = lIllIIIIlIlIII("x0y2qjlRVS4=", "yFOaY");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[9]] = lIllIIIIlIlIIl("bTE=", "FIXmJ");
      lIIIlIlIIIllI[lIIIlIlIIlIlI[10]] = lIllIIIIlIlIIl("w5ZaPU4=", "qmEev");
   }

   private static boolean lIllIIIIllIlII(int var0) {
      return var0 == 0;
   }

   private static String lIllIIIIlIIlII(String lllllllllllllllIIllIlllIIllIIlII, String lllllllllllllllIIllIlllIIllIIIIl) {
      try {
         short lllllllllllllllIIllIlllIIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIllIlllIIllIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlllIIllIIllI.init(lIIIlIlIIlIlI[1], lllllllllllllllIIllIlllIIllIIIII);
         return new String(lllllllllllllllIIllIlllIIllIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIllIIIIllIIII();
      lIllIIIIlIlIll();
      radius = lIIIlIlIIlIlI[4];
   }

   private static boolean lIllIIIIllIIll(int var0) {
      return var0 != 0;
   }

   private static int lIllIIIIllIIlI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static void lIllIIIIllIIII() {
      lIIIlIlIIlIlI = new int[12];
      lIIIlIlIIlIlI[0] = (181 ^ 152) << " ".length();
      lIIIlIlIIlIlI[1] = " ".length() << " ".length();
      lIIIlIlIIlIlI[2] = (215 ^ 142) << (11 ^ 14);
      lIIIlIlIIlIlI[3] = (90 ^ 5) & ~(211 ^ 140);
      lIIIlIlIIlIlI[4] = 95 ^ 114;
      lIIIlIlIIlIlI[5] = " ".length();
      lIIIlIlIIlIlI[6] = "   ".length();
      lIIIlIlIIlIlI[7] = " ".length() << (" ".length() << " ".length());
      lIIIlIlIIlIlI[8] = (6 ^ 11) << " ".length() ^ 117 ^ 106;
      lIIIlIlIIlIlI[9] = "   ".length() << " ".length();
      lIIIlIlIIlIlI[10] = (21 ^ 0) << "   ".length() ^ 56 + 17 - -64 + 38;
      lIIIlIlIIlIlI[11] = " ".length() << "   ".length();
   }

   public void renderComponent(Radar lllllllllllllllIIllIlllIllIIlIll, FontRenderer lllllllllllllllIIllIlllIllIIllll) {
      lllllllllllllllIIllIlllIllIlIIIl.scale = 2.0F;
      GL11.glTranslated((double)(lllllllllllllllIIllIlllIllIIlIll.getWidth() / lIIIlIlIIlIlI[1]), (double)(lllllllllllllllIIllIlllIllIIlIll.getHeight() / lIIIlIlIIlIlI[1]), 0.0D);
      GlStateManager.func_179090_x();
      GlStateManager.func_179140_f();
      GlStateManager.func_179147_l();
      GlStateManager.func_179129_p();
      GlStateManager.func_179094_E();
      GL11.glColor4f(0.11F, 0.11F, 0.11F, 0.6F);
      RenderHelper.drawCircle(0.0F, 0.0F, 45.0F);
      GL11.glRotatef(Wrapper.getPlayer().field_70177_z + 180.0F, 0.0F, 0.0F, -1.0F);
      Iterator lllllllllllllllIIllIlllIllIIlIIl = Wrapper.getWorld().field_72996_f.iterator();

      while(lIllIIIIllIIll(lllllllllllllllIIllIlllIllIIlIIl.hasNext())) {
         boolean lllllllllllllllIIllIlllIllIIlIII = (Entity)lllllllllllllllIIllIlllIllIIlIIl.next();
         if (lIllIIIIllIlII(lllllllllllllllIIllIlllIllIIlIII instanceof EntityLiving)) {
            "".length();
            if ((((97 ^ 72) << (" ".length() << " ".length()) ^ 27 + 80 - 10 + 40) << " ".length() & (((172 ^ 171) << (" ".length() << (" ".length() << " ".length())) ^ 88 ^ 5) << " ".length() ^ -" ".length())) >= " ".length() << " ".length()) {
               return;
            }
         } else {
            float lllllllllllllllIIllIlllIllIlllII = 1.0F;
            float lllllllllllllllIIllIlllIllIllIIl = 1.0F;
            if (lIllIIIIllIIll(EntityUtil.isPassive(lllllllllllllllIIllIlllIllIIlIII))) {
               lllllllllllllllIIllIlllIllIlllII = 0.0F;
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               lllllllllllllllIIllIlllIllIllIIl = 0.0F;
            }

            double lllllllllllllllIIllIlllIllIlIlll = lllllllllllllllIIllIlllIllIIlIII.field_70165_t - Wrapper.getPlayer().field_70165_t;
            double lllllllllllllllIIllIlllIllIlIlIl = lllllllllllllllIIllIlllIllIIlIII.field_70161_v - Wrapper.getPlayer().field_70161_v;
            long lllllllllllllllIIllIlllIlIllllll = Math.sqrt(Math.pow(lllllllllllllllIIllIlllIllIlIlll, 2.0D) + Math.pow(lllllllllllllllIIllIlllIllIlIlIl, 2.0D));
            if (lIllIIIIllIlIl(lIllIIIIllIIlI(lllllllllllllllIIllIlllIlIllllll, (double)(45.0F * lllllllllllllllIIllIlllIllIlIIIl.scale)))) {
               if (lIllIIIIllIllI(lIllIIIIllIIlI(Math.abs(Wrapper.getPlayer().field_70163_u - lllllllllllllllIIllIlllIllIIlIII.field_70163_u), 30.0D))) {
                  "".length();
                  if (((12 ^ 19) & ~(169 ^ 182)) >= " ".length()) {
                     return;
                  }
               } else {
                  GL11.glColor4f(lllllllllllllllIIllIlllIllIlllII, lllllllllllllllIIllIlllIllIllIIl, 0.0F, 0.5F);
                  RenderHelper.drawCircle((float)((int)lllllllllllllllIIllIlllIllIlIlll) / lllllllllllllllIIllIlllIllIlIIIl.scale, (float)((int)lllllllllllllllIIllIlllIllIlIlIl) / lllllllllllllllIIllIlllIllIlIIIl.scale, 2.5F / lllllllllllllllIIllIlllIllIlIIIl.scale);
                  "".length();
                  if (" ".length() == (((132 ^ 141) << "   ".length() ^ 9 ^ 68) & ((99 ^ 110) << (" ".length() << " ".length()) ^ 79 ^ 126 ^ -" ".length()))) {
                     return;
                  }
               }
            }
         }
      }

      GL11.glColor3f(1.0F, 1.0F, 1.0F);
      RenderHelper.drawCircle(0.0F, 0.0F, 3.0F / lllllllllllllllIIllIlllIllIlIIIl.scale);
      GL11.glLineWidth(1.8F);
      GL11.glColor3f(0.6F, 0.56F, 1.0F);
      GL11.glEnable(lIIIlIlIIlIlI[2]);
      RenderHelper.drawCircleOutline(0.0F, 0.0F, 45.0F);
      GL11.glDisable(lIIIlIlIIlIlI[2]);
      lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().drawString(-lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getStringWidth(lIIIlIlIIIllI[lIIIlIlIIlIlI[3]]) / lIIIlIlIIlIlI[1], lIIIlIlIIlIlI[4] - lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getFontHeight(), lIIIlIlIIIllI[lIIIlIlIIlIlI[5]]);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().drawString(-lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getStringWidth(lIIIlIlIIIllI[lIIIlIlIIlIlI[1]]) / lIIIlIlIIlIlI[1], lIIIlIlIIlIlI[4] - lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getFontHeight(), lIIIlIlIIIllI[lIIIlIlIIlIlI[6]]);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().drawString(-lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getStringWidth(lIIIlIlIIIllI[lIIIlIlIIlIlI[7]]) / lIIIlIlIIlIlI[1], lIIIlIlIIlIlI[4] - lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getFontHeight(), lIIIlIlIIIllI[lIIIlIlIIlIlI[8]]);
      GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
      lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().drawString(-lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getStringWidth(lIIIlIlIIIllI[lIIIlIlIIlIlI[9]]) / lIIIlIlIIlIlI[1], lIIIlIlIIlIlI[4] - lllllllllllllllIIllIlllIllIIlIll.getTheme().getFontRenderer().getFontHeight(), lIIIlIlIIIllI[lIIIlIlIIlIlI[10]]);
      GlStateManager.func_179121_F();
      GlStateManager.func_179098_w();
      GL11.glTranslated((double)(-lllllllllllllllIIllIlllIllIIlIll.getWidth() / lIIIlIlIIlIlI[1]), (double)(-lllllllllllllllIIllIlllIllIIlIll.getHeight() / lIIIlIlIIlIlI[1]), 0.0D);
   }

   private static String lIllIIIIlIlIII(String lllllllllllllllIIllIlllIlIIlIIll, String lllllllllllllllIIllIlllIlIIlIIIl) {
      try {
         SecretKeySpec lllllllllllllllIIllIlllIlIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIlIlI[11]), "DES");
         Cipher lllllllllllllllIIllIlllIlIIlIlll = Cipher.getInstance("DES");
         lllllllllllllllIIllIlllIlIIlIlll.init(lIIIlIlIIlIlI[1], lllllllllllllllIIllIlllIlIIllIIl);
         return new String(lllllllllllllllIIllIlllIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIIllIlIl(int var0) {
      return var0 <= 0;
   }

   private static boolean lIllIIIIllIlll(int var0, int var1) {
      return var0 < var1;
   }

   public void handleSizeComponent(Radar lllllllllllllllIIllIlllIlllllIlI) {
      lllllllllllllllIIllIlllIlllllIlI.setWidth(lIIIlIlIIlIlI[0]);
      lllllllllllllllIIllIlllIlllllIlI.setHeight(lIIIlIlIIlIlI[0]);
   }

   private static String lIllIIIIlIlIIl(String lllllllllllllllIIllIlllIIllllIIl, String lllllllllllllllIIllIlllIIlllIIll) {
      lllllllllllllllIIllIlllIIllllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIIllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlllIIlllIlll = new StringBuilder();
      byte lllllllllllllllIIllIlllIIlllIIIl = lllllllllllllllIIllIlllIIlllIIll.toCharArray();
      int lllllllllllllllIIllIlllIIlllIlIl = lIIIlIlIIlIlI[3];
      String lllllllllllllllIIllIlllIIllIllll = lllllllllllllllIIllIlllIIllllIIl.toCharArray();
      float lllllllllllllllIIllIlllIIllIlllI = lllllllllllllllIIllIlllIIllIllll.length;
      int lllllllllllllllIIllIlllIIllIllIl = lIIIlIlIIlIlI[3];

      do {
         if (!lIllIIIIllIlll(lllllllllllllllIIllIlllIIllIllIl, lllllllllllllllIIllIlllIIllIlllI)) {
            return String.valueOf(lllllllllllllllIIllIlllIIlllIlll);
         }

         char lllllllllllllllIIllIlllIIllllIlI = lllllllllllllllIIllIlllIIllIllll[lllllllllllllllIIllIlllIIllIllIl];
         lllllllllllllllIIllIlllIIlllIlll.append((char)(lllllllllllllllIIllIlllIIllllIlI ^ lllllllllllllllIIllIlllIIlllIIIl[lllllllllllllllIIllIlllIIlllIlIl % lllllllllllllllIIllIlllIIlllIIIl.length]));
         "".length();
         ++lllllllllllllllIIllIlllIIlllIlIl;
         ++lllllllllllllllIIllIlllIIllIllIl;
         "".length();
      } while("   ".length() != 0);

      return null;
   }

   private static boolean lIllIIIIllIllI(int var0) {
      return var0 > 0;
   }
}
