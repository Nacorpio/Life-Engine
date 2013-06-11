package creature;

/**
 * The creature class if used for inheriting methods to the human and other creatures.<br>
 * Brain and body is added later in the creature-inherited class.
 */
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
	
	/**
	 * Returns the binomial name of the creature.
	 * @return Returns the binomial name of the creature.
	 */
	public String getBinomialName(){
		return this.binomialName;
	}
	
	/**
	 * Returns the kingdom of the creature.
	 * @return Returns the kingdom of the creature.
	 */
	public String getKingdom(){
		return this.kingdom;
	}
	
	/**
	 * Returns the family name of the creature.
	 * @return Returns the family name of the creature.
	 */
	public String getFamily(){
		return this.family;
	}
	
	/**
	 * Returns the phylum of the creature.
	 * @return Returns the phylum of the creature.
	 */
	public String getPhylum(){
		return this.phylum;
	}
	
}
