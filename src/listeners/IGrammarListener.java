package listeners;

public interface IGrammarListener {

	/**
	 * Returns whether the listener is running.
	 * @return Returns whether the listener is running.
	 */
	public boolean isRunning();
	
	/**
	 * Returns the amount of seconds that has ticked.
	 * @return Returns the amount of seconds that has ticked.
	 */
	public int getSecondsTicked();

	/**
	 * Start the listener.
	 */
	public void start();
	
	/**
	 * Stop the listener.
	 */
	public void stop();
	
	/**
	 * The code to be ran once a tick goes by.
	 */
	public void run();
	
}
