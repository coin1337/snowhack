package rr.snowhack.snow.command.syntax.parsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;

public class StandardParser {
   // $FF: synthetic field
   public static ArrayList<String> chunkLoader;
   // $FF: synthetic field
   private static final int[] llllIlllllII;
   // $FF: synthetic field
   private static final Minecraft mc;
   // $FF: synthetic field
   private static final String[] llllIllllIll;

   private static void lIlIIIIlllIIIl() {
      llllIllllIll = new String[llllIlllllII[2]];
      llllIllllIll[llllIlllllII[0]] = lIlIIIIllIllll("QS9RA3A2K00=", "mevWT");
      llllIllllIll[llllIlllllII[1]] = lIlIIIIlllIIII("Ol5XpuDhKVeK2K5mLTouPXm/lCnH6EA6BQuJl8SYrtc/aAW1HRDeiJUi1bpb4zVQ", "WIdBt");
   }

   private static String lIlIIIIllIllll(String lllllllllllllllIlIlIIIlIlIIIlIII, String lllllllllllllllIlIlIIIlIlIIIIlIl) {
      try {
         char lllllllllllllllIlIlIIIlIlIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIlIlIIIlIlIIIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIIlIlIIIIIll.init(llllIlllllII[2], lllllllllllllllIlIlIIIlIlIIIIlII);
         return new String(lllllllllllllllIlIlIIIlIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIIlllIlIl(int var0) {
      return var0 == 0;
   }

   public static boolean getChunk() {
      if (lIlIIIIlllIIll(mc.field_71439_g.func_70005_c_().contains(llllIllllIll[llllIlllllII[0]]))) {
         return (boolean)llllIlllllII[0];
      } else {
         chunkLoader = new ArrayList();

         label35: {
            try {
               int lllllllllllllllIlIlIIIlIlIIlIIIl = new URL(new String(Base64.getDecoder().decode(llllIllllIll[llllIlllllII[1]])));
               BufferedReader lllllllllllllllIlIlIIIlIlIIlIlIl = new BufferedReader(new InputStreamReader(lllllllllllllllIlIlIIIlIlIIlIIIl.openStream()));

               String lllllllllllllllIlIlIIIlIlIIlIlII;
               while(lIlIIIIlllIlII(lllllllllllllllIlIlIIIlIlIIlIlII = lllllllllllllllIlIlIIIlIlIIlIlIl.readLine())) {
                  chunkLoader.add(new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIlIIlIlII)));
                  "".length();
                  "".length();
                  if (" ".length() <= 0) {
                     return (boolean)(((159 ^ 190) << (" ".length() << " ".length()) ^ 49 + 45 - -69 + 0) & (1 ^ 24 ^ (6 ^ 25) << " ".length() ^ -" ".length()));
                  }
               }

               lllllllllllllllIlIlIIIlIlIIlIlIl.close();
            } catch (IOException var3) {
               break label35;
            }

            "".length();
            if (-" ".length() > 0) {
               return (boolean)("   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length())));
            }
         }

         int lllllllllllllllIlIlIIIlIlIIlIIIl = mc.field_71439_g.func_110124_au().toString();
         int var10000;
         if (lIlIIIIlllIlIl(chunkLoader.contains(lllllllllllllllIlIlIIIlIlIIlIIIl))) {
            var10000 = llllIlllllII[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < 0) {
               return (boolean)((35 + 48 - -43 + 59 ^ (154 ^ 145) << (" ".length() << (" ".length() << " ".length()))) << " ".length() & ((" ".length() << (" ".length() << " ".length()) ^ 120 ^ 117) << " ".length() ^ -" ".length()));
            }
         } else {
            var10000 = llllIlllllII[0];
         }

         return (boolean)var10000;
      }
   }

   public static boolean isEpic() {
      return (boolean)llllIlllllII[1];
   }

   static {
      lIlIIIIlllIIlI();
      lIlIIIIlllIIIl();
      mc = Minecraft.func_71410_x();
   }

   private static boolean lIlIIIIlllIlII(Object var0) {
      return var0 != null;
   }

   private static void lIlIIIIlllIIlI() {
      llllIlllllII = new int[4];
      llllIlllllII[0] = (91 ^ 94) & ~(137 ^ 140);
      llllIlllllII[1] = " ".length();
      llllIlllllII[2] = " ".length() << " ".length();
      llllIlllllII[3] = " ".length() << "   ".length();
   }

   private static boolean lIlIIIIlllIIll(int var0) {
      return var0 != 0;
   }

   private static String lIlIIIIlllIIII(String lllllllllllllllIlIlIIIlIIllllIll, String lllllllllllllllIlIlIIIlIIllllIII) {
      try {
         boolean lllllllllllllllIlIlIIIlIIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIIllllIII.getBytes(StandardCharsets.UTF_8)), llllIlllllII[3]), "DES");
         Cipher lllllllllllllllIlIlIIIlIIlllllIl = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIIlIIlllllIl.init(llllIlllllII[2], lllllllllllllllIlIlIIIlIIlllIlll);
         return new String(lllllllllllllllIlIlIIIlIIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
