package body;

import types.DiseaseType;

public interface IDisease {
	
	/**
	 * Returns the name of the disease.
	 * @return Returns the name of the disease.
	 */
	public String getName();
	
	/**
	 * A void containing what to do when a human gets infected with the disease.
	 * @param carrier The carrier of the disease to perform the effects on.
	 */
	public void doEffects(Human carrier);
	
	/**
	 * Returns the type of the disease.
	 * @return Returns the type of the disease.
	 */
	public DiseaseType getType();
	
}
