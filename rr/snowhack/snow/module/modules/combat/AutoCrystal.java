package rr.snowhack.snow.module.modules.combat;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.CombatRules;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Explosion;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.module.modules.client.AutoEz;
import rr.snowhack.snow.module.modules.client.GUIColor;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.ColourUtils;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.LagCompensator;
import rr.snowhack.snow.util.MathUtil;
import rr.snowhack.snow.util.SnowTessellator;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "AutoCrystal",
   category = Module.Category.COMBAT,
   description = "Places End Crystals to kill enemies"
)
public class AutoCrystal extends Module {
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Receive> packetReceiveListener;
   // $FF: synthetic field
   private Setting<Boolean> mobs;
   // $FF: synthetic field
   private Setting<Double> fpHealth;
   // $FF: synthetic field
   private Setting<Integer> green;
   // $FF: synthetic field
   double damage;
   // $FF: synthetic field
   private Setting<Integer> alpha;
   // $FF: synthetic field
   private Setting<Boolean> rainbowRender;
   // $FF: synthetic field
   private Setting<Boolean> place;
   // $FF: synthetic field
   private Setting<Boolean> autoSwitch;
   // $FF: synthetic field
   private BlockPos targetBlock;
   // $FF: synthetic field
   private int oldSlot;
   // $FF: synthetic field
   private static double yaw;
   // $FF: synthetic field
   private Setting<Boolean> players;
   // $FF: synthetic field
   private Setting<Boolean> alwaysBreak;
   // $FF: synthetic field
   private Setting<Integer> blue;
   // $FF: synthetic field
   private Setting<Boolean> renderPlace;
   // $FF: synthetic field
   private Setting<Boolean> animals;
   // $FF: synthetic field
   private static boolean togglePitch;
   // $FF: synthetic field
   int delay;
   // $FF: synthetic field
   private boolean isAttacking;
   // $FF: synthetic field
   private static final int[] lllIlIlIIIll;
   // $FF: synthetic field
   private Setting<Double> range;
   // $FF: synthetic field
   private Setting<Boolean> debug;
   // $FF: synthetic field
   @EventHandler
   private Listener<PacketEvent.Send> packetListener;
   // $FF: synthetic field
   private Setting<Double> attackSpeed;
   // $FF: synthetic field
   private static final String[] lllIlIlIIIIl;
   // $FF: synthetic field
   private Setting<Double> minDamage;
   // $FF: synthetic field
   private boolean hasPlaced;
   // $FF: synthetic field
   private Setting<AutoCrystal.RenderMode> mode;
   // $FF: synthetic field
   private static boolean isSpoofingAngles;
   // $FF: synthetic field
   private Setting<Boolean> explode;
   // $FF: synthetic field
   private Entity target;
   // $FF: synthetic field
   private Setting<Integer> red;
   // $FF: synthetic field
   private static double pitch;
   // $FF: synthetic field
   private Setting<Boolean> fast;

   private static boolean lIIllIIlIIlllI(int var0) {
      return var0 < 0;
   }

   private static boolean lIIllIIlIlIIII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIIllIIlIlIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllIIlIIIlIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIIlIIIllI(int var0) {
      return var0 == 0;
   }

   public static BlockPos getPlayerPos() {
      return new BlockPos(Math.floor(mc.field_71439_g.field_70165_t), Math.floor(mc.field_71439_g.field_70163_u), Math.floor(mc.field_71439_g.field_70161_v));
   }

   private static String lIIllIIlIIIIII(String lllllllllllllllIlIllllllIIIIIlIl, String lllllllllllllllIlIllllllIIIIIIlI) {
      try {
         Exception lllllllllllllllIlIllllllIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllIIIIIIlI.getBytes(StandardCharsets.UTF_8)), lllIlIlIIIll[8]), "DES");
         String lllllllllllllllIlIllllllIIIIIIII = Cipher.getInstance("DES");
         lllllllllllllllIlIllllllIIIIIIII.init(lllIlIlIIIll[2], lllllllllllllllIlIllllllIIIIIIIl);
         return new String(lllllllllllllllIlIllllllIIIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllIIlIIllll(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIIllIIlIlIIlI(Object var0, Object var1) {
      return var0 != var1;
   }

   private static String lIIllIIIlllllI(String lllllllllllllllIlIllllllIIIllIlI, String lllllllllllllllIlIllllllIIIlIlII) {
      lllllllllllllllIlIllllllIIIllIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIllllllIIIllIII = new StringBuilder();
      String lllllllllllllllIlIllllllIIIlIIlI = lllllllllllllllIlIllllllIIIlIlII.toCharArray();
      int lllllllllllllllIlIllllllIIIlIllI = lllIlIlIIIll[0];
      char lllllllllllllllIlIllllllIIIlIIII = lllllllllllllllIlIllllllIIIllIlI.toCharArray();
      long lllllllllllllllIlIllllllIIIIllll = lllllllllllllllIlIllllllIIIlIIII.length;
      int lllllllllllllllIlIllllllIIIIlllI = lllIlIlIIIll[0];

      do {
         if (!lIIllIIlIlIIIl(lllllllllllllllIlIllllllIIIIlllI, lllllllllllllllIlIllllllIIIIllll)) {
            return String.valueOf(lllllllllllllllIlIllllllIIIllIII);
         }

         char lllllllllllllllIlIllllllIIIIllIl = lllllllllllllllIlIllllllIIIlIIII[lllllllllllllllIlIllllllIIIIlllI];
         lllllllllllllllIlIllllllIIIllIII.append((char)(lllllllllllllllIlIllllllIIIIllIl ^ lllllllllllllllIlIllllllIIIlIIlI[lllllllllllllllIlIllllllIIIlIllI % lllllllllllllllIlIllllllIIIlIIlI.length]));
         "".length();
         ++lllllllllllllllIlIllllllIIIlIllI;
         ++lllllllllllllllIlIllllllIIIIlllI;
         "".length();
      } while(" ".length() != ((179 ^ 132 ^ (123 ^ 104) << " ".length()) << (" ".length() << " ".length()) & ((85 ^ 18 ^ (87 ^ 124) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length())));

      return null;
   }

   private static boolean lIIllIIlIlIIll(int var0) {
      return var0 > 0;
   }

   private static float getDamageMultiplied(float lllllllllllllllIllIIIIIIIIllllIl) {
      int lllllllllllllllIllIIIIIIIIllllII = mc.field_71441_e.func_175659_aa().func_151525_a();
      float var10001;
      if (lIIllIIlIIIllI(lllllllllllllllIllIIIIIIIIllllII)) {
         var10001 = 0.0F;
         "".length();
         if (" ".length() << " ".length() <= " ".length()) {
            return 0.0F;
         }
      } else if (lIIllIIlIIIlll(lllllllllllllllIllIIIIIIIIllllII, lllIlIlIIIll[2])) {
         var10001 = 1.0F;
         "".length();
         if ("   ".length() <= " ".length() << " ".length()) {
            return 0.0F;
         }
      } else if (lIIllIIlIIIlll(lllllllllllllllIllIIIIIIIIllllII, lllIlIlIIIll[1])) {
         var10001 = 0.5F;
         "".length();
         if (null != null) {
            return 0.0F;
         }
      } else {
         var10001 = 1.5F;
      }

      return lllllllllllllllIllIIIIIIIIllllIl * var10001;
   }

   static float calculateDamage(double lllllllllllllllIllIIIIIIIllIlIlI, double lllllllllllllllIllIIIIIIIlIlllIl, double lllllllllllllllIllIIIIIIIllIlIII, Entity lllllllllllllllIllIIIIIIIllIIlll) {
      String lllllllllllllllIllIIIIIIIlIllIlI = 12.0F;
      short lllllllllllllllIllIIIIIIIlIllIIl = lllllllllllllllIllIIIIIIIllIIlll.func_70011_f(lllllllllllllllIllIIIIIIIllIlIlI, lllllllllllllllIllIIIIIIIlIlllIl, lllllllllllllllIllIIIIIIIllIlIII) / 12.0D;
      int lllllllllllllllIllIIIIIIIlIllIII = new Vec3d(lllllllllllllllIllIIIIIIIllIlIlI, lllllllllllllllIllIIIIIIIlIlllIl, lllllllllllllllIllIIIIIIIllIlIII);
      double lllllllllllllllIllIIIIIIIllIIIll = (double)lllllllllllllllIllIIIIIIIllIIlll.field_70170_p.func_72842_a(lllllllllllllllIllIIIIIIIlIllIII, lllllllllllllllIllIIIIIIIllIIlll.func_174813_aQ());
      double lllllllllllllllIllIIIIIIIllIIIlI = (1.0D - lllllllllllllllIllIIIIIIIlIllIIl) * lllllllllllllllIllIIIIIIIllIIIll;
      float lllllllllllllllIllIIIIIIIllIIIIl = (float)((int)((lllllllllllllllIllIIIIIIIllIIIlI * lllllllllllllllIllIIIIIIIllIIIlI + lllllllllllllllIllIIIIIIIllIIIlI) / 2.0D * 7.0D * 12.0D + 1.0D));
      short lllllllllllllllIllIIIIIIIlIllllI = 1.0D;
      if (lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIllIIlll instanceof EntityLivingBase)) {
         lllllllllllllllIllIIIIIIIlIllllI = (double)getBlastReduction((EntityLivingBase)lllllllllllllllIllIIIIIIIllIIlll, getDamageMultiplied(lllllllllllllllIllIIIIIIIllIIIIl), new Explosion(mc.field_71441_e, (Entity)null, lllllllllllllllIllIIIIIIIllIlIlI, lllllllllllllllIllIIIIIIIlIlllIl, lllllllllllllllIllIIIIIIIllIlIII, 6.0F, (boolean)lllIlIlIIIll[0], (boolean)lllIlIlIIIll[1]));
      }

      return (float)lllllllllllllllIllIIIIIIIlIllllI;
   }

   private static boolean lIIllIIlIlIlII(Object var0) {
      return var0 == null;
   }

   public void onUpdate() {
      EntityEnderCrystal lllllllllllllllIllIIIIIIIIIlIlII = (EntityEnderCrystal)mc.field_71441_e.field_72996_f.stream().filter((lllllllllllllllIlIllllllIlIlIllI) -> {
         return lllllllllllllllIlIllllllIlIlIllI instanceof EntityEnderCrystal;
      }).map((lllllllllllllllIlIllllllIlIllIIl) -> {
         return (EntityEnderCrystal)lllllllllllllllIlIllllllIlIllIIl;
      }).min(Comparator.comparing((lllllllllllllllIlIllllllIlIllIll) -> {
         return mc.field_71439_g.func_70032_d(lllllllllllllllIlIllllllIlIllIll);
      })).orElse((Object)null);
      int lllllllllllllllIllIIIIIIIIIIllIl;
      if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIllIIIIIIIIIIllll.explode.getValue()) && lIIllIIlIIlIll(lllllllllllllllIllIIIIIIIIIlIlII) && lIIllIIlIIllII(lIIllIIlIIlIII((double)mc.field_71439_g.func_70032_d(lllllllllllllllIllIIIIIIIIIlIlII), (Double)lllllllllllllllIllIIIIIIIIIIllll.range.getValue())) && (!lIIllIIlIIIllI(lllllllllllllllIllIIIIIIIIIIllll.hasPlaced) || lIIllIIlIIIlIl((Boolean)lllllllllllllllIllIIIIIIIIIIllll.alwaysBreak.getValue()))) {
         if (lIIllIIlIIllIl(lIIllIIlIIlIIl((Double)lllllllllllllllIllIIIIIIIIIIllll.attackSpeed.getValue(), (double)Math.round(LagCompensator.INSTANCE.getTickRate())))) {
            lllllllllllllllIllIIIIIIIIIIllIl = lllIlIlIIIll[0];

            while(lIIllIIlIIlllI(lIIllIIlIIlIII((double)lllllllllllllllIllIIIIIIIIIIllIl, (Double)lllllllllllllllIllIIIIIIIIIIllll.attackSpeed.getValue() / (double)Math.round(LagCompensator.INSTANCE.getTickRate())))) {
               lllllllllllllllIllIIIIIIIIIIllll.hitCrystal(lllllllllllllllIllIIIIIIIIIlIlII);
               ++lllllllllllllllIllIIIIIIIIIIllIl;
               "".length();
               if (" ".length() << " ".length() == 0) {
                  return;
               }
            }

            "".length();
            if (" ".length() << " ".length() == 0) {
               return;
            }
         } else if (lIIllIIlIIllIl(lIIllIIlIIlIIl((double)lllllllllllllllIllIIIIIIIIIIllll.delay, (double)Math.round(LagCompensator.INSTANCE.getTickRate()) / (Double)lllllllllllllllIllIIIIIIIIIIllll.attackSpeed.getValue()))) {
            lllllllllllllllIllIIIIIIIIIIllll.hitCrystal(lllllllllllllllIllIIIIIIIIIlIlII);
            lllllllllllllllIllIIIIIIIIIIllll.delay = lllIlIlIIIll[0];
            "".length();
            if (((94 ^ 69) << " ".length() & ~((145 ^ 138) << " ".length())) != 0) {
               return;
            }
         } else {
            lllllllllllllllIllIIIIIIIIIIllll.delay += lllIlIlIIIll[1];
            "".length();
            if (" ".length() << " ".length() == 0) {
               return;
            }
         }
      } else {
         lllllllllllllllIllIIIIIIIIIIllll.hasPlaced = (boolean)lllIlIlIIIll[0];
         resetRotation();
         if (lIIllIIlIIllll(lllllllllllllllIllIIIIIIIIIIllll.oldSlot, lllIlIlIIIll[22])) {
            Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIllIIIIIIIIIIllll.oldSlot;
            lllllllllllllllIllIIIIIIIIIIllll.oldSlot = lllIlIlIIIll[22];
         }

         lllllllllllllllIllIIIIIIIIIIllll.isAttacking = (boolean)lllIlIlIIIll[0];
      }

      int var10000;
      if (lIIllIIlIlIIII(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_185158_cP)) {
         var10000 = lllIlIlIIIll[1];
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var10000 = lllIlIlIIIll[0];
      }

      lllllllllllllllIllIIIIIIIIIIllIl = var10000;
      if (lIIllIIlIlIIII(mc.field_71439_g.func_184614_ca().func_77973_b(), Items.field_185158_cP)) {
         var10000 = mc.field_71439_g.field_71071_by.field_70461_c;
         "".length();
         if (" ".length() << (" ".length() << " ".length()) == 0) {
            return;
         }
      } else {
         var10000 = lllIlIlIIIll[22];
      }

      byte lllllllllllllllIllIIIIIIIIIIllII = var10000;
      if (lIIllIIlIIIlll(lllllllllllllllIllIIIIIIIIIIllII, lllIlIlIIIll[22])) {
         int lllllllllllllllIllIIIIIIIIIIlIll = lllIlIlIIIll[0];

         while(lIIllIIlIlIIIl(lllllllllllllllIllIIIIIIIIIIlIll, lllIlIlIIIll[9])) {
            if (lIIllIIlIlIIII(mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIllIIIIIIIIIIlIll).func_77973_b(), Items.field_185158_cP)) {
               lllllllllllllllIllIIIIIIIIIIllII = lllllllllllllllIllIIIIIIIIIIlIll;
               "".length();
               if (" ".length() << (" ".length() << " ".length()) <= "   ".length()) {
                  return;
               }
               break;
            }

            ++lllllllllllllllIllIIIIIIIIIIlIll;
            "".length();
            if (((25 ^ 28) << (" ".length() << (" ".length() << " ".length())) & ~((185 ^ 188) << (" ".length() << (" ".length() << " ".length())))) > 0) {
               return;
            }
         }
      }

      List<BlockPos> lllllllllllllllIllIIIIIIIIIlIIIl = lllllllllllllllIllIIIIIIIIIIllll.findCrystalBlocks();
      List<Entity> lllllllllllllllIllIIIIIIIIIlIIII = new ArrayList();
      if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIllIIIIIIIIIIllll.players.getValue())) {
         lllllllllllllllIllIIIIIIIIIlIIII.addAll((Collection)mc.field_71441_e.field_73010_i.stream().filter((lllllllllllllllIlIllllllIlIllllI) -> {
            int var10000;
            if (lIIllIIlIIIllI(Friends.isFriend(lllllllllllllllIlIllllllIlIllllI.func_70005_c_()))) {
               var10000 = lllIlIlIIIll[1];
               "".length();
               if (((51 ^ 30) & ~(24 ^ 53)) > "   ".length()) {
                  return (boolean)(" ".length() & ~" ".length());
               }
            } else {
               var10000 = lllIlIlIIIll[0];
            }

            return (boolean)var10000;
         }).collect(Collectors.toList()));
         "".length();
      }

      lllllllllllllllIllIIIIIIIIIlIIII.addAll((Collection)mc.field_71441_e.field_72996_f.stream().filter((lllllllllllllllIlIllllllIllIIIIl) -> {
         int var2;
         if (lIIllIIlIIIllI(Friends.isFriend(lllllllllllllllIlIllllllIllIIIIl.func_70005_c_())) && lIIllIIlIIIlIl(EntityUtil.isLiving(lllllllllllllllIlIllllllIllIIIIl))) {
            Boolean var10000;
            if (lIIllIIlIIIlIl(EntityUtil.isPassive(lllllllllllllllIlIllllllIllIIIIl))) {
               var10000 = (Boolean)lllllllllllllllIlIllllllIllIIlII.animals.getValue();
               "".length();
               if (-" ".length() > 0) {
                  return (boolean)((55 ^ 46) << " ".length() & ~((20 ^ 13) << " ".length()));
               }
            } else {
               var10000 = (Boolean)lllllllllllllllIlIllllllIllIIlII.mobs.getValue();
            }

            if (lIIllIIlIIIlIl(var10000)) {
               var2 = lllIlIlIIIll[1];
               "".length();
               if (-(28 ^ 25) >= 0) {
                  return (boolean)((212 ^ 135) & ~(85 ^ 6));
               }

               return (boolean)var2;
            }
         }

         var2 = lllIlIlIIIll[0];
         return (boolean)var2;
      }).collect(Collectors.toList()));
      "".length();
      lllllllllllllllIllIIIIIIIIIIllll.targetBlock = null;
      lllllllllllllllIllIIIIIIIIIIllll.target = null;
      lllllllllllllllIllIIIIIIIIIIllll.damage = 0.5D;
      Iterator lllllllllllllllIllIIIIIIIIIIlIIl = lllllllllllllllIllIIIIIIIIIlIIII.iterator();

      do {
         label185:
         while(true) {
            Entity lllllllllllllllIllIIIIIIIIIIlIII;
            do {
               if (!lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIIIIlIIl.hasNext())) {
                  if (lIIllIIlIIIllI(lIIllIIlIIlIIl(lllllllllllllllIllIIIIIIIIIIllll.damage, 0.5D))) {
                     resetRotation();
                     return;
                  }

                  if (lIIllIIlIIIlIl(ModuleManager.getModuleByName(lllIlIlIIIIl[lllIlIlIIIll[23]]).isEnabled())) {
                     AutoEz lllllllllllllllIllIIIIIIIIIllIIl = (AutoEz)ModuleManager.getModuleByName(lllIlIlIIIIl[lllIlIlIIIll[24]]);
                     lllllllllllllllIllIIIIIIIIIllIIl.addTargetedPlayer(lllllllllllllllIllIIIIIIIIIIllll.target.func_70005_c_());
                  }

                  if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIllIIIIIIIIIIllll.place.getValue()) && (!lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIIIIllll.hasPlaced) || lIIllIIlIIIlIl((Boolean)lllllllllllllllIllIIIIIIIIIIllll.fast.getValue()))) {
                     if (lIIllIIlIIIlll(lllllllllllllllIllIIIIIIIIIIllII, lllIlIlIIIll[22])) {
                        return;
                     }

                     if (lIIllIIlIIIllI(lllllllllllllllIllIIIIIIIIIIllIl) && lIIllIIlIIllll(mc.field_71439_g.field_71071_by.field_70461_c, lllllllllllllllIllIIIIIIIIIIllII)) {
                        if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIllIIIIIIIIIIllll.autoSwitch.getValue()) && lIIllIIlIIIllI(mc.field_71439_g.func_184614_ca().func_77973_b() instanceof ItemAppleGold)) {
                           mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIllIIIIIIIIIIllII;
                           lllllllllllllllIllIIIIIIIIIIllll.oldSlot = mc.field_71439_g.field_71071_by.field_70461_c;
                        }

                        return;
                     }

                     lllllllllllllllIllIIIIIIIIIIllll.lookAtPacket((double)lllllllllllllllIllIIIIIIIIIIllll.targetBlock.field_177962_a + 0.5D, (double)lllllllllllllllIllIIIIIIIIIIllll.targetBlock.field_177960_b - 0.5D, (double)lllllllllllllllIllIIIIIIIIIIllll.targetBlock.field_177961_c + 0.5D, mc.field_71439_g);
                     long lllllllllllllllIllIIIIIIIIIIlIIl = mc.field_71441_e.func_72933_a(new Vec3d(mc.field_71439_g.field_70165_t, mc.field_71439_g.field_70163_u + (double)mc.field_71439_g.func_70047_e(), mc.field_71439_g.field_70161_v), new Vec3d((double)lllllllllllllllIllIIIIIIIIIIllll.targetBlock.field_177962_a + 0.5D, (double)lllllllllllllllIllIIIIIIIIIIllll.targetBlock.field_177960_b - 0.5D, (double)lllllllllllllllIllIIIIIIIIIIllll.targetBlock.field_177961_c + 0.5D));
                     EnumFacing var21;
                     if (lIIllIIlIIlIll(lllllllllllllllIllIIIIIIIIIIlIIl) && !lIIllIIlIlIlII(lllllllllllllllIllIIIIIIIIIIlIIl.field_178784_b)) {
                        var21 = lllllllllllllllIllIIIIIIIIIIlIIl.field_178784_b;
                     } else {
                        var21 = EnumFacing.UP;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) == ("   ".length() << (53 ^ 48) & ~("   ".length() << (171 ^ 174)))) {
                           return;
                        }
                     }

                     byte lllllllllllllllIllIIIIIIIIIIlIII = var21;
                     EnumHand var22;
                     if (lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIIIIllIl)) {
                        var22 = EnumHand.OFF_HAND;
                        "".length();
                        if (" ".length() << " ".length() >= "   ".length()) {
                           return;
                        }
                     } else {
                        var22 = EnumHand.MAIN_HAND;
                     }

                     EnumHand lllllllllllllllIllIIIIIIIIIlIllI = var22;
                     mc.field_71442_b.func_187099_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIllIIIIIIIIIIllll.targetBlock, lllllllllllllllIllIIIIIIIIIIlIII, new Vec3d(0.0D, 0.0D, 0.0D), lllllllllllllllIllIIIIIIIIIlIllI);
                     "".length();
                     mc.field_71439_g.func_184609_a(lllllllllllllllIllIIIIIIIIIlIllI);
                     lllllllllllllllIllIIIIIIIIIIllll.hasPlaced = (boolean)lllIlIlIIIll[1];
                     if (lIIllIIlIIllll(lllllllllllllllIllIIIIIIIIIIllll.oldSlot, lllIlIlIIIll[22])) {
                        Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIllIIIIIIIIIIllll.oldSlot;
                        lllllllllllllllIllIIIIIIIIIIllll.oldSlot = lllIlIlIIIll[22];
                     }
                  }

                  if (lIIllIIlIIIlIl(isSpoofingAngles)) {
                     EntityPlayerSP var23;
                     if (lIIllIIlIIIlIl(togglePitch)) {
                        var23 = mc.field_71439_g;
                        var23.field_70125_A = (float)((double)var23.field_70125_A + 4.0E-4D);
                        togglePitch = (boolean)lllIlIlIIIll[0];
                        "".length();
                        if (-"   ".length() >= 0) {
                           return;
                        }
                     } else {
                        var23 = mc.field_71439_g;
                        var23.field_70125_A = (float)((double)var23.field_70125_A - 4.0E-4D);
                        togglePitch = (boolean)lllIlIlIIIll[1];
                     }
                  }

                  return;
               }

               lllllllllllllllIllIIIIIIIIIIlIII = (Entity)lllllllllllllllIllIIIIIIIIIIlIIl.next();
            } while(!lIIllIIlIlIIlI(lllllllllllllllIllIIIIIIIIIIlIII, mc.field_71439_g));

            if (lIIllIIlIIllII(lIIllIIlIIlIlI(((EntityLivingBase)lllllllllllllllIllIIIIIIIIIIlIII).func_110143_aJ(), 0.0F))) {
               "".length();
               break;
            }

            if (lIIllIIlIlIIll(lIIllIIlIIlIIl((double)mc.field_71439_g.func_70032_d(lllllllllllllllIllIIIIIIIIIIlIII), (Double)lllllllllllllllIllIIIIIIIIIIllll.range.getValue() + 13.0D))) {
               "".length();
               if (" ".length() << " ".length() == 0) {
                  return;
               }
            } else {
               Iterator lllllllllllllllIllIIIIIIIIIIIlll = lllllllllllllllIllIIIIIIIIIlIIIl.iterator();

               label183:
               do {
                  while(lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIIIIIlll.hasNext())) {
                     boolean lllllllllllllllIllIIIIIIIIIIIllI = (BlockPos)lllllllllllllllIllIIIIIIIIIIIlll.next();
                     double lllllllllllllllIllIIIIIIIIIlllIl = lllllllllllllllIllIIIIIIIIIIlIII.func_174818_b(lllllllllllllllIllIIIIIIIIIIIllI);
                     if (lIIllIIlIlIIll(lIIllIIlIIlIIl(lllllllllllllllIllIIIIIIIIIlllIl, 13.0D * (Double)lllllllllllllllIllIIIIIIIIIIllll.range.getValue()))) {
                        "".length();
                        continue label183;
                     }

                     double lllllllllllllllIllIIIIIIIIIIIlII = (double)calculateDamage((double)lllllllllllllllIllIIIIIIIIIIIllI.field_177962_a + 0.5D, (double)(lllllllllllllllIllIIIIIIIIIIIllI.field_177960_b + lllIlIlIIIll[1]), (double)lllllllllllllllIllIIIIIIIIIIIllI.field_177961_c + 0.5D, lllllllllllllllIllIIIIIIIIIIlIII);
                     if (lIIllIIlIlIIll(lIIllIIlIIlIIl(lllllllllllllllIllIIIIIIIIIIIlII, lllllllllllllllIllIIIIIIIIIIllll.damage))) {
                        byte lllllllllllllllIllIIIIIIIIIIIIll = (double)calculateDamage((double)lllllllllllllllIllIIIIIIIIIIIllI.field_177962_a + 0.5D, (double)(lllllllllllllllIllIIIIIIIIIIIllI.field_177960_b + lllIlIlIIIll[1]), (double)lllllllllllllllIllIIIIIIIIIIIllI.field_177961_c + 0.5D, mc.field_71439_g);
                        if (lIIllIIlIlIIll(lIIllIIlIIlIIl(lllllllllllllllIllIIIIIIIIIIIIll, lllllllllllllllIllIIIIIIIIIIIlII)) && !lIIllIIlIIlllI(lIIllIIlIIlIII(lllllllllllllllIllIIIIIIIIIIIlII, (double)((EntityLivingBase)lllllllllllllllIllIIIIIIIIIIlIII).func_110143_aJ())) || !lIIllIIlIIllII(lIIllIIlIIlIIl(lllllllllllllllIllIIIIIIIIIIIIll - 0.5D, (double)mc.field_71439_g.func_110143_aJ()))) {
                           continue;
                        }

                        if (lIIllIIlIIllII(lIIllIIlIIlIII(lllllllllllllllIllIIIIIIIIIIIlII, (Double)lllllllllllllllIllIIIIIIIIIIllll.minDamage.getValue())) && lIIllIIlIlIIll(lIIllIIlIIlIIl((double)(((EntityLivingBase)lllllllllllllllIllIIIIIIIIIIlIII).func_110143_aJ() + ((EntityLivingBase)lllllllllllllllIllIIIIIIIIIIlIII).func_110139_bj()), (Double)lllllllllllllllIllIIIIIIIIIIllll.fpHealth.getValue()))) {
                           "".length();
                           if ("   ".length() > " ".length() << (" ".length() << " ".length())) {
                              return;
                           }
                           continue;
                        }

                        lllllllllllllllIllIIIIIIIIIIllll.damage = lllllllllllllllIllIIIIIIIIIIIlII;
                        lllllllllllllllIllIIIIIIIIIIllll.targetBlock = lllllllllllllllIllIIIIIIIIIIIllI;
                        lllllllllllllllIllIIIIIIIIIIllll.target = lllllllllllllllIllIIIIIIIIIIlIII;
                     }

                     "".length();
                     if (-"   ".length() > 0) {
                        return;
                     }
                  }

                  "".length();
                  if (" ".length() << " ".length() <= 0) {
                     return;
                  }
                  continue label185;
               } while(" ".length() << " ".length() < "   ".length());

               return;
            }
         }
      } while(" ".length() == " ".length());

   }

   public static float calculateDamage(EntityEnderCrystal lllllllllllllllIllIIIIIIIIllIlIl, Entity lllllllllllllllIllIIIIIIIIllIlII) {
      return calculateDamage(lllllllllllllllIllIIIIIIIIllIlIl.field_70165_t, lllllllllllllllIllIIIIIIIIllIlIl.field_70163_u, lllllllllllllllIllIIIIIIIIllIlIl.field_70161_v, lllllllllllllllIllIIIIIIIIllIlII);
   }

   private static boolean lIIllIIlIIlIll(Object var0) {
      return var0 != null;
   }

   public void onRender() {
      if (!lIIllIIlIIIllI((Boolean)lllllllllllllllIlIllllllllIllIll.debug.getValue())) {
         ScaledResolution lllllllllllllllIlIlllllllllIIlIl = new ScaledResolution(mc);
         float[] var10000 = new float[lllIlIlIIIll[1]];
         var10000[lllIlIlIIIll[0]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
         float[] lllllllllllllllIlIlllllllllIIlII = var10000;
         double lllllllllllllllIlIllllllllIllIII = Color.HSBtoRGB(lllllllllllllllIlIlllllllllIIlII[lllIlIlIIIll[0]], 1.0F, 1.0F);
         Exception lllllllllllllllIlIllllllllIlIlll = lllllllllllllllIlIllllllllIllIII >> lllIlIlIIIll[17] & lllIlIlIIIll[16];
         boolean lllllllllllllllIlIllllllllIlIllI = lllllllllllllllIlIllllllllIllIII >> lllIlIlIIIll[8] & lllIlIlIIIll[16];
         boolean lllllllllllllllIlIllllllllIlIlIl = lllllllllllllllIlIllllllllIllIII & lllIlIlIIIll[16];
         short lllllllllllllllIlIllllllllIlIlII = String.valueOf((new StringBuilder()).append(lllIlIlIIIIl[lllIlIlIIIll[25]]).append(lllllllllllllllIlIllllllllIllIll.hasPlaced));
         String lllllllllllllllIlIllllllllIlIIll;
         if (lIIllIIlIIlIll(lllllllllllllllIlIllllllllIllIll.target)) {
            lllllllllllllllIlIllllllllIlIIll = String.valueOf((new StringBuilder()).append(lllIlIlIIIIl[lllIlIlIIIll[26]]).append(lllllllllllllllIlIllllllllIllIll.target.func_70005_c_()));
            "".length();
            if (" ".length() == 0) {
               return;
            }
         } else {
            lllllllllllllllIlIllllllllIlIIll = lllIlIlIIIIl[lllIlIlIIIll[27]];
         }

         long lllllllllllllllIlIllllllllIlIIlI = String.valueOf((new StringBuilder()).append(lllIlIlIIIIl[lllIlIlIIIll[28]]).append((int)lllllllllllllllIlIllllllllIllIll.damage));
         int lllllllllllllllIlIllllllllIlllII;
         if (lIIllIIlIIIlIl(GUIColor.shouldRainbow())) {
            lllllllllllllllIlIllllllllIlllII = ColourUtils.toRGBA(lllllllllllllllIlIllllllllIlIlll, lllllllllllllllIlIllllllllIlIllI, lllllllllllllllIlIllllllllIlIlIl, lllIlIlIIIll[16]);
            "".length();
            if (-((199 ^ 154) << " ".length() ^ (61 ^ 98) << " ".length()) > 0) {
               return;
            }
         } else {
            lllllllllllllllIlIllllllllIlllII = ColourUtils.toRGBA(GUIColor.getRed(), GUIColor.getGreen(), GUIColor.getBlue(), lllIlIlIIIll[16]);
         }

         GL11.glEnable(lllIlIlIIIll[29]);
         GL11.glEnable(lllIlIlIIIll[30]);
         GL11.glDisable(lllIlIlIIIll[31]);
         SnowGUI.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllllllllIlIIll, (double)(lllllllllllllllIlIlllllllllIIlIl.func_78326_a() / lllIlIlIIIll[2] - SnowGUI.cFontRenderer.getStringWidth(lllllllllllllllIlIllllllllIlIIll) / lllIlIlIIIll[2]), 10.0D, lllllllllllllllIlIllllllllIlllII);
         "".length();
         SnowGUI.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllllllllIlIlII, (double)(lllllllllllllllIlIlllllllllIIlIl.func_78326_a() / lllIlIlIIIll[2] - SnowGUI.cFontRenderer.getStringWidth(lllllllllllllllIlIllllllllIlIlII) / lllIlIlIIIll[2]), (double)(lllIlIlIIIll[10] + SnowGUI.cFontRenderer.getHeight() + lllIlIlIIIll[3]), lllllllllllllllIlIllllllllIlllII);
         "".length();
         SnowGUI.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIllllllllIlIIlI, (double)(lllllllllllllllIlIlllllllllIIlIl.func_78326_a() / lllIlIlIIIll[2] - SnowGUI.cFontRenderer.getStringWidth(lllllllllllllllIlIllllllllIlIIlI) / lllIlIlIIIll[2]), (double)(lllIlIlIIIll[10] + lllIlIlIIIll[2] * SnowGUI.cFontRenderer.getHeight() + lllIlIlIIIll[6]), lllllllllllllllIlIllllllllIlllII);
         "".length();
         GL11.glDisable(lllIlIlIIIll[29]);
         GL11.glDisable(lllIlIlIIIll[30]);
         GL11.glEnable(lllIlIlIIIll[31]);
      }
   }

   private static float getBlastReduction(EntityLivingBase lllllllllllllllIllIIIIIIIlIIlIIl, float lllllllllllllllIllIIIIIIIlIIIlIl, Explosion lllllllllllllllIllIIIIIIIlIIIlII) {
      if (lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIlIIlIIl instanceof EntityPlayer)) {
         EntityPlayer lllllllllllllllIllIIIIIIIlIIllIl = (EntityPlayer)lllllllllllllllIllIIIIIIIlIIlIIl;
         char lllllllllllllllIllIIIIIIIlIIIIlI = DamageSource.func_94539_a(lllllllllllllllIllIIIIIIIlIIIlII);
         lllllllllllllllIllIIIIIIIlIIIlIl = CombatRules.func_189427_a(lllllllllllllllIllIIIIIIIlIIIlIl, (float)lllllllllllllllIllIIIIIIIlIIllIl.func_70658_aO(), (float)lllllllllllllllIllIIIIIIIlIIllIl.func_110148_a(SharedMonsterAttributes.field_189429_h).func_111126_e());
         boolean lllllllllllllllIllIIIIIIIlIIIIIl = EnchantmentHelper.func_77508_a(lllllllllllllllIllIIIIIIIlIIllIl.func_184193_aE(), lllllllllllllllIllIIIIIIIlIIIIlI);
         char lllllllllllllllIllIIIIIIIlIIIIII = MathHelper.func_76131_a((float)lllllllllllllllIllIIIIIIIlIIIIIl, 0.0F, 20.0F);
         lllllllllllllllIllIIIIIIIlIIIlIl *= 1.0F - lllllllllllllllIllIIIIIIIlIIIIII / 25.0F;
         if (lIIllIIlIIIlIl(lllllllllllllllIllIIIIIIIlIIlIIl.func_70644_a(MobEffects.field_76429_m))) {
            lllllllllllllllIllIIIIIIIlIIIlIl -= lllllllllllllllIllIIIIIIIlIIIlIl / 4.0F;
         }

         return lllllllllllllllIllIIIIIIIlIIIlIl;
      } else {
         lllllllllllllllIllIIIIIIIlIIIlIl = CombatRules.func_189427_a(lllllllllllllllIllIIIIIIIlIIIlIl, (float)lllllllllllllllIllIIIIIIIlIIlIIl.func_70658_aO(), (float)lllllllllllllllIllIIIIIIIlIIlIIl.func_110148_a(SharedMonsterAttributes.field_189429_h).func_111126_e());
         return lllllllllllllllIllIIIIIIIlIIIlIl;
      }
   }

   static {
      lIIllIIlIIIlII();
      lIIllIIlIIIIIl();
      togglePitch = (boolean)lllIlIlIIIll[0];
   }

   private static void resetRotation() {
      if (lIIllIIlIIIlIl(isSpoofingAngles)) {
         yaw = (double)mc.field_71439_g.field_70177_z;
         pitch = (double)mc.field_71439_g.field_70125_A;
         isSpoofingAngles = (boolean)lllIlIlIIIll[0];
      }

   }

   private static void lIIllIIlIIIIIl() {
      lllIlIlIIIIl = new String[lllIlIlIIIll[33]];
      lllIlIlIIIIl[lllIlIlIIIll[0]] = lIIllIIIlllllI("LysRPHYkJQYt", "iJbHV");
      lllIlIlIIIIl[lllIlIlIIIll[1]] = lIIllIIIlllllI("DiABCVEcIhwSEic=", "OUufq");
      lllIlIlIIIIl[lllIlIlIIIll[2]] = lIIllIIIllllll("k8aHvcHY7BI=", "BMygg");
      lllIlIlIIIIl[lllIlIlIIIll[3]] = lIIllIIlIIIIII("qAt9pYfXw3E=", "tiksW");
      lllIlIlIIIIl[lllIlIlIIIll[4]] = lIIllIIlIIIIII("3iJfvAzRdp4=", "VfsIM");
      lllIlIlIIIIl[lllIlIlIIIll[5]] = lIIllIIIlllllI("Gzw5Gg4=", "KPXyk");
      lllIlIlIIIIl[lllIlIlIIIll[6]] = lIIllIIlIIIIII("YNOf1aPnqJQ=", "LvAsx");
      lllIlIlIIIIl[lllIlIlIIIll[7]] = lIIllIIIllllll("vZfF2j9U+rs8/CqTzfkIbw==", "CgoDz");
      lllIlIlIIIIl[lllIlIlIIIll[8]] = lIIllIIlIIIIII("+twACltAw3k=", "QFqyD");
      lllIlIlIIIIl[lllIlIlIIIll[9]] = lIIllIIIllllll("5I9WllzK/EyxhoCsFsCrJA==", "LzUcI");
      lllIlIlIIIIl[lllIlIlIIIll[10]] = lIIllIIIlllllI("HRMXZTExFxgiEA==", "PzyEu");
      lllIlIlIIIIl[lllIlIlIIIll[11]] = lIIllIIIlllllI("EygmEW8FJSQXKnUBIBUjISE=", "UIEtO");
      lllIlIlIIIIl[lllIlIlIIIll[12]] = lIIllIIlIIIIII("fR7pUgV9NlBHpTjlY6Yd5g==", "Otyrl");
      lllIlIlIIIIl[lllIlIlIIIll[13]] = lIIllIIlIIIIII("o5bYSd7t7k4=", "FCtyW");
      lllIlIlIIIIl[lllIlIlIIIll[14]] = lIIllIIlIIIIII("5qdg8LFgAxcL9IyflxcVVw==", "CjMPe");
      lllIlIlIIIIl[lllIlIlIIIll[15]] = lIIllIIlIIIIII("wJr9p4mu06Y=", "FVPhf");
      lllIlIlIIIIl[lllIlIlIIIll[17]] = lIIllIIIllllll("3eE5HQBviWA=", "eXnui");
      lllIlIlIIIIl[lllIlIlIIIll[18]] = lIIllIIlIIIIII("nRionfMank0=", "kulan");
      lllIlIlIIIIl[lllIlIlIIIll[19]] = lIIllIIIlllllI("NjQ3BgQ=", "wXGne");
      lllIlIlIIIIl[lllIlIlIIIll[21]] = lIIllIIlIIIIII("kqUeq1jdlbFC2cgyAyBfrQ==", "JZJNx");
      lllIlIlIIIIl[lllIlIlIIIll[23]] = lIIllIIIllllll("fCZwJtqr7yg=", "jVjeR");
      lllIlIlIIIIl[lllIlIlIIIll[24]] = lIIllIIIllllll("8aLzA/GBuq8=", "gteDS");
      lllIlIlIIIIl[lllIlIlIIIll[25]] = lIIllIIlIIIIII("9UlgoZdc13JFnDcvzbd8QQ==", "MadEb");
      lllIlIlIIIIl[lllIlIlIIIll[26]] = lIIllIIIllllll("//Xll3X7vVPjwpdj5tDhZg==", "YnUCE");
      lllIlIlIIIIl[lllIlIlIIIll[27]] = lIIllIIIlllllI("PQIwCw4dCiwLUUkNLQIO", "icBlk");
      lllIlIlIIIIl[lllIlIlIIIll[28]] = lIIllIIIlllllI("Iyg9LSEDCyMlJxxpCyspFi4qcGQ=", "wIOJD");
   }

   private static boolean lIIllIIlIIllIl(int var0) {
      return var0 >= 0;
   }

   private static void lIIllIIlIIIlII() {
      lllIlIlIIIll = new int[34];
      lllIlIlIIIll[0] = (203 ^ 194) << "   ".length() & ~((165 ^ 172) << "   ".length());
      lllIlIlIIIll[1] = " ".length();
      lllIlIlIIIll[2] = " ".length() << " ".length();
      lllIlIlIIIll[3] = "   ".length();
      lllIlIlIIIll[4] = " ".length() << (" ".length() << " ".length());
      lllIlIlIIIll[5] = 59 + 67 - -32 + 1 ^ (13 ^ 64) << " ".length();
      lllIlIlIIIll[6] = "   ".length() << " ".length();
      lllIlIlIIIll[7] = 93 ^ 90;
      lllIlIlIIIll[8] = " ".length() << "   ".length();
      lllIlIlIIIll[9] = 168 ^ 161;
      lllIlIlIIIll[10] = ((50 ^ 43) << " ".length() ^ 88 ^ 111) << " ".length();
      lllIlIlIIIll[11] = 50 ^ 13 ^ (20 ^ 25) << (" ".length() << " ".length());
      lllIlIlIIIll[12] = "   ".length() << (" ".length() << " ".length());
      lllIlIlIIIll[13] = 112 ^ 55 ^ (20 ^ 49) << " ".length();
      lllIlIlIIIll[14] = (60 ^ 59) << " ".length();
      lllIlIlIIIll[15] = 95 ^ 80;
      lllIlIlIIIll[16] = (114 ^ 41) + (" ".length() << (" ".length() << " ".length())) - -(90 + 73 - 101 + 85) + (164 ^ 169);
      lllIlIlIIIll[17] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIlIlIIIll[18] = 108 + 135 - 169 + 63 ^ (215 ^ 196) << "   ".length();
      lllIlIlIIIll[19] = (40 ^ 33) << " ".length();
      lllIlIlIIIll[20] = (11 + 33 - 3 + 128 ^ (224 ^ 165) << " ".length()) << " ".length();
      lllIlIlIIIll[21] = " ".length() << ("   ".length() << " ".length()) ^ 102 ^ 53;
      lllIlIlIIIll[22] = -" ".length();
      lllIlIlIIIll[23] = (16 ^ 117 ^ "   ".length() << (187 ^ 190)) << (" ".length() << " ".length());
      lllIlIlIIIll[24] = 86 ^ 67;
      lllIlIlIIIll[25] = (132 ^ 131 ^ "   ".length() << (" ".length() << " ".length())) << " ".length();
      lllIlIlIIIll[26] = 30 ^ 9;
      lllIlIlIIIll[27] = "   ".length() << "   ".length();
      lllIlIlIIIll[28] = 217 ^ 138 ^ (55 ^ 18) << " ".length();
      lllIlIlIIIll[29] = 1136 + 2351 - 3241 + 3307;
      lllIlIlIIIll[30] = 347 + 618 - -153 + 403 << " ".length();
      lllIlIlIIIll[31] = (80 ^ 9) + ((7 ^ 82) << (" ".length() << " ".length())) - -(64 + 50 - 52 + 97) + 74 + 23 - 26 + 62 << (" ".length() << " ".length());
      lllIlIlIIIll[32] = (75 ^ 114) << " ".length() ^ 48 ^ 125;
      lllIlIlIIIll[33] = (125 ^ 96 ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length();
   }

   private static int lIIllIIlIlIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIllIIlIIllII(int var0) {
      return var0 <= 0;
   }

   public List<BlockPos> getSphere(BlockPos lllllllllllllllIlIlllllllIIIIIlI, float lllllllllllllllIlIlllllllIIIIIIl, int lllllllllllllllIlIllllllIlllIllI, boolean lllllllllllllllIlIllllllIlllIlIl, boolean lllllllllllllllIlIllllllIlllIlII, int lllllllllllllllIlIllllllIlllIIll) {
      List<BlockPos> lllllllllllllllIlIllllllIlllllII = new ArrayList();
      short lllllllllllllllIlIllllllIlllIIIl = lllllllllllllllIlIlllllllIIIIIlI.func_177958_n();
      int lllllllllllllllIlIllllllIlllIIII = lllllllllllllllIlIlllllllIIIIIlI.func_177956_o();
      short lllllllllllllllIlIllllllIllIllll = lllllllllllllllIlIlllllllIIIIIlI.func_177952_p();
      int lllllllllllllllIlIlllllllIIIIlII = lllllllllllllllIlIllllllIlllIIIl - (int)lllllllllllllllIlIlllllllIIIIIIl;

      do {
         if (!lIIllIIlIIllII(lIIllIIlIlIlIl((float)lllllllllllllllIlIlllllllIIIIlII, (float)lllllllllllllllIlIllllllIlllIIIl + lllllllllllllllIlIlllllllIIIIIIl))) {
            return lllllllllllllllIlIllllllIlllllII;
         }

         int lllllllllllllllIlIlllllllIIIIlIl = lllllllllllllllIlIllllllIllIllll - (int)lllllllllllllllIlIlllllllIIIIIIl;

         label63:
         while(lIIllIIlIIllII(lIIllIIlIlIlIl((float)lllllllllllllllIlIlllllllIIIIlIl, (float)lllllllllllllllIlIllllllIllIllll + lllllllllllllllIlIlllllllIIIIIIl))) {
            int var10000;
            if (lIIllIIlIIIlIl(lllllllllllllllIlIllllllIlllIlII)) {
               var10000 = lllllllllllllllIlIllllllIlllIIII - (int)lllllllllllllllIlIlllllllIIIIIIl;
               "".length();
               if (null != null) {
                  return null;
               }
            } else {
               var10000 = lllllllllllllllIlIllllllIlllIIII;
            }

            int lllllllllllllllIlIllllllIllIllII = var10000;

            do {
               float var18 = (float)lllllllllllllllIlIllllllIllIllII;
               float var10001;
               if (lIIllIIlIIIlIl(lllllllllllllllIlIllllllIlllIlII)) {
                  var10001 = (float)lllllllllllllllIlIllllllIlllIIII + lllllllllllllllIlIlllllllIIIIIIl;
                  "".length();
                  if ("   ".length() > "   ".length()) {
                     return null;
                  }
               } else {
                  var10001 = (float)(lllllllllllllllIlIllllllIlllIIII + lllllllllllllllIlIllllllIlllIllI);
               }

               if (!lIIllIIlIIlllI(lIIllIIlIlIlIl(var18, var10001))) {
                  ++lllllllllllllllIlIlllllllIIIIlIl;
                  "".length();
                  if (" ".length() >= "   ".length()) {
                     return null;
                  }
                  continue label63;
               }

               var10000 = (lllllllllllllllIlIllllllIlllIIIl - lllllllllllllllIlIlllllllIIIIlII) * (lllllllllllllllIlIllllllIlllIIIl - lllllllllllllllIlIlllllllIIIIlII) + (lllllllllllllllIlIllllllIllIllll - lllllllllllllllIlIlllllllIIIIlIl) * (lllllllllllllllIlIllllllIllIllll - lllllllllllllllIlIlllllllIIIIlIl);
               int var19;
               if (lIIllIIlIIIlIl(lllllllllllllllIlIllllllIlllIlII)) {
                  var19 = (lllllllllllllllIlIllllllIlllIIII - lllllllllllllllIlIllllllIllIllII) * (lllllllllllllllIlIllllllIlllIIII - lllllllllllllllIlIllllllIllIllII);
                  "".length();
                  if (" ".length() << " ".length() == "   ".length()) {
                     return null;
                  }
               } else {
                  var19 = lllIlIlIIIll[0];
               }

               double lllllllllllllllIlIllllllIllIlIll = (double)(var10000 + var19);
               if (lIIllIIlIIlllI(lIIllIIlIlIllI(lllllllllllllllIlIllllllIllIlIll, (double)(lllllllllllllllIlIlllllllIIIIIIl * lllllllllllllllIlIlllllllIIIIIIl))) && (!lIIllIIlIIIlIl(lllllllllllllllIlIllllllIlllIlIl) || lIIllIIlIIllIl(lIIllIIlIlIllI(lllllllllllllllIlIllllllIllIlIll, (double)((lllllllllllllllIlIlllllllIIIIIIl - 1.0F) * (lllllllllllllllIlIlllllllIIIIIIl - 1.0F)))))) {
                  BlockPos lllllllllllllllIlIlllllllIIIlIII = new BlockPos(lllllllllllllllIlIlllllllIIIIlII, lllllllllllllllIlIllllllIllIllII + lllllllllllllllIlIllllllIlllIIll, lllllllllllllllIlIlllllllIIIIlIl);
                  lllllllllllllllIlIllllllIlllllII.add(lllllllllllllllIlIlllllllIIIlIII);
                  "".length();
               }

               ++lllllllllllllllIlIllllllIllIllII;
               "".length();
            } while((" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length())) <= 0);

            return null;
         }

         ++lllllllllllllllIlIlllllllIIIIlII;
         "".length();
      } while("   ".length() > " ".length());

      return null;
   }

   private static int lIIllIIlIIlIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static String lIIllIIIllllll(String lllllllllllllllIlIllllllIIlIlIlI, String lllllllllllllllIlIllllllIIlIlIIl) {
      try {
         int lllllllllllllllIlIllllllIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllllllIIlIllII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllllllIIlIllII.init(lllIlIlIIIll[2], lllllllllllllllIlIllllllIIlIIllI);
         return new String(lllllllllllllllIlIllllllIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllllllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private List<BlockPos> findCrystalBlocks() {
      NonNullList<BlockPos> lllllllllllllllIlIlllllllIIllIlI = NonNullList.func_191196_a();
      lllllllllllllllIlIlllllllIIllIlI.addAll((Collection)lllllllllllllllIlIlllllllIIllIll.getSphere(getPlayerPos(), ((Double)lllllllllllllllIlIlllllllIIllIll.range.getValue()).floatValue(), ((Double)lllllllllllllllIlIlllllllIIllIll.range.getValue()).intValue(), (boolean)lllIlIlIIIll[0], (boolean)lllIlIlIIIll[1], lllIlIlIIIll[0]).stream().filter(lllllllllllllllIlIlllllllIIllIll::canPlaceCrystal).collect(Collectors.toList()));
      "".length();
      return lllllllllllllllIlIlllllllIIllIlI;
   }

   public void onWorldRender(RenderEvent lllllllllllllllIlIllllllllIIIlIl) {
      float[] var10000 = new float[lllIlIlIIIll[1]];
      var10000[lllIlIlIIIll[0]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
      short lllllllllllllllIlIlllllllIlllllI = var10000;
      double lllllllllllllllIlIlllllllIllllIl = Color.HSBtoRGB(lllllllllllllllIlIlllllllIlllllI[lllIlIlIIIll[0]], 1.0F, 1.0F);
      short lllllllllllllllIlIlllllllIllllII = lllllllllllllllIlIlllllllIllllIl >> lllIlIlIIIll[17] & lllIlIlIIIll[16];
      int lllllllllllllllIlIllllllllIIIIIl = lllllllllllllllIlIlllllllIllllIl >> lllIlIlIIIll[8] & lllIlIlIIIll[16];
      long lllllllllllllllIlIlllllllIlllIlI = lllllllllllllllIlIlllllllIllllIl & lllIlIlIIIll[16];
      if (lIIllIIlIIlIll(lllllllllllllllIlIlllllllIllllll.targetBlock) && lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIlllllllIllllll.renderPlace.getValue())) {
         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$combat$AutoCrystal$RenderMode[((AutoCrystal.RenderMode)lllllllllllllllIlIlllllllIllllll.mode.getValue()).ordinal()]) {
         case 1:
            SnowTessellator.prepare(lllIlIlIIIll[7]);
            if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIlllllllIllllll.rainbowRender.getValue())) {
               SnowTessellator.drawFace(lllllllllllllllIlIlllllllIllllll.targetBlock.func_177982_a(lllIlIlIIIll[0], lllIlIlIIIll[1], lllIlIlIIIll[0]), lllllllllllllllIlIlllllllIllllII, lllllllllllllllIlIllllllllIIIIIl, lllllllllllllllIlIlllllllIlllIlI, (Integer)lllllllllllllllIlIlllllllIllllll.alpha.getValue(), lllIlIlIIIll[32]);
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               SnowTessellator.drawFace(lllllllllllllllIlIlllllllIllllll.targetBlock.func_177982_a(lllIlIlIIIll[0], lllIlIlIIIll[1], lllIlIlIIIll[0]), (Integer)lllllllllllllllIlIlllllllIllllll.red.getValue(), (Integer)lllllllllllllllIlIlllllllIllllll.green.getValue(), (Integer)lllllllllllllllIlIlllllllIllllll.blue.getValue(), (Integer)lllllllllllllllIlIlllllllIllllll.alpha.getValue(), lllIlIlIIIll[32]);
            }

            SnowTessellator.release();
            "".length();
            if ("   ".length() < " ".length() << " ".length()) {
               return;
            }
            break;
         case 2:
            short lllllllllllllllIlIlllllllIlllIIl = mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllllllIllllll.targetBlock);
            long lllllllllllllllIlIlllllllIlllIII = MathUtil.interpolateEntity(mc.field_71439_g, mc.func_184121_ak());
            if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIlllllllIllllll.rainbowRender.getValue())) {
               SnowTessellator.drawFullBox(lllllllllllllllIlIlllllllIlllIIl.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllllllIllllll.targetBlock).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllllllIlllIII.field_72450_a, -lllllllllllllllIlIlllllllIlllIII.field_72448_b, -lllllllllllllllIlIlllllllIlllIII.field_72449_c), lllllllllllllllIlIlllllllIllllll.targetBlock, 1.5F, lllllllllllllllIlIlllllllIllllII, lllllllllllllllIlIllllllllIIIIIl, lllllllllllllllIlIlllllllIlllIlI, (Integer)lllllllllllllllIlIlllllllIllllll.alpha.getValue());
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               SnowTessellator.drawFullBox(lllllllllllllllIlIlllllllIlllIIl.func_185918_c(mc.field_71441_e, lllllllllllllllIlIlllllllIllllll.targetBlock).func_186662_g(0.0020000000949949026D).func_72317_d(-lllllllllllllllIlIlllllllIlllIII.field_72450_a, -lllllllllllllllIlIlllllllIlllIII.field_72448_b, -lllllllllllllllIlIlllllllIlllIII.field_72449_c), lllllllllllllllIlIlllllllIllllll.targetBlock, 1.5F, (Integer)lllllllllllllllIlIlllllllIllllll.red.getValue(), (Integer)lllllllllllllllIlIlllllllIllllll.green.getValue(), (Integer)lllllllllllllllIlIlllllllIllllll.blue.getValue(), (Integer)lllllllllllllllIlIlllllllIllllll.alpha.getValue());
               "".length();
               if (-(6 ^ 2) >= 0) {
                  return;
               }
            }
         }
      }

   }

   private void hitCrystal(EntityEnderCrystal lllllllllllllllIlIlllllllllllIIl) {
      if (lIIllIIlIIIlIl(mc.field_71439_g.func_70644_a(MobEffects.field_76437_t))) {
         if (lIIllIIlIIIllI(lllllllllllllllIlIlllllllllllIlI.isAttacking)) {
            lllllllllllllllIlIlllllllllllIlI.oldSlot = Wrapper.getPlayer().field_71071_by.field_70461_c;
            lllllllllllllllIlIlllllllllllIlI.isAttacking = (boolean)lllIlIlIIIll[1];
         }

         int lllllllllllllllIlIlllllllllllIll = lllIlIlIIIll[22];
         int lllllllllllllllIlIllllllllllIlIl = lllIlIlIIIll[0];

         while(lIIllIIlIlIIIl(lllllllllllllllIlIllllllllllIlIl, lllIlIlIIIll[9])) {
            ItemStack lllllllllllllllIlIllllllllllllIl = Wrapper.getPlayer().field_71071_by.func_70301_a(lllllllllllllllIlIllllllllllIlIl);
            if (lIIllIIlIlIIII(lllllllllllllllIlIllllllllllllIl, ItemStack.field_190927_a)) {
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               if (lIIllIIlIIIlIl(lllllllllllllllIlIllllllllllllIl.func_77973_b() instanceof ItemSword)) {
                  lllllllllllllllIlIlllllllllllIll = lllllllllllllllIlIllllllllllIlIl;
                  "".length();
                  if (null != null) {
                     return;
                  }
                  break;
               }

               if (lIIllIIlIIIlIl(lllllllllllllllIlIllllllllllllIl.func_77973_b() instanceof ItemTool)) {
                  lllllllllllllllIlIlllllllllllIll = lllllllllllllllIlIllllllllllIlIl;
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) == " ".length()) {
                     return;
                  }
                  break;
               }
            }

            ++lllllllllllllllIlIllllllllllIlIl;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
               return;
            }
         }

         if (lIIllIIlIIllll(lllllllllllllllIlIlllllllllllIll, lllIlIlIIIll[22])) {
            Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIlIlllllllllllIll;
         }
      }

      lllllllllllllllIlIlllllllllllIlI.lookAtPacket(lllllllllllllllIlIlllllllllllIIl.field_70165_t, lllllllllllllllIlIlllllllllllIIl.field_70163_u, lllllllllllllllIlIlllllllllllIIl.field_70161_v, mc.field_71439_g);
      mc.field_71442_b.func_78764_a(mc.field_71439_g, lllllllllllllllIlIlllllllllllIIl);
      mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
   }

   private boolean canPlaceCrystal(BlockPos lllllllllllllllIlIlllllllIlIIIll) {
      long lllllllllllllllIlIlllllllIIlllll = lllllllllllllllIlIlllllllIlIIIll.func_177982_a(lllIlIlIIIll[0], lllIlIlIIIll[1], lllIlIlIIIll[0]);
      double lllllllllllllllIlIlllllllIIllllI = lllllllllllllllIlIlllllllIlIIIll.func_177982_a(lllIlIlIIIll[0], lllIlIlIIIll[2], lllIlIlIIIll[0]);
      int var10000;
      if ((!lIIllIIlIlIIlI(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllllllIlIIIll).func_177230_c(), Blocks.field_150357_h) || lIIllIIlIlIIII(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllllllIlIIIll).func_177230_c(), Blocks.field_150343_Z)) && lIIllIIlIlIIII(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllllllIIlllll).func_177230_c(), Blocks.field_150350_a) && lIIllIIlIlIIII(mc.field_71441_e.func_180495_p(lllllllllllllllIlIlllllllIIllllI).func_177230_c(), Blocks.field_150350_a) && lIIllIIlIIIlIl(mc.field_71441_e.func_72872_a(Entity.class, new AxisAlignedBB(lllllllllllllllIlIlllllllIIlllll)).isEmpty()) && lIIllIIlIIIlIl(mc.field_71441_e.func_72872_a(Entity.class, new AxisAlignedBB(lllllllllllllllIlIlllllllIIllllI)).isEmpty())) {
         var10000 = lllIlIlIIIll[1];
         "".length();
         if (" ".length() != " ".length()) {
            return (boolean)((38 ^ 47 ^ " ".length() << (" ".length() << " ".length())) & ((144 ^ 131) << " ".length() ^ 185 ^ 146 ^ -" ".length()));
         }
      } else {
         var10000 = lllIlIlIIIll[0];
      }

      return (boolean)var10000;
   }

   public AutoCrystal() {
      lllllllllllllllIllIIIIIIIlllIllI.fast = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[0]], (boolean)lllIlIlIIIll[0]));
      lllllllllllllllIllIIIIIIIlllIllI.autoSwitch = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[1]], (boolean)lllIlIlIIIll[1]));
      lllllllllllllllIllIIIIIIIlllIllI.players = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[2]], (boolean)lllIlIlIIIll[1]));
      lllllllllllllllIllIIIIIIIlllIllI.mobs = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.booleanBuilder(lllIlIlIIIIl[lllIlIlIIIll[3]]).withValue(Boolean.valueOf((boolean)lllIlIlIIIll[0])));
      lllllllllllllllIllIIIIIIIlllIllI.animals = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.booleanBuilder(lllIlIlIIIIl[lllIlIlIIIll[4]]).withValue(Boolean.valueOf((boolean)lllIlIlIIIll[0])));
      lllllllllllllllIllIIIIIIIlllIllI.place = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[5]], (boolean)lllIlIlIIIll[1]));
      lllllllllllllllIllIIIIIIIlllIllI.explode = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[6]], (boolean)lllIlIlIIIll[1]));
      lllllllllllllllIllIIIIIIIlllIllI.alwaysBreak = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.booleanBuilder(lllIlIlIIIIl[lllIlIlIIIll[7]]).withValue(Boolean.valueOf((boolean)lllIlIlIIIll[0])).withVisibility((lllllllllllllllIlIllllllIIllIIll) -> {
         return (Boolean)lllllllllllllllIlIllllllIIllIlII.explode.getValue();
      }));
      lllllllllllllllIllIIIIIIIlllIllI.range = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.d(lllIlIlIIIIl[lllIlIlIIIll[8]], 4.0D));
      lllllllllllllllIllIIIIIIIlllIllI.attackSpeed = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.d(lllIlIlIIIIl[lllIlIlIIIll[9]], 13.0D));
      lllllllllllllllIllIIIIIIIlllIllI.minDamage = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.doubleBuilder(lllIlIlIIIIl[lllIlIlIIIll[10]]).withMinimum(0.0D).withValue((Number)8.0D).withMaximum(36.0D).build());
      lllllllllllllllIllIIIIIIIlllIllI.fpHealth = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.doubleBuilder(lllIlIlIIIIl[lllIlIlIIIll[11]]).withMinimum(0.0D).withValue((Number)12.0D).withMaximum(36.0D).build());
      lllllllllllllllIllIIIIIIIlllIllI.debug = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[12]], (boolean)lllIlIlIIIll[0]));
      lllllllllllllllIllIIIIIIIlllIllI.renderPlace = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.b(lllIlIlIIIIl[lllIlIlIIIll[13]], (boolean)lllIlIlIIIll[0]));
      lllllllllllllllIllIIIIIIIlllIllI.rainbowRender = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.booleanBuilder(lllIlIlIIIIl[lllIlIlIIIll[14]]).withValue(Boolean.valueOf((boolean)lllIlIlIIIll[1])).withVisibility((lllllllllllllllIlIllllllIIllIlll) -> {
         return (Boolean)lllllllllllllllIlIllllllIIllIllI.renderPlace.getValue();
      }).build());
      lllllllllllllllIllIIIIIIIlllIllI.red = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.integerBuilder(lllIlIlIIIIl[lllIlIlIIIll[15]]).withRange(lllIlIlIIIll[0], lllIlIlIIIll[16]).withValue((Number)lllIlIlIIIll[16]).withVisibility((lllllllllllllllIlIllllllIIlllIll) -> {
         int var10000;
         if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIllllllIIlllIlI.renderPlace.getValue()) && lIIllIIlIIIllI((Boolean)lllllllllllllllIlIllllllIIlllIlI.rainbowRender.getValue())) {
            var10000 = lllIlIlIIIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) < " ".length() << " ".length()) {
               return (boolean)((40 ^ 33) << " ".length() & ~((39 ^ 46) << " ".length()));
            }
         } else {
            var10000 = lllIlIlIIIll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIllIIIIIIIlllIllI.green = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.integerBuilder(lllIlIlIIIIl[lllIlIlIIIll[17]]).withRange(lllIlIlIIIll[0], lllIlIlIIIll[16]).withValue((Number)lllIlIlIIIll[16]).withVisibility((lllllllllllllllIlIllllllIIllllll) -> {
         int var10000;
         if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIllllllIlIIIIII.renderPlace.getValue()) && lIIllIIlIIIllI((Boolean)lllllllllllllllIlIllllllIlIIIIII.rainbowRender.getValue())) {
            var10000 = lllIlIlIIIll[1];
            "".length();
            if (null != null) {
               return (boolean)((154 ^ 163) & ~(40 ^ 17));
            }
         } else {
            var10000 = lllIlIlIIIll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIllIIIIIIIlllIllI.blue = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.integerBuilder(lllIlIlIIIIl[lllIlIlIIIll[18]]).withRange(lllIlIlIIIll[0], lllIlIlIIIll[16]).withValue((Number)lllIlIlIIIll[16]).withVisibility((lllllllllllllllIlIllllllIlIIIIll) -> {
         int var10000;
         if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIllllllIlIIIIlI.renderPlace.getValue()) && lIIllIIlIIIllI((Boolean)lllllllllllllllIlIllllllIlIIIIlI.rainbowRender.getValue())) {
            var10000 = lllIlIlIIIll[1];
            "".length();
            if (" ".length() << " ".length() < 0) {
               return (boolean)((118 ^ 107) << " ".length() & ~((29 ^ 0) << " ".length()));
            }
         } else {
            var10000 = lllIlIlIIIll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIllIIIIIIIlllIllI.alpha = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.integerBuilder(lllIlIlIIIIl[lllIlIlIIIll[19]]).withRange(lllIlIlIIIll[0], lllIlIlIIIll[16]).withValue((Number)lllIlIlIIIll[20]).withVisibility((lllllllllllllllIlIllllllIlIIIlll) -> {
         int var10000;
         if (lIIllIIlIIIlIl((Boolean)lllllllllllllllIlIllllllIlIIIllI.renderPlace.getValue()) && lIIllIIlIIIllI((Boolean)lllllllllllllllIlIllllllIlIIIllI.rainbowRender.getValue())) {
            var10000 = lllIlIlIIIll[1];
            "".length();
            if (" ".length() << (" ".length() << " ".length()) == 0) {
               return (boolean)((" ".length() << " ".length() ^ 55 ^ 46) << " ".length() & ((14 + 12 - -27 + 88 ^ (66 ^ 9) << " ".length()) << " ".length() ^ -" ".length()));
            }
         } else {
            var10000 = lllIlIlIIIll[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIllIIIIIIIlllIllI.mode = lllllllllllllllIllIIIIIIIlllIllI.register(Settings.enumBuilder(AutoCrystal.RenderMode.class).withName(lllIlIlIIIIl[lllIlIlIIIll[21]]).withValue(AutoCrystal.RenderMode.FULL).withVisibility((lllllllllllllllIlIllllllIlIIlIll) -> {
         return (Boolean)lllllllllllllllIlIllllllIlIIllII.renderPlace.getValue();
      }).build());
      lllllllllllllllIllIIIIIIIlllIllI.hasPlaced = (boolean)lllIlIlIIIll[0];
      lllllllllllllllIllIIIIIIIlllIllI.oldSlot = lllIlIlIIIll[22];
      lllllllllllllllIllIIIIIIIlllIllI.isAttacking = (boolean)lllIlIlIIIll[0];
      lllllllllllllllIllIIIIIIIlllIllI.delay = lllIlIlIIIll[0];
      lllllllllllllllIllIIIIIIIlllIllI.packetReceiveListener = new Listener((lllllllllllllllIlIllllllIlIIlllI) -> {
         if (lIIllIIlIIlIll(mc.field_71439_g) && (!lIIllIIlIlIIlI(mc.field_71439_g.func_184614_ca().func_77973_b(), Items.field_185158_cP) || lIIllIIlIlIIII(mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_185158_cP))) {
            mc.field_71467_ac = lllIlIlIIIll[0];
         }

      }, new Predicate[lllIlIlIIIll[0]]);
      lllllllllllllllIllIIIIIIIlllIllI.packetListener = new Listener((lllllllllllllllIlIllllllIlIlIIlI) -> {
         Packet lllllllllllllllIlIllllllIlIlIIIl = lllllllllllllllIlIllllllIlIlIIlI.getPacket();
         if (lIIllIIlIIIlIl(lllllllllllllllIlIllllllIlIlIIIl instanceof CPacketPlayer) && lIIllIIlIIIlIl(isSpoofingAngles)) {
            ((CPacketPlayer)lllllllllllllllIlIllllllIlIlIIIl).field_149476_e = (float)yaw;
            ((CPacketPlayer)lllllllllllllllIlIllllllIlIlIIIl).field_149473_f = (float)pitch;
         }

      }, new Predicate[lllIlIlIIIll[0]]);
   }

   private static int lIIllIIlIIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static void setYawAndPitch(float lllllllllllllllIllIIIIIIIIllIIIl, float lllllllllllllllIllIIIIIIIIlIlllI) {
      yaw = (double)lllllllllllllllIllIIIIIIIIllIIIl;
      pitch = (double)lllllllllllllllIllIIIIIIIIlIlllI;
      isSpoofingAngles = (boolean)lllIlIlIIIll[1];
   }

   private static boolean lIIllIIlIIIlll(int var0, int var1) {
      return var0 == var1;
   }

   private static int lIIllIIlIIlIII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void onDisable() {
      lllllllllllllllIlIllllllIllIlIII.targetBlock = null;
      lllllllllllllllIlIllllllIllIlIII.target = null;
      resetRotation();
   }

   private void lookAtPacket(double lllllllllllllllIlIlllllllIlIllII, double lllllllllllllllIlIlllllllIlIlIll, double lllllllllllllllIlIlllllllIlIllll, EntityPlayer lllllllllllllllIlIlllllllIlIlllI) {
      long lllllllllllllllIlIlllllllIlIlIII = EntityUtil.calculateLookAt(lllllllllllllllIlIlllllllIlIllII, lllllllllllllllIlIlllllllIlIlIll, lllllllllllllllIlIlllllllIlIllll, lllllllllllllllIlIlllllllIlIlllI);
      setYawAndPitch((float)lllllllllllllllIlIlllllllIlIlIII[lllIlIlIIIll[0]], (float)lllllllllllllllIlIlllllllIlIlIII[lllIlIlIIIll[1]]);
   }

   private static int lIIllIIlIlIlIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static enum RenderMode {
      // $FF: synthetic field
      private static final String[] lIIIIIIIlIllI;
      // $FF: synthetic field
      FULL;

      // $FF: synthetic field
      private static final int[] lIIIIIIIlIlll;
      // $FF: synthetic field
      FLAT;

      private static String lIlIIllIllIlII(String lllllllllllllllIlIIlIIIlIlIIlIlI, String lllllllllllllllIlIIlIIIlIlIIlIll) {
         try {
            SecretKeySpec lllllllllllllllIlIIlIIIlIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIlIlIIlIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlIlll[3]), "DES");
            short lllllllllllllllIlIIlIIIlIlIIIlll = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIIIlIlIIIlll.init(lIIIIIIIlIlll[2], lllllllllllllllIlIIlIIIlIlIIllll);
            return new String(lllllllllllllllIlIIlIIIlIlIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIlIIllIllIIll(String lllllllllllllllIlIIlIIIlIllIIIIl, String lllllllllllllllIlIIlIIIlIlIllIll) {
         lllllllllllllllIlIIlIIIlIllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIIlIIIlIlIlllll = new StringBuilder();
         Exception lllllllllllllllIlIIlIIIlIlIllIIl = lllllllllllllllIlIIlIIIlIlIllIll.toCharArray();
         double lllllllllllllllIlIIlIIIlIlIllIII = lIIIIIIIlIlll[0];
         double lllllllllllllllIlIIlIIIlIlIlIlll = lllllllllllllllIlIIlIIIlIllIIIIl.toCharArray();
         int lllllllllllllllIlIIlIIIlIlIlIllI = lllllllllllllllIlIIlIIIlIlIlIlll.length;
         int lllllllllllllllIlIIlIIIlIlIlIlIl = lIIIIIIIlIlll[0];

         do {
            if (!lIlIIllIllIlll(lllllllllllllllIlIIlIIIlIlIlIlIl, lllllllllllllllIlIIlIIIlIlIlIllI)) {
               return String.valueOf(lllllllllllllllIlIIlIIIlIlIlllll);
            }

            char lllllllllllllllIlIIlIIIlIllIIIlI = lllllllllllllllIlIIlIIIlIlIlIlll[lllllllllllllllIlIIlIIIlIlIlIlIl];
            lllllllllllllllIlIIlIIIlIlIlllll.append((char)(lllllllllllllllIlIIlIIIlIllIIIlI ^ lllllllllllllllIlIIlIIIlIlIllIIl[lllllllllllllllIlIIlIIIlIlIllIII % lllllllllllllllIlIIlIIIlIlIllIIl.length]));
            "".length();
            ++lllllllllllllllIlIIlIIIlIlIllIII;
            ++lllllllllllllllIlIIlIIIlIlIlIlIl;
            "".length();
         } while(" ".length() != " ".length() << (" ".length() << " ".length()));

         return null;
      }

      private static void lIlIIllIllIllI() {
         lIIIIIIIlIlll = new int[4];
         lIIIIIIIlIlll[0] = (140 + 155 - 223 + 85 ^ (12 ^ 75) << " ".length()) << " ".length() & ((33 ^ 108 ^ (141 ^ 162) << " ".length()) << " ".length() ^ -" ".length());
         lIIIIIIIlIlll[1] = " ".length();
         lIIIIIIIlIlll[2] = " ".length() << " ".length();
         lIIIIIIIlIlll[3] = " ".length() << "   ".length();
      }

      private static void lIlIIllIllIlIl() {
         lIIIIIIIlIllI = new String[lIIIIIIIlIlll[2]];
         lIIIIIIIlIllI[lIIIIIIIlIlll[0]] = lIlIIllIllIIll("JBACIQ==", "bENmP");
         lIIIIIIIlIllI[lIIIIIIIlIlll[1]] = lIlIIllIllIlII("4wZDcJhSRAQ=", "gGBSl");
      }

      static {
         lIlIIllIllIllI();
         lIlIIllIllIlIl();
         FULL = new AutoCrystal.RenderMode(lIIIIIIIlIllI[lIIIIIIIlIlll[0]], lIIIIIIIlIlll[0]);
         FLAT = new AutoCrystal.RenderMode(lIIIIIIIlIllI[lIIIIIIIlIlll[1]], lIIIIIIIlIlll[1]);
         AutoCrystal.RenderMode[] var10000 = new AutoCrystal.RenderMode[lIIIIIIIlIlll[2]];
         var10000[lIIIIIIIlIlll[0]] = FULL;
         var10000[lIIIIIIIlIlll[1]] = FLAT;
      }

      private static boolean lIlIIllIllIlll(int var0, int var1) {
         return var0 < var1;
      }
   }
}
