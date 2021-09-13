package rr.snowhack.snow.util;

import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;

public class StringManager {
   // $FF: synthetic field
   private String content;
   // $FF: synthetic field
   private final String url;
   // $FF: synthetic field
   private String avatarUrl;
   // $FF: synthetic field
   private boolean tts;
   // $FF: synthetic field
   private String username;
   // $FF: synthetic field
   private static final int[] llllllIllIII;
   // $FF: synthetic field
   private ArrayList<StringManager.EmbedObject> embeds = new ArrayList();
   // $FF: synthetic field
   private static final String[] llllllIlIlIl;

   private static boolean lIlIIlIlIlIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIlIIlIlIIlIII(String lllllllllllllllIlIIlIllIIIlIIIIl, String lllllllllllllllIlIIlIllIIIlIIlIl) {
      lllllllllllllllIlIIlIllIIIlIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      byte lllllllllllllllIlIIlIllIIIIlllll = new StringBuilder();
      String lllllllllllllllIlIIlIllIIIIllllI = lllllllllllllllIlIIlIllIIIlIIlIl.toCharArray();
      double lllllllllllllllIlIIlIllIIIIlllIl = llllllIllIII[0];
      float lllllllllllllllIlIIlIllIIIIlllII = lllllllllllllllIlIIlIllIIIlIIIIl.toCharArray();
      Exception lllllllllllllllIlIIlIllIIIIllIll = lllllllllllllllIlIIlIllIIIIlllII.length;
      int lllllllllllllllIlIIlIllIIIIllIlI = llllllIllIII[0];

      do {
         if (!lIlIIlIlIlIlII(lllllllllllllllIlIIlIllIIIIllIlI, lllllllllllllllIlIIlIllIIIIllIll)) {
            return String.valueOf(lllllllllllllllIlIIlIllIIIIlllll);
         }

         byte lllllllllllllllIlIIlIllIIIIllIIl = lllllllllllllllIlIIlIllIIIIlllII[lllllllllllllllIlIIlIllIIIIllIlI];
         lllllllllllllllIlIIlIllIIIIlllll.append((char)(lllllllllllllllIlIIlIllIIIIllIIl ^ lllllllllllllllIlIIlIllIIIIllllI[lllllllllllllllIlIIlIllIIIIlllIl % lllllllllllllllIlIIlIllIIIIllllI.length]));
         "".length();
         ++lllllllllllllllIlIIlIllIIIIlllIl;
         ++lllllllllllllllIlIIlIllIIIIllIlI;
         "".length();
      } while(((186 ^ 159) & ~(100 ^ 65)) == 0);

      return null;
   }

   private static boolean lIlIIlIlIlIIIl(int var0) {
      return var0 != 0;
   }

   public void setTts(boolean lllllllllllllllIlIIlIllIIllIllIl) {
      lllllllllllllllIlIIlIllIIllIllII.tts = lllllllllllllllIlIIlIllIIllIllIl;
   }

   public void execute() throws IOException {
      if (lIlIIlIlIlIIII(lllllllllllllllIlIIlIllIIIllllll.content) && lIlIIlIlIlIIIl(lllllllllllllllIlIIlIllIIIllllll.embeds.isEmpty())) {
         throw new IllegalArgumentException(llllllIlIlIl[llllllIllIII[0]]);
      } else {
         StringManager.JSONObject lllllllllllllllIlIIlIllIIlIIIIll = new StringManager.JSONObject();
         lllllllllllllllIlIIlIllIIlIIIIll.put(llllllIlIlIl[llllllIllIII[1]], lllllllllllllllIlIIlIllIIIllllll.content);
         lllllllllllllllIlIIlIllIIlIIIIll.put(llllllIlIlIl[llllllIllIII[2]], lllllllllllllllIlIIlIllIIIllllll.username);
         lllllllllllllllIlIIlIllIIlIIIIll.put(llllllIlIlIl[llllllIllIII[3]], lllllllllllllllIlIIlIllIIIllllll.avatarUrl);
         lllllllllllllllIlIIlIllIIlIIIIll.put(llllllIlIlIl[llllllIllIII[4]], lllllllllllllllIlIIlIllIIIllllll.tts);
         if (lIlIIlIlIlIIlI(lllllllllllllllIlIIlIllIIIllllll.embeds.isEmpty())) {
            ArrayList<StringManager.JSONObject> lllllllllllllllIlIIlIllIIlIIIlIl = new ArrayList();
            Iterator lllllllllllllllIlIIlIllIIIllllII = lllllllllllllllIlIIlIllIIIllllll.embeds.iterator();

            while(lIlIIlIlIlIIIl(lllllllllllllllIlIIlIllIIIllllII.hasNext())) {
               StringManager.EmbedObject lllllllllllllllIlIIlIllIIlIIIllI = (StringManager.EmbedObject)lllllllllllllllIlIIlIllIIIllllII.next();
               char lllllllllllllllIlIIlIllIIIlllIlI = new StringManager.JSONObject();
               lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[5]], lllllllllllllllIlIIlIllIIlIIIllI.getTitle());
               lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[6]], lllllllllllllllIlIIlIllIIlIIIllI.getDescription());
               lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[7]], lllllllllllllllIlIIlIllIIlIIIllI.getUrl());
               if (lIlIIlIlIlIIll(lllllllllllllllIlIIlIllIIlIIIllI.getColor())) {
                  char lllllllllllllllIlIIlIllIIIlllIIl = lllllllllllllllIlIIlIllIIlIIIllI.getColor();
                  int lllllllllllllllIlIIlIllIIlIlIlII = lllllllllllllllIlIIlIllIIIlllIIl.getRed();
                  lllllllllllllllIlIIlIllIIlIlIlII = (lllllllllllllllIlIIlIllIIlIlIlII << llllllIllIII[8]) + lllllllllllllllIlIIlIllIIIlllIIl.getGreen();
                  lllllllllllllllIlIIlIllIIlIlIlII = (lllllllllllllllIlIIlIllIIlIlIlII << llllllIllIII[8]) + lllllllllllllllIlIIlIllIIIlllIIl.getBlue();
                  lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[8]], lllllllllllllllIlIIlIllIIlIlIlII);
               }

               StringManager.EmbedObject.Footer lllllllllllllllIlIIlIllIIlIIllII = lllllllllllllllIlIIlIllIIlIIIllI.getFooter();
               StringManager.EmbedObject.Image lllllllllllllllIlIIlIllIIlIIlIll = lllllllllllllllIlIIlIllIIlIIIllI.getImage();
               double lllllllllllllllIlIIlIllIIIllIlll = lllllllllllllllIlIIlIllIIlIIIllI.getThumbnail();
               byte lllllllllllllllIlIIlIllIIIllIllI = lllllllllllllllIlIIlIllIIlIIIllI.getAuthor();
               ArrayList<StringManager.EmbedObject.Field> lllllllllllllllIlIIlIllIIIllIlIl = lllllllllllllllIlIIlIllIIlIIIllI.getFields();
               StringManager.JSONObject lllllllllllllllIlIIlIllIIlIlIIII;
               if (lIlIIlIlIlIIll(lllllllllllllllIlIIlIllIIlIIllII)) {
                  lllllllllllllllIlIIlIllIIlIlIIII = new StringManager.JSONObject();
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[9]], lllllllllllllllIlIIlIllIIlIIllII.getText());
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[10]], lllllllllllllllIlIIlIllIIlIIllII.getIconUrl());
                  lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[11]], lllllllllllllllIlIIlIllIIlIlIIII);
               }

               if (lIlIIlIlIlIIll(lllllllllllllllIlIIlIllIIlIIlIll)) {
                  lllllllllllllllIlIIlIllIIlIlIIII = new StringManager.JSONObject();
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[12]], lllllllllllllllIlIIlIllIIlIIlIll.getUrl());
                  lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[13]], lllllllllllllllIlIIlIllIIlIlIIII);
               }

               if (lIlIIlIlIlIIll(lllllllllllllllIlIIlIllIIIllIlll)) {
                  lllllllllllllllIlIIlIllIIlIlIIII = new StringManager.JSONObject();
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[14]], lllllllllllllllIlIIlIllIIIllIlll.getUrl());
                  lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[15]], lllllllllllllllIlIIlIllIIlIlIIII);
               }

               if (lIlIIlIlIlIIll(lllllllllllllllIlIIlIllIIIllIllI)) {
                  lllllllllllllllIlIIlIllIIlIlIIII = new StringManager.JSONObject();
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[16]], lllllllllllllllIlIIlIllIIIllIllI.getName());
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[17]], lllllllllllllllIlIIlIllIIIllIllI.getUrl());
                  lllllllllllllllIlIIlIllIIlIlIIII.put(llllllIlIlIl[llllllIllIII[18]], lllllllllllllllIlIIlIllIIIllIllI.getIconUrl());
                  lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[19]], lllllllllllllllIlIIlIllIIlIlIIII);
               }

               ArrayList<StringManager.JSONObject> lllllllllllllllIlIIlIllIIlIIIlll = new ArrayList();
               Iterator lllllllllllllllIlIIlIllIIIllIIll = lllllllllllllllIlIIlIllIIIllIlIl.iterator();

               while(lIlIIlIlIlIIIl(lllllllllllllllIlIIlIllIIIllIIll.hasNext())) {
                  StringManager.EmbedObject.Field lllllllllllllllIlIIlIllIIlIIlllI = (StringManager.EmbedObject.Field)lllllllllllllllIlIIlIllIIIllIIll.next();
                  float lllllllllllllllIlIIlIllIIIllIIIl = new StringManager.JSONObject();
                  lllllllllllllllIlIIlIllIIIllIIIl.put(llllllIlIlIl[llllllIllIII[20]], lllllllllllllllIlIIlIllIIlIIlllI.getName());
                  lllllllllllllllIlIIlIllIIIllIIIl.put(llllllIlIlIl[llllllIllIII[21]], lllllllllllllllIlIIlIllIIlIIlllI.getValue());
                  lllllllllllllllIlIIlIllIIIllIIIl.put(llllllIlIlIl[llllllIllIII[22]], lllllllllllllllIlIIlIllIIlIIlllI.isInline());
                  lllllllllllllllIlIIlIllIIlIIIlll.add(lllllllllllllllIlIIlIllIIIllIIIl);
                  "".length();
                  "".length();
                  if (-" ".length() >= ((249 ^ 148 ^ (94 ^ 67) << (" ".length() << " ".length())) & (142 ^ 197 ^ (99 ^ 74) << " ".length() ^ -" ".length()))) {
                     return;
                  }
               }

               lllllllllllllllIlIIlIllIIIlllIlI.put(llllllIlIlIl[llllllIllIII[23]], lllllllllllllllIlIIlIllIIlIIIlll.toArray());
               lllllllllllllllIlIIlIllIIlIIIlIl.add(lllllllllllllllIlIIlIllIIIlllIlI);
               "".length();
               "".length();
               if (null != null) {
                  return;
               }
            }

            lllllllllllllllIlIIlIllIIlIIIIll.put(llllllIlIlIl[llllllIllIII[24]], lllllllllllllllIlIIlIllIIlIIIlIl.toArray());
         }

         double lllllllllllllllIlIIlIllIIIllllIl = new URL(lllllllllllllllIlIIlIllIIIllllll.url);
         HttpsURLConnection lllllllllllllllIlIIlIllIIlIIIIIl = (HttpsURLConnection)lllllllllllllllIlIIlIllIIIllllIl.openConnection();
         lllllllllllllllIlIIlIllIIlIIIIIl.addRequestProperty(llllllIlIlIl[llllllIllIII[25]], llllllIlIlIl[llllllIllIII[26]]);
         lllllllllllllllIlIIlIllIIlIIIIIl.addRequestProperty(llllllIlIlIl[llllllIllIII[27]], llllllIlIlIl[llllllIllIII[28]]);
         lllllllllllllllIlIIlIllIIlIIIIIl.setDoOutput((boolean)llllllIllIII[1]);
         lllllllllllllllIlIIlIllIIlIIIIIl.setRequestMethod(llllllIlIlIl[llllllIllIII[29]]);
         OutputStream lllllllllllllllIlIIlIllIIlIIIIII = lllllllllllllllIlIIlIllIIlIIIIIl.getOutputStream();
         lllllllllllllllIlIIlIllIIlIIIIII.write(lllllllllllllllIlIIlIllIIlIIIIll.toString().getBytes());
         lllllllllllllllIlIIlIllIIlIIIIII.flush();
         lllllllllllllllIlIIlIllIIlIIIIII.close();
         lllllllllllllllIlIIlIllIIlIIIIIl.getInputStream().close();
         lllllllllllllllIlIIlIllIIlIIIIIl.disconnect();
      }
   }

   private static boolean lIlIIlIlIlIIII(Object var0) {
      return var0 == null;
   }

   public void setUsername(String lllllllllllllllIlIIlIllIIlllIlll) {
      lllllllllllllllIlIIlIllIIllllIlI.username = lllllllllllllllIlIIlIllIIlllIlll;
   }

   static {
      lIlIIlIlIIllll();
      lIlIIlIlIIlIll();
   }

   private static boolean lIlIIlIlIlIIll(Object var0) {
      return var0 != null;
   }

   private static void lIlIIlIlIIlIll() {
      llllllIlIlIl = new String[llllllIllIII[30]];
      llllllIlIlIl[llllllIllIII[0]] = lIlIIlIlIIIllI("hoZYtAoQqyxTZNkcWOw/g9Um3yDG7MZWosOCvcZa3FuSjarJUaGJA6QfHOtAFkIL", "LaqXo");
      llllllIlIlIl[llllllIllIII[1]] = lIlIIlIlIIIlll("WC/ZjP4ttrU=", "ipiYO");
      llllllIlIlIl[llllllIllIII[2]] = lIlIIlIlIIIlll("hMfYnOQCidO+vX2+wVUI5Q==", "rnjtt");
      llllllIlIlIl[llllllIllIII[3]] = lIlIIlIlIIlIII("FzwgLDUEFTQqOA==", "vJAXT");
      llllllIlIlIl[llllllIllIII[4]] = lIlIIlIlIIlIII("MCwB", "DXrMV");
      llllllIlIlIl[llllllIllIII[5]] = lIlIIlIlIIlIII("MicwAyQ=", "FNDoA");
      llllllIlIlIl[llllllIllIII[6]] = lIlIIlIlIIIlll("QCy3qBQn/3Fx8WN4PFwQQw==", "EIDBn");
      llllllIlIlIl[llllllIllIII[7]] = lIlIIlIlIIIlll("yklaD27r6G0=", "paMeh");
      llllllIlIlIl[llllllIllIII[8]] = lIlIIlIlIIIllI("nw/BqZg1ekg=", "gNjiR");
      llllllIlIlIl[llllllIllIII[9]] = lIlIIlIlIIIlll("g7ViK3kf1ZY=", "TSYSC");
      llllllIlIlIl[llllllIllIII[10]] = lIlIIlIlIIlIII("HSomNxABOyU=", "tIIYO");
      llllllIlIlIl[llllllIllIII[11]] = lIlIIlIlIIIlll("IOcGezl6QGk=", "xLgjv");
      llllllIlIlIl[llllllIllIII[12]] = lIlIIlIlIIIlll("vyj/nNgVB/o=", "kpPad");
      llllllIlIlIl[llllllIllIII[13]] = lIlIIlIlIIIllI("ELLMwk+ZHhY=", "GTNHi");
      llllllIlIlIl[llllllIllIII[14]] = lIlIIlIlIIIlll("RfbAmIlFnk8=", "oVbWc");
      llllllIlIlIl[llllllIllIII[15]] = lIlIIlIlIIIlll("qFraEIbhepa3xBOmLoFQ6A==", "UaHgg");
      llllllIlIlIl[llllllIllIII[16]] = lIlIIlIlIIIlll("vvb/ppD9kbA=", "uEAJt");
      llllllIlIlIl[llllllIllIII[17]] = lIlIIlIlIIIllI("k+ElglPrweA=", "tXFsl");
      llllllIlIlIl[llllllIllIII[18]] = lIlIIlIlIIIlll("H7tA7hpEv2vJKhSTDDw1Tg==", "bwnpx");
      llllllIlIlIl[llllllIllIII[19]] = lIlIIlIlIIlIII("KDcEOz47", "IBpSQ");
      llllllIlIlIl[llllllIllIII[20]] = lIlIIlIlIIIllI("CUYfo460rVY=", "Smduo");
      llllllIlIlIl[llllllIllIII[21]] = lIlIIlIlIIlIII("FCQEAxE=", "bEhvt");
      llllllIlIlIl[llllllIllIII[22]] = lIlIIlIlIIlIII("PigBKhky", "WFmCw");
      llllllIlIlIl[llllllIllIII[23]] = lIlIIlIlIIIllI("MpIQtSbhXB8=", "Gzwlo");
      llllllIlIlIl[llllllIllIII[24]] = lIlIIlIlIIlIII("EyEwKTMF", "vLRLW");
      llllllIlIlIl[llllllIllIII[25]] = lIlIIlIlIIIllI("RkfkXzPf2xQkgyO1Qq4dIg==", "BlSmD");
      llllllIlIlIl[llllllIllIII[26]] = lIlIIlIlIIlIII("NDYxIyM2JzUmJTtpKzwlOw==", "UFAOJ");
      llllllIlIlIl[llllllIllIII[27]] = lIlIIlIlIIIllI("D9O2Q5NjK2laQPHTK8KMLQ==", "YtMci");
      llllllIlIlIl[llllllIllIII[28]] = lIlIIlIlIIIlll("16cRtM6mEud98grt4fyydIOTJIQY/rQ7TEZoss9qt+o=", "CcBcW");
      llllllIlIlIl[llllllIllIII[29]] = lIlIIlIlIIlIII("NwE4Hg==", "gNkJa");
   }

   private static void lIlIIlIlIIllll() {
      llllllIllIII = new int[31];
      llllllIllIII[0] = ((189 ^ 158) << (" ".length() << " ".length()) ^ 108 + 93 - 81 + 65) & (247 ^ 144 ^ (97 ^ 72) << " ".length() ^ -" ".length());
      llllllIllIII[1] = " ".length();
      llllllIllIII[2] = " ".length() << " ".length();
      llllllIllIII[3] = "   ".length();
      llllllIllIII[4] = " ".length() << (" ".length() << " ".length());
      llllllIllIII[5] = (220 ^ 145) << " ".length() ^ 109 + 124 - 213 + 139;
      llllllIllIII[6] = "   ".length() << " ".length();
      llllllIllIII[7] = 195 ^ 196;
      llllllIllIII[8] = " ".length() << "   ".length();
      llllllIllIII[9] = 21 ^ 28;
      llllllIllIII[10] = (122 ^ 41 ^ (69 ^ 110) << " ".length()) << " ".length();
      llllllIllIII[11] = "   ".length() << (" ".length() << " ".length()) ^ 30 ^ 25;
      llllllIllIII[12] = "   ".length() << (" ".length() << " ".length());
      llllllIllIII[13] = 147 ^ 158;
      llllllIllIII[14] = (71 ^ 64) << " ".length();
      llllllIllIII[15] = 125 ^ 114;
      llllllIllIII[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllllIllIII[17] = 166 ^ 183;
      llllllIllIII[18] = ((13 ^ 76) << " ".length() ^ 11 + 11 - -57 + 60) << " ".length();
      llllllIllIII[19] = 131 ^ 144;
      llllllIllIII[20] = (1 ^ 84 ^ (159 ^ 154) << (" ".length() << (" ".length() << " ".length()))) << (" ".length() << " ".length());
      llllllIllIII[21] = 121 ^ 108;
      llllllIllIII[22] = (18 + 66 - -40 + 29 ^ (69 ^ 12) << " ".length()) << " ".length();
      llllllIllIII[23] = (80 ^ 85) << " ".length() ^ 218 ^ 199;
      llllllIllIII[24] = "   ".length() << "   ".length();
      llllllIllIII[25] = (11 ^ 40) << " ".length() ^ 78 ^ 17;
      llllllIllIII[26] = (124 ^ 113) << " ".length();
      llllllIllIII[27] = 113 ^ 106;
      llllllIllIII[28] = (132 ^ 131) << (" ".length() << " ".length());
      llllllIllIII[29] = (54 ^ 91) << " ".length() ^ 48 + 14 - -72 + 65;
      llllllIllIII[30] = (168 ^ 167) << " ".length();
   }

   private static String lIlIIlIlIIIllI(String lllllllllllllllIlIIlIllIIIIlIIIl, String lllllllllllllllIlIIlIllIIIIIlllI) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIllIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIlIllIIIIlIIll = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIlIllIIIIlIIll.init(llllllIllIII[2], lllllllllllllllIlIIlIllIIIIlIlII);
         return new String(lllllllllllllllIlIIlIllIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public void setContent(String lllllllllllllllIlIIlIllIIlllllll) {
      lllllllllllllllIlIIlIllIlIIIIIII.content = lllllllllllllllIlIIlIllIIlllllll;
   }

   public void addEmbed(StringManager.EmbedObject lllllllllllllllIlIIlIllIIllIIlll) {
      lllllllllllllllIlIIlIllIIllIIllI.embeds.add(lllllllllllllllIlIIlIllIIllIIlll);
      "".length();
   }

   public StringManager(String lllllllllllllllIlIIlIllIlIIIIIll) {
      lllllllllllllllIlIIlIllIlIIIIlII.url = lllllllllllllllIlIIlIllIlIIIIIll;
   }

   private static boolean lIlIIlIlIlIIlI(int var0) {
      return var0 == 0;
   }

   public void setAvatarUrl(String lllllllllllllllIlIIlIllIIlllIIIl) {
      lllllllllllllllIlIIlIllIIlllIlII.avatarUrl = lllllllllllllllIlIIlIllIIlllIIIl;
   }

   private static String lIlIIlIlIIIlll(String lllllllllllllllIlIIlIllIIIIIIlII, String lllllllllllllllIlIIlIllIIIIIIIIl) {
      try {
         SecretKeySpec lllllllllllllllIlIIlIllIIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), llllllIllIII[8]), "DES");
         Cipher lllllllllllllllIlIIlIllIIIIIIllI = Cipher.getInstance("DES");
         lllllllllllllllIlIIlIllIIIIIIllI.init(llllllIllIII[2], lllllllllllllllIlIIlIllIIIIIIlll);
         return new String(lllllllllllllllIlIIlIllIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private class JSONObject {
      // $FF: synthetic field
      private static final String[] lllIllIlIllI;
      // $FF: synthetic field
      private final HashMap<String, Object> map;
      // $FF: synthetic field
      private static final int[] lllIllIllIll;

      private static boolean lIIlllIIIIIIII(int var0, int var1) {
         return var0 != var1;
      }

      private static String lIIllIlllllIIl(String lllllllllllllllIlIllIllIlIllIlll, String lllllllllllllllIlIllIllIlIllIllI) {
         lllllllllllllllIlIllIllIlIllIlll = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
         StringBuilder lllllllllllllllIlIllIllIlIlllIlI = new StringBuilder();
         short lllllllllllllllIlIllIllIlIllIlII = lllllllllllllllIlIllIllIlIllIllI.toCharArray();
         int lllllllllllllllIlIllIllIlIlllIII = lllIllIllIll[0];
         short lllllllllllllllIlIllIllIlIllIIlI = lllllllllllllllIlIllIllIlIllIlll.toCharArray();
         byte lllllllllllllllIlIllIllIlIllIIIl = lllllllllllllllIlIllIllIlIllIIlI.length;
         int lllllllllllllllIlIllIllIlIllIIII = lllIllIllIll[0];

         do {
            if (!lIIllIllllllll(lllllllllllllllIlIllIllIlIllIIII, lllllllllllllllIlIllIllIlIllIIIl)) {
               return String.valueOf(lllllllllllllllIlIllIllIlIlllIlI);
            }

            char lllllllllllllllIlIllIllIlIllllIl = lllllllllllllllIlIllIllIlIllIIlI[lllllllllllllllIlIllIllIlIllIIII];
            lllllllllllllllIlIllIllIlIlllIlI.append((char)(lllllllllllllllIlIllIllIlIllllIl ^ lllllllllllllllIlIllIllIlIllIlII[lllllllllllllllIlIllIllIlIlllIII % lllllllllllllllIlIllIllIlIllIlII.length]));
            "".length();
            ++lllllllllllllllIlIllIllIlIlllIII;
            ++lllllllllllllllIlIllIllIlIllIIII;
            "".length();
         } while(" ".length() << (" ".length() << " ".length()) > 0);

         return null;
      }

      private static void lIIllIllllllII() {
         lllIllIllIll = new int[11];
         lllIllIllIll[0] = ((67 ^ 70) << " ".length() ^ 48 ^ 43) & (80 + 179 - 134 + 84 ^ "   ".length() << ("   ".length() << " ".length()) ^ -" ".length());
         lllIllIllIll[1] = " ".length();
         lllIllIllIll[2] = " ".length() << " ".length();
         lllIllIllIll[3] = "   ".length();
         lllIllIllIll[4] = " ".length() << (" ".length() << " ".length());
         lllIllIllIll[5] = 112 ^ 45 ^ (83 ^ 88) << "   ".length();
         lllIllIllIll[6] = "   ".length() << " ".length();
         lllIllIllIll[7] = 35 ^ 36;
         lllIllIllIll[8] = " ".length() << "   ".length();
         lllIllIllIll[9] = 122 ^ 115;
         lllIllIllIll[10] = (75 ^ 78) << " ".length();
      }

      private static String lIIllIlllllIlI(String lllllllllllllllIlIllIllIlIlIIlIl, String lllllllllllllllIlIllIllIlIlIIlII) {
         try {
            Exception lllllllllllllllIlIllIllIlIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIllIllIlIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIllIllIlIlIlIIl.init(lllIllIllIll[2], lllllllllllllllIlIllIllIlIlIIIll);
            return new String(lllllllllllllllIlIllIllIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static boolean lIIllIllllllIl(Object var0) {
         return var0 != null;
      }

      public String toString() {
         long lllllllllllllllIlIllIllIllIllIIl = new StringBuilder();
         Set<Entry<String, Object>> lllllllllllllllIlIllIllIllIllIII = lllllllllllllllIlIllIllIllIllIlI.map.entrySet();
         lllllllllllllllIlIllIllIllIllIIl.append(lllIllIlIllI[lllIllIllIll[0]]);
         "".length();
         int lllllllllllllllIlIllIllIllIlIlll = lllIllIllIll[0];
         Iterator lllllllllllllllIlIllIllIllIlIllI = lllllllllllllllIlIllIllIllIllIII.iterator();

         do {
            if (!lIIllIlllllllI(lllllllllllllllIlIllIllIllIlIllI.hasNext())) {
               return String.valueOf(lllllllllllllllIlIllIllIllIllIIl);
            }

            Entry<String, Object> lllllllllllllllIlIllIllIllIlIlIl = (Entry)lllllllllllllllIlIllIllIllIlIllI.next();
            short lllllllllllllllIlIllIllIllIlIlII = lllllllllllllllIlIllIllIllIlIlIl.getValue();
            lllllllllllllllIlIllIllIllIllIIl.append(lllllllllllllllIlIllIllIllIllIlI.quote((String)lllllllllllllllIlIllIllIllIlIlIl.getKey())).append(lllIllIlIllI[lllIllIllIll[1]]);
            "".length();
            String var10001;
            if (lIIllIlllllllI(lllllllllllllllIlIllIllIllIlIlII instanceof String)) {
               lllllllllllllllIlIllIllIllIllIIl.append(lllllllllllllllIlIllIllIllIllIlI.quote(String.valueOf(lllllllllllllllIlIllIllIllIlIlII)));
               "".length();
               "".length();
               if (" ".length() == " ".length() << (" ".length() << " ".length())) {
                  return null;
               }
            } else if (lIIllIlllllllI(lllllllllllllllIlIllIllIllIlIlII instanceof Integer)) {
               lllllllllllllllIlIllIllIllIllIIl.append(Integer.valueOf(String.valueOf(lllllllllllllllIlIllIllIllIlIlII)));
               "".length();
               "".length();
               if (" ".length() << (" ".length() << " ".length()) == "   ".length()) {
                  return null;
               }
            } else if (lIIllIlllllllI(lllllllllllllllIlIllIllIllIlIlII instanceof Boolean)) {
               lllllllllllllllIlIllIllIllIllIIl.append(lllllllllllllllIlIllIllIllIlIlII);
               "".length();
               "".length();
               if (null != null) {
                  return null;
               }
            } else if (lIIllIlllllllI(lllllllllllllllIlIllIllIllIlIlII instanceof StringManager.JSONObject)) {
               lllllllllllllllIlIllIllIllIllIIl.append(lllllllllllllllIlIllIllIllIlIlII.toString());
               "".length();
               "".length();
               if (null != null) {
                  return null;
               }
            } else if (lIIllIlllllllI(lllllllllllllllIlIllIllIllIlIlII.getClass().isArray())) {
               lllllllllllllllIlIllIllIllIllIIl.append(lllIllIlIllI[lllIllIllIll[2]]);
               "".length();
               boolean lllllllllllllllIlIllIllIllIlIIll = Array.getLength(lllllllllllllllIlIllIllIllIlIlII);
               int lllllllllllllllIlIllIllIlllIIIIl = lllIllIllIll[0];

               while(lIIllIllllllll(lllllllllllllllIlIllIllIlllIIIIl, lllllllllllllllIlIllIllIllIlIIll)) {
                  StringBuilder var10000 = lllllllllllllllIlIllIllIllIllIIl.append(Array.get(lllllllllllllllIlIllIllIllIlIlII, lllllllllllllllIlIllIllIlllIIIIl).toString());
                  if (lIIlllIIIIIIII(lllllllllllllllIlIllIllIlllIIIIl, lllllllllllllllIlIllIllIllIlIIll - lllIllIllIll[1])) {
                     var10001 = lllIllIlIllI[lllIllIllIll[3]];
                     "".length();
                     if (null != null) {
                        return null;
                     }
                  } else {
                     var10001 = lllIllIlIllI[lllIllIllIll[4]];
                  }

                  var10000.append(var10001);
                  "".length();
                  ++lllllllllllllllIlIllIllIlllIIIIl;
                  "".length();
                  if (-"   ".length() > 0) {
                     return null;
                  }
               }

               lllllllllllllllIlIllIllIllIllIIl.append(lllIllIlIllI[lllIllIllIll[5]]);
               "".length();
            }

            ++lllllllllllllllIlIllIllIllIlIlll;
            if (lIIlllIIIIIIIl(lllllllllllllllIlIllIllIllIlIlll, lllllllllllllllIlIllIllIllIllIII.size())) {
               var10001 = lllIllIlIllI[lllIllIllIll[6]];
               "".length();
               if (" ".length() < " ".length()) {
                  return null;
               }
            } else {
               var10001 = lllIllIlIllI[lllIllIllIll[7]];
            }

            lllllllllllllllIlIllIllIllIllIIl.append(var10001);
            "".length();
            "".length();
         } while(-"   ".length() <= 0);

         return null;
      }

      private static String lIIllIlllllIII(String lllllllllllllllIlIllIllIlIIllIII, String lllllllllllllllIlIllIllIlIIllIIl) {
         try {
            SecretKeySpec lllllllllllllllIlIllIllIlIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIllIlIIllIIl.getBytes(StandardCharsets.UTF_8)), lllIllIllIll[8]), "DES");
            Cipher lllllllllllllllIlIllIllIlIIlllII = Cipher.getInstance("DES");
            lllllllllllllllIlIllIllIlIIlllII.init(lllIllIllIll[2], lllllllllllllllIlIllIllIlIIlllIl);
            return new String(lllllllllllllllIlIllIllIlIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIllIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
         } catch (Exception var4) {
            var4.printStackTrace();
            return null;
         }
      }

      private static boolean lIIllIlllllllI(int var0) {
         return var0 != 0;
      }

      static {
         lIIllIllllllII();
         lIIllIlllllIll();
      }

      private static void lIIllIlllllIll() {
         lllIllIlIllI = new String[lllIllIllIll[10]];
         lllIllIlIllI[lllIllIllIll[0]] = lIIllIlllllIII("XbiV/8ZP4KE=", "BEFTi");
         lllIllIlIllI[lllIllIllIll[1]] = lIIllIlllllIIl("Xg==", "dUznd");
         lllIllIlIllI[lllIllIllIll[2]] = lIIllIlllllIlI("m5DcwZhRGSY=", "mSHyS");
         lllIllIlIllI[lllIllIllIll[3]] = lIIllIlllllIlI("Yfuy1bnZ9Z8=", "ExEwz");
         lllIllIlIllI[lllIllIllIll[4]] = lIIllIlllllIII("owWwDPAtGDE=", "sZAZY");
         lllIllIlIllI[lllIllIllIll[5]] = lIIllIlllllIlI("2EVOgLYY5ag=", "tkQkw");
         lllIllIlIllI[lllIllIllIll[6]] = lIIllIlllllIlI("xJR9LsrNh3I=", "iThGf");
         lllIllIlIllI[lllIllIllIll[7]] = lIIllIlllllIII("L52UnoYJB2Y=", "zxYgz");
         lllIllIlIllI[lllIllIllIll[8]] = lIIllIlllllIlI("izVg95nxB2Q=", "GyYaF");
         lllIllIlIllI[lllIllIllIll[9]] = lIIllIlllllIIl("Sg==", "hgsui");
      }

      private static boolean lIIlllIIIIIIIl(int var0, int var1) {
         return var0 == var1;
      }

      private String quote(String lllllllllllllllIlIllIllIllIIlllI) {
         return String.valueOf((new StringBuilder()).append(lllIllIlIllI[lllIllIllIll[8]]).append(lllllllllllllllIlIllIllIllIIlllI).append(lllIllIlIllI[lllIllIllIll[9]]));
      }

      private JSONObject() {
         lllllllllllllllIlIllIllIllllIllI.map = new HashMap();
      }

      private static boolean lIIllIllllllll(int var0, int var1) {
         return var0 < var1;
      }

      // $FF: synthetic method
      JSONObject(Object lllllllllllllllIlIllIllIllIIlIIl) {
         this();
      }

      void put(String lllllllllllllllIlIllIllIlllIllIl, Object lllllllllllllllIlIllIllIlllIllll) {
         if (lIIllIllllllIl(lllllllllllllllIlIllIllIlllIllll)) {
            lllllllllllllllIlIllIllIllllIIIl.map.put(lllllllllllllllIlIllIllIlllIllIl, lllllllllllllllIlIllIllIlllIllll);
            "".length();
         }

      }
   }

   public static class EmbedObject {
      // $FF: synthetic field
      private String url;
      // $FF: synthetic field
      private ArrayList<StringManager.EmbedObject.Field> fields = new ArrayList();
      // $FF: synthetic field
      private StringManager.EmbedObject.Thumbnail thumbnail;
      // $FF: synthetic field
      private StringManager.EmbedObject.Footer footer;
      // $FF: synthetic field
      private String title;
      // $FF: synthetic field
      private Color color;
      // $FF: synthetic field
      private StringManager.EmbedObject.Image image;
      // $FF: synthetic field
      private StringManager.EmbedObject.Author author;
      // $FF: synthetic field
      private String description;

      public StringManager.EmbedObject.Image getImage() {
         return lllllllllllllllIlIIllllIIIlIIlIl.image;
      }

      public StringManager.EmbedObject setAuthor(String lllllllllllllllIlIIlllIllllIllII, String lllllllllllllllIlIIlllIllllIIlll, String lllllllllllllllIlIIlllIllllIlIlI) {
         lllllllllllllllIlIIlllIllllIlIIl.author = new StringManager.EmbedObject.Author(lllllllllllllllIlIIlllIllllIllII, lllllllllllllllIlIIlllIllllIIlll, lllllllllllllllIlIIlllIllllIlIlI);
         return lllllllllllllllIlIIlllIllllIlIIl;
      }

      public StringManager.EmbedObject.Author getAuthor() {
         return lllllllllllllllIlIIllllIIIlIIIlI.author;
      }

      public StringManager.EmbedObject setDescription(String lllllllllllllllIlIIllllIIIIlIIll) {
         lllllllllllllllIlIIllllIIIIlIlII.description = lllllllllllllllIlIIllllIIIIlIIll;
         return lllllllllllllllIlIIllllIIIIlIlII;
      }

      public StringManager.EmbedObject setTitle(String lllllllllllllllIlIIllllIIIIllIIl) {
         lllllllllllllllIlIIllllIIIIllIlI.title = lllllllllllllllIlIIllllIIIIllIIl;
         return lllllllllllllllIlIIllllIIIIllIlI;
      }

      public StringManager.EmbedObject setUrl(String lllllllllllllllIlIIllllIIIIIllll) {
         lllllllllllllllIlIIllllIIIIIlllI.url = lllllllllllllllIlIIllllIIIIIllll;
         return lllllllllllllllIlIIllllIIIIIlllI;
      }

      public ArrayList<StringManager.EmbedObject.Field> getFields() {
         return lllllllllllllllIlIIllllIIIIlllll.fields;
      }

      public StringManager.EmbedObject setImage(String lllllllllllllllIlIIlllIlllllIlII) {
         lllllllllllllllIlIIlllIlllllIIll.image = new StringManager.EmbedObject.Image(lllllllllllllllIlIIlllIlllllIlII);
         return lllllllllllllllIlIIlllIlllllIIll;
      }

      public String getUrl() {
         return lllllllllllllllIlIIllllIIIllIIlI.url;
      }

      public StringManager.EmbedObject addField(String lllllllllllllllIlIIlllIlllIlllII, String lllllllllllllllIlIIlllIlllIlllll, boolean lllllllllllllllIlIIlllIlllIllIlI) {
         lllllllllllllllIlIIlllIllllIIIIl.fields.add(new StringManager.EmbedObject.Field(lllllllllllllllIlIIlllIlllIlllII, lllllllllllllllIlIIlllIlllIlllll, lllllllllllllllIlIIlllIlllIllIlI));
         "".length();
         return lllllllllllllllIlIIlllIllllIIIIl;
      }

      public StringManager.EmbedObject setFooter(String lllllllllllllllIlIIllllIIIIIIIlI, String lllllllllllllllIlIIlllIllllllllI) {
         lllllllllllllllIlIIllllIIIIIIIll.footer = new StringManager.EmbedObject.Footer(lllllllllllllllIlIIllllIIIIIIIlI, lllllllllllllllIlIIlllIllllllllI);
         return lllllllllllllllIlIIllllIIIIIIIll;
      }

      public StringManager.EmbedObject.Thumbnail getThumbnail() {
         return lllllllllllllllIlIIllllIIIlIlIII.thumbnail;
      }

      public String getDescription() {
         return lllllllllllllllIlIIllllIIIllIlII.description;
      }

      public StringManager.EmbedObject setThumbnail(String lllllllllllllllIlIIlllIllllllIlI) {
         lllllllllllllllIlIIlllIllllllIIl.thumbnail = new StringManager.EmbedObject.Thumbnail(lllllllllllllllIlIIlllIllllllIlI);
         return lllllllllllllllIlIIlllIllllllIIl;
      }

      public String getTitle() {
         return lllllllllllllllIlIIllllIIIllIlll.title;
      }

      public Color getColor() {
         return lllllllllllllllIlIIllllIIIlIlllI.color;
      }

      public StringManager.EmbedObject setColor(Color lllllllllllllllIlIIllllIIIIIIlll) {
         lllllllllllllllIlIIllllIIIIIlIII.color = lllllllllllllllIlIIllllIIIIIIlll;
         return lllllllllllllllIlIIllllIIIIIlIII;
      }

      public StringManager.EmbedObject.Footer getFooter() {
         return lllllllllllllllIlIIllllIIIlIllII.footer;
      }

      private class Footer {
         // $FF: synthetic field
         private String text;
         // $FF: synthetic field
         private String iconUrl;

         // $FF: synthetic method
         Footer(String lllllllllllllllIlIIIlllIlllIIIlI, String lllllllllllllllIlIIIlllIlllIIIIl, Object lllllllllllllllIlIIIlllIlllIIIII) {
            this(lllllllllllllllIlIIIlllIlllIIIlI, lllllllllllllllIlIIIlllIlllIIIIl);
         }

         private String getIconUrl() {
            return lllllllllllllllIlIIIlllIllllIIII.iconUrl;
         }

         private String getText() {
            return lllllllllllllllIlIIIlllIllllIIll.text;
         }

         private Footer(String lllllllllllllllIlIIIlllIllllIllI, String lllllllllllllllIlIIIlllIlllllIIl) {
            lllllllllllllllIlIIIlllIlllllIII.text = lllllllllllllllIlIIIlllIllllIllI;
            lllllllllllllllIlIIIlllIlllllIII.iconUrl = lllllllllllllllIlIIIlllIlllllIIl;
         }
      }

      private class Field {
         // $FF: synthetic field
         private String value;
         // $FF: synthetic field
         private boolean inline;
         // $FF: synthetic field
         private String name;

         private String getValue() {
            return lllllllllllllllIlIllIlllIIIlIlll.value;
         }

         // $FF: synthetic method
         Field(String lllllllllllllllIlIllIlllIIIIIIlI, String lllllllllllllllIlIllIlllIIIIIIIl, boolean lllllllllllllllIlIllIlllIIIIIIII, Object lllllllllllllllIlIllIllIllllllll) {
            this(lllllllllllllllIlIllIlllIIIIIIlI, lllllllllllllllIlIllIlllIIIIIIIl, lllllllllllllllIlIllIlllIIIIIIII);
         }

         private boolean isInline() {
            return lllllllllllllllIlIllIlllIIIlIlII.inline;
         }

         private Field(String lllllllllllllllIlIllIlllIIlIIIll, String lllllllllllllllIlIllIlllIIIlllIl, boolean lllllllllllllllIlIllIlllIIlIIIIl) {
            lllllllllllllllIlIllIlllIIlIIlII.name = lllllllllllllllIlIllIlllIIlIIIll;
            lllllllllllllllIlIllIlllIIlIIlII.value = lllllllllllllllIlIllIlllIIIlllIl;
            lllllllllllllllIlIllIlllIIlIIlII.inline = lllllllllllllllIlIllIlllIIlIIIIl;
         }

         private String getName() {
            return lllllllllllllllIlIllIlllIIIllIlI.name;
         }
      }

      private class Image {
         // $FF: synthetic field
         private String url;

         // $FF: synthetic method
         Image(String lllllllllllllllIlIllIllllIllllIl, Object lllllllllllllllIlIllIlllllIIIIII) {
            this(lllllllllllllllIlIllIllllIllllIl);
         }

         private Image(String lllllllllllllllIlIllIlllllIlIIII) {
            lllllllllllllllIlIllIlllllIIllll.url = lllllllllllllllIlIllIlllllIlIIII;
         }

         private String getUrl() {
            return lllllllllllllllIlIllIlllllIIlIlI.url;
         }
      }

      private class Author {
         // $FF: synthetic field
         private String iconUrl;
         // $FF: synthetic field
         private String name;
         // $FF: synthetic field
         private String url;

         private String getIconUrl() {
            return lllllllllllllllIlIIlIIIIlIIlIIlI.iconUrl;
         }

         private String getName() {
            return lllllllllllllllIlIIlIIIIlIlIIIII.name;
         }

         // $FF: synthetic method
         Author(String lllllllllllllllIlIIlIIIIIllIllll, String lllllllllllllllIlIIlIIIIIllIIlIl, String lllllllllllllllIlIIlIIIIIllIllII, Object lllllllllllllllIlIIlIIIIIllIlIlI) {
            this(lllllllllllllllIlIIlIIIIIllIllll, lllllllllllllllIlIIlIIIIIllIIlIl, lllllllllllllllIlIIlIIIIIllIllII);
         }

         private Author(String lllllllllllllllIlIIlIIIIlIlIlIII, String lllllllllllllllIlIIlIIIIlIlIIllI, String lllllllllllllllIlIIlIIIIlIlIIlII) {
            lllllllllllllllIlIIlIIIIlIllIIIl.name = lllllllllllllllIlIIlIIIIlIlIlIII;
            lllllllllllllllIlIIlIIIIlIllIIIl.url = lllllllllllllllIlIIlIIIIlIlIIllI;
            lllllllllllllllIlIIlIIIIlIllIIIl.iconUrl = lllllllllllllllIlIIlIIIIlIlIIlII;
         }

         private String getUrl() {
            return lllllllllllllllIlIIlIIIIlIIllIIl.url;
         }
      }

      private class Thumbnail {
         // $FF: synthetic field
         private String url;

         private Thumbnail(String lllllllllllllllIIllllllllIIIIllI) {
            lllllllllllllllIIllllllllIIIlIlI.url = lllllllllllllllIIllllllllIIIIllI;
         }

         private String getUrl() {
            return lllllllllllllllIIllllllllIIIIIll.url;
         }

         // $FF: synthetic method
         Thumbnail(String lllllllllllllllIIlllllllIlllIllI, Object lllllllllllllllIIlllllllIllllIIl) {
            this(lllllllllllllllIIlllllllIlllIllI);
         }
      }
   }
}
