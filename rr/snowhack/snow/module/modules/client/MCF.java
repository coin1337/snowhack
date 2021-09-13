package rr.snowhack.snow.module.modules.client;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import org.lwjgl.input.Mouse;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.commands.FriendCommand;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.util.Friends;

@Module.Info(
   name = "MCF",
   category = Module.Category.CLIENT
)
public class MCF extends Module {
   // $FF: synthetic field
   private static final int[] lIIIIIIlIIIIl;
   // $FF: synthetic field
   private static final String[] lIIIIIIlIIIII;
   // $FF: synthetic field
   private boolean clicked;

   private static boolean lIlIIlllIlIIlI(int var0) {
      return var0 != 0;
   }

   private static void lIlIIlllIIllll() {
      lIIIIIIlIIIII = new String[lIIIIIIlIIIIl[6]];
      lIIIIIIlIIIII[lIIIIIIlIIIIl[1]] = lIlIIlllIIllIl("IQAtNCQ7Bw==", "RnBCI");
      lIIIIIIlIIIII[lIIIIIIlIIIIl[2]] = lIlIIlllIIlllI("M50O2ci6BIWKQ1ZrImQY3H7oIOKEdpnqQmpqE7lij+RD4ekLaAzRzrXElZTIzxnwtcSVlMjPGfCOj0111m4yig==", "sjgOX");
      lIIIIIIlIIIII[lIIIIIIlIIIIl[0]] = lIlIIlllIIlllI("n2RwnAGXsE4=", "jFYbL");
      lIIIIIIlIIIII[lIIIIIIlIIIIl[3]] = lIlIIlllIIllIl("VCZaERIBdBgcFhx0DxcVAD0fFxcXMFQ=", "rTzys");
      lIIIIIIlIIIII[lIIIIIIlIIIIl[4]] = lIlIIlllIIllIl("TDQ=", "jVdnm");
      lIIIIIIlIIIII[lIIIIIIlIIIIl[5]] = lIlIIlllIIllIl("SSNCMAIccQA9BgFxBCoKCj8GPQdB", "oQbXc");
   }

   private static String lIlIIlllIIlllI(String lllllllllllllllIlIIIlllllllIlIII, String lllllllllllllllIlIIIlllllllIlIIl) {
      try {
         float lllllllllllllllIlIIIlllllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlllllllIlIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIIIl[7]), "DES");
         double lllllllllllllllIlIIIlllllllIIlIl = Cipher.getInstance("DES");
         lllllllllllllllIlIIIlllllllIIlIl.init(lIIIIIIlIIIIl[0], lllllllllllllllIlIIIlllllllIIllI);
         return new String(lllllllllllllllIlIIIlllllllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIlllIlIIIl(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIIlllIlIlII(Object var0) {
      return var0 != null;
   }

   private static String lIlIIlllIIllIl(String lllllllllllllllIlIIIlllllllllIlI, String lllllllllllllllIlIIIlllllllllIIl) {
      lllllllllllllllIlIIIlllllllllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlllllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIIllllllllllIl = new StringBuilder();
      float lllllllllllllllIlIIIllllllllIlll = lllllllllllllllIlIIIlllllllllIIl.toCharArray();
      byte lllllllllllllllIlIIIllllllllIllI = lIIIIIIlIIIIl[1];
      int lllllllllllllllIlIIIllllllllIlIl = lllllllllllllllIlIIIlllllllllIlI.toCharArray();
      boolean lllllllllllllllIlIIIllllllllIlII = lllllllllllllllIlIIIllllllllIlIl.length;
      int lllllllllllllllIlIIIllllllllIIll = lIIIIIIlIIIIl[1];

      do {
         if (!lIlIIlllIlIllI(lllllllllllllllIlIIIllllllllIIll, lllllllllllllllIlIIIllllllllIlII)) {
            return String.valueOf(lllllllllllllllIlIIIllllllllllIl);
         }

         char lllllllllllllllIlIIlIIIIIIIIIIII = lllllllllllllllIlIIIllllllllIlIl[lllllllllllllllIlIIIllllllllIIll];
         lllllllllllllllIlIIIllllllllllIl.append((char)(lllllllllllllllIlIIlIIIIIIIIIIII ^ lllllllllllllllIlIIIllllllllIlll[lllllllllllllllIlIIIllllllllIllI % lllllllllllllllIlIIIllllllllIlll.length]));
         "".length();
         ++lllllllllllllllIlIIIllllllllIllI;
         ++lllllllllllllllIlIIIllllllllIIll;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) >= 0);

      return null;
   }

   private static void lIlIIlllIlIIII() {
      lIIIIIIlIIIIl = new int[8];
      lIIIIIIlIIIIl[0] = " ".length() << " ".length();
      lIIIIIIlIIIIl[1] = (230 ^ 199 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & ((22 + 54 - -63 + 14 ^ (98 ^ 115) << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIIIlIIIIl[2] = " ".length();
      lIIIIIIlIIIIl[3] = "   ".length();
      lIIIIIIlIIIIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIIIIlIIIIl[5] = 15 ^ 66 ^ (45 ^ 36) << "   ".length();
      lIIIIIIlIIIIl[6] = "   ".length() << " ".length();
      lIIIIIIlIIIIl[7] = " ".length() << "   ".length();
   }

   static {
      lIlIIlllIlIIII();
      lIlIIlllIIllll();
   }

   private static boolean lIlIIlllIlIlIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIIlllIlIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIlllIlIIll(int var0) {
      return var0 == 0;
   }

   public void onUpdate() {
      Minecraft lllllllllllllllIlIIlIIIIIIIlIllI = Minecraft.func_71410_x();
      if (lIlIIlllIlIIIl(lllllllllllllllIlIIlIIIIIIIlIllI.field_71462_r)) {
         if (lIlIIlllIlIIlI(Mouse.isButtonDown(lIIIIIIlIIIIl[0]))) {
            if (lIlIIlllIlIIll(lllllllllllllllIlIIlIIIIIIIlIlIl.clicked)) {
               RayTraceResult lllllllllllllllIlIIlIIIIIIIllIII = lllllllllllllllIlIIlIIIIIIIlIllI.field_71476_x;
               if (lIlIIlllIlIlII(lllllllllllllllIlIIlIIIIIIIllIII) && lIlIIlllIlIlIl(lllllllllllllllIlIIlIIIIIIIllIII.field_72313_a, Type.ENTITY)) {
                  Entity lllllllllllllllIlIIlIIIIIIIllIIl = lllllllllllllllIlIIlIIIIIIIllIII.field_72308_g;
                  if (lIlIIlllIlIlII(lllllllllllllllIlIIlIIIIIIIllIIl) && lIlIIlllIlIIlI(lllllllllllllllIlIIlIIIIIIIllIIl instanceof EntityPlayer)) {
                     long lllllllllllllllIlIIlIIIIIIIlIIIl = lllllllllllllllIlIIlIIIIIIIllIIl.func_70005_c_();
                     Friends.Friend lllllllllllllllIlIIlIIIIIIIlllII;
                     if (lIlIIlllIlIIlI(Friends.isFriend(lllllllllllllllIlIIlIIIIIIIlIIIl))) {
                        if (lIlIIlllIlIIlI(lllllllllllllllIlIIlIIIIIIIlIIIl.equals(lIIIIIIlIIIII[lIIIIIIlIIIIl[1]]))) {
                           Command.sendChatMessage(lIIIIIIlIIIII[lIIIIIIlIIIIl[2]]);
                           return;
                        }

                        lllllllllllllllIlIIlIIIIIIIlllII = (Friends.Friend)((ArrayList)Friends.friends.getValue()).stream().filter((lllllllllllllllIlIIlIIIIIIIIlIlI) -> {
                           return lllllllllllllllIlIIlIIIIIIIIlIlI.getUsername().equalsIgnoreCase(lllllllllllllllIlIIlIIIIIIIlIIIl);
                        }).findFirst().get();
                        ((ArrayList)Friends.friends.getValue()).remove(lllllllllllllllIlIIlIIIIIIIlllII);
                        "".length();
                        Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIIlIIIII[lIIIIIIlIIIIl[0]]).append(lllllllllllllllIlIIlIIIIIIIlIIIl).append(lIIIIIIlIIIII[lIIIIIIlIIIIl[3]])));
                        "".length();
                        if ((((103 ^ 12) << " ".length() ^ 86 + 62 - 113 + 98) & (8 + 74 - 76 + 195 ^ (56 ^ 117) << " ".length() ^ -" ".length())) < 0) {
                           return;
                        }
                     } else {
                        lllllllllllllllIlIIlIIIIIIIlllII = FriendCommand.getFriendByName(lllllllllllllllIlIIlIIIIIIIlIIIl);
                        ((ArrayList)Friends.friends.getValue()).add(lllllllllllllllIlIIlIIIIIIIlllII);
                        "".length();
                        Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIIlIIIII[lIIIIIIlIIIIl[4]]).append(lllllllllllllllIlIIlIIIIIIIlIIIl).append(lIIIIIIlIIIII[lIIIIIIlIIIIl[5]])));
                     }
                  }
               }
            }

            lllllllllllllllIlIIlIIIIIIIlIlIl.clicked = (boolean)lIIIIIIlIIIIl[2];
            "".length();
            if ("   ".length() != "   ".length()) {
               return;
            }
         } else {
            lllllllllllllllIlIIlIIIIIIIlIlIl.clicked = (boolean)lIIIIIIlIIIIl[1];
         }
      }

   }
}
