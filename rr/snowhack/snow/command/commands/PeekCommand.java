package rr.snowhack.snow.command.commands;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.tileentity.TileEntityShulkerBox;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.syntax.SyntaxChunk;
import rr.snowhack.snow.util.Wrapper;

public class PeekCommand extends Command {
   // $FF: synthetic field
   private static final String[] lIIIlIIllIlll;
   // $FF: synthetic field
   private static final int[] lIIIlIIlllIII;
   // $FF: synthetic field
   public static TileEntityShulkerBox sb;

   static {
      lIllIIIIIIIIlI();
      lIllIIIIIIIIIl();
   }

   public PeekCommand() {
      super(lIIIlIIllIlll[lIIIlIIlllIII[0]], SyntaxChunk.EMPTY);
      lllllllllllllllIIlllIIIlIIllIIll.setDescription(lIIIlIIllIlll[lIIIlIIlllIII[1]]);
   }

   private static void lIllIIIIIIIIlI() {
      lIIIlIIlllIII = new int[5];
      lIIIlIIlllIII[0] = (225 ^ 194) & ~(167 ^ 132);
      lIIIlIIlllIII[1] = " ".length();
      lIIIlIIlllIII[2] = " ".length() << " ".length();
      lIIIlIIlllIII[3] = "   ".length();
      lIIIlIIlllIII[4] = " ".length() << (" ".length() << " ".length());
   }

   private static boolean lIllIIIIIIIIll(int var0) {
      return var0 != 0;
   }

   private static void lIllIIIIIIIIIl() {
      lIIIlIIllIlll = new String[lIIIlIIlllIII[4]];
      lIIIlIIllIlll[lIIIlIIlllIII[0]] = lIlIllllllllll("AQAOHQ==", "qekvd");
      lIIIlIIllIlll[lIIIlIIlllIII[1]] = lIllIIIIIIIIII("t6UthiA7zDz534iDUTSVXbkBADu3s7pwKoyqWkr6DypuWzUfirzXkhmQncrUqAkOyWo5e9pSjLTAHvJcXifL4Q==", "nPxRB");
      lIIIlIIllIlll[lIIIlIIlllIII[2]] = lIlIllllllllll("LTk+OiwqOyUwMxYBMD4=", "oUQYG");
      lIIIlIIllIlll[lIIIlIIlllIII[3]] = lIlIllllllllll("IRUBVBgKHxpTDVgZFQYLARMaE1kZWgccDBQREQZZGhUMWg==", "xztty");
   }

   private static String lIllIIIIIIIIII(String lllllllllllllllIIlllIIIlIIlIIIlI, String lllllllllllllllIIlllIIIlIIIlllll) {
      try {
         SecretKeySpec lllllllllllllllIIlllIIIlIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIIlllIIIlIIIlllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIIIlIIIlllIl.init(lIIIlIIlllIII[2], lllllllllllllllIIlllIIIlIIlIIlIl);
         return new String(lllllllllllllllIIlllIIIlIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIIIIIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIllllllllll(String lllllllllllllllIIlllIIIlIIIIllIl, String lllllllllllllllIIlllIIIlIIIlIIIl) {
      lllllllllllllllIIlllIIIlIIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIIIlIIIlIIII = new StringBuilder();
      char[] lllllllllllllllIIlllIIIlIIIIllll = lllllllllllllllIIlllIIIlIIIlIIIl.toCharArray();
      int lllllllllllllllIIlllIIIlIIIIlllI = lIIIlIIlllIII[0];
      byte lllllllllllllllIIlllIIIlIIIIlIII = lllllllllllllllIIlllIIIlIIIIllIl.toCharArray();
      int lllllllllllllllIIlllIIIlIIIIIlll = lllllllllllllllIIlllIIIlIIIIlIII.length;
      int lllllllllllllllIIlllIIIlIIIIIllI = lIIIlIIlllIII[0];

      do {
         if (!lIllIIIIIIIlII(lllllllllllllllIIlllIIIlIIIIIllI, lllllllllllllllIIlllIIIlIIIIIlll)) {
            return String.valueOf(lllllllllllllllIIlllIIIlIIIlIIII);
         }

         char lllllllllllllllIIlllIIIlIIIlIIll = lllllllllllllllIIlllIIIlIIIIlIII[lllllllllllllllIIlllIIIlIIIIIllI];
         lllllllllllllllIIlllIIIlIIIlIIII.append((char)(lllllllllllllllIIlllIIIlIIIlIIll ^ lllllllllllllllIIlllIIIlIIIIllll[lllllllllllllllIIlllIIIlIIIIlllI % lllllllllllllllIIlllIIIlIIIIllll.length]));
         "".length();
         ++lllllllllllllllIIlllIIIlIIIIlllI;
         ++lllllllllllllllIIlllIIIlIIIIIllI;
         "".length();
      } while(null == null);

      return null;
   }

   public void call(String[] lllllllllllllllIIlllIIIlIIlIllIl) {
      Exception lllllllllllllllIIlllIIIlIIlIlIll = Wrapper.getPlayer().field_71071_by.func_70448_g();
      if (lIllIIIIIIIIll(lllllllllllllllIIlllIIIlIIlIlIll.func_77973_b() instanceof ItemShulkerBox)) {
         TileEntityShulkerBox lllllllllllllllIIlllIIIlIIlIllll = new TileEntityShulkerBox();
         lllllllllllllllIIlllIIIlIIlIllll.field_145854_h = ((ItemShulkerBox)lllllllllllllllIIlllIIIlIIlIlIll.func_77973_b()).func_179223_d();
         lllllllllllllllIIlllIIIlIIlIllll.func_145834_a(Wrapper.getWorld());
         lllllllllllllllIIlllIIIlIIlIllll.func_145839_a(lllllllllllllllIIlllIIIlIIlIlIll.func_77978_p().func_74775_l(lIIIlIIllIlll[lIIIlIIlllIII[2]]));
         sb = lllllllllllllllIIlllIIIlIIlIllll;
         "".length();
         if (-" ".length() == " ".length()) {
            return;
         }
      } else {
         Command.sendChatMessage(lIIIlIIllIlll[lIIIlIIlllIII[3]]);
      }

   }
}
