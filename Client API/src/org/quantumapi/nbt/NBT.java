/**
 * 
 */
package org.quantumapi.nbt;

import static net.minecraft.nbt.NBTBase.NBT_TYPES;

import org.quantumapi.nbt.NBTTag.Value;

/**
 * @author Link
 *
 */
public final class NBT {

	private NBT() {
	}
	
	@SafeVarargs
	public static <V extends Number> NBTTag<V> write(String name, Value type, V... val) {
		return new NBTTag<>(name, val, type);
	}
	
	public static <V extends Number> NBTTag<V> copy(NBTTag<V> tag) {
		return new NBTTag<>(tag.getName(), tag.get(), tag.getType());
	}
	
	public static <T extends Number> T read(NBTTag<T> nbt) {
		return nbt.get();
	}
	
	public static String decode(int id) {
		return NBT_TYPES[id] != null ? NBT_TYPES[id] : "Unknown";
	}

}
