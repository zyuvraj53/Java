package telusko.my.own.exception;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 0;
		
		try {
			
			if(b == 0)
				throw new MyException("This is not possible");
			System.out.println(a/b);
					
		}catch(MyException e) {
			System.out.println(e.getMessage()); 
		}

	}

}
