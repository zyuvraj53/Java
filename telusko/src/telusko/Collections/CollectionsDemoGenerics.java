package telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemoGenerics {

	public static void main(String[] args) {

		List<Integer> value = new ArrayList</*Integer*/>();//Mutable
		value.add(404);
		value.add(908);
		value.add(639);	
		value.add(265);
		
		Collections.sort(value);
		Collections.reverse(value);
		Collections.shuffle(value);
		
		for(int i = 0; i <value.size(); i++)
			System.out.println(value.get(i)); 
		
		System.out.println("------------------------------------------------"); 
		
		for(Object i: value)	
			System.out.println(i); 
		
	}

}