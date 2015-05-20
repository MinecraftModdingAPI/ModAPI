/**
 * 
 */
package quanta.event;

/**
 * @author Link
 *
 */
public final class LBlockAdapter extends ListenerAdapter<BlockListener, Event> {

	/**
	 * Creates an LBlockAdapter with a BlockListener. Used by the EventHandler<br>
	 * so that specific listener methods may be called.
	 * 
	 * @param listener the listener this LBlockAdapter will contain.
	 */
	public LBlockAdapter(BlockListener listener) {
		super(listener, BlockEvent.class);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * This variant calls blockEvent in type BlockListener.<br>
	 * Actions: any string
	 * </p>
	 */
	@Override
	public void throwEvent(String action, BlockEvent event) {
		switch (action) {
		default:
			listener.blockEvent(event);
		}
	}

}
