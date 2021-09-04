package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writint {

	public static void main(String[] args)throws IOException {
		//wrap in try catch
		try {
		 FileWriter myWriter = new FileWriter("C:\\Users\\Yuvraj\\Desktop\\miscTxt\\java.txt");//add true if you want to append
		 myWriter.append("Java is the prominent language of the century");
		 myWriter.close();
		 System.out.println("Successfully wrote to the file."); 
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		 

	}

}
