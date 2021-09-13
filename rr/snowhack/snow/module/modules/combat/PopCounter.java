package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.SPacketEntityStatus;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.event.events.TotemPopEvent;
import rr.snowhack.snow.module.Module;

@Module.Info(
   name = "PopCounter",
   description = "Counts the times your enemy pops",
   category = Module.Category.COMBAT
)
public class PopCounter extends Module {
   // $FF: synthetic field
   private static final String[] lIIIIIlIIlIlI;
   // $FF: synthetic field
   private static final int[] lIIIIIlIIlIll;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Receive> totemPopListener;
   // $FF: synthetic field
   @EventHandler
   public Listener<TotemPopEvent> totemPopEvent;
   // $FF: synthetic field
   private HashMap<String, Integer> popList = new HashMap();

   static {
      lIlIlIIIllIIlI();
      lIlIlIIIllIIIl();
   }

   private static String lIlIlIIIlIlllI(String lllllllllllllllIlIIIlIIIIIIIIlII, String lllllllllllllllIlIIIlIIIIIIIIIIl) {
      try {
         char lllllllllllllllIlIIIlIIIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIlIll[9]), "DES");
         int lllllllllllllllIlIIIIlllllllllll = Cipher.getInstance("DES");
         lllllllllllllllIlIIIIlllllllllll.init(lIIIIIlIIlIll[2], lllllllllllllllIlIIIlIIIIIIIIIII);
         return new String(lllllllllllllllIlIIIIlllllllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIIIllIIlI() {
      lIIIIIlIIlIll = new int[11];
      lIIIIIlIIlIll[0] = (63 ^ 24) & ~(126 ^ 89);
      lIIIIIlIIlIll[1] = " ".length();
      lIIIIIlIIlIll[2] = " ".length() << " ".length();
      lIIIIIlIIlIll[3] = (54 ^ 51) << " ".length() ^ 88 ^ 113;
      lIIIIIlIIlIll[4] = "   ".length();
      lIIIIIlIIlIll[5] = " ".length() << (" ".length() << " ".length());
      lIIIIIlIIlIll[6] = 123 ^ 126;
      lIIIIIlIIlIll[7] = "   ".length() << " ".length();
      lIIIIIlIIlIll[8] = "   ".length() << (" ".length() << (" ".length() << " ".length())) ^ 13 ^ 58;
      lIIIIIlIIlIll[9] = " ".length() << "   ".length();
      lIIIIIlIIlIll[10] = 4 ^ 13;
   }

   private static boolean lIlIlIIIlllIII(Object var0) {
      return var0 == null;
   }

   public void onUpdate() {
      Iterator lllllllllllllllIlIIIlIIIIIlIIIlI = mc.field_71441_e.field_73010_i.iterator();

      do {
         if (!lIlIlIIIllIlII(lllllllllllllllIlIIIlIIIIIlIIIlI.hasNext())) {
            return;
         }

         EntityPlayer lllllllllllllllIlIIIlIIIIIlIIlIl = (EntityPlayer)lllllllllllllllIlIIIlIIIIIlIIIlI.next();
         if (lIlIlIIIllIlIl(lIlIlIIIllIIll(lllllllllllllllIlIIIlIIIIIlIIlIl.func_110143_aJ(), 0.0F)) && lIlIlIIIllIlII(lllllllllllllllIlIIIlIIIIIlIIIll.popList.containsKey(lllllllllllllllIlIIIlIIIIIlIIlIl.func_70005_c_()))) {
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[0]]).append(lllllllllllllllIlIIIlIIIIIlIIlIl.func_70005_c_()).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[1]]).append(lllllllllllllllIlIIIlIIIIIlIIIll.popList.get(lllllllllllllllIlIIIlIIIIIlIIlIl.func_70005_c_())).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[2]])));
            lllllllllllllllIlIIIlIIIIIlIIIll.popList.remove(lllllllllllllllIlIIIlIIIIIlIIlIl.func_70005_c_(), lllllllllllllllIlIIIlIIIIIlIIIll.popList.get(lllllllllllllllIlIIIlIIIIIlIIlIl.func_70005_c_()));
            "".length();
         }

         "".length();
      } while(-(112 ^ 116) < 0);

   }

   private static String lIlIlIIIllIIII(String lllllllllllllllIlIIIIlllllIlllll, String lllllllllllllllIlIIIIlllllIllllI) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIllllllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlllllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIIIllllllIIIIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIllllllIIIIl.init(lIIIIIlIIlIll[2], lllllllllllllllIlIIIIllllllIIIlI);
         return new String(lllllllllllllllIlIIIIllllllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static void lIlIlIIIllIIIl() {
      lIIIIIlIIlIlI = new String[lIIIIIlIIlIll[10]];
      lIIIIIlIIlIlI[lIIIIIlIIlIll[0]] = lIlIlIIIlIlllI("CDioPqzBHwM=", "KQMMm");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[1]] = lIlIlIIIlIllll("bzwABwtvOQ8WCj14GQ0fPzEHBU/DqDk=", "OXibo");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[2]] = lIlIlIIIlIlllI("cTqfydVyFBc++dN/tDnTjg==", "tNRaa");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[4]] = lIlIlIIIlIllll("w4Bz", "gJivz");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[5]] = lIlIlIIIllIIII("HnGao8d7xrHXYg70rAVtjA==", "EutAw");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[6]] = lIlIlIIIlIllll("azUGIC8mYA==", "KAiTJ");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[7]] = lIlIlIIIlIlllI("I3YfY5LU01Q=", "gQGtd");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[8]] = lIlIlIIIllIIII("8wtDnFydeBwuMk0iGGahAw==", "OjzsR");
      lIIIIIlIIlIlI[lIIIIIlIIlIll[9]] = lIlIlIIIlIlllI("mVatXiHDaR2Iqjl8Ofo9Nw==", "EAfpz");
   }

   private static boolean lIlIlIIIllIlIl(int var0) {
      return var0 <= 0;
   }

   private static String lIlIlIIIlIllll(String lllllllllllllllIlIIIIlllllllIlII, String lllllllllllllllIlIIIIllllllIlllI) {
      lllllllllllllllIlIIIIlllllllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlllllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIIIlllllllIIlI = new StringBuilder();
      char[] lllllllllllllllIlIIIIlllllllIIIl = lllllllllllllllIlIIIIllllllIlllI.toCharArray();
      boolean lllllllllllllllIlIIIIllllllIlIll = lIIIIIlIIlIll[0];
      float lllllllllllllllIlIIIIllllllIlIlI = lllllllllllllllIlIIIIlllllllIlII.toCharArray();
      double lllllllllllllllIlIIIIllllllIlIIl = lllllllllllllllIlIIIIllllllIlIlI.length;
      int lllllllllllllllIlIIIIllllllIlIII = lIIIIIlIIlIll[0];

      do {
         if (!lIlIlIIIlllIIl(lllllllllllllllIlIIIIllllllIlIII, lllllllllllllllIlIIIIllllllIlIIl)) {
            return String.valueOf(lllllllllllllllIlIIIIlllllllIIlI);
         }

         double lllllllllllllllIlIIIIllllllIIlll = lllllllllllllllIlIIIIllllllIlIlI[lllllllllllllllIlIIIIllllllIlIII];
         lllllllllllllllIlIIIIlllllllIIlI.append((char)(lllllllllllllllIlIIIIllllllIIlll ^ lllllllllllllllIlIIIIlllllllIIIl[lllllllllllllllIlIIIIllllllIlIll % lllllllllllllllIlIIIIlllllllIIIl.length]));
         "".length();
         ++lllllllllllllllIlIIIIllllllIlIll;
         ++lllllllllllllllIlIIIIllllllIlIII;
         "".length();
      } while("   ".length() > -" ".length());

      return null;
   }

   private static boolean lIlIlIIIllIlll(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIlIlIIIllIllI(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIlIIIllIlII(int var0) {
      return var0 != 0;
   }

   public PopCounter() {
      lllllllllllllllIlIIIlIIIIIlIlIlI.totemPopEvent = new Listener((lllllllllllllllIlIIIlIIIIIIlIIlI) -> {
         int[] lllllllllllllllIlIIIlIIIIIIlIIIl = new int[lIIIIIlIIlIll[1]];
         int[] lllllllllllllllIlIIIlIIIIIIlIIII = new int[lIIIIIlIIlIll[1]];
         if (lIlIlIIIlllIII(lllllllllllllllIlIIIlIIIIIIIllll.popList)) {
            lllllllllllllllIlIIIlIIIIIIIllll.popList = new HashMap();
         }

         if (lIlIlIIIlllIII(lllllllllllllllIlIIIlIIIIIIIllll.popList.get(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_()))) {
            lllllllllllllllIlIIIlIIIIIIIllll.popList.put(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_(), lIIIIIlIIlIll[1]);
            "".length();
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[4]]).append(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_()).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[5]]).append(lIIIIIlIIlIll[1]).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[6]])));
            "".length();
            if (null != null) {
               return;
            }
         } else if (lIlIlIIIllIllI(lllllllllllllllIlIIIlIIIIIIIllll.popList.get(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_()))) {
            lllllllllllllllIlIIIlIIIIIIlIIIl[lIIIIIlIIlIll[0]] = (Integer)lllllllllllllllIlIIIlIIIIIIIllll.popList.get(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_());
            int var10001 = lIIIIIlIIlIll[0];
            int var10003 = lIIIIIlIIlIll[0];
            lllllllllllllllIlIIIlIIIIIIlIIII[var10001] = lllllllllllllllIlIIIlIIIIIIlIIIl[var10003] += lIIIIIlIIlIll[1];
            lllllllllllllllIlIIIlIIIIIIIllll.popList.put(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_(), lllllllllllllllIlIIIlIIIIIIlIIII[lIIIIIlIIlIll[0]]);
            "".length();
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[7]]).append(lllllllllllllllIlIIIlIIIIIIlIIlI.getEntity().func_70005_c_()).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[8]]).append(lllllllllllllllIlIIIlIIIIIIlIIII[lIIIIIlIIlIll[0]]).append(lIIIIIlIIlIlI[lIIIIIlIIlIll[9]])));
         }

      }, new Predicate[lIIIIIlIIlIll[0]]);
      lllllllllllllllIlIIIlIIIIIlIlIlI.totemPopListener = new Listener((lllllllllllllllIlIIIlIIIIIIllIlI) -> {
         double lllllllllllllllIlIIIlIIIIIIllIIl = new SPacketEntityStatus[lIIIIIlIIlIll[1]];
         Entity[] lllllllllllllllIlIIIlIIIIIIllIll = new Entity[lIIIIIlIIlIll[1]];
         if (lIlIlIIIllIllI(mc.field_71441_e) && lIlIlIIIllIllI(mc.field_71439_g) && lIlIlIIIllIlII(lllllllllllllllIlIIIlIIIIIIllIlI.getPacket() instanceof SPacketEntityStatus)) {
            lllllllllllllllIlIIIlIIIIIIllIIl[lIIIIIlIIlIll[0]] = (SPacketEntityStatus)lllllllllllllllIlIIIlIIIIIIllIlI.getPacket();
            if (lIlIlIIIllIlll(lllllllllllllllIlIIIlIIIIIIllIIl[lIIIIIlIIlIll[0]].func_149160_c(), lIIIIIlIIlIll[3])) {
               lllllllllllllllIlIIIlIIIIIIllIll[lIIIIIlIIlIll[0]] = lllllllllllllllIlIIIlIIIIIIllIIl[lIIIIIlIIlIll[0]].func_149161_a(mc.field_71441_e);
               SnowMod.EVENT_BUS.post(new TotemPopEvent(lllllllllllllllIlIIIlIIIIIIllIll[lIIIIIlIIlIll[0]]));
            }
         }

      }, new Predicate[lIIIIIlIIlIll[0]]);
   }

   private static boolean lIlIlIIIlllIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIlIlIIIllIIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
