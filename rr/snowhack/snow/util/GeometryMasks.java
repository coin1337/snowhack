package rr.snowhack.snow.util;

import java.util.HashMap;
import net.minecraft.util.EnumFacing;

public final class GeometryMasks {
   // $FF: synthetic field
   public static final HashMap<EnumFacing, Integer> FACEMAP;
   // $FF: synthetic field
   private static final int[] lllIlllIlIll;

   static {
      lIIlllIlIlIllI();
      FACEMAP = new HashMap();
      FACEMAP.put(EnumFacing.DOWN, lllIlllIlIll[0]);
      "".length();
      FACEMAP.put(EnumFacing.WEST, lllIlllIlIll[1]);
      "".length();
      FACEMAP.put(EnumFacing.NORTH, lllIlllIlIll[2]);
      "".length();
      FACEMAP.put(EnumFacing.SOUTH, lllIlllIlIll[3]);
      "".length();
      FACEMAP.put(EnumFacing.EAST, lllIlllIlIll[4]);
      "".length();
      FACEMAP.put(EnumFacing.UP, lllIlllIlIll[5]);
      "".length();
   }

   private static void lIIlllIlIlIllI() {
      lllIlllIlIll = new int[6];
      lllIlllIlIll[0] = " ".length();
      lllIlllIlIll[1] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIlllIlIll[2] = " ".length() << (" ".length() << " ".length());
      lllIlllIlIll[3] = " ".length() << "   ".length();
      lllIlllIlIll[4] = " ".length() << (65 ^ 68);
      lllIlllIlIll[5] = " ".length() << " ".length();
   }

   public static final class Quad {
      // $FF: synthetic field
      public static final int EAST;
      // $FF: synthetic field
      public static final int SOUTH;
      // $FF: synthetic field
      public static final int WEST;
      // $FF: synthetic field
      public static final int DOWN;
      // $FF: synthetic field
      public static final int ALL;
      // $FF: synthetic field
      public static final int UP;
      // $FF: synthetic field
      private static final int[] lllIIllllIll;
      // $FF: synthetic field
      public static final int NORTH;

      static {
         lIIlIllllllIIl();
         NORTH = lllIIllllIll[0];
         UP = lllIIllllIll[1];
         WEST = lllIIllllIll[2];
         EAST = lllIIllllIll[3];
         SOUTH = lllIIllllIll[4];
         DOWN = lllIIllllIll[5];
         ALL = lllIIllllIll[6];
      }

      private static void lIIlIllllllIIl() {
         lllIIllllIll = new int[7];
         lllIIllllIll[0] = " ".length() << (" ".length() << " ".length());
         lllIIllllIll[1] = " ".length() << " ".length();
         lllIIllllIll[2] = " ".length() << (" ".length() << (" ".length() << " ".length()));
         lllIIllllIll[3] = " ".length() << (189 ^ 184);
         lllIIllllIll[4] = " ".length() << "   ".length();
         lllIIllllIll[5] = " ".length();
         lllIIllllIll[6] = 164 ^ 155;
      }
   }

   public static final class Line {
      // $FF: synthetic field
      public static final int DOWN_WEST;
      // $FF: synthetic field
      public static final int UP_EAST;
      // $FF: synthetic field
      public static final int SOUTH_EAST;
      // $FF: synthetic field
      public static final int UP_SOUTH;
      // $FF: synthetic field
      public static final int ALL;
      // $FF: synthetic field
      public static final int UP_WEST;
      // $FF: synthetic field
      public static final int NORTH_WEST;
      // $FF: synthetic field
      public static final int DOWN_NORTH;
      // $FF: synthetic field
      public static final int DOWN_EAST;
      // $FF: synthetic field
      public static final int DOWN_SOUTH;
      // $FF: synthetic field
      private static final int[] lIIIIIlIIIlII;
      // $FF: synthetic field
      public static final int UP_NORTH;
      // $FF: synthetic field
      public static final int NORTH_EAST;
      // $FF: synthetic field
      public static final int SOUTH_WEST;

      static {
         lIlIlIIIIllIlI();
         UP_NORTH = lIIIIIlIIIlII[0];
         ALL = lIIIIIlIIIlII[1];
         DOWN_EAST = lIIIIIlIIIlII[2];
         SOUTH_EAST = lIIIIIlIIIlII[3];
         DOWN_WEST = lIIIIIlIIIlII[4];
         UP_EAST = lIIIIIlIIIlII[5];
         UP_WEST = lIIIIIlIIIlII[6];
         DOWN_SOUTH = lIIIIIlIIIlII[7];
         UP_SOUTH = lIIIIIlIIIlII[8];
         NORTH_EAST = lIIIIIlIIIlII[9];
         DOWN_NORTH = lIIIIIlIIIlII[10];
         NORTH_WEST = lIIIIIlIIIlII[11];
         SOUTH_WEST = lIIIIIlIIIlII[12];
      }

      private static void lIlIlIIIIllIlI() {
         lIIIIIlIIIlII = new int[13];
         lIIIIIlIIIlII[0] = "   ".length() << " ".length();
         lIIIIIlIIIlII[1] = 127 ^ 64;
         lIIIIIlIIIlII[2] = 21 ^ 52;
         lIIIIIlIIIlII[3] = (5 ^ 0) << "   ".length();
         lIIIIIlIIIlII[4] = 56 ^ 41;
         lIIIIIlIIIlII[5] = (148 ^ 133) << " ".length();
         lIIIIIlIIIlII[6] = (104 ^ 97) << " ".length();
         lIIIIIlIIIlII[7] = 12 ^ 119 ^ (64 ^ 121) << " ".length();
         lIIIIIlIIIlII[8] = (75 ^ 78) << " ".length();
         lIIIIIlIIIlII[9] = (153 ^ 144) << (" ".length() << " ".length());
         lIIIIIlIIIlII[10] = 172 ^ 169;
         lIIIIIlIIIlII[11] = (174 ^ 171) << (" ".length() << " ".length());
         lIIIIIlIIIlII[12] = "   ".length() << "   ".length();
      }
   }
}
