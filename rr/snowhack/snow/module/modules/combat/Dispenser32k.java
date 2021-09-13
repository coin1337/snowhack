package rr.snowhack.snow.module.modules.combat;

import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketPlayerTryUseItemOnBlock;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.BlockInteractionHelper;

@Module.Info(
   name = "Dispenser32k",
   category = Module.Category.COMBAT,
   description = "Do not use with any AntiGhostBlock Mod!"
)
public class Dispenser32k extends Module {
   // $FF: synthetic field
   private boolean isSneaking;
   // $FF: synthetic field
   private Setting<Boolean> grabItem;
   // $FF: synthetic field
   private int shulkerSlot;
   // $FF: synthetic field
   private BlockPos placeTarget;
   // $FF: synthetic field
   private int stage;
   // $FF: synthetic field
   private static final String[] lllIlIllIIlI;
   // $FF: synthetic field
   private int dispenserSlot;
   // $FF: synthetic field
   private Setting<Boolean> debugMessages;
   // $FF: synthetic field
   private int obiSlot;
   // $FF: synthetic field
   private int redstoneSlot;
   // $FF: synthetic field
   private int hopperSlot;
   // $FF: synthetic field
   private static final DecimalFormat df;
   // $FF: synthetic field
   private static final int[] llllIIIlIIlI;

   public void onUpdate() {
      if (lIIllllIIlllII(mc.field_71439_g) && !lIIllllIIlllIl(ModuleManager.isModuleEnabled(lllIlIllIIlI[llllIIIlIIlI[10]]))) {
         if (lIIllllIlIIIlI(lllllllllllllllIlIlIllIllllIIlll.stage)) {
            mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIlIllIllllIIlll.obiSlot;
            lllllllllllllllIlIlIllIllllIIlll.placeBlock(new BlockPos(lllllllllllllllIlIlIllIllllIIlll.placeTarget), EnumFacing.DOWN);
            mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIlIllIllllIIlll.dispenserSlot;
            lllllllllllllllIlIlIllIllllIIlll.placeBlock(new BlockPos(lllllllllllllllIlIlIllIllllIIlll.placeTarget.func_177982_a(llllIIIlIIlI[0], llllIIIlIIlI[1], llllIIIlIIlI[0])), EnumFacing.DOWN);
            mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
            lllllllllllllllIlIlIllIllllIIlll.isSneaking = (boolean)llllIIIlIIlI[0];
            mc.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerTryUseItemOnBlock(lllllllllllllllIlIlIllIllllIIlll.placeTarget.func_177982_a(llllIIIlIIlI[0], llllIIIlIIlI[1], llllIIIlIIlI[0]), EnumFacing.DOWN, EnumHand.MAIN_HAND, 0.0F, 0.0F, 0.0F));
            lllllllllllllllIlIlIllIllllIIlll.stage = llllIIIlIIlI[1];
         } else if (lIIllllIlIIIII(lllllllllllllllIlIlIllIllllIIlll.stage, llllIIIlIIlI[1])) {
            if (!lIIllllIlIIIlI(mc.field_71462_r instanceof GuiContainer)) {
               mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71070_bA.field_75152_c, llllIIIlIIlI[1], lllllllllllllllIlIlIllIllllIIlll.shulkerSlot, ClickType.SWAP, mc.field_71439_g);
               "".length();
               mc.field_71439_g.func_71053_j();
               mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIlIllIllllIIlll.redstoneSlot;
               lllllllllllllllIlIlIllIllllIIlll.placeBlock(new BlockPos(lllllllllllllllIlIlIllIllllIIlll.placeTarget.func_177982_a(llllIIIlIIlI[0], llllIIIlIIlI[2], llllIIIlIIlI[0])), EnumFacing.DOWN);
               lllllllllllllllIlIlIllIllllIIlll.stage = llllIIIlIIlI[2];
            }
         } else if (lIIllllIlIIIII(lllllllllllllllIlIlIllIllllIIlll.stage, llllIIIlIIlI[2])) {
            Exception lllllllllllllllIlIlIllIllllIIlIl = mc.field_71441_e.func_180495_p(lllllllllllllllIlIlIllIllllIIlll.placeTarget.func_177972_a(mc.field_71439_g.func_174811_aO().func_176734_d()).func_177984_a()).func_177230_c();
            if (lIIllllIlIIIlI(lllllllllllllllIlIlIllIllllIIlIl instanceof BlockAir) && !lIIllllIIlllIl(lllllllllllllllIlIlIllIllllIIlIl instanceof BlockLiquid)) {
               mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIlIllIllllIIlll.hopperSlot;
               lllllllllllllllIlIlIllIllllIIlll.placeBlock(new BlockPos(lllllllllllllllIlIlIllIllllIIlll.placeTarget.func_177972_a(mc.field_71439_g.func_174811_aO().func_176734_d())), mc.field_71439_g.func_174811_aO());
               mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
               lllllllllllllllIlIlIllIllllIIlll.isSneaking = (boolean)llllIIIlIIlI[0];
               mc.field_71439_g.field_71174_a.func_147297_a(new CPacketPlayerTryUseItemOnBlock(lllllllllllllllIlIlIllIllllIIlll.placeTarget.func_177972_a(mc.field_71439_g.func_174811_aO().func_176734_d()), EnumFacing.DOWN, EnumHand.MAIN_HAND, 0.0F, 0.0F, 0.0F));
               mc.field_71439_g.field_71071_by.field_70461_c = lllllllllllllllIlIlIllIllllIIlll.shulkerSlot;
               if (lIIllllIlIIIlI((Boolean)lllllllllllllllIlIlIllIllllIIlll.grabItem.getValue())) {
                  lllllllllllllllIlIlIllIllllIIlll.disable();
               } else {
                  lllllllllllllllIlIlIllIllllIIlll.stage = llllIIIlIIlI[5];
               }
            }
         } else {
            if (lIIllllIlIIIII(lllllllllllllllIlIlIllIllllIIlll.stage, llllIIIlIIlI[5])) {
               if (lIIllllIlIIIlI(mc.field_71462_r instanceof GuiContainer)) {
                  return;
               }

               if (lIIllllIIlllIl(((GuiContainer)mc.field_71462_r).field_147002_h.func_75139_a(llllIIIlIIlI[0]).func_75211_c().field_190928_g)) {
                  return;
               }

               mc.field_71442_b.func_187098_a(mc.field_71439_g.field_71070_bA.field_75152_c, llllIIIlIIlI[0], mc.field_71439_g.field_71071_by.field_70461_c, ClickType.SWAP, mc.field_71439_g);
               "".length();
            }

         }
      }
   }

   private static boolean lIIllllIIlllIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllllIlIIIll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static String lIIllIlIIllIlI(String lllllllllllllllIlIlIllIllIlIIlII, String lllllllllllllllIlIlIllIllIlIIlIl) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIlI[10]), "DES");
         Cipher lllllllllllllllIlIlIllIllIlIlIII = Cipher.getInstance("DES");
         lllllllllllllllIlIlIllIllIlIlIII.init(llllIIIlIIlI[2], lllllllllllllllIlIlIllIllIlIlIIl);
         return new String(lllllllllllllllIlIlIllIllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private void placeBlock(BlockPos lllllllllllllllIlIlIllIlllIlIlll, EnumFacing lllllllllllllllIlIlIllIlllIlIllI) {
      BlockPos lllllllllllllllIlIlIllIlllIllIll = lllllllllllllllIlIlIllIlllIlIlll.func_177972_a(lllllllllllllllIlIlIllIlllIlIllI);
      double lllllllllllllllIlIlIllIlllIlIlII = lllllllllllllllIlIlIllIlllIlIllI.func_176734_d();
      if (lIIllllIlIIIlI(lllllllllllllllIlIlIllIlllIllIII.isSneaking)) {
         mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_SNEAKING));
         lllllllllllllllIlIlIllIlllIllIII.isSneaking = (boolean)llllIIIlIIlI[1];
      }

      char lllllllllllllllIlIlIllIlllIlIIll = (new Vec3d(lllllllllllllllIlIlIllIlllIllIll)).func_72441_c(0.5D, 0.5D, 0.5D).func_178787_e((new Vec3d(lllllllllllllllIlIlIllIlllIlIlII.func_176730_m())).func_186678_a(0.5D));
      mc.field_71442_b.func_187099_a(mc.field_71439_g, mc.field_71441_e, lllllllllllllllIlIlIllIlllIllIll, lllllllllllllllIlIlIllIlllIlIlII, lllllllllllllllIlIlIllIlllIlIIll, EnumHand.MAIN_HAND);
      "".length();
      mc.field_71439_g.func_184609_a(EnumHand.MAIN_HAND);
   }

   private static String lIIllIlIIllIll(String lllllllllllllllIlIlIllIllIlllIll, String lllllllllllllllIlIlIllIllIlllIlI) {
      lllllllllllllllIlIlIllIllIlllIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIllIllIlllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIllIllIlllIIl = new StringBuilder();
      char[] lllllllllllllllIlIlIllIllIlllIII = lllllllllllllllIlIlIllIllIlllIlI.toCharArray();
      boolean lllllllllllllllIlIlIllIllIllIIlI = llllIIIlIIlI[0];
      boolean lllllllllllllllIlIlIllIllIllIIIl = lllllllllllllllIlIlIllIllIlllIll.toCharArray();
      Exception lllllllllllllllIlIlIllIllIllIIII = lllllllllllllllIlIlIllIllIllIIIl.length;
      int lllllllllllllllIlIlIllIllIlIllll = llllIIIlIIlI[0];

      do {
         if (!lIIllllIIllllI(lllllllllllllllIlIlIllIllIlIllll, lllllllllllllllIlIlIllIllIllIIII)) {
            return String.valueOf(lllllllllllllllIlIlIllIllIlllIIl);
         }

         char lllllllllllllllIlIlIllIllIllllII = lllllllllllllllIlIlIllIllIllIIIl[lllllllllllllllIlIlIllIllIlIllll];
         lllllllllllllllIlIlIllIllIlllIIl.append((char)(lllllllllllllllIlIlIllIllIllllII ^ lllllllllllllllIlIlIllIllIlllIII[lllllllllllllllIlIlIllIllIllIIlI % lllllllllllllllIlIlIllIllIlllIII.length]));
         "".length();
         ++lllllllllllllllIlIlIllIllIllIIlI;
         ++lllllllllllllllIlIlIllIllIlIllll;
         "".length();
      } while(-" ".length() <= "   ".length());

      return null;
   }

   private static boolean lIIllllIIllllI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIllllIlIIIII(int var0, int var1) {
      return var0 == var1;
   }

   static {
      lIIllllIIllIll();
      lIIllIlIIlllII();
      df = new DecimalFormat(lllIlIllIIlI[llllIIIlIIlI[4]]);
   }

   private static boolean lIIllllIIlllII(Object var0) {
      return var0 != null;
   }

   private static boolean lIIllllIlIIIlI(int var0) {
      return var0 == 0;
   }

   public Dispenser32k() {
      lllllllllllllllIlIlIllIllllllIII.grabItem = lllllllllllllllIlIlIllIllllllIII.register(Settings.b(lllIlIllIIlI[llllIIIlIIlI[0]], (boolean)llllIIIlIIlI[0]));
      lllllllllllllllIlIlIllIllllllIII.debugMessages = lllllllllllllllIlIlIllIllllllIII.register(Settings.b(lllIlIllIIlI[llllIIIlIIlI[1]], (boolean)llllIIIlIIlI[0]));
   }

   private static void lIIllIlIIlllII() {
      lllIlIllIIlI = new String[llllIIIlIIlI[11]];
      lllIlIllIIlI[llllIIIlIIlI[0]] = lIIllIlIIllIIl("RpB3AYgbgaBSNiEeMo8BFQ==", "UVqXr");
      lllIlIllIIlI[llllIIIlIIlI[1]] = lIIllIlIIllIlI("53W+87qgOXmwhcrxXoELgQ==", "dSqar");
      lllIlIllIIlI[llllIIIlIIlI[2]] = lIIllIlIIllIll("AyokASYkNQ==", "EXAdE");
      lllIlIllIIlI[llllIIIlIIlI[5]] = lIIllIlIIllIll("HxsTJi53aA0PYQ0uAz8yZDcPITItNAF+YSAzFTMjKDMINW8=", "DZfRA");
      lllIlIllIIlI[llllIIIlIIlI[6]] = lIIllIlIIllIll("IQITAwlJcQ0qRiovBxQDWhcHBQEfN1xX", "zCfwf");
      lllIlIllIIlI[llllIIIlIIlI[7]] = lIIllIlIIllIlI("ThLwGV68Y/o=", "QgIYL");
      lllIlIllIIlI[llllIIIlIIlI[8]] = lIIllIlIIllIlI("dqtoK7ckYWA=", "UFplt");
      lllIlIllIIlI[llllIIIlIIlI[9]] = lIIllIlIIllIlI("UzRk58Ssfr6b9q8ZBUntfw==", "eCIeM");
      lllIlIllIIlI[llllIIIlIIlI[10]] = lIIllIlIIllIIl("amY0e1nFlUU=", "znIXx");
      lllIlIllIIlI[llllIIIlIIlI[4]] = lIIllIlIIllIIl("c3J+8F0f9iA=", "GQXXW");
   }

   private static boolean lIIllllIlIIIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   protected void onEnable() {
      if (lIIllllIIlllII(mc.field_71439_g) && !lIIllllIIlllIl(ModuleManager.isModuleEnabled(lllIlIllIIlI[llllIIIlIIlI[2]]))) {
         df.setRoundingMode(RoundingMode.CEILING);
         lllllllllllllllIlIlIllIllllIllll.stage = llllIIIlIIlI[0];
         lllllllllllllllIlIlIllIllllIllll.placeTarget = null;
         lllllllllllllllIlIlIllIllllIllll.obiSlot = llllIIIlIIlI[3];
         lllllllllllllllIlIlIllIllllIllll.dispenserSlot = llllIIIlIIlI[3];
         lllllllllllllllIlIlIllIllllIllll.shulkerSlot = llllIIIlIIlI[3];
         lllllllllllllllIlIlIllIllllIllll.redstoneSlot = llllIIIlIIlI[3];
         lllllllllllllllIlIlIllIllllIllll.hopperSlot = llllIIIlIIlI[3];
         lllllllllllllllIlIlIllIllllIllll.isSneaking = (boolean)llllIIIlIIlI[0];
         int lllllllllllllllIlIlIllIllllIllIl = llllIIIlIIlI[0];

         while(lIIllllIIllllI(lllllllllllllllIlIlIllIllllIllIl, llllIIIlIIlI[4]) && (!lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.obiSlot, llllIIIlIIlI[3]) || !lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.dispenserSlot, llllIIIlIIlI[3]) || !lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.shulkerSlot, llllIIIlIIlI[3]) || !lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.redstoneSlot, llllIIIlIIlI[3]) || lIIllllIlIIIII(lllllllllllllllIlIlIllIllllIllll.hopperSlot, llllIIIlIIlI[3]))) {
            char lllllllllllllllIlIlIllIllllIllII = mc.field_71439_g.field_71071_by.func_70301_a(lllllllllllllllIlIlIllIllllIllIl);
            if (lIIllllIlIIIIl(lllllllllllllllIlIlIllIllllIllII, ItemStack.field_190927_a)) {
               if (lIIllllIlIIIlI(lllllllllllllllIlIlIllIllllIllII.func_77973_b() instanceof ItemBlock)) {
                  "".length();
                  if (" ".length() << " ".length() < (((146 ^ 143) << (" ".length() << " ".length()) ^ 9 ^ 120) & (9 ^ 96 ^ (56 ^ 35) << (" ".length() << " ".length()) ^ -" ".length()))) {
                     return;
                  }
               } else {
                  Block lllllllllllllllIlIlIllIlllllIIIl = ((ItemBlock)lllllllllllllllIlIlIllIllllIllII.func_77973_b()).func_179223_d();
                  if (lIIllllIlIIIll(lllllllllllllllIlIlIllIlllllIIIl, Blocks.field_150438_bZ)) {
                     lllllllllllllllIlIlIllIllllIllll.hopperSlot = lllllllllllllllIlIlIllIllllIllIl;
                     "".length();
                     if ("   ".length() < "   ".length()) {
                        return;
                     }
                  } else if (lIIllllIIlllIl(BlockInteractionHelper.shulkerList.contains(lllllllllllllllIlIlIllIlllllIIIl))) {
                     lllllllllllllllIlIlIllIllllIllll.shulkerSlot = lllllllllllllllIlIlIllIllllIllIl;
                     "".length();
                     if (((201 ^ 194) & ~(53 ^ 62)) != 0) {
                        return;
                     }
                  } else if (lIIllllIlIIIll(lllllllllllllllIlIlIllIlllllIIIl, Blocks.field_150343_Z)) {
                     lllllllllllllllIlIlIllIllllIllll.obiSlot = lllllllllllllllIlIlIllIllllIllIl;
                     "".length();
                     if (-" ".length() >= ((86 ^ 31 ^ (27 ^ 2) << (" ".length() << " ".length())) & ((207 ^ 192) << "   ".length() ^ 33 ^ 116 ^ -" ".length()))) {
                        return;
                     }
                  } else if (lIIllllIlIIIll(lllllllllllllllIlIlIllIlllllIIIl, Blocks.field_150367_z)) {
                     lllllllllllllllIlIlIllIllllIllll.dispenserSlot = lllllllllllllllIlIlIllIllllIllIl;
                     "".length();
                     if (null != null) {
                        return;
                     }
                  } else if (lIIllllIlIIIIl(lllllllllllllllIlIlIllIlllllIIIl, Blocks.field_150451_bX)) {
                     "".length();
                     if (-((50 ^ 15) << " ".length() ^ (35 ^ 28) << " ".length()) >= 0) {
                        return;
                     }
                  } else {
                     lllllllllllllllIlIlIllIllllIllll.redstoneSlot = lllllllllllllllIlIlIllIllllIllIl;
                  }
               }
            }

            ++lllllllllllllllIlIlIllIllllIllIl;
            "".length();
            if ("   ".length() <= 0) {
               return;
            }
         }

         if (lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.obiSlot, llllIIIlIIlI[3]) && lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.dispenserSlot, llllIIIlIIlI[3]) && lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.shulkerSlot, llllIIIlIIlI[3]) && lIIllllIIlllll(lllllllllllllllIlIlIllIllllIllll.redstoneSlot, llllIIIlIIlI[3]) && !lIIllllIlIIIII(lllllllllllllllIlIlIllIllllIllll.hopperSlot, llllIIIlIIlI[3])) {
            if (lIIllllIIlllII(mc.field_71476_x)) {
               lllllllllllllllIlIlIllIllllIllll.placeTarget = mc.field_71476_x.func_178782_a().func_177984_a();
            }

            if (lIIllllIIlllIl((Boolean)lllllllllllllllIlIlIllIllllIllll.debugMessages.getValue())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lllIlIllIIlI[llllIIIlIIlI[6]]).append(lllllllllllllllIlIlIllIllllIllll.placeTarget.field_177962_a).append(lllIlIllIIlI[llllIIIlIIlI[7]]).append(lllllllllllllllIlIlIllIllllIllll.placeTarget.field_177960_b).append(lllIlIllIIlI[llllIIIlIIlI[8]]).append(lllllllllllllllIlIlIllIllllIllll.placeTarget.field_177961_c).append(lllIlIllIIlI[llllIIIlIIlI[9]]).append(df.format(mc.field_71439_g.func_174791_d().func_72438_d(new Vec3d(lllllllllllllllIlIlIllIllllIllll.placeTarget))))));
            }

         } else {
            if (lIIllllIIlllIl((Boolean)lllllllllllllllIlIlIllIllllIllll.debugMessages.getValue())) {
               Command.sendChatMessage(lllIlIllIIlI[llllIIIlIIlI[5]]);
            }

            lllllllllllllllIlIlIllIllllIllll.disable();
         }
      } else {
         lllllllllllllllIlIlIllIllllIllll.disable();
      }
   }

   private static boolean lIIllllIIlllll(int var0, int var1) {
      return var0 != var1;
   }

   private static String lIIllIlIIllIIl(String lllllllllllllllIlIlIllIlllIIlIIl, String lllllllllllllllIlIlIllIlllIIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIlIllIlllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIllIlllIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         short lllllllllllllllIlIlIllIlllIIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIllIlllIIIllI.init(llllIIIlIIlI[2], lllllllllllllllIlIlIllIlllIIlllI);
         return new String(lllllllllllllllIlIlIllIlllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIllIlllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static void lIIllllIIllIll() {
      llllIIIlIIlI = new int[12];
      llllIIIlIIlI[0] = "   ".length() << ((142 ^ 193) << " ".length() ^ 89 + 91 - 28 + 3) & ("   ".length() << (31 + 149 - 18 + 1 ^ (50 ^ 97) << " ".length()) ^ -" ".length());
      llllIIIlIIlI[1] = " ".length();
      llllIIIlIIlI[2] = " ".length() << " ".length();
      llllIIIlIIlI[3] = -" ".length();
      llllIIIlIIlI[4] = 3 + 117 - 100 + 123 ^ (251 ^ 184) << " ".length();
      llllIIIlIIlI[5] = "   ".length();
      llllIIIlIIlI[6] = " ".length() << (" ".length() << " ".length());
      llllIIIlIIlI[7] = 71 ^ 66;
      llllIIIlIIlI[8] = "   ".length() << " ".length();
      llllIIIlIIlI[9] = 6 ^ 11 ^ (72 ^ 77) << " ".length();
      llllIIIlIIlI[10] = " ".length() << "   ".length();
      llllIIIlIIlI[11] = (51 ^ 54) << " ".length();
   }
}
