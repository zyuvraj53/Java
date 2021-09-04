
public class ArithmeticExceptionEx {

	public static void main(String[] args) {
		try {
			int i = 0;
			int j = 4;
			System.out.println(j/i); 
		}catch(Exception e) {
			System.out.println("Divided by 0"); 
		}finally {
			System.out.println(4/0); 
		}

	}

}
