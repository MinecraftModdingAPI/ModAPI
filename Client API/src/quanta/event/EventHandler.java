/**
 * 
 */
package quanta.event;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The EventHandler class is an EventHandler that allows you to add Listeners
 * arbitrarily, and send Events without the EventHandler needing to know which
 * kind of event method needs to be called.
 * 
 * @author Link
 *
 */
public final class EventHandler {

	// The Listeners that this EventHandler will apply events to.
	private static HashMap<Class<Event>, ArrayList<ListenerAdapter<? extends Listener, ? extends Event>>> listeners;

	static {
		// try-catch for varargs of constructor (hard-coded for now)
		try {
			listeners = new HashMap<>(256);
		} catch (IllegalArgumentException e) {

		}
	}
	//static class
	private EventHandler() {
	}

	/**
	 * Adds a ListenerAdapter that contains the Listener you want called when an Event is thrown.
	 * 
	 * @param listener
	 */
	@SuppressWarnings("unchecked")
	public static void addListener(ListenerAdapter<? extends Listener, ? extends Event> listener) {

		// Avoids try-catch for NPE
		ArrayList<ListenerAdapter<? extends Listener, ? extends Event>> list = listeners.get(listener.getEventType());

		// if the list exists
		if (list != null) {
			// if the list doesn't contain the same Listener
			if (!list.contains(listener)) {
				list.add(listener);
			}
		} else {
			/*
			 * this Listener isn't registered; create a new ArrayList and add
			 * the listener.
			 */
			list = new ArrayList<>();
			list.add(listener);
			listeners.put((Class<Event>) listener.getEventType(), list);
		}
	}

	/**
	 * 
	 * @param e
	 */
	public static void throwEvent(Event e) {
		// ArrayList is Iterable
		for (ListenerAdapter<? extends Listener, ? extends Event> l : listeners.get(e.getClass())) {

		}
	}

}
