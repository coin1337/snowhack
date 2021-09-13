package rr.snowhack.snow.module.modules.render;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.AbstractHorse;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.NonNullList;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.util.ColourHolder;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.MojangWebApi;

@Module.Info(
   name = "Nametags",
   description = "Draws descriptive nametags above entities",
   category = Module.Category.RENDER
)
public class Nametags extends Module {
   // $FF: synthetic field
   private Setting<Boolean> armor;
   // $FF: synthetic field
   private static final String[] lllIllIlllII;
   // $FF: synthetic field
   private Setting<Float> scale;
   // $FF: synthetic field
   private Setting<Boolean> ping;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   private Setting<Boolean> mobs;
   // $FF: synthetic field
   private Setting<Double> range;
   // $FF: synthetic field
   private Setting<Boolean> animals;
   // $FF: synthetic field
   CFontRenderer cFontRenderer2;
   // $FF: synthetic field
   private Setting<Boolean> players;
   // $FF: synthetic field
   private Setting<Boolean> owner;
   // $FF: synthetic field
   private static final int[] lllIllIlllIl;
   // $FF: synthetic field
   static final Minecraft mc;
   // $FF: synthetic field
   private Setting<Boolean> health;

   private static void lIIlllIIIIIlIl() {
      lllIllIlllII = new String[lllIllIlllIl[70]];
      lllIllIlllII[lllIllIlllIl[0]] = lIIlllIIIIIIlI("Oi0HFjcYMg==", "jAfoR");
      lllIllIlllII[lllIllIlllIl[1]] = lIIlllIIIIIIlI("MSQ5ABccOQ==", "pJPmv");
      lllIllIlllII[lllIllIlllIl[2]] = lIIlllIIIIIIll("knAAQNvqQBY=", "vKdpN");
      lllIllIlllII[lllIllIlllIl[3]] = lIIlllIIIIIIlI("DDcPUC02NggC", "AXmpb");
      lllIllIlllII[lllIllIlllIl[4]] = lIIlllIIIIIlII("IcW/mJW9xDA=", "HVlWj");
      lllIllIlllII[lllIllIlllIl[5]] = lIIlllIIIIIIll("6eG3FJCeAk4=", "SuOZS");
      lllIllIlllII[lllIllIlllIl[6]] = lIIlllIIIIIIlI("MgAjBQ4=", "acBik");
      lllIllIlllII[lllIllIlllIl[7]] = lIIlllIIIIIlII("mgZ3qWwocWM=", "BmxsG");
      lllIllIlllII[lllIllIlllIl[8]] = lIIlllIIIIIIlI("GwEcBTc=", "ZsqjE");
      lllIllIlllII[lllIllIlllIl[9]] = lIIlllIIIIIIlI("JSMBIjAdJw==", "sFsFQ");
      lllIllIlllII[lllIllIlllIl[11]] = lIIlllIIIIIIll("g1UlpDu3SgA=", "donoy");
      lllIllIlllII[lllIllIlllIl[12]] = lIIlllIIIIIlII("92itTeGflME=", "OmxBd");
      lllIllIlllII[lllIllIlllIl[13]] = lIIlllIIIIIIll("mbU5T0xwLII=", "wPsvD");
      lllIllIlllII[lllIllIlllIl[19]] = lIIlllIIIIIIlI("bg==", "NByzc");
      lllIllIlllII[lllIllIlllIl[20]] = lIIlllIIIIIlII("L5MMvNxlIhM=", "AYUnh");
      lllIllIlllII[lllIllIlllIl[21]] = lIIlllIIIIIIlI("dl1SFAU=", "Vpcyv");
      lllIllIlllII[lllIllIlllIl[22]] = lIIlllIIIIIIlI("", "soLeu");
      lllIllIlllII[lllIllIlllIl[23]] = lIIlllIIIIIlII("UeDW2pu+KR4=", "AFeTV");
      lllIllIlllII[lllIllIlllIl[10]] = lIIlllIIIIIIll("SOp7VeSy6uE=", "RmPyA");
      lllIllIlllII[lllIllIlllIl[29]] = lIIlllIIIIIlII("aQj14IZymhI=", "PAkgO");
      lllIllIlllII[lllIllIlllIl[27]] = lIIlllIIIIIIlI("DSQD", "YLqnT");
      lllIllIlllII[lllIllIlllIl[30]] = lIIlllIIIIIIll("trEZy/TtH4c=", "QwXnP");
      lllIllIlllII[lllIllIlllIl[31]] = lIIlllIIIIIIlI("JAEC", "bhcYZ");
      lllIllIlllII[lllIllIlllIl[32]] = lIIlllIIIIIlII("DXp4hGSQAek=", "VvecZ");
      lllIllIlllII[lllIllIlllIl[33]] = lIIlllIIIIIlII("GSDA0QnqYak=", "WkbSJ");
      lllIllIlllII[lllIllIlllIl[34]] = lIIlllIIIIIlII("EdamH226jAE=", "fWjhl");
      lllIllIlllII[lllIllIlllIl[35]] = lIIlllIIIIIlII("pKBE0eW3a34=", "qBJRA");
      lllIllIlllII[lllIllIlllIl[36]] = lIIlllIIIIIlII("HQzydYCFh10=", "jAfqR");
      lllIllIlllII[lllIllIlllIl[37]] = lIIlllIIIIIIlI("Kzwo", "iPIVK");
      lllIllIlllII[lllIllIlllIl[28]] = lIIlllIIIIIIlI("MTkw", "aIBNS");
      lllIllIlllII[lllIllIlllIl[38]] = lIIlllIIIIIlII("+c20GmNke5o=", "VUYoW");
      lllIllIlllII[lllIllIlllIl[39]] = lIIlllIIIIIIll("OzI/YS14clU=", "TiTjM");
      lllIllIlllII[lllIllIlllIl[40]] = lIIlllIIIIIIlI("Eioo", "VOXjL");
      lllIllIlllII[lllIllIlllIl[41]] = lIIlllIIIIIIlI("NAYe", "rtqoA");
      lllIllIlllII[lllIllIlllIl[42]] = lIIlllIIIIIlII("h+weUgOPAGk=", "IjtcR");
      lllIllIlllII[lllIllIlllIl[43]] = lIIlllIIIIIIll("ojMTaWhGuV8=", "cBYYq");
      lllIllIlllII[lllIllIlllIl[44]] = lIIlllIIIIIIll("gZtnDGZCBFk=", "COHrR");
      lllIllIlllII[lllIllIlllIl[45]] = lIIlllIIIIIIlI("Khwd", "fsrWR");
      lllIllIlllII[lllIllIlllIl[46]] = lIIlllIIIIIIll("ce7cT10X2o4=", "mqphS");
      lllIllIlllII[lllIllIlllIl[47]] = lIIlllIIIIIIlI("LRU2", "hsPti");
      lllIllIlllII[lllIllIlllIl[48]] = lIIlllIIIIIlII("dLkuu0jgkfo=", "iXSJa");
      lllIllIlllII[lllIllIlllIl[49]] = lIIlllIIIIIIlI("NgEw", "pnBOg");
      lllIllIlllII[lllIllIlllIl[50]] = lIIlllIIIIIIll("fB3NScFD57c=", "gZdEy");
      lllIllIlllII[lllIllIlllIl[51]] = lIIlllIIIIIlII("ZekXlXtMlHo=", "VYSHZ");
      lllIllIlllII[lllIllIlllIl[52]] = lIIlllIIIIIIlI("Ox0B", "whscw");
      lllIllIlllII[lllIllIlllIl[53]] = lIIlllIIIIIIlI("FBUG", "YphxM");
      lllIllIlllII[lllIllIlllIl[54]] = lIIlllIIIIIlII("YRUBiDwvElA=", "QfjXs");
      lllIllIlllII[lllIllIlllIl[55]] = lIIlllIIIIIIlI("MywP", "cYapZ");
      lllIllIlllII[lllIllIlllIl[57]] = lIIlllIIIIIlII("FNQk7pJbOZE=", "ZjFAV");
      lllIllIlllII[lllIllIlllIl[59]] = lIIlllIIIIIIll("UN7ba0iyQu4=", "kvbtx");
      lllIllIlllII[lllIllIlllIl[60]] = lIIlllIIIIIIlI("", "EJeAH");
      lllIllIlllII[lllIllIlllIl[61]] = lIIlllIIIIIIlI("w78A", "XfwaJ");
      lllIllIlllII[lllIllIlllIl[62]] = lIIlllIIIIIIlI("ISUU", "WDzCm");
      lllIllIlllII[lllIllIlllIl[63]] = lIIlllIIIIIIll("jZ9Za790xwI=", "udirf");
      lllIllIlllII[lllIllIlllIl[17]] = lIIlllIIIIIlII("2cGqRmf0S8U=", "fohpr");
      lllIllIlllII[lllIllIlllIl[64]] = lIIlllIIIIIIll("wCFjLZ352xc=", "xUppU");
      lllIllIlllII[lllIllIlllIl[65]] = lIIlllIIIIIlII("TIskQAJGlgM=", "hMvnr");
      lllIllIlllII[lllIllIlllIl[66]] = lIIlllIIIIIIll("Ke3CyQQEFFI=", "itjhN");
      lllIllIlllII[lllIllIlllIl[67]] = lIIlllIIIIIlII("YHLpT9Ar4OptSEDxudj8mA==", "agQPp");
      lllIllIlllII[lllIllIlllIl[68]] = lIIlllIIIIIlII("nmiRktowX4pHoua2E42VZg==", "bBGrx");
      lllIllIlllII[lllIllIlllIl[69]] = lIIlllIIIIIIll("Wn+mHsbq0v4=", "XyeVf");
   }

   private static void lIIlllIIIIIlll() {
      lllIllIlllIl = new int[71];
      lllIllIlllIl[0] = (100 ^ 105) & ~(56 ^ 53);
      lllIllIlllIl[1] = " ".length();
      lllIllIlllIl[2] = " ".length() << " ".length();
      lllIllIlllIl[3] = "   ".length();
      lllIllIlllIl[4] = " ".length() << (" ".length() << " ".length());
      lllIllIlllIl[5] = 26 ^ 11 ^ (108 ^ 105) << (" ".length() << " ".length());
      lllIllIlllIl[6] = "   ".length() << " ".length();
      lllIllIlllIl[7] = (0 ^ 85) << " ".length() ^ 57 + 136 - 95 + 75;
      lllIllIlllIl[8] = " ".length() << "   ".length();
      lllIllIlllIl[9] = (71 ^ 32) << " ".length() ^ 69 + 37 - 10 + 103;
      lllIllIlllIl[10] = ((104 ^ 15) << " ".length() ^ 104 + 195 - 135 + 35) << " ".length();
      lllIllIlllIl[11] = (102 ^ 99) << " ".length();
      lllIllIlllIl[12] = 127 ^ 116;
      lllIllIlllIl[13] = "   ".length() << (" ".length() << " ".length());
      lllIllIlllIl[14] = -" ".length();
      lllIllIlllIl[15] = 77 ^ 112 ^ (2 ^ 21) << (" ".length() << " ".length());
      lllIllIlllIl[16] = 80 ^ 53;
      lllIllIlllIl[17] = (173 ^ 182) << " ".length();
      lllIllIlllIl[18] = 52 ^ 87;
      lllIllIlllIl[19] = 15 + 55 - 43 + 180 ^ (107 ^ 10) << " ".length();
      lllIllIlllIl[20] = ((213 ^ 134) << " ".length() ^ 119 + 96 - 211 + 157) << " ".length();
      lllIllIlllIl[21] = 91 ^ 84;
      lllIllIlllIl[22] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIllIlllIl[23] = 187 ^ 170;
      lllIllIlllIl[24] = 17660 + 24263 - 11328 + 2130 << (106 ^ 99);
      lllIllIlllIl[25] = 1204541 + 5971274 - 5945956 + 7152608 + (200555 + 74383 - '\ue5f7' + 569386 << "   ".length()) - -(165803 + 348917 - 227447 + 102668) + 87953 + 128977 - -1402049 + 102204;
      lllIllIlllIl[26] = 30369 + 9752 - -17737 + 7677;
      lllIllIlllIl[27] = (82 ^ 87) << (" ".length() << " ".length());
      lllIllIlllIl[28] = 43 + 49 - -80 + 5 ^ (155 ^ 176) << (" ".length() << " ".length());
      lllIllIlllIl[29] = 36 ^ 55;
      lllIllIlllIl[30] = (72 ^ 31) << " ".length() ^ 4 + 85 - 14 + 112;
      lllIllIlllIl[31] = (57 ^ 50) << " ".length();
      lllIllIlllIl[32] = 164 ^ 179;
      lllIllIlllIl[33] = "   ".length() << "   ".length();
      lllIllIlllIl[34] = 109 ^ 116;
      lllIllIlllIl[35] = (41 ^ 36) << " ".length();
      lllIllIlllIl[36] = 97 ^ 122;
      lllIllIlllIl[37] = ((88 ^ 79) << (" ".length() << " ".length()) ^ 44 ^ 119) << (" ".length() << " ".length());
      lllIllIlllIl[38] = (2 ^ 13) << " ".length();
      lllIllIlllIl[39] = " ".length() << " ".length() ^ 49 ^ 44;
      lllIllIlllIl[40] = " ".length() << ("   ".length() << (" ".length() << " ".length()) ^ 66 ^ 75);
      lllIllIlllIl[41] = (163 ^ 132) << " ".length() ^ 19 ^ 124;
      lllIllIlllIl[42] = (93 ^ 76) << " ".length();
      lllIllIlllIl[43] = (5 ^ 34) << (" ".length() << " ".length()) ^ 81 + 100 - 127 + 137;
      lllIllIlllIl[44] = ("   ".length() << (19 ^ 22) ^ 255 ^ 150) << (" ".length() << " ".length());
      lllIllIlllIl[45] = (53 ^ 20) << " ".length() ^ 84 ^ 51;
      lllIllIlllIl[46] = (42 ^ 57) << " ".length();
      lllIllIlllIl[47] = 15 ^ 40;
      lllIllIlllIl[48] = (243 ^ 134 ^ (142 ^ 137) << (" ".length() << (" ".length() << " ".length()))) << "   ".length();
      lllIllIlllIl[49] = (34 ^ 47) << (" ".length() << " ".length()) ^ 26 ^ 7;
      lllIllIlllIl[50] = (101 ^ 118 ^ "   ".length() << " ".length()) << " ".length();
      lllIllIlllIl[51] = 109 ^ 70;
      lllIllIlllIl[52] = (73 + 32 - 52 + 90 ^ (63 ^ 30) << (" ".length() << " ".length())) << (" ".length() << " ".length());
      lllIllIlllIl[53] = 173 ^ 128;
      lllIllIlllIl[54] = (30 ^ 9) << " ".length();
      lllIllIlllIl[55] = 60 ^ 19;
      lllIllIlllIl[56] = " ".length() << (" ".length() << "   ".length());
      lllIllIlllIl[57] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIllIlllIl[58] = (250 ^ 195 ^ " ".length() << (116 ^ 113)) << (" ".length() << " ".length());
      lllIllIlllIl[59] = 66 + 140 - 90 + 45 ^ (202 ^ 195) << (" ".length() << (" ".length() << " ".length()));
      lllIllIlllIl[60] = (18 ^ 11) << " ".length();
      lllIllIlllIl[61] = 154 ^ 169;
      lllIllIlllIl[62] = (164 + 110 - 119 + 34 ^ (5 ^ 14) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
      lllIllIlllIl[63] = 140 ^ 185;
      lllIllIlllIl[64] = " ".length() << (180 ^ 179) ^ 175 + 70 - 66 + 4;
      lllIllIlllIl[65] = (174 ^ 169) << "   ".length();
      lllIllIlllIl[66] = "   ".length() << (" ".length() << " ".length()) ^ 189 ^ 136;
      lllIllIlllIl[67] = (107 ^ 118) << " ".length();
      lllIllIlllIl[68] = 45 + 135 - 161 + 152 ^ (75 ^ 66) << (" ".length() << (" ".length() << " ".length()));
      lllIllIlllIl[69] = ((52 ^ 33) << "   ".length() ^ 24 + 125 - -13 + 5) << (" ".length() << " ".length());
      lllIllIlllIl[70] = (202 ^ 197) << " ".length() ^ 33 ^ 2;
   }

   private void drawNametag(Entity lllllllllllllllIlIllIllIIlIIllll) {
      GlStateManager.func_179094_E();
      boolean lllllllllllllllIlIllIllIIIllllII = EntityUtil.getInterpolatedRenderPos(lllllllllllllllIlIllIllIIlIIllll, mc.func_184121_ak());
      float var10000 = lllllllllllllllIlIllIllIIlIIllll.field_70131_O + 0.5F;
      float var10001;
      if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIlIIllll.func_70093_af())) {
         var10001 = 0.25F;
         "".length();
         if (" ".length() << " ".length() <= 0) {
            return;
         }
      } else {
         var10001 = 0.0F;
      }

      float lllllllllllllllIlIllIllIIlIIllIl = var10000 - var10001;
      double lllllllllllllllIlIllIllIIlIIllII = lllllllllllllllIlIllIllIIIllllII.field_72450_a;
      double lllllllllllllllIlIllIllIIlIIlIll = lllllllllllllllIlIllIllIIIllllII.field_72448_b + (double)lllllllllllllllIlIllIllIIlIIllIl;
      byte lllllllllllllllIlIllIllIIIlllIII = lllllllllllllllIlIllIllIIIllllII.field_72449_c;
      Exception lllllllllllllllIlIllIllIIIllIlll = mc.func_175598_ae().field_78735_i;
      Exception lllllllllllllllIlIllIllIIIllIllI = mc.func_175598_ae().field_78732_j;
      int var21;
      if (lIIlllIIIIlllI(mc.func_175598_ae().field_78733_k.field_74320_O, lllIllIlllIl[2])) {
         var21 = lllIllIlllIl[1];
         "".length();
         if (" ".length() != " ".length()) {
            return;
         }
      } else {
         var21 = lllIllIlllIl[0];
      }

      double lllllllllllllllIlIllIllIIIllIlIl = var21;
      GlStateManager.func_179137_b(lllllllllllllllIlIllIllIIlIIllII, lllllllllllllllIlIllIllIIlIIlIll, lllllllllllllllIlIllIllIIIlllIII);
      GlStateManager.func_179114_b(-lllllllllllllllIlIllIllIIIllIlll, 0.0F, 1.0F, 0.0F);
      if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIIllIlIl)) {
         var21 = lllIllIlllIl[14];
         "".length();
         if (" ".length() < 0) {
            return;
         }
      } else {
         var21 = lllIllIlllIl[1];
      }

      GlStateManager.func_179114_b((float)var21 * lllllllllllllllIlIllIllIIIllIllI, 1.0F, 0.0F, 0.0F);
      float lllllllllllllllIlIllIllIIlIIIllI = mc.field_71439_g.func_70032_d(lllllllllllllllIlIllIllIIlIIllll);
      String lllllllllllllllIlIllIllIIIllIIll = lllllllllllllllIlIllIllIIlIIIllI / 8.0F * (float)Math.pow(1.258925437927246D, (double)(Float)lllllllllllllllIlIllIllIIIlllllI.scale.getValue());
      GlStateManager.func_179152_a(lllllllllllllllIlIllIllIIIllIIll, lllllllllllllllIlIllIllIIIllIIll, lllllllllllllllIlIllIllIIIllIIll);
      GlStateManager.func_179152_a(-0.025F, -0.025F, 0.025F);
      float lllllllllllllllIlIllIllIIlIIIIll = ((EntityLivingBase)lllllllllllllllIlIllIllIIlIIllll).func_110143_aJ() + ((EntityLivingBase)lllllllllllllllIlIllIllIIlIIllll).func_110139_bj();
      int lllllllllllllllIlIllIllIIlIIIlII;
      if (lIIlllIIIIllll(lIIlllIIIIllII(lllllllllllllllIlIllIllIIlIIIIll, 19.0F))) {
         lllllllllllllllIlIllIllIIlIIIlII = lllIllIlllIl[15];
         "".length();
         if (-" ".length() == " ".length() << " ".length()) {
            return;
         }
      } else if (lIIlllIIIlIIII(lIIlllIIIIllII(lllllllllllllllIlIllIllIIlIIIIll, 10.0F))) {
         lllllllllllllllIlIllIllIIlIIIlII = lllIllIlllIl[16];
         "".length();
         if (-"   ".length() >= 0) {
            return;
         }
      } else if (lIIlllIIIlIIII(lIIlllIIIIllII(lllllllllllllllIlIllIllIIlIIIIll, 5.0F))) {
         lllllllllllllllIlIllIllIIlIIIlII = lllIllIlllIl[17];
         "".length();
         if (" ".length() << (" ".length() << " ".length()) < " ".length() << (" ".length() << " ".length())) {
            return;
         }
      } else {
         lllllllllllllllIlIllIllIIlIIIlII = lllIllIlllIl[18];
      }

      StringBuilder var23 = (new StringBuilder()).append(lllllllllllllllIlIllIllIIlIIllll.func_70005_c_());
      String var22;
      if (lIIlllIIIIlIII((Boolean)lllllllllllllllIlIllIllIIIlllllI.ping.getValue())) {
         if (lIIlllIIIIlIIl(mc.func_147114_u()) && lIIlllIIIIlIIl(mc.func_147114_u().func_175102_a(lllllllllllllllIlIllIllIIlIIllll.func_110124_au()))) {
            var22 = String.valueOf((new StringBuilder()).append(lllIllIlllII[lllIllIlllIl[19]]).append(mc.func_147114_u().func_175102_a(lllllllllllllllIlIllIllIIlIIllll.func_110124_au()).func_178853_c()).append(lllIllIlllII[lllIllIlllIl[20]]));
            "".length();
            if (" ".length() == 0) {
               return;
            }
         } else {
            var22 = lllIllIlllII[lllIllIlllIl[21]];
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) > 0) {
               return;
            }
         }
      } else {
         var22 = lllIllIlllII[lllIllIlllIl[22]];
      }

      var23 = var23.append(var22);
      float var10002;
      if (lIIlllIIIIlIII((Boolean)lllllllllllllllIlIllIllIIIlllllI.health.getValue())) {
         StringBuilder var25 = (new StringBuilder()).append(lllIllIlllII[lllIllIlllIl[23]]).append(Command.SECTIONSIGN()).append((char)lllllllllllllllIlIllIllIIlIIIlII);
         var10002 = ((EntityLivingBase)lllllllllllllllIlIllIllIIlIIllll).func_110143_aJ();
         float var10003;
         if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIlIIllll instanceof EntityPlayer)) {
            var10003 = ((EntityPlayer)lllllllllllllllIlIllIllIIlIIllll).func_110139_bj();
            "".length();
            if (((187 ^ 154) << " ".length() & ~((45 ^ 12) << " ".length())) != 0) {
               return;
            }
         } else {
            var10003 = 0.0F;
         }

         var22 = String.valueOf(var25.append(Math.round(var10002 + var10003)));
         "".length();
         if (null != null) {
            return;
         }
      } else {
         var22 = lllIllIlllII[lllIllIlllIl[10]];
      }

      String lllllllllllllllIlIllIllIIlIIIIlI = String.valueOf(var23.append(var22));
      double lllllllllllllllIlIllIllIIIlIllll = lllllllllllllllIlIllIllIIIlllllI.cFontRenderer.getStringWidth(lllllllllllllllIlIllIllIIlIIIIlI) / lllIllIlllIl[2];
      GlStateManager.func_179147_l();
      GlStateManager.func_187428_a(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
      GlStateManager.func_179090_x();
      Tessellator lllllllllllllllIlIllIllIIlIIIIII = Tessellator.func_178181_a();
      BufferBuilder lllllllllllllllIlIllIllIIIllllll = lllllllllllllllIlIllIllIIlIIIIII.func_178180_c();
      GlStateManager.func_179097_i();
      GL11.glTranslatef(0.0F, -20.0F, 0.0F);
      lllllllllllllllIlIllIllIIIllllll.func_181668_a(lllIllIlllIl[7], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(-lllllllllllllllIlIllIllIIIlIllll - lllIllIlllIl[1]), 8.0D, 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(-lllllllllllllllIlIllIllIIIlIllll - lllIllIlllIl[1]), 19.0D, 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(lllllllllllllllIlIllIllIIIlIllll + lllIllIlllIl[1]), 19.0D, 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(lllllllllllllllIlIllIllIIIlIllll + lllIllIlllIl[1]), 8.0D, 0.0D).func_181666_a(0.0F, 0.0F, 0.0F, 0.5F).func_181675_d();
      lllllllllllllllIlIllIllIIlIIIIII.func_78381_a();
      lllllllllllllllIlIllIllIIIllllll.func_181668_a(lllIllIlllIl[2], DefaultVertexFormats.field_181706_f);
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(-lllllllllllllllIlIllIllIIIlIllll - lllIllIlllIl[1]), 8.0D, 0.0D).func_181666_a(0.1F, 0.1F, 0.1F, 0.1F).func_181675_d();
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(-lllllllllllllllIlIllIllIIIlIllll - lllIllIlllIl[1]), 19.0D, 0.0D).func_181666_a(0.1F, 0.1F, 0.1F, 0.1F).func_181675_d();
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(lllllllllllllllIlIllIllIIIlIllll + lllIllIlllIl[1]), 19.0D, 0.0D).func_181666_a(0.1F, 0.1F, 0.1F, 0.1F).func_181675_d();
      lllllllllllllllIlIllIllIIIllllll.func_181662_b((double)(lllllllllllllllIlIllIllIIIlIllll + lllIllIlllIl[1]), 8.0D, 0.0D).func_181666_a(0.1F, 0.1F, 0.1F, 0.1F).func_181675_d();
      lllllllllllllllIlIllIllIIlIIIIII.func_78381_a();
      GlStateManager.func_179098_w();
      GlStateManager.func_187432_a(0.0F, 1.0F, 0.0F);
      if (lIIlllIIIIlIll(Friends.isFriend(lllllllllllllllIlIllIllIIlIIllll.func_70005_c_()))) {
         CFontRenderer var24 = lllllllllllllllIlIllIllIIIlllllI.cFontRenderer;
         var10002 = (float)(-lllllllllllllllIlIllIllIIIlIllll);
         int var10004;
         if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIlIIllll instanceof EntityPlayer)) {
            if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIlIIllll.func_70093_af())) {
               var10004 = lllIllIlllIl[24];
               "".length();
               if (((82 ^ 127) & ~(105 ^ 68)) > " ".length() << " ".length()) {
                  return;
               }
            } else {
               var10004 = lllIllIlllIl[25];
               "".length();
               if (" ".length() << " ".length() < 0) {
                  return;
               }
            }
         } else {
            var10004 = lllIllIlllIl[25];
         }

         var24.drawString(lllllllllllllllIlIllIllIIlIIIIlI, var10002, 10.0F, var10004);
         "".length();
         "".length();
         if (((79 + 133 - 84 + 81 ^ (228 ^ 165) << " ".length()) & (113 + 149 - 244 + 193 ^ " ".length() << (40 ^ 47) ^ -" ".length())) >= " ".length() << " ".length()) {
            return;
         }
      } else {
         lllllllllllllllIlIllIllIIIlllllI.cFontRenderer.drawString(lllllllllllllllIlIllIllIIlIIIIlI, (float)(-lllllllllllllllIlIllIllIIIlIllll), 10.0F, lllIllIlllIl[26]);
         "".length();
      }

      if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIlIIllll instanceof EntityPlayer) && lIIlllIIIIlIII((Boolean)lllllllllllllllIlIllIllIIIlllllI.armor.getValue())) {
         lllllllllllllllIlIllIllIIIlllllI.renderArmor((EntityPlayer)lllllllllllllllIlIllIllIIlIIllll, lllIllIlllIl[0], -(lllllllllllllllIlIllIllIIIlllllI.cFontRenderer.getHeight() + lllIllIlllIl[1]) - lllIllIlllIl[27]);
      }

      GlStateManager.func_187432_a(0.0F, 0.0F, 0.0F);
      GL11.glTranslatef(0.0F, 20.0F, 0.0F);
      GlStateManager.func_179152_a(-40.0F, -40.0F, 40.0F);
      GlStateManager.func_179126_j();
      GlStateManager.func_179121_F();
   }

   public void renderItem(ItemStack lllllllllllllllIlIllIlIlllIllIII, int lllllllllllllllIlIllIlIlllIlIlll, int lllllllllllllllIlIllIlIlllIlIllI) {
      FontRenderer lllllllllllllllIlIllIlIlllIllllI = mc.field_71466_p;
      String lllllllllllllllIlIllIlIlllIlIlII = mc.func_175599_af();
      Nametags.EnchantEntry[] var10000 = new Nametags.EnchantEntry[lllIllIlllIl[28]];
      var10000[lllIllIlllIl[0]] = new Nametags.EnchantEntry(Enchantments.field_180310_c, lllIllIlllII[lllIllIlllIl[29]]);
      var10000[lllIllIlllIl[1]] = new Nametags.EnchantEntry(Enchantments.field_92091_k, lllIllIlllII[lllIllIlllIl[27]]);
      var10000[lllIllIlllIl[2]] = new Nametags.EnchantEntry(Enchantments.field_185302_k, lllIllIlllII[lllIllIlllIl[30]]);
      var10000[lllIllIlllIl[3]] = new Nametags.EnchantEntry(Enchantments.field_77334_n, lllIllIlllII[lllIllIlllIl[31]]);
      var10000[lllIllIlllIl[4]] = new Nametags.EnchantEntry(Enchantments.field_180313_o, lllIllIlllII[lllIllIlllIl[32]]);
      var10000[lllIllIlllIl[5]] = new Nametags.EnchantEntry(Enchantments.field_185307_s, lllIllIlllII[lllIllIlllIl[33]]);
      var10000[lllIllIlllIl[6]] = new Nametags.EnchantEntry(Enchantments.field_185309_u, lllIllIlllII[lllIllIlllIl[34]]);
      var10000[lllIllIlllIl[7]] = new Nametags.EnchantEntry(Enchantments.field_77329_d, lllIllIlllII[lllIllIlllIl[35]]);
      var10000[lllIllIlllIl[8]] = new Nametags.EnchantEntry(Enchantments.field_180309_e, lllIllIlllII[lllIllIlllIl[36]]);
      var10000[lllIllIlllIl[9]] = new Nametags.EnchantEntry(Enchantments.field_185297_d, lllIllIlllII[lllIllIlllIl[37]]);
      var10000[lllIllIlllIl[11]] = new Nametags.EnchantEntry(Enchantments.field_180308_g, lllIllIlllII[lllIllIlllIl[28]]);
      var10000[lllIllIlllIl[12]] = new Nametags.EnchantEntry(Enchantments.field_185298_f, lllIllIlllII[lllIllIlllIl[38]]);
      var10000[lllIllIlllIl[13]] = new Nametags.EnchantEntry(Enchantments.field_185299_g, lllIllIlllII[lllIllIlllIl[39]]);
      var10000[lllIllIlllIl[19]] = new Nametags.EnchantEntry(Enchantments.field_185300_i, lllIllIlllII[lllIllIlllIl[40]]);
      var10000[lllIllIlllIl[20]] = new Nametags.EnchantEntry(Enchantments.field_185301_j, lllIllIlllII[lllIllIlllIl[41]]);
      var10000[lllIllIlllIl[21]] = new Nametags.EnchantEntry(Enchantments.field_190941_k, lllIllIlllII[lllIllIlllIl[42]]);
      var10000[lllIllIlllIl[22]] = new Nametags.EnchantEntry(Enchantments.field_185303_l, lllIllIlllII[lllIllIlllIl[43]]);
      var10000[lllIllIlllIl[23]] = new Nametags.EnchantEntry(Enchantments.field_180312_n, lllIllIlllII[lllIllIlllIl[44]]);
      var10000[lllIllIlllIl[10]] = new Nametags.EnchantEntry(Enchantments.field_185304_p, lllIllIlllII[lllIllIlllIl[45]]);
      var10000[lllIllIlllIl[29]] = new Nametags.EnchantEntry(Enchantments.field_191530_r, lllIllIlllII[lllIllIlllIl[46]]);
      var10000[lllIllIlllIl[27]] = new Nametags.EnchantEntry(Enchantments.field_185305_q, lllIllIlllII[lllIllIlllIl[47]]);
      var10000[lllIllIlllIl[30]] = new Nametags.EnchantEntry(Enchantments.field_185306_r, lllIllIlllII[lllIllIlllIl[48]]);
      var10000[lllIllIlllIl[31]] = new Nametags.EnchantEntry(Enchantments.field_185308_t, lllIllIlllII[lllIllIlllIl[49]]);
      var10000[lllIllIlllIl[32]] = new Nametags.EnchantEntry(Enchantments.field_185311_w, lllIllIlllII[lllIllIlllIl[50]]);
      var10000[lllIllIlllIl[33]] = new Nametags.EnchantEntry(Enchantments.field_151370_z, lllIllIlllII[lllIllIlllIl[51]]);
      var10000[lllIllIlllIl[34]] = new Nametags.EnchantEntry(Enchantments.field_151369_A, lllIllIlllII[lllIllIlllIl[52]]);
      var10000[lllIllIlllIl[35]] = new Nametags.EnchantEntry(Enchantments.field_185296_A, lllIllIlllII[lllIllIlllIl[53]]);
      var10000[lllIllIlllIl[36]] = new Nametags.EnchantEntry(Enchantments.field_190940_C, lllIllIlllII[lllIllIlllIl[54]]);
      var10000[lllIllIlllIl[37]] = new Nametags.EnchantEntry(Enchantments.field_185310_v, lllIllIlllII[lllIllIlllIl[55]]);
      Nametags.EnchantEntry[] lllllllllllllllIlIllIlIlllIlllII = var10000;
      GlStateManager.func_179094_E();
      GlStateManager.func_179132_a((boolean)lllIllIlllIl[1]);
      GlStateManager.func_179086_m(lllIllIlllIl[56]);
      RenderHelper.func_74519_b();
      GlStateManager.func_179118_c();
      GlStateManager.func_179126_j();
      GlStateManager.func_179129_p();
      lllllllllllllllIlIllIlIlllIlIlII.field_77023_b = -100.0F;
      lllllllllllllllIlIllIlIlllIlIlII.func_175042_a(lllllllllllllllIlIllIlIlllIllIII, lllllllllllllllIlIllIlIlllIlIlll, lllllllllllllllIlIllIlIlllIlIllI);
      lllllllllllllllIlIllIlIlllIlIlII.func_180453_a(lllllllllllllllIlIllIlIlllIllllI, lllllllllllllllIlIllIlIlllIllIII, lllllllllllllllIlIllIlIlllIlIlll, lllllllllllllllIlIllIlIlllIlIllI, (String)null);
      RenderHelper.func_74518_a();
      GlStateManager.func_179089_o();
      GlStateManager.func_179141_d();
      GlStateManager.func_179097_i();
      if (lIIlllIIIIlIII(lllllllllllllllIlIllIlIlllIllIII.func_77984_f())) {
         lllllllllllllllIlIllIlIllllIIIlI.drawDamage(lllllllllllllllIlIllIlIlllIllIII, lllllllllllllllIlIllIlIlllIlIlll, lllllllllllllllIlIllIlIlllIlIllI);
      }

      Nametags.EnchantEntry[] lllllllllllllllIlIllIlIlllIllIll = lllllllllllllllIlIllIlIlllIlllII;
      int lllllllllllllllIlIllIlIlllIlIIIl = lllllllllllllllIlIllIlIlllIlllII.length;
      int lllllllllllllllIlIllIlIllllIIIll = lllIllIlllIl[0];

      do {
         if (!lIIlllIIIlIIlI(lllllllllllllllIlIllIlIllllIIIll, lllllllllllllllIlIllIlIlllIlIIIl)) {
            GlStateManager.func_179126_j();
            lllllllllllllllIlIllIlIlllIlIlII.field_77023_b = 0.0F;
            GlStateManager.func_179121_F();
            return;
         }

         byte lllllllllllllllIlIllIlIlllIIllll = lllllllllllllllIlIllIlIlllIllIll[lllllllllllllllIlIllIlIllllIIIll];
         boolean lllllllllllllllIlIllIlIlllIIlllI = EnchantmentHelper.func_77506_a(lllllllllllllllIlIllIlIlllIIllll.getEnchant(), lllllllllllllllIlIllIlIlllIllIII);
         float lllllllllllllllIlIllIlIlllIIllIl = String.valueOf((new StringBuilder()).append(lllIllIlllII[lllIllIlllIl[57]]).append(lllllllllllllllIlIllIlIlllIIlllI));
         if (lIIlllIIIlIIll(lllllllllllllllIlIllIlIlllIIlllI, lllIllIlllIl[58])) {
            lllllllllllllllIlIllIlIlllIIllIl = lllIllIlllII[lllIllIlllIl[59]];
         }

         if (lIIlllIIIIlllI(lllllllllllllllIlIllIlIlllIIlllI, lllIllIlllIl[1])) {
            lllllllllllllllIlIllIlIlllIIllIl = lllIllIlllII[lllIllIlllIl[60]];
         }

         int lllllllllllllllIlIllIlIlllIIllII = lllIllIlllII[lllIllIlllIl[61]];
         if (!lIIlllIIIIlIll(lllllllllllllllIlIllIlIlllIIllll.getName().equals(lllIllIlllII[lllIllIlllIl[62]])) || lIIlllIIIIlIII(lllllllllllllllIlIllIlIlllIIllll.getName().equals(lllIllIlllII[lllIllIlllIl[63]]))) {
            lllllllllllllllIlIllIlIlllIIllII = lllIllIlllII[lllIllIlllIl[17]];
         }

         if (lIIlllIIIIllll(lllllllllllllllIlIllIlIlllIIlllI)) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            lllllllllllllllIlIllIlIllllIIIlI.cFontRenderer2.drawString(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIlIlllIIllII).append(lllllllllllllllIlIllIlIlllIIllll.getName()).append(lllIllIlllII[lllIllIlllIl[64]]).append(lllllllllllllllIlIllIlIlllIIllIl)), (float)lllllllllllllllIlIllIlIlllIlIlll, (float)lllllllllllllllIlIllIlIlllIlIllI, Color.WHITE.getRGB());
            "".length();
            lllllllllllllllIlIllIlIlllIlIllI += lllllllllllllllIlIllIlIllllIIIlI.cFontRenderer2.getHeight() + lllIllIlllIl[2];
         }

         ++lllllllllllllllIlIllIlIllllIIIll;
         "".length();
      } while(-" ".length() <= " ".length() << " ".length());

   }

   public static List<ItemStack> getNBTtag(ItemStack lllllllllllllllIlIllIlIllIlIllll) {
      ArrayList<ItemStack> lllllllllllllllIlIllIlIllIlIlIll = new ArrayList();
      NBTTagCompound lllllllllllllllIlIllIlIllIlIlIlI;
      NBTTagCompound lllllllllllllllIlIllIlIllIllIIII;
      if (lIIlllIIIIlIIl(lllllllllllllllIlIllIlIllIlIlIlI = lllllllllllllllIlIllIlIllIlIllll.func_77978_p()) && lIIlllIIIIlIII(lllllllllllllllIlIllIlIllIlIlIlI.func_150297_b(lllIllIlllII[lllIllIlllIl[67]], lllIllIlllIl[11])) && lIIlllIIIIlIII((lllllllllllllllIlIllIlIllIllIIII = lllllllllllllllIlIllIlIllIlIlIlI.func_74775_l(lllIllIlllII[lllIllIlllIl[68]])).func_150297_b(lllIllIlllII[lllIllIlllIl[69]], lllIllIlllIl[9]))) {
         double lllllllllllllllIlIllIlIllIlIlIII = NonNullList.func_191197_a(lllIllIlllIl[36], ItemStack.field_190927_a);
         ItemStackHelper.func_191283_b(lllllllllllllllIlIllIlIllIllIIII, lllllllllllllllIlIllIlIllIlIlIII);
         return lllllllllllllllIlIllIlIllIlIlIII;
      } else {
         return lllllllllllllllIlIllIlIllIlIlIll;
      }
   }

   static {
      lIIlllIIIIIlll();
      lIIlllIIIIIlIl();
      mc = Minecraft.func_71410_x();
   }

   private static boolean lIIlllIIIlIlIl(int var0) {
      return var0 < 0;
   }

   private static boolean lIIlllIIIIlIII(int var0) {
      return var0 != 0;
   }

   public void onWorldRender(RenderEvent lllllllllllllllIlIllIllIIllIIlll) {
      if (!lIIlllIIIIlIlI(mc.func_175598_ae().field_78733_k)) {
         GlStateManager.func_179098_w();
         GlStateManager.func_179140_f();
         GlStateManager.func_179097_i();
         Minecraft.func_71410_x().field_71441_e.field_72996_f.stream().filter(EntityUtil::isLiving).filter((lllllllllllllllIlIllIlIllIIllIIl) -> {
            int var10000;
            if (lIIlllIIIIlIII(lllllllllllllllIlIllIlIllIIllIIl instanceof EntityPlayer)) {
               if (lIIlllIIIIlIII((Boolean)lllllllllllllllIlIllIlIllIIlllII.players.getValue()) && lIIlllIIIlIllI(mc.field_71439_g, lllllllllllllllIlIllIlIllIIllIIl)) {
                  var10000 = lllIllIlllIl[1];
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return (boolean)((254 ^ 147 ^ (79 ^ 82) << (" ".length() << " ".length())) & ((142 ^ 165) << " ".length() ^ 2 ^ 77 ^ -" ".length()));
                  }
               } else {
                  var10000 = lllIllIlllIl[0];
                  "".length();
                  if (-" ".length() > ((116 ^ 41) & ~(81 ^ 12))) {
                     return (boolean)((41 ^ 46) & ~(18 ^ 21));
                  }
               }
            } else if (lIIlllIIIIlIII(EntityUtil.isPassive(lllllllllllllllIlIllIlIllIIllIIl))) {
               var10000 = (Boolean)lllllllllllllllIlIllIlIllIIlllII.animals.getValue();
               "".length();
               if (" ".length() << (" ".length() << " ".length()) < ((97 ^ 76) & ~(111 ^ 66))) {
                  return (boolean)(" ".length() & ~" ".length());
               }
            } else {
               var10000 = (Boolean)lllllllllllllllIlIllIlIllIIlllII.mobs.getValue();
            }

            return (boolean)var10000;
         }).filter((lllllllllllllllIlIllIlIllIlIIIIl) -> {
            int var10000;
            if (lIIlllIIIlIlIl(lIIlllIIIlIlII((double)mc.field_71439_g.func_70032_d(lllllllllllllllIlIllIlIllIlIIIIl), (Double)lllllllllllllllIlIllIlIllIlIIIII.range.getValue()))) {
               var10000 = lllIllIlllIl[1];
               "".length();
               if (" ".length() << " ".length() <= ((88 + 107 - 97 + 31 ^ (127 ^ 50) << " ".length()) & ((189 ^ 166) << "   ".length() ^ 39 + 82 - -45 + 29 ^ -" ".length()))) {
                  return (boolean)((174 ^ 195 ^ (155 ^ 166) << " ".length()) << " ".length() & ((123 ^ 70 ^ (124 ^ 105) << " ".length()) << " ".length() ^ -" ".length()));
               }
            } else {
               var10000 = lllIllIlllIl[0];
            }

            return (boolean)var10000;
         }).sorted(Comparator.comparing((lllllllllllllllIlIllIlIllIlIIlIl) -> {
            return -mc.field_71439_g.func_70032_d(lllllllllllllllIlIllIlIllIlIIlIl);
         })).forEach(lllllllllllllllIlIllIllIIllIIllI::drawNametag);
         GlStateManager.func_179090_x();
         RenderHelper.func_74518_a();
         GlStateManager.func_179145_e();
         GlStateManager.func_179126_j();
      }
   }

   private static boolean lIIlllIIIlIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIIlllIIIIlIll(int var0) {
      return var0 == 0;
   }

   private static boolean lIIlllIIIIlllI(int var0, int var1) {
      return var0 == var1;
   }

   private static String lIIlllIIIIIIlI(String lllllllllllllllIlIllIlIllIIIIlIl, String lllllllllllllllIlIllIlIllIIIIlII) {
      lllllllllllllllIlIllIlIllIIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIlIllIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      long lllllllllllllllIlIllIlIllIIIIIll = new StringBuilder();
      char[] lllllllllllllllIlIllIlIllIIIlIII = lllllllllllllllIlIllIlIllIIIIlII.toCharArray();
      float lllllllllllllllIlIllIlIllIIIIIIl = lllIllIlllIl[0];
      int lllllllllllllllIlIllIlIllIIIIIII = lllllllllllllllIlIllIlIllIIIIlIl.toCharArray();
      boolean lllllllllllllllIlIllIlIlIlllllll = lllllllllllllllIlIllIlIllIIIIIII.length;
      int lllllllllllllllIlIllIlIlIllllllI = lllIllIlllIl[0];

      do {
         if (!lIIlllIIIlIIlI(lllllllllllllllIlIllIlIlIllllllI, lllllllllllllllIlIllIlIlIlllllll)) {
            return String.valueOf(lllllllllllllllIlIllIlIllIIIIIll);
         }

         char lllllllllllllllIlIllIlIllIIIlllI = lllllllllllllllIlIllIlIllIIIIIII[lllllllllllllllIlIllIlIlIllllllI];
         lllllllllllllllIlIllIlIllIIIIIll.append((char)(lllllllllllllllIlIllIlIllIIIlllI ^ lllllllllllllllIlIllIlIllIIIlIII[lllllllllllllllIlIllIlIllIIIIIIl % lllllllllllllllIlIllIlIllIIIlIII.length]));
         "".length();
         ++lllllllllllllllIlIllIlIllIIIIIIl;
         ++lllllllllllllllIlIllIlIlIllllllI;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) >= " ".length());

      return null;
   }

   public void onDisable() {
      if (lIIlllIIIIlIII((Boolean)lllllllllllllllIlIllIllIIllIllIl.owner.getValue())) {
         Iterator lllllllllllllllIlIllIllIIllIllII = mc.field_71441_e.field_72996_f.iterator();

         while(true) {
            while(lIIlllIIIIlIII(lllllllllllllllIlIllIllIIllIllII.hasNext())) {
               Entity lllllllllllllllIlIllIllIIllIllll = (Entity)lllllllllllllllIlIllIllIIllIllII.next();
               if (lIIlllIIIIlIll(lllllllllllllllIlIllIllIIllIllll instanceof EntityTameable) && lIIlllIIIIlIll(lllllllllllllllIlIllIllIIllIllll instanceof AbstractHorse)) {
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) == 0) {
                     return;
                  }
               } else {
                  label29: {
                     try {
                        lllllllllllllllIlIllIllIIllIllll.func_174805_g((boolean)lllIllIlllIl[0]);
                     } catch (Exception var5) {
                        break label29;
                     }

                     "".length();
                     if (null != null) {
                        return;
                     }
                  }

                  "".length();
                  if (-"  ".length() >= 0) {
                     return;
                  }
               }
            }

            return;
         }
      }
   }

   private static boolean lIIlllIIIlIllI(Object var0, Object var1) {
      return var0 != var1;
   }

   public void drawDamage(ItemStack lllllllllllllllIlIllIlIlllIIIIll, int lllllllllllllllIlIllIlIllIlllIll, int lllllllllllllllIlIllIlIllIlllIlI) {
      float lllllllllllllllIlIllIlIlllIIIIII = ((float)lllllllllllllllIlIllIlIlllIIIIll.func_77958_k() - (float)lllllllllllllllIlIllIlIlllIIIIll.func_77952_i()) / (float)lllllllllllllllIlIllIlIlllIIIIll.func_77958_k();
      float lllllllllllllllIlIllIlIllIllllll = 1.0F - lllllllllllllllIlIllIlIlllIIIIII;
      int lllllllllllllllIlIllIlIllIlllllI = lllIllIlllIl[58] - (int)(lllllllllllllllIlIllIlIllIllllll * 100.0F);
      lllllllllllllllIlIllIlIllIllllIl.cFontRenderer2.drawString(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIlIllIlllllI).append(lllIllIlllII[lllIllIlllIl[65]])), (float)(lllllllllllllllIlIllIlIllIlllIll + lllIllIlllIl[11] - (lllllllllllllllIlIllIlIllIllllIl.cFontRenderer.getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIlIllIlllllI).append(lllIllIlllII[lllIllIlllIl[66]]))) >> lllIllIlllIl[1])), (float)(lllllllllllllllIlIllIlIllIlllIlI - lllIllIlllIl[5]), ColourHolder.toHex((int)(lllllllllllllllIlIllIlIllIllllll * 255.0F), (int)(lllllllllllllllIlIllIlIlllIIIIII * 255.0F), lllIllIlllIl[0]));
      "".length();
   }

   private static boolean lIIlllIIIlIIII(int var0) {
      return var0 >= 0;
   }

   private static boolean lIIlllIIIlIIll(int var0, int var1) {
      return var0 > var1;
   }

   private static boolean lIIlllIIIIllll(int var0) {
      return var0 > 0;
   }

   private static String lIIlllIIIIIIll(String lllllllllllllllIlIllIlIlIlIlllIl, String lllllllllllllllIlIllIlIlIlIllIII) {
      try {
         double lllllllllllllllIlIllIlIlIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllllllllllllllIlIllIlIlIlIlIlII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIlIlIlIlIlII.init(lllIllIlllIl[2], lllllllllllllllIlIllIlIlIlIlIllI);
         return new String(lllllllllllllllIlIllIlIlIlIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public Nametags() {
      lllllllllllllllIlIllIllIlIIIIIll.players = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[0]], (boolean)lllIllIlllIl[1]));
      lllllllllllllllIlIllIllIlIIIIIll.animals = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[1]], (boolean)lllIllIlllIl[0]));
      lllllllllllllllIlIllIllIlIIIIIll.mobs = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[2]], (boolean)lllIllIlllIl[0]));
      lllllllllllllllIlIllIllIlIIIIIll.owner = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[3]], (boolean)lllIllIlllIl[0]));
      lllllllllllllllIlIllIllIlIIIIIll.range = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.d(lllIllIlllII[lllIllIlllIl[4]], 200.0D));
      lllllllllllllllIlIllIllIlIIIIIll.ping = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[5]], (boolean)lllIllIlllIl[1]));
      lllllllllllllllIlIllIllIlIIIIIll.scale = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.floatBuilder(lllIllIlllII[lllIllIlllIl[6]]).withMinimum(0.5F).withMaximum(10.0F).withValue((Number)1.0F).build());
      lllllllllllllllIlIllIllIlIIIIIll.health = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[7]], (boolean)lllIllIlllIl[1]));
      lllllllllllllllIlIllIllIlIIIIIll.armor = lllllllllllllllIlIllIllIlIIIIIll.register(Settings.b(lllIllIlllII[lllIllIlllIl[8]], (boolean)lllIllIlllIl[1]));
      lllllllllllllllIlIllIllIlIIIIIll.cFontRenderer = new CFontRenderer(new Font(lllIllIlllII[lllIllIlllIl[9]], lllIllIlllIl[0], lllIllIlllIl[10]), (boolean)lllIllIlllIl[1], (boolean)lllIllIlllIl[0]);
      lllllllllllllllIlIllIllIlIIIIIll.cFontRenderer2 = new CFontRenderer(new Font(lllIllIlllII[lllIllIlllIl[11]], lllIllIlllIl[0], lllIllIlllIl[8]), (boolean)lllIllIlllIl[1], (boolean)lllIllIlllIl[0]);
   }

   private static boolean lIIlllIIIIlIIl(Object var0) {
      return var0 != null;
   }

   private static int lIIlllIIIIllII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   private static int lIIlllIIIlIlII(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static String lIIlllIIIIIlII(String lllllllllllllllIlIllIlIlIlllIIll, String lllllllllllllllIlIllIlIlIlllIIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIllIlIlIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIlllIIlI.getBytes(StandardCharsets.UTF_8)), lllIllIlllIl[8]), "DES");
         boolean lllllllllllllllIlIllIlIlIlllIIII = Cipher.getInstance("DES");
         lllllllllllllllIlIllIlIlIlllIIII.init(lllIllIlllIl[2], lllllllllllllllIlIllIlIlIllllIII);
         return new String(lllllllllllllllIlIllIlIlIlllIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void onUpdate() {
      if (lIIlllIIIIlIII((Boolean)lllllllllllllllIlIllIllIIllllIII.owner.getValue())) {
         Iterator lllllllllllllllIlIllIllIIlllIlll = mc.field_71441_e.field_72996_f.iterator();

         while(lIIlllIIIIlIII(lllllllllllllllIlIllIllIIlllIlll.hasNext())) {
            Entity lllllllllllllllIlIllIllIIllllIlI = (Entity)lllllllllllllllIlIllIllIIlllIlll.next();
            EntityTameable lllllllllllllllIlIllIllIIlllIlIl;
            if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIllllIlI instanceof EntityTameable) && lIIlllIIIIlIII((lllllllllllllllIlIllIllIIlllIlIl = (EntityTameable)lllllllllllllllIlIllIllIIllllIlI).func_70909_n()) && lIIlllIIIIlIIl(lllllllllllllllIlIllIllIIlllIlIl.func_70902_q())) {
               lllllllllllllllIlIllIllIIlllIlIl.func_174805_g((boolean)lllIllIlllIl[1]);
               lllllllllllllllIlIllIllIIlllIlIl.func_96094_a(String.valueOf((new StringBuilder()).append(lllIllIlllII[lllIllIlllIl[12]]).append(lllllllllllllllIlIllIllIIlllIlIl.func_70902_q().func_145748_c_().func_150254_d())));
            }

            AbstractHorse lllllllllllllllIlIllIllIIlllIlII;
            if (lIIlllIIIIlIII(lllllllllllllllIlIllIllIIllllIlI instanceof AbstractHorse) && lIIlllIIIIlIII((lllllllllllllllIlIllIllIIlllIlII = (AbstractHorse)lllllllllllllllIlIllIllIIllllIlI).func_110248_bS())) {
               if (lIIlllIIIIlIlI(lllllllllllllllIlIllIllIIlllIlII.func_184780_dh())) {
                  "".length();
                  if (null != null) {
                     return;
                  }
               } else {
                  lllllllllllllllIlIllIllIIlllIlII.func_174805_g((boolean)lllIllIlllIl[1]);
                  lllllllllllllllIlIllIllIIlllIlII.func_96094_a(String.valueOf((new StringBuilder()).append(lllIllIlllII[lllIllIlllIl[13]]).append(MojangWebApi.grabRealName(lllllllllllllllIlIllIllIIlllIlII.func_184780_dh().toString()))));
                  "".length();
                  if (" ".length() != " ".length()) {
                     return;
                  }
               }
            }
         }
      }

   }

   private static boolean lIIlllIIIIlIlI(Object var0) {
      return var0 == null;
   }

   public void renderArmor(EntityPlayer lllllllllllllllIlIllIllIIIIIIllI, int lllllllllllllllIlIllIllIIIIlIlIl, int lllllllllllllllIlIllIllIIIIIIlII) {
      long lllllllllllllllIlIllIllIIIIIIIll = lllllllllllllllIlIllIllIIIIIIllI.field_71071_by;
      char lllllllllllllllIlIllIllIIIIIIIlI = lllllllllllllllIlIllIllIIIIIIllI.func_184614_ca();
      float lllllllllllllllIlIllIllIIIIIIIIl = lllllllllllllllIlIllIllIIIIIIIll.func_70440_f(lllIllIlllIl[0]);
      float lllllllllllllllIlIllIllIIIIIIIII = lllllllllllllllIlIllIllIIIIIIIll.func_70440_f(lllIllIlllIl[1]);
      ItemStack lllllllllllllllIlIllIllIIIIIllll = lllllllllllllllIlIllIllIIIIIIIll.func_70440_f(lllIllIlllIl[2]);
      int lllllllllllllllIlIllIlIllllllllI = lllllllllllllllIlIllIllIIIIIIIll.func_70440_f(lllIllIlllIl[3]);
      double lllllllllllllllIlIllIlIlllllllIl = lllllllllllllllIlIllIllIIIIIIllI.func_184592_cb();
      ItemStack[] lllllllllllllllIlIllIllIIIIIllII = null;
      ItemStack[] var10000;
      if (lIIlllIIIIlIIl(lllllllllllllllIlIllIllIIIIIIIlI) && lIIlllIIIIlIIl(lllllllllllllllIlIllIlIlllllllIl)) {
         var10000 = new ItemStack[lllIllIlllIl[6]];
         var10000[lllIllIlllIl[0]] = lllllllllllllllIlIllIllIIIIIIIlI;
         var10000[lllIllIlllIl[1]] = lllllllllllllllIlIllIlIllllllllI;
         var10000[lllIllIlllIl[2]] = lllllllllllllllIlIllIllIIIIIllll;
         var10000[lllIllIlllIl[3]] = lllllllllllllllIlIllIllIIIIIIIII;
         var10000[lllIllIlllIl[4]] = lllllllllllllllIlIllIllIIIIIIIIl;
         var10000[lllIllIlllIl[5]] = lllllllllllllllIlIllIlIlllllllIl;
         lllllllllllllllIlIllIllIIIIIllII = var10000;
         "".length();
         if (" ".length() == 0) {
            return;
         }
      } else if (lIIlllIIIIlIIl(lllllllllllllllIlIllIllIIIIIIIlI) && lIIlllIIIIlIlI(lllllllllllllllIlIllIlIlllllllIl)) {
         var10000 = new ItemStack[lllIllIlllIl[5]];
         var10000[lllIllIlllIl[0]] = lllllllllllllllIlIllIllIIIIIIIlI;
         var10000[lllIllIlllIl[1]] = lllllllllllllllIlIllIlIllllllllI;
         var10000[lllIllIlllIl[2]] = lllllllllllllllIlIllIllIIIIIllll;
         var10000[lllIllIlllIl[3]] = lllllllllllllllIlIllIllIIIIIIIII;
         var10000[lllIllIlllIl[4]] = lllllllllllllllIlIllIllIIIIIIIIl;
         lllllllllllllllIlIllIllIIIIIllII = var10000;
         "".length();
         if (-" ".length() > " ".length()) {
            return;
         }
      } else if (lIIlllIIIIlIlI(lllllllllllllllIlIllIllIIIIIIIlI) && lIIlllIIIIlIIl(lllllllllllllllIlIllIlIlllllllIl)) {
         var10000 = new ItemStack[lllIllIlllIl[5]];
         var10000[lllIllIlllIl[0]] = lllllllllllllllIlIllIlIllllllllI;
         var10000[lllIllIlllIl[1]] = lllllllllllllllIlIllIllIIIIIllll;
         var10000[lllIllIlllIl[2]] = lllllllllllllllIlIllIllIIIIIIIII;
         var10000[lllIllIlllIl[3]] = lllllllllllllllIlIllIllIIIIIIIIl;
         var10000[lllIllIlllIl[4]] = lllllllllllllllIlIllIlIlllllllIl;
         lllllllllllllllIlIllIllIIIIIllII = var10000;
         "".length();
         if (" ".length() == "   ".length()) {
            return;
         }
      } else {
         var10000 = new ItemStack[lllIllIlllIl[4]];
         var10000[lllIllIlllIl[0]] = lllllllllllllllIlIllIlIllllllllI;
         var10000[lllIllIlllIl[1]] = lllllllllllllllIlIllIllIIIIIllll;
         var10000[lllIllIlllIl[2]] = lllllllllllllllIlIllIllIIIIIIIII;
         var10000[lllIllIlllIl[3]] = lllllllllllllllIlIllIllIIIIIIIIl;
         lllllllllllllllIlIllIllIIIIIllII = var10000;
      }

      List<ItemStack> lllllllllllllllIlIllIlIllllllIll = new ArrayList();
      ItemStack[] lllllllllllllllIlIllIllIIIIIlIlI = lllllllllllllllIlIllIllIIIIIllII;
      int lllllllllllllllIlIllIllIIIIIlIIl = lllllllllllllllIlIllIllIIIIIllII.length;
      int lllllllllllllllIlIllIllIIIIllIIl = lllIllIlllIl[0];

      do {
         if (!lIIlllIIIlIIlI(lllllllllllllllIlIllIllIIIIllIIl, lllllllllllllllIlIllIllIIIIIlIIl)) {
            lllllllllllllllIlIllIllIIIIllIIl = lllIllIlllIl[22] * lllllllllllllllIlIllIlIllllllIll.size() / lllIllIlllIl[2];
            lllllllllllllllIlIllIllIIIIlIlIl -= lllllllllllllllIlIllIllIIIIllIIl;
            GlStateManager.func_179097_i();
            Iterator lllllllllllllllIlIllIlIlllllIlll = lllllllllllllllIlIllIlIllllllIll.iterator();

            do {
               if (!lIIlllIIIIlIII(lllllllllllllllIlIllIlIlllllIlll.hasNext())) {
                  GlStateManager.func_179126_j();
                  return;
               }

               boolean lllllllllllllllIlIllIlIlllllIllI = (ItemStack)lllllllllllllllIlIllIlIlllllIlll.next();
               lllllllllllllllIlIllIllIIIIIIlll.renderItem(lllllllllllllllIlIllIlIlllllIllI, lllllllllllllllIlIllIllIIIIlIlIl, lllllllllllllllIlIllIllIIIIIIlII);
               lllllllllllllllIlIllIllIIIIlIlIl += 16;
               "".length();
            } while(null == null);

            return;
         }

         ItemStack lllllllllllllllIlIllIllIIIIllIlI = lllllllllllllllIlIllIllIIIIIlIlI[lllllllllllllllIlIllIllIIIIllIIl];
         if (lIIlllIIIIlIIl(lllllllllllllllIlIllIllIIIIllIlI) && lIIlllIIIIlIIl(lllllllllllllllIlIllIllIIIIllIlI.func_77973_b())) {
            lllllllllllllllIlIllIlIllllllIll.add(lllllllllllllllIlIllIllIIIIllIlI);
            "".length();
         }

         ++lllllllllllllllIlIllIllIIIIllIIl;
         "".length();
      } while(-" ".length() < " ".length() << " ".length());

   }

   public static class EnchantEntry {
      // $FF: synthetic field
      private Enchantment enchant;
      // $FF: synthetic field
      private String name;

      public EnchantEntry(Enchantment lllllllllllllllIlIlIlIlIllIIIIlI, String lllllllllllllllIlIlIlIlIlIlllllI) {
         lllllllllllllllIlIlIlIlIllIIIIII.enchant = lllllllllllllllIlIlIlIlIllIIIIlI;
         lllllllllllllllIlIlIlIlIllIIIIII.name = lllllllllllllllIlIlIlIlIlIlllllI;
      }

      public Enchantment getEnchant() {
         return lllllllllllllllIlIlIlIlIlIllllII.enchant;
      }

      public String getName() {
         return lllllllllllllllIlIlIlIlIlIlllIII.name;
      }
   }
}
