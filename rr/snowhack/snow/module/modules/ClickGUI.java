package rr.snowhack.snow.module.modules;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.commands.FriendCommand;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.util.Friends;

@Module.Info(
   name = "ClickGUI",
   description = "Opens the Click GUI",
   category = Module.Category.HIDDEN
)
public class ClickGUI extends Module {
   // $FF: synthetic field
   private static final int[] lIIIlIllIIlll;
   // $FF: synthetic field
   private static final String[] lIIIlIllIIlII;

   private static void lIllIIlIIIllII() {
      lIIIlIllIIlII = new String[lIIIlIllIIlll[8]];
      lIIIlIllIIlII[lIIIlIllIIlll[1]] = lIllIIlIIIIlll("aE3P/FuHC0Y=", "FVznm");
      lIIIlIllIIlII[lIIIlIllIIlll[2]] = lIllIIlIIIlIII("MSksEjcrLg==", "BGCeZ");
      lIIIlIllIIlII[lIIIlIllIIlll[3]] = lIllIIlIIIlIIl("QGTBKpZS3Ac=", "lPZxa");
      lIIIlIllIIlII[lIIIlIllIIlll[4]] = lIllIIlIIIIlll("dmTCv5hrgxI=", "fGwvR");
      lIIIlIllIIlII[lIIIlIllIIlll[5]] = lIllIIlIIIIlll("R9sYSTIrbjg=", "ZVHxP");
      lIIIlIllIIlII[lIIIlIllIIlll[6]] = lIllIIlIIIlIIl("+uuOgfC4Kz0uIpLc8qLD3Q==", "jeFbo");
      lIIIlIllIIlII[lIIIlIllIIlll[7]] = lIllIIlIIIlIIl("dWW5pvhmfJ5L910cDz5Q5Q==", "Wsvvz");
   }

   static {
      lIllIIlIIIllll();
      lIllIIlIIIllII();
   }

   private static String lIllIIlIIIlIIl(String lllllllllllllllIIllIlIIIlIlIIIII, String lllllllllllllllIIllIlIIIlIIlllll) {
      try {
         byte lllllllllllllllIIllIlIIIlIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double lllllllllllllllIIllIlIIIlIIllIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlIIIlIIllIll.init(lIIIlIllIIlll[3], lllllllllllllllIIllIlIIIlIIlllII);
         return new String(lllllllllllllllIIllIlIIIlIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   protected void onEnable() {
      if (lIllIIlIIlIIII(Friends.isFriend(lIIIlIllIIlII[lIIIlIllIIlll[1]]))) {
         Exception lllllllllllllllIIllIlIIIlIllIlIl = FriendCommand.getFriendByName(lIIIlIllIIlII[lIIIlIllIIlll[2]]);
         ((ArrayList)Friends.friends.getValue()).add(lllllllllllllllIIllIlIIIlIllIlIl);
         "".length();
      }

      if (lIllIIlIIlIIII(mc.field_71462_r instanceof DisplayGuiScreen)) {
         mc.func_147108_a(new DisplayGuiScreen(mc.field_71462_r));
      }

      if (lIllIIlIIlIIIl(ModuleManager.getModuleByName(lIIIlIllIIlII[lIIIlIllIIlll[3]]).isDisabled())) {
         ModuleManager.getModuleByName(lIIIlIllIIlII[lIIIlIllIIlll[4]]).enable();
         ModuleManager.getModuleByName(lIIIlIllIIlII[lIIIlIllIIlll[5]]).enable();
         ModuleManager.getModuleByName(lIIIlIllIIlII[lIIIlIllIIlll[6]]).enable();
         ModuleManager.getModuleByName(lIIIlIllIIlII[lIIIlIllIIlll[7]]).enable();
      }

      lllllllllllllllIIllIlIIIlIllIllI.disable();
   }

   public ClickGUI() {
      lllllllllllllllIIllIlIIIlIllllII.getBind().setKey(lIIIlIllIIlll[0]);
      lllllllllllllllIIllIlIIIlIllllII.checked = (boolean)lIIIlIllIIlll[1];
   }

   private static boolean lIllIIlIIlIIIl(int var0) {
      return var0 != 0;
   }

   private static String lIllIIlIIIlIII(String lllllllllllllllIIllIlIIIlIIIlIll, String lllllllllllllllIIllIlIIIlIIIlIlI) {
      lllllllllllllllIIllIlIIIlIIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      float lllllllllllllllIIllIlIIIlIIIlIIl = new StringBuilder();
      short lllllllllllllllIIllIlIIIlIIIlIII = lllllllllllllllIIllIlIIIlIIIlIlI.toCharArray();
      int lllllllllllllllIIllIlIIIlIIIllII = lIIIlIllIIlll[1];
      long lllllllllllllllIIllIlIIIlIIIIllI = lllllllllllllllIIllIlIIIlIIIlIll.toCharArray();
      int lllllllllllllllIIllIlIIIlIIIIlIl = lllllllllllllllIIllIlIIIlIIIIllI.length;
      int lllllllllllllllIIllIlIIIlIIIIlII = lIIIlIllIIlll[1];

      do {
         if (!lIllIIlIIlIIlI(lllllllllllllllIIllIlIIIlIIIIlII, lllllllllllllllIIllIlIIIlIIIIlIl)) {
            return String.valueOf(lllllllllllllllIIllIlIIIlIIIlIIl);
         }

         char lllllllllllllllIIllIlIIIlIIlIIIl = lllllllllllllllIIllIlIIIlIIIIllI[lllllllllllllllIIllIlIIIlIIIIlII];
         lllllllllllllllIIllIlIIIlIIIlIIl.append((char)(lllllllllllllllIIllIlIIIlIIlIIIl ^ lllllllllllllllIIllIlIIIlIIIlIII[lllllllllllllllIIllIlIIIlIIIllII % lllllllllllllllIIllIlIIIlIIIlIII.length]));
         "".length();
         ++lllllllllllllllIIllIlIIIlIIIllII;
         ++lllllllllllllllIIllIlIIIlIIIIlII;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > " ".length() << " ".length());

      return null;
   }

   private static void lIllIIlIIIllll() {
      lIIIlIllIIlll = new int[10];
      lIIIlIllIIlll[0] = (165 ^ 168) << (" ".length() << (" ".length() << " ".length())) ^ 0 + 163 - 106 + 140;
      lIIIlIllIIlll[1] = ((133 ^ 142) << " ".length() ^ 35 ^ 22) & (246 ^ 133 ^ (176 ^ 181) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
      lIIIlIllIIlll[2] = " ".length();
      lIIIlIllIIlll[3] = " ".length() << " ".length();
      lIIIlIllIIlll[4] = "   ".length();
      lIIIlIllIIlll[5] = " ".length() << (" ".length() << " ".length());
      lIIIlIllIIlll[6] = 61 ^ 56;
      lIIIlIllIIlll[7] = "   ".length() << " ".length();
      lIIIlIllIIlll[8] = 38 ^ 33;
      lIIIlIllIIlll[9] = " ".length() << "   ".length();
   }

   private static boolean lIllIIlIIlIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIllIIlIIIIlll(String lllllllllllllllIIllIlIIIlIlIllIl, String lllllllllllllllIIllIlIIIlIlIlIlI) {
      try {
         float lllllllllllllllIIllIlIIIlIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIlIllIIlll[9]), "DES");
         Cipher lllllllllllllllIIllIlIIIlIlIllll = Cipher.getInstance("DES");
         lllllllllllllllIIllIlIIIlIlIllll.init(lIIIlIllIIlll[3], lllllllllllllllIIllIlIIIlIlIlIIl);
         return new String(lllllllllllllllIIllIlIIIlIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIlIIlIIII(int var0) {
      return var0 == 0;
   }
}
