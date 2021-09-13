package rr.snowhack.snow.mixin.client;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.module.modules.client.CleanGUI;

@Mixin({GuiNewChat.class})
public abstract class MixinGuiNewChat {
   @Redirect(
      method = {"drawChat"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/client/gui/GuiNewChat;drawRect(IIIII)V"
)
   )
   private void drawRectBackgroundClean(int left, int top, int right, int bottom, int color) {
      if (!ModuleManager.getModuleByName("CleanGUI").isEnabled() || ModuleManager.getModuleByName("CleanGUI").isEnabled() && !(Boolean)CleanGUI.chat.getValue()) {
         Gui.func_73734_a(left, top, right, bottom, color);
      }

   }
}
