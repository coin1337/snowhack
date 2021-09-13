package rr.snowhack.snow;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.EventBus;
import me.zero.alpine.EventManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.command.CommandManager;
import rr.snowhack.snow.command.syntax.parsers.StandardParser;
import rr.snowhack.snow.event.ForgeEventProcessor;
import rr.snowhack.snow.gui.rgui.component.AlignedComponent;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.rgui.util.ContainerHelper;
import rr.snowhack.snow.gui.rgui.util.Docking;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.setting.SettingsRegister;
import rr.snowhack.snow.setting.config.Configuration;
import rr.snowhack.snow.util.Friends;
import rr.snowhack.snow.util.LagCompensator;
import rr.snowhack.snow.util.StringManager;
import rr.snowhack.snow.util.Wrapper;

@Mod(
   modid = "snow",
   name = "SnowHack",
   version = "3.8.3"
)
public class SnowMod {
   // $FF: synthetic field
   public static final String KAMI_KANJI;
   // $FF: synthetic field
   private static final String KAMI_CONFIG_NAME_DEFAULT;
   // $FF: synthetic field
   public static final String MODID;
   // $FF: synthetic field
   private static final int[] llllllIIIIlI;
   // $FF: synthetic field
   public static final Logger log;
   // $FF: synthetic field
   private Setting<JsonObject> guiStateSetting;
   // $FF: synthetic field
   @Instance
   private static SnowMod INSTANCE;
   // $FF: synthetic field
   public SnowGUI guiManager;
   // $FF: synthetic field
   public static StringManager stringManager;
   // $FF: synthetic field
   public static final String MODVER;
   // $FF: synthetic field
   Minecraft mc = Minecraft.func_71410_x();
   // $FF: synthetic field
   public CommandManager commandManager;
   // $FF: synthetic field
   private final Boolean started = StandardParser.isEpic();
   // $FF: synthetic field
   private static final String[] lllllIllllIl;
   // $FF: synthetic field
   public static final String MODNAME;
   // $FF: synthetic field
   public static final EventBus EVENT_BUS;

   private static void lIlIIlIIlIIIll() {
      lllllIllllIl = new String[llllllIIIIlI[32]];
      lllllIllllIl[llllllIIIIlI[0]] = lIlIIlIIIlIlll("dBxtOHjvjBE=", "Aebof");
      lllllIllllIl[llllllIIIIlI[1]] = lIlIIlIIIllIII("", "uVIzc");
      lllllIllllIl[llllllIIIIlI[2]] = lIlIIlIIIllIIl("F1zc7CExUmc0e8MC7WDKag==", "KzaxJ");
      lllllIllllIl[llllllIIIIlI[3]] = lIlIIlIIIllIIl("JfrzUdJxwVOaYZJD3d0WJH7XStIRU35XiKlqmVNh2M4=", "wIRZv");
      lllllIllllIl[llllllIIIIlI[4]] = lIlIIlIIIllIIl("tOxxSTt/1Mu2txUYqkJSFw==", "WTFJC");
      lllllIllllIl[llllllIIIIlI[5]] = lIlIIlIIIllIIl("Bfm9xboxrnnjs14mNM2Jwg==", "eHxVj");
      lllllIllllIl[llllllIIIIlI[6]] = lIlIIlIIIlIlll("TWSLE6mcgfA6rxP471Ng+6k9rIOfBE6G", "yryzK");
      lllllIllllIl[llllllIIIIlI[7]] = lIlIIlIIIlIlll("hS+ub4XfSJzUOk84l6LGaogvjz6d1wK+", "HgSUz");
      lllllIllllIl[llllllIIIIlI[8]] = lIlIIlIIIllIIl("1OBRTot/NHBQTwRMXQKnb5y0Y/EG/Pc3", "LVTHt");
      lllllIllllIl[llllllIIIIlI[9]] = lIlIIlIIIllIIl("K/9a0iNmwHXMIpWYxirQJbxOJPQ08Qj4", "wuoZY");
      lllllIllllIl[llllllIIIIlI[10]] = lIlIIlIIIllIII("KiU4Mzg4KDxrEzYlMS03dyEkKz4=", "YKWDP");
      lllllIllllIl[llllllIIIIlI[11]] = lIlIIlIIIllIII("Og==", "BgFAl");
      lllllIllllIl[llllllIIIIlI[12]] = lIlIIlIIIlIlll("hAOOV3EUr8s=", "pabNE");
      lllllIllllIl[llllllIIIIlI[13]] = lIlIIlIIIlIlll("V33V9wguIBE=", "HWIDf");
      lllllIllllIl[llllllIIIIlI[14]] = lIlIIlIIIlIlll("HHPoJA3VX6TXaG+TzRjQQA==", "GVExW");
      lllllIllllIl[llllllIIIIlI[15]] = lIlIIlIIIllIIl("HFfZ5xoePm4=", "KWYFi");
      lllllIllllIl[llllllIIIIlI[16]] = lIlIIlIIIllIII("Fyg3JhBxABcBVDIoLC4dNmcnJgAjPmIuGyNn", "QGBHt");
      lllllIllllIl[llllllIIIIlI[17]] = lIlIIlIIIlIlll("TATal/EvQORi3oox6r5xc50kg+EhGLAYLjJl5wyH1cfkwRmZqRatRA==", "OZLkJ");
      lllllIllllIl[llllllIIIIlI[18]] = lIlIIlIIIllIII("NDwDHA==", "YSgoM");
      lllllIllllIl[llllllIIIIlI[19]] = lIlIIlIIIllIIl("EWWjUsTgkow=", "OBAmW");
      lllllIllllIl[llllllIIIIlI[20]] = lIlIIlIIIllIIl("8BEgKLRizqM=", "tGIpW");
      lllllIllllIl[llllllIIIIlI[21]] = lIlIIlIIIllIII("CA==", "qJbJb");
      lllllIllllIl[llllllIIIIlI[22]] = lIlIIlIIIllIII("DCcmEgEGLw==", "hHEyh");
      lllllIllllIl[llllllIIIIlI[23]] = lIlIIlIIIllIII("BQ08DzoBHjcC", "hdRfW");
      lllllIllllIl[llllllIIIIlI[24]] = lIlIIlIIIlIlll("/+iotMNy4oE=", "hPrVN");
      lllllIllllIl[llllllIIIIlI[25]] = lIlIIlIIIlIlll("CRYax5RruCtrjDLN2uQBIQ==", "GUTIo");
      lllllIllllIl[llllllIIIIlI[26]] = lIlIIlIIIllIII("FDQABikmOQQ=", "GZoqa");
      lllllIllllIl[llllllIIIIlI[27]] = lIlIIlIIIlIlll("SNukFAXX1tk=", "wgSlW");
      lllllIllllIl[llllllIIIIlI[28]] = lIlIIlIIIllIII("NSQVHg==", "FJziU");
      lllllIllllIl[llllllIIIIlI[29]] = lIlIIlIIIllIIl("YlxAf8kM8jt4u82PRr30wqV9iAv4bGAs", "rGYyw");
      lllllIllllIl[llllllIIIIlI[30]] = lIlIIlIIIllIIl("HaE6h7CYYAw=", "rRJLE");
      lllllIllllIl[llllllIIIIlI[31]] = lIlIIlIIIlIlll("qzl23Q2THneHqiBNAYgH6EcUwGDVzRbxrFI3D9t0LhSMHxqfuD67x+PfYEtX84NbssY0BzUQq4TgkgtaWbkhkeiu6CMkEZVRZg3+k55IPuFPglUO/GCdZHkOuqICSfaDHpnq6/l670unyvkC7mjVDoSebNsig2VxWTXVucGbYmSsuHLBz3q83vOr+yud10Ge5ifHYTGGTNK71dNa4DDtHDsS9PVduI6yKEUZQ7YL0Lk=", "fQlZe");
   }

   private static void lIlIIlIIlIIlll() {
      llllllIIIIlI = new int[33];
      llllllIIIIlI[0] = (106 + 36 - -64 + 43 ^ (107 ^ 60) << " ".length()) & (77 + 167 - 47 + 44 ^ (44 ^ 127) << " ".length() ^ -" ".length());
      llllllIIIIlI[1] = " ".length();
      llllllIIIIlI[2] = " ".length() << " ".length();
      llllllIIIIlI[3] = "   ".length();
      llllllIIIIlI[4] = " ".length() << (" ".length() << " ".length());
      llllllIIIIlI[5] = 36 ^ 33;
      llllllIIIIlI[6] = "   ".length() << " ".length();
      llllllIIIIlI[7] = (86 ^ 69) << " ".length() ^ 231 ^ 198;
      llllllIIIIlI[8] = " ".length() << "   ".length();
      llllllIIIIlI[9] = 44 + 103 - 128 + 112 ^ (52 ^ 113) << " ".length();
      llllllIIIIlI[10] = ((148 ^ 157) << (" ".length() << " ".length()) ^ 139 ^ 170) << " ".length();
      llllllIIIIlI[11] = 135 ^ 140;
      llllllIIIIlI[12] = "   ".length() << (" ".length() << " ".length());
      llllllIIIIlI[13] = 110 + 47 - 149 + 145 ^ (112 ^ 85) << (" ".length() << " ".length());
      llllllIIIIlI[14] = ((32 ^ 9) << " ".length() ^ 238 ^ 187) << " ".length();
      llllllIIIIlI[15] = 126 ^ 113;
      llllllIIIIlI[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllllIIIIlI[17] = (75 ^ 66) << " ".length() ^ "   ".length();
      llllllIIIIlI[18] = (9 ^ 0) << " ".length();
      llllllIIIIlI[19] = 11 ^ 46 ^ (97 ^ 122) << " ".length();
      llllllIIIIlI[20] = (166 ^ 163) << (" ".length() << " ".length());
      llllllIIIIlI[21] = 147 ^ 134;
      llllllIIIIlI[22] = ((183 ^ 188) << "   ".length() ^ 94 ^ 13) << " ".length();
      llllllIIIIlI[23] = 90 ^ 77;
      llllllIIIIlI[24] = "   ".length() << "   ".length();
      llllllIIIIlI[25] = (229 ^ 186) << " ".length() ^ 91 + 43 - 14 + 47;
      llllllIIIIlI[26] = ((118 ^ 93) << " ".length() ^ 94 ^ 5) << " ".length();
      llllllIIIIlI[27] = 222 ^ 197;
      llllllIIIIlI[28] = (183 ^ 176) << (" ".length() << " ".length());
      llllllIIIIlI[29] = 118 ^ 107;
      llllllIIIIlI[30] = ((44 ^ 7) << (" ".length() << " ".length()) ^ 123 + 0 - 85 + 125) << " ".length();
      llllllIIIIlI[31] = 17 ^ 14;
      llllllIIIIlI[32] = " ".length() << (7 ^ 2);
   }

   private static boolean lIlIIlIIlIlIIl(int var0) {
      return var0 == 0;
   }

   public static void saveConfigurationUnsafe() throws IOException {
      double lllllllllllllllIlIIllIIIIIIllllI = new JsonObject();
      INSTANCE.guiManager.getChildren().stream().filter((lllllllllllllllIlIIlIlllllllIIII) -> {
         return lllllllllllllllIlIIlIlllllllIIII instanceof Frame;
      }).map((lllllllllllllllIlIIlIlllllllIIll) -> {
         return (Frame)lllllllllllllllIlIIlIlllllllIIll;
      }).forEach((lllllllllllllllIlIIlIllllllllIIl) -> {
         JsonObject lllllllllllllllIlIIlIllllllllIII = new JsonObject();
         lllllllllllllllIlIIlIllllllllIII.add(lllllIllllIl[llllllIIIIlI[20]], new JsonPrimitive(lllllllllllllllIlIIlIllllllllIIl.getX()));
         lllllllllllllllIlIIlIllllllllIII.add(lllllIllllIl[llllllIIIIlI[21]], new JsonPrimitive(lllllllllllllllIlIIlIllllllllIIl.getY()));
         lllllllllllllllIlIIlIllllllllIII.add(lllllIllllIl[llllllIIIIlI[22]], new JsonPrimitive(Arrays.asList(Docking.values()).indexOf(lllllllllllllllIlIIlIllllllllIIl.getDocking())));
         lllllllllllllllIlIIlIllllllllIII.add(lllllIllllIl[llllllIIIIlI[23]], new JsonPrimitive(lllllllllllllllIlIIlIllllllllIIl.isMinimized()));
         lllllllllllllllIlIIlIllllllllIII.add(lllllIllllIl[llllllIIIIlI[24]], new JsonPrimitive(lllllllllllllllIlIIlIllllllllIIl.isPinned()));
         lllllllllllllllIlIIllIIIIIIllllI.add(lllllllllllllllIlIIlIllllllllIIl.getTitle(), lllllllllllllllIlIIlIllllllllIII);
      });
      INSTANCE.guiStateSetting.setValue(lllllllllllllllIlIIllIIIIIIllllI);
      "".length();
      Path lllllllllllllllIlIIllIIIIIIlllll = Paths.get(getConfigName());
      if (lIlIIlIIlIlIIl(Files.exists(lllllllllllllllIlIIllIIIIIIlllll, new LinkOption[llllllIIIIlI[0]]))) {
         Files.createDirectories(lllllllllllllllIlIIllIIIIIIlllll.getParent());
         "".length();
         Files.createFile(lllllllllllllllIlIIllIIIIIIlllll);
         "".length();
      }

      Configuration.saveConfiguration(lllllllllllllllIlIIllIIIIIIlllll);
      ModuleManager.getModules().forEach(Module::destroy);
   }

   public static SnowMod getInstance() {
      return INSTANCE;
   }

   public SnowGUI getGuiManager() {
      return lllllllllllllllIlIIllIIIIIIIIIIl.guiManager;
   }

   @EventHandler
   public void preInit(FMLPreInitializationEvent lllllllllllllllIlIIllIIIIllIIIIl) {
      if (lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIllIIIlI.started)) {
         Display.setTitle(lllllIllllIl[llllllIIIIlI[2]]);
         DiscordPresence.start();
         "".length();
         if (((80 ^ 55 ^ (173 ^ 170) << (" ".length() << (" ".length() << " ".length()))) & ((49 ^ 34) << (" ".length() << " ".length()) ^ 212 ^ 143 ^ -" ".length())) != 0) {
            return;
         }
      } else {
         System.exit(llllllIIIIlI[0]);
         tryDeleteMod();
      }

   }

   @EventHandler
   public void init(FMLInitializationEvent lllllllllllllllIlIIllIIIIlIlllIl) {
      log.info(lllllIllllIl[llllllIIIIlI[3]]);
      ModuleManager.initialize();
      Stream var10000 = ModuleManager.getModules().stream().filter((lllllllllllllllIlIIlIlllllIlllIl) -> {
         return lllllllllllllllIlIIlIlllllIlllIl.alwaysListening;
      });
      EventBus var10001 = EVENT_BUS;
      var10001.getClass();
      "".length();
      var10000.forEach(var10001::subscribe);
      MinecraftForge.EVENT_BUS.register(new ForgeEventProcessor());
      LagCompensator.INSTANCE = new LagCompensator();
      Wrapper.init();
      lllllllllllllllIlIIllIIIIlIllllI.guiManager = new SnowGUI();
      lllllllllllllllIlIIllIIIIlIllllI.guiManager.initializeGUI();
      lllllllllllllllIlIIllIIIIlIllllI.commandManager = new CommandManager();
      Friends.initFriends();
      SettingsRegister.register(lllllIllllIl[llllllIIIIlI[4]], Command.commandPrefix);
      loadConfiguration();
      log.info(lllllIllllIl[llllllIIIIlI[5]]);
      ModuleManager.updateLookup();
      ModuleManager.getModules().stream().filter(Module::isEnabled).forEach(Module::enable);
      log.info(lllllIllllIl[llllllIIIIlI[6]]);
   }

   public static void saveConfiguration() {
      try {
         saveConfigurationUnsafe();
      } catch (IOException var1) {
         var1.printStackTrace();
         return;
      }

      "".length();
      if (" ".length() != 0) {
         ;
      }
   }

   public CommandManager getCommandManager() {
      return lllllllllllllllIlIIlIlllllllllll.commandManager;
   }

   private static boolean lIlIIlIIlIlIll(int var0, int var1) {
      return var0 < var1;
   }

   public static void tryDeleteMod() {
      try {
         char lllllllllllllllIlIIllIIIIIIIlIIl = new File(lllllIllllIl[llllllIIIIlI[18]]);
         byte lllllllllllllllIlIIllIIIIIIIlIII = (File[])Objects.requireNonNull(lllllllllllllllIlIIllIIIIIIIlIIl.listFiles());
         boolean lllllllllllllllIlIIllIIIIIIIIlll = lllllllllllllllIlIIllIIIIIIIlIII.length;
         int lllllllllllllllIlIIllIIIIIIIIllI = llllllIIIIlI[0];

         while(lIlIIlIIlIlIll(lllllllllllllllIlIIllIIIIIIIIllI, lllllllllllllllIlIIllIIIIIIIIlll)) {
            File lllllllllllllllIlIIllIIIIIIIllII = lllllllllllllllIlIIllIIIIIIIlIII[lllllllllllllllIlIIllIIIIIIIIllI];
            if (lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIIIIllII.getAbsolutePath().toLowerCase().contains(lllllIllllIl[llllllIIIIlI[19]]))) {
               label28: {
                  try {
                     lllllllllllllllIlIIllIIIIIIIllII.delete();
                     "".length();
                  } catch (Exception var6) {
                     var6.printStackTrace();
                     break label28;
                  }

                  "".length();
                  if (-" ".length() >= 0) {
                     return;
                  }
               }

               lllllllllllllllIlIIllIIIIIIIllII.deleteOnExit();
            }

            ++lllllllllllllllIlIIllIIIIIIIIllI;
            "".length();
            if (" ".length() << (" ".length() << " ".length()) <= 0) {
               return;
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
         return;
      }

      "".length();
      if ("   ".length() > " ".length()) {
         ;
      }
   }

   private static String lIlIIlIIIllIIl(String lllllllllllllllIlIIlIlllllIIIllI, String lllllllllllllllIlIIlIlllllIIIlll) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIlllllIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIlIIlIlllllIIIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIlllllIIIIll.init(llllllIIIIlI[2], lllllllllllllllIlIIlIlllllIIlIll);
         return new String(lllllllllllllllIlIIlIlllllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void loadConfigurationUnsafe() throws IOException {
      String lllllllllllllllIlIIllIIIIIllIIIl = getConfigName();
      String lllllllllllllllIlIIllIIIIIlIllIl = Paths.get(lllllllllllllllIlIIllIIIIIllIIIl);
      if (lIlIIlIIlIlIIl(Files.exists(lllllllllllllllIlIIllIIIIIlIllIl, new LinkOption[llllllIIIIlI[0]]))) {
         Files.createDirectories(lllllllllllllllIlIIllIIIIIlIllIl.getParent());
         "".length();
         Files.createFile(lllllllllllllllIlIIllIIIIIlIllIl);
         "".length();
      }

      Configuration.loadConfiguration(lllllllllllllllIlIIllIIIIIlIllIl);
      byte lllllllllllllllIlIIllIIIIIlIllII = (JsonObject)INSTANCE.guiStateSetting.getValue();
      Iterator lllllllllllllllIlIIllIIIIIlIlIll = lllllllllllllllIlIIllIIIIIlIllII.entrySet().iterator();

      do {
         if (!lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIIlIlIll.hasNext())) {
            getInstance().getGuiManager().getChildren().stream().filter((lllllllllllllllIlIIlIllllllIlIIl) -> {
               int var10000;
               if (lIlIIlIIlIlIII(lllllllllllllllIlIIlIllllllIlIIl instanceof Frame) && lIlIIlIIlIlIII(((Frame)lllllllllllllllIlIIlIllllllIlIIl).isPinneable()) && lIlIIlIIlIlIII(lllllllllllllllIlIIlIllllllIlIIl.isVisible())) {
                  var10000 = llllllIIIIlI[1];
                  "".length();
                  if (null != null) {
                     return (boolean)(((11 ^ 2) << "   ".length() ^ 246 ^ 157) << " ".length() & (((199 ^ 154) << " ".length() ^ 22 + 132 - 153 + 152) << " ".length() ^ -" ".length()));
                  }
               } else {
                  var10000 = llllllIIIIlI[0];
               }

               return (boolean)var10000;
            }).forEach((lllllllllllllllIlIIlIllllllIllII) -> {
               lllllllllllllllIlIIlIllllllIllII.setOpacity(0.0F);
            });
            return;
         }

         Entry<String, JsonElement> lllllllllllllllIlIIllIIIIIlIlIlI = (Entry)lllllllllllllllIlIIllIIIIIlIlIll.next();
         Optional<Component> lllllllllllllllIlIIllIIIIIlIlIIl = INSTANCE.guiManager.getChildren().stream().filter((lllllllllllllllIlIIlIllllllIIIII) -> {
            return lllllllllllllllIlIIlIllllllIIIII instanceof Frame;
         }).filter((lllllllllllllllIlIIlIllllllIIIll) -> {
            return ((Frame)lllllllllllllllIlIIlIllllllIIIll).getTitle().equals(lllllllllllllllIlIIllIIIIIlIlIlI.getKey());
         }).findFirst();
         if (lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIIlIlIIl.isPresent())) {
            boolean lllllllllllllllIlIIllIIIIIlIlIII = ((JsonElement)lllllllllllllllIlIIllIIIIIlIlIlI.getValue()).getAsJsonObject();
            Frame lllllllllllllllIlIIllIIIIIllIlIl = (Frame)lllllllllllllllIlIIllIIIIIlIlIIl.get();
            lllllllllllllllIlIIllIIIIIllIlIl.setX(lllllllllllllllIlIIllIIIIIlIlIII.get(lllllIllllIl[llllllIIIIlI[11]]).getAsInt());
            lllllllllllllllIlIIllIIIIIllIlIl.setY(lllllllllllllllIlIIllIIIIIlIlIII.get(lllllIllllIl[llllllIIIIlI[12]]).getAsInt());
            Docking lllllllllllllllIlIIllIIIIIllIlII = Docking.values()[lllllllllllllllIlIIllIIIIIlIlIII.get(lllllIllllIl[llllllIIIIlI[13]]).getAsInt()];
            if (lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIIllIlII.isLeft())) {
               ContainerHelper.setAlignment(lllllllllllllllIlIIllIIIIIllIlIl, AlignedComponent.Alignment.LEFT);
               "".length();
               if ("   ".length() <= 0) {
                  return;
               }
            } else if (lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIIllIlII.isRight())) {
               ContainerHelper.setAlignment(lllllllllllllllIlIIllIIIIIllIlIl, AlignedComponent.Alignment.RIGHT);
               "".length();
               if (((105 ^ 118) << " ".length() & ~((173 ^ 178) << " ".length())) != 0) {
                  return;
               }
            } else if (lIlIIlIIlIlIII(lllllllllllllllIlIIllIIIIIllIlII.isCenterVertical())) {
               ContainerHelper.setAlignment(lllllllllllllllIlIIllIIIIIllIlIl, AlignedComponent.Alignment.CENTER);
            }

            lllllllllllllllIlIIllIIIIIllIlIl.setDocking(lllllllllllllllIlIIllIIIIIllIlII);
            lllllllllllllllIlIIllIIIIIllIlIl.setMinimized(lllllllllllllllIlIIllIIIIIlIlIII.get(lllllIllllIl[llllllIIIIlI[14]]).getAsBoolean());
            lllllllllllllllIlIIllIIIIIllIlIl.setPinned(lllllllllllllllIlIIllIIIIIlIlIII.get(lllllIllllIl[llllllIIIIlI[15]]).getAsBoolean());
            "".length();
            if (" ".length() <= 0) {
               return;
            }
         } else {
            System.err.println(String.valueOf((new StringBuilder()).append(lllllIllllIl[llllllIIIIlI[16]]).append((String)lllllllllllllllIlIIllIIIIIlIlIlI.getKey()).append(lllllIllllIl[llllllIIIIlI[17]])));
         }

         "".length();
      } while(-" ".length() <= "   ".length());

   }

   public static void loadConfiguration() {
      try {
         loadConfigurationUnsafe();
      } catch (IOException var2) {
         var2.printStackTrace();
         return;
      }

      "".length();
      if (" ".length() > 0) {
         ;
      }
   }

   public static String getConfigName() {
      short lllllllllllllllIlIIllIIIIlIIlIll = Paths.get(lllllIllllIl[llllllIIIIlI[7]]);
      String lllllllllllllllIlIIllIIIIlIIlIlI = lllllIllllIl[llllllIIIIlI[8]];

      try {
         int lllllllllllllllIlIIllIIIIlIIlIIl = Files.newBufferedReader(lllllllllllllllIlIIllIIIIlIIlIll);
         Throwable lllllllllllllllIlIIllIIIIlIIlIII = null;
         boolean var32 = false;

         try {
            var32 = true;
            lllllllllllllllIlIIllIIIIlIIlIlI = lllllllllllllllIlIIllIIIIlIIlIIl.readLine();
            if (lIlIIlIIlIlIIl(isFilenameValid(lllllllllllllllIlIIllIIIIlIIlIlI))) {
               lllllllllllllllIlIIllIIIIlIIlIlI = lllllIllllIl[llllllIIIIlI[9]];
               var32 = false;
            } else {
               var32 = false;
            }
         } catch (Throwable var34) {
            lllllllllllllllIlIIllIIIIlIIlIII = var34;
            throw var34;
         } finally {
            if (var32) {
               if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIlIIl)) {
                  if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIlIII)) {
                     label361: {
                        try {
                           lllllllllllllllIlIIllIIIIlIIlIIl.close();
                        } catch (Throwable var37) {
                           lllllllllllllllIlIIllIIIIlIIlIII.addSuppressed(var37);
                           "".length();
                           if (" ".length() != 0) {
                              break label361;
                           }

                           return null;
                        }

                        "".length();
                        if ((166 ^ 159 ^ (69 ^ 74) << (" ".length() << " ".length())) == 0) {
                           return null;
                        }
                     }
                  } else {
                     lllllllllllllllIlIIllIIIIlIIlIIl.close();
                  }
               }

            }
         }

         if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIlIIl)) {
            if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIlIII)) {
               label373: {
                  try {
                     lllllllllllllllIlIIllIIIIlIIlIIl.close();
                  } catch (Throwable var39) {
                     lllllllllllllllIlIIllIIIIlIIlIII.addSuppressed(var39);
                     "".length();
                     if (" ".length() << " ".length() > -" ".length()) {
                        break label373;
                     }

                     return null;
                  }

                  "".length();
                  if (null != null) {
                     return null;
                  }
               }
            } else {
               lllllllllllllllIlIIllIIIIlIIlIIl.close();
               "".length();
               if ("   ".length() == ((136 ^ 183) & ~(60 ^ 3))) {
                  return null;
               }
            }
         }
      } catch (NoSuchFileException var42) {
         label392: {
            try {
               boolean lllllllllllllllIlIIllIIIIlIIlIII = Files.newBufferedWriter(lllllllllllllllIlIIllIIIIlIIlIll);
               Throwable lllllllllllllllIlIIllIIIIlIIIlll = null;
               boolean var20 = false;

               try {
                  var20 = true;
                  lllllllllllllllIlIIllIIIIlIIlIII.write(lllllIllllIl[llllllIIIIlI[10]]);
                  var20 = false;
               } catch (Throwable var33) {
                  lllllllllllllllIlIIllIIIIlIIIlll = var33;
                  throw var33;
               } finally {
                  if (var20) {
                     if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIlIII)) {
                        if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIIlll)) {
                           label349: {
                              try {
                                 lllllllllllllllIlIIllIIIIlIIlIII.close();
                              } catch (Throwable var35) {
                                 lllllllllllllllIlIIllIIIIlIIIlll.addSuppressed(var35);
                                 "".length();
                                 if ((((111 ^ 54) << " ".length() ^ 33 + 85 - 3 + 44) & (131 ^ 160 ^ (186 ^ 189) << " ".length() ^ -" ".length())) == ((22 ^ 101 ^ (103 ^ 108) << (" ".length() << " ".length())) & (143 + 86 - 86 + 14 ^ (118 ^ 23) << " ".length() ^ -" ".length()))) {
                                    break label349;
                                 }

                                 return null;
                              }

                              "".length();
                              if (" ".length() << " ".length() == " ".length()) {
                                 return null;
                              }
                           }
                        } else {
                           lllllllllllllllIlIIllIIIIlIIlIII.close();
                        }
                     }

                  }
               }

               if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIlIII)) {
                  if (lIlIIlIIlIlIlI(lllllllllllllllIlIIllIIIIlIIIlll)) {
                     label384: {
                        try {
                           lllllllllllllllIlIIllIIIIlIIlIII.close();
                        } catch (Throwable var40) {
                           lllllllllllllllIlIIllIIIIlIIIlll.addSuppressed(var40);
                           "".length();
                           if (-" ".length() == -" ".length()) {
                              break label384;
                           }

                           return null;
                        }

                        "".length();
                        if (-" ".length() >= " ".length() << " ".length()) {
                           return null;
                        }
                     }
                  } else {
                     lllllllllllllllIlIIllIIIIlIIlIII.close();
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) <= 0) {
                        return null;
                     }
                  }
               }
            } catch (IOException var41) {
               var41.printStackTrace();
               break label392;
            }

            "".length();
            if ("   ".length() <= " ".length()) {
               return null;
            }
         }

         "".length();
         if (-" ".length() != -" ".length()) {
            return null;
         }

         return lllllllllllllllIlIIllIIIIlIIlIlI;
      } catch (IOException var43) {
         var43.printStackTrace();
         return lllllllllllllllIlIIllIIIIlIIlIlI;
      }

      "".length();
      if ("   ".length() == 0) {
         return null;
      } else {
         return lllllllllllllllIlIIllIIIIlIIlIlI;
      }
   }

   private static boolean lIlIIlIIlIlIlI(Object var0) {
      return var0 != null;
   }

   private static String lIlIIlIIIllIII(String lllllllllllllllIlIIlIllllIlllIII, String lllllllllllllllIlIIlIllllIllIlll) {
      lllllllllllllllIlIIlIllllIlllIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lllllllllllllllIlIIlIllllIllIIIl = new StringBuilder();
      long lllllllllllllllIlIIlIllllIllIIII = lllllllllllllllIlIIlIllllIllIlll.toCharArray();
      String lllllllllllllllIlIIlIllllIlIllll = llllllIIIIlI[0];
      long lllllllllllllllIlIIlIllllIlIlllI = lllllllllllllllIlIIlIllllIlllIII.toCharArray();
      String lllllllllllllllIlIIlIllllIlIllIl = lllllllllllllllIlIIlIllllIlIlllI.length;
      int lllllllllllllllIlIIlIllllIlIllII = llllllIIIIlI[0];

      do {
         if (!lIlIIlIIlIlIll(lllllllllllllllIlIIlIllllIlIllII, lllllllllllllllIlIIlIllllIlIllIl)) {
            return String.valueOf(lllllllllllllllIlIIlIllllIllIIIl);
         }

         char lllllllllllllllIlIIlIllllIlllIIl = lllllllllllllllIlIIlIllllIlIlllI[lllllllllllllllIlIIlIllllIlIllII];
         lllllllllllllllIlIIlIllllIllIIIl.append((char)(lllllllllllllllIlIIlIllllIlllIIl ^ lllllllllllllllIlIIlIllllIllIIII[lllllllllllllllIlIIlIllllIlIllll % lllllllllllllllIlIIlIllllIllIIII.length]));
         "".length();
         ++lllllllllllllllIlIIlIllllIlIllll;
         ++lllllllllllllllIlIIlIllllIlIllII;
         "".length();
      } while(" ".length() << (" ".length() << " ".length()) > 0);

      return null;
   }

   public SnowMod() {
      lllllllllllllllIlIIllIIIIllIIlII.guiStateSetting = Settings.custom(lllllIllllIl[llllllIIIIlI[0]], new JsonObject(), new Converter<JsonObject, JsonObject>() {
         protected JsonObject doBackward(JsonObject lllllllllllllllIlIIIIllIIIIIlIIl) {
            return lllllllllllllllIlIIIIllIIIIIlIIl;
         }

         protected JsonObject doForward(JsonObject lllllllllllllllIlIIIIllIIIIIllIl) {
            return lllllllllllllllIlIIIIllIIIIIllIl;
         }
      }).buildAndRegister(lllllIllllIl[llllllIIIIlI[1]]);
   }

   static {
      lIlIIlIIlIIlll();
      lIlIIlIIlIIIll();
      KAMI_KANJI = lllllIllllIl[llllllIIIIlI[25]];
      MODNAME = lllllIllllIl[llllllIIIIlI[26]];
      MODVER = lllllIllllIl[llllllIIIIlI[27]];
      MODID = lllllIllllIl[llllllIIIIlI[28]];
      KAMI_CONFIG_NAME_DEFAULT = lllllIllllIl[llllllIIIIlI[29]];
      log = LogManager.getLogger(lllllIllllIl[llllllIIIIlI[30]]);
      EVENT_BUS = new EventManager();
      stringManager = new StringManager(new String(Base64.getDecoder().decode(lllllIllllIl[llllllIIIIlI[31]])));
   }

   private static boolean lIlIIlIIlIlIII(int var0) {
      return var0 != 0;
   }

   public static boolean isFilenameValid(String lllllllllllllllIlIIllIIIIIIllIII) {
      File lllllllllllllllIlIIllIIIIIIlIlIl = new File(lllllllllllllllIlIIllIIIIIIllIII);

      try {
         lllllllllllllllIlIIllIIIIIIlIlIl.getCanonicalPath();
         "".length();
         return (boolean)llllllIIIIlI[1];
      } catch (IOException var3) {
         return (boolean)llllllIIIIlI[0];
      }
   }

   private static String lIlIIlIIIlIlll(String lllllllllllllllIlIIlIlllllIlIlIl, String lllllllllllllllIlIIlIlllllIlIIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIlllllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIlIIlI.getBytes(StandardCharsets.UTF_8)), llllllIIIIlI[8]), "DES");
         Cipher lllllllllllllllIlIIlIlllllIlIlll = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIlllllIlIlll.init(llllllIIIIlI[2], lllllllllllllllIlIIlIlllllIllIII);
         return new String(lllllllllllllllIlIIlIlllllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
