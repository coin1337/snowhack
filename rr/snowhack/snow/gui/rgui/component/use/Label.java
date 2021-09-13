package rr.snowhack.snow.gui.rgui.component.use;

import rr.snowhack.snow.gui.rgui.component.AlignedComponent;
import rr.snowhack.snow.gui.rgui.render.font.FontRenderer;
import rr.snowhack.snow.gui.rgui.render.theme.Theme;

public class Label extends AlignedComponent {
   // $FF: synthetic field
   String text;
   // $FF: synthetic field
   boolean shadow;
   // $FF: synthetic field
   boolean multiline;
   // $FF: synthetic field
   private static final int[] lIIIIIIllIlIl;
   // $FF: synthetic field
   FontRenderer fontRenderer;

   public FontRenderer getFontRenderer() {
      return lllllllllllllllIlIIIllIlllIIIlll.fontRenderer;
   }

   public void addText(String lllllllllllllllIlIIIllIlllIlllIl) {
      lllllllllllllllIlIIIllIlllIlllII.setText(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIllIlllIlllII.getText()).append(lllllllllllllllIlIIIllIlllIlllIl)));
   }

   public void setTheme(Theme lllllllllllllllIlIIIllIllIlllIlI) {
      super.setTheme(lllllllllllllllIlIIIllIllIlllIlI);
      lllllllllllllllIlIIIllIllIlllIll.setFontRenderer(lllllllllllllllIlIIIllIllIlllIlI.getFontRenderer());
      lllllllllllllllIlIIIllIllIlllIll.getTheme().getUIForComponent(lllllllllllllllIlIIIllIllIlllIll).handleSizeComponent(lllllllllllllllIlIIIllIllIlllIll);
   }

   public void setFontRenderer(FontRenderer lllllllllllllllIlIIIllIlllIIIIlI) {
      lllllllllllllllIlIIIllIlllIIIIll.fontRenderer = lllllllllllllllIlIIIllIlllIIIIlI;
   }

   public Label(String lllllllllllllllIlIIIllIlllllIIlI, boolean lllllllllllllllIlIIIllIlllllIlII) {
      lllllllllllllllIlIIIllIlllllIIll.text = lllllllllllllllIlIIIllIlllllIIlI;
      lllllllllllllllIlIIIllIlllllIIll.multiline = lllllllllllllllIlIIIllIlllllIlII;
      lllllllllllllllIlIIIllIlllllIIll.setAlignment(AlignedComponent.Alignment.LEFT);
   }

   public void addLine(String lllllllllllllllIlIIIllIlllIlIlIl) {
      if (lIlIlIIIIIIIlI(lllllllllllllllIlIIIllIlllIlIllI.getText().isEmpty())) {
         lllllllllllllllIlIIIllIlllIlIllI.setText(lllllllllllllllIlIIIllIlllIlIlIl);
         "".length();
         if ((((154 ^ 143) << "   ".length() ^ 176 + 95 - 209 + 129) << (" ".length() << " ".length()) & (((129 ^ 136) << (" ".length() << " ".length()) ^ 38 ^ 21) << (" ".length() << " ".length()) ^ -" ".length())) > 0) {
            return;
         }
      } else {
         lllllllllllllllIlIIIllIlllIlIllI.setText(String.valueOf((new StringBuilder()).append(lllllllllllllllIlIIIllIlllIlIllI.getText()).append(System.lineSeparator()).append(lllllllllllllllIlIIIllIlllIlIlIl)));
         lllllllllllllllIlIIIllIlllIlIllI.multiline = (boolean)lIIIIIIllIlIl[1];
      }

   }

   public String[] getLines() {
      String[] lllllllllllllllIlIIIllIllllIlIIl;
      if (lIlIlIIIIIIIlI(lllllllllllllllIlIIIllIllllIlIlI.isMultiline())) {
         lllllllllllllllIlIIIllIllllIlIIl = lllllllllllllllIlIIIllIllllIlIlI.getText().split(System.lineSeparator());
         "".length();
         if (null != null) {
            return null;
         }
      } else {
         String[] var10000 = new String[lIIIIIIllIlIl[1]];
         var10000[lIIIIIIllIlIl[0]] = lllllllllllllllIlIIIllIllllIlIlI.getText();
         lllllllllllllllIlIIIllIllllIlIIl = var10000;
      }

      return lllllllllllllllIlIIIllIllllIlIIl;
   }

   public Label(String lllllllllllllllIlIIIllIlllllllII) {
      this(lllllllllllllllIlIIIllIlllllllII, (boolean)lIIIIIIllIlIl[0]);
   }

   private static void lIlIlIIIIIIIIl() {
      lIIIIIIllIlIl = new int[2];
      lIIIIIIllIlIl[0] = ((147 ^ 158) << "   ".length() ^ 28 ^ 103) << " ".length() & (((88 ^ 51) << " ".length() ^ 69 + 160 - 182 + 150) << " ".length() ^ -" ".length());
      lIIIIIIllIlIl[1] = " ".length();
   }

   private static boolean lIlIlIIIIIIIlI(int var0) {
      return var0 != 0;
   }

   public void setShadow(boolean lllllllllllllllIlIIIllIllIllIllI) {
      lllllllllllllllIlIIIllIllIllIlll.shadow = lllllllllllllllIlIIIllIllIllIllI;
   }

   public void setMultiline(boolean lllllllllllllllIlIIIllIlllIIlllI) {
      lllllllllllllllIlIIIllIlllIIllIl.multiline = lllllllllllllllIlIIIllIlllIIlllI;
   }

   public void setText(String lllllllllllllllIlIIIllIllllIIIIl) {
      lllllllllllllllIlIIIllIllllIIlII.text = lllllllllllllllIlIIIllIllllIIIIl;
      lllllllllllllllIlIIIllIllllIIlII.getTheme().getUIForComponent(lllllllllllllllIlIIIllIllllIIlII).handleSizeComponent(lllllllllllllllIlIIIllIllllIIlII);
   }

   public boolean isMultiline() {
      return lllllllllllllllIlIIIllIlllIlIIlI.multiline;
   }

   static {
      lIlIlIIIIIIIIl();
   }

   public String getText() {
      return lllllllllllllllIlIIIllIllllIllll.text;
   }

   public boolean isShadow() {
      return lllllllllllllllIlIIIllIlllIIlIIl.shadow;
   }
}
