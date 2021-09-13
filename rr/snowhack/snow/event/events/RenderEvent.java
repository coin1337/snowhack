package rr.snowhack.snow.event.events;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.math.Vec3d;
import rr.snowhack.snow.event.SnowEvent;

public class RenderEvent extends SnowEvent {
   // $FF: synthetic field
   private final Tessellator tessellator;
   // $FF: synthetic field
   private final Vec3d renderPos;

   public Vec3d getRenderPos() {
      return lllllllllllllllIlIIlIIIlIlllllll.renderPos;
   }

   public void setTranslation(Vec3d lllllllllllllllIlIIlIIIlIllllIIl) {
      lllllllllllllllIlIIlIIIlIllllIlI.getBuffer().func_178969_c(-lllllllllllllllIlIIlIIIlIllllIIl.field_72450_a, -lllllllllllllllIlIIlIIIlIllllIIl.field_72448_b, -lllllllllllllllIlIIlIIIlIllllIIl.field_72449_c);
   }

   public RenderEvent(Tessellator lllllllllllllllIlIIlIIIllIIIlIIl, Vec3d lllllllllllllllIlIIlIIIllIIIlIII) {
      lllllllllllllllIlIIlIIIllIIIllIl.tessellator = lllllllllllllllIlIIlIIIllIIIlIIl;
      lllllllllllllllIlIIlIIIllIIIllIl.renderPos = lllllllllllllllIlIIlIIIllIIIlIII;
   }

   public Tessellator getTessellator() {
      return lllllllllllllllIlIIlIIIllIIIIlIl.tessellator;
   }

   public BufferBuilder getBuffer() {
      return lllllllllllllllIlIIlIIIllIIIIIll.tessellator.func_178180_c();
   }

   public void resetTranslation() {
      lllllllllllllllIlIIlIIIlIlllIllI.setTranslation(lllllllllllllllIlIIlIIIlIlllIllI.renderPos);
   }
}
