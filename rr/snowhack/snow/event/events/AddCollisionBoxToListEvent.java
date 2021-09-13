package rr.snowhack.snow.event.events;

import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import rr.snowhack.snow.event.SnowEvent;

public class AddCollisionBoxToListEvent extends SnowEvent {
   // $FF: synthetic field
   private final Block block;
   // $FF: synthetic field
   private final List<AxisAlignedBB> collidingBoxes;
   // $FF: synthetic field
   private final boolean bool;
   // $FF: synthetic field
   private final World world;
   // $FF: synthetic field
   private final IBlockState state;
   // $FF: synthetic field
   private final Entity entity;
   // $FF: synthetic field
   private final BlockPos pos;
   // $FF: synthetic field
   private final AxisAlignedBB entityBox;

   public Entity getEntity() {
      return lllllllllllllllIlIlIlIIlllIlllIl.entity;
   }

   public AxisAlignedBB getEntityBox() {
      return lllllllllllllllIlIlIlIIllllIIIll.entityBox;
   }

   public BlockPos getPos() {
      return lllllllllllllllIlIlIlIIllllIIlll.pos;
   }

   public List<AxisAlignedBB> getCollidingBoxes() {
      return lllllllllllllllIlIlIlIIllllIIIII.collidingBoxes;
   }

   public AddCollisionBoxToListEvent(Block lllllllllllllllIlIlIlIlIIIIIIIIl, IBlockState lllllllllllllllIlIlIlIIlllllllll, World lllllllllllllllIlIlIlIlIIIIIlIlI, BlockPos lllllllllllllllIlIlIlIlIIIIIlIII, AxisAlignedBB lllllllllllllllIlIlIlIIllllllIlI, List<AxisAlignedBB> lllllllllllllllIlIlIlIIllllllIIl, Entity lllllllllllllllIlIlIlIIlllllIlll, boolean lllllllllllllllIlIlIlIIlllllIllI) {
      lllllllllllllllIlIlIlIlIIIIIlllI.block = lllllllllllllllIlIlIlIlIIIIIIIIl;
      lllllllllllllllIlIlIlIlIIIIIlllI.state = lllllllllllllllIlIlIlIIlllllllll;
      lllllllllllllllIlIlIlIlIIIIIlllI.world = lllllllllllllllIlIlIlIlIIIIIlIlI;
      lllllllllllllllIlIlIlIlIIIIIlllI.pos = lllllllllllllllIlIlIlIlIIIIIlIII;
      lllllllllllllllIlIlIlIlIIIIIlllI.entityBox = lllllllllllllllIlIlIlIIllllllIlI;
      lllllllllllllllIlIlIlIlIIIIIlllI.collidingBoxes = lllllllllllllllIlIlIlIIllllllIIl;
      lllllllllllllllIlIlIlIlIIIIIlllI.entity = lllllllllllllllIlIlIlIIlllllIlll;
      lllllllllllllllIlIlIlIlIIIIIlllI.bool = lllllllllllllllIlIlIlIIlllllIllI;
   }

   public IBlockState getState() {
      return lllllllllllllllIlIlIlIIllllIllII.state;
   }

   public World getWorld() {
      return lllllllllllllllIlIlIlIIllllIlIIl.world;
   }

   public boolean isBool() {
      return lllllllllllllllIlIlIlIIlllIllIlI.bool;
   }

   public Block getBlock() {
      return lllllllllllllllIlIlIlIIlllllIIll.block;
   }
}
