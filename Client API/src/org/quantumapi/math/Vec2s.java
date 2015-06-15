/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec2s extends Vector {

	private final short x, y;
	
	public Vec2s(short x, short y) {
		super((byte) 2);
		this.x = x;
		this.y = y;
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
	 * Adds this {@code Vec2s} to another {@code Vec2s}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec2s add(Vec2s addend) {
		return new Vec2s((short)(addend.x + x), (short)(addend.y + y));
	}
	
	/**
	 * Subtracts another {@code Vec2s} from this {@code Vec2s}.
	 * 
	 * @param minuend the vector to subtract from this Vec2s
	 * @return the difference of the two {@code Vec2s}s
	 */
	public Vec2s sub(Vec2s minuend) {
		return new Vec2s((short)(minuend.x - x), (short)(minuend.y - y));
	}
	
	/**
	 * Multiplies another {@code Vec2s} by this {@code Vec2s}.
	 * 
	 * @param multiplier the other Vec2s
	 * @return the product of the two vectors
	 */
	public Vec2s mul(Vec2s multiplier) {
		return new Vec2s((short)(multiplier.x * x), (short)(multiplier.y * y));
	}
	
	/**
	 * Divides another {@code Vec2s} from this {@code Vec2s}.
	 * 
	 * @param divisor the vector to divide from this Vec2s
	 * @return the quotient of the two {@code Vec2s}s
	 */
	public Vec2s div(Vec2s divisor) {
		return new Vec2s((short)(divisor.x / x), (short)(divisor.y / y));
	}


}
