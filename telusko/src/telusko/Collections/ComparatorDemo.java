package telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Integer> value = new ArrayList</*Integer*/>();//Mutable
		value.add(404);
		value.add(908);
		value.add(639);	
		value.add(265);
		
		//Comparator<Integer> c = (i, j) -> i%10>j%10?1:-1; //compares only the last digit
		
		Collections.sort(value, (i, j) -> i%10>j%10?1:-1);//sort by the last digit
		
		for(int i = 0; i <value.size(); i++)
			System.out.println(value.get(i)); 
		
		System.out.println("------------------------------------------------"); 
		
		for(Object i: value)	
			System.out.println(i); 
		
	}

}