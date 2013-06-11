package body;

import creature.Creature;
import sociality.*;
import types.Gender;

public class Human extends Creature {
	
	private DNA dna;
	private Brain brain;
	private Life life;
	private Identity identity;
	private SocialLife socialLife;
	private Family family;
	
	public Human(String firstName, String lastName, String secondName, Family family, Gender gender){
		super("Homo sapien", "Animalia", "Hominidae", "Chordata");
		identity = new Identity(firstName, lastName, secondName, gender);
	}
	
	/**
	 * Returns the DNA of the human.
	 * @return Returns the DNA of the human.
	 */
	public DNA getDNA(){
		return this.dna;
	}
	
	/**
	 * Returns the brain of the human.
	 * @return Returns the brain of the human.
	 */
	public Brain getBrain(){
		return this.brain;
	}
	
	/**
	 * Returns the "life" of the human.
	 * @return Returns the "life" of the human.
	 */
	public Life getLife(){
		return this.life;
	}
	
	/**
	 * Returns the identity of the human.
	 * @return Returns the identity of the human.
	 */
	public Identity getIdentity(){
		return this.identity;
	}
	
	/**
	 * Returns the social life of the human.
	 * @return Returns the social life of the human.
	 */
	public SocialLife getSocialLife(){
		return this.socialLife;
	}
	
	/**
	 * Returns the family of the human.
	 * @return Returns the family of the human.
	 */
	public Family getHumanFamily(){
		return this.family;
	}
	
}
