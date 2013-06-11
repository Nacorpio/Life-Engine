package sociality;

import types.DeathCause;
import body.Human;

public interface IFamilyEvents {

	/**
	 * Occurs when a family member dies.
	 * @param member The member that died.
	 * @param reason The reason of the death.
	 */
	public void onFamilyMemberDie(Human member, DeathCause reason);
	
	/**
	 * Occurs when a baby is born within the family.
	 * @param baby The baby that has been born.
	 * @param mother The mother that gave birth.
	 */
	public void onFamilyMemberBorn(Human baby, Human mother);
	
	/**
	 * Occurs when the name of a family changes.
	 * @param newName The new name of the family.
	 */
	public void onFamilyNameChanged(String newName);
	
}
