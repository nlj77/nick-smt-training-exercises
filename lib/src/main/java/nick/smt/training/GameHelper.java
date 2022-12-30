package nick.smt.training;

import java.util.Random;
import java.util.Scanner;

/****************************************************************************
 * <b>Title:</b> GuessingGame.java <b>Project:</b> lib <b>Description:</b>
 * <b>Copyright:</b> Copyright (c) 2022 <b>Company:</b> Silicon Mountain
 * Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 28 2022
 * @updates:
 ****************************************************************************/
public class GameHelper {

	public GameHelper() {
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		int gamesPlayed;
		boolean win = false;
		boolean continueGame = false;
		
		while (win == false) {
			System.out.println("Guess a number between 1 and 1000");
			guess = input.nextInt();
			numberOfTries++;

			if (guess == numberToGuess) {
				win = true;

				System.out.println("You got it! It took you " + numberOfTries + " tries to get it");
			}

			else if (guess < numberToGuess) {
				System.out.println("Your guess is too low!");
				System.out.println("                    ");
			}

			else if (guess > numberToGuess) {
				System.out.println("Your number was too high!");
				System.out.println("                    ");

			}

		}
	}
	
	public void GameStart() {
		System.out.println("Hello! Welcome to the Guessing Game! At the end of the game, your scores will be tallied!");
	}
	

}
