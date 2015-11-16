/**
 * 
 */
package org.quantumapi.event;

import org.quantumapi.event.Listener;

/**
 * @author Link
 *
 */
public interface BlockListener extends Listener {

	/**
	 * Called whenever a BlockEvent occurs.
	 * 
	 * @param evt the event containing information about the event.
	 */
	public void blockEvent(BlockEvent evt);
}
