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
   name = "CustomChat",
   category = Module.Category.CLIENT,
   description = "Modifies your chat messages"
)
public class CustomChat extends Module {
   // $FF: synthetic field
   private Setting<Boolean> commands;
   // $FF: synthetic field
   private static final String[] lllIllIlIIIl;
   // $FF: synthetic field
   private static final int[] lllIllIlIlIl;
   // $FF: synthetic field
   private final String KAMI_SUFFIX;
   // $FF: synthetic field
   private Setting<Boolean> meowhack;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> listener;
   // $FF: synthetic field
   private final String MEO_SUFFIX;

   private static void lIIllIllllIIll() {
      lllIllIlIlIl = new int[10];
      lllIllIlIlIl[0] = (26 ^ 1) & ~(151 ^ 140);
      lllIllIlIlIl[1] = " ".length();
      lllIllIlIlIl[2] = " ".length() << " ".length();
      lllIllIlIlIl[3] = "   ".length();
      lllIllIlIlIl[4] = " ".length() << (" ".length() << " ".length());
      lllIllIlIlIl[5] = 149 ^ 144;
      lllIllIlIlIl[6] = "   ".length() << " ".length();
      lllIllIlIlIl[7] = " ".length() << (" ".length() << "   ".length());
      lllIllIlIlIl[8] = 48 ^ 55;
      lllIllIlIlIl[9] = " ".length() << "   ".length();
   }

   private static String lIIllIlllIlIII(String lllllllllllllllIlIllIlllIIlllllI, String lllllllllllllllIlIllIlllIIllllIl) {
      try {
         SecretKeySpec lllllllllllllllIlIllIlllIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllIIllllIl.getBytes(StandardCharsets.UTF_8)), lllIllIlIlIl[9]), "DES");
         Cipher lllllllllllllllIlIllIlllIlIIIIII = Cipher.getInstance("DES");
         lllllllllllllllIlIllIlllIlIIIIII.init(lllIllIlIlIl[2], lllllllllllllllIlIllIlllIlIIIIIl);
         return new String(lllllllllllllllIlIllIlllIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIllIlllIlIIl(String lllllllllllllllIlIllIlllIlIllIll, String lllllllllllllllIlIllIlllIlIlllll) {
      lllllllllllllllIlIllIlllIlIllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIlIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllllllllllllllIlIllIlllIlIllIIl = new StringBuilder();
      char[] lllllllllllllllIlIllIlllIlIlllIl = lllllllllllllllIlIllIlllIlIlllll.toCharArray();
      int lllllllllllllllIlIllIlllIlIlIlll = lllIllIlIlIl[0];
      int lllllllllllllllIlIllIlllIlIlIllI = lllllllllllllllIlIllIlllIlIllIll.toCharArray();
      long lllllllllllllllIlIllIlllIlIlIlIl = lllllllllllllllIlIllIlllIlIlIllI.length;
      int lllllllllllllllIlIllIlllIlIlIlII = lllIllIlIlIl[0];

      do {
         if (!lIIllIllllIlll(lllllllllllllllIlIllIlllIlIlIlII, lllllllllllllllIlIllIlllIlIlIlIl)) {
            return String.valueOf(lllllllllllllllIlIllIlllIlIllIIl);
         }

         Exception lllllllllllllllIlIllIlllIlIlIIll = lllllllllllllllIlIllIlllIlIlIllI[lllllllllllllllIlIllIlllIlIlIlII];
         lllllllllllllllIlIllIlllIlIllIIl.append((char)(lllllllllllllllIlIllIlllIlIlIIll ^ lllllllllllllllIlIllIlllIlIlllIl[lllllllllllllllIlIllIlllIlIlIlll % lllllllllllllllIlIllIlllIlIlllIl.length]));
         "".length();
         ++lllllllllllllllIlIllIlllIlIlIlll;
         ++lllllllllllllllIlIllIlllIlIlIlII;
         "".length();
      } while((52 ^ 49) > 0);

      return null;
   }

   static {
      lIIllIllllIIll();
      lIIllIllllIIII();
   }

   private static String lIIllIlllIlIlI(String lllllllllllllllIlIllIlllIlIIlIIl, String lllllllllllllllIlIllIlllIlIIlIII) {
      try {
         SecretKeySpec lllllllllllllllIlIllIlllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllIlllIlIIllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIlllIlIIllIl.init(lllIllIlIlIl[2], lllllllllllllllIlIllIlllIlIIlllI);
         return new String(lllllllllllllllIlIllIlllIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public CustomChat() {
      lllllllllllllllIlIllIlllIlllIlII.commands = lllllllllllllllIlIllIlllIlllIlII.register(Settings.b(lllIllIlIIIl[lllIllIlIlIl[0]], (boolean)lllIllIlIlIl[0]));
      lllllllllllllllIlIllIlllIlllIlII.meowhack = lllllllllllllllIlIllIlllIlllIlII.register(Settings.b(lllIllIlIIIl[lllIllIlIlIl[1]], (boolean)lllIllIlIlIl[0]));
      lllllllllllllllIlIllIlllIlllIlII.KAMI_SUFFIX = lllIllIlIIIl[lllIllIlIlIl[2]];
      lllllllllllllllIlIllIlllIlllIlII.MEO_SUFFIX = lllIllIlIIIl[lllIllIlIlIl[3]];
      lllllllllllllllIlIllIlllIlllIlII.listener = new Listener((lllllllllllllllIlIllIlllIllIllII) -> {
         if (lIIllIllllIlII(lllllllllllllllIlIllIlllIllIllII.getPacket() instanceof CPacketChatMessage)) {
            String lllllllllllllllIlIllIlllIlllIIII = ((CPacketChatMessage)lllllllllllllllIlIllIlllIllIllII.getPacket()).func_149439_c();
            if (lIIllIllllIlII(lllllllllllllllIlIllIlllIlllIIII.startsWith(lllIllIlIIIl[lllIllIlIlIl[4]])) && lIIllIllllIlIl((Boolean)lllllllllllllllIlIllIlllIllIllIl.commands.getValue())) {
               return;
            }

            if (lIIllIllllIlII((Boolean)lllllllllllllllIlIllIlllIllIllIl.meowhack.getValue())) {
               lllllllllllllllIlIllIlllIlllIIII = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIlllIlllIIII).append(lllIllIlIIIl[lllIllIlIlIl[5]]));
            }

            lllllllllllllllIlIllIlllIlllIIII = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIlllIlllIIII).append(lllIllIlIIIl[lllIllIlIlIl[6]]));
            if (lIIllIllllIllI(lllllllllllllllIlIllIlllIlllIIII.length(), lllIllIlIlIl[7])) {
               lllllllllllllllIlIllIlllIlllIIII = lllllllllllllllIlIllIlllIlllIIII.substring(lllIllIlIlIl[0], lllIllIlIlIl[7]);
            }

            ((CPacketChatMessage)lllllllllllllllIlIllIlllIllIllII.getPacket()).field_149440_a = lllllllllllllllIlIllIlllIlllIIII;
         }

      }, new Predicate[lllIllIlIlIl[0]]);
   }

   private static boolean lIIllIllllIllI(int var0, int var1) {
      return var0 >= var1;
   }

   private static boolean lIIllIllllIlIl(int var0) {
      return var0 == 0;
   }

   private static void lIIllIllllIIII() {
      lllIllIlIIIl = new String[lllIllIlIlIl[8]];
      lllIllIlIIIl[lllIllIlIlIl[0]] = lIIllIlllIlIII("iO4CKEuhmgaGH3jYPLHaPA==", "ywHqb");
      lllIllIlIIIl[lllIllIlIlIl[1]] = lIIllIlllIlIIl("IjYAHCoOMAQ=", "oSokB");
      lllIllIlIIIl[lllIllIlIlIl[2]] = lIIllIlllIlIIl("ZcO4dcq74oCO4bSXy7Q=", "ECUYq");
      lllIllIlIIIl[lllIllIlIlIl[3]] = lIIllIlllIlIlI("TB9grVXo4n7qq0DN6U4Sf1b8JuC162fi", "mdoDe");
      lllIllIlIIIl[lllIllIlIlIl[4]] = lIIllIlllIlIIl("RQ==", "jdvYm");
      lllIllIlIIIl[lllIllIlIlIl[5]] = lIIllIlllIlIlI("vrp2b58x3CvhDhSpRl+z1n88jT3b+ZiU", "LkbYK");
      lllIllIlIIIl[lllIllIlIlIl[6]] = lIIllIlllIlIlI("QF7wvdHruENiflxuHabvQA==", "eFfgt");
   }

   private static boolean lIIllIllllIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllIllllIlII(int var0) {
      return var0 != 0;
   }
}
