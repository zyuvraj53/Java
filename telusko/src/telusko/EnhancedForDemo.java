package telusko;

public class EnhancedForDemo {

	public static void main(String[] args) {
		
		int a[] = {1, 2, 3, 4, 5};
		
		for(int k : a) {
			System.out.println(k); 
		}
		
		//two-dimensional array
		double d[][]= {
				{1.1, 1.2, 1.3},
				{2.1, 2.2, 2.3},
				{3.1, 3.2, 3.3}
		};
		
		for(double k[] : d) {
			for(double l : k) {
				System.out.println(l); 
			}
		}

	}

}
