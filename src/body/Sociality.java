package body;

public class Sociality {
	
	private Human[] family;
	private Human[] relatives;
	private Human[] friends;
	
	/**
	 * Returns the family of the human.
	 * @return Returns the family of the human.
	 */
	public Human[] getFamily(){
		return this.family;
	}
	
	/**
	 * Returns the relatives of the human.
	 * @return Returns the relatives of the human.
	 */
	public Human[] getRelatives(){
		return this.relatives;
	}
	
	/**
	 * Returns the friends of the human.
	 * @return Returns the friends of the human.
	 */
	public Human[] getFriends(){
		return this.friends;
	}
	
	/**
	 * Returns whether the person is social.
	 * @return Returns a Boolean on whether the person is social.
	 */
	public boolean isSocial(){
		return this.friends.length >= 1 ? true : false;
	}
	
}
