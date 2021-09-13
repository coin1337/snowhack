package rr.snowhack.snow.event.events;

import net.minecraft.entity.Entity;
import rr.snowhack.snow.event.SnowEvent;

public class EntityEvent extends SnowEvent {
   // $FF: synthetic field
   private Entity entity;

   public Entity getEntity() {
      return lllllllllllllllIIlllllllIIIIlllI.entity;
   }

   public EntityEvent(Entity lllllllllllllllIIlllllllIIIlIIIl) {
      lllllllllllllllIIlllllllIIIlIlII.entity = lllllllllllllllIIlllllllIIIlIIIl;
   }

   public static class EntityCollision extends EntityEvent {
      // $FF: synthetic field
      double z;
      // $FF: synthetic field
      double x;
      // $FF: synthetic field
      double y;

      public double getX() {
         return lllllllllllllllIlIlIllllIllllIlI.x;
      }

      public void setY(double lllllllllllllllIlIlIllllIllIlIlI) {
         lllllllllllllllIlIlIllllIllIlIIl.y = lllllllllllllllIlIlIllllIllIlIlI;
      }

      public void setX(double lllllllllllllllIlIlIllllIllIlllI) {
         lllllllllllllllIlIlIllllIlllIIIl.x = lllllllllllllllIlIlIllllIllIlllI;
      }

      public double getZ() {
         return lllllllllllllllIlIlIllllIlllIlII.z;
      }

      public void setZ(double lllllllllllllllIlIlIllllIllIIlII) {
         lllllllllllllllIlIlIllllIllIIIll.z = lllllllllllllllIlIlIllllIllIIlII;
      }

      public double getY() {
         return lllllllllllllllIlIlIllllIlllIlll.y;
      }

      public EntityCollision(Entity lllllllllllllllIlIlIlllllIIIIlIl, double lllllllllllllllIlIlIllllIlllllll, double lllllllllllllllIlIlIllllIllllllI, double lllllllllllllllIlIlIllllIlllllIl) {
         super(lllllllllllllllIlIlIlllllIIIIlIl);
         lllllllllllllllIlIlIlllllIIIIIIl.x = lllllllllllllllIlIlIllllIlllllll;
         lllllllllllllllIlIlIlllllIIIIIIl.y = lllllllllllllllIlIlIllllIllllllI;
         lllllllllllllllIlIlIlllllIIIIIIl.z = lllllllllllllllIlIlIllllIlllllIl;
      }
   }
}
