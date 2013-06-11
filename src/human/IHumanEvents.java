package human;

import types.DeathCause;
import body.Human;

public interface IHumanEvents {

	/**
	 * This event is fired when a mother gives birth.
	 * @param baby The baby that was given birth.
	 */
	public void onGiveBirth(Human baby);
	
	/**
	 * This event is fired when the first name is changed.
	 * @param newName The new first name.
	 */
	public void onFirstNameChanged(String newName);
	
	/**
	 * This event is fired when the last name is changed.
	 * @param newName
	 */
	public void onLastNameChanged(String newName);
	
	/**
	 * This event is fired when the human dies.
	 * @param cause The cause of the death.
	 */
	public void onDeath(DeathCause cause);
	
	/**
	 * This event is fired when the human is born.
	 * @param mother The mother of the human.
	 */
	public void onBorn(Human mother);
	
}
