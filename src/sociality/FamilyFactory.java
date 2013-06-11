package sociality;

import body.Human;

public class FamilyFactory {

	/**
	 * Creates a new family with the specified name and members.
	 * @param familyName The name of the family.
	 * @param father The father of the family.
	 * @param mother The mother of the family.
	 * @param siblings The siblings of the family.
	 * @return Returns the new family.
	 */
	public final static Family createFamily(String familyName, Human father, Human mother, Human... siblings){
		return new Family(familyName, mother, mother, siblings);
	}
	
}
