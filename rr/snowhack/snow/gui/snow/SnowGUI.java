package rr.snowhack.snow.gui.snow;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.awt.Font;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.GUI;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.rgui.component.container.use.Scrollpane;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.use.CheckButton;
import rr.snowhack.snow.gui.rgui.component.use.Label;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;
import rr.snowhack.snow.gui.rgui.util.ContainerHelper;
import rr.snowhack.snow.gui.rgui.util.Docking;
import rr.snowhack.snow.gui.snow.component.ActiveModules;
import rr.snowhack.snow.gui.snow.component.Inventory;
import rr.snowhack.snow.gui.snow.component.KeyStroke;
import rr.snowhack.snow.gui.snow.component.Radar;
import rr.snowhack.snow.gui.snow.component.SettingsPanel;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.util.ColourHolder;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.LagCompensator;
import rr.snowhack.snow.util.Pair;
import rr.snowhack.snow.util.Wrapper;

public class SnowGUI extends GUI {
   // $FF: synthetic field
   public static final RootFontRenderer fontRenderer;
   // $FF: synthetic field
   int xps;
   // $FF: synthetic field
   public Theme theme;
   // $FF: synthetic field
   public static ColourHolder primaryColour;
   // $FF: synthetic field
   int posX;
   // $FF: synthetic field
   private static final int DOCK_OFFSET;
   // $FF: synthetic field
   int hposZ;
   // $FF: synthetic field
   int ms;
   // $FF: synthetic field
   int gapples;
   // $FF: synthetic field
   public static ArrayList<Frame> framesArray;
   // $FF: synthetic field
   int hposX;
   // $FF: synthetic field
   Minecraft mc = Wrapper.getMinecraft();
   // $FF: synthetic field
   int totems;
   // $FF: synthetic field
   public static CFontRenderer cFontRenderer;
   // $FF: synthetic field
   private static final String[] llllIIIIllII;
   // $FF: synthetic field
   int crystals;
   // $FF: synthetic field
   private static final int[] llllIIIlIIIl;
   // $FF: synthetic field
   int posY;
   // $FF: synthetic field
   String Facing;
   // $FF: synthetic field
   int posZ;

   private static boolean lIIllllIIlIlIl(int var0, int var1) {
      return var0 <= var1;
   }

   private static String lIIllllIIIIIIl(String lllllllllllllllIlIlIlllIIIIlIlIl, String lllllllllllllllIlIlIlllIIIIlIlII) {
      try {
         byte lllllllllllllllIlIlIlllIIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         double lllllllllllllllIlIlIlllIIIIlIIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIlllIIIIlIIlI.init(llllIIIlIIIl[2], lllllllllllllllIlIlIlllIIIIlIIll);
         return new String(lllllllllllllllIlIlIlllIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllllIIIllll(int var0) {
      return var0 != 0;
   }

   private static boolean lIIllllIIllIII(Object var0) {
      return var0 == null;
   }

   static {
      lIIllllIIIlllI();
      lIIllllIIIIlll();
      DOCK_OFFSET = llllIIIlIIIl[0];
      fontRenderer = new RootFontRenderer(1.0F);
      cFontRenderer = new CFontRenderer(new Font(llllIIIIllII[llllIIIlIIIl[70]], llllIIIlIIIl[0], llllIIIlIIIl[24]), (boolean)llllIIIlIIIl[1], (boolean)llllIIIlIIIl[0]);
      framesArray = new ArrayList();
      primaryColour = new ColourHolder(llllIIIlIIIl[36], llllIIIlIIIl[36], llllIIIlIIIl[36]);
   }

   private static String lIIllllIIIIIII(String lllllllllllllllIlIlIlllIIIllIlII, String lllllllllllllllIlIlIlllIIIlllIII) {
      lllllllllllllllIlIlIlllIIIllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIlllIIIllIlll = new StringBuilder();
      char[] lllllllllllllllIlIlIlllIIIllIllI = lllllllllllllllIlIlIlllIIIlllIII.toCharArray();
      char lllllllllllllllIlIlIlllIIIllIIII = llllIIIlIIIl[0];
      Exception lllllllllllllllIlIlIlllIIIlIllll = lllllllllllllllIlIlIlllIIIllIlII.toCharArray();
      String lllllllllllllllIlIlIlllIIIlIlllI = lllllllllllllllIlIlIlllIIIlIllll.length;
      int lllllllllllllllIlIlIlllIIIlIllIl = llllIIIlIIIl[0];

      do {
         if (!lIIllllIIllIlI(lllllllllllllllIlIlIlllIIIlIllIl, lllllllllllllllIlIlIlllIIIlIlllI)) {
            return String.valueOf(lllllllllllllllIlIlIlllIIIllIlll);
         }

         char lllllllllllllllIlIlIlllIIIlIllII = lllllllllllllllIlIlIlllIIIlIllll[lllllllllllllllIlIlIlllIIIlIllIl];
         lllllllllllllllIlIlIlllIIIllIlll.append((char)(lllllllllllllllIlIlIlllIIIlIllII ^ lllllllllllllllIlIlIlllIIIllIllI[lllllllllllllllIlIlIlllIIIllIIII % lllllllllllllllIlIlIlllIIIllIllI.length]));
         "".length();
         ++lllllllllllllllIlIlIlllIIIllIIII;
         ++lllllllllllllllIlIlIlllIIIlIllIl;
         "".length();
      } while(" ".length() << " ".length() >= " ".length() << " ".length());

      return null;
   }

   private static boolean lIIllllIIllIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIIllllIIIlllI() {
      llllIIIlIIIl = new int[72];
      llllIIIlIIIl[0] = (33 + 10 - -86 + 4 ^ " ".length() << (171 ^ 172)) & ((178 ^ 149) << " ".length() ^ 194 ^ 137 ^ -" ".length());
      llllIIIlIIIl[1] = " ".length();
      llllIIIlIIIl[2] = " ".length() << " ".length();
      llllIIIlIIIl[3] = "   ".length();
      llllIIIlIIIl[4] = " ".length() << (" ".length() << " ".length());
      llllIIIlIIIl[5] = (108 ^ 99) << (" ".length() << " ".length()) ^ 159 ^ 166;
      llllIIIlIIIl[6] = "   ".length() << " ".length();
      llllIIIlIIIl[7] = (101 ^ 46) << (" ".length() << " ".length());
      llllIIIlIIIl[8] = (249 ^ 184) << (" ".length() << " ".length());
      llllIIIlIIIl[9] = (30 ^ 99) << "   ".length();
      llllIIIlIIIl[10] = ((118 ^ 115) << "   ".length() ^ 124 ^ 81) << " ".length();
      llllIIIlIIIl[11] = 182 ^ 177;
      llllIIIlIIIl[12] = " ".length() << "   ".length();
      llllIIIlIIIl[13] = 146 ^ 135 ^ (136 ^ 143) << (" ".length() << " ".length());
      llllIIIlIIIl[14] = " ".length() << ("   ".length() << " ".length()) ^ 33 ^ 106;
      llllIIIlIIIl[15] = "   ".length() << (" ".length() << " ".length());
      llllIIIlIIIl[16] = 5 ^ 78;
      llllIIIlIIIl[17] = 176 ^ 189;
      llllIIIlIIIl[18] = (160 ^ 167) << " ".length();
      llllIIIlIIIl[19] = 83 ^ 92;
      llllIIIlIIIl[20] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllIIIlIIIl[21] = (182 ^ 179) << (" ".length() << " ".length());
      llllIIIlIIIl[22] = 23 ^ 88 ^ (19 ^ 60) << " ".length();
      llllIIIlIIIl[23] = (102 ^ 127) << (" ".length() << " ".length());
      llllIIIlIIIl[24] = (48 ^ 57) << " ".length();
      llllIIIlIIIl[25] = ("   ".length() << "   ".length() & ~("   ".length() << "   ".length()) ^ 152 ^ 145) << (" ".length() << (" ".length() << " ".length()));
      llllIIIlIIIl[26] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
      llllIIIlIIIl[27] = (204 ^ 151) << " ".length() ^ 95 + 133 - 177 + 114;
      llllIIIlIIIl[28] = 18 ^ 73 ^ (69 ^ 98) << " ".length();
      llllIIIlIIIl[29] = (12 ^ 7) << " ".length();
      llllIIIlIIIl[30] = (127 ^ 104) << (" ".length() << " ".length()) ^ 221 ^ 150;
      llllIIIlIIIl[31] = "   ".length() << "   ".length();
      llllIIIlIIIl[32] = (113 ^ 40) << " ".length() ^ 1 + 85 - 9 + 94;
      llllIIIlIIIl[33] = (66 + 28 - -58 + 23 ^ (205 ^ 156) << " ".length()) << " ".length();
      llllIIIlIIIl[34] = 34 ^ 57;
      llllIIIlIIIl[35] = (187 ^ 188) << (" ".length() << " ".length());
      llllIIIlIIIl[36] = 172 ^ 197 ^ (14 ^ 19) << (" ".length() << " ".length());
      llllIIIlIIIl[37] = ((130 ^ 135) << (" ".length() << " ".length()) ^ 187 ^ 160) << " ".length();
      llllIIIlIIIl[38] = 59 ^ 62 ^ (17 ^ 28) << " ".length();
      llllIIIlIIIl[39] = " ".length() << ((94 ^ 19) << " ".length() ^ 101 + 59 - 44 + 43);
      llllIIIlIIIl[40] = 107 ^ 74;
      llllIIIlIIIl[41] = (114 ^ 125 ^ (173 ^ 162) << " ".length()) << " ".length();
      llllIIIlIIIl[42] = 18 ^ 7 ^ (222 ^ 197) << " ".length();
      llllIIIlIIIl[43] = ((129 ^ 168) << " ".length() ^ 62 ^ 101) << (" ".length() << " ".length());
      llllIIIlIIIl[44] = (72 ^ 87) << " ".length() ^ 221 ^ 198;
      llllIIIlIIIl[45] = (78 ^ 93) << " ".length();
      llllIIIlIIIl[46] = 89 ^ 126;
      llllIIIlIIIl[47] = (97 ^ 100) << "   ".length();
      llllIIIlIIIl[48] = 75 ^ 42 ^ (155 ^ 146) << "   ".length();
      llllIIIlIIIl[49] = (177 ^ 164) << " ".length();
      llllIIIlIIIl[50] = 21 ^ 62;
      llllIIIlIIIl[51] = ((175 ^ 162) << (" ".length() << " ".length()) ^ 140 ^ 179) << (" ".length() << " ".length());
      llllIIIlIIIl[52] = 143 ^ 162;
      llllIIIlIIIl[53] = ((74 ^ 91) << "   ".length() ^ 98 + 147 - 119 + 33) << " ".length();
      llllIIIlIIIl[54] = 20 ^ 59;
      llllIIIlIIIl[55] = 158 ^ 175;
      llllIIIlIIIl[56] = (104 ^ 113) << " ".length();
      llllIIIlIIIl[57] = 72 ^ 123;
      llllIIIlIIIl[58] = (200 ^ 197) << (" ".length() << " ".length());
      llllIIIlIIIl[59] = 69 ^ 120 ^ " ".length() << "   ".length();
      llllIIIlIIIl[60] = (119 ^ 108) << " ".length();
      llllIIIlIIIl[61] = 107 ^ 92;
      llllIIIlIIIl[62] = (74 ^ 77) << "   ".length();
      llllIIIlIIIl[63] = (156 ^ 197) << " ".length() ^ 96 + 5 - 42 + 80;
      llllIIIlIIIl[64] = ((57 ^ 100) << " ".length() ^ 83 + 152 - 89 + 21) << " ".length();
      llllIIIlIIIl[65] = -" ".length();
      llllIIIlIIIl[66] = " ".length() ^ (40 ^ 53) << " ".length();
      llllIIIlIIIl[67] = (110 ^ 97) << (" ".length() << " ".length());
      llllIIIlIIIl[68] = 138 + 123 - 200 + 88 ^ (36 ^ 49) << "   ".length();
      llllIIIlIIIl[69] = ((181 ^ 178) << (" ".length() << " ".length()) ^ "   ".length()) << " ".length();
      llllIIIlIIIl[70] = 39 ^ 24;
      llllIIIlIIIl[71] = " ".length() << ("   ".length() << " ".length());
   }

   public void destroyGUI() {
      lllllllllllllllIlIlIlllIlIllIIlI.kill();
   }

   public void drawGUI() {
      super.drawGUI();
   }

   private static void lIIllllIIIIlll() {
      llllIIIIllII = new String[llllIIIlIIIl[71]];
      llllIIIIllII[llllIIIlIIIl[0]] = lIIllllIIIIIII("PzAbLjwaeRwtLAQ1", "hYoFY");
      llllIIIIllII[llllIIIlIIIl[1]] = lIIllllIIIIIII("ARoWdio2DQEiKCg=", "DtrVI");
      llllIIIIllII[llllIIIlIIIl[2]] = lIIllllIIIIIIl("ng/O1YwKUMKs2Q4LGQ9OqLlsMTRupXP8", "nZEbM");
      llllIIIIllII[llllIIIlIIIl[3]] = lIIllllIIIIIIl("2Pl5Ff6HPAvqOg4ZRjHeqg==", "jdLxT");
      llllIIIIllII[llllIIIlIIIl[4]] = lIIllllIIIIIII("KjgjKmEFPicqJA==", "cLFGA");
      llllIIIIllII[llllIIIlIIIl[5]] = lIIllllIIIIIII("LD8jJQQWdzQtFA==", "xWQJs");
      llllIIIIllII[llllIIIlIIIl[6]] = lIIllllIIIIIIl("XvrN6UIr+0ESnMM849nCOg==", "WSqjr");
      llllIIIIllII[llllIIIlIIIl[11]] = lIIllllIIIIIIl("azBjFM2D+2qfdJwux0xctA==", "hKItG");
      llllIIIIllII[llllIIIlIIIl[12]] = lIIllllIIIIIII("JhgVAg==", "ovsmy");
      llllIIIIllII[llllIIIlIIIl[13]] = lIIllllIIIIIII("", "MRLjQ");
      llllIIIIllII[llllIIIlIIIl[10]] = lIIllllIIIIIlI("PrOsGl0BlTyXefWIshtdZw==", "twkts");
      llllIIIIllII[llllIIIlIIIl[14]] = lIIllllIIIIIlI("fsEDcCH4DfI=", "iEYhg");
      llllIIIIllII[llllIIIlIIIl[15]] = lIIllllIIIIIIl("S1xH9uDq18U=", "VBjXH");
      llllIIIIllII[llllIIIlIIIl[17]] = lIIllllIIIIIlI("jYeb+ggT3WNUfYAZuwBMig==", "OpbVI");
      llllIIIIllII[llllIIIlIIIl[18]] = lIIllllIIIIIIl("vv2v9jP577w=", "QOTPl");
      llllIIIIllII[llllIIIlIIIl[19]] = lIIllllIIIIIIl("pEgS7X3VpFj76enFPzJZlg==", "vxeGh");
      llllIIIIllII[llllIIIlIIIl[20]] = lIIllllIIIIIIl("4Rfmh5aaaug=", "bbxKi");
      llllIIIIllII[llllIIIlIIIl[22]] = lIIllllIIIIIII("CAIFMQg=", "ZcaPz");
      llllIIIIllII[llllIIIlIIIl[24]] = lIIllllIIIIIII("Gzo7BiEmOz8a", "RTMcO");
      llllIIIIllII[llllIIIlIIIl[27]] = lIIllllIIIIIlI("Orrz9wKa4ji1nHudyP+KIg==", "UPipB");
      llllIIIIllII[llllIIIlIIIl[21]] = lIIllllIIIIIII("", "TACny");
      llllIIIIllII[llllIIIlIIIl[28]] = lIIllllIIIIIlI("PhJ8uFy9d4cz9fQbRyEwvw==", "eGMyw");
      llllIIIIllII[llllIIIlIIIl[29]] = lIIllllIIIIIlI("fSFb8A9Whv0=", "jyISS");
      llllIIIIllII[llllIIIlIIIl[30]] = lIIllllIIIIIII("w71gHy0zPzo4eGfDvTE=", "ZWKBG");
      llllIIIIllII[llllIIIlIIIl[31]] = lIIllllIIIIIII("w6pdDDg8d0rDsy4=", "MjTHO");
      llllIIIIllII[llllIIIlIIIl[32]] = lIIllllIIIIIII("w6RRFD0sMBI2IyZ5RsOwKQ==", "CfWOU");
      llllIIIIllII[llllIIIlIIIl[33]] = lIIllllIIIIIII("w6VZACQaMgIiNlBiw4kh", "BnGEj");
      llllIIIIllII[llllIIIlIIIl[34]] = lIIllllIIIIIIl("wTA9NzsVIqI=", "qKrWd");
      llllIIIIllII[llllIIIlIIIl[35]] = lIIllllIIIIIII("HCIqFQ==", "TGFyf");
      llllIIIIllII[llllIIIlIIIl[36]] = lIIllllIIIIIlI("EwmMlnWbaf0eAlT4lFu3yA==", "DEVwE");
      llllIIIIllII[llllIIIlIIIl[37]] = lIIllllIIIIIlI("IuBvQDUb6hQ=", "cSgSP");
      llllIIIIllII[llllIIIlIIIl[38]] = lIIllllIIIIIIl("GcTr4yRDB24=", "akiWE");
      llllIIIIllII[llllIIIlIIIl[39]] = lIIllllIIIIIlI("24hnrnYRTnTKJ7KxeeZxzw==", "OCbrl");
      llllIIIIllII[llllIIIlIIIl[40]] = lIIllllIIIIIII("w5VyWsOjJA==", "rEvDB");
      llllIIIIllII[llllIIIlIIIl[41]] = lIIllllIIIIIII("w4JeKcOxAA==", "eitVf");
      llllIIIIllII[llllIIIlIIIl[42]] = lIIllllIIIIIlI("oD1OGrEJDtw=", "oTTrm");
      llllIIIIllII[llllIIIlIIIl[43]] = lIIllllIIIIIIl("V4fuVlxyK/c=", "QIXRn");
      llllIIIIllII[llllIIIlIIIl[44]] = lIIllllIIIIIII("RA==", "dhncQ");
      llllIIIIllII[llllIIIlIIIl[45]] = lIIllllIIIIIlI("GsZkM1Hnc/g=", "QgwxP");
      llllIIIIllII[llllIIIlIIIl[46]] = lIIllllIIIIIlI("521Wb91lU5Q=", "CXlPJ");
      llllIIIIllII[llllIIIlIIIl[47]] = lIIllllIIIIIIl("V4O4tAHr1Gs=", "kqSHk");
      llllIIIIllII[llllIIIlIIIl[48]] = lIIllllIIIIIIl("wriwWZFcxx4=", "ckEQO");
      llllIIIIllII[llllIIIlIIIl[49]] = lIIllllIIIIIIl("xPE1STqpiPg=", "JLpGe");
      llllIIIIllII[llllIIIlIIIl[50]] = lIIllllIIIIIII("Aw==", "bnepN");
      llllIIIIllII[llllIIIlIIIl[51]] = lIIllllIIIIIIl("a1wxM0f70x4=", "JZpOo");
      llllIIIIllII[llllIIIlIIIl[52]] = lIIllllIIIIIII("Tw==", "yPhJU");
      llllIIIIllII[llllIIIlIIIl[53]] = lIIllllIIIIIIl("3bKZy44JWdY=", "mfLAL");
      llllIIIIllII[llllIIIlIIIl[54]] = lIIllllIIIIIIl("yMjrcq7GHmI=", "CfakK");
      llllIIIIllII[llllIIIlIIIl[26]] = lIIllllIIIIIII("Ug==", "rJJfJ");
      llllIIIIllII[llllIIIlIIIl[55]] = lIIllllIIIIIII("Vg==", "vAreJ");
      llllIIIIllII[llllIIIlIIIl[56]] = lIIllllIIIIIIl("asarQ353QuA=", "TBGfJ");
      llllIIIIllII[llllIIIlIIIl[57]] = lIIllllIIIIIIl("RYBe+L5E+9M=", "CtSeJ");
      llllIIIIllII[llllIIIlIIIl[58]] = lIIllllIIIIIII("Uw==", "dLISR");
      llllIIIIllII[llllIIIlIIIl[59]] = lIIllllIIIIIlI("/0y5+Rtma8Y=", "gCBYI");
      llllIIIIllII[llllIIIlIIIl[60]] = lIIllllIIIIIII("VA==", "lSGVy");
      llllIIIIllII[llllIIIlIIIl[61]] = lIIllllIIIIIII("", "XCJgN");
      llllIIIIllII[llllIIIlIIIl[62]] = lIIllllIIIIIlI("zvaxJlt1RY8=", "gTeZK");
      llllIIIIllII[llllIIIlIIIl[63]] = lIIllllIIIIIIl("ss/wPje2asXhj6Lrc6KQHQ==", "OmjJH");
      llllIIIIllII[llllIIIlIIIl[64]] = lIIllllIIIIIIl("FuoATjKrQzU=", "FORAa");
      llllIIIIllII[llllIIIlIIIl[66]] = lIIllllIIIIIIl("/jj5J/1ChoW2n1dtGd8lJA==", "ExViL");
      llllIIIIllII[llllIIIlIIIl[67]] = lIIllllIIIIIIl("rtcLYUMSing=", "KomNg");
      llllIIIIllII[llllIIIlIIIl[68]] = lIIllllIIIIIlI("7RQpQJBx5cf2cGaJbdLwAQ==", "sKJTz");
      llllIIIIllII[llllIIIlIIIl[69]] = lIIllllIIIIIII("w51nCggFQHDDqx4=", "zPLxv");
      llllIIIIllII[llllIIIlIIIl[70]] = lIIllllIIIIIII("GicWFxkiIw==", "LBdsx");
   }

   private static String getEntityName(@Nonnull Entity lllllllllllllllIlIlIllllIIIIIllI) {
      if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityItem)) {
         return String.valueOf((new StringBuilder()).append(TextFormatting.DARK_AQUA).append(((EntityItem)lllllllllllllllIlIlIllllIIIIIllI).func_92059_d().func_77973_b().func_77653_i(((EntityItem)lllllllllllllllIlIlIllllIIIIIllI).func_92059_d())));
      } else if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityWitherSkull)) {
         return String.valueOf((new StringBuilder()).append(TextFormatting.DARK_GRAY).append(llllIIIIllII[llllIIIlIIIl[0]]));
      } else if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityEnderCrystal)) {
         return String.valueOf((new StringBuilder()).append(TextFormatting.LIGHT_PURPLE).append(llllIIIIllII[llllIIIlIIIl[1]]));
      } else if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityEnderPearl)) {
         return llllIIIIllII[llllIIIlIIIl[2]];
      } else if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityMinecart)) {
         return llllIIIIllII[llllIIIlIIIl[3]];
      } else if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityItemFrame)) {
         return llllIIIIllII[llllIIIlIIIl[4]];
      } else if (lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntityEgg)) {
         return llllIIIIllII[llllIIIlIIIl[5]];
      } else {
         return lIIllllIIIllll(lllllllllllllllIlIlIllllIIIIIllI instanceof EntitySnowball) ? llllIIIIllII[llllIIIlIIIl[6]] : lllllllllllllllIlIlIllllIIIIIllI.func_70005_c_();
      }
   }

   private static boolean lIIllllIIlIIlI(int var0) {
      return var0 > 0;
   }

   private static boolean lIIllllIIllIIl(int var0) {
      return var0 >= 0;
   }

   private static int lIIllllIIlIIII(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static void dock(Frame lllllllllllllllIlIlIlllIllllIlIl) {
      Docking lllllllllllllllIlIlIlllIllllIlII = lllllllllllllllIlIlIlllIllllIlIl.getDocking();
      if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllllIlII.isTop())) {
         lllllllllllllllIlIlIlllIllllIlIl.setY(llllIIIlIIIl[0]);
      }

      if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllllIlII.isBottom())) {
         lllllllllllllllIlIlIlllIllllIlIl.setY(Wrapper.getMinecraft().field_71440_d / DisplayGuiScreen.getScale() - lllllllllllllllIlIlIlllIllllIlIl.getHeight() - llllIIIlIIIl[0]);
      }

      if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllllIlII.isLeft())) {
         lllllllllllllllIlIlIlllIllllIlIl.setX(llllIIIlIIIl[0]);
      }

      if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllllIlII.isRight())) {
         lllllllllllllllIlIlIlllIllllIlIl.setX(Wrapper.getMinecraft().field_71443_c / DisplayGuiScreen.getScale() - lllllllllllllllIlIlIlllIllllIlIl.getWidth() - llllIIIlIIIl[0]);
      }

      if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllllIlII.isCenterHorizontal())) {
         lllllllllllllllIlIlIlllIllllIlIl.setX(Wrapper.getMinecraft().field_71443_c / (DisplayGuiScreen.getScale() * llllIIIlIIIl[2]) - lllllllllllllllIlIlIlllIllllIlIl.getWidth() / llllIIIlIIIl[2]);
      }

      if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllllIlII.isCenterVertical())) {
         lllllllllllllllIlIlIlllIllllIlIl.setY(Wrapper.getMinecraft().field_71440_d / (DisplayGuiScreen.getScale() * llllIIIlIIIl[2]) - lllllllllllllllIlIlIlllIllllIlIl.getHeight() / llllIIIlIIIl[2]);
      }

   }

   private static boolean lIIllllIIlIlII(Object var0) {
      return var0 != null;
   }

   private static int lIIllllIIlIllI(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   private static int lIIllllIIlIlll(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> lllllllllllllllIlIlIlllIllllllII) {
      List<Entry<K, V>> lllllllllllllllIlIlIlllIlllllIll = new LinkedList(lllllllllllllllIlIlIlllIllllllII.entrySet());
      Collections.sort(lllllllllllllllIlIlIlllIlllllIll, Comparator.comparing((lllllllllllllllIlIlIlllIIlIIIlIl) -> {
         return (Comparable)lllllllllllllllIlIlIlllIIlIIIlIl.getValue();
      }));
      Map<K, V> lllllllllllllllIlIlIlllIllllllIl = new LinkedHashMap();
      Iterator lllllllllllllllIlIlIlllIlllllIIl = lllllllllllllllIlIlIlllIlllllIll.iterator();

      do {
         if (!lIIllllIIIllll(lllllllllllllllIlIlIlllIlllllIIl.hasNext())) {
            return lllllllllllllllIlIlIlllIllllllIl;
         }

         Entry<K, V> lllllllllllllllIlIlIlllIlllllIII = (Entry)lllllllllllllllIlIlIlllIlllllIIl.next();
         lllllllllllllllIlIlIlllIllllllIl.put(lllllllllllllllIlIlIlllIlllllIII.getKey(), lllllllllllllllIlIlIlllIlllllIII.getValue());
         "".length();
         "".length();
      } while((((124 ^ 115) << (" ".length() << " ".length()) ^ 126 ^ 73) & (165 ^ 192 ^ (58 ^ 13) << " ".length() ^ -" ".length())) != " ".length());

      return null;
   }

   private static boolean lIIllllIIlIIIl(int var0) {
      return var0 == 0;
   }

   private static String lIIllllIIIIIlI(String lllllllllllllllIlIlIlllIIIlIIlII, String lllllllllllllllIlIlIlllIIIlIIIIl) {
      try {
         long lllllllllllllllIlIlIlllIIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIlllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIIl[12]), "DES");
         Cipher lllllllllllllllIlIlIlllIIIlIIllI = Cipher.getInstance("DES");
         lllllllllllllllIlIlIlllIIIlIIllI.init(llllIIIlIIIl[2], lllllllllllllllIlIlIlllIIIlIIIII);
         return new String(lllllllllllllllIlIlIlllIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIlllIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIIllllIIlIIll(Object var0, Object var1) {
      return var0 == var1;
   }

   public void initializeGUI() {
      HashMap<Module.Category, Pair<Scrollpane, SettingsPanel>> lllllllllllllllIlIlIlllIllIIIIll = new HashMap();
      Iterator lllllllllllllllIlIlIlllIllIIIIlI = ModuleManager.getModules().iterator();

      Component[] var10001;
      while(lIIllllIIIllll(lllllllllllllllIlIlIlllIllIIIIlI.hasNext())) {
         final long lllllllllllllllIlIlIlllIllIIIIIl = (Module)lllllllllllllllIlIlIlllIllIIIIlI.next();
         if (lIIllllIIIllll(lllllllllllllllIlIlIlllIllIIIIIl.getCategory().isHidden())) {
            "".length();
            if (((87 + 90 - 79 + 49 ^ (192 ^ 141) << " ".length()) << (" ".length() << " ".length()) & ((23 + 12 - -104 + 66 ^ (17 ^ 32) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())) == "   ".length()) {
               return;
            }
         } else {
            byte lllllllllllllllIlIlIlllIllIIIIII = lllllllllllllllIlIlIlllIllIIIIIl.getCategory();
            Scrollpane lllllllllllllllIlIlIlllIllIllIlI;
            if (lIIllllIIlIIIl(lllllllllllllllIlIlIlllIllIIIIll.containsKey(lllllllllllllllIlIlIlllIllIIIIII))) {
               Exception lllllllllllllllIlIlIlllIlIllllll = new Stretcherlayout(llllIIIlIIIl[1]);
               lllllllllllllllIlIlIlllIlIllllll.setComponentOffsetWidth(llllIIIlIIIl[0]);
               lllllllllllllllIlIlIlllIllIllIlI = new Scrollpane(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), lllllllllllllllIlIlIlllIlIllllll, llllIIIlIIIl[7], llllIIIlIIIl[8]);
               lllllllllllllllIlIlIlllIllIllIlI.setMaximumHeight(llllIIIlIIIl[9]);
               "".length();
               lllllllllllllllIlIlIlllIllIIIIll.put(lllllllllllllllIlIlIlllIllIIIIII, new Pair(lllllllllllllllIlIlIlllIllIllIlI, new SettingsPanel(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), (Module)null)));
               "".length();
            }

            final Pair<Scrollpane, SettingsPanel> lllllllllllllllIlIlIlllIlIllllll = (Pair)lllllllllllllllIlIlIlllIllIIIIll.get(lllllllllllllllIlIlIlllIllIIIIII);
            lllllllllllllllIlIlIlllIllIllIlI = (Scrollpane)lllllllllllllllIlIlIlllIlIllllll.getKey();
            final CheckButton lllllllllllllllIlIlIlllIllIllIIl = new CheckButton(lllllllllllllllIlIlIlllIllIIIIIl.getName());
            lllllllllllllllIlIlIlllIllIllIIl.setToggled(lllllllllllllllIlIlIlllIllIIIIIl.isEnabled());
            lllllllllllllllIlIlIlllIllIllIIl.addTickListener(() -> {
               lllllllllllllllIlIlIlllIllIllIIl.setToggled(lllllllllllllllIlIlIlllIllIIIIIl.isEnabled());
               lllllllllllllllIlIlIlllIllIllIIl.setName(lllllllllllllllIlIlIlllIllIIIIIl.getName());
            });
            lllllllllllllllIlIlIlllIllIllIIl.addMouseListener(new MouseListener() {
               // $FF: synthetic field
               private static final int[] lllIllllllIl;

               public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIllIIIIllIlIIII) {
               }

               public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIllIIIIllIIlllI) {
               }

               public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIllIIIIllIlIlII) {
               }

               static {
                  lIIlllIllIIlll();
               }

               private static void lIIlllIllIIlll() {
                  lllIllllllIl = new int[1];
                  lllIllllllIl[0] = " ".length();
               }

               public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIllIIIIllIllIII) {
                  if (lIIlllIllIlIII(lllllllllllllllIlIllIIIIllIllIII.getButton(), lllIllllllIl[0])) {
                     ((SettingsPanel)lllllllllllllllIlIlIlllIlIllllll.getValue()).setModule(lllllllllllllllIlIlIlllIllIIIIIl);
                     ((SettingsPanel)lllllllllllllllIlIlIlllIlIllllll.getValue()).setX(lllllllllllllllIlIllIIIIllIllIII.getX() + lllllllllllllllIlIlIlllIllIllIIl.getX());
                     ((SettingsPanel)lllllllllllllllIlIlIlllIlIllllll.getValue()).setY(lllllllllllllllIlIllIIIIllIllIII.getY() + lllllllllllllllIlIlIlllIllIllIIl.getY());
                  }

               }

               private static boolean lIIlllIllIlIII(int var0, int var1) {
                  return var0 == var1;
               }

               public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIllIIIIllIlIIlI) {
               }
            });
            lllllllllllllllIlIlIlllIllIllIIl.addPoof(new CheckButton.CheckButtonPoof<CheckButton, CheckButton.CheckButtonPoof.CheckButtonPoofInfo>() {
               private static boolean lIlIIIIlllIllI(int var0) {
                  return var0 != 0;
               }

               public void execute(CheckButton lllllllllllllllIlIlIIIlIIllIIIlI, CheckButton.CheckButtonPoof.CheckButtonPoofInfo lllllllllllllllIlIlIIIlIIllIIIIl) {
                  if (lIlIIIIlllIllI(lllllllllllllllIlIlIIIlIIllIIIIl.getAction().equals(CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction.TOGGLE))) {
                     lllllllllllllllIlIlIlllIllIIIIIl.setEnabled(lllllllllllllllIlIlIlllIllIllIIl.isToggled());
                  }

               }
            });
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIllIllIIl;
            lllllllllllllllIlIlIlllIllIllIlI.addChild(var10001);
            "".length();
            "".length();
            if (" ".length() << " ".length() < " ".length() << " ".length()) {
               return;
            }
         }
      }

      Exception lllllllllllllllIlIlIlllIllIIIIlI = llllIIIlIIIl[10];
      int lllllllllllllllIlIlIlllIllIIllll = llllIIIlIIIl[10];
      byte lllllllllllllllIlIlIlllIllIIIIII = lllllllllllllllIlIlIlllIllIIllll;
      Iterator lllllllllllllllIlIlIlllIlIllllll = lllllllllllllllIlIlIlllIllIIIIll.entrySet().iterator();

      do {
         if (!lIIllllIIIllll(lllllllllllllllIlIlIlllIlIllllll.hasNext())) {
            lllllllllllllllIlIlIlllIllIIIlII.addMouseListener(new MouseListener() {
               // $FF: synthetic field
               private static final int[] lIIIIlllIlIll;

               private static boolean lIlIllIlIlllll(int var0) {
                  return var0 == 0;
               }

               public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIIllllIIlllIIIlIl) {
               }

               private boolean isBetween(int lllllllllllllllIIllllIIllllIllll, int lllllllllllllllIIllllIIllllIlllI, int lllllllllllllllIIllllIIllllIllIl) {
                  int var10000;
                  if (lIlIllIlIlllII(lllllllllllllllIIllllIIllllIlllI, lllllllllllllllIIllllIIllllIllIl) && lIlIllIlIlllIl(lllllllllllllllIIllllIIllllIlllI, lllllllllllllllIIllllIIllllIllll)) {
                     var10000 = lIIIIlllIlIll[0];
                     "".length();
                     if ("   ".length() < " ".length()) {
                        return (boolean)((168 ^ 181) & ~(86 ^ 75));
                     }
                  } else {
                     var10000 = lIIIIlllIlIll[1];
                  }

                  return (boolean)var10000;
               }

               private static boolean lIlIllIlIlllII(int var0, int var1) {
                  return var0 <= var1;
               }

               public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIIllllIIlllIIIlll) {
               }

               public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIIllllIIlllIIIIll) {
               }

               static {
                  lIlIllIlIllIlI();
               }

               private static void lIlIllIlIllIlI() {
                  lIIIIlllIlIll = new int[2];
                  lIIIIlllIlIll[0] = " ".length();
                  lIIIIlllIlIll[1] = (16 ^ 95) & ~(124 ^ 51);
               }

               public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIIllllIIlllIIllll) {
                  List<SettingsPanel> lllllllllllllllIIllllIIlllIIlllI = ContainerHelper.getAllChildren(SettingsPanel.class, lllllllllllllllIlIlIlllIllIIIlII);
                  Iterator lllllllllllllllIIllllIIlllIIllIl = lllllllllllllllIIllllIIlllIIlllI.iterator();

                  label29:
                  do {
                     do {
                        if (!lIlIllIlIllllI(lllllllllllllllIIllllIIlllIIllIl.hasNext())) {
                           return;
                        }

                        char lllllllllllllllIIllllIIlllIIllII = (SettingsPanel)lllllllllllllllIIllllIIlllIIllIl.next();
                        if (lIlIllIlIlllll(lllllllllllllllIIllllIIlllIIllII.isVisible())) {
                           "".length();
                           continue label29;
                        }

                        int[] lllllllllllllllIIllllIIlllIllllI = GUI.calculateRealPosition(lllllllllllllllIIllllIIlllIIllII);
                        boolean lllllllllllllllIIllllIIlllIIlIlI = lllllllllllllllIIllllIIlllIIllll.getX() - lllllllllllllllIIllllIIlllIllllI[lIIIIlllIlIll[1]];
                        long lllllllllllllllIIllllIIlllIIlIIl = lllllllllllllllIIllllIIlllIIllll.getY() - lllllllllllllllIIllllIIlllIllllI[lIIIIlllIlIll[0]];
                        if (!lIlIllIlIllllI(lllllllllllllllIIllllIIlllIlIllI.isBetween(lIIIIlllIlIll[1], lllllllllllllllIIllllIIlllIIlIlI, lllllllllllllllIIllllIIlllIIllII.getWidth())) || lIlIllIlIlllll(lllllllllllllllIIllllIIlllIlIllI.isBetween(lIIIIlllIlIll[1], lllllllllllllllIIllllIIlllIIlIIl, lllllllllllllllIIllllIIlllIIllII.getHeight()))) {
                           lllllllllllllllIIllllIIlllIIllII.setVisible((boolean)lIIIIlllIlIll[1]);
                        }

                        "".length();
                     } while(-"   ".length() <= 0);

                     return;
                  } while(((85 ^ 94) << " ".length() & ~((107 ^ 96) << " ".length())) >= ((160 ^ 181) & ~(80 ^ 69)));

               }

               private static boolean lIlIllIlIlllIl(int var0, int var1) {
                  return var0 >= var1;
               }

               public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIIllllIIllIllllll) {
               }

               private static boolean lIlIllIlIllllI(int var0) {
                  return var0 != 0;
               }
            });
            ArrayList<Frame> lllllllllllllllIlIlIlllIlIllllll = new ArrayList();
            long lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[11]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = new ActiveModules();
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[12]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            Label lllllllllllllllIlIlIlllIllIIlIll = new Label(llllIIIIllII[llllIIIlIIIl[13]]);
            lllllllllllllllIlIlIlllIllIIlIll.setShadow((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIllIIlIll.addTickListener(() -> {
               lllllllllllllllIlIlIlllIllIIlIll.setText(llllIIIIllII[llllIIIlIIIl[61]]);
               long lllllllllllllllIlIlIlllIIlIIllll = new DecimalFormat(llllIIIIllII[llllIIIlIIIl[62]]);
               float lllllllllllllllIlIlIlllIIlIlIIlI = lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71428_T.field_194149_e / 1000.0F;
               lllllllllllllllIlIlIlllIllIIlIll.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[63]]).append(lllllllllllllllIlIlIlllIIlIIllll.format((double)(MathHelper.func_76133_a(Math.pow(lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71439_g.field_70165_t - lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71439_g.field_70169_q, 2.0D) + Math.pow(lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71439_g.field_70161_v - lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71439_g.field_70166_s, 2.0D)) / lllllllllllllllIlIlIlllIIlIlIIlI))).append(llllIIIIllII[llllIIIlIIIl[64]])));
               if (lIIllllIIlIlII(lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71439_g) && lIIllllIIlIlII(lllllllllllllllIlIlIlllIIlIlIlIl.mc.func_147114_u())) {
                  label20: {
                     try {
                        lllllllllllllllIlIlIlllIIlIlIlIl.ms = lllllllllllllllIlIlIlllIIlIlIlIl.mc.func_147114_u().func_175102_a(lllllllllllllllIlIlIlllIIlIlIlIl.mc.field_71439_g.func_110124_au()).func_178853_c();
                     } catch (NullPointerException var6) {
                        "".length();
                        if (((71 + 34 - -58 + 18 ^ (171 ^ 132) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & (((24 ^ 29) << (" ".length() << (" ".length() << " ".length())) ^ 116 ^ 45) << (" ".length() << " ".length()) ^ -" ".length())) != " ".length()) {
                           break label20;
                        }

                        return;
                     }

                     "".length();
                     if (" ".length() << " ".length() >= " ".length() << (" ".length() << " ".length())) {
                        return;
                     }
                  }
               } else {
                  lllllllllllllllIlIlIlllIIlIlIlIl.ms = llllIIIlIIIl[65];
               }

               lllllllllllllllIlIlIlllIllIIlIll.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[66]]).append(lllllllllllllllIlIlIlllIIlIlIlIl.ms).append(llllIIIIllII[llllIIIlIIIl[67]])));
               lllllllllllllllIlIlIlllIllIIlIll.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[68]]).append(Math.round(LagCompensator.INSTANCE.getTickRate()))));
               lllllllllllllllIlIlIlllIllIIlIll.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[69]]).append(Minecraft.field_71470_ab)));
            });
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIllIIlIll;
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIllIIlIll.setFontRenderer(fontRenderer);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[10]]);
            Label lllllllllllllllIlIlIlllIllIIlIlI = new Label(llllIIIIllII[llllIIIlIIIl[14]]);
            DecimalFormat lllllllllllllllIlIlIlllIllIIlIIl = new DecimalFormat(llllIIIIllII[llllIIIlIIIl[15]]);
            lllllllllllllllIlIlIlllIllIIlIIl.setRoundingMode(RoundingMode.HALF_UP);
            StringBuilder lllllllllllllllIlIlIlllIllIIlIII = new StringBuilder();
            lllllllllllllllIlIlIlllIllIIlIlI.addTickListener(() -> {
               if (!lIIllllIIlIIIl(lllllllllllllllIlIlIlllIllIIlIlI.isVisible())) {
                  lllllllllllllllIlIlIlllIllIIlIlI.setText(llllIIIIllII[llllIIIlIIIl[46]]);
                  Minecraft lllllllllllllllIlIlIlllIIllIlIII = Wrapper.getMinecraft();
                  if (!lIIllllIIllIII(lllllllllllllllIlIlIlllIIllIlIII.field_71439_g)) {
                     List<EntityPlayer> lllllllllllllllIlIlIlllIIllIIIIl = lllllllllllllllIlIlIlllIIllIlIII.field_71441_e.field_73010_i;
                     Map<String, Integer> lllllllllllllllIlIlIlllIIllIIIIIx = new HashMap();
                     Iterator lllllllllllllllIlIlIlllIIlIlllll = lllllllllllllllIlIlIlllIIllIIIIl.iterator();

                     while(lIIllllIIIllll(lllllllllllllllIlIlIlllIIlIlllll.hasNext())) {
                        Entity lllllllllllllllIlIlIlllIIllIllIl = (Entity)lllllllllllllllIlIlIlllIIlIlllll.next();
                        if (lIIllllIIIllll(lllllllllllllllIlIlIlllIIllIllIl.func_70005_c_().equals(lllllllllllllllIlIlIlllIIllIlIII.field_71439_g.func_70005_c_()))) {
                           "".length();
                           if (((153 ^ 156) << " ".length() & ~((73 ^ 76) << " ".length())) >= " ".length() << (" ".length() << " ".length())) {
                              return;
                           }
                        } else {
                           String var10000;
                           if (lIIllllIIlIIlI(lIIllllIIlIllI(lllllllllllllllIlIlIlllIIllIllIl.field_70163_u, lllllllllllllllIlIlIlllIIllIlIII.field_71439_g.field_70163_u))) {
                              var10000 = String.valueOf((new StringBuilder()).append(ChatFormatting.DARK_GREEN).append(llllIIIIllII[llllIIIlIIIl[47]]));
                              "".length();
                              if (-" ".length() > ((84 ^ 105) & ~(83 ^ 110))) {
                                 return;
                              }
                           } else if (lIIllllIIlIIIl(lIIllllIIlIllI(lllllllllllllllIlIlIlllIIllIllIl.field_70163_u, lllllllllllllllIlIlIlllIIllIlIII.field_71439_g.field_70163_u))) {
                              var10000 = llllIIIIllII[llllIIIlIIIl[48]];
                              "".length();
                              if (((68 ^ 99) << " ".length() & ~((150 ^ 177) << " ".length())) != 0) {
                                 return;
                              }
                           } else {
                              var10000 = String.valueOf((new StringBuilder()).append(ChatFormatting.DARK_RED).append(llllIIIIllII[llllIIIlIIIl[49]]));
                           }

                           String lllllllllllllllIlIlIlllIIlllIIII = var10000;
                           int lllllllllllllllIlIlIlllIIlIlllII = ((EntityLivingBase)lllllllllllllllIlIlIlllIIllIllIl).func_110143_aJ() + ((EntityLivingBase)lllllllllllllllIlIlIlllIIllIllIl).func_110139_bj();
                           String lllllllllllllllIlIlIlllIIlIllIll = lllllllllllllllIlIlIlllIllIIlIIl.format((double)lllllllllllllllIlIlIlllIIlIlllII);
                           lllllllllllllllIlIlIlllIllIIlIII.append(Command.SECTIONSIGN());
                           "".length();
                           if (lIIllllIIllIIl(lIIllllIIlIlll(lllllllllllllllIlIlIlllIIlIlllII, 20.0F))) {
                              lllllllllllllllIlIlIlllIllIIlIII.append(llllIIIIllII[llllIIIlIIIl[50]]);
                              "".length();
                              "".length();
                              if (-" ".length() == " ".length()) {
                                 return;
                              }
                           } else if (lIIllllIIllIIl(lIIllllIIlIlll(lllllllllllllllIlIlIlllIIlIlllII, 10.0F))) {
                              lllllllllllllllIlIlIlllIllIIlIII.append(llllIIIIllII[llllIIIlIIIl[51]]);
                              "".length();
                              "".length();
                              if (" ".length() >= " ".length() << " ".length()) {
                                 return;
                              }
                           } else if (lIIllllIIllIIl(lIIllllIIlIlll(lllllllllllllllIlIlIlllIIlIlllII, 5.0F))) {
                              lllllllllllllllIlIlIlllIllIIlIII.append(llllIIIIllII[llllIIIlIIIl[52]]);
                              "".length();
                              "".length();
                              if (-(154 ^ 158) >= 0) {
                                 return;
                              }
                           } else {
                              lllllllllllllllIlIlIlllIllIIlIII.append(llllIIIIllII[llllIIIlIIIl[53]]);
                              "".length();
                           }

                           lllllllllllllllIlIlIlllIllIIlIII.append(lllllllllllllllIlIlIlllIIlIllIll);
                           "".length();
                           if (lIIllllIIIllll(Friends.isFriend(lllllllllllllllIlIlIlllIIllIllIl.func_70005_c_()))) {
                              lllllllllllllllIlIlIlllIIllIIIIIx.put(String.valueOf((new StringBuilder()).append(ChatFormatting.DARK_AQUA).append(lllllllllllllllIlIlIlllIIlllIIII).append(llllIIIIllII[llllIIIlIIIl[54]]).append(String.valueOf(lllllllllllllllIlIlIlllIllIIlIII)).append(llllIIIIllII[llllIIIlIIIl[26]]).append(ChatFormatting.DARK_AQUA).append(lllllllllllllllIlIlIlllIIllIllIl.func_70005_c_())), (int)lllllllllllllllIlIlIlllIIllIlIII.field_71439_g.func_70032_d(lllllllllllllllIlIlIlllIIllIllIl));
                              "".length();
                              "".length();
                              if (-" ".length() > " ".length() << " ".length()) {
                                 return;
                              }
                           } else {
                              lllllllllllllllIlIlIlllIIllIIIIIx.put(String.valueOf((new StringBuilder()).append(ChatFormatting.GRAY).append(lllllllllllllllIlIlIlllIIlllIIII).append(llllIIIIllII[llllIIIlIIIl[55]]).append(String.valueOf(lllllllllllllllIlIlIlllIllIIlIII)).append(llllIIIIllII[llllIIIlIIIl[56]]).append(ChatFormatting.GRAY).append(lllllllllllllllIlIlIlllIIllIllIl.func_70005_c_())), (int)lllllllllllllllIlIlIlllIIllIlIII.field_71439_g.func_70032_d(lllllllllllllllIlIlIlllIIllIllIl));
                              "".length();
                           }

                           lllllllllllllllIlIlIlllIllIIlIII.setLength(llllIIIlIIIl[0]);
                           "".length();
                           if (" ".length() <= 0) {
                              return;
                           }
                        }
                     }

                     if (lIIllllIIIllll(lllllllllllllllIlIlIlllIIllIIIIIx.isEmpty())) {
                        lllllllllllllllIlIlIlllIllIIlIlI.setText(llllIIIIllII[llllIIIlIIIl[57]]);
                     } else {
                        Map<String, Integer> lllllllllllllllIlIlIlllIIllIIIII = sortByValue(lllllllllllllllIlIlIlllIIllIIIIIx);
                        lllllllllllllllIlIlIlllIIlIlllll = lllllllllllllllIlIlIlllIIllIIIII.entrySet().iterator();

                        do {
                           if (!lIIllllIIIllll(lllllllllllllllIlIlIlllIIlIlllll.hasNext())) {
                              return;
                           }

                           Entry<String, Integer> lllllllllllllllIlIlIlllIIllIllII = (Entry)lllllllllllllllIlIlIlllIIlIlllll.next();
                           lllllllllllllllIlIlIlllIllIIlIlI.addLine(String.valueOf((new StringBuilder()).append(Command.SECTIONSIGN()).append(llllIIIIllII[llllIIIlIIIl[58]]).append((String)lllllllllllllllIlIlIlllIIllIllII.getKey()).append(llllIIIIllII[llllIIIlIIIl[59]]).append(Command.SECTIONSIGN()).append(llllIIIIllII[llllIIIlIIIl[60]]).append(lllllllllllllllIlIlIlllIIllIllII.getValue())));
                           "".length();
                        } while(null == null);

                     }
                  }
               }
            });
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.setMinimumWidth(llllIIIlIIIl[16]);
            "".length();
            lllllllllllllllIlIlIlllIllIIlIlI.setShadow((boolean)llllIIIlIIIl[1]);
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIllIIlIlI;
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIllIIlIlI.setFontRenderer(fontRenderer);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[17]]);
            String lllllllllllllllIlIlIlllIlIlllIIl = new Label(llllIIIIllII[llllIIIlIIIl[18]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllIIl.addTickListener(() -> {
               if (lIIllllIIlIlII(lllllllllllllllIlIlIlllIlIIIllII.mc.field_71439_g) && !lIIllllIIlIIIl(lllllllllllllllIlIlIlllIlIlllIIl.isVisible())) {
                  List<Entity> lllllllllllllllIlIlIlllIlIIIIllI = new ArrayList(lllllllllllllllIlIlIlllIlIIIllII.mc.field_71441_e.field_72996_f);
                  if (lIIllllIIlIlIl(lllllllllllllllIlIlIlllIlIIIIllI.size(), llllIIIlIIIl[1])) {
                     lllllllllllllllIlIlIlllIlIlllIIl.setText(llllIIIIllII[llllIIIlIIIl[42]]);
                  } else {
                     Map<String, Integer> lllllllllllllllIlIlIlllIlIIIlIIl = (Map)lllllllllllllllIlIlIlllIlIIIIllI.stream().filter(Objects::nonNull).filter((lllllllllllllllIlIlIlllIIlllllIl) -> {
                        int var10000;
                        if (lIIllllIIlIIIl(lllllllllllllllIlIlIlllIIlllllIl instanceof EntityPlayer)) {
                           var10000 = llllIIIlIIIl[1];
                           "".length();
                           if (((106 + 2 - -60 + 39 ^ "   ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length()) & ((41 ^ 126 ^ (132 ^ 143) << "   ".length()) << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                              return (boolean)(((18 ^ 1) << (" ".length() << " ".length()) ^ 236 ^ 177) << " ".length() & ((7 ^ 0 ^ (131 ^ 136) << " ".length()) << " ".length() ^ -" ".length()));
                           }
                        } else {
                           var10000 = llllIIIlIIIl[0];
                        }

                        return (boolean)var10000;
                     }).collect(Collectors.groupingBy(SnowGUI::getEntityName, Collectors.reducing(llllIIIlIIIl[0], (lllllllllllllllIlIlIlllIlIIIIIII) -> {
                        return lIIllllIIIllll(lllllllllllllllIlIlIlllIlIIIIIII instanceof EntityItem) ? ((EntityItem)lllllllllllllllIlIlIlllIlIIIIIII).func_92059_d().func_190916_E() : llllIIIlIIIl[1];
                     }, Integer::sum)));
                     lllllllllllllllIlIlIlllIlIlllIIl.setText(llllIIIIllII[llllIIIlIIIl[43]]);
                     Stream var10000 = lllllllllllllllIlIlIlllIlIIIlIIl.entrySet().stream().sorted(Entry.comparingByValue()).map((lllllllllllllllIlIlIlllIlIIIIIlI) -> {
                        return String.valueOf((new StringBuilder()).append(TextFormatting.GRAY).append((String)lllllllllllllllIlIlIlllIlIIIIIlI.getKey()).append(llllIIIIllII[llllIIIlIIIl[44]]).append(TextFormatting.DARK_GRAY).append(llllIIIIllII[llllIIIlIIIl[45]]).append(lllllllllllllllIlIlIlllIlIIIIIlI.getValue()));
                     });
                     lllllllllllllllIlIlIlllIlIlllIIl.getClass();
                     "".length();
                     var10000.forEach(lllllllllllllllIlIlIlllIlIlllIIl::addLine);
                  }
               }
            });
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIlIlllIIl;
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllIIl.setShadow((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllIIl.setFontRenderer(fontRenderer);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[19]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            Exception lllllllllllllllIlIlIlllIlIlllIII = new Label(llllIIIIllII[llllIIIlIIIl[20]]);
            lllllllllllllllIlIlIlllIlIlllIII.addTickListener(() -> {
               lllllllllllllllIlIlIlllIlIlllIII.setText(llllIIIIllII[llllIIIlIIIl[34]]);
               Minecraft lllllllllllllllIlIlIlllIlIIllIII = Minecraft.func_71410_x();
               boolean lllllllllllllllIlIlIlllIlIIlIIlI = lllllllllllllllIlIlIlllIlIIllIII.field_71441_e.func_180494_b(lllllllllllllllIlIlIlllIlIIllIII.field_71439_g.func_180425_c()).func_185359_l().equals(llllIIIIllII[llllIIIlIIIl[35]]);
               lllllllllllllllIlIlIlllIlIIllIlI.posX = (int)lllllllllllllllIlIlIlllIlIIllIII.field_71439_g.field_70165_t;
               lllllllllllllllIlIlIlllIlIIllIlI.posY = (int)lllllllllllllllIlIlIlllIlIIllIII.field_71439_g.field_70163_u;
               lllllllllllllllIlIlIlllIlIIllIlI.posZ = (int)lllllllllllllllIlIlIlllIlIIllIII.field_71439_g.field_70161_v;
               float var10000;
               if (lIIllllIIlIIIl(lllllllllllllllIlIlIlllIlIIlIIlI)) {
                  var10000 = 0.125F;
                  "".length();
                  if (" ".length() << (" ".length() << " ".length()) < 0) {
                     return;
                  }
               } else {
                  var10000 = 8.0F;
               }

               long lllllllllllllllIlIlIlllIlIIlIIIl = var10000;
               lllllllllllllllIlIlIlllIlIIllIlI.hposX = (int)(lllllllllllllllIlIlIlllIlIIllIII.field_71439_g.field_70165_t * (double)lllllllllllllllIlIlIlllIlIIlIIIl);
               lllllllllllllllIlIlIlllIlIIllIlI.hposZ = (int)(lllllllllllllllIlIlIlllIlIIllIII.field_71439_g.field_70161_v * (double)lllllllllllllllIlIlIlllIlIIlIIIl);
               lllllllllllllllIlIlIlllIlIlllIII.setText(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[36]]).append(lllllllllllllllIlIlIlllIlIIllIlI.posX).append(llllIIIIllII[llllIIIlIIIl[37]]).append(lllllllllllllllIlIlIlllIlIIllIlI.posY).append(llllIIIIllII[llllIIIlIIIl[38]]).append(lllllllllllllllIlIlIlllIlIIllIlI.posZ).append(llllIIIIllII[llllIIIlIIIl[39]]).append(lllllllllllllllIlIlIlllIlIIllIlI.hposX).append(llllIIIIllII[llllIIIlIIIl[40]]).append(lllllllllllllllIlIlIlllIlIIllIlI.hposZ).append(llllIIIIllII[llllIIIlIIIl[41]])));
            });
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIlIlllIII;
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIlIlllIII.setFontRenderer(fontRenderer);
            lllllllllllllllIlIlIlllIlIlllIII.setShadow((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.setHeight(llllIIIlIIIl[21]);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[22]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setMinimizeable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = new Radar();
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI.setWidth(llllIIIlIIIl[23]);
            lllllllllllllllIlIlIlllIlIlllllI.setHeight(llllIIIlIIIl[23]);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[24]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setMinimizeable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = new Inventory();
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI.setWidth(llllIIIlIIIl[25]);
            lllllllllllllllIlIlIlllIlIlllllI.setHeight(llllIIIlIIIl[26]);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[27]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            Label lllllllllllllllIlIlIlllIllIIIlIl = new Label(llllIIIIllII[llllIIIlIIIl[21]]);
            lllllllllllllllIlIlIlllIllIIIlIl.setShadow((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIllIIIlIl.addTickListener(() -> {
               lllllllllllllllIlIlIlllIllIIIlIl.setText(llllIIIIllII[llllIIIlIIIl[29]]);
               lllllllllllllllIlIlIlllIlIlIllll.totems = lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.field_71071_by.field_70462_a.stream().filter((lllllllllllllllIlIlIlllIlIlIIIII) -> {
                  int var10000;
                  if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIIIII.func_77973_b(), Items.field_190929_cY)) {
                     var10000 = llllIIIlIIIl[1];
                     "".length();
                     if (" ".length() << " ".length() == 0) {
                        return (boolean)((25 ^ 4) << " ".length() & ~((44 ^ 49) << " ".length()));
                     }
                  } else {
                     var10000 = llllIIIlIIIl[0];
                  }

                  return (boolean)var10000;
               }).mapToInt(ItemStack::func_190916_E).sum();
               lllllllllllllllIlIlIlllIlIlIllll.xps = lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.field_71071_by.field_70462_a.stream().filter((lllllllllllllllIlIlIlllIlIlIIlII) -> {
                  int var10000;
                  if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIIlII.func_77973_b(), Items.field_151062_by)) {
                     var10000 = llllIIIlIIIl[1];
                     "".length();
                     if (" ".length() << " ".length() > " ".length() << " ".length()) {
                        return (boolean)(((34 ^ 51) << "   ".length() ^ 71 + 98 - 72 + 44) << " ".length() & ((103 ^ 98 ^ (195 ^ 198) << " ".length() & ~((95 ^ 90) << " ".length())) << " ".length() ^ -" ".length()));
                     }
                  } else {
                     var10000 = llllIIIlIIIl[0];
                  }

                  return (boolean)var10000;
               }).mapToInt(ItemStack::func_190916_E).sum();
               lllllllllllllllIlIlIlllIlIlIllll.crystals = lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.field_71071_by.field_70462_a.stream().filter((lllllllllllllllIlIlIlllIlIlIIllI) -> {
                  int var10000;
                  if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIIllI.func_77973_b(), Items.field_185158_cP)) {
                     var10000 = llllIIIlIIIl[1];
                     "".length();
                     if (((64 ^ 105) << " ".length() & ~((151 ^ 190) << " ".length())) > "   ".length()) {
                        return (boolean)((34 ^ 43) << "   ".length() & ~((40 ^ 33) << "   ".length()));
                     }
                  } else {
                     var10000 = llllIIIlIIIl[0];
                  }

                  return (boolean)var10000;
               }).mapToInt(ItemStack::func_190916_E).sum();
               lllllllllllllllIlIlIlllIlIlIllll.gapples = lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.field_71071_by.field_70462_a.stream().filter((lllllllllllllllIlIlIlllIlIlIlIIl) -> {
                  int var10000;
                  if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIlIIl.func_77973_b(), Items.field_151153_ao)) {
                     var10000 = llllIIIlIIIl[1];
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) == 0) {
                        return (boolean)((31 ^ 32) & ~(67 ^ 124));
                     }
                  } else {
                     var10000 = llllIIIlIIIl[0];
                  }

                  return (boolean)var10000;
               }).mapToInt(ItemStack::func_190916_E).sum();
               if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_190929_cY)) {
                  lllllllllllllllIlIlIlllIlIlIllll.totems += llllIIIlIIIl[1];
               }

               if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151062_by)) {
                  lllllllllllllllIlIlIlllIlIlIllll.xps += lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().field_77994_a;
               }

               if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_185158_cP)) {
                  lllllllllllllllIlIlIlllIlIlIllll.crystals += lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().field_77994_a;
               }

               if (lIIllllIIlIIll(lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().func_77973_b(), Items.field_151153_ao)) {
                  lllllllllllllllIlIlIlllIlIlIllll.gapples += lllllllllllllllIlIlIlllIlIlIllll.mc.field_71439_g.func_184592_cb().field_77994_a;
               }

               lllllllllllllllIlIlIlllIllIIIlIl.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[30]]).append(lllllllllllllllIlIlIlllIlIlIllll.totems)));
               lllllllllllllllIlIlIlllIllIIIlIl.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[31]]).append(lllllllllllllllIlIlIlllIlIlIllll.xps)));
               lllllllllllllllIlIlIlllIllIIIlIl.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[32]]).append(lllllllllllllllIlIlIlllIlIlIllll.crystals)));
               lllllllllllllllIlIlIlllIllIIIlIl.addLine(String.valueOf((new StringBuilder()).append(llllIIIIllII[llllIIIlIIIl[33]]).append(lllllllllllllllIlIlIlllIlIlIllll.gapples)));
            });
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIllIIIlIl;
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIllIIlIll.setFontRenderer(fontRenderer);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), new Stretcherlayout(llllIIIlIIIl[1]), llllIIIIllII[llllIIIlIIIl[28]]);
            lllllllllllllllIlIlIlllIlIlllllI.setCloseable((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setMinimizeable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.setPinneable((boolean)llllIIIlIIIl[1]);
            lllllllllllllllIlIlIlllIlIlllllI.displayPinButton((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setBox((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setTitleEnabled((boolean)llllIIIlIIIl[0]);
            lllllllllllllllIlIlIlllIlIlllllI.setHudFrame((boolean)llllIIIlIIIl[1]);
            var10001 = new Component[llllIIIlIIIl[1]];
            var10001[llllIIIlIIIl[0]] = new KeyStroke();
            lllllllllllllllIlIlIlllIlIlllllI.addChild(var10001);
            "".length();
            lllllllllllllllIlIlIlllIlIlllllI.setWidth(llllIIIlIIIl[25]);
            lllllllllllllllIlIlIlllIlIlllllI.setHeight(llllIIIlIIIl[26]);
            lllllllllllllllIlIlIlllIlIllllll.add(lllllllllllllllIlIlIlllIlIlllllI);
            "".length();
            Iterator lllllllllllllllIlIlIlllIlIllIllI = lllllllllllllllIlIlIlllIlIllllll.iterator();

            do {
               if (!lIIllllIIIllll(lllllllllllllllIlIlIlllIlIllIllI.hasNext())) {
                  framesArray.addAll(lllllllllllllllIlIlIlllIlIllllll);
                  "".length();
                  return;
               }

               boolean lllllllllllllllIlIlIlllIlIllIlIl = (Frame)lllllllllllllllIlIlIlllIlIllIllI.next();
               lllllllllllllllIlIlIlllIlIllIlIl.setX(lllllllllllllllIlIlIlllIllIIIIlI);
               lllllllllllllllIlIlIlllIlIllIlIl.setY(lllllllllllllllIlIlIlllIllIIllll);
               lllllllllllllllIlIlIlllIllIIIIII = Math.max(lllllllllllllllIlIlIlllIllIIllll + lllllllllllllllIlIlIlllIlIllIlIl.getHeight() + llllIIIlIIIl[10], lllllllllllllllIlIlIlllIllIIIIII);
               lllllllllllllllIlIlIlllIllIIIIlI += lllllllllllllllIlIlIlllIlIllIlIl.getWidth() + llllIIIlIIIl[10];
               if (lIIllllIIlIIlI(lIIllllIIlIIII((float)(lllllllllllllllIlIlIlllIllIIIIlI * DisplayGuiScreen.getScale()), (float)Wrapper.getMinecraft().field_71443_c / 1.2F))) {
                  lllllllllllllllIlIlIlllIllIIllll = lllllllllllllllIlIlIlllIllIIIIII;
                  lllllllllllllllIlIlIlllIllIIIIII = lllllllllllllllIlIlIlllIllIIIIII;
                  lllllllllllllllIlIlIlllIllIIIIlI = llllIIIlIIIl[10];
               }

               var10001 = new Component[llllIIIlIIIl[1]];
               var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIlIllIlIl;
               lllllllllllllllIlIlIlllIllIIIlII.addChild(var10001);
               "".length();
               "".length();
            } while("   ".length() != -" ".length());

            return;
         }

         Entry<Module.Category, Pair<Scrollpane, SettingsPanel>> lllllllllllllllIlIlIlllIllIlIlII = (Entry)lllllllllllllllIlIlIlllIlIllllll.next();
         Stretcherlayout lllllllllllllllIlIlIlllIllIlIlll = new Stretcherlayout(llllIIIlIIIl[1]);
         lllllllllllllllIlIlIlllIllIlIlll.COMPONENT_OFFSET_Y = llllIIIlIIIl[1];
         Frame lllllllllllllllIlIlIlllIllIlIllI = new Frame(lllllllllllllllIlIlIlllIllIIIlII.getTheme(), lllllllllllllllIlIlIlllIllIlIlll, ((Module.Category)lllllllllllllllIlIlIlllIllIlIlII.getKey()).getName());
         Scrollpane lllllllllllllllIlIlIlllIllIlIlIl = (Scrollpane)((Pair)lllllllllllllllIlIlIlllIllIlIlII.getValue()).getKey();
         var10001 = new Component[llllIIIlIIIl[1]];
         var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIllIlIlIl;
         lllllllllllllllIlIlIlllIllIlIllI.addChild(var10001);
         "".length();
         var10001 = new Component[llllIIIlIIIl[1]];
         var10001[llllIIIlIIIl[0]] = (Component)((Pair)lllllllllllllllIlIlIlllIllIlIlII.getValue()).getValue();
         lllllllllllllllIlIlIlllIllIlIllI.addChild(var10001);
         "".length();
         lllllllllllllllIlIlIlllIllIlIlIl.setOriginOffsetY(llllIIIlIIIl[0]);
         lllllllllllllllIlIlIlllIllIlIlIl.setOriginOffsetX(llllIIIlIIIl[0]);
         lllllllllllllllIlIlIlllIllIlIllI.setCloseable((boolean)llllIIIlIIIl[0]);
         lllllllllllllllIlIlIlllIllIlIllI.setX(lllllllllllllllIlIlIlllIllIIIIlI);
         lllllllllllllllIlIlIlllIllIlIllI.setY(lllllllllllllllIlIlIlllIllIIllll);
         var10001 = new Component[llllIIIlIIIl[1]];
         var10001[llllIIIlIIIl[0]] = lllllllllllllllIlIlIlllIllIlIllI;
         lllllllllllllllIlIlIlllIllIIIlII.addChild(var10001);
         "".length();
         lllllllllllllllIlIlIlllIllIIIIII = Math.max(lllllllllllllllIlIlIlllIllIIllll + lllllllllllllllIlIlIlllIllIlIllI.getHeight() + llllIIIlIIIl[10], lllllllllllllllIlIlIlllIllIIIIII);
         lllllllllllllllIlIlIlllIllIIIIlI += lllllllllllllllIlIlIlllIllIlIllI.getWidth() + llllIIIlIIIl[10];
         if (lIIllllIIlIIlI(lIIllllIIlIIII((float)lllllllllllllllIlIlIlllIllIIIIlI, (float)Wrapper.getMinecraft().field_71443_c / 1.2F))) {
            lllllllllllllllIlIlIlllIllIIllll = lllllllllllllllIlIlIlllIllIIIIII;
            lllllllllllllllIlIlIlllIllIIIIII = lllllllllllllllIlIlIlllIllIIIIII;
         }

         "".length();
      } while(((41 + 97 - 74 + 139 ^ " ".length() << (156 ^ 155)) & (65 ^ 116 ^ (142 ^ 177) << " ".length() ^ -" ".length())) == 0);

   }

   public SnowGUI() {
      super(new rr.snowhack.snow.gui.snow.theme.ui.Theme());
      lllllllllllllllIlIlIllllIIIIlIIl.theme = lllllllllllllllIlIlIllllIIIIlIIl.getTheme();
   }
}
