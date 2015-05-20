/**
 * 
 */
package quanta.event;


import quanta.block.Block;
import quanta.entity.Entity;

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

	/**
	 * 
	 */
	private static final long serialVersionUID = 6307231635329578417L;

	/** The location of the passed in block */
	protected final transient int x, y, z;
	/** The block passed into this BlockEvent */
	protected final transient Block block;
	/** The entity passed into this BlockEvent */
	protected final transient Entity entity;
	/**
	 * Creates a new BlockEvent with an world location, block, id, and argument.
	 * 
	 * @param x
	 *            the x location in the world.
	 * @param y
	 *            the y location in the world.
	 * @param z
	 *            the z location in the world.
	 * @param block
	 *            the block that is in the world.
	 */
	public BlockEvent(int x, int y, int z, Block block, Entity entity, String eventType) {
		super(eventType);
		this.x = x;
		this.y = y;
		this.z = z;
		this.block = block;
		this.entity = entity;
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
	
	public final Entity getEntity() {
		
	}

}
