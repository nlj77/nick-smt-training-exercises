package nick.smt.training.exercises;

import java.lang.reflect.Array;
import java.util.*; //Needed for List class, inherits from Collection


/****************************************************************************
 * <b>Title:</b> People.java
 * <b>Project:</b> lib
 * <b>Description:</b> 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 22 2022
 * @updates:
 ****************************************************************************/
public class People {

	private int personID;
	private String firstName;
	private String lastName;

	public static void main(String[] args) {
		List<People> listOfPeople = new ArrayList<People>();

	}

	// Create a class constructor for the Main class with defaults
	public People(int id, String name1, String name2) {
		personID = id;
		firstName = name1;
		lastName = name2;
	}

	public static List<People> peopleGenerator() {
		List<People> peopleGroup = new ArrayList<>();
		People person1 = new People(1, "Nick", "Jones");
		People person2 = new People(5, "James", "Camire");
		People person3 = new People(2, "Chris", "Scarola");
		People person4 = new People(3, "Chris", "Johnson");
		People person5 = new People(4, "Tim", "Johnson");

		People[] peopleGroupArray = { person1, person2, person3, person4, person5 };

		for (People p : peopleGroupArray) {
			peopleGroup.add(p);
		}

		return peopleGroup;

	}

}
