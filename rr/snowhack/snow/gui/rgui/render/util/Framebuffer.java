package rr.snowhack.snow.gui.rgui.render.util;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32;

public class Framebuffer {
   // $FF: synthetic field
   private int WIDTH;
   // $FF: synthetic field
   private int framebufferID;
   // $FF: synthetic field
   private int framebufferTexture;
   // $FF: synthetic field
   private int HEIGHT;
   // $FF: synthetic field
   private int framebufferDepthbuffer;
   // $FF: synthetic field
   private static final int[] lIIIIlllllIIl;

   private void initialiseFramebuffer() {
      lllllllllllllllIIlllIllllIIlIlII.framebufferID = lllllllllllllllIIlllIllllIIlIlII.createFrameBuffer();
      lllllllllllllllIIlllIllllIIlIlII.framebufferTexture = lllllllllllllllIIlllIllllIIlIlII.createTextureAttachment(lllllllllllllllIIlllIllllIIlIlII.WIDTH, lllllllllllllllIIlllIllllIIlIlII.HEIGHT);
      lllllllllllllllIIlllIllllIIlIlII.framebufferDepthbuffer = lllllllllllllllIIlllIllllIIlIlII.createDepthBufferAttachment(lllllllllllllllIIlllIllllIIlIlII.WIDTH, lllllllllllllllIIlllIllllIIlIlII.HEIGHT);
      lllllllllllllllIIlllIllllIIlIlII.unbindFramebuffer();
   }

   private int createDepthBufferAttachment(int lllllllllllllllIIlllIlllIllIllII, int lllllllllllllllIIlllIlllIllIlIII) {
      int lllllllllllllllIIlllIlllIllIlIlI = GL30.glGenRenderbuffers();
      GL30.glBindRenderbuffer(lIIIIlllllIIl[13], lllllllllllllllIIlllIlllIllIlIlI);
      GL30.glRenderbufferStorage(lIIIIlllllIIl[13], lIIIIlllllIIl[10], lllllllllllllllIIlllIlllIllIllII, lllllllllllllllIIlllIlllIllIlIII);
      GL30.glFramebufferRenderbuffer(lIIIIlllllIIl[0], lIIIIlllllIIl[12], lIIIIlllllIIl[13], lllllllllllllllIIlllIlllIllIlIlI);
      return lllllllllllllllIIlllIlllIllIlIlI;
   }

   private int createDepthTextureAttachment(int lllllllllllllllIIlllIlllIlllIllI, int lllllllllllllllIIlllIlllIlllIlIl) {
      int lllllllllllllllIIlllIlllIlllIlII = GL11.glGenTextures();
      GL11.glBindTexture(lIIIIlllllIIl[2], lllllllllllllllIIlllIlllIlllIlII);
      GL11.glTexImage2D(lIIIIlllllIIl[2], lIIIIlllllIIl[1], lIIIIlllllIIl[9], lllllllllllllllIIlllIlllIlllIllI, lllllllllllllllIIlllIlllIlllIlIl, lIIIIlllllIIl[1], lIIIIlllllIIl[10], lIIIIlllllIIl[11], (ByteBuffer)null);
      GL11.glTexParameteri(lIIIIlllllIIl[2], lIIIIlllllIIl[6], lIIIIlllllIIl[7]);
      GL11.glTexParameteri(lIIIIlllllIIl[2], lIIIIlllllIIl[8], lIIIIlllllIIl[7]);
      GL32.glFramebufferTexture(lIIIIlllllIIl[0], lIIIIlllllIIl[12], lllllllllllllllIIlllIlllIlllIlII, lIIIIlllllIIl[1]);
      return lllllllllllllllIIlllIlllIlllIlII;
   }

   static {
      lIlIlllIIIlIII();
   }

   public void cleanUp() {
      GL30.glDeleteFramebuffers(lllllllllllllllIIlllIllllIIlllIl.framebufferID);
      GL11.glDeleteTextures(lllllllllllllllIIlllIllllIIlllIl.framebufferTexture);
      GL30.glDeleteRenderbuffers(lllllllllllllllIIlllIllllIIlllIl.framebufferDepthbuffer);
   }

   public int getWidth() {
      return lllllllllllllllIIlllIlllIllIIIIl.WIDTH;
   }

   public Framebuffer(int lllllllllllllllIIlllIllllIlIIlII, int lllllllllllllllIIlllIllllIlIIIII) {
      lllllllllllllllIIlllIllllIlIIlIl.WIDTH = Display.getWidth();
      lllllllllllllllIIlllIllllIlIIlIl.HEIGHT = Display.getHeight();
      lllllllllllllllIIlllIllllIlIIlIl.WIDTH = lllllllllllllllIIlllIllllIlIIlII;
      lllllllllllllllIIlllIllllIlIIlIl.HEIGHT = lllllllllllllllIIlllIllllIlIIIII;
      lllllllllllllllIIlllIllllIlIIlIl.initialiseFramebuffer();
   }

   private int createFrameBuffer() {
      boolean lllllllllllllllIIlllIllllIIIIlIl = GL30.glGenFramebuffers();
      GL30.glBindFramebuffer(lIIIIlllllIIl[0], lllllllllllllllIIlllIllllIIIIlIl);
      GL11.glDrawBuffer(lIIIIlllllIIl[3]);
      return lllllllllllllllIIlllIllllIIIIlIl;
   }

   public void unbindFramebuffer() {
      GL30.glBindFramebuffer(lIIIIlllllIIl[0], lIIIIlllllIIl[1]);
      GL11.glViewport(lIIIIlllllIIl[1], lIIIIlllllIIl[1], Display.getWidth(), Display.getHeight());
   }

   public int getFramebufferTexture() {
      return lllllllllllllllIIlllIllllIIlIllI.framebufferTexture;
   }

   public void bindFrameBuffer() {
      lllllllllllllllIIlllIllllIIllIlI.bindFrameBuffer(lllllllllllllllIIlllIllllIIllIlI.framebufferID, lllllllllllllllIIlllIllllIIllIlI.WIDTH, lllllllllllllllIIlllIllllIIllIlI.HEIGHT);
   }

   private int createTextureAttachment(int lllllllllllllllIIlllIllllIIIIIII, int lllllllllllllllIIlllIlllIlllllll) {
      String lllllllllllllllIIlllIlllIllllIll = GL11.glGenTextures();
      GL11.glBindTexture(lIIIIlllllIIl[2], lllllllllllllllIIlllIlllIllllIll);
      GL11.glTexImage2D(lIIIIlllllIIl[2], lIIIIlllllIIl[1], lIIIIlllllIIl[4], lllllllllllllllIIlllIllllIIIIIII, lllllllllllllllIIlllIlllIlllllll, lIIIIlllllIIl[1], lIIIIlllllIIl[4], lIIIIlllllIIl[5], (ByteBuffer)null);
      GL11.glTexParameteri(lIIIIlllllIIl[2], lIIIIlllllIIl[6], lIIIIlllllIIl[7]);
      GL11.glTexParameteri(lIIIIlllllIIl[2], lIIIIlllllIIl[8], lIIIIlllllIIl[7]);
      GL32.glFramebufferTexture(lIIIIlllllIIl[0], lIIIIlllllIIl[3], lllllllllllllllIIlllIlllIllllIll, lIIIIlllllIIl[1]);
      return lllllllllllllllIIlllIlllIllllIll;
   }

   private void bindFrameBuffer(int lllllllllllllllIIlllIllllIIIlllI, int lllllllllllllllIIlllIllllIIIlIlI, int lllllllllllllllIIlllIllllIIIllII) {
      GL11.glBindTexture(lIIIIlllllIIl[2], lIIIIlllllIIl[1]);
      GL30.glBindFramebuffer(lIIIIlllllIIl[0], lllllllllllllllIIlllIllllIIIlllI);
      GL11.glViewport(lIIIIlllllIIl[1], lIIIIlllllIIl[1], lllllllllllllllIIlllIllllIIIlIlI, lllllllllllllllIIlllIllllIIIllII);
   }

   public Framebuffer() {
      this(Display.getWidth(), Display.getHeight());
   }

   public int getHeight() {
      return lllllllllllllllIIlllIlllIlIlllll.HEIGHT;
   }

   private static void lIlIlllIIIlIII() {
      lIIIIlllllIIl = new int[15];
      lIIIIlllllIIl[0] = 507 + 344 - 356 + 70 << ("   ".length() << " ".length());
      lIIIIlllllIIl[1] = " ".length() << (15 + 18 - -20 + 130 ^ (71 ^ 30) << " ".length()) & (" ".length() << ((102 ^ 115) << " ".length() ^ 113 ^ 94) ^ -" ".length());
      lIIIIlllllIIl[2] = 508 + 264 - 213 + 20 + (722 + 1346 - 544 + 205 << " ".length()) - (281 + 401 - 254 + 465) + 219 + 43 - 48 + 195;
      lIIIIlllllIIl[3] = 336 + 20 - -54 + 239 + 379 + 214 - 232 + 530 - (49 + 334 - 353 + 469) + ((41 ^ 2) << " ".length()) << (209 ^ 140 ^ (16 ^ 27) << "   ".length());
      lIIIIlllllIIl[4] = 3347 + 3294 - 5234 + 3194 + 4415 + 2221 - 3891 + 2250 - (3780 + 64 - 1326 + 6791) + (388 + 435 - 317 + 259 << "   ".length());
      lIIIIlllllIIl[5] = 779 + 769 - -2359 + 1214;
      lIIIIlllllIIl[6] = (225 ^ 188 ^ (80 ^ 91) << "   ".length()) << ((118 ^ 97) << (" ".length() << " ".length()) ^ 238 ^ 185);
      lIIIIlllllIIl[7] = 433 + 433 - 284 + 319 + (140 + 952 - 486 + 427 << "   ".length()) - (4294 + 2072 - 1705 + 3184) + 2070 + 4186 - 5807 + 7960;
      lIIIIlllllIIl[8] = 9199 + 260 - 4735 + 5517;
      lIIIIlllllIIl[9] = (1130 + 743 - 1048 + 700 << "   ".length()) + 14770 + 12500 - 18908 + 22663 - (14182 + 5348 - 4459 + 5052) + 537 + 3458 - -868 + 5226;
      lIIIIlllllIIl[10] = ((215 ^ 132) << "   ".length()) + ((212 ^ 193) << (" ".length() << " ".length())) - -(478 + 1540 - 965 + 1056) + ((3 ^ 40) << "   ".length()) << " ".length();
      lIIIIlllllIIl[11] = 736 + 788 - 1376 + 1569 + 845 + 28 - -415 + 343 - (374 + 701 - 654 + 302 << " ".length()) + 29 + 649 - 403 + 386 << " ".length();
      lIIIIlllllIIl[12] = (40 ^ 49) + (26 ^ 93) - -(153 ^ 187) + (7 ^ 12) << (" ".length() << "   ".length());
      lIIIIlllllIIl[13] = 1358 + 24866 - 9260 + 19197;
      lIIIIlllllIIl[14] = " ".length() << ((58 ^ 113 ^ (51 ^ 32) << (" ".length() << " ".length())) << " ".length());
   }

   public void framebufferClear() {
      lllllllllllllllIIlllIlllIllIIlIl.bindFrameBuffer();
      GL11.glClear(lIIIIlllllIIl[14]);
      lllllllllllllllIIlllIlllIllIIlIl.unbindFramebuffer();
   }
}
