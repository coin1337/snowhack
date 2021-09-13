package rr.snowhack.snow.mixin.client;

import net.minecraft.entity.passive.EntityPig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import rr.snowhack.snow.module.ModuleManager;

@Mixin({EntityPig.class})
public class MixinEntityPig {
   @Inject(
      method = {"canBeSteered"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void canBeSteered(CallbackInfoReturnable returnable) {
      if (ModuleManager.isModuleEnabled("EntitySpeed") || ModuleManager.isModuleEnabled("EntityRide")) {
         returnable.setReturnValue(true);
      }

   }
}
