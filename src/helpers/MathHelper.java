package helpers;

public final class MathHelper {

	/**
	 * Gets the percentage of the sum specified.
	 * @param arg0 The sum to remove from the value.
	 * @param arg1 The value to use for the percentage.
	 * @return The percentage value.
	 */
	public final static float getPercentage(double arg0, double arg1){
		return (float) ((arg0 / arg1) * 100);
	}
	
}
