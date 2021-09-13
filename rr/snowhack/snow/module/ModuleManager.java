package rr.snowhack.snow.module;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.event.events.RenderEvent;
import rr.snowhack.snow.module.modules.ClickGUI;
import rr.snowhack.snow.util.ClassFinder;
import rr.snowhack.snow.util.EntityUtil;
import rr.snowhack.snow.util.SnowTessellator;
import rr.snowhack.snow.util.Wrapper;

public class ModuleManager {
   // $FF: synthetic field
   public static ArrayList<Module> modules;
   // $FF: synthetic field
   private static final String[] llllIllIlllI;
   // $FF: synthetic field
   static HashMap<String, Module> lookup;
   // $FF: synthetic field
   private static final int[] llllIlllIIIl;

   public static Module getModuleByName(String lllllllllllllllIlIlIIlIIIlIIIIll) {
      return (Module)lookup.get(lllllllllllllllIlIlIIlIIIlIIIIll.toLowerCase());
   }

   public static void onBind(int lllllllllllllllIlIlIIlIIIlIIIllI) {
      if (!lIlIIIIlIlIlII(lllllllllllllllIlIlIIlIIIlIIIllI)) {
         modules.forEach((lllllllllllllllIlIlIIlIIIIlllIII) -> {
            if (lIlIIIIlIlIIll(lllllllllllllllIlIlIIlIIIIlllIII.getBind().isDown(lllllllllllllllIlIlIIlIIIlIIIllI))) {
               lllllllllllllllIlIlIIlIIIIlllIII.toggle();
            }

         });
      }
   }

   private static void lIlIIIIlIIlllI() {
      llllIllIlllI = new String[llllIlllIIIl[14]];
      llllIllIlllI[llllIlllIIIl[0]] = lIlIIIIlIIlIlI("WMm7Q1dt7rtOQ8jjTS9YPu4+EKCQqsRx", "ADegB");
      llllIllIlllI[llllIlllIIIl[1]] = lIlIIIIlIIlIll("LCsODA==", "GJcek");
      llllIllIlllI[llllIlllIIIl[2]] = lIlIIIIlIIllII("2mvIb3urW50=", "cnJlB");
      llllIllIlllI[llllIlllIIIl[6]] = lIlIIIIlIIllII("HR7znVTTkEU=", "DlgDA");
      llllIllIlllI[llllIlllIIIl[8]] = lIlIIIIlIIllII("qEXKVRRH/QVkP8TXFmty3hWZGJDdA7ZnbYiQJUeP/a4=", "HlKMG");
      llllIllIlllI[llllIlllIIIl[9]] = lIlIIIIlIIllII("pQouDzEMkGw=", "TWAly");
      llllIllIlllI[llllIlllIIIl[10]] = lIlIIIIlIIlIlI("dl9PbBoT9n+5YaoubI0iZg==", "bXlhI");
      llllIllIlllI[llllIlllIIIl[11]] = lIlIIIIlIIlIll("Ewc3Gyo+TzZXJz4BNh4vJA1iGiE0HS4Sbg==", "PhBwN");
      llllIllIlllI[llllIlllIIIl[12]] = lIlIIIIlIIlIll("VGMvIiJPYw==", "uCjPP");
      llllIllIlllI[llllIlllIIIl[13]] = lIlIIIIlIIlIll("T0g+JhIQCTQmW0M=", "chSCa");
   }

   public static boolean isModuleEnabled(String lllllllllllllllIlIlIIlIIIIllllll) {
      byte lllllllllllllllIlIlIIlIIIIllllII = getModuleByName(lllllllllllllllIlIlIIlIIIIllllll);
      return (boolean)(lIlIIIIlIlIlIl(lllllllllllllllIlIlIIlIIIIllllII) ? llllIlllIIIl[0] : lllllllllllllllIlIlIIlIIIIllllII.isEnabled());
   }

   private static void lIlIIIIlIlIIlI() {
      llllIlllIIIl = new int[15];
      llllIlllIIIl[0] = (27 ^ 18) << (" ".length() << " ".length()) & ~((203 ^ 194) << (" ".length() << " ".length()));
      llllIlllIIIl[1] = " ".length();
      llllIlllIIIl[2] = " ".length() << " ".length();
      llllIlllIIIl[3] = ((42 ^ 11) << (" ".length() << " ".length())) + (" ".length() << (" ".length() << " ".length())) - ((97 ^ 112) << " ".length()) + 170 + 268 - 393 + 238 << " ".length();
      llllIlllIIIl[4] = 120 + 24 - -92 + 61 + 38 + 171 - 105 + 69 - (106 + 123 - 108 + 30 << " ".length()) + 267 + 230 - 419 + 525;
      llllIlllIIIl[5] = 5520 + 6493 - 7653 + 3065;
      llllIlllIIIl[6] = "   ".length();
      llllIlllIIIl[7] = (195 ^ 138 ^ (175 ^ 186) << (" ".length() << " ".length())) << (" ".length() << "   ".length());
      llllIlllIIIl[8] = " ".length() << (" ".length() << " ".length());
      llllIlllIIIl[9] = 186 ^ 191;
      llllIlllIIIl[10] = "   ".length() << " ".length();
      llllIlllIIIl[11] = 66 ^ 69;
      llllIlllIIIl[12] = " ".length() << "   ".length();
      llllIlllIIIl[13] = 206 ^ 199;
      llllIlllIIIl[14] = (136 ^ 147 ^ (58 ^ 53) << " ".length()) << " ".length();
   }

   private static boolean lIlIIIIlIlIIll(int var0) {
      return var0 != 0;
   }

   private static String lIlIIIIlIIlIll(String lllllllllllllllIlIlIIIllllllIlII, String lllllllllllllllIlIlIIIlllllIlllI) {
      lllllllllllllllIlIlIIIllllllIlII = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIIIllllllIIlI = new StringBuilder();
      char[] lllllllllllllllIlIlIIIllllllIIIl = lllllllllllllllIlIlIIIlllllIlllI.toCharArray();
      int lllllllllllllllIlIlIIIllllllIIII = llllIlllIIIl[0];
      boolean lllllllllllllllIlIlIIIlllllIlIlI = lllllllllllllllIlIlIIIllllllIlII.toCharArray();
      int lllllllllllllllIlIlIIIlllllIlIIl = lllllllllllllllIlIlIIIlllllIlIlI.length;
      int lllllllllllllllIlIlIIIlllllIlIII = llllIlllIIIl[0];

      do {
         if (!lIlIIIIlIlIlll(lllllllllllllllIlIlIIIlllllIlIII, lllllllllllllllIlIlIIIlllllIlIIl)) {
            return String.valueOf(lllllllllllllllIlIlIIIllllllIIlI);
         }

         char lllllllllllllllIlIlIIIllllllIlIl = lllllllllllllllIlIlIIIlllllIlIlI[lllllllllllllllIlIlIIIlllllIlIII];
         lllllllllllllllIlIlIIIllllllIIlI.append((char)(lllllllllllllllIlIlIIIllllllIlIl ^ lllllllllllllllIlIlIIIllllllIIIl[lllllllllllllllIlIlIIIllllllIIII % lllllllllllllllIlIlIIIllllllIIIl.length]));
         "".length();
         ++lllllllllllllllIlIlIIIllllllIIII;
         ++lllllllllllllllIlIlIIIlllllIlIII;
         "".length();
      } while(" ".length() > -" ".length());

      return null;
   }

   private static boolean lIlIIIIlIlIlll(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIIIIlIlIlIl(Object var0) {
      return var0 == null;
   }

   public static void onUpdate() {
      modules.stream().filter((lllllllllllllllIlIlIIlIIIIlIIIlI) -> {
         int var10000;
         if (lIlIIIIlIlIlII(lllllllllllllllIlIlIIlIIIIlIIIlI.alwaysListening) && !lIlIIIIlIlIIll(lllllllllllllllIlIlIIlIIIIlIIIlI.isEnabled())) {
            var10000 = llllIlllIIIl[0];
         } else {
            var10000 = llllIlllIIIl[1];
            "".length();
            if ("   ".length() == 0) {
               return (boolean)((102 + 99 - 176 + 102 ^ (135 ^ 142) << "   ".length()) & ((111 ^ 46) << " ".length() ^ 159 + 140 - 184 + 66 ^ -" ".length()));
            }
         }

         return (boolean)var10000;
      }).forEach((lllllllllllllllIlIlIIlIIIIlIIlII) -> {
         lllllllllllllllIlIlIIlIIIIlIIlII.onUpdate();
      });
   }

   public static void onRender() {
      modules.stream().filter((lllllllllllllllIlIlIIlIIIIlIlIII) -> {
         int var10000;
         if (lIlIIIIlIlIlII(lllllllllllllllIlIlIIlIIIIlIlIII.alwaysListening) && !lIlIIIIlIlIIll(lllllllllllllllIlIlIIlIIIIlIlIII.isEnabled())) {
            var10000 = llllIlllIIIl[0];
         } else {
            var10000 = llllIlllIIIl[1];
            "".length();
            if (((102 + 78 - 149 + 194 ^ (105 ^ 10) << " ".length()) & (70 ^ 83 ^ (3 ^ 26) << " ".length() ^ -" ".length())) == " ".length()) {
               return (boolean)((117 ^ 80 ^ (100 ^ 97) << (" ".length() << " ".length())) & ((201 ^ 154) << " ".length() ^ 143 + 27 - 39 + 20 ^ -" ".length()));
            }
         }

         return (boolean)var10000;
      }).forEach((lllllllllllllllIlIlIIlIIIIlIlIll) -> {
         lllllllllllllllIlIlIIlIIIIlIlIll.onRender();
      });
   }

   private static String lIlIIIIlIIlIlI(String lllllllllllllllIlIlIIlIIIIIlIIIl, String lllllllllllllllIlIlIIlIIIIIIlllI) {
      try {
         double lllllllllllllllIlIlIIlIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), llllIlllIIIl[12]), "DES");
         float lllllllllllllllIlIlIIlIIIIIIllII = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIlIIIIIIllII.init(llllIlllIIIl[2], lllllllllllllllIlIlIIlIIIIIIllIl);
         return new String(lllllllllllllllIlIlIIlIIIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static ArrayList<Module> getModules() {
      return modules;
   }

   public static void onWorldRender(RenderWorldLastEvent lllllllllllllllIlIlIIlIIIlIIllIl) {
      Minecraft.func_71410_x().field_71424_I.func_76320_a(llllIllIlllI[llllIlllIIIl[1]]);
      Minecraft.func_71410_x().field_71424_I.func_76320_a(llllIllIlllI[llllIlllIIIl[2]]);
      GlStateManager.func_179090_x();
      GlStateManager.func_179147_l();
      GlStateManager.func_179118_c();
      GlStateManager.func_179120_a(llllIlllIIIl[3], llllIlllIIIl[4], llllIlllIIIl[1], llllIlllIIIl[0]);
      GlStateManager.func_179103_j(llllIlllIIIl[5]);
      GlStateManager.func_179097_i();
      GlStateManager.func_187441_d(1.0F);
      Vec3d lllllllllllllllIlIlIIlIIIlIIllII = EntityUtil.getInterpolatedPos(Wrapper.getPlayer(), lllllllllllllllIlIlIIlIIIlIIllIl.getPartialTicks());
      RenderEvent lllllllllllllllIlIlIIlIIIlIIlIll = new RenderEvent(SnowTessellator.INSTANCE, lllllllllllllllIlIlIIlIIIlIIllII);
      lllllllllllllllIlIlIIlIIIlIIlIll.resetTranslation();
      Minecraft.func_71410_x().field_71424_I.func_76319_b();
      modules.stream().filter((lllllllllllllllIlIlIIlIIIIlIlllI) -> {
         int var10000;
         if (lIlIIIIlIlIlII(lllllllllllllllIlIlIIlIIIIlIlllI.alwaysListening) && !lIlIIIIlIlIIll(lllllllllllllllIlIlIIlIIIIlIlllI.isEnabled())) {
            var10000 = llllIlllIIIl[0];
         } else {
            var10000 = llllIlllIIIl[1];
            "".length();
            if (null != null) {
               return (boolean)((" ".length() << (" ".length() << " ".length()) ^ 62 ^ 5) & (79 ^ 96 ^ " ".length() << (" ".length() << (" ".length() << " ".length())) ^ -" ".length()));
            }
         }

         return (boolean)var10000;
      }).forEach((lllllllllllllllIlIlIIlIIIIllIIlI) -> {
         Minecraft.func_71410_x().field_71424_I.func_76320_a(lllllllllllllllIlIlIIlIIIIllIIlI.getName());
         lllllllllllllllIlIlIIlIIIIllIIlI.onWorldRender(lllllllllllllllIlIlIIlIIIlIIlIll);
         Minecraft.func_71410_x().field_71424_I.func_76319_b();
      });
      Minecraft.func_71410_x().field_71424_I.func_76320_a(llllIllIlllI[llllIlllIIIl[6]]);
      GlStateManager.func_187441_d(1.0F);
      GlStateManager.func_179103_j(llllIlllIIIl[7]);
      GlStateManager.func_179084_k();
      GlStateManager.func_179141_d();
      GlStateManager.func_179098_w();
      GlStateManager.func_179126_j();
      GlStateManager.func_179089_o();
      SnowTessellator.releaseGL();
      Minecraft.func_71410_x().field_71424_I.func_76319_b();
      Minecraft.func_71410_x().field_71424_I.func_76319_b();
   }

   static {
      lIlIIIIlIlIIlI();
      lIlIIIIlIIlllI();
      modules = new ArrayList();
      lookup = new HashMap();
   }

   public static void initialize() {
      Set<Class> lllllllllllllllIlIlIIlIIIlIlIIIl = ClassFinder.findClasses(ClickGUI.class.getPackage().getName(), Module.class);
      lllllllllllllllIlIlIIlIIIlIlIIIl.forEach((lllllllllllllllIlIlIIlIIIIIllIlI) -> {
         try {
            Module lllllllllllllllIlIlIIlIIIIIllllI = (Module)lllllllllllllllIlIlIIlIIIIIllIlI.getConstructor().newInstance();
            modules.add(lllllllllllllllIlIlIIlIIIIIllllI);
            "".length();
         } catch (InvocationTargetException var2) {
            var2.getCause().printStackTrace();
            System.err.println(String.valueOf((new StringBuilder()).append(llllIllIlllI[llllIlllIIIl[8]]).append(lllllllllllllllIlIlIIlIIIIIllIlI.getSimpleName()).append(llllIllIlllI[llllIlllIIIl[9]]).append(var2.getClass().getSimpleName()).append(llllIllIlllI[llllIlllIIIl[10]]).append(var2.getMessage())));
            "".length();
            if (-"  ".length() < 0) {
               return;
            }

            return;
         } catch (Exception var3) {
            var3.printStackTrace();
            System.err.println(String.valueOf((new StringBuilder()).append(llllIllIlllI[llllIlllIIIl[11]]).append(lllllllllllllllIlIlIIlIIIIIllIlI.getSimpleName()).append(llllIllIlllI[llllIlllIIIl[12]]).append(var3.getClass().getSimpleName()).append(llllIllIlllI[llllIlllIIIl[13]]).append(var3.getMessage())));
            return;
         }

         "".length();
         if ("   ".length() >= (((103 ^ 106) << "   ".length() ^ 125 ^ 90) & (67 ^ 54 ^ (8 ^ 21) << " ".length() ^ -" ".length()))) {
            ;
         }
      });
      SnowMod.log.info(llllIllIlllI[llllIlllIIIl[0]]);
      getModules().sort(Comparator.comparing(Module::getName));
   }

   private static String lIlIIIIlIIllII(String lllllllllllllllIlIlIIlIIIIIIIIlI, String lllllllllllllllIlIlIIlIIIIIIIIll) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIlIIIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIlIIlIIIIIIIllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIlIIIIIIIllI.init(llllIlllIIIl[2], lllllllllllllllIlIlIIlIIIIIIIlll);
         return new String(lllllllllllllllIlIlIIlIIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static void updateLookup() {
      lookup.clear();
      Iterator lllllllllllllllIlIlIIlIIIlIlIlIl = modules.iterator();

      do {
         if (!lIlIIIIlIlIIll(lllllllllllllllIlIlIIlIIIlIlIlIl.hasNext())) {
            return;
         }

         Module lllllllllllllllIlIlIIlIIIlIlIllI = (Module)lllllllllllllllIlIlIIlIIIlIlIlIl.next();
         lookup.put(lllllllllllllllIlIlIIlIIIlIlIllI.getName().toLowerCase(), lllllllllllllllIlIlIIlIIIlIlIllI);
         "".length();
         "".length();
      } while((((37 ^ 112) << " ".length() ^ 23 + 110 - 58 + 116) & (77 ^ 66 ^ (148 ^ 153) << " ".length() ^ -" ".length())) == 0);

   }

   private static boolean lIlIIIIlIlIlII(int var0) {
      return var0 == 0;
   }
}
