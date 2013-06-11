package listeners;

public class GrammarListener implements IGrammarListener {

	private int secondsTicked = 0;
	private boolean isRunning = false;
	
	@Override
	public final int getSecondsTicked() {
		return this.secondsTicked;
	}
	
	@Override
	public final boolean isRunning(){
		return this.isRunning;
	}
	
	@Override
	public final void start() {
		if (isRunning == false){
			isRunning = true;
			tick();
		}
	}

	@Override
	public final void stop() {
		if (isRunning == true){
			isRunning = false;
		}
	}

	@Override
	public void run() {/* This is what it's going to do. */}

	private final void tick(){
		while (isRunning == true){
			try {
				Thread.sleep(1000);
				run();
				secondsTicked += 1;
			} catch (InterruptedException e){e.printStackTrace();}
		};
	}
	
}
