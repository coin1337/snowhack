package rr.snowhack.snow.module.modules.client;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "CleanGUI",
   category = Module.Category.CLIENT
)
public class CleanGUI extends Module {
   // $FF: synthetic field
   private static final String[] llllIIIllIII;
   // $FF: synthetic field
   public static Setting<Boolean> gui;
   // $FF: synthetic field
   public static Setting<Boolean> chat;
   // $FF: synthetic field
   private static final int[] llllIIIllIIl;
   // $FF: synthetic field
   private static CleanGUI INSTANCE;

   private static void lIIllllIlIIlll() {
      llllIIIllIII = new String[llllIIIllIIl[2]];
      llllIIIllIII[llllIIIllIIl[0]] = lIIllllIlIIllI("JmtNCYvZuek=", "qXJBC");
      llllIIIllIII[llllIIIllIIl[1]] = lIIllllIlIIllI("04wN4M4r9LpU8Gk1MGxl0w==", "HGjDG");
   }

   public CleanGUI() {
      INSTANCE = lllllllllllllllIlIlIllIIlllIlIIl;
      lllllllllllllllIlIlIllIIlllIlIIl.register(chat);
      "".length();
      lllllllllllllllIlIlIllIIlllIlIIl.register(gui);
      "".length();
   }

   private static String lIIllllIlIIllI(String lllllllllllllllIlIlIllIIlllIIIII, String lllllllllllllllIlIlIllIIllIlllll) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIllIIlllIIIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIllIIlllIIIlI.init(llllIIIllIIl[2], lllllllllllllllIlIlIllIIlllIIIll);
         return new String(lllllllllllllllIlIlIllIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIllllIlIlIII() {
      llllIIIllIIl = new int[3];
      llllIIIllIIl[0] = (60 ^ 41) & ~(20 ^ 1);
      llllIIIllIIl[1] = " ".length();
      llllIIIllIIl[2] = " ".length() << " ".length();
   }

   static {
      lIIllllIlIlIII();
      lIIllllIlIIlll();
      chat = Settings.b(llllIIIllIII[llllIIIllIIl[0]], (boolean)llllIIIllIIl[1]);
      gui = Settings.b(llllIIIllIII[llllIIIllIIl[1]], (boolean)llllIIIllIIl[1]);
      INSTANCE = new CleanGUI();
   }

   public static boolean enabled() {
      return INSTANCE.isEnabled();
   }
}
