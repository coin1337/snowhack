package rr.snowhack.snow.gui.rgui.render.util;

import org.lwjgl.opengl.ARBShaderObjects;

public final class ShaderHelper {
   // $FF: synthetic field
   private static final int[] lIIIIlIllIllI;

   static {
      lIlIlIlllIIlII();
   }

   public static void createProgram(int lllllllllllllllIIlllllllIIIIlIII) {
      ARBShaderObjects.glLinkProgramARB(lllllllllllllllIIlllllllIIIIlIII);
      checkObjecti(lllllllllllllllIIlllllllIIIIlIII, lIIIIlIllIllI[0]);
      ARBShaderObjects.glValidateProgramARB(lllllllllllllllIIlllllllIIIIlIII);
      checkObjecti(lllllllllllllllIIlllllllIIIIlIII, lIIIIlIllIllI[1]);
   }

   private static void checkObjecti(int lllllllllllllllIIllllllIllllIIlI, int lllllllllllllllIIllllllIllllIIll) {
      if (lIlIlIlllIIlIl(ARBShaderObjects.glGetObjectParameteriARB(lllllllllllllllIIllllllIllllIIlI, lllllllllllllllIIllllllIllllIIll))) {
         try {
            throw new Exception(getLogInfo(lllllllllllllllIIllllllIllllIIlI));
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }

   private static void lIlIlIlllIIlII() {
      lIIIIlIllIllI = new int[5];
      lIIIIlIllIllI[0] = 14155 + 10351 - 13511 + 6862 << " ".length();
      lIIIIlIllIllI[1] = 22912 + 14929 - 30474 + 28348;
      lIIIIlIllIllI[2] = (189 ^ 162) & ~(41 ^ 54);
      lIIIIlIllIllI[3] = 11110 + 8022 - 10613 + 6364 + 4263 + 20158 - 10463 + 13521 - (2911 + 4984 - 2319 + 2049 << " ".length()) + 5863 + 6846 - 5820 + 1712;
      lIIIIlIllIllI[4] = 2042 + 625 - -4557 + 1705 << (" ".length() << " ".length());
   }

   public static int loadShader(String lllllllllllllllIIllllllIllllllll, int lllllllllllllllIIlllllllIIIIIIlI) {
      String lllllllllllllllIIllllllIllllllIl = ARBShaderObjects.glCreateShaderObjectARB(lllllllllllllllIIlllllllIIIIIIlI);
      if (lIlIlIlllIIlIl(lllllllllllllllIIllllllIllllllIl)) {
         return lIIIIlIllIllI[2];
      } else {
         int lllllllllllllllIIllllllIllllllII = (new StreamReader(ShaderHelper.class.getResourceAsStream(lllllllllllllllIIllllllIllllllll))).read();
         ARBShaderObjects.glShaderSourceARB(lllllllllllllllIIllllllIllllllIl, lllllllllllllllIIllllllIllllllII);
         ARBShaderObjects.glCompileShaderARB(lllllllllllllllIIllllllIllllllIl);
         checkObjecti(lllllllllllllllIIllllllIllllllIl, lIIIIlIllIllI[3]);
         return lllllllllllllllIIllllllIllllllIl;
      }
   }

   private static boolean lIlIlIlllIIlIl(int var0) {
      return var0 == 0;
   }

   private static String getLogInfo(int lllllllllllllllIIllllllIlllllIlI) {
      return ARBShaderObjects.glGetInfoLogARB(lllllllllllllllIIllllllIlllllIlI, ARBShaderObjects.glGetObjectParameteriARB(lllllllllllllllIIllllllIlllllIlI, lIIIIlIllIllI[4]));
   }

   private ShaderHelper() {
   }
}
