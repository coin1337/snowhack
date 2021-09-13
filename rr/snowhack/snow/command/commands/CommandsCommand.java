package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.SyntaxChunk;

public class CommandsCommand extends Command {
   // $FF: synthetic field
   private static final int[] lllllIlllIII;
   // $FF: synthetic field
   private static final String[] lllllIllIlll;

   private static boolean lIlIIlIIIlIlIl(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIlIIlIIIlIlII();
      lIlIIlIIIlIIll();
   }

   public CommandsCommand() {
      super(lllllIllIlll[lllllIlllIII[0]], SyntaxChunk.EMPTY);
      lllllllllllllllIlIIllIIlIIlIlIII.setDescription(lllllIllIlll[lllllIlllIII[1]]);
   }

   private static String lIlIIlIIIIllll(String lllllllllllllllIlIIllIIlIIIllIII, String lllllllllllllllIlIIllIIlIIIlIlIl) {
      try {
         SecretKeySpec lllllllllllllllIlIIllIIlIIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8)), lllllIlllIII[5]), "DES");
         double lllllllllllllllIlIIllIIlIIIlIIll = Cipher.getInstance("DES");
         lllllllllllllllIlIIllIIlIIIlIIll.init(lllllIlllIII[2], lllllllllllllllIlIIllIIlIIIllIll);
         return new String(lllllllllllllllIlIIllIIlIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIlIIlIIIIlllI(String lllllllllllllllIlIIllIIlIIIIlIII, String lllllllllllllllIlIIllIIlIIIIIIlI) {
      lllllllllllllllIlIIllIIlIIIIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lllllllllllllllIlIIllIIlIIIIIIIl = new StringBuilder();
      char[] lllllllllllllllIlIIllIIlIIIIIlIl = lllllllllllllllIlIIllIIlIIIIIIlI.toCharArray();
      float lllllllllllllllIlIIllIIIllllllll = lllllIlllIII[0];
      Exception lllllllllllllllIlIIllIIIlllllllI = lllllllllllllllIlIIllIIlIIIIlIII.toCharArray();
      double lllllllllllllllIlIIllIIIllllllIl = lllllllllllllllIlIIllIIIlllllllI.length;
      int lllllllllllllllIlIIllIIIllllllII = lllllIlllIII[0];

      do {
         if (!lIlIIlIIIlIlIl(lllllllllllllllIlIIllIIIllllllII, lllllllllllllllIlIIllIIIllllllIl)) {
            return String.valueOf(lllllllllllllllIlIIllIIlIIIIIIIl);
         }

         char lllllllllllllllIlIIllIIlIIIIlIIl = lllllllllllllllIlIIllIIIlllllllI[lllllllllllllllIlIIllIIIllllllII];
         lllllllllllllllIlIIllIIlIIIIIIIl.append((char)(lllllllllllllllIlIIllIIlIIIIlIIl ^ lllllllllllllllIlIIllIIlIIIIIlIl[lllllllllllllllIlIIllIIIllllllll % lllllllllllllllIlIIllIIlIIIIIlIl.length]));
         "".length();
         ++lllllllllllllllIlIIllIIIllllllll;
         ++lllllllllllllllIlIIllIIIllllllII;
         "".length();
      } while(-"   ".length() <= 0);

      return null;
   }

   private static void lIlIIlIIIlIIll() {
      lllllIllIlll = new String[lllllIlllIII[4]];
      lllllIllIlll[lllllIlllIII[0]] = lIlIIlIIIIlllI("DCEdCgUBKgM=", "oNpgd");
      lllllIllIlll[lllllIlllIII[1]] = lIlIIlIIIIlllI("FRA9LQZyACQ9VSYRIjtVPhA4PFU9H2srGj8UKiYRIQ==", "RyKHu");
      lllllIllIlll[lllllIlllIII[2]] = lIlIIlIIIIllll("A4PuU7whcy8=", "WoBXb");
      lllllIllIlll[lllllIlllIII[3]] = lIlIIlIIIlIIIl("D6PQHKOmM5I=", "pyXtg");
   }

   public void call(String[] lllllllllllllllIlIIllIIlIIlIIllI) {
      SnowMod.getInstance().getCommandManager().getCommands().stream().sorted(Comparator.comparing((lllllllllllllllIlIIllIIlIIlIIIIl) -> {
         return lllllllllllllllIlIIllIIlIIlIIIIl.getLabel();
      })).forEach((lllllllllllllllIlIIllIIlIIlIIIll) -> {
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllllIllIlll[lllllIlllIII[2]]).append(Command.getCommandPrefix()).append(lllllllllllllllIlIIllIIlIIlIIIll.getLabel()).append(lllllIllIlll[lllllIlllIII[3]]).append(lllllllllllllllIlIIllIIlIIlIIIll.getDescription())));
      });
   }

   private static String lIlIIlIIIlIIIl(String lllllllllllllllIlIIllIIIllllIIll, String lllllllllllllllIlIIllIIIllllIIII) {
      try {
         short lllllllllllllllIlIIllIIIlllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIllIIIllllIlIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIllIIIllllIlIl.init(lllllIlllIII[2], lllllllllllllllIlIIllIIIlllIllll);
         return new String(lllllllllllllllIlIIllIIIllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIIlIIIlIlII() {
      lllllIlllIII = new int[6];
      lllllIlllIII[0] = (145 ^ 158 ^ (188 ^ 179) << " ".length()) << " ".length() & ((214 ^ 181 ^ (38 ^ 31) << " ".length()) << " ".length() ^ -" ".length());
      lllllIlllIII[1] = " ".length();
      lllllIlllIII[2] = " ".length() << " ".length();
      lllllIlllIII[3] = "   ".length();
      lllllIlllIII[4] = " ".length() << (" ".length() << " ".length());
      lllllIlllIII[5] = " ".length() << "   ".length();
   }
}
