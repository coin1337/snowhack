package rr.snowhack.snow.util;

import com.google.common.collect.HashBiMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MojangWebApi {
   // $FF: synthetic field
   private static final int[] llllIlIlIlll;
   // $FF: synthetic field
   private static final String[] llllIlIlIIIl;
   // $FF: synthetic field
   public static HashBiMap<Object, Object> userbase;

   private static boolean lIlIIIIIIlIllI(int var0, int var1) {
      return var0 < var1;
   }

   private static void lIlIIIIIIIllll() {
      llllIlIlIIIl = new String[llllIlIlIlll[19]];
      llllIlIlIIIl[llllIlIlIlll[1]] = lIlIIIIIIIIllI("xz6hsvr1Ww/y9YX1dkgXq48PR2FOYLezykpSTZKeap8rxRTeJIH4Tg==", "Epyby");
      llllIlIlIIIl[llllIlIlIlll[0]] = lIlIIIIIIIIlll("3SV3AuhpgX0=", "AZJuE");
      llllIlIlIIIl[llllIlIlIlll[2]] = lIlIIIIIIIIllI("Pf32HlVE6kE=", "cTZcD");
      llllIlIlIIIl[llllIlIlIlll[3]] = lIlIIIIIIIlIII("TQ82Pi0R", "baWSH");
      llllIlIlIIIl[llllIlIlIlll[4]] = lIlIIIIIIIIllI("qQi8ACmU7lbjUukXQPW00g==", "YinRG");
      llllIlIlIIIl[llllIlIlIlll[5]] = lIlIIIIIIIIllI("KICuJKi9Sco=", "yxtpb");
      llllIlIlIIIl[llllIlIlIlll[6]] = lIlIIIIIIIlIII("IicBAhUhIwlrBz0qYWsRLjQPBB4qKwIFAU8vHmsWOisPaxspRhQEB08nHw5yPSMMDxshIW0fGiY1YWsQKiUMHgEqSm0cGi4yYWsbIjYCGAEmJAEOfEFIbQcbOyUFDgAuKgEHC0FIYw==", "ofMKR");
      llllIlIlIIIl[llllIlIlIlll[7]] = lIlIIIIIIIIlll("hl7aWXEbuUM=", "DHGXS");
      llllIlIlIIIl[llllIlIlIlll[8]] = lIlIIIIIIIIlll("79o/N93hR/1DgGSmMYchkFXmB9LHzd6HIhh9yMGK+y1MegUQkewQNJkZckl6NMFNyUzyhnBLjgCvKiCZ4XIJCcPzHkDTDPy5", "umgyC");
      llllIlIlIIIl[llllIlIlIlll[9]] = lIlIIIIIIIlIII("", "SCBqz");
      llllIlIlIIIl[llllIlIlIlll[10]] = lIlIIIIIIIIllI("QZz8Rp6txxrnPEPTtUKmsa3bp3GBc5auRCUOAIIFt7P5g+OYsk7OZg==", "JHUBV");
      llllIlIlIIIl[llllIlIlIlll[11]] = lIlIIIIIIIlIII("", "aiCCf");
      llllIlIlIIIl[llllIlIlIlll[12]] = lIlIIIIIIIIllI("UMzXbacA29dhM1G7vv9NOf6SfqtW8GipsXYBRXlXLK/zYgXTmzPo+pYdaLlM8kNNuT5+CYyhN54=", "oFAcF");
      llllIlIlIIIl[llllIlIlIlll[13]] = lIlIIIIIIIIlll("wPqRPOn5mhnA+pE86fmaGcD6kTzp+ZoZwPqRPOn5mhnJwUr/kbfqeg==", "ACkqv");
      llllIlIlIIIl[llllIlIlIlll[14]] = lIlIIIIIIIIllI("XAfwbVAaUvTTfq3CsWOa9vyQ4AyRsSzWXAfwbVAaUvS2NEwbiDRLhw==", "PzQVr");
      llllIlIlIIIl[llllIlIlIlll[15]] = lIlIIIIIIIlIII("QzE4KDlCJSQmJAQHJA==", "kpJMJ");
      llllIlIlIIIl[llllIlIlIlll[16]] = lIlIIIIIIIlIII("Iw8=", "JkESb");
      llllIlIlIIIl[llllIlIlIlll[20]] = lIlIIIIIIIlIII("PQwgICo+CChJOCIBQEkuMR8uJiE1ACMnPlAEP0kpJQAuSSQ2bTUmOFAMPixNIggtLSQ+Ckw9JTkeQEkvNQ4tPD41YUw+JTEZQEkkPR0jOj45DyAsQ15jTCUkJA4kLD8xASAlNF5jQg==", "pMlim");
      llllIlIlIIIl[llllIlIlIlll[18]] = lIlIIIIIIIIlll("2CQaYZN41z8=", "vGAWW");
      llllIlIlIIIl[llllIlIlIlll[21]] = lIlIIIIIIIIllI("pwlr5off9UnMbvUr07/uDvEctX/e+mPwR44CczfbnMSXt6KZAsdOwRlPqHLzhOOse8RKHlem73qepGx+et3olE/Lb3R4PYTK", "nigYv");
      llllIlIlIIIl[llllIlIlIlll[22]] = lIlIIIIIIIIllI("pCBtdS2A5WM=", "CDBpX");
      llllIlIlIIIl[llllIlIlIlll[23]] = lIlIIIIIIIIlll("bKn4m+2K8Kv1EsLf6tBo8sF6Or9jiCxaXMa/fhQckn2TCdaQTUngVg==", "PQMKF");
      llllIlIlIIIl[llllIlIlIlll[24]] = lIlIIIIIIIIllI("0VBTSEY4z7Y=", "ylinj");
   }

   public static String grabRealName(String lllllllllllllllIlIlIIlllIllIIlll) {
      return lIlIIIIIIlIlII(userbase.containsKey(lllllllllllllllIlIlIIlllIllIIlll)) ? (String)userbase.get(lllllllllllllllIlIlIIlllIllIIlll) : QueryWebApi(lllllllllllllllIlIlIIlllIllIIlll, Boolean.valueOf((boolean)llllIlIlIlll[0]));
   }

   private static String lIlIIIIIIIIllI(String lllllllllllllllIlIlIIlllIIIIlllI, String lllllllllllllllIlIlIIlllIIIIlIll) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIlllIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIlllIIIIlIll.getBytes(StandardCharsets.UTF_8)), llllIlIlIlll[8]), "DES");
         Cipher lllllllllllllllIlIlIIlllIIIlIIII = Cipher.getInstance("DES");
         lllllllllllllllIlIlIIlllIIIlIIII.init(llllIlIlIlll[2], lllllllllllllllIlIlIIlllIIIlIIIl);
         return new String(lllllllllllllllIlIlIIlllIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String grabRealUUID(String lllllllllllllllIlIlIIlllIllIIlII) {
      return lIlIIIIIIlIlII(userbase.containsValue(lllllllllllllllIlIlIIlllIllIIlII)) ? (String)userbase.inverse().get(lllllllllllllllIlIlIIlllIllIIlII) : QueryWebApi(lllllllllllllllIlIlIIlllIllIIlII, Boolean.valueOf((boolean)llllIlIlIlll[1]));
   }

   private static String lIlIIIIIIIlIII(String lllllllllllllllIlIlIIlllIIlIIIll, String lllllllllllllllIlIlIIlllIIlIIIlI) {
      lllllllllllllllIlIlIIlllIIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIlIIlllIIlIIIIl = new StringBuilder();
      double lllllllllllllllIlIlIIlllIIIllIll = lllllllllllllllIlIlIIlllIIlIIIlI.toCharArray();
      int lllllllllllllllIlIlIIlllIIIlllll = llllIlIlIlll[1];
      short lllllllllllllllIlIlIIlllIIIllIIl = lllllllllllllllIlIlIIlllIIlIIIll.toCharArray();
      char lllllllllllllllIlIlIIlllIIIllIII = lllllllllllllllIlIlIIlllIIIllIIl.length;
      int lllllllllllllllIlIlIIlllIIIlIlll = llllIlIlIlll[1];

      do {
         if (!lIlIIIIIIlIllI(lllllllllllllllIlIlIIlllIIIlIlll, lllllllllllllllIlIlIIlllIIIllIII)) {
            return String.valueOf(lllllllllllllllIlIlIIlllIIlIIIIl);
         }

         Exception lllllllllllllllIlIlIIlllIIIlIllI = lllllllllllllllIlIlIIlllIIIllIIl[lllllllllllllllIlIlIIlllIIIlIlll];
         lllllllllllllllIlIlIIlllIIlIIIIl.append((char)(lllllllllllllllIlIlIIlllIIIlIllI ^ lllllllllllllllIlIlIIlllIIIllIll[lllllllllllllllIlIlIIlllIIIlllll % lllllllllllllllIlIlIIlllIIIllIll.length]));
         "".length();
         ++lllllllllllllllIlIlIIlllIIIlllll;
         ++lllllllllllllllIlIlIIlllIIIlIlll;
         "".length();
      } while(-"   ".length() <= 0);

      return null;
   }

   private static String QueryWebApi(String lllllllllllllllIlIlIIlllIIllllII, Boolean lllllllllllllllIlIlIIlllIIlllIIl) {
      String lllllllllllllllIlIlIIlllIlIIIllI;
      URL lllllllllllllllIlIlIIlllIIllIlll;
      BufferedReader lllllllllllllllIlIlIIlllIIllIllI;
      String lllllllllllllllIlIlIIlllIlIIIIll;
      String lllllllllllllllIlIlIIlllIlIIIIlI;
      if (lIlIIIIIIlIlII(lllllllllllllllIlIlIIlllIIlllIIl)) {
         try {
            lllllllllllllllIlIlIIlllIlIIIllI = String.valueOf((new StringBuilder()).append(llllIlIlIIIl[llllIlIlIlll[1]]).append(lllllllllllllllIlIlIIlllIIllllII.replace(llllIlIlIIIl[llllIlIlIlll[0]], llllIlIlIIIl[llllIlIlIlll[2]])).append(llllIlIlIIIl[llllIlIlIlll[3]]));
            lllllllllllllllIlIlIIlllIIllIlll = new URL(lllllllllllllllIlIlIIlllIlIIIllI);
            lllllllllllllllIlIlIIlllIIllIllI = new BufferedReader(new InputStreamReader(lllllllllllllllIlIlIIlllIIllIlll.openStream()));
            lllllllllllllllIlIlIIlllIlIIIIll = llllIlIlIIIl[llllIlIlIlll[4]];
            lllllllllllllllIlIlIIlllIlIIIIlI = lllllllllllllllIlIlIIlllIIllIllI.readLine();
            System.out.println(lllllllllllllllIlIlIIlllIlIIIIlI);
            lllllllllllllllIlIlIIlllIIllIllI.close();
            if (lIlIIIIIIlIlIl(lllllllllllllllIlIlIIlllIlIIIIlI)) {
               long lllllllllllllllIlIlIIlllIIllIIll = new JSONParser();
               JSONArray lllllllllllllllIlIlIIlllIlIlIlII = (JSONArray)lllllllllllllllIlIlIIlllIIllIIll.parse(lllllllllllllllIlIlIIlllIlIIIIlI);
               JSONObject lllllllllllllllIlIlIIlllIlIlIIll = (JSONObject)lllllllllllllllIlIlIIlllIlIlIlII.get(lllllllllllllllIlIlIIlllIlIlIlII.size() - llllIlIlIlll[0]);
               lllllllllllllllIlIlIIlllIlIIIIll = lllllllllllllllIlIlIIlllIlIlIIll.get(llllIlIlIIIl[llllIlIlIlll[5]]).toString();
            }

            lllllllllllllllIlIlIIlllIIllIllI.close();
            userbase.put(lllllllllllllllIlIlIIlllIIllllII, lllllllllllllllIlIlIIlllIlIIIIll);
            "".length();
            return lllllllllllllllIlIlIIlllIlIIIIll;
         } catch (MalformedURLException var13) {
            System.out.println(llllIlIlIIIl[llllIlIlIlll[6]]);
            return llllIlIlIIIl[llllIlIlIlll[7]];
         } catch (IOException var14) {
            System.out.println(llllIlIlIIIl[llllIlIlIlll[8]]);
            return llllIlIlIIIl[llllIlIlIlll[9]];
         } catch (ParseException var15) {
            System.out.println(llllIlIlIIIl[llllIlIlIlll[10]]);
            return llllIlIlIIIl[llllIlIlIlll[11]];
         }
      } else {
         try {
            lllllllllllllllIlIlIIlllIlIIIllI = String.valueOf((new StringBuilder()).append(llllIlIlIIIl[llllIlIlIlll[12]]).append(lllllllllllllllIlIlIIlllIIllllII));
            lllllllllllllllIlIlIIlllIIllIlll = new URL(lllllllllllllllIlIlIIlllIlIIIllI);
            lllllllllllllllIlIlIIlllIIllIllI = new BufferedReader(new InputStreamReader(lllllllllllllllIlIlIIlllIIllIlll.openStream()));
            lllllllllllllllIlIlIIlllIlIIIIll = llllIlIlIIIl[llllIlIlIlll[13]];
            lllllllllllllllIlIlIIlllIlIIIIlI = llllIlIlIIIl[llllIlIlIlll[14]];
            long lllllllllllllllIlIlIIlllIIllIIll = llllIlIlIIIl[llllIlIlIlll[15]];
            String lllllllllllllllIlIlIIlllIlIIIIII = lllllllllllllllIlIlIIlllIIllIllI.readLine();
            lllllllllllllllIlIlIIlllIIllIllI.close();
            if (lIlIIIIIIlIlIl(lllllllllllllllIlIlIIlllIlIIIIII)) {
               JSONParser lllllllllllllllIlIlIIlllIlIIlIlI = new JSONParser();
               boolean lllllllllllllllIlIlIIlllIIllIIII = (JSONObject)lllllllllllllllIlIlIIlllIlIIlIlI.parse(lllllllllllllllIlIlIIlllIlIIIIII);
               lllllllllllllllIlIlIIlllIlIIIIll = lllllllllllllllIlIlIIlllIIllIIII.get(llllIlIlIIIl[llllIlIlIlll[16]]).toString();
               boolean lllllllllllllllIlIlIIlllIIlIlllI = new StringBuilder(lllllllllllllllIlIlIIlllIlIIIIll);
               lllllllllllllllIlIlIIlllIIlIlllI.insert(llllIlIlIlll[8], (char)llllIlIlIlll[17]);
               "".length();
               lllllllllllllllIlIlIIlllIIlIlllI.insert(llllIlIlIlll[13], (char)llllIlIlIlll[17]);
               "".length();
               lllllllllllllllIlIlIIlllIIlIlllI.insert(llllIlIlIlll[18], (char)llllIlIlIlll[17]);
               "".length();
               lllllllllllllllIlIlIIlllIIlIlllI.insert(llllIlIlIlll[19], (char)llllIlIlIlll[17]);
               "".length();
               lllllllllllllllIlIlIIlllIlIIIIlI = String.valueOf(lllllllllllllllIlIlIIlllIIlIlllI);
            }

            userbase.put(lllllllllllllllIlIlIIlllIlIIIIlI, lllllllllllllllIlIlIIlllIIllllII);
            "".length();
            return lllllllllllllllIlIlIIlllIlIIIIlI;
         } catch (MalformedURLException var16) {
            System.out.println(llllIlIlIIIl[llllIlIlIlll[20]]);
            return llllIlIlIIIl[llllIlIlIlll[18]];
         } catch (IOException var17) {
            System.out.println(llllIlIlIIIl[llllIlIlIlll[21]]);
            return llllIlIlIIIl[llllIlIlIlll[22]];
         } catch (ParseException var18) {
            System.out.println(llllIlIlIIIl[llllIlIlIlll[23]]);
            return llllIlIlIIIl[llllIlIlIlll[24]];
         }
      }
   }

   static {
      lIlIIIIIIlIIll();
      lIlIIIIIIIllll();
      userbase = HashBiMap.create();
   }

   private static boolean lIlIIIIIIlIlIl(Object var0) {
      return var0 != null;
   }

   private static String lIlIIIIIIIIlll(String lllllllllllllllIlIlIIlllIIIIIIIl, String lllllllllllllllIlIlIIllIlllllllI) {
      try {
         SecretKeySpec lllllllllllllllIlIlIIlllIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIllIlllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         int lllllllllllllllIlIlIIllIllllllII = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIlIIllIllllllII.init(llllIlIlIlll[2], lllllllllllllllIlIlIIlllIIIIIlII);
         return new String(lllllllllllllllIlIlIIllIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIlllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIIIIIIlIlII(int var0) {
      return var0 != 0;
   }

   private static void lIlIIIIIIlIIll() {
      llllIlIlIlll = new int[25];
      llllIlIlIlll[0] = " ".length();
      llllIlIlIlll[1] = (44 ^ 15) & ~(188 ^ 159);
      llllIlIlIlll[2] = " ".length() << " ".length();
      llllIlIlIlll[3] = "   ".length();
      llllIlIlIlll[4] = " ".length() << (" ".length() << " ".length());
      llllIlIlIlll[5] = 154 ^ 159;
      llllIlIlIlll[6] = "   ".length() << " ".length();
      llllIlIlIlll[7] = 32 + 81 - -23 + 1 ^ (49 ^ 118) << " ".length();
      llllIlIlIlll[8] = " ".length() << "   ".length();
      llllIlIlIlll[9] = 134 ^ 143;
      llllIlIlIlll[10] = (44 ^ 41) << " ".length();
      llllIlIlIlll[11] = (26 ^ 23) << " ".length() ^ 191 ^ 174;
      llllIlIlIlll[12] = "   ".length() << (" ".length() << " ".length());
      llllIlIlIlll[13] = 33 + 32 - -124 + 0 ^ (183 ^ 188) << (" ".length() << (" ".length() << " ".length()));
      llllIlIlIlll[14] = (254 ^ 197 ^ (109 ^ 98) << (" ".length() << " ".length())) << " ".length();
      llllIlIlIlll[15] = 38 ^ 41;
      llllIlIlIlll[16] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      llllIlIlIlll[17] = 64 ^ 109;
      llllIlIlIlll[18] = (166 ^ 175) << " ".length();
      llllIlIlIlll[19] = 68 + 127 - 143 + 123 ^ (111 ^ 120) << "   ".length();
      llllIlIlIlll[20] = " ".length() << " ".length() ^ 68 ^ 87;
      llllIlIlIlll[21] = 72 ^ 91;
      llllIlIlIlll[22] = (69 ^ 64) << (" ".length() << " ".length());
      llllIlIlIlll[23] = 53 ^ 32;
      llllIlIlIlll[24] = ((8 ^ 55) << " ".length() ^ 88 ^ 45) << " ".length();
   }
}
