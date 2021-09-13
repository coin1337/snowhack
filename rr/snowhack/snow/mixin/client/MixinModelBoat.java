package rr.snowhack.snow.mixin.client;

import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.module.modules.movement.EntitySpeed;
import rr.snowhack.snow.util.Wrapper;

@Mixin({ModelBoat.class})
public class MixinModelBoat {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale, CallbackInfo info) {
      if (Wrapper.getPlayer().func_184187_bx() == entityIn && ModuleManager.isModuleEnabled("EntitySpeed")) {
         GlStateManager.func_179131_c(1.0F, 1.0F, 1.0F, EntitySpeed.getOpacity());
         GlStateManager.func_179147_l();
      }

   }
}
