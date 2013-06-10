package types;

public enum Sex {
	
	MALE (0, "Male"),
	FEMALE (1, "Female"),
	TRANSVESTITE (2, "Transvestite"),
	OTHER (3, "Other"),
	UNKNOWN (4, "Unknown");
	
	private int id;
	private String shortName;
	
	Sex(int id, String shortName){
		this.id = id;
		this.shortName = shortName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	public String getShortName(){
		return shortName;
	}
	
}
