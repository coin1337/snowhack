package rr.snowhack.snow.util;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class ColourUtils {
   // $FF: synthetic field
   private static final String[] lllIlllIllII;
   // $FF: synthetic field
   private static final int[] lllIllllIlIl;

   private static void lIIlllIllIIIII() {
      lllIlllIllII = new String[lllIllllIlIl[99]];
      lllIlllIllII[lllIllllIlIl[0]] = lIIlllIlIlIlll("KQ5VF6qy132/c1Naay242g==", "eWKhq");
      lllIlllIllII[lllIllllIlIl[4]] = lIIlllIlIllIII("X0xnAmek5RgGiib93JIB0Q==", "hhCkz");
      lllIlllIllII[lllIllllIlIl[8]] = lIIlllIlIlIlll("vnD4dQPfCG4=", "GdyvM");
      lllIlllIllII[lllIllllIlIl[9]] = lIIlllIlIllIIl("JzkRED8HOg0fNw==", "fHdqR");
      lllIlllIllII[lllIllllIlIl[12]] = lIIlllIlIllIIl("OD0gOxU=", "yGUIp");
      lllIlllIllII[lllIllllIlIl[13]] = lIIlllIlIllIIl("MAgIPS0=", "rmaZH");
      lllIlllIllII[lllIllllIlIl[16]] = lIIlllIlIlIlll("EQOgi7riHSA=", "cIuku");
      lllIlllIllII[lllIllllIlIl[19]] = lIIlllIlIllIIl("BgMEJA8=", "DoeGd");
      lllIlllIllII[lllIllllIlIl[20]] = lIIlllIlIlIlll("Xl1bf1t0UGrp9XxM0IKfPw==", "BfHgk");
      lllIlllIllII[lllIllllIlIl[22]] = lIIlllIlIlIlll("wYme8E0ToBo=", "HofSn");
      lllIlllIllII[lllIllllIlIl[23]] = lIIlllIlIllIIl("NxwgDSAcHzkNAg==", "upUhv");
      lllIlllIllII[lllIllllIlIl[27]] = lIIlllIlIlIlll("9RYFpsGK3oA=", "lIvaU");
      lllIlllIllII[lllIllllIlIl[30]] = lIIlllIlIllIII("2SMLCRRtpQ5hQXBeTEcvDw==", "BBZbF");
      lllIlllIllII[lllIllllIlIl[34]] = lIIlllIlIlIlll("7JCI9gd07QVFr6ah7iM6vA==", "OZeOw");
      lllIlllIllII[lllIllllIlIl[38]] = lIIlllIlIllIIl("FispGRonJj0YCw==", "UCHkn");
      lllIlllIllII[lllIllllIlIl[39]] = lIIlllIlIllIIl("BCc+GR8rLiUf", "GOQzp");
      lllIlllIllII[lllIllllIlIl[43]] = lIIlllIlIlIlll("HhgtZJXF8M8=", "fjQUK");
      lllIlllIllII[lllIllllIlIl[45]] = lIIlllIlIlIlll("WIyXHJ7o+2+mMCssRMfaWA==", "zGfmS");
      lllIlllIllII[lllIllllIlIl[49]] = lIIlllIlIllIII("aiSj2zt69gg6bPiMTrVrbg==", "knenO");
      lllIlllIllII[lllIllllIlIl[50]] = lIIlllIlIllIII("/gf1h82cCfs=", "ultyH");
      lllIlllIllII[lllIllllIlIl[51]] = lIIlllIlIllIIl("DzUxHg==", "LLPpO");
      lllIlllIllII[lllIllllIlIl[53]] = lIIlllIlIllIII("LfDox3b+kBTDHtwP7exnCA==", "mPbTc");
      lllIlllIllII[lllIllllIlIl[55]] = lIIlllIlIllIII("J5wgO9TR2FvGMKh6lJ0dCg==", "syDZG");
      lllIlllIllII[lllIllllIlIl[56]] = lIIlllIlIlIlll("f6Mgc1+w/M1DWTfTn0fWCA==", "vSrrV");
      lllIlllIllII[lllIllllIlIl[58]] = lIIlllIlIllIII("x/aVJ1HTb/p+QJEoDT+uZg==", "HZvGZ");
      lllIlllIllII[lllIllllIlIl[60]] = lIIlllIlIllIIl("MBMqIDAGFz0l", "trXKw");
      lllIlllIllII[lllIllllIlIl[61]] = lIIlllIlIllIIl("BxkDDiUrGRoM", "Cxqen");
      lllIlllIllII[lllIllllIlIl[65]] = lIIlllIlIllIII("XbaSVZQ2M/ssftniwBH0tA==", "LfmXO");
      lllIlllIllII[lllIllllIlIl[66]] = lIIlllIlIllIII("RUHb+fpuItRQqTuQlIDHlw==", "cByzJ");
      lllIlllIllII[lllIllllIlIl[69]] = lIIlllIlIllIIl("EycoKBslJzQkMQ==", "WFZCT");
      lllIlllIllII[lllIllllIlIl[42]] = lIIlllIlIllIIl("EAMRIxYmAQshPQ==", "TbcHY");
      lllIlllIllII[lllIllllIlIl[74]] = lIIlllIlIllIII("AYgrBguuGHg=", "ednEA");
      lllIlllIllII[lllIllllIlIl[75]] = lIIlllIlIllIII("DYx6LNtrD/hsKQ5SCZNneQ==", "nDtoR");
      lllIlllIllII[lllIllllIlIl[79]] = lIIlllIlIlIlll("dc20wFSYxRoFPwc8sr1vpw==", "iBWBT");
      lllIlllIllII[lllIllllIlIl[82]] = lIIlllIlIllIII("eid70jZg+SWICtSL6rlQww==", "CkqEj");
      lllIlllIllII[lllIllllIlIl[85]] = lIIlllIlIlIlll("EiTLCSM+FHpcXLPUWH5Cuw==", "WqFQf");
      lllIlllIllII[lllIllllIlIl[87]] = lIIlllIlIllIII("/AAzRGo8iA78zS+PaoCx/Q==", "gVftR");
      lllIlllIllII[lllIllllIlIl[90]] = lIIlllIlIllIIl("CQ8QHDUkAQ4SFw==", "Mnbwc");
      lllIlllIllII[lllIllllIlIl[93]] = lIIlllIlIllIIl("IQcGIBcMDAg=", "ebcPG");
      lllIlllIllII[lllIllllIlIl[95]] = lIIlllIlIllIII("hzAfBDEQbS6YlTMCkmCoGQ==", "SWvgX");
      lllIlllIllII[lllIllllIlIl[97]] = lIIlllIlIlIlll("htGgLkLZKtM=", "JVFsv");
      lllIlllIllII[lllIllllIlIl[98]] = lIIlllIlIllIIl("DSsAExQ7BggBFA==", "IDdtq");
      lllIlllIllII[lllIllllIlIl[29]] = lIIlllIlIllIIl("ByQhFTszJDAb", "AMSpy");
      lllIlllIllII[lllIllllIlIl[25]] = lIIlllIlIlIlll("haG752AaoxpYZtSBFYtH0w==", "vFMjk");
      lllIlllIllII[lllIllllIlIl[101]] = lIIlllIlIllIII("mvUSlz/IwYXbomuc6Yt6bw==", "FtYGS");
      lllIlllIllII[lllIllllIlIl[102]] = lIIlllIlIllIIl("IDIUEQMPJg==", "fGwyp");
      lllIlllIllII[lllIllllIlIl[103]] = lIIlllIlIllIII("GVdCE9sie9COWT9NKOgbvw==", "EDWRI");
      lllIlllIllII[lllIllllIlIl[68]] = lIIlllIlIllIIl("Fxs/MjwHGzk1LQ==", "PsPAH");
      lllIlllIllII[lllIllllIlIl[104]] = lIIlllIlIllIII("zbtP73Z0G7M=", "HetRV");
      lllIlllIllII[lllIllllIlIl[105]] = lIIlllIlIlIlll("cXXPIkbD0gzUOGDhAZa78g==", "hoBEo");
      lllIlllIllII[lllIllllIlIl[72]] = lIIlllIlIlIlll("0bPl/Obx9LU=", "uZHqW");
      lllIlllIllII[lllIllllIlIl[108]] = lIIlllIlIllIIl("KTcPLAI=", "nEjIl");
      lllIlllIllII[lllIllllIlIl[109]] = lIIlllIlIllIIl("Jj4jAho4KSoLGxY=", "aLFgt");
      lllIlllIllII[lllIllllIlIl[111]] = lIIlllIlIllIIl("LTgNAS0hMhQ=", "eWcdT");
      lllIlllIllII[lllIllllIlIl[112]] = lIIlllIlIlIlll("kp3mDQXVYwY=", "PraoG");
      lllIlllIllII[lllIllllIlIl[114]] = lIIlllIlIlIlll("WzGdelZPxWRrHes0uaM6og==", "eFbhX");
      lllIlllIllII[lllIllllIlIl[116]] = lIIlllIlIllIII("Zu7huCB8hzU=", "DLVbU");
      lllIlllIllII[lllIllllIlIl[119]] = lIIlllIlIlIlll("hAoND01RrvE=", "vEwPk");
      lllIlllIllII[lllIllllIlIl[120]] = lIIlllIlIlIlll("TXP5ju8NqF4=", "ueIin");
      lllIlllIllII[lllIllllIlIl[122]] = lIIlllIlIllIIl("IxYzICsLEjc=", "owEEE");
      lllIlllIllII[lllIllllIlIl[52]] = lIIlllIlIllIIl("OSceAxYRIxokFAA1AA==", "uFhfx");
      lllIlllIllII[lllIllllIlIl[84]] = lIIlllIlIllIII("c7eGk85nFFo9sauM/T4TnQ==", "QZKiB");
      lllIlllIllII[lllIllllIlIl[125]] = lIIlllIlIllIII("52EnpZmZ9pH3vXI8ebHNNA==", "ZBNlr");
      lllIlllIllII[lllIllllIlIl[126]] = lIIlllIlIllIII("JtA56O08N0uUttVSTosuEQ==", "OeraH");
      lllIlllIllII[lllIllllIlIl[128]] = lIIlllIlIllIIl("CywwGQQEKiUQHA==", "GEWqp");
      lllIlllIllII[lllIllllIlIl[129]] = lIIlllIlIlIlll("DvjNs5dELdKsssm/VCn9Ag==", "aqVGD");
      lllIlllIllII[lllIllllIlIl[131]] = lIIlllIlIllIIl("IQwRBBwqChoIDQM3GQgxCAkaAx8=", "mevlh");
      lllIlllIllII[lllIllllIlIl[132]] = lIIlllIlIllIII("0Snr725QMsVQLCBltzZJBw==", "dZyrm");
      lllIlllIllII[lllIllllIlIl[133]] = lIIlllIlIllIII("zwip35yDGh7Zz2fDxMRN/w==", "wghre");
      lllIlllIllII[lllIllllIlIl[135]] = lIIlllIlIllIII("2ALCUUSit8QkhCpY2tKj1w==", "PKhyv");
      lllIlllIllII[lllIllllIlIl[138]] = lIIlllIlIlIlll("WD2RbOEM2nNV5dLKFRSXIw==", "kXJdY");
      lllIlllIllII[lllIllllIlIl[139]] = lIIlllIlIllIII("7Gs1K5bsrOY3yPqz4sdgrQ==", "ewzDJ");
      lllIlllIllII[lllIllllIlIl[83]] = lIIlllIlIllIII("MPzE02ALDOYCv9nomDVSEg==", "YsHTg");
      lllIlllIllII[lllIllllIlIl[141]] = lIIlllIlIlIlll("5zmKCjbkYle15ShnUK+QBw==", "rvvZT");
      lllIlllIllII[lllIllllIlIl[144]] = lIIlllIlIlIlll("buJ80IgyxbtJHQ7stkxv1A==", "jBnDj");
      lllIlllIllII[lllIllllIlIl[117]] = lIIlllIlIllIII("bYF8K5S5PWyS/tFtlUhKow==", "JbXyA");
      lllIlllIllII[lllIllllIlIl[146]] = lIIlllIlIlIlll("SaWBccur/bA=", "VjPjB");
      lllIlllIllII[lllIllllIlIl[147]] = lIIlllIlIllIII("d/u5GQqPKgAJ8Lslvjgqsg==", "axpDl");
      lllIlllIllII[lllIllllIlIl[148]] = lIIlllIlIllIII("T/j6LqFDa7k=", "JKomg");
      lllIlllIllII[lllIllllIlIl[86]] = lIIlllIlIlIlll("/U3leBWEcr8=", "OgyTQ");
      lllIlllIllII[lllIllllIlIl[44]] = lIIlllIlIlIlll("h0np3yYn2D4=", "CVvzz");
      lllIlllIllII[lllIllllIlIl[149]] = lIIlllIlIllIII("5Un+fM7Q6VDsFw25tPcqKCjGNW+4yuoQ", "ppTrs");
      lllIlllIllII[lllIllllIlIl[151]] = lIIlllIlIlIlll("8/2bCgS9oP23ZKb+K1aDag==", "xxJrJ");
      lllIlllIllII[lllIllllIlIl[152]] = lIIlllIlIlIlll("aBnJACkVooRauacKOrmP4g==", "leIFx");
      lllIlllIllII[lllIllllIlIl[154]] = lIIlllIlIlIlll("6fNRQrh762hLouhjvB2L7g==", "lzcGq");
      lllIlllIllII[lllIllllIlIl[67]] = lIIlllIlIllIIl("CyMlHSErFSQVEzQjJBo=", "FFAtT");
      lllIlllIllII[lllIllllIlIl[159]] = lIIlllIlIllIIl("DzQ3LRMvAj8lEicTPzED", "BQSDf");
      lllIlllIllII[lllIllllIlIl[162]] = lIIlllIlIllIIl("PRI+HBkdJCoHBR4QHQcJFRk=", "pwZul");
      lllIlllIllII[lllIllllIlIl[164]] = lIIlllIlIllIIl("Jwc2EQcHNicKAx8NOwsX", "jbRxr");
      lllIlllIllII[lllIllllIlIl[165]] = lIIlllIlIlIlll("bTjUxtZD8hH4l5u3npi+/A==", "ncYKy");
      lllIlllIllII[lllIllllIlIl[168]] = lIIlllIlIlIlll("Bv0MkTOomEBNCPjvUsv6IA==", "AKieg");
      lllIlllIllII[lllIllllIlIl[169]] = lIIlllIlIllIII("6JbMC2Dy/DHimjth7h1Kew==", "gNmZF");
      lllIlllIllII[lllIllllIlIl[115]] = lIIlllIlIlIlll("6hW0BWwR2ZgPAfbo+tSPYw==", "JCiug");
      lllIlllIllII[lllIllllIlIl[171]] = lIIlllIlIllIIl("DjU7GxIwMzY=", "CZXxs");
      lllIlllIllII[lllIllllIlIl[173]] = lIIlllIlIlIlll("VQ3s2EA69nq0sl3mZY43pg==", "ibuia");
      lllIlllIllII[lllIllllIlIl[35]] = lIIlllIlIllIIl("IxcbIQ==", "mvmXY");
      lllIlllIllII[lllIllllIlIl[174]] = lIIlllIlIllIIl("KS0MKDcFJA==", "fAhdV");
      lllIlllIllII[lllIllllIlIl[176]] = lIIlllIlIllIII("8WU4GmY2NuY=", "OpXBz");
      lllIlllIllII[lllIllllIlIl[177]] = lIIlllIlIllIII("Od5LIPOIjz57E1vZuIclag==", "JvqLU");
      lllIlllIllII[lllIllllIlIl[179]] = lIIlllIlIlIlll("aUo1Shl6So8=", "khoro");
      lllIlllIllII[lllIllllIlIl[46]] = lIIlllIlIlIlll("JuQzYLo8Vi3HZadSn827Gg==", "wmFNE");
      lllIlllIllII[lllIllllIlIl[180]] = lIIlllIlIlIlll("UvK5dT0mZR8=", "UGgIN");
      lllIlllIllII[lllIllllIlIl[150]] = lIIlllIlIllIIl("EwYIDBEsCwAMOBEIAA==", "CgdiV");
      lllIlllIllII[lllIllllIlIl[183]] = lIIlllIlIlIlll("bF6pJQbbmkpuiULi7mbpqg==", "WvvPt");
      lllIlllIllII[lllIllllIlIl[161]] = lIIlllIlIllIII("ZKxftrREQ+213K3R8n7Mww==", "LTRxa");
      lllIlllIllII[lllIllllIlIl[41]] = lIIlllIlIllIII("I5ipX+974YwP1/99mTPMQA==", "CJNUI");
      lllIlllIllII[lllIllllIlIl[187]] = lIIlllIlIlIlll("u1yo4/+h3lQv5SUxPLiLvA==", "pdLik");
      lllIlllIllII[lllIllllIlIl[64]] = lIIlllIlIllIII("BTvf+o7q7bWvQX60dpxobA==", "jOdWu");
      lllIlllIllII[lllIllllIlIl[191]] = lIIlllIlIlIlll("3mJEwlPr7AQ=", "cImCn");
      lllIlllIllII[lllIllllIlIl[192]] = lIIlllIlIllIII("L6km30amZmY=", "VfsVw");
      lllIlllIllII[lllIllllIlIl[195]] = lIIlllIlIlIlll("08blWZUK16E=", "uxaHI");
      lllIlllIllII[lllIllllIlIl[197]] = lIIlllIlIlIlll("fCrk29PnMRlZVFqfNxZhXQ==", "dqqgh");
      lllIlllIllII[lllIllllIlIl[155]] = lIIlllIlIlIlll("P4M+xJnheZU=", "GuVlz");
      lllIlllIllII[lllIllllIlIl[158]] = lIIlllIlIlIlll("ORo/ztq52wc=", "GpOQZ");
      lllIlllIllII[lllIllllIlIl[198]] = lIIlllIlIllIII("S31fVEja0M3VcQ6/Jg2FIQ==", "xxCfJ");
      lllIlllIllII[lllIllllIlIl[199]] = lIIlllIlIlIlll("xAKK6JDqUyf4ICagAbraQQ==", "dBkUL");
      lllIlllIllII[lllIllllIlIl[200]] = lIIlllIlIlIlll("5XPDg/s8b4qWTLJ04/kQkQ==", "dTHTa");
      lllIlllIllII[lllIllllIlIl[201]] = lIIlllIlIlIlll("GZfooW1c1Mk=", "VLMGc");
      lllIlllIllII[lllIllllIlIl[202]] = lIIlllIlIlIlll("Er26PtRpMNjMGAZcIaxkXA==", "xMafx");
      lllIlllIllII[lllIllllIlIl[142]] = lIIlllIlIllIII("wR4mntklULJXBeD3/p9d3Q==", "JsoaI");
      lllIlllIllII[lllIllllIlIl[205]] = lIIlllIlIllIIl("JCsjERgSIi4=", "wNBBp");
      lllIlllIllII[lllIllllIlIl[206]] = lIIlllIlIllIII("hP5wSbvgfbk=", "VBRYv");
      lllIlllIllII[lllIllllIlIl[78]] = lIIlllIlIllIII("PQgkugiflR8=", "QEUuR");
      lllIlllIllII[lllIllllIlIl[160]] = lIIlllIlIllIIl("AAATCSImDg==", "SkjKN");
      lllIlllIllII[lllIllllIlIl[123]] = lIIlllIlIlIlll("bTrAs/HQ0XpW2m97C6X2Uw==", "aYwug");
      lllIlllIllII[lllIllllIlIl[207]] = lIIlllIlIlIlll("LQJgPkjJTdQXeyISU1Qk8w==", "yVdrd");
      lllIlllIllII[lllIllllIlIl[208]] = lIIlllIlIllIII("sygGVGKR/qY=", "KyUIb");
      lllIlllIllII[lllIllllIlIl[10]] = lIIlllIlIlIlll("ve8idDeqszbPWE4aIP8YYw==", "kLYBG");
      lllIlllIllII[lllIllllIlIl[107]] = lIIlllIlIllIIl("CywDFwEaNBMX", "XXfrm");
      lllIlllIllII[lllIllllIlIl[209]] = lIIlllIlIllIII("IBa0ovQafrE=", "ikkLQ");
      lllIlllIllII[lllIllllIlIl[118]] = lIIlllIlIllIIl("BQoUGQ==", "Qouul");
      lllIlllIllII[lllIllllIlIl[210]] = lIIlllIlIllIIl("JiIxPzgeLw==", "rJXLL");
      lllIlllIllII[lllIllllIlIl[211]] = lIIlllIlIllIII("e+gSluuRqlU=", "pxBBc");
      lllIlllIllII[lllIllllIlIl[167]] = lIIlllIlIllIII("cwK5yZWDCj13aH22sAsilQ==", "zrpCO");
      lllIlllIllII[lllIllllIlIl[57]] = lIIlllIlIllIIl("HAY8CiQ+", "JoSfA");
      lllIlllIllII[lllIllllIlIl[33]] = lIIlllIlIllIIl("OQIMKDE=", "njiIE");
      lllIlllIllII[lllIllllIlIl[143]] = lIIlllIlIlIlll("JFJBBEvj/O4=", "YxWiy");
      lllIlllIllII[lllIllllIlIl[213]] = lIIlllIlIllIIl("LwQlByIrASMYIg==", "xlLsG");
      lllIlllIllII[lllIllllIlIl[24]] = lIIlllIlIlIlll("BMc1NDUxKiY=", "kutjz");
      lllIlllIllII[lllIllllIlIl[54]] = lIIlllIlIllIIl("IwMPNQYNIRE8DBQ=", "zfcYi");
      lllIlllIllII[lllIllllIlIl[70]] = lIIlllIlIllIII("agwuTYndeeqzpEauW/95j+5UhUBiweNt", "ngJDS");
      lllIlllIllII[lllIllllIlIl[217]] = lIIlllIlIlIlll("1pU1Tc22YsQ=", "DvNTE");
      lllIlllIllII[lllIllllIlIl[178]] = lIIlllIlIllIIl("GxYdOjMLIix1LA0KBXUpGQ8UdSBYFRQ7JgwRUTonWE1Q", "xyqUA");
      lllIlllIllII[lllIllllIlIl[80]] = lIIlllIlIlIlll("DEOyoT9q0DFhg3+Vr1jotMmX4hLHWCtrfUAxiD18niDzFMAyXwUqaw==", "TNCba");
   }

   public String getColorNameFromColor(Color lllllllllllllllIlIllIIIlIlIllIII) {
      return lllllllllllllllIlIllIIIlIlIlIlll.getColorNameFromRgb(lllllllllllllllIlIllIIIlIlIllIII.getRed(), lllllllllllllllIlIllIIIlIlIllIII.getGreen(), lllllllllllllllIlIllIIIlIlIllIII.getBlue());
   }

   private static void lIIlllIllIIIlI() {
      lllIllllIlIl = new int[219];
      lllIllllIlIl[0] = (10 ^ 13 ^ "   ".length() << (" ".length() << " ".length())) << "   ".length() & ((99 + 146 - 79 + 25 ^ (118 ^ 91) << (" ".length() << " ".length())) << "   ".length() ^ -" ".length());
      lllIllllIlIl[1] = (150 ^ 153) << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[2] = (147 ^ 130 ^ (2 ^ 5) << " ".length()) << "   ".length();
      lllIllllIlIl[3] = 106 + 187 - 179 + 81 + (245 ^ 172) - (255 ^ 166) + ((78 ^ 65) << (" ".length() << " ".length()));
      lllIllllIlIl[4] = " ".length();
      lllIllllIlIl[5] = ((44 ^ 53) << "   ".length() ^ 141 + 49 - 153 + 144) << " ".length();
      lllIllllIlIl[6] = 110 + 152 - 223 + 196;
      lllIllllIlIl[7] = 37 + 129 - 60 + 109;
      lllIllllIlIl[8] = " ".length() << " ".length();
      lllIllllIlIl[9] = "   ".length();
      lllIllllIlIl[10] = 17 + 55 - 68 + 123;
      lllIllllIlIl[11] = (151 ^ 162) << (" ".length() << " ".length());
      lllIllllIlIl[12] = " ".length() << (" ".length() << " ".length());
      lllIllllIlIl[13] = 88 + 97 - 139 + 139 ^ (0 ^ 47) << (" ".length() << " ".length());
      lllIllllIlIl[14] = 65 + 110 - 82 + 152;
      lllIllllIlIl[15] = (111 ^ 118 ^ (166 ^ 177) << " ".length()) << (" ".length() << " ".length());
      lllIllllIlIl[16] = "   ".length() << " ".length();
      lllIllllIlIl[17] = (215 ^ 164 ^ (65 ^ 100) << " ".length()) << (" ".length() << " ".length());
      lllIllllIlIl[18] = (63 ^ 14) << (" ".length() << " ".length());
      lllIllllIlIl[19] = 20 ^ 19;
      lllIllllIlIl[20] = " ".length() << "   ".length();
      lllIllllIlIl[21] = (15 ^ 114) + (60 ^ 127) - (70 ^ 11) + ((153 ^ 180) << " ".length());
      lllIllllIlIl[22] = 57 + 153 - 162 + 111 ^ (30 ^ 85) << " ".length();
      lllIllllIlIl[23] = ((62 ^ 47) << " ".length() ^ 110 ^ 73) << " ".length();
      lllIllllIlIl[24] = (124 ^ 11 ^ (20 ^ 13) << " ".length()) << " ".length();
      lllIllllIlIl[25] = 46 ^ 5;
      lllIllllIlIl[26] = (76 ^ 61) << " ".length();
      lllIllllIlIl[27] = 105 ^ 98;
      lllIllllIlIl[28] = 152 + 2 - 135 + 134 + (" ".length() << (20 ^ 19)) - ((97 ^ 94) << " ".length()) + ((106 ^ 111) << " ".length());
      lllIllllIlIl[29] = ("   ".length() ^ (165 ^ 174) << " ".length()) << " ".length();
      lllIllllIlIl[30] = "   ".length() << (" ".length() << " ".length());
      lllIllllIlIl[31] = ("   ".length() << (151 ^ 146) ^ 157 ^ 146) << " ".length();
      lllIllllIlIl[32] = (113 ^ 38 ^ " ".length() << ("   ".length() << " ".length())) << "   ".length();
      lllIllllIlIl[33] = 29 + 121 - 44 + 29;
      lllIllllIlIl[34] = (162 ^ 185) << (" ".length() << " ".length()) ^ 29 ^ 124;
      lllIllllIlIl[35] = 243 ^ 172;
      lllIllllIlIl[36] = (" ".length() << (" ".length() << " ".length()) ^ 111 ^ 36) << " ".length();
      lllIllllIlIl[37] = ((12 ^ 5) << " ".length() ^ 21 ^ 2) << ((55 ^ 62) << "   ".length() ^ 50 ^ 127);
      lllIllllIlIl[38] = ((42 ^ 13) << (" ".length() << " ".length()) ^ 139 + 126 - 141 + 31) << " ".length();
      lllIllllIlIl[39] = 241 ^ 194 ^ (97 ^ 110) << (" ".length() << " ".length());
      lllIllllIlIl[40] = (218 ^ 185 ^ (120 ^ 125) << " ".length()) << " ".length();
      lllIllllIlIl[41] = 217 ^ 146 ^ (135 ^ 150) << " ".length();
      lllIllllIlIl[42] = ((68 ^ 109) << " ".length() ^ 206 ^ 147) << " ".length();
      lllIllllIlIl[43] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[44] = (69 ^ 64) << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[45] = (78 ^ 107) << " ".length() ^ 13 ^ 86;
      lllIllllIlIl[46] = (15 ^ 22) << (" ".length() << " ".length());
      lllIllllIlIl[47] = 4 + 82 - -46 + 17;
      lllIllllIlIl[48] = 218 + 236 - 369 + 152;
      lllIllllIlIl[49] = ((141 ^ 148) << "   ".length() ^ 38 + 99 - 88 + 144) << " ".length();
      lllIllllIlIl[50] = (111 ^ 60) << " ".length() ^ 40 + 47 - -88 + 6;
      lllIllllIlIl[51] = (146 ^ 187 ^ (101 ^ 110) << (" ".length() << " ".length())) << (" ".length() << " ".length());
      lllIllllIlIl[52] = (147 ^ 156) << (" ".length() << " ".length());
      lllIllllIlIl[53] = 78 ^ 91;
      lllIllllIlIl[54] = ("   ".length() << (92 ^ 89)) + ((137 ^ 180) << " ".length()) - (111 + 126 - 101 + 79) + ((161 ^ 176) << "   ".length());
      lllIllllIlIl[55] = ((19 ^ 64) << " ".length() ^ 87 + 169 - 158 + 75) << " ".length();
      lllIllllIlIl[56] = 94 ^ 7 ^ (67 ^ 100) << " ".length();
      lllIllllIlIl[57] = (213 + 67 - 116 + 79 ^ (100 ^ 111) << (" ".length() << (" ".length() << " ".length()))) << " ".length();
      lllIllllIlIl[58] = "   ".length() << "   ".length();
      lllIllllIlIl[59] = 129 + 159 - 266 + 147;
      lllIllllIlIl[60] = 51 ^ 42;
      lllIllllIlIl[61] = (132 ^ 137) << " ".length();
      lllIllllIlIl[62] = 62 + 130 - 63 + 60;
      lllIllllIlIl[63] = 173 + 113 - 198 + 95;
      lllIllllIlIl[64] = 203 ^ 160;
      lllIllllIlIl[65] = 144 ^ 139;
      lllIllllIlIl[66] = (91 + 1 - -48 + 17 ^ (199 ^ 138) << " ".length()) << (" ".length() << " ".length());
      lllIllllIlIl[67] = 38 ^ 115;
      lllIllllIlIl[68] = 93 ^ 114;
      lllIllllIlIl[69] = 5 + 40 - -24 + 90 ^ (135 ^ 198) << " ".length();
      lllIllllIlIl[70] = (7 ^ 36) << (" ".length() << " ".length());
      lllIllllIlIl[71] = 41 + 127 - 90 + 75;
      lllIllllIlIl[72] = (135 ^ 158) << " ".length();
      lllIllllIlIl[73] = (130 ^ 169 ^ "   ".length() << "   ".length()) << (" ".length() << " ".length());
      lllIllllIlIl[74] = 165 ^ 186;
      lllIllllIlIl[75] = " ".length() << ((46 ^ 5) << (" ".length() << " ".length()) ^ 106 + 57 - 0 + 6);
      lllIllllIlIl[76] = ((123 ^ 102) << (" ".length() << " ".length())) + ((173 ^ 186) << (" ".length() << " ".length())) - ((123 ^ 34) << " ".length()) + 113 + 195 - 120 + 15;
      lllIllllIlIl[77] = (108 ^ 39) << " ".length();
      lllIllllIlIl[78] = ((11 ^ 28) << "   ".length() ^ 29 + 2 - -29 + 73) << " ".length();
      lllIllllIlIl[79] = 183 ^ 150;
      lllIllllIlIl[80] = 17 + 88 - 11 + 49;
      lllIllllIlIl[81] = ((14 ^ 5) << "   ".length() ^ 90 ^ 45) << (" ".length() << " ".length());
      lllIllllIlIl[82] = (188 ^ 173) << " ".length();
      lllIllllIlIl[83] = (83 ^ 90) << "   ".length();
      lllIllllIlIl[84] = (174 ^ 165) << (" ".length() << " ".length()) ^ 23 ^ 6;
      lllIllllIlIl[85] = 117 ^ 86;
      lllIllllIlIl[86] = (30 ^ 17) << (" ".length() << " ".length()) ^ 6 ^ 117;
      lllIllllIlIl[87] = ((252 ^ 171) << " ".length() ^ 121 + 69 - 65 + 42) << (" ".length() << " ".length());
      lllIllllIlIl[88] = (77 ^ 42) << " ".length();
      lllIllllIlIl[89] = 85 + 96 - 92 + 120;
      lllIllllIlIl[90] = 94 ^ 123;
      lllIllllIlIl[91] = (184 ^ 157) << (" ".length() << " ".length());
      lllIllllIlIl[92] = 157 + 57 - 105 + 102;
      lllIllllIlIl[93] = (195 ^ 196 ^ (62 ^ 59) << (" ".length() << " ".length())) << " ".length();
      lllIllllIlIl[94] = 83 + 32 - -9 + 23;
      lllIllllIlIl[95] = (56 ^ 31) << " ".length() ^ 67 ^ 42;
      lllIllllIlIl[96] = 19 + 13 - 16 + 175;
      lllIllllIlIl[97] = ((183 ^ 146) << " ".length() ^ 68 ^ 11) << "   ".length();
      lllIllllIlIl[98] = 40 ^ 1;
      lllIllllIlIl[99] = (50 ^ 59) << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[100] = (201 ^ 144) << " ".length();
      lllIllllIlIl[101] = (161 ^ 170) << (" ".length() << " ".length());
      lllIllllIlIl[102] = 242 ^ 183 ^ (36 ^ 41) << "   ".length();
      lllIllllIlIl[103] = (56 ^ 47) << " ".length();
      lllIllllIlIl[104] = "   ".length() << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[105] = 10 ^ 63 ^ " ".length() << (" ".length() << " ".length());
      lllIllllIlIl[106] = ((174 ^ 195) << " ".length() ^ 145 + 111 - 181 + 108) << " ".length();
      lllIllllIlIl[107] = " ".length() << (196 ^ 195);
      lllIllllIlIl[108] = (194 ^ 149) << " ".length() ^ 89 + 116 - 92 + 44;
      lllIllllIlIl[109] = ((120 ^ 103) << " ".length() ^ 38 ^ 21) << (" ".length() << " ".length());
      lllIllllIlIl[110] = ((162 ^ 165) << (" ".length() << (" ".length() << " ".length()))) + (224 ^ 137) - (245 ^ 178) + (48 ^ 43);
      lllIllllIlIl[111] = 241 ^ 196;
      lllIllllIlIl[112] = (4 ^ 31) << " ".length();
      lllIllllIlIl[113] = (125 ^ 80) << (" ".length() << " ".length());
      lllIllllIlIl[114] = (75 ^ 82) << " ".length() ^ 196 ^ 193;
      lllIllllIlIl[115] = (31 ^ 8) << (" ".length() << " ".length());
      lllIllllIlIl[116] = (97 ^ 102) << "   ".length();
      lllIllllIlIl[117] = 192 ^ 139;
      lllIllllIlIl[118] = (237 ^ 172) << " ".length();
      lllIllllIlIl[119] = (48 ^ 5) << " ".length() ^ 192 ^ 147;
      lllIllllIlIl[120] = (26 ^ 7) << " ".length();
      lllIllllIlIl[121] = (87 + 208 - 118 + 52 ^ (195 ^ 136) << " ".length()) << " ".length();
      lllIllllIlIl[122] = 109 ^ 86;
      lllIllllIlIl[123] = (149 ^ 138) << (" ".length() << " ".length());
      lllIllllIlIl[124] = ((135 ^ 144) << " ".length() ^ 176 ^ 161) << (" ".length() << " ".length());
      lllIllllIlIl[125] = (119 ^ 62 ^ (71 ^ 108) << " ".length()) << " ".length();
      lllIllllIlIl[126] = 151 ^ 168;
      lllIllllIlIl[127] = (184 ^ 163) << "   ".length();
      lllIllllIlIl[128] = " ".length() << ("   ".length() << " ".length());
      lllIllllIlIl[129] = 252 ^ 147 ^ (61 ^ 42) << " ".length();
      lllIllllIlIl[130] = (18 ^ 21) << (179 ^ 182);
      lllIllllIlIl[131] = ((144 ^ 195) << " ".length() ^ 52 + 19 - 53 + 117) << " ".length();
      lllIllllIlIl[132] = (59 ^ 104) & ~(26 ^ 73) ^ 0 ^ 67;
      lllIllllIlIl[133] = (220 ^ 195 ^ (49 ^ 54) << " ".length()) << (" ".length() << " ".length());
      lllIllllIlIl[134] = (17 ^ 102) << " ".length();
      lllIllllIlIl[135] = (73 ^ 58) << " ".length() ^ 98 + 124 - 128 + 69;
      lllIllllIlIl[136] = (3 ^ 88) << " ".length();
      lllIllllIlIl[137] = (98 ^ 87) + (11 ^ 38) - -(98 ^ 95) + ((64 ^ 81) << " ".length());
      lllIllllIlIl[138] = (24 ^ 69 ^ (105 ^ 86) << " ".length()) << " ".length();
      lllIllllIlIl[139] = 82 ^ 97 ^ (97 ^ 124) << (" ".length() << " ".length());
      lllIllllIlIl[140] = ((165 ^ 146) << " ".length() ^ 1 ^ 58) << " ".length();
      lllIllllIlIl[141] = (163 ^ 130) << " ".length() ^ 130 ^ 137;
      lllIllllIlIl[142] = 244 ^ 131;
      lllIllllIlIl[143] = ((165 ^ 162) << "   ".length() ^ 6 ^ 47) << "   ".length();
      lllIllllIlIl[144] = (178 ^ 151) << " ".length();
      lllIllllIlIl[145] = (71 ^ 76) << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[146] = ("   ".length() << (99 ^ 102) ^ 43 ^ 88) << (" ".length() << " ".length());
      lllIllllIlIl[147] = 90 ^ 23;
      lllIllllIlIl[148] = (231 ^ 192) << " ".length();
      lllIllllIlIl[149] = 21 ^ 68;
      lllIllllIlIl[150] = (178 ^ 129) << " ".length();
      lllIllllIlIl[151] = ((59 ^ 28) << " ".length() ^ 8 ^ 111) << " ".length();
      lllIllllIlIl[152] = 218 ^ 137;
      lllIllllIlIl[153] = (233 ^ 180) << " ".length();
      lllIllllIlIl[154] = (57 ^ 44) << (" ".length() << " ".length());
      lllIllllIlIl[155] = (109 + 19 - -21 + 18 ^ (170 ^ 175) << (194 ^ 199)) << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[156] = ((85 ^ 20) << " ".length()) + (7 ^ 110) - (116 ^ 49) + (13 ^ 56);
      lllIllllIlIl[157] = 87 + 147 - 221 + 148 + (5 ^ 8) - (179 ^ 196) + ((119 ^ 104) << (" ".length() << " ".length()));
      lllIllllIlIl[158] = (11 ^ 54) << " ".length() ^ 85 ^ 94;
      lllIllllIlIl[159] = (52 + 133 - 119 + 119 ^ (214 ^ 159) << " ".length()) << " ".length();
      lllIllllIlIl[160] = 120 + 143 - 229 + 197 ^ (176 ^ 151) << (" ".length() << " ".length());
      lllIllllIlIl[161] = (64 ^ 77) << "   ".length();
      lllIllllIlIl[162] = (6 ^ 51) << (" ".length() << " ".length()) ^ 77 + 55 - 65 + 64;
      lllIllllIlIl[163] = (196 ^ 137) << " ".length();
      lllIllllIlIl[164] = (146 ^ 153) << "   ".length();
      lllIllllIlIl[165] = (138 ^ 183) << (" ".length() << " ".length()) ^ 5 + 66 - -10 + 92;
      lllIllllIlIl[166] = 27 + 12 - -80 + 28 + ((211 ^ 196) << "   ".length()) - ((67 ^ 44) << " ".length()) + ((180 ^ 153) << " ".length());
      lllIllllIlIl[167] = 118 + 56 - 129 + 88;
      lllIllllIlIl[168] = ((121 ^ 86) << (" ".length() << " ".length()) ^ 79 + 68 - 126 + 124) << " ".length();
      lllIllllIlIl[169] = 249 ^ 162;
      lllIllllIlIl[170] = (190 ^ 177) + ((124 ^ 121) << (" ".length() << (" ".length() << " ".length()))) - (63 ^ 52) + 41 + 19 - 8 + 89;
      lllIllllIlIl[171] = 194 ^ 159;
      lllIllllIlIl[172] = 137 + 53 - 41 + 4 + (22 ^ 87) - ((116 ^ 115) << (" ".length() << (" ".length() << " ".length()))) + (90 ^ 17);
      lllIllllIlIl[173] = ((126 ^ 123) << "   ".length() ^ 44 ^ 43) << " ".length();
      lllIllllIlIl[174] = "   ".length() << ((67 ^ 70) << "   ".length() ^ 56 ^ 21);
      lllIllllIlIl[175] = 249 + 128 - 188 + 64;
      lllIllllIlIl[176] = 232 ^ 137;
      lllIllllIlIl[177] = ((71 ^ 88) << " ".length() ^ 190 ^ 177) << " ".length();
      lllIllllIlIl[178] = (73 ^ 14) << " ".length();
      lllIllllIlIl[179] = 18 ^ 113;
      lllIllllIlIl[180] = (128 ^ 159) << " ".length() ^ 226 ^ 185;
      lllIllllIlIl[181] = (106 ^ 1) << " ".length();
      lllIllllIlIl[182] = (149 ^ 136) << "   ".length();
      lllIllllIlIl[183] = 64 ^ 39;
      lllIllllIlIl[184] = (111 ^ 60 ^ " ".length() << ("   ".length() << " ".length())) << "   ".length();
      lllIllllIlIl[185] = "   ".length() + (5 ^ 84) - -(216 ^ 171) + ((122 ^ 119) << (" ".length() << " ".length()));
      lllIllllIlIl[186] = 9 + 148 - 16 + 34;
      lllIllllIlIl[187] = (7 ^ 102 ^ (101 ^ 112) << (" ".length() << " ".length())) << " ".length();
      lllIllllIlIl[188] = 37 + 123 - 95 + 86 + (" ".length() << " ".length()) - (219 ^ 194) + (113 ^ 30);
      lllIllllIlIl[189] = 80 + 156 - 188 + 165;
      lllIllllIlIl[190] = 42 + 172 - 139 + 110;
      lllIllllIlIl[191] = (180 ^ 175) << (" ".length() << " ".length());
      lllIllllIlIl[192] = 134 ^ 193 ^ (43 ^ 62) << " ".length();
      lllIllllIlIl[193] = "   ".length() << ("   ".length() << " ".length());
      lllIllllIlIl[194] = 177 + 110 - 196 + 112;
      lllIllllIlIl[195] = ((167 ^ 178) << (" ".length() << " ".length()) ^ 167 ^ 196) << " ".length();
      lllIllllIlIl[196] = ((73 ^ 70) << (" ".length() << " ".length())) + ((126 ^ 105) << "   ".length()) - ((30 ^ 77) << " ".length()) + 27 + 40 - 45 + 121;
      lllIllllIlIl[197] = 127 ^ 16;
      lllIllllIlIl[198] = (128 + 73 - 83 + 29 ^ (35 ^ 118) << " ".length()) << " ".length();
      lllIllllIlIl[199] = (183 ^ 130) << (" ".length() << " ".length()) ^ 104 + 146 - 130 + 47;
      lllIllllIlIl[200] = ((255 ^ 164) << " ".length() ^ 103 + 75 - 102 + 95) << (" ".length() << " ".length());
      lllIllllIlIl[201] = 204 + 94 - 222 + 161 ^ (178 ^ 161) << "   ".length();
      lllIllllIlIl[202] = ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ 160 ^ 171) << " ".length();
      lllIllllIlIl[203] = (251 ^ 198) << (" ".length() << " ".length());
      lllIllllIlIl[204] = (179 ^ 154) << (" ".length() << " ".length());
      lllIllllIlIl[205] = (129 + 119 - 201 + 96 ^ " ".length() << (6 ^ 1)) << "   ".length();
      lllIllllIlIl[206] = 45 ^ 84;
      lllIllllIlIl[207] = (53 ^ 50) << (" ".length() << (" ".length() << " ".length())) ^ 207 ^ 194;
      lllIllllIlIl[208] = (35 + 50 - -46 + 4 ^ (181 ^ 162) << "   ".length()) << " ".length();
      lllIllllIlIl[209] = (61 ^ 94) + (212 ^ 145) - (38 + 128 - 58 + 25) + ((79 ^ 96) << " ".length());
      lllIllllIlIl[210] = ((71 ^ 72) << " ".length()) + ((149 ^ 136) << " ".length()) - ((42 ^ 1) & ~(0 ^ 43)) + (34 ^ 9);
      lllIllllIlIl[211] = (85 ^ 116) << (" ".length() << " ".length());
      lllIllllIlIl[212] = (171 ^ 166) << (" ".length() << (" ".length() << " ".length()));
      lllIllllIlIl[213] = 24 + 39 - -19 + 55;
      lllIllllIlIl[214] = 1400127830 + 1853597908 - -1600954300 + 1475216155 + (690775039 + 173737701 - 223260226 + 97426117 << " ".length()) - -(314969881 + 1002800582 - 840096663 + 1576873698) + (356405389 + 317234742 - 318290229 + 82458741 << " ".length());
      lllIllllIlIl[215] = (91 ^ 8) + ("   ".length() << (" ".length() << (" ".length() << " ".length()))) - -(75 ^ 98) + (245 ^ 166) << (" ".length() << (" ".length() << (" ".length() << " ".length())));
      lllIllllIlIl[216] = 45 + 90 - 59 + 89 + 65 + 15 - -64 + 51 - (4 + 125 - 14 + 50 << " ".length()) + 112 + 160 - 223 + 176 << (" ".length() << "   ".length());
      lllIllllIlIl[217] = ((176 ^ 191) << "   ".length()) + ((121 ^ 82) << " ".length()) - ((175 ^ 134) << " ".length()) + (141 ^ 156);
      lllIllllIlIl[218] = 9105815 + 10930717 - 18669659 + 15410342;
   }

   private static boolean lIIlllIllIIIll(int var0) {
      return var0 != 0;
   }

   public static int toRGBA(float[] lllllllllllllllIlIllIIIlIIllllII) {
      if (lIIlllIllIIllI(lllllllllllllllIlIllIIIlIIllllII.length, lllIllllIlIl[12])) {
         throw new IllegalArgumentException(lllIlllIllII[lllIllllIlIl[178]]);
      } else {
         return toRGBA(lllllllllllllllIlIllIIIlIIllllII[lllIllllIlIl[0]], lllllllllllllllIlIllIIIlIIllllII[lllIllllIlIl[4]], lllllllllllllllIlIllIIIlIIllllII[lllIllllIlIl[8]], lllllllllllllllIlIllIIIlIIllllII[lllIllllIlIl[9]]);
      }
   }

   private static boolean lIIlllIllIIlII(int var0, int var1) {
      return var0 < var1;
   }

   private static String lIIlllIlIllIIl(String lllllllllllllllIlIllIIIlIIIIlIlI, String lllllllllllllllIlIllIIIlIIIIlIIl) {
      lllllllllllllllIlIllIIIlIIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      String lllllllllllllllIlIllIIIlIIIIIIll = new StringBuilder();
      byte lllllllllllllllIlIllIIIlIIIIIIlI = lllllllllllllllIlIllIIIlIIIIlIIl.toCharArray();
      int lllllllllllllllIlIllIIIlIIIIIllI = lllIllllIlIl[0];
      String lllllllllllllllIlIllIIIlIIIIIIII = lllllllllllllllIlIllIIIlIIIIlIlI.toCharArray();
      double lllllllllllllllIlIllIIIIllllllll = lllllllllllllllIlIllIIIlIIIIIIII.length;
      int lllllllllllllllIlIllIIIIlllllllI = lllIllllIlIl[0];

      do {
         if (!lIIlllIllIIlII(lllllllllllllllIlIllIIIIlllllllI, lllllllllllllllIlIllIIIIllllllll)) {
            return String.valueOf(lllllllllllllllIlIllIIIlIIIIIIll);
         }

         char lllllllllllllllIlIllIIIlIIIIlIll = lllllllllllllllIlIllIIIlIIIIIIII[lllllllllllllllIlIllIIIIlllllllI];
         lllllllllllllllIlIllIIIlIIIIIIll.append((char)(lllllllllllllllIlIllIIIlIIIIlIll ^ lllllllllllllllIlIllIIIlIIIIIIlI[lllllllllllllllIlIllIIIlIIIIIllI % lllllllllllllllIlIllIIIlIIIIIIlI.length]));
         "".length();
         ++lllllllllllllllIlIllIIIlIIIIIllI;
         ++lllllllllllllllIlIllIIIIlllllllI;
         "".length();
      } while("   ".length() > -" ".length());

      return null;
   }

   private static String lIIlllIlIllIII(String lllllllllllllllIlIllIIIlIIIllIlI, String lllllllllllllllIlIllIIIlIIIllIIl) {
      try {
         int lllllllllllllllIlIllIIIlIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), lllIllllIlIl[20]), "DES");
         char lllllllllllllllIlIllIIIlIIIlIlIl = Cipher.getInstance("DES");
         lllllllllllllllIlIllIIIlIIIlIlIl.init(lllIllllIlIl[8], lllllllllllllllIlIllIIIlIIIlIllI);
         return new String(lllllllllllllllIlIllIIIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public int colorToHex(Color lllllllllllllllIlIllIIIlIlIlllII) {
      return Integer.decode(String.valueOf((new StringBuilder()).append(lllIlllIllII[lllIllllIlIl[217]]).append(Integer.toHexString(lllllllllllllllIlIllIIIlIlIlllII.getRGB()).substring(lllIllllIlIl[8]))));
   }

   private ArrayList<ColourUtils.ColorName> initColorList() {
      ArrayList<ColourUtils.ColorName> lllllllllllllllIlIllIIIllIIllIlI = new ArrayList();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[0]], lllIllllIlIl[1], lllIllllIlIl[2], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[4]], lllIllllIlIl[5], lllIllllIlIl[6], lllIllllIlIl[7]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[8]], lllIllllIlIl[0], lllIllllIlIl[3], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[9]], lllIllllIlIl[10], lllIllllIlIl[3], lllIllllIlIl[11]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[12]], lllIllllIlIl[1], lllIllllIlIl[3], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[13]], lllIllllIlIl[14], lllIllllIlIl[14], lllIllllIlIl[15]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[16]], lllIllllIlIl[3], lllIllllIlIl[17], lllIllllIlIl[18]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[19]], lllIllllIlIl[0], lllIllllIlIl[0], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[20]], lllIllllIlIl[3], lllIllllIlIl[6], lllIllllIlIl[21]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[22]], lllIllllIlIl[0], lllIllllIlIl[0], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[23]], lllIllllIlIl[24], lllIllllIlIl[25], lllIllllIlIl[26]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[27]], lllIllllIlIl[28], lllIllllIlIl[29], lllIllllIlIl[29]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[30]], lllIllllIlIl[31], lllIllllIlIl[32], lllIllllIlIl[33]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[34]], lllIllllIlIl[35], lllIllllIlIl[36], lllIllllIlIl[37]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[38]], lllIllllIlIl[10], lllIllllIlIl[3], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[39]], lllIllllIlIl[40], lllIllllIlIl[41], lllIllllIlIl[42]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[43]], lllIllllIlIl[3], lllIllllIlIl[10], lllIllllIlIl[44]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[45]], lllIllllIlIl[46], lllIllllIlIl[47], lllIllllIlIl[48]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[49]], lllIllllIlIl[3], lllIllllIlIl[2], lllIllllIlIl[15]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[50]], lllIllllIlIl[15], lllIllllIlIl[51], lllIllllIlIl[52]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[51]], lllIllllIlIl[0], lllIllllIlIl[3], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[53]], lllIllllIlIl[0], lllIllllIlIl[0], lllIllllIlIl[54]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[55]], lllIllllIlIl[0], lllIllllIlIl[54], lllIllllIlIl[54]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[56]], lllIllllIlIl[32], lllIllllIlIl[57], lllIllllIlIl[27]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[58]], lllIllllIlIl[59], lllIllllIlIl[59], lllIllllIlIl[59]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[60]], lllIllllIlIl[0], lllIllllIlIl[46], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[61]], lllIllllIlIl[62], lllIllllIlIl[63], lllIllllIlIl[64]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[65]], lllIllllIlIl[54], lllIllllIlIl[0], lllIllllIlIl[54]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[66]], lllIllllIlIl[67], lllIllllIlIl[64], lllIllllIlIl[68]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[69]], lllIllllIlIl[3], lllIllllIlIl[70], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[42]], lllIllllIlIl[71], lllIllllIlIl[72], lllIllllIlIl[73]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[74]], lllIllllIlIl[54], lllIllllIlIl[0], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[75]], lllIllllIlIl[76], lllIllllIlIl[77], lllIllllIlIl[78]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[79]], lllIllllIlIl[80], lllIllllIlIl[81], lllIllllIlIl[80]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[82]], lllIllllIlIl[83], lllIllllIlIl[84], lllIllllIlIl[54]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[85]], lllIllllIlIl[68], lllIllllIlIl[86], lllIllllIlIl[86]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[87]], lllIllllIlIl[0], lllIllllIlIl[88], lllIllllIlIl[89]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[90]], lllIllllIlIl[91], lllIllllIlIl[0], lllIllllIlIl[92]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[93]], lllIllllIlIl[3], lllIllllIlIl[51], lllIllllIlIl[94]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[95]], lllIllllIlIl[0], lllIllllIlIl[96], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[97]], lllIllllIlIl[41], lllIllllIlIl[41], lllIllllIlIl[41]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[98]], lllIllllIlIl[42], lllIllllIlIl[99], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[29]], lllIllllIlIl[100], lllIllllIlIl[82], lllIllllIlIl[82]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[25]], lllIllllIlIl[3], lllIllllIlIl[5], lllIllllIlIl[1]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[101]], lllIllllIlIl[82], lllIllllIlIl[54], lllIllllIlIl[82]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[102]], lllIllllIlIl[3], lllIllllIlIl[0], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[103]], lllIllllIlIl[15], lllIllllIlIl[15], lllIllllIlIl[15]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[68]], lllIllllIlIl[2], lllIllllIlIl[2], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[104]], lllIllllIlIl[3], lllIllllIlIl[7], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[105]], lllIllllIlIl[106], lllIllllIlIl[28], lllIllllIlIl[75]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[72]], lllIllllIlIl[107], lllIllllIlIl[107], lllIllllIlIl[107]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[108]], lllIllllIlIl[0], lllIllllIlIl[107], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[109]], lllIllllIlIl[110], lllIllllIlIl[3], lllIllllIlIl[68]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[111]], lllIllllIlIl[1], lllIllllIlIl[3], lllIllllIlIl[1]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[112]], lllIllllIlIl[3], lllIllllIlIl[41], lllIllllIlIl[113]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[114]], lllIllllIlIl[21], lllIllllIlIl[115], lllIllllIlIl[115]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[116]], lllIllllIlIl[117], lllIllllIlIl[0], lllIllllIlIl[118]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[119]], lllIllllIlIl[3], lllIllllIlIl[3], lllIllllIlIl[1]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[120]], lllIllllIlIl[1], lllIllllIlIl[121], lllIllllIlIl[70]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[122]], lllIllllIlIl[121], lllIllllIlIl[121], lllIllllIlIl[5]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[52]], lllIllllIlIl[3], lllIllllIlIl[1], lllIllllIlIl[14]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[84]], lllIllllIlIl[123], lllIllllIlIl[124], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[125]], lllIllllIlIl[3], lllIllllIlIl[5], lllIllllIlIl[21]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[126]], lllIllllIlIl[110], lllIllllIlIl[127], lllIllllIlIl[121]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[128]], lllIllllIlIl[1], lllIllllIlIl[107], lllIllllIlIl[107]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[129]], lllIllllIlIl[130], lllIllllIlIl[3], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[131]], lllIllllIlIl[5], lllIllllIlIl[5], lllIllllIlIl[40]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[132]], lllIllllIlIl[92], lllIllllIlIl[92], lllIllllIlIl[92]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[133]], lllIllllIlIl[99], lllIllllIlIl[134], lllIllllIlIl[99]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[135]], lllIllllIlIl[3], lllIllllIlIl[136], lllIllllIlIl[137]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[138]], lllIllllIlIl[3], lllIllllIlIl[37], lllIllllIlIl[78]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[139]], lllIllllIlIl[75], lllIllllIlIl[100], lllIllllIlIl[140]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[83]], lllIllllIlIl[33], lllIllllIlIl[88], lllIllllIlIl[5]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[141]], lllIllllIlIl[142], lllIllllIlIl[143], lllIllllIlIl[71]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[144]], lllIllllIlIl[145], lllIllllIlIl[18], lllIllllIlIl[31]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[117]], lllIllllIlIl[3], lllIllllIlIl[3], lllIllllIlIl[130]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[146]], lllIllllIlIl[0], lllIllllIlIl[3], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[147]], lllIllllIlIl[72], lllIllllIlIl[21], lllIllllIlIl[72]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[148]], lllIllllIlIl[5], lllIllllIlIl[1], lllIllllIlIl[121]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[86]], lllIllllIlIl[3], lllIllllIlIl[0], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[44]], lllIllllIlIl[107], lllIllllIlIl[0], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[149]], lllIllllIlIl[150], lllIllllIlIl[21], lllIllllIlIl[140]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[151]], lllIllllIlIl[0], lllIllllIlIl[0], lllIllllIlIl[21]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[152]], lllIllllIlIl[153], lllIllllIlIl[67], lllIllllIlIl[92]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[154]], lllIllllIlIl[94], lllIllllIlIl[155], lllIllllIlIl[156]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[67]], lllIllllIlIl[52], lllIllllIlIl[157], lllIllllIlIl[158]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[159]], lllIllllIlIl[160], lllIllllIlIl[161], lllIllllIlIl[134]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[162]], lllIllllIlIl[0], lllIllllIlIl[5], lllIllllIlIl[163]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[164]], lllIllllIlIl[83], lllIllllIlIl[89], lllIllllIlIl[73]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[165]], lllIllllIlIl[166], lllIllllIlIl[53], lllIllllIlIl[167]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[168]], lllIllllIlIl[60], lllIllllIlIl[60], lllIllllIlIl[155]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[169]], lllIllllIlIl[14], lllIllllIlIl[3], lllIllllIlIl[5]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[115]], lllIllllIlIl[3], lllIllllIlIl[17], lllIllllIlIl[170]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[171]], lllIllllIlIl[3], lllIllllIlIl[17], lllIllllIlIl[172]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[173]], lllIllllIlIl[3], lllIllllIlIl[31], lllIllllIlIl[110]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[35]], lllIllllIlIl[0], lllIllllIlIl[0], lllIllllIlIl[107]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[174]], lllIllllIlIl[175], lllIllllIlIl[14], lllIllllIlIl[121]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[176]], lllIllllIlIl[107], lllIllllIlIl[107], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[177]], lllIllllIlIl[64], lllIllllIlIl[178], lllIllllIlIl[85]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[179]], lllIllllIlIl[3], lllIllllIlIl[28], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[46]], lllIllllIlIl[3], lllIllllIlIl[135], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[180]], lllIllllIlIl[106], lllIllllIlIl[155], lllIllllIlIl[181]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[150]], lllIllllIlIl[134], lllIllllIlIl[182], lllIllllIlIl[140]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[183]], lllIllllIlIl[184], lllIllllIlIl[185], lllIllllIlIl[184]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[161]], lllIllllIlIl[186], lllIllllIlIl[134], lllIllllIlIl[134]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[41]], lllIllllIlIl[156], lllIllllIlIl[155], lllIllllIlIl[94]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[187]], lllIllllIlIl[3], lllIllllIlIl[188], lllIllllIlIl[189]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[64]], lllIllllIlIl[3], lllIllllIlIl[106], lllIllllIlIl[190]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[191]], lllIllllIlIl[21], lllIllllIlIl[167], lllIllllIlIl[126]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[192]], lllIllllIlIl[3], lllIllllIlIl[193], lllIllllIlIl[194]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[195]], lllIllllIlIl[196], lllIllllIlIl[37], lllIllllIlIl[196]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[197]], lllIllllIlIl[145], lllIllllIlIl[130], lllIllllIlIl[121]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[155]], lllIllllIlIl[107], lllIllllIlIl[0], lllIllllIlIl[107]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[158]], lllIllllIlIl[3], lllIllllIlIl[0], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[198]], lllIllllIlIl[81], lllIllllIlIl[80], lllIllllIlIl[80]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[199]], lllIllllIlIl[129], lllIllllIlIl[41], lllIllllIlIl[170]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[200]], lllIllllIlIl[54], lllIllllIlIl[135], lllIllllIlIl[50]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[201]], lllIllllIlIl[5], lllIllllIlIl[107], lllIllllIlIl[198]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[202]], lllIllllIlIl[203], lllIllllIlIl[204], lllIllllIlIl[174]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[142]], lllIllllIlIl[103], lllIllllIlIl[54], lllIllllIlIl[162]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[205]], lllIllllIlIl[3], lllIllllIlIl[14], lllIllllIlIl[134]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[206]], lllIllllIlIl[37], lllIllllIlIl[151], lllIllllIlIl[102]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[78]], lllIllllIlIl[193], lllIllllIlIl[193], lllIllllIlIl[193]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[160]], lllIllllIlIl[33], lllIllllIlIl[88], lllIllllIlIl[6]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[123]], lllIllllIlIl[187], lllIllllIlIl[168], lllIllllIlIl[21]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[207]], lllIllllIlIl[155], lllIllllIlIl[107], lllIllllIlIl[99]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[208]], lllIllllIlIl[3], lllIllllIlIl[5], lllIllllIlIl[5]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[10]], lllIllllIlIl[0], lllIllllIlIl[3], lllIllllIlIl[10]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[107]], lllIllllIlIl[138], lllIllllIlIl[118], lllIllllIlIl[113]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[209]], lllIllllIlIl[40], lllIllllIlIl[113], lllIllllIlIl[70]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[118]], lllIllllIlIl[0], lllIllllIlIl[107], lllIllllIlIl[107]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[210]], lllIllllIlIl[127], lllIllllIlIl[96], lllIllllIlIl[127]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[211]], lllIllllIlIl[3], lllIllllIlIl[179], lllIllllIlIl[139]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[167]], lllIllllIlIl[128], lllIllllIlIl[130], lllIllllIlIl[212]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[57]], lllIllllIlIl[134], lllIllllIlIl[118], lllIllllIlIl[134]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[33]], lllIllllIlIl[14], lllIllllIlIl[31], lllIllllIlIl[157]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[143]], lllIllllIlIl[3], lllIllllIlIl[3], lllIllllIlIl[3]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[213]], lllIllllIlIl[14], lllIllllIlIl[14], lllIllllIlIl[14]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[24]], lllIllllIlIl[3], lllIllllIlIl[3], lllIllllIlIl[0]));
      "".length();
      lllllllllllllllIlIllIIIllIIllIlI.add(new ColourUtils.ColorName(lllIlllIllII[lllIllllIlIl[54]], lllIllllIlIl[163], lllIllllIlIl[21], lllIllllIlIl[72]));
      "".length();
      return lllllllllllllllIlIllIIIllIIllIlI;
   }

   private static boolean lIIlllIllIIllI(int var0, int var1) {
      return var0 != var1;
   }

   private static boolean lIIlllIllIIlIl(Object var0) {
      return var0 != null;
   }

   public String getColorNameFromHex(int lllllllllllllllIlIllIIIlIllIIIll) {
      Exception lllllllllllllllIlIllIIIlIllIIIlI = (lllllllllllllllIlIllIIIlIllIIIll & lllIllllIlIl[215]) >> lllIllllIlIl[43];
      byte lllllllllllllllIlIllIIIlIllIIIIl = (lllllllllllllllIlIllIIIlIllIIIll & lllIllllIlIl[216]) >> lllIllllIlIl[20];
      int lllllllllllllllIlIllIIIlIllIIlIl = lllllllllllllllIlIllIIIlIllIIIll & lllIllllIlIl[3];
      return lllllllllllllllIlIllIIIlIllIIlII.getColorNameFromRgb(lllllllllllllllIlIllIIIlIllIIIlI, lllllllllllllllIlIllIIIlIllIIIIl, lllllllllllllllIlIllIIIlIllIIlIl);
   }

   public static int toRGBA(double lllllllllllllllIlIllIIIllIIlIIll, double lllllllllllllllIlIllIIIllIIIlllI, double lllllllllllllllIlIllIIIllIIIllIl, double lllllllllllllllIlIllIIIllIIIllII) {
      return toRGBA((float)lllllllllllllllIlIllIIIllIIlIIll, (float)lllllllllllllllIlIllIIIllIIIlllI, (float)lllllllllllllllIlIllIIIllIIIllIl, (float)lllllllllllllllIlIllIIIllIIIllII);
   }

   private static String lIIlllIlIlIlll(String lllllllllllllllIlIllIIIlIIlIIlll, String lllllllllllllllIlIllIIIlIIlIIllI) {
      try {
         SecretKeySpec lllllllllllllllIlIllIIIlIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIllIIIlIIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         byte lllllllllllllllIlIllIIIlIIlIIIlI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIllIIIlIIlIIIlI.init(lllIllllIlIl[8], lllllllllllllllIlIllIIIlIIlIlIlI);
         return new String(lllllllllllllllIlIllIIIlIIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIllIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static int[] toRGBAArray(int lllllllllllllllIlIllIIIlIIllIllI) {
      int[] var10000 = new int[lllIllllIlIl[12]];
      var10000[lllIllllIlIl[0]] = lllllllllllllllIlIllIIIlIIllIllI >> lllIllllIlIl[43] & lllIllllIlIl[3];
      var10000[lllIllllIlIl[4]] = lllllllllllllllIlIllIIIlIIllIllI >> lllIllllIlIl[20] & lllIllllIlIl[3];
      var10000[lllIllllIlIl[8]] = lllllllllllllllIlIllIIIlIIllIllI & lllIllllIlIl[3];
      var10000[lllIllllIlIl[9]] = lllllllllllllllIlIllIIIlIIllIllI >> lllIllllIlIl[58] & lllIllllIlIl[3];
      return var10000;
   }

   public static int toRGBA(double[] lllllllllllllllIlIllIIIlIIlllIII) {
      if (lIIlllIllIIllI(lllllllllllllllIlIllIIIlIIlllIII.length, lllIllllIlIl[12])) {
         throw new IllegalArgumentException(lllIlllIllII[lllIllllIlIl[80]]);
      } else {
         return toRGBA((float)lllllllllllllllIlIllIIIlIIlllIII[lllIllllIlIl[0]], (float)lllllllllllllllIlIllIIIlIIlllIII[lllIllllIlIl[4]], (float)lllllllllllllllIlIllIIIlIIlllIII[lllIllllIlIl[8]], (float)lllllllllllllllIlIllIIIlIIlllIII[lllIllllIlIl[9]]);
      }
   }

   public static int toRGBA(int lllllllllllllllIlIllIIIlIlIlIIIl, int lllllllllllllllIlIllIIIlIlIIllII, int lllllllllllllllIlIllIIIlIlIIlIll, int lllllllllllllllIlIllIIIlIlIIlIlI) {
      return (lllllllllllllllIlIllIIIlIlIlIIIl << lllIllllIlIl[43]) + (lllllllllllllllIlIllIIIlIlIIllII << lllIllllIlIl[20]) + (lllllllllllllllIlIllIIIlIlIIlIll << lllIllllIlIl[0]) + (lllllllllllllllIlIllIIIlIlIIlIlI << lllIllllIlIl[58]);
   }

   public String getColorNameFromRgb(int lllllllllllllllIlIllIIIlIllllllI, int lllllllllllllllIlIllIIIlIlllIllI, int lllllllllllllllIlIllIIIlIlllIlIl) {
      ArrayList<ColourUtils.ColorName> lllllllllllllllIlIllIIIlIlllIlII = lllllllllllllllIlIllIIIlIllllIII.initColorList();
      int lllllllllllllllIlIllIIIlIlllIIll = null;
      Exception lllllllllllllllIlIllIIIlIlllIIlI = lllIllllIlIl[214];
      Iterator lllllllllllllllIlIllIIIlIlllIIII = lllllllllllllllIlIllIIIlIlllIlII.iterator();

      do {
         if (!lIIlllIllIIIll(lllllllllllllllIlIllIIIlIlllIIII.hasNext())) {
            if (lIIlllIllIIlIl(lllllllllllllllIlIllIIIlIlllIIll)) {
               return lllllllllllllllIlIllIIIlIlllIIll.getName();
            }

            return lllIlllIllII[lllIllllIlIl[70]];
         }

         Exception lllllllllllllllIlIllIIIlIllIllll = (ColourUtils.ColorName)lllllllllllllllIlIllIIIlIlllIIII.next();
         int lllllllllllllllIlIllIIIllIIIIIII = lllllllllllllllIlIllIIIlIllIllll.computeMSE(lllllllllllllllIlIllIIIlIllllllI, lllllllllllllllIlIllIIIlIlllIllI, lllllllllllllllIlIllIIIlIlllIlIl);
         if (lIIlllIllIIlII(lllllllllllllllIlIllIIIllIIIIIII, lllllllllllllllIlIllIIIlIlllIIlI)) {
            lllllllllllllllIlIllIIIlIlllIIlI = lllllllllllllllIlIllIIIllIIIIIII;
            lllllllllllllllIlIllIIIlIlllIIll = lllllllllllllllIlIllIIIlIllIllll;
         }

         "".length();
      } while(" ".length() > 0);

      return null;
   }

   static {
      lIIlllIllIIIlI();
      lIIlllIllIIIII();
   }

   public static final int changeAlpha(int lllllllllllllllIlIllIIIlIIllIIlI, int lllllllllllllllIlIllIIIlIIlIllll) {
      lllllllllllllllIlIllIIIlIIllIIlI &= lllIllllIlIl[218];
      return lllllllllllllllIlIllIIIlIIlIllll << lllIllllIlIl[58] | lllllllllllllllIlIllIIIlIIllIIlI;
   }

   public static int toRGBA(float lllllllllllllllIlIllIIIlIlIIIlIl, float lllllllllllllllIlIllIIIlIlIIIIII, float lllllllllllllllIlIllIIIlIIllllll, float lllllllllllllllIlIllIIIlIIlllllI) {
      return toRGBA((int)(lllllllllllllllIlIllIIIlIlIIIlIl * 255.0F), (int)(lllllllllllllllIlIllIIIlIlIIIIII * 255.0F), (int)(lllllllllllllllIlIllIIIlIIllllll * 255.0F), (int)(lllllllllllllllIlIllIIIlIIlllllI * 255.0F));
   }

   public static class Colors {
      // $FF: synthetic field
      public static final int RAINBOW;
      // $FF: synthetic field
      public static final int BLUE;
      // $FF: synthetic field
      public static final int OORANGE;
      // $FF: synthetic field
      public static final int RED;
      // $FF: synthetic field
      public static final int YELLOW;
      // $FF: synthetic field
      public static final int BLACK;
      // $FF: synthetic field
      public static final int DARK_RED;
      // $FF: synthetic field
      public static final int PURPLE;
      // $FF: synthetic field
      public static final int ORANGE;
      // $FF: synthetic field
      private static final int[] lIIIIlIllllll;
      // $FF: synthetic field
      public static final int GREEN;
      // $FF: synthetic field
      public static final int GRAY;
      // $FF: synthetic field
      public static final int WHITE;
      // $FF: synthetic field
      public static final int DARKORANGE;
      // $FF: synthetic field
      public static final int GOLD;
      // $FF: synthetic field
      public static final int GOOLD;
      // $FF: synthetic field
      public static final int ORANGERED;
      // $FF: synthetic field
      public static final int YELLOWGREEN;
      // $FF: synthetic field
      public static final int SKYBLUE;

      private static void lIlIlIlllIlIIl() {
         lIIIIlIllllll = new int[12];
         lIIIIlIllllll[0] = 118 + 147 - 151 + 141;
         lIIIIlIllllll[1] = (51 ^ 96) & ~(44 ^ 127);
         lIIIIlIllllll[2] = 118 + 43 - 95 + 125;
         lIIIIlIllllll[3] = " ".length() << (71 + 71 - 108 + 93 ^ (158 ^ 145) << "   ".length());
         lIIIIlIllllll[4] = 49 + 80 - 121 + 155;
         lIIIIlIllllll[5] = (30 ^ 13) << (" ".length() << " ".length()) ^ 141 ^ 136;
         lIIIIlIllllll[6] = (240 ^ 181) + ((77 ^ 72) << (" ".length() << (" ".length() << " ".length()))) - ((4 ^ 37) << (" ".length() << " ".length())) + ((171 ^ 156) << " ".length());
         lIIIIlIllllll[7] = " ".length() << ("   ".length() << " ".length());
         lIIIIlIllllll[8] = 81 ^ 20;
         lIIIIlIllllll[9] = (49 ^ 18) << (" ".length() << " ".length());
         lIIIIlIllllll[10] = ((94 ^ 83) << (" ".length() << " ".length())) + (224 ^ 137) - -"  ".length() + ((178 ^ 189) << " ".length());
         lIIIIlIllllll[11] = 136 + 28 - -24 + 27;
      }

      static {
         lIlIlIlllIlIIl();
         RAINBOW = Integer.MIN_VALUE;
         WHITE = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[0], lIIIIlIllllll[0], lIIIIlIllllll[0]);
         BLACK = ColourUtils.toRGBA(lIIIIlIllllll[1], lIIIIlIllllll[1], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         RED = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[1], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         GREEN = ColourUtils.toRGBA(lIIIIlIllllll[1], lIIIIlIllllll[0], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         BLUE = ColourUtils.toRGBA(lIIIIlIllllll[1], lIIIIlIllllll[1], lIIIIlIllllll[0], lIIIIlIllllll[0]);
         SKYBLUE = ColourUtils.toRGBA(lIIIIlIllllll[1], lIIIIlIllllll[2], lIIIIlIllllll[0], lIIIIlIllllll[0]);
         ORANGE = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[3], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         PURPLE = ColourUtils.toRGBA(lIIIIlIllllll[4], lIIIIlIllllll[5], lIIIIlIllllll[4], lIIIIlIllllll[0]);
         GRAY = ColourUtils.toRGBA(lIIIIlIllllll[6], lIIIIlIllllll[6], lIIIIlIllllll[6], lIIIIlIllllll[0]);
         DARK_RED = ColourUtils.toRGBA(lIIIIlIllllll[7], lIIIIlIllllll[1], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         YELLOW = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[0], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         YELLOWGREEN = ColourUtils.toRGBA(lIIIIlIllllll[6], lIIIIlIllllll[0], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         ORANGERED = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[8], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         DARKORANGE = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[9], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         OORANGE = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[4], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         GOLD = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[10], lIIIIlIllllll[1], lIIIIlIllllll[0]);
         GOOLD = ColourUtils.toRGBA(lIIIIlIllllll[0], lIIIIlIllllll[11], lIIIIlIllllll[1], lIIIIlIllllll[0]);
      }
   }

   public class ColorName {
      // $FF: synthetic field
      public String name;
      // $FF: synthetic field
      private static final int[] llllllllIlll;
      // $FF: synthetic field
      public int g;
      // $FF: synthetic field
      public int r;
      // $FF: synthetic field
      public int b;

      public int getG() {
         return lllllllllllllllIlIIlIIllIlllIIIl.g;
      }

      public int getB() {
         return lllllllllllllllIlIIlIIllIllIllIl.b;
      }

      public String getName() {
         return lllllllllllllllIlIIlIIllIllIlIll.name;
      }

      public int computeMSE(int lllllllllllllllIlIIlIIllIlllllII, int lllllllllllllllIlIIlIIllIllllIll, int lllllllllllllllIlIIlIIllIllllIlI) {
         return ((lllllllllllllllIlIIlIIllIlllllII - lllllllllllllllIlIIlIIllIllllIIl.r) * (lllllllllllllllIlIIlIIllIlllllII - lllllllllllllllIlIIlIIllIllllIIl.r) + (lllllllllllllllIlIIlIIllIllllIll - lllllllllllllllIlIIlIIllIllllIIl.g) * (lllllllllllllllIlIIlIIllIllllIll - lllllllllllllllIlIIlIIllIllllIIl.g) + (lllllllllllllllIlIIlIIllIllllIlI - lllllllllllllllIlIIlIIllIllllIIl.b) * (lllllllllllllllIlIIlIIllIllllIlI - lllllllllllllllIlIIlIIllIllllIIl.b)) / llllllllIlll[0];
      }

      private static void lIlIIllIIIlIlI() {
         llllllllIlll = new int[1];
         llllllllIlll[0] = "   ".length();
      }

      public int getR() {
         return lllllllllllllllIlIIlIIllIlllIlII.r;
      }

      static {
         lIlIIllIIIlIlI();
      }

      public ColorName(String lllllllllllllllIlIIlIIlllIIIlIll, int lllllllllllllllIlIIlIIlllIIIIlII, int lllllllllllllllIlIIlIIlllIIIlIIl, int lllllllllllllllIlIIlIIlllIIIlIII) {
         lllllllllllllllIlIIlIIlllIIIIlll.r = lllllllllllllllIlIIlIIlllIIIIlII;
         lllllllllllllllIlIIlIIlllIIIIlll.g = lllllllllllllllIlIIlIIlllIIIlIIl;
         lllllllllllllllIlIIlIIlllIIIIlll.b = lllllllllllllllIlIIlIIlllIIIlIII;
         lllllllllllllllIlIIlIIlllIIIIlll.name = lllllllllllllllIlIIlIIlllIIIlIll;
      }
   }
}
