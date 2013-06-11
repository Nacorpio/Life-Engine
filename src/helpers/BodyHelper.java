package helpers;

public final class BodyHelper {

	public final static float calculateMetricBMI(double weight, double height){
		return (float)(weight / (height * height));
	}
	
	public final static float calculateEnglishBMI(double weight, double height){
		return (float)(weight / (height * height)) * 703;
	}
	
	public final static float calculateInches(double cm){
		return (float)(cm * 0.39);
	}
	
	public final static float calculateCenterMeters(double in){
		return (float)(in * 2.54);
	}
	
	public final static float calculateKilograms(double lbs){
		return (float)(lbs / 2.2);
	}
	
	public final static float calculatePounds(double kg){
		return (float)(kg * 2.2);
	}
	
}
