package objectClass;

import java.io.Console;

public class ConsoleReadString {

	public static void main(String[] args) {
		
		 Console c = System.console();
	        
	     String s = c.readLine();
	        	        		
	     System.out.println("You entered string " + s);

	}

}
