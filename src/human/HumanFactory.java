package human;

import sociality.Family;
import types.Gender;
import body.Human;

public final class HumanFactory {

	/**
	 * Create a human and add it to a family.
	 * @param family The family to add the human to.
	 * @param firstName The first name of the human.
	 * @param lastName The last name of the human.
	 * @param secondName The second name of the human.
	 * @param gender The gender of the human. 
	 * @return Returns the new human.
	 */
	public static final Human createHuman(Family family, String firstName, String lastName, String secondName, Gender gender){
		return new Human(firstName, lastName, secondName, family, gender);
	}
	
}
