package helpers;

import java.util.Random;

import body.Brain;

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
	
	public final static int generateBrainCapacity(){
		Random rand = new Random(System.currentTimeMillis());
		int rnd = rand.nextInt(Brain.MAX_CAPACITY);
		if (rnd >= 1000){
			return rnd;
		} else {
			rnd = rand.nextInt(Brain.MAX_CAPACITY);
		}
		return 0;
	}
	
}
