/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec2f extends Vector {

	private final float x, y;
	
	public Vec2f(float x, float y) {
		super((byte) 2);
		this.x = x;
		this.y = y;
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
	 * Adds this {@code Vec2f} to another {@code Vec2f}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec2f add(Vec2f addend) {
		return new Vec2f(addend.x + x, addend.y + y);
	}
	
	/**
	 * Subtracts another {@code Vec2f} from this {@code Vec2f}.
	 * 
	 * @param minuend the vector to subtract from this Vec2f
	 * @return the difference of the two {@code Vec2f}s
	 */
	public Vec2f sub(Vec2f minuend) {
		return new Vec2f(minuend.x - x, minuend.y - y);
	}
	
	/**
	 * Multiplies another {@code Vec2f} by this {@code Vec2f}.
	 * 
	 * @param multiplier the other Vec2f
	 * @return the product of the two vectors
	 */
	public Vec2f mul(Vec2f multiplier) {
		return new Vec2f(multiplier.x * x, multiplier.y * y);
	}
	
	/**
	 * Divides another {@code Vec2f} from this {@code Vec2f}.
	 * 
	 * @param divisor the vector to divide from this Vec2f
	 * @return the quotient of the two {@code Vec2f}s
	 */
	public Vec2f div(Vec2f divisor) {
		return new Vec2f(divisor.x / x, divisor.y / y);
	}


}
