package types;

public enum Sexuality {
	
	HETEROSEXUAL (0),
	HOMOSEXUAL (1),
	BISEXUAL (2),
	ASEXUAL (3),
	PANSEXUAL (4),
	POLYSEXUAL (5),
	INTERSEXUAL (6);
	
	private int id;
	Sexuality(int id){
		this.setId(id);
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
}
