package rr.snowhack.snow.module.modules.render;

import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.util.GeometryMasks;
import rr.snowhack.snow.util.HueCycler;
import rr.snowhack.snow.util.SnowTessellator;
import rr.snowhack.snow.util.TrajectoryCalculator;

@Module.Info(
   name = "Trajectories",
   category = Module.Category.RENDER
)
public class Trajectories extends Module {
   // $FF: synthetic field
   ArrayList<Vec3d> positions = new ArrayList();
   // $FF: synthetic field
   HueCycler cycler;
   // $FF: synthetic field
   private static final int[] lIIIIllIIlIII;

   static {
      lIlIllIIIIlIlI();
   }

   private static boolean lIlIllIIIIlllI(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIllIIIIllll(Object var0) {
      return var0 == null;
   }

   private static boolean lIlIllIIIIllII(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIllIIIIllIl(Object var0) {
      return var0 != null;
   }

   public void onWorldRender(RenderEvent lllllllllllllllIIlllllIIlIlIlIIl) {
      try {
         mc.field_71441_e.field_72996_f.stream().filter((lllllllllllllllIIlllllIIlIIIlIll) -> {
            return lllllllllllllllIIlllllIIlIIIlIll instanceof EntityLivingBase;
         }).map((lllllllllllllllIIlllllIIlIIIllIl) -> {
            return (EntityLivingBase)lllllllllllllllIIlllllIIlIIIllIl;
         }).forEach((lllllllllllllllIIlllllIIlIIlIllI) -> {
            lllllllllllllllIIlllllIIlIIlIlll.positions.clear();
            int lllllllllllllllIIlllllIIlIIlIlIl = TrajectoryCalculator.getThrowType(lllllllllllllllIIlllllIIlIIlIllI);
            if (!lIlIllIIIIlIll(lllllllllllllllIIlllllIIlIIlIlIl, TrajectoryCalculator.ThrowingType.NONE)) {
               TrajectoryCalculator.FlightPath lllllllllllllllIIlllllIIlIIllIlI = new TrajectoryCalculator.FlightPath(lllllllllllllllIIlllllIIlIIlIllI, lllllllllllllllIIlllllIIlIIlIlIl);

               do {
                  if (!lIlIllIIIIllII(lllllllllllllllIIlllllIIlIIllIlI.isCollided())) {
                     char lllllllllllllllIIlllllIIlIIlIIll = null;
                     if (lIlIllIIIIllIl(lllllllllllllllIIlllllIIlIIllIlI.getCollidingTarget())) {
                        lllllllllllllllIIlllllIIlIIlIIll = lllllllllllllllIIlllllIIlIIllIlI.getCollidingTarget().func_178782_a();
                     }

                     GL11.glEnable(lIIIIllIIlIII[1]);
                     GL11.glDisable(lIIIIllIIlIII[2]);
                     GL11.glDisable(lIIIIllIIlIII[3]);
                     GL11.glDisable(lIIIIllIIlIII[4]);
                     if (lIlIllIIIIllIl(lllllllllllllllIIlllllIIlIIlIIll)) {
                        SnowTessellator.prepare(lIIIIllIIlIII[5]);
                        SnowTessellator.drawBox(lllllllllllllllIIlllllIIlIIlIIll, lIIIIllIIlIII[6], (Integer)GeometryMasks.FACEMAP.get(lllllllllllllllIIlllllIIlIIllIlI.getCollidingTarget().field_178784_b));
                        SnowTessellator.release();
                     }

                     if (lIlIllIIIIlllI(lllllllllllllllIIlllllIIlIIlIlll.positions.isEmpty())) {
                        return;
                     }

                     GL11.glDisable(lIIIIllIIlIII[1]);
                     GL11.glDisable(lIIIIllIIlIII[2]);
                     GL11.glDisable(lIIIIllIIlIII[3]);
                     GL11.glEnable(lIIIIllIIlIII[7]);
                     GL11.glLineWidth(2.0F);
                     if (lIlIllIIIIllIl(lllllllllllllllIIlllllIIlIIlIIll)) {
                        GL11.glColor3f(0.3F, 0.6F, 0.9F);
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) < (((65 ^ 108) << " ".length() ^ 15 ^ 82) & ((23 ^ 28) << (" ".length() << (" ".length() << " ".length())) ^ 150 + 37 - 37 + 33 ^ -" ".length()))) {
                           return;
                        }
                     } else {
                        lllllllllllllllIIlllllIIlIIlIlll.cycler.setNext();
                     }

                     GL11.glBegin(lIIIIllIIlIII[8]);
                     float lllllllllllllllIIlllllIIlIIlIIlI = (Vec3d)lllllllllllllllIIlllllIIlIIlIlll.positions.get(lIIIIllIIlIII[9]);
                     GL11.glVertex3d(lllllllllllllllIIlllllIIlIIlIIlI.field_72450_a - mc.func_175598_ae().field_78725_b, lllllllllllllllIIlllllIIlIIlIIlI.field_72448_b - mc.func_175598_ae().field_78726_c, lllllllllllllllIIlllllIIlIIlIIlI.field_72449_c - mc.func_175598_ae().field_78723_d);
                     Iterator lllllllllllllllIIlllllIIlIIlIIIl = lllllllllllllllIIlllllIIlIIlIlll.positions.iterator();

                     do {
                        if (!lIlIllIIIIlllI(lllllllllllllllIIlllllIIlIIlIIIl.hasNext())) {
                           GL11.glEnd();
                           GL11.glDisable(lIIIIllIIlIII[7]);
                           GL11.glEnable(lIIIIllIIlIII[1]);
                           GL11.glEnable(lIIIIllIIlIII[2]);
                           lllllllllllllllIIlllllIIlIIlIlll.cycler.reset();
                           return;
                        }

                        Vec3d lllllllllllllllIIlllllIIlIIllllI = (Vec3d)lllllllllllllllIIlllllIIlIIlIIIl.next();
                        GL11.glVertex3d(lllllllllllllllIIlllllIIlIIllllI.field_72450_a - mc.func_175598_ae().field_78725_b, lllllllllllllllIIlllllIIlIIllllI.field_72448_b - mc.func_175598_ae().field_78726_c, lllllllllllllllIIlllllIIlIIllllI.field_72449_c - mc.func_175598_ae().field_78723_d);
                        GL11.glVertex3d(lllllllllllllllIIlllllIIlIIllllI.field_72450_a - mc.func_175598_ae().field_78725_b, lllllllllllllllIIlllllIIlIIllllI.field_72448_b - mc.func_175598_ae().field_78726_c, lllllllllllllllIIlllllIIlIIllllI.field_72449_c - mc.func_175598_ae().field_78723_d);
                        if (lIlIllIIIIllll(lllllllllllllllIIlllllIIlIIlIIll)) {
                           lllllllllllllllIIlllllIIlIIlIlll.cycler.setNext();
                        }

                        "".length();
                     } while("   ".length() >= 0);

                     return;
                  }

                  lllllllllllllllIIlllllIIlIIllIlI.onUpdate();
                  lllllllllllllllIIlllllIIlIIlIlll.positions.add(lllllllllllllllIIlllllIIlIIllIlI.position);
                  "".length();
                  "".length();
               } while(((25 ^ 12 ^ (39 ^ 32) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((119 ^ 32) << " ".length() ^ 24 + 107 - -30 + 6) << (" ".length() << " ".length()) ^ -" ".length())) >= 0);

            }
         });
      } catch (Exception var4) {
         var4.printStackTrace();
         return;
      }

      "".length();
      if (-" ".length() <= "   ".length()) {
         ;
      }
   }

   public Trajectories() {
      lllllllllllllllIIlllllIIlIlIllll.cycler = new HueCycler(lIIIIllIIlIII[0]);
   }

   private static void lIlIllIIIIlIlI() {
      lIIIIllIIlIII = new int[10];
      lIIIIllIIlIII[0] = ((81 ^ 92) << (" ".length() << " ".length()) ^ 149 ^ 184) << (" ".length() << " ".length());
      lIIIIllIIlIII[1] = 1111 + 465 - 98 + 43 << " ".length();
      lIIIIllIIlIII[2] = (154 + 404 - 186 + 145 << (" ".length() << " ".length())) + (545 + 428 - 277 + 915 << " ".length()) - (1965 + 3946 - 4819 + 3641) + (201 + 694 - 855 + 709 << (" ".length() << " ".length()));
      lIIIIllIIlIII[3] = (186 ^ 195) + (21 ^ 120) - ((54 ^ 17) << " ".length()) + (117 ^ 104) << (" ".length() << (" ".length() << " ".length()));
      lIIIIllIIlIII[4] = 2106 + 729 - 1612 + 1046 + (1223 + 884 - 1196 + 548 << " ".length()) - (1773 + 3380 - 5088 + 3934) + 1227 + 595 - 1238 + 1157;
      lIIIIllIIlIII[5] = 0 ^ 95 ^ (48 ^ 59) << "   ".length();
      lIIIIllIIlIII[6] = -(55395492 + 287290901 - 326925031 + 432137801);
      lIIIIllIIlIII[7] = (18 + 81 - 15 + 131 ^ (34 ^ 101) << " ".length()) << (" ".length() << (" ".length() << " ".length()) ^ " ".length());
      lIIIIllIIlIII[8] = " ".length();
      lIIIIllIIlIII[9] = (52 ^ 95 ^ (105 ^ 66) << " ".length()) & (237 ^ 176 ^ "   ".length() << (11 ^ 14) ^ -" ".length());
   }

   private static boolean lIlIllIIIIlIll(Object var0, Object var1) {
      return var0 == var1;
   }
}
