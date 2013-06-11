package creature;

public class Creature {

	String binomialName;
	String kingdom;
	String family;
	String phylum;
	
	public Creature(String binomialName, String kingdom, String family, String phylum){
		this.binomialName = binomialName;
		this.kingdom = kingdom;
		this.family = family;
		this.phylum = phylum;
	}
	
	public String getBinomialName(){
		return this.binomialName;
	}
	
	public String getKingdom(){
		return this.kingdom;
	}
	
	public String getFamily(){
		return this.family;
	}
	
	public String getPhylum(){
		return this.phylum;
	}
	
}
