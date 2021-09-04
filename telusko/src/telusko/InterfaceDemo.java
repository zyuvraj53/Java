package telusko;

//3 types of interfaces - 
//1 - normal
//2 - single abstract method - functional interface - lambda expression
//3 - marker interface

@FunctionalInterface
interface InterfaceDemoAbc{
	
	void show();
}

//class Implementer implements InterfaceDemoAbc{
//	
//	public void show(){
//		System.out.println("anything"); 
//	}
//}

public class InterfaceDemo {

	public static void main(String[] args) {

//		InterfaceDemoAbc abc = new Implementer();
		InterfaceDemoAbc abc = new InterfaceDemoAbc()
								{
									public void show(){
										System.out.println("anything"); 
									}		
								};	
		abc.show();
		
		InterfaceDemoAbc obj = () -> System.out.println("This is a lambda fuction"); 
		
		obj.show();

	}

}
