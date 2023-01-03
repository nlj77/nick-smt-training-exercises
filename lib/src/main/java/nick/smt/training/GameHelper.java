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

//	public GameHelper() {
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		int gamesPlayed;
		boolean win = false;
		boolean continueGame = true;
		
		
//		}
	
	public void newGame(Player playerObj) {
		while (win == false) {
			System.out.println("Guess a number between 1 and 1000");
			guess = input.nextInt();
			numberOfTries++;

			if (guess == numberToGuess) {
				win = true;

				System.out.println("You got it! It took you " + numberOfTries + " tries to get it");
				playerObj.addToTotalScore(numberOfTries);
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
	
	public void gameLoop(Player playerObj) {
		newGame(playerObj);
		ContinueGame();
		if(ContinueGame() == true) {
			newGame(playerObj);
		}
			
		else {
				System.out.println("Thank you for playing!");
				System.out.println("Your total score was: " + playerObj.getTotalScore());
			}
	}
	
	public boolean ContinueGame() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like to keep playing? ");
		String userAnswer = userInput.nextLine();
		boolean stopLoop = false;
		boolean continueGame = false;
		while (stopLoop == false) {
			System.out.println("Please enter 'y' or 'n'");
			if (userAnswer.equals("y")) {
				continueGame = true;
				stopLoop = true;
			} 
			else if (userAnswer.equals("n")) {
				continueGame = false;
				stopLoop = true;
			} else {
				System.out.println(
						"I'm sorry I didn't quite catch that, please enter 'Yes', 'Y', 'yes', or 'y' to continue playing, or 'No', 'N', 'no', or 'n' to stop playing");
				stopLoop = false;
			}
		}
		return continueGame;

	}


	public void Greeting() {
		System.out.println("Hello! This is NJ's Guessing Game! You'll be asked to guess a number, between 1 and 1000 for each round.");
		System.out.println();
		System.out.println();
		System.out.println("When you've guessed the correct number, the number of guesses you took for that round will be added to your total score");
		System.out.println();
	}
	
//	public static void GameStart() {
//		boolean gameStart = false;
//		Scanner gameStartAnswer = new Scanner(System.in);
//		while  (gameStart == false) {
//			System.out.println("Hello! Welcome to the Guessing Game! At the end of the game, your scores will be tallied!");
//			continueGame = input.nextString();
//			
//		}
//	}
	

}
