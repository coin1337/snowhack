package rr.snowhack.snow.gui.snow.component;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import rr.snowhack.snow.gui.rgui.component.Component;
import rr.snowhack.snow.gui.rgui.component.container.OrganisedContainer;
import rr.snowhack.snow.gui.rgui.component.use.CheckButton;
import rr.snowhack.snow.gui.rgui.component.use.Slider;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;
import rr.snowhack.snow.gui.snow.Stretcherlayout;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.impl.BooleanSetting;
import rr.snowhack.snow.setting.impl.EnumSetting;
import rr.snowhack.snow.setting.impl.numerical.DoubleSetting;
import rr.snowhack.snow.setting.impl.numerical.FloatSetting;
import rr.snowhack.snow.setting.impl.numerical.IntegerSetting;
import rr.snowhack.snow.setting.impl.numerical.NumberSetting;
import rr.snowhack.snow.util.Bind;

public class SettingsPanel extends OrganisedContainer {
   // $FF: synthetic field
   Module module;
   // $FF: synthetic field
   private static final int[] llllIlllIlII;
   // $FF: synthetic field
   private static final String[] llllIlllIIlI;

   public SettingsPanel(Theme lllllllllllllllIlIlIIIlllIIlIlIl, Module lllllllllllllllIlIlIIIlllIIlIlII) {
      super(lllllllllllllllIlIlIIIlllIIlIlIl, new Stretcherlayout(llllIlllIlII[0]));
      lllllllllllllllIlIlIIIlllIIllIIl.setAffectLayout((boolean)llllIlllIlII[1]);
      lllllllllllllllIlIlIIIlllIIllIIl.module = lllllllllllllllIlIlIIIlllIIlIlII;
      lllllllllllllllIlIlIIIlllIIllIIl.prepare();
   }

   public Module getModule() {
      return lllllllllllllllIlIlIIIlllIIIllll.module;
   }

   private static void lIlIIIIlIllIIl() {
      llllIlllIIlI = new String[llllIlllIlII[0]];
      llllIlllIIlI[llllIlllIlII[1]] = lIlIIIIlIllIII("GzEFCA==", "YXklP");
   }

   private static boolean lIlIIIIlIllllI(int var0) {
      return var0 == 0;
   }

   private static boolean lIlIIIIlIlllll(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIIIllIIIIl(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIIIIlIlllII() {
      llllIlllIlII = new int[4];
      llllIlllIlII[0] = " ".length();
      llllIlllIlII[1] = " ".length() << "   ".length() & (" ".length() << "   ".length() ^ -" ".length());
      llllIlllIlII[2] = ((147 ^ 150) << "   ".length() ^ 100 ^ 73) << " ".length();
      llllIlllIlII[3] = 58 + 107 - 14 + 0 ^ (207 ^ 134) << " ".length();
   }

   public void renderChildren() {
      super.renderChildren();
   }

   private static boolean lIlIIIIlIlllIl(Object var0) {
      return var0 == null;
   }

   private void prepare() {
      lllllllllllllllIlIlIIIllIllIllIl.getChildren().clear();
      if (lIlIIIIlIlllIl(lllllllllllllllIlIlIIIllIllIllIl.module)) {
         lllllllllllllllIlIlIIIllIllIllIl.setVisible((boolean)llllIlllIlII[1]);
      } else {
         if (lIlIIIIlIllllI(lllllllllllllllIlIlIIIllIllIllIl.module.settingList.isEmpty())) {
            Iterator lllllllllllllllIlIlIIIllIllIllII = lllllllllllllllIlIlIIIllIllIllIl.module.settingList.iterator();

            while(lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIllIllII.hasNext())) {
               final double lllllllllllllllIlIlIIIllIllIlIll = (Setting)lllllllllllllllIlIlIIIllIllIllII.next();
               if (lIlIIIIlIllllI(lllllllllllllllIlIlIIIllIllIlIll.isVisible())) {
                  "".length();
                  if ("   ".length() <= ((21 ^ 62) & ~(75 ^ 96))) {
                     return;
                  }
               } else {
                  boolean lllllllllllllllIlIlIIIllIllIlIlI = lllllllllllllllIlIlIIIllIllIlIll.getName();
                  boolean lllllllllllllllIlIlIIIllIlllIIlI = lllllllllllllllIlIlIIIllIllIlIll instanceof NumberSetting;
                  long lllllllllllllllIlIlIIIllIllIlIII = lllllllllllllllIlIlIIIllIllIlIll instanceof BooleanSetting;
                  boolean lllllllllllllllIlIlIIIllIlllIIII = lllllllllllllllIlIlIIIllIllIlIll instanceof EnumSetting;
                  Component[] var10001;
                  if (lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIllIlIll.getValue() instanceof Bind)) {
                     var10001 = new Component[llllIlllIlII[0]];
                     var10001[llllIlllIlII[1]] = new BindButton(llllIlllIIlI[llllIlllIlII[1]], lllllllllllllllIlIlIIIllIllIllIl.module);
                     lllllllllllllllIlIlIIIllIllIllIl.addChild(var10001);
                     "".length();
                  }

                  if (lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIlllIIlI)) {
                     double lllllllllllllllIlIlIIIllIllIIllI = (NumberSetting)lllllllllllllllIlIlIIIllIllIlIll;
                     boolean lllllllllllllllIlIlIIIllIllllIlI = lllllllllllllllIlIlIIIllIllIIllI.isBound();
                     double lllllllllllllllIlIlIIIllIllllIIl = Double.parseDouble(lllllllllllllllIlIlIIIllIllIIllI.getValue().toString());
                     if (lIlIIIIlIllllI(lllllllllllllllIlIlIIIllIllllIlI)) {
                        UnboundSlider lllllllllllllllIlIlIIIllIlllllll = new UnboundSlider(lllllllllllllllIlIlIIIllIllllIIl, lllllllllllllllIlIlIIIllIllIlIlI, lllllllllllllllIlIlIIIllIllIlIll instanceof IntegerSetting);
                        lllllllllllllllIlIlIIIllIlllllll.addPoof(new Slider.SliderPoof<UnboundSlider, Slider.SliderPoof.SliderPoofInfo>() {
                           public void execute(UnboundSlider lllllllllllllllIlIIlIlIllIIIllIl, Slider.SliderPoof.SliderPoofInfo lllllllllllllllIlIIlIlIllIIIlIlI) {
                              if (lIlIIlIlIlllll(lllllllllllllllIlIlIIIllIllIlIll instanceof IntegerSetting)) {
                                 lllllllllllllllIlIlIIIllIllIlIll.setValue((int)lllllllllllllllIlIIlIlIllIIIlIlI.getNewValue());
                                 "".length();
                                 "".length();
                                 if (" ".length() << " ".length() == -" ".length()) {
                                    return;
                                 }
                              } else if (lIlIIlIlIlllll(lllllllllllllllIlIlIIIllIllIlIll instanceof FloatSetting)) {
                                 lllllllllllllllIlIlIIIllIllIlIll.setValue((float)lllllllllllllllIlIIlIlIllIIIlIlI.getNewValue());
                                 "".length();
                                 "".length();
                                 if (((100 ^ 113) & ~(2 ^ 23)) > 0) {
                                    return;
                                 }
                              } else if (lIlIIlIlIlllll(lllllllllllllllIlIlIIIllIllIlIll instanceof DoubleSetting)) {
                                 lllllllllllllllIlIlIIIllIllIlIll.setValue(lllllllllllllllIlIIlIlIllIIIlIlI.getNewValue());
                                 "".length();
                              }

                              lllllllllllllllIlIlIIIllIllIllIl.setModule(lllllllllllllllIlIlIIIllIllIllIl.module);
                           }

                           private static boolean lIlIIlIlIlllll(int var0) {
                              return var0 != 0;
                           }
                        });
                        if (lIlIIIIllIIIII(lllllllllllllllIlIlIIIllIllIIllI.getMax())) {
                           lllllllllllllllIlIlIIIllIlllllll.setMax(lllllllllllllllIlIlIIIllIllIIllI.getMax().doubleValue());
                        }

                        if (lIlIIIIllIIIII(lllllllllllllllIlIlIIIllIllIIllI.getMin())) {
                           lllllllllllllllIlIlIIIllIlllllll.setMin(lllllllllllllllIlIlIIIllIllIIllI.getMin().doubleValue());
                        }

                        var10001 = new Component[llllIlllIlII[0]];
                        var10001[llllIlllIlII[1]] = lllllllllllllllIlIlIIIllIlllllll;
                        lllllllllllllllIlIlIIIllIllIllIl.addChild(var10001);
                        "".length();
                        "".length();
                        if (-" ".length() < -" ".length()) {
                           return;
                        }
                     } else {
                        double lllllllllllllllIlIlIIIllIllllllI = Double.parseDouble(lllllllllllllllIlIlIIIllIllIIllI.getMin().toString());
                        double lllllllllllllllIlIlIIIllIlllllIl = Double.parseDouble(lllllllllllllllIlIlIIIllIllIIllI.getMax().toString());
                        byte lllllllllllllllIlIlIIIllIllIIIII = new Slider(lllllllllllllllIlIlIIIllIllllIIl, lllllllllllllllIlIlIIIllIllllllI, lllllllllllllllIlIlIIIllIlllllIl, Slider.getDefaultStep(lllllllllllllllIlIlIIIllIllllllI, lllllllllllllllIlIlIIIllIlllllIl), lllllllllllllllIlIlIIIllIllIlIlI, lllllllllllllllIlIlIIIllIllIlIll instanceof IntegerSetting);
                        lllllllllllllllIlIlIIIllIllIIIII.addPoof(new Slider.SliderPoof<Slider, Slider.SliderPoof.SliderPoofInfo>() {
                           public void execute(Slider lllllllllllllllIIlllIlIIlllIIlll, Slider.SliderPoof.SliderPoofInfo lllllllllllllllIIlllIlIIlllIIlII) {
                              if (lIlIllllIIlIIl(lllllllllllllllIlIlIIIllIllIlIll instanceof IntegerSetting)) {
                                 lllllllllllllllIlIlIIIllIllIlIll.setValue((int)lllllllllllllllIIlllIlIIlllIIlII.getNewValue());
                                 "".length();
                                 "".length();
                                 if (" ".length() <= -" ".length()) {
                                    return;
                                 }
                              } else if (lIlIllllIIlIIl(lllllllllllllllIlIlIIIllIllIlIll instanceof FloatSetting)) {
                                 lllllllllllllllIlIlIIIllIllIlIll.setValue((float)lllllllllllllllIIlllIlIIlllIIlII.getNewValue());
                                 "".length();
                                 "".length();
                                 if (-" ".length() > 0) {
                                    return;
                                 }
                              } else if (lIlIllllIIlIIl(lllllllllllllllIlIlIIIllIllIlIll instanceof DoubleSetting)) {
                                 lllllllllllllllIlIlIIIllIllIlIll.setValue(lllllllllllllllIIlllIlIIlllIIlII.getNewValue());
                                 "".length();
                              }

                           }

                           private static boolean lIlIllllIIlIIl(int var0) {
                              return var0 != 0;
                           }
                        });
                        var10001 = new Component[llllIlllIlII[0]];
                        var10001[llllIlllIlII[1]] = lllllllllllllllIlIlIIIllIllIIIII;
                        lllllllllllllllIlIlIIIllIllIllIl.addChild(var10001);
                        "".length();
                     }

                     "".length();
                     if (-" ".length() == " ".length()) {
                        return;
                     }
                  } else if (lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIllIlIII)) {
                     final double lllllllllllllllIlIlIIIllIllIIllI = new CheckButton(lllllllllllllllIlIlIIIllIllIlIlI);
                     lllllllllllllllIlIlIIIllIllIIllI.setToggled((Boolean)((BooleanSetting)lllllllllllllllIlIlIIIllIllIlIll).getValue());
                     lllllllllllllllIlIlIIIllIllIIllI.addPoof(new CheckButton.CheckButtonPoof<CheckButton, CheckButton.CheckButtonPoof.CheckButtonPoofInfo>() {
                        public void execute(CheckButton lllllllllllllllIlIlIIlIlIIIllIlI, CheckButton.CheckButtonPoof.CheckButtonPoofInfo lllllllllllllllIlIlIIlIlIIIlIlll) {
                           if (lIlIIIIIllIlll(lllllllllllllllIlIlIIlIlIIIlIlll.getAction(), CheckButton.CheckButtonPoof.CheckButtonPoofInfo.CheckButtonPoofInfoAction.TOGGLE)) {
                              lllllllllllllllIlIlIIIllIllIlIll.setValue(lllllllllllllllIlIlIIIllIllIIllI.isToggled());
                              "".length();
                              lllllllllllllllIlIlIIIllIllIllIl.setModule(lllllllllllllllIlIlIIIllIllIllIl.module);
                           }

                        }

                        private static boolean lIlIIIIIllIlll(Object var0, Object var1) {
                           return var0 == var1;
                        }
                     });
                     var10001 = new Component[llllIlllIlII[0]];
                     var10001[llllIlllIlII[1]] = lllllllllllllllIlIlIIIllIllIIllI;
                     lllllllllllllllIlIlIIIllIllIllIl.addChild(var10001);
                     "".length();
                     "".length();
                     if (" ".length() << " ".length() < " ".length() << " ".length()) {
                        return;
                     }
                  } else if (lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIlllIIII)) {
                     Class<? extends Enum> lllllllllllllllIlIlIIIllIllIIllI = ((EnumSetting)lllllllllllllllIlIlIIIllIllIlIll).clazz;
                     final Object[] lllllllllllllllIlIlIIIllIlllIllI = lllllllllllllllIlIlIIIllIllIIllI.getEnumConstants();
                     float lllllllllllllllIlIlIIIllIllIIlII = (String[])Arrays.stream(lllllllllllllllIlIlIIIllIlllIllI).map((lllllllllllllllIlIlIIIllIlIlIIII) -> {
                        return lllllllllllllllIlIlIIIllIlIlIIII.toString().toUpperCase();
                     }).toArray((lllllllllllllllIlIlIIIllIlIlIIll) -> {
                        return new String[lllllllllllllllIlIlIIIllIlIlIIll];
                     });
                     EnumButton lllllllllllllllIlIlIIIllIlllIlII = new EnumButton(lllllllllllllllIlIlIIIllIllIlIlI, lllllllllllllllIlIlIIIllIllIIlII);
                     lllllllllllllllIlIlIIIllIlllIlII.addPoof(new EnumButton.EnumbuttonIndexPoof<EnumButton, EnumButton.EnumbuttonIndexPoof.EnumbuttonInfo>() {
                        public void execute(EnumButton lllllllllllllllIlIlIlllllIlIlIII, EnumButton.EnumbuttonIndexPoof.EnumbuttonInfo lllllllllllllllIlIlIlllllIlIIlIl) {
                           lllllllllllllllIlIlIIIllIllIlIll.setValue(lllllllllllllllIlIlIIIllIlllIllI[lllllllllllllllIlIlIlllllIlIIlIl.getNewIndex()]);
                           "".length();
                           lllllllllllllllIlIlIIIllIllIllIl.setModule(lllllllllllllllIlIlIIIllIllIllIl.module);
                        }
                     });
                     lllllllllllllllIlIlIIIllIlllIlII.setIndex(Arrays.asList(lllllllllllllllIlIlIIIllIlllIllI).indexOf(lllllllllllllllIlIlIIIllIllIlIll.getValue()));
                     var10001 = new Component[llllIlllIlII[0]];
                     var10001[llllIlllIlII[1]] = lllllllllllllllIlIlIIIllIlllIlII;
                     lllllllllllllllIlIlIIIllIllIllIl.addChild(var10001);
                     "".length();
                  }

                  "".length();
                  if (" ".length() << " ".length() <= 0) {
                     return;
                  }
               }
            }
         }

         if (lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIllIllIl.children.isEmpty())) {
            lllllllllllllllIlIlIIIllIllIllIl.setVisible((boolean)llllIlllIlII[1]);
         } else {
            lllllllllllllllIlIlIIIllIllIllIl.setVisible((boolean)llllIlllIlII[0]);
         }
      }
   }

   private static String lIlIIIIlIllIII(String lllllllllllllllIlIlIIIllIIllllll, String lllllllllllllllIlIlIIIllIIlllllI) {
      lllllllllllllllIlIlIIIllIIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      int lllllllllllllllIlIlIIIllIIllllIl = new StringBuilder();
      boolean lllllllllllllllIlIlIIIllIIllllII = lllllllllllllllIlIlIIIllIIlllllI.toCharArray();
      byte lllllllllllllllIlIlIIIllIIlllIll = llllIlllIlII[1];
      char lllllllllllllllIlIlIIIllIIlllIlI = lllllllllllllllIlIlIIIllIIllllll.toCharArray();
      long lllllllllllllllIlIlIIIllIIlllIIl = lllllllllllllllIlIlIIIllIIlllIlI.length;
      int lllllllllllllllIlIlIIIllIIlllIII = llllIlllIlII[1];

      do {
         if (!lIlIIIIllIIIIl(lllllllllllllllIlIlIIIllIIlllIII, lllllllllllllllIlIlIIIllIIlllIIl)) {
            return String.valueOf(lllllllllllllllIlIlIIIllIIllllIl);
         }

         boolean lllllllllllllllIlIlIIIllIIllIlll = lllllllllllllllIlIlIIIllIIlllIlI[lllllllllllllllIlIlIIIllIIlllIII];
         lllllllllllllllIlIlIIIllIIllllIl.append((char)(lllllllllllllllIlIlIIIllIIllIlll ^ lllllllllllllllIlIlIIIllIIllllII[lllllllllllllllIlIlIIIllIIlllIll % lllllllllllllllIlIlIIIllIIllllII.length]));
         "".length();
         ++lllllllllllllllIlIlIIIllIIlllIll;
         ++lllllllllllllllIlIlIIIllIIlllIII;
         "".length();
      } while(null == null);

      return null;
   }

   private static boolean lIlIIIIllIIIII(Object var0) {
      return var0 != null;
   }

   static {
      lIlIIIIlIlllII();
      lIlIIIIlIllIIl();
   }

   public void setModule(Module lllllllllllllllIlIlIIIllIlIllIIl) {
      lllllllllllllllIlIlIIIllIlIllIII.module = lllllllllllllllIlIlIIIllIlIllIIl;
      lllllllllllllllIlIlIIIllIlIllIII.setMinimumWidth((int)((float)lllllllllllllllIlIlIIIllIlIllIII.getParent().getWidth() * 0.9F));
      "".length();
      lllllllllllllllIlIlIIIllIlIllIII.prepare();
      lllllllllllllllIlIlIIIllIlIllIII.setAffectLayout((boolean)llllIlllIlII[1]);
      Iterator lllllllllllllllIlIlIIIllIlIlIllI = lllllllllllllllIlIlIIIllIlIllIII.children.iterator();

      do {
         if (!lIlIIIIlIlllll(lllllllllllllllIlIlIIIllIlIlIllI.hasNext())) {
            return;
         }

         Component lllllllllllllllIlIlIIIllIlIllIll = (Component)lllllllllllllllIlIlIIIllIlIlIllI.next();
         lllllllllllllllIlIlIIIllIlIllIll.setWidth(lllllllllllllllIlIlIIIllIlIllIII.getWidth() - llllIlllIlII[2]);
         lllllllllllllllIlIlIIIllIlIllIll.setX(llllIlllIlII[3]);
         "".length();
      } while(null == null);

   }
}
