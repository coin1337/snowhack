package rr.snowhack.snow.util;

import java.util.Set;
import org.reflections.Reflections;
import org.reflections.scanners.Scanner;

public class ClassFinder {
   // $FF: synthetic field
   private static final int[] lllllllIIIIl;

   public static Set<Class> findClasses(String lllllllllllllllIlIIlIlIlIllIIlll, Class lllllllllllllllIlIIlIlIlIllIIllI) {
      boolean lllllllllllllllIlIIlIlIlIllIIIlI = new Reflections(lllllllllllllllIlIIlIlIlIllIIlll, new Scanner[lllllllIIIIl[0]]);
      return lllllllllllllllIlIIlIlIlIllIIIlI.getSubTypesOf(lllllllllllllllIlIIlIlIlIllIIllI);
   }

   private static void lIlIIlIllIIIIl() {
      lllllllIIIIl = new int[1];
      lllllllIIIIl[0] = (40 ^ 109 ^ " ".length() << "   ".length()) & ((51 ^ 36) << (" ".length() << " ".length()) ^ 191 ^ 174 ^ -" ".length());
   }

   static {
      lIlIIlIllIIIIl();
   }
}
