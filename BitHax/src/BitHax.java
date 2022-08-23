import java.util.ArrayList;
import java.util.Collections;

public class BitHax {

  public static ArrayList<String> binArr(int dec){

	ArrayList<String> binArr = new ArrayList<String>();
	
//	while(de)
	
    while(dec != 0){
      binArr.add(dec % 2 + "");
      dec /= 2;
    }
    
    Collections.reverse(binArr);

    return binArr;
  }
  
  private static String binString(ArrayList<String> ArS) {
	  String bin = "";
	  int i = 0;
	  
	  while(ArS.size() != bin.length()) {
		  bin += ArS.get(i) + "";
		  i++;
	  }
	  
	  return bin;
  }
  
  private static String modifiedBinS(int dec) {
	  String normalBin = binString(binArr(dec)), modifiedBin = "";
	  int len = binArr(dec).size();
	  if(len % 4 != 0 && len < 4) {
		  int numOfZeroes = 4 - len;
		  String zeroes = "";
		  
		  while(zeroes.length() != numOfZeroes) {
			  zeroes += "0";
		  }
		  
		  modifiedBin = zeroes + normalBin;
	  }else if(len % 8 != 0) {
		  int numOfZeroes = 8 - len;
		  String zeroes = "";
		  
		  while(zeroes.length() != numOfZeroes) {
			  zeroes += "0";
		  }
		  
		  modifiedBin = zeroes + normalBin;
	  }else {
		  modifiedBin = normalBin;
	  }
	  
	  return modifiedBin;
  }

  
  
  public static String binS(int dec) {
	  return binString(binArr(dec));
  }
  
  public static int binI(int dec) {
	  return Integer.parseInt(binString(binArr(dec)));
  }
  
  public static String fBinS(int dec) {
	  return modifiedBinS(dec);
  }
  
  public static void main(String[] args) {
    short A = 0b10110011;
    short B = 0b01101001;
    
    byte C = 7;
    
//    System.out.println(fBinS(8)); 
//    System.out.println("A>>3 is ==> " + fBinS(A>>3)); 
//    System.out.println("A<<2 is ==> "/* + fBinS(A<<2)*/); 
    
    System.out.println(fBinS(A)); 
    System.out.println((byte)(0b10110011 << 2));
//    System.out.println(fBinS(B)); 
//    System.out.println("------------"); 
    System.out.println(binArr(A<<2)); 

  }  
}
