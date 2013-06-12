package body;

public class DNA implements IDNA {
	
	private Human human;
	
	public DNA(Human human){
		this.human = human;
	}
	
	/**
	 * Returns the human.
	 * @return Returns the human.
	 */
	public Human getHuman(){
		return this.human;
	}
	
	public void setHuman(Human human){
		this.human = human;
	}
	
}
