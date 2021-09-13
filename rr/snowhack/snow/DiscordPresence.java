package rr.snowhack.snow;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.play.server.SPacketChat;
import net.minecraftforge.fml.common.FMLLog;
import rr.snowhack.snow.event.events.PacketEvent;

public class DiscordPresence {
   // $FF: synthetic field
   private static DiscordRichPresence presence;
   // $FF: synthetic field
   private static ServerData svr;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Receive> receiveListener;
   // $FF: synthetic field
   private static final int[] llllIIIllIll;
   // $FF: synthetic field
   private static String state;
   // $FF: synthetic field
   private static final String DEFAULT_STATE;
   // $FF: synthetic field
   public static final Minecraft mc;
   // $FF: synthetic field
   private static final String[] llllIIIllIlI;
   // $FF: synthetic field
   private static final String DEFAULT_DETAILS;
   // $FF: synthetic field
   private static boolean hasStarted;
   // $FF: synthetic field
   private static String details;
   // $FF: synthetic field
   private static String[] popInfo;
   // $FF: synthetic field
   static String lastChat;
   // $FF: synthetic field
   private static final String APP_ID;
   // $FF: synthetic field
   private static final DiscordRPC rpc;

   private static boolean lIIllllIlIllll(int var0) {
      return var0 == 0;
   }

   private static boolean lIIllllIlIlllI(int var0) {
      return var0 != 0;
   }

   private static String lIIllllIlIlIIl(String lllllllllllllllIlIlIllIIlIlIIlll, String lllllllllllllllIlIlIllIIlIlIIlII) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllIIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIlIlIIlII.getBytes(StandardCharsets.UTF_8)), llllIIIllIll[8]), "DES");
         Cipher lllllllllllllllIlIlIllIIlIlIlIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIlIllIIlIlIlIIl.init(llllIIIllIll[2], lllllllllllllllIlIlIllIIlIlIlIlI);
         return new String(lllllllllllllllIlIlIllIIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static String lIIllllIlIlIll(String lllllllllllllllIlIlIllIIlIIllIII, String lllllllllllllllIlIlIllIIlIIllIIl) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllIIlIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIIlIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIllIIlIIlllII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIllIIlIIlllII.init(llllIIIllIll[2], lllllllllllllllIlIlIllIIlIIlllIl);
         return new String(lllllllllllllllIlIlIllIIlIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void start() {
      FMLLog.log.info(llllIIIllIlI[llllIIIllIll[0]]);
      if (!lIIllllIlIlllI(hasStarted)) {
         hasStarted = (boolean)llllIIIllIll[1];
         String lllllllllllllllIlIlIllIIllIlIlIl = new DiscordEventHandlers();
         lllllllllllllllIlIlIllIIllIlIlIl.disconnected = (lllllllllllllllIlIlIllIIllIIllIl, lllllllllllllllIlIlIllIIllIIllII) -> {
            System.out.println(String.valueOf((new StringBuilder()).append(llllIIIllIlI[llllIIIllIll[17]]).append(lllllllllllllllIlIlIllIIllIIllIl).append(llllIIIllIlI[llllIIIllIll[20]]).append(lllllllllllllllIlIlIllIIllIIllII)));
         };
         rpc.Discord_Initialize(llllIIIllIlI[llllIIIllIll[1]], lllllllllllllllIlIlIllIIllIlIlIl, (boolean)llllIIIllIll[1], llllIIIllIlI[llllIIIllIll[2]]);
         presence.startTimestamp = System.currentTimeMillis() / 1000L;
         presence.details = llllIIIllIlI[llllIIIllIll[3]];
         presence.state = llllIIIllIlI[llllIIIllIll[4]];
         presence.largeImageKey = llllIIIllIlI[llllIIIllIll[5]];
         rpc.Discord_UpdatePresence(presence);
         (new Thread(() -> {
            while(lIIllllIlIllll(Thread.currentThread().isInterrupted())) {
               label74: {
                  try {
                     rpc.Discord_RunCallbacks();
                     details = llllIIIllIlI[llllIIIllIll[8]];
                     state = llllIIIllIlI[llllIIIllIll[9]];
                     if (lIIllllIlIlllI(mc.func_71387_A())) {
                        details = mc.field_71439_g.func_70005_c_();
                        state = llllIIIllIlI[llllIIIllIll[10]];
                        "".length();
                        if (null != null) {
                           return;
                        }
                     } else if (lIIllllIllIIII(mc.func_147104_D())) {
                        svr = mc.func_147104_D();
                        if (lIIllllIlIllll(svr.field_78845_b.equals(llllIIIllIlI[llllIIIllIll[11]]))) {
                           details = mc.field_71439_g.func_70005_c_();
                           state = String.valueOf((new StringBuilder()).append(svr.field_78845_b).append(llllIIIllIlI[llllIIIllIll[12]]));
                           if (lIIllllIllIIII(svr.field_78846_c)) {
                              popInfo = svr.field_78846_c.split(llllIIIllIlI[llllIIIllIll[13]]);
                           }

                           if (lIIllllIlIlllI(svr.field_78845_b.equals(llllIIIllIlI[llllIIIllIll[14]]))) {
                              label84: {
                                 try {
                                    if (lIIllllIlIlllI(lastChat.contains(llllIIIllIlI[llllIIIllIll[15]]))) {
                                       state = String.valueOf((new StringBuilder()).append(state).append(llllIIIllIlI[llllIIIllIll[16]]).append(Integer.parseInt(lastChat.substring(llllIIIllIll[17]))));
                                    }
                                 } catch (Throwable var2) {
                                    var2.printStackTrace();
                                    "".length();
                                    if ("   ".length() >= 0) {
                                       break label84;
                                    }

                                    return;
                                 }

                                 "".length();
                                 if ("   ".length() == 0) {
                                    return;
                                 }
                              }
                           }
                        }
                     } else {
                        details = llllIIIllIlI[llllIIIllIll[18]];
                        state = llllIIIllIlI[llllIIIllIll[19]];
                     }

                     if (!lIIllllIlIlllI(details.equals(presence.details)) || lIIllllIlIllll(state.equals(presence.state))) {
                        presence.startTimestamp = System.currentTimeMillis() / 1000L;
                     }

                     presence.details = details;
                     presence.state = state;
                     rpc.Discord_UpdatePresence(presence);
                  } catch (Exception var3) {
                     var3.printStackTrace();
                     break label74;
                  }

                  "".length();
                  if (((130 ^ 163) & ~(167 ^ 134)) > 0) {
                     return;
                  }
               }

               try {
                  Thread.sleep(5000L);
               } catch (InterruptedException var1) {
                  var1.printStackTrace();
                  "".length();
                  if ("   ".length() > -" ".length()) {
                     continue;
                  }

                  return;
               }

               "".length();
               if (null != null) {
                  return;
               }
            }

         }, llllIIIllIlI[llllIIIllIll[6]])).start();
         FMLLog.log.info(llllIIIllIlI[llllIIIllIll[7]]);
      }
   }

   private static boolean lIIllllIllIIII(Object var0) {
      return var0 != null;
   }

   private static void lIIllllIlIllII() {
      llllIIIllIlI = new String[llllIIIllIll[24]];
      llllIIIllIlI[llllIIIllIll[0]] = lIIllllIlIlIIl("T7KoShFM0geHu+6Pt7tXRtiUW/O4iQ99", "ZGKKL");
      llllIIIllIlI[llllIIIllIll[1]] = lIIllllIlIlIlI("U0RKQEZWQUBDTlJGSEBCUUFO", "esxpv");
      llllIIIllIlI[llllIIIllIll[2]] = lIIllllIlIlIlI("", "iHdlp");
      llllIIIllIlI[llllIIIllIll[3]] = lIIllllIlIlIll("YPp/e79yTJwML6T9IiIGcA==", "xNHnf");
      llllIIIllIlI[llllIIIllIll[4]] = lIIllllIlIlIll("dVVgGbOPgUWzZQ+vgASM3A==", "HHOlQ");
      llllIIIllIlI[llllIIIllIll[5]] = lIIllllIlIlIlI("KjsZPQ==", "YUvJX");
      llllIIIllIlI[llllIIIllIll[6]] = lIIllllIlIlIlI("PhAaJiIIHUQXHTlUKiQhFhsIJiZXMQgrKRYcGw==", "zyiEM");
      llllIIIllIlI[llllIIIllIll[7]] = lIIllllIlIlIIl("pfo/LRtmTvqFyrfIY8NdEgxULZ7tVvnNPTFnTEJXAuFV1euaTf/KCw==", "DaLCC");
      llllIIIllIlI[llllIIIllIll[8]] = lIIllllIlIlIll("uJmFvAcpW38=", "nybPk");
      llllIIIllIlI[llllIIIllIll[9]] = lIIllllIlIlIll("pq5N2P6phmg=", "lKSDI");
      llllIIIllIlI[llllIIIllIll[10]] = lIIllllIlIlIlI("CS4nKAo/FyUuHz81", "ZGIOf");
      llllIIIllIlI[llllIIIllIll[11]] = lIIllllIlIlIIl("9YQS0PPl3W0=", "Wbhfn");
      llllIIIllIlI[llllIIIllIll[12]] = lIIllllIlIlIlI("Zg==", "FdHFm");
      llllIIIllIlI[llllIIIllIll[13]] = lIIllllIlIlIlI("Sg==", "esBlt");
      llllIIIllIlI[llllIIIllIll[14]] = lIIllllIlIlIIl("qQZF0jD35/xvnXPOt3ynFg==", "ykVmo");
      llllIIIllIlI[llllIIIllIll[15]] = lIIllllIlIlIIl("mW9XQj63Mn+6bJ3t6JlvFBhH7tAWb8u0", "uTqPx");
      llllIIIllIlI[llllIIIllIll[16]] = lIIllllIlIlIlI("RDg+TBgRNCUJ", "dQPli");
      llllIIIllIlI[llllIIIllIll[18]] = lIIllllIlIlIll("T/G64PlRA5qjCoQJfK6wQg==", "FoKlR");
      llllIIIllIlI[llllIIIllIll[19]] = lIIllllIlIlIlI("OAoMBwc4CgwHBzgKDAc=", "yKMFF");
      llllIIIllIlI[llllIIIllIll[17]] = lIIllllIlIlIIl("4yfCEwgKDnlFy1Zq55Lg9Yjk4BnDAtbnqBzuNS4PP4HI6topah/5yA==", "tMcxF");
      llllIIIllIlI[llllIIIllIll[20]] = lIIllllIlIlIIl("+OS4QiF5lL0FnDEVr9M2bQ==", "zuFaD");
      llllIIIllIlI[llllIIIllIll[21]] = lIIllllIlIlIIl("zszPKVtBuX74Dl3eNNRzNg==", "wzgmJ");
      llllIIIllIlI[llllIIIllIll[22]] = lIIllllIlIlIIl("rZ4gQPEuomXE8j8kx2si/9tqCtUnRqH+", "vyMNF");
      llllIIIllIlI[llllIIIllIll[23]] = lIIllllIlIlIlI("Li41FgQuLjUWBC4uNRY=", "ootWE");
   }

   private static String lIIllllIlIlIlI(String lllllllllllllllIlIlIllIIlIllllII, String lllllllllllllllIlIlIllIIlIllIllI) {
      lllllllllllllllIlIlIllIIlIllllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIIlIllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lllllllllllllllIlIlIllIIlIllIlIl = new StringBuilder();
      float lllllllllllllllIlIlIllIIlIllIlII = lllllllllllllllIlIlIllIIlIllIllI.toCharArray();
      int lllllllllllllllIlIlIllIIlIlllIII = llllIIIllIll[0];
      int lllllllllllllllIlIlIllIIlIllIIlI = lllllllllllllllIlIlIllIIlIllllII.toCharArray();
      char lllllllllllllllIlIlIllIIlIllIIIl = lllllllllllllllIlIlIllIIlIllIIlI.length;
      int lllllllllllllllIlIlIllIIlIllIIII = llllIIIllIll[0];

      do {
         if (!lIIllllIllIIIl(lllllllllllllllIlIlIllIIlIllIIII, lllllllllllllllIlIlIllIIlIllIIIl)) {
            return String.valueOf(lllllllllllllllIlIlIllIIlIllIlIl);
         }

         Exception lllllllllllllllIlIlIllIIlIlIllll = lllllllllllllllIlIlIllIIlIllIIlI[lllllllllllllllIlIlIllIIlIllIIII];
         lllllllllllllllIlIlIllIIlIllIlIl.append((char)(lllllllllllllllIlIlIllIIlIlIllll ^ lllllllllllllllIlIlIllIIlIllIlII[lllllllllllllllIlIlIllIIlIlllIII % lllllllllllllllIlIlIllIIlIllIlII.length]));
         "".length();
         ++lllllllllllllllIlIlIllIIlIlllIII;
         ++lllllllllllllllIlIlIllIIlIllIIII;
         "".length();
      } while(-"  ".length() <= 0);

      return null;
   }

   static {
      lIIllllIlIllIl();
      lIIllllIlIllII();
      DEFAULT_DETAILS = llllIIIllIlI[llllIIIllIll[21]];
      APP_ID = llllIIIllIlI[llllIIIllIll[22]];
      DEFAULT_STATE = llllIIIllIlI[llllIIIllIll[23]];
      mc = Minecraft.func_71410_x();
      rpc = DiscordRPC.INSTANCE;
      presence = new DiscordRichPresence();
      hasStarted = (boolean)llllIIIllIll[0];
   }

   private static boolean lIIllllIllIIIl(int var0, int var1) {
      return var0 < var1;
   }

   public DiscordPresence() {
      lllllllllllllllIlIlIllIIllIllIII.receiveListener = new Listener((lllllllllllllllIlIlIllIIllIIlIII) -> {
         if (lIIllllIlIlllI(lllllllllllllllIlIlIllIIllIIlIII.getPacket() instanceof SPacketChat)) {
            lastChat = ((SPacketChat)lllllllllllllllIlIlIllIIllIIlIII.getPacket()).field_148919_a.func_150254_d();
         }

      }, new Predicate[llllIIIllIll[0]]);
   }

   private static void lIIllllIlIllIl() {
      llllIIIllIll = new int[25];
      llllIIIllIll[0] = ((80 ^ 79) << (" ".length() << " ".length()) ^ 25 ^ 68) & ((110 ^ 123) << " ".length() ^ 57 ^ 50 ^ -" ".length());
      llllIIIllIll[1] = " ".length();
      llllIIIllIll[2] = " ".length() << " ".length();
      llllIIIllIll[3] = "   ".length();
      llllIIIllIll[4] = " ".length() << (" ".length() << " ".length());
      llllIIIllIll[5] = 18 ^ 23;
      llllIIIllIll[6] = "   ".length() << " ".length();
      llllIIIllIll[7] = 165 ^ 162;
      llllIIIllIll[8] = " ".length() << "   ".length();
      llllIIIllIll[9] = 119 ^ 126;
      llllIIIllIll[10] = (15 ^ 10) << " ".length();
      llllIIIllIll[11] = (48 ^ 117) << " ".length() ^ 44 + 62 - 78 + 101;
      llllIIIllIll[12] = "   ".length() << (" ".length() << " ".length());
      llllIIIllIll[13] = 81 ^ 116 ^ (31 ^ 26) << "   ".length();
      llllIIIllIll[14] = (42 ^ 67 ^ (108 ^ 91) << " ".length()) << " ".length();
      llllIIIllIll[15] = 149 ^ 154;
      llllIIIllIll[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllIIIllIll[17] = 150 ^ 133;
      llllIIIllIll[18] = 3 ^ 18;
      llllIIIllIll[19] = (143 ^ 134) << " ".length();
      llllIIIllIll[20] = (135 ^ 130) << (" ".length() << " ".length());
      llllIIIllIll[21] = 78 ^ 91;
      llllIIIllIll[22] = ("   ".length() << (" ".length() << " ".length()) ^ 25 ^ 30) << " ".length();
      llllIIIllIll[23] = "   ".length() << " ".length() ^ 143 ^ 158;
      llllIIIllIll[24] = "   ".length() << "   ".length();
   }
}
