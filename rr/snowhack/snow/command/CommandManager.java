package rr.snowhack.snow.command;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import rr.snowhack.snow.SnowMod;
import rr.snowhack.snow.command.commands.BindCommand;
import rr.snowhack.snow.util.ClassFinder;

public class CommandManager {
   // $FF: synthetic field
   private ArrayList<Command> commands = new ArrayList();
   // $FF: synthetic field
   private static final String[] lIIIIIIIllIll;
   // $FF: synthetic field
   private static final int[] lIIIIIIIlllIl;

   private static boolean lIlIIlllIIlIll(Object var0) {
      return var0 == null;
   }

   private static void lIlIIlllIIlIII() {
      lIIIIIIIlllIl = new int[9];
      lIIIIIIIlllIl[0] = (136 ^ 167) << " ".length() & ~((170 ^ 133) << " ".length());
      lIIIIIIIlllIl[1] = " ".length();
      lIIIIIIIlllIl[2] = " ".length() << " ".length();
      lIIIIIIIlllIl[3] = "   ".length();
      lIIIIIIIlllIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIIIIIlllIl[5] = (53 ^ 36) << (" ".length() << " ".length()) ^ 85 ^ 20;
      lIIIIIIIlllIl[6] = "   ".length() << " ".length();
      lIIIIIIIlllIl[7] = 141 ^ 138;
      lIIIIIIIlllIl[8] = " ".length() << "   ".length();
   }

   public void callCommand(String lllllllllllllllIlIIlIIIIlIllIlIl) {
      String[] lllllllllllllllIlIIlIIIIlIllllII = lllllllllllllllIlIIlIIIIlIllIlIl.split(lIIIIIIIllIll[lIIIIIIIlllIl[4]]);
      Exception lllllllllllllllIlIIlIIIIlIllIIlI = lllllllllllllllIlIIlIIIIlIllllII[lIIIIIIIlllIl[0]].substring(lIIIIIIIlllIl[1]);
      Exception lllllllllllllllIlIIlIIIIlIllIIII = removeElement(lllllllllllllllIlIIlIIIIlIllllII, lIIIIIIIlllIl[0]);
      int lllllllllllllllIlIIlIIIIllIIIIIl = lIIIIIIIlllIl[0];

      do {
         if (!lIlIIlllIIlIlI(lllllllllllllllIlIIlIIIIllIIIIIl, lllllllllllllllIlIIlIIIIlIllIIII.length)) {
            Iterator lllllllllllllllIlIIlIIIIlIlIllll = lllllllllllllllIlIIlIIIIlIllIlll.commands.iterator();

            do {
               if (!lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIlIlIllll.hasNext())) {
                  Command.sendChatMessage(lIIIIIIIllIll[lIIIIIIIlllIl[6]]);
                  return;
               }

               short lllllllllllllllIlIIlIIIIlIlIllIl = (Command)lllllllllllllllIlIIlIIIIlIlIllll.next();
               if (lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIlIlIllIl.getLabel().equalsIgnoreCase(lllllllllllllllIlIIlIIIIlIllIIlI))) {
                  lllllllllllllllIlIIlIIIIlIlIllIl.call(lllllllllllllllIlIIlIIIIlIllllII);
                  return;
               }

               "".length();
            } while(" ".length() << " ".length() >= 0);

            return;
         }

         if (lIlIIlllIIlIll(lllllllllllllllIlIIlIIIIlIllIIII[lllllllllllllllIlIIlIIIIllIIIIIl])) {
            "".length();
            if (null != null) {
               return;
            }
         } else {
            lllllllllllllllIlIIlIIIIlIllIIII[lllllllllllllllIlIIlIIIIllIIIIIl] = strip(lllllllllllllllIlIIlIIIIlIllIIII[lllllllllllllllIlIIlIIIIllIIIIIl], lIIIIIIIllIll[lIIIIIIIlllIl[5]]);
         }

         ++lllllllllllllllIlIIlIIIIllIIIIIl;
         "".length();
      } while(-" ".length() <= ((190 ^ 165) & ~(142 ^ 149)));

   }

   private static String lIlIIlllIIIIIl(String lllllllllllllllIlIIlIIIIIlIllIlI, String lllllllllllllllIlIIlIIIIIlIllIIl) {
      try {
         long lllllllllllllllIlIIlIIIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         String lllllllllllllllIlIIlIIIIIlIlIlll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIIIIIlIlIlll.init(lIIIIIIIlllIl[2], lllllllllllllllIlIIlIIIIIlIllIII);
         return new String(lllllllllllllllIlIIlIIIIIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public Command getCommandByLabel(String lllllllllllllllIlIIlIIIIIlllIlII) {
      Iterator lllllllllllllllIlIIlIIIIIlllIIlI = lllllllllllllllIlIIlIIIIIlllIlIl.commands.iterator();

      do {
         if (!lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIIlllIIlI.hasNext())) {
            return null;
         }

         Command lllllllllllllllIlIIlIIIIIllllIll = (Command)lllllllllllllllIlIIlIIIIIlllIIlI.next();
         if (lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIIllllIll.getLabel().equals(lllllllllllllllIlIIlIIIIIlllIlII))) {
            return lllllllllllllllIlIIlIIIIIllllIll;
         }

         "".length();
      } while(" ".length() << (" ".length() << " ".length()) >= "   ".length());

      return null;
   }

   public CommandManager() {
      Set<Class> lllllllllllllllIlIIlIIIIllIIlllI = ClassFinder.findClasses(BindCommand.class.getPackage().getName(), Command.class);
      Iterator lllllllllllllllIlIIlIIIIllIIlIll = lllllllllllllllIlIIlIIIIllIIlllI.iterator();

      do {
         if (!lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIllIIlIll.hasNext())) {
            SnowMod.log.info(lIIIIIIIllIll[lIIIIIIIlllIl[3]]);
            return;
         }

         Class lllllllllllllllIlIIlIIIIllIlIIII = (Class)lllllllllllllllIlIIlIIIIllIIlIll.next();
         if (lIlIIlllIIlIIl(Command.class.isAssignableFrom(lllllllllllllllIlIIlIIIIllIlIIII))) {
            label30: {
               try {
                  Command lllllllllllllllIlIIlIIIIllIlIIlI = (Command)lllllllllllllllIlIIlIIIIllIlIIII.getConstructor().newInstance();
                  lllllllllllllllIlIIlIIIIllIIllIl.commands.add(lllllllllllllllIlIIlIIIIllIlIIlI);
                  "".length();
               } catch (Exception var5) {
                  var5.printStackTrace();
                  System.err.println(String.valueOf((new StringBuilder()).append(lIIIIIIIllIll[lIIIIIIIlllIl[0]]).append(lllllllllllllllIlIIlIIIIllIlIIII.getSimpleName()).append(lIIIIIIIllIll[lIIIIIIIlllIl[1]]).append(var5.getClass().getSimpleName()).append(lIIIIIIIllIll[lIIIIIIIlllIl[2]]).append(var5.getMessage())));
                  break label30;
               }

               "".length();
               if ((" ".length() & (" ".length() ^ -" ".length())) != 0) {
                  throw null;
               }
            }
         }

         "".length();
      } while(-" ".length() < 0);

      throw null;
   }

   private static void lIlIIlllIIIlIl() {
      lIIIIIIIllIll = new String[lIIIIIIIlllIl[7]];
      lIIIIIIIllIll[lIIIIIIIlllIl[0]] = lIlIIlllIIIIIl("ZcU5B0sGqPfkGtDs7LqwTHYOog/5kfYH9v23y7A7KzM=", "dJEMZ");
      lIIIIIIIllIll[lIIIIIIIlllIl[1]] = lIlIIlllIIIIlI("ADL3U00ioaw=", "ccpVO");
      lIIIIIIIllIll[lIIIIIIIlllIl[2]] = lIlIIlllIIIIll("RFAFCAcbEQ8ITkg=", "hphmt");
      lIIIIIIIllIll[lIIIIIIIlllIl[3]] = lIlIIlllIIIIIl("j5rEbp6E1Zv8cWLVXMOWVxgTX3o3Bglu", "rglHN");
      lIIIIIIIllIll[lIIIIIIIlllIl[4]] = lIlIIlllIIIIlI("mrAGD+s/C9jnviRE6LaStmZZLW/YBnjwKjPtrcBLvnc=", "dOCSs");
      lIIIIIIIllIll[lIIIIIIIlllIl[5]] = lIlIIlllIIIIIl("8pxo/Doyb1I=", "bFqCG");
      lIIIIIIIllIll[lIIIIIIIlllIl[6]] = lIlIIlllIIIIIl("aHBNfMxStJX9GZfJJJWotoCy0WdX9l3rf0qsZsJef79Yy6RRXrqRdfmmiCd36sds7gTmrASMfPI=", "FGTwg");
   }

   public ArrayList<Command> getCommands() {
      return lllllllllllllllIlIIlIIIIIllIlIll.commands;
   }

   private static String lIlIIlllIIIIlI(String lllllllllllllllIlIIlIIIIIlIIllIl, String lllllllllllllllIlIIlIIIIIlIIlllI) {
      try {
         int lllllllllllllllIlIIlIIIIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIIIIlIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlllIl[8]), "DES");
         Cipher lllllllllllllllIlIIlIIIIIlIlIIIl = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIIIIIlIlIIIl.init(lIIIIIIIlllIl[2], lllllllllllllllIlIIlIIIIIlIIlIll);
         return new String(lllllllllllllllIlIIlIIIIIlIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String[] removeElement(String[] lllllllllllllllIlIIlIIIIlIIlllIl, int lllllllllllllllIlIIlIIIIlIIlIllI) {
      List lllllllllllllllIlIIlIIIIlIIllIlI = new LinkedList();
      int lllllllllllllllIlIIlIIIIlIIlllll = lIIIIIIIlllIl[0];

      do {
         if (!lIlIIlllIIlIlI(lllllllllllllllIlIIlIIIIlIIlllll, lllllllllllllllIlIIlIIIIlIIlllIl.length)) {
            return (String[])((String[])lllllllllllllllIlIIlIIIIlIIllIlI.toArray(lllllllllllllllIlIIlIIIIlIIlllIl));
         }

         if (lIlIIlllIIllII(lllllllllllllllIlIIlIIIIlIIlllll, lllllllllllllllIlIIlIIIIlIIlIllI)) {
            lllllllllllllllIlIIlIIIIlIIllIlI.add(lllllllllllllllIlIIlIIIIlIIlllIl[lllllllllllllllIlIIlIIIIlIIlllll]);
            "".length();
         }

         ++lllllllllllllllIlIIlIIIIlIIlllll;
         "".length();
      } while(" ".length() << " ".length() > 0);

      return null;
   }

   private static String strip(String lllllllllllllllIlIIlIIIIlIIIllII, String lllllllllllllllIlIIlIIIIlIIIIlll) {
      return lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIlIIIllII.startsWith(lllllllllllllllIlIIlIIIIlIIIIlll)) && lIlIIlllIIlIIl(lllllllllllllllIlIIlIIIIlIIIllII.endsWith(lllllllllllllllIlIIlIIIIlIIIIlll)) ? lllllllllllllllIlIIlIIIIlIIIllII.substring(lllllllllllllllIlIIlIIIIlIIIIlll.length(), lllllllllllllllIlIIlIIIIlIIIllII.length() - lllllllllllllllIlIIlIIIIlIIIIlll.length()) : lllllllllllllllIlIIlIIIIlIIIllII;
   }

   private static String lIlIIlllIIIIll(String lllllllllllllllIlIIlIIIIIIllllll, String lllllllllllllllIlIIlIIIIIIlllIIl) {
      lllllllllllllllIlIIlIIIIIIllllll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIIIIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIlIIIIIIllllIl = new StringBuilder();
      char lllllllllllllllIlIIlIIIIIIllIlll = lllllllllllllllIlIIlIIIIIIlllIIl.toCharArray();
      int lllllllllllllllIlIIlIIIIIIlllIll = lIIIIIIIlllIl[0];
      byte lllllllllllllllIlIIlIIIIIIllIlIl = lllllllllllllllIlIIlIIIIIIllllll.toCharArray();
      char lllllllllllllllIlIIlIIIIIIllIlII = lllllllllllllllIlIIlIIIIIIllIlIl.length;
      int lllllllllllllllIlIIlIIIIIIllIIll = lIIIIIIIlllIl[0];

      do {
         if (!lIlIIlllIIlIlI(lllllllllllllllIlIIlIIIIIIllIIll, lllllllllllllllIlIIlIIIIIIllIlII)) {
            return String.valueOf(lllllllllllllllIlIIlIIIIIIllllIl);
         }

         Exception lllllllllllllllIlIIlIIIIIIllIIlI = lllllllllllllllIlIIlIIIIIIllIlIl[lllllllllllllllIlIIlIIIIIIllIIll];
         lllllllllllllllIlIIlIIIIIIllllIl.append((char)(lllllllllllllllIlIIlIIIIIIllIIlI ^ lllllllllllllllIlIIlIIIIIIllIlll[lllllllllllllllIlIIlIIIIIIlllIll % lllllllllllllllIlIIlIIIIIIllIlll.length]));
         "".length();
         ++lllllllllllllllIlIIlIIIIIIlllIll;
         ++lllllllllllllllIlIIlIIIIIIllIIll;
         "".length();
      } while(-" ".length() < " ".length());

      return null;
   }

   static {
      lIlIIlllIIlIII();
      lIlIIlllIIIlIl();
   }

   private static boolean lIlIIlllIIllII(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIlIIlllIIlIIl(int var0) {
      return var0 != 0;
   }

   private static boolean lIlIIlllIIlIlI(int var0, int var1) {
      return var0 < var1;
   }
}
