package body;

public class DNA implements IDNA {
	
	private Human human;
	
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
	
}
