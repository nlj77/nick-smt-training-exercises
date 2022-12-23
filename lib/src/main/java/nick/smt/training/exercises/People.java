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
//create a People class with @params personID, firstName, and lastName set to private
public class People {

	private int personID;
	private String firstName;
	private String lastName;
	
	
	 
	 // @param args main class runner
	 
	public static void main(String[] args) {
		List<People> listOfPeople = peopleGenerator();

		printListIDAndNames(listOfPeople);

		System.out.println("--------------------------------");

		shuffleList(listOfPeople);

	}

	// Create a class constructor for the Main class with defaults
	public People(int id, String name1, String name2) {
		personID = id;
		firstName = name1;
		lastName = name2;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getID() {
		return personID;
	}

	public String getIDFirstNameLastName() {
		return personID + " " + firstName + " " + lastName;
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

	public static void printListIDAndNames(List<People> x) {
		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i).getIDFirstNameLastName());

		}

	}

	public static void shuffleList(List x) {
		Collections.shuffle(x);
		printListIDAndNames(x);
	}

}
