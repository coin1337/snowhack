package rr.snowhack.snow.command.syntax.parsers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.command.syntax.SyntaxChunk;
import rr.snowhack.snow.command.syntax.SyntaxParser;

public abstract class AbstractParser implements SyntaxParser {
   // $FF: synthetic field
   private static final int[] lIIIIIlllllIl;
   // $FF: synthetic field
   private static final String[] lIIIIIlllllII;

   private static void lIlIlIlIIIlIIl() {
      lIIIIIlllllIl = new int[7];
      lIIIIIlllllIl[0] = (42 ^ 65 ^ (14 ^ 51) << " ".length()) << (" ".length() << " ".length()) & ((40 ^ 17 ^ (151 ^ 146) << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIIlllllIl[1] = " ".length();
      lIIIIIlllllIl[2] = " ".length() << " ".length();
      lIIIIIlllllIl[3] = "   ".length();
      lIIIIIlllllIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIIIlllllIl[5] = 15 ^ 10;
      lIIIIIlllllIl[6] = " ".length() << "   ".length();
   }

   private static void lIlIlIlIIIlIII() {
      lIIIIIlllllII = new String[lIIIIIlllllIl[5]];
      lIIIIIlllllII[lIIIIIlllllIl[0]] = lIlIlIlIIIIllI("Nt5OEZ9omVQ=", "hsWUr");
      lIIIIIlllllII[lIIIIIlllllIl[1]] = lIlIlIlIIIIlll("lkUpu7evhpc=", "YEUJE");
      lIIIIIlllllII[lIIIIIlllllIl[2]] = lIlIlIlIIIIlll("eq5DXfff3/8=", "hIZKv");
      lIIIIIlllllII[lIIIIIlllllIl[3]] = lIlIlIlIIIIllI("ux9N6rktiL4=", "mbYKT");
      lIIIIIlllllII[lIIIIIlllllIl[4]] = lIlIlIlIIIIllI("Qv8KxC2i7dg=", "BAgFP");
   }

   private static String lIlIlIlIIIIllI(String lllllllllllllllIlIIIIlIIIIIIllIl, String lllllllllllllllIlIIIIlIIIIIIllII) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIlIIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIIIIIllII.getBytes(StandardCharsets.UTF_8)), lIIIIIlllllIl[6]), "DES");
         double lllllllllllllllIlIIIIlIIIIIIlIII = Cipher.getInstance("DES");
         lllllllllllllllIlIIIIlIIIIIIlIII.init(lIIIIIlllllIl[2], lllllllllllllllIlIIIIlIIIIIlIIII);
         return new String(lllllllllllllllIlIIIIlIIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      lIlIlIlIIIlIIl();
      lIlIlIlIIIlIII();
   }

   private static boolean lIlIlIlIIIlIlI(int var0) {
      return var0 != 0;
   }

   public abstract String getChunk(SyntaxChunk[] var1, SyntaxChunk var2, String[] var3, String var4);

   protected String getDefaultChunk(SyntaxChunk lllllllllllllllIlIIIIlIIIIlIIIlI) {
      StringBuilder var10000 = new StringBuilder();
      String var10001;
      if (lIlIlIlIIIlIlI(lllllllllllllllIlIIIIlIIIIlIIIlI.isHeadless())) {
         var10001 = lIIIIIlllllII[lIIIIIlllllIl[0]];
         "".length();
         if ((((55 ^ 2) << " ".length() ^ 28 ^ 97) & ((1 ^ 26) << " ".length() ^ 118 ^ 87 ^ -" ".length())) != 0) {
            return null;
         }
      } else {
         var10001 = lllllllllllllllIlIIIIlIIIIlIIIlI.getHead();
      }

      var10000 = var10000.append(var10001);
      if (lIlIlIlIIIlIlI(lllllllllllllllIlIIIIlIIIIlIIIlI.isNecessary())) {
         var10001 = lIIIIIlllllII[lIIIIIlllllIl[1]];
         "".length();
         if (" ".length() != " ".length()) {
            return null;
         }
      } else {
         var10001 = lIIIIIlllllII[lIIIIIlllllIl[2]];
      }

      var10000 = var10000.append(var10001).append(lllllllllllllllIlIIIIlIIIIlIIIlI.getType());
      if (lIlIlIlIIIlIlI(lllllllllllllllIlIIIIlIIIIlIIIlI.isNecessary())) {
         var10001 = lIIIIIlllllII[lIIIIIlllllIl[3]];
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10001 = lIIIIIlllllII[lIIIIIlllllIl[4]];
      }

      return String.valueOf(var10000.append(var10001));
   }

   private static String lIlIlIlIIIIlll(String lllllllllllllllIlIIIIlIIIIIllIlI, String lllllllllllllllIlIIIIlIIIIIllIIl) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIlIIIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lllllllllllllllIlIIIIlIIIIIlIlIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIlIIIIIlIlIl.init(lIIIIIlllllIl[2], lllllllllllllllIlIIIIlIIIIIlllIl);
         return new String(lllllllllllllllIlIIIIlIIIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
