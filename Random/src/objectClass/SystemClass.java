package objectClass;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class ExampleClass{
	public static ExampleClass thisIsWeird() {
		System.out.println("this is weird.");
		return new ExampleClass() {
			public static void thisIsAFunction() {
				System.out.println("this is very weird."); 
			}
		}; 
	}
	
	public static void thisIsAFunction() {
		System.out.println("yes"); 
	}
}

public class SystemClass {
		
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws IOException {
		
		ExampleClass ec = new ExampleClass();
		Scanner sc = new Scanner(System.in);
//		InputStreamReader is = new InputStreamReader(System.in);
		OutputStream os = new PrintStream(System.out);
		
		os.flush();		
		byte b[] = {1,3,2,4};
		os.write(b); 
		
//		System.out.println(ExampleClass.thisIsWeird()); 
//		System.out.println(is); 
//		Object
		
	}

}
