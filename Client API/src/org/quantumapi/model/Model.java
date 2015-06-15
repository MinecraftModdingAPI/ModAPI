/**
 * 
 */
package org.quantumapi.model;

import org.quantumapi.APIObject;

/**
 * @author Link
 *
 */
public abstract class Model extends APIObject {

	private TextureMap textureMap;
	
	
	public Model(String name, TextureMap textureMap) {
		super(name);
		this.textureMap = textureMap;
	}
	
	/**
	 * Gets the TextureMap held by this Model
	 */
	public TextureMap getTextureMap() {
		return textureMap;
	}
}
