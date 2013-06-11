package listeners;
import java.util.ArrayList;

import diseases.Disease;
import body.*;

public class LifeListener {

	private ILifeListener thelistener;
	
	private ArrayList<IAction> actions = new ArrayList<IAction>();
	private int secondsTicked = 0;
	private boolean isStarted = false;
	private Human human = null;
	
	public LifeListener(Human h){
		this.human = h;
	}
	
	/**
	 * Add an action to the queue.
	 * @param action The action to add.
	 */
	public final void addAction(IAction action){
		this.actions.add(action);
	}
	
	/**
	 * Returns all the actions within the queue.
	 * @return Returns all the action within the queue.
	 */
	public final ArrayList<IAction> getActions(){
		return this.actions;
	}
	
	/**
	 * Start the listener.
	 */
	public final void start(){
		if (isStarted == false){
			isStarted = true;
			// thelistener.onStateChanged(true);
			tick();
		}
	}
	
	/**
	 * Stop the listener.<br>
	 * The seconds that has passed is reset.
	 */
	public final void stop(){
		if (isStarted == true){
			isStarted = false;
			// thelistener.onStateChanged(false);
			secondsTicked = 0;
		}
	}
	
	private final void tick(){
		while (isStarted == true){
			try {
				mission(this.human);
				Thread.sleep(1000);
				this.secondsTicked += 1;
				thelistener.onTick(this.secondsTicked);
			} catch (InterruptedException e){e.printStackTrace();}
		};
	}
	
	/**
	 * A void containing what is going to happen on each tick.
	 * @param human The human's life you want to affect.
	 */
	public void mission(Human human) {
		for (Disease d: human.getLife().getDiseases()){
			d.doEffects(human);
		}
		for (IAction action: this.actions){
			action.action();
		}
	}
	
	/**
	 * Returns the amount of seconds that has been passed.
	 * @return Returns the amount of seconds that been passed.
	 */
	public final int getSecondsTicked(){
		return this.secondsTicked;
	}
	
	/**
	 * Returns whether the listener has been started.
	 * @return Returns whether the listener has been started.
	 */
	public final boolean isStarted(){
		return this.isStarted;
	}

}
