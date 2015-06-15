/**
 * 
 */
package org.quantumapi.nbt;

import net.minecraft.nbt.NBTTagCompound;

/**
 * @author Link
 *
 */
public class NBTStruct {

	private final NBTTagCompound tags;

	/**
	 * Creates a new NBTStruct. The tags are added to this NBTStruct.
	 * 
	 * @param tags the tags to add to this NBTStruct
	 */
	@SafeVarargs
	public <V extends Number> NBTStruct(NBTTag<V>... tags) {
		this.tags = new NBTTagCompound();
		
		if(tags == null) return; // avoid NPE thrown if there are no tags given
		
		for(NBTTag<V> elem : tags) {
			this.tags.setTag(elem.getName(), elem.format());
		}
	}

	/**
	 * Gets the specified element held within this NBTStruct. Analogous to NBTTagCompound.
	 * 
	 * @param get the element to retrieve
	 * @return the requested element
	 */
	@SuppressWarnings("unchecked")
	public <V extends Number> NBTTag<V> getTag(String get) {
		return (NBTTag<V>) NBTTag.format(tags.getTag(get));
	}
	
	public <V extends Number> void setTag(String set, NBTTag<V> value) {
		tags.setTag(set, value.format());
	}
	
	public boolean getBoolean(String get) {
		return tags.getBoolean(get);
	}
	
	public byte getByte(String get) {
		return tags.getByte(get);
	}
	
	public short getShort(String get) {
		return tags.getShort(get);
	}
	
	public int getInteger(String get) {
		return tags.getInteger(get);
	}
	
	public long getLong(String get) {
		return tags.getLong(get);
	}
	
	public float getFloat(String get) {
		return tags.getFloat(get);
	}
	
	public double getDouble(String get) {
		return tags.getDouble(get);
	}
	
	public byte[] getByteArray(String get) {
		return tags.getByteArray(get);
	}
	
	public int[] getIntegerArray(String get) {
		return tags.getIntArray(get);
	}
	
}
