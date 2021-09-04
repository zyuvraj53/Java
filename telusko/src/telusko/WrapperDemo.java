package telusko;

public class WrapperDemo {

	public static void main(String[] args) {
		
		@SuppressWarnings("removal")
		Integer i = new Integer(5);
		Integer l = 6;
		System.out.println(i); ;
		
		int j = i.intValue();
		int k = l;
		System.out.println(j);
		System.out.println(k); 

	}

}
