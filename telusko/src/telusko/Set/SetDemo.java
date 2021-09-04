package telusko.Set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		//Set<Integer> values = new HashSet<>();//unsequenced
		Set<Integer> values = new TreeSet<>();//sequences
		values.add(5);
		values.add(6);
		values.add(9);
		values.add(6);
		
		for(int i: values)
			System.out.println(i); 
		
	}

}
