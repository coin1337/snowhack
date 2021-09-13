package rr.snowhack.snow.module.modules.client;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraft.util.text.TextComponentString;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "ChatTime",
   category = Module.Category.CLIENT
)
public class ChatTime extends Module {
   // $FF: synthetic field
   private Setting<ChatTime.TextColor> textColor;
   // $FF: synthetic field
   private static final int[] lIIIIIIIllIIl;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Receive> receiveListener;
   // $FF: synthetic field
   public static String Textcolour;
   // $FF: synthetic field
   private static final String[] lIIIIIIIllIII;

   private static boolean lIlIIllIllllIl(int var0) {
      return var0 != 0;
   }

   private static String lIlIIllIlllIIl(String lllllllllllllllIlIIlIIIlIIlIIIII, String lllllllllllllllIlIIlIIIlIIIlllll) {
      try {
         int lllllllllllllllIlIIlIIIlIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIlIIlIIIlIIIlllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIIIlIIIlllIl.init(lIIIIIIIllIIl[2], lllllllllllllllIlIIlIIIlIIIllllI);
         return new String(lllllllllllllllIlIIlIIIlIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIllIllllll(int var0, int var1) {
      return var0 < var1;
   }

   public void onUpdate() {
      String lllllllllllllllIlIIlIIIlIIlllIlI = lIIIIIIIllIII[lIIIIIIIllIIl[1]];
      switch(null.$SwitchMap$rr$snowhack$snow$module$modules$client$ChatTime$TextColor[((ChatTime.TextColor)lllllllllllllllIlIIlIIIlIIlllIll.textColor.getValue()).ordinal()]) {
      case 1:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[2]]));
         "".length();
         if (" ".length() << " ".length() == "   ".length()) {
            return;
         }
         break;
      case 2:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[3]]));
         "".length();
         if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length())) != 0) {
            return;
         }
         break;
      case 3:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[4]]));
         "".length();
         if (" ".length() << " ".length() <= ((97 ^ 64) << " ".length() & ~((80 ^ 113) << " ".length()))) {
            return;
         }
         break;
      case 4:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[5]]));
         "".length();
         if (" ".length() << " ".length() >= "   ".length()) {
            return;
         }
         break;
      case 5:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[6]]));
         "".length();
         if (-"   ".length() > 0) {
            return;
         }
         break;
      case 6:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[7]]));
         "".length();
         if (((115 ^ 116) << "   ".length() & ~((4 ^ 3) << "   ".length())) != 0) {
            return;
         }
         break;
      case 7:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[8]]));
         "".length();
         if (" ".length() < -" ".length()) {
            return;
         }
         break;
      case 8:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[9]]));
         "".length();
         if (" ".length() > " ".length() << " ".length()) {
            return;
         }
         break;
      case 9:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[10]]));
         "".length();
         if (" ".length() << " ".length() <= 0) {
            return;
         }
         break;
      case 10:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[11]]));
         "".length();
         if (-" ".length() > " ".length() << " ".length()) {
            return;
         }
         break;
      case 11:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[12]]));
         "".length();
         if (null != null) {
            return;
         }
         break;
      case 12:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[13]]));
         "".length();
         if (-(" ".length() ^ 69 ^ 64) >= 0) {
            return;
         }
         break;
      case 13:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[14]]));
         "".length();
         if (" ".length() << " ".length() != " ".length() << " ".length()) {
            return;
         }
         break;
      case 14:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[15]]));
         "".length();
         if ((" ".length() << (" ".length() << (" ".length() << " ".length())) & ~(" ".length() << (" ".length() << (" ".length() << " ".length())))) != 0) {
            return;
         }
         break;
      case 15:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[16]]));
         "".length();
         if (-" ".length() == " ".length()) {
            return;
         }
         break;
      case 16:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[17]]));
         "".length();
         if (-"  ".length() >= 0) {
            return;
         }
         break;
      default:
         Textcolour = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlIIIlIIlllIlI).append(lIIIIIIIllIII[lIIIIIIIllIIl[18]]));
      }

   }

   static {
      lIlIIllIllllII();
      lIlIIllIlllIll();
      Textcolour = lIIIIIIIllIII[lIIIIIIIllIIl[27]];
   }

   private static void lIlIIllIlllIll() {
      lIIIIIIIllIII = new String[lIIIIIIIllIIl[28]];
      lIIIIIIIllIII[lIIIIIIIllIIl[0]] = lIlIIllIlllIII("MxYsPysIHzs5", "gsTKh");
      lIIIIIIIllIII[lIIIIIIIllIIl[1]] = lIlIIllIlllIIl("FPF+3JWI6Ao=", "vPLju");
      lIIIIIIIllIII[lIIIIIIIllIIl[2]] = lIlIIllIlllIIl("YXoPy0bUaBY=", "NRfBp");
      lIIIIIIIllIII[lIIIIIIIllIIl[3]] = lIlIIllIlllIlI("NGLRpvVaOfY=", "YrugB");
      lIIIIIIIllIII[lIIIIIIIllIIl[4]] = lIlIIllIlllIII("bg==", "XtJpP");
      lIIIIIIIllIII[lIIIIIIIllIIl[5]] = lIlIIllIlllIlI("V91ktiWgwTc=", "okJJH");
      lIIIIIIIllIII[lIIIIIIIllIIl[6]] = lIlIIllIlllIlI("+PbMe4/Msk4=", "YqeGO");
      lIIIIIIIllIII[lIIIIIIIllIIl[7]] = lIlIIllIlllIII("aw==", "Ycesz");
      lIIIIIIIllIII[lIIIIIIIllIIl[8]] = lIlIIllIlllIII("Nw==", "UyACN");
      lIIIIIIIllIII[lIIIIIIIllIIl[9]] = lIlIIllIlllIII("cA==", "CkPmz");
      lIIIIIIIllIII[lIIIIIIIllIIl[10]] = lIlIIllIlllIlI("ueVUCQCo2RQ=", "kMDHr");
      lIIIIIIIllIII[lIIIIIIIllIIl[11]] = lIlIIllIlllIIl("GF3u9uM1SPo=", "UXwxT");
      lIIIIIIIllIII[lIIIIIIIllIIl[12]] = lIlIIllIlllIlI("1AnzUgMAX4c=", "zwFAL");
      lIIIIIIIllIII[lIIIIIIIllIIl[13]] = lIlIIllIlllIII("MA==", "TXhHQ");
      lIIIIIIIllIII[lIIIIIIIllIIl[14]] = lIlIIllIlllIlI("Ip6MMoMmVYQ=", "XNgPq");
      lIIIIIIIllIII[lIIIIIIIllIIl[15]] = lIlIIllIlllIII("dA==", "CVQRm");
      lIIIIIIIllIII[lIIIIIIIllIIl[16]] = lIlIIllIlllIIl("w/FGWn+OV6U=", "YZwEG");
      lIIIIIIIllIII[lIIIIIIIllIIl[17]] = lIlIIllIlllIlI("AGiMIjhzIaI=", "SPDsa");
      lIIIIIIIllIII[lIIIIIIIllIIl[18]] = lIlIIllIlllIlI("l2wAWsAbq00=", "kaNfm");
      lIIIIIIIllIII[lIIIIIIIllIIl[19]] = lIlIIllIlllIIl("X+SMttoRAUQ=", "wNbTw");
      lIIIIIIIllIII[lIIIIIIIllIIl[20]] = lIlIIllIlllIIl("pkhv3YNFScw=", "LieST");
      lIIIIIIIllIII[lIIIIIIIllIIl[21]] = lIlIIllIlllIIl("IPOGFi3ei5Q=", "LfpGi");
      lIIIIIIIllIII[lIIIIIIIllIIl[22]] = lIlIIllIlllIIl("JbWzLgKOEYY=", "AMvVU");
      lIIIIIIIllIII[lIIIIIIIllIIl[23]] = lIlIIllIlllIlI("LuR11SaVz8E=", "ksTyX");
      lIIIIIIIllIII[lIIIIIIIllIIl[24]] = lIlIIllIlllIIl("qXz+OlGtCbE=", "WuNvW");
      lIIIIIIIllIII[lIIIIIIIllIIl[25]] = lIlIIllIlllIlI("j/nmAyWa8c4=", "druKS");
      lIIIIIIIllIII[lIIIIIIIllIIl[26]] = lIlIIllIlllIlI("lgF95rOYpC8=", "BSAnW");
      lIIIIIIIllIII[lIIIIIIIllIIl[27]] = lIlIIllIlllIIl("6QmjjBBlZPY=", "KNAco");
   }

   private static void lIlIIllIllllII() {
      lIIIIIIIllIIl = new int[29];
      lIIIIIIIllIIl[0] = (42 ^ 121) & ~(2 ^ 81);
      lIIIIIIIllIIl[1] = " ".length();
      lIIIIIIIllIIl[2] = " ".length() << " ".length();
      lIIIIIIIllIIl[3] = "   ".length();
      lIIIIIIIllIIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIIIIIllIIl[5] = 99 ^ 102;
      lIIIIIIIllIIl[6] = "   ".length() << " ".length();
      lIIIIIIIllIIl[7] = 44 ^ 43;
      lIIIIIIIllIIl[8] = " ".length() << "   ".length();
      lIIIIIIIllIIl[9] = 51 ^ 60 ^ "   ".length() << " ".length();
      lIIIIIIIllIIl[10] = (207 ^ 196 ^ (66 ^ 69) << " ".length()) << " ".length();
      lIIIIIIIllIIl[11] = 110 ^ 101;
      lIIIIIIIllIIl[12] = "   ".length() << (" ".length() << " ".length());
      lIIIIIIIllIIl[13] = (184 ^ 169) << "   ".length() ^ 111 + 35 - 118 + 105;
      lIIIIIIIllIIl[14] = (119 ^ 112) << " ".length();
      lIIIIIIIllIIl[15] = "   ".length() ^ "   ".length() << (" ".length() << " ".length());
      lIIIIIIIllIIl[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIIIIllIIl[17] = 171 ^ 186;
      lIIIIIIIllIIl[18] = (68 ^ 77) << " ".length();
      lIIIIIIIllIIl[19] = 149 ^ 134;
      lIIIIIIIllIIl[20] = (105 ^ 108) << (" ".length() << " ".length());
      lIIIIIIIllIIl[21] = 7 ^ 18;
      lIIIIIIIllIIl[22] = (136 ^ 131) << " ".length();
      lIIIIIIIllIIl[23] = (39 ^ 52) << " ".length() ^ 10 ^ 59;
      lIIIIIIIllIIl[24] = "   ".length() << "   ".length();
      lIIIIIIIllIIl[25] = 12 ^ 21;
      lIIIIIIIllIIl[26] = (163 + 105 - 165 + 80 ^ (80 ^ 13) << " ".length()) << " ".length();
      lIIIIIIIllIIl[27] = 220 ^ 199;
      lIIIIIIIllIIl[28] = (17 ^ 22) << (" ".length() << " ".length());
   }

   public ChatTime() {
      lllllllllllllllIlIIlIIIlIlIIIIII.textColor = lllllllllllllllIlIIlIIIlIlIIIIII.register(Settings.e(lIIIIIIIllIII[lIIIIIIIllIIl[0]], ChatTime.TextColor.Red));
      lllllllllllllllIlIIlIIIlIlIIIIII.receiveListener = new Listener((lllllllllllllllIlIIlIIIlIIlIllIl) -> {
         if (lIlIIllIllllIl(lllllllllllllllIlIIlIIIlIIlIllIl.getPacket() instanceof SPacketChat)) {
            short lllllllllllllllIlIIlIIIlIIlIllII = ((SPacketChat)lllllllllllllllIlIIlIIIlIIlIllIl.getPacket()).field_148919_a.func_150254_d();
            if (lIlIIllIlllllI(((SPacketChat)lllllllllllllllIlIIlIIIlIIlIllIl.getPacket()).func_148916_d())) {
               return;
            }

            byte lllllllllllllllIlIIlIIIlIIlIlIll = (new SimpleDateFormat(lIIIIIIIllIII[lIIIIIIIllIIl[21]])).format(new Date());
            String lllllllllllllllIlIIlIIIlIIlIlIlI;
            if (lIlIIllIllllIl(Textcolour.equals(lIIIIIIIllIII[lIIIIIIIllIIl[22]]))) {
               lllllllllllllllIlIIlIIIlIIlIlIlI = String.valueOf((new StringBuilder()).append(lIIIIIIIllIII[lIIIIIIIllIIl[23]]).append(lllllllllllllllIlIIlIIIlIIlIlIll).append(lIIIIIIIllIII[lIIIIIIIllIIl[24]]).append(lllllllllllllllIlIIlIIIlIIlIllII));
               ((SPacketChat)lllllllllllllllIlIIlIIIlIIlIllIl.getPacket()).field_148919_a = new TextComponentString(lllllllllllllllIlIIlIIIlIIlIlIlI);
               "".length();
               if (" ".length() << (" ".length() << " ".length()) == 0) {
                  return;
               }
            } else {
               lllllllllllllllIlIIlIIIlIIlIlIlI = String.valueOf((new StringBuilder()).append(Textcolour).append(lIIIIIIIllIII[lIIIIIIIllIIl[25]]).append(lllllllllllllllIlIIlIIIlIIlIlIll).append(lIIIIIIIllIII[lIIIIIIIllIIl[26]]).append(lllllllllllllllIlIIlIIIlIIlIllII));
               ((SPacketChat)lllllllllllllllIlIIlIIIlIIlIllIl.getPacket()).field_148919_a = new TextComponentString(lllllllllllllllIlIIlIIIlIIlIlIlI);
            }
         }

      }, new Predicate[lIIIIIIIllIIl[0]]);
   }

   private static String lIlIIllIlllIlI(String lllllllllllllllIlIIlIIIIllllllIl, String lllllllllllllllIlIIlIIIIllllllII) {
      try {
         char lllllllllllllllIlIIlIIIIlllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIllllllII.getBytes(StandardCharsets.UTF_8)), lIIIIIIIllIIl[8]), "DES");
         int lllllllllllllllIlIIlIIIIlllllIII = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIIIIlllllIII.init(lIIIIIIIllIIl[2], lllllllllllllllIlIIlIIIIlllllIIl);
         return new String(lllllllllllllllIlIIlIIIIlllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIllIlllllI(int var0) {
      return var0 == 0;
   }

   public String getHudInfo() {
      return lllllllllllllllIlIIlIIIlIIllIlll.textColor.getValueAsString().replaceAll(lIIIIIIIllIII[lIIIIIIIllIIl[19]], lIIIIIIIllIII[lIIIIIIIllIIl[20]]);
   }

   private static String lIlIIllIlllIII(String lllllllllllllllIlIIlIIIlIIIIllIl, String lllllllllllllllIlIIlIIIlIIIlIIIl) {
      lllllllllllllllIlIIlIIIlIIIIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIlIIIlIIIlIIII = new StringBuilder();
      char[] lllllllllllllllIlIIlIIIlIIIIllll = lllllllllllllllIlIIlIIIlIIIlIIIl.toCharArray();
      byte lllllllllllllllIlIIlIIIlIIIIlIIl = lIIIIIIIllIIl[0];
      long lllllllllllllllIlIIlIIIlIIIIlIII = lllllllllllllllIlIIlIIIlIIIIllIl.toCharArray();
      short lllllllllllllllIlIIlIIIlIIIIIlll = lllllllllllllllIlIIlIIIlIIIIlIII.length;
      int lllllllllllllllIlIIlIIIlIIIIIllI = lIIIIIIIllIIl[0];

      do {
         if (!lIlIIllIllllll(lllllllllllllllIlIIlIIIlIIIIIllI, lllllllllllllllIlIIlIIIlIIIIIlll)) {
            return String.valueOf(lllllllllllllllIlIIlIIIlIIIlIIII);
         }

         char lllllllllllllllIlIIlIIIlIIIIIlIl = lllllllllllllllIlIIlIIIlIIIIlIII[lllllllllllllllIlIIlIIIlIIIIIllI];
         lllllllllllllllIlIIlIIIlIIIlIIII.append((char)(lllllllllllllllIlIIlIIIlIIIIIlIl ^ lllllllllllllllIlIIlIIIlIIIIllll[lllllllllllllllIlIIlIIIlIIIIlIIl % lllllllllllllllIlIIlIIIlIIIIllll.length]));
         "".length();
         ++lllllllllllllllIlIIlIIIlIIIIlIIl;
         ++lllllllllllllllIlIIlIIIlIIIIIllI;
         "".length();
      } while(-" ".length() < " ".length() << " ".length());

      return null;
   }

   private static enum TextColor {
      // $FF: synthetic field
      Pink,
      // $FF: synthetic field
      Aqua,
      // $FF: synthetic field
      DarkAqua,
      // $FF: synthetic field
      Yellow,
      // $FF: synthetic field
      Blue,
      // $FF: synthetic field
      Black,
      // $FF: synthetic field
      Gold,
      // $FF: synthetic field
      Gray,
      // $FF: synthetic field
      DarkGray,
      // $FF: synthetic field
      Red,
      // $FF: synthetic field
      DarkGreen;

      // $FF: synthetic field
      private static final int[] lllllIIIlIlI;
      // $FF: synthetic field
      private static final String[] lllllIIIIlll;
      // $FF: synthetic field
      White,
      // $FF: synthetic field
      Green,
      // $FF: synthetic field
      DarkBlue,
      // $FF: synthetic field
      Purple,
      // $FF: synthetic field
      DarkRed;

      private static String lIlIIIIlllllll(String lllllllllllllllIlIlIIIlIIIIIlIIl, String lllllllllllllllIlIlIIIlIIIIIlIII) {
         try {
            long lllllllllllllllIlIlIIIlIIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIlIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lllllIIIlIlI[8]), "DES");
            Cipher lllllllllllllllIlIlIIIlIIIIIllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIlIIIIIllIl.init(lllllIIIlIlI[2], lllllllllllllllIlIlIIIlIIIIIIlll);
            return new String(lllllllllllllllIlIlIIIlIIIIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIlIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIIIlIIIlIIl() {
         lllllIIIlIlI = new int[17];
         lllllIIIlIlI[0] = (117 ^ 94) << " ".length() & ~((14 ^ 37) << " ".length());
         lllllIIIlIlI[1] = " ".length();
         lllllIIIlIlI[2] = " ".length() << " ".length();
         lllllIIIlIlI[3] = "   ".length();
         lllllIIIlIlI[4] = " ".length() << (" ".length() << " ".length());
         lllllIIIlIlI[5] = 123 ^ 126;
         lllllIIIlIlI[6] = "   ".length() << " ".length();
         lllllIIIlIlI[7] = (3 ^ 10) << (" ".length() << (" ".length() << " ".length())) ^ 41 + 99 - 34 + 45;
         lllllIIIlIlI[8] = " ".length() << "   ".length();
         lllllIIIlIlI[9] = 54 ^ 63;
         lllllIIIlIlI[10] = (110 ^ 1 ^ (185 ^ 140) << " ".length()) << " ".length();
         lllllIIIlIlI[11] = 60 ^ 47 ^ "   ".length() << "   ".length();
         lllllIIIlIlI[12] = "   ".length() << (" ".length() << " ".length());
         lllllIIIlIlI[13] = (21 ^ 28) << (" ".length() << (" ".length() << " ".length())) ^ 92 + 91 - 48 + 22;
         lllllIIIlIlI[14] = (39 ^ 32) << " ".length();
         lllllIIIlIlI[15] = 164 + 125 - 258 + 174 ^ (76 ^ 45) << " ".length();
         lllllIIIlIlI[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      }

      static {
         lIlIIIlIIIlIIl();
         lIlIIIlIIIIllI();
         Red = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[0]], lllllIIIlIlI[0]);
         DarkRed = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[1]], lllllIIIlIlI[1]);
         Gold = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[2]], lllllIIIlIlI[2]);
         Yellow = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[3]], lllllIIIlIlI[3]);
         Green = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[4]], lllllIIIlIlI[4]);
         DarkGreen = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[5]], lllllIIIlIlI[5]);
         Aqua = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[6]], lllllIIIlIlI[6]);
         DarkAqua = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[7]], lllllIIIlIlI[7]);
         Blue = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[8]], lllllIIIlIlI[8]);
         DarkBlue = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[9]], lllllIIIlIlI[9]);
         Purple = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[10]], lllllIIIlIlI[10]);
         Pink = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[11]], lllllIIIlIlI[11]);
         White = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[12]], lllllIIIlIlI[12]);
         Gray = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[13]], lllllIIIlIlI[13]);
         DarkGray = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[14]], lllllIIIlIlI[14]);
         Black = new ChatTime.TextColor(lllllIIIIlll[lllllIIIlIlI[15]], lllllIIIlIlI[15]);
         ChatTime.TextColor[] var10000 = new ChatTime.TextColor[lllllIIIlIlI[16]];
         var10000[lllllIIIlIlI[0]] = Red;
         var10000[lllllIIIlIlI[1]] = DarkRed;
         var10000[lllllIIIlIlI[2]] = Gold;
         var10000[lllllIIIlIlI[3]] = Yellow;
         var10000[lllllIIIlIlI[4]] = Green;
         var10000[lllllIIIlIlI[5]] = DarkGreen;
         var10000[lllllIIIlIlI[6]] = Aqua;
         var10000[lllllIIIlIlI[7]] = DarkAqua;
         var10000[lllllIIIlIlI[8]] = Blue;
         var10000[lllllIIIlIlI[9]] = DarkBlue;
         var10000[lllllIIIlIlI[10]] = Purple;
         var10000[lllllIIIlIlI[11]] = Pink;
         var10000[lllllIIIlIlI[12]] = White;
         var10000[lllllIIIlIlI[13]] = Gray;
         var10000[lllllIIIlIlI[14]] = DarkGray;
         var10000[lllllIIIlIlI[15]] = Black;
      }

      private static String lIlIIIlIIIIlII(String lllllllllllllllIlIlIIIIllllllIll, String lllllllllllllllIlIlIIIIllllllIlI) {
         lllllllllllllllIlIlIIIIllllllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         char lllllllllllllllIlIlIIIIlllllIlII = new StringBuilder();
         char[] lllllllllllllllIlIlIIIIllllllIII = lllllllllllllllIlIlIIIIllllllIlI.toCharArray();
         boolean lllllllllllllllIlIlIIIIlllllIIlI = lllllIIIlIlI[0];
         boolean lllllllllllllllIlIlIIIIlllllIIIl = lllllllllllllllIlIlIIIIllllllIll.toCharArray();
         char lllllllllllllllIlIlIIIIlllllIIII = lllllllllllllllIlIlIIIIlllllIIIl.length;
         int lllllllllllllllIlIlIIIIllllIllll = lllllIIIlIlI[0];

         do {
            if (!lIlIIIlIIIlIlI(lllllllllllllllIlIlIIIIllllIllll, lllllllllllllllIlIlIIIIlllllIIII)) {
               return String.valueOf(lllllllllllllllIlIlIIIIlllllIlII);
            }

            char lllllllllllllllIlIlIIIIlllllllII = lllllllllllllllIlIlIIIIlllllIIIl[lllllllllllllllIlIlIIIIllllIllll];
            lllllllllllllllIlIlIIIIlllllIlII.append((char)(lllllllllllllllIlIlIIIIlllllllII ^ lllllllllllllllIlIlIIIIllllllIII[lllllllllllllllIlIlIIIIlllllIIlI % lllllllllllllllIlIlIIIIllllllIII.length]));
            "".length();
            ++lllllllllllllllIlIlIIIIlllllIIlI;
            ++lllllllllllllllIlIlIIIIllllIllll;
            "".length();
         } while("   ".length() > -" ".length());

         return null;
      }

      private static boolean lIlIIIlIIIlIlI(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIlIIIlIIIIIII(String lllllllllllllllIlIlIIIIllllIIllI, String lllllllllllllllIlIlIIIIllllIIIll) {
         try {
            long lllllllllllllllIlIlIIIIllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIllllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIllllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIllllIlIII.init(lllllIIIlIlI[2], lllllllllllllllIlIlIIIIllllIIIlI);
            return new String(lllllllllllllllIlIlIIIIllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static void lIlIIIlIIIIllI() {
         lllllIIIIlll = new String[lllllIIIlIlI[16]];
         lllllIIIIlll[lllllIIIlIlI[0]] = lIlIIIIlllllll("ZQLnGAo6Ows=", "QvNsg");
         lllllIIIIlll[lllllIIIlIlI[1]] = lIlIIIIlllllll("Pb6133s7V0Q=", "pzYFo");
         lllllIIIIlll[lllllIIIlIlI[2]] = lIlIIIlIIIIIII("D41xmnVmob0=", "xnYwD");
         lllllIIIIlll[lllllIIIlIlI[3]] = lIlIIIlIIIIlII("FREPJj07", "LtcJR");
         lllllIIIIlll[lllllIIIlIlI[4]] = lIlIIIIlllllll("utqJ4F/yBAY=", "uImlB");
         lllllIIIIlll[lllllIIIlIlI[5]] = lIlIIIlIIIIIII("VoePixgzHSFyx6DkdUdLoQ==", "CwzPJ");
         lllllIIIIlll[lllllIIIlIlI[6]] = lIlIIIIlllllll("ONpveElA8HI=", "CxFMF");
         lllllIIIIlll[lllllIIIlIlI[7]] = lIlIIIlIIIIlII("FhQwEREjACM=", "RuBzP");
         lllllIIIIlll[lllllIIIlIlI[8]] = lIlIIIlIIIIlII("Kg4BMA==", "hbtUx");
         lllllIIIIlll[lllllIIIlIlI[9]] = lIlIIIlIIIIIII("cU9YZXwmx4Ny/CbW4ov3pQ==", "HiimS");
         lllllIIIIlll[lllllIIIlIlI[10]] = lIlIIIlIIIIlII("Ex8BCAAm", "Cjsxl");
         lllllIIIIlll[lllllIIIlIlI[11]] = lIlIIIIlllllll("l/Sw3DljrUA=", "wxkAc");
         lllllIIIIlll[lllllIIIlIlI[12]] = lIlIIIlIIIIIII("OpHKPn90oi0=", "AQkho");
         lllllIIIIlll[lllllIIIlIlI[13]] = lIlIIIIlllllll("8UhNKg/mjYE=", "wNJxY");
         lllllIIIIlll[lllllIIIlIlI[14]] = lIlIIIlIIIIIII("DWtoXvJixHxZT/SCQ/VLRA==", "PhwEC");
         lllllIIIIlll[lllllIIIlIlI[15]] = lIlIIIIlllllll("AqMAcORee1g=", "oemkZ");
      }
   }
}
