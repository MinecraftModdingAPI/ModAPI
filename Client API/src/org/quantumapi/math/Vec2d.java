/**
 * 
 */
package org.quantumapi.math;

/**
 * @author Link
 *
 */
public final class Vec2d extends Vector {

	private final double x, y;
	
	public Vec2d(double x, double y) {
		super((byte) 2);
		this.x = x;
		this.y = y;
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
	 * Adds this {@code Vec2d} to another {@code Vec2d}.
	 * 
	 * @param addend the vector to add onto this one
	 * @return the sum of the two vectors
	 */
	public Vec2d add(Vec2d addend) {
		return new Vec2d(addend.x + x, addend.y + y);
	}
	
	/**
	 * Subtracts another {@code Vec2d} from this {@code Vec2d}.
	 * 
	 * @param minuend the vector to subtract from this Vec2d
	 * @return the difference of the two {@code Vec2d}s
	 */
	public Vec2d sub(Vec2d minuend) {
		return new Vec2d(minuend.x - x, minuend.y - y);
	}
	
	/**
	 * Multiplies another {@code Vec2d} by this {@code Vec2d}.
	 * 
	 * @param multiplier the other Vec2d
	 * @return the product of the two vectors
	 */
	public Vec2d mul(Vec2d multiplier) {
		return new Vec2d(multiplier.x * x, multiplier.y * y);
	}
	
	/**
	 * Divides another {@code Vec2d} from this {@code Vec2d}.
	 * 
	 * @param divisor the vector to divide from this Vec2d
	 * @return the quotient of the two {@code Vec2d}s
	 */
	public Vec2d div(Vec2d divisor) {
		return new Vec2d(divisor.x / x, divisor.y / y);
	}


}
