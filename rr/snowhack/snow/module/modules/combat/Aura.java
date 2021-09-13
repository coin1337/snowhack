package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.LagCompensator;

@Module.Info(
   name = "Aura",
   category = Module.Category.COMBAT,
   description = "Hits entities around you"
)
public class Aura extends Module {
   // $FF: synthetic field
   private Setting<Boolean> mobs;
   // $FF: synthetic field
   private static final int[] lIIIlIllIIIII;
   // $FF: synthetic field
   private static final String[] lIIIlIlIlllll;
   // $FF: synthetic field
   private Setting<Aura.Priority> priority;
   // $FF: synthetic field
   private static boolean isSpoofingAngles;
   // $FF: synthetic field
   private static boolean togglePitch;
   // $FF: synthetic field
   private Setting<Float> range;
   // $FF: synthetic field
   private Setting<Boolean> ignoreWalls;
   // $FF: synthetic field
   private Setting<Boolean> swordOnly;
   // $FF: synthetic field
   int oldSlot;
   // $FF: synthetic field
   private Setting<Boolean> players;
   // $FF: synthetic field
   private static double pitch;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Send> packetListener;
   // $FF: synthetic field
   private static double yaw;
   // $FF: synthetic field
   private Setting<Boolean> animals;

   public String getHudInfo() {
      return lllllllllllllllIIllIlIIllIlllllI.priority.getValueAsString().replaceAll(lIIIlIlIlllll[lIIIlIllIIIII[8]], lIIIlIlIlllll[lIIIlIllIIIII[9]]);
   }

   private static int lIllIIIlllIIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static String lIllIIIllIllII(String lllllllllllllllIIllIlIIlIllllIIl, String lllllllllllllllIIllIlIIlIllllIII) {
      try {
         boolean lllllllllllllllIIllIlIIlIlllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllllIII.getBytes(StandardCharsets.UTF_8)), lIIIlIllIIIII[9]), "DES");
         Cipher lllllllllllllllIIllIlIIlIllllIll = Cipher.getInstance("DES");
         lllllllllllllllIIllIlIIlIllllIll.init(lIIIlIllIIIII[3], lllllllllllllllIIllIlIIlIlllIlIl);
         return new String(lllllllllllllllIIllIlIIlIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIIllllIII(Object var0) {
      return var0 != null;
   }

   private boolean canEntityFeetBeSeen(Entity lllllllllllllllIIllIlIIllIlllIlI) {
      if (lIllIIIlllIIIl((Boolean)lllllllllllllllIIllIlIIllIlllIIl.ignoreWalls.getValue())) {
         return (boolean)lIIIlIllIIIII[2];
      } else {
         int var10000;
         if (lIllIIIllllIlI(mc.field_71441_e.func_147447_a(new Vec3d(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u + (double)mc.field_71439_g.func_70047_e(), mc.field_71439_g.field_70161_v), new Vec3d(lllllllllllllllIIllIlIIllIlllIlI.field_70165_t, lllllllllllllllIIllIlIIllIlllIlI.field_70163_u, lllllllllllllllIIllIlIIllIlllIlI.field_70161_v), (boolean)lIIIlIllIIIII[1], (boolean)lIIIlIllIIIII[2], (boolean)lIIIlIllIIIII[1]))) {
            var10000 = lIIIlIllIIIII[2];
            "".length();
            if (" ".length() << " ".length() != " ".length() << " ".length()) {
               return (boolean)(" ".length() << (159 ^ 154) & ~(" ".length() << (46 ^ 43)));
            }
         } else {
            var10000 = lIIIlIllIIIII[1];
         }

         return (boolean)var10000;
      }
   }

   private static boolean lIllIIIlllIIll(int var0) {
      return var0 == 0;
   }

   private static boolean lIllIIIlllIlIl(Object var0, Object var1) {
      return var0 != var1;
   }

   private static void lIllIIIllIllll() {
      lIIIlIlIlllll = new String[lIIIlIllIIIII[10]];
      lIIIlIlIlllll[lIIIlIllIIIII[1]] = lIllIIIllIllII("ht9M7avaOHLCmgOP4Hhneg==", "qyfuJ");
      lIIIlIlIlllll[lIIIlIllIIIII[2]] = lIllIIIllIllIl("9I+Sm/KOtW0=", "tGdwl");
      lIIIlIlIlllll[lIIIlIllIIIII[3]] = lIllIIIllIllII("/L9EgIJ4FiM=", "PYrWU");
      lIIIlIlIlllll[lIIIlIllIIIII[4]] = lIllIIIllIllIl("uWnCW4cfOSs=", "Dqoay");
      lIIIlIlIlllll[lIIIlIllIIIII[5]] = lIllIIIllIlllI("Ig8xegQLCCI/", "jfEZV");
      lIIIlIlIlllll[lIIIlIllIIIII[6]] = lIllIIIllIllII("+c6fRHtYedjaRfJrogxlPg==", "QtjeN");
      lIIIlIlIlllll[lIIIlIllIIIII[7]] = lIllIIIllIllII("9/r/kPCJ/nOYhLqz24WXlg==", "tVWhW");
      lIIIlIlIlllll[lIIIlIllIIIII[8]] = lIllIIIllIlllI("Zw==", "EYznC");
      lIIIlIlIlllll[lIIIlIllIIIII[9]] = lIllIIIllIlllI("", "ffeKa");
   }

   public Aura() {
      lllllllllllllllIIllIlIIllllIIIII.oldSlot = lIIIlIllIIIII[0];
      lllllllllllllllIIllIlIIllllIIIII.priority = lllllllllllllllIIllIlIIllllIIIII.register(Settings.e(lIIIlIlIlllll[lIIIlIllIIIII[1]], Aura.Priority.Distance));
      lllllllllllllllIIllIlIIllllIIIII.players = lllllllllllllllIIllIlIIllllIIIII.register(Settings.b(lIIIlIlIlllll[lIIIlIllIIIII[2]]));
      lllllllllllllllIIllIlIIllllIIIII.mobs = lllllllllllllllIIllIlIIllllIIIII.register(Settings.booleanBuilder(lIIIlIlIlllll[lIIIlIllIIIII[3]]).withValue(Boolean.valueOf((boolean)lIIIlIllIIIII[1])));
      lllllllllllllllIIllIlIIllllIIIII.animals = lllllllllllllllIIllIlIIllllIIIII.register(Settings.booleanBuilder(lIIIlIlIlllll[lIIIlIllIIIII[4]]).withValue(Boolean.valueOf((boolean)lIIIlIllIIIII[1])));
      lllllllllllllllIIllIlIIllllIIIII.range = lllllllllllllllIIllIlIIllllIIIII.register(Settings.f(lIIIlIlIlllll[lIIIlIllIIIII[5]], 5.0F));
      lllllllllllllllIIllIlIIllllIIIII.ignoreWalls = lllllllllllllllIIllIlIIllllIIIII.register(Settings.b(lIIIlIlIlllll[lIIIlIllIIIII[6]], (boolean)lIIIlIllIIIII[2]));
      lllllllllllllllIIllIlIIllllIIIII.swordOnly = lllllllllllllllIIllIlIIllllIIIII.register(Settings.b(lIIIlIlIlllll[lIIIlIllIIIII[7]], (boolean)lIIIlIllIIIII[2]));
      lllllllllllllllIIllIlIIllllIIIII.packetListener = new Listener((lllllllllllllllIIllIlIIllIIllIlI) -> {
         double lllllllllllllllIIllIlIIllIIllIIl = lllllllllllllllIIllIlIIllIIllIlI.getPacket();
         if (lIllIIIlllIIIl(lllllllllllllllIIllIlIIllIIllIIl instanceof CPacketPlayer) && lIllIIIlllIIIl(isSpoofingAngles)) {
            ((CPacketPlayer)lllllllllllllllIIllIlIIllIIllIIl).field_149476_e = (float)yaw;
            ((CPacketPlayer)lllllllllllllllIIllIlIIllIIllIIl).field_149473_f = (float)pitch;
         }

      }, new Predicate[lIIIlIllIIIII[1]]);
   }

   private static boolean lIllIIIllllIlI(Object var0) {
      return var0 == null;
   }

   private static String lIllIIIllIllIl(String lllllllllllllllIIllIlIIlIllIlIlI, String lllllllllllllllIIllIlIIlIllIlIIl) {
      try {
         SecretKeySpec lllllllllllllllIIllIlIIlIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllllllllllllllIIllIlIIlIllIIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlIIlIllIIlll.init(lIIIlIllIIIII[3], lllllllllllllllIIllIlIIlIllIllll);
         return new String(lllllllllllllllIIllIlIIlIllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private float getLagComp() {
      return -(20.0F - LagCompensator.INSTANCE.getTickRate());
   }

   private static boolean lIllIIIllllIIl(int var0, int var1) {
      return var0 != var1;
   }

   private static void resetRotation() {
      if (lIllIIIlllIIIl(isSpoofingAngles)) {
         yaw = (double)mc.field_71439_g.field_70177_z;
         pitch = (double)mc.field_71439_g.field_70125_A;
         isSpoofingAngles = (boolean)lIIIlIllIIIII[1];
      }

   }

   private static boolean lIllIIIlllIlII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIllIIIlllIlll(int var0) {
      return var0 < 0;
   }

   private static boolean lIllIIIllllIll(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIllIIIlllIIII() {
      lIIIlIllIIIII = new int[11];
      lIIIlIllIIIII[0] = -" ".length();
      lIIIlIllIIIII[1] = ((93 ^ 82) << " ".length() ^ 241 ^ 194) << " ".length() & (((152 ^ 167) << " ".length() ^ 46 ^ 125) << " ".length() ^ -" ".length());
      lIIIlIllIIIII[2] = " ".length();
      lIIIlIllIIIII[3] = " ".length() << " ".length();
      lIIIlIllIIIII[4] = "   ".length();
      lIIIlIllIIIII[5] = " ".length() << (" ".length() << " ".length());
      lIIIlIllIIIII[6] = 111 ^ 106;
      lIIIlIllIIIII[7] = "   ".length() << " ".length();
      lIIIlIllIIIII[8] = 27 ^ 28;
      lIIIlIllIIIII[9] = " ".length() << "   ".length();
      lIIIlIllIIIII[10] = 126 ^ 119;
   }

   private static boolean lIllIIIlllIIIl(int var0) {
      return var0 != 0;
   }

   private void lookAtPacket(double lllllllllllllllIIllIlIIllIllIIIl, double lllllllllllllllIIllIlIIllIlIlIll, double lllllllllllllllIIllIlIIllIlIlIlI, EntityPlayer lllllllllllllllIIllIlIIllIlIlIIl) {
      double[] lllllllllllllllIIllIlIIllIlIllIl = EntityUtil.calculateLookAt(lllllllllllllllIIllIlIIllIllIIIl, lllllllllllllllIIllIlIIllIlIlIll, lllllllllllllllIIllIlIIllIlIlIlI, lllllllllllllllIIllIlIIllIlIlIIl);
      setYawAndPitch((float)lllllllllllllllIIllIlIIllIlIllIl[lIIIlIllIIIII[1]], (float)lllllllllllllllIIllIlIIllIlIllIl[lIIIlIllIIIII[2]]);
   }

   private static boolean lIllIIIlllIllI(int var0) {
      return var0 <= 0;
   }

   public void onUpdate() {
      if (!lIllIIIlllIIIl((Boolean)lllllllllllllllIIllIlIIlllIIlIIl.swordOnly.getValue()) || lIllIIIlllIIIl(mc.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemSword) && !lIllIIIlllIIll(mc.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemAxe)) {
         if (!lIllIIIlllIIIl(mc.field_71439_g.field_70128_L)) {
            int var10000;
            if (lIllIIIlllIIIl(mc.field_71439_g.func_184592_cb().func_77973_b().equals(Items.field_185159_cQ)) && lIllIIIlllIlII(mc.field_71439_g.func_184600_cs(), EnumHand.OFF_HAND)) {
               var10000 = lIIIlIllIIIII[2];
               "".length();
               if ("   ".length() < 0) {
                  return;
               }
            } else {
               var10000 = lIIIlIllIIIII[1];
            }

            boolean lllllllllllllllIIllIlIIlllIIlllI = var10000;
            if (!lIllIIIlllIIIl(mc.field_71439_g.func_184587_cr()) || !lIllIIIlllIIll(lllllllllllllllIIllIlIIlllIIlllI)) {
               List<Entity> lllllllllllllllIIllIlIIlllIIIlll = new ArrayList();
               if (lIllIIIlllIIIl((Boolean)lllllllllllllllIIllIlIIlllIIlIIl.players.getValue())) {
                  lllllllllllllllIIllIlIIlllIIIlll.addAll((Collection)mc.field_71441_e.field_73010_i.stream().filter((lllllllllllllllIIllIlIIllIIlllll) -> {
                     int var10000;
                     if (lIllIIIlllIIll(Friends.isFriend(lllllllllllllllIIllIlIIllIIlllll.func_70005_c_()))) {
                        var10000 = lIIIlIllIIIII[2];
                        "".length();
                        if ("   ".length() <= 0) {
                           return (boolean)((161 ^ 168) & ~(156 ^ 149));
                        }
                     } else {
                        var10000 = lIIIlIllIIIII[1];
                     }

                     return (boolean)var10000;
                  }).collect(Collectors.toList()));
                  "".length();
               }

               lllllllllllllllIIllIlIIlllIIIlll.addAll((Collection)mc.field_71441_e.field_72996_f.stream().filter((lllllllllllllllIIllIlIIllIlIIlII) -> {
                  int var2;
                  if (lIllIIIlllIIll(Friends.isFriend(lllllllllllllllIIllIlIIllIlIIlII.func_70005_c_())) && lIllIIIlllIIIl(EntityUtil.isLiving(lllllllllllllllIIllIlIIllIlIIlII))) {
                     Boolean var10000;
                     if (lIllIIIlllIIIl(EntityUtil.isPassive(lllllllllllllllIIllIlIIllIlIIlII))) {
                        var10000 = (Boolean)lllllllllllllllIIllIlIIllIlIIIll.animals.getValue();
                        "".length();
                        if (" ".length() < 0) {
                           return (boolean)((0 ^ 37) << " ".length() & ~((152 ^ 189) << " ".length()));
                        }
                     } else {
                        var10000 = (Boolean)lllllllllllllllIIllIlIIllIlIIIll.mobs.getValue();
                     }

                     if (lIllIIIlllIIIl(var10000)) {
                        var2 = lIIIlIllIIIII[2];
                        "".length();
                        if (((9 ^ 34) & ~(77 ^ 102)) >= " ".length()) {
                           return (boolean)((159 ^ 150) << (" ".length() << " ".length()) & ~((110 ^ 103) << (" ".length() << " ".length())));
                        }

                        return (boolean)var2;
                     }
                  }

                  var2 = lIIIlIllIIIII[1];
                  return (boolean)var2;
               }).collect(Collectors.toList()));
               "".length();
               float lllllllllllllllIIllIlIIlllIIllII = 36.0F;
               Float lllllllllllllllIIllIlIIlllIIlIll = (Float)lllllllllllllllIIllIlIIlllIIlIIl.range.getValue();
               char lllllllllllllllIIllIlIIlllIIIlII = null;
               Iterator lllllllllllllllIIllIlIIlllIIIIll = lllllllllllllllIIllIlIIlllIIIlll.iterator();

               while(lIllIIIlllIIIl(lllllllllllllllIIllIlIIlllIIIIll.hasNext())) {
                  Entity lllllllllllllllIIllIlIIlllIlIIII = (Entity)lllllllllllllllIIllIlIIlllIIIIll.next();
                  if (lIllIIIlllIlIl(lllllllllllllllIIllIlIIlllIlIIII, mc.field_71439_g)) {
                     if (lIllIIIlllIllI(lIllIIIlllIIlI(((EntityLivingBase)lllllllllllllllIIllIlIIlllIlIIII).func_110143_aJ(), 0.0F))) {
                        "".length();
                        if ((197 ^ 192) == 0) {
                           return;
                        }
                     } else {
                        switch(null.$SwitchMap$rr$snowhack$snow$module$modules$combat$Aura$Priority[((Aura.Priority)lllllllllllllllIIllIlIIlllIIlIIl.priority.getValue()).ordinal()]) {
                        case 1:
                           if (lIllIIIlllIllI(lIllIIIlllIIlI(((EntityLivingBase)lllllllllllllllIIllIlIIlllIlIIII).func_110143_aJ(), lllllllllllllllIIllIlIIlllIIllII))) {
                              lllllllllllllllIIllIlIIlllIIllII = ((EntityLivingBase)lllllllllllllllIIllIlIIlllIlIIII).func_110143_aJ();
                              lllllllllllllllIIllIlIIlllIIIlII = lllllllllllllllIIllIlIIlllIlIIII;
                              "".length();
                              if (" ".length() << " ".length() == "   ".length()) {
                                 return;
                              }
                           }
                           break;
                        case 2:
                           if (lIllIIIlllIllI(lIllIIIlllIIlI(mc.field_71439_g.func_70032_d(lllllllllllllllIIllIlIIlllIlIIII), lllllllllllllllIIllIlIIlllIIlIll))) {
                              lllllllllllllllIIllIlIIlllIIlIll = mc.field_71439_g.func_70032_d(lllllllllllllllIIllIlIIlllIlIIII);
                              lllllllllllllllIIllIlIIlllIIIlII = lllllllllllllllIIllIlIIlllIlIIII;
                           }
                        }

                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) <= -" ".length()) {
                           return;
                        }
                     }
                  }
               }

               if (!lIllIIIlllIlll(lIllIIIlllIIlI(mc.field_71439_g.func_184825_o(lllllllllllllllIIllIlIIlllIIlIIl.getLagComp()), 1.0F))) {
                  if (!lIllIIIlllIIIl(mc.field_71439_g.field_70173_aa % lIIIlIllIIIII[3])) {
                     if (lIllIIIllllIII(lllllllllllllllIIllIlIIlllIIIlII)) {
                        if (lIllIIIlllIIll(lllllllllllllllIIllIlIIlllIIlIIl.canEntityFeetBeSeen(lllllllllllllllIIllIlIIlllIIIlII))) {
                           return;
                        }

                        lllllllllllllllIIllIlIIlllIIlIIl.lookAtPacket(lllllllllllllllIIllIlIIlllIIIlII.field_70165_t, lllllllllllllllIIllIlIIlllIIIlII.field_70163_u, lllllllllllllllIIllIlIIlllIIIlII.field_70161_v, mc.field_71439_g);
                        mc.field_71442_b.func_78764_a(mc.field_71439_g, lllllllllllllllIIllIlIIlllIIIlII);
                        mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                        resetRotation();
                        if (lIllIIIllllIIl(lllllllllllllllIIllIlIIlllIIlIIl.oldSlot, lIIIlIllIIIII[0])) {
                           mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIIllIlIIlllIIlIIl.oldSlot;
                           lllllllllllllllIIllIlIIlllIIlIIl.oldSlot = lIIIlIllIIIII[0];
                        }
                     }

                     if (lIllIIIlllIIIl(isSpoofingAngles)) {
                        EntityPlayerSP var8;
                        if (lIllIIIlllIIIl(togglePitch)) {
                           var8 = mc.field_71439_g;
                           var8.field_70125_A = (float)((double)var8.field_70125_A + 4.0E-4D);
                           togglePitch = (boolean)lIIIlIllIIIII[1];
                           "".length();
                           if (" ".length() << " ".length() > "   ".length()) {
                              return;
                           }
                        } else {
                           var8 = mc.field_71439_g;
                           var8.field_70125_A = (float)((double)var8.field_70125_A - 4.0E-4D);
                           togglePitch = (boolean)lIIIlIllIIIII[2];
                        }
                     }

                  }
               }
            }
         }
      }
   }

   static {
      lIllIIIlllIIII();
      lIllIIIllIllll();
      togglePitch = (boolean)lIIIlIllIIIII[1];
   }

   private static String lIllIIIllIlllI(String lllllllllllllllIIllIlIIllIIIlllI, String lllllllllllllllIIllIlIIllIIIlIII) {
      lllllllllllllllIIllIlIIllIIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIllIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllIlIIllIIIllII = new StringBuilder();
      Exception lllllllllllllllIIllIlIIllIIIIllI = lllllllllllllllIIllIlIIllIIIlIII.toCharArray();
      int lllllllllllllllIIllIlIIllIIIlIlI = lIIIlIllIIIII[1];
      byte lllllllllllllllIIllIlIIllIIIIlII = lllllllllllllllIIllIlIIllIIIlllI.toCharArray();
      Exception lllllllllllllllIIllIlIIllIIIIIll = lllllllllllllllIIllIlIIllIIIIlII.length;
      int lllllllllllllllIIllIlIIllIIIIIlI = lIIIlIllIIIII[1];

      do {
         if (!lIllIIIllllIll(lllllllllllllllIIllIlIIllIIIIIlI, lllllllllllllllIIllIlIIllIIIIIll)) {
            return String.valueOf(lllllllllllllllIIllIlIIllIIIllII);
         }

         char lllllllllllllllIIllIlIIllIIIllll = lllllllllllllllIIllIlIIllIIIIlII[lllllllllllllllIIllIlIIllIIIIIlI];
         lllllllllllllllIIllIlIIllIIIllII.append((char)(lllllllllllllllIIllIlIIllIIIllll ^ lllllllllllllllIIllIlIIllIIIIllI[lllllllllllllllIIllIlIIllIIIlIlI % lllllllllllllllIIllIlIIllIIIIllI.length]));
         "".length();
         ++lllllllllllllllIIllIlIIllIIIlIlI;
         ++lllllllllllllllIIllIlIIllIIIIIlI;
         "".length();
      } while(" ".length() << " ".length() <= "   ".length());

      return null;
   }

   private static void setYawAndPitch(float lllllllllllllllIIllIlIIlllIllIlI, float lllllllllllllllIIllIlIIlllIllIll) {
      yaw = (double)lllllllllllllllIIllIlIIlllIllIlI;
      pitch = (double)lllllllllllllllIIllIlIIlllIllIll;
      isSpoofingAngles = (boolean)lIIIlIllIIIII[2];
   }

   private static enum Priority {
      // $FF: synthetic field
      Health;

      // $FF: synthetic field
      private static final int[] lIIIIIllIIIIl;
      // $FF: synthetic field
      Distance;

      // $FF: synthetic field
      private static final String[] lIIIIIllIIIII;

      private static void lIlIlIIllIIIIl() {
         lIIIIIllIIIIl = new int[4];
         lIIIIIllIIIIl[0] = ((36 ^ 45) << (" ".length() << (" ".length() << " ".length())) ^ 7 + 74 - -54 + 0) << (" ".length() << " ".length()) & (((96 ^ 127) << " ".length() ^ 107 ^ 66) << (" ".length() << " ".length()) ^ -" ".length());
         lIIIIIllIIIIl[1] = " ".length();
         lIIIIIllIIIIl[2] = " ".length() << " ".length();
         lIIIIIllIIIIl[3] = " ".length() << "   ".length();
      }

      static {
         lIlIlIIllIIIIl();
         lIlIlIIllIIIII();
         Distance = new Aura.Priority(lIIIIIllIIIII[lIIIIIllIIIIl[0]], lIIIIIllIIIIl[0]);
         Health = new Aura.Priority(lIIIIIllIIIII[lIIIIIllIIIIl[1]], lIIIIIllIIIIl[1]);
         Aura.Priority[] var10000 = new Aura.Priority[lIIIIIllIIIIl[2]];
         var10000[lIIIIIllIIIIl[0]] = Distance;
         var10000[lIIIIIllIIIIl[1]] = Health;
      }

      private static String lIlIlIIlIlllll(String lllllllllllllllIlIIIIlIllllIllIl, String lllllllllllllllIlIIIIlIllllIllII) {
         try {
            char lllllllllllllllIlIIIIlIllllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIllllIllII.getBytes(StandardCharsets.UTF_8)), lIIIIIllIIIIl[3]), "DES");
            Cipher lllllllllllllllIlIIIIlIllllIllll = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIlIllllIllll.init(lIIIIIllIIIIl[2], lllllllllllllllIlIIIIlIllllIlIIl);
            return new String(lllllllllllllllIlIIIIlIllllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIlIIllIIIII() {
         lIIIIIllIIIII = new String[lIIIIIllIIIIl[2]];
         lIIIIIllIIIII[lIIIIIllIIIIl[0]] = lIlIlIIlIlllll("LvfZnLPMaHZ2VlQLLKZAHQ==", "aDYlh");
         lIIIIIllIIIII[lIIIIIllIIIIl[1]] = lIlIlIIlIlllll("GBS/6p3YQzw=", "bxVZX");
      }
   }
}
