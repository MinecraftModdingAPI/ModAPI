/**
 * 
 */
package org.quantumapi.entity;

import org.quantumapi.APIObject;
import org.quantumapi.world.World;

import net.minecraft.nbt.NBTTagCompound;

/**
 * @author Link
 *
 */
public abstract class Entity extends APIObject {

	protected int x, y, z;

	protected Entity() {
		super("");
	}

	/**
	 * This method is used when the Entity is formatted and is the entityInit()<br>
	 * method in Minecraft's Entity.
	 */
	protected abstract void init();

	/**
	 * Set the x location.
	 * 
	 * @param x
	 *            the new x coordinate
	 */
	public final void setX(int x) {
		this.x = x;
	}

	/**
	 * Set the y location.
	 * 
	 * @param y
	 *            the new y coordinate
	 */
	public final void setY(int y) {
		this.y = y;
	}

	/**
	 * Set the z location.
	 * 
	 * @param z
	 *            the new z coordinate
	 */
	public final void setZ(int z) {
		this.z = z;
	}

	/**
	 * Gets the x location of this Entity in the world.
	 * 
	 * @return the x location of this Entity in the world
	 */
	public final int getX() {
		return x;
	}

	/**
	 * Gets the y location of this Entity in the world.
	 * 
	 * @return the y location of this Entity in the world
	 */
	public final int getY() {
		return y;
	}

	/**
	 * Gets the z location of this Entity in the world.
	 * 
	 * @return the z location of this Entity in the world
	 */
	public final int getZ() {
		return z;
	}

	private static class MEntity extends net.minecraft.entity.Entity {

		protected transient final Entity entity;

		protected MEntity(Entity entity) {
			super(World.getCurrentWorld().format());
			this.entity = entity;

		}

		@Override
		protected void entityInit() {
			entity.init();
		}

		@Override
		protected void readEntityFromNBT(NBTTagCompound tagCompund) {
		}

		@Override
		protected void writeEntityToNBT(NBTTagCompound tagCompound) {
		}
	}

	@Override
	public net.minecraft.entity.Entity format() {
		return new MEntity(this);
	}

}
