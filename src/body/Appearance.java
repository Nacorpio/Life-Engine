package body;

import java.awt.Color;

public class Appearance implements IAppearance {

	private Color hairColor;
	private Color eyeColor;
	
	@Override
	public Color getHairColor() {
		return this.hairColor;
	}

	@Override
	public Color getEyeColor() {
		return this.eyeColor;
	}	
	
}
