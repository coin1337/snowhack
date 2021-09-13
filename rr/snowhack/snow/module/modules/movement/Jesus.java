package rr.snowhack.snow.module.modules.movement;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.block.BlockLiquid;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import rr.snowhack.snow.event.SnowEvent;
import rr.snowhack.snow.event.events.AddCollisionBoxToListEvent;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "Jesus",
   description = "Allows you to walk on water",
   category = Module.Category.MOVEMENT
)
public class Jesus extends Module {
   // $FF: synthetic field
   private static final AxisAlignedBB WATER_WALK_AA;
   // $FF: synthetic field
   @EventHandler
   Listener<PacketEvent.Send> packetEventSendListener;
   // $FF: synthetic field
   @EventHandler
   Listener<AddCollisionBoxToListEvent> addCollisionBoxToListEventListener;
   // $FF: synthetic field
   private static final int[] lllIlIlIlIIl;
   // $FF: synthetic field
   private static final String[] lllIlIlIIIlI;

   private static void lIIllIIllIIlIl() {
      lllIlIlIlIIl = new int[3];
      lllIlIlIlIIl[0] = (64 ^ 79 ^ "   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) & (((109 ^ 104) << "   ".length() ^ 161 ^ 134) << (" ".length() << " ".length()) ^ -" ".length());
      lllIlIlIlIIl[1] = " ".length();
      lllIlIlIlIIl[2] = " ".length() << " ".length();
   }

   private static boolean lIIllIIllIlIIl(Object var0) {
      return var0 != null;
   }

   private static boolean lIIllIIllIlllI(Object var0, Object var1) {
      return var0 == var1;
   }

   private static boolean lIIllIIllIlIll(int var0, int var1) {
      return var0 < var1;
   }

   private static int lIIllIIllIllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public Jesus() {
      lllllllllllllllIlIlllllIIllIllII.addCollisionBoxToListEventListener = new Listener((lllllllllllllllIlIlllllIIlIIllII) -> {
         if (lIIllIIllIlIIl(mc.field_71439_g) && lIIllIIllIlIII(lllllllllllllllIlIlllllIIlIIllII.getBlock() instanceof BlockLiquid) && (!lIIllIIllIIllI(EntityUtil.isDrivenByPlayer(lllllllllllllllIlIlllllIIlIIllII.getEntity())) || lIIllIIllIlllI(lllllllllllllllIlIlllllIIlIIllII.getEntity(), mc.field_71439_g)) && lIIllIIllIIllI(lllllllllllllllIlIlllllIIlIIllII.getEntity() instanceof EntityBoat) && lIIllIIllIIllI(mc.field_71439_g.func_70093_af()) && lIIllIIlllIIII(lIIllIIllIllll(mc.field_71439_g.field_70143_R, 3.0F)) && lIIllIIllIIllI(EntityUtil.isInWater(mc.field_71439_g)) && (!lIIllIIllIIllI(EntityUtil.isAboveWater(mc.field_71439_g, (boolean)lllIlIlIlIIl[0])) || lIIllIIllIlIII(EntityUtil.isAboveWater(mc.field_71439_g.func_184187_bx(), (boolean)lllIlIlIlIIl[0]))) && lIIllIIllIlIII(isAboveBlock(mc.field_71439_g, lllllllllllllllIlIlllllIIlIIllII.getPos()))) {
            AxisAlignedBB lllllllllllllllIlIlllllIIlIIllIl = WATER_WALK_AA.func_186670_a(lllllllllllllllIlIlllllIIlIIllII.getPos());
            if (lIIllIIllIlIII(lllllllllllllllIlIlllllIIlIIllII.getEntityBox().func_72326_a(lllllllllllllllIlIlllllIIlIIllIl))) {
               lllllllllllllllIlIlllllIIlIIllII.getCollidingBoxes().add(lllllllllllllllIlIlllllIIlIIllIl);
               "".length();
            }

            lllllllllllllllIlIlllllIIlIIllII.cancel();
         }

      }, new Predicate[lllIlIlIlIIl[0]]);
      lllllllllllllllIlIlllllIIllIllII.packetEventSendListener = new Listener((lllllllllllllllIlIlllllIIlIlIIIl) -> {
         if (lIIllIIllIlllI(lllllllllllllllIlIlllllIIlIlIIIl.getEra(), SnowEvent.Era.PRE) && lIIllIIllIlIII(lllllllllllllllIlIlllllIIlIlIIIl.getPacket() instanceof CPacketPlayer) && lIIllIIllIlIII(EntityUtil.isAboveWater(mc.field_71439_g, (boolean)lllIlIlIlIIl[1])) && lIIllIIllIIllI(EntityUtil.isInWater(mc.field_71439_g)) && lIIllIIllIIllI(isAboveLand(mc.field_71439_g))) {
            int lllllllllllllllIlIlllllIIlIlIIll = mc.field_71439_g.field_70173_aa % lllIlIlIlIIl[2];
            if (lIIllIIllIIllI(lllllllllllllllIlIlllllIIlIlIIll)) {
               CPacketPlayer var10000 = (CPacketPlayer)lllllllllllllllIlIlllllIIlIlIIIl.getPacket();
               var10000.field_149477_b += 0.02D;
            }
         }

      }, new Predicate[lllIlIlIlIIl[0]]);
   }

   private static boolean lIIllIIllIIllI(int var0) {
      return var0 == 0;
   }

   private static int lIIllIIllIllII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static boolean lIIllIIllIlIlI(Object var0) {
      return var0 == null;
   }

   static {
      lIIllIIllIIlIl();
      lIIllIIlIIIIll();
      WATER_WALK_AA = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.99D, 1.0D);
   }

   private static boolean lIIllIIlllIIII(int var0) {
      return var0 < 0;
   }

   public void onUpdate() {
      if (lIIllIIllIIllI(ModuleManager.isModuleEnabled(lllIlIlIIIlI[lllIlIlIlIIl[0]])) && lIIllIIllIlIII(EntityUtil.isInWater(mc.field_71439_g)) && lIIllIIllIIllI(mc.field_71439_g.func_70093_af())) {
         mc.field_71439_g.field_70181_x = 0.1D;
         if (lIIllIIllIlIIl(mc.field_71439_g.func_184187_bx()) && lIIllIIllIIllI(mc.field_71439_g.func_184187_bx() instanceof EntityBoat)) {
            mc.field_71439_g.func_184187_bx().field_70181_x = 0.3D;
         }
      }

   }

   private static boolean lIIllIIllIlIII(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllIIllIllIl(int var0) {
      return var0 >= 0;
   }

   private static String lIIllIIlIIIIlI(String lllllllllllllllIlIlllllIIIllllll, String lllllllllllllllIlIlllllIIIlllllI) {
      lllllllllllllllIlIlllllIIIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      Exception lllllllllllllllIlIlllllIIIlllIII = new StringBuilder();
      char[] lllllllllllllllIlIlllllIIIllllII = lllllllllllllllIlIlllllIIIlllllI.toCharArray();
      int lllllllllllllllIlIlllllIIIlllIll = lllIlIlIlIIl[0];
      short lllllllllllllllIlIlllllIIIllIlIl = lllllllllllllllIlIlllllIIIllllll.toCharArray();
      double lllllllllllllllIlIlllllIIIllIlII = lllllllllllllllIlIlllllIIIllIlIl.length;
      int lllllllllllllllIlIlllllIIIllIIll = lllIlIlIlIIl[0];

      do {
         if (!lIIllIIllIlIll(lllllllllllllllIlIlllllIIIllIIll, lllllllllllllllIlIlllllIIIllIlII)) {
            return String.valueOf(lllllllllllllllIlIlllllIIIlllIII);
         }

         char lllllllllllllllIlIlllllIIlIIIIII = lllllllllllllllIlIlllllIIIllIlIl[lllllllllllllllIlIlllllIIIllIIll];
         lllllllllllllllIlIlllllIIIlllIII.append((char)(lllllllllllllllIlIlllllIIlIIIIII ^ lllllllllllllllIlIlllllIIIllllII[lllllllllllllllIlIlllllIIIlllIll % lllllllllllllllIlIlllllIIIllllII.length]));
         "".length();
         ++lllllllllllllllIlIlllllIIIlllIll;
         ++lllllllllllllllIlIlllllIIIllIIll;
         "".length();
      } while((57 ^ 60) != 0);

      return null;
   }

   private static boolean isAboveLand(Entity lllllllllllllllIlIlllllIIllIIIlI) {
      if (lIIllIIllIlIlI(lllllllllllllllIlIlllllIIllIIIlI)) {
         return (boolean)lllIlIlIlIIl[0];
      } else {
         int lllllllllllllllIlIlllllIIlIlllll = lllllllllllllllIlIlllllIIllIIIlI.field_70163_u - 0.01D;
         int lllllllllllllllIlIlllllIIlIllllI = MathHelper.func_76128_c(lllllllllllllllIlIlllllIIllIIIlI.field_70165_t);

         do {
            if (!lIIllIIllIlIll(lllllllllllllllIlIlllllIIlIllllI, MathHelper.func_76143_f(lllllllllllllllIlIlllllIIllIIIlI.field_70165_t))) {
               return (boolean)lllIlIlIlIIl[0];
            }

            int lllllllllllllllIlIlllllIIllIIlII = MathHelper.func_76128_c(lllllllllllllllIlIlllllIIllIIIlI.field_70161_v);

            while(lIIllIIllIlIll(lllllllllllllllIlIlllllIIllIIlII, MathHelper.func_76143_f(lllllllllllllllIlIlllllIIllIIIlI.field_70161_v))) {
               char lllllllllllllllIlIlllllIIlIlllII = new BlockPos(lllllllllllllllIlIlllllIIlIllllI, MathHelper.func_76128_c(lllllllllllllllIlIlllllIIlIlllll), lllllllllllllllIlIlllllIIllIIlII);
               if (lIIllIIllIlIII(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIlllllIIlIlllII).func_177230_c().func_149730_j(Wrapper.getWorld().func_180495_p(lllllllllllllllIlIlllllIIlIlllII)))) {
                  return (boolean)lllIlIlIlIIl[1];
               }

               ++lllllllllllllllIlIlllllIIllIIlII;
               "".length();
               if (-" ".length() >= 0) {
                  return (boolean)((99 ^ 34) & ~(118 ^ 55));
               }
            }

            ++lllllllllllllllIlIlllllIIlIllllI;
            "".length();
         } while(" ".length() < " ".length() << " ".length());

         return (boolean)((52 ^ 39) << " ".length() & ~((102 ^ 117) << " ".length()));
      }
   }

   private static void lIIllIIlIIIIll() {
      lllIlIlIIIlI = new String[lllIlIlIlIIl[1]];
      lllIlIlIIIlI[lllIlIlIlIIl[0]] = lIIllIIlIIIIlI("FjQoCBUxKw==", "PFMmv");
   }

   private static boolean isAboveBlock(Entity lllllllllllllllIlIlllllIIlIlIlll, BlockPos lllllllllllllllIlIlllllIIlIlIllI) {
      int var10000;
      if (lIIllIIllIllIl(lIIllIIllIllII(lllllllllllllllIlIlllllIIlIlIlll.field_70163_u, (double)lllllllllllllllIlIlllllIIlIlIllI.func_177956_o()))) {
         var10000 = lllIlIlIlIIl[1];
         "".length();
         if (" ".length() < (" ".length() << "   ".length() & ~(" ".length() << "   ".length()))) {
            return (boolean)((174 ^ 181) << " ".length() & ~((64 ^ 91) << " ".length()));
         }
      } else {
         var10000 = lllIlIlIlIIl[0];
      }

      return (boolean)var10000;
   }
}
