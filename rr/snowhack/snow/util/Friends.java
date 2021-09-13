package rr.snowhack.snow.util;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

public class Friends {
   // $FF: synthetic field
   public static final Friends INSTANCE;
   // $FF: synthetic field
   public static Setting<ArrayList<Friends.Friend>> friends;
   // $FF: synthetic field
   private static final int[] llllIIllllIl;
   // $FF: synthetic field
   private static final String[] llllIIllllII;

   public static boolean isFriend(String lllllllllllllllIlIlIlIIlllIlIlII) {
      return ((ArrayList)friends.getValue()).stream().anyMatch((lllllllllllllllIlIlIlIIlllIIlllI) -> {
         return lllllllllllllllIlIlIlIIlllIIlllI.username.equalsIgnoreCase(lllllllllllllllIlIlIlIIlllIlIlII);
      });
   }

   private static boolean lIIllllllIIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIllllllIIlII(String lllllllllllllllIlIlIlIIllIlllllI, String lllllllllllllllIlIlIlIIllIllllIl) {
      lllllllllllllllIlIlIlIIllIlllllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIIllIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      byte lllllllllllllllIlIlIlIIllIllllII = new StringBuilder();
      char[] lllllllllllllllIlIlIlIIlllIIIIII = lllllllllllllllIlIlIlIIllIllllIl.toCharArray();
      String lllllllllllllllIlIlIlIIllIlllIlI = llllIIllllIl[0];
      String lllllllllllllllIlIlIlIIllIlllIIl = lllllllllllllllIlIlIlIIllIlllllI.toCharArray();
      long lllllllllllllllIlIlIlIIllIlllIII = lllllllllllllllIlIlIlIIllIlllIIl.length;
      int lllllllllllllllIlIlIlIIllIllIlll = llllIIllllIl[0];

      do {
         if (!lIIllllllIIlll(lllllllllllllllIlIlIlIIllIllIlll, lllllllllllllllIlIlIlIIllIlllIII)) {
            return String.valueOf(lllllllllllllllIlIlIlIIllIllllII);
         }

         char lllllllllllllllIlIlIlIIlllIIIlII = lllllllllllllllIlIlIlIIllIlllIIl[lllllllllllllllIlIlIlIIllIllIlll];
         lllllllllllllllIlIlIlIIllIllllII.append((char)(lllllllllllllllIlIlIlIIlllIIIlII ^ lllllllllllllllIlIlIlIIlllIIIIII[lllllllllllllllIlIlIlIIllIlllIlI % lllllllllllllllIlIlIlIIlllIIIIII.length]));
         "".length();
         ++lllllllllllllllIlIlIlIIllIlllIlI;
         ++lllllllllllllllIlIlIlIIllIllIlll;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) != "   ".length());

      return null;
   }

   private Friends() {
   }

   public static void initFriends() {
      friends = Settings.custom(llllIIllllII[llllIIllllIl[0]], new ArrayList(), new Friends.FriendListConverter()).buildAndRegister(llllIIllllII[llllIIllllIl[1]]);
   }

   private static void lIIllllllIIlIl() {
      llllIIllllII = new String[llllIIllllIl[2]];
      llllIIllllII[llllIIllllIl[0]] = lIIllllllIIlII("JSMqLgAHIg==", "cQCKn");
      llllIIllllII[llllIIllllIl[1]] = lIIllllllIIlII("ID0IMDgiPA==", "FOaUV");
   }

   static {
      lIIllllllIIllI();
      lIIllllllIIlIl();
      INSTANCE = new Friends();
   }

   private static void lIIllllllIIllI() {
      llllIIllllIl = new int[3];
      llllIIllllIl[0] = ((144 ^ 133) << (" ".length() << " ".length()) ^ 59 ^ 80) & (15 + 106 - 52 + 64 ^ (238 ^ 179) << " ".length() ^ -" ".length());
      llllIIllllIl[1] = " ".length();
      llllIIllllIl[2] = " ".length() << " ".length();
   }

   public static class FriendListConverter extends Converter<ArrayList<Friends.Friend>, JsonElement> {
      // $FF: synthetic field
      private static final int[] lIIIIIlIIIllI;
      // $FF: synthetic field
      private static final String[] lIIIIIlIIIlIl;

      protected JsonElement doForward(ArrayList<Friends.Friend> lllllllllllllllIlIIIllIIIllIllIl) {
         StringBuilder lllllllllllllllIlIIIllIIIllIllII = new StringBuilder();
         Iterator lllllllllllllllIlIIIllIIIllIlIIl = lllllllllllllllIlIIIllIIIllIllIl.iterator();

         do {
            if (!lIlIlIIIlIIIlI(lllllllllllllllIlIIIllIIIllIlIIl.hasNext())) {
               return new JsonPrimitive(String.valueOf(lllllllllllllllIlIIIllIIIllIllII));
            }

            Friends.Friend lllllllllllllllIlIIIllIIIllIllll = (Friends.Friend)lllllllllllllllIlIIIllIIIllIlIIl.next();
            String var10001 = lIIIIIlIIIlIl[lIIIIIlIIIllI[0]];
            Object[] var10002 = new Object[lIIIIIlIIIllI[1]];
            var10002[lIIIIIlIIIllI[0]] = lllllllllllllllIlIIIllIIIllIllll.username;
            var10002[lIIIIIlIIIllI[2]] = lllllllllllllllIlIIIllIIIllIllll.uuid.toString();
            lllllllllllllllIlIIIllIIIllIllII.append(String.format(var10001, var10002));
            "".length();
            "".length();
         } while(-" ".length() <= 0);

         return null;
      }

      private static String lIlIlIIIIllllI(String lllllllllllllllIlIIIllIIIIIIIlll, String lllllllllllllllIlIIIllIIIIIIIlII) {
         try {
            SecretKeySpec lllllllllllllllIlIIIllIIIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIIIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIllIIIIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIllIIIIIIlIIl.init(lIIIIIlIIIllI[1], lllllllllllllllIlIIIllIIIIIIlIlI);
            return new String(lllllllllllllllIlIIIllIIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIlIIIlIIIIl() {
         lIIIIIlIIIllI = new int[7];
         lIIIIIlIIIllI[0] = (34 ^ 55) << " ".length() & ~((114 ^ 103) << " ".length());
         lIIIIIlIIIllI[1] = " ".length() << " ".length();
         lIIIIIlIIIllI[2] = " ".length();
         lIIIIIlIIIllI[3] = "   ".length();
         lIIIIIlIIIllI[4] = " ".length() << (" ".length() << " ".length());
         lIIIIIlIIIllI[5] = (239 ^ 198) << (" ".length() << " ".length()) ^ 107 + 125 - 139 + 68;
         lIIIIIlIIIllI[6] = " ".length() << "   ".length();
      }

      private static boolean lIlIlIIIlIIIlI(int var0) {
         return var0 != 0;
      }

      protected ArrayList<Friends.Friend> doBackward(JsonElement lllllllllllllllIlIIIllIIIlIlIllI) {
         String lllllllllllllllIlIIIllIIIlIlIlIl = lllllllllllllllIlIIIllIIIlIlIllI.getAsString();
         short lllllllllllllllIlIIIllIIIlIIllll = lllllllllllllllIlIIIllIIIlIlIlIl.split(Pattern.quote(lIIIIIlIIIlIl[lIIIIIlIIIllI[2]]));
         ArrayList<Friends.Friend> lllllllllllllllIlIIIllIIIlIlIIll = new ArrayList();
         float lllllllllllllllIlIIIllIIIlIIllIl = lllllllllllllllIlIIIllIIIlIIllll;
         boolean lllllllllllllllIlIIIllIIIlIIllII = lllllllllllllllIlIIIllIIIlIIllll.length;
         int lllllllllllllllIlIIIllIIIlIIlIll = lIIIIIlIIIllI[0];

         while(lIlIlIIIlIIIll(lllllllllllllllIlIIIllIIIlIIlIll, lllllllllllllllIlIIIllIIIlIIllII)) {
            String lllllllllllllllIlIIIllIIIlIIlIlI = lllllllllllllllIlIIIllIIIlIIllIl[lllllllllllllllIlIIIllIIIlIIlIll];

            label23: {
               try {
                  String[] lllllllllllllllIlIIIllIIIlIllIll = lllllllllllllllIlIIIllIIIlIIlIlI.split(lIIIIIlIIIlIl[lIIIIIlIIIllI[1]]);
                  String lllllllllllllllIlIIIllIIIlIllIlI = lllllllllllllllIlIIIllIIIlIllIll[lIIIIIlIIIllI[0]];
                  UUID lllllllllllllllIlIIIllIIIlIllIIl = UUID.fromString(lllllllllllllllIlIIIllIIIlIllIll[lIIIIIlIIIllI[2]]);
                  lllllllllllllllIlIIIllIIIlIlIIll.add(new Friends.Friend(lllllllllllllllIlIIIllIIIlIlIIlI.getUsernameByUUID(lllllllllllllllIlIIIllIIIlIllIIl, lllllllllllllllIlIIIllIIIlIllIlI), lllllllllllllllIlIIIllIIIlIllIIl));
                  "".length();
               } catch (Exception var12) {
                  break label23;
               }

               "".length();
               if (" ".length() << (" ".length() << " ".length()) < 0) {
                  return null;
               }
            }

            ++lllllllllllllllIlIIIllIIIlIIlIll;
            "".length();
            if (-"  ".length() > 0) {
               return null;
            }
         }

         return lllllllllllllllIlIIIllIIIlIlIIll;
      }

      private String getUsernameByUUID(UUID lllllllllllllllIlIIIllIIIIllllll, String lllllllllllllllIlIIIllIIIIlllllI) {
         String lllllllllllllllIlIIIllIIIIllllIl = getSource(String.valueOf((new StringBuilder()).append(lIIIIIlIIIlIl[lIIIIIlIIIllI[3]]).append(lllllllllllllllIlIIIllIIIIllllll.toString())));
         if (lIlIlIIIlIIlII(lllllllllllllllIlIIIllIIIIllllIl) && !lIlIlIIIlIIIlI(lllllllllllllllIlIIIllIIIIllllIl.isEmpty())) {
            try {
               int lllllllllllllllIlIIIllIIIIlllIIl = (new JsonParser()).parse(lllllllllllllllIlIIIllIIIIllllIl);
               return lllllllllllllllIlIIIllIIIIlllIIl.getAsJsonObject().get(lIIIIIlIIIlIl[lIIIIIlIIIllI[4]]).getAsString();
            } catch (Exception var5) {
               var5.printStackTrace();
               System.err.println(lllllllllllllllIlIIIllIIIIllllIl);
               return lllllllllllllllIlIIIllIIIIlllllI;
            }
         } else {
            return lllllllllllllllIlIIIllIIIIlllllI;
         }
      }

      private static String lIlIlIIIIlllIl(String lllllllllllllllIlIIIllIIIIIlIIlI, String lllllllllllllllIlIIIllIIIIIlIIll) {
         try {
            int lllllllllllllllIlIIIllIIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIllIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIIllI[6]), "DES");
            Cipher lllllllllllllllIlIIIllIIIIIlIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIllIIIIIlIllI.init(lIIIIIlIIIllI[1], lllllllllllllllIlIIIllIIIIIlIIII);
            return new String(lllllllllllllllIlIIIllIIIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      static {
         lIlIlIIIlIIIIl();
         lIlIlIIIlIIIII();
      }

      private static String lIlIlIIIIlllll(String lllllllllllllllIlIIIlIllllllIIlI, String lllllllllllllllIlIIIlIllllllIllI) {
         lllllllllllllllIlIIIlIllllllIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlIllllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIIIlIllllllIlIl = new StringBuilder();
         double lllllllllllllllIlIIIlIlllllIllll = lllllllllllllllIlIIIlIllllllIllI.toCharArray();
         int lllllllllllllllIlIIIlIllllllIIll = lIIIIIlIIIllI[0];
         short lllllllllllllllIlIIIlIlllllIllIl = lllllllllllllllIlIIIlIllllllIIlI.toCharArray();
         long lllllllllllllllIlIIIlIlllllIllII = lllllllllllllllIlIIIlIlllllIllIl.length;
         int lllllllllllllllIlIIIlIlllllIlIll = lIIIIIlIIIllI[0];

         do {
            if (!lIlIlIIIlIIIll(lllllllllllllllIlIIIlIlllllIlIll, lllllllllllllllIlIIIlIlllllIllII)) {
               return String.valueOf(lllllllllllllllIlIIIlIllllllIlIl);
            }

            char lllllllllllllllIlIIIlIlllllllIII = lllllllllllllllIlIIIlIlllllIllIl[lllllllllllllllIlIIIlIlllllIlIll];
            lllllllllllllllIlIIIlIllllllIlIl.append((char)(lllllllllllllllIlIIIlIlllllllIII ^ lllllllllllllllIlIIIlIlllllIllll[lllllllllllllllIlIIIlIllllllIIll % lllllllllllllllIlIIIlIlllllIllll.length]));
            "".length();
            ++lllllllllllllllIlIIIlIllllllIIll;
            ++lllllllllllllllIlIIIlIlllllIlIll;
            "".length();
         } while(((9 ^ 12) << (" ".length() << " ".length()) & ~((73 ^ 76) << (" ".length() << " ".length()))) < " ".length() << " ".length());

         return null;
      }

      private static String getSource(String lllllllllllllllIlIIIllIIIIlIllII) {
         try {
            URL lllllllllllllllIlIIIllIIIIllIIlI = new URL(lllllllllllllllIlIIIllIIIIlIllII);
            char lllllllllllllllIlIIIllIIIIlIlIIl = lllllllllllllllIlIIIllIIIIllIIlI.openConnection();
            BufferedReader lllllllllllllllIlIIIllIIIIllIIII = new BufferedReader(new InputStreamReader(lllllllllllllllIlIIIllIIIIlIlIIl.getInputStream()));
            StringBuilder lllllllllllllllIlIIIllIIIIlIllll = new StringBuilder();

            do {
               String lllllllllllllllIlIIIllIIIIlIlllI;
               if (!lIlIlIIIlIIlII(lllllllllllllllIlIIIllIIIIlIlllI = lllllllllllllllIlIIIllIIIIllIIII.readLine())) {
                  lllllllllllllllIlIIIllIIIIllIIII.close();
                  return String.valueOf(lllllllllllllllIlIIIllIIIIlIllll);
               }

               lllllllllllllllIlIIIllIIIIlIllll.append(lllllllllllllllIlIIIllIIIIlIlllI);
               "".length();
               "".length();
            } while(null == null);

            return null;
         } catch (Exception var6) {
            return null;
         }
      }

      private static boolean lIlIlIIIlIIlII(Object var0) {
         return var0 != null;
      }

      private static boolean lIlIlIIIlIIIll(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIlIlIIIlIIIII() {
         lIIIIIlIIIlIl = new String[lIIIIIlIIIllI[5]];
         lIIIIIlIIIlIl[lIIIIIlIIIllI[0]] = lIlIlIIIIlllIl("pxkuWuDW0PY=", "twhtd");
         lIIIIIlIIIlIl[lIIIIIlIIIllI[2]] = lIlIlIIIIllllI("9LMyowRd51Y=", "GzdGI");
         lIIIIIlIIIlIl[lIIIIIlIIIllI[1]] = lIlIlIIIIlllIl("oV0Y1ba/PK0=", "Hzxil");
         lIIIIIlIIIlIl[lIIIIIlIIIllI[3]] = lIlIlIIIIllllI("XxeDfhWHUICMJE450VlzO+/RSYY+XzvZyokWFyyB645QoatAVxVN70HzQDuk3dtxTjQCQHY4Dq7+k1iCydLNzw==", "yIVmz");
         lIIIIIlIIIlIl[lIIIIIlIIIllI[4]] = lIlIlIIIIlllll("PAI8JA==", "RcQAm");
      }
   }

   public static class Friend {
      // $FF: synthetic field
      String username;
      // $FF: synthetic field
      UUID uuid;

      public Friend(String lllllllllllllllIlIllIIIlllIIIIll, UUID lllllllllllllllIlIllIIIlllIIIlIl) {
         lllllllllllllllIlIllIIIlllIIIlll.username = lllllllllllllllIlIllIIIlllIIIIll;
         lllllllllllllllIlIllIIIlllIIIlll.uuid = lllllllllllllllIlIllIIIlllIIIlIl;
      }

      public String getUsername() {
         return lllllllllllllllIlIllIIIlllIIIIII.username;
      }
   }
}
