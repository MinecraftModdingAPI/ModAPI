/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec2l extends Vector {

	private final long x, y;
	
	public Vec2l(long x, long y) {
		super((byte) 2);
		this.x = x;
		this.y = y;
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
	 * Adds this {@code Vec2l} to another {@code Vec2l}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec2l add(Vec2l addend) {
		return new Vec2l(addend.x + x, addend.y + y);
	}
	
	/**
	 * Subtracts another {@code Vec2l} from this {@code Vec2l}.
	 * 
	 * @param minuend the vector to subtract from this Vec2l
	 * @return the difference of the two {@code Vec2l}s
	 */
	public Vec2l sub(Vec2l minuend) {
		return new Vec2l(minuend.x - x, minuend.y - y);
	}
	
	/**
	 * Multiplies another {@code Vec2l} by this {@code Vec2l}.
	 * 
	 * @param multiplier the other Vec2l
	 * @return the product of the two vectors
	 */
	public Vec2l mul(Vec2l multiplier) {
		return new Vec2l(multiplier.x * x, multiplier.y * y);
	}
	
	/**
	 * Divides another {@code Vec2l} from this {@code Vec2l}.
	 * 
	 * @param divisor the vector to divide from this Vec2l
	 * @return the quotient of the two {@code Vec2l}s
	 */
	public Vec2l div(Vec2l divisor) {
		return new Vec2l(divisor.x / x, divisor.y / y);
	}


}
