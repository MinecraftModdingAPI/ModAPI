/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public class Vec3d extends Vector {

	private final double x, y, z;
	
	public Vec3d(double x, double y, double z) {
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
	public double getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate held by this Vector.
	 * 
	 * @return the y coordinate
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * Gets the z coordinate held by this Vector.
	 * 
	 * @return the z coordinate
	 */
	public double getZ() {
		return z;
	}
	
	/**
	 * Adds this {@code Vec3d} to another {@code Vec3d}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec3d add(Vec3d addend) {
		return new Vec3d(addend.x + x, addend.y + y, addend.z + z);
	}
	
	/**
	 * Subtracts another {@code Vec3d} from this {@code Vec3d}.
	 * 
	 * @param minuend the vector to subtract from this Vec3d
	 * @return the difference of the two {@code Vec3d}s
	 */
	public Vec3d sub(Vec3d minuend) {
		return new Vec3d(minuend.x - x, minuend.y - y, minuend.z - z);
	}
	
	/**
	 * Multiplies another {@code Vec3d} by this {@code Vec3d}.
	 * 
	 * @param multiplier the other Vec3d
	 * @return the product of the two vectors
	 */
	public Vec3d mul(Vec3d multiplier) {
		return new Vec3d(multiplier.x * x, multiplier.y * y, multiplier.z * z);
	}
	
	/**
	 * Divides another {@code Vec3d} from this {@code Vec3d}.
	 * 
	 * @param divisor the vector to divide from this Vec3d
	 * @return the quotient of the two {@code Vec3d}s
	 */
	public Vec3d div(Vec3d divisor) {
		return new Vec3d(divisor.x / x, divisor.y / y, divisor.z / z);
	}

}
