package rr.snowhack.snow.command.syntax.parsers;

import rr.snowhack.snow.command.syntax.SyntaxChunk;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.module.ModuleManager;

public class ModuleParser extends AbstractParser {
   private static boolean lIlIlIllIIlIll(Object var0) {
      return var0 == null;
   }

   public String getChunk(SyntaxChunk[] lllllllllllllllIlIIIIIIIlIlIllII, SyntaxChunk lllllllllllllllIlIIIIIIIlIlIIllI, String[] lllllllllllllllIlIIIIIIIlIlIlIlI, String lllllllllllllllIlIIIIIIIlIlIlIIl) {
      if (lIlIlIllIIlIll(lllllllllllllllIlIIIIIIIlIlIlIIl)) {
         return lllllllllllllllIlIIIIIIIlIlIIlll.getDefaultChunk(lllllllllllllllIlIIIIIIIlIlIIllI);
      } else {
         float lllllllllllllllIlIIIIIIIlIlIIlII = (Module)ModuleManager.getModules().stream().filter((lllllllllllllllIlIIIIIIIlIIllllI) -> {
            return lllllllllllllllIlIIIIIIIlIIllllI.getName().toLowerCase().startsWith(lllllllllllllllIlIIIIIIIlIlIlIIl.toLowerCase());
         }).findFirst().orElse((Object)null);
         return lIlIlIllIIlIll(lllllllllllllllIlIIIIIIIlIlIIlII) ? null : lllllllllllllllIlIIIIIIIlIlIIlII.getName().substring(lllllllllllllllIlIIIIIIIlIlIlIIl.length());
      }
   }
}
