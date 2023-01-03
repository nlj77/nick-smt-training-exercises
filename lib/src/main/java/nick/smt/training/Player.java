/**
 * 
 */
package nick.smt.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import nick.smt.training.exercises.intro_to_programming_exercises.People;

/****************************************************************************
 * <b>Title:</b> Player.java
 * <b>Project:</b> lib
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 30 2022
 * @updates:
 ****************************************************************************/
public class Player {
	private String name;
	private int totalScore;

	/*
	 * class constructor that creates a name, totalscore, totalroundsplayed, and
	 * average guesses taken variable.
	 */
	public Player() {
		final String name;
		final int totalScore;
		final int totalRoundsPlayed = 0;
		final int averageGuessesTaken;

	}

	public void promptUserName() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String userName = userInput.nextLine();
		this.name = userName;
	}

//	public void setName(String newName) {
//		this.name = newName;
//	}

	public String getName() {
		return name;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public int addToTotalScore(int x) {
		totalScore += x;
		return totalScore;
	}

	public  void printTotalScore() {
		System.out.println("Your current score is: " + getTotalScore());
	}

}
