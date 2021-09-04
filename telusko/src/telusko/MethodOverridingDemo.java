package telusko;

class Printer{
	
	int i;
	
	public void show() {
		System.out.println("this shows in Class Printer"); 
		System.out.println(this.i); 
	}
	
}

class ExtendedPrinter extends Printer{
	
	int i;
	
	@Override
	public void show() {
		super.i = 5;
		super.show();
		System.out.println("this shows in Class ExtendedPrinter"); 
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		ExtendedPrinter ep = new ExtendedPrinter();
		ep.show();

	}

}
