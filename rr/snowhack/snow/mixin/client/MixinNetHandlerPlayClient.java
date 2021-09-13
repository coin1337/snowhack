package rr.snowhack.snow.mixin.client;

import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.network.play.server.SPacketChunkData;
import net.minecraft.world.chunk.Chunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.event.events.ChunkEvent;

@Mixin({NetHandlerPlayClient.class})
public class MixinNetHandlerPlayClient {
   @Inject(
      method = {"handleChunkData"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/world/chunk/Chunk;read(Lnet/minecraft/network/PacketBuffer;IZ)V"
)},
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void read(SPacketChunkData data, CallbackInfo info, Chunk chunk) {
      SnowMod.EVENT_BUS.post(new ChunkEvent(chunk, data));
   }
}
