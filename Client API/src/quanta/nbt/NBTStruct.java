/**
 * 
 */
package quanta.nbt;

import java.util.Arrays;

import quanta.nbt.NBTTag.Value;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.nbt.NBTTagCompound;

/**
 * @author Link
 *
 */
public class NBTStruct {

	private final NBTTagCompound tags;

	@SafeVarargs
	public NBTStruct(NBTTag<Number>... tags) {
		this.tags = new NBTTagCompound();
		for(NBTTag<Number> elem : tags) {
			this.tags.setTag(elem.getName(), elem.format());
		}
	}

	public NBTTag getElement(String get) {
		return tags.getTag(get) instanceof NBTBase.NBTPrimitive ? NBTTag.format((NBTTagByte)tags.getTag(get)) : null;
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
	
	public <V> Object NBTElement(Value value, String set, V val) {
		return null;
	}
}
