package rr.snowhack.snow.module.modules.client;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.client.CPacketChatMessage;
import net.minecraft.network.play.client.CPacketUseEntity;
import net.minecraft.network.play.client.CPacketUseEntity.Action;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;

@Module.Info(
   name = "AutoEz",
   category = Module.Category.CLIENT
)
public class AutoEz extends Module {
   // $FF: synthetic field
   private static final int[] lIIIIlllIIIlI;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> sendListener;
   // $FF: synthetic field
   private ConcurrentHashMap<String, Integer> targetedPlayers;
   // $FF: synthetic field
   private static final String[] lIIIIllIlllII;
   // $FF: synthetic field
   EntityPlayer player;
   // $FF: synthetic field
   @EventHandler
   public Listener<LivingDeathEvent> livingDeathEventListener;
   // $FF: synthetic field
   EntityLivingBase entity;
   // $FF: synthetic field
   private Setting<AutoEz.owns> own;
   // $FF: synthetic field
   String name;
   // $FF: synthetic field
   private Setting<AutoEz.modes> Mode;
   // $FF: synthetic field
   Entity targetEntity;
   // $FF: synthetic field
   CPacketUseEntity cPacketUseEntity;

   private static boolean lIlIllIlIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIlIllIlIIlIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIllIlIIllIl(int var0) {
      return var0 > 0;
   }

   private static boolean lIlIllIlIIlllI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIllIlIlIIlI(Object var0) {
      return var0 != null;
   }

   private static String lIlIllIIllIlIl(String lllllllllllllllIIllllIlIlIIIIIlI, String lllllllllllllllIIllllIlIlIIIIIIl) {
      lllllllllllllllIIllllIlIlIIIIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIIllllIlIlIIIIIII = new StringBuilder();
      String lllllllllllllllIIllllIlIIlllllll = lllllllllllllllIIllllIlIlIIIIIIl.toCharArray();
      char lllllllllllllllIIllllIlIIllllllI = lIIIIlllIIIlI[0];
      String lllllllllllllllIIllllIlIIlllllIl = lllllllllllllllIIllllIlIlIIIIIlI.toCharArray();
      float lllllllllllllllIIllllIlIIlllllII = lllllllllllllllIIllllIlIIlllllIl.length;
      int lllllllllllllllIIllllIlIIllllIll = lIIIIlllIIIlI[0];

      do {
         if (!lIlIllIlIlIlII(lllllllllllllllIIllllIlIIllllIll, lllllllllllllllIIllllIlIIlllllII)) {
            return String.valueOf(lllllllllllllllIIllllIlIlIIIIIII);
         }

         int lllllllllllllllIIllllIlIIllllIlI = lllllllllllllllIIllllIlIIlllllIl[lllllllllllllllIIllllIlIIllllIll];
         lllllllllllllllIIllllIlIlIIIIIII.append((char)(lllllllllllllllIIllllIlIIllllIlI ^ lllllllllllllllIIllllIlIIlllllll[lllllllllllllllIIllllIlIIllllllI % lllllllllllllllIIllllIlIIlllllll.length]));
         "".length();
         ++lllllllllllllllIIllllIlIIllllllI;
         ++lllllllllllllllIIllllIlIIllllIll;
         "".length();
      } while(null == null);

      return null;
   }

   public AutoEz() {
      lllllllllllllllIIllllIlIllIllIll.Mode = lllllllllllllllIIllllIlIllIllIll.register(Settings.e(lIIIIllIlllII[lIIIIlllIIIlI[0]], AutoEz.modes.AAAA));
      lllllllllllllllIIllllIlIllIllIll.own = lllllllllllllllIIllllIlIllIllIll.register(Settings.enumBuilder(AutoEz.owns.class).withName(lIIIIllIlllII[lIIIIlllIIIlI[1]]).withValue(AutoEz.owns.Snow).withVisibility((lllllllllllllllIIllllIlIlIIlIIll) -> {
         int var10000;
         if (lIlIllIlIlIIll(lllllllllllllllIIllllIlIlIIlIlII.Mode.getValue(), AutoEz.modes.AAAA) && lIlIllIlIlIIll(lllllllllllllllIIllllIlIlIIlIlII.Mode.getValue(), AutoEz.modes.OnTop)) {
            var10000 = lIIIIlllIIIlI[1];
            "".length();
            if (" ".length() == " ".length() << (" ".length() << " ".length())) {
               return (boolean)(" ".length() & ~" ".length());
            }
         } else {
            var10000 = lIIIIlllIIIlI[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIIllllIlIllIllIll.sendListener = new Listener((lllllllllllllllIIllllIlIlIIlIllI) -> {
         if (lIlIllIlIlIIlI(mc.field_71439_g)) {
            if (lIlIllIlIIlIll(lllllllllllllllIIllllIlIlIIlIlll.targetedPlayers)) {
               lllllllllllllllIIllllIlIlIIlIlll.targetedPlayers = new ConcurrentHashMap();
            }

            if (lIlIllIlIIllII(lllllllllllllllIIllllIlIlIIlIllI.getPacket() instanceof CPacketUseEntity)) {
               lllllllllllllllIIllllIlIlIIlIlll.cPacketUseEntity = (CPacketUseEntity)lllllllllllllllIIllllIlIlIIlIllI.getPacket();
               if (lIlIllIlIIllII(lllllllllllllllIIllllIlIlIIlIlll.cPacketUseEntity.func_149565_c().equals(Action.ATTACK))) {
                  lllllllllllllllIIllllIlIlIIlIlll.targetEntity = lllllllllllllllIIllllIlIlIIlIlll.cPacketUseEntity.func_149564_a(mc.field_71441_e);
                  if (lIlIllIlIIllII(EntityUtil.isPlayer(lllllllllllllllIIllllIlIlIIlIlll.targetEntity))) {
                     lllllllllllllllIIllllIlIlIIlIlll.addTargetedPlayer(lllllllllllllllIIllllIlIlIIlIlll.targetEntity.func_70005_c_());
                  }
               }
            }
         }

      }, new Predicate[lIIIIlllIIIlI[0]]);
      lllllllllllllllIIllllIlIllIllIll.livingDeathEventListener = new Listener((lllllllllllllllIIllllIlIlIIlllII) -> {
         if (lIlIllIlIlIIlI(mc.field_71439_g)) {
            if (lIlIllIlIIlIll(lllllllllllllllIIllllIlIlIIlllll.targetedPlayers)) {
               lllllllllllllllIIllllIlIlIIlllll.targetedPlayers = new ConcurrentHashMap();
            }

            lllllllllllllllIIllllIlIlIIlllll.entity = lllllllllllllllIIllllIlIlIIlllII.getEntityLiving();
            if (lIlIllIlIlIIlI(lllllllllllllllIIllllIlIlIIlllll.entity) && lIlIllIlIIllII(EntityUtil.isPlayer(lllllllllllllllIIllllIlIlIIlllll.entity))) {
               lllllllllllllllIIllllIlIlIIlllll.player = (EntityPlayer)lllllllllllllllIIllllIlIlIIlllll.entity;
               if (lIlIllIlIlIIII(lIlIllIlIlIIIl(lllllllllllllllIIllllIlIlIIlllll.player.func_110143_aJ(), 0.0F))) {
                  lllllllllllllllIIllllIlIlIIlllll.name = lllllllllllllllIIllllIlIlIIlllll.player.func_70005_c_();
                  if (lIlIllIlIIllII(lllllllllllllllIIllllIlIlIIlllll.shouldAnnounce(lllllllllllllllIIllllIlIlIIlllll.name))) {
                     lllllllllllllllIIllllIlIlIIlllll.doAnnounce(lllllllllllllllIIllllIlIlIIlllll.name);
                  }
               }
            }
         }

      }, new Predicate[lIIIIlllIIIlI[0]]);
   }

   private static boolean lIlIllIlIlIIII(int var0) {
      return var0 <= 0;
   }

   private static boolean lIlIllIlIIlIll(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIllIlIIllll(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIlIllIlIIlIlI(int var0) {
      return var0 == 0;
   }

   public void onUpdate() {
      if (lIlIllIlIIlIlI(lllllllllllllllIIllllIlIllIIlIll.isDisabled()) && !lIlIllIlIIlIll(mc.field_71439_g)) {
         if (lIlIllIlIIlIll(lllllllllllllllIIllllIlIllIIlIll.targetedPlayers)) {
            lllllllllllllllIIllllIlIllIIlIll.targetedPlayers = new ConcurrentHashMap();
         }

         Iterator lllllllllllllllIIllllIlIllIIlIIl = mc.field_71441_e.func_72910_y().iterator();

         while(lIlIllIlIIllII(lllllllllllllllIIllllIlIllIIlIIl.hasNext())) {
            byte lllllllllllllllIIllllIlIllIIlIII = (Entity)lllllllllllllllIIllllIlIllIIlIIl.next();
            if (lIlIllIlIIlIlI(EntityUtil.isPlayer(lllllllllllllllIIllllIlIllIIlIII))) {
               "".length();
               if ((40 ^ 45) == 0) {
                  return;
               }
            } else {
               EntityPlayer lllllllllllllllIIllllIlIllIIlllI = (EntityPlayer)lllllllllllllllIIllllIlIllIIlIII;
               if (lIlIllIlIIllIl(lIlIllIlIIlIIl(lllllllllllllllIIllllIlIllIIlllI.func_110143_aJ(), 0.0F))) {
                  "".length();
                  if (" ".length() == 0) {
                     return;
                  }
               } else {
                  String lllllllllllllllIIllllIlIllIIllIl = lllllllllllllllIIllllIlIllIIlllI.func_70005_c_();
                  if (lIlIllIlIIllII(lllllllllllllllIIllllIlIllIIlIll.shouldAnnounce(lllllllllllllllIIllllIlIllIIllIl))) {
                     lllllllllllllllIIllllIlIllIIlIll.doAnnounce(lllllllllllllllIIllllIlIllIIllIl);
                     "".length();
                     if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                        return;
                     }
                     break;
                  }

                  "".length();
                  if (" ".length() << " ".length() < 0) {
                     return;
                  }
               }
            }
         }

         lllllllllllllllIIllllIlIllIIlIll.targetedPlayers.forEach((lllllllllllllllIIllllIlIlIlIIIll, lllllllllllllllIIllllIlIlIlIIIlI) -> {
            if (lIlIllIlIlIIII(lllllllllllllllIIllllIlIlIlIIIlI)) {
               lllllllllllllllIIllllIlIlIlIIlll.targetedPlayers.remove(lllllllllllllllIIllllIlIlIlIIIll);
               "".length();
               "".length();
               if (" ".length() << " ".length() == " ".length()) {
                  return;
               }
            } else {
               lllllllllllllllIIllllIlIlIlIIlll.targetedPlayers.put(lllllllllllllllIIllllIlIlIlIIIll, lllllllllllllllIIllllIlIlIlIIIlI - lIIIIlllIIIlI[1]);
               "".length();
            }

         });
      }
   }

   private static String lIlIllIIllIllI(String lllllllllllllllIIllllIlIIlllIIlI, String lllllllllllllllIIllllIlIIlllIIIl) {
      try {
         SecretKeySpec lllllllllllllllIIllllIlIIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIlIIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIIIIlllIIIlI[8]), "DES");
         short lllllllllllllllIIllllIlIIllIllIl = Cipher.getInstance("DES");
         lllllllllllllllIIllllIlIIllIllIl.init(lIIIIlllIIIlI[2], lllllllllllllllIIllllIlIIlllIlIl);
         return new String(lllllllllllllllIIllllIlIIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIlIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void addTargetedPlayer(String lllllllllllllllIIllllIlIlIllIIII) {
      if (!lIlIllIlIIllII(Objects.equals(lllllllllllllllIIllllIlIlIllIIII, mc.field_71439_g.func_70005_c_()))) {
         if (lIlIllIlIIlIll(lllllllllllllllIIllllIlIlIllIIIl.targetedPlayers)) {
            lllllllllllllllIIllllIlIlIllIIIl.targetedPlayers = new ConcurrentHashMap();
         }

         lllllllllllllllIIllllIlIlIllIIIl.targetedPlayers.put(lllllllllllllllIIllllIlIlIllIIII, lIIIIlllIIIlI[14]);
         "".length();
      }
   }

   private static int lIlIllIlIlIIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void lIlIllIlIIlIII() {
      lIIIIlllIIIlI = new int[18];
      lIIIIlllIIIlI[0] = (15 + 25 - -28 + 65 ^ (86 ^ 103) << (" ".length() << " ".length())) & (118 + 108 - 198 + 103 ^ (77 ^ 44) << " ".length() ^ -" ".length());
      lIIIIlllIIIlI[1] = " ".length();
      lIIIIlllIIIlI[2] = " ".length() << " ".length();
      lIIIIlllIIIlI[3] = "   ".length();
      lIIIIlllIIIlI[4] = " ".length() << (" ".length() << " ".length());
      lIIIIlllIIIlI[5] = (67 ^ 114) << (" ".length() << " ".length()) ^ 158 + 59 - 32 + 8;
      lIIIIlllIIIlI[6] = "   ".length() << " ".length();
      lIIIIlllIIIlI[7] = 82 ^ 85;
      lIIIIlllIIIlI[8] = " ".length() << "   ".length();
      lIIIIlllIIIlI[9] = 26 ^ 19;
      lIIIIlllIIIlI[10] = (117 ^ 112) << " ".length();
      lIIIIlllIIIlI[11] = 114 ^ 121;
      lIIIIlllIIIlI[12] = "   ".length() << (" ".length() << " ".length());
      lIIIIlllIIIlI[13] = 41 + 164 - 133 + 183;
      lIIIIlllIIIlI[14] = (88 ^ 93) << (" ".length() << " ".length());
      lIIIIlllIIIlI[15] = 172 ^ 161;
      lIIIIlllIIIlI[16] = ((188 ^ 177) << (" ".length() << " ".length()) ^ 122 ^ 73) << " ".length();
      lIIIIlllIIIlI[17] = 77 ^ 66;
   }

   public String getHudInfo() {
      return lllllllllllllllIIllllIlIlIlIlIll.Mode.getValueAsString().replaceAll(lIIIIllIlllII[lIIIIlllIIIlI[15]], lIIIIllIlllII[lIIIIlllIIIlI[16]]);
   }

   private static boolean lIlIllIlIlIIll(Object var0, Object var1) {
      return var0 != var1;
   }

   private static void lIlIllIlIIIIll() {
      lIIIIllIlllII = new String[lIIIIlllIIIlI[17]];
      lIIIIllIlllII[lIIIIlllIIIlI[0]] = lIlIllIIllIlIl("LhhxFSwPJw==", "kBQXC");
      lIIIIllIlllII[lIIIIlllIIIlI[1]] = lIlIllIIllIllI("HMXqFU5Kg2zV6HkoqqhuTA==", "Wdxpi");
      lIIIIllIlllII[lIIIIlllIIIlI[2]] = lIlIllIIllIlll("F0YI/MzHVWM=", "Pgaxp");
      lIIIIllIlllII[lIIIIlllIIIlI[3]] = lIlIllIIllIlll("578dQG/PbYDTNHeYKoBScQ==", "AJlAw");
      lIIIIllIlllII[lIIIIlllIIIlI[4]] = lIlIllIIllIlll("qHxpZG2bBCI=", "HXGJW");
      lIIIIllIlllII[lIIIIlllIIIlI[5]] = lIlIllIIllIllI("T0IvLMPoJ29bjZ7OjuehExJdacD/Ht7LPDGExu87m1ZO7Or/4NVf9w==", "IbpZf");
      lIIIIllIlllII[lIIIIlllIIIlI[6]] = lIlIllIIllIllI("F5KkO71PEwAU6WvnLQ0Pf3AP+N9GHbiO", "YVQat");
      lIIIIllIlllII[lIIIIlllIIIlI[7]] = lIlIllIIllIllI("axeusG9tgq8=", "Lbnst");
      lIIIIllIlllII[lIIIIlllIIIlI[8]] = lIlIllIIllIlIl("NC09GBguKg==", "GCRou");
      lIIIIllIlllII[lIIIIlllIIIlI[9]] = lIlIllIIllIlll("h309HCmuWlxbt0rbIP/nPQ==", "otwUI");
      lIIIIllIlllII[lIIIIlllIIIlI[10]] = lIlIllIIllIlIl("ZyEzKz1nIyFlLykqZCQiKw==", "GNDEN");
      lIIIIllIlllII[lIIIIlllIIIlI[11]] = lIlIllIIllIllI("ffU5k8aKeOU=", "MATzG");
      lIIIIllIlllII[lIIIIlllIIIlI[12]] = lIlIllIIllIllI("HLXpMZllnyo=", "UqOCS");
      lIIIIllIlllII[lIIIIlllIIIlI[15]] = lIlIllIIllIlIl("Vg==", "tzVet");
      lIIIIllIlllII[lIIIIlllIIIlI[16]] = lIlIllIIllIlll("eGI6PJWrfrw=", "erXYq");
   }

   private static String lIlIllIIllIlll(String lllllllllllllllIIllllIlIIllIIlIl, String lllllllllllllllIIllllIlIIllIIIlI) {
      try {
         boolean lllllllllllllllIIllllIlIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIlIIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIIllllIlIIllIIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllllIlIIllIIlll.init(lIIIIlllIIIlI[2], lllllllllllllllIIllllIlIIllIIIIl);
         return new String(lllllllllllllllIIllllIlIIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIlIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIllIlIIllII(int var0) {
      return var0 != 0;
   }

   static {
      lIlIllIlIIlIII();
      lIlIllIlIIIIll();
   }

   public void onEnable() {
      lllllllllllllllIIllllIlIllIllIII.targetedPlayers = new ConcurrentHashMap();
   }

   public void onDisable() {
      lllllllllllllllIIllllIlIllIlIlIl.targetedPlayers = null;
   }

   private void doAnnounce(String lllllllllllllllIIllllIlIlIlllIlI) {
      lllllllllllllllIIllllIlIlIllIlll.targetedPlayers.remove(lllllllllllllllIIllllIlIlIlllIlI);
      "".length();
      short lllllllllllllllIIllllIlIlIllIlIl = new StringBuilder();
      switch(null.$SwitchMap$rr$snowhack$snow$module$modules$client$AutoEz$modes[((AutoEz.modes)lllllllllllllllIIllllIlIlIllIlll.Mode.getValue()).ordinal()]) {
      case 1:
         "".length();
         if (" ".length() << (" ".length() << " ".length()) == ((85 + 141 - 136 + 95 ^ (162 ^ 169) << (" ".length() << (" ".length() << " ".length()))) << "   ".length() & ((141 + 156 - 249 + 137 ^ (37 ^ 46) << (" ".length() << (" ".length() << " ".length()))) << "   ".length() ^ -" ".length()))) {
            return;
         }
         break;
      case 2:
         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[2]]);
         "".length();
         "".length();
         if (((115 ^ 40 ^ (22 ^ 17) << "   ".length()) & ((82 ^ 75) << "   ".length() ^ 44 + 138 - 158 + 147 ^ -" ".length())) != (((62 ^ 31) << (" ".length() << " ".length()) ^ 61 + 108 - 36 + 52) & (132 ^ 167 ^ (173 ^ 162) << " ".length() ^ -" ".length()))) {
            return;
         }
         break;
      case 3:
         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[3]]);
         "".length();
         "".length();
         if (" ".length() << " ".length() == 0) {
            return;
         }
         break;
      case 4:
         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[4]]);
         "".length();
      }

      lllllllllllllllIIllllIlIlIllIlIl.append(lllllllllllllllIIllllIlIlIlllIlI);
      "".length();
      if (lIlIllIlIIlllI(lllllllllllllllIIllllIlIlIllIlll.Mode.getValue(), AutoEz.modes.AAAA)) {
         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[5]]);
         "".length();
         "".length();
         if (" ".length() << (" ".length() << " ".length()) <= " ".length()) {
            return;
         }
      } else if (lIlIllIlIIlllI(lllllllllllllllIIllllIlIlIllIlll.Mode.getValue(), AutoEz.modes.OnTop)) {
         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[6]]);
         "".length();
         "".length();
         if (((228 ^ 171 ^ (120 ^ 91) << " ".length()) << (" ".length() << " ".length()) & ((44 + 13 - -3 + 107 ^ (100 ^ 51) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
            return;
         }
      } else {
         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[7]]);
         "".length();
         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$client$AutoEz$owns[((AutoEz.owns)lllllllllllllllIIllllIlIlIllIlll.own.getValue()).ordinal()]) {
         case 1:
            lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[8]]);
            "".length();
            "".length();
            if (((48 ^ 55 ^ " ".length() << " ".length()) & ((160 ^ 139) << " ".length() ^ 238 ^ 189 ^ -" ".length())) < 0) {
               return;
            }
            break;
         case 2:
            lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[9]]);
            "".length();
         }

         lllllllllllllllIIllllIlIlIllIlIl.append(lIIIIllIlllII[lIIIIlllIIIlI[10]]);
         "".length();
      }

      String lllllllllllllllIIllllIlIlIlllIII = String.valueOf(lllllllllllllllIIllllIlIlIllIlIl).replaceAll(lIIIIllIlllII[lIIIIlllIIIlI[11]], lIIIIllIlllII[lIIIIlllIIIlI[12]]);
      if (lIlIllIlIIllll(lllllllllllllllIIllllIlIlIlllIII.length(), lIIIIlllIIIlI[13])) {
         lllllllllllllllIIllllIlIlIlllIII = lllllllllllllllIIllllIlIlIlllIII.substring(lIIIIlllIIIlI[0], lIIIIlllIIIlI[13]);
      }

      mc.field_71439_g.field_71174_a.func_147297_a(new CPacketChatMessage(lllllllllllllllIIllllIlIlIlllIII));
   }

   private boolean shouldAnnounce(String lllllllllllllllIIllllIlIllIIIIlI) {
      return lllllllllllllllIIllllIlIllIIIIll.targetedPlayers.containsKey(lllllllllllllllIIllllIlIllIIIIlI);
   }

   private static enum owns {
      // $FF: synthetic field
      private static final String[] lIIIlIlIIlIll;
      // $FF: synthetic field
      private static final int[] lIIIlIlIIlllI;
      // $FF: synthetic field
      Snow,
      // $FF: synthetic field
      Hack;

      private static String lIllIIIIlllIII(String lllllllllllllllIIllIllIlIIIlIIII, String lllllllllllllllIIllIllIlIIIlIIIl) {
         try {
            SecretKeySpec lllllllllllllllIIllIllIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIlIIIlIlll.init(lIIIlIlIIlllI[2], lllllllllllllllIIllIllIlIIIllIII);
            return new String(lllllllllllllllIIllIllIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static void lIllIIIIlllIll() {
         lIIIlIlIIlllI = new int[3];
         lIIIlIlIIlllI[0] = (133 + 64 - 152 + 190 ^ (171 ^ 174) << (116 ^ 113)) & (38 + 244 - 121 + 90 ^ (176 ^ 187) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length());
         lIIIlIlIIlllI[1] = " ".length();
         lIIIlIlIIlllI[2] = " ".length() << " ".length();
      }

      private static void lIllIIIIlllIlI() {
         lIIIlIlIIlIll = new String[lIIIlIlIIlllI[2]];
         lIIIlIlIIlIll[lIIIlIlIIlllI[0]] = lIllIIIIlllIII("7T2cZxeYtLo=", "TTeIY");
         lIIIlIlIIlIll[lIIIlIlIIlllI[1]] = lIllIIIIlllIII("PTiwGQgspxk=", "GrkeE");
      }

      static {
         lIllIIIIlllIll();
         lIllIIIIlllIlI();
         Snow = new AutoEz.owns(lIIIlIlIIlIll[lIIIlIlIIlllI[0]], lIIIlIlIIlllI[0]);
         Hack = new AutoEz.owns(lIIIlIlIIlIll[lIIIlIlIIlllI[1]], lIIIlIlIIlllI[1]);
         AutoEz.owns[] var10000 = new AutoEz.owns[lIIIlIlIIlllI[2]];
         var10000[lIIIlIlIIlllI[0]] = Snow;
         var10000[lIIIlIlIIlllI[1]] = Hack;
      }
   }

   private static enum modes {
      // $FF: synthetic field
      EZZZ;

      // $FF: synthetic field
      private static final int[] lIIIIIlIlIlll;
      // $FF: synthetic field
      NiceFight,
      // $FF: synthetic field
      OnTop,
      // $FF: synthetic field
      AAAA;

      // $FF: synthetic field
      private static final String[] lIIIIIlIlIlII;

      private static String lIlIlIIlIIIlIl(String lllllllllllllllIlIIIIlllIIIIIllI, String lllllllllllllllIlIIIIlllIIIIIIll) {
         try {
            boolean lllllllllllllllIlIIIIlllIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlllIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlllIIIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlllIIIIlIII.init(lIIIIIlIlIlll[2], lllllllllllllllIlIIIIlllIIIIIIlI);
            return new String(lllllllllllllllIlIIIIlllIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIlIlIIlIIlIIl(String lllllllllllllllIlIIIIllIllllIIIl, String lllllllllllllllIlIIIIllIllllIlIl) {
         lllllllllllllllIlIIIIllIllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIllIllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         String lllllllllllllllIlIIIIllIlllIllll = new StringBuilder();
         char[] lllllllllllllllIlIIIIllIllllIIll = lllllllllllllllIlIIIIllIllllIlIl.toCharArray();
         int lllllllllllllllIlIIIIllIllllIIlI = lIIIIIlIlIlll[0];
         float lllllllllllllllIlIIIIllIlllIllII = lllllllllllllllIlIIIIllIllllIIIl.toCharArray();
         int lllllllllllllllIlIIIIllIlllIlIll = lllllllllllllllIlIIIIllIlllIllII.length;
         int lllllllllllllllIlIIIIllIlllIlIlI = lIIIIIlIlIlll[0];

         do {
            if (!lIlIlIIlIIllIl(lllllllllllllllIlIIIIllIlllIlIlI, lllllllllllllllIlIIIIllIlllIlIll)) {
               return String.valueOf(lllllllllllllllIlIIIIllIlllIllll);
            }

            long lllllllllllllllIlIIIIllIlllIlIIl = lllllllllllllllIlIIIIllIlllIllII[lllllllllllllllIlIIIIllIlllIlIlI];
            lllllllllllllllIlIIIIllIlllIllll.append((char)(lllllllllllllllIlIIIIllIlllIlIIl ^ lllllllllllllllIlIIIIllIllllIIll[lllllllllllllllIlIIIIllIllllIIlI % lllllllllllllllIlIIIIllIllllIIll.length]));
            "".length();
            ++lllllllllllllllIlIIIIllIllllIIlI;
            ++lllllllllllllllIlIIIIllIlllIlIlI;
            "".length();
         } while(null == null);

         return null;
      }

      static {
         lIlIlIIlIIllII();
         lIlIlIIlIIlIll();
         EZZZ = new AutoEz.modes(lIIIIIlIlIlII[lIIIIIlIlIlll[0]], lIIIIIlIlIlll[0]);
         NiceFight = new AutoEz.modes(lIIIIIlIlIlII[lIIIIIlIlIlll[1]], lIIIIIlIlIlll[1]);
         AAAA = new AutoEz.modes(lIIIIIlIlIlII[lIIIIIlIlIlll[2]], lIIIIIlIlIlll[2]);
         OnTop = new AutoEz.modes(lIIIIIlIlIlII[lIIIIIlIlIlll[3]], lIIIIIlIlIlll[3]);
         AutoEz.modes[] var10000 = new AutoEz.modes[lIIIIIlIlIlll[4]];
         var10000[lIIIIIlIlIlll[0]] = EZZZ;
         var10000[lIIIIIlIlIlll[1]] = NiceFight;
         var10000[lIIIIIlIlIlll[2]] = AAAA;
         var10000[lIIIIIlIlIlll[3]] = OnTop;
      }

      private static String lIlIlIIlIIlIlI(String lllllllllllllllIlIIIIlllIIIlIIIl, String lllllllllllllllIlIIIIlllIIIlIIII) {
         try {
            Exception lllllllllllllllIlIIIIlllIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlllIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIIIlIlIlll[5]), "DES");
            char lllllllllllllllIlIIIIlllIIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIlllIIIIlllI.init(lIIIIIlIlIlll[2], lllllllllllllllIlIIIIlllIIIIllll);
            return new String(lllllllllllllllIlIIIIlllIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlllIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIlIIlIIlIll() {
         lIIIIIlIlIlII = new String[lIIIIIlIlIlll[4]];
         lIIIIIlIlIlII[lIIIIIlIlIlll[0]] = lIlIlIIlIIIlIl("NL6dpkCJtfo=", "ATShs");
         lIIIIIlIlIlII[lIIIIIlIlIlll[1]] = lIlIlIIlIIlIIl("ChkwNy0tFzsm", "DpSRk");
         lIIIIIlIlIlII[lIIIIIlIlIlll[2]] = lIlIlIIlIIlIlI("mfVSr7MYWQk=", "bvWKa");
         lIIIIIlIlIlII[lIIIIIlIlIlll[3]] = lIlIlIIlIIlIlI("eZlX2siYx+Q=", "bSsBT");
      }

      private static boolean lIlIlIIlIIllIl(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIlIlIIlIIllII() {
         lIIIIIlIlIlll = new int[6];
         lIIIIIlIlIlll[0] = (207 ^ 144 ^ (13 ^ 48) << " ".length()) & (40 ^ 23 ^ (52 ^ 57) << " ".length() ^ -" ".length());
         lIIIIIlIlIlll[1] = " ".length();
         lIIIIIlIlIlll[2] = " ".length() << " ".length();
         lIIIIIlIlIlll[3] = "   ".length();
         lIIIIIlIlIlll[4] = " ".length() << (" ".length() << " ".length());
         lIIIIIlIlIlll[5] = " ".length() << "   ".length();
      }
   }
}
