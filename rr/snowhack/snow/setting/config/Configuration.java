package rr.snowhack.snow.setting.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.SettingsRegister;
import rr.snowhack.snow.setting.converter.Convertable;

public class Configuration {
   // $FF: synthetic field
   private static final int[] llllllllllIl;
   // $FF: synthetic field
   private static final String[] llllllllllII;

   private static void loadConfiguration(SettingsRegister lllllllllllllllIlIIlIIlIllIlIllI, JsonObject lllllllllllllllIlIIlIIlIllIlIlIl) {
      Iterator lllllllllllllllIlIIlIIlIllIlIlII = lllllllllllllllIlIIlIIlIllIlIlIl.entrySet().iterator();

      label28:
      do {
         do {
            if (!lIlIIllIIlIlIl(lllllllllllllllIlIIlIIlIllIlIlII.hasNext())) {
               return;
            }

            Entry<String, JsonElement> lllllllllllllllIlIIlIIlIllIllIIl = (Entry)lllllllllllllllIlIIlIIlIllIlIlII.next();
            short lllllllllllllllIlIIlIIlIllIlIIlI = (String)lllllllllllllllIlIIlIIlIllIllIIl.getKey();
            JsonElement lllllllllllllllIlIIlIIlIllIllIlI = (JsonElement)lllllllllllllllIlIIlIIlIllIllIIl.getValue();
            if (lIlIIllIIlIlIl(lllllllllllllllIlIIlIIlIllIlIllI.registerHashMap.containsKey(lllllllllllllllIlIIlIIlIllIlIIlI))) {
               loadConfiguration(lllllllllllllllIlIIlIIlIllIlIllI.subregister(lllllllllllllllIlIIlIIlIllIlIIlI), lllllllllllllllIlIIlIIlIllIllIlI.getAsJsonObject());
               "".length();
               if (-(192 ^ 197) >= 0) {
                  return;
               }
            } else {
               char lllllllllllllllIlIIlIIlIllIlIIII = lllllllllllllllIlIIlIIlIllIlIllI.getSetting(lllllllllllllllIlIIlIIlIllIlIIlI);
               if (lIlIIllIIlIlll(lllllllllllllllIlIIlIIlIllIlIIII)) {
                  "".length();
                  continue label28;
               }

               lllllllllllllllIlIIlIIlIllIlIIII.setValue(lllllllllllllllIlIIlIIlIllIlIIII.converter().reverse().convert(lllllllllllllllIlIIlIIlIllIllIlI));
               "".length();
            }

            "".length();
         } while(-"  ".length() <= 0);

         return;
      } while(-" ".length() <= ((151 ^ 134) & ~(170 ^ 187)));

   }

   private static String lIlIIllIIlIIlI(String lllllllllllllllIlIIlIIlIllIIlIII, String lllllllllllllllIlIIlIIlIllIIIlll) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIIlIllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIllIIIlll.getBytes(StandardCharsets.UTF_8)), llllllllllIl[2]), "DES");
         char lllllllllllllllIlIIlIIlIllIIIIll = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIIlIllIIIIll.init(llllllllllIl[3], lllllllllllllllIlIIlIIlIllIIlIll);
         return new String(lllllllllllllllIlIIlIIlIllIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void loadConfiguration(JsonObject lllllllllllllllIlIIlIIlIlllIIlII) {
      loadConfiguration(SettingsRegister.ROOT, lllllllllllllllIlIIlIIlIlllIIlII);
   }

   private static void lIlIIllIIlIIll() {
      llllllllllII = new String[llllllllllIl[1]];
      llllllllllII[llllllllllIl[0]] = lIlIIllIIlIIlI("Nzgt+UAwFZAMLediYBwh6L3tbWaBxCYW3kC3zeIlWLDFJIGhbQk+rg==", "lByoB");
   }

   private static boolean lIlIIllIIlIllI(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIIllIIlIlIl(int var0) {
      return var0 != 0;
   }

   static {
      lIlIIllIIlIlII();
      lIlIIllIIlIIll();
   }

   public static void saveConfiguration(Path lllllllllllllllIlIIlIIllIIIIIIII) throws IOException {
      saveConfiguration(Files.newOutputStream(lllllllllllllllIlIIlIIllIIIIIIII));
   }

   public static void saveConfiguration(OutputStream lllllllllllllllIlIIlIIlIlllllIlI) throws IOException {
      Gson lllllllllllllllIlIIlIIlIlllllIIl = (new GsonBuilder()).setPrettyPrinting().create();
      double lllllllllllllllIlIIlIIlIllllIlII = lllllllllllllllIlIIlIIlIlllllIIl.toJson(produceConfig());
      double lllllllllllllllIlIIlIIlIllllIIll = new BufferedWriter(new OutputStreamWriter(lllllllllllllllIlIIlIIlIlllllIlI));
      lllllllllllllllIlIIlIIlIllllIIll.write(lllllllllllllllIlIIlIIlIllllIlII);
      lllllllllllllllIlIIlIIlIllllIIll.close();
   }

   private static void lIlIIllIIlIlII() {
      llllllllllIl = new int[4];
      llllllllllIl[0] = ((25 ^ 46) << " ".length() ^ 20 ^ 95) & (99 ^ 94 ^ "   ".length() << "   ".length() ^ -" ".length());
      llllllllllIl[1] = " ".length();
      llllllllllIl[2] = " ".length() << "   ".length();
      llllllllllIl[3] = " ".length() << " ".length();
   }

   public static JsonObject produceConfig() {
      return produceConfig(SettingsRegister.ROOT);
   }

   private static boolean lIlIIllIIlIlll(Object var0) {
      return var0 == null;
   }

   public static void loadConfiguration(InputStream lllllllllllllllIlIIlIIlIlllIlIII) {
      try {
         loadConfiguration((new JsonParser()).parse(new InputStreamReader(lllllllllllllllIlIIlIIlIlllIlIII)).getAsJsonObject());
      } catch (IllegalStateException var2) {
         SnowMod.log.error(llllllllllII[llllllllllIl[0]]);
         loadConfiguration(new JsonObject());
         return;
      }

      "".length();
      if (null == null) {
         ;
      }
   }

   private static JsonObject produceConfig(SettingsRegister lllllllllllllllIlIIlIIllIIIIIllI) {
      float lllllllllllllllIlIIlIIllIIIIIlIl = new JsonObject();
      Iterator lllllllllllllllIlIIlIIllIIIIIlII = lllllllllllllllIlIIlIIllIIIIIllI.registerHashMap.entrySet().iterator();

      do {
         Entry lllllllllllllllIlIIlIIllIIIIIIll;
         if (!lIlIIllIIlIlIl(lllllllllllllllIlIIlIIllIIIIIlII.hasNext())) {
            lllllllllllllllIlIIlIIllIIIIIlII = lllllllllllllllIlIIlIIllIIIIIllI.settingHashMap.entrySet().iterator();

            while(lIlIIllIIlIlIl(lllllllllllllllIlIIlIIllIIIIIlII.hasNext())) {
               lllllllllllllllIlIIlIIllIIIIIIll = (Entry)lllllllllllllllIlIIlIIllIIIIIlII.next();
               boolean lllllllllllllllIlIIlIIllIIIIIIlI = (Setting)lllllllllllllllIlIIlIIllIIIIIIll.getValue();
               if (lIlIIllIIlIllI(lllllllllllllllIlIIlIIllIIIIIIlI instanceof Convertable)) {
                  "".length();
                  if (-" ".length() != -" ".length()) {
                     return null;
                  }
               } else {
                  lllllllllllllllIlIIlIIllIIIIIlIl.add((String)lllllllllllllllIlIIlIIllIIIIIIll.getKey(), (JsonElement)lllllllllllllllIlIIlIIllIIIIIIlI.converter().convert(lllllllllllllllIlIIlIIllIIIIIIlI.getValue()));
                  "".length();
                  if ("   ".length() < 0) {
                     return null;
                  }
               }
            }

            return lllllllllllllllIlIIlIIllIIIIIlIl;
         }

         lllllllllllllllIlIIlIIllIIIIIIll = (Entry)lllllllllllllllIlIIlIIllIIIIIlII.next();
         lllllllllllllllIlIIlIIllIIIIIlIl.add((String)lllllllllllllllIlIIlIIllIIIIIIll.getKey(), produceConfig((SettingsRegister)lllllllllllllllIlIIlIIllIIIIIIll.getValue()));
         "".length();
      } while(" ".length() == " ".length());

      return null;
   }

   public static void loadConfiguration(Path lllllllllllllllIlIIlIIlIllllIIII) throws IOException {
      long lllllllllllllllIlIIlIIlIlllIllIl = Files.newInputStream(lllllllllllllllIlIIlIIlIllllIIII);
      loadConfiguration(lllllllllllllllIlIIlIIlIlllIllIl);
      lllllllllllllllIlIIlIIlIlllIllIl.close();
   }
}
