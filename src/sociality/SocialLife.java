package sociality;

import java.util.Random;

import types.Gender;
import types.Religion;
import body.Human;

public class SocialLife {

	private Human human = null;
	private Family family = null;
	private Religion religion = null;
	private Human[] friends = null;
	private Human relationship = null;
	
	private boolean isDating = relationship == null ? false : true;
	
	public SocialLife(Human human){
		this.human = human;
	}
	
	public boolean marry(Human target){
		Random rand = new Random(System.currentTimeMillis());
		if (rand.nextBoolean()){
			// The target marries the human.
			this.relationship = target;
			human.getLife().setIsExcited(true);
			human.getLife().setIsHappy(true);
			target.getLife().setIsExcited(true);
			target.getLife().setIsHappy(true);
			return rand.nextBoolean();
		} else {
			// The target declines the request of marriage.
			human.getLife().setIsDepressed(true);
			target.getLife().setIsHappy(true);
			return rand.nextBoolean();
		}
	}
	
	public boolean performIntercourse(Human target, boolean protection){
		Random rand = new Random(System.currentTimeMillis());
		boolean willing = rand.nextBoolean();
		if (willing){
			human.getLife().setIsExcited(rand.nextBoolean());
			if (protection){
				if (!human.getIsSterile() || !target.getIsSterile()){
					// Means that they will have a baby.
					Human baby = target.bornBaby(this.family, target, "Axel", "Jeppsson");
					if (target.getIdentity().getGender() == Gender.FEMALE){
						target.getEvents().onBorn(target);
						baby.getHumanFamily().setMother(target);
						baby.getHumanFamily().setFather(this.human);
					} else if (target.getIdentity().getGender() == Gender.MALE){
						this.human.getEvents().onBorn(this.human);
						baby.getHumanFamily().setMother(this.human);
						baby.getHumanFamily().setFather(target);
					}
					target.getLife().setIsExcited(true);
					human.getLife().setIsExcited(true);
				} else {
					// Means one of them are sterile so that they can't have a child.
					target.getLife().setIsDesperate(true);
					target.getLife().setIsDepressed(true);
				}
			}
			return true;
		} else {
			human.getLife().setIsDepressed(true);
			return false;
		}
	}

	public Family getFamily(){
		return this.family;
	}
	
	public Religion getReligion(){
		return this.religion;
	}
	
	public Human[] getFriends(){
		return this.friends;
	}
	
	public Human getRelationship(){
		return this.relationship;
	}
	
	public boolean isDating(){
		return this.isDating;
	}
	
}
