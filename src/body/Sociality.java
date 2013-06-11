package body;

public class Sociality {

	private boolean isSocial;
	
	private Human[] family;
	private Human[] relatives;
	private Human[] friends;
	
	public Human[] getFamily(){
		return this.family;
	}
	
	public Human[] getRelatives(){
		return this.relatives;
	}
	
	public Human[] getFriends(){
		return this.friends;
	}
	
	public boolean isSocial(){
		return this.isSocial;
	}
	
}
