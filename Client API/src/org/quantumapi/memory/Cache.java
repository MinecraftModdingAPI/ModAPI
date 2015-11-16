/**
 * 
 */
package org.quantumapi.memory;

/**
 * @author Link
 *
 */
public final class Cache {
	private Object[] cache;
	private int next = 0, ret;
	private final int size;

	public Cache(int size) {
		this.cache = new Object[size];
		this.size = size;
	}

	/**
	 * Caches the object by placing it at the end of the cache. Throws an
	 * {@code OutOfMemoryError} if the cache is full.
	 * 
	 * @param object
	 *            the object to cache
	 * @throws OutOfMemoryError
	 *             if the cache is full
	 */
	public void cache(Object object) throws OutOfMemoryError {
		if (cache.length - 1 == next)
			throw new OutOfMemoryError("[Error] Cache full. Clear cache before next call.");
		// add the object onto the cache
		cache[next] = object;
		// increment cache. Set to ret otherwise.
		next = next < cache.length && next != ret ? next + 1 : ret;
	}

	/**
	 * Gets the current index of the cache where an spot is available.
	 *
	 * @return the current index of the cache
	 */
	public int index() {
		return next < 1 ? 0 : next - 1;
	}

	/**
	 * Simply clears the cache by allocating a new array.
	 */
	public void clear() {
		// allocate new array over cache and let GC do it's work
		cache = new Object[size];
	}

}
