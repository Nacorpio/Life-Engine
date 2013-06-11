package body;

public class Life implements ILife {

	private int thirst;
	private int hunger;
	private int health;
	
	private boolean isAlive;
	private boolean hasDisease;
	
	public int getThirst(){
		return this.thirst;
	}
	
	public int getHunger(){
		return this.hunger;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public boolean isAlive(){
		return this.isAlive;
	}
	
	public boolean hasDisease(){
		return this.hasDisease;
	}
	
}
