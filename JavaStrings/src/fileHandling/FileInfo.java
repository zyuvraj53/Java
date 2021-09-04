package fileHandling;

import java.io.File;

public class FileInfo {
  public static void main(String[] args) {
    File myFile = new File("C:\\Users\\Yuvraj\\Desktop\\miscTxt\\java.txt");
    
    if(myFile.exists()) {
    	System.out.println("File Name:" + myFile.getName());
    	System.out.println("Abs Path:" + myFile.getAbsolutePath());
    	System.out.println("Writable:" + myFile.canWrite());
    	System.out.println("Readable:" + myFile.canRead());
    	System.out.println("File Size in bytes:" + myFile.length()); 
    }else {
    	System.out.println("This file does not exist."); 
    }
  }
}
