/**
 * 
 */
package org.quantumapi.block;

import org.quantumapi.APIObject;
import org.quantumapi.util.Properties;

import net.minecraft.block.state.BlockState;

/**
 * @author Link
 *
 */
public class State extends APIObject {

	protected final transient Block block;
	
	protected final Properties iprops;
	/**
	 * 
	 */
	public State(Block block, Properties iprops) {
		super("State:["+block.getName()+":[id:"+block.getID()+"]], ["+iprops.getName()+"]");
		this.block = block;
		this.iprops = iprops;
	}
	
	private static class MBlockState extends BlockState {
		
		protected MBlockState(Block block, Properties iprops) {
			super(block.format(), iprops.toIProperties());
		}
		
	}
	@Override
	public BlockState format() {
		return new MBlockState(block, iprops);
	}

}