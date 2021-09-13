package rr.snowhack.snow.setting.builder;

import com.google.common.base.MoreObjects;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.SettingsRegister;

public abstract class SettingBuilder<T> {
   // $FF: synthetic field
   private static final String[] lllllIlIlllI;
   // $FF: synthetic field
   protected BiConsumer<T, T> consumer;
   // $FF: synthetic field
   protected List<Predicate<T>> predicateList = new ArrayList();
   // $FF: synthetic field
   private static final int[] lllllIllIIII;
   // $FF: synthetic field
   private Predicate<T> visibilityPredicate;
   // $FF: synthetic field
   protected String name;
   // $FF: synthetic field
   protected T initialValue;

   private static boolean lIlIIIllllllll(int var0, int var1) {
      return var0 < var1;
   }

   public SettingBuilder<T> withName(String lllllllllllllllIlIIllIlIllllIIII) {
      lllllllllllllllIlIIllIlIllllIIll.name = lllllllllllllllIlIIllIlIllllIIII;
      return lllllllllllllllIlIIllIlIllllIIll;
   }

   public final Setting<T> buildAndRegister(String lllllllllllllllIlIIllIlIlllIIlII) {
      return register(lllllllllllllllIlIIllIlIlllIIlIl.build(), lllllllllllllllIlIIllIlIlllIIlII);
   }

   private static boolean lIlIIIlllllllI(Object var0) {
      return var0 != null;
   }

   public abstract Setting<T> build();

   protected Predicate<T> visibilityPredicate() {
      return (Predicate)MoreObjects.firstNonNull(lllllllllllllllIlIIllIllIIIIIlIl.visibilityPredicate, (lllllllllllllllIlIIllIlIllIllIII) -> {
         return (boolean)lllllIllIIII[1];
      });
   }

   private static boolean lIlIIIllllllIl(int var0) {
      return var0 != 0;
   }

   public SettingBuilder<T> withVisibility(Predicate<T> lllllllllllllllIlIIllIlIllllIllI) {
      lllllllllllllllIlIIllIlIlllllIIl.visibilityPredicate = lllllllllllllllIlIIllIlIllllIllI;
      return lllllllllllllllIlIIllIlIlllllIIl;
   }

   static {
      lIlIIIllllllII();
      lIlIIIllllIIlI();
   }

   private static void lIlIIIllllllII() {
      lllllIllIIII = new int[4];
      lllllIllIIII[0] = (" ".length() << " ".length() ^ 99 ^ 44) & (172 ^ 151 ^ (171 ^ 144) << " ".length() ^ -" ".length());
      lllllIllIIII[1] = " ".length();
      lllllIllIIII[2] = " ".length() << " ".length();
      lllllIllIIII[3] = " ".length() << "   ".length();
   }

   private static String lIlIIIllllIIIl(String lllllllllllllllIlIIllIlIlIlIlllI, String lllllllllllllllIlIIllIlIlIllIIlI) {
      lllllllllllllllIlIIllIlIlIlIlllI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIlIlIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIIllIlIlIlIllII = new StringBuilder();
      char[] lllllllllllllllIlIIllIlIlIllIIII = lllllllllllllllIlIIllIlIlIllIIlI.toCharArray();
      boolean lllllllllllllllIlIIllIlIlIlIlIlI = lllllIllIIII[0];
      short lllllllllllllllIlIIllIlIlIlIlIIl = lllllllllllllllIlIIllIlIlIlIlllI.toCharArray();
      byte lllllllllllllllIlIIllIlIlIlIlIII = lllllllllllllllIlIIllIlIlIlIlIIl.length;
      int lllllllllllllllIlIIllIlIlIlIIlll = lllllIllIIII[0];

      do {
         if (!lIlIIIllllllll(lllllllllllllllIlIIllIlIlIlIIlll, lllllllllllllllIlIIllIlIlIlIlIII)) {
            return String.valueOf(lllllllllllllllIlIIllIlIlIlIllII);
         }

         long lllllllllllllllIlIIllIlIlIlIIllI = lllllllllllllllIlIIllIlIlIlIlIIl[lllllllllllllllIlIIllIlIlIlIIlll];
         lllllllllllllllIlIIllIlIlIlIllII.append((char)(lllllllllllllllIlIIllIlIlIlIIllI ^ lllllllllllllllIlIIllIlIlIllIIII[lllllllllllllllIlIIllIlIlIlIlIlI % lllllllllllllllIlIIllIlIlIllIIII.length]));
         "".length();
         ++lllllllllllllllIlIIllIlIlIlIlIlI;
         ++lllllllllllllllIlIIllIlIlIlIIlll;
         "".length();
      } while(" ".length() >= 0);

      return null;
   }

   public SettingBuilder<T> withRestriction(Predicate<T> lllllllllllllllIlIIllIlIlllIllII) {
      lllllllllllllllIlIIllIlIlllIlIll.predicateList.add(lllllllllllllllIlIIllIlIlllIllII);
      "".length();
      return lllllllllllllllIlIIllIlIlllIlIll;
   }

   private static void lIlIIIllllIIlI() {
      lllllIlIlllI = new String[lllllIllIIII[2]];
      lllllIlIlllI[lllllIllIIII[0]] = lIlIIIllllIIII("EZ+e+wPZOrhj8bjEBPVH6xpW3zsIhSu9Htou2vhWvfY=", "TGIiV");
      lllllIlIlllI[lllllIllIIII[1]] = lIlIIIllllIIIl("bQ==", "CVKKA");
   }

   public static <T> Setting<T> register(Setting<T> lllllllllllllllIlIIllIlIllIlllIl, String lllllllllllllllIlIIllIlIllIlllII) {
      String lllllllllllllllIlIIllIlIllIllllI = lllllllllllllllIlIIllIlIllIlllIl.getName();
      if (lIlIIIlllllllI(lllllllllllllllIlIIllIlIllIllllI) && !lIlIIIllllllIl(lllllllllllllllIlIIllIlIllIllllI.isEmpty())) {
         SettingsRegister.register(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIllIlIllIlllII).append(lllllIlIlllI[lllllIllIIII[1]]).append(lllllllllllllllIlIIllIlIllIllllI)), lllllllllllllllIlIIllIlIllIlllIl);
         return lllllllllllllllIlIIllIlIllIlllIl;
      } else {
         throw new RuntimeException(lllllIlIlllI[lllllIllIIII[0]]);
      }
   }

   public SettingBuilder<T> withConsumer(BiConsumer<T, T> lllllllllllllllIlIIllIlIlllllllI) {
      lllllllllllllllIlIIllIlIllllllIl.consumer = lllllllllllllllIlIIllIlIlllllllI;
      return lllllllllllllllIlIIllIlIllllllIl;
   }

   protected BiConsumer<T, T> consumer() {
      return (BiConsumer)MoreObjects.firstNonNull(lllllllllllllllIlIIllIllIIIIIIlI.consumer, (lllllllllllllllIlIIllIlIllIllIlI, lllllllllllllllIlIIllIlIllIllIIl) -> {
      });
   }

   public SettingBuilder<T> withValue(T lllllllllllllllIlIIllIllIIIIlIll) {
      lllllllllllllllIlIIllIllIIIIlllI.initialValue = lllllllllllllllIlIIllIllIIIIlIll;
      return lllllllllllllllIlIIllIllIIIIlllI;
   }

   protected Predicate<T> predicate() {
      Predicate var10000;
      if (lIlIIIllllllIl(lllllllllllllllIlIIllIllIIIIlIIl.predicateList.isEmpty())) {
         var10000 = (lllllllllllllllIlIIllIlIllIIlIll) -> {
            return (boolean)lllllIllIIII[1];
         };
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         var10000 = (lllllllllllllllIlIIllIlIllIlIlII) -> {
            return lllllllllllllllIlIIllIlIllIlIlIl.predicateList.stream().allMatch((lllllllllllllllIlIIllIlIllIIllII) -> {
               return lllllllllllllllIlIIllIlIllIIllII.test(lllllllllllllllIlIIllIlIllIlIlII);
            });
         };
      }

      return var10000;
   }

   private static String lIlIIIllllIIII(String lllllllllllllllIlIIllIlIllIIIIIl, String lllllllllllllllIlIIllIlIllIIIIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIllIlIllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIlIllIIIIlI.getBytes(StandardCharsets.UTF_8)), lllllIllIIII[3]), "DES");
         int lllllllllllllllIlIIllIlIlIlllllI = Cipher.getInstance("DES");
         lllllllllllllllIlIIllIlIlIlllllI.init(lllllIllIIII[2], lllllllllllllllIlIIllIlIllIIIllI);
         return new String(lllllllllllllllIlIIllIlIlIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIlIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }
}
