package rr.snowhack.snow.event.events;

import net.minecraft.entity.player.EntityPlayer;
import rr.snowhack.snow.event.SnowEvent;

public class PlayerLeaveEvent extends SnowEvent {
   // $FF: synthetic field
   private EntityPlayer player;

   public PlayerLeaveEvent(EntityPlayer lllllllllllllllIlIllIIIIlllIlIll) {
      lllllllllllllllIlIllIIIIlllIllII.player = lllllllllllllllIlIllIIIIlllIlIll;
   }

   public String getName() {
      return lllllllllllllllIlIllIIIIlllIlIIl.player.func_70005_c_();
   }
}
