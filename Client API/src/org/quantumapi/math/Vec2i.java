/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec2i extends Vector {

	private final int x, y;
	
	public Vec2i(int x, int y) {
		super((byte) 2);
		this.x = x;
		this.y = y;
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
	 * Adds this {@code Vec2i} to another {@code Vec2i}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec2i add(Vec2i addend) {
		return new Vec2i(addend.x + x, addend.y + y);
	}
	
	/**
	 * Subtracts another {@code Vec2i} from this {@code Vec2i}.
	 * 
	 * @param minuend the vector to subtract from this Vec2i
	 * @return the difference of the two {@code Vec2i}s
	 */
	public Vec2i sub(Vec2i minuend) {
		return new Vec2i(minuend.x - x, minuend.y - y);
	}
	
	/**
	 * Multiplies another {@code Vec2i} by this {@code Vec2i}.
	 * 
	 * @param multiplier the other Vec2i
	 * @return the product of the two vectors
	 */
	public Vec2i mul(Vec2i multiplier) {
		return new Vec2i(multiplier.x * x, multiplier.y * y);
	}
	
	/**
	 * Divides another {@code Vec2i} from this {@code Vec2i}.
	 * 
	 * @param divisor the vector to divide from this Vec2i
	 * @return the quotient of the two {@code Vec2i}s
	 */
	public Vec2i div(Vec2i divisor) {
		return new Vec2i(divisor.x / x, divisor.y / y);
	}


}
