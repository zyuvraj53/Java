package teluskoAdditional;

import java.util.ArrayList;
import java.util.List;

public class Timing {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		
		long start = System.currentTimeMillis();
		for(int i = 0; i< 1000000; i++)
			l.add(0);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start); 
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
		
		
	}

}
