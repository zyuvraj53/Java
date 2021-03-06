package telusko;

class OverridingDemoA{
	
	public void show() {
		
		System.out.println("This is class A."); 
	}
}

class OverridingDemoB extends OverridingDemoA{
	
	public void show() {
		
		System.out.println("This is class B."); 
	}
}

class OverridingDemoC extends OverridingDemoA{
	
	public void show() {
		
		System.out.println("This is class C."); 
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
	
		OverridingDemoA b = new OverridingDemoB();
		b.show();
		
		b = new OverridingDemoC();
		b.show();

	}

}
