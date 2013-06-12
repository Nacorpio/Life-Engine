package body;

import human.HumanFactory;
import human.IHumanEvents;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import listeners.ILifeListener;
import listeners.LifeListener;

import creature.Creature;
import sociality.*;
import types.Gender;

public class Human extends Creature implements ILifeListener {
	
	private IHumanEvents events;
	private DNA dna;
	private Brain brain;
	private Life life;
	private Identity identity;
	private SocialLife socialLife;
	private Family family;
	
	private boolean isSterile = false;
	private boolean isVirgin = true;
	
	private LifeListener listener;
	
	public Human(Date birthOfDate, String firstName, String lastName, String secondName, Family family, Gender gender){
		super("Homo sapien", "Animalia", "Hominidae", "Chordata");
		this.family = family;
		identity = new Identity(this, birthOfDate, firstName, lastName, secondName, gender);
		socialLife = new SocialLife(this);
		life = new Life(this);
		brain = new Brain(this);
		dna = new DNA(this);
		listener = new LifeListener(this);
		// listener.start();
	}
	
	public Human bornBaby(Family family, Human target, String firstName, String middleName){
		Human baby;
		if (this.getIdentity().getGender() == Gender.FEMALE){
			if (target != null && firstName != null && middleName != null){
				if (!target.getIsSterile() && !this.getIsSterile()){
					
					// The humans to have the baby aren't sterile.
					Random rand = new Random(System.currentTimeMillis());
					boolean isMale = rand.nextBoolean();
					
					// It's randomly creating a Boolean and if it's True it means it's a male and if it's False it means it's a female.
					
					if (isMale){
						baby = HumanFactory.createHuman(Calendar.getInstance().getTime(), family, firstName, family.getFamilyName(), middleName, Gender.MALE);
					} else {
						baby = HumanFactory.createHuman(Calendar.getInstance().getTime(), family, firstName, family.getFamilyName(), middleName, Gender.FEMALE);
					}
					
					baby.setVirginity();
					baby.setHumanFamily(FamilyFactory.createFamily(family.getFamilyName(), target, this));
					baby.getHumanFamily().getEvents().onFamilyMemberBorn(baby, this);
					this.getEvents().onGiveBirth(baby);
					baby.getEvents().onBorn(this);
					
					System.out.println("A baby was born\n" +
									   "Gender: " + baby.getIdentity().getGender().getName() + "\n" + 
									   "Age: " + baby.getIdentity().getAge() + "\n" + 
									   "Full Name: " + baby.getIdentity().getFullName() + "\n" + 
									   "Full Name (mother): " + baby.getHumanFamily().getMother().getIdentity().getFullName() + "\n" + 
									   "Full Name (father): " + baby.getHumanFamily().getFather().getIdentity().getFullName() + "\n" +
									   "Age (mother): " + baby.getHumanFamily().getMother().getIdentity().getAge());
					return baby;
					
				} else {
					return null;
				}
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	public void setVirginity(){
		if (this.isVirgin){
			this.isVirgin = false;
		}
	}
	
	public void setSterile(){
		this.isSterile = true;
	}
	
	/**
	 * Returns whether the human is a virgin.
	 * @return Returns whether the human is a virgin.
	 */
	public boolean getIsVirgin(){
		return this.isVirgin;
	}
	
	public boolean getIsSterile(){
		return this.isSterile;
	}
	
	public IHumanEvents getEvents(){
		return this.events;
	}
	
	/**
	 * Returns the listener of the life.
	 * @return Returns the listener of the life.
	 */
	public LifeListener getLifeListener(){
		return this.listener;
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
	
	public void setHumanFamily(Family family){
		this.family = family;
	}
	
	/**
	 * Returns the family of the human.
	 * @return Returns the family of the human.
	 */
	public Family getHumanFamily(){
		return this.family;
	}
	
	@Override
	public void onTick(int second) {
		
	}

	@Override
	public void onStateChanged(boolean state) {
		
	}
	
}
