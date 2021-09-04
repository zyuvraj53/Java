package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Reading {

	public static void main(String[] args)throws IOException {
		try{
			File myFile = new File("C:\\Users\\Yuvraj\\Desktop\\miscTxt\\java.txt");
			Scanner myScanner = new Scanner(myFile);
			while(myScanner.hasNextLine()) {
				String data = myScanner.nextLine();
				System.out.println(data);
			}
			myScanner.close();
		}catch(Exception e) {
			System.out.println("An error occurred!"); 
			e.printStackTrace();
		}
	}

}
