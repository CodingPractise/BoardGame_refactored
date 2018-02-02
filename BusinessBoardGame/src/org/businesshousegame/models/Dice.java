package org.businesshousegame.models;

import org.businesshousegame.utils.Utilities;

/**
 * Defines the properties of Cell
 * 
 * @author raman-4
 *
 */
public class Dice {
	
	private static Dice dice;
	
	public static Dice getInstance() {
		if (null == dice) {
			dice = new Dice();
		}
		return dice;
	}

	private Dice()
	{
		//Blocking user from creating objects
	}
	
	/**
	 * To imitate dicing the dice
	 * 
	 * @return a random dice value between the minimum and maximum allowed
	 *         values
	 */
	public int dice() {
		int minVal = Configuration.getInstance().getDiceMinimumValue();
		int maxVal = Configuration.getInstance().getDiceMaximumValue();

		return Utilities.generateRandomNumber(minVal, maxVal);
	}
}
