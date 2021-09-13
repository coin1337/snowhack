package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.BlockObsidian;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.BlockInteractionHelper;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "AutoTrap",
   category = Module.Category.COMBAT
)
public class AutoTrap extends Module {
   // $FF: synthetic field
   private EntityPlayer closestTarget;
   // $FF: synthetic field
   private Setting<Integer> blockPerTick;
   // $FF: synthetic field
   private int offsetStep;
   // $FF: synthetic field
   private String lastTickTargetName;
   // $FF: synthetic field
   private int lastHotbarSlot;
   // $FF: synthetic field
   private boolean isSneaking;
   // $FF: synthetic field
   private boolean firstRun;
   // $FF: synthetic field
   private Setting<Boolean> debug;
   // $FF: synthetic field
   private static final String[] lllIlIIlIlll;
   // $FF: synthetic field
   private static final int[] lllIlIIllIlI;
   // $FF: synthetic field
   private Setting<Boolean> rotate;
   // $FF: synthetic field
   private int playerHotbarSlot;
   // $FF: synthetic field
   private final Vec3d[] offsetsDefault;
   // $FF: synthetic field
   private Setting<Double> range;

   private static boolean lIIllIIIlIIlll(int var0) {
      return var0 <= 0;
   }

   private static int lIIllIIIlIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIIllIIIlIIlII(int var0, int var1) {
      return var0 >= var1;
   }

   private static int lIIllIIIlIIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIllIIIlIllIl(int var0) {
      return var0 >= 0;
   }

   private static boolean lIIllIIIlIIlIl(int var0) {
      return var0 > 0;
   }

   private static boolean lIIllIIIlIIIIl(Object var0) {
      return var0 != null;
   }

   private static boolean lIIllIIIlIllII(Object var0, Object var1) {
      return var0 == var1;
   }

   public AutoTrap() {
      Vec3d[] var10001 = new Vec3d[lllIlIIllIlI[0]];
      var10001[lllIlIIllIlI[1]] = new Vec3d(0.0D, 0.0D, -1.0D);
      var10001[lllIlIIllIlI[2]] = new Vec3d(1.0D, 0.0D, 0.0D);
      var10001[lllIlIIllIlI[3]] = new Vec3d(0.0D, 0.0D, 1.0D);
      var10001[lllIlIIllIlI[4]] = new Vec3d(-1.0D, 0.0D, 0.0D);
      var10001[lllIlIIllIlI[5]] = new Vec3d(0.0D, 1.0D, -1.0D);
      var10001[lllIlIIllIlI[6]] = new Vec3d(1.0D, 1.0D, 0.0D);
      var10001[lllIlIIllIlI[7]] = new Vec3d(0.0D, 1.0D, 1.0D);
      var10001[lllIlIIllIlI[8]] = new Vec3d(-1.0D, 1.0D, 0.0D);
      var10001[lllIlIIllIlI[9]] = new Vec3d(0.0D, 2.0D, -1.0D);
      var10001[lllIlIIllIlI[10]] = new Vec3d(1.0D, 2.0D, 0.0D);
      var10001[lllIlIIllIlI[11]] = new Vec3d(0.0D, 2.0D, 1.0D);
      var10001[lllIlIIllIlI[12]] = new Vec3d(-1.0D, 2.0D, 0.0D);
      var10001[lllIlIIllIlI[13]] = new Vec3d(0.0D, 3.0D, -1.0D);
      var10001[lllIlIIllIlI[14]] = new Vec3d(0.0D, 3.0D, 0.0D);
      lllllllllllllllIllIIIIlIIIIIIllI.offsetsDefault = var10001;
      lllllllllllllllIllIIIIlIIIIIIllI.range = lllllllllllllllIllIIIIlIIIIIIllI.register(Settings.d(lllIlIIlIlll[lllIlIIllIlI[1]], 5.5D));
      lllllllllllllllIllIIIIlIIIIIIllI.blockPerTick = lllllllllllllllIllIIIIlIIIIIIllI.register(Settings.i(lllIlIIlIlll[lllIlIIllIlI[2]], lllIlIIllIlI[5]));
      lllllllllllllllIllIIIIlIIIIIIllI.rotate = lllllllllllllllIllIIIIlIIIIIIllI.register(Settings.b(lllIlIIlIlll[lllIlIIllIlI[3]], (boolean)lllIlIIllIlI[2]));
      lllllllllllllllIllIIIIlIIIIIIllI.debug = lllllllllllllllIllIIIIlIIIIIIllI.register(Settings.b(lllIlIIlIlll[lllIlIIllIlI[4]], (boolean)lllIlIIllIlI[1]));
      lllllllllllllllIllIIIIlIIIIIIllI.playerHotbarSlot = lllIlIIllIlI[15];
      lllllllllllllllIllIIIIlIIIIIIllI.lastHotbarSlot = lllIlIIllIlI[15];
      lllllllllllllllIllIIIIlIIIIIIllI.isSneaking = (boolean)lllIlIIllIlI[1];
      lllllllllllllllIllIIIIlIIIIIIllI.offsetStep = lllIlIIllIlI[1];
   }

   private static boolean lIIllIIIlIIIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIIIIllllI(Object var0) {
      return var0 == null;
   }

   private static void lIIllIIIIlllIl() {
      lllIlIIllIlI = new int[16];
      lllIlIIllIlI[0] = (107 ^ 108) << " ".length();
      lllIlIIllIlI[1] = (205 ^ 128 ^ (160 ^ 169) << " ".length()) & (4 ^ 121 ^ (53 ^ 36) << " ".length() ^ -" ".length());
      lllIlIIllIlI[2] = " ".length();
      lllIlIIllIlI[3] = " ".length() << " ".length();
      lllIlIIllIlI[4] = "   ".length();
      lllIlIIllIlI[5] = " ".length() << (" ".length() << " ".length());
      lllIlIIllIlI[6] = 22 ^ 77 ^ (172 ^ 131) << " ".length();
      lllIlIIllIlI[7] = "   ".length() << " ".length();
      lllIlIIllIlI[8] = 209 ^ 198 ^ " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIlIIllIlI[9] = " ".length() << "   ".length();
      lllIlIIllIlI[10] = 91 ^ 82;
      lllIlIIllIlI[11] = ((96 ^ 83) << " ".length() ^ 84 ^ 55) << " ".length();
      lllIlIIllIlI[12] = 185 ^ 130 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIlIIllIlI[13] = "   ".length() << (" ".length() << " ".length());
      lllIlIIllIlI[14] = 37 ^ 40;
      lllIlIIllIlI[15] = -" ".length();
   }

   private static int lIIllIIIlIlIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static String lIIllIIIIllIlI(String lllllllllllllllIllIIIIIllIlIlIII, String lllllllllllllllIllIIIIIllIlIIlll) {
      try {
         String lllllllllllllllIllIIIIIllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), lllIlIIllIlI[9]), "DES");
         Cipher lllllllllllllllIllIIIIIllIlIlIlI = Cipher.getInstance("DES");
         lllllllllllllllIllIIIIIllIlIlIlI.init(lllIlIIllIlI[3], lllllllllllllllIllIIIIIllIlIIlII);
         return new String(lllllllllllllllIllIIIIIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   static {
      lIIllIIIIlllIl();
      lIIllIIIIlllII();
   }

   private static boolean lIIllIIIlIlIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   protected void onDisable() {
      if (!lIIllIIIIllllI(mc.field_71439_g)) {
         if (lIIllIIIIlllll(lllllllllllllllIllIIIIlIIIIIIIIl.lastHotbarSlot, lllllllllllllllIllIIIIlIIIIIIIIl.playerHotbarSlot) && lIIllIIIIlllll(lllllllllllllllIllIIIIlIIIIIIIIl.playerHotbarSlot, lllIlIIllIlI[15])) {
            Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIllIIIIlIIIIIIIIl.playerHotbarSlot;
         }

         if (lIIllIIIlIIIII(lllllllllllllllIllIIIIlIIIIIIIIl.isSneaking)) {
            mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
            lllllllllllllllIllIIIIlIIIIIIIIl.isSneaking = (boolean)lllIlIIllIlI[1];
         }

         lllllllllllllllIllIIIIlIIIIIIIIl.playerHotbarSlot = lllIlIIllIlI[15];
         lllllllllllllllIllIIIIlIIIIIIIIl.lastHotbarSlot = lllIlIIllIlI[15];
         if (lIIllIIIlIIIII((Boolean)lllllllllllllllIllIIIIlIIIIIIIIl.debug.getValue())) {
            Command.sendChatMessage(lllIlIIlIlll[lllIlIIllIlI[5]]);
         }

      }
   }

   private static String lIIllIIIIllIll(String lllllllllllllllIllIIIIIllIIllIIl, String lllllllllllllllIllIIIIIllIIllIlI) {
      try {
         SecretKeySpec lllllllllllllllIllIIIIIllIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIllIIIIIllIIlllIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIllIIIIIllIIlllIl.init(lllIlIIllIlI[3], lllllllllllllllIllIIIIIllIIllllI);
         return new String(lllllllllllllllIllIIIIIllIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIIllIIIIllIIl(String lllllllllllllllIllIIIIIllIIIIllI, String lllllllllllllllIllIIIIIllIIIIlIl) {
      lllllllllllllllIllIIIIIllIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIIllIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllllllllllllllIllIIIIIllIIIIlII = new StringBuilder();
      char[] lllllllllllllllIllIIIIIllIIIlIII = lllllllllllllllIllIIIIIllIIIIlIl.toCharArray();
      int lllllllllllllllIllIIIIIllIIIIlll = lllIlIIllIlI[1];
      long lllllllllllllllIllIIIIIllIIIIIIl = lllllllllllllllIllIIIIIllIIIIllI.toCharArray();
      Exception lllllllllllllllIllIIIIIllIIIIIII = lllllllllllllllIllIIIIIllIIIIIIl.length;
      int lllllllllllllllIllIIIIIlIlllllll = lllIlIIllIlI[1];

      do {
         if (!lIIllIIIlIIIll(lllllllllllllllIllIIIIIlIlllllll, lllllllllllllllIllIIIIIllIIIIIII)) {
            return String.valueOf(lllllllllllllllIllIIIIIllIIIIlII);
         }

         char lllllllllllllllIllIIIIIllIIIllII = lllllllllllllllIllIIIIIllIIIIIIl[lllllllllllllllIllIIIIIlIlllllll];
         lllllllllllllllIllIIIIIllIIIIlII.append((char)(lllllllllllllllIllIIIIIllIIIllII ^ lllllllllllllllIllIIIIIllIIIlIII[lllllllllllllllIllIIIIIllIIIIlll % lllllllllllllllIllIIIIIllIIIlIII.length]));
         "".length();
         ++lllllllllllllllIllIIIIIllIIIIlll;
         ++lllllllllllllllIllIIIIIlIlllllll;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean lIIllIIIIlllll(int var0, int var1) {
      return var0 != var1;
   }

   private int findObiInHotbar() {
      double lllllllllllllllIllIIIIIllIlllllI = lllIlIIllIlI[15];
      int lllllllllllllllIllIIIIIlllIIIIIl = lllIlIIllIlI[1];

      while(lIIllIIIlIIIll(lllllllllllllllIllIIIIIlllIIIIIl, lllIlIIllIlI[10])) {
         ItemStack lllllllllllllllIllIIIIIlllIIIIlI = Wrapper.getPlayer().field_71071_by.func_70301_a(lllllllllllllllIllIIIIIlllIIIIIl);
         if (lIIllIIIlIlIIl(lllllllllllllllIllIIIIIlllIIIIlI, ItemStack.field_190927_a) && lIIllIIIlIIIII(lllllllllllllllIllIIIIIlllIIIIlI.func_77973_b() instanceof ItemBlock)) {
            Exception lllllllllllllllIllIIIIIllIlllIll = ((ItemBlock)lllllllllllllllIllIIIIIlllIIIIlI.func_77973_b()).func_179223_d();
            if (lIIllIIIlIIIII(lllllllllllllllIllIIIIIllIlllIll instanceof BlockObsidian)) {
               lllllllllllllllIllIIIIIllIlllllI = lllllllllllllllIllIIIIIlllIIIIIl;
               "".length();
               if ("   ".length() == ((92 ^ 31 ^ (132 ^ 159) << (" ".length() << " ".length())) << " ".length() & (((232 ^ 179) << " ".length() ^ 14 + 140 - 122 + 121) << " ".length() ^ -" ".length()))) {
                  return ((20 ^ 51) << " ".length() ^ 177 ^ 198) & ((60 ^ 37) << " ".length() ^ 115 ^ 120 ^ -" ".length());
               }
               break;
            }
         }

         ++lllllllllllllllIllIIIIIlllIIIIIl;
         "".length();
         if ("   ".length() <= -" ".length()) {
            return (88 ^ 41 ^ "   ".length() << (139 ^ 142)) << " ".length() & ((" ".length() << (" ".length() << (" ".length() << " ".length())) ^ " ".length()) << " ".length() ^ -" ".length());
         }
      }

      return lllllllllllllllIllIIIIIllIlllllI;
   }

   private void findClosestTarget() {
      List<EntityPlayer> lllllllllllllllIllIIIIIllIllIlII = Wrapper.getWorld().field_73010_i;
      lllllllllllllllIllIIIIIllIllIlIl.closestTarget = null;
      Iterator lllllllllllllllIllIIIIIllIllIIIl = lllllllllllllllIllIIIIIllIllIlII.iterator();

      label52:
      do {
         while(lIIllIIIlIIIII(lllllllllllllllIllIIIIIllIllIIIl.hasNext())) {
            EntityPlayer lllllllllllllllIllIIIIIllIllIllI = (EntityPlayer)lllllllllllllllIllIIIIIllIllIIIl.next();
            if (lIIllIIIlIllII(lllllllllllllllIllIIIIIllIllIllI, mc.field_71439_g)) {
               "".length();
               continue label52;
            }

            if (lIIllIIIlIIIII(Friends.isFriend(lllllllllllllllIllIIIIIllIllIllI.func_70005_c_()))) {
               "".length();
               if (" ".length() << " ".length() < 0) {
                  return;
               }
            } else if (lIIllIIIlIIIlI(EntityUtil.isLiving(lllllllllllllllIllIIIIIllIllIllI))) {
               "".length();
               if (((23 ^ 44) & ~(63 ^ 4)) != 0) {
                  return;
               }
            } else if (lIIllIIIlIIlll(lIIllIIIlIlIlI(lllllllllllllllIllIIIIIllIllIllI.func_110143_aJ(), 0.0F))) {
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               if (lIIllIIIIllllI(lllllllllllllllIllIIIIIllIllIlIl.closestTarget)) {
                  lllllllllllllllIllIIIIIllIllIlIl.closestTarget = lllllllllllllllIllIIIIIllIllIllI;
                  "".length();
                  if (((57 ^ 38) & ~(63 ^ 32)) < 0) {
                     return;
                  }
               } else {
                  if (lIIllIIIlIllIl(lIIllIIIlIlIll(Wrapper.getPlayer().func_70032_d(lllllllllllllllIllIIIIIllIllIllI), Wrapper.getPlayer().func_70032_d(lllllllllllllllIllIIIIIllIllIlIl.closestTarget)))) {
                     "".length();
                     if (-" ".length() > 0) {
                        return;
                     }
                     continue;
                  }

                  lllllllllllllllIllIIIIIllIllIlIl.closestTarget = lllllllllllllllIllIIIIIllIllIllI;
               }

               "".length();
               if (" ".length() << (" ".length() << " ".length()) <= 0) {
                  return;
               }
            }
         }

         return;
      } while(-(70 + 54 - 60 + 73 ^ 114 + 82 - 168 + 113) < 0);

   }

   protected void onEnable() {
      if (lIIllIIIIllllI(mc.field_71439_g)) {
         lllllllllllllllIllIIIIlIIIIIIlII.disable();
      } else {
         lllllllllllllllIllIIIIlIIIIIIlII.firstRun = (boolean)lllIlIIllIlI[2];
         lllllllllllllllIllIIIIlIIIIIIlII.playerHotbarSlot = Wrapper.getPlayer().field_71071_by.field_70461_c;
         lllllllllllllllIllIIIIlIIIIIIlII.lastHotbarSlot = lllIlIIllIlI[15];
      }
   }

   private static void lIIllIIIIlllII() {
      lllIlIIlIlll = new String[lllIlIIllIlI[10]];
      lllIlIIlIlll[lllIlIIllIlI[1]] = lIIllIIIIllIIl("BgweMQM=", "TmpVf");
      lllIlIIlIlll[lllIlIIllIlI[2]] = lIIllIIIIllIlI("Zgj5JOXrevwKkYv62h8EKw==", "BmflX");
      lllIlIIlIlll[lllIlIIllIlI[3]] = lIIllIIIIllIIl("Ajw9Cjc1", "PSIkC");
      lllIlIIlIlll[lllIlIIllIlI[4]] = lIIllIIIIllIll("+pHwsoFLHVJ1y7zOxrOGGQ==", "CbZaB");
      lllIlIIlIlll[lllIlIIllIlI[5]] = lIIllIIIIllIIl("CgQyBzsFNyYDCXEBLgA1MykiF3U=", "QEGsT");
      lllIlIIlIlll[lllIlIIllIlI[6]] = lIIllIIIIllIlI("vqDainTuTWA=", "YaMvi");
      lllIlIIlIlll[lllIlIIllIlI[7]] = lIIllIIIIllIIl("HyU5FhUQFi0SJ2QhIgMYKAEoTlozBSUWEyoDbAQVNkQ4AwgjAThM", "DdLbz");
      lllIlIIlIlll[lllIlIIllIlI[8]] = lIIllIIIIllIlI("yOPaPwOkBEfnYG10/Ty9eZia8kpE07OV6xvyDv/HB3s=", "dXybW");
      lllIlIIlIlll[lllIlIIllIlI[9]] = lIIllIIIIllIIl("HhYTJiwRJQciHmUZAyVjMTYUNSYxbUY=", "EWfRC");
   }

   private static boolean lIIllIIIlIlIII(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIIllIIIlIIIlI(int var0) {
      return var0 == 0;
   }

   public void onUpdate() {
      if (lIIllIIIlIIIIl(mc.field_71439_g) && !lIIllIIIlIIIII(ModuleManager.isModuleEnabled(lllIlIIlIlll[lllIlIIllIlI[6]]))) {
         lllllllllllllllIllIIIIIlllllIIII.findClosestTarget();
         if (lIIllIIIIllllI(lllllllllllllllIllIIIIIlllllIIII.closestTarget)) {
            if (lIIllIIIlIIIII(lllllllllllllllIllIIIIIlllllIIII.firstRun)) {
               lllllllllllllllIllIIIIIlllllIIII.firstRun = (boolean)lllIlIIllIlI[1];
               if (lIIllIIIlIIIII((Boolean)lllllllllllllllIllIIIIIlllllIIII.debug.getValue())) {
                  Command.sendChatMessage(lllIlIIlIlll[lllIlIIllIlI[7]]);
               }
            }

         } else {
            if (lIIllIIIlIIIII(lllllllllllllllIllIIIIIlllllIIII.firstRun)) {
               lllllllllllllllIllIIIIIlllllIIII.firstRun = (boolean)lllIlIIllIlI[1];
               lllllllllllllllIllIIIIIlllllIIII.lastTickTargetName = lllllllllllllllIllIIIIIlllllIIII.closestTarget.func_70005_c_();
               if (lIIllIIIlIIIII((Boolean)lllllllllllllllIllIIIIIlllllIIII.debug.getValue())) {
                  Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIlIIlIlll[lllIlIIllIlI[8]]).append(lllllllllllllllIllIIIIIlllllIIII.lastTickTargetName)));
                  "".length();
                  if (-" ".length() < -" ".length()) {
                     return;
                  }
               }
            } else if (lIIllIIIlIIIlI(lllllllllllllllIllIIIIIlllllIIII.lastTickTargetName.equals(lllllllllllllllIllIIIIIlllllIIII.closestTarget.func_70005_c_()))) {
               lllllllllllllllIllIIIIIlllllIIII.lastTickTargetName = lllllllllllllllIllIIIIIlllllIIII.closestTarget.func_70005_c_();
               lllllllllllllllIllIIIIIlllllIIII.offsetStep = lllIlIIllIlI[1];
               if (lIIllIIIlIIIII((Boolean)lllllllllllllllIllIIIIIlllllIIII.debug.getValue())) {
                  Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIlIIlIlll[lllIlIIllIlI[9]]).append(lllllllllllllllIllIIIIIlllllIIII.lastTickTargetName)));
               }
            }

            List<Vec3d> lllllllllllllllIllIIIIIllllIllll = new ArrayList();
            Collections.addAll(lllllllllllllllIllIIIIIllllIllll, lllllllllllllllIllIIIIIlllllIIII.offsetsDefault);
            "".length();
            int lllllllllllllllIllIIIIIlllllIIIl = lllIlIIllIlI[1];

            while(lIIllIIIlIIIll(lllllllllllllllIllIIIIIlllllIIIl, (Integer)lllllllllllllllIllIIIIIlllllIIII.blockPerTick.getValue())) {
               if (lIIllIIIlIIlII(lllllllllllllllIllIIIIIlllllIIII.offsetStep, lllllllllllllllIllIIIIIllllIllll.size())) {
                  lllllllllllllllIllIIIIIlllllIIII.offsetStep = lllIlIIllIlI[1];
                  "".length();
                  if (" ".length() << " ".length() < 0) {
                     return;
                  }
                  break;
               }

               short lllllllllllllllIllIIIIIllllIllIl = new BlockPos((Vec3d)lllllllllllllllIllIIIIIllllIllll.get(lllllllllllllllIllIIIIIlllllIIII.offsetStep));
               BlockPos lllllllllllllllIllIIIIIlllllIlIl = (new BlockPos(lllllllllllllllIllIIIIIlllllIIII.closestTarget.func_174791_d())).func_177977_b().func_177982_a(lllllllllllllllIllIIIIIllllIllIl.field_177962_a, lllllllllllllllIllIIIIIllllIllIl.field_177960_b, lllllllllllllllIllIIIIIllllIllIl.field_177961_c);
               String lllllllllllllllIllIIIIIllllIlIll = lllIlIIllIlI[2];
               if (lIIllIIIlIIIlI(Wrapper.getWorld().func_180495_p(lllllllllllllllIllIIIIIlllllIlIl).func_185904_a().func_76222_j())) {
                  lllllllllllllllIllIIIIIllllIlIll = lllIlIIllIlI[1];
               }

               Iterator lllllllllllllllIllIIIIIllllIlIlI = mc.field_71441_e.func_72839_b((Entity)null, new AxisAlignedBB(lllllllllllllllIllIIIIIlllllIlIl)).iterator();

               while(lIIllIIIlIIIII(lllllllllllllllIllIIIIIllllIlIlI.hasNext())) {
                  Entity lllllllllllllllIllIIIIIlllllIlll = (Entity)lllllllllllllllIllIIIIIllllIlIlI.next();
                  if (lIIllIIIlIIIlI(lllllllllllllllIllIIIIIlllllIlll instanceof EntityItem) && lIIllIIIlIIIlI(lllllllllllllllIllIIIIIlllllIlll instanceof EntityXPOrb)) {
                     lllllllllllllllIllIIIIIllllIlIll = lllIlIIllIlI[1];
                     "".length();
                     if ("   ".length() != "   ".length()) {
                        return;
                     }
                     break;
                  }

                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) == 0) {
                     return;
                  }
               }

               if (lIIllIIIlIIIII(lllllllllllllllIllIIIIIllllIlIll) && lIIllIIIlIIIII(lllllllllllllllIllIIIIIlllllIIII.placeBlock(lllllllllllllllIllIIIIIlllllIlIl))) {
                  ++lllllllllllllllIllIIIIIlllllIIIl;
               }

               lllllllllllllllIllIIIIIlllllIIII.offsetStep += lllIlIIllIlI[2];
               "".length();
               if (" ".length() << " ".length() > " ".length() << " ".length()) {
                  return;
               }
            }

            if (lIIllIIIlIIlIl(lllllllllllllllIllIIIIIlllllIIIl)) {
               if (lIIllIIIIlllll(lllllllllllllllIllIIIIIlllllIIII.lastHotbarSlot, lllllllllllllllIllIIIIIlllllIIII.playerHotbarSlot) && lIIllIIIIlllll(lllllllllllllllIllIIIIIlllllIIII.playerHotbarSlot, lllIlIIllIlI[15])) {
                  Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIllIIIIIlllllIIII.playerHotbarSlot;
                  lllllllllllllllIllIIIIIlllllIIII.lastHotbarSlot = lllllllllllllllIllIIIIIlllllIIII.playerHotbarSlot;
               }

               if (lIIllIIIlIIIII(lllllllllllllllIllIIIIIlllllIIII.isSneaking)) {
                  mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
                  lllllllllllllllIllIIIIIlllllIIII.isSneaking = (boolean)lllIlIIllIlI[1];
               }
            }

         }
      }
   }

   private static boolean lIIllIIIlIIIll(int var0, int var1) {
      return var0 < var1;
   }

   private boolean placeBlock(BlockPos lllllllllllllllIllIIIIIlllIlIIlI) {
      if (lIIllIIIlIIIlI(mc.field_71441_e.func_180495_p(lllllllllllllllIllIIIIIlllIlIIlI).func_185904_a().func_76222_j())) {
         return (boolean)lllIlIIllIlI[1];
      } else if (lIIllIIIlIIIlI(BlockInteractionHelper.checkForNeighbours(lllllllllllllllIllIIIIIlllIlIIlI))) {
         return (boolean)lllIlIIllIlI[1];
      } else {
         Vec3d lllllllllllllllIllIIIIIlllIlIlII = new Vec3d(Wrapper.getPlayer().field_70165_t, Wrapper.getPlayer().field_70163_u + (double)Wrapper.getPlayer().func_70047_e(), Wrapper.getPlayer().field_70161_v);
         String lllllllllllllllIllIIIIIlllIlIIII = EnumFacing.values();
         double lllllllllllllllIllIIIIIlllIIllll = lllllllllllllllIllIIIIIlllIlIIII.length;
         int lllllllllllllllIllIIIIIlllIIlllI = lllIlIIllIlI[1];

         do {
            if (!lIIllIIIlIIIll(lllllllllllllllIllIIIIIlllIIlllI, lllllllllllllllIllIIIIIlllIIllll)) {
               return (boolean)lllIlIIllIlI[1];
            }

            int lllllllllllllllIllIIIIIlllIIllIl = lllllllllllllllIllIIIIIlllIlIIII[lllllllllllllllIllIIIIIlllIIlllI];
            BlockPos lllllllllllllllIllIIIIIlllIllIIl = lllllllllllllllIllIIIIIlllIlIIlI.func_177972_a(lllllllllllllllIllIIIIIlllIIllIl);
            Exception lllllllllllllllIllIIIIIlllIIlIll = lllllllllllllllIllIIIIIlllIIllIl.func_176734_d();
            if (lIIllIIIlIIIII(mc.field_71441_e.func_180495_p(lllllllllllllllIllIIIIIlllIllIIl).func_177230_c().func_176209_a(mc.field_71441_e.func_180495_p(lllllllllllllllIllIIIIIlllIllIIl), (boolean)lllIlIIllIlI[1]))) {
               long lllllllllllllllIllIIIIIlllIIlIlI = (new Vec3d(lllllllllllllllIllIIIIIlllIllIIl)).func_72441_c(0.5D, 0.5D, 0.5D).func_178787_e((new Vec3d(lllllllllllllllIllIIIIIlllIIlIll.func_176730_m())).func_186678_a(0.5D));
               if (lIIllIIIlIIlll(lIIllIIIlIIllI(lllllllllllllllIllIIIIIlllIlIlII.func_72438_d(lllllllllllllllIllIIIIIlllIIlIlI), (Double)lllllllllllllllIllIIIIIlllIlIIll.range.getValue()))) {
                  int lllllllllllllllIllIIIIIlllIlllII = lllllllllllllllIllIIIIIlllIlIIll.findObiInHotbar();
                  if (lIIllIIIlIlIII(lllllllllllllllIllIIIIIlllIlllII, lllIlIIllIlI[15])) {
                     lllllllllllllllIllIIIIIlllIlIIll.disable();
                     return (boolean)lllIlIIllIlI[1];
                  }

                  if (lIIllIIIIlllll(lllllllllllllllIllIIIIIlllIlIIll.lastHotbarSlot, lllllllllllllllIllIIIIIlllIlllII)) {
                     Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIllIIIIIlllIlllII;
                     lllllllllllllllIllIIIIIlllIlIIll.lastHotbarSlot = lllllllllllllllIllIIIIIlllIlllII;
                  }

                  float lllllllllllllllIllIIIIIlllIIlIII = mc.field_71441_e.func_180495_p(lllllllllllllllIllIIIIIlllIllIIl).func_177230_c();
                  if (!lIIllIIIlIIIlI(BlockInteractionHelper.blackList.contains(lllllllllllllllIllIIIIIlllIIlIII)) || lIIllIIIlIIIII(BlockInteractionHelper.shulkerList.contains(lllllllllllllllIllIIIIIlllIIlIII))) {
                     mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_SNEAKING));
                     lllllllllllllllIllIIIIIlllIlIIll.isSneaking = (boolean)lllIlIIllIlI[2];
                  }

                  if (lIIllIIIlIIIII((Boolean)lllllllllllllllIllIIIIIlllIlIIll.rotate.getValue())) {
                     BlockInteractionHelper.faceVectorPacketInstant(lllllllllllllllIllIIIIIlllIIlIlI);
                  }

                  mc.field_71442_b.func_187099_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIllIIIIIlllIllIIl, lllllllllllllllIllIIIIIlllIIlIll, lllllllllllllllIllIIIIIlllIIlIlI, EnumHand.MAIN_HAND);
                  "".length();
                  mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                  return (boolean)lllIlIIllIlI[2];
               }
            }

            ++lllllllllllllllIllIIIIIlllIIlllI;
            "".length();
         } while(-" ".length() < 0);

         return (boolean)(((204 ^ 157) << " ".length() ^ 167 + 83 - 96 + 17) << "   ".length() & (((172 ^ 133) << (" ".length() << " ".length()) ^ 169 + 77 - 151 + 78) << "   ".length() ^ -" ".length()));
      }
   }
}
