package rr.snowhack.snow.module;

import com.google.common.base.Converter;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;
import rr.snowhack.snow.setting.builder.SettingBuilder;
import rr.snowhack.snow.util.Bind;

public class Module {
   // $FF: synthetic field
   private Setting<Bind> bind;
   // $FF: synthetic field
   private final String description;
   // $FF: synthetic field
   private Setting<Boolean> enabled;
   // $FF: synthetic field
   private final Setting<String> name;
   // $FF: synthetic field
   private static final int[] lIIIlIlIIIIII;
   // $FF: synthetic field
   private final Module.Category category;
   // $FF: synthetic field
   public boolean checked;
   // $FF: synthetic field
   public List<Setting> settingList;
   // $FF: synthetic field
   public boolean alwaysListening;
   // $FF: synthetic field
   protected static final Minecraft mc;
   // $FF: synthetic field
   private final String originalName;
   // $FF: synthetic field
   private static final String[] lIIIlIIllllll;

   private static boolean lIllIIIIIlIlIl(int var0) {
      return var0 != 0;
   }

   public String getOriginalName() {
      return lllllllllllllllIIlllIIIIIllIlIlI.originalName;
   }

   protected <T> Setting<T> register(SettingBuilder<T> lllllllllllllllIIlllIIIIIIIlIlll) {
      if (lIllIIIIIllIll(lllllllllllllllIIlllIIIIIIIllIll.settingList)) {
         lllllllllllllllIIlllIIIIIIIllIll.settingList = new ArrayList();
      }

      Setting<T> lllllllllllllllIIlllIIIIIIIllIIl = lllllllllllllllIIlllIIIIIIIlIlll.buildAndRegister(String.valueOf((new StringBuilder()).append(lIIIlIIllllll[lIIIlIlIIIIII[12]]).append(lllllllllllllllIIlllIIIIIIIllIll.name)));
      lllllllllllllllIIlllIIIIIIIllIll.settingList.add(lllllllllllllllIIlllIIIIIIIllIIl);
      "".length();
      return lllllllllllllllIIlllIIIIIIIllIIl;
   }

   private static String lIllIIIIIlIIlI(String lllllllllllllllIIlllIIIIIIIIIIII, String lllllllllllllllIIllIllllllllllll) {
      try {
         boolean lllllllllllllllIIllIllllllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String lllllllllllllllIIllIlllllllllIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllIlllllllllIll.init(lIIIlIlIIIIII[2], lllllllllllllllIIllIllllllllllII);
         return new String(lllllllllllllllIIllIlllllllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public String getName() {
      return (String)lllllllllllllllIIlllIIIIIllIIlll.name.getValue();
   }

   public void destroy() {
   }

   private static boolean lIllIIIIIllIII(Object var0, Object var1) {
      return var0 != var1;
   }

   private static boolean lIllIIIIIllIIl(int var0, int var1) {
      return var0 != var1;
   }

   private static String lIllIIIIIlIIII(String lllllllllllllllIIlllIIIIIIIIlIll, String lllllllllllllllIIlllIIIIIIIIlIlI) {
      try {
         SecretKeySpec lllllllllllllllIIlllIIIIIIIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIIII[8]), "DES");
         long lllllllllllllllIIlllIIIIIIIIlIII = Cipher.getInstance("DES");
         lllllllllllllllIIlllIIIIIIIIlIII.init(lIIIlIlIIIIII[2], lllllllllllllllIIlllIIIIIIIlIIII);
         return new String(lllllllllllllllIIlllIIIIIIIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var5) {
         var5.printStackTrace();
         return null;
      }
   }

   public void onWorldRender(RenderEvent lllllllllllllllIIlllIIIIIllllIII) {
   }

   public Module() {
      lllllllllllllllIIlllIIIIlIIIIlII.originalName = lllllllllllllllIIlllIIIIlIIIIlII.getAnnotation().name();
      lllllllllllllllIIlllIIIIlIIIIlII.name = lllllllllllllllIIlllIIIIlIIIIlII.register(Settings.s(lIIIlIIllllll[lIIIlIlIIIIII[0]], lllllllllllllllIIlllIIIIlIIIIlII.originalName));
      lllllllllllllllIIlllIIIIlIIIIlII.description = lllllllllllllllIIlllIIIIlIIIIlII.getAnnotation().description();
      lllllllllllllllIIlllIIIIlIIIIlII.category = lllllllllllllllIIlllIIIIlIIIIlII.getAnnotation().category();
      lllllllllllllllIIlllIIIIlIIIIlII.bind = lllllllllllllllIIlllIIIIlIIIIlII.register(Settings.custom(lIIIlIIllllll[lIIIlIlIIIIII[1]], Bind.none(), new Module.BindConverter()).build());
      lllllllllllllllIIlllIIIIlIIIIlII.enabled = lllllllllllllllIIlllIIIIlIIIIlII.register(Settings.booleanBuilder(lIIIlIIllllll[lIIIlIlIIIIII[2]]).withVisibility((lllllllllllllllIIlllIIIIIIIlIlIl) -> {
         return (boolean)lIIIlIlIIIIII[0];
      }).withValue(Boolean.valueOf((boolean)lIIIlIlIIIIII[0])).build());
      lllllllllllllllIIlllIIIIlIIIIlII.settingList = new ArrayList();
      lllllllllllllllIIlllIIIIlIIIIlII.alwaysListening = lllllllllllllllIIlllIIIIlIIIIlII.getAnnotation().alwaysListening();
      Setting[] var10001 = new Setting[lIIIlIlIIIIII[2]];
      var10001[lIIIlIlIIIIII[0]] = lllllllllllllllIIlllIIIIlIIIIlII.bind;
      var10001[lIIIlIlIIIIII[1]] = lllllllllllllllIIlllIIIIlIIIIlII.enabled;
      lllllllllllllllIIlllIIIIlIIIIlII.registerAll(var10001);
      lllllllllllllllIIlllIIIIlIIIIlII.checked = (boolean)lIIIlIlIIIIII[0];
   }

   public void enable() {
      lllllllllllllllIIlllIIIIIlIIlIll.enabled.setValue(Boolean.valueOf((boolean)lIIIlIlIIIIII[1]));
      "".length();
      if (lIllIIIIIlIllI(mc.field_71439_g) && lIllIIIIIlIlIl(ModuleManager.isModuleEnabled(lIIIlIIllllll[lIIIlIlIIIIII[5]])) && lIllIIIIIllIII(lllllllllllllllIIlllIIIIIlIIlIll.getCategory(), Module.Category.HIDDEN)) {
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIIllllll[lIIIlIlIIIIII[6]]).append(lllllllllllllllIIlllIIIIIlIIlIll.getName()).append(lIIIlIIllllll[lIIIlIlIIIIII[7]])));
      }

      lllllllllllllllIIlllIIIIIlIIlIll.onEnable();
      if (lIllIIIIIlIlll(lllllllllllllllIIlllIIIIIlIIlIll.alwaysListening)) {
         SnowMod.EVENT_BUS.subscribe((Object)lllllllllllllllIIlllIIIIIlIIlIll);
      }

   }

   private static boolean lIllIIIIIllIll(Object var0) {
      return var0 == null;
   }

   public void setName(String lllllllllllllllIIlllIIIIIllIllII) {
      lllllllllllllllIIlllIIIIIllIllIl.name.setValue(lllllllllllllllIIlllIIIIIllIllII);
      "".length();
      ModuleManager.updateLookup();
   }

   protected void onEnable() {
   }

   protected void onDisable() {
   }

   public Module.Category getCategory() {
      return lllllllllllllllIIlllIIIIIllIIIIl.category;
   }

   public String getBindName() {
      return ((Bind)lllllllllllllllIIlllIIIIIlllIIlI.bind.getValue()).toString();
   }

   private Module.Info getAnnotation() {
      if (lIllIIIIIlIlIl(lllllllllllllllIIlllIIIIlIIIIIIl.getClass().isAnnotationPresent(Module.Info.class))) {
         return (Module.Info)lllllllllllllllIIlllIIIIlIIIIIIl.getClass().getAnnotation(Module.Info.class);
      } else {
         throw new IllegalStateException(String.valueOf((new StringBuilder()).append(lIIIlIIllllll[lIIIlIlIIIIII[3]]).append(lllllllllllllllIIlllIIIIlIIIIIIl.getClass().getCanonicalName()).append(lIIIlIIllllll[lIIIlIlIIIIII[4]])));
      }
   }

   protected void registerAll(Setting... lllllllllllllllIIlllIIIIIIlIlIIl) {
      Exception lllllllllllllllIIlllIIIIIIlIlIII = lllllllllllllllIIlllIIIIIIlIlIIl;
      char lllllllllllllllIIlllIIIIIIlIIlll = lllllllllllllllIIlllIIIIIIlIlIIl.length;
      int lllllllllllllllIIlllIIIIIIlIIllI = lIIIlIlIIIIII[0];

      do {
         if (!lIllIIIIIllIlI(lllllllllllllllIIlllIIIIIIlIIllI, lllllllllllllllIIlllIIIIIIlIIlll)) {
            return;
         }

         Setting lllllllllllllllIIlllIIIIIIlIllIl = lllllllllllllllIIlllIIIIIIlIlIII[lllllllllllllllIIlllIIIIIIlIIllI];
         lllllllllllllllIIlllIIIIIIlIllII.register(lllllllllllllllIIlllIIIIIIlIllIl);
         "".length();
         ++lllllllllllllllIIlllIIIIIIlIIllI;
         "".length();
      } while(("   ".length() << " ".length() & ~("   ".length() << " ".length())) >= 0);

   }

   public Bind getBind() {
      return (Bind)lllllllllllllllIIlllIIIIIlllIllI.bind.getValue();
   }

   private static void lIllIIIIIlIIll() {
      lIIIlIIllllll = new String[lIIIlIlIIIIII[13]];
      lIIIlIIllllll[lIIIlIlIIIIII[0]] = lIllIIIIIlIIII("4lzkLFlLHYo=", "SwUVH");
      lIIIlIIllllll[lIIIlIlIIIIII[1]] = lIllIIIIIlIIIl("Mj4hDw==", "pWOkW");
      lIIIlIIllllll[lIIIlIlIIIIII[2]] = lIllIIIIIlIIII("c43MuaR1oLI=", "qcxCW");
      lIIIlIIllllll[lIIIlIlIIIIII[3]] = lIllIIIIIlIIIl("GCZiDSU4JjYtPz8mLGwkOGkhIColOmI=", "VIBLK");
      lIIIlIIllllll[lIIIlIlIIIIII[4]] = lIllIIIIIlIIIl("bQ==", "Lsbsm");
      lIIIlIIllllll[lIIIlIlIIIIII[5]] = lIllIIIIIlIIlI("lpK86LANVRnMdleaAsxHKA==", "BWldS");
      lIIIlIIllllll[lIIIlIlIIIIII[6]] = lIllIIIIIlIIlI("KKU5IxY3MAI=", "qWBAi");
      lIIIlIIllllll[lIIIlIlIIIIII[7]] = lIllIIIIIlIIIl("QsO0BSQrQsO0Aig2AzEPKDw=", "bScMX");
      lIIIlIIllllll[lIIIlIlIIIIII[8]] = lIllIIIIIlIIIl("IQMGLz4QIQQ7IRQLBA==", "ulaHR");
      lIIIlIIllllll[lIIIlIlIIIIII[9]] = lIllIIIIIlIIlI("24jseiu09l4=", "OKuQk");
      lIIIlIIllllll[lIIIlIlIIIIII[10]] = lIllIIIIIlIIIl("ZMOqHg8AZMOqGwIaNywaChYg", "DMxfs");
      lIIIlIIllllll[lIIIlIlIIIIII[11]] = lIllIIIIIlIIlI("YKlD4QDpLY+y9wBzhJTkZg==", "UxqVX");
      lIIIlIIllllll[lIIIlIlIIIIII[12]] = lIllIIIIIlIIIl("LwwpDzknEGM=", "BcMzU");
   }

   public String getDescription() {
      return lllllllllllllllIIlllIIIIIllIIIll.description;
   }

   public String getHudInfo() {
      return null;
   }

   private static void lIllIIIIIlIlII() {
      lIIIlIlIIIIII = new int[14];
      lIIIlIlIIIIII[0] = " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
      lIIIlIlIIIIII[1] = " ".length();
      lIIIlIlIIIIII[2] = " ".length() << " ".length();
      lIIIlIlIIIIII[3] = "   ".length();
      lIIIlIlIIIIII[4] = " ".length() << (" ".length() << " ".length());
      lIIIlIlIIIIII[5] = 203 ^ 194 ^ "   ".length() << (" ".length() << " ".length());
      lIIIlIlIIIIII[6] = "   ".length() << " ".length();
      lIIIlIlIIIIII[7] = 115 + 33 - 110 + 107 ^ (21 ^ 94) << " ".length();
      lIIIlIlIIIIII[8] = " ".length() << "   ".length();
      lIIIlIlIIIIII[9] = 4 ^ 13;
      lIIIlIlIIIIII[10] = (162 ^ 157 ^ (49 ^ 44) << " ".length()) << " ".length();
      lIIIlIlIIIIII[11] = 186 ^ 177;
      lIIIlIlIIIIII[12] = "   ".length() << (" ".length() << " ".length());
      lIIIlIlIIIIII[13] = 128 ^ 141;
   }

   protected <T> Setting<T> register(Setting<T> lllllllllllllllIIlllIIIIIIIlllll) {
      if (lIllIIIIIllIll(lllllllllllllllIIlllIIIIIIlIIIlI.settingList)) {
         lllllllllllllllIIlllIIIIIIlIIIlI.settingList = new ArrayList();
      }

      lllllllllllllllIIlllIIIIIIlIIIlI.settingList.add(lllllllllllllllIIlllIIIIIIIlllll);
      "".length();
      return SettingBuilder.register(lllllllllllllllIIlllIIIIIIIlllll, String.valueOf((new StringBuilder()).append(lIIIlIIllllll[lIIIlIlIIIIII[11]]).append(lllllllllllllllIIlllIIIIIIlIIIlI.originalName)));
   }

   public void onRender() {
   }

   public boolean isEnabled() {
      return (Boolean)lllllllllllllllIIlllIIIIIlIllllI.enabled.getValue();
   }

   private static boolean lIllIIIIIlIllI(Object var0) {
      return var0 != null;
   }

   public void disable() {
      lllllllllllllllIIlllIIIIIlIIlIII.enabled.setValue(Boolean.valueOf((boolean)lIIIlIlIIIIII[0]));
      "".length();
      if (lIllIIIIIlIllI(mc.field_71439_g) && lIllIIIIIlIlIl(ModuleManager.isModuleEnabled(lIIIlIIllllll[lIIIlIlIIIIII[8]])) && lIllIIIIIllIII(lllllllllllllllIIlllIIIIIlIIlIII.getCategory(), Module.Category.HIDDEN)) {
         Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIlIIllllll[lIIIlIlIIIIII[9]]).append(lllllllllllllllIIlllIIIIIlIIlIII.getName()).append(lIIIlIIllllll[lIIIlIlIIIIII[10]])));
      }

      lllllllllllllllIIlllIIIIIlIIlIII.onDisable();
      if (lIllIIIIIlIlll(lllllllllllllllIIlllIIIIIlIIlIII.alwaysListening)) {
         SnowMod.EVENT_BUS.unsubscribe((Object)lllllllllllllllIIlllIIIIIlIIlIII);
      }

   }

   private static boolean lIllIIIIIllIlI(int var0, int var1) {
      return var0 < var1;
   }

   public boolean isDisabled() {
      int var10000;
      if (lIllIIIIIlIlll(lllllllllllllllIIlllIIIIIlIIIlIl.isEnabled())) {
         var10000 = lIIIlIlIIIIII[1];
         "".length();
         if (null != null) {
            return (boolean)(((42 ^ 119) << " ".length() ^ 134 + 183 - 220 + 94) << (" ".length() << (" ".length() << " ".length())) & ((122 + 117 - 230 + 170 ^ (228 ^ 191) << " ".length()) << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()));
         }
      } else {
         var10000 = lIIIlIlIIIIII[0];
      }

      return (boolean)var10000;
   }

   public void onUpdate() {
   }

   public void setEnabled(boolean lllllllllllllllIIlllIIIIIIllllIl) {
      boolean lllllllllllllllIIlllIIIIIIllllll = (Boolean)lllllllllllllllIIlllIIIIIIlllllI.enabled.getValue();
      if (lIllIIIIIllIIl(lllllllllllllllIIlllIIIIIIllllll, lllllllllllllllIIlllIIIIIIllllIl)) {
         if (lIllIIIIIlIlIl(lllllllllllllllIIlllIIIIIIllllIl)) {
            lllllllllllllllIIlllIIIIIIlllllI.enable();
            "".length();
            if (null != null) {
               return;
            }
         } else {
            lllllllllllllllIIlllIIIIIIlllllI.disable();
         }
      }

   }

   protected final void setAlwaysListening(boolean lllllllllllllllIIlllIIIIIIllIlIl) {
      lllllllllllllllIIlllIIIIIIllIllI.alwaysListening = (boolean)lllllllllllllllIIlllIIIIIIllIlIl;
      if (lIllIIIIIlIlIl(lllllllllllllllIIlllIIIIIIllIlIl)) {
         SnowMod.EVENT_BUS.subscribe((Object)lllllllllllllllIIlllIIIIIIllIllI);
      }

      if (lIllIIIIIlIlll(lllllllllllllllIIlllIIIIIIllIlIl) && lIllIIIIIlIlIl(lllllllllllllllIIlllIIIIIIllIllI.isDisabled())) {
         SnowMod.EVENT_BUS.unsubscribe((Object)lllllllllllllllIIlllIIIIIIllIllI);
      }

   }

   public void toggle() {
      int var10001;
      if (lIllIIIIIlIlll(lllllllllllllllIIlllIIIIIlIIlllI.isEnabled())) {
         var10001 = lIIIlIlIIIIII[1];
         "".length();
         if (" ".length() != " ".length()) {
            return;
         }
      } else {
         var10001 = lIIIlIlIIIIII[0];
      }

      lllllllllllllllIIlllIIIIIlIIlllI.setEnabled((boolean)var10001);
   }

   private static String lIllIIIIIlIIIl(String lllllllllllllllIIllIlllllllIlIll, String lllllllllllllllIIllIlllllllIlIlI) {
      lllllllllllllllIIllIlllllllIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlllllllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIIllIlllllllIlIIl = new StringBuilder();
      char[] lllllllllllllllIIllIlllllllIllIl = lllllllllllllllIIllIlllllllIlIlI.toCharArray();
      float lllllllllllllllIIllIlllllllIIlll = lIIIlIlIIIIII[0];
      byte lllllllllllllllIIllIlllllllIIllI = lllllllllllllllIIllIlllllllIlIll.toCharArray();
      Exception lllllllllllllllIIllIlllllllIIlIl = lllllllllllllllIIllIlllllllIIllI.length;
      int lllllllllllllllIIllIlllllllIIlII = lIIIlIlIIIIII[0];

      do {
         if (!lIllIIIIIllIlI(lllllllllllllllIIllIlllllllIIlII, lllllllllllllllIIllIlllllllIIlIl)) {
            return String.valueOf(lllllllllllllllIIllIlllllllIlIIl);
         }

         char lllllllllllllllIIllIllllllllIIIl = lllllllllllllllIIllIlllllllIIllI[lllllllllllllllIIllIlllllllIIlII];
         lllllllllllllllIIllIlllllllIlIIl.append((char)(lllllllllllllllIIllIllllllllIIIl ^ lllllllllllllllIIllIlllllllIllIl[lllllllllllllllIIllIlllllllIIlll % lllllllllllllllIIllIlllllllIllIl.length]));
         "".length();
         ++lllllllllllllllIIllIlllllllIIlll;
         ++lllllllllllllllIIllIlllllllIIlII;
         "".length();
      } while(((47 ^ 36) << (" ".length() << " ".length()) & ~((100 ^ 111) << (" ".length() << " ".length()))) == 0);

      return null;
   }

   static {
      lIllIIIIIlIlII();
      lIllIIIIIlIIll();
      mc = Minecraft.func_71410_x();
   }

   private static boolean lIllIIIIIlIlll(int var0) {
      return var0 == 0;
   }

   @Retention(RetentionPolicy.RUNTIME)
   public @interface Info {
      boolean alwaysListening() default false;

      String name();

      Module.Category category();

      String description() default "Descriptionless";
   }

   private class BindConverter extends Converter<Bind, JsonElement> {
      // $FF: synthetic field
      private static final String[] lIIIIlIIIllIl;
      // $FF: synthetic field
      private static final int[] lIIIIlIIIlllI;

      private static void lIlIlIlIlIllll() {
         lIIIIlIIIllIl = new String[lIIIIlIIIlllI[4]];
         lIIIIlIIIllIl[lIIIIlIIIlllI[0]] = lIlIlIlIlIllII("zYwwBbHW18k=", "USftT");
         lIIIIlIIIllIl[lIIIIlIIIlllI[1]] = lIlIlIlIlIllIl("FB4aH0A=", "Wjhsk");
         lIIIIlIIIllIl[lIIIIlIIIlllI[3]] = lIlIlIlIlIlllI("XZpAs2zknH8=", "FdkUX");
         lIIIIlIIIllIl[lIIIIlIIIlllI[5]] = lIlIlIlIlIlllI("U1UNyzUAKqo=", "IwvFH");
      }

      private static String lIlIlIlIlIllIl(String lllllllllllllllIlIIIIIIllIIIllII, String lllllllllllllllIlIIIIIIllIIIlIll) {
         lllllllllllllllIlIIIIIIllIIIllII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIIIIIIllIIIllll = new StringBuilder();
         char[] lllllllllllllllIlIIIIIIllIIIlllI = lllllllllllllllIlIIIIIIllIIIlIll.toCharArray();
         byte lllllllllllllllIlIIIIIIllIIIlIII = lIIIIlIIIlllI[0];
         char lllllllllllllllIlIIIIIIllIIIIlll = lllllllllllllllIlIIIIIIllIIIllII.toCharArray();
         double lllllllllllllllIlIIIIIIllIIIIllI = lllllllllllllllIlIIIIIIllIIIIlll.length;
         int lllllllllllllllIlIIIIIIllIIIIlIl = lIIIIlIIIlllI[0];

         do {
            if (!lIlIlIlIllIIll(lllllllllllllllIlIIIIIIllIIIIlIl, lllllllllllllllIlIIIIIIllIIIIllI)) {
               return String.valueOf(lllllllllllllllIlIIIIIIllIIIllll);
            }

            char lllllllllllllllIlIIIIIIllIIlIIlI = lllllllllllllllIlIIIIIIllIIIIlll[lllllllllllllllIlIIIIIIllIIIIlIl];
            lllllllllllllllIlIIIIIIllIIIllll.append((char)(lllllllllllllllIlIIIIIIllIIlIIlI ^ lllllllllllllllIlIIIIIIllIIIlllI[lllllllllllllllIlIIIIIIllIIIlIII % lllllllllllllllIlIIIIIIllIIIlllI.length]));
            "".length();
            ++lllllllllllllllIlIIIIIIllIIIlIII;
            ++lllllllllllllllIlIIIIIIllIIIIlIl;
            "".length();
         } while(" ".length() << (" ".length() << " ".length()) != "   ".length());

         return null;
      }

      private static String lIlIlIlIlIllII(String lllllllllllllllIlIIIIIIllIlIlllI, String lllllllllllllllIlIIIIIIllIlIlIll) {
         try {
            SecretKeySpec lllllllllllllllIlIIIIIIllIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            byte lllllllllllllllIlIIIIIIllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIIllIlIlIIl.init(lIIIIlIIIlllI[3], lllllllllllllllIlIIIIIIllIllIIIl);
            return new String(lllllllllllllllIlIIIIIIllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      // $FF: synthetic method
      BindConverter(Object lllllllllllllllIlIIIIIIllIlllIII) {
         this();
      }

      private static boolean lIlIlIlIllIIIl(int var0) {
         return var0 != 0;
      }

      protected JsonElement doForward(Bind lllllllllllllllIlIIIIIIlllIlllII) {
         return new JsonPrimitive(lllllllllllllllIlIIIIIIlllIlllII.toString());
      }

      protected Bind doBackward(JsonElement lllllllllllllllIlIIIIIIlllIlIIll) {
         String lllllllllllllllIlIIIIIIlllIlIIlI = lllllllllllllllIlIIIIIIlllIlIIll.getAsString();
         if (lIlIlIlIllIIIl(lllllllllllllllIlIIIIIIlllIlIIlI.equalsIgnoreCase(lIIIIlIIIllIl[lIIIIlIIIlllI[0]]))) {
            return Bind.none();
         } else {
            short lllllllllllllllIlIIIIIIlllIIlIll = lIIIIlIIIlllI[0];
            byte lllllllllllllllIlIIIIIIlllIIlIlI = lIIIIlIIIlllI[0];
            boolean lllllllllllllllIlIIIIIIlllIIllll = lIIIIlIIIlllI[0];
            if (lIlIlIlIllIIIl(lllllllllllllllIlIIIIIIlllIlIIlI.startsWith(lIIIIlIIIllIl[lIIIIlIIIlllI[1]]))) {
               lllllllllllllllIlIIIIIIlllIIlIll = lIIIIlIIIlllI[1];
               lllllllllllllllIlIIIIIIlllIlIIlI = lllllllllllllllIlIIIIIIlllIlIIlI.substring(lIIIIlIIIlllI[2]);
            }

            if (lIlIlIlIllIIIl(lllllllllllllllIlIIIIIIlllIlIIlI.startsWith(lIIIIlIIIllIl[lIIIIlIIIlllI[3]]))) {
               lllllllllllllllIlIIIIIIlllIIlIlI = lIIIIlIIIlllI[1];
               lllllllllllllllIlIIIIIIlllIlIIlI = lllllllllllllllIlIIIIIIlllIlIIlI.substring(lIIIIlIIIlllI[4]);
            }

            if (lIlIlIlIllIIIl(lllllllllllllllIlIIIIIIlllIlIIlI.startsWith(lIIIIlIIIllIl[lIIIIlIIIlllI[5]]))) {
               lllllllllllllllIlIIIIIIlllIIllll = lIIIIlIIIlllI[1];
               lllllllllllllllIlIIIIIIlllIlIIlI = lllllllllllllllIlIIIIIIlllIlIIlI.substring(lIIIIlIIIlllI[6]);
            }

            int lllllllllllllllIlIIIIIIlllIIlIII = lIIIIlIIIlllI[7];

            try {
               lllllllllllllllIlIIIIIIlllIIlIII = Keyboard.getKeyIndex(lllllllllllllllIlIIIIIIlllIlIIlI.toUpperCase());
            } catch (Exception var8) {
               return lIlIlIlIllIIlI(lllllllllllllllIlIIIIIIlllIIlIII) ? Bind.none() : new Bind((boolean)lllllllllllllllIlIIIIIIlllIIlIll, (boolean)lllllllllllllllIlIIIIIIlllIIlIlI, (boolean)lllllllllllllllIlIIIIIIlllIIllll, lllllllllllllllIlIIIIIIlllIIlIII);
            }

            "".length();
            if (" ".length() << " ".length() < (((148 ^ 163) << " ".length() ^ 122 ^ 55) << " ".length() & (((65 ^ 50) << " ".length() ^ 133 + 3 - 39 + 100) << " ".length() ^ -" ".length()))) {
               return null;
            } else {
               return lIlIlIlIllIIlI(lllllllllllllllIlIIIIIIlllIIlIII) ? Bind.none() : new Bind((boolean)lllllllllllllllIlIIIIIIlllIIlIll, (boolean)lllllllllllllllIlIIIIIIlllIIlIlI, (boolean)lllllllllllllllIlIIIIIIlllIIllll, lllllllllllllllIlIIIIIIlllIIlIII);
            }
         }
      }

      private BindConverter() {
      }

      static {
         lIlIlIlIllIIII();
         lIlIlIlIlIllll();
      }

      private static String lIlIlIlIlIlllI(String lllllllllllllllIlIIIIIIllIIlllll, String lllllllllllllllIlIIIIIIllIIllllI) {
         try {
            SecretKeySpec lllllllllllllllIlIIIIIIllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIIllIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIIlIIIlllI[8]), "DES");
            Cipher lllllllllllllllIlIIIIIIllIlIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIIIllIlIIIll.init(lIIIIlIIIlllI[3], lllllllllllllllIlIIIIIIllIlIIlII);
            return new String(lllllllllllllllIlIIIIIIllIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIIllIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }

      private static boolean lIlIlIlIllIIll(int var0, int var1) {
         return var0 < var1;
      }

      private static boolean lIlIlIlIllIIlI(int var0) {
         return var0 == 0;
      }

      private static void lIlIlIlIllIIII() {
         lIIIIlIIIlllI = new int[9];
         lIIIIlIIIlllI[0] = " ".length() & ~" ".length();
         lIIIIlIIIlllI[1] = " ".length();
         lIIIIlIIIlllI[2] = 5 ^ 0;
         lIIIIlIIIlllI[3] = " ".length() << " ".length();
         lIIIIlIIIlllI[4] = " ".length() << (" ".length() << " ".length());
         lIIIIlIIIlllI[5] = "   ".length();
         lIIIIlIIIlllI[6] = "   ".length() << " ".length();
         lIIIIlIIIlllI[7] = -" ".length();
         lIIIIlIIIlllI[8] = " ".length() << "   ".length();
      }
   }

   public static enum Category {
      // $FF: synthetic field
      private static final String[] lIIIIlIlIllIl;
      // $FF: synthetic field
      private static final int[] lIIIIlIllIIII;
      // $FF: synthetic field
      MISC,
      // $FF: synthetic field
      COMBAT,
      // $FF: synthetic field
      HIDDEN,
      // $FF: synthetic field
      CLIENT,
      // $FF: synthetic field
      MOVEMENT;

      // $FF: synthetic field
      boolean hidden;
      // $FF: synthetic field
      PLAYER;

      // $FF: synthetic field
      String name;
      // $FF: synthetic field
      RENDER;

      private Category(String lllllllllllllllIIlllllllIllIIlll, boolean lllllllllllllllIIlllllllIllIIllI) {
         lllllllllllllllIIlllllllIllIIlIl.name = lllllllllllllllIIlllllllIllIIlll;
         lllllllllllllllIIlllllllIllIIlIl.hidden = lllllllllllllllIIlllllllIllIIllI;
      }

      private static void lIlIlIlllIIIII() {
         lIIIIlIlIllIl = new String[lIIIIlIllIIII[14]];
         lIIIIlIlIllIl[lIIIIlIllIIII[0]] = lIlIlIllIlllII("1+rVkKSddh0=", "uXaHv");
         lIIIIlIlIllIl[lIIIIlIllIIII[1]] = lIlIlIllIlllIl("Ijo/NRMV", "aURWr");
         lIIIIlIlIllIl[lIIIIlIllIIII[2]] = lIlIlIllIlllIl("Jy8CAgcn", "ujLFB");
         lIIIIlIlIllIl[lIIIIlIllIIII[3]] = lIlIlIllIlllIl("HQMrKgs9", "OfENn");
         lIIIIlIlIllIl[lIIIIlIllIIII[4]] = lIlIlIllIllllI("gqAgnVoH9xw=", "MoRWF");
         lIIIIlIlIllIl[lIIIIlIllIIII[5]] = lIlIlIllIlllIl("HCMwEA==", "QJCsV");
         lIIIIlIlIllIl[lIIIIlIllIIII[6]] = lIlIlIllIllllI("ftg3/l+pJx0=", "iWyHs");
         lIIIIlIlIllIl[lIIIIlIllIIII[7]] = lIlIlIllIlllII("8R37J2zqOys=", "DbeIX");
         lIIIIlIlIllIl[lIIIIlIllIIII[8]] = lIlIlIllIlllII("QQyu1mvy9s8UvjeseaRRGA==", "fDHoN");
         lIIIIlIlIllIl[lIIIIlIllIIII[9]] = lIlIlIllIlllIl("JAQ8KiQMBT4=", "ikJOI");
         lIIIIlIlIllIl[lIIIIlIllIIII[10]] = lIlIlIllIllllI("eS9JsR9Q/0o=", "qRKNH");
         lIIIIlIlIllIl[lIIIIlIllIIII[11]] = lIlIlIllIlllII("5EPSVqS2ucI=", "Rckls");
         lIIIIlIlIllIl[lIIIIlIllIIII[12]] = lIlIlIllIllllI("PSpWJ39GV/o=", "XLpjh");
         lIIIIlIlIllIl[lIIIIlIllIIII[13]] = lIlIlIllIlllII("0kOvwI9QxNA=", "CKAHR");
      }

      private static String lIlIlIllIlllII(String lllllllllllllllIIlllllllIlIlIIIl, String lllllllllllllllIIlllllllIlIlIIII) {
         try {
            String lllllllllllllllIIlllllllIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllllIlIlIIII.getBytes(StandardCharsets.UTF_8)), lIIIIlIllIIII[8]), "DES");
            Cipher lllllllllllllllIIlllllllIlIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlllllllIlIlIlIl.init(lIIIIlIllIIII[2], lllllllllllllllIIlllllllIlIIllll);
            return new String(lllllllllllllllIIlllllllIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      static {
         lIlIlIlllIIIIl();
         lIlIlIlllIIIII();
         COMBAT = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[0]], lIIIIlIllIIII[0], lIIIIlIlIllIl[lIIIIlIllIIII[1]], (boolean)lIIIIlIllIIII[0]);
         RENDER = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[2]], lIIIIlIllIIII[1], lIIIIlIlIllIl[lIIIIlIllIIII[3]], (boolean)lIIIIlIllIIII[0]);
         MISC = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[4]], lIIIIlIllIIII[2], lIIIIlIlIllIl[lIIIIlIllIIII[5]], (boolean)lIIIIlIllIIII[0]);
         PLAYER = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[6]], lIIIIlIllIIII[3], lIIIIlIlIllIl[lIIIIlIllIIII[7]], (boolean)lIIIIlIllIIII[0]);
         MOVEMENT = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[8]], lIIIIlIllIIII[4], lIIIIlIlIllIl[lIIIIlIllIIII[9]], (boolean)lIIIIlIllIIII[0]);
         CLIENT = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[10]], lIIIIlIllIIII[5], lIIIIlIlIllIl[lIIIIlIllIIII[11]], (boolean)lIIIIlIllIIII[0]);
         HIDDEN = new Module.Category(lIIIIlIlIllIl[lIIIIlIllIIII[12]], lIIIIlIllIIII[6], lIIIIlIlIllIl[lIIIIlIllIIII[13]], (boolean)lIIIIlIllIIII[1]);
         Module.Category[] var10000 = new Module.Category[lIIIIlIllIIII[7]];
         var10000[lIIIIlIllIIII[0]] = COMBAT;
         var10000[lIIIIlIllIIII[1]] = RENDER;
         var10000[lIIIIlIllIIII[2]] = MISC;
         var10000[lIIIIlIllIIII[3]] = PLAYER;
         var10000[lIIIIlIllIIII[4]] = MOVEMENT;
         var10000[lIIIIlIllIIII[5]] = CLIENT;
         var10000[lIIIIlIllIIII[6]] = HIDDEN;
      }

      private static String lIlIlIllIlllIl(String lllllllllllllllIIlllllllIIllIllI, String lllllllllllllllIIlllllllIIllIlIl) {
         lllllllllllllllIIlllllllIIllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllllllIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIIlllllllIIllIlII = new StringBuilder();
         short lllllllllllllllIIlllllllIIlIlllI = lllllllllllllllIIlllllllIIllIlIl.toCharArray();
         int lllllllllllllllIIlllllllIIllIIlI = lIIIIlIllIIII[0];
         Exception lllllllllllllllIIlllllllIIlIllII = lllllllllllllllIIlllllllIIllIllI.toCharArray();
         double lllllllllllllllIIlllllllIIlIlIll = lllllllllllllllIIlllllllIIlIllII.length;
         int lllllllllllllllIIlllllllIIlIlIlI = lIIIIlIllIIII[0];

         do {
            if (!lIlIlIlllIIIlI(lllllllllllllllIIlllllllIIlIlIlI, lllllllllllllllIIlllllllIIlIlIll)) {
               return String.valueOf(lllllllllllllllIIlllllllIIllIlII);
            }

            char lllllllllllllllIIlllllllIIllIlll = lllllllllllllllIIlllllllIIlIllII[lllllllllllllllIIlllllllIIlIlIlI];
            lllllllllllllllIIlllllllIIllIlII.append((char)(lllllllllllllllIIlllllllIIllIlll ^ lllllllllllllllIIlllllllIIlIlllI[lllllllllllllllIIlllllllIIllIIlI % lllllllllllllllIIlllllllIIlIlllI.length]));
            "".length();
            ++lllllllllllllllIIlllllllIIllIIlI;
            ++lllllllllllllllIIlllllllIIlIlIlI;
            "".length();
         } while(" ".length() << " ".length() < "   ".length());

         return null;
      }

      public boolean isHidden() {
         return lllllllllllllllIIlllllllIlIlllll.hidden;
      }

      public String getName() {
         return lllllllllllllllIIlllllllIlIlllII.name;
      }

      private static void lIlIlIlllIIIIl() {
         lIIIIlIllIIII = new int[15];
         lIIIIlIllIIII[0] = ((2 ^ 21) << (" ".length() << " ".length()) ^ 33 ^ 84) & (157 ^ 190 ^ (37 ^ 32) << " ".length() ^ -" ".length()) & ((180 ^ 177 ^ (110 ^ 105) << " ".length()) << " ".length() & (((66 ^ 73) << (" ".length() << (" ".length() << " ".length())) ^ 89 + 152 - 213 + 159) << " ".length() ^ -" ".length()) ^ -" ".length());
         lIIIIlIllIIII[1] = " ".length();
         lIIIIlIllIIII[2] = " ".length() << " ".length();
         lIIIIlIllIIII[3] = "   ".length();
         lIIIIlIllIIII[4] = " ".length() << (" ".length() << " ".length());
         lIIIIlIllIIII[5] = 206 ^ 165 ^ (163 ^ 148) << " ".length();
         lIIIIlIllIIII[6] = "   ".length() << " ".length();
         lIIIIlIllIIII[7] = 143 ^ 136;
         lIIIIlIllIIII[8] = " ".length() << "   ".length();
         lIIIIlIllIIII[9] = (176 ^ 153) << " ".length() ^ 89 ^ 2;
         lIIIIlIllIIII[10] = (180 ^ 177) << " ".length();
         lIIIIlIllIIII[11] = 141 ^ 134;
         lIIIIlIllIIII[12] = "   ".length() << (" ".length() << " ".length());
         lIIIIlIllIIII[13] = 11 + 118 - 43 + 47 ^ (64 ^ 81) << "   ".length();
         lIIIIlIllIIII[14] = (123 ^ 124) << " ".length();
      }

      private static boolean lIlIlIlllIIIlI(int var0, int var1) {
         return var0 < var1;
      }

      private static String lIlIlIllIllllI(String lllllllllllllllIIlllllllIlIIIllI, String lllllllllllllllIIlllllllIlIIIlIl) {
         try {
            int lllllllllllllllIIlllllllIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllllllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            long lllllllllllllllIIlllllllIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllllllIlIIIIIl.init(lIIIIlIllIIII[2], lllllllllllllllIIlllllllIlIIIIlI);
            return new String(lllllllllllllllIIlllllllIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllllllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var5) {
            var5.printStackTrace();
            return null;
         }
      }
   }
}
