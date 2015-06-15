/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec3s extends Vector {

	private final short x, y, z;
	
	public Vec3s(short x, short y, short z) {
		super((byte) 3);
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Gets the x coordinate held by this Vector.
	 * 
	 * @return the x coordinate
	 */
	public short getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate held by this Vector.
	 * 
	 * @return the y coordinate
	 */
	public short getY() {
		return y;
	}
	
	/**
	 * Gets the z coordinate held by this Vector.
	 * 
	 * @return the z coordinate
	 */
	public short getZ() {
		return z;
	}
	
	/**
	 * Adds this {@code Vec3s} to another {@code Vec3s}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec3s add(Vec3s addend) {
		return new Vec3s((short)(addend.x + x), (short)(addend.y + y), (short) (addend.z + z));
	}
	
	/**
	 * Subtracts another {@code Vec3s} from this {@code Vec3s}.
	 * 
	 * @param minuend the vector to subtract from this Vec3s
	 * @return the difference of the two {@code Vec3s}s
	 */
	public Vec3s sub(Vec3s minuend) {
		return new Vec3s((short)(minuend.x - x), (short)(minuend.y - y), (short) (minuend.z - z));
	}
	
	/**
	 * Multiplies another {@code Vec3s} by this {@code Vec3s}.
	 * 
	 * @param multiplier the other Vec3s
	 * @return the product of the two vectors
	 */
	public Vec3s mul(Vec3s multiplier) {
		return new Vec3s((short)(multiplier.x * x), (short)(multiplier.y * y), (short) (multiplier.z * z));
	}
	
	/**
	 * Divides another {@code Vec3s} from this {@code Vec3s}.
	 * 
	 * @param divisor the vector to divide from this Vec3s
	 * @return the quotient of the two {@code Vec3s}s
	 */
	public Vec3s div(Vec3s divisor) {
		return new Vec3s((short)(divisor.x / x), (short)(divisor.y / y), (short) (divisor.z / z));
	}

}
