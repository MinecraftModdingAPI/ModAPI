/**
 * 
 */
package org.quantumapi.event;


import org.quantumapi.block.Block;
import org.quantumapi.block.entity.BlockEntity;
import org.quantumapi.entity.Entity;
import org.quantumapi.event.Event;

/**
 * <p>
 * A BlockEvent is any event that occurs to a block. It is meant to mimic
 * functionality in net.minecraft.block.Block#onBlock*****() events.
 * </p>
 * 
 * @author Link
 *
 */
public final class BlockEvent extends Event {

	/** The location of the passed in block */
	protected final transient int x, y, z;
	/** The block passed into this BlockEvent */
	protected final transient Block block;
	/** The entity passed into this BlockEvent */
	protected final transient Entity entity;
	/** The BlockEntity passed into this BlockEvent */
	protected final transient BlockEntity blockEntity;
	
	/**
	 * Creates a new BlockEvent with a world location, block, block entity, id, and event type.
	 * 
	 * @param x
	 *            the x location in the world that this event occurred.
	 * @param y
	 *            the y location in the world that this event occurred.
	 * @param z
	 *            the z location in the world that this event occured.
	 * @param block
	 *            the block that is in the world.
	 * @param blockEntity
	 * 			  the BlockEntity affected in the world
	 * @param eventType
	 * 			  the eventType which is passed to an LBlockAdapter's throwEvent method.
	 */
	public BlockEvent(int x, int y, int z, Block block, Entity entity, BlockEntity blockEntity, String eventType) {
		super(eventType);
		this.x = x;
		this.y = y;
		this.z = z;
		this.block = block;
		this.entity = entity;
		this.blockEntity = blockEntity;
	}

	/**
	 * Gets the x location passed into this BlockEvent object.
	 * 
	 * @return the x location passed into this BlockEvent object.
	 */
	public final int getX() {
		return x;
	}

	/**
	 * Gets the y location passed into this BlockEvent object.
	 * 
	 * @return the y location passed into this BlockEvent object.
	 */
	public final int getY() {
		return y;
	}

	/**
	 * Gets the z location passed into this BlockEvent object.
	 * 
	 * @return the z location passed into this BlockEvent object.
	 */
	public final int getZ() {
		return z;
	}

	/**
	 * Gets the Block passed into this BlockEvent object.
	 * 
	 * @return the Block contained in this BlockEvent.
	 */
	public final Block getBlock() {
		return block;
	}
	
	/**
	 * Gets the Entity passed into this BlockEvent object.
	 * 
	 * @return the Entity contained in this BlockEvent.
	 */
	public final Entity getEntity() {
		return entity;
	}
	
	/**
	 * Gets the BlockEntity passed into this BlockEvent object
	 * 
	 * @return the BlockEntity passed into this BlockEvent object.
	 */
	public final BlockEntity getBlockEntity() {
		return blockEntity;
	}

}
