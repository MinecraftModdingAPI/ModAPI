/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public class Vec3b extends Vector {

	private final byte x, y, z;
	
	public Vec3b(byte x, byte y, byte z) {
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
	public byte getX() {
		return x;
	}
	
	/**
	 * Gets the y coordinate held by this Vector.
	 * 
	 * @return the y coordinate
	 */
	public byte getY() {
		return y;
	}
	
	/**
	 * Gets the z coordinate held by this Vector.
	 * 
	 * @return the z coordinate
	 */
	public byte getZ() {
		return z;
	}
	
	/**
	 * Adds this {@code Vec3b} to another {@code Vec3b}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec3b add(Vec3b addend) {
		return new Vec3b((byte)(addend.x + x), (byte)(addend.y + y), (byte) (addend.z + z));
	}
	
	/**
	 * Subtracts another {@code Vec3b} from this {@code Vec3b}.
	 * 
	 * @param minuend the vector to subtract from this Vec3b
	 * @return the difference of the two {@code Vec3b}s
	 */
	public Vec3b sub(Vec3b minuend) {
		return new Vec3b((byte)(minuend.x - x), (byte)(minuend.y - y), (byte) (minuend.z - z));
	}
	
	/**
	 * Multiplies another {@code Vec3b} by this {@code Vec3b}.
	 * 
	 * @param multiplier the other Vec3b
	 * @return the product of the two vectors
	 */
	public Vec3b mul(Vec3b multiplier) {
		return new Vec3b((byte)(multiplier.x * x), (byte)(multiplier.y * y), (byte) (multiplier.z * z));
	}
	
	/**
	 * Divides another {@code Vec3b} from this {@code Vec3b}.
	 * 
	 * @param divisor the vector to divide from this Vec3b
	 * @return the quotient of the two {@code Vec3b}s
	 */
	public Vec3b div(Vec3b divisor) {
		return new Vec3b((byte)(divisor.x / x), (byte)(divisor.y / y), (byte) (divisor.z / z));
	}

}
