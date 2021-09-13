package rr.snowhack.snow.gui.rgui.component.use;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import rr.snowhack.snow.gui.rgui.GUI;
import rr.snowhack.snow.gui.rgui.component.AbstractComponent;
import rr.snowhack.snow.gui.rgui.component.listen.KeyListener;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.poof.use.Poof;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;

public class InputField extends AbstractComponent {
   // $FF: synthetic field
   float railT;
   // $FF: synthetic field
   private static final String[] lllllIlIIIlI;
   // $FF: synthetic field
   int scrollX;
   // $FF: synthetic field
   ArrayList<InputField.InputState> redoMap;
   // $FF: synthetic field
   int railChar;
   // $FF: synthetic field
   char echoChar;
   // $FF: synthetic field
   InputField.InputState currentState;
   // $FF: synthetic field
   long lastTypeMS;
   // $FF: synthetic field
   boolean rail;
   // $FF: synthetic field
   KeyListener inputListener;
   // $FF: synthetic field
   int undoT;
   // $FF: synthetic field
   ArrayList<InputField.InputState> undoMap;
   // $FF: synthetic field
   int railDelay;
   // $FF: synthetic field
   boolean shift;
   // $FF: synthetic field
   int railRepeat;
   // $FF: synthetic field
   private static final int[] lllllIlIIllI;
   // $FF: synthetic field
   FontRenderer fontRenderer;
   // $FF: synthetic field
   long startRail;

   public InputField setEchoChar(char lllllllllllllllIlIIlllIllIIIIIII) {
      lllllllllllllllIlIIlllIlIlllllll.echoChar = lllllllllllllllIlIIlllIllIIIIIII;
      return lllllllllllllllIlIIlllIlIlllllll;
   }

   private static boolean lIlIIIllIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIIIllIIllll(String lllllllllllllllIlIIlllIlIlIlIIII, String lllllllllllllllIlIIlllIlIlIIllll) {
      lllllllllllllllIlIIlllIlIlIlIIII = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      double lllllllllllllllIlIIlllIlIlIIlIIl = new StringBuilder();
      byte lllllllllllllllIlIIlllIlIlIIlIII = lllllllllllllllIlIIlllIlIlIIllll.toCharArray();
      int lllllllllllllllIlIIlllIlIlIIllII = lllllIlIIllI[0];
      double lllllllllllllllIlIIlllIlIlIIIllI = lllllllllllllllIlIIlllIlIlIlIIII.toCharArray();
      boolean lllllllllllllllIlIIlllIlIlIIIlIl = lllllllllllllllIlIIlllIlIlIIIllI.length;
      int lllllllllllllllIlIIlllIlIlIIIlII = lllllIlIIllI[0];

      do {
         if (!lIlIIIllIlIlII(lllllllllllllllIlIIlllIlIlIIIlII, lllllllllllllllIlIIlllIlIlIIIlIl)) {
            return String.valueOf(lllllllllllllllIlIIlllIlIlIIlIIl);
         }

         Exception lllllllllllllllIlIIlllIlIlIIIIll = lllllllllllllllIlIIlllIlIlIIIllI[lllllllllllllllIlIIlllIlIlIIIlII];
         lllllllllllllllIlIIlllIlIlIIlIIl.append((char)(lllllllllllllllIlIIlllIlIlIIIIll ^ lllllllllllllllIlIIlllIlIlIIlIII[lllllllllllllllIlIIlllIlIlIIllII % lllllllllllllllIlIIlllIlIlIIlIII.length]));
         "".length();
         ++lllllllllllllllIlIIlllIlIlIIllII;
         ++lllllllllllllllIlIIlllIlIlIIIlII;
         "".length();
      } while(" ".length() >= 0);

      return null;
   }

   private static boolean lIlIIIllIlIIlI(Object var0) {
      return var0 == null;
   }

   private static String lIlIIIllIIlllI(String lllllllllllllllIlIIlllIlIlIllllI, String lllllllllllllllIlIIlllIlIlIlllll) {
      try {
         SecretKeySpec lllllllllllllllIlIIlllIlIllIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlIlIlllll.getBytes(StandardCharsets.UTF_8)), lllllIlIIllI[7]), "DES");
         Cipher lllllllllllllllIlIIlllIlIllIIIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIIlllIlIllIIIlI.init(lllllIlIIllI[4], lllllllllllllllIlIIlllIlIllIIIll);
         return new String(lllllllllllllllIlIIlllIlIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public String getText() {
      return lllllllllllllllIlIIlllIllIIlIIIl.currentState.getText();
   }

   private static boolean lIlIIIllIlIllI(int var0, int var1) {
      return var0 > var1;
   }

   public boolean setText(String lllllllllllllllIlIIlllIllIIIIlll) {
      lllllllllllllllIlIIlllIllIIIlIlI.currentState.text = lllllllllllllllIlIIlllIllIIIIlll;
      lllllllllllllllIlIIlllIllIIIlIlI.callPoof(InputField.InputFieldTextPoof.class, (PoofInfo)null);
      if (lIlIIIllIlIllI(lllllllllllllllIlIIlllIllIIIlIlI.currentState.cursorRow, lllllllllllllllIlIIlllIllIIIlIlI.currentState.text.length())) {
         lllllllllllllllIlIIlllIllIIIlIlI.currentState.cursorRow = lllllllllllllllIlIIlllIllIIIlIlI.currentState.text.length();
         lllllllllllllllIlIIlllIllIIIlIlI.scroll();
         return (boolean)lllllIlIIllI[3];
      } else {
         return (boolean)lllllIlIIllI[0];
      }
   }

   private static boolean lIlIIIllIllIII(int var0) {
      return var0 != 0;
   }

   public int getCursorRow() {
      return lllllllllllllllIlIIlllIllIIlIlll.currentState.getCursorRow();
   }

   private static void lIlIIIllIlIIII() {
      lllllIlIIIlI = new String[lllllIlIIllI[10]];
      lllllIlIIIlI[lllllIlIIllI[0]] = lIlIIIllIIlIIl("kvMl5Hx9G9s=", "UjPGw");
      lllllIlIIIlI[lllllIlIIllI[3]] = lIlIIIllIIlIIl("gB4dyBPt01k=", "XyZLO");
      lllllIlIIIlI[lllllIlIIllI[4]] = lIlIIIllIIlllI("qJhQrzuXpcs=", "LxcLU");
      lllllIlIIIlI[lllllIlIIllI[5]] = lIlIIIllIIllll("", "pHCbJ");
      lllllIlIIIlI[lllllIlIIllI[6]] = lIlIIIllIIlllI("otkkCFU5YTI=", "uYgRy");
      lllllIlIIIlI[lllllIlIIllI[8]] = lIlIIIllIIlIIl("iM5FRMpAEX8=", "eBxXT");
      lllllIlIIIlI[lllllIlIIllI[9]] = lIlIIIllIIllll("", "ixWea");
   }

   public InputField(int lllllllllllllllIlIIlllIlllIIIlIl) {
      this(lllllIlIIIlI[lllllIlIIllI[4]]);
   }

   private void pushUndo() {
      lllllllllllllllIlIIlllIllIIlIlII.undoT += lllllIlIIllI[3];
      if (lIlIIIllIlIllI(lllllllllllllllIlIIlllIllIIlIlII.undoT, lllllIlIIllI[5])) {
         lllllllllllllllIlIIlllIllIIlIlII.undoT = lllllIlIIllI[0];
         lllllllllllllllIlIIlllIllIIlIlII.undoMap.add(lllllIlIIllI[0], lllllllllllllllIlIIlllIllIIlIlII.currentState.clone());
      }

   }

   private static String lIlIIIllIIlIIl(String lllllllllllllllIlIIlllIlIllIlIll, String lllllllllllllllIlIIlllIlIllIllII) {
      try {
         SecretKeySpec lllllllllllllllIlIIlllIlIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlllIlIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIlllIlIllIllll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlllIlIllIllll.init(lllllIlIIllI[4], lllllllllllllllIlIIlllIlIlllIIII);
         return new String(lllllllllllllllIlIIlllIlIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlllIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIllIlIlll(int var0) {
      return var0 < 0;
   }

   public char getEchoChar() {
      return lllllllllllllllIlIIlllIllIIIIlIl.echoChar;
   }

   public InputField.InputState getCurrentState() {
      return lllllllllllllllIlIIlllIlllIIIIlI.currentState;
   }

   public boolean isEchoCharSet() {
      int var10000;
      if (lIlIIIllIllIII(lllllllllllllllIlIIlllIlIllllIll.echoChar)) {
         var10000 = lllllIlIIllI[3];
         "".length();
         if (null != null) {
            return (boolean)(" ".length() << ("   ".length() << " ".length()) & ~(" ".length() << ("   ".length() << " ".length())));
         }
      } else {
         var10000 = lllllIlIIllI[0];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIIIllIlIIll(int var0) {
      return var0 == 0;
   }

   public void type(String lllllllllllllllIlIIlllIllIlllIll) {
      label14: {
         try {
            lllllllllllllllIlIIlllIllIllllII.setText(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlllIllIllllII.getText().substring(lllllIlIIllI[0], lllllllllllllllIlIIlllIllIllllII.currentState.getCursorRow())).append(lllllllllllllllIlIIlllIllIlllIll).append(lllllllllllllllIlIIlllIllIllllII.getText().substring(lllllllllllllllIlIIlllIllIllllII.currentState.getCursorRow()))));
            "".length();
            InputField.InputState var10000 = lllllllllllllllIlIIlllIllIllllII.currentState;
            var10000.cursorRow += lllllllllllllllIlIIlllIllIlllIll.length();
         } catch (Exception var3) {
            var3.printStackTrace();
            break label14;
         }

         "".length();
         if (null != null) {
            return;
         }
      }

      lllllllllllllllIlIIlllIllIllllII.scroll();
   }

   public void setFontRenderer(FontRenderer lllllllllllllllIlIIlllIlllIlIIll) {
      lllllllllllllllIlIIlllIlllIlIIlI.fontRenderer = lllllllllllllllIlIIlllIlllIlIIll;
   }

   static {
      lIlIIIllIlIIIl();
      lIlIIIllIlIIII();
   }

   private static boolean lIlIIIllIlIlIl(int var0, int var1) {
      return var0 >= var1;
   }

   public String getDisplayText() {
      String var10000;
      if (lIlIIIllIllIII(lllllllllllllllIlIIlllIllIIIlllI.isEchoCharSet())) {
         var10000 = lllllllllllllllIlIIlllIllIIIlllI.getText().replaceAll(lllllIlIIIlI[lllllIlIIllI[8]], String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlllIllIIIlllI.getEchoChar()).append(lllllIlIIIlI[lllllIlIIllI[9]])));
         "".length();
         if (-" ".length() > "   ".length()) {
            return null;
         }
      } else {
         var10000 = lllllllllllllllIlIIlllIllIIIlllI.getText();
      }

      return var10000;
   }

   public void remove(int lllllllllllllllIlIIlllIllIllIIII) {
      lllllllllllllllIlIIlllIllIllIIII = Math.min(lllllllllllllllIlIIlllIllIllIIII, lllllllllllllllIlIIlllIllIllIIIl.currentState.getCursorRow());
      float lllllllllllllllIlIIlllIllIlIllll = lllllllllllllllIlIIlllIllIllIIIl.setText(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlllIllIllIIIl.getText().substring(lllllIlIIllI[0], Math.max(lllllllllllllllIlIIlllIllIllIIIl.currentState.getCursorRow() - lllllllllllllllIlIIlllIllIllIIII, lllllIlIIllI[0]))).append(lllllllllllllllIlIIlllIllIllIIIl.getText().substring(lllllllllllllllIlIIlllIllIllIIIl.currentState.getCursorRow()))));
      if (lIlIIIllIlIIll(lllllllllllllllIlIIlllIllIlIllll)) {
         InputField.InputState var10000 = lllllllllllllllIlIIlllIllIllIIIl.currentState;
         var10000.cursorRow -= lllllllllllllllIlIIlllIllIllIIII;
      }

      lllllllllllllllIlIIlllIllIllIIIl.scroll();
   }

   public InputField(String lllllllllllllllIlIIlllIlllIIlIll) {
      lllllllllllllllIlIIlllIlllIIlllI.echoChar = (char)lllllIlIIllI[0];
      lllllllllllllllIlIIlllIlllIIlllI.currentState = new InputField.InputState(lllllIlIIIlI[lllllIlIIllI[0]], lllllIlIIllI[0], (boolean)lllllIlIIllI[0], lllllIlIIllI[0], lllllIlIIllI[0]);
      lllllllllllllllIlIIlllIlllIIlllI.startRail = 0L;
      lllllllllllllllIlIIlllIlllIIlllI.railT = 0.0F;
      lllllllllllllllIlIIlllIlllIIlllI.rail = (boolean)lllllIlIIllI[0];
      lllllllllllllllIlIIlllIlllIIlllI.railChar = lllllIlIIllI[0];
      lllllllllllllllIlIIlllIlllIIlllI.railDelay = lllllIlIIllI[1];
      lllllllllllllllIlIIlllIlllIIlllI.railRepeat = lllllIlIIllI[2];
      lllllllllllllllIlIIlllIlllIIlllI.lastTypeMS = 0L;
      lllllllllllllllIlIIlllIlllIIlllI.undoT = lllllIlIIllI[0];
      lllllllllllllllIlIIlllIlllIIlllI.undoMap = new ArrayList();
      lllllllllllllllIlIIlllIlllIIlllI.redoMap = new ArrayList();
      lllllllllllllllIlIIlllIlllIIlllI.scrollX = lllllIlIIllI[0];
      lllllllllllllllIlIIlllIlllIIlllI.shift = (boolean)lllllIlIIllI[0];
      lllllllllllllllIlIIlllIlllIIlllI.fontRenderer = null;
      lllllllllllllllIlIIlllIlllIIlllI.currentState.text = lllllllllllllllIlIIlllIlllIIlIll;
      lllllllllllllllIlIIlllIlllIIlllI.addRenderListener(new RenderListener() {
         // $FF: synthetic field
         private static final int[] lllIllIlllll;
         // $FF: synthetic field
         private static final String[] lllIllIllllI;

         private static boolean lIIlllIIIllIll(int var0, int var1) {
            return var0 == var1;
         }

         static {
            lIIlllIIIlIlll();
            lIIlllIIIlIIIl();
         }

         private static boolean lIIlllIIIllIIl(int var0) {
            return var0 != 0;
         }

         public void onPreRender() {
         }

         private static void lIIlllIIIlIlll() {
            lllIllIlllll = new int[11];
            lllIllIlllll[0] = (7 ^ 10 ^ " ".length() << (50 ^ 55)) << " ".length() & ((73 + 2 - -14 + 48 ^ (54 ^ 31) << (" ".length() << " ".length())) << " ".length() ^ -" ".length());
            lllIllIlllll[1] = " ".length();
            lllIllIlllll[2] = 3002 + 2059 - 4777 + 2805;
            lllIllIlllll[3] = " ".length() << " ".length();
            lllIllIlllll[4] = 93 ^ 50 ^ (104 ^ 101) << "   ".length();
            lllIllIlllll[5] = (39 + 178 - -293 + 3 << " ".length()) + (85 + 44 - 102 + 108 << " ".length()) - (182 + 246 - 353 + 222 << " ".length()) + 198 + 531 - 479 + 569 << " ".length();
            lllIllIlllll[6] = -" ".length();
            lllIllIlllll[7] = 2491 + 1697 - 2333 + 1698;
            lllIllIlllll[8] = ((146 ^ 177) << " ".length()) + (71 ^ 46) - (120 ^ 81) + 98 + 159 - 119 + 113 << " ".length();
            lllIllIlllll[9] = ((225 ^ 144) << (" ".length() << " ".length())) + 81 + 230 - 194 + 180 - -(35 ^ 48) + "   ".length();
            lllIllIlllll[10] = " ".length() << "   ".length();
         }

         private static String lIIlllIIIIllIl(String lllllllllllllllIlIllIlIlIIIlllIl, String lllllllllllllllIlIllIlIlIIIllllI) {
            try {
               byte lllllllllllllllIlIllIlIlIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIIIllllI.getBytes(StandardCharsets.UTF_8)), lllIllIlllll[10]), "DES");
               Exception lllllllllllllllIlIllIlIlIIIlIlll = Cipher.getInstance("DES");
               lllllllllllllllIlIllIlIlIIIlIlll.init(lllIllIlllll[3], lllllllllllllllIlIllIlIlIIIllIIl);
               return new String(lllllllllllllllIlIllIlIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static boolean lIIlllIIIllIII(int var0) {
            return var0 == 0;
         }

         private static boolean lIIlllIIIllIlI(int var0, int var1) {
            return var0 < var1;
         }

         private static String lIIlllIIIIIllI(String lllllllllllllllIlIllIlIlIIllIllI, String lllllllllllllllIlIllIlIlIIllIlIl) {
            try {
               SecretKeySpec lllllllllllllllIlIllIlIlIIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIlIlIIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
               Exception lllllllllllllllIlIllIlIlIIlIlllI = Cipher.getInstance("Blowfish");
               lllllllllllllllIlIllIlIlIIlIlllI.init(lllIllIlllll[3], lllllllllllllllIlIllIlIlIIlllIIl);
               return new String(lllllllllllllllIlIllIlIlIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIlIlIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static void lIIlllIIIlIIIl() {
            lllIllIllllI = new String[lllIllIlllll[3]];
            lllIllIllllI[lllIllIlllll[0]] = lIIlllIIIIIllI("TReBfrUhtZk=", "SmfVf");
            lllIllIllllI[lllIllIlllll[1]] = lIIlllIIIIllIl("V+HR0YGFeIs=", "IuAfQ");
         }

         public void onPostRender() {
            if (lIIlllIIIllIII(lllllllllllllllIlIIlllIlllIIlllI.isFocussed())) {
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)lllIllIlllll[0];
            }

            int lllllllllllllllIlIllIlIlIlIIlIIl = GUI.calculateRealPosition(lllllllllllllllIlIIlllIlllIIlllI);
            long lllllllllllllllIlIllIlIlIlIIlIII = DisplayGuiScreen.getScale();
            GL11.glScissor(lllllllllllllllIlIllIlIlIlIIlIIl[lllIllIlllll[0]] * lllllllllllllllIlIllIlIlIlIIlIII - lllllllllllllllIlIIlllIlllIIlllI.getParent().getOriginOffsetX() - lllIllIlllll[1], Display.getHeight() - lllllllllllllllIlIIlllIlllIIlllI.getHeight() * lllllllllllllllIlIllIlIlIlIIlIII - lllllllllllllllIlIllIlIlIlIIlIIl[lllIllIlllll[1]] * lllllllllllllllIlIllIlIlIlIIlIII - lllIllIlllll[1], lllllllllllllllIlIIlllIlllIIlllI.getWidth() * lllllllllllllllIlIllIlIlIlIIlIII + lllllllllllllllIlIIlllIlllIIlllI.getParent().getOriginOffsetX() + lllIllIlllll[1], lllllllllllllllIlIIlllIlllIIlllI.getHeight() * lllllllllllllllIlIllIlIlIlIIlIII + lllIllIlllll[1]);
            GL11.glEnable(lllIllIlllll[2]);
            GL11.glTranslatef((float)(-lllllllllllllllIlIIlllIlllIIlllI.scrollX), 0.0F, 0.0F);
            byte lllllllllllllllIlIllIlIlIlIIIlll = lllllllllllllllIlIIlllIlllIIlllI.getFontRenderer();
            GL11.glLineWidth(1.0F);
            GL11.glColor3f(1.0F, 1.0F, 1.0F);
            int var10000;
            if (lIIlllIIIllIII((int)((System.currentTimeMillis() - lllllllllllllllIlIIlllIlllIIlllI.lastTypeMS) / 500L) % lllIllIlllll[3]) && lIIlllIIIllIIl(lllllllllllllllIlIIlllIlllIIlllI.isFocussed())) {
               var10000 = lllIllIlllll[1];
               "".length();
               if (" ".length() <= 0) {
                  return;
               }
            } else {
               var10000 = lllIllIlllll[0];
            }

            boolean lllllllllllllllIlIllIlIlIlIIllll = var10000;
            int lllllllllllllllIlIllIlIlIlIIlllI = lllIllIlllll[0];
            int lllllllllllllllIlIllIlIlIlIIllIl = lllIllIlllll[0];
            char lllllllllllllllIlIllIlIlIlIIIIll = lllIllIlllll[0];
            if (lIIlllIIIllIII(lllllllllllllllIlIIlllIlllIIlllI.getCursorRow()) && lIIlllIIIllIIl(lllllllllllllllIlIllIlIlIlIIllll)) {
               GL11.glBegin(lllIllIlllll[1]);
               GL11.glVertex2d(4.0D, 2.0D);
               GL11.glVertex2d(4.0D, (double)(lllllllllllllllIlIllIlIlIlIIIlll.getFontHeight() - lllIllIlllll[1]));
               GL11.glEnd();
            }

            float lllllllllllllllIlIllIlIlIlIIIIlIx = lllllllllllllllIlIIlllIlllIIlllI.getDisplayText().toCharArray();
            float lllllllllllllllIlIllIlIlIlIIIIIl = lllllllllllllllIlIllIlIlIlIIIIlIx.length;
            int lllllllllllllllIlIllIlIlIlIIIIII = lllIllIlllll[0];

            do {
               if (!lIIlllIIIllIlI(lllllllllllllllIlIllIlIlIlIIIIII, lllllllllllllllIlIllIlIlIlIIIIIl)) {
                  float lllllllllllllllIlIllIlIlIlIIIIlI = lllllllllllllllIlIIlllIlllIIlllI.getDisplayText();
                  if (lIIlllIIIllIIl(lllllllllllllllIlIllIlIlIlIIIIlI.isEmpty())) {
                     lllllllllllllllIlIllIlIlIlIIIIlI = lllIllIllllI[lllIllIlllll[1]];
                  }

                  GL11.glEnable(lllIllIlllll[5]);
                  lllllllllllllllIlIllIlIlIlIIIlll.drawString(lllIllIlllll[0], lllIllIlllll[6], lllllllllllllllIlIllIlIlIlIIIIlI);
                  GL11.glDisable(lllIllIlllll[7]);
                  GL11.glBlendFunc(lllIllIlllll[8], lllIllIlllll[9]);
                  GL11.glTranslatef((float)lllllllllllllllIlIIlllIlllIIlllI.scrollX, 0.0F, 0.0F);
                  GL11.glDisable(lllIllIlllll[2]);
                  return;
               }

               String lllllllllllllllIlIllIlIlIIllllll = lllllllllllllllIlIllIlIlIlIIIIlIx[lllllllllllllllIlIllIlIlIlIIIIII];
               Exception lllllllllllllllIlIllIlIlIIlllllI = lllllllllllllllIlIllIlIlIlIIIlll.getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIllIlIlIIllllll).append(lllIllIllllI[lllIllIlllll[0]])));
               if (lIIlllIIIllIIl(lllllllllllllllIlIIlllIlllIIlllI.getCurrentState().isSelection()) && lIIlllIIIllIll(lllllllllllllllIlIllIlIlIlIIllIl, lllllllllllllllIlIIlllIlllIIlllI.getCurrentState().getSelectionStart())) {
                  lllllllllllllllIlIllIlIlIlIIIIll = lllIllIlllll[1];
               }

               if (lIIlllIIIllIIl(lllllllllllllllIlIllIlIlIlIIIIll)) {
                  GL11.glColor4f(0.2F, 0.6F, 1.0F, 0.3F);
                  GL11.glBegin(lllIllIlllll[4]);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIlIlIlIIlllI + lllIllIlllll[3]), 2.0D);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIlIlIlIIlllI + lllIllIlllll[3]), (double)(lllllllllllllllIlIllIlIlIlIIIlll.getFontHeight() - lllIllIlllll[3]));
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIlIlIlIIlllI + lllllllllllllllIlIllIlIlIIlllllI + lllIllIlllll[3]), (double)(lllllllllllllllIlIllIlIlIlIIIlll.getFontHeight() - lllIllIlllll[3]));
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIlIlIlIIlllI + lllllllllllllllIlIllIlIlIIlllllI + lllIllIlllll[3]), 2.0D);
                  GL11.glEnd();
               }

               ++lllllllllllllllIlIllIlIlIlIIllIl;
               lllllllllllllllIlIllIlIlIlIIlllI += lllllllllllllllIlIllIlIlIIlllllI;
               if (lIIlllIIIllIll(lllllllllllllllIlIllIlIlIlIIllIl, lllllllllllllllIlIIlllIlllIIlllI.getCursorRow()) && lIIlllIIIllIIl(lllllllllllllllIlIllIlIlIlIIllll) && lIIlllIIIllIII(lllllllllllllllIlIIlllIlllIIlllI.getCurrentState().isSelection())) {
                  GL11.glBegin(lllIllIlllll[1]);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIlIlIlIIlllI + lllIllIlllll[3]), 2.0D);
                  GL11.glVertex2d((double)(lllllllllllllllIlIllIlIlIlIIlllI + lllIllIlllll[3]), (double)lllllllllllllllIlIllIlIlIlIIIlll.getFontHeight());
                  GL11.glEnd();
               }

               if (lIIlllIIIllIIl(lllllllllllllllIlIIlllIlllIIlllI.getCurrentState().isSelection()) && lIIlllIIIllIll(lllllllllllllllIlIllIlIlIlIIllIl, lllllllllllllllIlIIlllIlllIIlllI.getCurrentState().getSelectionEnd())) {
                  lllllllllllllllIlIllIlIlIlIIIIll = lllIllIlllll[0];
               }

               ++lllllllllllllllIlIllIlIlIlIIIIII;
               "".length();
            } while(((124 ^ 51) & ~(235 ^ 164)) == ((116 ^ 81) & ~(53 ^ 16)));

         }
      });
      lllllllllllllllIlIIlllIlllIIlllI.addKeyListener(lllllllllllllllIlIIlllIlllIIlllI.inputListener = new KeyListener() {
         // $FF: synthetic field
         private static final int[] llllllllIlII;
         // $FF: synthetic field
         private static final String[] llllllllIIlI;

         private static boolean lIlIIllIIIIlII(int var0, int var1) {
            return var0 == var1;
         }

         public void onKeyDown(KeyListener.KeyEvent lllllllllllllllIlIIlIIlllllIlllI) {
            lllllllllllllllIlIIlllIlllIIlllI.lastTypeMS = System.currentTimeMillis();
            if (lIlIIllIIIIlII(lllllllllllllllIlIIlIIlllllIlllI.getKey(), llllllllIlII[0])) {
               if (lIlIIllIIIIlIl(lllllllllllllllIlIIlllIlllIIlllI.getText().length())) {
                  lllllllllllllllIlIIlllIlllIIlllI.pushUndo();
                  if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                     lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd;
                     lllllllllllllllIlIIlllIlllIIlllI.scroll();
                     lllllllllllllllIlIIlllIlllIIlllI.remove(lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd - lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart);
                     lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[1];
                     "".length();
                     if ("   ".length() >= " ".length() << (" ".length() << " ".length())) {
                        return;
                     }
                  } else {
                     lllllllllllllllIlIIlllIlllIIlllI.remove(llllllllIlII[2]);
                     "".length();
                     if (null != null) {
                        return;
                     }
                  }
               }
            } else if (lIlIIllIIIIlII(Keyboard.getEventCharacter(), llllllllIlII[3])) {
               if (lIlIIllIIIIlll(lllllllllllllllIlIIlllIlllIIlllI.undoMap.isEmpty())) {
                  lllllllllllllllIlIIlllIlllIIlllI.redoMap.add(llllllllIlII[1], lllllllllllllllIlIIlllIlllIIlllI.currentState.clone());
                  lllllllllllllllIlIIlllIlllIIlllI.currentState = (InputField.InputState)lllllllllllllllIlIIlllIlllIIlllI.undoMap.get(llllllllIlII[1]);
                  lllllllllllllllIlIIlllIlllIIlllI.undoMap.remove(llllllllIlII[1]);
                  "".length();
                  "".length();
                  if (null != null) {
                     return;
                  }
               }
            } else if (lIlIIllIIIIlII(Keyboard.getEventCharacter(), llllllllIlII[4])) {
               if (lIlIIllIIIIlll(lllllllllllllllIlIIlllIlllIIlllI.redoMap.isEmpty())) {
                  lllllllllllllllIlIIlllIlllIIlllI.undoMap.add(llllllllIlII[1], lllllllllllllllIlIIlllIlllIIlllI.currentState.clone());
                  lllllllllllllllIlIIlllIlllIIlllI.currentState = (InputField.InputState)lllllllllllllllIlIIlllIlllIIlllI.redoMap.get(llllllllIlII[1]);
                  lllllllllllllllIlIIlllIlllIIlllI.redoMap.remove(llllllllIlII[1]);
                  "".length();
                  "".length();
                  if ((((14 ^ 77) << " ".length() ^ 41 + 73 - 53 + 78) << (" ".length() << " ".length()) & ((30 ^ 15 ^ (61 ^ 58) << (" ".length() << " ".length())) << (" ".length() << " ".length()) ^ -" ".length())) < 0) {
                     return;
                  }
               }
            } else if (lIlIIllIIIIlII(Keyboard.getEventCharacter(), llllllllIlII[2])) {
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[2];
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart = llllllllIlII[1];
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = lllllllllllllllIlIIlllIlllIIlllI.currentState.getText().length();
               "".length();
               if (-"   ".length() >= 0) {
                  return;
               }
            } else if (lIlIIllIIIIlII(lllllllllllllllIlIIlIIlllllIlllI.getKey(), llllllllIlII[5])) {
               lllllllllllllllIlIIlllIlllIIlllI.shift = (boolean)llllllllIlII[2];
               "".length();
               if ((((140 ^ 133) << " ".length() ^ 185 ^ 140) & (156 ^ 153 ^ (19 ^ 2) << " ".length() ^ -" ".length())) != ((57 + 144 - 122 + 72 ^ (179 ^ 148) << (" ".length() << " ".length())) & (138 + 49 - 72 + 30 ^ (31 ^ 82) << " ".length() ^ -" ".length()))) {
                  return;
               }
            } else if (lIlIIllIIIIlII(lllllllllllllllIlIIlIIlllllIlllI.getKey(), llllllllIlII[2])) {
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[1];
               "".length();
               if (" ".length() << " ".length() == 0) {
                  return;
               }
            } else {
               Clipboard lllllllllllllllIlIIlIIlllllllIII;
               if (lIlIIllIIIIlII(Keyboard.getEventCharacter(), llllllllIlII[6])) {
                  lllllllllllllllIlIIlIIlllllllIII = Toolkit.getDefaultToolkit().getSystemClipboard();

                  label124: {
                     try {
                        lllllllllllllllIlIIlllIlllIIlllI.type((String)lllllllllllllllIlIIlIIlllllllIII.getData(DataFlavor.stringFlavor));
                     } catch (UnsupportedFlavorException var4) {
                        "".length();
                        if ("   ".length() >= " ".length() << " ".length()) {
                           break label124;
                        }

                        return;
                     } catch (IOException var5) {
                        break label124;
                     }

                     "".length();
                     if ("   ".length() == 0) {
                        return;
                     }
                  }

                  "".length();
                  if (-"  ".length() > 0) {
                     return;
                  }
               } else if (lIlIIllIIIIlII(Keyboard.getEventCharacter(), llllllllIlII[7])) {
                  if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                     lllllllllllllllIlIIlIIlllllllIII = Toolkit.getDefaultToolkit().getSystemClipboard();
                     StringSelection lllllllllllllllIlIIlIIllllllIllI = new StringSelection(lllllllllllllllIlIIlllIlllIIlllI.currentState.getText().substring(lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart, lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd));
                     lllllllllllllllIlIIlIIlllllllIII.setContents(lllllllllllllllIlIIlIIllllllIllI, lllllllllllllllIlIIlIIllllllIllI);
                     "".length();
                     if (null != null) {
                        return;
                     }
                  }
               } else if (lIlIIllIIIIlII(lllllllllllllllIlIIlIIlllllIlllI.getKey(), llllllllIlII[8])) {
                  if (lIlIIllIIIlIIl(lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow, lllllllllllllllIlIIlllIlllIIlllI.getText().length())) {
                     if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.shift)) {
                        if (lIlIIllIIIIlll(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                           lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart = lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow;
                           lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow;
                        }

                        lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[2];
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = Math.min(lllllllllllllllIlIIlllIlllIIlllI.getText().length(), lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd + llllllllIlII[2]);
                        "".length();
                        if (-(25 ^ 34 ^ (106 ^ 117) << " ".length()) >= 0) {
                           return;
                        }
                     } else if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[1];
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd;
                        lllllllllllllllIlIIlllIlllIIlllI.scroll();
                        "".length();
                        if (((19 ^ 88 ^ (169 ^ 158) << " ".length()) << " ".length() & (((17 ^ 0) << (" ".length() << " ".length()) ^ 93 ^ 60) << " ".length() ^ -" ".length())) != 0) {
                           return;
                        }
                     } else {
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = Math.min(lllllllllllllllIlIIlllIlllIIlllI.getText().length(), lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow + llllllllIlII[2]);
                        lllllllllllllllIlIIlllIlllIIlllI.scroll();
                        "".length();
                        if (-" ".length() > (" ".length() << " ".length() & ~(" ".length() << " ".length()))) {
                           return;
                        }
                     }
                  }
               } else if (lIlIIllIIIIlII(lllllllllllllllIlIIlIIlllllIlllI.getKey(), llllllllIlII[9])) {
                  if (lIlIIllIIIIlIl(lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow)) {
                     if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.shift)) {
                        if (lIlIIllIIIIlll(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                           lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart = lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow;
                           lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow;
                        }

                        lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[2];
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart = Math.max(llllllllIlII[1], lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart - llllllllIlII[2]);
                        "".length();
                        if (" ".length() < " ".length()) {
                           return;
                        }
                     } else if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[1];
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart;
                        lllllllllllllllIlIIlllIlllIIlllI.scroll();
                        "".length();
                        if (null != null) {
                           return;
                        }
                     } else {
                        lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = Math.max(llllllllIlII[1], lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow - llllllllIlII[2]);
                        lllllllllllllllIlIIlllIlllIIlllI.scroll();
                        "".length();
                        if ((" ".length() << (" ".length() << " ".length()) & (" ".length() << (" ".length() << " ".length()) ^ -" ".length())) != 0) {
                           return;
                        }
                     }
                  }
               } else if (lIlIIllIIIIllI(Keyboard.getEventCharacter())) {
                  lllllllllllllllIlIIlllIlllIIlllI.pushUndo();
                  if (lIlIIllIIIIllI(lllllllllllllllIlIIlllIlllIIlllI.currentState.selection)) {
                     lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd;
                     lllllllllllllllIlIIlllIlllIIlllI.remove(lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd - lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart);
                     lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)llllllllIlII[1];
                  }

                  lllllllllllllllIlIIlllIlllIIlllI.type(String.valueOf((new StringBuilder()).append(Keyboard.getEventCharacter()).append(llllllllIIlI[llllllllIlII[1]])));
               }
            }

            if (!lIlIIllIIIIlII(lllllllllllllllIlIIlIIlllllIlllI.getKey(), llllllllIlII[10])) {
               lllllllllllllllIlIIlllIlllIIlllI.startRail = System.currentTimeMillis();
               lllllllllllllllIlIIlllIlllIIlllI.railChar = lllllllllllllllIlIIlIIlllllIlllI.getKey();
            }
         }

         private static boolean lIlIIllIIIIlIl(int var0) {
            return var0 > 0;
         }

         private static boolean lIlIIllIIIIlll(int var0) {
            return var0 == 0;
         }

         static {
            lIlIIllIIIIIII();
            lIlIIlIlllllII();
         }

         private static void lIlIIlIlllllII() {
            llllllllIIlI = new String[llllllllIlII[2]];
            llllllllIIlI[llllllllIlII[1]] = lIlIIlIllllIll("yPx3nMwCZyg=", "VGivC");
         }

         private static void lIlIIllIIIIIII() {
            llllllllIlII = new int[13];
            llllllllIlII[0] = (108 ^ 17 ^ (178 ^ 143) << " ".length()) << " ".length();
            llllllllIlII[1] = (164 + 139 - 284 + 146 ^ (56 ^ 97) << " ".length()) << (" ".length() << " ".length()) & (((138 ^ 133) << (" ".length() << " ".length()) ^ 149 ^ 190) << (" ".length() << " ".length()) ^ -" ".length());
            llllllllIlII[2] = " ".length();
            llllllllIlII[3] = ((140 ^ 139) << (" ".length() << (" ".length() << " ".length())) ^ 195 ^ 190) << " ".length();
            llllllllIlII[4] = 154 + 69 - 150 + 82 ^ (74 ^ 11) << " ".length();
            llllllllIlII[5] = (16 + 91 - 19 + 83 ^ (154 ^ 145) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
            llllllllIlII[6] = (64 ^ 95 ^ (46 ^ 43) << (" ".length() << " ".length())) << " ".length();
            llllllllIlII[7] = "   ".length();
            llllllllIlII[8] = 6 + 10 - -10 + 147 + ((145 ^ 190) << (" ".length() << " ".length())) - (35 + 62 - 12 + 68 << " ".length()) + ((228 ^ 175) << " ".length());
            llllllllIlII[9] = 2 + 130 - 128 + 133 + (185 ^ 178) - ((171 ^ 190) << " ".length()) + (56 ^ 89);
            llllllllIlII[10] = (52 ^ 29 ^ (39 ^ 40) << (" ".length() << " ".length())) << " ".length();
            llllllllIlII[11] = " ".length() << "   ".length();
            llllllllIlII[12] = " ".length() << " ".length();
         }

         public void onKeyUp(KeyListener.KeyEvent lllllllllllllllIlIIlIIllllIlllIl) {
            lllllllllllllllIlIIlllIlllIIlllI.rail = (boolean)llllllllIlII[1];
            lllllllllllllllIlIIlllIlllIIlllI.startRail = 0L;
            if (lIlIIllIIIIlII(lllllllllllllllIlIIlIIllllIlllIl.getKey(), llllllllIlII[5])) {
               lllllllllllllllIlIIlllIlllIIlllI.shift = (boolean)llllllllIlII[1];
            }

         }

         private static String lIlIIlIllllIll(String lllllllllllllllIlIIlIIllllIIlIIl, String lllllllllllllllIlIIlIIllllIIIlII) {
            try {
               SecretKeySpec lllllllllllllllIlIIlIIllllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIllllIIIlII.getBytes(StandardCharsets.UTF_8)), llllllllIlII[11]), "DES");
               Cipher lllllllllllllllIlIIlIIllllIIllIl = Cipher.getInstance("DES");
               lllllllllllllllIlIIlIIllllIIllIl.init(llllllllIlII[12], lllllllllllllllIlIIlIIllllIIllll);
               return new String(lllllllllllllllIlIIlIIllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIllllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }

         private static boolean lIlIIllIIIlIIl(int var0, int var1) {
            return var0 < var1;
         }

         private static boolean lIlIIllIIIIllI(int var0) {
            return var0 != 0;
         }
      });
      lllllllllllllllIlIIlllIlllIIlllI.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final String[] lIIIIlIIIIIll;
         // $FF: synthetic field
         private static final int[] lIIIIlIIIIllI;

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIlIlIllllIl) {
         }

         private static String lIlIlIlIIllIIl(String lllllllllllllllIlIIIIIlIlIIlIIlI, String lllllllllllllllIlIIIIIlIlIIlIIIl) {
            lllllllllllllllIlIIIIIlIlIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            StringBuilder lllllllllllllllIlIIIIIlIlIIlIlIl = new StringBuilder();
            float lllllllllllllllIlIIIIIlIlIIIllll = lllllllllllllllIlIIIIIlIlIIlIIIl.toCharArray();
            int lllllllllllllllIlIIIIIlIlIIlIIll = lIIIIlIIIIllI[0];
            byte lllllllllllllllIlIIIIIlIlIIIllIl = lllllllllllllllIlIIIIIlIlIIlIIlI.toCharArray();
            float lllllllllllllllIlIIIIIlIlIIIllII = lllllllllllllllIlIIIIIlIlIIIllIl.length;
            int lllllllllllllllIlIIIIIlIlIIIlIll = lIIIIlIIIIllI[0];

            do {
               if (!lIlIlIlIlIIlIl(lllllllllllllllIlIIIIIlIlIIIlIll, lllllllllllllllIlIIIIIlIlIIIllII)) {
                  return String.valueOf(lllllllllllllllIlIIIIIlIlIIlIlIl);
               }

               long lllllllllllllllIlIIIIIlIlIIIlIlI = lllllllllllllllIlIIIIIlIlIIIllIl[lllllllllllllllIlIIIIIlIlIIIlIll];
               lllllllllllllllIlIIIIIlIlIIlIlIl.append((char)(lllllllllllllllIlIIIIIlIlIIIlIlI ^ lllllllllllllllIlIIIIIlIlIIIllll[lllllllllllllllIlIIIIIlIlIIlIIll % lllllllllllllllIlIIIIIlIlIIIllll.length]));
               "".length();
               ++lllllllllllllllIlIIIIIlIlIIlIIll;
               ++lllllllllllllllIlIIIIIlIlIIIlIll;
               "".length();
            } while(" ".length() << (" ".length() << " ".length()) != 0);

            return null;
         }

         private static boolean lIlIlIlIlIIlll(int var0, int var1) {
            return var0 == var1;
         }

         private static void lIlIlIlIlIIlII() {
            lIIIIlIIIIllI = new int[3];
            lIIIIlIIIIllI[0] = ((101 ^ 98) << "   ".length() ^ 156 ^ 189) << " ".length() & (((150 ^ 193) << " ".length() ^ 3 + 55 - -56 + 69) << " ".length() ^ -" ".length());
            lIIIIlIIIIllI[1] = " ".length();
            lIIIIlIIIIllI[2] = " ".length() << " ".length();
         }

         private static void lIlIlIlIlIIIll() {
            lIIIIlIIIIIll = new String[lIIIIlIIIIllI[2]];
            lIIIIlIIIIIll[lIIIIlIIIIllI[0]] = lIlIlIlIIllIIl("", "bDyzO");
            lIIIIlIIIIIll[lIIIIlIIIIllI[1]] = lIlIlIlIIllIlI("X3qeSn5E5aI=", "zZYSG");
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIlIllIIlIIl) {
            lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)lIIIIlIIIIllI[0];
            int lllllllllllllllIlIIIIIlIllIIlIII = -lllllllllllllllIlIIlllIlllIIlllI.scrollX;
            int lllllllllllllllIlIIIIIlIllIIIIll = lIIIIlIIIIllI[0];
            byte lllllllllllllllIlIIIIIlIllIIIIlI = lllllllllllllllIlIIlllIlllIIlllI.getText().toCharArray();
            Exception lllllllllllllllIlIIIIIlIllIIIIIl = lllllllllllllllIlIIIIIlIllIIIIlI.length;
            int lllllllllllllllIlIIIIIlIllIIIIII = lIIIIlIIIIllI[0];

            do {
               if (!lIlIlIlIlIIlIl(lllllllllllllllIlIIIIIlIllIIIIII, lllllllllllllllIlIIIIIlIllIIIIIl)) {
                  lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIIIIlIllIIIIll;
                  lllllllllllllllIlIIlllIlllIIlllI.scroll();
                  return;
               }

               Exception lllllllllllllllIlIIIIIlIlIllllll = lllllllllllllllIlIIIIIlIllIIIIlI[lllllllllllllllIlIIIIIlIllIIIIII];
               lllllllllllllllIlIIIIIlIllIIlIII += lllllllllllllllIlIIlllIlllIIlllI.getFontRenderer().getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIIIlIlIllllll).append(lIIIIlIIIIIll[lIIIIlIIIIllI[0]])));
               if (lIlIlIlIlIIlIl(lllllllllllllllIlIIIIIlIllIIlIIl.getX(), lllllllllllllllIlIIIIIlIllIIlIII)) {
                  lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIIIIlIllIIIIll;
                  lllllllllllllllIlIIlllIlllIIlllI.scroll();
                  return;
               }

               ++lllllllllllllllIlIIIIIlIllIIIIll;
               ++lllllllllllllllIlIIIIIlIllIIIIII;
               "".length();
            } while(" ".length() >= " ".length());

         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIlIIIIIlIlIlIllII) {
            lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)lIIIIlIIIIllI[1];
            lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart = lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow;
            byte lllllllllllllllIlIIIIIlIlIlIlIll = -lllllllllllllllIlIIlllIlllIIlllI.scrollX;
            int lllllllllllllllIlIIIIIlIlIlIllll = lIIIIlIIIIllI[0];
            float lllllllllllllllIlIIIIIlIlIlIlIIlx = lllllllllllllllIlIIlllIlllIIlllI.getText().toCharArray();
            String lllllllllllllllIlIIIIIlIlIlIlIII = lllllllllllllllIlIIIIIlIlIlIlIIlx.length;
            int lllllllllllllllIlIIIIIlIlIlIIlll = lIIIIlIIIIllI[0];

            while(lIlIlIlIlIIlIl(lllllllllllllllIlIIIIIlIlIlIIlll, lllllllllllllllIlIIIIIlIlIlIlIII)) {
               char lllllllllllllllIlIIIIIlIlIllIlII = lllllllllllllllIlIIIIIlIlIlIlIIlx[lllllllllllllllIlIIIIIlIlIlIIlll];
               lllllllllllllllIlIIIIIlIlIlIlIll += lllllllllllllllIlIIlllIlllIIlllI.getFontRenderer().getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIIIlIlIllIlII).append(lIIIIlIIIIIll[lIIIIlIIIIllI[1]])));
               if (lIlIlIlIlIIlIl(lllllllllllllllIlIIIIIlIlIlIllII.getX(), lllllllllllllllIlIIIIIlIlIlIlIll)) {
                  lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = lllllllllllllllIlIIIIIlIlIlIllll;
                  lllllllllllllllIlIIlllIlllIIlllI.scroll();
                  "".length();
                  if ("   ".length() <= ((151 ^ 180) << " ".length() & ~((60 ^ 31) << " ".length()))) {
                     return;
                  }
                  break;
               }

               ++lllllllllllllllIlIIIIIlIlIlIllll;
               ++lllllllllllllllIlIIIIIlIlIlIIlll;
               "".length();
               if (" ".length() << " ".length() >= "   ".length()) {
                  return;
               }
            }

            lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = lllllllllllllllIlIIIIIlIlIlIllll;
            float lllllllllllllllIlIIIIIlIlIlIlIIl = lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow;
            lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIIIIlIlIlIllll;
            lllllllllllllllIlIIlllIlllIIlllI.scroll();
            lllllllllllllllIlIIlllIlllIIlllI.currentState.cursorRow = lllllllllllllllIlIIIIIlIlIlIlIIl;
            if (lIlIlIlIlIIllI(lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart, lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd)) {
               lllllllllllllllIlIIIIIlIlIlIlIII = lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart;
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart = lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd;
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd = lllllllllllllllIlIIIIIlIlIlIlIII;
            }

            if (lIlIlIlIlIIlll(lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionStart, lllllllllllllllIlIIlllIlllIIlllI.currentState.selectionEnd)) {
               lllllllllllllllIlIIlllIlllIIlllI.currentState.selection = (boolean)lIIIIlIIIIllI[0];
            }

         }

         private static boolean lIlIlIlIlIIllI(int var0, int var1) {
            return var0 > var1;
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIlIIIIIlIlIlIIIlI) {
         }

         private static boolean lIlIlIlIlIIlIl(int var0, int var1) {
            return var0 < var1;
         }

         static {
            lIlIlIlIlIIlII();
            lIlIlIlIlIIIll();
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIlIIIIIlIlIlIIlII) {
         }

         private static String lIlIlIlIIllIlI(String lllllllllllllllIlIIIIIlIlIIIIIlI, String lllllllllllllllIlIIIIIlIlIIIIIIl) {
            try {
               SecretKeySpec lllllllllllllllIlIIIIIlIlIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
               short lllllllllllllllIlIIIIIlIIlllllIl = Cipher.getInstance("Blowfish");
               lllllllllllllllIlIIIIIlIIlllllIl.init(lIIIIlIIIIllI[2], lllllllllllllllIlIIIIIlIlIIIIlIl);
               return new String(lllllllllllllllIlIIIIIlIIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            } catch (Exception var4) {
               var4.printStackTrace();
               return null;
            }
         }
      });
      lllllllllllllllIlIIlllIlllIIlllI.addRenderListener(new RenderListener() {
         // $FF: synthetic field
         private static final int[] lIIIlIIIIIllI;

         private static boolean lIlIlllIIllllI(int var0) {
            return var0 > 0;
         }

         private static int lIlIlllIIlllII(float var0, float var1) {
            float var2;
            return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
         }

         private static int lIlIlllIIllIll(long var0, long var2) {
            long var4;
            return (var4 = var0 - var2) == 0L ? 0 : (var4 < 0L ? -1 : 1);
         }

         public void onPreRender() {
            if (!lIlIlllIIlllIl(lIlIlllIIllIll(lllllllllllllllIlIIlllIlllIIlllI.startRail, 0L))) {
               if (lIlIlllIIlllIl(lllllllllllllllIlIIlllIlllIIlllI.rail)) {
                  lllllllllllllllIlIIlllIlllIIlllI.railT = (float)(System.currentTimeMillis() - lllllllllllllllIlIIlllIlllIIlllI.startRail);
                  if (lIlIlllIIllllI(lIlIlllIIlllII(lllllllllllllllIlIIlllIlllIIlllI.railT, (float)lllllllllllllllIlIIlllIlllIIlllI.railDelay))) {
                     lllllllllllllllIlIIlllIlllIIlllI.rail = (boolean)lIIIlIIIIIllI[0];
                     lllllllllllllllIlIIlllIlllIIlllI.startRail = System.currentTimeMillis();
                     "".length();
                     if (-"   ".length() >= 0) {
                        return;
                     }
                  }
               } else {
                  lllllllllllllllIlIIlllIlllIIlllI.railT = (float)(System.currentTimeMillis() - lllllllllllllllIlIIlllIlllIIlllI.startRail);
                  if (lIlIlllIIllllI(lIlIlllIIlllII(lllllllllllllllIlIIlllIlllIIlllI.railT, (float)lllllllllllllllIlIIlllIlllIIlllI.railRepeat))) {
                     lllllllllllllllIlIIlllIlllIIlllI.inputListener.onKeyDown(new KeyListener.KeyEvent(lllllllllllllllIlIIlllIlllIIlllI.railChar));
                     lllllllllllllllIlIIlllIlllIIlllI.startRail = System.currentTimeMillis();
                  }
               }

            }
         }

         public void onPostRender() {
         }

         private static boolean lIlIlllIIlllIl(int var0) {
            return var0 == 0;
         }

         static {
            lIlIlllIIllIlI();
         }

         private static void lIlIlllIIllIlI() {
            lIIIlIIIIIllI = new int[1];
            lIIIlIIIIIllI[0] = " ".length();
         }
      });
   }

   private static void lIlIIIllIlIIIl() {
      lllllIlIIllI = new int[11];
      lllllIlIIllI[0] = (106 ^ 123) & ~(79 ^ 94);
      lllllIlIIllI[1] = (196 ^ 185) << (" ".length() << " ".length());
      lllllIlIIllI[2] = " ".length() << ((113 ^ 120) << (" ".length() << " ".length()) ^ 28 ^ 61);
      lllllIlIIllI[3] = " ".length();
      lllllIlIIllI[4] = " ".length() << " ".length();
      lllllIlIIllI[5] = "   ".length();
      lllllIlIIllI[6] = " ".length() << (" ".length() << " ".length());
      lllllIlIIllI[7] = " ".length() << "   ".length();
      lllllIlIIllI[8] = 151 ^ 146;
      lllllIlIIllI[9] = "   ".length() << " ".length();
      lllllIlIIllI[10] = (83 ^ 122) << " ".length() ^ 221 ^ 136;
   }

   public FontRenderer getFontRenderer() {
      FontRenderer var10000;
      if (lIlIIIllIlIIlI(lllllllllllllllIlIIlllIlllIllIII.fontRenderer)) {
         var10000 = lllllllllllllllIlIIlllIlllIllIII.getTheme().getFontRenderer();
         "".length();
         if (-(46 ^ 42) >= 0) {
            return null;
         }
      } else {
         var10000 = lllllllllllllllIlIIlllIlllIllIII.fontRenderer;
      }

      return var10000;
   }

   private void scroll() {
      int lllllllllllllllIlIIlllIllIlIIlII = lllllIlIIllI[0];
      int lllllllllllllllIlIIlllIllIlIIIll = lllllIlIIllI[0];
      float lllllllllllllllIlIIlllIllIIlllIl = lllllIlIIIlI[lllllIlIIllI[5]];
      long lllllllllllllllIlIIlllIllIIlllII = lllllllllllllllIlIIlllIllIlIIIII.getText().toCharArray();
      String lllllllllllllllIlIIlllIllIIllIll = lllllllllllllllIlIIlllIllIIlllII.length;
      int lllllllllllllllIlIIlllIllIIllIlI = lllllIlIIllI[0];

      while(lIlIIIllIlIlII(lllllllllllllllIlIIlllIllIIllIlI, lllllllllllllllIlIIlllIllIIllIll)) {
         double lllllllllllllllIlIIlllIllIIllIIl = lllllllllllllllIlIIlllIllIIlllII[lllllllllllllllIlIIlllIllIIllIlI];
         lllllllllllllllIlIIlllIllIlIIlII += lllllllllllllllIlIIlllIllIlIIIII.getFontRenderer().getStringWidth(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlllIllIIllIIl).append(lllllIlIIIlI[lllllIlIIllI[6]])));
         ++lllllllllllllllIlIIlllIllIlIIIll;
         lllllllllllllllIlIIlllIllIIlllIl = String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIlllIllIIlllIl).append(lllllllllllllllIlIIlllIllIIllIIl));
         if (lIlIIIllIlIlIl(lllllllllllllllIlIIlllIllIlIIIll, lllllllllllllllIlIIlllIllIlIIIII.currentState.cursorRow)) {
            "".length();
            if (-" ".length() >= ((20 ^ 1) << (" ".length() << " ".length()) & ~((4 ^ 17) << (" ".length() << " ".length())))) {
               return;
            }
            break;
         }

         ++lllllllllllllllIlIIlllIllIIllIlI;
         "".length();
         if (" ".length() << " ".length() == " ".length()) {
            return;
         }
      }

      long lllllllllllllllIlIIlllIllIIlllII = lllllllllllllllIlIIlllIllIlIIlII - lllllllllllllllIlIIlllIllIlIIIII.scrollX;
      if (lIlIIIllIlIllI(lllllllllllllllIlIIlllIllIIlllII, lllllllllllllllIlIIlllIllIlIIIII.getWidth())) {
         lllllllllllllllIlIIlllIllIlIIIII.scrollX = lllllllllllllllIlIIlllIllIlIIlII - lllllllllllllllIlIIlllIllIlIIIII.getWidth() + lllllIlIIllI[7];
         "".length();
         if ((((5 ^ 90) << " ".length() ^ 153 + 68 - 97 + 41) & ((150 ^ 177) << " ".length() ^ 149 ^ 192 ^ -" ".length())) < 0) {
            return;
         }
      } else if (lIlIIIllIlIlll(lllllllllllllllIlIIlllIllIIlllII)) {
         lllllllllllllllIlIIlllIllIlIIIII.scrollX = lllllllllllllllIlIIlllIllIlIIlII + lllllIlIIllI[7];
      }

      if (lIlIIIllIlIIll(lllllllllllllllIlIIlllIllIlIIIII.currentState.cursorRow)) {
         lllllllllllllllIlIIlllIllIlIIIII.scrollX = lllllIlIIllI[0];
      }

   }

   public InputField() {
      this(lllllIlIIIlI[lllllIlIIllI[3]]);
   }

   public class InputState {
      // $FF: synthetic field
      int cursorRow;
      // $FF: synthetic field
      int selectionStart;
      // $FF: synthetic field
      String text;
      // $FF: synthetic field
      boolean selection;
      // $FF: synthetic field
      int selectionEnd;

      public void setSelectionEnd(int lllllllllllllllIlIIlIlIIIlIllIlI) {
         lllllllllllllllIlIIlIlIIIlIllIll.selectionEnd = lllllllllllllllIlIIlIlIIIlIllIlI;
      }

      public InputState(String lllllllllllllllIlIIlIlIIlIIlIIll, int lllllllllllllllIlIIlIlIIlIIIlIll, boolean lllllllllllllllIlIIlIlIIlIIIlIlI, int lllllllllllllllIlIIlIlIIlIIIlIIl, int lllllllllllllllIlIIlIlIIlIIIlIII) {
         lllllllllllllllIlIIlIlIIlIIlIlIl.text = lllllllllllllllIlIIlIlIIlIIlIIll;
         lllllllllllllllIlIIlIlIIlIIlIlIl.cursorRow = lllllllllllllllIlIIlIlIIlIIIlIll;
         lllllllllllllllIlIIlIlIIlIIlIlIl.selection = lllllllllllllllIlIIlIlIIlIIIlIlI;
         lllllllllllllllIlIIlIlIIlIIlIlIl.selectionStart = lllllllllllllllIlIIlIlIIlIIIlIIl;
         lllllllllllllllIlIIlIlIIlIIlIlIl.selectionEnd = lllllllllllllllIlIIlIlIIlIIIlIII;
      }

      public int getSelectionEnd() {
         return lllllllllllllllIlIIlIlIIIlIllllI.selectionEnd;
      }

      public boolean isSelection() {
         return lllllllllllllllIlIIlIlIIIlllIIIl.selection;
      }

      public void setSelectionStart(int lllllllllllllllIlIIlIlIIIllIIIll) {
         lllllllllllllllIlIIlIlIIIllIIlII.selectionStart = lllllllllllllllIlIIlIlIIIllIIIll;
      }

      public void setText(String lllllllllllllllIlIIlIlIIIllllllI) {
         lllllllllllllllIlIIlIlIIIlllllIl.text = lllllllllllllllIlIIlIlIIIllllllI;
      }

      public void setCursorRow(int lllllllllllllllIlIIlIlIIIlllIIll) {
         lllllllllllllllIlIIlIlIIIlllIlII.cursorRow = lllllllllllllllIlIIlIlIIIlllIIll;
         InputField.this.scroll();
      }

      public String getText() {
         return lllllllllllllllIlIIlIlIIlIIIIIll.text;
      }

      public int getSelectionStart() {
         return lllllllllllllllIlIIlIlIIIllIlIII.selectionStart;
      }

      public void setSelection(boolean lllllllllllllllIlIIlIlIIIllIlIlI) {
         lllllllllllllllIlIIlIlIIIllIlIll.selection = lllllllllllllllIlIIlIlIIIllIlIlI;
      }

      protected InputField.InputState clone() {
         return InputField.this.new InputState(lllllllllllllllIlIIlIlIIlIIIIllI.getText(), lllllllllllllllIlIIlIlIIlIIIIllI.getCursorRow(), lllllllllllllllIlIIlIlIIlIIIIllI.isSelection(), lllllllllllllllIlIIlIlIIlIIIIllI.getSelectionStart(), lllllllllllllllIlIIlIlIIlIIIIllI.getSelectionEnd());
      }

      public int getCursorRow() {
         return lllllllllllllllIlIIlIlIIIllllIlI.cursorRow;
      }
   }

   public abstract static class InputFieldTextPoof<T extends InputField, S extends PoofInfo> extends Poof<T, S> {
   }
}
