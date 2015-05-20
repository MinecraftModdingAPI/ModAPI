/**
 * 
 */
package quanta.nbt;

import java.util.HashMap;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTBase.NBTPrimitive;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagDouble;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagIntArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagLong;
import net.minecraft.nbt.NBTTagShort;
import net.minecraft.nbt.NBTTagString;

import org.apache.commons.lang3.ArrayUtils;

import quanta.APIObject;

/**
 * @author Link
 *
 */
public class NBTTag<V extends Number> extends APIObject {

	private final NBTBase nbt;
	private Value type;
	
	public static final transient HashMap<Class<? extends Number>, Value> values = new HashMap<>(9);
	
	public static class ByteBoolean extends Number {

		/**
		 * 
		 */
		private static final long serialVersionUID = -796010462876089005L;
		private byte value;
		
		public ByteBoolean(boolean value) {
			this.value = (byte) (value ? 1 : 0);
		}
		
		public byte getValue() {
			return value;
		}
		
		@Override
		public int intValue() {
			return value;
		}

		@Override
		public long longValue() {
			return value;
		}

		@Override
		public float floatValue() {
			return value;
		}

		@Override
		public double doubleValue() {
			return value;
		}
	}

	public static class ByteArray extends Number {

		/**
		 * 
		 */
		private static final long serialVersionUID = 2723858505304355229L;

		private byte[] array;
		
		public ByteArray(byte... array) {
			this.array = array;
		}
		
		public byte[] getValue() {
			return array;
		}
		
		@Override
		public int intValue() {
			return array[0];
		}

		@Override
		public long longValue() {
			return array[0];
		}

		@Override
		public float floatValue() {
			return array[0];
		}

		@Override
		public double doubleValue() {
			return array[0];
		}
		
	}
	
	public static class IntegerArray extends Number {


		private int[] array;
		
		public IntegerArray(int... array) {
			this.array = array;
		}
		/**
		 * 
		 */
		private static final long serialVersionUID = -4836441379852438365L;

		public int[] getValue() {
			return array;
		}
		/* (non-Javadoc)
		 * @see java.lang.Number#intValue()
		 */
		@Override
		public int intValue() {
			return array[0];
		}

		@Override
		public long longValue() {
			return array[0];
		}

		@Override
		public float floatValue() {
			return array[0];
		}

		@Override
		public double doubleValue() {
			return array[0];
		}
		
	}

	// initialize values
	static {
		values.put(ByteBoolean.class, Value.BOOLEAN);
		values.put(Byte.class, Value.BYTE);
		values.put(Short.class, Value.SHORT);
		values.put(Integer.class, Value.INTEGER);
		values.put(Long.class, Value.LONG);
		values.put(Float.class, Value.FLOAT);
		values.put(Double.class, Value.DOUBLE);
		values.put(ByteArray.class, Value.BYTE_ARRAY);
		values.put(IntegerArray.class, Value.INTEGER_ARRAY);
	}
	
	public static enum Value {
		/** Indicates this NBTElement will contain a value of type Boolean */
		BOOLEAN,
		/** Indicates this NBTElement will contain a value of type Byte */
		BYTE,
		/** Indicates this NBTElement will contain a value of type Short */
		SHORT,
		/** Indicates this NBTElement will contain a value of type Integer */
		INTEGER,
		/** Indicates this NBTElement will contain a value of type Long */
		LONG,
		/** Indicates this NBTElement will contain a value of type Float */
		FLOAT,
		/** Indicates this NBTElement will contain a value of type Double */
		DOUBLE,
		/** Indicates this NBTElement will contain a value of type Byte[] */
		BYTE_ARRAY,
		/** Indicates this NBTElement will contain a value of type Integer[] */
		INTEGER_ARRAY
	}

	/**
	 * 
	 * 
	 * @param name
	 *            the name of the element
	 * @param value
	 *            the value of the element
	 * @param val
	 *            the type of value the element will hold
	 */
	NBTTag(String name, V value, Value val) {
		super(name);
		// debug
		assert value != null : "[Error] NBTElement.<init>:[value:[" + value + "], value cannot be null]";

		switch (val) {
		case BOOLEAN:
		case BYTE:
			nbt = new NBTTagByte((byte) value);
			break;
		case SHORT:
			nbt = new NBTTagShort((short) value);
			break;
		case INTEGER:
			nbt = new NBTTagInt((int) value);
			break;
		case LONG:
			nbt = new NBTTagLong((long) value);
			break;
		case FLOAT:
			nbt = new NBTTagFloat((float) value);
			break;
		case DOUBLE:
			nbt = new NBTTagDouble((double) value);
			break;
		case BYTE_ARRAY:
		case INTEGER_ARRAY:
		default:
			nbt = null;
		}
		this.type = val;
	}

	/**
	 * 
	 * 
	 * @param name
	 *            the name of the element
	 * @param value
	 *            the value of the element
	 * @param val
	 *            the type of value the element will hold
	 */
	NBTTag(String name, V[] value, Value val) {
		super(name);
		// debug
		assert value != null : "[Error] NBTElement.<init>:[value:[" + value + "], value cannot be null]";

		switch (val) {
		case BYTE_ARRAY:
			nbt = new NBTTagByteArray(ArrayUtils.toPrimitive((Byte[]) value));
			break;
		case INTEGER_ARRAY:
			nbt = new NBTTagIntArray(ArrayUtils.toPrimitive((Integer[]) value));
			break;
			//$CASES-OMITTED$
		default:
			nbt = null;
		}
		this.type = val;
	}
	
	@SafeVarargs
	public NBTTag(String name, V... values) {
		this(name, values, null);
	}

	@Override
	public NBTBase format() {
		return nbt;
	}

	@SuppressWarnings("unchecked")
	V get() {
		if (nbt instanceof NBTPrimitive)
			switch (type) {
			case BOOLEAN:
				return (V) Byte.valueOf(((NBTPrimitive) nbt).getByte());
			case BYTE:
				return (V) Byte.valueOf(((NBTPrimitive) nbt).getByte());
			case SHORT:
				return (V) Short.valueOf(((NBTPrimitive) nbt).getShort());
			case INTEGER:
				return (V) Integer.valueOf(((NBTPrimitive) nbt).getInt());
			case LONG:
				return (V) Long.valueOf(((NBTPrimitive) nbt).getLong());
			case FLOAT:
				return (V) Float.valueOf(((NBTPrimitive) nbt).getFloat());
			case DOUBLE:
				return (V) Double.valueOf(((NBTPrimitive) nbt).getDouble());
				//$CASES-OMITTED$
			default:
				return (V) Byte.valueOf((byte) 0);
			}

		throw new RuntimeException("[Error] NBTElement.get:[Invalid NBT Type:[id:"+nbt.getId()+" ("+nbt.toString()+")]]");
	}

	@SuppressWarnings("unchecked")
	V[] getValueAsArray() {

		switch (type) {
		case BYTE_ARRAY:
		case INTEGER_ARRAY:
			//$CASES-OMITTED$
		default:
			return (V[]) new Number[] { ((NBTPrimitive) nbt).getDouble() };
		}
	}

	public Value getType() {
		return type;
	}
	
	public int getID() {
		return nbt.getId();
	}
	
	public static NBTTag<?> format(NBTBase nbt) {
		switch(nbt.getId()) {
		case 1:
			return format((NBTTagByte) nbt);
		case 2:
			return format((NBTTagShort) nbt);
		case 3:
			return format((NBTTagInt)nbt);
		case 4:
			return format((NBTTagLong) nbt);
		case 5:
			return format((NBTTagFloat) nbt);
		case 6:
			return format((NBTTagDouble)nbt);
		case 7:
			return format((NBTTagByteArray) nbt);
		case 8:
			return format((NBTTagString) nbt);
		case 11:
			return format(nbt);
			default:
				return null;
		}
	}

	public static NBTTag<Byte> format(NBTTagByte nbt) {
		return new NBTTag<>(nbt.toString(), nbt.getByte(), Value.BYTE);
	}
	
	public static NBTTag<Short> format(NBTTagShort nbt) {
		return new NBTTag<>(nbt.toString(), nbt.getShort(), Value.SHORT);
	}
	
	public static NBTTag<Integer> format(NBTTagInt nbt) {
		return new NBTTag<>(nbt.toString(), nbt.getInt(), Value.INTEGER);
		
	}
	
	public static NBTTag<Long> format(NBTTagLong nbt) {
		return new NBTTag<>(nbt.toString(), nbt.getLong(), Value.LONG);
		
	}
	
	public static NBTTag<Float> format(NBTTagFloat nbt) {
		return new NBTTag<>(nbt.toString(), nbt.getFloat(), Value.FLOAT);
		
	}
	
	public static NBTTag<Double> format(NBTTagDouble nbt) {
		return new NBTTag<>(nbt.toString(), nbt.getDouble(), Value.DOUBLE);
	}
	
}
