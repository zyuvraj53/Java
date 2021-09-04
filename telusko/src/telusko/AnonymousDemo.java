package telusko;

class AnonymousDemoA{
	
	public void show() {
		System.out.println("This is Class A."); 
	}
}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		AnonymousDemoA a = new AnonymousDemoA()
			 			   {
								public void show() {
									System.out.println("I'm the best."); 
								}
			 			   };
			 			   
		a.show();

	}
}
