/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec3f extends Vector {

	private final float x, y, z;
	
	public Vec3f(float x, float y, float z) {
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
	public float getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate held by this Vector.
	 * 
	 * @return the y coordinate
	 */
	public float getY() {
		return y;
	}
	
	/**
	 * Gets the z coordinate held by this Vector.
	 * 
	 * @return the z coordinate
	 */
	public float getZ() {
		return z;
	}
	
	/**
	 * Adds this {@code Vec3f} to another {@code Vec3f}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec3f add(Vec3f addend) {
		return new Vec3f(addend.x + x, addend.y + y, addend.z + z);
	}
	
	/**
	 * Subtracts another {@code Vec3f} from this {@code Vec3f}.
	 * 
	 * @param minuend the vector to subtract from this Vec3f
	 * @return the difference of the two {@code Vec3f}s
	 */
	public Vec3f sub(Vec3f minuend) {
		return new Vec3f(minuend.x - x, minuend.y - y, minuend.z - z);
	}
	
	/**
	 * Multiplies another {@code Vec3f} by this {@code Vec3f}.
	 * 
	 * @param multiplier the other Vec3f
	 * @return the product of the two vectors
	 */
	public Vec3f mul(Vec3f multiplier) {
		return new Vec3f(multiplier.x * x, multiplier.y * y, multiplier.z * z);
	}
	
	/**
	 * Divides another {@code Vec3f} from this {@code Vec3f}.
	 * 
	 * @param divisor the vector to divide from this Vec3f
	 * @return the quotient of the two {@code Vec3f}s
	 */
	public Vec3f div(Vec3f divisor) {
		return new Vec3f(divisor.x / x, divisor.y / y, divisor.z / z);
	}

}
