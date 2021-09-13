package rr.snowhack.snow.module.modules.combat;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockObsidian;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayerDigging;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameType;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.BlockInteractionHelper;

@Module.Info(
   name = "Surround",
   category = Module.Category.COMBAT
)
public class Surround extends Module {
   // $FF: synthetic field
   private int totalTicksRunning;
   // $FF: synthetic field
   private Setting<Integer> blocksPerTick;
   // $FF: synthetic field
   private Setting<Boolean> rotate;
   // $FF: synthetic field
   private static final String[] lllllIIlIlll;
   // $FF: synthetic field
   private Setting<Boolean> noGlitchBlocks;
   // $FF: synthetic field
   private Setting<Surround.Mode> mode;
   // $FF: synthetic field
   private boolean isSneaking;
   // $FF: synthetic field
   private int lastHotbarSlot;
   // $FF: synthetic field
   private Setting<Integer> tickDelay;
   // $FF: synthetic field
   private int offsetStep;
   // $FF: synthetic field
   private static final int[] lllllIIllIlI;
   // $FF: synthetic field
   private int delayStep;
   // $FF: synthetic field
   private Setting<Boolean> triggerable;
   // $FF: synthetic field
   private int playerHotbarSlot;
   // $FF: synthetic field
   private boolean firstRun;
   // $FF: synthetic field
   private Setting<Integer> timeoutTicks;

   private static boolean lIlIIIlIllIIlI(Object var0) {
      return var0 != null;
   }

   public Surround() {
      lllllllllllllllIlIIllllllIIIIIIl.mode = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.e(lllllIIlIlll[lllllIIllIlI[0]], Surround.Mode.Full));
      lllllllllllllllIlIIllllllIIIIIIl.triggerable = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.b(lllllIIlIlll[lllllIIllIlI[1]], (boolean)lllllIIllIlI[1]));
      lllllllllllllllIlIIllllllIIIIIIl.timeoutTicks = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.integerBuilder(lllllIIlIlll[lllllIIllIlI[2]]).withValue((Number)lllllIIllIlI[3]).withRange(lllllIIllIlI[1], lllllIIllIlI[4]).build());
      lllllllllllllllIlIIllllllIIIIIIl.blocksPerTick = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.integerBuilder(lllllIIlIlll[lllllIIllIlI[5]]).withValue((Number)lllllIIllIlI[6]).withRange(lllllIIllIlI[1], lllllIIllIlI[7]).build());
      lllllllllllllllIlIIllllllIIIIIIl.tickDelay = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.i(lllllIIlIlll[lllllIIllIlI[6]], lllllIIllIlI[0]));
      lllllllllllllllIlIIllllllIIIIIIl.rotate = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.b(lllllIIlIlll[lllllIIllIlI[8]], (boolean)lllllIIllIlI[1]));
      lllllllllllllllIlIIllllllIIIIIIl.noGlitchBlocks = lllllllllllllllIlIIllllllIIIIIIl.register(Settings.b(lllllIIlIlll[lllllIIllIlI[9]], (boolean)lllllIIllIlI[1]));
      lllllllllllllllIlIIllllllIIIIIIl.playerHotbarSlot = lllllIIllIlI[10];
      lllllllllllllllIlIIllllllIIIIIIl.lastHotbarSlot = lllllIIllIlI[10];
      lllllllllllllllIlIIllllllIIIIIIl.offsetStep = lllllIIllIlI[0];
      lllllllllllllllIlIIllllllIIIIIIl.delayStep = lllllIIllIlI[0];
      lllllllllllllllIlIIllllllIIIIIIl.totalTicksRunning = lllllIIllIlI[0];
      lllllllllllllllIlIIllllllIIIIIIl.isSneaking = (boolean)lllllIIllIlI[0];
   }

   private static String lIlIIIlIlIlIlI(String lllllllllllllllIlIIlllllIIIlIIll, String lllllllllllllllIlIIlllllIIIlIIII) {
      try {
         SecretKeySpec lllllllllllllllIlIIlllllIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllIIIlIIII.getBytes(StandardCharsets.UTF_8)), lllllIIllIlI[13]), "DES");
         String lllllllllllllllIlIIlllllIIIIlllI = Cipher.getInstance("DES");
         lllllllllllllllIlIIlllllIIIIlllI.init(lllllIIllIlI[2], lllllllllllllllIlIIlllllIIIlIllI);
         return new String(lllllllllllllllIlIIlllllIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static String lIlIIIlIlIlIIl(String lllllllllllllllIlIIlllllIIllIlIl, String lllllllllllllllIlIIlllllIIllIlII) {
      lllllllllllllllIlIIlllllIIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIlllllIIllIIll = new StringBuilder();
      boolean lllllllllllllllIlIIlllllIIlIllIl = lllllllllllllllIlIIlllllIIllIlII.toCharArray();
      int lllllllllllllllIlIIlllllIIllIIIl = lllllIIllIlI[0];
      long lllllllllllllllIlIIlllllIIlIlIll = lllllllllllllllIlIIlllllIIllIlIl.toCharArray();
      int lllllllllllllllIlIIlllllIIlIlIlI = lllllllllllllllIlIIlllllIIlIlIll.length;
      int lllllllllllllllIlIIlllllIIlIlIIl = lllllIIllIlI[0];

      do {
         if (!lIlIIIlIllIlIl(lllllllllllllllIlIIlllllIIlIlIIl, lllllllllllllllIlIIlllllIIlIlIlI)) {
            return String.valueOf(lllllllllllllllIlIIlllllIIllIIll);
         }

         char lllllllllllllllIlIIlllllIIllIllI = lllllllllllllllIlIIlllllIIlIlIll[lllllllllllllllIlIIlllllIIlIlIIl];
         lllllllllllllllIlIIlllllIIllIIll.append((char)(lllllllllllllllIlIIlllllIIllIllI ^ lllllllllllllllIlIIlllllIIlIllIl[lllllllllllllllIlIIlllllIIllIIIl % lllllllllllllllIlIIlllllIIlIllIl.length]));
         "".length();
         ++lllllllllllllllIlIIlllllIIllIIIl;
         ++lllllllllllllllIlIIlllllIIlIlIIl;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > -" ".length());

      return null;
   }

   private static boolean lIlIIIlIlllIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   private boolean placeBlock(BlockPos lllllllllllllllIlIIlllllIlIlIlII) {
      float lllllllllllllllIlIIlllllIlIlIIll = mc.field_71441_e.func_180495_p(lllllllllllllllIlIIlllllIlIlIlII).func_177230_c();
      if (lIlIIIlIllIlII(lllllllllllllllIlIIlllllIlIlIIll instanceof BlockAir) && lIlIIIlIllIlII(lllllllllllllllIlIIlllllIlIlIIll instanceof BlockLiquid)) {
         return (boolean)lllllIIllIlI[0];
      } else {
         Iterator lllllllllllllllIlIIlllllIlIlIIlI = mc.field_71441_e.func_72839_b((Entity)null, new AxisAlignedBB(lllllllllllllllIlIIlllllIlIlIlII)).iterator();

         while(lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlIlIIlI.hasNext())) {
            char lllllllllllllllIlIIlllllIlIlIIIl = (Entity)lllllllllllllllIlIIlllllIlIlIIlI.next();
            if (lIlIIIlIllIlII(lllllllllllllllIlIIlllllIlIlIIIl instanceof EntityItem) && lIlIIIlIllIlII(lllllllllllllllIlIIlllllIlIlIIIl instanceof EntityXPOrb)) {
               return (boolean)lllllIIllIlI[0];
            }

            "".length();
            if (" ".length() << (" ".length() << " ".length()) < (((44 ^ 119) << " ".length() ^ 134 + 42 - 108 + 111) << "   ".length() & ((82 + 155 - 165 + 111 ^ (14 ^ 87) << " ".length()) << "   ".length() ^ -" ".length()))) {
               return (boolean)(((3 ^ 34) << (" ".length() << " ".length()) ^ 119 + 129 - 244 + 143) << (" ".length() << " ".length()) & (((73 ^ 76) << (8 ^ 13) ^ 145 + 85 - 202 + 155) << (" ".length() << " ".length()) ^ -" ".length()));
            }
         }

         EnumFacing lllllllllllllllIlIIlllllIlIllIll = BlockInteractionHelper.getPlaceableSide(lllllllllllllllIlIIlllllIlIlIlII);
         if (lIlIIIlIlIllll(lllllllllllllllIlIIlllllIlIllIll)) {
            return (boolean)lllllIIllIlI[0];
         } else {
            BlockPos lllllllllllllllIlIIlllllIlIllIlI = lllllllllllllllIlIIlllllIlIlIlII.func_177972_a(lllllllllllllllIlIIlllllIlIllIll);
            EnumFacing lllllllllllllllIlIIlllllIlIllIIl = lllllllllllllllIlIIlllllIlIllIll.func_176734_d();
            if (lIlIIIlIllIlII(BlockInteractionHelper.canBeClicked(lllllllllllllllIlIIlllllIlIllIlI))) {
               return (boolean)lllllIIllIlI[0];
            } else {
               long lllllllllllllllIlIIlllllIlIIllll = (new Vec3d(lllllllllllllllIlIIlllllIlIllIlI)).func_72441_c(0.5D, 0.5D, 0.5D).func_178787_e((new Vec3d(lllllllllllllllIlIIlllllIlIllIIl.func_176730_m())).func_186678_a(0.5D));
               Block lllllllllllllllIlIIlllllIlIlIlll = mc.field_71441_e.func_180495_p(lllllllllllllllIlIIlllllIlIllIlI).func_177230_c();
               int lllllllllllllllIlIIlllllIlIlIllI = lllllllllllllllIlIIlllllIlIllllI.findObiInHotbar();
               if (lIlIIIlIlllIII(lllllllllllllllIlIIlllllIlIlIllI, lllllIIllIlI[10])) {
                  lllllllllllllllIlIIlllllIlIllllI.disable();
               }

               if (lIlIIIlIllIIII(lllllllllllllllIlIIlllllIlIllllI.lastHotbarSlot, lllllllllllllllIlIIlllllIlIlIllI)) {
                  mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIIlllllIlIlIllI;
                  lllllllllllllllIlIIlllllIlIllllI.lastHotbarSlot = lllllllllllllllIlIIlllllIlIlIllI;
               }

               if (lIlIIIlIllIlII(lllllllllllllllIlIIlllllIlIllllI.isSneaking) && !lIlIIIlIllIlII(BlockInteractionHelper.blackList.contains(lllllllllllllllIlIIlllllIlIlIlll)) || lIlIIIlIllIIIl(BlockInteractionHelper.shulkerList.contains(lllllllllllllllIlIIlllllIlIlIlll))) {
                  mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_SNEAKING));
                  lllllllllllllllIlIIlllllIlIllllI.isSneaking = (boolean)lllllIIllIlI[1];
               }

               if (lIlIIIlIllIIIl((Boolean)lllllllllllllllIlIIlllllIlIllllI.rotate.getValue())) {
                  BlockInteractionHelper.faceVectorPacketInstant(lllllllllllllllIlIIlllllIlIIllll);
               }

               mc.field_71442_b.func_187099_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIlIIlllllIlIllIlI, lllllllllllllllIlIIlllllIlIllIIl, lllllllllllllllIlIIlllllIlIIllll, EnumHand.MAIN_HAND);
               "".length();
               mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
               mc.field_71467_ac = lllllIIllIlI[6];
               if (lIlIIIlIllIIIl((Boolean)lllllllllllllllIlIIlllllIlIllllI.noGlitchBlocks.getValue()) && lIlIIIlIllIlII(mc.field_71442_b.func_178889_l().equals(GameType.CREATIVE))) {
                  mc.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerDigging(net.minecraft.network.play.client.CPacketPlayerDigging.Action.START_DESTROY_BLOCK, lllllllllllllllIlIIlllllIlIllIlI, lllllllllllllllIlIIlllllIlIllIIl));
               }

               return (boolean)lllllIIllIlI[1];
            }
         }
      }
   }

   private static boolean lIlIIIlIllIIII(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIlIIIlIllIlll(int var0) {
      return var0 > 0;
   }

   private static boolean lIlIIIlIllIlIl(int var0, int var1) {
      return var0 < var1;
   }

   private int findObiInHotbar() {
      Exception lllllllllllllllIlIIlllllIlIIIIll = lllllIIllIlI[10];
      int lllllllllllllllIlIIlllllIlIIIIlI = lllllIIllIlI[0];

      while(lIlIIIlIllIlIl(lllllllllllllllIlIIlllllIlIIIIlI, lllllIIllIlI[12])) {
         boolean lllllllllllllllIlIIlllllIlIIIIIl = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIIlllllIlIIIIlI);
         if (lIlIIIlIlllIIl(lllllllllllllllIlIIlllllIlIIIIIl, ItemStack.field_190927_a) && lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlIIIIIl.func_77973_b() instanceof ItemBlock)) {
            Block lllllllllllllllIlIIlllllIlIIlIII = ((ItemBlock)lllllllllllllllIlIIlllllIlIIIIIl.func_77973_b()).func_179223_d();
            if (lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlIIlIII instanceof BlockObsidian)) {
               lllllllllllllllIlIIlllllIlIIIIll = lllllllllllllllIlIIlllllIlIIIIlI;
               "".length();
               if (" ".length() < (((29 ^ 26) << (" ".length() << " ".length()) ^ 162 ^ 173) & (13 ^ 88 ^ (150 ^ 181) << " ".length() ^ -" ".length()))) {
                  return (" ".length() << (" ".length() << (" ".length() << " ".length())) ^ 14 ^ 73) & (135 + 67 - 182 + 175 ^ (171 ^ 142) << (" ".length() << " ".length()) ^ -" ".length());
               }
               break;
            }
         }

         ++lllllllllllllllIlIIlllllIlIIIIlI;
         "".length();
         if ((((44 ^ 51) << " ".length() ^ 8 ^ 51) << "   ".length() & (((78 ^ 89) << "   ".length() ^ 97 + 78 - -13 + 1) << "   ".length() ^ -" ".length())) > " ".length() << (" ".length() << " ".length())) {
            return (31 ^ 2 ^ (83 ^ 84) << "   ".length()) & ((186 ^ 191) << (" ".length() << (" ".length() << " ".length())) ^ 233 ^ 156 ^ -" ".length());
         }
      }

      return lllllllllllllllIlIIlllllIlIIIIll;
   }

   private static String lIlIIIlIlIlIll(String lllllllllllllllIlIIlllllIIlIIIII, String lllllllllllllllIlIIlllllIIIlllIl) {
      try {
         boolean lllllllllllllllIlIIlllllIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllllIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIlllllIIlIIIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlllllIIlIIIlI.init(lllllIIllIlI[2], lllllllllllllllIlIIlllllIIIlllII);
         return new String(lllllllllllllllIlIIlllllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIlIllIIIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIIlIlIllll(Object var0) {
      return var0 == null;
   }

   private static void lIlIIIlIlIlllI() {
      lllllIIllIlI = new int[14];
      lllllIIllIlI[0] = ((155 ^ 192) << " ".length() ^ 80 + 122 - 92 + 37) & ((245 ^ 172) << " ".length() ^ 149 + 65 - 71 + 8 ^ -" ".length());
      lllllIIllIlI[1] = " ".length();
      lllllIIllIlI[2] = " ".length() << " ".length();
      lllllIIllIlI[3] = (87 ^ 82) << "   ".length();
      lllllIIllIlI[4] = (" ".length() << (155 ^ 158) ^ 143 ^ 182) << (" ".length() << " ".length());
      lllllIIllIlI[5] = "   ".length();
      lllllIIllIlI[6] = " ".length() << (" ".length() << " ".length());
      lllllIIllIlI[7] = (243 ^ 194 ^ (9 ^ 4) << (" ".length() << " ".length())) << " ".length();
      lllllIIllIlI[8] = 147 + 46 - 149 + 137 ^ (178 ^ 185) << (" ".length() << (" ".length() << " ".length()));
      lllllIIllIlI[9] = "   ".length() << " ".length();
      lllllIIllIlI[10] = -" ".length();
      lllllIIllIlI[11] = 44 ^ 43;
      lllllIIllIlI[12] = 142 ^ 135;
      lllllIIllIlI[13] = " ".length() << "   ".length();
   }

   private static void lIlIIIlIlIllII() {
      lllllIIlIlll = new String[lllllIIllIlI[13]];
      lllllIIlIlll[lllllIIllIlI[0]] = lIlIIIlIlIlIIl("CDkNEw==", "EVivx");
      lllllIIlIlll[lllllIIllIlI[1]] = lIlIIIlIlIlIlI("ftKFvefFPje8FGDRlmvpyg==", "weYGO");
      lllllIIlIlll[lllllIIllIlI[2]] = lIlIIIlIlIlIIl("Fh0ACBg3ADkENCkH", "BtmmW");
      lllllIIlIlll[lllllIIllIlI[5]] = lIlIIIlIlIlIlI("gkU2p90nO/6LovKv8W5vdQ==", "PDKPY");
      lllllIIlIlll[lllllIIllIlI[6]] = lIlIIIlIlIlIIl("FQYNMSckAw8j", "AonZc");
      lllllIIlIlll[lllllIIllIlI[8]] = lIlIIIlIlIlIll("J5rZIGVELDQ=", "mYWBW");
      lllllIIlIlll[lllllIIllIlI[9]] = lIlIIIlIlIlIlI("V3kY4ZypQPVyglO+ipp5Qg==", "TVRsg");
      lllllIIlIlll[lllllIIllIlI[11]] = lIlIIIlIlIlIlI("dSHn59wvrMI=", "VjUcq");
   }

   public void onUpdate() {
      if (lIlIIIlIllIIlI(mc.field_71439_g) && !lIlIIIlIllIIIl(ModuleManager.getModuleByName(lllllIIlIlll[lllllIIllIlI[11]]).isEnabled())) {
         if (lIlIIIlIllIIIl((Boolean)lllllllllllllllIlIIlllllIlllIIII.triggerable.getValue()) && lIlIIIlIllIIll(lllllllllllllllIlIIlllllIlllIIII.totalTicksRunning, (Integer)lllllllllllllllIlIIlllllIlllIIII.timeoutTicks.getValue())) {
            lllllllllllllllIlIIlllllIlllIIII.totalTicksRunning = lllllIIllIlI[0];
            lllllllllllllllIlIIlllllIlllIIII.disable();
         } else {
            if (lIlIIIlIllIlII(lllllllllllllllIlIIlllllIlllIIII.firstRun)) {
               if (lIlIIIlIllIlIl(lllllllllllllllIlIIlllllIlllIIII.delayStep, (Integer)lllllllllllllllIlIIlllllIlllIIII.tickDelay.getValue())) {
                  lllllllllllllllIlIIlllllIlllIIII.delayStep += lllllIIllIlI[1];
                  return;
               }

               lllllllllllllllIlIIlllllIlllIIII.delayStep = lllllIIllIlI[0];
            }

            if (lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlllIIII.firstRun)) {
               lllllllllllllllIlIIlllllIlllIIII.firstRun = (boolean)lllllIIllIlI[0];
            }

            int lllllllllllllllIlIIlllllIllIllll = lllllIIllIlI[0];

            while(lIlIIIlIllIlIl(lllllllllllllllIlIIlllllIllIllll, (Integer)lllllllllllllllIlIIlllllIlllIIII.blocksPerTick.getValue())) {
               float lllllllllllllllIlIIlllllIllIllII = new Vec3d[lllllIIllIlI[0]];
               char lllllllllllllllIlIIlllllIllIlIll = lllllIIllIlI[0];
               if (lIlIIIlIllIllI(lllllllllllllllIlIIlllllIlllIIII.mode.getValue(), Surround.Mode.Full)) {
                  lllllllllllllllIlIIlllllIllIllII = Surround.Offsets.FULL;
                  lllllllllllllllIlIIlllllIllIlIll = Surround.Offsets.FULL.length;
               }

               if (lIlIIIlIllIllI(lllllllllllllllIlIIlllllIlllIIII.mode.getValue(), Surround.Mode.Surround)) {
                  lllllllllllllllIlIIlllllIllIllII = Surround.Offsets.SURROUND;
                  lllllllllllllllIlIIlllllIllIlIll = Surround.Offsets.SURROUND.length;
               }

               if (lIlIIIlIllIIll(lllllllllllllllIlIIlllllIlllIIII.offsetStep, lllllllllllllllIlIIlllllIllIlIll)) {
                  lllllllllllllllIlIIlllllIlllIIII.offsetStep = lllllIIllIlI[0];
                  "".length();
                  if (" ".length() == 0) {
                     return;
                  }
                  break;
               }

               BlockPos lllllllllllllllIlIIlllllIlllIIlI = new BlockPos(lllllllllllllllIlIIlllllIllIllII[lllllllllllllllIlIIlllllIlllIIII.offsetStep]);
               BlockPos lllllllllllllllIlIIlllllIlllIIIl = (new BlockPos(mc.field_71439_g.func_174791_d())).func_177982_a(lllllllllllllllIlIIlllllIlllIIlI.field_177962_a, lllllllllllllllIlIIlllllIlllIIlI.field_177960_b, lllllllllllllllIlIIlllllIlllIIlI.field_177961_c);
               if (lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlllIIII.placeBlock(lllllllllllllllIlIIlllllIlllIIIl))) {
                  ++lllllllllllllllIlIIlllllIllIllll;
               }

               lllllllllllllllIlIIlllllIlllIIII.offsetStep += lllllIIllIlI[1];
               "".length();
               if (((107 ^ 70) & ~(108 ^ 65)) >= " ".length() << " ".length()) {
                  return;
               }
            }

            if (lIlIIIlIllIlll(lllllllllllllllIlIIlllllIllIllll)) {
               if (lIlIIIlIllIIII(lllllllllllllllIlIIlllllIlllIIII.lastHotbarSlot, lllllllllllllllIlIIlllllIlllIIII.playerHotbarSlot) && lIlIIIlIllIIII(lllllllllllllllIlIIlllllIlllIIII.playerHotbarSlot, lllllIIllIlI[10])) {
                  mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIIlllllIlllIIII.playerHotbarSlot;
                  lllllllllllllllIlIIlllllIlllIIII.lastHotbarSlot = lllllllllllllllIlIIlllllIlllIIII.playerHotbarSlot;
               }

               if (lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlllIIII.isSneaking)) {
                  mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
                  lllllllllllllllIlIIlllllIlllIIII.isSneaking = (boolean)lllllIIllIlI[0];
               }
            }

            lllllllllllllllIlIIlllllIlllIIII.totalTicksRunning += lllllIIllIlI[1];
         }
      }
   }

   public void onEnable() {
      lllllllllllllllIlIIlllllIllllllI.firstRun = (boolean)lllllIIllIlI[1];
      lllllllllllllllIlIIlllllIllllllI.playerHotbarSlot = mc.field_71439_g.field_71071_by.field_70461_c;
      lllllllllllllllIlIIlllllIllllllI.lastHotbarSlot = lllllIIllIlI[10];
   }

   private static boolean lIlIIIlIlllIII(int var0, int var1) {
      return var0 == var1;
   }

   static {
      lIlIIIlIlIlllI();
      lIlIIIlIlIllII();
   }

   private static boolean lIlIIIlIllIIll(int var0, int var1) {
      return var0 >= var1;
   }

   public void onDisable() {
      if (!lIlIIIlIlIllll(mc.field_71439_g)) {
         if (lIlIIIlIllIIII(lllllllllllllllIlIIlllllIlllllII.lastHotbarSlot, lllllllllllllllIlIIlllllIlllllII.playerHotbarSlot) && lIlIIIlIllIIII(lllllllllllllllIlIIlllllIlllllII.playerHotbarSlot, lllllIIllIlI[10])) {
            mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIIlllllIlllllII.playerHotbarSlot;
         }

         if (lIlIIIlIllIIIl(lllllllllllllllIlIIlllllIlllllII.isSneaking)) {
            mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
            lllllllllllllllIlIIlllllIlllllII.isSneaking = (boolean)lllllIIllIlI[0];
         }

         lllllllllllllllIlIIlllllIlllllII.playerHotbarSlot = lllllIIllIlI[10];
         lllllllllllllllIlIIlllllIlllllII.lastHotbarSlot = lllllIIllIlI[10];
      }
   }

   private static boolean lIlIIIlIllIllI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIlIIIlIllIlII(int var0) {
      return var0 == 0;
   }

   private static enum Mode {
      // $FF: synthetic field
      Surround;

      // $FF: synthetic field
      private static final String[] llllIIlIIlII;
      // $FF: synthetic field
      private static final int[] llllIIlIIlIl;
      // $FF: synthetic field
      Full;

      private static boolean lIIlllllIIllII(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIIlllllIIlIlI() {
         llllIIlIIlII = new String[llllIIlIIlIl[2]];
         llllIIlIIlII[llllIIlIIlIl[0]] = lIIlllllIIlIII("vNHiwn68zbzehT7keRj9Pw==", "HCNoF");
         llllIIlIIlII[llllIIlIIlIl[1]] = lIIlllllIIlIIl("FSIHHg==", "SWkrt");
      }

      private static String lIIlllllIIlIII(String lllllllllllllllIlIlIlIllIIlIIlIl, String lllllllllllllllIlIlIlIllIIlIIlII) {
         try {
            SecretKeySpec lllllllllllllllIlIlIlIllIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Exception lllllllllllllllIlIlIlIllIIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIlIllIIlIIIlI.init(llllIIlIIlIl[2], lllllllllllllllIlIlIlIllIIlIlIlI);
            return new String(lllllllllllllllIlIlIlIllIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static String lIIlllllIIlIIl(String lllllllllllllllIlIlIlIllIIIlIlll, String lllllllllllllllIlIlIlIllIIIlIllI) {
         lllllllllllllllIlIlIlIllIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlIllIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         float lllllllllllllllIlIlIlIllIIIlIIII = new StringBuilder();
         char lllllllllllllllIlIlIlIllIIIIllll = lllllllllllllllIlIlIlIllIIIlIllI.toCharArray();
         int lllllllllllllllIlIlIlIllIIIlIIll = llllIIlIIlIl[0];
         long lllllllllllllllIlIlIlIllIIIIllIl = lllllllllllllllIlIlIlIllIIIlIlll.toCharArray();
         String lllllllllllllllIlIlIlIllIIIIllII = lllllllllllllllIlIlIlIllIIIIllIl.length;
         int lllllllllllllllIlIlIlIllIIIIlIll = llllIIlIIlIl[0];

         do {
            if (!lIIlllllIIllII(lllllllllllllllIlIlIlIllIIIIlIll, lllllllllllllllIlIlIlIllIIIIllII)) {
               return String.valueOf(lllllllllllllllIlIlIlIllIIIlIIII);
            }

            char lllllllllllllllIlIlIlIllIIIllIII = lllllllllllllllIlIlIlIllIIIIllIl[lllllllllllllllIlIlIlIllIIIIlIll];
            lllllllllllllllIlIlIlIllIIIlIIII.append((char)(lllllllllllllllIlIlIlIllIIIllIII ^ lllllllllllllllIlIlIlIllIIIIllll[lllllllllllllllIlIlIlIllIIIlIIll % lllllllllllllllIlIlIlIllIIIIllll.length]));
            "".length();
            ++lllllllllllllllIlIlIlIllIIIlIIll;
            ++lllllllllllllllIlIlIlIllIIIIlIll;
            "".length();
         } while(" ".length() >= 0);

         return null;
      }

      static {
         lIIlllllIIlIll();
         lIIlllllIIlIlI();
         Surround = new Surround.Mode(llllIIlIIlII[llllIIlIIlIl[0]], llllIIlIIlIl[0]);
         Full = new Surround.Mode(llllIIlIIlII[llllIIlIIlIl[1]], llllIIlIIlIl[1]);
         Surround.Mode[] var10000 = new Surround.Mode[llllIIlIIlIl[2]];
         var10000[llllIIlIIlIl[0]] = Surround;
         var10000[llllIIlIIlIl[1]] = Full;
      }

      private static void lIIlllllIIlIll() {
         llllIIlIIlIl = new int[3];
         llllIIlIIlIl[0] = ((1 ^ 96) << " ".length() ^ 31 + 25 - -4 + 91) & ((175 ^ 136) << " ".length() ^ 47 ^ 52 ^ -" ".length());
         llllIIlIIlIl[1] = " ".length();
         llllIIlIIlIl[2] = " ".length() << " ".length();
      }
   }

   private static class Offsets {
      // $FF: synthetic field
      private static final Vec3d[] FULL;
      // $FF: synthetic field
      private static final int[] lIIIIlIlIIllI;
      // $FF: synthetic field
      private static final Vec3d[] SURROUND;

      static {
         lIlIlIllIllIII();
         Vec3d[] var10000 = new Vec3d[lIIIIlIlIIllI[0]];
         var10000[lIIIIlIlIIllI[1]] = new Vec3d(1.0D, 0.0D, 0.0D);
         var10000[lIIIIlIlIIllI[2]] = new Vec3d(0.0D, 0.0D, 1.0D);
         var10000[lIIIIlIlIIllI[3]] = new Vec3d(-1.0D, 0.0D, 0.0D);
         var10000[lIIIIlIlIIllI[4]] = new Vec3d(0.0D, 0.0D, -1.0D);
         var10000[lIIIIlIlIIllI[5]] = new Vec3d(1.0D, -1.0D, 0.0D);
         var10000[lIIIIlIlIIllI[6]] = new Vec3d(0.0D, -1.0D, 1.0D);
         var10000[lIIIIlIlIIllI[7]] = new Vec3d(-1.0D, -1.0D, 0.0D);
         var10000[lIIIIlIlIIllI[8]] = new Vec3d(0.0D, -1.0D, -1.0D);
         SURROUND = var10000;
         var10000 = new Vec3d[lIIIIlIlIIllI[9]];
         var10000[lIIIIlIlIIllI[1]] = new Vec3d(1.0D, 0.0D, 0.0D);
         var10000[lIIIIlIlIIllI[2]] = new Vec3d(0.0D, 0.0D, 1.0D);
         var10000[lIIIIlIlIIllI[3]] = new Vec3d(-1.0D, 0.0D, 0.0D);
         var10000[lIIIIlIlIIllI[4]] = new Vec3d(0.0D, 0.0D, -1.0D);
         var10000[lIIIIlIlIIllI[5]] = new Vec3d(1.0D, -1.0D, 0.0D);
         var10000[lIIIIlIlIIllI[6]] = new Vec3d(0.0D, -1.0D, 1.0D);
         var10000[lIIIIlIlIIllI[7]] = new Vec3d(-1.0D, -1.0D, 0.0D);
         var10000[lIIIIlIlIIllI[8]] = new Vec3d(0.0D, -1.0D, -1.0D);
         var10000[lIIIIlIlIIllI[0]] = new Vec3d(0.0D, -1.0D, 0.0D);
         FULL = var10000;
      }

      private static void lIlIlIllIllIII() {
         lIIIIlIlIIllI = new int[10];
         lIIIIlIlIIllI[0] = " ".length() << "   ".length();
         lIIIIlIlIIllI[1] = (125 ^ 50 ^ (227 ^ 194) << " ".length()) << " ".length() & ((218 ^ 159 ^ (26 ^ 19) << "   ".length()) << " ".length() ^ -" ".length());
         lIIIIlIlIIllI[2] = " ".length();
         lIIIIlIlIIllI[3] = " ".length() << " ".length();
         lIIIIlIlIIllI[4] = "   ".length();
         lIIIIlIlIIllI[5] = " ".length() << (" ".length() << " ".length());
         lIIIIlIlIIllI[6] = 5 ^ 0;
         lIIIIlIlIIllI[7] = "   ".length() << " ".length();
         lIIIIlIlIIllI[8] = 76 + 78 - 96 + 87 ^ (209 ^ 154) << " ".length();
         lIIIIlIlIIllI[9] = (78 ^ 75) << (" ".length() << (" ".length() << " ".length())) ^ 68 ^ 29;
      }
   }
}
