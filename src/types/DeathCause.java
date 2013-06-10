package types;

public enum DeathCause {
	
	DISEASE ("Disease"),
	STRESS ("Stress"),
	NATURAL ("Natural"),
	SORROW ("Sorrow"),
	HEART_ATTACK ("Heart Attack"),
	SUICIDE ("Suicide"),
	VIOLENCE ("Violence"),
	INJURY ("Injury"),
	MURDERER ("Murderer"),
	UNKNOWN	("Unknown");
	
	private String shortName;
	DeathCause(String shortName){
		this.shortName = shortName;
	}
	
	public String getShortName(){
		return this.shortName;
	}
	
}
