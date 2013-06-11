package helpers;

public final class BodyHelper {

	/**
	 * Calculates the BMI of the specified statistics.
	 * @param weight The weight of the person in kilograms.
	 * @param height The height of the person in centimeters.
	 * @return Returns the BMI of the person.
	 */
	public final static float calculateMetricBMI(double weight, double height){
		return (float)(weight / (height * height));
	}
	
	/**
	 * Calculates the English BMI of the specified statistics.
	 * @param weight The weight of the person in pounds.
	 * @param height The height of the person in inches.
	 * @return Returns the BMI of the person.
	 */
	public final static float calculateEnglishBMI(double weight, double height){
		return (float)(weight / (height * height)) * 703;
	}
	
	/**
	 * Convert Centimeters to Inches.
	 * @param cm The centimeters to convert to inches.
	 * @return Returns the converted value.
	 */
	public final static float calculateInches(double cm){
		return (float)(cm * 0.39);
	}
	
	/**
	 * Convert Inches to Centimeters.
	 * @param in The inches to convert to centimeters.
	 * @return Returns the converted value.
	 */
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
