package rr.snowhack.snow.event.events;

import net.minecraft.entity.MoverType;
import rr.snowhack.snow.event.SnowEvent;

public class PlayerMoveEvent extends SnowEvent {
   // $FF: synthetic field
   private double z;
   // $FF: synthetic field
   private MoverType type;
   // $FF: synthetic field
   private double y;
   // $FF: synthetic field
   private double x;

   public MoverType getType() {
      return lllllllllllllllIlIIllIlllIIIIlIl.type;
   }

   public void setY(double lllllllllllllllIlIIllIllIllIlIIl) {
      lllllllllllllllIlIIllIllIllIllII.y = lllllllllllllllIlIIllIllIllIlIIl;
   }

   public double getY() {
      return lllllllllllllllIlIIllIllIllllIII.y;
   }

   public void setX(double lllllllllllllllIlIIllIllIllIllll) {
      lllllllllllllllIlIIllIllIlllIIlI.x = lllllllllllllllIlIIllIllIllIllll;
   }

   public void setType(MoverType lllllllllllllllIlIIllIllIllllllI) {
      lllllllllllllllIlIIllIlllIIIIIIl.type = lllllllllllllllIlIIllIllIllllllI;
   }

   public double getX() {
      return lllllllllllllllIlIIllIllIlllllII.x;
   }

   public PlayerMoveEvent(MoverType lllllllllllllllIlIIllIlllIIIllll, double lllllllllllllllIlIIllIlllIIIlIIl, double lllllllllllllllIlIIllIlllIIIllIl, double lllllllllllllllIlIIllIlllIIIllII) {
      lllllllllllllllIlIIllIlllIIIlIll.type = lllllllllllllllIlIIllIlllIIIllll;
      lllllllllllllllIlIIllIlllIIIlIll.x = lllllllllllllllIlIIllIlllIIIlIIl;
      lllllllllllllllIlIIllIlllIIIlIll.y = lllllllllllllllIlIIllIlllIIIllIl;
      lllllllllllllllIlIIllIlllIIIlIll.z = lllllllllllllllIlIIllIlllIIIllII;
   }

   public double getZ() {
      return lllllllllllllllIlIIllIllIlllIlIl.z;
   }

   public void setZ(double lllllllllllllllIlIIllIllIllIIIll) {
      lllllllllllllllIlIIllIllIllIIllI.z = lllllllllllllllIlIIllIllIllIIIll;
   }
}
