package objectClass;

import java.util.Scanner;

public class FlushDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter here: "); 
		sc.nextLine();
		
		System.out.println("Enter second param here: ");
		sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter third param here: ");
		sc.nextLine();
		
		System.out.println("something something"); 
		sc.close();

	}

}
