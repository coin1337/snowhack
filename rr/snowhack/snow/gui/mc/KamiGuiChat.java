package rr.snowhack.snow.gui.mc;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.gui.GuiChat;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.Command;

public class KamiGuiChat extends GuiChat {
   // $FF: synthetic field
   private String currentFillinLine;
   // $FF: synthetic field
   private static final String[] lllIlIIllIll;
   // $FF: synthetic field
   private int cursor;
   // $FF: synthetic field
   private static final int[] lllIlIIlllII;
   // $FF: synthetic field
   private String startString;

   public KamiGuiChat(String lllllllllllllllIllIIIIIlIlIIlllI, String lllllllllllllllIllIIIIIlIlIlIIIl, int lllllllllllllllIllIIIIIlIlIIllII) {
      super(lllllllllllllllIllIIIIIlIlIIlllI);
      lllllllllllllllIllIIIIIlIlIIllll.startString = lllllllllllllllIllIIIIIlIlIIlllI;
      if (lIIllIIIllIIll(lllllllllllllllIllIIIIIlIlIIlllI.equals(Command.getCommandPrefix()))) {
         lllllllllllllllIllIIIIIlIlIIllll.calculateCommand(lllllllllllllllIllIIIIIlIlIIlllI.substring(Command.getCommandPrefix().length()));
      }

      lllllllllllllllIllIIIIIlIlIIllll.field_146410_g = lllllllllllllllIllIIIIIlIlIlIIIl;
      lllllllllllllllIllIIIIIlIlIIllll.cursor = lllllllllllllllIllIIIIIlIlIIllII;
   }

   private static void lIIllIIIllIIlI() {
      lllIlIIlllII = new int[20];
      lllIlIIlllII[0] = " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
      lllIlIIlllII[1] = " ".length();
      lllIlIIlllII[2] = " ".length() << " ".length();
      lllIlIIlllII[3] = "   ".length();
      lllIlIIlllII[4] = " ".length() << (" ".length() << " ".length());
      lllIlIIlllII[5] = 119 ^ 114;
      lllIlIIlllII[6] = "   ".length() << " ".length();
      lllIlIIlllII[7] = 166 ^ 161;
      lllIlIIlllII[8] = " ".length() << "   ".length();
      lllIlIIlllII[9] = " ".length() << ("   ".length() << " ".length()) ^ 237 ^ 164;
      lllIlIIlllII[10] = (152 + 179 - 283 + 141 ^ (156 ^ 139) << "   ".length()) << " ".length();
      lllIlIIlllII[11] = 162 ^ 169;
      lllIlIIlllII[12] = "   ".length() << (" ".length() << " ".length());
      lllIlIIlllII[13] = 187 ^ 182;
      lllIlIIlllII[14] = (141 ^ 138) << " ".length();
      lllIlIIlllII[15] = 126 + 151 - 191 + 101 ^ (41 ^ 4) << (" ".length() << " ".length());
      lllIlIIlllII[16] = 2812351 + 2406547 - 2020625 + 73442 + 811619 + 868491 - 1345318 + 604381 - (411140 + 430759 - '雋' + 372245) + (9752 + 6269 - 10984 + 4966 << (123 ^ 126)) << " ".length();
      lllIlIIlllII[17] = (181 + 132 - 283 + 215 << (" ".length() << " ".length())) + (131 + 97 - -68 + 15 << (" ".length() << " ".length())) - (210 + 345 - 523 + 399 << (" ".length() << " ".length())) + 916 + 864 - 1037 + 278 << " ".length();
      lllIlIIlllII[18] = 2443 + 1305 - 2651 + 2456;
      lllIlIIlllII[19] = " ".length() << (" ".length() << (" ".length() << " ".length()));
   }

   protected void func_73869_a(char lllllllllllllllIllIIIIIlIlIIIlII, int lllllllllllllllIllIIIIIlIIllllll) throws IOException {
      lllllllllllllllIllIIIIIlIlIIIIIl.field_146416_h = lllllllllllllllIllIIIIIlIlIIIIIl.cursor;
      super.func_73869_a(lllllllllllllllIllIIIIIlIlIIIlII, lllllllllllllllIllIIIIIlIIllllll);
      lllllllllllllllIllIIIIIlIlIIIIIl.cursor = lllllllllllllllIllIIIIIlIlIIIIIl.field_146416_h;
      byte lllllllllllllllIllIIIIIlIIlllllI = lllllllllllllllIllIIIIIlIlIIIIIl.field_146415_a.func_146179_b();
      if (lIIllIIIllIIll(lllllllllllllllIllIIIIIlIIlllllI.startsWith(Command.getCommandPrefix()))) {
         GuiChat lllllllllllllllIllIIIIIlIlIIIllI = new GuiChat(lllllllllllllllIllIIIIIlIIlllllI) {
            // $FF: synthetic field
            int cursor;

            {
               lllllllllllllllIlIlIlllllIIlIlll.cursor = lllllllllllllllIllIIIIIlIlIIIIIl.cursor;
            }

            protected void func_73869_a(char lllllllllllllllIlIlIlllllIIIllIl, int lllllllllllllllIlIlIlllllIIIllll) throws IOException {
               lllllllllllllllIlIlIlllllIIlIIIl.field_146416_h = lllllllllllllllIlIlIlllllIIlIIIl.cursor;
               super.func_73869_a(lllllllllllllllIlIlIlllllIIIllIl, lllllllllllllllIlIlIlllllIIIllll);
               lllllllllllllllIlIlIlllllIIlIIIl.cursor = lllllllllllllllIlIlIlllllIIlIIIl.field_146416_h;
            }
         };
         lllllllllllllllIllIIIIIlIlIIIllI.field_146410_g = lllllllllllllllIllIIIIIlIlIIIIIl.field_146410_g;
         lllllllllllllllIllIIIIIlIlIIIIIl.field_146297_k.func_147108_a(lllllllllllllllIllIIIIIlIlIIIllI);
      } else if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIlllllI.equals(Command.getCommandPrefix()))) {
         lllllllllllllllIllIIIIIlIlIIIIIl.currentFillinLine = lllIlIIllIll[lllIlIIlllII[0]];
      } else {
         lllllllllllllllIllIIIIIlIlIIIIIl.calculateCommand(lllllllllllllllIllIIIIIlIIlllllI.substring(Command.getCommandPrefix().length()));
      }
   }

   static {
      lIIllIIIllIIlI();
      lIIllIIIllIIIl();
   }

   private static boolean lIIllIIIllIlII(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIIIlllIII(Object var0, Object var1) {
      return var0 != var1;
   }

   private static boolean lIIllIIIllIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIllIIIlIllll(String lllllllllllllllIllIIIIIIllIlllIl, String lllllllllllllllIllIIIIIIllIlllII) {
      try {
         long lllllllllllllllIllIIIIIIllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         char lllllllllllllllIllIIIIIIllIllIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIllIIIIIIllIllIlI.init(lllIlIIlllII[2], lllllllllllllllIllIIIIIIllIllIll);
         return new String(lllllllllllllllIllIIIIIIllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllIIIlIlllI(String lllllllllllllllIllIIIIIIllIlIIlI, String lllllllllllllllIllIIIIIIllIIllll) {
      try {
         Exception lllllllllllllllIllIIIIIIllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIIllIIllll.getBytes(StandardCharsets.UTF_8)), lllIlIIlllII[8]), "DES");
         byte lllllllllllllllIllIIIIIIllIIllIl = Cipher.getInstance("DES");
         lllllllllllllllIllIIIIIIllIIllIl.init(lllIlIIlllII[2], lllllllllllllllIllIIIIIIllIIlllI);
         return new String(lllllllllllllllIllIIIIIIllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIIIllIlIl(Object var0) {
      return var0 != null;
   }

   private static boolean lIIllIIIlllIIl(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIIllIIIllIIIl() {
      lllIlIIllIll = new String[lllIlIIlllII[19]];
      lllIlIIllIll[lllIlIIlllII[0]] = lIIllIIIlIlllI("1+DGAIrnqCc=", "NwQNc");
      lllIlIIllIll[lllIlIIlllII[1]] = lIIllIIIlIlllI("IabygdaIU0iOQ4IISgo6W4zW/R/8Jt59usqsNVUwsTc=", "oloUG");
      lllIlIIllIll[lllIlIIlllII[2]] = lIIllIIIlIlllI("dGw980CSNPM=", "FDmor");
      lllIlIIllIll[lllIlIIlllII[3]] = lIIllIIIlIllll("PJ8zLORxlp8=", "XjbVQ");
      lllIlIIllIll[lllIlIIlllII[4]] = lIIllIIIllIIII("eA==", "XCpym");
      lllIlIIllIll[lllIlIIlllII[5]] = lIIllIIIlIllll("7iI7BQK/zZA=", "XdNZs");
      lllIlIIllIll[lllIlIIlllII[6]] = lIIllIIIllIIII("", "lcvOf");
      lllIlIIllIll[lllIlIIlllII[7]] = lIIllIIIllIIII("XQ==", "aWwFI");
      lllIlIIllIll[lllIlIIlllII[8]] = lIIllIIIlIlllI("Wva0SmxBWVU=", "qvXuo");
      lllIlIIllIll[lllIlIIlllII[9]] = lIIllIIIlIllll("kVxjAFJa/YU=", "psMnt");
      lllIlIIllIll[lllIlIIlllII[10]] = lIIllIIIlIlllI("WzMrM8z4UY0=", "ztyCD");
      lllIlIIllIll[lllIlIIlllII[11]] = lIIllIIIlIlllI("04/LHF42H/g=", "FzHbQ");
      lllIlIIllIll[lllIlIIlllII[12]] = lIIllIIIlIlllI("DVP1/RZ/BZc=", "pzYGy");
      lllIlIIllIll[lllIlIIlllII[13]] = lIIllIIIlIlllI("wDmOWwy7op0=", "dVdss");
      lllIlIIllIll[lllIlIIlllII[14]] = lIIllIIIlIllll("2jJS0xHxQC8=", "SeSOW");
      lllIlIIllIll[lllIlIIlllII[15]] = lIIllIIIlIlllI("x7EpqWICdqY=", "pHffY");
   }

   private static boolean lIIllIIIllIlll(int var0, int var1) {
      return var0 == var1;
   }

   public void func_73863_a(int lllllllllllllllIllIIIIIlIIIIlIII, int lllllllllllllllIllIIIIIlIIIIIlll, float lllllllllllllllIllIIIIIlIIIIllll) {
      func_73734_a(lllIlIIlllII[2], lllllllllllllllIllIIIIIlIIIlIIlI.field_146295_m - lllIlIIlllII[14], lllllllllllllllIllIIIIIlIIIlIIlI.field_146294_l - lllIlIIlllII[2], lllllllllllllllIllIIIIIlIIIlIIlI.field_146295_m - lllIlIIlllII[2], Integer.MIN_VALUE);
      int lllllllllllllllIllIIIIIlIIIIlllI = lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146211_a.func_78256_a(String.valueOf((new StringBuilder()).append(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146179_b()).append(lllIlIIllIll[lllIlIIlllII[15]]))) + lllIlIIlllII[4];
      int var10000;
      if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146181_i())) {
         var10000 = lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g + (lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146219_i - lllIlIIlllII[8]) / lllIlIIlllII[2];
         "".length();
         if (" ".length() << " ".length() < 0) {
            return;
         }
      } else {
         var10000 = lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g;
      }

      float lllllllllllllllIllIIIIIlIIIIIlIl = var10000;
      lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146211_a.func_175063_a(lllllllllllllllIllIIIIIlIIIlIIlI.currentFillinLine, (float)lllllllllllllllIllIIIIIlIIIIlllI, (float)lllllllllllllllIllIIIIIlIIIIIlIl, lllIlIIlllII[16]);
      "".length();
      lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146194_f();
      short lllllllllllllllIllIIIIIlIIIIIlII = lllllllllllllllIllIIIIIlIIIlIIlI.field_146297_k.field_71456_v.func_146158_b().func_146236_a(Mouse.getX(), Mouse.getY());
      if (lIIllIIIllIlIl(lllllllllllllllIllIIIIIlIIIIIlII) && lIIllIIIllIlIl(lllllllllllllllIllIIIIIlIIIIIlII.func_150256_b().func_150210_i())) {
         lllllllllllllllIllIIIIIlIIIlIIlI.func_175272_a(lllllllllllllllIllIIIIIlIIIIIlII, lllllllllllllllIllIIIIIlIIIIlIII, lllllllllllllllIllIIIIIlIIIIIlll);
      }

      boolean lllllllllllllllIllIIIIIlIIIIIIll = GL11.glIsEnabled(lllIlIIlllII[17]);
      boolean lllllllllllllllIllIIIIIlIIIIIIlI = GL11.glIsEnabled(lllIlIIlllII[18]);
      GL11.glDisable(lllIlIIlllII[17]);
      GL11.glDisable(lllIlIIlllII[18]);
      GL11.glColor3f(0.25F, 0.5F, 0.75F);
      GL11.glBegin(lllIlIIlllII[1]);
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146200_o() - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146200_o() - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146200_o() - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146219_i - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.func_146200_o() - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146219_i - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146219_i - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g + lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146219_i - lllIlIIlllII[2]));
      GL11.glVertex2f((float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146209_f - lllIlIIlllII[2]), (float)(lllllllllllllllIllIIIIIlIIIlIIlI.field_146415_a.field_146210_g - lllIlIIlllII[2]));
      GL11.glEnd();
      if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIIIIIll)) {
         GL11.glEnable(lllIlIIlllII[17]);
      }

      if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIIIIIlI)) {
         GL11.glEnable(lllIlIIlllII[18]);
      }

   }

   protected void calculateCommand(String lllllllllllllllIllIIIIIlIIlIIlII) {
      boolean lllllllllllllllIllIIIIIlIIlIIIll = lllllllllllllllIllIIIIIlIIlIIlII.split(lllIlIIllIll[lllIlIIlllII[1]]);
      HashMap<String, Command> lllllllllllllllIllIIIIIlIIlIIIlI = new HashMap();
      if (!lIIllIIIllIIll(lllllllllllllllIllIIIIIlIIlIIIll.length)) {
         Iterator lllllllllllllllIllIIIIIlIIlIIIIl = SnowMod.getInstance().getCommandManager().getCommands().iterator();

         do {
            Command lllllllllllllllIllIIIIIlIIlIIIII;
            if (!lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIlIIIIl.hasNext())) {
               if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIlIIIlI.isEmpty())) {
                  lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine = lllIlIIllIll[lllIlIIlllII[3]];
                  return;
               }

               TreeMap<String, Command> lllllllllllllllIllIIIIIlIIlIlIIl = new TreeMap(lllllllllllllllIllIIIIIlIIlIIIlI);
               lllllllllllllllIllIIIIIlIIlIIIII = (Command)lllllllllllllllIllIIIIIlIIlIlIIl.firstEntry().getValue();
               lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine = lllllllllllllllIllIIIIIlIIlIIIII.getLabel().substring(lllllllllllllllIllIIIIIlIIlIIIll[lllIlIIlllII[0]].length());
               if (lIIllIIIllIlIl(lllllllllllllllIllIIIIIlIIlIIIII.getSyntaxChunks()) && !lIIllIIIllIIll(lllllllllllllllIllIIIIIlIIlIIIII.getSyntaxChunks().length)) {
                  if (lIIllIIIllIIll(lllllllllllllllIllIIIIIlIIlIIlII.endsWith(lllIlIIllIll[lllIlIIlllII[4]]))) {
                     lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine = String.valueOf((new StringBuilder()).append(lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine).append(lllIlIIllIll[lllIlIIlllII[5]]));
                  }

                  String lllllllllllllllIllIIIIIlIIIlllll = lllllllllllllllIllIIIIIlIIlIIIII.getSyntaxChunks();
                  char lllllllllllllllIllIIIIIlIIIllllI = lllIlIIlllII[0];
                  int lllllllllllllllIllIIIIIlIIlIlllI = lllIlIIlllII[0];

                  do {
                     if (!lIIllIIIllIllI(lllllllllllllllIllIIIIIlIIlIlllI, lllllllllllllllIllIIIIIlIIIlllll.length)) {
                        if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIIllllI)) {
                           lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine = lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine.substring(lllIlIIlllII[1]);
                        }

                        return;
                     }

                     if (lIIllIIIllIllI(lllllllllllllllIllIIIIIlIIlIlllI + lllIlIIlllII[1], lllllllllllllllIllIIIIIlIIlIIIll.length - lllIlIIlllII[1])) {
                        "".length();
                        if (" ".length() < 0) {
                           return;
                        }
                     } else {
                        boolean lllllllllllllllIllIIIIIlIIIlllII = lllllllllllllllIllIIIIIlIIIlllll[lllllllllllllllIllIIIIIlIIlIlllI];
                        String var10004;
                        if (lIIllIIIllIlll(lllllllllllllllIllIIIIIlIIlIlllI + lllIlIIlllII[1], lllllllllllllllIllIIIIIlIIlIIIll.length - lllIlIIlllII[1])) {
                           var10004 = lllllllllllllllIllIIIIIlIIlIIIll[lllllllllllllllIllIIIIIlIIlIlllI + lllIlIIlllII[1]];
                           "".length();
                           if (null != null) {
                              return;
                           }
                        } else {
                           var10004 = null;
                        }

                        byte lllllllllllllllIllIIIIIlIIIllIll = lllllllllllllllIllIIIIIlIIIlllII.getChunk(lllllllllllllllIllIIIIIlIIIlllll, lllllllllllllllIllIIIIIlIIIlllII, lllllllllllllllIllIIIIIlIIlIIIll, var10004);
                        if (lIIllIIIlllIII(lllllllllllllllIllIIIIIlIIIllIll, lllIlIIllIll[lllIlIIlllII[6]]) && (!lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIIllIll.startsWith(lllIlIIllIll[lllIlIIlllII[7]])) || lIIllIIIllIIll(lllllllllllllllIllIIIIIlIIIllIll.endsWith(lllIlIIllIll[lllIlIIlllII[8]]))) && (!lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIIllIll.startsWith(lllIlIIllIll[lllIlIIlllII[9]])) || lIIllIIIllIIll(lllllllllllllllIllIIIIIlIIIllIll.endsWith(lllIlIIllIll[lllIlIIlllII[10]])))) {
                           lllllllllllllllIllIIIIIlIIIllllI = lllIlIIlllII[1];
                        }

                        StringBuilder var10001 = (new StringBuilder()).append(lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine).append(lllllllllllllllIllIIIIIlIIIllIll);
                        String var10002;
                        if (lIIllIIIlllIIl(lllllllllllllllIllIIIIIlIIIllIll, lllIlIIllIll[lllIlIIlllII[11]])) {
                           var10002 = lllIlIIllIll[lllIlIIlllII[12]];
                           "".length();
                           if (" ".length() <= 0) {
                              return;
                           }
                        } else {
                           var10002 = lllIlIIllIll[lllIlIIlllII[13]];
                        }

                        lllllllllllllllIllIIIIIlIIlIllIl.currentFillinLine = String.valueOf(var10001.append(var10002).append(lllIlIIllIll[lllIlIIlllII[14]]));
                     }

                     ++lllllllllllllllIllIIIIIlIIlIlllI;
                     "".length();
                  } while(" ".length() << (" ".length() << " ".length()) >= " ".length() << (" ".length() << " ".length()));

                  return;
               }

               return;
            }

            lllllllllllllllIllIIIIIlIIlIIIII = (Command)lllllllllllllllIllIIIIIlIIlIIIIl.next();
            if (lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIlIIIII.getLabel().startsWith(lllllllllllllllIllIIIIIlIIlIIIll[lllIlIIlllII[0]])) && !lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIlIIlII.endsWith(lllIlIIllIll[lllIlIIlllII[2]])) || lIIllIIIllIlII(lllllllllllllllIllIIIIIlIIlIIIII.getLabel().equals(lllllllllllllllIllIIIIIlIIlIIIll[lllIlIIlllII[0]]))) {
               lllllllllllllllIllIIIIIlIIlIIIlI.put(lllllllllllllllIllIIIIIlIIlIIIII.getLabel(), lllllllllllllllIllIIIIIlIIlIIIII);
               "".length();
            }

            "".length();
         } while(" ".length() <= " ".length());

      }
   }

   private static String lIIllIIIllIIII(String lllllllllllllllIllIIIIIIlllIllll, String lllllllllllllllIllIIIIIIllllIIll) {
      lllllllllllllllIllIIIIIIlllIllll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIIlllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIllIIIIIIllllIIlI = new StringBuilder();
      byte lllllllllllllllIllIIIIIIlllIllII = lllllllllllllllIllIIIIIIllllIIll.toCharArray();
      char lllllllllllllllIllIIIIIIlllIlIll = lllIlIIlllII[0];
      boolean lllllllllllllllIllIIIIIIlllIlIlI = lllllllllllllllIllIIIIIIlllIllll.toCharArray();
      int lllllllllllllllIllIIIIIIlllIlIIl = lllllllllllllllIllIIIIIIlllIlIlI.length;
      int lllllllllllllllIllIIIIIIlllIlIII = lllIlIIlllII[0];

      do {
         if (!lIIllIIIllIllI(lllllllllllllllIllIIIIIIlllIlIII, lllllllllllllllIllIIIIIIlllIlIIl)) {
            return String.valueOf(lllllllllllllllIllIIIIIIllllIIlI);
         }

         int lllllllllllllllIllIIIIIIlllIIlll = lllllllllllllllIllIIIIIIlllIlIlI[lllllllllllllllIllIIIIIIlllIlIII];
         lllllllllllllllIllIIIIIIllllIIlI.append((char)(lllllllllllllllIllIIIIIIlllIIlll ^ lllllllllllllllIllIIIIIIlllIllII[lllllllllllllllIllIIIIIIlllIlIll % lllllllllllllllIllIIIIIIlllIllII.length]));
         "".length();
         ++lllllllllllllllIllIIIIIIlllIlIll;
         ++lllllllllllllllIllIIIIIIlllIlIII;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean lIIllIIIllIIll(int var0) {
      return var0 == 0;
   }
}
