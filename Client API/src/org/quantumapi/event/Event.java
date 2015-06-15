/**
 * 
 */
package org.quantumapi.event;

/**
 * The primary Event class that all events within the quanta.event package
 * inherits.<br>
 * An Event object is immutable because it's elements cannot be changed.
 * 
 * @author Link
 *
 */
public class Event {

	/** The String that is read by the {@link EventHandler} and passed to */
	protected final String eventType;

	/**
	 * 
	 */
	public Event(String event) {
		eventType = event;
	}

	/**
	 * Gets the event type String. This is called by the {@link EventHandler}<br>
	 * and passed to a {@link ListenerAdapter}'s throwEvent method.
	 * 
	 * @return the event type as a String
	 */
	public final String getEventType() {
		return eventType;
	}

}
