/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec3l extends Vector {

	private final long x, y, z;
	
	public Vec3l(long x, long y, long z) {
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
	public long getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate held by this Vector.
	 * 
	 * @return the y coordinate
	 */
	public long getY() {
		return y;
	}
	
	/**
	 * Gets the z coordinate held by this Vector.
	 * 
	 * @return the z coordinate
	 */
	public long getZ() {
		return z;
	}
	
	/**
	 * Adds this {@code Vec3l} to another {@code Vec3l}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec3l add(Vec3l addend) {
		return new Vec3l(addend.x + x, addend.y + y, addend.z + z);
	}
	
	/**
	 * Subtracts another {@code Vec3l} from this {@code Vec3l}.
	 * 
	 * @param minuend the vector to subtract from this Vec3l
	 * @return the difference of the two {@code Vec3l}s
	 */
	public Vec3l sub(Vec3l minuend) {
		return new Vec3l(minuend.x - x, minuend.y - y, minuend.z - z);
	}
	
	/**
	 * Multiplies another {@code Vec3l} by this {@code Vec3l}.
	 * 
	 * @param multiplier the other Vec3l
	 * @return the product of the two vectors
	 */
	public Vec3l mul(Vec3l multiplier) {
		return new Vec3l(multiplier.x * x, multiplier.y * y, multiplier.z * z);
	}
	
	/**
	 * Divides another {@code Vec3l} from this {@code Vec3l}.
	 * 
	 * @param divisor the vector to divide from this Vec3l
	 * @return the quotient of the two {@code Vec3l}s
	 */
	public Vec3l div(Vec3l divisor) {
		return new Vec3l(divisor.x / x, divisor.y / y, divisor.z / z);
	}

}
