package rr.snowhack.snow.command.commands;

import baritone.api.BaritoneAPI;
import baritone.api.Settings.Setting;
import baritone.api.event.events.ChatEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;

public class BCommand extends Command {
   // $FF: synthetic field
   private static final int[] llllIllIIIII;
   // $FF: synthetic field
   private static final String[] llllIlIllIll;
   // $FF: synthetic field
   static final Minecraft mc;

   static {
      lIlIIIIIllIIII();
      lIlIIIIIlIIIIl();
      mc = Minecraft.func_71410_x();
   }

   private static boolean lIlIIIIIllIIlI(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIIIIIllIIIl(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIlIIIIIIllIIl(String lllllllllllllllIlIlIIlIllllIllII, String lllllllllllllllIlIlIIlIllllIllIl) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIlIlllllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIllllIllIl.getBytes(StandardCharsets.UTF_8)), llllIllIIIII[8]), "DES");
         Cipher lllllllllllllllIlIlIIlIlllllIIII = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIlIlllllIIII.init(llllIllIIIII[2], lllllllllllllllIlIlIIlIlllllIIIl);
         return new String(lllllllllllllllIlIlIIlIlllllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIIIllIIll(int var0, int var1) {
      return var0 < var1;
   }

   public void call(String[] lllllllllllllllIlIlIIlIlllllllIl) {
      if (lIlIIIIIllIIIl(lllllllllllllllIlIlIIlIlllllllIl.length, llllIllIIIII[1])) {
         Command.sendChatMessage(llllIlIllIll[llllIllIIIII[2]]);
      } else {
         lllllllllllllllIlIlIIlIlllllllIl[lllllllllllllllIlIlIIlIlllllllIl.length - llllIllIIIII[1]] = llllIlIllIll[llllIllIIIII[3]];
         Setting<Boolean> lllllllllllllllIlIlIIlIlllllllII = BaritoneAPI.getSettings().chatControl;
         int lllllllllllllllIlIlIIlIlllllIlll = (Boolean)lllllllllllllllIlIlIIlIlllllllII.value;
         lllllllllllllllIlIlIIlIlllllllII.value = Boolean.valueOf((boolean)llllIllIIIII[1]);
         double lllllllllllllllIlIlIIlIlllllIllI = new ChatEvent(String.join(llllIlIllIll[llllIllIIIII[4]], lllllllllllllllIlIlIIlIlllllllIl));
         BaritoneAPI.getProvider().getPrimaryBaritone().getGameEventHandler().onSendChatMessage(lllllllllllllllIlIlIIlIlllllIllI);
         if (lIlIIIIIllIIlI(lllllllllllllllIlIlIIlIlllllIllI.isCancelled()) && lIlIIIIIllIIlI(lllllllllllllllIlIlIIlIlllllllIl[llllIllIIIII[0]].equals(llllIlIllIll[llllIllIIIII[5]]))) {
            Command.sendChatMessage(llllIlIllIll[llllIllIIIII[6]]);
         }

         lllllllllllllllIlIlIIlIlllllllII.value = lllllllllllllllIlIlIIlIlllllIlll;
      }
   }

   private static String lIlIIIIIIllIII(String lllllllllllllllIlIlIIlIlllIlIIIl, String lllllllllllllllIlIlIIlIlllIlIIII) {
      lllllllllllllllIlIlIIlIlllIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIIlIlllIIllll = new StringBuilder();
      char[] lllllllllllllllIlIlIIlIlllIIlllI = lllllllllllllllIlIlIIlIlllIlIIII.toCharArray();
      byte lllllllllllllllIlIlIIlIlllIIlIII = llllIllIIIII[0];
      long lllllllllllllllIlIlIIlIlllIIIlll = lllllllllllllllIlIlIIlIlllIlIIIl.toCharArray();
      byte lllllllllllllllIlIlIIlIlllIIIllI = lllllllllllllllIlIlIIlIlllIIIlll.length;
      int lllllllllllllllIlIlIIlIlllIIIlIl = llllIllIIIII[0];

      do {
         if (!lIlIIIIIllIIll(lllllllllllllllIlIlIIlIlllIIIlIl, lllllllllllllllIlIlIIlIlllIIIllI)) {
            return String.valueOf(lllllllllllllllIlIlIIlIlllIIllll);
         }

         char lllllllllllllllIlIlIIlIlllIlIIlI = lllllllllllllllIlIlIIlIlllIIIlll[lllllllllllllllIlIlIIlIlllIIIlIl];
         lllllllllllllllIlIlIIlIlllIIllll.append((char)(lllllllllllllllIlIlIIlIlllIlIIlI ^ lllllllllllllllIlIlIIlIlllIIlllI[lllllllllllllllIlIlIIlIlllIIlIII % lllllllllllllllIlIlIIlIlllIIlllI.length]));
         "".length();
         ++lllllllllllllllIlIlIIlIlllIIlIII;
         ++lllllllllllllllIlIlIIlIlllIIIlIl;
         "".length();
      } while(-" ".length() < " ".length() << (" ".length() << " ".length()));

      return null;
   }

   private static void lIlIIIIIlIIIIl() {
      llllIlIllIll = new String[llllIllIIIII[7]];
      llllIlIllIll[llllIllIIIII[0]] = lIlIIIIIIllIII("MA==", "RrrAG");
      llllIlIllIll[llllIllIIIII[1]] = lIlIIIIIIllIII("DQk6GQEgBi1QAi4EIxkbKEgKHwE=", "OhHpu");
      llllIlIllIll[llllIllIIIII[2]] = lIlIIIIIIllIIl("9ed3R/x2JOmJnFXIn2XBgtMj1QK9Ut6l", "dxfqn");
      llllIlIllIll[llllIllIIIII[3]] = lIlIIIIIIllIII("", "kbvBL");
      llllIlIllIll[llllIllIIIII[4]] = lIlIIIIIIllIIl("VpXOTofxNe8=", "YSYgu");
      llllIlIllIll[llllIllIIIII[5]] = lIlIIIIIIllIIl("9QeEzCDhWCg=", "wizkN");
      llllIlIllIll[llllIllIIIII[6]] = lIlIIIIIIlllII("7QR3Qrf8xOBQyIi5VxUN3djTuEnIwKs8IOKykizRf0sSRdoHWjzxFw==", "dnbSw");
   }

   private static void lIlIIIIIllIIII() {
      llllIllIIIII = new int[9];
      llllIllIIIII[0] = ((234 ^ 195) << (" ".length() << " ".length()) ^ 118 + 150 - 171 + 78) & (133 ^ 160 ^ (3 ^ 20) << " ".length() ^ -" ".length());
      llllIllIIIII[1] = " ".length();
      llllIllIIIII[2] = " ".length() << " ".length();
      llllIllIIIII[3] = "   ".length();
      llllIllIIIII[4] = " ".length() << (" ".length() << " ".length());
      llllIllIIIII[5] = 103 ^ 98;
      llllIllIIIII[6] = "   ".length() << " ".length();
      llllIllIIIII[7] = 136 + 28 - 130 + 137 ^ (98 ^ 73) << (" ".length() << " ".length());
      llllIllIIIII[8] = " ".length() << "   ".length();
   }

   public BCommand() {
      super(llllIlIllIll[llllIllIIIII[0]], (new ChunkBuilder()).build());
      lllllllllllllllIlIlIIllIIIIIIlII.setDescription(llllIlIllIll[llllIllIIIII[1]]);
   }

   private static String lIlIIIIIIlllII(String lllllllllllllllIlIlIIlIllllIIIIl, String lllllllllllllllIlIlIIlIlllIllllI) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIlIllllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIlllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIIlIllllIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIlIllllIIIll.init(llllIllIIIII[2], lllllllllllllllIlIlIIlIllllIIlII);
         return new String(lllllllllllllllIlIlIIlIllllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
