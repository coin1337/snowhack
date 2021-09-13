package rr.snowhack.snow.module.modules.misc;

import com.mojang.realmsclient.gui.ChatFormatting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityDonkey;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.play.server.SPacketSoundEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBed;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntityShulkerBox;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.client.event.InputUpdateEvent;
import rr.snowhack.snow.command.Command;
import rr.snowhack.snow.event.events.PacketEvent;
import rr.snowhack.snow.module.Module;
import rr.snowhack.snow.setting.Setting;
import rr.snowhack.snow.setting.Settings;

@Module.Info(
   name = "StashFinder",
   category = Module.Category.MISC
)
public class StashFinder extends Module {
   // $FF: synthetic field
   private static final int[] lIIIIIlIIlIIl;
   // $FF: synthetic field
   private Setting<Boolean> echest;
   // $FF: synthetic field
   private Setting<Boolean> donkey;
   // $FF: synthetic field
   private ArrayList<BlockPos> countedChests;
   // $FF: synthetic field
   @EventHandler
   private Listener<InputUpdateEvent> inputUpdateEventListener;
   // $FF: synthetic field
   private Setting<Boolean> chat;
   // $FF: synthetic field
   private ArrayList<BlockPos> beds;
   // $FF: synthetic field
   private ArrayList<BlockPos> donkeys;
   // $FF: synthetic field
   private static final String[] lIIIIIlIIIIlI;
   // $FF: synthetic field
   private Setting<Boolean> lightning;
   // $FF: synthetic field
   private HashMap<BlockPos, Integer> chests;
   // $FF: synthetic field
   private Setting<Boolean> chest;
   // $FF: synthetic field
   private HashMap<BlockPos, Integer> echests;
   // $FF: synthetic field
   private Setting<Boolean> autowalk;
   // $FF: synthetic field
   private ArrayList<BlockPos> countedEchests;
   // $FF: synthetic field
   private HashMap<BlockPos, Integer> shulkers;
   // $FF: synthetic field
   private ArrayList<BlockPos> thunders;
   // $FF: synthetic field
   private ArrayList<BlockPos> countedShulkers;
   // $FF: synthetic field
   private Setting<Boolean> bed;
   // $FF: synthetic field
   private Setting<Boolean> shulker;
   // $FF: synthetic field
   @EventHandler
   public Listener<PacketEvent.Send> listener;

   private static String lIlIlIIIIllIll(String lllllllllllllllIlIIIlIIIIIllllll, String lllllllllllllllIlIIIlIIIIIlllllI) {
      try {
         String lllllllllllllllIlIIIlIIIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIIIIIlllllI.getBytes(StandardCharsets.UTF_8)), lIIIIIlIIlIIl[10]), "DES");
         int lllllllllllllllIlIIIlIIIIIlllIlI = Cipher.getInstance("DES");
         lllllllllllllllIlIIIlIIIIIlllIlI.init(lIIIIIlIIlIIl[2], lllllllllllllllIlIIIlIIIIIlllIll);
         return new String(lllllllllllllllIlIIIlIIIIIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlIIIlIlIll(Object var0, Object var1) {
      return var0 == var1;
   }

   private static void lIlIlIIIlIIlll() {
      lIIIIIlIIIIlI = new String[lIIIIIlIIlIIl[46]];
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[0]] = lIlIlIIIIllIIl("axJTSPywGwE=", "cEGTp");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[1]] = lIlIlIIIIllIll("gHdHfT3WLebpUef52HRRSg==", "hNqGn");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[2]] = lIlIlIIIIlllII("Bh0NADIwB1gONi0QCw==", "UuxlY");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[3]] = lIlIlIIIIllIIl("T7skKDJmfm4=", "StRyv");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[4]] = lIlIlIIIIllIll("bZSMt0UwM8ZgPGuectDpiQ==", "qedJT");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[5]] = lIlIlIIIIllIIl("EyWLgpzfb/c=", "gSkAU");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[6]] = lIlIlIIIIlllII("JR4CNjkFBx0=", "dkvYn");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[7]] = lIlIlIIIIllIIl("0l73yefHHUdMyqFqRRHbXg==", "RiZeJ");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[10]] = lIlIlIIIIllIIl("oouclWm8WvU=", "MLnCX");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[11]] = lIlIlIIIIlllII("E2kEPQ0YPUc0HEs=", "kIgUh");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[12]] = lIlIlIIIIllIll("MyIX0k4NCkc=", "SglPo");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[13]] = lIlIlIIIIlllII("CmktJQsXOjxmAgZp", "rIHFc");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[9]] = lIlIlIIIIllIll("x+8O1rgH+gQ=", "jxiJS");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[14]] = lIlIlIIIIllIIl("AINNqToSCx4njuZGFkXYfA==", "lPobP");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[15]] = lIlIlIIIIlllII("NSMSCwFTLUcHABdsBhE=", "sLgee");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[16]] = lIlIlIIIIllIIl("bRLBLK8M4i1016oSjlE4KLCPuMNJkbzE", "DubOB");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[17]] = lIlIlIIIIllIIl("7wUrmnN8iKqgQaTSMZ5e8Q==", "iRpsr");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[18]] = lIlIlIIIIllIll("j2Fq/p61lPg=", "bCkfq");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[19]] = lIlIlIIIIlllII("LApBPAV6Fwo=", "UsnqH");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[20]] = lIlIlIIIIllIIl("1zMWOQlzSVE=", "EikaJ");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[21]] = lIlIlIIIIllIll("Zu1qIa19dIHkJEnuFyt4IEIngQBswpJr", "uQbFs");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[22]] = lIlIlIIIIllIIl("q7jna6rVdhU=", "cYZaJ");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[23]] = lIlIlIIIIllIll("YrSKGZpseeo=", "DWegp");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[24]] = lIlIlIIIIllIll("RcZF1khEX/8iVv1cgdJRyIVkuKlNXRsz", "cJiPx");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[25]] = lIlIlIIIIllIIl("WU+LkCxq9iQxLqJUIYRBeNp0Z7SIllm3", "Rhtxd");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[26]] = lIlIlIIIIlllII("MhsADAkgGBwzGQ==", "pwoob");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[27]] = lIlIlIIIIlllII("", "UNZVb");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[28]] = lIlIlIIIIllIIl("BRtLH4B+QVo=", "mBotR");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[29]] = lIlIlIIIIllIIl("GyPVOUSJ19s=", "ywhNh");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[30]] = lIlIlIIIIllIIl("eGgvZTWXQX0=", "RxIgr");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[31]] = lIlIlIIIIllIIl("a1KueALyf0c=", "LGXHM");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[32]] = lIlIlIIIIllIIl("1TG6CL8mcQDutuk7pA594g==", "OcddA");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[33]] = lIlIlIIIIllIll("5JfyjnrkCP4=", "pWslO");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[34]] = lIlIlIIIIllIIl("lIdx3gji+k7jjeHNY75yjQ==", "wEsgt");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[35]] = lIlIlIIIIlllII("cA==", "zMqxK");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[36]] = lIlIlIIIIlllII("IUUoCjw8FjlJNS1F", "YeMiT");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[37]] = lIlIlIIIIllIIl("edFqI2eeTvk=", "oHGjQ");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[38]] = lIlIlIIIIllIIl("mD//xGFXVAl+WmwuxDJ8FA==", "IILBN");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[39]] = lIlIlIIIIllIll("0YX8XWsWxI0=", "Wqbub");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[40]] = lIlIlIIIIllIIl("JsQXpcqkjuw=", "YOHjl");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[41]] = lIlIlIIIIlllII("Rw==", "MUXdS");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[42]] = lIlIlIIIIlllII("OxgUAy4KAkEeOg4HDwguTxEVTQ==", "opamJ");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[43]] = lIlIlIIIIlllII("Uw==", "YhNSU");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[44]] = lIlIlIIIIllIll("1EabaExzZ3UInQzIJNf/s8rX4ZgvliAV", "AMlOJ");
      lIIIIIlIIIIlI[lIIIIIlIIlIIl[45]] = lIlIlIIIIlllII("VC0=", "twMgK");
   }

   public StashFinder() {
      lllllllllllllllIlIIIlIIlIIIlllII.chest = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[0]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.echest = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[1]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.shulker = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[2]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.donkey = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[3]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.lightning = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[4]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.bed = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[5]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.autowalk = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[6]], (boolean)lIIIIIlIIlIIl[0]));
      lllllllllllllllIlIIIlIIlIIIlllII.chat = lllllllllllllllIlIIIlIIlIIIlllII.register(Settings.b(lIIIIIlIIIIlI[lIIIIIlIIlIIl[7]], (boolean)lIIIIIlIIlIIl[1]));
      lllllllllllllllIlIIIlIIlIIIlllII.chests = new HashMap();
      lllllllllllllllIlIIIlIIlIIIlllII.shulkers = new HashMap();
      lllllllllllllllIlIIIlIIlIIIlllII.echests = new HashMap();
      lllllllllllllllIlIIIlIIlIIIlllII.countedChests = new ArrayList();
      lllllllllllllllIlIIIlIIlIIIlllII.countedEchests = new ArrayList();
      lllllllllllllllIlIIIlIIlIIIlllII.countedShulkers = new ArrayList();
      lllllllllllllllIlIIIlIIlIIIlllII.thunders = new ArrayList();
      lllllllllllllllIlIIIlIIlIIIlllII.donkeys = new ArrayList();
      lllllllllllllllIlIIIlIIlIIIlllII.beds = new ArrayList();
      lllllllllllllllIlIIIlIIlIIIlllII.listener = new Listener((lllllllllllllllIlIIIlIIIIllIlllI) -> {
         BlockPos lllllllllllllllIlIIIlIIIIlllIIII = null;
         if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIIllIllll.lightning.getValue()) && lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIIllIlllI.getPacket() instanceof SPacketSoundEffect)) {
            SPacketSoundEffect lllllllllllllllIlIIIlIIIIlllIIll = (SPacketSoundEffect)lllllllllllllllIlIIIlIIIIllIlllI.getPacket();
            if (lIlIlIIIlIlIll(lllllllllllllllIlIIIlIIIIlllIIll.func_186977_b(), SoundCategory.WEATHER) && lIlIlIIIlIlIll(lllllllllllllllIlIIIlIIIIlllIIll.func_186978_a(), SoundEvents.field_187754_de)) {
               ((BlockPos)lllllllllllllllIlIIIlIIIIlllIIII).func_177963_a(lllllllllllllllIlIIIlIIIIlllIIll.func_149207_d(), lllllllllllllllIlIIIlIIIIlllIIll.func_149211_e(), lllllllllllllllIlIIIlIIIIlllIIll.func_149210_f());
               "".length();
               lllllllllllllllIlIIIlIIIIllIllll.thunders.add(lllllllllllllllIlIIIlIIIIlllIIII);
               "".length();
               if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIIllIllll.chat.getValue())) {
                  Command.sendChatMessage(String.valueOf((new StringBuilder()).append(ChatFormatting.RED.toString()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[44]]).append(lllllllllllllllIlIIIlIIIIlllIIll.func_149207_d()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[45]]).append(lllllllllllllllIlIIIlIIIIlllIIll.func_149210_f())));
               }
            }
         }

      }, new Predicate[lIIIIIlIIlIIl[0]]);
      lllllllllllllllIlIIIlIIlIIIlllII.inputUpdateEventListener = new Listener((lllllllllllllllIlIIIlIIIIllllIlI) -> {
         if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIIllllIIl.autowalk.getValue()) && lIlIlIIIlIllII(mc.field_71439_g)) {
            lllllllllllllllIlIIIlIIIIllllIlI.getMovementInput().field_192832_b = 1.0F;
         }

      }, new Predicate[lIIIIIlIIlIIl[0]]);
   }

   private static void lIlIlIIIlIlIII() {
      lIIIIIlIIlIIl = new int[47];
      lIIIIIlIIlIIl[0] = (69 ^ 82) << (" ".length() << " ".length()) & ~((188 ^ 171) << (" ".length() << " ".length()));
      lIIIIIlIIlIIl[1] = " ".length();
      lIIIIIlIIlIIl[2] = " ".length() << " ".length();
      lIIIIIlIIlIIl[3] = "   ".length();
      lIIIIIlIIlIIl[4] = " ".length() << (" ".length() << " ".length());
      lIIIIIlIIlIIl[5] = 176 ^ 181;
      lIIIIIlIIlIIl[6] = "   ".length() << " ".length();
      lIIIIIlIIlIIl[7] = 184 ^ 191;
      lIIIIIlIIlIIl[8] = -(122 ^ 118);
      lIIIIIlIIlIIl[9] = "   ".length() << (" ".length() << " ".length());
      lIIIIIlIIlIIl[10] = " ".length() << "   ".length();
      lIIIIIlIIlIIl[11] = 4 ^ 13;
      lIIIIIlIIlIIl[12] = (96 ^ 101) << " ".length();
      lIIIIIlIIlIIl[13] = 185 ^ 178;
      lIIIIIlIIlIIl[14] = 61 ^ 48;
      lIIIIIlIIlIIl[15] = (84 + 124 - 174 + 97 ^ (51 ^ 18) << (" ".length() << " ".length())) << " ".length();
      lIIIIIlIIlIIl[16] = 115 ^ 124;
      lIIIIIlIIlIIl[17] = " ".length() << (" ".length() << (" ".length() << " ".length()));
      lIIIIIlIIlIIl[18] = " ".length() << ("   ".length() << " ".length()) ^ 13 ^ 92;
      lIIIIIlIIlIIl[19] = ((94 ^ 69) << (" ".length() << " ".length()) ^ 73 ^ 44) << " ".length();
      lIIIIIlIIlIIl[20] = 69 ^ 86;
      lIIIIIlIIlIIl[21] = (106 ^ 111) << (" ".length() << " ".length());
      lIIIIIlIIlIIl[22] = 177 + 31 - 143 + 122 ^ (97 ^ 54) << " ".length();
      lIIIIIlIIlIIl[23] = ((189 ^ 152) << (" ".length() << " ".length()) ^ 24 + 13 - 35 + 157) << " ".length();
      lIIIIIlIIlIIl[24] = 86 ^ 65;
      lIIIIIlIIlIIl[25] = "   ".length() << "   ".length();
      lIIIIIlIIlIIl[26] = 90 ^ 67;
      lIIIIIlIIlIIl[27] = (15 ^ 18 ^ " ".length() << (" ".length() << (" ".length() << " ".length()))) << " ".length();
      lIIIIIlIIlIIl[28] = 42 ^ 49;
      lIIIIIlIIlIIl[29] = (29 ^ 26) << (" ".length() << " ".length());
      lIIIIIlIIlIIl[30] = 147 ^ 142;
      lIIIIIlIIlIIl[31] = (20 + 6 - -54 + 55 ^ (23 ^ 6) << "   ".length()) << " ".length();
      lIIIIIlIIlIIl[32] = (64 ^ 69) << (105 ^ 108) ^ 100 + 34 - 99 + 156;
      lIIIIIlIIlIIl[33] = " ".length() << (13 ^ 10 ^ " ".length() << " ".length());
      lIIIIIlIIlIIl[34] = (78 ^ 81) << (" ".length() << " ".length()) ^ 59 ^ 102;
      lIIIIIlIIlIIl[35] = (223 ^ 178 ^ (184 ^ 167) << (" ".length() << " ".length())) << " ".length();
      lIIIIIlIIlIIl[36] = 36 ^ 7;
      lIIIIIlIIlIIl[37] = (39 ^ 116 ^ (121 ^ 84) << " ".length()) << (" ".length() << " ".length());
      lIIIIIlIIlIIl[38] = (41 ^ 56) << " ".length() ^ 79 ^ 72;
      lIIIIIlIIlIIl[39] = (174 ^ 189) << " ".length();
      lIIIIIlIIlIIl[40] = 191 ^ 152;
      lIIIIIlIIlIIl[41] = (209 ^ 136 ^ (159 ^ 136) << (" ".length() << " ".length())) << "   ".length();
      lIIIIIlIIlIIl[42] = 104 + 36 - 64 + 75 ^ (116 ^ 43) << " ".length();
      lIIIIIlIIlIIl[43] = (251 ^ 128 ^ (152 ^ 175) << " ".length()) << " ".length();
      lIIIIIlIIlIIl[44] = 129 ^ 170;
      lIIIIIlIIlIIl[45] = (86 + 49 - 68 + 94 ^ (208 ^ 133) << " ".length()) << (" ".length() << " ".length());
      lIIIIIlIIlIIl[46] = (24 ^ 9) << (" ".length() << " ".length()) ^ 229 ^ 140;
   }

   private static String lIlIlIIIIlllII(String lllllllllllllllIlIIIlIIIIllIIIIl, String lllllllllllllllIlIIIlIIIIlIllIll) {
      lllllllllllllllIlIIIlIIIIllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIlIIIIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
      StringBuilder lllllllllllllllIlIIIlIIIIlIlllll = new StringBuilder();
      char[] lllllllllllllllIlIIIlIIIIlIllllI = lllllllllllllllIlIIIlIIIIlIllIll.toCharArray();
      Exception lllllllllllllllIlIIIlIIIIlIllIII = lIIIIIlIIlIIl[0];
      boolean lllllllllllllllIlIIIlIIIIlIlIlll = lllllllllllllllIlIIIlIIIIllIIIIl.toCharArray();
      long lllllllllllllllIlIIIlIIIIlIlIllI = lllllllllllllllIlIIIlIIIIlIlIlll.length;
      int lllllllllllllllIlIIIlIIIIlIlIlIl = lIIIIIlIIlIIl[0];

      do {
         if (!lIlIlIIIlIllIl(lllllllllllllllIlIIIlIIIIlIlIlIl, lllllllllllllllIlIIIlIIIIlIlIllI)) {
            return String.valueOf(lllllllllllllllIlIIIlIIIIlIlllll);
         }

         byte lllllllllllllllIlIIIlIIIIlIlIlII = lllllllllllllllIlIIIlIIIIlIlIlll[lllllllllllllllIlIIIlIIIIlIlIlIl];
         lllllllllllllllIlIIIlIIIIlIlllll.append((char)(lllllllllllllllIlIIIlIIIIlIlIlII ^ lllllllllllllllIlIIIlIIIIlIllllI[lllllllllllllllIlIIIlIIIIlIllIII % lllllllllllllllIlIIIlIIIIlIllllI.length]));
         "".length();
         ++lllllllllllllllIlIIIlIIIIlIllIII;
         ++lllllllllllllllIlIIIlIIIIlIlIlIl;
         "".length();
      } while(" ".length() <= " ".length() << " ".length());

      return null;
   }

   private static boolean lIlIlIIIlIllIl(int var0, int var1) {
      return var0 < var1;
   }

   private Boolean isShulkerBox(BlockPos lllllllllllllllIlIIIlIIIllIIllII) {
      Block[] var10000 = new Block[lIIIIIlIIlIIl[17]];
      var10000[lIIIIIlIIlIIl[0]] = Blocks.field_190977_dl;
      var10000[lIIIIIlIIlIIl[1]] = Blocks.field_190978_dm;
      var10000[lIIIIIlIIlIIl[2]] = Blocks.field_190979_dn;
      var10000[lIIIIIlIIlIIl[3]] = Blocks.field_190980_do;
      var10000[lIIIIIlIIlIIl[4]] = Blocks.field_190981_dp;
      var10000[lIIIIIlIIlIIl[5]] = Blocks.field_190982_dq;
      var10000[lIIIIIlIIlIIl[6]] = Blocks.field_190983_dr;
      var10000[lIIIIIlIIlIIl[7]] = Blocks.field_190984_ds;
      var10000[lIIIIIlIIlIIl[10]] = Blocks.field_190985_dt;
      var10000[lIIIIIlIIlIIl[11]] = Blocks.field_190986_du;
      var10000[lIIIIIlIIlIIl[12]] = Blocks.field_190987_dv;
      var10000[lIIIIIlIIlIIl[13]] = Blocks.field_190988_dw;
      var10000[lIIIIIlIIlIIl[9]] = Blocks.field_190989_dx;
      var10000[lIIIIIlIIlIIl[14]] = Blocks.field_190990_dy;
      var10000[lIIIIIlIIlIIl[15]] = Blocks.field_190991_dz;
      var10000[lIIIIIlIIlIIl[16]] = Blocks.field_190975_dA;
      List<Block> lllllllllllllllIlIIIlIIIllIIlIIl = Arrays.asList(var10000);
      return lllllllllllllllIlIIIlIIIllIIlIIl.contains(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIlIIIllIIllII).func_177230_c());
   }

   private String getFormattedBlockPos(BlockPos lllllllllllllllIlIIIlIIIllIlIIIl) {
      String lllllllllllllllIlIIIlIIIllIlIIII = lllllllllllllllIlIIIlIIIllIlIIIl.toString().replaceAll(lIIIIIlIIIIlI[lIIIIIlIIlIIl[26]], lIIIIIlIIIIlI[lIIIIIlIIlIIl[27]]);
      lllllllllllllllIlIIIlIIIllIlIIII = lllllllllllllllIlIIIlIIIllIlIIII.replaceAll(lIIIIIlIIIIlI[lIIIIIlIIlIIl[28]], lIIIIIlIIIIlI[lIIIIIlIIlIIl[29]]);
      lllllllllllllllIlIIIlIIIllIlIIII = lllllllllllllllIlIIIlIIIllIlIIII.replaceAll(lIIIIIlIIIIlI[lIIIIIlIIlIIl[30]], lIIIIIlIIIIlI[lIIIIIlIIlIIl[31]]);
      return lllllllllllllllIlIIIlIIIllIlIIII;
   }

   private static boolean lIlIlIIIlIlIIl(int var0) {
      return var0 != 0;
   }

   public void onUpdate() {
      short lllllllllllllllIlIIIlIIlIIIIIIIl = lIIIIIlIIlIIl[0];
      int lllllllllllllllIlIIIlIIlIIIIIlII = lIIIIIlIIlIIl[0];
      int lllllllllllllllIlIIIlIIlIIIIIIll = lIIIIIlIIlIIl[0];
      Iterator lllllllllllllllIlIIIlIIIlllllllI = mc.field_71441_e.field_147482_g.iterator();

      do {
         BlockPos lllllllllllllllIlIIIlIIlIIIIlIlI;
         if (!lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIlllllllI.hasNext())) {
            lllllllllllllllIlIIIlIIIlllllllI = mc.field_71441_e.field_72996_f.iterator();

            do {
               if (!lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIlllllllI.hasNext())) {
                  return;
               }

               char lllllllllllllllIlIIIlIIIllllllIl = (Entity)lllllllllllllllIlIIIlIIIlllllllI.next();
               lllllllllllllllIlIIIlIIlIIIIlIlI = lllllllllllllllIlIIIlIIIllllllIl.func_180425_c();
               if (lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIllllllIl instanceof EntityDonkey) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.donkeys.contains(lllllllllllllllIlIIIlIIlIIIIlIlI))) {
                  lllllllllllllllIlIIIlIIlIIIIIllI.donkeys.add(lllllllllllllllIlIIIlIIlIIIIlIlI);
                  "".length();
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.chat.getValue()) && lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.donkey.getValue())) {
                     Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[16]]).append(lllllllllllllllIlIIIlIIlIIIIlIlI)));
                  }
               }

               "".length();
            } while(null == null);

            return;
         }

         char lllllllllllllllIlIIIlIIIllllllIl = (TileEntity)lllllllllllllllIlIIIlIIIlllllllI.next();
         lllllllllllllllIlIIIlIIlIIIIlIlI = lllllllllllllllIlIIIlIIIllllllIl.func_174877_v();
         Iterable lllllllllllllllIlIIIlIIIlllllIll;
         Iterator lllllllllllllllIlIIIlIIIlllllIlI;
         BlockPos lllllllllllllllIlIIIlIIIlllllIIl;
         if (lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIllllllIl instanceof TileEntityChest) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.chests.containsKey(lllllllllllllllIlIIIlIIlIIIIlIlI)) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.countedChests.contains(lllllllllllllllIlIIIlIIlIIIIlIlI))) {
            lllllllllllllllIlIIIlIIIlllllIll = BlockPos.func_177980_a(lllllllllllllllIlIIIlIIlIIIIlIlI.func_177982_a(lIIIIIlIIlIIl[8], lIIIIIlIIlIIl[8], lIIIIIlIIlIIl[8]), lllllllllllllllIlIIIlIIlIIIIlIlI.func_177982_a(lIIIIIlIIlIIl[9], lIIIIIlIIlIIl[9], lIIIIIlIIlIIl[9]));
            lllllllllllllllIlIIIlIIIlllllIlI = lllllllllllllllIlIIIlIIIlllllIll.iterator();

            while(lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIlllllIlI.hasNext())) {
               lllllllllllllllIlIIIlIIIlllllIIl = (BlockPos)lllllllllllllllIlIIIlIIIlllllIlI.next();
               if (lIlIlIIIlIlIll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIlIIIlllllIIl).func_177230_c(), Blocks.field_150486_ae)) {
                  lllllllllllllllIlIIIlIIlIIIIIllI.countedChests.add(lllllllllllllllIlIIIlIIIlllllIIl);
                  "".length();
                  ++lllllllllllllllIlIIIlIIlIIIIIIIl;
               }

               "".length();
               if (-" ".length() >= " ".length() << (" ".length() << " ".length())) {
                  return;
               }
            }

            lllllllllllllllIlIIIlIIlIIIIIllI.chests.put(lllllllllllllllIlIIIlIIlIIIIlIlI, lllllllllllllllIlIIIlIIlIIIIIIIl);
            "".length();
            if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.chat.getValue()) && lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.chest.getValue())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[10]]).append(lllllllllllllllIlIIIlIIlIIIIIIIl).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[11]]).append(lllllllllllllllIlIIIlIIlIIIIIllI.getFormattedBlockPos(lllllllllllllllIlIIIlIIlIIIIlIlI))));
            }

            lllllllllllllllIlIIIlIIlIIIIIIIl = lIIIIIlIIlIIl[0];
         }

         if (lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIllllllIl instanceof TileEntityEnderChest) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.echests.containsKey(lllllllllllllllIlIIIlIIlIIIIlIlI)) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.countedEchests.contains(lllllllllllllllIlIIIlIIlIIIIlIlI))) {
            lllllllllllllllIlIIIlIIIlllllIll = BlockPos.func_177980_a(lllllllllllllllIlIIIlIIlIIIIlIlI.func_177982_a(lIIIIIlIIlIIl[8], lIIIIIlIIlIIl[8], lIIIIIlIIlIIl[8]), lllllllllllllllIlIIIlIIlIIIIlIlI.func_177982_a(lIIIIIlIIlIIl[9], lIIIIIlIIlIIl[9], lIIIIIlIIlIIl[9]));
            lllllllllllllllIlIIIlIIIlllllIlI = lllllllllllllllIlIIIlIIIlllllIll.iterator();

            while(lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIlllllIlI.hasNext())) {
               lllllllllllllllIlIIIlIIIlllllIIl = (BlockPos)lllllllllllllllIlIIIlIIIlllllIlI.next();
               if (lIlIlIIIlIlIll(mc.field_71441_e.func_180495_p(lllllllllllllllIlIIIlIIIlllllIIl).func_177230_c(), Blocks.field_150477_bB)) {
                  lllllllllllllllIlIIIlIIlIIIIIllI.countedEchests.add(lllllllllllllllIlIIIlIIIlllllIIl);
                  "".length();
                  ++lllllllllllllllIlIIIlIIlIIIIIlII;
               }

               "".length();
               if (" ".length() << (" ".length() << " ".length()) < " ".length() << " ".length()) {
                  return;
               }
            }

            lllllllllllllllIlIIIlIIlIIIIIllI.echests.put(lllllllllllllllIlIIIlIIlIIIIlIlI, lllllllllllllllIlIIIlIIlIIIIIlII);
            "".length();
            if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.chat.getValue()) && lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.echest.getValue())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[12]]).append(lllllllllllllllIlIIIlIIlIIIIIlII).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[13]]).append(lllllllllllllllIlIIIlIIlIIIIIllI.getFormattedBlockPos(lllllllllllllllIlIIIlIIlIIIIlIlI))));
            }

            lllllllllllllllIlIIIlIIlIIIIIlII = lIIIIIlIIlIIl[0];
         }

         if (lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIllllllIl instanceof TileEntityShulkerBox) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.shulkers.containsKey(lllllllllllllllIlIIIlIIlIIIIlIlI)) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.countedShulkers.contains(lllllllllllllllIlIIIlIIlIIIIlIlI))) {
            lllllllllllllllIlIIIlIIIlllllIll = BlockPos.func_177980_a(lllllllllllllllIlIIIlIIlIIIIlIlI.func_177982_a(lIIIIIlIIlIIl[8], lIIIIIlIIlIIl[8], lIIIIIlIIlIIl[8]), lllllllllllllllIlIIIlIIlIIIIlIlI.func_177982_a(lIIIIIlIIlIIl[9], lIIIIIlIIlIIl[9], lIIIIIlIIlIIl[9]));
            lllllllllllllllIlIIIlIIIlllllIlI = lllllllllllllllIlIIIlIIIlllllIll.iterator();

            while(lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIlllllIlI.hasNext())) {
               lllllllllllllllIlIIIlIIIlllllIIl = (BlockPos)lllllllllllllllIlIIIlIIIlllllIlI.next();
               if (lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIlIIIIIllI.isShulkerBox(lllllllllllllllIlIIIlIIIlllllIIl))) {
                  lllllllllllllllIlIIIlIIlIIIIIllI.countedShulkers.add(lllllllllllllllIlIIIlIIIlllllIIl);
                  "".length();
                  ++lllllllllllllllIlIIIlIIlIIIIIIll;
               }

               "".length();
               if (" ".length() << " ".length() < " ".length()) {
                  return;
               }
            }

            lllllllllllllllIlIIIlIIlIIIIIllI.shulkers.put(lllllllllllllllIlIIIlIIlIIIIlIlI, lllllllllllllllIlIIIlIIlIIIIIIll);
            "".length();
            if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.chat.getValue()) && lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.shulker.getValue())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[9]]).append(lllllllllllllllIlIIIlIIlIIIIIIll).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[14]]).append(lllllllllllllllIlIIIlIIlIIIIIllI.getFormattedBlockPos(lllllllllllllllIlIIIlIIlIIIIlIlI))));
            }

            lllllllllllllllIlIIIlIIlIIIIIIll = lIIIIIlIIlIIl[0];
         }

         if (lIlIlIIIlIlIIl(lllllllllllllllIlIIIlIIIllllllIl instanceof TileEntityBed) && lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIlIIIIIllI.beds.contains(lllllllllllllllIlIIIlIIlIIIIlIlI))) {
            lllllllllllllllIlIIIlIIlIIIIIllI.beds.add(lllllllllllllllIlIIIlIIlIIIIlIlI);
            "".length();
            if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.chat.getValue()) && lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIlIIIIIllI.bed.getValue())) {
               Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[15]]).append(lllllllllllllllIlIIIlIIlIIIIlIlI)));
            }
         }

         "".length();
      } while("   ".length() < " ".length() << (" ".length() << " ".length()));

   }

   private static boolean lIlIlIIIlIllII(Object var0) {
      return var0 != null;
   }

   private static String lIlIlIIIIllIIl(String lllllllllllllllIlIIIlIIIIlIIlIlI, String lllllllllllllllIlIIIlIIIIlIIlIll) {
      try {
         long lllllllllllllllIlIIIlIIIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIlIIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
         Cipher lllllllllllllllIlIIIlIIIIlIIlllI = Cipher.getInstance("Blowfish");
         lllllllllllllllIlIIIlIIIIlIIlllI.init(lIIIIIlIIlIIl[2], lllllllllllllllIlIIIlIIIIlIIlIII);
         return new String(lllllllllllllllIlIIIlIIIIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIlIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   private static boolean lIlIlIIIlIlIlI(int var0) {
      return var0 == 0;
   }

   public void onDisable() {
      label85: {
         try {
            DateFormat lllllllllllllllIlIIIlIIIlllIllII = new SimpleDateFormat(lIIIIIlIIIIlI[lIIIIIlIIlIIl[17]]);
            DateFormat lllllllllllllllIlIIIlIIIlllIlIll = new SimpleDateFormat(lIIIIIlIIIIlI[lIIIIIlIIlIIl[18]]);
            new SimpleDateFormat(lIIIIIlIIIIlI[lIIIIIlIIlIIl[19]]);
            new SimpleDateFormat(lIIIIIlIIIIlI[lIIIIIlIIlIIl[20]]);
            Date lllllllllllllllIlIIIlIIIlllIlIII = new Date();
            boolean lllllllllllllllIlIIIlIIIllIllIll = new Date();
            short lllllllllllllllIlIIIlIIIllIllIlI = new File(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[21]]).append(lllllllllllllllIlIIIlIIIlllIllII.format(lllllllllllllllIlIIIlIIIlllIlIII)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[22]]).append(lllllllllllllllIlIIIlIIIlllIlIll.format(lllllllllllllllIlIIIlIIIllIllIll)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[23]])));
            if (lIlIlIIIlIlIlI(lllllllllllllllIlIIIlIIIllIllIlI.exists())) {
               label79: {
                  lllllllllllllllIlIIIlIIIllIllIlI.getParentFile().mkdirs();
                  "".length();

                  try {
                     lllllllllllllllIlIIIlIIIllIllIlI.createNewFile();
                     "".length();
                  } catch (IOException var14) {
                     var14.printStackTrace();
                     break label79;
                  }

                  "".length();
                  if ("   ".length() < 0) {
                     return;
                  }
               }
            }

            boolean lllllllllllllllIlIIIlIIIllIllIIl = new FileOutputStream(lllllllllllllllIlIIIlIIIllIllIlI);
            OutputStreamWriter lllllllllllllllIlIIIlIIIlllIIlII = new OutputStreamWriter(lllllllllllllllIlIIIlIIIllIllIIl);
            lllllllllllllllIlIIIlIIIlllIIIlI.thunders.forEach((lllllllllllllllIlIIIlIIIIlllllll) -> {
               try {
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIlIIIIIIl.lightning.getValue())) {
                     lllllllllllllllIlIIIlIIIlllIIlII.append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[42]]).append(lllllllllllllllIlIIIlIIIlIIIIIIl.getFormattedBlockPos(lllllllllllllllIlIIIlIIIIlllllll)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[43]]);
                     "".length();
                  }
               } catch (IOException var5) {
                  return;
               }

               "".length();
               if (null == null) {
                  ;
               }
            });
            lllllllllllllllIlIIIlIIIlllIIIlI.beds.forEach((lllllllllllllllIlIIIlIIIlIIIllIl) -> {
               try {
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIlIIIllII.bed.getValue())) {
                     lllllllllllllllIlIIIlIIIlllIIlII.append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[40]]).append(lllllllllllllllIlIIIlIIIlIIIllII.getFormattedBlockPos(lllllllllllllllIlIIIlIIIlIIIllIl)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[41]]);
                     "".length();
                  }
               } catch (IOException var4) {
                  return;
               }

               "".length();
               if (-" ".length() < "   ".length()) {
                  ;
               }
            });
            lllllllllllllllIlIIIlIIIlllIIIlI.chests.forEach((lllllllllllllllIlIIIlIIIlIIllIlI, lllllllllllllllIlIIIlIIIlIIlIlIl) -> {
               try {
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIlIIlllII.chest.getValue())) {
                     lllllllllllllllIlIIIlIIIlllIIlII.append(lllllllllllllllIlIIIlIIIlIIlIlIl.toString()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[38]]).append(lllllllllllllllIlIIIlIIIlIIlllII.getFormattedBlockPos(lllllllllllllllIlIIIlIIIlIIllIlI)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[39]]);
                     "".length();
                  }
               } catch (IOException var5) {
                  return;
               }

               "".length();
               if ((((92 ^ 65) << " ".length() ^ 228 ^ 149) & ("   ".length() << (" ".length() << (" ".length() << " ".length())) ^ 215 ^ 172 ^ -" ".length())) != "   ".length()) {
                  ;
               }
            });
            lllllllllllllllIlIIIlIIIlllIIIlI.echests.forEach((lllllllllllllllIlIIIlIIIlIlIlIII, lllllllllllllllIlIIIlIIIlIlIIlll) -> {
               try {
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIlIlIIllI.echest.getValue())) {
                     lllllllllllllllIlIIIlIIIlllIIlII.append(lllllllllllllllIlIIIlIIIlIlIIlll.toString()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[36]]).append(lllllllllllllllIlIIIlIIIlIlIIllI.getFormattedBlockPos(lllllllllllllllIlIIIlIIIlIlIlIII)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[37]]);
                     "".length();
                  }
               } catch (IOException var5) {
                  return;
               }

               "".length();
               if ("   ".length() >= 0) {
                  ;
               }
            });
            lllllllllllllllIlIIIlIIIlllIIIlI.shulkers.forEach((lllllllllllllllIlIIIlIIIlIllIIlI, lllllllllllllllIlIIIlIIIlIllIlIl) -> {
               try {
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIlIllIlII.shulker.getValue())) {
                     lllllllllllllllIlIIIlIIIlllIIlII.append(lllllllllllllllIlIIIlIIIlIllIlIl.toString()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[34]]).append(lllllllllllllllIlIIIlIIIlIllIlII.getFormattedBlockPos(lllllllllllllllIlIIIlIIIlIllIIlI)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[35]]);
                     "".length();
                  }
               } catch (IOException var6) {
                  return;
               }

               "".length();
               if (" ".length() > 0) {
                  ;
               }
            });
            lllllllllllllllIlIIIlIIIlllIIIlI.donkeys.forEach((lllllllllllllllIlIIIlIIIllIIIIlI) -> {
               try {
                  if (lIlIlIIIlIlIIl((Boolean)lllllllllllllllIlIIIlIIIllIIIIIl.donkey.getValue())) {
                     lllllllllllllllIlIIIlIIIlllIIlII.append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[32]]).append(lllllllllllllllIlIIIlIIIllIIIIIl.getFormattedBlockPos(lllllllllllllllIlIIIlIIIllIIIIlI)).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[33]]);
                     "".length();
                  }
               } catch (IOException var4) {
                  return;
               }

               "".length();
               if ("   ".length() >= " ".length()) {
                  ;
               }
            });
            lllllllllllllllIlIIIlIIIlllIIlII.close();
            lllllllllllllllIlIIIlIIIllIllIIl.close();
            Command.sendChatMessage(lIIIIIlIIIIlI[lIIIIIlIIlIIl[24]]);
            break label85;
         } catch (IOException var15) {
            Command.sendChatMessage(String.valueOf((new StringBuilder()).append(lIIIIIlIIIIlI[lIIIIIlIIlIIl[25]]).append(var15)));
         } finally {
            lllllllllllllllIlIIIlIIIlllIIIlI.beds.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.chests.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.donkeys.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.shulkers.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.echests.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.countedEchests.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.countedShulkers.clear();
            lllllllllllllllIlIIIlIIIlllIIIlI.countedChests.clear();
         }

         "".length();
         if (((233 ^ 168) & ~(7 ^ 70)) != ((53 ^ 38) << (" ".length() << " ".length()) & ~((108 ^ 127) << (" ".length() << " ".length())))) {
            return;
         }

         return;
      }

      "".length();
      if (" ".length() == " ".length()) {
         ;
      }
   }

   static {
      lIlIlIIIlIlIII();
      lIlIlIIIlIIlll();
   }
}
