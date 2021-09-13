package rr.snowhack.snow.module.modules.render;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.item.ItemShulkerBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.math.BlockPos;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.ColourUtils;
import rr.snowhack.snow.util.SnowTessellator;
import rr.snowhack.snow.util.Wrapper;

@Module.Info(
   name = "StorageESP",
   description = "Draws nice little lines around storage items",
   category = Module.Category.RENDER
)
public class StorageESP extends Module {
   // $FF: synthetic field
   private static final int[] lIIIlIlllIIll;
   // $FF: synthetic field
   private Setting<Boolean> hopper;
   // $FF: synthetic field
   private Setting<Boolean> dispenser;
   // $FF: synthetic field
   private Setting<Boolean> cart;
   // $FF: synthetic field
   private Setting<Boolean> furnace;
   // $FF: synthetic field
   private Setting<Boolean> chest;
   // $FF: synthetic field
   private static final String[] lIIIlIlllIIlI;
   // $FF: synthetic field
   private Setting<Boolean> frame;
   // $FF: synthetic field
   private Setting<Boolean> echest;
   // $FF: synthetic field
   private Setting<Boolean> shulker;

   public void onWorldRender(RenderEvent lllllllllllllllIIllIIllllIllIIIl) {
      ArrayList<StorageESP.Triplet<BlockPos, Integer, Integer>> lllllllllllllllIIllIIllllIlIlllI = new ArrayList();
      GlStateManager.func_179094_E();
      Iterator lllllllllllllllIIllIIllllIlIllIl = Wrapper.getWorld().field_147482_g.iterator();

      BlockPos lllllllllllllllIIllIIllllIllIllI;
      int lllllllllllllllIIllIIllllIllIlIl;
      while(lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIlIllIl.hasNext())) {
         TileEntity lllllllllllllllIIllIIllllIllIlll = (TileEntity)lllllllllllllllIIllIIllllIlIllIl.next();
         lllllllllllllllIIllIIllllIllIllI = lllllllllllllllIIllIIllllIllIlll.func_174877_v();
         lllllllllllllllIIllIIllllIllIlIl = lllllllllllllllIIllIIllllIlIllll.getTileEntityColor(lllllllllllllllIIllIIllllIllIlll);
         Exception lllllllllllllllIIllIIllllIlIlIIl = lIIIlIlllIIll[9];
         if (lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityChest)) {
            byte lllllllllllllllIIllIIllllIlIlIII = (TileEntityChest)lllllllllllllllIIllIIllllIllIlll;
            if (lIllIIlIlIlIlI(lllllllllllllllIIllIIllllIlIlIII.field_145992_i)) {
               lllllllllllllllIIllIIllllIlIlIIl = lllllllllllllllIIllIIllllIlIlIIl & lIIIlIlllIIll[4] ^ lIIIlIlllIIll[8];
            }

            if (lIllIIlIlIlIlI(lllllllllllllllIIllIIllllIlIlIII.field_145990_j)) {
               lllllllllllllllIIllIIllllIlIlIIl = lllllllllllllllIIllIIllllIlIlIIl & lIIIlIlllIIll[10] ^ lIIIlIlllIIll[8];
            }

            if (lIllIIlIlIlIlI(lllllllllllllllIIllIIllllIlIlIII.field_145988_l)) {
               lllllllllllllllIIllIIllllIlIlIIl = lllllllllllllllIIllIIllllIlIlIIl & lIIIlIlllIIll[11] ^ lIIIlIlllIIll[8];
            }

            if (lIllIIlIlIlIlI(lllllllllllllllIIllIIllllIlIlIII.field_145991_k)) {
               lllllllllllllllIIllIIllllIlIlIIl = lllllllllllllllIIllIIllllIlIlIIl & lIIIlIlllIIll[12] ^ lIIIlIlllIIll[8];
            }
         }

         if ((lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityChest) && !lIllIIlIlIlIII((Boolean)lllllllllllllllIIllIIllllIlIllll.chest.getValue()) || lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityDispenser) && !lIllIIlIlIlIII((Boolean)lllllllllllllllIIllIIllllIlIllll.dispenser.getValue()) || lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityShulkerBox) && !lIllIIlIlIlIII((Boolean)lllllllllllllllIIllIIllllIlIllll.shulker.getValue()) || lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityEnderChest) && !lIllIIlIlIlIII((Boolean)lllllllllllllllIIllIIllllIlIllll.echest.getValue()) || lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityFurnace) && !lIllIIlIlIlIII((Boolean)lllllllllllllllIIllIIllllIlIllll.furnace.getValue()) || lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlll instanceof TileEntityHopper) && lIllIIlIlIlIIl((Boolean)lllllllllllllllIIllIIllllIlIllll.hopper.getValue())) && lIllIIlIlIlIll(lllllllllllllllIIllIIllllIllIlIl, lIIIlIlllIIll[8])) {
            lllllllllllllllIIllIIllllIlIlllI.add(new StorageESP.Triplet(lllllllllllllllIIllIIllllIllIllI, lllllllllllllllIIllIIllllIllIlIl, lllllllllllllllIIllIIllllIlIlIIl));
            "".length();
         }

         "".length();
         if (" ".length() << (" ".length() << " ".length()) < 0) {
            return;
         }
      }

      lllllllllllllllIIllIIllllIlIllIl = Wrapper.getWorld().field_72996_f.iterator();

      do {
         if (!lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIlIllIl.hasNext())) {
            SnowTessellator.prepare(lIIIlIlllIIll[7]);
            lllllllllllllllIIllIIllllIlIllIl = lllllllllllllllIIllIIllllIlIlllI.iterator();

            do {
               if (!lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIlIllIl.hasNext())) {
                  SnowTessellator.release();
                  GlStateManager.func_179121_F();
                  GlStateManager.func_179098_w();
                  return;
               }

               StorageESP.Triplet<BlockPos, Integer, Integer> lllllllllllllllIIllIIllllIllIIll = (StorageESP.Triplet)lllllllllllllllIIllIIllllIlIllIl.next();
               SnowTessellator.drawBox((BlockPos)lllllllllllllllIIllIIllllIllIIll.getFirst(), lllllllllllllllIIllIIllllIlIllll.changeAlpha((Integer)lllllllllllllllIIllIIllllIllIIll.getSecond(), lIIIlIlllIIll[13]), (Integer)lllllllllllllllIIllIIllllIllIIll.getThird());
               "".length();
            } while(" ".length() << " ".length() >= 0);

            return;
         }

         Entity lllllllllllllllIIllIIllllIllIlII = (Entity)lllllllllllllllIIllIIllllIlIllIl.next();
         lllllllllllllllIIllIIllllIllIllI = lllllllllllllllIIllIIllllIllIlII.func_180425_c();
         lllllllllllllllIIllIIllllIllIlIl = lllllllllllllllIIllIIllllIlIllll.getEntityColor(lllllllllllllllIIllIIllllIllIlII);
         if ((lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlII instanceof EntityItemFrame) && !lIllIIlIlIlIII((Boolean)lllllllllllllllIIllIIllllIlIllll.frame.getValue()) || lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlII instanceof EntityMinecartChest) && lIllIIlIlIlIIl((Boolean)lllllllllllllllIIllIIllllIlIllll.cart.getValue())) && lIllIIlIlIlIll(lllllllllllllllIIllIIllllIllIlIl, lIIIlIlllIIll[8])) {
            StorageESP.Triplet var10001 = new StorageESP.Triplet;
            BlockPos var10004;
            if (lIllIIlIlIlIIl(lllllllllllllllIIllIIllllIllIlII instanceof EntityItemFrame)) {
               var10004 = lllllllllllllllIIllIIllllIllIllI.func_177982_a(lIIIlIlllIIll[0], lIIIlIlllIIll[8], lIIIlIlllIIll[0]);
               "".length();
               if (null != null) {
                  return;
               }
            } else {
               var10004 = lllllllllllllllIIllIIllllIllIllI;
            }

            var10001.<init>(var10004, lllllllllllllllIIllIIllllIllIlIl, lIIIlIlllIIll[9]);
            lllllllllllllllIIllIIllllIlIlllI.add(var10001);
            "".length();
         }

         "".length();
      } while(-(74 ^ 78) < 0);

   }

   private static boolean lIllIIlIlIllII(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIllIIlIlIIllI() {
      lIIIlIlllIIlI = new String[lIIIlIlllIIll[11]];
      lIIIlIlllIIlI[lIIIlIlllIIll[0]] = lIllIIlIlIIIll("DxwXHSE=", "LtrnU");
      lIIIlIlllIIlI[lIIIlIlllIIll[1]] = lIllIIlIlIIlII("XiRwbs0OMvVwfICzKgvWGg==", "wfFAp");
      lIIIlIlllIIlI[lIIIlIlllIIll[2]] = lIllIIlIlIIIll("FQcXIzojHQ==", "FobOQ");
      lIIIlIlllIIlI[lIIIlIlllIIll[3]] = lIllIIlIlIIIll("EwglBxp2JSkHGyI=", "VfAbh");
      lIIIlIlllIIlI[lIIIlIlllIIll[4]] = lIllIIlIlIIIll("FDMnKgkxIw==", "RFUDh");
      lIIIlIlllIIlI[lIIIlIlllIIll[5]] = lIllIIlIlIIlII("1aIil3afmaE=", "PEkmL");
      lIIIlIlllIIlI[lIIIlIlllIIll[6]] = lIllIIlIlIIIll("NR4PDzEZBRU=", "xwajR");
      lIIIlIlllIIlI[lIIIlIlllIIll[7]] = lIllIIlIlIIlIl("SlpYdmATsYqJHPjfUb1Eng==", "aGaXo");
   }

   private int getTileEntityColor(TileEntity lllllllllllllllIIllIIlllllIIlIII) {
      if (lIllIIlIlIlIII(lllllllllllllllIIllIIlllllIIlIII instanceof TileEntityChest) && !lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIlIII instanceof TileEntityDispenser)) {
         if (lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIlIII instanceof TileEntityShulkerBox)) {
            return ColourUtils.Colors.RED;
         } else if (lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIlIII instanceof TileEntityEnderChest)) {
            return ColourUtils.Colors.PURPLE;
         } else if (lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIlIII instanceof TileEntityFurnace)) {
            return ColourUtils.Colors.GRAY;
         } else {
            return lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIlIII instanceof TileEntityHopper) ? ColourUtils.Colors.DARK_RED : lIIIlIlllIIll[8];
         }
      } else {
         return ColourUtils.Colors.ORANGE;
      }
   }

   private static boolean lIllIIlIlIlIIl(int var0) {
      return var0 != 0;
   }

   static {
      lIllIIlIlIIlll();
      lIllIIlIlIIllI();
   }

   int changeAlpha(int lllllllllllllllIIllIIllllIlIIlII, int lllllllllllllllIIllIIllllIlIIIIl) {
      lllllllllllllllIIllIIllllIlIIlII &= lIIIlIlllIIll[14];
      return lllllllllllllllIIllIIllllIlIIIIl << lIIIlIlllIIll[15] | lllllllllllllllIIllIIllllIlIIlII;
   }

   private static String lIllIIlIlIIIll(String lllllllllllllllIIllIIllllIIIIlII, String lllllllllllllllIIllIIllllIIIIIll) {
      lllllllllllllllIIllIIllllIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      char lllllllllllllllIIllIIllllIIIIIlI = new StringBuilder();
      char[] lllllllllllllllIIllIIllllIIIIllI = lllllllllllllllIIllIIllllIIIIIll.toCharArray();
      short lllllllllllllllIIllIIllllIIIIIII = lIIIlIlllIIll[0];
      byte lllllllllllllllIIllIIlllIlllllll = lllllllllllllllIIllIIllllIIIIlII.toCharArray();
      boolean lllllllllllllllIIllIIlllIllllllI = lllllllllllllllIIllIIlllIlllllll.length;
      int lllllllllllllllIIllIIlllIlllllIl = lIIIlIlllIIll[0];

      do {
         if (!lIllIIlIlIllII(lllllllllllllllIIllIIlllIlllllIl, lllllllllllllllIIllIIlllIllllllI)) {
            return String.valueOf(lllllllllllllllIIllIIllllIIIIIlI);
         }

         char lllllllllllllllIIllIIllllIIIlIlI = lllllllllllllllIIllIIlllIlllllll[lllllllllllllllIIllIIlllIlllllIl];
         lllllllllllllllIIllIIllllIIIIIlI.append((char)(lllllllllllllllIIllIIllllIIIlIlI ^ lllllllllllllllIIllIIllllIIIIllI[lllllllllllllllIIllIIllllIIIIIII % lllllllllllllllIIllIIllllIIIIllI.length]));
         "".length();
         ++lllllllllllllllIIllIIllllIIIIIII;
         ++lllllllllllllllIIllIIlllIlllllIl;
         "".length();
      } while(" ".length() << " ".length() > 0);

      return null;
   }

   private static String lIllIIlIlIIlII(String lllllllllllllllIIllIIllllIIllIIl, String lllllllllllllllIIllIIllllIIllIII) {
      try {
         int lllllllllllllllIIllIIllllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIllllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Exception lllllllllllllllIIllIIllllIIlIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIIllllIIlIlII.init(lIIIlIlllIIll[2], lllllllllllllllIIllIIllllIIlIlIl);
         return new String(lllllllllllllllIIllIIllllIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIllllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIllIIlIlIlIlI(Object var0) {
      return var0 != null;
   }

   private static void lIllIIlIlIIlll() {
      lIIIlIlllIIll = new int[16];
      lIIIlIlllIIll[0] = " ".length() << " ".length() & ~(" ".length() << " ".length());
      lIIIlIlllIIll[1] = " ".length();
      lIIIlIlllIIll[2] = " ".length() << " ".length();
      lIIIlIlllIIll[3] = "   ".length();
      lIIIlIlllIIll[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIlllIIll[5] = 161 ^ 164;
      lIIIlIlllIIll[6] = "   ".length() << " ".length();
      lIIIlIlllIIll[7] = 119 ^ 112;
      lIIIlIlllIIll[8] = -" ".length();
      lIIIlIlllIIll[9] = 103 ^ 68 ^ (6 ^ 1) << (" ".length() << " ".length());
      lIIIlIlllIIll[10] = " ".length() << (92 ^ 89);
      lIIIlIlllIIll[11] = " ".length() << "   ".length();
      lIIIlIlllIIll[12] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIlIlllIIll[13] = ((77 ^ 86) << (" ".length() << " ".length()) ^ 18 ^ 103) << (" ".length() << " ".length());
      lIIIlIlllIIll[14] = ('ꇅ' + 110342 - 119929 + 110963 << (" ".length() << " ".length())) + (3321149 + 2404373 - 3518382 + 1209927 << " ".length()) - -(1121302 + 3676963 - 2596361 + 3706554) + 884220 + 1129939 - -239253 + 1210055;
      lIIIlIlllIIll[15] = "   ".length() << "   ".length();
   }

   private static boolean lIllIIlIlIlIII(int var0) {
      return var0 == 0;
   }

   private static boolean lIllIIlIlIlIll(int var0, int var1) {
      return var0 != var1;
   }

   public StorageESP() {
      lllllllllllllllIIllIIlllllIIllIl.chest = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[0]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.dispenser = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[1]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.shulker = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[2]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.echest = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[3]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.furnace = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[4]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.hopper = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[5]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.cart = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[6]], (boolean)lIIIlIlllIIll[1]));
      lllllllllllllllIIllIIlllllIIllIl.frame = lllllllllllllllIIllIIlllllIIllIl.register(Settings.b(lIIIlIlllIIlI[lIIIlIlllIIll[7]], (boolean)lIIIlIlllIIll[1]));
   }

   private int getEntityColor(Entity lllllllllllllllIIllIIlllllIIIlIl) {
      if (lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIIlIl instanceof EntityMinecartChest)) {
         return ColourUtils.Colors.ORANGE;
      } else if (lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIIlIl instanceof EntityItemFrame) && lIllIIlIlIlIIl(((EntityItemFrame)lllllllllllllllIIllIIlllllIIIlIl).func_82335_i().func_77973_b() instanceof ItemShulkerBox)) {
         return ColourUtils.Colors.YELLOW;
      } else {
         return lIllIIlIlIlIIl(lllllllllllllllIIllIIlllllIIIlIl instanceof EntityItemFrame) && lIllIIlIlIlIII(((EntityItemFrame)lllllllllllllllIIllIIlllllIIIlIl).func_82335_i().func_77973_b() instanceof ItemShulkerBox) ? ColourUtils.Colors.ORANGE : lIIIlIlllIIll[8];
      }
   }

   private static String lIllIIlIlIIlIl(String lllllllllllllllIIllIIlllIlllIlII, String lllllllllllllllIIllIIlllIlllIIIl) {
      try {
         short lllllllllllllllIIllIIlllIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIlllIlllIIIl.getBytes(StandardCharsets.UTF_8)), lIIIlIlllIIll[11]), "DES");
         long lllllllllllllllIIllIIlllIllIllll = Cipher.getInstance("DES");
         lllllllllllllllIIllIIlllIllIllll.init(lIIIlIlllIIll[2], lllllllllllllllIIllIIlllIlllIIII);
         return new String(lllllllllllllllIIllIIlllIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIlllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public class Triplet<T, U, V> {
      // $FF: synthetic field
      private final V third;
      // $FF: synthetic field
      private final T first;
      // $FF: synthetic field
      private final U second;

      public V getThird() {
         return lllllllllllllllIIllllIlIIIlIllII.third;
      }

      public Triplet(T lllllllllllllllIIllllIlIIIllllII, U lllllllllllllllIIllllIlIIIlllIll, V lllllllllllllllIIllllIlIIIlllIlI) {
         lllllllllllllllIIllllIlIIIlllllI.first = lllllllllllllllIIllllIlIIIllllII;
         lllllllllllllllIIllllIlIIIlllllI.second = lllllllllllllllIIllllIlIIIlllIll;
         lllllllllllllllIIllllIlIIIlllllI.third = lllllllllllllllIIllllIlIIIlllIlI;
      }

      public T getFirst() {
         return lllllllllllllllIIllllIlIIIllIIll.first;
      }

      public U getSecond() {
         return lllllllllllllllIIllllIlIIIlIllll.second;
      }
   }
}
