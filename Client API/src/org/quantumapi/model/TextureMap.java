/**
 * 
 */
package org.quantumapi.model;

import java.util.LinkedList;

import org.quantumapi.math.Vec3f;

/**
 * @author Link
 *
 */
public abstract class TextureMap {

	// the texture
	private Texture texture;
	// Offset from the image point 0, 0
	private int offX, offY, offZ;
	// 3D points connecting the dots
	private LinkedList<Vec3f> linkedOffsets;

	/**
	 * <p>
	 * Creates a new TextureMap with an offset vector, and a list of vertex
	 * normals.
	 * </p>
	 * 
	 * @param offX
	 *            the x offset
	 * @param offY
	 *            the y offset
	 * @param offZ
	 *            the z offset
	 * @param linkedOffsets
	 *            the vertex normals
	 */
	public TextureMap(int offX, int offY, int offZ, LinkedList<Vec3f> linkedOffsets) {
		this.offX = offX;
		this.offY = offY;
		this.offZ = offZ;
		this.linkedOffsets = linkedOffsets;
	}

	/**
	 * Gets the texture contained in this TextureMap.
	 * 
	 * @return the texture held by this object
	 */
	public final Texture getTexture() {
		return texture;
	}

	/**
	 * <p>
	 * Gets the offset x. The offset x value is the offset of an x coordinate in
	 * the world.
	 * </p>
	 * 
	 * @return the offset from a spawn point x coordinate
	 */
	public final int getOffX() {
		return offX;
	}

	/**
	 * <p>
	 * Gets the offset y. The offset y value is the offset of a y coordinate in
	 * the world.
	 * </p>
	 * 
	 * @return the offset from a spawn point y coordinate
	 */
	public final int getOffY() {
		return offY;
	}

	/**
	 * <p>
	 * Gets the offset z. The offset z value is the offset of a z coordinate in
	 * the world.
	 * </p>
	 * 
	 * @return the offset from a spawn point z coordinate
	 */
	public final int getOffZ() {
		return offZ;
	}

	/**
	 * <p>
	 * Gets the linked list containing the vertex normals that make up the frame
	 * of a Model.
	 * </p>
	 * 
	 * @return the vertex normals
	 */
	public final LinkedList<Vec3f> getLinkedOffsets() {
		return linkedOffsets;
	}

}
