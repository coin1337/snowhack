package rr.snowhack.snow.gui.rgui.render.util;

import java.util.HashMap;
import java.util.Map;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class Shader {
   // $FF: synthetic field
   private final int vertexID;
   // $FF: synthetic field
   private final Map<String, Uniform> uniforms = new HashMap();
   // $FF: synthetic field
   private final int fragmentID;
   // $FF: synthetic field
   private final int programID = ARBShaderObjects.glCreateProgramObjectARB();
   // $FF: synthetic field
   private static final int[] lIIIlIIIIIIlI;

   protected final Uniform getUniform(String lllllllllllllllIIlllIllIlIIlIIll) {
      return (Uniform)lllllllllllllllIIlllIllIlIIlIIlI.uniforms.computeIfAbsent(lllllllllllllllIIlllIllIlIIlIIll, (lllllllllllllllIIlllIllIlIIIlIll) -> {
         return Uniform.get(lllllllllllllllIIlllIllIlIIIllII.programID, lllllllllllllllIIlllIllIlIIIlIll);
      });
   }

   public final void attach() {
      ARBShaderObjects.glUseProgramObjectARB(lllllllllllllllIIlllIllIlIIlllII.programID);
      lllllllllllllllIIlllIllIlIIlllII.update();
   }

   private static void lIlIlllIIlIlIl() {
      lIIIlIIIIIIlI = new int[3];
      lIIIlIIIIIIlI[0] = 23692 + 15198 - 32180 + 28923;
      lIIIlIIIIIIlI[1] = ((121 ^ 56) << (" ".length() << (" ".length() << " ".length()))) + ((90 ^ 25) << (" ".length() << (" ".length() << " ".length()))) - (511 + 374 - 336 + 36) + (167 + 113 - 235 + 130 << (" ".length() << " ".length())) << (" ".length() << (" ".length() << " ".length()));
      lIIIlIIIIIIlI[2] = (41 ^ 24) << " ".length() & ~((34 ^ 19) << " ".length());
   }

   public abstract void update();

   public final void detach() {
      ARBShaderObjects.glUseProgramObjectARB(lIIIlIIIIIIlI[2]);
   }

   public final void delete() {
      ARBShaderObjects.glUseProgramObjectARB(lIIIlIIIIIIlI[2]);
      ARBShaderObjects.glDetachObjectARB(lllllllllllllllIIlllIllIlIIllIII.programID, lllllllllllllllIIlllIllIlIIllIII.vertexID);
      ARBShaderObjects.glDetachObjectARB(lllllllllllllllIIlllIllIlIIllIII.programID, lllllllllllllllIIlllIllIlIIllIII.fragmentID);
      ARBShaderObjects.glDeleteObjectARB(lllllllllllllllIIlllIllIlIIllIII.vertexID);
      ARBShaderObjects.glDeleteObjectARB(lllllllllllllllIIlllIllIlIIllIII.fragmentID);
      ARBShaderObjects.glDeleteObjectARB(lllllllllllllllIIlllIllIlIIllIII.programID);
   }

   static {
      lIlIlllIIlIlIl();
   }

   public Shader(String lllllllllllllllIIlllIllIlIlIIIlI, String lllllllllllllllIIlllIllIlIlIIIIl) {
      lllllllllllllllIIlllIllIlIlIIIll.vertexID = ShaderHelper.loadShader(lllllllllllllllIIlllIllIlIlIIIlI, lIIIlIIIIIIlI[0]);
      lllllllllllllllIIlllIllIlIlIIIll.fragmentID = ShaderHelper.loadShader(lllllllllllllllIIlllIllIlIlIIIIl, lIIIlIIIIIIlI[1]);
      ARBShaderObjects.glAttachObjectARB(lllllllllllllllIIlllIllIlIlIIIll.programID, lllllllllllllllIIlllIllIlIlIIIll.vertexID);
      ARBShaderObjects.glAttachObjectARB(lllllllllllllllIIlllIllIlIlIIIll.programID, lllllllllllllllIIlllIllIlIlIIIll.fragmentID);
      ShaderHelper.createProgram(lllllllllllllllIIlllIllIlIlIIIll.programID);
   }
}
