package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.SnowTessellator;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "EntityESP",
   category = Module.Category.RENDER,
   description = "Highlights entities"
)
public class EntityESP extends Module {
   // $FF: synthetic field
   private static final String[] lllIlllIIlII;
   // $FF: synthetic field
   private Setting<EntityESP.ESPMode> mode;
   // $FF: synthetic field
   private Setting<Boolean> xps;
   // $FF: synthetic field
   private Setting<Boolean> mobs;
   // $FF: synthetic field
   private Setting<Boolean> items;
   // $FF: synthetic field
   private Setting<Boolean> animals;
   // $FF: synthetic field
   private static final int[] lllIlllIIlIl;
   // $FF: synthetic field
   private Setting<Boolean> players;
   // $FF: synthetic field
   private Setting<Boolean> crystals;

   private static String lIIlllIIllIlIl(String lllllllllllllllIlIllIIllIlIIlllI, String lllllllllllllllIlIllIIllIlIlIIlI) {
      lllllllllllllllIlIllIIllIlIIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIllIlIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIllIIllIlIlIIIl = new StringBuilder();
      char[] lllllllllllllllIlIllIIllIlIlIIII = lllllllllllllllIlIllIIllIlIlIIlI.toCharArray();
      int lllllllllllllllIlIllIIllIlIIllll = lllIlllIIlIl[0];
      double lllllllllllllllIlIllIIllIlIIlIIl = lllllllllllllllIlIllIIllIlIIlllI.toCharArray();
      double lllllllllllllllIlIllIIllIlIIlIII = lllllllllllllllIlIllIIllIlIIlIIl.length;
      int lllllllllllllllIlIllIIllIlIIIlll = lllIlllIIlIl[0];

      do {
         if (!lIIlllIlIIIIlI(lllllllllllllllIlIllIIllIlIIIlll, lllllllllllllllIlIllIIllIlIIlIII)) {
            return String.valueOf(lllllllllllllllIlIllIIllIlIlIIIl);
         }

         char lllllllllllllllIlIllIIllIlIIIllI = lllllllllllllllIlIllIIllIlIIlIIl[lllllllllllllllIlIllIIllIlIIIlll];
         lllllllllllllllIlIllIIllIlIlIIIl.append((char)(lllllllllllllllIlIllIIllIlIIIllI ^ lllllllllllllllIlIllIIllIlIlIIII[lllllllllllllllIlIllIIllIlIIllll % lllllllllllllllIlIllIIllIlIlIIII.length]));
         "".length();
         ++lllllllllllllllIlIllIIllIlIIllll;
         ++lllllllllllllllIlIllIIllIlIIIlll;
         "".length();
      } while(" ".length() != 0);

      return null;
   }

   public String getHudInfo() {
      return lllllllllllllllIlIllIIlllIIllllI.mode.getValueAsString().replaceAll(lllIlllIIlII[lllIlllIIlIl[11]], lllIlllIIlII[lllIlllIIlIl[12]]);
   }

   public EntityESP() {
      lllllllllllllllIlIllIIllllIIllII.mode = lllllllllllllllIlIllIIllllIIllII.register(Settings.e(lllIlllIIlII[lllIlllIIlIl[0]], EntityESP.ESPMode.Rect));
      lllllllllllllllIlIllIIllllIIllII.players = lllllllllllllllIlIllIIllllIIllII.register(Settings.b(lllIlllIIlII[lllIlllIIlIl[1]], (boolean)lllIlllIIlIl[1]));
      lllllllllllllllIlIllIIllllIIllII.animals = lllllllllllllllIlIllIIllllIIllII.register(Settings.b(lllIlllIIlII[lllIlllIIlIl[2]], (boolean)lllIlllIIlIl[0]));
      lllllllllllllllIlIllIIllllIIllII.mobs = lllllllllllllllIlIllIIllllIIllII.register(Settings.b(lllIlllIIlII[lllIlllIIlIl[3]], (boolean)lllIlllIIlIl[0]));
      lllllllllllllllIlIllIIllllIIllII.items = lllllllllllllllIlIllIIllllIIllII.register(Settings.b(lllIlllIIlII[lllIlllIIlIl[4]], (boolean)lllIlllIIlIl[0]));
      lllllllllllllllIlIllIIllllIIllII.xps = lllllllllllllllIlIllIIllllIIllII.register(Settings.b(lllIlllIIlII[lllIlllIIlIl[5]], (boolean)lllIlllIIlIl[0]));
      lllllllllllllllIlIllIIllllIIllII.crystals = lllllllllllllllIlIllIIllllIIllII.register(Settings.b(lllIlllIIlII[lllIlllIIlIl[6]], (boolean)lllIlllIIlIl[0]));
   }

   private static String lIIlllIIllIllI(String lllllllllllllllIlIllIIllIIlllllI, String lllllllllllllllIlIllIIllIIllllIl) {
      try {
         byte lllllllllllllllIlIllIIllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIllIIllllIl.getBytes(StandardCharsets.UTF_8)), lllIlllIIlIl[12]), "DES");
         Exception lllllllllllllllIlIllIIllIIlllIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIllIIllIIlllIIl.init(lllIlllIIlIl[2], lllllllllllllllIlIllIIllIIlllIlI);
         return new String(lllllllllllllllIlIllIIllIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIllIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIlllIlIIIIIl(Object var0, Object var1) {
      return var0 != var1;
   }

   public void onUpdate() {
      Iterator lllllllllllllllIlIllIIlllIllIIII;
      Entity lllllllllllllllIlIllIIlllIlIllll;
      if (!lIIlllIIllllII(((EntityESP.ESPMode)lllllllllllllllIlIllIIlllIllIIIl.mode.getValue()).equals(EntityESP.ESPMode.Glow))) {
         lllllllllllllllIlIllIIlllIllIIII = mc.field_71441_e.field_72996_f.iterator();

         while(lIIlllIIllllII(lllllllllllllllIlIllIIlllIllIIII.hasNext())) {
            lllllllllllllllIlIllIIlllIlIllll = (Entity)lllllllllllllllIlIllIIlllIllIIII.next();
            lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            "".length();
            if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
               return;
            }
         }
      } else {
         lllllllllllllllIlIllIIlllIllIIII = mc.field_71441_e.field_72996_f.iterator();

         while(true) {
            if (!lIIlllIIllllII(lllllllllllllllIlIllIIlllIllIIII.hasNext())) {
               "".length();
               if (null != null) {
                  return;
               }
               break;
            }

            lllllllllllllllIlIllIIlllIlIllll = (Entity)lllllllllllllllIlIllIIlllIllIIII.next();
            if (!lIIlllIIllllIl(lllllllllllllllIlIllIIlllIlIllll) || lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.field_70128_L)) {
               return;
            }

            if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityPlayer) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIllIIIl.players.getValue()) && lIIlllIIlllllI(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[1]);
               "".length();
               if (((13 ^ 92) & ~(224 ^ 177)) > 0) {
                  return;
               }
            } else if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityPlayer) && lIIlllIIlllllI((Boolean)lllllllllllllllIlIllIIlllIllIIIl.players.getValue()) && lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            }

            if (lIIlllIIllllII(EntityUtil.isHostileMob(lllllllllllllllIlIllIIlllIlIllll)) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIllIIIl.mobs.getValue()) && lIIlllIIlllllI(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[1]);
               "".length();
               if (" ".length() << (" ".length() << " ".length()) != " ".length() << (" ".length() << " ".length())) {
                  return;
               }
            } else if (lIIlllIIllllII(EntityUtil.isHostileMob(lllllllllllllllIlIllIIlllIlIllll)) && lIIlllIIlllllI((Boolean)lllllllllllllllIlIllIIlllIllIIIl.mobs.getValue()) && lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            }

            if (lIIlllIIllllII(EntityUtil.isPassive(lllllllllllllllIlIllIIlllIlIllll)) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIllIIIl.animals.getValue()) && lIIlllIIlllllI(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[1]);
               "".length();
               if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                  return;
               }
            } else if (lIIlllIIllllII(EntityUtil.isPassive(lllllllllllllllIlIllIIlllIlIllll)) && lIIlllIIlllllI((Boolean)lllllllllllllllIlIllIIlllIllIIIl.animals.getValue()) && lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            }

            if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityItem) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIllIIIl.items.getValue()) && lIIlllIIlllllI(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[1]);
               "".length();
               if (" ".length() << " ".length() < 0) {
                  return;
               }
            } else if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityItem) && lIIlllIIlllllI((Boolean)lllllllllllllllIlIllIIlllIllIIIl.items.getValue()) && lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            }

            if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityExpBottle) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIllIIIl.xps.getValue()) && lIIlllIIlllllI(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[1]);
               "".length();
               if (((33 ^ 36) << "   ".length() & ~((167 ^ 162) << "   ".length())) > "   ".length()) {
                  return;
               }
            } else if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityExpBottle) && lIIlllIIlllllI((Boolean)lllllllllllllllIlIllIIlllIllIIIl.xps.getValue()) && lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            }

            if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityEnderCrystal) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIllIIIl.crystals.getValue()) && lIIlllIIlllllI(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[1]);
               "".length();
               if ("   ".length() == " ".length() << (" ".length() << " ".length())) {
                  return;
               }
            } else if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll instanceof EntityEnderCrystal) && lIIlllIIlllllI((Boolean)lllllllllllllllIlIllIIlllIllIIIl.crystals.getValue()) && lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIllll.func_184202_aL())) {
               lllllllllllllllIlIllIIlllIlIllll.func_184195_f((boolean)lllIlllIIlIl[0]);
            }

            "".length();
            if (" ".length() << " ".length() == 0) {
               return;
            }
         }
      }

   }

   private static boolean lIIlllIIlllIll(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIIlllIIllIlll(String lllllllllllllllIlIllIIllIllIIIll, String lllllllllllllllIlIllIIllIllIIIlI) {
      try {
         boolean lllllllllllllllIlIllIIllIlIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIllIllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIllIIllIllIIlIl = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIIllIllIIlIl.init(lllIlllIIlIl[2], lllllllllllllllIlIllIIllIlIlllll);
         return new String(lllllllllllllllIlIllIIllIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIllIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onWorldRender(RenderEvent lllllllllllllllIlIllIIlllIllllll) {
      if (!lIIlllIIlllIlI(Wrapper.getMinecraft().func_175598_ae().field_78733_k)) {
         int var10000;
         if (lIIlllIIlllIll(Wrapper.getMinecraft().func_175598_ae().field_78733_k.field_74320_O, lllIlllIIlIl[2])) {
            var10000 = lllIlllIIlIl[1];
            "".length();
            if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
               return;
            }
         } else {
            var10000 = lllIlllIIlIl[0];
         }

         boolean lllllllllllllllIlIllIIllllIIIIll = var10000;
         byte lllllllllllllllIlIllIIlllIllllIl = Wrapper.getMinecraft().func_175598_ae().field_78735_i;
         short lllllllllllllllIlIllIIlllIllllII = mc.func_175598_ae().field_78732_j;
         switch(null.$SwitchMap$rr$snowhack$snow$module$modules$render$EntityESP$ESPMode[((EntityESP.ESPMode)lllllllllllllllIlIllIIllllIIIIII.mode.getValue()).ordinal()]) {
         case 1:
            mc.field_71441_e.field_72996_f.stream().filter(EntityUtil::isLiving).filter((lllllllllllllllIlIllIIllIllIlIll) -> {
               int var10000;
               if (lIIlllIlIIIIIl(mc.field_71439_g, lllllllllllllllIlIllIIllIllIlIll)) {
                  var10000 = lllIlllIIlIl[1];
                  "".length();
                  if (((204 ^ 137 ^ (16 ^ 13) << (" ".length() << " ".length())) & (17 ^ 116 ^ (154 ^ 143) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                     return (boolean)((112 ^ 69 ^ (188 ^ 187) << (" ".length() << " ".length())) & (128 ^ 135 ^ (35 ^ 52) << " ".length() ^ -" ".length()));
                  }
               } else {
                  var10000 = lllIlllIIlIl[0];
               }

               return (boolean)var10000;
            }).map((lllllllllllllllIlIllIIllIllIllll) -> {
               return (EntityLivingBase)lllllllllllllllIlIllIIllIllIllll;
            }).filter((lllllllllllllllIlIllIIllIlllIIlI) -> {
               int var10000;
               if (lIIlllIIlllllI(lllllllllllllllIlIllIIllIlllIIlI.field_70128_L)) {
                  var10000 = lllIlllIIlIl[1];
                  "".length();
                  if (((93 + 225 - 145 + 78 ^ (46 ^ 3) << (" ".length() << " ".length())) & (10 + 11 - -156 + 18 ^ (121 ^ 90) << (" ".length() << " ".length()) ^ -" ".length())) > "   ".length()) {
                     return (boolean)((66 + 4 - -38 + 79 ^ (94 ^ 25) << " ".length()) & (75 + 150 - 128 + 94 ^ (113 ^ 52) << " ".length() ^ -" ".length()));
                  }
               } else {
                  var10000 = lllIlllIIlIl[0];
               }

               return (boolean)var10000;
            }).filter((lllllllllllllllIlIllIIllIlllIlII) -> {
               int var3;
               if (!lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIllIlllIlIl.players.getValue()) || lIIlllIIlllllI(lllllllllllllllIlIllIIllIlllIlII instanceof EntityPlayer)) {
                  Boolean var10000;
                  if (lIIlllIIllllII(EntityUtil.isPassive(lllllllllllllllIlIllIIllIlllIlII))) {
                     var10000 = (Boolean)lllllllllllllllIlIllIIllIlllIlIl.animals.getValue();
                     "".length();
                     if (" ".length() << " ".length() < 0) {
                        return (boolean)((114 ^ 83) & ~(43 ^ 10));
                     }
                  } else {
                     var10000 = (Boolean)lllllllllllllllIlIllIIllIlllIlIl.mobs.getValue();
                  }

                  if (!lIIlllIIllllII(var10000)) {
                     var3 = lllIlllIIlIl[0];
                     return (boolean)var3;
                  }
               }

               var3 = lllIlllIIlIl[1];
               "".length();
               if ("   ".length() == 0) {
                  return (boolean)(("   ".length() ^ " ".length() << "   ".length()) << (" ".length() << " ".length()) & ((6 ^ 35 ^ (209 ^ 198) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length()));
               } else {
                  return (boolean)var3;
               }
            }).forEach((lllllllllllllllIlIllIIlllIIIIIII) -> {
               GlStateManager.func_179094_E();
               Vec3d lllllllllllllllIlIllIIllIlllllll = EntityUtil.getInterpolatedPos(lllllllllllllllIlIllIIlllIIIIIII, lllllllllllllllIlIllIIlllIllllll.getPartialTicks());
               GlStateManager.func_179137_b(lllllllllllllllIlIllIIllIlllllll.field_72450_a - mc.func_175598_ae().field_78725_b, lllllllllllllllIlIllIIllIlllllll.field_72448_b - mc.func_175598_ae().field_78726_c, lllllllllllllllIlIllIIllIlllllll.field_72449_c - mc.func_175598_ae().field_78723_d);
               GlStateManager.func_187432_a(0.0F, 1.0F, 0.0F);
               GlStateManager.func_179114_b(-lllllllllllllllIlIllIIlllIllllIl, 0.0F, 1.0F, 0.0F);
               int var10000;
               if (lIIlllIIllllII(lllllllllllllllIlIllIIllllIIIIll)) {
                  var10000 = lllIlllIIlIl[13];
                  "".length();
                  if (" ".length() << " ".length() <= 0) {
                     return;
                  }
               } else {
                  var10000 = lllIlllIIlIl[1];
               }

               GlStateManager.func_179114_b((float)var10000, 1.0F, 0.0F, 0.0F);
               GlStateManager.func_179140_f();
               GlStateManager.func_179132_a((boolean)lllIlllIIlIl[0]);
               GlStateManager.func_179097_i();
               GlStateManager.func_179147_l();
               GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
               if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIIIIIII instanceof EntityPlayer)) {
                  GL11.glColor3f(1.0F, 1.0F, 1.0F);
                  "".length();
                  if ("   ".length() < " ".length()) {
                     return;
                  }
               } else if (lIIlllIIllllII(EntityUtil.isPassive(lllllllllllllllIlIllIIlllIIIIIII))) {
                  GL11.glColor3f(0.11F, 0.9F, 0.11F);
                  "".length();
                  if ((134 ^ 131) <= 0) {
                     return;
                  }
               } else {
                  GL11.glColor3f(0.9F, 0.1F, 0.1F);
               }

               GlStateManager.func_179090_x();
               GL11.glLineWidth(2.0F);
               GL11.glEnable(lllIlllIIlIl[10]);
               GL11.glBegin(lllIlllIIlIl[2]);
               GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIIIIII.field_70130_N / 2.0F), 0.0D);
               GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIIIIII.field_70130_N / 2.0F), (double)lllllllllllllllIlIllIIlllIIIIIII.field_70131_O);
               GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIIIIII.field_70130_N / 2.0F), (double)lllllllllllllllIlIllIIlllIIIIIII.field_70131_O);
               GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIIIIII.field_70130_N / 2.0F), 0.0D);
               GL11.glEnd();
               GlStateManager.func_179121_F();
            });
            GlStateManager.func_179126_j();
            GlStateManager.func_179132_a((boolean)lllIlllIIlIl[1]);
            GlStateManager.func_179090_x();
            GlStateManager.func_179147_l();
            GlStateManager.func_179118_c();
            GlStateManager.func_179120_a(lllIlllIIlIl[7], lllIlllIIlIl[8], lllIlllIIlIl[1], lllIlllIIlIl[0]);
            GlStateManager.func_179103_j(lllIlllIIlIl[9]);
            GlStateManager.func_179097_i();
            GlStateManager.func_179089_o();
            GlStateManager.func_187441_d(1.0F);
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            "".length();
            if ("   ".length() <= 0) {
               return;
            }
            break;
         case 2:
            mc.field_71441_e.field_72996_f.stream().filter((lllllllllllllllIlIllIIlllIIIlIIl) -> {
               int var10000;
               if (lIIlllIlIIIIIl(mc.field_71439_g, lllllllllllllllIlIllIIlllIIIlIIl)) {
                  var10000 = lllIlllIIlIl[1];
                  "".length();
                  if (" ".length() <= 0) {
                     return (boolean)(" ".length() & (" ".length() ^ -" ".length()));
                  }
               } else {
                  var10000 = lllIlllIIlIl[0];
               }

               return (boolean)var10000;
            }).forEach((lllllllllllllllIlIllIIlllIIlIIll) -> {
               SnowTessellator.prepareGL();
               GlStateManager.func_179094_E();
               Vec3d lllllllllllllllIlIllIIlllIIlIIlI = getInterpolatedPos(lllllllllllllllIlIllIIlllIIlIIll, mc.func_184121_ak());
               GlStateManager.func_179137_b(lllllllllllllllIlIllIIlllIIlIIlI.field_72450_a - mc.func_175598_ae().field_78725_b, lllllllllllllllIlIllIIlllIIlIIlI.field_72448_b - mc.func_175598_ae().field_78726_c, lllllllllllllllIlIllIIlllIIlIIlI.field_72449_c - mc.func_175598_ae().field_78723_d);
               GlStateManager.func_187432_a(0.0F, 1.0F, 0.0F);
               GlStateManager.func_179114_b(-lllllllllllllllIlIllIIlllIllllIl, 0.0F, 1.0F, 0.0F);
               int var10000;
               if (lIIlllIIllllII(lllllllllllllllIlIllIIllllIIIIll)) {
                  var10000 = lllIlllIIlIl[13];
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) < " ".length()) {
                     return;
                  }
               } else {
                  var10000 = lllIlllIIlIl[1];
               }

               GlStateManager.func_179114_b((float)var10000 * lllllllllllllllIlIllIIlllIllllII, 1.0F, 0.0F, 0.0F);
               GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
               GL11.glLineWidth(3.0F);
               GL11.glEnable(lllIlllIIlIl[10]);
               if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIIlIIll instanceof EntityPlayer) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIIlIIIl.players.getValue())) {
                  if (lIIlllIIllllII(Friends.isFriend(lllllllllllllllIlIllIIlllIIlIIll.func_70005_c_()))) {
                     GL11.glColor4f(0.0F, 1.0F, 1.0F, 0.5F);
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) <= 0) {
                        return;
                     }
                  } else if (lIIlllIlIIIIII(lIIlllIIllllll(mc.field_71439_g.func_70032_d(lllllllllllllllIlIllIIlllIIlIIll), 50.0F))) {
                     GL11.glColor4f(0.0F, 1.0F, 0.0F, 0.5F);
                     "".length();
                     if (-" ".length() > 0) {
                        return;
                     }
                  } else {
                     GL11.glColor4f(1.0F - mc.field_71439_g.func_70032_d(lllllllllllllllIlIllIIlllIIlIIll) / 50.0F, mc.field_71439_g.func_70032_d(lllllllllllllllIlIllIIlllIIlIIll) / 50.0F, 0.0F, 0.5F);
                  }

                  lllllllllllllllIlIllIIlllIIlIIIl.drawCSGO(lllllllllllllllIlIllIIlllIIlIIll);
               }

               GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.5F);
               if (lIIlllIIllllII(EntityUtil.isPassive(lllllllllllllllIlIllIIlllIIlIIll)) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIIlIIIl.animals.getValue())) {
                  lllllllllllllllIlIllIIlllIIlIIIl.drawCSGO(lllllllllllllllIlIllIIlllIIlIIll);
               }

               if (lIIlllIIllllII(EntityUtil.isHostileMob(lllllllllllllllIlIllIIlllIIlIIll)) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIIlIIIl.mobs.getValue())) {
                  lllllllllllllllIlIllIIlllIIlIIIl.drawCSGO(lllllllllllllllIlIllIIlllIIlIIll);
               }

               if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIIlIIll instanceof EntityItem) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIIlIIIl.items.getValue())) {
                  lllllllllllllllIlIllIIlllIIlIIIl.drawCSGO(lllllllllllllllIlIllIIlllIIlIIll);
               }

               if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIIlIIll instanceof EntityExpBottle) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIIlIIIl.xps.getValue())) {
                  lllllllllllllllIlIllIIlllIIlIIIl.drawCSGO(lllllllllllllllIlIllIIlllIIlIIll);
               }

               if (lIIlllIIllllII(lllllllllllllllIlIllIIlllIIlIIll instanceof EntityEnderCrystal) && lIIlllIIllllII((Boolean)lllllllllllllllIlIllIIlllIIlIIIl.crystals.getValue())) {
                  GL11.glBegin(lllIlllIIlIl[2]);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), 0.0D);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)(lllllllllllllllIlIllIIlllIIlIIll.field_70131_O / 3.0F));
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), 0.0D);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 3.0F * 2.0F / 2.0F), 0.0D);
                  GL11.glEnd();
                  GL11.glBegin(lllIlllIIlIl[2]);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)lllllllllllllllIlIllIIlllIIlIIll.field_70131_O);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 3.0F * 2.0F / 2.0F), (double)lllllllllllllllIlIllIIlllIIlIIll.field_70131_O);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)lllllllllllllllIlIllIIlllIIlIIll.field_70131_O);
                  GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)(lllllllllllllllIlIllIIlllIIlIIll.field_70131_O / 3.0F * 2.0F));
                  GL11.glEnd();
                  GL11.glBegin(lllIlllIIlIl[2]);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)lllllllllllllllIlIllIIlllIIlIIll.field_70131_O);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 3.0F * 2.0F / 2.0F), (double)lllllllllllllllIlIllIIlllIIlIIll.field_70131_O);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)lllllllllllllllIlIllIIlllIIlIIll.field_70131_O);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)(lllllllllllllllIlIllIIlllIIlIIll.field_70131_O / 3.0F * 2.0F));
                  GL11.glEnd();
                  GL11.glBegin(lllIlllIIlIl[2]);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), 0.0D);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 3.0F * 2.0F / 2.0F), 0.0D);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), 0.0D);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIIlIIll.field_70130_N / 2.0F), (double)(lllllllllllllllIlIllIIlllIIlIIll.field_70131_O / 3.0F));
                  GL11.glEnd();
               }

               SnowTessellator.releaseGL();
               GlStateManager.func_179121_F();
            });
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            "".length();
            if (null != null) {
               return;
            }
         }

      }
   }

   private static void lIIlllIIlllIIl() {
      lllIlllIIlIl = new int[15];
      lllIlllIIlIl[0] = "   ".length() << (" ".length() << " ".length()) & ~("   ".length() << (" ".length() << " ".length()));
      lllIlllIIlIl[1] = " ".length();
      lllIlllIIlIl[2] = " ".length() << " ".length();
      lllIlllIIlIl[3] = "   ".length();
      lllIlllIIlIl[4] = " ".length() << (" ".length() << " ".length());
      lllIlllIIlIl[5] = 86 ^ 83;
      lllIlllIIlIl[6] = "   ".length() << " ".length();
      lllIlllIIlIl[7] = 37 + 281 - 133 + 140 + (122 ^ 33) - ((95 ^ 16) << " ".length()) + 47 + 51 - 7 + 36 << " ".length();
      lllIlllIIlIl[8] = 766 + 473 - 931 + 463;
      lllIlllIIlIl[9] = 4300 + 3558 - 7149 + 3600 + 2897 + 2613 - 2342 + 659 - (2281 + 94 - 899 + 2019 << " ".length()) + 1229 + 2955 - 3735 + 5830;
      lllIlllIIlIl[10] = (228 ^ 189) << (130 ^ 135);
      lllIlllIIlIl[11] = (32 ^ 11) << (" ".length() << " ".length()) ^ 53 + 16 - -11 + 91;
      lllIlllIIlIl[12] = " ".length() << "   ".length();
      lllIlllIIlIl[13] = -" ".length();
      lllIlllIIlIl[14] = 166 ^ 175;
   }

   static {
      lIIlllIIlllIIl();
      lIIlllIIlllIII();
   }

   private static boolean lIIlllIlIIIIII(int var0) {
      return var0 > 0;
   }

   public static Vec3d getInterpolatedPos(Entity lllllllllllllllIlIllIIlllIlIIIlI, float lllllllllllllllIlIllIIlllIlIIIll) {
      return (new Vec3d(lllllllllllllllIlIllIIlllIlIIIlI.field_70142_S, lllllllllllllllIlIllIIlllIlIIIlI.field_70137_T, lllllllllllllllIlIllIIlllIlIIIlI.field_70136_U)).func_178787_e(EntityUtil.getInterpolatedAmount(lllllllllllllllIlIllIIlllIlIIIlI, (double)lllllllllllllllIlIllIIlllIlIIIll));
   }

   private static boolean lIIlllIIllllII(int var0) {
      return var0 != 0;
   }

   private static void lIIlllIIlllIII() {
      lllIlllIIlII = new String[lllIlllIIlIl[14]];
      lllIlllIIlII[lllIlllIIlIl[0]] = lIIlllIIllIlIl("PSMlHw==", "pLAzw");
      lllIlllIIlII[lllIlllIIlIl[1]] = lIIlllIIllIlIl("KB4sLyMKAQ==", "xrMVF");
      lllIlllIIlII[lllIlllIIlIl[2]] = lIIlllIIllIlIl("KAosIQsFFw==", "idELj");
      lllIlllIIlII[lllIlllIIlIl[3]] = lIIlllIIllIllI("mMMUGEHtKlY=", "epqkj");
      lllIlllIIlII[lllIlllIIlIl[4]] = lIIlllIIllIlIl("BzcUIhc=", "NCqOd");
      lllIlllIIlII[lllIlllIIlIl[5]] = lIIlllIIllIllI("HJSpQuqKzt9XxQf+/GoYzg==", "OpPPH");
      lllIlllIIlII[lllIlllIIlIl[6]] = lIIlllIIllIllI("/gpx+YQ6C6tPoPY7/S3aew==", "iegqT");
      lllIlllIIlII[lllIlllIIlIl[11]] = lIIlllIIllIlll("hmlDRnq+aU4=", "QywQo");
      lllIlllIIlII[lllIlllIIlIl[12]] = lIIlllIIllIllI("UKBJJjMWbM0=", "HjJtM");
   }

   private static boolean lIIlllIIllllIl(Object var0) {
      return var0 != null;
   }

   public void onDisable() {
      if (lIIlllIIllllII(((EntityESP.ESPMode)lllllllllllllllIlIllIIlllIlIlIlI.mode.getValue()).equals(EntityESP.ESPMode.Glow))) {
         Iterator lllllllllllllllIlIllIIlllIlIlIII = mc.field_71441_e.field_72996_f.iterator();

         while(lIIlllIIllllII(lllllllllllllllIlIllIIlllIlIlIII.hasNext())) {
            Exception lllllllllllllllIlIllIIlllIlIIlll = (Entity)lllllllllllllllIlIllIIlllIlIlIII.next();
            lllllllllllllllIlIllIIlllIlIIlll.func_184195_f((boolean)lllIlllIIlIl[0]);
            "".length();
            if (-(66 ^ 119 ^ 159 ^ 174) > 0) {
               return;
            }
         }

         mc.field_71439_g.func_184195_f((boolean)lllIlllIIlIl[0]);
      }

   }

   private static int lIIlllIIllllll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private void drawCSGO(Entity lllllllllllllllIlIllIIlllIlllIIl) {
      GL11.glEnable(lllIlllIIlIl[10]);
      GL11.glBegin(lllIlllIIlIl[2]);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N), 0.0D);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N), (double)(lllllllllllllllIlIllIIlllIlllIIl.field_70131_O / 3.0F));
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N), 0.0D);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N / 3.0F * 2.0F), 0.0D);
      GL11.glEnd();
      GL11.glBegin(lllIlllIIlIl[2]);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N), (double)lllllllllllllllIlIllIIlllIlllIIl.field_70131_O);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N / 3.0F * 2.0F), (double)lllllllllllllllIlIllIIlllIlllIIl.field_70131_O);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N), (double)lllllllllllllllIlIllIIlllIlllIIl.field_70131_O);
      GL11.glVertex2d((double)(-lllllllllllllllIlIllIIlllIlllIIl.field_70130_N), (double)(lllllllllllllllIlIllIIlllIlllIIl.field_70131_O / 3.0F * 2.0F));
      GL11.glEnd();
      GL11.glBegin(lllIlllIIlIl[2]);
      GL11.glVertex2d((double)lllllllllllllllIlIllIIlllIlllIIl.field_70130_N, (double)lllllllllllllllIlIllIIlllIlllIIl.field_70131_O);
      GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIlllIIl.field_70130_N / 3.0F * 2.0F), (double)lllllllllllllllIlIllIIlllIlllIIl.field_70131_O);
      GL11.glVertex2d((double)lllllllllllllllIlIllIIlllIlllIIl.field_70130_N, (double)lllllllllllllllIlIllIIlllIlllIIl.field_70131_O);
      GL11.glVertex2d((double)lllllllllllllllIlIllIIlllIlllIIl.field_70130_N, (double)(lllllllllllllllIlIllIIlllIlllIIl.field_70131_O / 3.0F * 2.0F));
      GL11.glEnd();
      GL11.glBegin(lllIlllIIlIl[2]);
      GL11.glVertex2d((double)lllllllllllllllIlIllIIlllIlllIIl.field_70130_N, 0.0D);
      GL11.glVertex2d((double)(lllllllllllllllIlIllIIlllIlllIIl.field_70130_N / 3.0F * 2.0F), 0.0D);
      GL11.glVertex2d((double)lllllllllllllllIlIllIIlllIlllIIl.field_70130_N, 0.0D);
      GL11.glVertex2d((double)lllllllllllllllIlIllIIlllIlllIIl.field_70130_N, (double)(lllllllllllllllIlIllIIlllIlllIIl.field_70131_O / 3.0F));
      GL11.glEnd();
      GL11.glDisable(lllIlllIIlIl[10]);
   }

   private static boolean lIIlllIIlllIlI(Object var0) {
      return var0 == null;
   }

   private static boolean lIIlllIIlllllI(int var0) {
      return var0 == 0;
   }

   private static boolean lIIlllIlIIIIlI(int var0, int var1) {
      return var0 < var1;
   }

   public static enum ESPMode {
      // $FF: synthetic field
      Glow,
      // $FF: synthetic field
      CSGO,
      // $FF: synthetic field
      Rect;

      // $FF: synthetic field
      private static final String[] lllIIlllllII;
      // $FF: synthetic field
      private static final int[] lllIIlllllIl;

      static {
         lIIlIllllllllI();
         lIIlIlllllllIl();
         Rect = new EntityESP.ESPMode(lllIIlllllII[lllIIlllllIl[0]], lllIIlllllIl[0]);
         Glow = new EntityESP.ESPMode(lllIIlllllII[lllIIlllllIl[1]], lllIIlllllIl[1]);
         CSGO = new EntityESP.ESPMode(lllIIlllllII[lllIIlllllIl[2]], lllIIlllllIl[2]);
         EntityESP.ESPMode[] var10000 = new EntityESP.ESPMode[lllIIlllllIl[3]];
         var10000[lllIIlllllIl[0]] = Rect;
         var10000[lllIIlllllIl[1]] = Glow;
         var10000[lllIIlllllIl[2]] = CSGO;
      }

      private static String lIIlIllllllIll(String lllllllllllllllIllIIIIlllIIIlIII, String lllllllllllllllIllIIIIlllIIIIlIl) {
         try {
            SecretKeySpec lllllllllllllllIllIIIIlllIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIlllIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIIlllIIIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIIlllIIIlIlI.init(lllIIlllllIl[2], lllllllllllllllIllIIIIlllIIIlIll);
            return new String(lllllllllllllllIllIIIIlllIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIlllIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static String lIIlIlllllllII(String lllllllllllllllIllIIIIllIllIIIIl, String lllllllllllllllIllIIIIllIllIIIII) {
         try {
            int lllllllllllllllIllIIIIllIlIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIIllIllIIIII.getBytes(StandardCharsets.UTF_8)), lllIIlllllIl[4]), "DES");
            Cipher lllllllllllllllIllIIIIllIllIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIllIIIIllIllIIlIl.init(lllIIlllllIl[2], lllllllllllllllIllIIIIllIlIlllll);
            return new String(lllllllllllllllIllIIIIllIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIIllIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static String lIIlIllllllIlI(String lllllllllllllllIllIIIIllIlllIIll, String lllllllllllllllIllIIIIllIlllIIlI) {
         lllllllllllllllIllIIIIllIlllIIll = new String(Base64.getDecoder().decode(lllllllllllllllIllIIIIllIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         Exception lllllllllllllllIllIIIIllIlllIIIl = new StringBuilder();
         char[] lllllllllllllllIllIIIIllIlllIlIl = lllllllllllllllIllIIIIllIlllIIlI.toCharArray();
         short lllllllllllllllIllIIIIllIllIllll = lllIIlllllIl[0];
         short lllllllllllllllIllIIIIllIllIlllI = lllllllllllllllIllIIIIllIlllIIll.toCharArray();
         double lllllllllllllllIllIIIIllIllIllIl = lllllllllllllllIllIIIIllIllIlllI.length;
         int lllllllllllllllIllIIIIllIllIllII = lllIIlllllIl[0];

         do {
            if (!lIIlIlllllllll(lllllllllllllllIllIIIIllIllIllII, lllllllllllllllIllIIIIllIllIllIl)) {
               return String.valueOf(lllllllllllllllIllIIIIllIlllIIIl);
            }

            long lllllllllllllllIllIIIIllIllIlIll = lllllllllllllllIllIIIIllIllIlllI[lllllllllllllllIllIIIIllIllIllII];
            lllllllllllllllIllIIIIllIlllIIIl.append((char)(lllllllllllllllIllIIIIllIllIlIll ^ lllllllllllllllIllIIIIllIlllIlIl[lllllllllllllllIllIIIIllIllIllll % lllllllllllllllIllIIIIllIlllIlIl.length]));
            "".length();
            ++lllllllllllllllIllIIIIllIllIllll;
            ++lllllllllllllllIllIIIIllIllIllII;
            "".length();
         } while(((228 ^ 195) & ~(166 ^ 129)) == 0);

         return null;
      }

      private static boolean lIIlIlllllllll(int var0, int var1) {
         return var0 < var1;
      }

      private static void lIIlIlllllllIl() {
         lllIIlllllII = new String[lllIIlllllIl[3]];
         lllIIlllllII[lllIIlllllIl[0]] = lIIlIllllllIlI("FhYzGw==", "DsPoj");
         lllIIlllllII[lllIIlllllIl[1]] = lIIlIllllllIll("3sdKm/Rcweg=", "mqyaJ");
         lllIIlllllII[lllIIlllllIl[2]] = lIIlIlllllllII("4ztTXGhQM2k=", "uUpdb");
      }

      private static void lIIlIllllllllI() {
         lllIIlllllIl = new int[5];
         lllIIlllllIl[0] = ((112 ^ 99) << "   ".length() ^ 15 + 171 - 51 + 64) & (109 ^ 102 ^ (59 ^ 46) << (" ".length() << " ".length()) ^ -" ".length());
         lllIIlllllIl[1] = " ".length();
         lllIIlllllIl[2] = " ".length() << " ".length();
         lllIIlllllIl[3] = "   ".length();
         lllIIlllllIl[4] = " ".length() << "   ".length();
      }
   }
}
