/**
 * JDK 11, JRE 1.8
 */
package nick.smt.training;

import java.util.Random;
import java.util.Scanner;

/****************************************************************************
 * <b>Title:</b> GuessingGame.java
 * <b>Project:</b> lib
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 28 2022
 * @updates:
 ****************************************************************************/
public class GuessingGame {

	public GuessingGame() {
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		int gamesPlayed;
		boolean win = false;
	}

}
