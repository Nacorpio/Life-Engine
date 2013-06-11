package sociality;

import java.util.ArrayList;

import types.Gender;

import body.Human;

public class Family {
	
	private Human father = null;
	private Human mother = null;
	
	private ArrayList<Human> brothers = new ArrayList<Human>();
	private ArrayList<Human> sisters = new ArrayList<Human>();
	
	private String familyName;
	
	public Family(String familyName, Human father, Human mother, Human... siblings){
		if (father != null && mother != null){
			this.familyName = familyName;
			this.father = father;
			this.mother = mother;
			for (Human s: siblings){
				if (s.getIdentity().getGender() == Gender.MALE){
					brothers.add(s);
				} else if (s.getIdentity().getGender() == Gender.FEMALE){
					sisters.add(s);
				}
			}
		}
	}
	
	/**
	 * Returns the father of the person.
	 * @return the father of the person.
	 */
	public Human getFather(){
		return this.father;
	}

	/**
	 * Returns the mother of the person.
	 * @return the mother of the person.
	 */
	public Human getMother(){
		return this.mother;
	}
	
	/**
	 * Returns the brothers of the person.
	 * @return the brothers of the person.
	 */
	public ArrayList<Human> getBrothers(){
		return this.brothers;
	}
	
	/**
	 * Returns the sisters of the person.
	 * @return the sisters of the person.
	 */
	public ArrayList<Human> getSisters(){
		return this.sisters;
	}
	
	/**
	 * Returns the name of the family.
	 * @return the name of the family.
	 */
	public String getFamilyName(){
		return this.familyName;
	}
	
}
