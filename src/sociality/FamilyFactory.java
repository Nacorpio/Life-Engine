package sociality;

import body.Human;

public class FamilyFactory {

	public final static Family createFamily(String familyName, Human father, Human mother, Human... siblings){
		return new Family(familyName, mother, mother, siblings);
	}
	
}
