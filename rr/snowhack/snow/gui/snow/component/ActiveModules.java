package rr.snowhack.snow.gui.snow.component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.component.use.Label;
import rr.snowhack.snow.gui.rgui.util.ContainerHelper;

public class ActiveModules extends Label {
   // $FF: synthetic field
   private static final String[] lIIIIIIIIlllI;
   // $FF: synthetic field
   public boolean sort_up;
   // $FF: synthetic field
   private static final int[] lIIIIIIlIlIlI;

   private static void lIlIIllIIlllll() {
      lIIIIIIIIlllI = new String[lIIIIIIlIlIlI[1]];
      lIIIIIIIIlllI[lIIIIIIlIlIlI[0]] = lIlIIllIIlllIl("qs9kEYFEWh8=", "OdJSf");
   }

   private static void lIlIIlllllIIII() {
      lIIIIIIlIlIlI = new int[3];
      lIIIIIIlIlIlI[0] = (40 ^ 127) & ~(86 ^ 1);
      lIIIIIIlIlIlI[1] = " ".length();
      lIIIIIIlIlIlI[2] = " ".length() << " ".length();
   }

   static {
      lIlIIlllllIIII();
      lIlIIllIIlllll();
   }

   private static String lIlIIllIIlllIl(String lllllllllllllllIlIIIllllIIIIIlIl, String lllllllllllllllIlIIIllllIIIIIlII) {
      try {
         SecretKeySpec lllllllllllllllIlIIIllllIIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllllIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIlIIIllllIIIIIIII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIllllIIIIIIII.init(lIIIIIIlIlIlI[2], lllllllllllllllIlIIIllllIIIIlIII);
         return new String(lllllllllllllllIlIIIllllIIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public ActiveModules() {
      super(lIIIIIIIIlllI[lIIIIIIlIlIlI[0]]);
      lllllllllllllllIlIIIllllIIIIllIl.sort_up = (boolean)lIIIIIIlIlIlI[1];
      lllllllllllllllIlIIIllllIIIIllIl.addRenderListener(new RenderListener() {
         // $FF: synthetic field
         private static final int[] lllIlIIIlIII;

         static {
            lIIllIIIIIlIIl();
         }

         private static void lIIllIIIIIlIIl() {
            lllIlIIIlIII = new int[2];
            lllIlIIIlIII[0] = " ".length();
            lllIlIIIlIII[1] = (42 ^ 33) & ~(152 ^ 147);
         }

         private static boolean lIIllIIIIIlIlI(Object var0) {
            return var0 == null;
         }

         private static boolean lIIllIIIIIlIll(int var0) {
            return var0 != 0;
         }

         public void onPostRender() {
         }

         public void onPreRender() {
            Frame lllllllllllllllIllIIIIlIllIlIIIl = (Frame)ContainerHelper.getFirstParent(Frame.class, lllllllllllllllIlIIIllllIIIIllIl);
            if (!lIIllIIIIIlIlI(lllllllllllllllIllIIIIlIllIlIIIl)) {
               boolean lllllllllllllllIllIIIIlIllIIllIl = lllllllllllllllIllIIIIlIllIlIIIl.getDocking();
               if (lIIllIIIIIlIll(lllllllllllllllIllIIIIlIllIIllIl.isTop())) {
                  lllllllllllllllIlIIIllllIIIIllIl.sort_up = (boolean)lllIlIIIlIII[0];
               }

               if (lIIllIIIIIlIll(lllllllllllllllIllIIIIlIllIIllIl.isBottom())) {
                  lllllllllllllllIlIIIllllIIIIllIl.sort_up = (boolean)lllIlIIIlIII[1];
               }

            }
         }
      });
   }
}
