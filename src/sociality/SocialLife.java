package sociality;

import types.Religion;
import body.Human;

public class SocialLife {

	private Family family = null;
	private Religion religion = null;
	private Human[] friends = null;
	private Human relationship = null;
	
	private boolean isDating = relationship == null ? false : true;
	
	public Family getFamily(){
		return this.family;
	}
	
	public Religion getReligion(){
		return this.religion;
	}
	
	public Human[] getFriends(){
		return this.friends;
	}
	
	public Human getRelationship(){
		return this.relationship;
	}
	
	public boolean isDating(){
		return this.isDating;
	}
	
}
