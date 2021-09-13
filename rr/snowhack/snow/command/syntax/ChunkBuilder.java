package rr.snowhack.snow.command.syntax;

import java.util.ArrayList;
import java.util.List;

public class ChunkBuilder {
   // $FF: synthetic field
   private static final SyntaxChunk[] EXAMPLE;
   // $FF: synthetic field
   private static final int[] lllllIlIIIIl;
   // $FF: synthetic field
   List<SyntaxChunk> chunks = new ArrayList();

   public ChunkBuilder append(String lllllllllllllllIlIIllllIIlIllIIl, boolean lllllllllllllllIlIIllllIIlIllIII) {
      lllllllllllllllIlIIllllIIlIlIlll.append(new SyntaxChunk(lllllllllllllllIlIIllllIIlIllIIl, lllllllllllllllIlIIllllIIlIllIII));
      "".length();
      return lllllllllllllllIlIIllllIIlIlIlll;
   }

   public SyntaxChunk[] build() {
      return (SyntaxChunk[])lllllllllllllllIlIIllllIIlIIIIll.chunks.toArray(EXAMPLE);
   }

   public ChunkBuilder append(String lllllllllllllllIlIIllllIIIllllll) {
      return lllllllllllllllIlIIllllIIIlllllI.append(lllllllllllllllIlIIllllIIIllllll, (boolean)lllllIlIIIIl[0]);
   }

   public ChunkBuilder append(String lllllllllllllllIlIIllllIIlIIlIIl, boolean lllllllllllllllIlIIllllIIlIIlIII, SyntaxParser lllllllllllllllIlIIllllIIlIIllII) {
      byte lllllllllllllllIlIIllllIIlIIIllI = new SyntaxChunk(lllllllllllllllIlIIllllIIlIIlIIl, lllllllllllllllIlIIllllIIlIIlIII);
      lllllllllllllllIlIIllllIIlIIIllI.setParser(lllllllllllllllIlIIllllIIlIIllII);
      lllllllllllllllIlIIllllIIlIIllll.append(lllllllllllllllIlIIllllIIlIIIllI);
      "".length();
      return lllllllllllllllIlIIllllIIlIIllll;
   }

   public ChunkBuilder append(SyntaxChunk lllllllllllllllIlIIllllIIlIllllI) {
      lllllllllllllllIlIIllllIIllIIIIl.chunks.add(lllllllllllllllIlIIllllIIlIllllI);
      "".length();
      return lllllllllllllllIlIIllllIIllIIIIl;
   }

   private static void lIlIIIllIIlIII() {
      lllllIlIIIIl = new int[2];
      lllllIlIIIIl[0] = " ".length();
      lllllIlIIIIl[1] = (182 ^ 157) & ~(93 ^ 118);
   }

   static {
      lIlIIIllIIlIII();
      EXAMPLE = new SyntaxChunk[lllllIlIIIIl[1]];
   }
}
