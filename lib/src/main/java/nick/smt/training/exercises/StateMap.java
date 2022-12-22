/**
 * JDK 11
 */
package nick.smt.training.exercises;
import java.util.*; // import the TreeMap class
import java.util.HashMap; // import the HashMap class
/****************************************************************************
 * <b>Title:</b> StateMap.java
 * <b>Project:</b> nicksiliconmtntrainings
 * <b>Description:</b> Part 1 of the Collections Homework from PPT Intro to Programming 4 
 * <b>Copyright:</b> Copyright (c) 2022
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author Nick Jones
 * @version 3.0
 * @since Dec 21 2022
 * @updates:
 ****************************************************************************/
public class StateMap {

	// @param args main runner for my StateMap class

	public static void main(String[] args) {
		// Creates a HashMap object called States and assigns it to a 50 length Hashmap
		// of key value pairs
		final HashMap<Integer, String> States = new HashMap<Integer, String>();

		// Calls addStates method on the States Hashmap

		addStates(States);

		// prints the values, and keys of States Hashmap
		System.out.println(States.values());
		System.out.println(States.keySet());

		TreeMap orderedMap = orderMap(States);

		iterateUsingEntrySet(States);

		iterateUsingEntrySet(orderedMap);

		orderedMap.descendingMap();

	}

	// creates a class method that takes a map, and iterates through it, printing
	// the keys and values

	public static void iterateUsingEntrySet(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	// this function takes a hashmap and orders it

	public static TreeMap orderMap(HashMap x) {
		TreeMap sortedMap = new TreeMap(x);
		return sortedMap;
	}

	// @param x is a Hashmap that accepts a String, and String, set for a key value

	public static void addStates(HashMap<Integer, String> x) {
		x.put(1, "Alabama");
		x.put(2, "Alaska");
		x.put(4, "Arizona");
		x.put(6, "California");
		x.put(8, "Colorado");
		x.put(9, "Conneticut");
		x.put(10, "Delaware");
		x.put(15, "Hawaii");
		x.put(48, "Texas");
		x.put(39, "Ohio");
	}
}
