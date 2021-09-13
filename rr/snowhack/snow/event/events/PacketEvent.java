package rr.snowhack.snow.event.events;

import net.minecraft.network.Packet;
import rr.snowhack.snow.event.SnowEvent;

public class PacketEvent extends SnowEvent {
   // $FF: synthetic field
   private final Packet packet;

   public Packet getPacket() {
      return lllllllllllllllIIlllIIIIlIIIlIII.packet;
   }

   public PacketEvent(Packet lllllllllllllllIIlllIIIIlIIIlIlI) {
      lllllllllllllllIIlllIIIIlIIIllIl.packet = lllllllllllllllIIlllIIIIlIIIlIlI;
   }

   public static class Receive extends PacketEvent {
      public Receive(Packet lllllllllllllllIlIlllIllIllIIlIl) {
         super(lllllllllllllllIlIlllIllIllIIlIl);
      }
   }

   public static class Send extends PacketEvent {
      public Send(Packet lllllllllllllllIlIIlIIlIlIllIIll) {
         super(lllllllllllllllIlIIlIIlIlIllIIll);
      }
   }
}
