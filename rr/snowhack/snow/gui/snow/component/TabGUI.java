package rr.snowhack.snow.gui.snow.component;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import org.lwjgl.input.Keyboard;
import rr.snowhack.snow.gui.rgui.component.AbstractComponent;
import rr.snowhack.snow.gui.rgui.component.container.Container;
import rr.snowhack.snow.gui.rgui.component.container.use.Frame;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;
import rr.snowhack.snow.util.Wrapper;

public class TabGUI extends AbstractComponent implements EventListener {
   // $FF: synthetic field
   public float selectedLerpY;
   // $FF: synthetic field
   private static final int[] lIIIIlIIIIIII;
   // $FF: synthetic field
   public int selected;
   // $FF: synthetic field
   public int width;
   // $FF: synthetic field
   public int height;
   // $FF: synthetic field
   public boolean tabOpened;
   // $FF: synthetic field
   public final ArrayList<TabGUI.Tab> tabs = new ArrayList();

   private static boolean lIlIlIlIIlIIll(int var0) {
      return var0 != 0;
   }

   @SubscribeEvent
   public void onKeyPress(KeyInputEvent lllllllllllllllIlIIIIIlllIIllllI) {
      if (!lIlIlIlIIlIlIl(Keyboard.getEventKeyState())) {
         Container lllllllllllllllIlIIIIIlllIIlllIl = lllllllllllllllIlIIIIIlllIIlllll.getParent();

         do {
            if (!lIlIlIlIIlIlIl(lllllllllllllllIlIIIIIlllIIlllIl instanceof Frame)) {
               if (lIlIlIlIIlIlIl(((Frame)lllllllllllllllIlIIIIIlllIIlllIl).isPinned())) {
                  return;
               }

               if (lIlIlIlIIlIIll(lllllllllllllllIlIIIIIlllIIlllll.tabOpened)) {
                  switch(Keyboard.getEventKey()) {
                  case 203:
                     lllllllllllllllIlIIIIIlllIIlllll.tabOpened = (boolean)lIIIIlIIIIIII[0];
                     "".length();
                     if (" ".length() << " ".length() <= 0) {
                        return;
                     }
                     break;
                  default:
                     ((TabGUI.Tab)lllllllllllllllIlIIIIIlllIIlllll.tabs.get(lllllllllllllllIlIIIIIlllIIlllll.selected)).onKeyPress(Keyboard.getEventKey());
                     "".length();
                     if (((88 ^ 125) << " ".length() & ~((69 ^ 96) << " ".length())) > 0) {
                        return;
                     }
                  }
               } else {
                  switch(Keyboard.getEventKey()) {
                  case 200:
                     if (lIlIlIlIIlIllI(lllllllllllllllIlIIIIIlllIIlllll.selected)) {
                        lllllllllllllllIlIIIIIlllIIlllll.selected -= lIIIIlIIIIIII[1];
                        "".length();
                        if (((61 ^ 52) & ~(79 ^ 70)) != 0) {
                           return;
                        }
                     } else {
                        lllllllllllllllIlIIIIIlllIIlllll.selected = lllllllllllllllIlIIIIIlllIIlllll.tabs.size() - lIIIIlIIIIIII[1];
                        "".length();
                        if (" ".length() << (" ".length() << " ".length()) <= 0) {
                           return;
                        }
                     }
                     break;
                  case 205:
                     lllllllllllllllIlIIIIIlllIIlllll.tabOpened = (boolean)lIIIIlIIIIIII[1];
                     break;
                  case 208:
                     if (lIlIlIlIIlIIlI(lllllllllllllllIlIIIIIlllIIlllll.selected, lllllllllllllllIlIIIIIlllIIlllll.tabs.size() - lIIIIlIIIIIII[1])) {
                        lllllllllllllllIlIIIIIlllIIlllll.selected += lIIIIlIIIIIII[1];
                        "".length();
                        if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                           return;
                        }
                     } else {
                        lllllllllllllllIlIIIIIlllIIlllll.selected = lIIIIlIIIIIII[0];
                        "".length();
                        if (null != null) {
                           return;
                        }
                     }
                  }
               }

               return;
            }

            lllllllllllllllIlIIIIIlllIIlllIl = lllllllllllllllIlIIIIIlllIIlllIl.getParent();
            "".length();
         } while(((50 ^ 39) & ~(56 ^ 45)) < " ".length() << " ".length());

      }
   }

   private static boolean lIlIlIlIIlIIlI(int var0, int var1) {
      return var0 < var1;
   }

   private static boolean lIlIlIlIIlIlIl(int var0) {
      return var0 == 0;
   }

   private void updateSize() {
      lllllllllllllllIlIIIIIlllIIlIlII.width = lIIIIlIIIIIII[2];
      Iterator lllllllllllllllIlIIIIIlllIIlIIIl = lllllllllllllllIlIIIIIlllIIlIlII.tabs.iterator();

      do {
         if (!lIlIlIlIIlIIll(lllllllllllllllIlIIIIIlllIIlIIIl.hasNext())) {
            lllllllllllllllIlIIIIIlllIIlIlII.height = lllllllllllllllIlIIIIIlllIIlIlII.tabs.size() * lIIIIlIIIIIII[3];
            return;
         }

         TabGUI.Tab lllllllllllllllIlIIIIIlllIIlIlIl = (TabGUI.Tab)lllllllllllllllIlIIIIIlllIIlIIIl.next();
         int lllllllllllllllIlIIIIIlllIIlIllI = Wrapper.getFontRenderer().getStringWidth(lllllllllllllllIlIIIIIlllIIlIlIl.name) + lIIIIlIIIIIII[3];
         if (lIlIlIlIIlIlll(lllllllllllllllIlIIIIIlllIIlIllI, lllllllllllllllIlIIIIIlllIIlIlII.width)) {
            lllllllllllllllIlIIIIIlllIIlIlII.width = lllllllllllllllIlIIIIIlllIIlIllI;
         }

         "".length();
      } while(-" ".length() < "   ".length());

   }

   private static boolean lIlIlIlIIlIlII(Object var0) {
      return var0 != null;
   }

   static {
      lIlIlIlIIlIIIl();
   }

   private static boolean lIlIlIlIIlIllI(int var0) {
      return var0 > 0;
   }

   private static void lIlIlIlIIlIIIl() {
      lIIIIlIIIIIII = new int[4];
      lIIIIlIIIIIII[0] = (46 ^ 63) & ~(33 ^ 48);
      lIIIIlIIIIIII[1] = " ".length();
      lIIIIlIIIIIII[2] = " ".length() << ("   ".length() << " ".length());
      lIIIIlIIIIIII[3] = (36 ^ 33) << " ".length();
   }

   private static boolean lIlIlIlIIlIlll(int var0, int var1) {
      return var0 > var1;
   }

   public TabGUI() {
      FMLCommonHandler.instance().bus().register(lllllllllllllllIlIIIIIlllIlIlIll);
      LinkedHashMap<Module.Category, TabGUI.Tab> lllllllllllllllIlIIIIIlllIlIIllI = new LinkedHashMap();
      long lllllllllllllllIlIIIIIlllIlIIlIl = Module.Category.values();
      double lllllllllllllllIlIIIIIlllIlIIlII = lllllllllllllllIlIIIIIlllIlIIlIl.length;
      int lllllllllllllllIlIIIIIlllIlIIIll = lIIIIlIIIIIII[0];

      do {
         if (!lIlIlIlIIlIIlI(lllllllllllllllIlIIIIIlllIlIIIll, lllllllllllllllIlIIIIIlllIlIIlII)) {
            ArrayList<Module> lllllllllllllllIlIIIIIlllIlIlIIl = new ArrayList();
            lllllllllllllllIlIIIIIlllIlIlIIl.addAll(ModuleManager.getModules());
            "".length();
            Iterator lllllllllllllllIlIIIIIlllIlIIlII = lllllllllllllllIlIIIIIlllIlIlIIl.iterator();

            do {
               if (!lIlIlIlIIlIIll(lllllllllllllllIlIIIIIlllIlIIlII.hasNext())) {
                  lllllllllllllllIlIIIIIlllIlIIlII = lllllllllllllllIlIIIIIlllIlIIllI.entrySet().iterator();

                  do {
                     if (!lIlIlIlIIlIIll(lllllllllllllllIlIIIIIlllIlIIlII.hasNext())) {
                        lllllllllllllllIlIIIIIlllIlIlIll.tabs.addAll(lllllllllllllllIlIIIIIlllIlIIllI.values());
                        "".length();
                        lllllllllllllllIlIIIIIlllIlIlIll.tabs.forEach((lllllllllllllllIlIIIIIlllIIIllII) -> {
                           lllllllllllllllIlIIIIIlllIIIllII.updateSize();
                        });
                        lllllllllllllllIlIIIIIlllIlIlIll.updateSize();
                        return;
                     }

                     Entry<Module.Category, TabGUI.Tab> lllllllllllllllIlIIIIIlllIlIllII = (Entry)lllllllllllllllIlIIIIIlllIlIIlII.next();
                     if (lIlIlIlIIlIIll(((TabGUI.Tab)lllllllllllllllIlIIIIIlllIlIllII.getValue()).features.isEmpty())) {
                        lllllllllllllllIlIIIIIlllIlIIlII.remove();
                     }

                     "".length();
                  } while(" ".length() >= 0);

                  throw null;
               }

               Module lllllllllllllllIlIIIIIlllIlIllIl = (Module)lllllllllllllllIlIIIIIlllIlIIlII.next();
               if (lIlIlIlIIlIlII(lllllllllllllllIlIIIIIlllIlIllIl.getCategory()) && lIlIlIlIIlIlIl(lllllllllllllllIlIIIIIlllIlIllIl.getCategory().isHidden())) {
                  ((TabGUI.Tab)lllllllllllllllIlIIIIIlllIlIIllI.get(lllllllllllllllIlIIIIIlllIlIllIl.getCategory())).add(lllllllllllllllIlIIIIIlllIlIllIl);
               }

               "".length();
            } while(-"  ".length() < 0);

            throw null;
         }

         Module.Category lllllllllllllllIlIIIIIlllIlIlllI = lllllllllllllllIlIIIIIlllIlIIlIl[lllllllllllllllIlIIIIIlllIlIIIll];
         lllllllllllllllIlIIIIIlllIlIIllI.put(lllllllllllllllIlIIIIIlllIlIlllI, new TabGUI.Tab(lllllllllllllllIlIIIIIlllIlIlllI.getName()));
         "".length();
         ++lllllllllllllllIlIIIIIlllIlIIIll;
         "".length();
      } while(null == null);

      throw null;
   }

   public static final class Tab {
      // $FF: synthetic field
      private static final int[] lllIlllIlllI;
      // $FF: synthetic field
      public int selected;
      // $FF: synthetic field
      public final String name;
      // $FF: synthetic field
      public int width;
      // $FF: synthetic field
      public float lerpSelectY = 0.0F;
      // $FF: synthetic field
      public final ArrayList<Module> features = new ArrayList();
      // $FF: synthetic field
      public int height;

      private static boolean lIIlllIlIllIll(int var0) {
         return var0 != 0;
      }

      static {
         lIIlllIlIllIlI();
      }

      private static void lIIlllIlIllIlI() {
         lllIlllIlllI = new int[4];
         lllIlllIlllI[0] = " ".length() << ("   ".length() << " ".length());
         lllIlllIlllI[1] = ((186 ^ 149) << " ".length() ^ 230 ^ 189) << " ".length();
         lllIlllIlllI[2] = " ".length();
         lllIlllIlllI[3] = ((51 ^ 56) << " ".length() ^ 158 ^ 187) & ("   ".length() << (" ".length() << " ".length()) ^ 23 ^ 40 ^ -" ".length());
      }

      public void add(Module lllllllllllllllIlIllIIIlllllIlII) {
         lllllllllllllllIlIllIIIlllllIIll.features.add(lllllllllllllllIlIllIIIlllllIlII);
         "".length();
      }

      public void onKeyPress(int lllllllllllllllIlIllIIIllllllIlI) {
         switch(lllllllllllllllIlIllIIIllllllIlI) {
         case 200:
            if (lIIlllIlIllllI(lllllllllllllllIlIllIIIllllllIIl.selected)) {
               lllllllllllllllIlIllIIIllllllIIl.selected -= lllIlllIlllI[2];
               "".length();
               if (-" ".length() >= 0) {
                  return;
               }
            } else {
               lllllllllllllllIlIllIIIllllllIIl.selected = lllllllllllllllIlIllIIIllllllIIl.features.size() - lllIlllIlllI[2];
               "".length();
               if (" ".length() < 0) {
                  return;
               }
            }
            break;
         case 205:
            ((Module)lllllllllllllllIlIllIIIllllllIIl.features.get(lllllllllllllllIlIllIIIllllllIIl.selected)).toggle();
            break;
         case 208:
            if (lIIlllIlIlllIl(lllllllllllllllIlIllIIIllllllIIl.selected, lllllllllllllllIlIllIIIllllllIIl.features.size() - lllIlllIlllI[2])) {
               lllllllllllllllIlIllIIIllllllIIl.selected += lllIlllIlllI[2];
               "".length();
               if (" ".length() >= " ".length() << (" ".length() << " ".length())) {
                  return;
               }
            } else {
               lllllllllllllllIlIllIIIllllllIIl.selected = lllIlllIlllI[3];
               "".length();
               if (((1 ^ 86) & ~(103 ^ 48)) > " ".length() << " ".length()) {
                  return;
               }
            }
         }

      }

      private static boolean lIIlllIlIlllII(int var0, int var1) {
         return var0 > var1;
      }

      public Tab(String lllllllllllllllIlIllIIlIIIIIlIIl) {
         lllllllllllllllIlIllIIlIIIIIlIlI.name = lllllllllllllllIlIllIIlIIIIIlIIl;
      }

      private static boolean lIIlllIlIlllIl(int var0, int var1) {
         return var0 < var1;
      }

      public void updateSize() {
         lllllllllllllllIlIllIIlIIIIIIIIl.width = lllIlllIlllI[0];
         Iterator lllllllllllllllIlIllIIlIIIIIIIII = lllllllllllllllIlIllIIlIIIIIIIIl.features.iterator();

         do {
            if (!lIIlllIlIllIll(lllllllllllllllIlIllIIlIIIIIIIII.hasNext())) {
               lllllllllllllllIlIllIIlIIIIIIIIl.height = lllllllllllllllIlIllIIlIIIIIIIIl.features.size() * lllIlllIlllI[1];
               return;
            }

            byte lllllllllllllllIlIllIIIlllllllll = (Module)lllllllllllllllIlIllIIlIIIIIIIII.next();
            float lllllllllllllllIlIllIIIllllllllI = Wrapper.getFontRenderer().getStringWidth(lllllllllllllllIlIllIIIlllllllll.getName()) + lllIlllIlllI[1];
            if (lIIlllIlIlllII(lllllllllllllllIlIllIIIllllllllI, lllllllllllllllIlIllIIlIIIIIIIIl.width)) {
               lllllllllllllllIlIllIIlIIIIIIIIl.width = lllllllllllllllIlIllIIIllllllllI;
            }

            "".length();
         } while("   ".length() != ((28 ^ 109 ^ (91 ^ 86) << (" ".length() << " ".length())) & ((56 ^ 3) << (" ".length() << " ".length()) ^ 139 + 60 - 178 + 148 ^ -" ".length())));

      }

      private static boolean lIIlllIlIllllI(int var0) {
         return var0 > 0;
      }
   }
}
