package rr.snowhack.snow.gui.snow.theme.ui;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.gui.font.CFontRenderer;
import rr.snowhack.snow.gui.rgui.GUI;
import rr.snowhack.snow.gui.rgui.component.AlignedComponent;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.UpdateListener;
import rr.snowhack.snow.gui.rgui.poof.use.FramePoof;
import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.rgui.util.ContainerHelper;
import rr.snowhack.snow.gui.rgui.util.Docking;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;
import rr.snowhack.snow.gui.snow.RenderHelper;
import rr.snowhack.snow.gui.snow.RootFontRenderer;
import rr.snowhack.snow.gui.snow.RootLargeFontRenderer;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.module.modules.client.GUIColor;
import rr.snowhack.snow.util.Bind;
import rr.snowhack.snow.util.ColourHolder;
import rr.snowhack.snow.util.ColourUtils;
import rr.snowhack.snow.util.Wrapper;

public class FrameUI<T extends Frame> extends AbstractComponentUI<Frame> {
   // $FF: synthetic field
   private static final RootFontRenderer ff;
   // $FF: synthetic field
   boolean centerY;
   // $FF: synthetic field
   ColourHolder frameColour;
   // $FF: synthetic field
   Component centerXComponent;
   // $FF: synthetic field
   private static final int[] llllllllIlIl;
   // $FF: synthetic field
   ColourHolder outlineColour;
   // $FF: synthetic field
   private static final String[] llllllllIIll;
   // $FF: synthetic field
   int xLineOffset;
   // $FF: synthetic field
   Component centerYComponent;
   // $FF: synthetic field
   boolean centerX;
   // $FF: synthetic field
   Component xLineComponent;
   // $FF: synthetic field
   CFontRenderer cFontRenderer;
   // $FF: synthetic field
   Component yLineComponent;

   public void handleMouseRelease(Frame lllllllllllllllIlIIlIlIIIIIlIllI, int lllllllllllllllIlIIlIlIIIIIlIlIl, int lllllllllllllllIlIIlIlIIIIIlIlII, int lllllllllllllllIlIIlIlIIIIIlIIll) {
      lllllllllllllllIlIIlIlIIIIIlIlll.yLineComponent = null;
      lllllllllllllllIlIIlIlIIIIIlIlll.xLineComponent = null;
      lllllllllllllllIlIIlIlIIIIIlIlll.centerXComponent = null;
      lllllllllllllllIlIIlIlIIIIIlIlll.centerYComponent = null;
   }

   private static boolean lIlIIllIIIlIII(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIlIIlIlllllll() {
      llllllllIlIl = new int[19];
      llllllllIlIl[0] = (63 ^ 2) & ~(1 ^ 60);
      llllllllIlIl[1] = 254 ^ 157 ^ (23 ^ 44) << " ".length();
      llllllllIlIl[2] = " ".length();
      llllllllIlIl[3] = (79 ^ 86) << (" ".length() << " ".length());
      llllllllIlIl[4] = 1001 + 325 - 490 + 2717;
      llllllllIlIl[5] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllllllIlIl[6] = ((177 ^ 154) << " ".length()) + ((90 ^ 79) << " ".length()) - -(228 ^ 195) + ((88 ^ 83) << "   ".length());
      llllllllIlIl[7] = " ".length() << "   ".length();
      llllllllIlIl[8] = 71 + 32 - 6 + 64 + ((39 ^ 4) << " ".length()) - ((108 ^ 107) << (" ".length() << (" ".length() << " ".length()))) + ((148 ^ 163) << " ".length());
      llllllllIlIl[9] = 187 ^ 190;
      llllllllIlIl[10] = " ".length() << " ".length();
      llllllllIlIl[11] = 624 + 425 - 757 + 429 << (" ".length() << " ".length());
      llllllllIlIl[12] = (59 + 131 - 97 + 68 << " ".length()) + (88 + 125 - 132 + 62 << " ".length()) - -(434 + 157 - -76 + 10) + ((105 ^ 82) << (" ".length() << " ".length())) << " ".length();
      llllllllIlIl[13] = 31 ^ 22;
      llllllllIlIl[14] = (2 ^ 7) << (" ".length() << " ".length());
      llllllllIlIl[15] = ("   ".length() << (153 ^ 156) ^ 165 ^ 192) << " ".length();
      llllllllIlIl[16] = 62 + 40 - 94 + 169 ^ (122 ^ 37) << " ".length();
      llllllllIlIl[17] = "   ".length();
      llllllllIlIl[18] = " ".length() << (" ".length() << " ".length());
   }

   private static boolean lIlIIllIIIIIll(int var0) {
      return var0 != 0;
   }

   static {
      lIlIIlIlllllll();
      lIlIIlIllllllI();
      ff = new RootLargeFontRenderer();
   }

   private static String lIlIIlIlllllIl(String lllllllllllllllIlIIlIIlllIlIIIIl, String lllllllllllllllIlIIlIIlllIlIIIlI) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIIlllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), llllllllIlIl[7]), "DES");
         Cipher lllllllllllllllIlIIlIIlllIlIIlll = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIIlllIlIIlll.init(llllllllIlIl[10], lllllllllllllllIlIIlIIlllIlIlIIl);
         return new String(lllllllllllllllIlIIlIIlllIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void handleAddComponent(final Frame lllllllllllllllIlIIlIIllllllIlII, Container lllllllllllllllIlIIlIIllllllIIlI) {
      super.handleAddComponent(lllllllllllllllIlIIlIIllllllIlII, lllllllllllllllIlIIlIIllllllIIlI);
      lllllllllllllllIlIIlIIllllllIlII.setOriginOffsetY(lllllllllllllllIlIIlIIllllllIlII.getTheme().getFontRenderer().getFontHeight() + llllllllIlIl[17]);
      lllllllllllllllIlIIlIIllllllIlII.setOriginOffsetX(llllllllIlIl[17]);
      lllllllllllllllIlIIlIIllllllIlII.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] lllllllIlIll;

         private static boolean lIlIIlIllIllII(int var0) {
            return var0 != 0;
         }

         private static void lIlIIlIllIlIIl() {
            lllllllIlIll = new int[5];
            lllllllIlIll[0] = (54 ^ 61) << " ".length();
            lllllllIlIll[1] = " ".length() << " ".length();
            lllllllIlIll[2] = (68 ^ 65) << " ".length();
            lllllllIlIll[3] = " ".length();
            lllllllIlIll[4] = (121 ^ 126) & ~(53 ^ 50);
         }

         private static boolean lIlIIlIllIlllI(int var0) {
            return var0 > 0;
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIlIlIlIIlIIIIl) {
            int lllllllllllllllIlIIlIlIlIIlIIIII = lllllllllllllllIlIIlIlIlIIlIIIIl.getY();
            double lllllllllllllllIlIIlIlIlIIIllIll = lllllllllllllllIlIIlIlIlIIlIIIIl.getX();
            if (lIlIIlIllIlIlI(lllllllllllllllIlIIlIlIlIIlIIIII)) {
               if (lIlIIlIllIlIll(lllllllllllllllIlIIlIlIlIIIllIll, lllllllllllllllIlIIlIIllllllIlII.getWidth() - lllllllIlIll[0])) {
                  if (lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isMinimizeable()) && lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isCloseable())) {
                     if (lIlIIlIllIlIll(lllllllllllllllIlIIlIlIlIIlIIIII, -lllllllllllllllIlIIlIIllllllIlII.getOriginOffsetY() / lllllllIlIll[1])) {
                        if (lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isMinimized())) {
                           lllllllllllllllIlIIlIIllllllIlII.callPoof(FramePoof.class, new FramePoof.FramePoofInfo(FramePoof.Action.MAXIMIZE));
                           "".length();
                           if (((94 ^ 125 ^ "   ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length() & ((155 ^ 134 ^ (199 ^ 192) << " ".length()) << " ".length() ^ -" ".length())) != ((36 ^ 89 ^ (65 ^ 82) << (" ".length() << " ".length())) << " ".length() & ((183 ^ 136 ^ (61 ^ 58) << " ".length()) << " ".length() ^ -" ".length()))) {
                              return;
                           }
                        } else {
                           lllllllllllllllIlIIlIIllllllIlII.callPoof(FramePoof.class, new FramePoof.FramePoofInfo(FramePoof.Action.MINIMIZE));
                           "".length();
                           if (null != null) {
                              return;
                           }
                        }
                     } else {
                        lllllllllllllllIlIIlIIllllllIlII.callPoof(FramePoof.class, new FramePoof.FramePoofInfo(FramePoof.Action.CLOSE));
                        "".length();
                        if (" ".length() << " ".length() == 0) {
                           return;
                        }
                     }
                  } else if (lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isMinimized()) && lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isMinimizeable())) {
                     lllllllllllllllIlIIlIIllllllIlII.callPoof(FramePoof.class, new FramePoof.FramePoofInfo(FramePoof.Action.MAXIMIZE));
                     "".length();
                     if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                        return;
                     }
                  } else if (lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isMinimizeable())) {
                     lllllllllllllllIlIIlIIllllllIlII.callPoof(FramePoof.class, new FramePoof.FramePoofInfo(FramePoof.Action.MINIMIZE));
                     "".length();
                     if (-" ".length() > 0) {
                        return;
                     }
                  } else if (lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isCloseable())) {
                     lllllllllllllllIlIIlIIllllllIlII.callPoof(FramePoof.class, new FramePoof.FramePoofInfo(FramePoof.Action.CLOSE));
                  }
               }

               if (lIlIIlIllIllIl(lllllllllllllllIlIIlIlIlIIIllIll, lllllllIlIll[2]) && lIlIIlIllIlllI(lllllllllllllllIlIIlIlIlIIIllIll) && lIlIIlIllIllII(lllllllllllllllIlIIlIIllllllIlII.isPinneable())) {
                  Frame var10000 = lllllllllllllllIlIIlIIllllllIlII;
                  int var10001;
                  if (lIlIIlIllIllll(lllllllllllllllIlIIlIIllllllIlII.isPinned())) {
                     var10001 = lllllllIlIll[3];
                     "".length();
                     if ("   ".length() == 0) {
                        return;
                     }
                  } else {
                     var10001 = lllllllIlIll[4];
                  }

                  var10000.setPinned((boolean)var10001);
               }
            }

         }

         private static boolean lIlIIlIllIllll(int var0) {
            return var0 == 0;
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIlIlIlIIIlIIll) {
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIlIlIlIIIlIlll) {
         }

         private static boolean lIlIIlIllIlIll(int var0, int var1) {
            return var0 > var1;
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIlIlIlIIIllIIl) {
         }

         static {
            lIlIIlIllIlIIl();
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIlIlIlIIIlIlIl) {
         }

         private static boolean lIlIIlIllIlIlI(int var0) {
            return var0 < 0;
         }

         private static boolean lIlIIlIllIllIl(int var0, int var1) {
            return var0 < var1;
         }
      });
      lllllllllllllllIlIIlIIllllllIlII.addUpdateListener(new UpdateListener() {
         public void updateLocation(Component lllllllllllllllIIlllIllllIllIIlI, int lllllllllllllllIIlllIllllIllIIIl, int lllllllllllllllIIlllIllllIllIIII) {
         }

         public void updateSize(Component lllllllllllllllIIlllIllllIllIlll, int lllllllllllllllIIlllIllllIllIllI, int lllllllllllllllIIlllIllllIllIlIl) {
            if (lIlIlllIIIIlll(lllllllllllllllIIlllIllllIllIlll instanceof Frame)) {
               SnowGUI.dock((Frame)lllllllllllllllIIlllIllllIllIlll);
            }

         }

         private static boolean lIlIlllIIIIlll(int var0) {
            return var0 != 0;
         }
      });
      lllllllllllllllIlIIlIIllllllIlII.addPoof(new Frame.FrameDragPoof<Frame, Frame.FrameDragPoof.DragInfo>() {
         // $FF: synthetic field
         private static final int[] lIIIIlllIllll;

         private static boolean lIlIllIllIlIll(int var0) {
            return var0 == 0;
         }

         static {
            lIlIllIllIlIlI();
         }

         private static void lIlIllIllIlIlI() {
            lIIIIlllIllll = new int[6];
            lIIIIlllIllll[0] = " ".length() << (" ".length() << " ".length());
            lIIIIlllIllll[1] = "   ".length();
            lIIIIlllIllll[2] = (128 ^ 181) & ~(184 ^ 141);
            lIIIIlllIllll[3] = 74 ^ 123 ^ (161 ^ 172) << (" ".length() << " ".length());
            lIIIIlllIllll[4] = " ".length() << " ".length();
            lIIIIlllIllll[5] = " ".length();
         }

         public void execute(Frame lllllllllllllllIIllllIIlIIIlIlIl, Frame.FrameDragPoof.DragInfo lllllllllllllllIIllllIIlIIIllIll) {
            if (lIlIllIllIlIll(Bind.isShiftDown()) && lIlIllIllIlIll(Bind.isAltDown()) && !lIlIllIllIllII(Bind.isCtrlDown())) {
               short lllllllllllllllIIllllIIlIIIlIIll = lllllllllllllllIIllllIIlIIIllIll.getX();
               int lllllllllllllllIIllllIIlIIIllIIl = lllllllllllllllIIllllIIlIIIllIll.getY();
               lllllllllllllllIlIIlIIllllllIlIl.yLineComponent = null;
               lllllllllllllllIlIIlIIllllllIlIl.xLineComponent = null;
               lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.NONE);
               Exception lllllllllllllllIIllllIIlIIIlIIIl = SnowMod.getInstance().getGuiManager();
               Iterator lllllllllllllllIIllllIIlIIIlIIII = lllllllllllllllIIllllIIlIIIlIIIl.getChildren().iterator();

               while(lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIIII.hasNext())) {
                  byte lllllllllllllllIIllllIIlIIIIllll = (Component)lllllllllllllllIIllllIIlIIIlIIII.next();
                  if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIIllll.equals(lllllllllllllllIIllllIIlIIIlIlIl))) {
                     "".length();
                     if (-"   ".length() > 0) {
                        return;
                     }
                  } else {
                     int lllllllllllllllIIllllIIlIIlIIIII = Math.abs(lllllllllllllllIIllllIIlIIIllIIl - lllllllllllllllIIllllIIlIIIIllll.getY());
                     if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIlIIIII, lIIIIlllIllll[0])) {
                        lllllllllllllllIIllllIIlIIIllIIl = lllllllllllllllIIllllIIlIIIIllll.getY();
                        lllllllllllllllIlIIlIIllllllIlIl.yLineComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                     }

                     lllllllllllllllIIllllIIlIIlIIIII = Math.abs(lllllllllllllllIIllllIIlIIIllIIl - (lllllllllllllllIIllllIIlIIIIllll.getY() + lllllllllllllllIIllllIIlIIIIllll.getHeight() + lIIIIlllIllll[1]));
                     if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIlIIIII, lIIIIlllIllll[0])) {
                        lllllllllllllllIIllllIIlIIIllIIl = lllllllllllllllIIllllIIlIIIIllll.getY() + lllllllllllllllIIllllIIlIIIIllll.getHeight();
                        lllllllllllllllIIllllIIlIIIllIIl += 3;
                        lllllllllllllllIlIIlIIllllllIlIl.yLineComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                     }

                     byte lllllllllllllllIIllllIIlIIIIllIl = Math.abs(lllllllllllllllIIllllIIlIIIlIIll + lllllllllllllllIIllllIIlIIIlIlIl.getWidth() - (lllllllllllllllIIllllIIlIIIIllll.getX() + lllllllllllllllIIllllIIlIIIIllll.getWidth()));
                     if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIIIllIl, lIIIIlllIllll[0])) {
                        lllllllllllllllIIllllIIlIIIlIIll = lllllllllllllllIIllllIIlIIIIllll.getX() + lllllllllllllllIIllllIIlIIIIllll.getWidth();
                        lllllllllllllllIIllllIIlIIIlIIll -= lllllllllllllllIIllllIIlIIIlIlIl.getWidth();
                        lllllllllllllllIlIIlIIllllllIlIl.xLineComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                        lllllllllllllllIlIIlIIllllllIlIl.xLineOffset = lllllllllllllllIIllllIIlIIIlIlIl.getWidth();
                     }

                     lllllllllllllllIIllllIIlIIIIllIl = Math.abs(lllllllllllllllIIllllIIlIIIlIIll - lllllllllllllllIIllllIIlIIIIllll.getX());
                     if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIIIllIl, lIIIIlllIllll[0])) {
                        lllllllllllllllIIllllIIlIIIlIIll = lllllllllllllllIIllllIIlIIIIllll.getX();
                        lllllllllllllllIlIIlIIllllllIlIl.xLineComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                        lllllllllllllllIlIIlIIllllllIlIl.xLineOffset = lIIIIlllIllll[2];
                     }

                     lllllllllllllllIIllllIIlIIIIllIl = Math.abs(lllllllllllllllIIllllIIlIIIlIIll - (lllllllllllllllIIllllIIlIIIIllll.getX() + lllllllllllllllIIllllIIlIIIIllll.getWidth() + lIIIIlllIllll[1]));
                     if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIIIllIl, lIIIIlllIllll[0])) {
                        lllllllllllllllIIllllIIlIIIlIIll = lllllllllllllllIIllllIIlIIIIllll.getX() + lllllllllllllllIIllllIIlIIIIllll.getWidth() + lIIIIlllIllll[1];
                        lllllllllllllllIlIIlIIllllllIlIl.xLineComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                        lllllllllllllllIlIIlIIllllllIlIl.xLineOffset = lIIIIlllIllll[2];
                     }

                     "".length();
                     if (" ".length() << " ".length() <= 0) {
                        return;
                     }
                  }
               }

               if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIIlIIll, lIIIIlllIllll[3])) {
                  lllllllllllllllIIllllIIlIIIlIIll = lIIIIlllIllll[2];
                  ContainerHelper.setAlignment(lllllllllllllllIIllllIIlIIIlIlIl, AlignedComponent.Alignment.LEFT);
                  lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.LEFT);
               }

               boolean lllllllllllllllIIllllIIlIIIlIIIIx = (lllllllllllllllIIllllIIlIIIlIIll + lllllllllllllllIIllllIIlIIIlIlIl.getWidth()) * DisplayGuiScreen.getScale() - Wrapper.getMinecraft().field_71443_c;
               if (lIlIllIllIllIl(-lllllllllllllllIIllllIIlIIIlIIIIx, lIIIIlllIllll[3])) {
                  lllllllllllllllIIllllIIlIIIlIIll = Wrapper.getMinecraft().field_71443_c / DisplayGuiScreen.getScale() - lllllllllllllllIIllllIIlIIIlIlIl.getWidth();
                  ContainerHelper.setAlignment(lllllllllllllllIIllllIIlIIIlIlIl, AlignedComponent.Alignment.RIGHT);
                  lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.RIGHT);
               }

               if (lIlIllIllIllIl(lllllllllllllllIIllllIIlIIIllIIl, lIIIIlllIllll[3])) {
                  lllllllllllllllIIllllIIlIIIllIIl = lIIIIlllIllll[2];
                  if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().equals(Docking.RIGHT))) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.TOPRIGHT);
                     "".length();
                     if ((((36 ^ 3) << (" ".length() << " ".length()) ^ 70 + 42 - 99 + 130) & (210 ^ 193 ^ (55 ^ 50) << "   ".length() & ~((60 ^ 57) << "   ".length()) ^ -" ".length())) >= " ".length()) {
                        return;
                     }
                  } else if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().equals(Docking.LEFT))) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.TOPLEFT);
                     "".length();
                     if (((136 + 24 - 142 + 123 ^ " ".length() << (195 ^ 196)) << (" ".length() << " ".length()) & (((64 ^ 97) << (" ".length() << " ".length()) ^ 93 + 17 - -8 + 19) << (" ".length() << " ".length()) ^ -" ".length())) < -" ".length()) {
                        return;
                     }
                  } else {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.TOP);
                  }
               }

               lllllllllllllllIIllllIIlIIIlIIIIx = (lllllllllllllllIIllllIIlIIIllIIl + lllllllllllllllIIllllIIlIIIlIlIl.getHeight()) * DisplayGuiScreen.getScale() - Wrapper.getMinecraft().field_71440_d;
               if (lIlIllIllIllIl(-lllllllllllllllIIllllIIlIIIlIIIIx, lIIIIlllIllll[3])) {
                  lllllllllllllllIIllllIIlIIIllIIl = Wrapper.getMinecraft().field_71440_d / DisplayGuiScreen.getScale() - lllllllllllllllIIllllIIlIIIlIlIl.getHeight();
                  if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().equals(Docking.RIGHT))) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.BOTTOMRIGHT);
                     "".length();
                     if (" ".length() << " ".length() <= -" ".length()) {
                        return;
                     }
                  } else if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().equals(Docking.LEFT))) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.BOTTOMLEFT);
                     "".length();
                     if (((116 ^ 123) << (" ".length() << " ".length()) & ~((71 ^ 72) << (" ".length() << " ".length()))) < -" ".length()) {
                        return;
                     }
                  } else {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.BOTTOM);
                  }
               }

               if (lIlIllIllIllIl(Math.abs((lllllllllllllllIIllllIIlIIIlIIll + lllllllllllllllIIllllIIlIIIlIlIl.getWidth() / lIIIIlllIllll[4]) * DisplayGuiScreen.getScale() * lIIIIlllIllll[4] - Wrapper.getMinecraft().field_71443_c), lIIIIlllIllll[3])) {
                  lllllllllllllllIlIIlIIllllllIlIl.xLineComponent = null;
                  lllllllllllllllIlIIlIIllllllIlIl.centerXComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                  lllllllllllllllIlIIlIIllllllIlIl.centerX = (boolean)lIIIIlllIllll[5];
                  lllllllllllllllIIllllIIlIIIlIIll = Wrapper.getMinecraft().field_71443_c / (DisplayGuiScreen.getScale() * lIIIIlllIllll[4]) - lllllllllllllllIIllllIIlIIIlIlIl.getWidth() / lIIIIlllIllll[4];
                  if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().isTop())) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTERTOP);
                     "".length();
                     if ((("   ".length() << ("   ".length() << " ".length()) ^ 140 + 28 - 14 + 45) & ((1 ^ 46) << " ".length() ^ 74 ^ 19 ^ -" ".length())) != 0) {
                        return;
                     }
                  } else if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().isBottom())) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTERBOTTOM);
                     "".length();
                     if (" ".length() == -" ".length()) {
                        return;
                     }
                  } else {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTERVERTICAL);
                  }

                  ContainerHelper.setAlignment(lllllllllllllllIIllllIIlIIIlIlIl, AlignedComponent.Alignment.CENTER);
                  "".length();
                  if (" ".length() << " ".length() > " ".length() << " ".length()) {
                     return;
                  }
               } else {
                  lllllllllllllllIlIIlIIllllllIlIl.centerX = (boolean)lIIIIlllIllll[2];
               }

               if (lIlIllIllIllIl(Math.abs((lllllllllllllllIIllllIIlIIIllIIl + lllllllllllllllIIllllIIlIIIlIlIl.getHeight() / lIIIIlllIllll[4]) * DisplayGuiScreen.getScale() * lIIIIlllIllll[4] - Wrapper.getMinecraft().field_71440_d), lIIIIlllIllll[3])) {
                  lllllllllllllllIlIIlIIllllllIlIl.yLineComponent = null;
                  lllllllllllllllIlIIlIIllllllIlIl.centerYComponent = lllllllllllllllIIllllIIlIIIlIlIl;
                  lllllllllllllllIlIIlIIllllllIlIl.centerY = (boolean)lIIIIlllIllll[5];
                  lllllllllllllllIIllllIIlIIIllIIl = Wrapper.getMinecraft().field_71440_d / (DisplayGuiScreen.getScale() * lIIIIlllIllll[4]) - lllllllllllllllIIllllIIlIIIlIlIl.getHeight() / lIIIIlllIllll[4];
                  if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().isLeft())) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTERLEFT);
                     "".length();
                     if (((143 ^ 196 ^ " ".length() << ("   ".length() << " ".length())) << (" ".length() << " ".length()) & (((133 ^ 150) << "   ".length() ^ 133 + 78 - 125 + 61) << (" ".length() << " ".length()) ^ -" ".length())) > " ".length()) {
                        return;
                     }
                  } else if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().isRight())) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTERRIGHT);
                     "".length();
                     if (" ".length() << (" ".length() << " ".length()) < " ".length()) {
                        return;
                     }
                  } else if (lIlIllIllIllII(lllllllllllllllIIllllIIlIIIlIlIl.getDocking().isCenterHorizontal())) {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTER);
                     "".length();
                     if (-(134 ^ 131) >= 0) {
                        return;
                     }
                  } else {
                     lllllllllllllllIIllllIIlIIIlIlIl.setDocking(Docking.CENTERHOIZONTAL);
                     "".length();
                     if (" ".length() << " ".length() == 0) {
                        return;
                     }
                  }
               } else {
                  lllllllllllllllIlIIlIIllllllIlIl.centerY = (boolean)lIIIIlllIllll[2];
               }

               lllllllllllllllIIllllIIlIIIllIll.setX(lllllllllllllllIIllllIIlIIIlIIll);
               lllllllllllllllIIllllIIlIIIllIll.setY(lllllllllllllllIIllllIIlIIIllIIl);
            }
         }

         private static boolean lIlIllIllIllII(int var0) {
            return var0 != 0;
         }

         private static boolean lIlIllIllIllIl(int var0, int var1) {
            return var0 < var1;
         }
      });
   }

   public void handleMouseDrag(Frame lllllllllllllllIlIIlIlIIIIIIlIll, int lllllllllllllllIlIIlIlIIIIIIlIlI, int lllllllllllllllIlIIlIlIIIIIIlIIl, int lllllllllllllllIlIIlIlIIIIIIIIll) {
      super.handleMouseDrag(lllllllllllllllIlIIlIlIIIIIIlIll, lllllllllllllllIlIIlIlIIIIIIlIlI, lllllllllllllllIlIIlIlIIIIIIlIIl, lllllllllllllllIlIIlIlIIIIIIIIll);
   }

   private static boolean lIlIIllIIIIIlI(int var0) {
      return var0 == 0;
   }

   private static void lIlIIlIllllllI() {
      llllllllIIll = new String[llllllllIlIl[2]];
      llllllllIIll[llllllllIlIl[0]] = lIlIIlIlllllIl("4X6Pt1YzoCU=", "IKGnD");
   }

   public void renderComponent(Frame lllllllllllllllIlIIlIlIIIIlIllIl, FontRenderer lllllllllllllllIlIIlIlIIIIlIllII) {
      if (!lIlIIllIIIIIlI(lIlIIllIIIIIIl(lllllllllllllllIlIIlIlIIIIlIllIl.getOpacity(), 0.0F))) {
         GL11.glDisable(llllllllIlIl[4]);
         float[] var10000 = new float[llllllllIlIl[2]];
         var10000[llllllllIlIl[0]] = (float)(System.currentTimeMillis() % 11520L) / 11520.0F;
         float[] lllllllllllllllIlIIlIlIIIIlIlIll = var10000;
         int lllllllllllllllIlIIlIlIIIIlIlIlI = Color.HSBtoRGB(lllllllllllllllIlIIlIlIIIIlIlIll[llllllllIlIl[0]], 1.0F, 1.0F);
         int lllllllllllllllIlIIlIlIIIIlIlIIl = lllllllllllllllIlIIlIlIIIIlIlIlI >> llllllllIlIl[5] & llllllllIlIl[6];
         int lllllllllllllllIlIIlIlIIIIlIlIII = lllllllllllllllIlIIlIlIIIIlIlIlI >> llllllllIlIl[7] & llllllllIlIl[6];
         double lllllllllllllllIlIIlIlIIIIIlllIl = lllllllllllllllIlIIlIlIIIIlIlIlI & llllllllIlIl[6];
         ColourUtils.toRGBA(lllllllllllllllIlIIlIlIIIIlIlIIl, lllllllllllllllIlIIlIlIIIIlIlIII, lllllllllllllllIlIIlIlIIIIIlllIl, llllllllIlIl[8]);
         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isBoxEnabled())) {
            GL11.glColor4f(0.1F, 0.1F, 0.1F, 0.75F);
            float var13;
            if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
               var13 = 0.0F;
               "".length();
               if (" ".length() << " ".length() <= -" ".length()) {
                  return;
               }
            } else {
               var13 = 5.0F;
            }

            float var10002;
            if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
               var10002 = (float)lllllllllllllllIlIIlIlIIIIlIllIl.getWidth();
               "".length();
               if (" ".length() <= -" ".length()) {
                  return;
               }
            } else {
               var10002 = (float)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[9]);
            }

            RenderHelper.drawFilledRectangle(var13, 0.0F, var10002, (float)(lllllllllllllllIlIIlIlIIIIlIllIl.getHeight() + llllllllIlIl[10]));
            if (lIlIIllIIIIIll(GUIColor.shouldRainbow())) {
               GL11.glColor4f((float)lllllllllllllllIlIIlIlIIIIlIlIIl / 255.0F, (float)lllllllllllllllIlIIlIlIIIIlIlIII / 255.0F, (float)lllllllllllllllIlIIlIlIIIIIlllIl / 255.0F, 9.0F);
               "".length();
               if (" ".length() << " ".length() < -" ".length()) {
                  return;
               }
            } else {
               GL11.glColor4f((float)GUIColor.getRed() / 255.0F, (float)GUIColor.getGreen() / 255.0F, (float)GUIColor.getBlue() / 255.0F, 0.8F);
            }

            if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
               var13 = 0.0F;
               "".length();
               if ("   ".length() <= ((162 ^ 173) << (" ".length() << " ".length()) & ~((127 ^ 112) << (" ".length() << " ".length())))) {
                  return;
               }
            } else {
               var13 = 5.0F;
            }

            if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
               var10002 = (float)lllllllllllllllIlIIlIlIIIIlIllIl.getWidth();
               "".length();
               if (" ".length() < 0) {
                  return;
               }
            } else {
               var10002 = (float)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[9]);
            }

            RenderHelper.drawFilledRectangle(var13, 0.0F, var10002, (float)(ff.getFontHeight() + llllllllIlIl[10]));
            GL11.glLineWidth(1.5F);
            if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
               var13 = 0.0F;
               "".length();
               if (-" ".length() > "   ".length()) {
                  return;
               }
            } else {
               var13 = 5.0F;
            }

            RenderHelper.drawRectangle(var13, 0.0F, (float)lllllllllllllllIlIIlIlIIIIlIllIl.getWidth(), (float)(lllllllllllllllIlIIlIlIIIIlIllIl.getHeight() + llllllllIlIl[10]));
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            GL11.glDisable(llllllllIlIl[11]);
            GL11.glEnable(llllllllIlIl[12]);
            GL11.glEnable(llllllllIlIl[4]);
            lllllllllllllllIlIIlIlIIIIlIlllI.cFontRenderer.drawStringWithShadow(lllllllllllllllIlIIlIlIIIIlIllIl.getTitle(), (double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() / llllllllIlIl[10] - ff.getStringWidth(lllllllllllllllIlIIlIlIIIIlIllIl.getTitle()) / llllllllIlIl[10] + llllllllIlIl[10]), 1.0D, Color.WHITE.getRGB());
            "".length();
            GL11.glEnable(llllllllIlIl[11]);
            GL11.glDisable(llllllllIlIl[12]);
            GL11.glDisable(llllllllIlIl[4]);
         }

         int lllllllllllllllIlIIlIlIIIIlIIlIl = llllllllIlIl[9];
         double lllllllllllllllIlIIlIlIIIIIllIlI = lllllllllllllllIlIIlIlIIIIlIllIl.getTheme().getFontRenderer().getFontHeight() - llllllllIlIl[13];
         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isCloseable()) && lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isMinimizeable())) {
            lllllllllllllllIlIIlIlIIIIlIIlIl -= 4;
            lllllllllllllllIlIIlIlIIIIIllIlI -= 4;
         }

         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isCloseable()) && lIlIIllIIIIIlI(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
            GL11.glLineWidth(2.0F);
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            GL11.glBegin(llllllllIlIl[2]);
            GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[14]), (double)lllllllllllllllIlIIlIlIIIIlIIlIl);
            GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[15]), (double)lllllllllllllllIlIIlIlIIIIIllIlI);
            GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[15]), (double)lllllllllllllllIlIIlIlIIIIlIIlIl);
            GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[14]), (double)lllllllllllllllIlIIlIlIIIIIllIlI);
            GL11.glEnd();
         }

         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isCloseable()) && lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isMinimizeable()) && lIlIIllIIIIIlI(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
            lllllllllllllllIlIIlIlIIIIlIIlIl += 12;
            lllllllllllllllIlIIlIlIIIIIllIlI += 12;
         }

         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isMinimizeable()) && lIlIIllIIIIIlI(lllllllllllllllIlIIlIlIIIIlIllIl.isHudFrame())) {
            GL11.glLineWidth(1.5F);
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.isMinimized())) {
               GL11.glBegin(llllllllIlIl[10]);
               GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[16]), (double)(lllllllllllllllIlIIlIlIIIIlIIlIl + llllllllIlIl[10]));
               GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[16]), (double)(lllllllllllllllIlIIlIlIIIIIllIlI + llllllllIlIl[17]));
               GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[15]), (double)(lllllllllllllllIlIIlIlIIIIIllIlI + llllllllIlIl[17]));
               GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[15]), (double)(lllllllllllllllIlIIlIlIIIIlIIlIl + llllllllIlIl[10]));
               GL11.glEnd();
               "".length();
               if (("   ".length() << "   ".length() ^ 7 ^ 26) == 0) {
                  return;
               }
            } else {
               GL11.glBegin(llllllllIlIl[2]);
               GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[16]), (double)(lllllllllllllllIlIIlIlIIIIIllIlI + llllllllIlIl[18]));
               GL11.glVertex2d((double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() - llllllllIlIl[15]), (double)(lllllllllllllllIlIIlIlIIIIIllIlI + llllllllIlIl[18]));
               GL11.glEnd();
            }
         }

         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.equals(lllllllllllllllIlIIlIlIIIIlIlllI.xLineComponent))) {
            GL11.glColor3f(0.44F, 0.44F, 0.44F);
            GL11.glLineWidth(1.0F);
            GL11.glBegin(llllllllIlIl[2]);
            GL11.glVertex2d((double)lllllllllllllllIlIIlIlIIIIlIlllI.xLineOffset, (double)(-GUI.calculateRealPosition(lllllllllllllllIlIIlIlIIIIlIllIl)[llllllllIlIl[2]]));
            GL11.glVertex2d((double)lllllllllllllllIlIIlIlIIIIlIlllI.xLineOffset, (double)Wrapper.getMinecraft().field_71440_d);
            GL11.glEnd();
         }

         double lllllllllllllllIlIIlIlIIIIIllIIl;
         if (lIlIIllIIIlIII(lllllllllllllllIlIIlIlIIIIlIllIl, lllllllllllllllIlIIlIlIIIIlIlllI.centerXComponent) && lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIlllI.centerX)) {
            GL11.glColor3f(0.86F, 0.03F, 1.0F);
            GL11.glLineWidth(1.0F);
            GL11.glBegin(llllllllIlIl[2]);
            lllllllllllllllIlIIlIlIIIIIllIIl = (double)(lllllllllllllllIlIIlIlIIIIlIllIl.getWidth() / llllllllIlIl[10]);
            GL11.glVertex2d(lllllllllllllllIlIIlIlIIIIIllIIl, (double)(-GUI.calculateRealPosition(lllllllllllllllIlIIlIlIIIIlIllIl)[llllllllIlIl[2]]));
            GL11.glVertex2d(lllllllllllllllIlIIlIlIIIIIllIIl, (double)Wrapper.getMinecraft().field_71440_d);
            GL11.glEnd();
         }

         if (lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIllIl.equals(lllllllllllllllIlIIlIlIIIIlIlllI.yLineComponent))) {
            GL11.glColor3f(0.44F, 0.44F, 0.44F);
            GL11.glLineWidth(1.0F);
            GL11.glBegin(llllllllIlIl[2]);
            GL11.glVertex2d((double)(-GUI.calculateRealPosition(lllllllllllllllIlIIlIlIIIIlIllIl)[llllllllIlIl[0]]), 0.0D);
            GL11.glVertex2d((double)Wrapper.getMinecraft().field_71443_c, 0.0D);
            GL11.glEnd();
         }

         if (lIlIIllIIIlIII(lllllllllllllllIlIIlIlIIIIlIllIl, lllllllllllllllIlIIlIlIIIIlIlllI.centerYComponent) && lIlIIllIIIIIll(lllllllllllllllIlIIlIlIIIIlIlllI.centerY)) {
            GL11.glColor3f(0.86F, 0.03F, 1.0F);
            GL11.glLineWidth(1.0F);
            GL11.glBegin(llllllllIlIl[2]);
            lllllllllllllllIlIIlIlIIIIIllIIl = (double)(lllllllllllllllIlIIlIlIIIIlIllIl.getHeight() / llllllllIlIl[10]);
            GL11.glVertex2d((double)(-GUI.calculateRealPosition(lllllllllllllllIlIIlIlIIIIlIllIl)[llllllllIlIl[0]]), lllllllllllllllIlIIlIlIIIIIllIIl);
            GL11.glVertex2d((double)Wrapper.getMinecraft().field_71443_c, lllllllllllllllIlIIlIlIIIIIllIIl);
            GL11.glEnd();
         }

         GL11.glDisable(llllllllIlIl[12]);
      }
   }

   public FrameUI() {
      lllllllllllllllIlIIlIlIIIlIIIIlI.cFontRenderer = new CFontRenderer(new Font(llllllllIIll[llllllllIlIl[0]], llllllllIlIl[0], llllllllIlIl[1]), (boolean)llllllllIlIl[2], (boolean)llllllllIlIl[0]);
      lllllllllllllllIlIIlIlIIIlIIIIlI.frameColour = SnowGUI.primaryColour.setA(llllllllIlIl[3]);
      lllllllllllllllIlIIlIlIIIlIIIIlI.outlineColour = lllllllllllllllIlIIlIlIIIlIIIIlI.frameColour.darker();
      lllllllllllllllIlIIlIlIIIlIIIIlI.yLineComponent = null;
      lllllllllllllllIlIIlIlIIIlIIIIlI.xLineComponent = null;
      lllllllllllllllIlIIlIlIIIlIIIIlI.centerXComponent = null;
      lllllllllllllllIlIIlIlIIIlIIIIlI.centerYComponent = null;
      lllllllllllllllIlIIlIlIIIlIIIIlI.centerX = (boolean)llllllllIlIl[0];
      lllllllllllllllIlIIlIlIIIlIIIIlI.centerY = (boolean)llllllllIlIl[0];
      lllllllllllllllIlIIlIlIIIlIIIIlI.xLineOffset = llllllllIlIl[0];
   }

   private static int lIlIIllIIIIIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }
}
