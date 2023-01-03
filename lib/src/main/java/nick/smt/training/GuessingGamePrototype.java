/**
JDK 11 and JRE 1.8
 * 
 */
package nick.smt.training;

import java.util.Random;
import java.util.Scanner;

/****************************************************************************
 * <b>Title:</b> GuessingGamePrototype.java
 * <b>Project:</b> lib
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 23 2022
 * @updates:
 ****************************************************************************/
public class GuessingGamePrototype {

	public static void main(String[] args) {
		GameHelper Game = new GameHelper();
		Game.Greeting();
		Player newPlayer = new Player();
		newPlayer.promptUserName();

		Game.gameLoop(newPlayer);

	}

}
