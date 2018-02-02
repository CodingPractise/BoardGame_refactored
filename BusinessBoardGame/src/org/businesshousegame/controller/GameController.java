package org.businesshousegame.controller;

import org.businesshousegame.models.Game;
import org.businesshousegame.utils.Utilities;

/**
 * Starting point of the application
 * 
 * @author rajasri janakiraman
 */

public class GameController {

	public static void main(String[] args) {
		try {			
			Game game = new Game();
			game.play();			
		} catch (Exception e) {
			Utilities.displayMessageNewLine("Game stopped unexpectedly!");
		}

	}
}
