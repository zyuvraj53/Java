package codingWithJohn.java;

import java.util.ArrayList;
import java.util.List;

public class Generics {
	public static void main(String[] args) {
		
//		Printer<Integer> printer = new Printer<>(23);
//		printer.print();
		
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat());
		
		shout(new Cat(), 23);
		shout(57, 2314);
		shout("John", 1234);

		List<Integer> intList = new ArrayList<>();
		intList.add(23);
		//! printList(intList);
		//% We get an error here, but it seems like Integer is a subtype of Object, but a List of Integers is not a subtupe of a List of Objects.
		printList(intList)

		
	}
	
	private static <T, V> T shout(T thingToShout, V otherThingToShout) {
		System.out.println(thingToShout + "!!!!");
		System.out.println(otherThingToShout + "!!!!!!!!!!!!!!!!"); 

		return thingToShout;
	}

	//! private static void printList(List<Object> objects) {
	//!  	System.out.println("Printing list of objects");
  //! }

	//^ This is a valid method, but it is not a good idea to use generics in this way.
	// A better method:
	private static void printList(List<?> myList) { // can also have a wildcard like List<? extends Animal>
		System.out.println(""); 
	}

	
}
