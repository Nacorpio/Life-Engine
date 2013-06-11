package body;

import java.util.ArrayList;

import diseases.Disease;

public class Life implements ILife {

	private int thirst;
	private int hunger;
	private int health;
	
	private Human human;
	
	private boolean isAlive;
	private boolean hasDisease;
	
	private ArrayList<Disease> diseases = new ArrayList<Disease>();
	
	public Life(Human h){
		this.human = h;
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
