/**
 * 
 */
package org.quantumapi.math;

/**
 * The class all Vectors inherit. It's use pertains to models and coordinates (And eventually shaders.)
 * A Vector is immutable.
 * 
 * @author Link
 *
 */
public abstract class Vector {

	// the number of coordinates this Vector holds
	protected final byte length;

	/**
	 * Create a Vector with the specified length
	 * 
	 * @param length the number of coordinates
	 */
	protected Vector(byte length) {
		this.length = length;
	}
	
	/**
	 * Gets the length of this Vector
	 * 
	 * @return the length of this Vector
	 */
	public final byte len() {
		return length;
	}

}
