package rr.snowhack.snow.command.syntax.parsers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import rr.snowhack.snow.command.syntax.SyntaxChunk;

public class BlockParser extends AbstractParser {
   // $FF: synthetic field
   private static final String[] lIIIIlIllllIl;
   // $FF: synthetic field
   private static final int[] lIIIIllIIIIlI;
   // $FF: synthetic field
   private static HashMap<String, Block> blockNames;

   private static void lIlIlIlllIllIl() {
      lIIIIlIllllIl = new String[lIIIIllIIIIlI[15]];
      lIIIIlIllllIl[lIIIIllIIIIlI[0]] = lIlIlIlllIIllI("lypKbI+ayMOldGPP7lHSUg==", "IwEqr");
      lIIIIlIllllIl[lIIIIllIIIIlI[1]] = lIlIlIlllIIlll("", "BBGox");
      lIIIIlIllllIl[lIIIIllIIIIlI[2]] = lIlIlIlllIIllI("tAdEUHISUTQ=", "WfehC");
      lIIIIlIllllIl[lIIIIllIIIIlI[3]] = lIlIlIlllIlIII("vUdtSB1gFRE=", "HhmQU");
      lIIIIlIllllIl[lIIIIllIIIIlI[4]] = lIlIlIlllIIlll("", "txtfW");
      lIIIIlIllllIl[lIIIIllIIIIlI[5]] = lIlIlIlllIIllI("r6F4M0LwSTU=", "rboFU");
      lIIIIlIllllIl[lIIIIllIIIIlI[6]] = lIlIlIlllIIllI("vCU9M/8DxeQ=", "tfWlc");
      lIIIIlIllllIl[lIIIIllIIIIlI[7]] = lIlIlIlllIlIII("r6TFJ+hLsPQ=", "NgSvu");
      lIIIIlIllllIl[lIIIIllIIIIlI[8]] = lIlIlIlllIlIII("94yt0ryGTfQ=", "TSyzB");
      lIIIIlIllllIl[lIIIIllIIIIlI[9]] = lIlIlIlllIIlll("Oy4rAjIkJiMTaw==", "VGEgQ");
      lIIIIlIllllIl[lIIIIllIIIIlI[10]] = lIlIlIlllIlIII("8Mx4dxLI8pM=", "ktqbP");
      lIIIIlIllllIl[lIIIIllIIIIlI[11]] = lIlIlIlllIIllI("8o9hlKu878I=", "SSkEn");
      lIIIIlIllllIl[lIIIIllIIIIlI[12]] = lIlIlIlllIIlll("", "iSgTk");
      lIIIIlIllllIl[lIIIIllIIIIlI[13]] = lIlIlIlllIlIII("iJfDsNPXbKc=", "BJlLf");
      lIIIIlIllllIl[lIIIIllIIIIlI[14]] = lIlIlIlllIIlll("", "SecdY");
   }

   private static void lIlIlIllllIIlI() {
      lIIIIllIIIIlI = new int[16];
      lIIIIllIIIIlI[0] = (114 ^ 51 ^ (38 ^ 15) << " ".length()) << (" ".length() << " ".length()) & ((238 ^ 173 ^ (138 ^ 143) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length()) ^ -" ".length());
      lIIIIllIIIIlI[1] = " ".length();
      lIIIIllIIIIlI[2] = " ".length() << " ".length();
      lIIIIllIIIIlI[3] = "   ".length();
      lIIIIllIIIIlI[4] = " ".length() << (" ".length() << " ".length());
      lIIIIllIIIIlI[5] = 134 ^ 131;
      lIIIIllIIIIlI[6] = "   ".length() << " ".length();
      lIIIIllIIIIlI[7] = 177 ^ 182;
      lIIIIllIIIIlI[8] = " ".length() << "   ".length();
      lIIIIllIIIIlI[9] = 52 ^ 61;
      lIIIIllIIIIlI[10] = ("   ".length() << " ".length() ^ "   ".length()) << " ".length();
      lIIIIllIIIIlI[11] = (102 ^ 69) << " ".length() ^ 46 ^ 99;
      lIIIIllIIIIlI[12] = "   ".length() << (" ".length() << " ".length());
      lIIIIllIIIIlI[13] = 136 + 35 - 109 + 89 ^ (109 ^ 32) << " ".length();
      lIIIIllIIIIlI[14] = (111 ^ 8 ^ "   ".length() << (35 ^ 38)) << " ".length();
      lIIIIllIIIIlI[15] = 116 ^ 125 ^ "   ".length() << " ".length();
   }

   public static String getNameFromBlock(Block lllllllllllllllIIllllllIlIIIllIl) {
      return lIlIlIllllIIll(blockNames.containsValue(lllllllllllllllIIllllllIlIIIllIl)) ? null : (String)getKeyFromValue(blockNames, lllllllllllllllIIllllllIlIIIllIl);
   }

   private static boolean lIlIlIllllIIll(int var0) {
      return var0 == 0;
   }

   public static Object getKeyFromValue(Map lllllllllllllllIIllllllIlIIlIlIl, Object lllllllllllllllIIllllllIlIIlIlII) {
      Iterator lllllllllllllllIIllllllIlIIlIIIl = lllllllllllllllIIllllllIlIIlIlIl.keySet().iterator();

      do {
         if (!lIlIlIllllIlII(lllllllllllllllIIllllllIlIIlIIIl.hasNext())) {
            return null;
         }

         Object lllllllllllllllIIllllllIlIIlIllI = lllllllllllllllIIllllllIlIIlIIIl.next();
         if (lIlIlIllllIlII(lllllllllllllllIIllllllIlIIlIlIl.get(lllllllllllllllIIllllllIlIIlIllI).equals(lllllllllllllllIIllllllIlIIlIlII))) {
            return lllllllllllllllIIllllllIlIIlIllI;
         }

         "".length();
      } while(((33 + 88 - 59 + 93 ^ (72 ^ 43) << " ".length()) & (3 ^ 32 ^ (33 ^ 30) << " ".length() ^ -" ".length())) < "   ".length());

      return null;
   }

   private static boolean lIlIlIllllIlII(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIlIllllIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIlIlllIIlll(String lllllllllllllllIIllllllIIlllIIII, String lllllllllllllllIIllllllIIllIllll) {
      lllllllllllllllIIllllllIIlllIIII = new String(Base64.getDecoder().decode(lllllllllllllllIIllllllIIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIIllllllIIlllIIll = new StringBuilder();
      int lllllllllllllllIIllllllIIllIllIl = lllllllllllllllIIllllllIIllIllll.toCharArray();
      char lllllllllllllllIIllllllIIllIllII = lIIIIllIIIIlI[0];
      byte lllllllllllllllIIllllllIIllIlIll = lllllllllllllllIIllllllIIlllIIII.toCharArray();
      float lllllllllllllllIIllllllIIllIlIlI = lllllllllllllllIIllllllIIllIlIll.length;
      int lllllllllllllllIIllllllIIllIlIIl = lIIIIllIIIIlI[0];

      do {
         if (!lIlIlIllllIllI(lllllllllllllllIIllllllIIllIlIIl, lllllllllllllllIIllllllIIllIlIlI)) {
            return String.valueOf(lllllllllllllllIIllllllIIlllIIll);
         }

         long lllllllllllllllIIllllllIIllIlIII = lllllllllllllllIIllllllIIllIlIll[lllllllllllllllIIllllllIIllIlIIl];
         lllllllllllllllIIllllllIIlllIIll.append((char)(lllllllllllllllIIllllllIIllIlIII ^ lllllllllllllllIIllllllIIllIllIl[lllllllllllllllIIllllllIIllIllII % lllllllllllllllIIllllllIIllIllIl.length]));
         "".length();
         ++lllllllllllllllIIllllllIIllIllII;
         ++lllllllllllllllIIllllllIIllIlIIl;
         "".length();
      } while(null == null);

      return null;
   }

   private static String lIlIlIlllIlIII(String lllllllllllllllIIllllllIIllIIIII, String lllllllllllllllIIllllllIIlIlllll) {
      try {
         SecretKeySpec lllllllllllllllIIllllllIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllllIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         boolean lllllllllllllllIIllllllIIlIllIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIIllllllIIlIllIll.init(lIIIIllIIIIlI[2], lllllllllllllllIIllllllIIllIIIll);
         return new String(lllllllllllllllIIllllllIIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllllIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   static {
      lIlIlIllllIIlI();
      lIlIlIlllIllIl();
      blockNames = new HashMap();
   }

   public static Block getBlockFromName(String lllllllllllllllIIllllllIlIIlllII) {
      return lIlIlIllllIIll(blockNames.containsKey(lllllllllllllllIIllllllIlIIlllII)) ? null : (Block)blockNames.get(lllllllllllllllIIllllllIlIIlllII);
   }

   private static String lIlIlIlllIIllI(String lllllllllllllllIIllllllIlIIIIlIl, String lllllllllllllllIIllllllIlIIIIlII) {
      try {
         short lllllllllllllllIIllllllIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllllllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), lIIIIllIIIIlI[8]), "DES");
         Cipher lllllllllllllllIIllllllIlIIIIlll = Cipher.getInstance("DES");
         lllllllllllllllIIllllllIlIIIIlll.init(lIIIIllIIIIlI[2], lllllllllllllllIIllllllIlIIIIIIl);
         return new String(lllllllllllllllIIllllllIlIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllllllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public BlockParser() {
      if (!lIlIlIllllIIll(blockNames.isEmpty())) {
         Iterator lllllllllllllllIIllllllIlIllIIll = Block.field_149771_c.func_148742_b().iterator();

         do {
            if (!lIlIlIllllIlII(lllllllllllllllIIllllllIlIllIIll.hasNext())) {
               return;
            }

            ResourceLocation lllllllllllllllIIllllllIlIllIllI = (ResourceLocation)lllllllllllllllIIllllllIlIllIIll.next();
            blockNames.put(lllllllllllllllIIllllllIlIllIllI.toString().replace(lIIIIlIllllIl[lIIIIllIIIIlI[0]], lIIIIlIllllIl[lIIIIllIIIIlI[1]]).replace(lIIIIlIllllIl[lIIIIllIIIIlI[2]], lIIIIlIllllIl[lIIIIllIIIIlI[3]]), Block.field_149771_c.func_82594_a(lllllllllllllllIIllllllIlIllIllI));
            "".length();
            "".length();
         } while(" ".length() << " ".length() != "   ".length());

         throw null;
      }
   }

   private static boolean lIlIlIllllIlIl(Object var0) {
      return var0 == null;
   }

   public String getChunk(SyntaxChunk[] lllllllllllllllIIllllllIlIlIIllI, SyntaxChunk lllllllllllllllIIllllllIlIlIIlIl, String[] lllllllllllllllIIllllllIlIlIIlII, String lllllllllllllllIIllllllIlIlIIIll) {
      try {
         if (lIlIlIllllIlIl(lllllllllllllllIIllllllIlIlIIIll)) {
            StringBuilder var10000 = new StringBuilder();
            String var10001;
            if (lIlIlIllllIlII(lllllllllllllllIIllllllIlIlIIlIl.isHeadless())) {
               var10001 = lIIIIlIllllIl[lIIIIllIIIIlI[4]];
               "".length();
               if ((("   ".length() << (148 ^ 145) ^ 234 ^ 143) << " ".length() & ((86 + 32 - 22 + 65 ^ (67 ^ 106) << (" ".length() << " ".length())) << " ".length() ^ -" ".length())) != 0) {
                  return null;
               }
            } else {
               var10001 = lllllllllllllllIIllllllIlIlIIlIl.getHead();
            }

            var10000 = var10000.append(var10001);
            if (lIlIlIllllIlII(lllllllllllllllIIllllllIlIlIIlIl.isNecessary())) {
               var10001 = lIIIIlIllllIl[lIIIIllIIIIlI[5]];
               "".length();
               if (null != null) {
                  return null;
               }
            } else {
               var10001 = lIIIIlIllllIl[lIIIIllIIIIlI[6]];
            }

            var10000 = var10000.append(var10001).append(lllllllllllllllIIllllllIlIlIIlIl.getType());
            if (lIlIlIllllIlII(lllllllllllllllIIllllllIlIlIIlIl.isNecessary())) {
               var10001 = lIIIIlIllllIl[lIIIIllIIIIlI[7]];
               "".length();
               if (-" ".length() > 0) {
                  return null;
               }
            } else {
               var10001 = lIIIIlIllllIl[lIIIIllIIIIlI[8]];
            }

            return String.valueOf(var10000.append(var10001));
         } else {
            HashMap<String, Block> lllllllllllllllIIllllllIlIlIlIll = new HashMap();
            Iterator lllllllllllllllIIllllllIlIIlllll = blockNames.keySet().iterator();

            do {
               if (!lIlIlIllllIlII(lllllllllllllllIIllllllIlIIlllll.hasNext())) {
                  if (lIlIlIllllIlII(lllllllllllllllIIllllllIlIlIlIll.isEmpty())) {
                     return lIIIIlIllllIl[lIIIIllIIIIlI[13]];
                  }

                  TreeMap<String, Block> lllllllllllllllIIllllllIlIIlllll = new TreeMap(lllllllllllllllIIllllllIlIlIlIll);
                  Entry<String, Block> lllllllllllllllIIllllllIlIlIlIIl = lllllllllllllllIIllllllIlIIlllll.firstEntry();
                  return ((String)lllllllllllllllIIllllllIlIlIlIIl.getKey()).substring(lllllllllllllllIIllllllIlIlIIIll.length());
               }

               String lllllllllllllllIIllllllIlIlIllII = (String)lllllllllllllllIIllllllIlIIlllll.next();
               if (lIlIlIllllIlII(lllllllllllllllIIllllllIlIlIllII.toLowerCase().startsWith(lllllllllllllllIIllllllIlIlIIIll.toLowerCase().replace(lIIIIlIllllIl[lIIIIllIIIIlI[9]], lIIIIlIllllIl[lIIIIllIIIIlI[10]]).replace(lIIIIlIllllIl[lIIIIllIIIIlI[11]], lIIIIlIllllIl[lIIIIllIIIIlI[12]])))) {
                  lllllllllllllllIIllllllIlIlIlIll.put(lllllllllllllllIIllllllIlIlIllII, blockNames.get(lllllllllllllllIIllllllIlIlIllII));
                  "".length();
               }

               "".length();
            } while(-" ".length() == -" ".length());

            return null;
         }
      } catch (Exception var8) {
         return lIIIIlIllllIl[lIIIIllIIIIlI[14]];
      }
   }
}
