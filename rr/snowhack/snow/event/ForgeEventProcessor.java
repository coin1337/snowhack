package rr.snowhack.snow.event;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiShulkerBox;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.PlayerSPPushOutOfBlocksEvent;
import net.minecraftforge.client.event.RenderBlockOverlayEvent;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;
import net.minecraftforge.client.event.RenderPlayerEvent.Post;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent.Start;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.LeftClickBlock;
import net.minecraftforge.event.world.ChunkEvent.Load;
import net.minecraftforge.event.world.ChunkEvent.Unload;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.commands.PeekCommand;
import rr.snowhack.snow.event.events.DisplaySizeChangedEvent;
import rr.snowhack.snow.gui.UIRenderer;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.module.modules.render.BossStack;
import rr.snowhack.snow.util.SnowTessellator;
import rr.snowhack.snow.util.Wrapper;

public class ForgeEventProcessor {
   // $FF: synthetic field
   private int displayHeight;
   // $FF: synthetic field
   private static final String[] lIIIlIIIlIIll;
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private int displayWidth;
   // $FF: synthetic field
   private static final int[] lIIIlIIIlIllI;

   @SubscribeEvent
   public void onWorldRender(RenderWorldLastEvent lllllllllllllllIIlllIlIllIIIllII) {
      if (!lIlIlllIlllIlI(lllllllllllllllIIlllIlIllIIIllII.isCanceled())) {
         ModuleManager.onWorldRender(lllllllllllllllIIlllIlIllIIIllII);
      }
   }

   private static boolean lIlIlllIllllIl(Object var0) {
      return var0 != null;
   }

   @SubscribeEvent
   public void onRenderBlockOverlay(RenderBlockOverlayEvent lllllllllllllllIIlllIlIlIlIIIlll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlIIIlll);
   }

   private static void lIlIlllIlllIIl() {
      lIIIlIIIlIllI = new int[9];
      lIIIlIIIlIllI[0] = (56 ^ 33) & ~(13 ^ 20);
      lIIIlIIIlIllI[1] = " ".length();
      lIIIlIIIlIllI[2] = " ".length() << " ".length();
      lIIIlIIIlIllI[3] = "   ".length();
      lIIIlIIIlIllI[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIIIlIllI[5] = 7 ^ 2;
      lIIIlIIIlIllI[6] = "   ".length() << " ".length();
      lIIIlIIIlIllI[7] = (94 ^ 75) << " ".length() ^ 137 ^ 164;
      lIIIlIIIlIllI[8] = " ".length() << "   ".length();
   }

   private static boolean lIlIlllIlllIll(int var0, int var1) {
      return var0 == var1;
   }

   private static boolean lIlIlllIlllllI(Object var0) {
      return var0 == null;
   }

   @SubscribeEvent
   public void onLivingDamageEvent(LivingDamageEvent lllllllllllllllIIlllIlIlIlIllIll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlIllIll);
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void onPlayerDrawn(Post lllllllllllllllIIlllIlIlIlllIIII) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlllIIII);
   }

   private static boolean lIlIlllIllllII(int var0, int var1) {
      return var0 != var1;
   }

   @SubscribeEvent
   public void onUpdate(LivingUpdateEvent lllllllllllllllIIlllIlIllIIlIlll) {
      if (!lIlIlllIlllIlI(lllllllllllllllIIlllIlIllIIlIlll.isCanceled())) {
         if (!lIlIlllIlllIll(mc.field_71443_c, lllllllllllllllIIlllIlIllIIlIllI.displayWidth) || lIlIlllIllllII(mc.field_71440_d, lllllllllllllllIIlllIlIllIIlIllI.displayHeight)) {
            SnowMod.EVENT_BUS.post(new DisplaySizeChangedEvent());
            lllllllllllllllIIlllIlIllIIlIllI.displayWidth = mc.field_71443_c;
            lllllllllllllllIIlllIlIllIIlIllI.displayHeight = mc.field_71440_d;
            SnowMod.getInstance().getGuiManager().getChildren().stream().filter((lllllllllllllllIIlllIlIlIlIIIIlI) -> {
               return lllllllllllllllIIlllIlIlIlIIIIlI instanceof Frame;
            }).forEach((lllllllllllllllIIlllIlIlIlIIIlIl) -> {
               SnowGUI.dock((Frame)lllllllllllllllIIlllIlIlIlIIIlIl);
            });
         }

         if (lIlIlllIllllIl(PeekCommand.sb)) {
            String lllllllllllllllIIlllIlIllIIlIlII = new ScaledResolution(mc);
            int lllllllllllllllIIlllIlIllIIllIll = lllllllllllllllIIlllIlIllIIlIlII.func_78326_a();
            double lllllllllllllllIIlllIlIllIIlIIlI = lllllllllllllllIIlllIlIllIIlIlII.func_78328_b();
            GuiShulkerBox lllllllllllllllIIlllIlIllIIllIIl = new GuiShulkerBox(Wrapper.getPlayer().field_71071_by, PeekCommand.sb);
            lllllllllllllllIIlllIlIllIIllIIl.func_146280_a(Wrapper.getMinecraft(), lllllllllllllllIIlllIlIllIIllIll, lllllllllllllllIIlllIlIllIIlIIlI);
            mc.func_147108_a(lllllllllllllllIIlllIlIllIIllIIl);
            PeekCommand.sb = null;
         }

      }
   }

   @SubscribeEvent
   public void onPlayerPush(PlayerSPPushOutOfBlocksEvent lllllllllllllllIIlllIlIlIlIlIIll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlIlIIll);
   }

   @SubscribeEvent
   public void onRenderPre(Pre lllllllllllllllIIlllIlIllIIIIlll) {
      if (lIlIlllIllllll(lllllllllllllllIIlllIlIllIIIIlll.getType(), ElementType.BOSSINFO) && lIlIlllIlllIlI(ModuleManager.isModuleEnabled(lIIIlIIIlIIll[lIIIlIIIlIllI[0]]))) {
         lllllllllllllllIIlllIlIllIIIIlll.setCanceled((boolean)lIIIlIIIlIllI[1]);
      }

   }

   private static String lIlIlllIllIlIl(String lllllllllllllllIIlllIlIlIIlIllII, String lllllllllllllllIIlllIlIlIIlIlIll) {
      try {
         byte lllllllllllllllIIlllIlIlIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIllI[8]), "DES");
         short lllllllllllllllIIlllIlIlIIlIIlll = Cipher.getInstance("DES");
         lllllllllllllllIIlllIlIlIIlIIlll.init(lIIIlIIIlIllI[2], lllllllllllllllIIlllIlIlIIlIlIII);
         return new String(lllllllllllllllIIlllIlIlIIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void onPlayerDrawn(net.minecraftforge.client.event.RenderPlayerEvent.Pre lllllllllllllllIIlllIlIlIlllIlII) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlllIlII);
   }

   @SubscribeEvent
   public void onLeftClickBlock(LeftClickBlock lllllllllllllllIIlllIlIlIlIlIIII) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlIlIIII);
   }

   @SubscribeEvent
   public void onLivingEntityUseItemEventTick(Start lllllllllllllllIIlllIlIlIllIIIII) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIllIIIII);
   }

   @SubscribeEvent(
      priority = EventPriority.HIGHEST
   )
   public void onChatSent(ClientChatEvent lllllllllllllllIIlllIlIlIllllIII) {
      if (lIlIlllIlllIlI(lllllllllllllllIIlllIlIlIllllIII.getMessage().startsWith(Command.getCommandPrefix()))) {
         lllllllllllllllIIlllIlIlIllllIII.setCanceled((boolean)lIIIlIIIlIllI[1]);

         label22: {
            try {
               Wrapper.getMinecraft().field_71456_v.func_146158_b().func_146239_a(lllllllllllllllIIlllIlIlIllllIII.getMessage());
               if (lIlIllllIIIIIl(lllllllllllllllIIlllIlIlIllllIII.getMessage().length(), lIIIlIIIlIllI[1])) {
                  SnowMod.getInstance().commandManager.callCommand(lllllllllllllllIIlllIlIlIllllIII.getMessage().substring(Command.getCommandPrefix().length() - lIIIlIIIlIllI[1]));
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  Command.sendChatMessage(lIIIlIIIlIIll[lIIIlIIIlIllI[3]]);
               }
            } catch (Exception var3) {
               var3.printStackTrace();
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIIIlIIll[lIIIlIIIlIllI[4]]).append(var3.getMessage()).append(lIIIlIIIlIIll[lIIIlIIIlIllI[5]])));
               break label22;
            }

            "".length();
            if (((96 ^ 89) & ~(249 ^ 192)) >= " ".length() << " ".length()) {
               return;
            }
         }

         lllllllllllllllIIlllIlIlIllllIII.setMessage(lIIIlIIIlIIll[lIIIlIIIlIllI[6]]);
      }

   }

   private static boolean lIlIllllIIIIIl(int var0, int var1) {
      return var0 > var1;
   }

   @SubscribeEvent
   public void onTick(ClientTickEvent lllllllllllllllIIlllIlIllIIIllll) {
      if (!lIlIlllIlllllI(Wrapper.getPlayer())) {
         ModuleManager.onUpdate();
         SnowMod.getInstance().getGuiManager().callTick(SnowMod.getInstance().getGuiManager());
      }
   }

   private static boolean lIlIlllIllllll(Object var0, Object var1) {
      return var0 == var1;
   }

   @SubscribeEvent
   public void onAttackEntity(AttackEntityEvent lllllllllllllllIIlllIlIlIlIIlIll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlIIlIll);
   }

   static {
      lIlIlllIlllIIl();
      lIlIlllIlllIII();
      mc = Minecraft.func_71410_x();
   }

   @SubscribeEvent
   public void onChunkLoaded(Unload lllllllllllllllIIlllIlIlIllIlIII) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIllIlIII);
   }

   private static String lIlIlllIllIllI(String lllllllllllllllIIlllIlIlIIIlIlll, String lllllllllllllllIIlllIlIlIIIlIllI) {
      lllllllllllllllIIlllIlIlIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIlIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIlllIlIlIIIllIlI = new StringBuilder();
      Exception lllllllllllllllIIlllIlIlIIIlIlII = lllllllllllllllIIlllIlIlIIIlIllI.toCharArray();
      int lllllllllllllllIIlllIlIlIIIllIII = lIIIlIIIlIllI[0];
      int lllllllllllllllIIlllIlIlIIIlIIlI = lllllllllllllllIIlllIlIlIIIlIlll.toCharArray();
      Exception lllllllllllllllIIlllIlIlIIIlIIIl = lllllllllllllllIIlllIlIlIIIlIIlI.length;
      int lllllllllllllllIIlllIlIlIIIlIIII = lIIIlIIIlIllI[0];

      do {
         if (!lIlIllllIIIIlI(lllllllllllllllIIlllIlIlIIIlIIII, lllllllllllllllIIlllIlIlIIIlIIIl)) {
            return String.valueOf(lllllllllllllllIIlllIlIlIIIllIlI);
         }

         char lllllllllllllllIIlllIlIlIIIIllll = lllllllllllllllIIlllIlIlIIIlIIlI[lllllllllllllllIIlllIlIlIIIlIIII];
         lllllllllllllllIIlllIlIlIIIllIlI.append((char)(lllllllllllllllIIlllIlIlIIIIllll ^ lllllllllllllllIIlllIlIlIIIlIlII[lllllllllllllllIIlllIlIlIIIllIII % lllllllllllllllIIlllIlIlIIIlIlII.length]));
         "".length();
         ++lllllllllllllllIIlllIlIlIIIllIII;
         ++lllllllllllllllIIlllIlIlIIIlIIII;
         "".length();
      } while("   ".length() >= 0);

      return null;
   }

   @SubscribeEvent
   public void onInputUpdate(InputUpdateEvent lllllllllllllllIIlllIlIlIllIIIll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIllIIIll);
   }

   private static boolean lIlIllllIIIIII(int var0) {
      return var0 == 0;
   }

   private static void lIlIlllIlllIII() {
      lIIIlIIIlIIll = new String[lIIIlIIIlIllI[7]];
      lIIIlIIIlIIll[lIIIlIIIlIllI[0]] = lIlIlllIllIlIl("2dIr91MRPDBV2umhgp0GCw==", "OtssY");
      lIIIlIIIlIIll[lIIIlIIIlIllI[1]] = lIlIlllIllIllI("DigXCjo4JgcS", "LGdyi");
      lIIIlIIIlIIll[lIIIlIIIlIllI[2]] = lIlIlllIllIlll("aXiryXQQxBI=", "jwleL");
      lIIIlIIIlIIll[lIIIlIIIlIllI[3]] = lIlIlllIllIllI("JC0HEAQRYQcfAxEzQhBXFy4PHBYaJUw=", "tAbqw");
      lIIIlIIIlIIll[lIIIlIIIlIllI[4]] = lIlIlllIllIllI("MRQnKTFUCTYlNgYDMWY0HA85I2MGEzsoKhoBdSUsGQs0KCdVRn0=", "tfUFC");
      lIIIlIIIlIIll[lIIIlIIIlIllI[5]] = lIlIlllIllIllI("Tg==", "gdQaB");
      lIIIlIIIlIIll[lIIIlIIIlIllI[6]] = lIlIlllIllIllI("", "ZPBcI");
   }

   private static boolean lIlIllllIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   @SubscribeEvent(
      priority = EventPriority.NORMAL,
      receiveCanceled = true
   )
   public void onKeyInput(KeyInputEvent lllllllllllllllIIlllIlIlIllllllI) {
      if (!lIlIllllIIIIII(Keyboard.getEventKeyState())) {
         if (lIlIlllIlllIlI(String.valueOf((new StringBuilder()).append(lIIIlIIIlIIll[lIIIlIIIlIllI[2]]).append(Keyboard.getEventCharacter())).equalsIgnoreCase(Command.getCommandPrefix()))) {
            mc.func_147108_a(new GuiChat(Command.getCommandPrefix()));
            "".length();
            if (((229 ^ 194) << (" ".length() << " ".length()) ^ 95 + 51 - 1 + 8) <= 0) {
               return;
            }
         } else {
            ModuleManager.onBind(Keyboard.getEventKey());
         }

      }
   }

   @SubscribeEvent
   public void onRender(net.minecraftforge.client.event.RenderGameOverlayEvent.Post lllllllllllllllIIlllIlIllIIIIIIl) {
      if (!lIlIlllIlllIlI(lllllllllllllllIIlllIlIllIIIIIIl.isCanceled())) {
         Exception lllllllllllllllIIlllIlIllIIIIIII = ElementType.EXPERIENCE;
         if (lIlIllllIIIIII(Wrapper.getPlayer().func_184812_l_()) && lIlIlllIlllIlI(Wrapper.getPlayer().func_184187_bx() instanceof AbstractHorse)) {
            lllllllllllllllIIlllIlIllIIIIIII = ElementType.HEALTHMOUNT;
         }

         if (lIlIlllIllllll(lllllllllllllllIIlllIlIllIIIIIIl.getType(), lllllllllllllllIIlllIlIllIIIIIII)) {
            ModuleManager.onRender();
            GL11.glPushMatrix();
            UIRenderer.renderAndUpdateFrames();
            GL11.glPopMatrix();
            SnowTessellator.releaseGL();
            "".length();
            if (((123 ^ 30 ^ (86 ^ 107) << " ".length()) & ((4 ^ 23) << "   ".length() ^ 86 + 0 - 7 + 56 ^ -" ".length())) > 0) {
               return;
            }
         } else if (lIlIlllIllllll(lllllllllllllllIIlllIlIllIIIIIIl.getType(), ElementType.BOSSINFO) && lIlIlllIlllIlI(ModuleManager.isModuleEnabled(lIIIlIIIlIIll[lIIIlIIIlIllI[1]]))) {
            BossStack.render(lllllllllllllllIIlllIlIllIIIIIIl);
         }

      }
   }

   private static boolean lIlIlllIlllIlI(int var0) {
      return var0 != 0;
   }

   private static String lIlIlllIllIlll(String lllllllllllllllIIlllIlIlIIllIlll, String lllllllllllllllIIlllIlIlIIllIllI) {
      try {
         SecretKeySpec lllllllllllllllIIlllIlIlIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIlIIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIIlllIlIlIIllIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIlIlIIllIlII.init(lIIIlIIIlIllI[2], lllllllllllllllIIlllIlIlIIllllII);
         return new String(lllllllllllllllIIlllIlIlIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   @SubscribeEvent
   public void onChunkLoaded(Load lllllllllllllllIIlllIlIlIllIlIll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIllIlIll);
   }

   @SubscribeEvent
   public void onEntityJoinWorldEvent(EntityJoinWorldEvent lllllllllllllllIIlllIlIlIlIlIlll) {
      SnowMod.EVENT_BUS.post(lllllllllllllllIIlllIlIlIlIlIlll);
   }
}
