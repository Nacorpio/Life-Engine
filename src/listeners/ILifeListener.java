package listeners;

public interface ILifeListener {
	
	/**
	 * This event is fired when a tick goes by.
	 * @param second The amount of seconds that has gone by.
	 */
	public void onTick(int second);
	
	/**
	 * This event is fired when the state of the listener is changed.
	 * @param state The new state of the listener.
	 */
	public void onStateChanged(boolean state);
	
}
