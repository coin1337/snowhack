package rr.snowhack.snow.module.modules.movement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.network.play.client.CPacketConfirmTeleport;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.network.play.server.SPacketPlayerPosLook;
import net.minecraft.util.math.BlockPos;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "PacketFly",
   category = Module.Category.MOVEMENT
)
public class PacketFly extends Module {
   // $FF: synthetic field
   private List<CPacketPlayer> packets = new ArrayList();
   // $FF: synthetic field
   private int teleportID;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> sendListener;
   // $FF: synthetic field
   private int buffer;
   // $FF: synthetic field
   private static final int[] llllIllllIlI;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Receive> receiveListener;

   private static int lIlIIIIllIllII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int lIlIIIIllIlIll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private void move(double lllllllllllllllIlIlIIIlIllIlllII, double lllllllllllllllIlIlIIIlIllIlIlIl, double lllllllllllllllIlIlIIIlIllIlIlII) {
      int lllllllllllllllIlIlIIIlIllIlIIll = new Position(Wrapper.getPlayer().field_70165_t + lllllllllllllllIlIlIIIlIllIlllII, Wrapper.getPlayer().field_70163_u + lllllllllllllllIlIlIIIlIllIlIlIl, Wrapper.getPlayer().field_70161_v + lllllllllllllllIlIlIIIlIllIlIlII, Wrapper.getPlayer().field_70122_E);
      lllllllllllllllIlIlIIIlIllIlIlll.packets.add(lllllllllllllllIlIlIIIlIllIlIIll);
      "".length();
      Wrapper.getPlayer().field_71174_a.func_147297_a(lllllllllllllllIlIlIIIlIllIlIIll);
      Exception lllllllllllllllIlIlIIIlIllIlIIlI = new Position(Wrapper.getPlayer().field_70165_t + lllllllllllllllIlIlIIIlIllIlllII, Wrapper.getPlayer().field_70163_u - 420.69D, Wrapper.getPlayer().field_70161_v + lllllllllllllllIlIlIIIlIllIlIlII, Wrapper.getPlayer().field_70122_E);
      lllllllllllllllIlIlIIIlIllIlIlll.packets.add(lllllllllllllllIlIlIIIlIllIlIIlI);
      "".length();
      Wrapper.getPlayer().field_71174_a.func_147297_a(lllllllllllllllIlIlIIIlIllIlIIlI);
      lllllllllllllllIlIlIIIlIllIlIlll.buffer += llllIllllIlI[3];
      lllllllllllllllIlIlIIIlIllIlIlll.teleportID += llllIllllIlI[3];
      Wrapper.getPlayer().field_71174_a.func_147297_a(new CPacketConfirmTeleport(lllllllllllllllIlIlIIIlIllIlIlll.teleportID));
   }

   public PacketFly() {
      lllllllllllllllIlIlIIIlIllllllII.buffer = llllIllllIlI[0];
      lllllllllllllllIlIlIIIlIllllllII.teleportID = llllIllllIlI[0];
      lllllllllllllllIlIlIIIlIllllllII.sendListener = new Listener((lllllllllllllllIlIlIIIlIlIllIIII) -> {
         if (lIlIIIIllIlIII(lllllllllllllllIlIlIIIlIlIllIIII.getPacket() instanceof CPacketPlayer) && lIlIIIIllIlIIl(lllllllllllllllIlIlIIIlIlIllIIII.getPacket() instanceof Position)) {
            lllllllllllllllIlIlIIIlIlIllIIII.cancel();
         }

         if (lIlIIIIllIlIII(lllllllllllllllIlIlIIIlIlIllIIII.getPacket() instanceof CPacketPlayer)) {
            CPacketPlayer lllllllllllllllIlIlIIIlIlIllIIlI = (CPacketPlayer)lllllllllllllllIlIlIIIlIlIllIIII.getPacket();
            if (lIlIIIIllIlIII(lllllllllllllllIlIlIIIlIlIlIllll.packets.contains(lllllllllllllllIlIlIIIlIlIllIIlI))) {
               lllllllllllllllIlIlIIIlIlIlIllll.packets.remove(lllllllllllllllIlIlIIIlIlIllIIlI);
               "".length();
               return;
            }

            lllllllllllllllIlIlIIIlIlIllIIII.cancel();
         }

      }, new Predicate[llllIllllIlI[0]]);
      lllllllllllllllIlIlIIIlIllllllII.receiveListener = new Listener((lllllllllllllllIlIlIIIlIlIlllIIl) -> {
         if (lIlIIIIllIlIII(lllllllllllllllIlIlIIIlIlIlllIIl.getPacket() instanceof SPacketPlayerPosLook) && lIlIIIIllIIlII(Wrapper.getPlayer()) && lIlIIIIllIlIII(Wrapper.getPlayer().func_70089_S()) && lIlIIIIllIlIII(Wrapper.getWorld().func_175667_e(new BlockPos(Wrapper.getPlayer().field_70165_t, Wrapper.getPlayer().field_70163_u, Wrapper.getPlayer().field_70161_v))) && lIlIIIIllIlIIl(Wrapper.getMinecraft().field_71462_r instanceof GuiDownloadTerrain)) {
            Exception lllllllllllllllIlIlIIIlIlIllIllI = (SPacketPlayerPosLook)lllllllllllllllIlIlIIIlIlIlllIIl.getPacket();
            if (lIlIIIIllIIlll(lllllllllllllllIlIlIIIlIlIlllIlI.teleportID)) {
               lllllllllllllllIlIlIIIlIlIlllIlI.teleportID = lllllllllllllllIlIlIIIlIlIllIllI.func_186965_f();
            }

            if (lIlIIIIllIllIl(lllllllllllllllIlIlIIIlIlIlllIlI.buffer) && lIlIIIIllIllIl(lllllllllllllllIlIlIIIlIlIlllIlI.teleportID)) {
               lllllllllllllllIlIlIIIlIlIlllIlI.buffer -= llllIllllIlI[3];
               lllllllllllllllIlIlIIIlIlIlllIIl.cancel();
            }
         }

      }, new Predicate[llllIllllIlI[0]]);
   }

   private static boolean lIlIIIIllIllIl(int var0) {
      return var0 > 0;
   }

   private static int lIlIIIIllIIlIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public void onUpdate() {
      if (lIlIIIIllIIlll(lllllllllllllllIlIlIIIlIlllIlIII.teleportID)) {
         long lllllllllllllllIlIlIIIlIlllIIllI = new Position(Wrapper.getPlayer().field_70165_t, Wrapper.getPlayer().field_70163_u - 420.69D, Wrapper.getPlayer().field_70161_v, Wrapper.getPlayer().field_70122_E);
         lllllllllllllllIlIlIIIlIlllIlIII.packets.add(lllllllllllllllIlIlIIIlIlllIIllI);
         "".length();
         Wrapper.getPlayer().field_71174_a.func_147297_a(lllllllllllllllIlIlIIIlIlllIIllI);
      } else {
         Wrapper.getPlayer().func_70016_h(0.0D, 0.0D, 0.0D);
         if (lIlIIIIllIlIII(Wrapper.getWorld().func_184144_a(Wrapper.getPlayer(), Wrapper.getPlayer().func_174813_aQ().func_72321_a(-0.0625D, 0.0D, -0.0625D)).isEmpty())) {
            long lllllllllllllllIlIlIIIlIlllIIllI = 0.0D;
            double var10000;
            if (lIlIIIIllIlIII(Wrapper.getMinecraft().field_71474_y.field_74314_A.func_151470_d())) {
               if (lIlIIIIllIlIIl(Wrapper.getPlayer().field_70173_aa % llllIllllIlI[1])) {
                  var10000 = -0.03999999910593033D;
                  "".length();
                  if (" ".length() << " ".length() == 0) {
                     return;
                  }
               } else {
                  var10000 = 0.06199999898672104D;
               }

               lllllllllllllllIlIlIIIlIlllIIllI = var10000;
               "".length();
               if ("   ".length() == 0) {
                  return;
               }
            } else if (lIlIIIIllIlIII(Wrapper.getMinecraft().field_71474_y.field_74311_E.func_151470_d())) {
               lllllllllllllllIlIlIIIlIlllIIllI = -0.062D;
               "".length();
               if ("   ".length() == 0) {
                  return;
               }
            } else {
               if (lIlIIIIllIlIII(Wrapper.getWorld().func_184144_a(Wrapper.getPlayer(), Wrapper.getPlayer().func_174813_aQ().func_72321_a(-0.0625D, -0.0625D, -0.0625D)).isEmpty())) {
                  if (lIlIIIIllIlIIl(Wrapper.getPlayer().field_70173_aa % llllIllllIlI[2])) {
                     var10000 = -0.03999999910593033D;
                     "".length();
                     if ((((92 ^ 65) << " ".length() ^ 23 ^ 6) & ((59 ^ 34) << (" ".length() << " ".length()) ^ 229 ^ 170 ^ -" ".length())) == " ".length() << " ".length()) {
                        return;
                     }
                  } else {
                     var10000 = 0.0D;
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) == "   ".length()) {
                        return;
                     }
                  }
               } else {
                  var10000 = 0.0D;
               }

               lllllllllllllllIlIlIIIlIlllIIllI = var10000;
            }

            double[] lllllllllllllllIlIlIIIlIlllIlIIl = lllllllllllllllIlIlIIIlIlllIlIII.getDirectionalSpeed(0.2D);
            if (lIlIIIIllIlIIl(Wrapper.getMinecraft().field_71474_y.field_74314_A.func_151470_d()) && lIlIIIIllIlIIl(Wrapper.getMinecraft().field_71474_y.field_74311_E.func_151470_d()) && lIlIIIIllIlIIl(Wrapper.getMinecraft().field_71474_y.field_74351_w.func_151470_d()) && lIlIIIIllIlIIl(Wrapper.getMinecraft().field_71474_y.field_74368_y.func_151470_d()) && lIlIIIIllIlIIl(Wrapper.getMinecraft().field_71474_y.field_74366_z.func_151470_d()) && !lIlIIIIllIlIII(Wrapper.getMinecraft().field_71474_y.field_74370_x.func_151470_d())) {
               if (lIlIIIIllIlIII(Wrapper.getWorld().func_184144_a(Wrapper.getPlayer(), Wrapper.getPlayer().func_174813_aQ().func_72321_a(-0.0625D, -0.0625D, -0.0625D)).isEmpty())) {
                  EntityPlayerSP var7 = Wrapper.getPlayer();
                  double var10002;
                  if (lIlIIIIllIlIIl(Wrapper.getPlayer().field_70173_aa % llllIllllIlI[5])) {
                     var10002 = 0.03999999910593033D;
                     "".length();
                     if (((6 ^ 29) << " ".length() & ~((163 ^ 184) << " ".length())) >= " ".length() << " ".length()) {
                        return;
                     }
                  } else {
                     var10002 = -0.03999999910593033D;
                  }

                  var7.func_70016_h(0.0D, var10002, 0.0D);
                  if (lIlIIIIllIlIIl(Wrapper.getPlayer().field_70173_aa % llllIllllIlI[5])) {
                     var10002 = 0.03999999910593033D;
                     "".length();
                     if ((" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length()))) != ((186 ^ 155) << " ".length() & ~((186 ^ 155) << " ".length()))) {
                        return;
                     }
                  } else {
                     var10002 = -0.03999999910593033D;
                  }

                  lllllllllllllllIlIlIIIlIlllIlIII.move(0.0D, var10002, 0.0D);
               }
            } else if (!lIlIIIIllIlIIl(lIlIIIIllIIlIl(lllllllllllllllIlIlIIIlIlllIlIIl[llllIllllIlI[0]], 0.0D)) || !lIlIIIIllIlIIl(lIlIIIIllIIlIl(lllllllllllllllIlIlIIIlIlllIIllI, 0.0D)) || lIlIIIIllIlIII(lIlIIIIllIIlIl(lllllllllllllllIlIlIIIlIlllIlIIl[llllIllllIlI[3]], 0.0D))) {
               int lllllllllllllllIlIlIIIlIlllIIlII;
               if (!lIlIIIIllIlIII(Wrapper.getPlayer().field_71158_b.field_78901_c) || lIlIIIIllIlIIl(lIlIIIIllIIllI(Wrapper.getPlayer().field_70702_br, 0.0F)) && !lIlIIIIllIlIII(lIlIIIIllIIllI(Wrapper.getPlayer().field_191988_bg, 0.0F))) {
                  if (lIlIIIIllIlIII(Wrapper.getPlayer().field_71158_b.field_78901_c)) {
                     Wrapper.getPlayer().func_70016_h(0.0D, 0.0D, 0.0D);
                     lllllllllllllllIlIlIIIlIlllIlIII.move(0.0D, 0.0D, 0.0D);
                     lllllllllllllllIlIlIIIlIlllIIlII = llllIllllIlI[0];

                     while(lIlIIIIllIlIlI(lllllllllllllllIlIlIIIlIlllIIlII, llllIllllIlI[4])) {
                        Wrapper.getPlayer().func_70016_h(0.0D, lllllllllllllllIlIlIIIlIlllIIllI * (double)lllllllllllllllIlIlIIIlIlllIIlII, 0.0D);
                        lllllllllllllllIlIlIIIlIlllIlIII.move(0.0D, lllllllllllllllIlIlIIIlIlllIIllI * (double)lllllllllllllllIlIlIIIlIlllIIlII, 0.0D);
                        ++lllllllllllllllIlIlIIIlIlllIIlII;
                        "".length();
                        if (((10 ^ 85 ^ (38 ^ 21) << " ".length()) & (83 + 3 - 56 + 123 ^ (195 ^ 198) << (34 ^ 39) ^ -" ".length())) > 0) {
                           return;
                        }
                     }

                     "".length();
                     if ((123 ^ 126) <= 0) {
                        return;
                     }
                  } else {
                     lllllllllllllllIlIlIIIlIlllIIlII = llllIllllIlI[0];

                     while(lIlIIIIllIlIlI(lllllllllllllllIlIlIIIlIlllIIlII, llllIllllIlI[5])) {
                        Wrapper.getPlayer().func_70016_h(lllllllllllllllIlIlIIIlIlllIlIIl[llllIllllIlI[0]] * (double)lllllllllllllllIlIlIIIlIlllIIlII, lllllllllllllllIlIlIIIlIlllIIllI * (double)lllllllllllllllIlIlIIIlIlllIIlII, lllllllllllllllIlIlIIIlIlllIlIIl[llllIllllIlI[3]] * (double)lllllllllllllllIlIlIIIlIlllIIlII);
                        lllllllllllllllIlIlIIIlIlllIlIII.move(lllllllllllllllIlIlIIIlIlllIlIIl[llllIllllIlI[0]] * (double)lllllllllllllllIlIlIIIlIlllIIlII, lllllllllllllllIlIlIIIlIlllIIllI * (double)lllllllllllllllIlIlIIIlIlllIIlII, lllllllllllllllIlIlIIIlIlllIlIIl[llllIllllIlI[3]] * (double)lllllllllllllllIlIlIIIlIlllIIlII);
                        ++lllllllllllllllIlIlIIIlIlllIIlII;
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) <= -" ".length()) {
                           return;
                        }
                     }

                     "".length();
                     if (null != null) {
                        return;
                     }
                  }
               } else {
                  Wrapper.getPlayer().func_70016_h(0.0D, 0.0D, 0.0D);
                  lllllllllllllllIlIlIIIlIlllIlIII.move(0.0D, 0.0D, 0.0D);
                  lllllllllllllllIlIlIIIlIlllIIlII = llllIllllIlI[0];

                  while(lIlIIIIllIlIlI(lllllllllllllllIlIlIIIlIlllIIlII, llllIllllIlI[4])) {
                     Wrapper.getPlayer().func_70016_h(0.0D, lllllllllllllllIlIlIIIlIlllIIllI * (double)lllllllllllllllIlIlIIIlIlllIIlII, 0.0D);
                     lllllllllllllllIlIlIIIlIlllIlIII.move(0.0D, lllllllllllllllIlIlIIIlIlllIIllI * (double)lllllllllllllllIlIlIIIlIlllIIlII, 0.0D);
                     ++lllllllllllllllIlIlIIIlIlllIIlII;
                     "".length();
                     if (" ".length() <= 0) {
                        return;
                     }
                  }

                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) == " ".length()) {
                     return;
                  }
               }
            }
         }

      }
   }

   private static boolean lIlIIIIllIlllI(int var0) {
      return var0 < 0;
   }

   private static int lIlIIIIllIIllI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static boolean lIlIIIIllIlIIl(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIIIIllIlIII(int var0) {
      return var0 != 0;
   }

   static {
      lIlIIIIllIIIll();
   }

   private static boolean lIlIIIIllIlIlI(int var0, int var1) {
      return var0 <= var1;
   }

   private static boolean lIlIIIIllIIlll(int var0) {
      return var0 <= 0;
   }

   public double[] getDirectionalSpeed(double lllllllllllllllIlIlIIIlIllIIIlII) {
      short lllllllllllllllIlIlIIIlIllIIIIll = Wrapper.getPlayer().field_71158_b.field_192832_b;
      float lllllllllllllllIlIlIIIlIllIIlIII = Wrapper.getPlayer().field_71158_b.field_78902_a;
      int lllllllllllllllIlIlIIIlIllIIIIIl = Wrapper.getPlayer().field_70126_B + (Wrapper.getPlayer().field_70177_z - Wrapper.getPlayer().field_70126_B) * Wrapper.getMinecraft().func_184121_ak();
      if (lIlIIIIllIlIII(lIlIIIIllIlIll(lllllllllllllllIlIlIIIlIllIIIIll, 0.0F))) {
         int var10001;
         if (lIlIIIIllIllIl(lIlIIIIllIlIll(lllllllllllllllIlIlIIIlIllIIlIII, 0.0F))) {
            if (lIlIIIIllIllIl(lIlIIIIllIlIll(lllllllllllllllIlIlIIIlIllIIIIll, 0.0F))) {
               var10001 = llllIllllIlI[6];
               "".length();
               if ((((79 ^ 64) << "   ".length() ^ 42 ^ 49) & ((119 ^ 72) << (" ".length() << " ".length()) ^ 81 + 132 - 150 + 96 ^ -" ".length())) != 0) {
                  return null;
               }
            } else {
               var10001 = llllIllllIlI[7];
            }

            lllllllllllllllIlIlIIIlIllIIIIIl += (float)var10001;
            "".length();
            if (-"   ".length() >= 0) {
               return null;
            }
         } else if (lIlIIIIllIlllI(lIlIIIIllIllII(lllllllllllllllIlIlIIIlIllIIlIII, 0.0F))) {
            if (lIlIIIIllIllIl(lIlIIIIllIlIll(lllllllllllllllIlIlIIIlIllIIIIll, 0.0F))) {
               var10001 = llllIllllIlI[7];
               "".length();
               if (null != null) {
                  return null;
               }
            } else {
               var10001 = llllIllllIlI[6];
            }

            lllllllllllllllIlIlIIIlIllIIIIIl += (float)var10001;
         }

         lllllllllllllllIlIlIIIlIllIIlIII = 0.0F;
         if (lIlIIIIllIllIl(lIlIIIIllIlIll(lllllllllllllllIlIlIIIlIllIIIIll, 0.0F))) {
            lllllllllllllllIlIlIIIlIllIIIIll = 1.0F;
            "".length();
            if (-(235 ^ 154 ^ 121 ^ 12) > 0) {
               return null;
            }
         } else if (lIlIIIIllIlllI(lIlIIIIllIllII(lllllllllllllllIlIlIIIlIllIIIIll, 0.0F))) {
            lllllllllllllllIlIlIIIlIllIIIIll = -1.0F;
         }
      }

      float lllllllllllllllIlIlIIIlIllIIIIII = (double)lllllllllllllllIlIlIIIlIllIIIIll * lllllllllllllllIlIlIIIlIllIIIlII * Math.cos(Math.toRadians((double)(lllllllllllllllIlIlIIIlIllIIIIIl + 90.0F))) + (double)lllllllllllllllIlIlIIIlIllIIlIII * lllllllllllllllIlIlIIIlIllIIIlII * Math.sin(Math.toRadians((double)(lllllllllllllllIlIlIIIlIllIIIIIl + 90.0F)));
      double lllllllllllllllIlIlIIIlIllIIIlIl = (double)lllllllllllllllIlIlIIIlIllIIIIll * lllllllllllllllIlIlIIIlIllIIIlII * Math.sin(Math.toRadians((double)(lllllllllllllllIlIlIIIlIllIIIIIl + 90.0F))) - (double)lllllllllllllllIlIlIIIlIllIIlIII * lllllllllllllllIlIlIIIlIllIIIlII * Math.cos(Math.toRadians((double)(lllllllllllllllIlIlIIIlIllIIIIIl + 90.0F)));
      double[] var10000 = new double[llllIllllIlI[5]];
      var10000[llllIllllIlI[0]] = lllllllllllllllIlIlIIIlIllIIIIII;
      var10000[llllIllllIlI[3]] = lllllllllllllllIlIlIIIlIllIIIlIl;
      return var10000;
   }

   private static boolean lIlIIIIllIIlII(Object var0) {
      return var0 != null;
   }

   private static void lIlIIIIllIIIll() {
      llllIllllIlI = new int[8];
      llllIllllIlI[0] = ((47 ^ 36) << (" ".length() << " ".length()) ^ 26 ^ 51) & ((67 ^ 106) << (" ".length() << " ".length()) ^ 6 + 14 - -114 + 27 ^ -" ".length());
      llllIllllIlI[1] = ((101 ^ 62) << " ".length() ^ 148 + 27 - -4 + 0) << (" ".length() << " ".length());
      llllIllllIlI[2] = " ".length() << (" ".length() << " ".length());
      llllIllllIlI[3] = " ".length();
      llllIllllIlI[4] = "   ".length();
      llllIllllIlI[5] = " ".length() << " ".length();
      llllIllllIlI[6] = -(39 ^ 20 ^ (99 ^ 108) << " ".length());
      llllIllllIlI[7] = " ".length() << " ".length() ^ 160 ^ 143;
   }

   public void onEnable() {
      lllllllllllllllIlIlIIIlIllllIlIl.buffer = llllIllllIlI[0];
      if (lIlIIIIllIIlII(Wrapper.getPlayer())) {
         boolean lllllllllllllllIlIlIIIlIlllllIII = llllIllllIlI[0];
         lllllllllllllllIlIlIIIlIllllIlIl.teleportID = llllIllllIlI[0];
         String lllllllllllllllIlIlIIIlIllllIIll = new Position(Wrapper.getPlayer().field_70165_t, Wrapper.getPlayer().field_70163_u - 420.69D, Wrapper.getPlayer().field_70161_v, Wrapper.getPlayer().field_70122_E);
         lllllllllllllllIlIlIIIlIllllIlIl.packets.add(lllllllllllllllIlIlIIIlIllllIIll);
         "".length();
         Wrapper.getPlayer().field_71174_a.func_147297_a(lllllllllllllllIlIlIIIlIllllIIll);
      }

      super.onEnable();
   }
}
