/**
 * 
 */
package org.quantumapi.event;

/**
 * @author Link
 *
 */
public abstract class ListenerAdapter<L extends Listener, E extends Event> {

	protected L listener;
	protected Class<E> event;

	/**
	 * Creates a new ListenerAdapter that encapsulates a Listener interface for
	 * use with the EventHandler.
	 * 
	 * @param listener
	 *            the listener to encapsulate
	 */
	public ListenerAdapter(L listener, Class<E> event) {
		this.listener = listener;
		this.event = event;
	}

	/**
	 * Gets the contained listener that this ListenerAdapter applies to.
	 * 
	 * @return the encapsulated listener
	 */
	public final L getListener() {
		return listener;
	}
	
	public final Class<E> getEventType() {
		return event;
	}

	/**
	 * Throws an Event and applies it to the listener contained in this ListenerAdapter.
	 * 
	 * @param action the listener method
	 * @param event the thrown event to pass to the listener method.
	 */
	public abstract void throwEvent(String action, E event);

}
