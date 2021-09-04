package telusko;

class A{
	
	public A() {
		System.out.println("in A"); 
	}
	
	public A(int i) {
		System.out.println("in A int"); 
	}
	
}

class B extends A{
	
	public B() {
		super();//default
		System.out.println("in B"); 
	}
	
	public B(int i) {
		super(i);//default
		System.out.println("in B int"); 
	}
	
}

public class SuperDemo {
	
	public static void main(String[] args) {
		
		B b = new B(4);
		b.hashCode();//did this so as to not generate any warnings
		
		
		
	}

}
