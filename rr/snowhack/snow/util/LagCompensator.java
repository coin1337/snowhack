package rr.snowhack.snow.util;

import java.util.Arrays;
import java.util.EventListener;
import java.util.function.Predicate;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.network.play.server.SPacketTimeUpdate;
import net.minecraft.util.math.MathHelper;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.event.events.PacketEvent;

public class LagCompensator implements EventListener {
   // $FF: synthetic field
   public static LagCompensator INSTANCE;
   // $FF: synthetic field
   @EventHandler
   Listener<PacketEvent.Receive> packetEventListener;
   // $FF: synthetic field
   private static final int[] llllIlIlIlIl;
   // $FF: synthetic field
   private int nextIndex;
   // $FF: synthetic field
   private long timeLastTimeUpdate;
   // $FF: synthetic field
   private final float[] tickRates;

   public float getTickRate() {
      short lllllllllllllllIlIlIIllllIIIIIlI = 0.0F;
      float lllllllllllllllIlIlIIllllIIIIlII = 0.0F;
      double lllllllllllllllIlIlIIllllIIIIIII = lllllllllllllllIlIlIIllllIIIIllI.tickRates;
      long lllllllllllllllIlIlIIlllIlllllll = lllllllllllllllIlIlIIllllIIIIIII.length;
      int lllllllllllllllIlIlIIlllIllllllI = llllIlIlIlIl[1];

      do {
         if (!lIlIIIIIIIlIll(lllllllllllllllIlIlIIlllIllllllI, lllllllllllllllIlIlIIlllIlllllll)) {
            return MathHelper.func_76131_a(lllllllllllllllIlIlIIllllIIIIlII / lllllllllllllllIlIlIIllllIIIIIlI, 0.0F, 20.0F);
         }

         float lllllllllllllllIlIlIIlllIlllllIl = lllllllllllllllIlIlIIllllIIIIIII[lllllllllllllllIlIlIIlllIllllllI];
         if (lIlIIIIIIIllII(lIlIIIIIIIlIlI(lllllllllllllllIlIlIIlllIlllllIl, 0.0F))) {
            lllllllllllllllIlIlIIllllIIIIlII += lllllllllllllllIlIlIIlllIlllllIl;
            ++lllllllllllllllIlIlIIllllIIIIIlI;
         }

         ++lllllllllllllllIlIlIIlllIllllllI;
         "".length();
      } while(-" ".length() <= " ".length() << (" ".length() << " ".length()));

      return 0.0F;
   }

   public void onTimeUpdate() {
      if (lIlIIIIIIIlllI(lIlIIIIIIIllIl(lllllllllllllllIlIlIIlllIllllIIl.timeLastTimeUpdate, -1L))) {
         float lllllllllllllllIlIlIIlllIllllIlI = (float)(System.currentTimeMillis() - lllllllllllllllIlIlIIlllIllllIIl.timeLastTimeUpdate) / 1000.0F;
         lllllllllllllllIlIlIIlllIllllIIl.tickRates[lllllllllllllllIlIlIIlllIllllIIl.nextIndex % lllllllllllllllIlIlIIlllIllllIIl.tickRates.length] = MathHelper.func_76131_a(20.0F / lllllllllllllllIlIlIIlllIllllIlI, 0.0F, 20.0F);
         lllllllllllllllIlIlIIlllIllllIIl.nextIndex += llllIlIlIlIl[2];
      }

      lllllllllllllllIlIlIIlllIllllIIl.timeLastTimeUpdate = System.currentTimeMillis();
   }

   private static boolean lIlIIIIIIIlIll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIIIIIIllII(int var0) {
      return var0 > 0;
   }

   static {
      lIlIIIIIIIlIIl();
   }

   private static void lIlIIIIIIIlIIl() {
      llllIlIlIlIl = new int[3];
      llllIlIlIlIl[0] = (93 + 5 - -18 + 23 ^ (211 ^ 148) << " ".length()) << (" ".length() << " ".length());
      llllIlIlIlIl[1] = (61 ^ 4) & ~(61 ^ 4);
      llllIlIlIlIl[2] = " ".length();
   }

   private static int lIlIIIIIIIllIl(long var0, long var2) {
      long var4;
      return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
   }

   public void reset() {
      lllllllllllllllIlIlIIllllIIlIIII.nextIndex = llllIlIlIlIl[1];
      lllllllllllllllIlIlIIllllIIlIIII.timeLastTimeUpdate = -1L;
      Arrays.fill(lllllllllllllllIlIlIIllllIIlIIII.tickRates, 0.0F);
   }

   public LagCompensator() {
      lllllllllllllllIlIlIIllllIIlIIll.tickRates = new float[llllIlIlIlIl[0]];
      lllllllllllllllIlIlIIllllIIlIIll.nextIndex = llllIlIlIlIl[1];
      lllllllllllllllIlIlIIllllIIlIIll.packetEventListener = new Listener((lllllllllllllllIlIlIIlllIlllIlIl) -> {
         if (lIlIIIIIIIlllI(lllllllllllllllIlIlIIlllIlllIlIl.getPacket() instanceof SPacketTimeUpdate)) {
            INSTANCE.onTimeUpdate();
         }

      }, new Predicate[llllIlIlIlIl[1]]);
      SnowMod.EVENT_BUS.subscribe((Object)lllllllllllllllIlIlIIllllIIlIIll);
      lllllllllllllllIlIlIIllllIIlIIll.reset();
   }

   private static boolean lIlIIIIIIIlllI(int var0) {
      return var0 != 0;
   }

   private static int lIlIIIIIIIlIlI(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
