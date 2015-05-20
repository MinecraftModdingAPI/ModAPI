/**
 * 
 */
package quanta.event;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Link
 *
 */
public class EventHandler {

	private static HashMap<Class<Event>, ArrayList<ListenerAdapter<? extends Listener, ? extends Event>>> listeners;
	
	static {
		try {
			listeners = new HashMap<>(256);
		} catch (IllegalArgumentException e) {
			
		}
	}

	private EventHandler() {
	}
	
	@SuppressWarnings("unchecked")
	public static void addListener(ListenerAdapter<? extends Listener, ? extends Event> listener) {
		ArrayList<ListenerAdapter<? extends Listener, ? extends Event>> list = listeners.get(listener.getEventType());
		
		if(list != null) {
			if(!list.contains(listener)) {
				list.add(listener);
			}
		} else {
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
		e.
	}

}
