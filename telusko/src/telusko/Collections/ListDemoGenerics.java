package telusko.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemoGenerics {

	public static void main(String[] args) {

		List<Integer> value = new ArrayList</*Integer*/>();
		value.add(5);
		value.add(7);
		value.add(6);	
		value.add(0, 2);
		
		for(int i = 0; i <value.size(); i++)
			System.out.println(value.get(i)); 
		
		System.out.println("------------------------------------------------"); 
		
		for(Object i: value)	
			System.out.println(i); 
		
	}

}