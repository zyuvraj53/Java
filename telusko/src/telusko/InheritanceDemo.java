package telusko;

class Calculator{ //Super, Parent, Base
	
	public int add(int i, int j) {
		return i + j;
	}
	
}

//   Extended Classed have a "IS - A" relationship because AdvCalculator IS-A Calculator
//   Non-Extended Classed have a "HAS-A" relationship because InheritanceDemo HAS-A Calculator

class AdvCalculator extends Calculator{ // Sub, Child, Derived
	
	public int sub(int i, int j) {
		return i - j;
	}
	
}

class VeryAdvCalculator extends AdvCalculator{
	
	public int multiply(int i, int j) {
		return i * j;
	}
	
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.add(2, 5)); 
		
	}

}
