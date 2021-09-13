package rr.snowhack.snow.command.commands;

import com.google.gson.JsonParser;
import com.mojang.util.UUIDTypeAdapter;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetworkPlayerInfo;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;
import rr.snowhack.snow.command.syntax.parsers.EnumParser;
import rr.snowhack.snow.util.Friends;

public class FriendCommand extends Command {
   // $FF: synthetic field
   private static final String[] lIIIlIllllIII;
   // $FF: synthetic field
   private static final int[] lIIIlIllllIIl;

   private static String lIllIIlIlllIll(String lllllllllllllllIIllIIllIIlllIIlI, String lllllllllllllllIIllIIllIIlllIIll) {
      try {
         SecretKeySpec lllllllllllllllIIllIIllIIlllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIIlllIIll.getBytes(StandardCharsets.UTF_8)), lIIIlIllllIIl[8]), "DES");
         char lllllllllllllllIIllIIllIIllIllll = Cipher.getInstance("DES");
         lllllllllllllllIIllIIllIIllIllll.init(lIIIlIllllIIl[2], lllllllllllllllIIllIIllIIlllIlll);
         return new String(lllllllllllllllIIllIIllIIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIllIIlIlllIlI(String lllllllllllllllIIllIIllIIlIlllll, String lllllllllllllllIIllIIllIIlIllllI) {
      lllllllllllllllIIllIIllIIlIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIIllIIllIIIlI = new StringBuilder();
      char[] lllllllllllllllIIllIIllIIllIIIIl = lllllllllllllllIIllIIllIIlIllllI.toCharArray();
      int lllllllllllllllIIllIIllIIllIIIII = lIIIlIllllIIl[0];
      char lllllllllllllllIIllIIllIIlIllIlI = lllllllllllllllIIllIIllIIlIlllll.toCharArray();
      int lllllllllllllllIIllIIllIIlIllIIl = lllllllllllllllIIllIIllIIlIllIlI.length;
      int lllllllllllllllIIllIIllIIlIllIII = lIIIlIllllIIl[0];

      do {
         if (!lIllIIllIIIIll(lllllllllllllllIIllIIllIIlIllIII, lllllllllllllllIIllIIllIIlIllIIl)) {
            return String.valueOf(lllllllllllllllIIllIIllIIllIIIlI);
         }

         char lllllllllllllllIIllIIllIIllIIlIl = lllllllllllllllIIllIIllIIlIllIlI[lllllllllllllllIIllIIllIIlIllIII];
         lllllllllllllllIIllIIllIIllIIIlI.append((char)(lllllllllllllllIIllIIllIIllIIlIl ^ lllllllllllllllIIllIIllIIllIIIIl[lllllllllllllllIIllIIllIIllIIIII % lllllllllllllllIIllIIllIIllIIIIl.length]));
         "".length();
         ++lllllllllllllllIIllIIllIIllIIIII;
         ++lllllllllllllllIIllIIllIIlIllIII;
         "".length();
      } while((136 ^ 141) != 0);

      return null;
   }

   private static boolean lIllIIllIIIIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIllIIllIIIIll(int var0, int var1) {
      return var0 < var1;
   }

   private static String convertStreamToString(InputStream lllllllllllllllIIllIIllIlIIlllIl) {
      Scanner lllllllllllllllIIllIIllIlIIlllll = (new Scanner(lllllllllllllllIIllIIllIlIIlllIl)).useDelimiter(lIIIlIllllIII[lIIIlIllllIIl[39]]);
      String var10000;
      if (lIllIIllIIIIII(lllllllllllllllIIllIIllIlIIlllll.hasNext())) {
         var10000 = lllllllllllllllIIllIIllIlIIlllll.next();
         "".length();
         if (" ".length() << " ".length() != " ".length() << " ".length()) {
            return null;
         }
      } else {
         var10000 = lIIIlIllllIII[lIIIlIllllIIl[40]];
      }

      String lllllllllllllllIIllIIllIlIIllllI = var10000;
      return lllllllllllllllIIllIIllIlIIllllI;
   }

   private static boolean lIllIIlIllllll(Object var0) {
      return var0 == null;
   }

   public static Friends.Friend getFriendByName(String lllllllllllllllIIllIIllIllIIIlII) {
      ArrayList<NetworkPlayerInfo> lllllllllllllllIIllIIllIllIIIIll = new ArrayList(Minecraft.func_71410_x().func_147114_u().func_175106_d());
      NetworkPlayerInfo lllllllllllllllIIllIIllIllIIIllI = (NetworkPlayerInfo)lllllllllllllllIIllIIllIllIIIIll.stream().filter((lllllllllllllllIIllIIllIlIIlIlll) -> {
         return lllllllllllllllIIllIIllIlIIlIlll.func_178845_a().getName().equalsIgnoreCase(lllllllllllllllIIllIIllIllIIIlII);
      }).findFirst().orElse((Object)null);
      if (!lIllIIlIllllll(lllllllllllllllIIllIIllIllIIIllI)) {
         double lllllllllllllllIIllIIllIllIIIIIl = new Friends.Friend(lllllllllllllllIIllIIllIllIIIllI.func_178845_a().getName(), lllllllllllllllIIllIIllIllIIIllI.func_178845_a().getId());
         return lllllllllllllllIIllIIllIllIIIIIl;
      } else {
         Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[26]]);
         String lllllllllllllllIIllIIllIllIIlIIl = requestIDs(String.valueOf((new StringBuilder()).append(lIIIlIllllIII[lIIIlIllllIIl[27]]).append(lllllllllllllllIIllIIllIllIIIlII).append(lIIIlIllllIII[lIIIlIllllIIl[28]])));
         if (lIllIIllIIIIlI(lllllllllllllllIIllIIllIllIIlIIl) && !lIllIIllIIIIII(lllllllllllllllIIllIIllIllIIlIIl.isEmpty())) {
            long lllllllllllllllIIllIIllIllIIIIII = (new JsonParser()).parse(lllllllllllllllIIllIIllIllIIlIIl);
            if (lIllIIllIIIIIl(lllllllllllllllIIllIIllIllIIIIII.getAsJsonArray().size())) {
               Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[30]]);
               "".length();
               if (-"   ".length() >= 0) {
                  return null;
               }
            } else {
               try {
                  char lllllllllllllllIIllIIllIlIllllll = lllllllllllllllIIllIIllIllIIIIII.getAsJsonArray().get(lIIIlIllllIIl[0]).getAsJsonObject().get(lIIIlIllllIII[lIIIlIllllIIl[31]]).getAsString();
                  boolean lllllllllllllllIIllIIllIlIlllllI = lllllllllllllllIIllIIllIllIIIIII.getAsJsonArray().get(lIIIlIllllIIl[0]).getAsJsonObject().get(lIIIlIllllIII[lIIIlIllllIIl[32]]).getAsString();
                  long lllllllllllllllIIllIIllIlIllllIl = new Friends.Friend(lllllllllllllllIIllIIllIlIlllllI, UUIDTypeAdapter.fromString(lllllllllllllllIIllIIllIlIllllll));
                  return lllllllllllllllIIllIIllIlIllllIl;
               } catch (Exception var9) {
                  var9.printStackTrace();
                  Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[33]]);
               }
            }
         } else {
            Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[29]]);
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < 0) {
               return null;
            }
         }

         return null;
      }
   }

   private static boolean lIllIIllIIIIlI(Object var0) {
      return var0 != null;
   }

   private static boolean lIllIIllIIIIIl(int var0) {
      return var0 == 0;
   }

   public void call(String[] lllllllllllllllIIllIIllIllIllIll) {
      if (lIllIIlIllllll(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]])) {
         if (lIllIIllIIIIII(((ArrayList)Friends.friends.getValue()).isEmpty())) {
            Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[6]]);
         } else {
            int lllllllllllllllIIllIIllIllIllIIl = lIIIlIllllIII[lIIIlIllllIIl[7]];
            Iterator lllllllllllllllIIllIIllIllIllIII = ((ArrayList)Friends.friends.getValue()).iterator();

            do {
               if (!lIllIIllIIIIII(lllllllllllllllIIllIIllIllIllIII.hasNext())) {
                  lllllllllllllllIIllIIllIllIllIIl = lllllllllllllllIIllIIllIllIllIIl.substring(lIIIlIllllIIl[0], lllllllllllllllIIllIIllIllIllIIl.length() - lIIIlIllllIIl[2]);
                  Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIllllIII[lIIIlIllllIIl[9]]).append(lllllllllllllllIIllIIllIllIllIIl)));
                  return;
               }

               double lllllllllllllllIIllIIllIllIlIlll = (Friends.Friend)lllllllllllllllIIllIIllIllIllIII.next();
               lllllllllllllllIIllIIllIllIllIIl = String.valueOf((new StringBuilder()).append(lllllllllllllllIIllIIllIllIllIIl).append(lllllllllllllllIIllIIllIllIlIlll.getUsername()).append(lIIIlIllllIII[lIIIlIllllIIl[8]]));
               "".length();
            } while("   ".length() > -" ".length());

         }
      } else if (lIllIIlIllllll(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]])) {
         String var10000;
         if (lIllIIllIIIIII(Friends.isFriend(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]]))) {
            var10000 = lIIIlIllllIII[lIIIlIllllIIl[10]];
            "".length();
            if ("   ".length() == ("   ".length() << "   ".length() & ~("   ".length() << "   ".length()))) {
               return;
            }
         } else {
            var10000 = lIIIlIllllIII[lIIIlIllllIIl[11]];
         }

         Object[] var10001 = new Object[lIIIlIllllIIl[1]];
         var10001[lIIIlIllllIIl[0]] = lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]];
         Command.sendChatMessage(String.format(var10000, var10001));
         if (lIllIIllIIIIII(Friends.isFriend(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]]))) {
            var10000 = lIIIlIllllIII[lIIIlIllllIIl[12]];
            "".length();
            if ((100 ^ 97) == 0) {
               return;
            }
         } else {
            var10000 = lIIIlIllllIII[lIIIlIllllIIl[13]];
         }

         var10001 = new Object[lIIIlIllllIIl[1]];
         var10001[lIIIlIllllIIl[0]] = lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]];
         Command.sendChatMessage(String.format(var10000, var10001));
      } else if (lIllIIllIIIIIl(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]].equalsIgnoreCase(lIIIlIllllIII[lIIIlIllllIIl[14]])) && !lIllIIllIIIIII(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]].equalsIgnoreCase(lIIIlIllllIII[lIIIlIllllIIl[15]]))) {
         if (lIllIIllIIIIIl(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]].equalsIgnoreCase(lIIIlIllllIII[lIIIlIllllIIl[17]])) && lIllIIllIIIIIl(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]].equalsIgnoreCase(lIIIlIllllIII[lIIIlIllllIIl[18]])) && !lIllIIllIIIIII(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[0]].equalsIgnoreCase(lIIIlIllllIII[lIIIlIllllIIl[19]]))) {
            Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[25]]);
         } else if (lIllIIllIIIIII(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]].equals(lIIIlIllllIII[lIIIlIllllIIl[20]]))) {
            Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[21]]);
         } else if (lIllIIllIIIIIl(Friends.isFriend(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]]))) {
            Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[22]]);
         } else {
            int lllllllllllllllIIllIIllIllIllIIl = (Friends.Friend)((ArrayList)Friends.friends.getValue()).stream().filter((lllllllllllllllIIllIIllIlIIIllll) -> {
               return lllllllllllllllIIllIIllIlIIIllll.getUsername().equalsIgnoreCase(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]]);
            }).findFirst().get();
            ((ArrayList)Friends.friends.getValue()).remove(lllllllllllllllIIllIIllIllIllIIl);
            "".length();
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIllllIII[lIIIlIllllIIl[23]]).append(lllllllllllllllIIllIIllIllIllIIl.getUsername()).append(lIIIlIllllIII[lIIIlIllllIIl[24]])));
         }
      } else if (lIllIIllIIIIII(Friends.isFriend(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]]))) {
         Command.sendChatMessage(lIIIlIllllIII[lIIIlIllllIIl[16]]);
      } else {
         (new Thread(() -> {
            Friends.Friend lllllllllllllllIIllIIllIlIIIlIll = getFriendByName(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]]);
            if (lIllIIlIllllll(lllllllllllllllIIllIIllIlIIIlIll)) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIllllIII[lIIIlIllllIIl[41]]).append(lllllllllllllllIIllIIllIllIllIll[lIIIlIllllIIl[1]])));
            } else {
               ((ArrayList)Friends.friends.getValue()).add(lllllllllllllllIIllIIllIlIIIlIll);
               "".length();
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIllllIII[lIIIlIllllIIl[42]]).append(lllllllllllllllIIllIIllIlIIIlIll.getUsername()).append(lIIIlIllllIII[lIIIlIllllIIl[43]])));
            }
         })).start();
      }
   }

   private static void lIllIIlIllllIl() {
      lIIIlIllllIII = new String[lIIIlIllllIIl[44]];
      lIIIlIllllIII[lIIIlIllllIIl[0]] = lIllIIlIlllIlI("NyMhJhw1", "QQHCr");
      lIIIlIllllIII[lIIIlIllllIIl[1]] = lIllIIlIlllIll("gcHY4VEERm0=", "HcJjS");
      lIIIlIllllIII[lIIIlIllllIIl[2]] = lIllIIlIlllIll("xpcbSnad6hQ=", "QZdXb");
      lIIIlIllllIII[lIIIlIllllIIl[3]] = lIllIIlIlllIlI("Egka", "vlvTc");
      lIIIlIllllIII[lIIIlIllllIIl[4]] = lIllIIlIlllIll("D4buBrG5Thc=", "DRcUn");
      lIIIlIllllIII[lIIIlIllllIIl[5]] = lIllIIlIlllIlI("Jw4hTCAJByADPQNKJB9zHwUwHnMAGCwJPQJL", "fjElS");
      lIIIlIllllIII[lIIIlIllllIIl[6]] = lIllIIlIlllIlI("EAsyeCU8FjU9KD0IPngiJgpgLGYhBTE9ZigKPnggOw0iNiI6RCY8IiwAaXhgKwI1MSMnAGc5Ii1EezYnJAF5fjRpECh4Jy0AZzcoLEo=", "IdGXF");
      lIIIlIllllIII[lIIIlIllllIIl[7]] = lIllIIlIlllIll("V7jVOZIBOaU=", "usdvY");
      lIIIlIllllIII[lIIIlIllllIIl[8]] = lIllIIlIllllII("3ZxrNd7pD0I=", "FvHSY");
      lIIIlIllllIII[lIIIlIllllIIl[9]] = lIllIIlIlllIll("sz07Rvf2KfPYH965StZRTA==", "oSXwZ");
      lIIIlIllllIII[lIIIlIllllIIl[10]] = lIllIIlIlllIlI("OwQhamNHEnIvMEIYPTMxQgcgLyYMBXw=", "baRFC");
      lIIIlIllllIII[lIIIlIllllIIl[11]] = lIllIIlIllllII("JlYl6nZ91gZX4nIbU3xvO3Nn9ZyERvZly3LsUPRq+JM=", "JVDXX");
      lIIIlIllllIII[lIIIlIllllIIl[12]] = lIllIIlIlllIll("xvmPyukr5bFK0DAFrnIyA8v5L/0XNiQO", "gFAQQ");
      lIIIlIllllIII[lIIIlIllllIIl[13]] = lIllIIlIlllIll("/5pat9cUCJVIk6yJNL+uakuuS3IEIMn5K0qyuK5sq4M=", "xAAoA");
      lIIIlIllllIII[lIIIlIllllIIl[14]] = lIllIIlIllllII("6VxERQm4JjU=", "pbsXh");
      lIIIlIllllIII[lIIIlIllllIIl[15]] = lIllIIlIlllIll("PglPil5Xd9k=", "MCeNp");
      lIIIlIllllIII[lIIIlIllllIIl[16]] = lIllIIlIlllIlI("MD4PNUcUOg84AhZ2BzJHBTocJAYAL044CBEkTicVDTMAJUk=", "dVnAg");
      lIIIlIllllIII[lIIIlIllllIIl[17]] = lIllIIlIllllII("T9BQzfi21Sg=", "PuoRF");
      lIIIlIllllIII[lIIIlIllllIIl[18]] = lIllIIlIllllII("ks0eo8Ap1w4=", "cVXTQ");
      lIIIlIllllIII[lIIIlIllllIIl[19]] = lIllIIlIlllIlI("NBU/HAU1", "PpSyq");
      lIIIlIllllIII[lIIIlIllllIIl[20]] = lIllIIlIlllIll("os4P9komOsc=", "yKscK");
      lIIIlIllllIII[lIIIlIllllIIl[21]] = lIllIIlIlllIll("3OcNOJD/6q2RCCjUvBXZ/GxWco3cMufY8VbGrEcQ8kxL0IKtg9373iW1jWQaQ6+OWyDKyeHDbfQ=", "sqcoh");
      lIIIlIllllIII[lIIIlIllllIIl[22]] = lIllIIlIllllII("HMuyvu5K5Q2mQtHLhmwUKVQu43vZPaJhajuT6068d8w=", "OGfBP");
      lIIIlIllllIII[lIIIlIllllIIl[23]] = lIllIIlIllllII("Gm4RcO5aSYk=", "TmOdj");
      lIIIlIllllIII[lIIIlIllllIIl[24]] = lIllIIlIlllIlI("UBdVAgMFRRcPBxhFAAQEBAwQBAYTAVs=", "veujb");
      lIIIlIllllIII[lIIIlIllllIIl[25]] = lIllIIlIlllIlI("CAImET89TjAAKTsHJQlsPQc3GCkqTmVGLTwKZQJsNxxjVnoqCy4fOj0=", "XnCpL");
      lIIIlIllllIII[lIIIlIllllIIl[26]] = lIllIIlIlllIlI("NDURGgMWeRkQCEMtUAwICDAeBkhEFR8MDQ03F0MTFHklNi8gd14=", "dYpcf");
      lIIIlIllllIII[lIIIlIllllIIl[27]] = lIllIIlIlllIlI("N0M=", "laJaB");
      lIIIlIllllIII[lIIIlIllllIIl[28]] = lIllIIlIllllII("mmXedgsHKj4=", "cgIAW");
      lIIIlIllllIII[lIIIlIllllIIl[29]] = lIllIIlIllllII("7R03rBpMWBZJU4TM9CgY9vmEnfjGlRtiiBORb6ozdfkOxbO5cHCs+2kfGlzqsi8Hal8j5IdLU74JOJ0ACFpeSQ==", "PyFIz");
      lIIIlIllllIII[lIIIlIllllIIl[30]] = lIllIIlIlllIll("sVv7v9ICVDIioTTsKoGGcosa5PLmINdGKOlde3rkAtw=", "RUwsQ");
      lIIIlIllllIII[lIIIlIllllIIl[31]] = lIllIIlIllllII("MEWilPCFXrI=", "dsLFl");
      lIIIlIllllIII[lIIIlIllllIIl[32]] = lIllIIlIlllIlI("OzUFDw==", "UThjD");
      lIIIlIllllIII[lIIIlIllllIIl[33]] = lIllIIlIllllII("9gYGtjmIs57EB+g8OpCGj0FTqpBnRlyvCHsB0rzS1QA=", "dKUZj");
      lIIIlIllllIII[lIIIlIllllIIl[34]] = lIllIIlIlllIll("VQSbqXY7Vywm+2MGWH43dD4kf4vixuojvwbTZB0J9/rCTydA9vcQos9DF+HmTdcl", "kAbEQ");
      lIIIlIllllIII[lIIIlIllllIIl[36]] = lIllIIlIlllIlI("CRUbHCYkDlg8Ojof", "JzuhC");
      lIIIlIllllIII[lIIIlIllllIIl[37]] = lIllIIlIlllIll("SKwVgsj+MKZqZGw81adgo/Iu+79dgGdqyY+AUlKLuTo=", "iOUVX");
      lIIIlIllllIII[lIIIlIllllIIl[38]] = lIllIIlIllllII("BK8GKDJ2Wfg=", "BMuyp");
      lIIIlIllllIII[lIIIlIllllIIl[39]] = lIllIIlIlllIlI("LRQ=", "qUwGk");
      lIIIlIllllIII[lIIIlIllllIIl[40]] = lIllIIlIlllIll("5H5NLI0NE04=", "rKLhI");
      lIIIlIllllIII[lIIIlIllllIIl[41]] = lIllIIlIllllII("hwFPKpzGDGE0Q+0aVWZFhjS2ZqkznxJG", "FFpEB");
      lIIIlIllllIII[lIIIlIllllIIl[42]] = lIllIIlIlllIlI("aCs=", "NIvVP");
      lIIIlIllllIII[lIIIlIllllIIl[43]] = lIllIIlIlllIll("WAU8Az0kuZl2YYVs/59pNIJF9eR47zWK", "IuTzp");
   }

   private static String lIllIIlIllllII(String lllllllllllllllIIllIIllIIlllllll, String lllllllllllllllIIllIIllIlIIIIIII) {
      try {
         SecretKeySpec lllllllllllllllIIllIIllIlIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIIllIIllIIlllllII = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIIllIIlllllII.init(lIIIlIllllIIl[2], lllllllllllllllIIllIIllIlIIIIlII);
         return new String(lllllllllllllllIIllIIllIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public FriendCommand() {
      String var10001 = lIIIlIllllIII[lIIIlIllllIIl[0]];
      ChunkBuilder var10002 = new ChunkBuilder();
      String var10003 = lIIIlIllllIII[lIIIlIllllIIl[1]];
      int var10004 = lIIIlIllllIIl[1];
      String[] var10007 = new String[lIIIlIllllIIl[2]];
      var10007[lIIIlIllllIIl[0]] = lIIIlIllllIII[lIIIlIllllIIl[2]];
      var10007[lIIIlIllllIIl[1]] = lIIIlIllllIII[lIIIlIllllIIl[3]];
      super(var10001, var10002.append(var10003, (boolean)var10004, new EnumParser(var10007)).append(lIIIlIllllIII[lIIIlIllllIIl[4]]).build());
      lllllllllllllllIIllIIllIlllIIlIl.setDescription(lIIIlIllllIII[lIIIlIllllIIl[5]]);
   }

   static {
      lIllIIlIlllllI();
      lIllIIlIllllIl();
   }

   private static String requestIDs(String lllllllllllllllIIllIIllIlIlIllII) {
      try {
         String lllllllllllllllIIllIIllIlIlIlIlI = lIIIlIllllIII[lIIIlIllllIIl[34]];
         URL lllllllllllllllIIllIIllIlIllIIlI = new URL(lllllllllllllllIIllIIllIlIlIlIlI);
         HttpURLConnection lllllllllllllllIIllIIllIlIllIIIl = (HttpURLConnection)lllllllllllllllIIllIIllIlIllIIlI.openConnection();
         lllllllllllllllIIllIIllIlIllIIIl.setConnectTimeout(lIIIlIllllIIl[35]);
         lllllllllllllllIIllIIllIlIllIIIl.setRequestProperty(lIIIlIllllIII[lIIIlIllllIIl[36]], lIIIlIllllIII[lIIIlIllllIIl[37]]);
         lllllllllllllllIIllIIllIlIllIIIl.setDoOutput((boolean)lIIIlIllllIIl[1]);
         lllllllllllllllIIllIIllIlIllIIIl.setDoInput((boolean)lIIIlIllllIIl[1]);
         lllllllllllllllIIllIIllIlIllIIIl.setRequestMethod(lIIIlIllllIII[lIIIlIllllIIl[38]]);
         OutputStream lllllllllllllllIIllIIllIlIllIIII = lllllllllllllllIIllIIllIlIllIIIl.getOutputStream();
         lllllllllllllllIIllIIllIlIllIIII.write(lllllllllllllllIIllIIllIlIlIllII.getBytes(StandardCharsets.UTF_8));
         lllllllllllllllIIllIIllIlIllIIII.close();
         short lllllllllllllllIIllIIllIlIlIIlIl = new BufferedInputStream(lllllllllllllllIIllIIllIlIllIIIl.getInputStream());
         String lllllllllllllllIIllIIllIlIlIlllI = convertStreamToString(lllllllllllllllIIllIIllIlIlIIlIl);
         lllllllllllllllIIllIIllIlIlIIlIl.close();
         lllllllllllllllIIllIIllIlIllIIIl.disconnect();
         return lllllllllllllllIIllIIllIlIlIlllI;
      } catch (Exception var8) {
         return null;
      }
   }

   private static void lIllIIlIlllllI() {
      lIIIlIllllIIl = new int[45];
      lIIIlIllllIIl[0] = ((164 ^ 149) << " ".length() ^ 7 + 30 - 29 + 119) & ((217 ^ 180) << " ".length() ^ 13 + 65 - 40 + 161 ^ -" ".length());
      lIIIlIllllIIl[1] = " ".length();
      lIIIlIllllIIl[2] = " ".length() << " ".length();
      lIIIlIllllIIl[3] = "   ".length();
      lIIIlIllllIIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIllllIIl[5] = 70 ^ 67;
      lIIIlIllllIIl[6] = "   ".length() << " ".length();
      lIIIlIllllIIl[7] = (125 ^ 112) << (" ".length() << " ".length()) ^ 42 ^ 25;
      lIIIlIllllIIl[8] = " ".length() << "   ".length();
      lIIIlIllllIIl[9] = (60 ^ 17) << " ".length() ^ 197 ^ 150;
      lIIIlIllllIIl[10] = (44 ^ 41) << " ".length();
      lIIIlIllllIIl[11] = (85 ^ 118) << " ".length() ^ 25 ^ 84;
      lIIIlIllllIIl[12] = "   ".length() << (" ".length() << " ".length());
      lIIIlIllllIIl[13] = 36 ^ 41;
      lIIIlIllllIIl[14] = ((8 ^ 57) << (" ".length() << " ".length()) ^ 162 + 84 - 54 + 3) << " ".length();
      lIIIlIllllIIl[15] = (235 ^ 196) << (" ".length() << " ".length()) ^ 41 + 178 - 213 + 173;
      lIIIlIllllIIl[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIllllIIl[17] = 82 ^ 67;
      lIIIlIllllIIl[18] = (125 ^ 116) << " ".length();
      lIIIlIllllIIl[19] = 20 ^ 7;
      lIIIlIllllIIl[20] = ((72 ^ 105) << (" ".length() << " ".length()) ^ 123 + 127 - 155 + 34) << (" ".length() << " ".length());
      lIIIlIllllIIl[21] = 94 ^ 75;
      lIIIlIllllIIl[22] = ((187 ^ 188) << "   ".length() ^ 188 ^ 143) << " ".length();
      lIIIlIllllIIl[23] = 42 ^ 61;
      lIIIlIllllIIl[24] = "   ".length() << "   ".length();
      lIIIlIllllIIl[25] = "   ".length() << "   ".length() ^ " ".length();
      lIIIlIllllIIl[26] = (152 ^ 149) << " ".length();
      lIIIlIllllIIl[27] = 153 ^ 130;
      lIIIlIllllIIl[28] = (200 ^ 179 ^ (86 ^ 73) << (" ".length() << " ".length())) << (" ".length() << " ".length());
      lIIIlIllllIIl[29] = 155 ^ 134;
      lIIIlIllllIIl[30] = ((78 ^ 117) << " ".length() ^ 82 ^ 43) << " ".length();
      lIIIlIllllIIl[31] = (16 ^ 23) << " ".length() ^ 4 ^ 21;
      lIIIlIllllIIl[32] = " ".length() << (97 ^ 100);
      lIIIlIllllIIl[33] = 3 + 150 - 30 + 28 ^ (206 ^ 149) << " ".length();
      lIIIlIllllIIl[34] = (77 ^ 116 ^ (101 ^ 96) << "   ".length()) << " ".length();
      lIIIlIllllIIl[35] = (" ".length() << (89 ^ 94)) + ((57 ^ 28) << " ".length()) - -(49 ^ 62) + ((52 ^ 7) << "   ".length()) << "   ".length();
      lIIIlIllllIIl[36] = 190 ^ 157;
      lIIIlIllllIIl[37] = (0 ^ 119 ^ (78 ^ 113) << " ".length()) << (" ".length() << " ".length());
      lIIIlIllllIIl[38] = 166 ^ 131;
      lIIIlIllllIIl[39] = (41 ^ 72 ^ (166 ^ 159) << " ".length()) << " ".length();
      lIIIlIllllIIl[40] = 216 ^ 157 ^ (148 ^ 165) << " ".length();
      lIIIlIllllIIl[41] = ((6 ^ 43) << " ".length() ^ 225 ^ 190) << "   ".length();
      lIIIlIllllIIl[42] = 251 ^ 158 ^ (66 ^ 81) << (" ".length() << " ".length());
      lIIIlIllllIIl[43] = ((100 ^ 67) << " ".length() ^ 241 ^ 170) << " ".length();
      lIIIlIllllIIl[44] = (50 ^ 29) << (" ".length() << " ".length()) ^ 88 + 109 - 99 + 53;
   }
}
