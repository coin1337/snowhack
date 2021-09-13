package rr.snowhack.snow.module.modules.misc;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiEditSign;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.text.TextComponentString;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.GuiScreenEvent;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "ColourSign",
   description = "Allows ingame colouring of text on signs",
   category = Module.Category.MISC
)
public class ColourSign extends Module {
   // $FF: synthetic field
   @EventHandler
   public Listener<GuiScreenEvent.Displayed> eventListener;
   // $FF: synthetic field
   private static final int[] lllIllIlIlII;

   private static void lIIllIllllIIIl() {
      lllIllIlIlII = new int[1];
      lllIllIlIlII[0] = (4 ^ 55 ^ (253 ^ 192) << " ".length()) & (77 ^ 68 ^ " ".length() << ("   ".length() << " ".length()) ^ -" ".length());
   }

   public ColourSign() {
      lllllllllllllllIlIllIlllIlllllll.eventListener = new Listener((lllllllllllllllIlIllIlllIllllIIl) -> {
         if (lIIllIllllIIlI(lllllllllllllllIlIllIlllIllllIIl.getScreen() instanceof GuiEditSign) && lIIllIllllIIlI(lllllllllllllllIlIllIlllIllllIlI.isEnabled())) {
            lllllllllllllllIlIllIlllIllllIIl.setScreen(new ColourSign.KamiGuiEditSign(((GuiEditSign)lllllllllllllllIlIllIlllIllllIIl.getScreen()).field_146848_f));
         }

      }, new Predicate[lllIllIlIlII[0]]);
   }

   private static boolean lIIllIllllIIlI(int var0) {
      return var0 != 0;
   }

   static {
      lIIllIllllIIIl();
   }

   private class KamiGuiEditSign extends GuiEditSign {
      // $FF: synthetic field
      private static final int[] lllllIIlllIl;
      // $FF: synthetic field
      private static final String[] lllllIIlllII;

      private static String lIlIIIlIllllIl(String lllllllllllllllIlIIllllIlIlIlIlI, String lllllllllllllllIlIIllllIlIlIlIIl) {
         lllllllllllllllIlIIllllIlIlIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         boolean lllllllllllllllIlIIllllIlIlIIIll = new StringBuilder();
         byte lllllllllllllllIlIIllllIlIlIIIlI = lllllllllllllllIlIIllllIlIlIlIIl.toCharArray();
         char lllllllllllllllIlIIllllIlIlIIIIl = lllllIIlllIl[0];
         Exception lllllllllllllllIlIIllllIlIlIIIII = lllllllllllllllIlIIllllIlIlIlIlI.toCharArray();
         float lllllllllllllllIlIIllllIlIIlllll = lllllllllllllllIlIIllllIlIlIIIII.length;
         int lllllllllllllllIlIIllllIlIIllllI = lllllIIlllIl[0];

         do {
            if (!lIlIIIllIIIlII(lllllllllllllllIlIIllllIlIIllllI, lllllllllllllllIlIIllllIlIIlllll)) {
               return String.valueOf(lllllllllllllllIlIIllllIlIlIIIll);
            }

            char lllllllllllllllIlIIllllIlIlIlIll = lllllllllllllllIlIIllllIlIlIIIII[lllllllllllllllIlIIllllIlIIllllI];
            lllllllllllllllIlIIllllIlIlIIIll.append((char)(lllllllllllllllIlIIllllIlIlIlIll ^ lllllllllllllllIlIIllllIlIlIIIlI[lllllllllllllllIlIIllllIlIlIIIIl % lllllllllllllllIlIIllllIlIlIIIlI.length]));
            "".length();
            ++lllllllllllllllIlIIllllIlIlIIIIl;
            ++lllllllllllllllIlIIllllIlIIllllI;
            "".length();
         } while(" ".length() < " ".length() << " ".length());

         return null;
      }

      private static boolean lIlIIIllIIIIll(int var0) {
         return var0 == 0;
      }

      private static void lIlIIIllIIIIlI() {
         lllllIIlllIl = new int[7];
         lllllIIlllIl[0] = (88 ^ 83) << (" ".length() << " ".length()) & ~((63 ^ 52) << (" ".length() << " ".length()));
         lllllIIlllIl[1] = " ".length();
         lllllIIlllIl[2] = " ".length() << " ".length();
         lllllIIlllIl[3] = "   ".length();
         lllllIIlllIl[4] = " ".length() << (" ".length() << " ".length());
         lllllIIlllIl[5] = (22 ^ 33) << " ".length() ^ 45 ^ 70;
         lllllIIlllIl[6] = " ".length() << "   ".length();
      }

      private static String lIlIIIlIlllllI(String lllllllllllllllIlIIllllIlIlllIlI, String lllllllllllllllIlIIllllIlIllIlll) {
         try {
            SecretKeySpec lllllllllllllllIlIIllllIlIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIlIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIllllIlIllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIllllIlIllllII.init(lllllIIlllIl[2], lllllllllllllllIlIIllllIlIllllIl);
            return new String(lllllllllllllllIlIIllllIlIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIlIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      public KamiGuiEditSign(TileEntitySign lllllllllllllllIlIIllllIlllIIlll) {
         super(lllllllllllllllIlIIllllIlllIIlll);
      }

      private static boolean lIlIIIllIIIlII(int var0, int var1) {
         return var0 < var1;
      }

      static {
         lIlIIIllIIIIlI();
         lIlIIIllIIIIIl();
      }

      protected void func_73869_a(char lllllllllllllllIlIIllllIllIlIIIl, int lllllllllllllllIlIIllllIllIlIlII) throws IOException {
         super.func_73869_a(lllllllllllllllIlIIllllIllIlIIIl, lllllllllllllllIlIIllllIllIlIlII);
         Exception lllllllllllllllIlIIllllIllIIllll = ((TextComponentString)lllllllllllllllIlIIllllIllIlIIlI.field_146848_f.field_145915_a[lllllllllllllllIlIIllllIllIlIIlI.field_146851_h]).func_150265_g();
         lllllllllllllllIlIIllllIllIIllll = lllllllllllllllIlIIllllIllIIllll.replace(lllllIIlllII[lllllIIlllIl[3]], String.valueOf((new StringBuilder()).append(Command.SECTIONSIGN()).append(lllllIIlllII[lllllIIlllIl[4]])));
         lllllllllllllllIlIIllllIllIlIIlI.field_146848_f.field_145915_a[lllllllllllllllIlIIllllIllIlIIlI.field_146851_h] = new TextComponentString(lllllllllllllllIlIIllllIllIIllll);
      }

      private static void lIlIIIllIIIIIl() {
         lllllIIlllII = new String[lllllIIlllIl[5]];
         lllllIIlllII[lllllIIlllIl[0]] = lIlIIIlIllllIl("YA==", "HDWON");
         lllllIIlllII[lllllIIlllIl[1]] = lIlIIIlIlllllI("kkTIZwv9o5E=", "IIjee");
         lllllIIlllII[lllllIIlllIl[2]] = lIlIIIlIllllIl("XX5uaFZLa3g=", "yOJYr");
         lllllIIlllII[lllllIIlllIl[3]] = lIlIIIllIIIIII("C9lMuOb0Xe8=", "aexTu");
         lllllIIlllII[lllllIIlllIl[4]] = lIlIIIlIllllIl("", "yfFBD");
      }

      public void func_73866_w_() {
         super.func_73866_w_();
      }

      protected void func_146284_a(GuiButton lllllllllllllllIlIIllllIllIllIll) throws IOException {
         if (lIlIIIllIIIIll(lllllllllllllllIlIIllllIllIllIll.field_146127_k)) {
            lllllllllllllllIlIIllllIllIllllI.field_146848_f.field_145915_a[lllllllllllllllIlIIllllIllIllllI.field_146851_h] = new TextComponentString(lllllllllllllllIlIIllllIllIllllI.field_146848_f.field_145915_a[lllllllllllllllIlIIllllIllIllllI.field_146851_h].func_150254_d().replaceAll(String.valueOf((new StringBuilder()).append(lllllIIlllII[lllllIIlllIl[0]]).append(Command.SECTIONSIGN()).append(lllllIIlllII[lllllIIlllIl[1]])), lllllIIlllII[lllllIIlllIl[2]]));
         }

         super.func_146284_a(lllllllllllllllIlIIllllIllIllIll);
      }

      private static String lIlIIIllIIIIII(String lllllllllllllllIlIIllllIllIIIlIl, String lllllllllllllllIlIIllllIllIIIlII) {
         try {
            String lllllllllllllllIlIIllllIllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllllIllIIIlII.getBytes(StandardCharsets.UTF_8)), lllllIIlllIl[6]), "DES");
            double lllllllllllllllIlIIllllIllIIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIlIIllllIllIIIIlI.init(lllllIIlllIl[2], lllllllllllllllIlIIllllIllIIIIll);
            return new String(lllllllllllllllIlIIllllIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllllIllIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }
   }
}
