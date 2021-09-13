package rr.snowhack.snow.gui.rgui.render.util;

import org.lwjgl.opengl.ARBShaderObjects;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

public final class Uniform {
   // $FF: synthetic field
   private final String name;
   // $FF: synthetic field
   private final int location;

   public final void setBoolean(boolean lllllllllllllllIlIIIIlIIlllllIIl) {
      int var10000 = lllllllllllllllIlIIIIlIIllllllII.location;
      float var10001;
      if (lIlIlIIlllIlIl(lllllllllllllllIlIIIIlIIlllllIIl)) {
         var10001 = 1.0F;
         "".length();
         if ("   ".length() < -" ".length()) {
            return;
         }
      } else {
         var10001 = 0.0F;
      }

      ARBShaderObjects.glUniform1fARB(var10000, var10001);
   }

   public final void setFloat(float lllllllllllllllIlIIIIlIIllllllll) {
      ARBShaderObjects.glUniform1fARB(lllllllllllllllIlIIIIlIlIIIIIIII.location, lllllllllllllllIlIIIIlIIllllllll);
   }

   public static Uniform get(int lllllllllllllllIlIIIIlIIlllIIlII, String lllllllllllllllIlIIIIlIIlllIIIll) {
      return new Uniform(lllllllllllllllIlIIIIlIIlllIIIll, ARBShaderObjects.glGetUniformLocationARB(lllllllllllllllIlIIIIlIIlllIIlII, lllllllllllllllIlIIIIlIIlllIIIll));
   }

   public final void setVec(Vector3f lllllllllllllllIlIIIIlIIlllIllll) {
      ARBShaderObjects.glUniform3fARB(lllllllllllllllIlIIIIlIIllllIIII.location, lllllllllllllllIlIIIIlIIlllIllll.x, lllllllllllllllIlIIIIlIIlllIllll.y, lllllllllllllllIlIIIIlIIlllIllll.z);
   }

   public final String getName() {
      return lllllllllllllllIlIIIIlIIlllIlIlI.name;
   }

   public final void setVec(Vector2f lllllllllllllllIlIIIIlIIllllIIll) {
      ARBShaderObjects.glUniform2fARB(lllllllllllllllIlIIIIlIIllllIllI.location, lllllllllllllllIlIIIIlIIllllIIll.x, lllllllllllllllIlIIIIlIIllllIIll.y);
   }

   public final int getLocation() {
      return lllllllllllllllIlIIIIlIIlllIlIII.location;
   }

   private Uniform(String lllllllllllllllIlIIIIlIlIIIIllll, int lllllllllllllllIlIIIIlIlIIIIlllI) {
      lllllllllllllllIlIIIIlIlIIIlIIII.name = lllllllllllllllIlIIIIlIlIIIIllll;
      lllllllllllllllIlIIIIlIlIIIlIIII.location = lllllllllllllllIlIIIIlIlIIIIlllI;
   }

   public final void setInt(int lllllllllllllllIlIIIIlIlIIIIIlIl) {
      ARBShaderObjects.glUniform1iARB(lllllllllllllllIlIIIIlIlIIIIIllI.location, lllllllllllllllIlIIIIlIlIIIIIlIl);
   }

   private static boolean lIlIlIIlllIlIl(int var0) {
      return var0 != 0;
   }
}
