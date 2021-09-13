package rr.snowhack.snow.util;

public class HudComponent {
   // $FF: synthetic field
   private float y;
   // $FF: synthetic field
   private static final int[] lIIIIlIIIlIII;
   // $FF: synthetic field
   private float w;
   // $FF: synthetic field
   private String name;
   // $FF: synthetic field
   private float h;
   // $FF: synthetic field
   private boolean visible;
   // $FF: synthetic field
   private float x;

   public void setVisible(boolean lllllllllllllllIlIIIIIlIIIIIllll) {
      lllllllllllllllIlIIIIIlIIIIIlllI.visible = lllllllllllllllIlIIIIIlIIIIIllll;
   }

   private static boolean lIlIlIlIlIlIlI(int var0) {
      return var0 > 0;
   }

   static {
      lIlIlIlIlIlIII();
   }

   public boolean collidesWith(HudComponent lllllllllllllllIlIIIIIlIIlIIlIIl) {
      int var10000;
      if (lIlIlIlIlIlIlI(lIlIlIlIlIlIIl(lllllllllllllllIlIIIIIlIIlIIIllI.x + lllllllllllllllIlIIIIIlIIlIIIllI.w, lllllllllllllllIlIIIIIlIIlIIlIIl.x)) && lIlIlIlIlIlIlI(lIlIlIlIlIlIIl(lllllllllllllllIlIIIIIlIIlIIlIIl.x + lllllllllllllllIlIIIIIlIIlIIlIIl.w, lllllllllllllllIlIIIIIlIIlIIIllI.x))) {
         var10000 = lIIIIlIIIlIII[0];
         "".length();
         if ((150 ^ 147) == 0) {
            return (boolean)((232 ^ 187) & ~(249 ^ 170));
         }
      } else {
         var10000 = lIIIIlIIIlIII[1];
      }

      boolean lllllllllllllllIlIIIIIlIIlIIlIII = var10000;
      if (lIlIlIlIlIlIlI(lIlIlIlIlIlIIl(lllllllllllllllIlIIIIIlIIlIIIllI.y + lllllllllllllllIlIIIIIlIIlIIIllI.h, lllllllllllllllIlIIIIIlIIlIIlIIl.y)) && lIlIlIlIlIlIlI(lIlIlIlIlIlIIl(lllllllllllllllIlIIIIIlIIlIIlIIl.y + lllllllllllllllIlIIIIIlIIlIIlIIl.h, lllllllllllllllIlIIIIIlIIlIIIllI.y))) {
         var10000 = lIIIIlIIIlIII[0];
         "".length();
         if (" ".length() << (" ".length() << " ".length()) == 0) {
            return (boolean)((215 ^ 128 ^ (54 ^ 63) << "   ".length()) & ((48 ^ 111) << " ".length() ^ 103 + 41 - 65 + 82 ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIlIIIlIII[1];
      }

      boolean lllllllllllllllIlIIIIIlIIlIIIlll = var10000;
      if (lIlIlIlIlIlIll(lllllllllllllllIlIIIIIlIIlIIlIII) && lIlIlIlIlIlIll(lllllllllllllllIlIIIIIlIIlIIIlll)) {
         var10000 = lIIIIlIIIlIII[0];
         "".length();
         if (" ".length() != " ".length()) {
            return (boolean)((57 ^ 60) & ~(167 ^ 162));
         }
      } else {
         var10000 = lIIIIlIIIlIII[1];
      }

      return (boolean)var10000;
   }

   public void mouseClick(int lllllllllllllllIlIIIIIlIIlIlIlIl, int lllllllllllllllIlIIIIIlIIlIlIlII, int lllllllllllllllIlIIIIIlIIlIlIIll) {
   }

   private static boolean lIlIlIlIlIlIll(int var0) {
      return var0 != 0;
   }

   public void setW(float lllllllllllllllIlIIIIIlIIIlIlIlI) {
      lllllllllllllllIlIIIIIlIIIlIlIll.w = lllllllllllllllIlIIIIIlIIIlIlIlI;
   }

   public HudComponent(float lllllllllllllllIlIIIIIlIIllIIIlI, float lllllllllllllllIlIIIIIlIIllIIllI, float lllllllllllllllIlIIIIIlIIllIIlIl, float lllllllllllllllIlIIIIIlIIlIlllll) {
      lllllllllllllllIlIIIIIlIIllIlIII.x = lllllllllllllllIlIIIIIlIIllIIIlI;
      lllllllllllllllIlIIIIIlIIllIlIII.y = lllllllllllllllIlIIIIIlIIllIIllI;
      lllllllllllllllIlIIIIIlIIllIlIII.w = lllllllllllllllIlIIIIIlIIllIIlIl;
      lllllllllllllllIlIIIIIlIIllIlIII.h = lllllllllllllllIlIIIIIlIIlIlllll;
   }

   public void mouseClickMove(int lllllllllllllllIlIIIIIlIIlIllIIl, int lllllllllllllllIlIIIIIlIIlIllIII, int lllllllllllllllIlIIIIIlIIlIlIlll) {
   }

   private static int lIlIlIlIlIlIIl(float var0, float var1) {
      float var2;
      return (var2 = var0 - var1) == 0.0F ? 0 : (var2 < 0.0F ? -1 : 1);
   }

   public void setName(String lllllllllllllllIlIIIIIlIIIIllIII) {
      lllllllllllllllIlIIIIIlIIIIlIlll.name = lllllllllllllllIlIIIIIlIIIIllIII;
   }

   public HudComponent() {
   }

   public String getName() {
      return lllllllllllllllIlIIIIIlIIIIlllIl.name;
   }

   public float getW() {
      return lllllllllllllllIlIIIIIlIIIlIlllI.w;
   }

   public boolean isVisible() {
      return lllllllllllllllIlIIIIIlIIIIlIIll.visible;
   }

   public void render(int lllllllllllllllIlIIIIIlIIlIlllIl, int lllllllllllllllIlIIIIIlIIlIlllII, float lllllllllllllllIlIIIIIlIIlIllIll) {
   }

   public void setH(float lllllllllllllllIlIIIIIlIIIlIIIIl) {
      lllllllllllllllIlIIIIIlIIIlIIIII.h = lllllllllllllllIlIIIIIlIIIlIIIIl;
   }

   public float getH() {
      return lllllllllllllllIlIIIIIlIIIlIIllI.h;
   }

   public float getY() {
      return lllllllllllllllIlIIIIIlIIIllIlll.y;
   }

   public void mouseRelease(int lllllllllllllllIlIIIIIlIIlIlIIIl, int lllllllllllllllIlIIIIIlIIlIlIIII, int lllllllllllllllIlIIIIIlIIlIIllll) {
   }

   public void setX(float lllllllllllllllIlIIIIIlIIIlllIlI) {
      lllllllllllllllIlIIIIIlIIIllllIl.x = lllllllllllllllIlIIIIIlIIIlllIlI;
   }

   public float getX() {
      return lllllllllllllllIlIIIIIlIIlIIIIII.x;
   }

   public void setY(float lllllllllllllllIlIIIIIlIIIllIIIl) {
      lllllllllllllllIlIIIIIlIIIllIlII.y = lllllllllllllllIlIIIIIlIIIllIIIl;
   }

   private static void lIlIlIlIlIlIII() {
      lIIIIlIIIlIII = new int[2];
      lIIIIlIIIlIII[0] = " ".length();
      lIIIIlIIIlIII[1] = (87 + 117 - 90 + 15 ^ (115 ^ 82) << (" ".length() << " ".length())) << (" ".length() << " ".length()) & ((206 ^ 137 ^ (83 ^ 114) << " ".length()) << (" ".length() << " ".length()) ^ -" ".length());
   }
}
