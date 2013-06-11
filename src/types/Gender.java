package types;

public enum Gender {	 
	
	MALE ("Male"),
	FEMALE ("Female"),
	TRANSVESTITE ("Transvetite"),
	OTHER ("Other"),
	UNKNOWN ("Unknown");
	
	private String name;
	Gender(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
}
