package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraftforge.client.event.InputUpdateEvent;
import org.lwjgl.input.Keyboard;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "GuiMove",
   category = Module.Category.MOVEMENT
)
public class GuiMove extends Module {
   // $FF: synthetic field
   private Setting<Integer> yawSpeed;
   // $FF: synthetic field
   @EventHandler
   private Listener<InputUpdateEvent> inputUpdateEventListener;
   // $FF: synthetic field
   private static final int[] lIIIlIIlllIlI;
   // $FF: synthetic field
   private Setting<Integer> pitchSpeed;
   // $FF: synthetic field
   private static final String[] lIIIlIIlllIIl;
   // $FF: synthetic field
   private Setting<Boolean> chat;

   private static boolean lIllIIIIIIlIll(int var0) {
      return var0 != 0;
   }

   private static void lIllIIIIIIlIII() {
      lIIIlIIlllIIl = new String[lIIIlIIlllIlI[8]];
      lIIIlIIlllIIl[lIIIlIIlllIlI[0]] = lIllIIIIIIIlIl("UCY3cwko/j4+vU5kQfSQng==", "wCPXd");
      lIIIlIIlllIIl[lIIIlIIlllIlI[2]] = lIllIIIIIIIllI("DSoliURCujQj6af1XIM1Fg==", "zwVmo");
      lIIIlIIlllIIl[lIIIlIIlllIlI[3]] = lIllIIIIIIIlll("ISEnHg==", "bIFjm");
   }

   private static String lIllIIIIIIIlIl(String lllllllllllllllIIlllIIIIllIlIIIl, String lllllllllllllllIIlllIIIIllIlIIlI) {
      try {
         SecretKeySpec lllllllllllllllIIlllIIIIllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIIlllIIIIllIIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIIIIllIIlllI.init(lIIIlIIlllIlI[3], lllllllllllllllIIlllIIIIllIlIllI);
         return new String(lllllllllllllllIIlllIIIIllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIllIIIIIIlIIl() {
      lIIIlIIlllIlI = new int[10];
      lIIIlIIlllIlI[0] = (13 ^ 124 ^ (41 ^ 52) << (" ".length() << " ".length())) << "   ".length() & ((32 ^ 45 ^ " ".length() << "   ".length()) << "   ".length() ^ -" ".length());
      lIIIlIIlllIlI[1] = "   ".length() << " ".length();
      lIIIlIIlllIlI[2] = " ".length();
      lIIIlIIlllIlI[3] = " ".length() << " ".length();
      lIIIlIIlllIlI[4] = (161 ^ 184) << "   ".length();
      lIIIlIIlllIlI[5] = (119 ^ 122) << (" ".length() << (" ".length() << " ".length()));
      lIIIlIIlllIlI[6] = 112 + 74 - 162 + 181;
      lIIIlIIlllIlI[7] = (52 ^ 111) + (0 ^ 121) - ((179 ^ 170) << (" ".length() << " ".length())) + (102 ^ 61);
      lIIIlIIlllIlI[8] = "   ".length();
      lIIIlIIlllIlI[9] = " ".length() << "   ".length();
   }

   private static String lIllIIIIIIIlll(String lllllllllllllllIIlllIIIIlllIlIII, String lllllllllllllllIIlllIIIIlllIIlll) {
      lllllllllllllllIIlllIIIIlllIlIII = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIlllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIIIIlllIIllI = new StringBuilder();
      char[] lllllllllllllllIIlllIIIIlllIIlIl = lllllllllllllllIIlllIIIIlllIIlll.toCharArray();
      boolean lllllllllllllllIIlllIIIIllIlllll = lIIIlIIlllIlI[0];
      boolean lllllllllllllllIIlllIIIIllIllllI = lllllllllllllllIIlllIIIIlllIlIII.toCharArray();
      float lllllllllllllllIIlllIIIIllIlllIl = lllllllllllllllIIlllIIIIllIllllI.length;
      int lllllllllllllllIIlllIIIIllIlllII = lIIIlIIlllIlI[0];

      do {
         if (!lIllIIIIIIllII(lllllllllllllllIIlllIIIIllIlllII, lllllllllllllllIIlllIIIIllIlllIl)) {
            return String.valueOf(lllllllllllllllIIlllIIIIlllIIllI);
         }

         Exception lllllllllllllllIIlllIIIIllIllIll = lllllllllllllllIIlllIIIIllIllllI[lllllllllllllllIIlllIIIIllIlllII];
         lllllllllllllllIIlllIIIIlllIIllI.append((char)(lllllllllllllllIIlllIIIIllIllIll ^ lllllllllllllllIIlllIIIIlllIIlIl[lllllllllllllllIIlllIIIIllIlllll % lllllllllllllllIIlllIIIIlllIIlIl.length]));
         "".length();
         ++lllllllllllllllIIlllIIIIllIlllll;
         ++lllllllllllllllIIlllIIIIllIlllII;
         "".length();
      } while(-" ".length() == -" ".length());

      return null;
   }

   static {
      lIllIIIIIIlIIl();
      lIllIIIIIIlIII();
   }

   private static boolean lIllIIIIIIlIlI(int var0) {
      return var0 == 0;
   }

   public GuiMove() {
      lllllllllllllllIIlllIIIIllllllII.pitchSpeed = lllllllllllllllIIlllIIIIllllllII.register(Settings.i(lIIIlIIlllIIl[lIIIlIIlllIlI[0]], lIIIlIIlllIlI[1]));
      lllllllllllllllIIlllIIIIllllllII.yawSpeed = lllllllllllllllIIlllIIIIllllllII.register(Settings.i(lIIIlIIlllIIl[lIIIlIIlllIlI[2]], lIIIlIIlllIlI[1]));
      lllllllllllllllIIlllIIIIllllllII.chat = lllllllllllllllIIlllIIIIllllllII.register(Settings.b(lIIIlIIlllIIl[lIIIlIIlllIlI[3]], (boolean)lIIIlIIlllIlI[0]));
      lllllllllllllllIIlllIIIIllllllII.inputUpdateEventListener = new Listener((lllllllllllllllIIlllIIIIllllIlIl) -> {
         if (!lIllIIIIIIlIlI(mc.field_71462_r instanceof GuiContainer) || !lIllIIIIIIlIlI(mc.field_71462_r instanceof DisplayGuiScreen) || lIllIIIIIIlIll(mc.field_71462_r instanceof GuiChat) && lIllIIIIIIlIll((Boolean)lllllllllllllllIIlllIIIIllllIllI.chat.getValue())) {
            if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_74351_w.func_151463_i()))) {
               lllllllllllllllIIlllIIIIllllIlIl.getMovementInput().field_192832_b = 1.0F;
            }

            if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_74368_y.func_151463_i()))) {
               lllllllllllllllIIlllIIIIllllIlIl.getMovementInput().field_192832_b = -1.0F;
            }

            if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_74370_x.func_151463_i()))) {
               lllllllllllllllIIlllIIIIllllIlIl.getMovementInput().field_78902_a = 1.0F;
            }

            if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_74366_z.func_151463_i()))) {
               lllllllllllllllIIlllIIIIllllIlIl.getMovementInput().field_78902_a = -1.0F;
            }

            if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_74314_A.func_151463_i()))) {
               lllllllllllllllIIlllIIIIllllIlIl.getMovementInput().field_78901_c = (boolean)lIIIlIIlllIlI[2];
            }
         }

      }, new Predicate[lIIIlIIlllIlI[0]]);
   }

   public void onUpdate() {
      if (!lIllIIIIIIlIlI(mc.field_71462_r instanceof GuiContainer) || !lIllIIIIIIlIlI(mc.field_71462_r instanceof DisplayGuiScreen) || lIllIIIIIIlIll(mc.field_71462_r instanceof GuiChat) && lIllIIIIIIlIll((Boolean)lllllllllllllllIIlllIIIIlllllIlI.chat.getValue())) {
         EntityPlayerSP var10000;
         if (lIllIIIIIIlIll(Keyboard.isKeyDown(lIIIlIIlllIlI[4]))) {
            var10000 = mc.field_71439_g;
            var10000.field_70125_A -= (float)(Integer)lllllllllllllllIIlllIIIIlllllIlI.pitchSpeed.getValue();
         }

         if (lIllIIIIIIlIll(Keyboard.isKeyDown(lIIIlIIlllIlI[5]))) {
            var10000 = mc.field_71439_g;
            var10000.field_70125_A += (float)(Integer)lllllllllllllllIIlllIIIIlllllIlI.pitchSpeed.getValue();
         }

         if (lIllIIIIIIlIll(Keyboard.isKeyDown(lIIIlIIlllIlI[6]))) {
            var10000 = mc.field_71439_g;
            var10000.field_70177_z += (float)(Integer)lllllllllllllllIIlllIIIIlllllIlI.yawSpeed.getValue();
         }

         if (lIllIIIIIIlIll(Keyboard.isKeyDown(lIIIlIIlllIlI[7]))) {
            var10000 = mc.field_71439_g;
            var10000.field_70177_z -= (float)(Integer)lllllllllllllllIIlllIIIIlllllIlI.yawSpeed.getValue();
         }

         if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_151444_V.func_151463_i()))) {
            mc.field_71439_g.func_70031_b((boolean)lIIIlIIlllIlI[2]);
         }

         if (lIllIIIIIIlIll(Keyboard.isKeyDown(mc.field_71474_y.field_74311_E.func_151463_i()))) {
            mc.field_71439_g.func_70095_a((boolean)lIIIlIIlllIlI[2]);
         }
      }

   }

   private static String lIllIIIIIIIllI(String lllllllllllllllIIlllIIIIllIIIlII, String lllllllllllllllIIlllIIIIllIIIlIl) {
      try {
         float lllllllllllllllIIlllIIIIllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIllIIIlIl.getBytes(StandardCharsets.UTF_8)), lIIIlIIlllIlI[9]), "DES");
         Cipher lllllllllllllllIIlllIIIIllIIlIII = Cipher.getInstance("DES");
         lllllllllllllllIIlllIIIIllIIlIII.init(lIIIlIIlllIlI[3], lllllllllllllllIIlllIIIIllIIIIlI);
         return new String(lllllllllllllllIIlllIIIIllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIIIIllII(int var0, int var1) {
      return var0 < var1;
   }
}
