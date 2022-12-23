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

		Random rand = new Random();
		int numberToGuess = rand.nextInt(1000);
		int numberOfTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;

		boolean win = false;

		while (win = false) {
			System.out.println("Guess a number between 1 and 1000");
			guess = input.nextInt();
			if (guess == numberToGuess) {
				win = true;

				System.out.println("You got it! It took you " + numberOfTries + " to get it");
			}

			else if (guess < numberToGuess) {
				System.out.println("Your guess is too low!");
				System.out.println("Guess again!");
				guess = input.nextInt();

			}

			else if (guess > numberToGuess) {
				System.out.println("Your number was too high!");
				System.out.println("Guess again!");
				guess = input.nextInt();
			}
			numberOfTries++;

		}

	}

}
