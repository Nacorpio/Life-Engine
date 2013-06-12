package body;

import java.util.ArrayList;

import diseases.Disease;

public class Life implements ILife {

	private int thirst;
	private int hunger;
	private int health;
	
	private Human human;
	
	private boolean isDepressed = false;
	private boolean isDesperate = false;
	private boolean isCrying = false;
	
	private boolean isHappy = false;
	private boolean isExcited = false;
	
	private boolean isAlive = false;
	private boolean hasDisease = false;
	
	private ArrayList<Disease> diseases = new ArrayList<Disease>();
	
	public Life(Human h){
		this.human = h;
	}
	
	public void setIsExcited(boolean value){
		this.isExcited = value;
	}
	
	public void setIsHappy(boolean value){
		this.isHappy = value;
	}
	
	public void setIsCrying(boolean value){
		this.isCrying = value;
	}
	
	/**
	 * Returns whether the human is excited.
	 * @return Returns whether the human is excited.
	 */
	public boolean getIsExcited(){
		return this.isExcited;
	}
	
	/**
	 * Returns whether the human is happy.
	 * @return Returns whether the human is happy.
	 */
	public boolean getIsHappy(){
		return this.isHappy;
	}
	
	/**
	 * Returns whether the human is crying.
	 * @return Returns whether the human is crying.
	 */
	public boolean getIsCrying(){
		return this.isCrying;
	}
	
	public void setIsDepressed(boolean value){
		this.isDepressed = value;
	}
	
	public void setIsDesperate(boolean value){
		this.isDesperate = value;
	}
	
	/**
	 * Returns whether the human is depressed.
	 * @return Returns whether the human is depressed.
	 */
	public boolean getIsDepressed(){
		return this.isDepressed;
	}
	
	/**
	 * Returns whether the human is desperate.
	 * @return Returns whether the human is desperate.
	 */
	public boolean getIsDesperate(){
		return this.isDesperate;
	}
	
	public final int getThirst(){
		return this.thirst;
	}
	
	public final int getHunger(){
		return this.hunger;
	}
	
	public final int getHealth(){
		return this.health;
	}
	
	public final boolean isAlive(){
		return this.isAlive;
	}
	
	public final boolean hasDisease(){
		return this.hasDisease;
	}
	
	public final ArrayList<Disease> getDiseases(){
		return this.diseases;
	}
	
	public final void addDisease(Disease d){
		this.diseases.add(d);
		d.doEffects(human);
	}
	
}
