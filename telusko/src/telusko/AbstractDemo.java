package telusko;
//----------------------------------------------------------------
abstract class Human{
	
	abstract public void eat();
	
	public void walk() {
		System.out.println("I am walking."); 
	}
	
}

class Man extends Human{

	@Override
	public void eat() {
		System.out.println("I am a man who eats."); 
		
	}	
}

class Woman extends Human{
	
	@Override
	public void eat() {
		System.out.println("I am a woman who eats."); 
		
	}
}
//------------------------------------------------------------------

class NumberPrinter{
	public static void print(Number n) {
		System.out.println(n); 
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		//-----------------------------------------
		Human man = new Man();
		man.eat();
		Human woman = new Woman();
		woman.walk();
		//-----------------------------------------
		NumberPrinter.print(5);//I can use Integer, it is not an abstract class,but Integer is.
		NumberPrinter.print(5.5);//I can use Double, it is not an abstract class, but Integer is.

	}

}
