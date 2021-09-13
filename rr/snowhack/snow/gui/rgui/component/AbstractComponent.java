package rr.snowhack.snow.gui.rgui.component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.gui.rgui.GUI;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.listen.KeyListener;
import rr.snowhack.snow.gui.rgui.component.listen.MouseListener;
import rr.snowhack.snow.gui.rgui.component.listen.RenderListener;
import rr.snowhack.snow.gui.rgui.component.listen.TickListener;
import rr.snowhack.snow.gui.rgui.component.listen.UpdateListener;
import rr.snowhack.snow.gui.rgui.poof.IPoof;
import rr.snowhack.snow.gui.rgui.poof.PoofInfo;
import rr.snowhack.snow.gui.rgui.render.ComponentUI;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;
import rr.snowhack.snow.gui.snow.DisplayGuiScreen;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

public abstract class AbstractComponent implements Component {
   // $FF: synthetic field
   boolean press;
   // $FF: synthetic field
   private boolean focus;
   // $FF: synthetic field
   boolean hover;
   // $FF: synthetic field
   int minWidth = Integer.MIN_VALUE;
   // $FF: synthetic field
   ArrayList<IPoof> poofs;
   // $FF: synthetic field
   int y;
   // $FF: synthetic field
   Container parent;
   // $FF: synthetic field
   protected int priority;
   // $FF: synthetic field
   ArrayList<RenderListener> renderListeners;
   // $FF: synthetic field
   int width;
   // $FF: synthetic field
   ArrayList<TickListener> tickListeners;
   // $FF: synthetic field
   Theme theme;
   // $FF: synthetic field
   boolean affectlayout;
   // $FF: synthetic field
   int height;
   // $FF: synthetic field
   ArrayList<MouseListener> mouseListeners;
   // $FF: synthetic field
   boolean workingx;
   // $FF: synthetic field
   int maxHeight;
   // $FF: synthetic field
   int minHeight = Integer.MIN_VALUE;
   // $FF: synthetic field
   float opacity;
   // $FF: synthetic field
   boolean workingy;
   // $FF: synthetic field
   int maxWidth;
   // $FF: synthetic field
   ArrayList<UpdateListener> updateListeners;
   // $FF: synthetic field
   boolean drag;
   // $FF: synthetic field
   ComponentUI ui;
   // $FF: synthetic field
   private static final int[] lIIIlIIIllllI;
   // $FF: synthetic field
   private static final String[] lIIIlIIIlllIl;
   // $FF: synthetic field
   int x;
   // $FF: synthetic field
   private Setting<Boolean> visible;
   // $FF: synthetic field
   ArrayList<KeyListener> keyListeners;

   public AbstractComponent() {
      lllllllllllllllIIlllIlIIllIllIIl.maxWidth = lIIIlIIIllllI[0];
      lllllllllllllllIIlllIlIIllIllIIl.maxHeight = lIIIlIIIllllI[0];
      lllllllllllllllIIlllIlIIllIllIIl.priority = lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.visible = Settings.b(lIIIlIIIlllIl[lIIIlIIIllllI[1]], (boolean)lIIIlIIIllllI[2]);
      lllllllllllllllIIlllIlIIllIllIIl.opacity = 1.0F;
      lllllllllllllllIIlllIlIIllIllIIl.focus = (boolean)lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.hover = (boolean)lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.press = (boolean)lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.drag = (boolean)lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.affectlayout = (boolean)lIIIlIIIllllI[2];
      lllllllllllllllIIlllIlIIllIllIIl.mouseListeners = new ArrayList();
      lllllllllllllllIIlllIlIIllIllIIl.renderListeners = new ArrayList();
      lllllllllllllllIIlllIlIIllIllIIl.keyListeners = new ArrayList();
      lllllllllllllllIIlllIlIIllIllIIl.updateListeners = new ArrayList();
      lllllllllllllllIIlllIlIIllIllIIl.tickListeners = new ArrayList();
      lllllllllllllllIIlllIlIIllIllIIl.poofs = new ArrayList();
      lllllllllllllllIIlllIlIIllIllIIl.workingy = (boolean)lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.workingx = (boolean)lIIIlIIIllllI[1];
      lllllllllllllllIIlllIlIIllIllIIl.addMouseListener(new MouseListener() {
         // $FF: synthetic field
         private static final int[] lllIlIIIllII;

         static {
            lIIllIIIIIllII();
         }

         public void onMouseDrag(MouseListener.MouseButtonEvent lllllllllllllllIllIIIIlIlIllIIlI) {
            lllllllllllllllIIlllIlIIllIllIIl.drag = (boolean)lllIlIIIllII[0];
         }

         public void onMouseRelease(MouseListener.MouseButtonEvent lllllllllllllllIllIIIIlIlIllIllI) {
            lllllllllllllllIIlllIlIIllIllIIl.press = (boolean)lllIlIIIllII[1];
            lllllllllllllllIIlllIlIIllIllIIl.drag = (boolean)lllIlIIIllII[1];
         }

         private static void lIIllIIIIIllII() {
            lllIlIIIllII = new int[2];
            lllIlIIIllII[0] = " ".length();
            lllIlIIIllII[1] = ((33 ^ 96) << " ".length() ^ 6 + 75 - 24 + 132) & ((82 ^ 113) << " ".length() ^ 122 ^ 3 ^ -" ".length());
         }

         public void onMouseMove(MouseListener.MouseMoveEvent lllllllllllllllIllIIIIlIlIlIllll) {
         }

         public void onMouseDown(MouseListener.MouseButtonEvent lllllllllllllllIllIIIIlIlIlllIlI) {
            lllllllllllllllIIlllIlIIllIllIIl.press = (boolean)lllIlIIIllII[0];
         }

         public void onScroll(MouseListener.MouseScrollEvent lllllllllllllllIllIIIIlIlIlIllIl) {
         }
      });
   }

   public Component setMaximumWidth(int lllllllllllllllIIlllIIllllllIlIl) {
      lllllllllllllllIIlllIIllllllIllI.maxWidth = lllllllllllllllIIlllIIllllllIlIl;
      return lllllllllllllllIIlllIIllllllIllI;
   }

   public boolean isHovered() {
      int var10000;
      if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIllIIIIl.isMouseOver()) && lIlIllllIIlllI(lllllllllllllllIIlllIlIIIllIIIIl.press)) {
         var10000 = lIIIlIIIllllI[2];
         "".length();
         if (" ".length() << (" ".length() << " ".length()) < (((17 ^ 26) << "   ".length() ^ 42 ^ 119) << " ".length() & (((120 ^ 97) << (" ".length() << " ".length()) ^ 203 ^ 170) << " ".length() ^ -" ".length()) & (" ".length() << ("   ".length() << " ".length()) & (" ".length() << ("   ".length() << " ".length()) ^ -" ".length()) ^ -" ".length()))) {
            return (boolean)(((165 ^ 176) << "   ".length() ^ 23 + 147 - 2 + 21) << (" ".length() << " ".length()) & ((1 ^ 20 ^ (119 ^ 102) & ~(121 ^ 104)) << (" ".length() << " ".length()) ^ -" ".length()));
         }
      } else {
         var10000 = lIIIlIIIllllI[1];
      }

      return (boolean)var10000;
   }

   private static boolean lIlIllllIlIIlI(int var0) {
      return var0 != 0;
   }

   public void setTheme(Theme lllllllllllllllIIlllIlIIllIIIIll) {
      lllllllllllllllIIlllIlIIllIIIllI.theme = lllllllllllllllIIlllIlIIllIIIIll;
   }

   private boolean isMouseOver() {
      short lllllllllllllllIIlllIlIIIllIIlIl = GUI.calculateRealPosition(lllllllllllllllIIlllIlIIIllIIllI);
      Exception lllllllllllllllIIlllIlIIIllIIlII = DisplayGuiScreen.mouseX;
      int lllllllllllllllIIlllIlIIIllIIlll = DisplayGuiScreen.mouseY;
      int var10000;
      if (lIlIllllIlIIII(lllllllllllllllIIlllIlIIIllIIlIl[lIIIlIIIllllI[1]], lllllllllllllllIIlllIlIIIllIIlII) && lIlIllllIlIIII(lllllllllllllllIIlllIlIIIllIIlIl[lIIIlIIIllllI[2]], lllllllllllllllIIlllIlIIIllIIlll) && lIlIllllIlIIIl(lllllllllllllllIIlllIlIIIllIIlIl[lIIIlIIIllllI[1]] + lllllllllllllllIIlllIlIIIllIIllI.getWidth(), lllllllllllllllIIlllIlIIIllIIlII) && lIlIllllIlIIIl(lllllllllllllllIIlllIlIIIllIIlIl[lIIIlIIIllllI[2]] + lllllllllllllllIIlllIlIIIllIIllI.getHeight(), lllllllllllllllIIlllIlIIIllIIlll)) {
         var10000 = lIIIlIIIllllI[2];
         "".length();
         if (" ".length() << " ".length() <= 0) {
            return (boolean)((80 ^ 85) << (" ".length() << (" ".length() << " ".length())) & ~((0 ^ 5) << (" ".length() << (" ".length() << " ".length()))));
         }
      } else {
         var10000 = lIIIlIIIllllI[1];
      }

      return (boolean)var10000;
   }

   public void addRenderListener(RenderListener lllllllllllllllIIlllIlIIIlIIllIl) {
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIIlIIlllI.renderListeners.contains(lllllllllllllllIIlllIlIIIlIIllIl))) {
         lllllllllllllllIIlllIlIIIlIIlllI.renderListeners.add(lllllllllllllllIIlllIlIIIlIIllIl);
         "".length();
      }

   }

   public void setX(int lllllllllllllllIIlllIlIIlIIllIII) {
      int lllllllllllllllIIlllIlIIlIIllIll = lllllllllllllllIIlllIlIIlIIllIIl.getX();
      int lllllllllllllllIIlllIlIIlIIllIlI = lllllllllllllllIIlllIlIIlIIllIIl.getY();
      lllllllllllllllIIlllIlIIlIIllIIl.x = lllllllllllllllIIlllIlIIlIIllIII;
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIlIIllIIl.workingx)) {
         lllllllllllllllIIlllIlIIlIIllIIl.workingx = (boolean)lIIIlIIIllllI[2];
         lllllllllllllllIIlllIlIIlIIllIIl.getUpdateListeners().forEach((lllllllllllllllIIlllIIlllIIlIIII) -> {
            lllllllllllllllIIlllIIlllIIlIIII.updateLocation(lllllllllllllllIIlllIIlllIIlIlll, lllllllllllllllIIlllIlIIlIIllIll, lllllllllllllllIIlllIlIIlIIllIlI);
         });
         if (lIlIllllIIllll(lllllllllllllllIIlllIlIIlIIllIIl.getParent())) {
            lllllllllllllllIIlllIlIIlIIllIIl.getParent().getUpdateListeners().forEach((lllllllllllllllIIlllIIlllIIlllII) -> {
               lllllllllllllllIIlllIIlllIIlllII.updateLocation(lllllllllllllllIIlllIIlllIIlllll, lllllllllllllllIIlllIlIIlIIllIll, lllllllllllllllIIlllIlIIlIIllIlI);
            });
         }

         lllllllllllllllIIlllIlIIlIIllIIl.workingx = (boolean)lIIIlIIIllllI[1];
      }

   }

   public int getWidth() {
      return lllllllllllllllIIlllIlIIlIllIIIl.width;
   }

   public int getMinimumHeight() {
      return lllllllllllllllIIlllIIllllllllIl.minHeight;
   }

   public ArrayList<RenderListener> getRenderListeners() {
      return lllllllllllllllIIlllIlIIIlIlIIlI.renderListeners;
   }

   public ArrayList<TickListener> getTickListeners() {
      return lllllllllllllllIIlllIlIIIIllIllI.tickListeners;
   }

   public void setHeight(int lllllllllllllllIIlllIlIIlIIIIIII) {
      lllllllllllllllIIlllIlIIlIIIIIII = Math.max(lllllllllllllllIIlllIlIIlIIIIlIl.getMinimumHeight(), Math.min(lllllllllllllllIIlllIlIIlIIIIIII, lllllllllllllllIIlllIlIIlIIIIlIl.getMaximumHeight()));
      int lllllllllllllllIIlllIlIIlIIIIIll = lllllllllllllllIIlllIlIIlIIIIlIl.getWidth();
      boolean lllllllllllllllIIlllIlIIIllllllI = lllllllllllllllIIlllIlIIlIIIIlIl.getHeight();
      lllllllllllllllIIlllIlIIlIIIIlIl.height = lllllllllllllllIIlllIlIIlIIIIIII;
      lllllllllllllllIIlllIlIIlIIIIlIl.getUpdateListeners().forEach((lllllllllllllllIIlllIIllllIIIlII) -> {
         lllllllllllllllIIlllIIllllIIIlII.updateSize(lllllllllllllllIIlllIIllllIIIlll, lllllllllllllllIIlllIlIIlIIIIIll, lllllllllllllllIIlllIlIIIllllllI);
      });
      if (lIlIllllIIllll(lllllllllllllllIIlllIlIIlIIIIlIl.getParent())) {
         lllllllllllllllIIlllIlIIlIIIIlIl.getParent().getUpdateListeners().forEach((lllllllllllllllIIlllIIllllIIllII) -> {
            lllllllllllllllIIlllIIllllIIllII.updateSize(lllllllllllllllIIlllIIllllIlIIll, lllllllllllllllIIlllIlIIlIIIIIll, lllllllllllllllIIlllIlIIIllllllI);
         });
      }

   }

   static {
      lIlIllllIIllII();
      lIlIllllIIlIll();
   }

   public void setParent(Container lllllllllllllllIIlllIlIIllIIllII) {
      lllllllllllllllIIlllIlIIllIIllIl.parent = lllllllllllllllIIlllIlIIllIIllII;
   }

   public void setFocussed(boolean lllllllllllllllIIlllIlIIlIllllll) {
      lllllllllllllllIIlllIlIIlIlllllI.focus = lllllllllllllllIIlllIlIIlIllllll;
   }

   private static boolean lIlIllllIIlllI(int var0) {
      return var0 == 0;
   }

   public ArrayList<KeyListener> getKeyListeners() {
      return lllllllllllllllIIlllIlIIIlIIlIIl.keyListeners;
   }

   public void callPoof(Class<? extends IPoof> lllllllllllllllIIlllIlIIIIIlllll, PoofInfo lllllllllllllllIIlllIlIIIIlIIIIl) {
      Iterator lllllllllllllllIIlllIlIIIIIlllIl = lllllllllllllllIIlllIlIIIIlIIIII.poofs.iterator();

      do {
         if (!lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlllIl.hasNext())) {
            return;
         }

         IPoof lllllllllllllllIIlllIlIIIIlIIlII = (IPoof)lllllllllllllllIIlllIlIIIIIlllIl.next();
         if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlllll.isAssignableFrom(lllllllllllllllIIlllIlIIIIlIIlII.getClass())) && lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIlIIlII.getComponentClass().isAssignableFrom(lllllllllllllllIIlllIlIIIIlIIIII.getClass()))) {
            lllllllllllllllIIlllIlIIIIlIIlII.execute(lllllllllllllllIIlllIlIIIIlIIIII, lllllllllllllllIIlllIlIIIIlIIIIl);
         }

         "".length();
      } while(((48 ^ 43 ^ (138 ^ 159) << " ".length()) << " ".length() & (((50 ^ 41) << (" ".length() << " ".length()) ^ 247 ^ 170) << " ".length() ^ -" ".length())) == 0);

   }

   private static String lIlIllllIIlIlI(String lllllllllllllllIIlllIIllIlllIIII, String lllllllllllllllIIlllIIllIllIllll) {
      try {
         Exception lllllllllllllllIIlllIIllIllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIllIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIIlllIIllIllIlIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIlllIIllIllIlIll.init(lIIIlIIIllllI[3], lllllllllllllllIIlllIIllIllIllII);
         return new String(lllllllllllllllIIlllIIllIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIllIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void addUpdateListener(UpdateListener lllllllllllllllIIlllIlIIIIlllIll) {
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIIIlllIlI.updateListeners.contains(lllllllllllllllIIlllIlIIIIlllIll))) {
         lllllllllllllllIIlllIlIIIIlllIlI.updateListeners.add(lllllllllllllllIIlllIlIIIIlllIll);
         "".length();
      }

   }

   public void addKeyListener(KeyListener lllllllllllllllIIlllIlIIIlIIIlII) {
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIIlIIIIll.keyListeners.contains(lllllllllllllllIIlllIlIIIlIIIlII))) {
         lllllllllllllllIIlllIlIIIlIIIIll.keyListeners.add(lllllllllllllllIIlllIlIIIlIIIlII);
         "".length();
      }

   }

   public boolean doAffectLayout() {
      return lllllllllllllllIIlllIIllllIllllI.affectlayout;
   }

   public Theme getTheme() {
      return lllllllllllllllIIlllIlIIllIIlIIl.theme;
   }

   private static boolean lIlIllllIIllll(Object var0) {
      return var0 != null;
   }

   public ComponentUI getUI() {
      if (lIlIllllIIllIl(lllllllllllllllIIlllIlIIllIlIllI.ui)) {
         lllllllllllllllIIlllIlIIllIlIllI.ui = lllllllllllllllIIlllIlIIllIlIllI.getTheme().getUIForComponent(lllllllllllllllIIlllIlIIllIlIllI);
      }

      return lllllllllllllllIIlllIlIIllIlIllI.ui;
   }

   public Component setMinimumWidth(int lllllllllllllllIIlllIIlllllIIlll) {
      lllllllllllllllIIlllIIlllllIlIII.minWidth = lllllllllllllllIIlllIIlllllIIlll;
      return lllllllllllllllIIlllIIlllllIlIII;
   }

   public void setVisible(boolean lllllllllllllllIIlllIlIIIlllIlll) {
      lllllllllllllllIIlllIlIIIlllIllI.visible.setValue(lllllllllllllllIIlllIlIIIlllIlll);
      "".length();
   }

   public int getX() {
      return lllllllllllllllIIlllIlIIlIlllIII.x;
   }

   public Component setMinimumHeight(int lllllllllllllllIIlllIIlllllIIIIl) {
      lllllllllllllllIIlllIIlllllIIIlI.minHeight = lllllllllllllllIIlllIIlllllIIIIl;
      return lllllllllllllllIIlllIIlllllIIIlI;
   }

   public int getMaximumWidth() {
      return lllllllllllllllIIlllIlIIIIIIIIII.maxWidth;
   }

   public int getMinimumWidth() {
      return lllllllllllllllIIlllIIlllllllIlI.minWidth;
   }

   public int getHeight() {
      return lllllllllllllllIIlllIlIIlIlIlllI.height;
   }

   public boolean isPressed() {
      return lllllllllllllllIIlllIlIIIlIllllI.press;
   }

   private static boolean lIlIllllIIllIl(Object var0) {
      return var0 == null;
   }

   public void setWidth(int lllllllllllllllIIlllIlIIlIIlIIII) {
      lllllllllllllllIIlllIlIIlIIlIIII = Math.max(lllllllllllllllIIlllIlIIlIIlIIIl.getMinimumWidth(), Math.min(lllllllllllllllIIlllIlIIlIIlIIII, lllllllllllllllIIlllIlIIlIIlIIIl.getMaximumWidth()));
      int lllllllllllllllIIlllIlIIlIIIllll = lllllllllllllllIIlllIlIIlIIlIIIl.getWidth();
      boolean lllllllllllllllIIlllIlIIlIIIlIlI = lllllllllllllllIIlllIlIIlIIlIIIl.getHeight();
      lllllllllllllllIIlllIlIIlIIlIIIl.width = lllllllllllllllIIlllIlIIlIIlIIII;
      lllllllllllllllIIlllIlIIlIIlIIIl.getUpdateListeners().forEach((lllllllllllllllIIlllIIlllIlIlIII) -> {
         lllllllllllllllIIlllIIlllIlIlIII.updateSize(lllllllllllllllIIlllIIlllIlIllll, lllllllllllllllIIlllIlIIlIIIllll, lllllllllllllllIIlllIlIIlIIIlIlI);
      });
      if (lIlIllllIIllll(lllllllllllllllIIlllIlIIlIIlIIIl.getParent())) {
         lllllllllllllllIIlllIlIIlIIlIIIl.getParent().getUpdateListeners().forEach((lllllllllllllllIIlllIIlllIlllIII) -> {
            lllllllllllllllIIlllIIlllIlllIII.updateSize(lllllllllllllllIIlllIIlllIllIlll, lllllllllllllllIIlllIlIIlIIIllll, lllllllllllllllIIlllIlIIlIIIlIlI);
         });
      }

   }

   public boolean isFocussed() {
      return lllllllllllllllIIlllIlIIlIlllIll.focus;
   }

   private static boolean lIlIllllIlIIIl(int var0, int var1) {
      return var0 >= var1;
   }

   public void addTickListener(TickListener lllllllllllllllIIlllIlIIIIllIIlI) {
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIIIllIIIl.tickListeners.contains(lllllllllllllllIIlllIlIIIIllIIlI))) {
         lllllllllllllllIIlllIlIIIIllIIIl.tickListeners.add(lllllllllllllllIIlllIlIIIIllIIlI);
         "".length();
      }

   }

   public ArrayList<UpdateListener> getUpdateListeners() {
      return lllllllllllllllIIlllIlIIIIllllll.updateListeners;
   }

   public float getOpacity() {
      return lllllllllllllllIIlllIlIIIIIIlIll.opacity;
   }

   private static void lIlIllllIIllII() {
      lIIIlIIIllllI = new int[4];
      lIIIlIIIllllI[0] = 1693233665 + 432704367 - 1463322876 + 1484868491;
      lIIIlIIIllllI[1] = ((116 ^ 127) << " ".length() ^ 74 ^ 121) << " ".length() & (((238 ^ 161) << " ".length() ^ 67 + 97 - 123 + 146) << " ".length() ^ -" ".length());
      lIIIlIIIllllI[2] = " ".length();
      lIIIlIIIllllI[3] = " ".length() << " ".length();
   }

   public Component setMaximumHeight(int lllllllllllllllIIlllIIlllllIllIl) {
      lllllllllllllllIIlllIIlllllIlllI.maxHeight = lllllllllllllllIIlllIIlllllIllIl;
      return lllllllllllllllIIlllIIlllllIlllI;
   }

   public void addMouseListener(MouseListener lllllllllllllllIIlllIlIIIlIlIllI) {
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIIlIlIlIl.mouseListeners.contains(lllllllllllllllIIlllIlIIIlIlIllI))) {
         lllllllllllllllIIlllIlIIIlIlIlIl.mouseListeners.add(lllllllllllllllIIlllIlIIIlIlIllI);
         "".length();
      }

   }

   private static void lIlIllllIIlIll() {
      lIIIlIIIlllIl = new String[lIIIlIIIllllI[2]];
      lIIIlIIIlllIl[lIIIlIIIllllI[1]] = lIlIllllIIlIlI("/Q5Xf7md9EM=", "gLunu");
   }

   private static boolean lIlIllllIlIIII(int var0, int var1) {
      return var0 <= var1;
   }

   public void setY(int lllllllllllllllIIlllIlIIlIlIlIII) {
      int lllllllllllllllIIlllIlIIlIlIIlll = lllllllllllllllIIlllIlIIlIlIIlIl.getX();
      int lllllllllllllllIIlllIlIIlIlIIllI = lllllllllllllllIIlllIlIIlIlIIlIl.getY();
      lllllllllllllllIIlllIlIIlIlIIlIl.y = lllllllllllllllIIlllIlIIlIlIlIII;
      if (lIlIllllIIlllI(lllllllllllllllIIlllIlIIlIlIIlIl.workingy)) {
         lllllllllllllllIIlllIlIIlIlIIlIl.workingy = (boolean)lIIIlIIIllllI[2];
         lllllllllllllllIIlllIlIIlIlIIlIl.getUpdateListeners().forEach((lllllllllllllllIIlllIIllIlllllII) -> {
            lllllllllllllllIIlllIIllIlllllII.updateLocation(lllllllllllllllIIlllIIllIlllllll, lllllllllllllllIIlllIlIIlIlIIlll, lllllllllllllllIIlllIlIIlIlIIllI);
         });
         if (lIlIllllIIllll(lllllllllllllllIIlllIlIIlIlIIlIl.getParent())) {
            lllllllllllllllIIlllIlIIlIlIIlIl.getParent().getUpdateListeners().forEach((lllllllllllllllIIlllIIlllIIIIlII) -> {
               lllllllllllllllIIlllIIlllIIIIlII.updateLocation(lllllllllllllllIIlllIIlllIIIlIll, lllllllllllllllIIlllIlIIlIlIIlll, lllllllllllllllIIlllIlIIlIlIIllI);
            });
         }

         lllllllllllllllIIlllIlIIlIlIIlIl.workingy = (boolean)lIIIlIIIllllI[1];
      }

   }

   public int getMaximumHeight() {
      return lllllllllllllllIIlllIlIIIIIIIIlI.maxHeight;
   }

   public void kill() {
      lllllllllllllllIIlllIlIIIllIllll.setVisible((boolean)lIIIlIIIllllI[1]);
   }

   public Container getParent() {
      return lllllllllllllllIIlllIlIIllIlIIlI.parent;
   }

   public boolean isVisible() {
      return (Boolean)lllllllllllllllIIlllIlIIIlllllII.visible.getValue();
   }

   public void addPoof(IPoof lllllllllllllllIIlllIlIIIIlIllII) {
      lllllllllllllllIIlllIlIIIIlIllIl.poofs.add(lllllllllllllllIIlllIlIIIIlIllII);
      "".length();
   }

   public int getY() {
      return lllllllllllllllIIlllIlIIlIllIlIl.y;
   }

   public void setAffectLayout(boolean lllllllllllllllIIlllIIllllIllIlI) {
      lllllllllllllllIIlllIIllllIllIIl.affectlayout = lllllllllllllllIIlllIIllllIllIlI;
   }

   public boolean liesIn(Component lllllllllllllllIIlllIlIIIIIlIIIl) {
      if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlIIIl.equals(lllllllllllllllIIlllIlIIIIIlIlII))) {
         return (boolean)lIIIlIIIllllI[2];
      } else if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlIIIl instanceof Container)) {
         Iterator lllllllllllllllIIlllIlIIIIIlIIII = ((Container)lllllllllllllllIIlllIlIIIIIlIIIl).getChildren().iterator();

         do {
            if (!lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlIIII.hasNext())) {
               return (boolean)lIIIlIIIllllI[1];
            }

            Component lllllllllllllllIIlllIlIIIIIlIlIl = (Component)lllllllllllllllIIlllIlIIIIIlIIII.next();
            if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlIlIl.equals(lllllllllllllllIIlllIlIIIIIlIlII))) {
               return (boolean)lIIIlIIIllllI[2];
            }

            boolean lllllllllllllllIIlllIlIIIIIlIllI = lIIIlIIIllllI[1];
            if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlIlIl instanceof Container)) {
               lllllllllllllllIIlllIlIIIIIlIllI = lllllllllllllllIIlllIlIIIIIlIlII.liesIn(lllllllllllllllIIlllIlIIIIIlIlIl);
            }

            if (lIlIllllIlIIlI(lllllllllllllllIIlllIlIIIIIlIllI)) {
               return (boolean)lIIIlIIIllllI[2];
            }

            "".length();
         } while(" ".length() << (" ".length() << " ".length()) > "   ".length());

         return (boolean)((118 ^ 85) & ~(158 ^ 189));
      } else {
         return (boolean)lIIIlIIIllllI[1];
      }
   }

   public ArrayList<MouseListener> getMouseListeners() {
      return lllllllllllllllIIlllIlIIIlIllIll.mouseListeners;
   }

   public int getPriority() {
      return lllllllllllllllIIlllIlIIIlllIIlI.priority;
   }

   public void setOpacity(float lllllllllllllllIIlllIlIIIIIIIlIl) {
      lllllllllllllllIIlllIlIIIIIIlIII.opacity = lllllllllllllllIIlllIlIIIIIIIlIl;
   }
}
