package rr.snowhack.snow.gui.snow.theme.ui;

import rr.snowhack.snow.gui.rgui.render.AbstractComponentUI;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.rgui.render.theme.AbstractTheme;
import rr.snowhack.snow.gui.snow.SnowGUI;
import rr.snowhack.snow.gui.snow.theme.staticui.InventoryUI;
import rr.snowhack.snow.gui.snow.theme.staticui.KeyStrokeUI;
import rr.snowhack.snow.gui.snow.theme.staticui.RadarUI;
import rr.snowhack.snow.gui.snow.theme.staticui.TabGuiUI;

public class Theme extends AbstractTheme {
   // $FF: synthetic field
   FontRenderer fontRenderer;

   public Theme() {
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootButtonUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new Theme.GUIUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootGroupboxUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new FrameUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootScrollpaneUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootInputFieldUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootLabelUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootChatUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootCheckButtonUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new ActiveModulesUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new SettingsPanelUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootSliderUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new EnumbuttonUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RootColorizedCheckButtonUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new UnboundSliderUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new InventoryUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new KeyStrokeUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new RadarUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.installUI(new TabGuiUI());
      lllllllllllllllIlIIlIIlIIIIIIIII.fontRenderer = SnowGUI.fontRenderer;
   }

   public FontRenderer getFontRenderer() {
      return lllllllllllllllIlIIlIIIlllllllIl.fontRenderer;
   }

   public class GUIUI extends AbstractComponentUI<SnowGUI> {
   }
}
