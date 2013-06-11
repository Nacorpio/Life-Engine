package human;

import sociality.Family;
import types.Gender;
import body.Human;

public final class HumanFactory {

	/**
	 * Create a <code>Human</code> with the specified properties.
	 * @param firstName The first name of the Human.
	 * @param lastName The last name of the Human.
	 * @param secondName The second name of the Human.
	 * @return Returns the created Human.
	 */
	public static final Human createHuman(String firstName, String lastName, String secondName, Gender gender){
		Human result = null;
		result = new Human(firstName, lastName, secondName, new Family(lastName, null, null, null), gender);
		return result;
	}
	
}
