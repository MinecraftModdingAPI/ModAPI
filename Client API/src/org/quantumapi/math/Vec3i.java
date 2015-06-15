/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec3i extends Vector {

	private final int x, y, z;
	
	public Vec3i(int x, int y, int z) {
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
	public int getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate held by this Vector.
	 * 
	 * @return the y coordinate
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Gets the z coordinate held by this Vector.
	 * 
	 * @return the z coordinate
	 */
	public int getZ() {
		return z;
	}
	
	/**
	 * Adds this {@code Vec3i} to another {@code Vec3i}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec3i add(Vec3i addend) {
		return new Vec3i(addend.x + x, addend.y + y, addend.z + z);
	}
	
	/**
	 * Subtracts another {@code Vec3i} from this {@code Vec3i}.
	 * 
	 * @param minuend the vector to subtract from this Vec3i
	 * @return the difference of the two {@code Vec3i}s
	 */
	public Vec3i sub(Vec3i minuend) {
		return new Vec3i(minuend.x - x, minuend.y - y, minuend.z - z);
	}
	
	/**
	 * Multiplies another {@code Vec3i} by this {@code Vec3i}.
	 * 
	 * @param multiplier the other Vec3i
	 * @return the product of the two vectors
	 */
	public Vec3i mul(Vec3i multiplier) {
		return new Vec3i(multiplier.x * x, multiplier.y * y, multiplier.z * z);
	}
	
	/**
	 * Divides another {@code Vec3i} from this {@code Vec3i}.
	 * 
	 * @param divisor the vector to divide from this Vec3i
	 * @return the quotient of the two {@code Vec3i}s
	 */
	public Vec3i div(Vec3i divisor) {
		return new Vec3i(divisor.x / x, divisor.y / y, divisor.z / z);
	}

}
