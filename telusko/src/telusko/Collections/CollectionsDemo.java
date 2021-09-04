package telusko.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Collection value = new ArrayList();
		value.add(5);
		value.add(7);
		value.add(6);		
		
		Iterator it = value.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
		
	}

}
