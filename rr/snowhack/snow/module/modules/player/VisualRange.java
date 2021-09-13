package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;

@Module.Info(
   name = "VisualRange",
   category = Module.Category.PLAYER
)
public class VisualRange extends Module {
   // $FF: synthetic field
   public ArrayList<String> removal = new ArrayList();
   // $FF: synthetic field
   public ArrayList<String> names = new ArrayList();
   // $FF: synthetic field
   private static final int[] lIIIIIllIIIll;
   // $FF: synthetic field
   public ArrayList<String> names2 = new ArrayList();
   // $FF: synthetic field
   private static final String[] lIIIIIllIIIlI;

   private static boolean lIlIlIIllIIlll(int var0) {
      return var0 == 0;
   }

   private void testName(Entity lllllllllllllllIlIIIIlIlllIlllIl) {
      lllllllllllllllIlIIIIlIlllIlllII.names2.add(lllllllllllllllIlIIIIlIlllIlllIl.func_70005_c_());
      "".length();
      if (lIlIlIIllIIlll(lllllllllllllllIlIIIIlIlllIlllII.names.contains(lllllllllllllllIlIIIIlIlllIlllIl.func_70005_c_()))) {
         lllllllllllllllIlIIIIlIlllIlllII.sendMessage(lllllllllllllllIlIIIIlIlllIlllIl);
         lllllllllllllllIlIIIIlIlllIlllII.names.add(lllllllllllllllIlIIIIlIlllIlllIl.func_70005_c_());
         "".length();
      }

   }

   private void sendMessage(Entity lllllllllllllllIlIIIIlIlllIlIlII) {
      if (lIlIlIIllIlIII(Friends.isFriend(lllllllllllllllIlIIIIlIlllIlIlII.func_70005_c_()))) {
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIllIIIlI[lIIIIIllIIIll[0]]).append(lllllllllllllllIlIIIIlIlllIlIlII.func_70005_c_()).append(lIIIIIllIIIlI[lIIIIIllIIIll[1]])));
         "".length();
         if (null != null) {
            return;
         }
      } else {
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIIlIlllIlIlII.func_70005_c_()).append(lIIIIIllIIIlI[lIIIIIllIIIll[2]])));
      }

   }

   static {
      lIlIlIIllIIllI();
      lIlIlIIllIIlIl();
   }

   private void testLeave() {
      lllllllllllllllIlIIIIlIlllIllIII.names.forEach((lllllllllllllllIlIIIIlIlllIIlIII) -> {
         if (lIlIlIIllIIlll(lllllllllllllllIlIIIIlIlllIIlIll.names2.contains(lllllllllllllllIlIIIIlIlllIIlIII))) {
            lllllllllllllllIlIIIIlIlllIIlIll.removal.add(lllllllllllllllIlIIIIlIlllIIlIII);
            "".length();
         }

      });
      lllllllllllllllIlIIIIlIlllIllIII.removal.forEach((lllllllllllllllIlIIIIlIlllIIlllI) -> {
         lllllllllllllllIlIIIIlIlllIIllll.names.remove(lllllllllllllllIlIIIIlIlllIIlllI);
         "".length();
      });
      lllllllllllllllIlIIIIlIlllIllIII.removal.clear();
   }

   private static boolean lIlIlIIllIlIII(int var0) {
      return var0 != 0;
   }

   public void onWorldRender(RenderEvent lllllllllllllllIlIIIIlIllllIIIlI) {
      lllllllllllllllIlIIIIlIllllIIIIl.names2.clear();
      Minecraft.func_71410_x().field_71441_e.field_72996_f.stream().filter(EntityUtil::isLiving).filter((lllllllllllllllIlIIIIlIlllIIIIII) -> {
         int var10000;
         if (lIlIlIIllIIlll(EntityUtil.isFakeLocalPlayer(lllllllllllllllIlIIIIlIlllIIIIII))) {
            var10000 = lIIIIIllIIIll[1];
            "".length();
            if ((" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length())) < -" ".length()) {
               return (boolean)(((92 ^ 75) << (" ".length() << " ".length()) ^ 209 ^ 128) & (155 + 122 - 151 + 77 ^ (42 ^ 73) << " ".length() ^ -" ".length()));
            }
         } else {
            var10000 = lIIIIIllIIIll[0];
         }

         return (boolean)var10000;
      }).filter((lllllllllllllllIlIIIIlIlllIIIIlI) -> {
         return lllllllllllllllIlIIIIlIlllIIIIlI instanceof EntityPlayer;
      }).filter((lllllllllllllllIlIIIIlIlllIIIllI) -> {
         int var10000;
         if (lIlIlIIllIIlll(lllllllllllllllIlIIIIlIlllIIIllI instanceof EntityPlayerSP)) {
            var10000 = lIIIIIllIIIll[1];
            "".length();
            if (((95 + 52 - 72 + 100 ^ (201 ^ 152) << " ".length()) & ((170 ^ 175) << (" ".length() << (" ".length() << " ".length())) ^ 51 ^ 110 ^ -" ".length())) < 0) {
               return (boolean)(((182 ^ 129) << (" ".length() << " ".length()) ^ 54 + 68 - 114 + 187) & (108 + 41 - 84 + 74 ^ (130 ^ 167) << (" ".length() << " ".length()) ^ -" ".length()));
            }
         } else {
            var10000 = lIIIIIllIIIll[0];
         }

         return (boolean)var10000;
      }).forEach(lllllllllllllllIlIIIIlIllllIIIIl::testName);
      lllllllllllllllIlIIIIlIllllIIIIl.testLeave();
   }

   private static String lIlIlIIllIIlII(String lllllllllllllllIlIIIIlIlIlllllll, String lllllllllllllllIlIIIIlIlIllllIll) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIlIllIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIlIllllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double lllllllllllllllIlIIIIlIlIllllIIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIlIlIllllIIl.init(lIIIIIllIIIll[2], lllllllllllllllIlIIIIlIllIIIIlIl);
         return new String(lllllllllllllllIlIIIIlIlIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIlIlIIllIIIlI(String lllllllllllllllIlIIIIlIllIlIllll, String lllllllllllllllIlIIIIlIllIllIIll) {
      lllllllllllllllIlIIIIlIllIlIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIIIIlIllIlIllIl = new StringBuilder();
      char[] lllllllllllllllIlIIIIlIllIllIIIl = lllllllllllllllIlIIIIlIllIllIIll.toCharArray();
      int lllllllllllllllIlIIIIlIllIllIIII = lIIIIIllIIIll[0];
      double lllllllllllllllIlIIIIlIllIlIlIlI = lllllllllllllllIlIIIIlIllIlIllll.toCharArray();
      char lllllllllllllllIlIIIIlIllIlIlIIl = lllllllllllllllIlIIIIlIllIlIlIlI.length;
      int lllllllllllllllIlIIIIlIllIlIlIII = lIIIIIllIIIll[0];

      do {
         if (!lIlIlIIllIlIIl(lllllllllllllllIlIIIIlIllIlIlIII, lllllllllllllllIlIIIIlIllIlIlIIl)) {
            return String.valueOf(lllllllllllllllIlIIIIlIllIlIllIl);
         }

         char lllllllllllllllIlIIIIlIllIllIlIl = lllllllllllllllIlIIIIlIllIlIlIlI[lllllllllllllllIlIIIIlIllIlIlIII];
         lllllllllllllllIlIIIIlIllIlIllIl.append((char)(lllllllllllllllIlIIIIlIllIllIlIl ^ lllllllllllllllIlIIIIlIllIllIIIl[lllllllllllllllIlIIIIlIllIllIIII % lllllllllllllllIlIIIIlIllIllIIIl.length]));
         "".length();
         ++lllllllllllllllIlIIIIlIllIllIIII;
         ++lllllllllllllllIlIIIIlIllIlIlIII;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) >= 0);

      return null;
   }

   private static void lIlIlIIllIIlIl() {
      lIIIIIllIIIlI = new String[lIIIIIllIIIll[3]];
      lIIIIIllIIIlI[lIIIIIllIIIll[0]] = lIlIlIIllIIIlI("w4ob", "myGYA");
      lIIIIIllIIIlI[lIIIIIllIIIll[1]] = lIlIlIIllIIIll("UqyREn63col6SR5m1fo33aYOXeG/TiCneuTf2ZQeXbo=", "UTjND");
      lIIIIIllIIIlI[lIIIIIllIIIll[2]] = lIlIlIIllIIlII("Cahz+eRVfNAuqH70JKRjL9qlPDOrQ8Bp", "PhTRN");
   }

   private static String lIlIlIIllIIIll(String lllllllllllllllIlIIIIlIllIIllIll, String lllllllllllllllIlIIIIlIllIIllIIl) {
      try {
         short lllllllllllllllIlIIIIlIllIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIllIIllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIllIIIll[4]), "DES");
         Cipher lllllllllllllllIlIIIIlIllIIllllI = Cipher.getInstance("DES");
         lllllllllllllllIlIIIIlIllIIllllI.init(lIIIIIllIIIll[2], lllllllllllllllIlIIIIlIllIIlIlII);
         return new String(lllllllllllllllIlIIIIlIllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIIllIIllI() {
      lIIIIIllIIIll = new int[5];
      lIIIIIllIIIll[0] = (40 ^ 127 ^ (152 ^ 187) << " ".length()) & (20 + 18 - 31 + 126 ^ (4 ^ 33) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIIllIIIll[1] = " ".length();
      lIIIIIllIIIll[2] = " ".length() << " ".length();
      lIIIIIllIIIll[3] = "   ".length();
      lIIIIIllIIIll[4] = " ".length() << "   ".length();
   }

   private static boolean lIlIlIIllIlIIl(int var0, int var1) {
      return var0 < var1;
   }
}
