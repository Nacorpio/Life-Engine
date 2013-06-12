package body;

import java.awt.Color;

public class DNA implements IDNA {
	
	private Human human;
	
	private Color eyeColor;
	private Color hairColor;
	
	public DNA(Human human){
		this.human = human;
	}
	
	/**
	 * Returns the human that has the DNA.
	 * @return Returns the human has the DNA.
	 */
	public Human getHuman(){
		return this.human;
	}
	
	/**
	 * Set the human of this DNA.
	 * @param human The human to set.
	 */
	public void setHuman(Human human){
		this.human = human;
	}
	
	public Color getEyeColor(){
		return this.eyeColor;
	}
	
	public Color getHairColor(){
		return this.hairColor;
	}
	
}
