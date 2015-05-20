/**
 * 
 */
package quanta.nbt;

import net.minecraft.nbt.NBTTagCompound;
import static net.minecraft.nbt.NBTBase.NBT_TYPES;

/**
 * @author Link
 *
 */
public final class NBT {

	private static NBTTagCompound tagUtil;

	private NBT() {
	}
	
	public static NBTStruct write(String write, Number val) {
		return new NBTStruct(new NBTTag(write, val));
	}
	
	public static <T> T read(NBTStruct nbt, String read) {
		return null;
	}
	
	public static String decode(int id) {
		return NBT_TYPES[id] != null ? NBT_TYPES[id] : "Unknown";
	}

}
