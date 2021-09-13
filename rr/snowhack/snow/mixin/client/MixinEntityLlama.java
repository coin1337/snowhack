package rr.snowhack.snow.mixin.client;

import net.minecraft.entity.passive.EntityLlama;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rr.snowhack.snow.module.ModuleManager;

@Mixin({EntityLlama.class})
public class MixinEntityLlama {
   @Inject(
      method = {"canBeSteered"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void canBeSteered(CallbackInfoReturnable<Boolean> returnable) {
      if (ModuleManager.isModuleEnabled("EntitySpeed") || ModuleManager.isModuleEnabled("EntityRide")) {
         returnable.setReturnValue(true);
      }

   }
}
