package rr.snowhack.snow.gui.rgui.render.theme;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.layout.Layout;
import rr.snowhack.snow.gui.rgui.render.ComponentUI;

public abstract class AbstractTheme implements Theme {
   // $FF: synthetic field
   private static final int[] lllIllIlIIlI;
   // $FF: synthetic field
   protected final Map<Class<? extends Component>, ComponentUI> uis = new HashMap();
   // $FF: synthetic field
   private static final String[] lllIllIlIIII;
   // $FF: synthetic field
   protected final Map<Class<? extends Layout>, Class<? extends Layout>> layoutMap = new HashMap();

   public ComponentUI getComponentUIForClass(Class<? extends Component> lllllllllllllllIlIllIllllIlIIIII) {
      if (lIIllIlllIllIl(lllllllllllllllIlIllIllllIlIIIIl.uis.containsKey(lllllllllllllllIlIllIllllIlIIIII))) {
         return (ComponentUI)lllllllllllllllIlIllIllllIlIIIIl.uis.get(lllllllllllllllIlIllIllllIlIIIII);
      } else if (lIIllIlllIllII(lllllllllllllllIlIllIllllIlIIIII)) {
         return null;
      } else {
         String lllllllllllllllIlIllIllllIIlllIl = lllllllllllllllIlIllIllllIlIIIII.getInterfaces();
         boolean lllllllllllllllIlIllIllllIIlllII = lllllllllllllllIlIllIllllIIlllIl.length;
         int lllllllllllllllIlIllIllllIIllIll = lllIllIlIIlI[0];

         do {
            if (!lIIllIlllIlllI(lllllllllllllllIlIllIllllIIllIll, lllllllllllllllIlIllIllllIIlllII)) {
               return lllllllllllllllIlIllIllllIlIIIIl.getComponentUIForClass(lllllllllllllllIlIllIllllIlIIIII.getSuperclass());
            }

            Class<?> lllllllllllllllIlIllIllllIlIIIlI = lllllllllllllllIlIllIllllIIlllIl[lllllllllllllllIlIllIllllIIllIll];
            char lllllllllllllllIlIllIllllIIllIIl = (ComponentUI)lllllllllllllllIlIllIllllIlIIIIl.uis.get(lllllllllllllllIlIllIllllIlIIIlI);
            if (lIIllIlllIllll(lllllllllllllllIlIllIllllIIllIIl)) {
               return lllllllllllllllIlIllIllllIIllIIl;
            }

            ++lllllllllllllllIlIllIllllIIllIll;
            "".length();
         } while(null == null);

         return null;
      }
   }

   public ComponentUI getUIForComponent(Component lllllllllllllllIlIllIllllIlIllII) {
      ComponentUI lllllllllllllllIlIllIllllIlIlllI = lllllllllllllllIlIllIllllIllIIII.getComponentUIForClass(lllllllllllllllIlIllIllllIlIllII.getClass());
      if (lIIllIlllIllII(lllllllllllllllIlIllIllllIlIlllI)) {
         throw new RuntimeException(String.valueOf((new StringBuilder()).append(lllIllIlIIII[lllIllIlIIlI[0]]).append(lllllllllllllllIlIllIllllIlIllII.getClass().getName())));
      } else {
         return lllllllllllllllIlIllIllllIlIlllI;
      }
   }

   private static String lIIllIlllIIllI(String lllllllllllllllIlIllIllllIIlIIIl, String lllllllllllllllIlIllIllllIIlIIII) {
      try {
         String lllllllllllllllIlIllIllllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllllIIlIIII.getBytes(StandardCharsets.UTF_8)), lllIllIlIIlI[2]), "DES");
         short lllllllllllllllIlIllIllllIIIllII = Cipher.getInstance("DES");
         lllllllllllllllIlIllIllllIIIllII.init(lllIllIlIIlI[3], lllllllllllllllIlIllIllllIIIllIl);
         return new String(lllllllllllllllIlIllIllllIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIlllIlllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllIlllIllll(Object var0) {
      return var0 != null;
   }

   private static void lIIllIlllIIlll() {
      lllIllIlIIII = new String[lllIllIlIIlI[1]];
      lllIllIlIIII[lllIllIlIIlI[0]] = lIIllIlllIIllI("kHsnafheyHJatKjpH3wZ7wiT4nwB2uzPBDcuVggJxNI=", "RmdzV");
   }

   static {
      lIIllIlllIlIll();
      lIIllIlllIIlll();
   }

   protected void installUI(ComponentUI<?> lllllllllllllllIlIllIllllIllIllI) {
      lllllllllllllllIlIllIllllIllIlll.uis.put(lllllllllllllllIlIllIllllIllIllI.getHandledClass(), lllllllllllllllIlIllIllllIllIllI);
      "".length();
   }

   private static void lIIllIlllIlIll() {
      lllIllIlIIlI = new int[4];
      lllIllIlIIlI[0] = " ".length() << (79 ^ 74) & ~(" ".length() << (134 ^ 131));
      lllIllIlIIlI[1] = " ".length();
      lllIllIlIIlI[2] = " ".length() << "   ".length();
      lllIllIlIIlI[3] = " ".length() << " ".length();
   }

   private static boolean lIIllIlllIllII(Object var0) {
      return var0 == null;
   }

   private static boolean lIIllIlllIllIl(int var0) {
      return var0 != 0;
   }
}
