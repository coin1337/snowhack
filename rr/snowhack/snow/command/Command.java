package rr.snowhack.snow.command;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentBase;
import rr.snowhack.snow.command.syntax.SyntaxChunk;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.Wrapper;

public abstract class Command {
   // $FF: synthetic field
   protected SyntaxChunk[] syntaxChunks;
   // $FF: synthetic field
   protected String syntax;
   // $FF: synthetic field
   protected String label;
   // $FF: synthetic field
   public static Setting<String> commandPrefix;
   // $FF: synthetic field
   protected String description;
   // $FF: synthetic field
   private static final String[] lIIIlIlIIIlll;
   // $FF: synthetic field
   private static final int[] lIIIlIlIIlIIl;

   private static boolean lIllIIIIlIllll(int var0, int var1) {
      return var0 < var1;
   }

   static {
      lIllIIIIlIlllI();
      lIllIIIIlIlIlI();
      commandPrefix = Settings.s(lIIIlIlIIIlll[lIIIlIlIIlIIl[6]], lIIIlIlIIIlll[lIIIlIlIIlIIl[7]]);
   }

   protected SyntaxChunk getSyntaxChunk(String lllllllllllllllIIllIlllIllllIIlI) {
      boolean lllllllllllllllIIllIlllIllllIIIl = lllllllllllllllIIllIlllIllllIlIl.syntaxChunks;
      boolean lllllllllllllllIIllIlllIllllIIII = lllllllllllllllIIllIlllIllllIIIl.length;
      int lllllllllllllllIIllIlllIlllIllll = lIIIlIlIIlIIl[0];

      do {
         if (!lIllIIIIlIllll(lllllllllllllllIIllIlllIlllIllll, lllllllllllllllIIllIlllIllllIIII)) {
            return null;
         }

         SyntaxChunk lllllllllllllllIIllIlllIllllIllI = lllllllllllllllIIllIlllIllllIIIl[lllllllllllllllIIllIlllIlllIllll];
         if (lIllIIIIllIIIl(lllllllllllllllIIllIlllIllllIllI.getType().equals(lllllllllllllllIIllIlllIllllIIlI))) {
            return lllllllllllllllIIllIlllIllllIllI;
         }

         ++lllllllllllllllIIllIlllIlllIllll;
         "".length();
      } while(" ".length() << " ".length() != 0);

      return null;
   }

   private static String lIllIIIIlIIlIl(String lllllllllllllllIIllIlllIlIlllllI, String lllllllllllllllIIllIlllIlIllllIl) {
      try {
         SecretKeySpec lllllllllllllllIIllIlllIllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIlIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIIllIlllIlIllIlIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlllIlIllIlIl.init(lIIIlIlIIlIIl[2], lllllllllllllllIIllIlllIllIIIlIl);
         return new String(lllllllllllllllIIllIlllIlIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void sendStringChatMessage(String[] lllllllllllllllIIllIllllIIIllIIl) {
      sendChatMessage(lIIIlIlIIIlll[lIIIlIlIIlIIl[4]]);
      float lllllllllllllllIIllIllllIIIlIlll = lllllllllllllllIIllIllllIIIllIIl;
      boolean lllllllllllllllIIllIllllIIIlIllI = lllllllllllllllIIllIllllIIIllIIl.length;
      int lllllllllllllllIIllIllllIIIlIlIl = lIIIlIlIIlIIl[0];

      do {
         if (!lIllIIIIlIllll(lllllllllllllllIIllIllllIIIlIlIl, lllllllllllllllIIllIllllIIIlIllI)) {
            return;
         }

         double lllllllllllllllIIllIllllIIIlIlII = lllllllllllllllIIllIllllIIIlIlll[lllllllllllllllIIllIllllIIIlIlIl];
         sendRawChatMessage(lllllllllllllllIIllIllllIIIlIlII);
         ++lllllllllllllllIIllIllllIIIlIlIl;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > " ".length());

   }

   public static void sendWarningMessage(String lllllllllllllllIIllIllllIIlIIIIl) {
      sendRawChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIlIIIlll[lIIIlIlIIlIIl[3]]).append(lllllllllllllllIIllIllllIIlIIIIl)));
   }

   public static void sendRawChatMessage(String lllllllllllllllIIllIllllIIIlIIIl) {
      Wrapper.getPlayer().func_145747_a(new Command.ChatMessage(lllllllllllllllIIllIllllIIIlIIIl));
   }

   private static String lIllIIIIlIIlll(String lllllllllllllllIIllIlllIlIIllIIl, String lllllllllllllllIIllIlllIlIIlllll) {
      lllllllllllllllIIllIlllIlIIllIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIIllIlllIlIIlIllI = new StringBuilder();
      char[] lllllllllllllllIIllIlllIlIIlllII = lllllllllllllllIIllIlllIlIIlllll.toCharArray();
      int lllllllllllllllIIllIlllIlIIllIlI = lIIIlIlIIlIIl[0];
      short lllllllllllllllIIllIlllIlIIlIIII = lllllllllllllllIIllIlllIlIIllIIl.toCharArray();
      float lllllllllllllllIIllIlllIlIIIlllI = lllllllllllllllIIllIlllIlIIlIIII.length;
      int lllllllllllllllIIllIlllIlIIIllIl = lIIIlIlIIlIIl[0];

      do {
         if (!lIllIIIIlIllll(lllllllllllllllIIllIlllIlIIIllIl, lllllllllllllllIIllIlllIlIIIlllI)) {
            return String.valueOf(lllllllllllllllIIllIlllIlIIlIllI);
         }

         String lllllllllllllllIIllIlllIlIIIlIll = lllllllllllllllIIllIlllIlIIlIIII[lllllllllllllllIIllIlllIlIIIllIl];
         lllllllllllllllIIllIlllIlIIlIllI.append((char)(lllllllllllllllIIllIlllIlIIIlIll ^ lllllllllllllllIIllIlllIlIIlllII[lllllllllllllllIIllIlllIlIIllIlI % lllllllllllllllIIllIlllIlIIlllII.length]));
         "".length();
         ++lllllllllllllllIIllIlllIlIIllIlI;
         ++lllllllllllllllIIllIlllIlIIIllIl;
         "".length();
      } while(-" ".length() <= ((174 ^ 177) & ~(48 ^ 47)));

      return null;
   }

   public abstract void call(String[] var1);

   public static String getCommandPrefix() {
      return (String)commandPrefix.getValue();
   }

   private static boolean lIllIIIIllIIIl(int var0) {
      return var0 != 0;
   }

   private static String lIllIIIIlIIllI(String lllllllllllllllIIllIlllIllIlllIl, String lllllllllllllllIIllIlllIllIllIII) {
      try {
         SecretKeySpec lllllllllllllllIIllIlllIlllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlllIllIllIII.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIlIIl[9]), "DES");
         long lllllllllllllllIIllIlllIllIlIlII = Cipher.getInstance("DES");
         lllllllllllllllIIllIlllIllIlIlII.init(lIIIlIlIIlIIl[2], lllllllllllllllIIllIlllIlllIIIll);
         return new String(lllllllllllllllIIllIlllIllIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlllIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIllIIIIlIlIlI() {
      lIIIlIlIIIlll = new String[lIIIlIlIIlIIl[8]];
      lIIIlIlIIIlll[lIIIlIlIIlIIl[0]] = lIllIIIIlIIlIl("Em915HkjbpBcYxxHtNQMVg==", "DXpPL");
      lIIIlIlIIIlll[lIIIlIlIIlIIl[1]] = lIllIIIIlIIllI("cAdz7vlgYzo8X8gA5N8CqBP55XajiMwP", "TWXVk");
      lIIIlIlIIIlll[lIIIlIlIIlIIl[2]] = lIllIIIIlIIllI("sxT4VGsX9qM7NZvkH4s84NqLu4peUTMz", "glAvH");
      lIIIlIlIIIlll[lIIIlIlIIlIIl[3]] = lIllIIIIlIIlll("ZVIqVR4wCx4EEiIGGlVNHkVXFg==", "Ceqsz");
      lIIIlIlIIIlll[lIIIlIlIIlIIl[4]] = lIllIIIIlIIllI("Od4Q5gI1beQ=", "GRQfv");
      lIIIlIlIIIlll[lIIIlIlIIlIIl[6]] = lIllIIIIlIIlIl("D+3CPKLuDBRnFpvgB6Gc8A==", "UTBjM");
      lIIIlIlIIIlll[lIIIlIlIIlIIl[7]] = lIllIIIIlIIlIl("UgSrn0qOTzg=", "GjAHn");
   }

   public SyntaxChunk[] getSyntaxChunks() {
      return lllllllllllllllIIllIllllIIIIIIll.syntaxChunks;
   }

   private static void lIllIIIIlIlllI() {
      lIIIlIlIIlIIl = new int[10];
      lIIIlIlIIlIIl[0] = ((84 ^ 81) << (" ".length() << " ".length()) ^ 122 ^ 59) & ((125 ^ 14) << " ".length() ^ 25 + 164 - 87 + 77 ^ -" ".length());
      lIIIlIlIIlIIl[1] = " ".length();
      lIIIlIlIIlIIl[2] = " ".length() << " ".length();
      lIIIlIlIIlIIl[3] = "   ".length();
      lIIIlIlIIlIIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIlIIlIIl[5] = ((152 ^ 147) << (" ".length() << " ".length())) + (106 ^ 101) - -(164 ^ 139) + (108 ^ 81);
      lIIIlIlIIlIIl[6] = (120 ^ 79) << " ".length() ^ 122 ^ 17;
      lIIIlIlIIlIIl[7] = "   ".length() << " ".length();
      lIIIlIlIIlIIl[8] = 32 ^ 27 ^ (40 ^ 39) << (" ".length() << " ".length());
      lIIIlIlIIlIIl[9] = " ".length() << "   ".length();
   }

   public String getDescription() {
      return lllllllllllllllIIllIllllIIIIlIII.description;
   }

   public String getLabel() {
      return lllllllllllllllIIllIllllIIIIIllI.label;
   }

   public static void sendErrorMessage(String lllllllllllllllIIllIllllIIlIIIll) {
      sendRawChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIlIIIlll[lIIIlIlIIlIIl[2]]).append(lllllllllllllllIIllIllllIIlIIIll)));
   }

   public static char SECTIONSIGN() {
      return (char)lIIIlIlIIlIIl[5];
   }

   protected void setDescription(String lllllllllllllllIIllIllllIIIIlIll) {
      lllllllllllllllIIllIllllIIIIllII.description = lllllllllllllllIIllIllllIIIIlIll;
   }

   public static void sendChatMessage(String lllllllllllllllIIllIllllIIlIIlll) {
      sendRawChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIlIIIlll[lIIIlIlIIlIIl[1]]).append(lllllllllllllllIIllIllllIIlIIlll)));
   }

   public Command(String lllllllllllllllIIllIllllIIlIllIl, SyntaxChunk[] lllllllllllllllIIllIllllIIlIllII) {
      lllllllllllllllIIllIllllIIlIlIll.label = lllllllllllllllIIllIllllIIlIllIl;
      lllllllllllllllIIllIllllIIlIlIll.syntaxChunks = lllllllllllllllIIllIllllIIlIllII;
      lllllllllllllllIIllIllllIIlIlIll.description = lIIIlIlIIIlll[lIIIlIlIIlIIl[0]];
   }

   public static class ChatMessage extends TextComponentBase {
      // $FF: synthetic field
      private static final int[] lllIlIlllIII;
      // $FF: synthetic field
      String text;
      // $FF: synthetic field
      private static final String[] lllIlIlIlllI;

      public String func_150261_e() {
         return lllllllllllllllIlIlllIllllIIIllI.text;
      }

      private static boolean lIIllIlIlIlIIl(int var0) {
         return var0 != 0;
      }

      static {
         lIIllIlIlIlIII();
         lIIllIlIIIllIl();
      }

      private static String lIIllIlIIIllII(String lllllllllllllllIlIlllIlllIllIlll, String lllllllllllllllIlIlllIlllIllIIIl) {
         lllllllllllllllIlIlllIlllIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         char lllllllllllllllIlIlllIlllIllIIII = new StringBuilder();
         char[] lllllllllllllllIlIlllIlllIllIlII = lllllllllllllllIlIlllIlllIllIIIl.toCharArray();
         int lllllllllllllllIlIlllIlllIlIlllI = lllIlIlllIII[0];
         char lllllllllllllllIlIlllIlllIlIllIl = lllllllllllllllIlIlllIlllIllIlll.toCharArray();
         short lllllllllllllllIlIlllIlllIlIllII = lllllllllllllllIlIlllIlllIlIllIl.length;
         int lllllllllllllllIlIlllIlllIlIlIll = lllIlIlllIII[0];

         do {
            if (!lIIllIlIlIlIlI(lllllllllllllllIlIlllIlllIlIlIll, lllllllllllllllIlIlllIlllIlIllII)) {
               return String.valueOf(lllllllllllllllIlIlllIlllIllIIII);
            }

            String lllllllllllllllIlIlllIlllIlIlIlI = lllllllllllllllIlIlllIlllIlIllIl[lllllllllllllllIlIlllIlllIlIlIll];
            lllllllllllllllIlIlllIlllIllIIII.append((char)(lllllllllllllllIlIlllIlllIlIlIlI ^ lllllllllllllllIlIlllIlllIllIlII[lllllllllllllllIlIlllIlllIlIlllI % lllllllllllllllIlIlllIlllIllIlII.length]));
            "".length();
            ++lllllllllllllllIlIlllIlllIlIlllI;
            ++lllllllllllllllIlIlllIlllIlIlIll;
            "".length();
         } while((98 ^ 103) > 0);

         return null;
      }

      private static boolean lIIllIlIlIlIlI(int var0, int var1) {
         return var0 < var1;
      }

      public ITextComponent func_150259_f() {
         return new Command.ChatMessage(lllllllllllllllIlIlllIllllIIIIlI.text);
      }

      public ChatMessage(String lllllllllllllllIlIlllIllllIlIIIl) {
         boolean lllllllllllllllIlIlllIllllIIlIll = Pattern.compile(lllIlIlIlllI[lllIlIlllIII[0]]);
         Matcher lllllllllllllllIlIlllIllllIIllll = lllllllllllllllIlIlllIllllIIlIll.matcher(lllllllllllllllIlIlllIllllIlIIIl);
         StringBuffer lllllllllllllllIlIlllIllllIIlllI = new StringBuffer();

         do {
            if (!lIIllIlIlIlIIl(lllllllllllllllIlIlllIllllIIllll.find())) {
               lllllllllllllllIlIlllIllllIIllll.appendTail(lllllllllllllllIlIlllIllllIIlllI);
               "".length();
               lllllllllllllllIlIlllIllllIlIIlI.text = lllllllllllllllIlIlllIllllIIlllI.toString();
               return;
            }

            float lllllllllllllllIlIlllIllllIIlIII = String.valueOf((new StringBuilder()).append(lllIlIlIlllI[lllIlIlllIII[1]]).append(lllllllllllllllIlIlllIllllIIllll.group().substring(lllIlIlllIII[1])));
            lllllllllllllllIlIlllIllllIIllll.appendReplacement(lllllllllllllllIlIlllIllllIIlllI, lllllllllllllllIlIlllIllllIIlIII);
            "".length();
            "".length();
         } while(" ".length() << (" ".length() << " ".length()) > " ".length());

         throw null;
      }

      private static void lIIllIlIIIllIl() {
         lllIlIlIlllI = new String[lllIlIlllIII[2]];
         lllIlIlIlllI[lllIlIlllIII[0]] = lIIllIlIIIlIll("fd3KpXtxfQlW97ojQkerAh/xbHSgxPaFWG5gqjxWsC8=", "xWguJ");
         lllIlIlIlllI[lllIlIlllIII[1]] = lIIllIlIIIllII("w5Q=", "sBtjG");
      }

      private static String lIIllIlIIIlIll(String lllllllllllllllIlIlllIlllIlIIIlI, String lllllllllllllllIlIlllIlllIIlllll) {
         try {
            char lllllllllllllllIlIlllIlllIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIlllIIlllll.getBytes(StandardCharsets.UTF_8)), lllIlIlllIII[3]), "DES");
            int lllllllllllllllIlIlllIlllIIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlllIlllIIlllIl.init(lllIlIlllIII[2], lllllllllllllllIlIlllIlllIIllllI);
            return new String(lllllllllllllllIlIlllIlllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIlllIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIIllIlIlIlIII() {
         lllIlIlllIII = new int[4];
         lllIlIlllIII[0] = (31 ^ 58) & ~(28 ^ 57);
         lllIlIlllIII[1] = " ".length();
         lllIlIlllIII[2] = " ".length() << " ".length();
         lllIlIlllIII[3] = " ".length() << "   ".length();
      }
   }
}
