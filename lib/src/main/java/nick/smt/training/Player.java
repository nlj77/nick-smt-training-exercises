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

	public Player() {
		final String name;
		final int totalScore;
		final int totalRoundsPlayed = 0;

	}

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}
	
	public int getTotalScore() {
		return totalScore;
	}

}
