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
	
	private ArrayList<Disease> diseases = new ArrayList<Disease>();
	
	public Life(Human h){
		this.human = h;
		this.isAlive = true;
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
	
	/**
	 * Returns the thirst of the life (human).
	 * @return Returns the thirst of the list (human).
	 */
	public final int getThirst(){
		return this.thirst;
	}
	
	/**
	 * Returns the hunger of the life (human).
	 * @return Returns the hunger of the life (human).
	 */
	public final int getHunger(){
		return this.hunger;
	}
	
	/**
	 * Returns the health of the life (human).
	 * @return Returns the health of the life (human).
	 */
	public final int getHealth(){
		return this.health;
	}
	
	/**
	 * Returns whether the human is alive.
	 * @return Returns whether the human is alive.
	 */
	public final boolean isAlive(){
		return this.isAlive;
	}
	
	/**
	 * Returns whether the person has at least one disease.
	 * @return Returns whether the person has at least one disease.
	 */
	public final boolean hasDisease(){
		return this.diseases.size() >= 1 ? true : false;
	}
	
	/**
	 * Returns the diseases of the life of the person.
	 * @return Returns the diseases of the life of the person.
	 */
	public final ArrayList<Disease> getDiseases(){
		return this.diseases;
	}
	
	public final void addDisease(Disease d){
		this.diseases.add(d);
		d.doEffects(human);
	}
	
}
