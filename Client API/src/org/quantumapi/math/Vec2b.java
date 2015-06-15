/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec2b extends Vector {

	private final byte x, y;
	
	public Vec2b(byte x, byte y) {
		super((byte) 2);
		this.x = x;
		this.y = y;
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
	 * Adds this {@code Vec2b} to another {@code Vec2b}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec2b add(Vec2b addend) {
		return new Vec2b((byte)(addend.x + x), (byte)(addend.y + y));
	}
	
	/**
	 * Subtracts another {@code Vec2b} from this {@code Vec2b}.
	 * 
	 * @param minuend the vector to subtract from this Vec2b
	 * @return the difference of the two {@code Vec2b}s
	 */
	public Vec2b sub(Vec2b minuend) {
		return new Vec2b((byte)(minuend.x - x), (byte)(minuend.y - y));
	}
	
	/**
	 * Multiplies another {@code Vec2b} by this {@code Vec2b}.
	 * 
	 * @param multiplier the other Vec2b
	 * @return the product of the two vectors
	 */
	public Vec2b mul(Vec2b multiplier) {
		return new Vec2b((byte)(multiplier.x * x), (byte)(multiplier.y * y));
	}
	
	/**
	 * Divides another {@code Vec2b} from this {@code Vec2b}.
	 * 
	 * @param divisor the vector to divide from this Vec2b
	 * @return the quotient of the two {@code Vec2b}s
	 */
	public Vec2b div(Vec2b divisor) {
		return new Vec2b((byte)(divisor.x / x), (byte)(divisor.y / y));
	}

}
