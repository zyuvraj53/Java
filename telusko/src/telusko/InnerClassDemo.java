package telusko;

class Outer{
	int a;
	String s;
	public void show() {
		System.out.println("\"The show function in the outer class is executed.\""); 
	}
	
	class Inner{ //The Inner class here acts like an element in the outer class
		public void display() {
			System.out.println("\"The display fuction in the inner class is executed.\""); 
		}
	}
	
	static class Internal{
		public void display() {
			System.out.println("\"The display fuction in the internal class is executed.\""); 
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		
		Outer outerObj = new Outer();
		outerObj.show();
		
		Outer.Inner innerObj = outerObj.new Inner();
		innerObj.display();
		
		Outer.Internal internalObj = new Outer.Internal();
		internalObj.display();
		

	}

}
