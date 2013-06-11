package body;

import sociality.*;
import types.Gender;

public class Human implements IHuman {
	
	private DNA dna;
	private Brain brain;
	private Life life;
	private Identity identity;
	private SocialLife socialLife;
	private Family family;
	
	public Human(String firstName, String lastName, String secondName, Family family, Gender gender){
		identity = new Identity(firstName, lastName, secondName, gender);
	}
	
	public DNA getDNA(){
		return this.dna;
	}
	
	public Brain getBrain(){
		return this.brain;
	}
	
	public Life getLife(){
		return this.life;
	}
	
	public Identity getIdentity(){
		return this.identity;
	}
	
	public SocialLife getSocialLife(){
		return this.socialLife;
	}
	
	public Family getFamily(){
		return this.family;
	}
	
}
