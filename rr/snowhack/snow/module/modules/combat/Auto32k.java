package rr.snowhack.snow.module.modules.combat;

import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
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
import rr.snowhack.snow.util.Friends;

@Module.Info(
   name = "Auto32k",
   category = Module.Category.COMBAT,
   description = "Do not use with any AntiGhostBlock Mod!"
)
public class Auto32k extends Module {
   // $FF: synthetic field
   private Setting<Integer> yOffset;
   // $FF: synthetic field
   private Setting<Boolean> autoEnableHitAura;
   // $FF: synthetic field
   private int swordSlot;
   // $FF: synthetic field
   private static boolean isSneaking;
   // $FF: synthetic field
   private Setting<Boolean> placeCloseToEnemy;
   // $FF: synthetic field
   private Setting<Boolean> moveToHotbar;
   // $FF: synthetic field
   private static final int[] lllIlllIIIIl;
   // $FF: synthetic field
   private static final List<Block> blackList;
   // $FF: synthetic field
   private static final DecimalFormat df;
   // $FF: synthetic field
   private Setting<Boolean> debugMessages;
   // $FF: synthetic field
   private static final List<Block> shulkerList;
   // $FF: synthetic field
   private static final String[] lllIlllIIIII;
   // $FF: synthetic field
   private Setting<Double> placeRange;
   // $FF: synthetic field
   private Setting<Boolean> placeObiOnTop;

   private static String lIIlllIIIlllIl(String lllllllllllllllIlIllIlIIIlIlIIlI, String lllllllllllllllIlIllIlIIIlIlIIIl) {
      try {
         boolean lllllllllllllllIlIllIlIIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         long lllllllllllllllIlIllIlIIIlIIllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIlIIIlIIllll.init(lllIlllIIIIl[2], lllllllllllllllIlIllIlIIIlIlIIII);
         return new String(lllllllllllllllIlIllIlIIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIIlIIIlI(Object var0) {
      return var0 != null;
   }

   private static boolean lIIlllIIlIlIIl(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIIlllIIlIIlll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIIlllIIlIIlIl(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIIlllIIlIlIlI(int var0) {
      return var0 > 0;
   }

   public void onUpdate() {
      if (lIIlllIIlIIIIl(lllllllllllllllIlIllIlIIllIIIlIl.isDisabled()) && lIIlllIIlIIIlI(mc.field_71439_g) && !lIIlllIIlIIIll(ModuleManager.isModuleEnabled(lllIlllIIIII[lllIlllIIIIl[21]]))) {
         Exception lllllllllllllllIlIllIlIIllIIIIIl = lllIlllIIIIl[0];
         if (!lIIlllIIlIIIIl(mc.field_71462_r instanceof GuiContainer)) {
            if (lIIlllIIlIIIIl((Boolean)lllllllllllllllIlIllIlIIllIIIlIl.moveToHotbar.getValue())) {
               lllllllllllllllIlIllIlIIllIIIlIl.disable();
            } else if (!lIIlllIIlIlIII(lllllllllllllllIlIllIlIIllIIIlIl.swordSlot, lllIlllIIIIl[8])) {
               boolean lllllllllllllllIlIllIlIIllIIIIll = lllIlllIIIIl[1];
               if (lIIlllIIlIIIll(((GuiContainer)mc.field_71462_r).field_147002_h.func_75139_a(lllIlllIIIIl[0]).func_75211_c().field_190928_g)) {
                  lllllllllllllllIlIllIlIIllIIIIll = lllIlllIIIIl[0];
               }

               if (lIIlllIIlIIIIl(((GuiContainer)mc.field_71462_r).field_147002_h.func_75139_a(lllllllllllllllIlIllIlIIllIIIlIl.swordSlot).func_75211_c().field_190928_g)) {
                  lllllllllllllllIlIllIlIIllIIIIll = lllIlllIIIIl[0];
               }

               if (lIIlllIIlIIIll(lllllllllllllllIlIllIlIIllIIIIll)) {
                  mc.field_71442_b.func_187098_a(((GuiContainer)mc.field_71462_r).field_147002_h.field_75152_c, lllIlllIIIIl[0], lllllllllllllllIlIllIlIIllIIIlIl.swordSlot - lllIlllIIIIl[20], ClickType.SWAP, mc.field_71439_g);
                  "".length();
                  if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIllIIIlIl.autoEnableHitAura.getValue())) {
                     ModuleManager.getModuleByName(lllIlllIIIII[lllIlllIIIIl[22]]).enable();
                  }
               }

            }
         }
      }
   }

   private static boolean lIIlllIIlIlIll(Object var0) {
      return var0 == null;
   }

   private static boolean lIIlllIIlIIIll(int var0) {
      return var0 != 0;
   }

   private static void lIIlllIIlIIIII() {
      lllIlllIIIIl = new int[25];
      lllIlllIIIIl[0] = (123 ^ 112 ^ (88 ^ 77) << " ".length()) << " ".length() & (((24 ^ 21) << (" ".length() << " ".length()) ^ 140 ^ 153) << " ".length() ^ -" ".length());
      lllIlllIIIIl[1] = " ".length();
      lllIlllIIIIl[2] = " ".length() << " ".length();
      lllIlllIIIIl[3] = "   ".length();
      lllIlllIIIIl[4] = " ".length() << (" ".length() << " ".length());
      lllIlllIIIIl[5] = 168 ^ 173;
      lllIlllIIIIl[6] = "   ".length() << " ".length();
      lllIlllIIIIl[7] = 79 ^ 72;
      lllIlllIIIIl[8] = -" ".length();
      lllIlllIIIIl[9] = "   ".length() << "   ".length() ^ 150 ^ 135;
      lllIlllIIIIl[10] = " ".length() << "   ".length();
      lllIlllIIIIl[11] = ((145 ^ 148) << (148 ^ 145) ^ 101 + 104 - 166 + 126) << " ".length();
      lllIlllIIIIl[12] = 176 ^ 155 ^ " ".length() << (91 ^ 94);
      lllIlllIIIIl[13] = "   ".length() << (" ".length() << " ".length());
      lllIlllIIIIl[14] = 84 ^ 89;
      lllIlllIIIIl[15] = (114 ^ 117) << " ".length();
      lllIlllIIIIl[16] = 19 ^ 28;
      lllIlllIIIIl[17] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIlllIIIIl[18] = (178 ^ 191) << "   ".length() ^ 241 ^ 136;
      lllIlllIIIIl[19] = ((43 ^ 16) << " ".length() ^ 54 + 110 - 107 + 70) << " ".length();
      lllIlllIIIIl[20] = " ".length() << (" ".length() << (" ".length() << " ".length()) ^ " ".length());
      lllIlllIIIIl[21] = (77 ^ 72) << (" ".length() << (" ".length() << " ".length())) ^ 37 ^ 102;
      lllIlllIIIIl[22] = (61 ^ 56) << (" ".length() << " ".length());
      lllIlllIIIIl[23] = 11 ^ 30;
      lllIlllIIIIl[24] = (16 ^ 27) << " ".length();
   }

   private static boolean checkForNeighbours(BlockPos lllllllllllllllIlIllIlIIlIIlIIll) {
      if (lIIlllIIlIIIIl(hasNeighbour(lllllllllllllllIlIllIlIIlIIlIIll))) {
         long lllllllllllllllIlIllIlIIlIIlIIIl = EnumFacing.values();
         int lllllllllllllllIlIllIlIIlIIlIIII = lllllllllllllllIlIllIlIIlIIlIIIl.length;
         int lllllllllllllllIlIllIlIIlIIIllll = lllIlllIIIIl[0];

         do {
            if (!lIIlllIIlIIlII(lllllllllllllllIlIllIlIIlIIIllll, lllllllllllllllIlIllIlIIlIIlIIII)) {
               return (boolean)lllIlllIIIIl[0];
            }

            EnumFacing lllllllllllllllIlIllIlIIlIIlIlII = lllllllllllllllIlIllIlIIlIIlIIIl[lllllllllllllllIlIllIlIIlIIIllll];
            boolean lllllllllllllllIlIllIlIIlIIIllIl = lllllllllllllllIlIllIlIIlIIlIIll.func_177972_a(lllllllllllllllIlIllIlIIlIIlIlII);
            if (lIIlllIIlIIIll(hasNeighbour(lllllllllllllllIlIllIlIIlIIIllIl))) {
               return (boolean)lllIlllIIIIl[1];
            }

            ++lllllllllllllllIlIllIlIIlIIIllll;
            "".length();
         } while(" ".length() <= "   ".length());

         return (boolean)((60 ^ 23) << " ".length() & ~((70 ^ 109) << " ".length()));
      } else {
         return (boolean)lllIlllIIIIl[1];
      }
   }

   private static boolean lIIlllIIlIIllI(Object var0, Object var1) {
      return var0 != var1;
   }

   static {
      lIIlllIIlIIIII();
      lIIlllIIIlllll();
      Block[] var10000 = new Block[lllIlllIIIIl[11]];
      var10000[lllIlllIIIIl[0]] = Blocks.field_150477_bB;
      var10000[lllIlllIIIIl[1]] = Blocks.field_150486_ae;
      var10000[lllIlllIIIIl[2]] = Blocks.field_150447_bR;
      var10000[lllIlllIIIIl[3]] = Blocks.field_150462_ai;
      var10000[lllIlllIIIIl[4]] = Blocks.field_150467_bQ;
      var10000[lllIlllIIIIl[5]] = Blocks.field_150382_bo;
      var10000[lllIlllIIIIl[6]] = Blocks.field_150438_bZ;
      var10000[lllIlllIIIIl[7]] = Blocks.field_150409_cd;
      var10000[lllIlllIIIIl[10]] = Blocks.field_150367_z;
      var10000[lllIlllIIIIl[9]] = Blocks.field_150415_aT;
      blackList = Arrays.asList(var10000);
      var10000 = new Block[lllIlllIIIIl[17]];
      var10000[lllIlllIIIIl[0]] = Blocks.field_190977_dl;
      var10000[lllIlllIIIIl[1]] = Blocks.field_190978_dm;
      var10000[lllIlllIIIIl[2]] = Blocks.field_190979_dn;
      var10000[lllIlllIIIIl[3]] = Blocks.field_190980_do;
      var10000[lllIlllIIIIl[4]] = Blocks.field_190981_dp;
      var10000[lllIlllIIIIl[5]] = Blocks.field_190982_dq;
      var10000[lllIlllIIIIl[6]] = Blocks.field_190983_dr;
      var10000[lllIlllIIIIl[7]] = Blocks.field_190984_ds;
      var10000[lllIlllIIIIl[10]] = Blocks.field_190985_dt;
      var10000[lllIlllIIIIl[9]] = Blocks.field_190986_du;
      var10000[lllIlllIIIIl[11]] = Blocks.field_190987_dv;
      var10000[lllIlllIIIIl[12]] = Blocks.field_190988_dw;
      var10000[lllIlllIIIIl[13]] = Blocks.field_190989_dx;
      var10000[lllIlllIIIIl[14]] = Blocks.field_190990_dy;
      var10000[lllIlllIIIIl[15]] = Blocks.field_190991_dz;
      var10000[lllIlllIIIIl[16]] = Blocks.field_190975_dA;
      shulkerList = Arrays.asList(var10000);
      df = new DecimalFormat(lllIlllIIIII[lllIlllIIIIl[23]]);
   }

   private static void placeBlock(BlockPos lllllllllllllllIlIllIlIIlIlIIlII) {
      if (!lIIlllIIlIIIIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIlIIlII).func_185904_a().func_76222_j())) {
         if (!lIIlllIIlIIIIl(checkForNeighbours(lllllllllllllllIlIllIlIIlIlIIlII))) {
            short lllllllllllllllIlIllIlIIlIlIIIll = EnumFacing.values();
            char lllllllllllllllIlIllIlIIlIlIIIlI = lllllllllllllllIlIllIlIIlIlIIIll.length;
            int lllllllllllllllIlIllIlIIlIlIIIIl = lllIlllIIIIl[0];

            do {
               if (!lIIlllIIlIIlII(lllllllllllllllIlIllIlIIlIlIIIIl, lllllllllllllllIlIllIlIIlIlIIIlI)) {
                  return;
               }

               EnumFacing lllllllllllllllIlIllIlIIlIlIIllI = lllllllllllllllIlIllIlIIlIlIIIll[lllllllllllllllIlIllIlIIlIlIIIIl];
               byte lllllllllllllllIlIllIlIIlIIlllll = lllllllllllllllIlIllIlIIlIlIIlII.func_177972_a(lllllllllllllllIlIllIlIIlIlIIllI);
               EnumFacing lllllllllllllllIlIllIlIIlIlIlIIl = lllllllllllllllIlIllIlIIlIlIIllI.func_176734_d();
               if (!lIIlllIIlIIIIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIIlllll).func_177230_c().func_176209_a(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIIlllll), (boolean)lllIlllIIIIl[0]))) {
                  char lllllllllllllllIlIllIlIIlIIlllIl = (new Vec3d(lllllllllllllllIlIllIlIIlIIlllll)).func_72441_c(0.5D, 0.5D, 0.5D).func_178787_e((new Vec3d(lllllllllllllllIlIllIlIIlIlIlIIl.func_176730_m())).func_186678_a(0.5D));
                  Block lllllllllllllllIlIllIlIIlIlIIlll = mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIIlllll).func_177230_c();
                  if (!lIIlllIIlIIIIl(blackList.contains(lllllllllllllllIlIllIlIIlIlIIlll)) || lIIlllIIlIIIll(shulkerList.contains(lllllllllllllllIlIllIlIIlIlIIlll))) {
                     mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_SNEAKING));
                     isSneaking = (boolean)lllIlllIIIIl[1];
                  }

                  BlockInteractionHelper.faceVectorPacketInstant(lllllllllllllllIlIllIlIIlIIlllIl);
                  mc.field_71442_b.func_187099_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIlIllIlIIlIIlllll, lllllllllllllllIlIllIlIIlIlIlIIl, lllllllllllllllIlIllIlIIlIIlllIl, EnumHand.MAIN_HAND);
                  "".length();
                  mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
                  mc.field_71467_ac = lllIlllIIIIl[4];
                  return;
               }

               "".length();
               if ((84 + 56 - 41 + 62 ^ (186 ^ 147) << (" ".length() << " ".length())) == 0) {
                  return;
               }

               ++lllllllllllllllIlIllIlIIlIlIIIIl;
               "".length();
            } while(null == null);

         }
      }
   }

   private static boolean hasNeighbour(BlockPos lllllllllllllllIlIllIlIIlIIIIlII) {
      float lllllllllllllllIlIllIlIIlIIIIIlI = EnumFacing.values();
      byte lllllllllllllllIlIllIlIIlIIIIIIl = lllllllllllllllIlIllIlIIlIIIIIlI.length;
      int lllllllllllllllIlIllIlIIlIIIIIII = lllIlllIIIIl[0];

      do {
         if (!lIIlllIIlIIlII(lllllllllllllllIlIllIlIIlIIIIIII, lllllllllllllllIlIllIlIIlIIIIIIl)) {
            return (boolean)lllIlllIIIIl[0];
         }

         EnumFacing lllllllllllllllIlIllIlIIlIIIIlIl = lllllllllllllllIlIllIlIIlIIIIIlI[lllllllllllllllIlIllIlIIlIIIIIII];
         byte lllllllllllllllIlIllIlIIIllllllI = lllllllllllllllIlIllIlIIlIIIIlII.func_177972_a(lllllllllllllllIlIllIlIIlIIIIlIl);
         if (lIIlllIIlIIIIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIIllllllI).func_185904_a().func_76222_j())) {
            return (boolean)lllIlllIIIIl[1];
         }

         ++lllllllllllllllIlIllIlIIlIIIIIII;
         "".length();
      } while(" ".length() << " ".length() >= ((188 + 132 - 177 + 100 ^ (19 ^ 62) << (" ".length() << " ".length())) & (236 ^ 137 ^ (148 ^ 133) << " ".length() ^ -" ".length())));

      return (boolean)(" ".length() << " ".length() & (" ".length() << " ".length() ^ -" ".length()));
   }

   private static boolean lIIlllIIlIlIII(int var0, int var1) {
      return var0 == var1;
   }

   private static int lIIlllIIlIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public Auto32k() {
      lllllllllllllllIlIllIlIIlllllIlI.moveToHotbar = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.b(lllIlllIIIII[lllIlllIIIIl[0]], (boolean)lllIlllIIIIl[1]));
      lllllllllllllllIlIllIlIIlllllIlI.autoEnableHitAura = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.b(lllIlllIIIII[lllIlllIIIIl[1]], (boolean)lllIlllIIIIl[1]));
      lllllllllllllllIlIllIlIIlllllIlI.placeRange = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.d(lllIlllIIIII[lllIlllIIIIl[2]], 4.0D));
      lllllllllllllllIlIllIlIIlllllIlI.yOffset = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.i(lllIlllIIIII[lllIlllIIIIl[3]], lllIlllIIIIl[2]));
      lllllllllllllllIlIllIlIIlllllIlI.placeCloseToEnemy = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.b(lllIlllIIIII[lllIlllIIIIl[4]], (boolean)lllIlllIIIIl[0]));
      lllllllllllllllIlIllIlIIlllllIlI.placeObiOnTop = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.b(lllIlllIIIII[lllIlllIIIIl[5]], (boolean)lllIlllIIIIl[1]));
      lllllllllllllllIlIllIlIIlllllIlI.debugMessages = lllllllllllllllIlIllIlIIlllllIlI.register(Settings.b(lllIlllIIIII[lllIlllIIIIl[6]], (boolean)lllIlllIIIIl[0]));
   }

   protected void onEnable() {
      if (lIIlllIIlIIIIl(lllllllllllllllIlIllIlIIlllIIIlI.isDisabled()) && lIIlllIIlIIIlI(mc.field_71439_g) && !lIIlllIIlIIIll(ModuleManager.isModuleEnabled(lllIlllIIIII[lllIlllIIIIl[7]]))) {
         df.setRoundingMode(RoundingMode.CEILING);
         int lllllllllllllllIlIllIlIIlllIIIIl = lllIlllIIIIl[8];
         boolean lllllllllllllllIlIllIlIIllIlIlIl = lllIlllIIIIl[8];
         int lllllllllllllllIlIllIlIIllIlIlII = lllIlllIIIIl[8];
         lllllllllllllllIlIllIlIIlllIIIlI.swordSlot = lllIlllIIIIl[8];
         int lllllllllllllllIlIllIlIIlllIIlll = lllIlllIIIIl[0];

         while(lIIlllIIlIIlII(lllllllllllllllIlIllIlIIlllIIlll, lllIlllIIIIl[9])) {
            if (lIIlllIIlIIlIl(lllllllllllllllIlIllIlIIlllIIIIl, lllIlllIIIIl[8]) && lIIlllIIlIIlIl(lllllllllllllllIlIllIlIIllIlIlIl, lllIlllIIIIl[8]) && lIIlllIIlIIlIl(lllllllllllllllIlIllIlIIllIlIlII, lllIlllIIIIl[8])) {
               "".length();
               if ((((236 ^ 167) << " ".length() ^ 18 + 84 - 49 + 128) & (107 + 2 - 75 + 123 ^ (2 ^ 93) << " ".length() ^ -" ".length())) > "   ".length()) {
                  return;
               }
               break;
            }

            char lllllllllllllllIlIllIlIIllIlIIlI = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIllIlIIlllIIlll);
            if (lIIlllIIlIIllI(lllllllllllllllIlIllIlIIllIlIIlI, ItemStack.field_190927_a)) {
               if (lIIlllIIlIIIIl(lllllllllllllllIlIllIlIIllIlIIlI.func_77973_b() instanceof ItemBlock)) {
                  "".length();
                  if (" ".length() < 0) {
                     return;
                  }
               } else {
                  short lllllllllllllllIlIllIlIIllIlIIIl = ((ItemBlock)lllllllllllllllIlIllIlIIllIlIIlI.func_77973_b()).func_179223_d();
                  if (lIIlllIIlIIlll(lllllllllllllllIlIllIlIIllIlIIIl, Blocks.field_150438_bZ)) {
                     lllllllllllllllIlIllIlIIlllIIIIl = lllllllllllllllIlIllIlIIlllIIlll;
                     "".length();
                     if ((((31 ^ 8) << " ".length() ^ 142 ^ 191) << " ".length() & ((5 + 0 - -3 + 127 ^ (17 ^ 2) << "   ".length()) << " ".length() ^ -" ".length())) != 0) {
                        return;
                     }
                  } else if (lIIlllIIlIIIll(shulkerList.contains(lllllllllllllllIlIllIlIIllIlIIIl))) {
                     lllllllllllllllIlIllIlIIllIlIlIl = lllllllllllllllIlIllIlIIlllIIlll;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else if (lIIlllIIlIIlll(lllllllllllllllIlIllIlIIllIlIIIl, Blocks.field_150343_Z)) {
                     lllllllllllllllIlIllIlIIllIlIlII = lllllllllllllllIlIllIlIIlllIIlll;
                  }
               }
            }

            ++lllllllllllllllIlIllIlIIlllIIlll;
            "".length();
            if ("   ".length() != "   ".length()) {
               return;
            }
         }

         if (lIIlllIIlIlIII(lllllllllllllllIlIllIlIIlllIIIIl, lllIlllIIIIl[8])) {
            if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
               Command.sendChatMessage(lllIlllIIIII[lllIlllIIIIl[10]]);
            }

            lllllllllllllllIlIllIlIIlllIIIlI.disable();
         } else if (lIIlllIIlIlIII(lllllllllllllllIlIllIlIIllIlIlIl, lllIlllIIIIl[8])) {
            if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
               Command.sendChatMessage(lllIlllIIIII[lllIlllIIIIl[9]]);
            }

            lllllllllllllllIlIllIlIIlllIIIlI.disable();
         } else {
            lllllllllllllllIlIllIlIIlllIIlll = (int)Math.ceil((Double)lllllllllllllllIlIllIlIIlllIIIlI.placeRange.getValue());
            char lllllllllllllllIlIllIlIIllIlIIlI = (AutoCrystal)ModuleManager.getModuleByName(lllIlllIIIII[lllIlllIIIIl[11]]);
            List<BlockPos> lllllllllllllllIlIllIlIIllIlllII = lllllllllllllllIlIllIlIIllIlIIlI.getSphere(AutoCrystal.getPlayerPos(), (float)lllllllllllllllIlIllIlIIlllIIlll, lllllllllllllllIlIllIlIIlllIIlll, (boolean)lllIlllIIIIl[0], (boolean)lllIlllIIIIl[1], lllIlllIIIIl[0]);
            Map<BlockPos, Double> lllllllllllllllIlIllIlIIllIlIIII = new HashMap();
            int lllllllllllllllIlIllIlIIllIIllll = null;
            boolean lllllllllllllllIlIllIlIIllIllIIl = lllIlllIIIIl[0];
            Iterator lllllllllllllllIlIllIlIIllIIllIl = lllllllllllllllIlIllIlIIllIlllII.iterator();

            do {
               BlockPos lllllllllllllllIlIllIlIIllIIllII;
               if (!lIIlllIIlIIIll(lllllllllllllllIlIllIlIIllIIllIl.hasNext())) {
                  if (lIIlllIIlIlIlI(lllllllllllllllIlIllIlIIllIlIIII.size())) {
                     lllllllllllllllIlIllIlIIllIlIIII.forEach((lllllllllllllllIlIllIlIIIlllIlII, lllllllllllllllIlIllIlIIIlllIlll) -> {
                        if (lIIlllIIlIIIIl(lllllllllllllllIlIllIlIIIlllIllI.isAreaPlaceable(lllllllllllllllIlIllIlIIIlllIlII))) {
                           lllllllllllllllIlIllIlIIllIlIIII.remove(lllllllllllllllIlIllIlIIIlllIlII);
                           "".length();
                        }

                     });
                     if (lIIlllIIlIIIIl(lllllllllllllllIlIllIlIIllIlIIII.size())) {
                        lllllllllllllllIlIllIlIIllIllIIl = lllIlllIIIIl[0];
                     }
                  }

                  if (lIIlllIIlIIIll(lllllllllllllllIlIllIlIIllIllIIl)) {
                     if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.placeCloseToEnemy.getValue())) {
                        if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
                           Command.sendChatMessage(lllIlllIIIII[lllIlllIIIIl[12]]);
                        }

                        lllllllllllllllIlIllIlIIllIIllll = (BlockPos)((Entry)Collections.min(lllllllllllllllIlIllIlIIllIlIIII.entrySet(), Entry.comparingByValue())).getKey();
                        "".length();
                        if (((81 ^ 112) << " ".length() & ~((57 ^ 24) << " ".length()) ^ 156 ^ 153) <= 0) {
                           return;
                        }
                     } else {
                        if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
                           Command.sendChatMessage(lllIlllIIIII[lllIlllIIIIl[13]]);
                        }

                        lllllllllllllllIlIllIlIIllIIllll = (BlockPos)((Entry)Collections.max(lllllllllllllllIlIllIlIIllIlIIII.entrySet(), Entry.comparingByValue())).getKey();
                        "".length();
                        if (null != null) {
                           return;
                        }
                     }
                  } else {
                     if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
                        Command.sendChatMessage(lllIlllIIIII[lllIlllIIIIl[14]]);
                     }

                     lllllllllllllllIlIllIlIIllIIllIl = lllllllllllllllIlIllIlIIllIlllII.iterator();

                     while(lIIlllIIlIIIll(lllllllllllllllIlIllIlIIllIIllIl.hasNext())) {
                        lllllllllllllllIlIllIlIIllIIllII = (BlockPos)lllllllllllllllIlIllIlIIllIIllIl.next();
                        if (lIIlllIIlIIIll(lllllllllllllllIlIllIlIIlllIIIlI.isAreaPlaceable(lllllllllllllllIlIllIlIIllIIllII))) {
                           lllllllllllllllIlIllIlIIllIIllll = lllllllllllllllIlIllIlIIllIIllII;
                           "".length();
                           if (-"   ".length() >= 0) {
                              return;
                           }
                           break;
                        }

                        "".length();
                        if (((23 ^ 66) & ~(1 ^ 84)) >= "   ".length()) {
                           return;
                        }
                     }
                  }

                  if (lIIlllIIlIlIll(lllllllllllllllIlIllIlIIllIIllll)) {
                     if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
                        Command.sendChatMessage(lllIlllIIIII[lllIlllIIIIl[15]]);
                     }

                     lllllllllllllllIlIllIlIIlllIIIlI.disable();
                     return;
                  }

                  if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.debugMessages.getValue())) {
                     Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIlllIIIII[lllIlllIIIIl[16]]).append(lllllllllllllllIlIllIlIIllIIllll.field_177962_a).append(lllIlllIIIII[lllIlllIIIIl[17]]).append(lllllllllllllllIlIllIlIIllIIllll.field_177960_b).append(lllIlllIIIII[lllIlllIIIIl[18]]).append(lllllllllllllllIlIllIlIIllIIllll.field_177961_c).append(lllIlllIIIII[lllIlllIIIIl[19]]).append(df.format(mc.field_71439_g.func_174791_d().func_72438_d(new Vec3d(lllllllllllllllIlIllIlIIllIIllll))))));
                  }

                  mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIllIlIIlllIIIIl;
                  placeBlock(new BlockPos(lllllllllllllllIlIllIlIIllIIllll));
                  mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIllIlIIllIlIlIl;
                  placeBlock(new BlockPos(lllllllllllllllIlIllIlIIllIIllll.func_177982_a(lllIlllIIIIl[0], lllIlllIIIIl[1], lllIlllIIIIl[0])));
                  if (lIIlllIIlIIIll((Boolean)lllllllllllllllIlIllIlIIlllIIIlI.placeObiOnTop.getValue()) && lIIlllIIlIIlIl(lllllllllllllllIlIllIlIIllIlIlII, lllIlllIIIIl[8])) {
                     mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIllIlIIllIlIlII;
                     placeBlock(new BlockPos(lllllllllllllllIlIllIlIIllIIllll.func_177982_a(lllIlllIIIIl[0], lllIlllIIIIl[2], lllIlllIIIIl[0])));
                  }

                  if (lIIlllIIlIIIll(isSneaking)) {
                     mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
                     isSneaking = (boolean)lllIlllIIIIl[0];
                  }

                  mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIllIlIIllIlIlIl;
                  BlockPos lllllllllllllllIlIllIlIIllIllIII = new BlockPos(lllllllllllllllIlIllIlIIllIIllll);
                  mc.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerTryUseItemOnBlock(lllllllllllllllIlIllIlIIllIllIII, EnumFacing.DOWN, EnumHand.MAIN_HAND, 0.0F, 0.0F, 0.0F));
                  lllllllllllllllIlIllIlIIlllIIIlI.swordSlot = lllllllllllllllIlIllIlIIllIlIlIl + lllIlllIIIIl[20];
                  return;
               }

               lllllllllllllllIlIllIlIIllIIllII = (BlockPos)lllllllllllllllIlIllIlIIllIIllIl.next();
               Iterator lllllllllllllllIlIllIlIIllIIlIll = mc.field_71441_e.field_72996_f.iterator();

               while(true) {
                  while(lIIlllIIlIIIll(lllllllllllllllIlIllIlIIllIIlIll.hasNext())) {
                     float lllllllllllllllIlIllIlIIllIIlIlI = (Entity)lllllllllllllllIlIllIlIIllIIlIll.next();
                     if (lIIlllIIlIIIIl(lllllllllllllllIlIllIlIIllIIlIlI instanceof EntityPlayer)) {
                        "".length();
                        if (" ".length() <= 0) {
                           return;
                        }
                     } else if (lIIlllIIlIIlll(lllllllllllllllIlIllIlIIllIIlIlI, mc.field_71439_g)) {
                        "".length();
                        if (null != null) {
                           return;
                        }
                     } else if (lIIlllIIlIIIll(Friends.isFriend(lllllllllllllllIlIllIlIIllIIlIlI.func_70005_c_()))) {
                        "".length();
                        if (" ".length() > "   ".length()) {
                           return;
                        }
                     } else if (lIIlllIIlIIIll((Integer)lllllllllllllllIlIllIlIIlllIIIlI.yOffset.getValue()) && lIIlllIIlIlIIl(Math.abs(mc.field_71439_g.func_180425_c().field_177960_b - lllllllllllllllIlIllIlIIllIIllII.field_177960_b), Math.abs((Integer)lllllllllllllllIlIllIlIIlllIIIlI.yOffset.getValue()))) {
                        "".length();
                        if ("   ".length() == 0) {
                           return;
                        }
                     } else {
                        if (lIIlllIIlIIIll(lllllllllllllllIlIllIlIIlllIIIlI.isAreaPlaceable(lllllllllllllllIlIllIlIIllIIllII))) {
                           lllllllllllllllIlIllIlIIllIllIIl = lllIlllIIIIl[1];
                           double lllllllllllllllIlIllIlIIlllIIllI = lllllllllllllllIlIllIlIIllIIlIlI.func_70011_f((double)lllllllllllllllIlIllIlIIllIIllII.field_177962_a, (double)lllllllllllllllIlIllIlIIllIIllII.field_177960_b, (double)lllllllllllllllIlIllIlIIllIIllII.field_177961_c);
                           double var10002;
                           if (lIIlllIIlIIIll(lllllllllllllllIlIllIlIIllIlIIII.containsKey(lllllllllllllllIlIllIlIIllIIllII))) {
                              var10002 = (Double)lllllllllllllllIlIllIlIIllIlIIII.get(lllllllllllllllIlIllIlIIllIIllII) + lllllllllllllllIlIllIlIIlllIIllI;
                              "".length();
                              if (" ".length() << " ".length() <= 0) {
                                 return;
                              }
                           } else {
                              var10002 = lllllllllllllllIlIllIlIIlllIIllI;
                           }

                           lllllllllllllllIlIllIlIIllIlIIII.put(lllllllllllllllIlIllIlIIllIIllII, var10002);
                           "".length();
                           lllllllllllllllIlIllIlIIllIllIIl = lllIlllIIIIl[1];
                        }

                        "".length();
                        if (-" ".length() != -" ".length()) {
                           return;
                        }
                     }
                  }

                  "".length();
                  break;
               }
            } while(-" ".length() <= " ".length() << (" ".length() << " ".length()));

         }
      } else {
         lllllllllllllllIlIllIlIIlllIIIlI.disable();
      }
   }

   private static boolean lIIlllIIlIllIl(int var0) {
      return var0 <= 0;
   }

   private static void lIIlllIIIlllll() {
      lllIlllIIIII = new String[lllIlllIIIIl[24]];
      lllIlllIIIII[lllIlllIIIIl[0]] = lIIlllIIIlllII("yLMRmYjhkoZB3hPOmaFirlSwZ7tXVJOV", "XvRBf");
      lllIlllIIIII[lllIlllIIIIl[1]] = lIIlllIIIlllII("Uwa1J3/rkM2SsPmITvDDvEgcf13CYlk6", "HPpeB");
      lllIlllIIIII[lllIlllIIIIl[2]] = lIIlllIIIlllIl("gTy5+fUBSKtriVNje/C3Lg==", "ZryAp");
      lllIlllIIIII[lllIlllIIIIl[3]] = lIIlllIIIlllII("95RYrPvFnCNkX3mksyzl8OMAeNlYQFiF", "QAkQo");
      lllIlllIIIII[lllIlllIIIIl[4]] = lIIlllIIIlllII("wcbirsisyRY5PAO0XXsaBvZyuJmzSf4W", "qeCuG");
      lllIlllIIIII[lllIlllIIIIl[5]] = lIIlllIIIllllI("PwINDT9PIQ4HegAATDo1Hw==", "onlnZ");
      lllIlllIIIII[lllIlllIIIIl[6]] = lIIlllIIIlllIl("mMEC+bavhwjkngnGSv9Mjg==", "WKaCA");
      lllIlllIIIII[lllIlllIIIIl[7]] = lIIlllIIIllllI("FxEoFAYwDg==", "QcMqe");
      lllIlllIIIII[lllIlllIIIIl[10]] = lIIlllIIIllllI("ORYbJBZRZQUNWSo4HiAcEHcDOQoRPgA3VUIzByMYADsHPh5M", "bWnPy");
      lllIlllIIIII[lllIlllIIIIl[9]] = lIIlllIIIlllIl("0b55C4TAg0ghkJILNQ3Cb+4jtX00hRHNyzSKv28nmPO1TzJsnWZVdw==", "sdZDK");
      lllIlllIIIII[lllIlllIIIIl[11]] = lIIlllIIIllllI("JyEHATcULQAaFQo=", "fTsnt");
      lllIlllIIIII[lllIlllIIIIl[12]] = lIIlllIIIlllII("Cc8p0j+keCwSlKFeoXynWsuP6Tya5Nj2U8aelMiI6X5KvdMNcmpSuA==", "OOFAy");
      lllIlllIIIII[lllIlllIIIIl[13]] = lIIlllIIIllllI("AxM3MCtrYCkZZAg+IyctNjViIiUqciQ2KzVyByohNSs=", "XRBDD");
      lllIlllIIIII[lllIlllIIIIl[14]] = lIIlllIIIlllII("1WJiLIlEdmYV2aF3TI0Pd9ZmY0xRxZhp2LcvHaXRKcEkHl5gxuXpKtMn4EFe7It1OmLaLWAuEl6Io10yakpKqg==", "cMgVN");
      lllIlllIIIII[lllIlllIIIIl[15]] = lIIlllIIIllllI("Kis9AyJCWCMqbT8FaAEsHQMsVz0eGSEDJB4EaB4jURgpGSoUSjwYbQEGKRQoUA==", "qjHwM");
      lllIlllIIIII[lllIlllIIIIl[16]] = lIIlllIIIlllII("gzmendRxUsQcnaPFe9aPWOLpuh2xS3+lj4gbe+p/9mI=", "jQwvR");
      lllIlllIIIII[lllIlllIIIIl[17]] = lIIlllIIIlllII("sZ+istZ/ibI=", "SFCrS");
      lllIlllIIIII[lllIlllIIIIl[18]] = lIIlllIIIlllII("us0MqxmUcNw=", "ZnTEY");
      lllIlllIIIII[lllIlllIIIIl[19]] = lIIlllIIIlllII("KIvbDNa/XJgvegUVQhY/Cw==", "mqXXP");
      lllIlllIIIII[lllIlllIIIIl[21]] = lIIlllIIIlllII("mHIXkE8lz2A=", "lZhPf");
      lllIlllIIIII[lllIlllIIIIl[22]] = lIIlllIIIlllII("NH6BAS9g+R0=", "cObGj");
      lllIlllIIIII[lllIlllIIIIl[23]] = lIIlllIIIllllI("dWhw", "VFSop");
   }

   private static String lIIlllIIIllllI(String lllllllllllllllIlIllIlIIIllIlIIl, String lllllllllllllllIlIllIlIIIllIlIII) {
      lllllllllllllllIlIllIlIIIllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIllIlIIIllIIlll = new StringBuilder();
      char[] lllllllllllllllIlIllIlIIIllIIllI = lllllllllllllllIlIllIlIIIllIlIII.toCharArray();
      int lllllllllllllllIlIllIlIIIllIIlIl = lllIlllIIIIl[0];
      int lllllllllllllllIlIllIlIIIlIlllll = lllllllllllllllIlIllIlIIIllIlIIl.toCharArray();
      char lllllllllllllllIlIllIlIIIlIllllI = lllllllllllllllIlIllIlIIIlIlllll.length;
      int lllllllllllllllIlIllIlIIIlIlllIl = lllIlllIIIIl[0];

      do {
         if (!lIIlllIIlIIlII(lllllllllllllllIlIllIlIIIlIlllIl, lllllllllllllllIlIllIlIIIlIllllI)) {
            return String.valueOf(lllllllllllllllIlIllIlIIIllIIlll);
         }

         char lllllllllllllllIlIllIlIIIllIlIlI = lllllllllllllllIlIllIlIIIlIlllll[lllllllllllllllIlIllIlIIIlIlllIl];
         lllllllllllllllIlIllIlIIIllIIlll.append((char)(lllllllllllllllIlIllIlIIIllIlIlI ^ lllllllllllllllIlIllIlIIIllIIllI[lllllllllllllllIlIllIlIIIllIIlIl % lllllllllllllllIlIllIlIIIllIIllI.length]));
         "".length();
         ++lllllllllllllllIlIllIlIIIllIIlIl;
         ++lllllllllllllllIlIllIlIIIlIlllIl;
         "".length();
      } while(-(138 ^ 142) < 0);

      return null;
   }

   private static String lIIlllIIIlllII(String lllllllllllllllIlIllIlIIIlIIIlIl, String lllllllllllllllIlIllIlIIIlIIIllI) {
      try {
         SecretKeySpec lllllllllllllllIlIllIlIIIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIIIlIIIllI.getBytes(StandardCharsets.UTF_8)), lllIlllIIIIl[10]), "DES");
         int lllllllllllllllIlIllIlIIIlIIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIllIlIIIlIIIIlI.init(lllIlllIIIIl[2], lllllllllllllllIlIllIlIIIlIIlIlI);
         return new String(lllllllllllllllIlIllIlIIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIIlIIIIl(int var0) {
      return var0 == 0;
   }

   private boolean isAreaPlaceable(BlockPos lllllllllllllllIlIllIlIIlIllIllI) {
      Iterator lllllllllllllllIlIllIlIIlIllIlIl = mc.field_71441_e.func_72839_b((Entity)null, new AxisAlignedBB(lllllllllllllllIlIllIlIIlIllIllI)).iterator();

      do {
         if (!lIIlllIIlIIIll(lllllllllllllllIlIllIlIIlIllIlIl.hasNext())) {
            if (lIIlllIIlIIIIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIllIllI).func_185904_a().func_76222_j())) {
               return (boolean)lllIlllIIIIl[0];
            }

            if (lIIlllIIlIIIIl(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIllIllI.func_177982_a(lllIlllIIIIl[0], lllIlllIIIIl[1], lllIlllIIIIl[0])).func_185904_a().func_76222_j())) {
               return (boolean)lllIlllIIIIl[0];
            }

            if (lIIlllIIlIIIll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIllIllI.func_177982_a(lllIlllIIIIl[0], lllIlllIIIIl[8], lllIlllIIIIl[0])).func_177230_c() instanceof BlockAir)) {
               return (boolean)lllIlllIIIIl[0];
            }

            if (lIIlllIIlIIIll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIllIllI.func_177982_a(lllIlllIIIIl[0], lllIlllIIIIl[8], lllIlllIIIIl[0])).func_177230_c() instanceof BlockLiquid)) {
               return (boolean)lllIlllIIIIl[0];
            }

            if (lIIlllIIlIlIlI(lIIlllIIlIllII(mc.field_71439_g.func_174791_d().func_72438_d(new Vec3d(lllllllllllllllIlIllIlIIlIllIllI)), (Double)lllllllllllllllIlIllIlIIlIllIlll.placeRange.getValue()))) {
               return (boolean)lllIlllIIIIl[0];
            }

            Block lllllllllllllllIlIllIlIIlIlllIII = mc.field_71441_e.func_180495_p(lllllllllllllllIlIllIlIIlIllIllI.func_177982_a(lllIlllIIIIl[0], lllIlllIIIIl[8], lllIlllIIIIl[0])).func_177230_c();
            if (lIIlllIIlIIIIl(blackList.contains(lllllllllllllllIlIllIlIIlIlllIII)) && !lIIlllIIlIIIll(shulkerList.contains(lllllllllllllllIlIllIlIIlIlllIII))) {
               int var10000;
               if (lIIlllIIlIllIl(lIIlllIIlIllII(mc.field_71439_g.func_174791_d().func_72438_d((new Vec3d(lllllllllllllllIlIllIlIIlIllIllI)).func_72441_c(0.0D, 1.0D, 0.0D)), (Double)lllllllllllllllIlIllIlIIlIllIlll.placeRange.getValue()))) {
                  var10000 = lllIlllIIIIl[1];
                  "".length();
                  if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                     return (boolean)((2 ^ 77 ^ (156 ^ 183) << " ".length()) & ((225 ^ 198) << " ".length() ^ 89 ^ 14 ^ -" ".length()));
                  }
               } else {
                  var10000 = lllIlllIIIIl[0];
               }

               return (boolean)var10000;
            }

            return (boolean)lllIlllIIIIl[0];
         }

         float lllllllllllllllIlIllIlIIlIllIlII = (Entity)lllllllllllllllIlIllIlIIlIllIlIl.next();
         if (lIIlllIIlIIIll(lllllllllllllllIlIllIlIIlIllIlII instanceof EntityLivingBase)) {
            return (boolean)lllIlllIIIIl[0];
         }

         "".length();
      } while((" ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length())) == 0);

      return (boolean)((26 + 60 - -37 + 10 ^ (128 ^ 133) << (27 ^ 30)) << " ".length() & ((162 ^ 193 ^ (169 ^ 138) << " ".length()) << " ".length() ^ -" ".length()));
   }

   private static boolean lIIlllIIlIIlII(int var0, int var1) {
      return var0 < var1;
   }
}
