package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		
		File myFile = new File("C:\\Users\\Yuvraj\\Desktop\\miscTxt\\java1.txt");
		if(myFile.createNewFile()) {
			System.out.println("File Created:" + myFile.getName());
		}else {
			System.out.println("File already exists.");
		}
		
		
	}
}