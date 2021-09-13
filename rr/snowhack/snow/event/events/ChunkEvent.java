package rr.snowhack.snow.event.events;

import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.world.chunk.Chunk;
import rr.snowhack.snow.event.SnowEvent;

public class ChunkEvent extends SnowEvent {
   // $FF: synthetic field
   private SPacketChunkData packet;
   // $FF: synthetic field
   private Chunk chunk;

   public SPacketChunkData getPacket() {
      return lllllllllllllllIlIIlIlllIlIIlIll.packet;
   }

   public Chunk getChunk() {
      return lllllllllllllllIlIIlIlllIlIIlllI.chunk;
   }

   public ChunkEvent(Chunk lllllllllllllllIlIIlIlllIlIlIIlI, SPacketChunkData lllllllllllllllIlIIlIlllIlIlIlII) {
      lllllllllllllllIlIIlIlllIlIlIIll.chunk = lllllllllllllllIlIIlIlllIlIlIIlI;
      lllllllllllllllIlIIlIlllIlIlIIll.packet = lllllllllllllllIlIIlIlllIlIlIlII;
   }
}
