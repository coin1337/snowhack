package rr.snowhack.snow.mixin.client;

import net.minecraft.entity.passive.AbstractHorse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rr.snowhack.snow.module.ModuleManager;

@Mixin(
   value = {AbstractHorse.class},
   priority = 9999
)
public class MixinAbstractHorse {
   @Inject(
      method = {"isHorseSaddled"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void isHorseSaddled(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
      if (ModuleManager.isModuleEnabled("EntityRide") || ModuleManager.isModuleEnabled("EntitySpeed")) {
         callbackInfoReturnable.setReturnValue(true);
      }

   }
}
