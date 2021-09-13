package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.ChunkBuilder;

public class TpCommand extends Command {
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private static final String[] llllIIIIIIII;
   // $FF: synthetic field
   private static final int[] llllIIIIIIIl;

   private static void lIIlllIlllIlIl() {
      llllIIIIIIIl = new int[4];
      llllIIIIIIIl[0] = (99 ^ 112 ^ (20 ^ 19) << (" ".length() << (" ".length() << " ".length()))) & ("   ".length() << (17 ^ 20) ^ "   ".length() ^ -" ".length());
      llllIIIIIIIl[1] = " ".length();
      llllIIIIIIIl[2] = " ".length() << " ".length();
      llllIIIIIIIl[3] = "   ".length();
   }

   public void call(String[] lllllllllllllllIlIllIIIIIIllIIll) {
      if (lIIlllIlllIllI(lllllllllllllllIlIllIIIIIIllIIll.length, llllIIIIIIIl[1])) {
         Command.sendChatMessage(llllIIIIIIII[llllIIIIIIIl[2]]);
      } else {
         switch(lllllllllllllllIlIllIIIIIIllIIll.length) {
         case 2:
            mc.field_71439_g.func_70107_b((double)mc.field_71439_g.func_180425_c().func_177958_n(), (double)Integer.parseInt(lllllllllllllllIlIllIIIIIIllIIll[llllIIIIIIIl[0]]), (double)mc.field_71439_g.func_180425_c().func_177952_p());
            break;
         case 3:
            mc.field_71439_g.func_70107_b((double)Integer.parseInt(lllllllllllllllIlIllIIIIIIllIIll[llllIIIIIIIl[0]]), (double)mc.field_71439_g.func_180425_c().func_177956_o(), (double)Integer.parseInt(lllllllllllllllIlIllIIIIIIllIIll[llllIIIIIIIl[1]]));
            "".length();
            if (null != null) {
               return;
            }
            break;
         case 4:
            mc.field_71439_g.func_70107_b((double)Integer.parseInt(lllllllllllllllIlIllIIIIIIllIIll[llllIIIIIIIl[0]]), (double)Integer.parseInt(lllllllllllllllIlIllIIIIIIllIIll[llllIIIIIIIl[1]]), (double)Integer.parseInt(lllllllllllllllIlIllIIIIIIllIIll[llllIIIIIIIl[2]]));
            "".length();
            if (null != null) {
               return;
            }
         }

      }
   }

   private static boolean lIIlllIlllIllI(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIIlllIlllIIll(String lllllllllllllllIlIllIIIIIIlIlIII, String lllllllllllllllIlIllIIIIIIlIIlll) {
      try {
         SecretKeySpec lllllllllllllllIlIllIIIIIIlIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllIIIIIIlIllII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIIIIIIlIllII.init(llllIIIIIIIl[2], lllllllllllllllIlIllIIIIIIlIllIl);
         return new String(lllllllllllllllIlIllIIIIIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIIlllIlllIlII() {
      llllIIIIIIII = new String[llllIIIIIIIl[3]];
      llllIIIIIIII[llllIIIIIIIl[0]] = lIIlllIlllIIll("YZcpbfuyrhA=", "qknAW");
      llllIIIIIIII[llllIIIIIIIl[1]] = lIIlllIlllIIll("LYn+ryKhClnApb9Fmx794g==", "gBtNt");
      llllIIIIIIII[llllIIIIIIIl[2]] = lIIlllIlllIIll("4CJienUe/obPVisdMOc6Iad+mXQMlmnZgEEgE9ocCEzS85Iy76ukQw==", "nbqJx");
   }

   public TpCommand() {
      super(llllIIIIIIII[llllIIIIIIIl[0]], (new ChunkBuilder()).build());
      lllllllllllllllIlIllIIIIIIllIllI.setDescription(llllIIIIIIII[llllIIIIIIIl[1]]);
   }

   static {
      lIIlllIlllIlIl();
      lIIlllIlllIlII();
      mc = Minecraft.func_71410_x();
   }
}
