package rr.snowhack.snow.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockFalling;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CPacketEntityAction;
import net.minecraft.network.play.client.CPacketEntityAction.Action;
import net.minecraft.util.MovementInput;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.InputUpdateEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.BlockInteractionHelper;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "Scaffold",
   category = Module.Category.PLAYER,
   description = "Places blocks under you"
)
public class Scaffold extends Module {
   // $FF: synthetic field
   private Setting<Scaffold.Mode> modeSetting;
   // $FF: synthetic field
   private Setting<Boolean> randomDelay;
   // $FF: synthetic field
   private static final String[] lIIIIIlllIIll;
   // $FF: synthetic field
   private static Scaffold INSTANCE;
   // $FF: synthetic field
   private Setting<Integer> delayRange;
   // $FF: synthetic field
   private Setting<Integer> ticks;
   // $FF: synthetic field
   private Setting<Boolean> placeBlocks;
   // $FF: synthetic field
   @EventHandler
   private Listener<InputUpdateEvent> eventListener;
   // $FF: synthetic field
   private boolean shouldSlow;
   // $FF: synthetic field
   private static final int[] lIIIIIllllIIl;

   private static void lIlIlIIllllIII() {
      lIIIIIllllIIl = new int[11];
      lIIIIIllllIIl[0] = "   ".length() << " ".length() & ("   ".length() << " ".length() ^ -" ".length());
      lIIIIIllllIIl[1] = " ".length();
      lIIIIIllllIIl[2] = " ".length() << " ".length();
      lIIIIIllllIIl[3] = "   ".length();
      lIIIIIllllIIl[4] = "   ".length() << " ".length();
      lIIIIIllllIIl[5] = (165 ^ 160) << " ".length();
      lIIIIIllllIIl[6] = " ".length() << (" ".length() << " ".length());
      lIIIIIllllIIl[7] = (106 ^ 101) << (" ".length() << " ".length());
      lIIIIIllllIIl[8] = 2 ^ 7;
      lIIIIIllllIIl[9] = -" ".length();
      lIIIIIllllIIl[10] = (108 ^ 123) << " ".length() ^ 13 ^ 42;
   }

   public void onUpdate() {
      if (lIlIlIIllllIIl(mc.field_71439_g) && !lIlIlIIllllIlI(ModuleManager.isModuleEnabled(lIIIIIlllIIll[lIIIIIllllIIl[8]]))) {
         lllllllllllllllIlIIIIlIIlIllllIl.shouldSlow = (boolean)lIIIIIllllIIl[0];
         short lllllllllllllllIlIIIIlIIlIllllII = EntityUtil.getInterpolatedPos(mc.field_71439_g, (float)(Integer)lllllllllllllllIlIIIIlIIlIllllIl.ticks.getValue());
         if (lIlIlIIllllIlI(((Scaffold.Mode)lllllllllllllllIlIIIIlIIlIllllIl.modeSetting.getValue()).equals(Scaffold.Mode.LEGIT))) {
            lllllllllllllllIlIIIIlIIlIllllII = EntityUtil.getInterpolatedPos(mc.field_71439_g, 0.0F);
         }

         short lllllllllllllllIlIIIIlIIlIlllIll = (new BlockPos(lllllllllllllllIlIIIIlIIlIllllII)).func_177977_b();
         short lllllllllllllllIlIIIIlIIlIlllIlI = lllllllllllllllIlIIIIlIIlIlllIll.func_177977_b();
         BlockPos lllllllllllllllIlIIIIlIIlIlllllI = new BlockPos(EntityUtil.getInterpolatedPos(mc.field_71439_g, 2.0F));
         if (lIlIlIIllllIlI(((Scaffold.Mode)lllllllllllllllIlIIIIlIIlIllllIl.modeSetting.getValue()).equals(Scaffold.Mode.LEGIT)) && lIlIlIIllllIlI(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIIIlIIlIlllllI.func_177977_b()).func_185904_a().func_76222_j()) && lIlIlIIllllIlI(mc.field_71439_g.field_70122_E)) {
            lllllllllllllllIlIIIIlIIlIllllIl.shouldSlow = (boolean)lIIIIIllllIIl[1];
            mc.field_71439_g.field_71158_b.field_78899_d = (boolean)lIIIIIllllIIl[1];
            mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.START_SNEAKING));
         }

         if (!lIlIlIIllllIll(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIIIlIIlIlllIll).func_185904_a().func_76222_j())) {
            lllllllllllllllIlIIIIlIIlIllllIl.setSlotToBlocks(lllllllllllllllIlIIIIlIIlIlllIlI);
            if (!lIlIlIIllllIll(BlockInteractionHelper.checkForNeighbours(lllllllllllllllIlIIIIlIIlIlllIll))) {
               if (lIlIlIIllllIlI((Boolean)lllllllllllllllIlIIIIlIIlIllllIl.placeBlocks.getValue())) {
                  BlockInteractionHelper.placeBlockScaffold(lllllllllllllllIlIIIIlIIlIlllIll);
               }

               mc.field_71439_g.field_71174_a.func_147297_a(new CPacketEntityAction(mc.field_71439_g, Action.STOP_SNEAKING));
               lllllllllllllllIlIIIIlIIlIllllIl.shouldSlow = (boolean)lIIIIIllllIIl[0];
            }
         }
      }
   }

   private static boolean lIlIlIIlllllll(int var0, int var1) {
      return var0 != var1;
   }

   private float getRandomInRange() {
      return 0.11F + (float)Math.random() * ((float)(Integer)lllllllllllllllIlIIIIlIIlIllIlll.delayRange.getValue() / 10.0F - 0.11F);
   }

   private static String lIlIlIIlllIIll(String lllllllllllllllIlIIIIlIIlIIIlIll, String lllllllllllllllIlIIIIlIIlIIIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIIIlIIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String lllllllllllllllIlIIIIlIIlIIIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIIlIIlIIIIllI.init(lIIIIIllllIIl[2], lllllllllllllllIlIIIIlIIlIIIlllI);
         return new String(lllllllllllllllIlIIIIlIIlIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static boolean shouldScaffold() {
      return INSTANCE.isEnabled();
   }

   private static boolean lIlIlIIlllllII(int var0, int var1) {
      return var0 < var1;
   }

   public Scaffold() {
      lllllllllllllllIlIIIIlIIllIIlIII.placeBlocks = lllllllllllllllIlIIIIlIIllIIlIII.register(Settings.b(lIIIIIlllIIll[lIIIIIllllIIl[0]], (boolean)lIIIIIllllIIl[1]));
      lllllllllllllllIlIIIIlIIllIIlIII.modeSetting = lllllllllllllllIlIIIIlIIllIIlIII.register(Settings.enumBuilder(Scaffold.Mode.class).withName(lIIIIIlllIIll[lIIIIIllllIIl[1]]).withValue(Scaffold.Mode.LEGIT).build());
      lllllllllllllllIlIIIIlIIllIIlIII.randomDelay = lllllllllllllllIlIIIIlIIllIIlIII.register(Settings.booleanBuilder(lIIIIIlllIIll[lIIIIIllllIIl[2]]).withValue(Boolean.valueOf((boolean)lIIIIIllllIIl[0])).withVisibility((lllllllllllllllIlIIIIlIIlIIlIlII) -> {
         return ((Scaffold.Mode)lllllllllllllllIlIIIIlIIlIIlIIll.modeSetting.getValue()).equals(Scaffold.Mode.LEGIT);
      }).build());
      lllllllllllllllIlIIIIlIIllIIlIII.delayRange = lllllllllllllllIlIIIIlIIllIIlIII.register(Settings.integerBuilder(lIIIIIlllIIll[lIIIIIllllIIl[3]]).withMinimum(lIIIIIllllIIl[0]).withValue((Number)lIIIIIllllIIl[4]).withMaximum(lIIIIIllllIIl[5]).withVisibility((lllllllllllllllIlIIIIlIIlIIllIII) -> {
         int var10000;
         if (lIlIlIIllllIlI(((Scaffold.Mode)lllllllllllllllIlIIIIlIIlIIllIIl.modeSetting.getValue()).equals(Scaffold.Mode.LEGIT)) && lIlIlIIllllIlI((Boolean)lllllllllllllllIlIIIIlIIlIIllIIl.randomDelay.getValue())) {
            var10000 = lIIIIIllllIIl[1];
            "".length();
            if (-(196 ^ 192) > 0) {
               return (boolean)((150 ^ 185) & ~(155 ^ 180));
            }
         } else {
            var10000 = lIIIIIllllIIl[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIlIIIIlIIllIIlIII.ticks = lllllllllllllllIlIIIIlIIllIIlIII.register(Settings.integerBuilder(lIIIIIlllIIll[lIIIIIllllIIl[6]]).withMinimum(lIIIIIllllIIl[0]).withMaximum(lIIIIIllllIIl[7]).withValue((Number)lIIIIIllllIIl[2]).withVisibility((lllllllllllllllIlIIIIlIIlIIlllII) -> {
         int var10000;
         if (lIlIlIIllllIll(((Scaffold.Mode)lllllllllllllllIlIIIIlIIlIIllIll.modeSetting.getValue()).equals(Scaffold.Mode.LEGIT))) {
            var10000 = lIIIIIllllIIl[1];
            "".length();
            if (-" ".length() >= "   ".length()) {
               return (boolean)((" ".length() << (" ".length() << (" ".length() << " ".length())) ^ 14 ^ 95) & (" ".length() << ("   ".length() << " ".length()) ^ " ".length() ^ -" ".length()));
            }
         } else {
            var10000 = lIIIIIllllIIl[0];
         }

         return (boolean)var10000;
      }).build());
      lllllllllllllllIlIIIIlIIllIIlIII.shouldSlow = (boolean)lIIIIIllllIIl[0];
      lllllllllllllllIlIIIIlIIllIIlIII.eventListener = new Listener((lllllllllllllllIlIIIIlIIlIlIIIIl) -> {
         if (lIlIlIIllllIlI(((Scaffold.Mode)lllllllllllllllIlIIIIlIIlIlIIIlI.modeSetting.getValue()).equals(Scaffold.Mode.LEGIT)) && lIlIlIIllllIlI(lllllllllllllllIlIIIIlIIlIlIIIlI.shouldSlow)) {
            MovementInput var10000;
            if (lIlIlIIllllIlI((Boolean)lllllllllllllllIlIIIIlIIlIlIIIlI.randomDelay.getValue())) {
               var10000 = lllllllllllllllIlIIIIlIIlIlIIIIl.getMovementInput();
               var10000.field_78902_a *= 0.2F + lllllllllllllllIlIIIIlIIlIlIIIlI.getRandomInRange();
               var10000 = lllllllllllllllIlIIIIlIIlIlIIIIl.getMovementInput();
               var10000.field_192832_b *= 0.2F + lllllllllllllllIlIIIIlIIlIlIIIlI.getRandomInRange();
               "".length();
               if (((216 ^ 135) & ~(216 ^ 135)) >= " ".length() << " ".length()) {
                  return;
               }
            } else {
               var10000 = lllllllllllllllIlIIIIlIIlIlIIIIl.getMovementInput();
               var10000.field_78902_a *= 0.2F;
               var10000 = lllllllllllllllIlIIIIlIIlIlIIIIl.getMovementInput();
               var10000.field_192832_b *= 0.2F;
            }
         }

      }, new Predicate[lIIIIIllllIIl[0]]);
      INSTANCE = lllllllllllllllIlIIIIlIIllIIlIII;
   }

   private static boolean lIlIlIIllllIll(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIlIIllllIIl(Object var0) {
      return var0 != null;
   }

   private static boolean lIlIlIIlllllIl(Object var0, Object var1) {
      return var0 != var1;
   }

   static {
      lIlIlIIllllIII();
      lIlIlIIlllIllI();
   }

   private void setSlotToBlocks(BlockPos lllllllllllllllIlIIIIlIIlIlIllII) {
      int lllllllllllllllIlIIIIlIIlIlIlIll = lIIIIIllllIIl[9];
      int lllllllllllllllIlIIIIlIIlIlIIlll = lIIIIIllllIIl[0];

      while(lIlIlIIlllllII(lllllllllllllllIlIIIIlIIlIlIIlll, lIIIIIllllIIl[10])) {
         Exception lllllllllllllllIlIIIIlIIlIlIIllI = Wrapper.getPlayer().field_71071_by.func_70301_a(lllllllllllllllIlIIIIlIIlIlIIlll);
         if (lIlIlIIlllllIl(lllllllllllllllIlIIIIlIIlIlIIllI, ItemStack.field_190927_a)) {
            if (lIlIlIIllllIll(lllllllllllllllIlIIIIlIIlIlIIllI.func_77973_b() instanceof ItemBlock)) {
               "".length();
               if ((109 ^ 74 ^ (181 ^ 164) << " ".length()) <= 0) {
                  return;
               }
            } else {
               Block lllllllllllllllIlIIIIlIIlIlIllll = ((ItemBlock)lllllllllllllllIlIIIIlIIlIlIIllI.func_77973_b()).func_179223_d();
               if (lIlIlIIllllIll(BlockInteractionHelper.blackList.contains(lllllllllllllllIlIIIIlIIlIlIllll))) {
                  if (lIlIlIIllllIlI(lllllllllllllllIlIIIIlIIlIlIllll instanceof BlockContainer)) {
                     "".length();
                     if ("   ".length() != "   ".length()) {
                        return;
                     }
                  } else if (lIlIlIIllllIll(Block.func_149634_a(lllllllllllllllIlIIIIlIIlIlIIllI.func_77973_b()).func_176223_P().func_185913_b())) {
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) < 0) {
                        return;
                     }
                  } else {
                     if (!lIlIlIIllllIlI(((ItemBlock)lllllllllllllllIlIIIIlIIlIlIIllI.func_77973_b()).func_179223_d() instanceof BlockFalling) || !lIlIlIIllllIlI(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIIIIlIIlIlIllII).func_185904_a().func_76222_j())) {
                        lllllllllllllllIlIIIIlIIlIlIlIll = lllllllllllllllIlIIIIlIIlIlIIlll;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) <= " ".length() << " ".length()) {
                           return;
                        }
                        break;
                     }

                     "".length();
                     if (((138 ^ 163) << " ".length() & ~((101 ^ 76) << " ".length())) != 0) {
                        return;
                     }
                  }
               }
            }
         }

         ++lllllllllllllllIlIIIIlIIlIlIIlll;
         "".length();
         if (" ".length() << " ".length() == 0) {
            return;
         }
      }

      lllllllllllllllIlIIIIlIIlIlIIlll = lIIIIIllllIIl[1];
      if (lIlIlIIlllllll(lllllllllllllllIlIIIIlIIlIlIlIll, lIIIIIllllIIl[9])) {
         lllllllllllllllIlIIIIlIIlIlIIlll = Wrapper.getPlayer().field_71071_by.field_70461_c;
         Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIlIIIIlIIlIlIlIll;
      }

      Wrapper.getPlayer().field_71071_by.field_70461_c = lllllllllllllllIlIIIIlIIlIlIIlll;
   }

   private static String lIlIlIIlllIlII(String lllllllllllllllIlIIIIlIIIlllIllI, String lllllllllllllllIlIIIIlIIIlllIlIl) {
      lllllllllllllllIlIIIIlIIIlllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIIIlIIIllllIIl = new StringBuilder();
      Exception lllllllllllllllIlIIIIlIIIlllIIll = lllllllllllllllIlIIIIlIIIlllIlIl.toCharArray();
      int lllllllllllllllIlIIIIlIIIlllIIlI = lIIIIIllllIIl[0];
      float lllllllllllllllIlIIIIlIIIlllIIIl = lllllllllllllllIlIIIIlIIIlllIllI.toCharArray();
      Exception lllllllllllllllIlIIIIlIIIlllIIII = lllllllllllllllIlIIIIlIIIlllIIIl.length;
      int lllllllllllllllIlIIIIlIIIllIllll = lIIIIIllllIIl[0];

      do {
         if (!lIlIlIIlllllII(lllllllllllllllIlIIIIlIIIllIllll, lllllllllllllllIlIIIIlIIIlllIIII)) {
            return String.valueOf(lllllllllllllllIlIIIIlIIIllllIIl);
         }

         String lllllllllllllllIlIIIIlIIIllIlllI = lllllllllllllllIlIIIIlIIIlllIIIl[lllllllllllllllIlIIIIlIIIllIllll];
         lllllllllllllllIlIIIIlIIIllllIIl.append((char)(lllllllllllllllIlIIIIlIIIllIlllI ^ lllllllllllllllIlIIIIlIIIlllIIll[lllllllllllllllIlIIIIlIIIlllIIlI % lllllllllllllllIlIIIIlIIIlllIIll.length]));
         "".length();
         ++lllllllllllllllIlIIIIlIIIlllIIlI;
         ++lllllllllllllllIlIIIIlIIIllIllll;
         "".length();
      } while(((115 ^ 96) << (" ".length() << " ".length()) & ~((20 ^ 7) << (" ".length() << " ".length()))) <= 0);

      return null;
   }

   private static void lIlIlIIlllIllI() {
      lIIIIIlllIIll = new String[lIIIIIllllIIl[4]];
      lIIIIIlllIIll[lIIIIIllllIIl[0]] = lIlIlIIlllIIll("m083tEZNmTkSOFs4xk2aFw==", "WdJAq");
      lIIIIIlllIIll[lIIIIIllllIIl[1]] = lIlIlIIlllIIll("pkCoMCwiuDg=", "vTlFD");
      lIIIIIlllIIll[lIIIIIllllIIl[2]] = lIlIlIIlllIlII("CAc+IgI3RhQjATsf", "ZfPFm");
      lIIIIIlllIIll[lIIIIIllllIIl[3]] = lIlIlIIlllIIll("Jm438yE13SAZYKIDjq8egw==", "qvfig");
      lIIIIIlllIIll[lIIIIIllllIIl[6]] = lIlIlIIlllIIll("7owCEaDSHNY=", "RqZtA");
      lIIIIIlllIIll[lIIIIIllllIIl[8]] = lIlIlIIlllIlII("NzQ/FRQQKw==", "qFZpw");
   }

   private static boolean lIlIlIIllllIlI(int var0) {
      return var0 != 0;
   }

   private static enum Mode {
      // $FF: synthetic field
      NEITHER;

      // $FF: synthetic field
      private static final String[] lIIIIllIlIIIl;
      // $FF: synthetic field
      LEGIT;

      // $FF: synthetic field
      private static final int[] lIIIIllIlIlII;

      static {
         lIlIllIIIlllll();
         lIlIllIIIllllI();
         NEITHER = new Scaffold.Mode(lIIIIllIlIIIl[lIIIIllIlIlII[0]], lIIIIllIlIlII[0]);
         LEGIT = new Scaffold.Mode(lIIIIllIlIIIl[lIIIIllIlIlII[1]], lIIIIllIlIlII[1]);
         Scaffold.Mode[] var10000 = new Scaffold.Mode[lIIIIllIlIlII[2]];
         var10000[lIIIIllIlIlII[0]] = NEITHER;
         var10000[lIIIIllIlIlII[1]] = LEGIT;
      }

      private static void lIlIllIIIlllll() {
         lIIIIllIlIlII = new int[4];
         lIIIIllIlIlII[0] = (39 ^ 112) & ~(84 ^ 3);
         lIIIIllIlIlII[1] = " ".length();
         lIIIIllIlIlII[2] = " ".length() << " ".length();
         lIIIIllIlIlII[3] = " ".length() << "   ".length();
      }

      private static boolean lIlIllIIlIIIII(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIlIllIIIlllIl(String lllllllllllllllIIllllIllllIlIlll, String lllllllllllllllIIllllIllllIlIllI) {
         lllllllllllllllIIllllIllllIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIllllIllllIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         short lllllllllllllllIIllllIllllIlIIII = new StringBuilder();
         char[] lllllllllllllllIIllllIllllIlIlII = lllllllllllllllIIllllIllllIlIllI.toCharArray();
         long lllllllllllllllIIllllIllllIIlllI = lIIIIllIlIlII[0];
         int lllllllllllllllIIllllIllllIIllIl = lllllllllllllllIIllllIllllIlIlll.toCharArray();
         char lllllllllllllllIIllllIllllIIllII = lllllllllllllllIIllllIllllIIllIl.length;
         int lllllllllllllllIIllllIllllIIlIll = lIIIIllIlIlII[0];

         do {
            if (!lIlIllIIlIIIII(lllllllllllllllIIllllIllllIIlIll, lllllllllllllllIIllllIllllIIllII)) {
               return String.valueOf(lllllllllllllllIIllllIllllIlIIII);
            }

            float lllllllllllllllIIllllIllllIIlIlI = lllllllllllllllIIllllIllllIIllIl[lllllllllllllllIIllllIllllIIlIll];
            lllllllllllllllIIllllIllllIlIIII.append((char)(lllllllllllllllIIllllIllllIIlIlI ^ lllllllllllllllIIllllIllllIlIlII[lllllllllllllllIIllllIllllIIlllI % lllllllllllllllIIllllIllllIlIlII.length]));
            "".length();
            ++lllllllllllllllIIllllIllllIIlllI;
            ++lllllllllllllllIIllllIllllIIlIll;
            "".length();
         } while(-((44 ^ 41) << (" ".length() << (" ".length() << " ".length())) ^ 42 ^ 127) < 0);

         return null;
      }

      private static String lIlIllIIIlllII(String lllllllllllllllIIllllIllllIIIIlI, String lllllllllllllllIIllllIlllIllllll) {
         try {
            SecretKeySpec lllllllllllllllIIllllIllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllIlllIllllll.getBytes(StandardCharsets.UTF_8)), lIIIIllIlIlII[3]), "DES");
            Cipher lllllllllllllllIIllllIllllIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIllllIllllIIIlII.init(lIIIIllIlIlII[2], lllllllllllllllIIllllIllllIIIlIl);
            return new String(lllllllllllllllIIllllIllllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllIllllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static void lIlIllIIIllllI() {
         lIIIIllIlIIIl = new String[lIIIIllIlIlII[2]];
         lIIIIllIlIIIl[lIIIIllIlIlII[0]] = lIlIllIIIlllII("foxivVTcYPY=", "brFfP");
         lIIIIllIlIIIl[lIIIIllIlIlII[1]] = lIlIllIIIlllIl("JjclDz0=", "jrbFi");
      }
   }
}
