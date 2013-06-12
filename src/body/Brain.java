package body;

public class Brain implements IBrain {

	private Human human;
	
	public final static int MAX_CAPACITY = 1900;
	public final static int MIN_CAPACITY = 1000;
	
	private int health = 0;
	private int capacity = 0;
	
	public Brain(Human human){
		this.human = human;
	}
	
	public Human getHuman(){
		return this.human;
	}
	
	@Override
	public int getHealth() {
		return this.health;
	}

	@Override
	public int getCapacity() {
		return this.capacity;
	}

}