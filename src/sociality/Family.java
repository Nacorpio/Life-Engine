package sociality;

import java.util.ArrayList;

import types.Gender;

import body.Human;

public class Family {
	
	private IFamilyEvents events;
	
	private Human partner = null;
	private ArrayList<Human> children = new ArrayList<Human>();

	private Human father = null;
	private Human mother = null;
	
	private ArrayList<Human> brothers = new ArrayList<Human>();
	private ArrayList<Human> sisters = new ArrayList<Human>();
	
	private String familyName;
	
	/**
	 * Creates a new family.<br>
	 * No siblings are included in this instance.
	 * @param familyName The name of the family.
	 * @param father The father of the family.
	 * @param mother The mother of the family.
	 */
	public Family(String familyName, Human father, Human mother){
		this(familyName, mother, mother, (Human[])null);
	}
	
	/**
	 * Creates a new family.
	 * Siblings are included in this instance.
	 * @param familyName The name of the family.
	 * @param father The father of the family.
	 * @param mother The mother of the family.
	 * @param siblings The siblings of the family.
	 */
	public Family(String familyName, Human father, Human mother, Human... siblings){
		if (father != null && mother != null){
			this.familyName = familyName;
			this.father = father;
			this.mother = mother;
			if (siblings != null){
				for (Human s: siblings){
					if (s.getIdentity().getGender() == Gender.MALE){
						brothers.add(s);
					} else if (s.getIdentity().getGender() == Gender.FEMALE){
						sisters.add(s);
					}
				}
			}			
		}
	}

	public final void setPartner(Human partner){
		this.partner = partner;
	}
	
	public final Human getPartner(){
		return this.partner;
	}
	
	public final ArrayList<Human> getChildren(){
		return this.children;
	}
	
	/**
	 * Returns the events of the family.
	 * @return Returns the events of the family.
	 */
	public final IFamilyEvents getEvents(){
		return this.events;
	}
	
	/**
	 * Returns the father of the person.
	 * @return the father of the person.
	 */
	public final Human getFather(){
		return this.father;
	}

	/**
	 * Returns the mother of the person.
	 * @return the mother of the person.
	 */
	public final Human getMother(){
		return this.mother;
	}
	
	public final void setFather(Human human){
		this.father = human;
	}
	
	public final void setMother(Human human){
		this.mother = human;
	}
	
	public final void addBrother(Human brother){
		brothers.add(brother);
	}
	
	public final void addSister(Human sister){
		sisters.add(sister);
	}
	
	/**
	 * Returns the brothers of the person.
	 * @return the brothers of the person.
	 */
	public final ArrayList<Human> getBrothers(){
		return this.brothers;
	}
	
	/**
	 * Returns the sisters of the person.
	 * @return the sisters of the person.
	 */
	public final ArrayList<Human> getSisters(){
		return this.sisters;
	}
	
	/**
	 * Returns the name of the family.
	 * @return the name of the family.
	 */
	public final String getFamilyName(){
		return this.familyName;
	}
	
}
