package rr.snowhack.snow.module.modules.client;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.client.CPacketChatMessage;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "AutoGreenText",
   category = Module.Category.CLIENT,
   description = "Make your chat messages GREEN"
)
public class AutoGreenText extends Module {
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> listener;
   // $FF: synthetic field
   private Setting<Boolean> commands;
   // $FF: synthetic field
   private static final String[] lIIIlIIllIIll;
   // $FF: synthetic field
   String g;
   // $FF: synthetic field
   private static final int[] lIIIlIIllIllI;

   private static boolean lIlIllllllllIl(int var0, int var1) {
      return var0 >= var1;
   }

   private static String lIlIlllllllIII(String lllllllllllllllIIlllIIIlIlIIIlII, String lllllllllllllllIIlllIIIlIlIIIIll) {
      try {
         SecretKeySpec lllllllllllllllIIlllIIIlIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIllIllI[6]), "DES");
         int lllllllllllllllIIlllIIIlIlIIIIIl = Cipher.getInstance("DES");
         lllllllllllllllIIlllIIIlIlIIIIIl.init(lIIIlIIllIllI[2], lllllllllllllllIIlllIIIlIlIIlIIl);
         return new String(lllllllllllllllIIlllIIIlIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlllllllIlI() {
      lIIIlIIllIllI = new int[7];
      lIIIlIIllIllI[0] = (13 + 98 - 59 + 117 ^ (73 ^ 76) << (109 ^ 104)) << "   ".length() & (((106 ^ 73) << " ".length() ^ 113 ^ 62) << "   ".length() ^ -" ".length());
      lIIIlIIllIllI[1] = " ".length();
      lIIIlIIllIllI[2] = " ".length() << " ".length();
      lIIIlIIllIllI[3] = " ".length() << (" ".length() << "   ".length());
      lIIIlIIllIllI[4] = "   ".length();
      lIIIlIIllIllI[5] = " ".length() << (" ".length() << " ".length());
      lIIIlIIllIllI[6] = " ".length() << "   ".length();
   }

   private static String lIlIllllllIllI(String lllllllllllllllIIlllIIIlIllIlIll, String lllllllllllllllIIlllIIIlIllIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIIlllIIIlIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIlllIIIlIllIllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIIIlIllIllIl.init(lIIIlIIllIllI[2], lllllllllllllllIIlllIIIlIllIlllI);
         return new String(lllllllllllllllIIlllIIIlIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlllllllIll(int var0) {
      return var0 != 0;
   }

   private static void lIlIlllllllIIl() {
      lIIIlIIllIIll = new String[lIIIlIIllIllI[5]];
      lIIIlIIllIIll[lIIIlIIllIllI[0]] = lIlIllllllIllI("b67U+UeMQJQSK1d7EoIuxg==", "WZeQL");
      lIIIlIIllIIll[lIIIlIIllIllI[1]] = lIlIllllllIllI("xJagfGWa3dU=", "WtRpg");
      lIIIlIIllIIll[lIIIlIIllIllI[2]] = lIlIllllllIlll("fw==", "PdPdK");
      lIIIlIIllIIll[lIIIlIIllIllI[4]] = lIlIlllllllIII("7OEIVe9CGio=", "jbWpO");
   }

   private static String lIlIllllllIlll(String lllllllllllllllIIlllIIIlIlIlIllI, String lllllllllllllllIIlllIIIlIlIllIlI) {
      lllllllllllllllIIlllIIIlIlIlIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIIIlIlIllIIl = new StringBuilder();
      char[] lllllllllllllllIIlllIIIlIlIllIII = lllllllllllllllIIlllIIIlIlIllIlI.toCharArray();
      int lllllllllllllllIIlllIIIlIlIlIlll = lIIIlIIllIllI[0];
      String lllllllllllllllIIlllIIIlIlIlIIIl = lllllllllllllllIIlllIIIlIlIlIllI.toCharArray();
      long lllllllllllllllIIlllIIIlIlIlIIII = lllllllllllllllIIlllIIIlIlIlIIIl.length;
      int lllllllllllllllIIlllIIIlIlIIllll = lIIIlIIllIllI[0];

      do {
         if (!lIlIlllllllllI(lllllllllllllllIIlllIIIlIlIIllll, lllllllllllllllIIlllIIIlIlIlIIII)) {
            return String.valueOf(lllllllllllllllIIlllIIIlIlIllIIl);
         }

         char lllllllllllllllIIlllIIIlIlIlllII = lllllllllllllllIIlllIIIlIlIlIIIl[lllllllllllllllIIlllIIIlIlIIllll];
         lllllllllllllllIIlllIIIlIlIllIIl.append((char)(lllllllllllllllIIlllIIIlIlIlllII ^ lllllllllllllllIIlllIIIlIlIllIII[lllllllllllllllIIlllIIIlIlIlIlll % lllllllllllllllIIlllIIIlIlIllIII.length]));
         "".length();
         ++lllllllllllllllIIlllIIIlIlIlIlll;
         ++lllllllllllllllIIlllIIIlIlIIllll;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) != "   ".length());

      return null;
   }

   private static boolean lIlIlllllllllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIllllllllII(int var0) {
      return var0 == 0;
   }

   public AutoGreenText() {
      lllllllllllllllIIlllIIIlIlllllII.commands = lllllllllllllllIIlllIIIlIlllllII.register(Settings.b(lIIIlIIllIIll[lIIIlIIllIllI[0]], (boolean)lIIIlIIllIllI[0]));
      lllllllllllllllIIlllIIIlIlllllII.g = lIIIlIIllIIll[lIIIlIIllIllI[1]];
      lllllllllllllllIIlllIIIlIlllllII.listener = new Listener((lllllllllllllllIIlllIIIlIlllIlII) -> {
         if (lIlIlllllllIll(lllllllllllllllIIlllIIIlIlllIlII.getPacket() instanceof CPacketChatMessage)) {
            String lllllllllllllllIIlllIIIlIllllIII = ((CPacketChatMessage)lllllllllllllllIIlllIIIlIlllIlII.getPacket()).func_149439_c();
            if (lIlIlllllllIll(lllllllllllllllIIlllIIIlIllllIII.startsWith(lIIIlIIllIIll[lIIIlIIllIllI[2]])) && lIlIllllllllII((Boolean)lllllllllllllllIIlllIIIlIlllIlll.commands.getValue())) {
               return;
            }

            lllllllllllllllIIlllIIIlIlllIlll.g = String.valueOf((new StringBuilder()).append(lllllllllllllllIIlllIIIlIlllIlll.g).append(lllllllllllllllIIlllIIIlIllllIII));
            if (lIlIllllllllIl(lllllllllllllllIIlllIIIlIlllIlll.g.length(), lIIIlIIllIllI[3])) {
               lllllllllllllllIIlllIIIlIlllIlll.g = lllllllllllllllIIlllIIIlIlllIlll.g.substring(lIIIlIIllIllI[0], lIIIlIIllIllI[3]);
            }

            ((CPacketChatMessage)lllllllllllllllIIlllIIIlIlllIlII.getPacket()).field_149440_a = lllllllllllllllIIlllIIIlIlllIlll.g;
            lllllllllllllllIIlllIIIlIlllIlll.g = lIIIlIIllIIll[lIIIlIIllIllI[4]];
         }

      }, new Predicate[lIIIlIIllIllI[0]]);
   }

   static {
      lIlIlllllllIlI();
      lIlIlllllllIIl();
   }
}
