package rr.snowhack.snow.util;

public final class Timer {
   // $FF: synthetic field
   private static final int[] lIIIIIIlllIll;
   // $FF: synthetic field
   private long time = -1L;

   private static boolean lIlIlIIIIIlIlI(int var0) {
      return var0 >= 0;
   }

   private static int lIlIlIIIIIlIIl(double var0, double var2) {
      double var4;
      return (var4 = var0 - var2) == 0.0D ? 0 : (var4 < 0.0D ? -1 : 1);
   }

   public boolean passed(double lllllllllllllllIlIIIllIlIlllIIII) {
      int var10000;
      if (lIlIlIIIIIlIlI(lIlIlIIIIIlIIl((double)(System.currentTimeMillis() - lllllllllllllllIlIIIllIlIllIllll.time), lllllllllllllllIlIIIllIlIlllIIII))) {
         var10000 = lIIIIIIlllIll[0];
         "".length();
         if (-" ".length() >= " ".length() << (" ".length() << " ".length())) {
            return (boolean)(" ".length() << ((152 ^ 133) << (" ".length() << " ".length()) ^ 179 ^ 194) & (" ".length() << ((98 ^ 49) << " ".length() ^ 61 + 161 - 119 + 60) ^ -" ".length()));
         }
      } else {
         var10000 = lIIIIIIlllIll[1];
      }

      return (boolean)var10000;
   }

   public void reset() {
      lllllllllllllllIlIIIllIlIllIllII.time = System.currentTimeMillis();
   }

   static {
      lIlIlIIIIIlIII();
   }

   public void setTime(long lllllllllllllllIlIIIllIlIllIIIlI) {
      lllllllllllllllIlIIIllIlIllIIlIl.time = lllllllllllllllIlIIIllIlIllIIIlI;
   }

   private static void lIlIlIIIIIlIII() {
      lIIIIIIlllIll = new int[2];
      lIIIIIIlllIll[0] = " ".length();
      lIIIIIIlllIll[1] = (30 ^ 57 ^ (128 ^ 153) << (" ".length() << " ".length())) & (75 ^ 10 ^ " ".length() << " ".length() ^ -" ".length());
   }

   public long getTime() {
      return lllllllllllllllIlIIIllIlIllIlIII.time;
   }
}
