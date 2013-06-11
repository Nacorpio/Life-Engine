package body;

import types.DiseaseType;

public final class Disease implements IDisease {

	private String name;
	private DiseaseType type;
	
	/**
	 * Creates a new disease with the specified options.
	 * @param name The name of the disease.
	 * @param type The type of the disease.
	 */
	public Disease(String name, DiseaseType type){
		if (name != null){
			this.name = name;
			this.type = type;
		}
	}

	@Override
	public final String getName() {
		return this.name;
	}

	/**
	 * Set the disease to a specified human.
	 * @param h The human to get infected by the disease.
	 */
	public final void setToHuman(Human h){
		h.getLife().addDisease(this);
	}
	
	@Override
	public void doEffects(Human carrier) {/* What to do once the disease occurs in a body. */}

	@Override
	public final DiseaseType getType() {
		return this.type;
	}

}
