package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.scoreboard.ScorePlayerTeam;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.Friends;

@Module.Info(
   name = "ExtraTab",
   description = "Expands the player tab menu",
   category = Module.Category.RENDER
)
public class ExtraTab extends Module {
   // $FF: synthetic field
   private static final int[] lllllIIlIIII;
   // $FF: synthetic field
   public Setting<Integer> tabSize;
   // $FF: synthetic field
   private static final String[] lllllIIIllll;
   // $FF: synthetic field
   public static ExtraTab INSTANCE;

   private static String lIlIIIlIIlIIll(String lllllllllllllllIlIlIIIIlIIIIIIlI, String lllllllllllllllIlIlIIIIIllllllll) {
      try {
         byte lllllllllllllllIlIlIIIIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllllllllllllllIlIlIIIIIllllllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIIIIllllllIl.init(lllllIIlIIII[3], lllllllllllllllIlIlIIIIIlllllllI);
         return new String(lllllllllllllllIlIlIIIIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIIIlIIlIlIl() {
      lllllIIlIIII = new int[4];
      lllllIIlIIII[0] = (78 + 47 - -19 + 89 ^ (87 ^ 54) << " ".length()) & (15 ^ 48 ^ (187 ^ 190) << (" ".length() << " ".length()) ^ -" ".length());
      lllllIIlIIII[1] = " ".length();
      lllllIIlIIII[2] = ((173 ^ 166) << "   ".length() ^ 65 ^ 28) << (" ".length() << (" ".length() << " ".length()));
      lllllIIlIIII[3] = " ".length() << " ".length();
   }

   public ExtraTab() {
      lllllllllllllllIlIlIIIIlIIIlIIIl.tabSize = lllllllllllllllIlIlIIIIlIIIlIIIl.register(Settings.integerBuilder(lllllIIIllll[lllllIIlIIII[0]]).withMinimum(lllllIIlIIII[1]).withValue((Number)lllllIIlIIII[2]).build());
      INSTANCE = lllllllllllllllIlIlIIIIlIIIlIIIl;
   }

   private static boolean lIlIIIlIIlIllI(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIIIlIIlIlll(int var0) {
      return var0 != 0;
   }

   private static void lIlIIIlIIlIlII() {
      lllllIIIllll = new String[lllllIIlIIII[3]];
      lllllIIIllll[lllllIIlIIII[0]] = lIlIIIlIIlIIll("+/BRVeHJXf4=", "uxPVi");
      lllllIIIllll[lllllIIlIIII[1]] = lIlIIIlIIlIIll("c/6OyKFzyIA=", "UkYwc");
   }

   public static String getPlayerName(NetworkPlayerInfo lllllllllllllllIlIlIIIIlIIIIllIl) {
      String var10000;
      if (lIlIIIlIIlIllI(lllllllllllllllIlIlIIIIlIIIIllIl.func_178854_k())) {
         var10000 = lllllllllllllllIlIlIIIIlIIIIllIl.func_178854_k().func_150254_d();
         "".length();
         if (" ".length() << " ".length() >= "   ".length()) {
            return null;
         }
      } else {
         var10000 = ScorePlayerTeam.func_96667_a(lllllllllllllllIlIlIIIIlIIIIllIl.func_178850_i(), lllllllllllllllIlIlIIIIlIIIIllIl.func_178845_a().getName());
      }

      boolean lllllllllllllllIlIlIIIIlIIIIlIlI = var10000;
      if (lIlIIIlIIlIlll(Friends.isFriend(lllllllllllllllIlIlIIIIlIIIIlIlI))) {
         var10000 = lllllIIIllll[lllllIIlIIII[1]];
         Object[] var10001 = new Object[lllllIIlIIII[3]];
         var10001[lllllIIlIIII[0]] = Command.SECTIONSIGN();
         var10001[lllllIIlIIII[1]] = lllllllllllllllIlIlIIIIlIIIIlIlI;
         return String.format(var10000, var10001);
      } else {
         return lllllllllllllllIlIlIIIIlIIIIlIlI;
      }
   }

   static {
      lIlIIIlIIlIlIl();
      lIlIIIlIIlIlII();
   }
}
