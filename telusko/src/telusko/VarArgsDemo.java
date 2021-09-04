package telusko;

class Calc{
	
	public int add(int ...i ) {
		
		int sum = 0;
		for(int n : i) {
			sum += n;
		}
		
		return sum;
	}
	
}

public class VarArgsDemo {

	public static void main(String[] args) {
		
		Calc calculator = new Calc();
		System.out.println(calculator.add(2,3,4,5,6)); 
		
	}

}
