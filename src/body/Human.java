package body;

import types.Sex;

public class Human implements IHuman {

	private boolean isBorn;
	
	private Sex gender;
	private DNA dna;
	private Life life;
	private Brain brain;
	
	private int health;
	private int height;
	private int fatness;
	
	@Override
	public boolean isBorn() {
		return this.isBorn;
	}

	@Override
	public Sex getGender() {
		return this.gender;
	}

	@Override
	public DNA getDNA() {
		return this.dna;
	}

	@Override
	public Life getLife() {
		return this.life;
	}

	@Override
	public Brain getBrain() {
		return this.brain;
	}

	@Override
	public int getHealth() {
		return this.health;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	@Override
	public int getFatness() {
		return this.fatness;
	}

}
